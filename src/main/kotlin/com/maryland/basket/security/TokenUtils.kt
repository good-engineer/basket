package com.maryland.basket.security

import com.maryland.basket.entity.User
import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.JwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.slf4j.LoggerFactory
import java.security.Key
import java.util.*
import javax.crypto.spec.SecretKeySpec
import javax.xml.bind.DatatypeConverter
import kotlin.collections.HashMap
import kotlin.math.log

class TokenUtils {
    companion object {
        private val logger = LoggerFactory.getLogger(this.javaClass)

        private const val secretKey = "dfjhgifygusufygsufhjdlfvkjdlkfhvk"

        fun generateJwtToken (user : User): String {

            return Jwts.builder().setSubject(user.email).setHeader(createHeader()).setClaims(createClaims(user)).setExpiration(
                createExpireDate()).signWith(SignatureAlgorithm.HS256, createSigningKey()).compact()
        }
        fun isValidToken(token: String) : Boolean {
            return try {
                val claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(secretKey)).parseClaimsJws(token).body
                logger.info("token is valid")
                true
            } catch ( e: ExpiredJwtException){
                logger.error("Token expired!")
                false
            } catch (e: JwtException){
                logger.error("Token tempered")
                false
            }catch (e: NullPointerException){
                logger.error("Token is null")
                false
            }

        }
        fun getTokenFromHeader(header: String): String {
            return header.split(" ")[1]
        }

        private fun createHeader(): Map<String, Any> {
            return hashMapOf("alg" to "H256", "type" to "jwt", "genDate" to System.currentTimeMillis())
        }
        private fun createClaims(user: User): HashMap<String, Any?> {
            return hashMapOf("email" to  user.email, "role" to user.role)
        }
        private fun createExpireDate(): Date {
            val cal = Calendar.getInstance()
            cal.add(Calendar.DATE, 30)
            return cal.time
        }
        private fun createSigningKey(): Key {
            return SecretKeySpec(DatatypeConverter.parseBase64Binary(secretKey), SignatureAlgorithm.HS256.jcaName)
        }

    }
}