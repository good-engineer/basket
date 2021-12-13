package com.maryland.basket.security

import com.maryland.basket.constant.AuthConstants
import com.maryland.basket.entity.User
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.stereotype.Component
import java.security.Key
import java.util.Calendar
import java.util.Date
import javax.crypto.spec.SecretKeySpec
import javax.xml.bind.DatatypeConverter
import kotlin.collections.HashMap

@Component
class TokenUtils {
    companion object {

        fun generateJwtToken(user: User?): String {
            val jwtBuilder = Jwts.builder()
            jwtBuilder.setSubject(user?.email)
            jwtBuilder.setHeader(createHeader())
            jwtBuilder.setClaims(createClaims(user))
            jwtBuilder.setExpiration(
                createExpireDate()
            )
            jwtBuilder.signWith(SignatureAlgorithm.HS256, createSigningKey())

            return jwtBuilder.compact()
        }
        fun isValidToken(token: String): Boolean {
            val cal = Calendar.getInstance()
            return getClaimsFromToken(token)?.expiration?.after(cal.time) ?: false
        }

        private fun getClaimsFromToken(token: String): Claims? {
            val parser = Jwts.parser()
            parser.setSigningKey(DatatypeConverter.parseBase64Binary(AuthConstants.SECRET_KEY))
            return parser.parseClaimsJws(token).body
        }
        fun getTokenFromHeader(header: String): String {
            return header.split(" ")[1]
        }

        private fun createHeader(): Map<String, Any> {
            return hashMapOf("alg" to "H256", "type" to "jwt", "genDate" to System.currentTimeMillis())
        }
        private fun createClaims(user: User?): HashMap<String, Any?> {
            return hashMapOf("email" to user?.email, "role" to user?.role)
        }
        private fun createExpireDate(): Date {
            val cal = Calendar.getInstance()
            cal.add(Calendar.DATE, AuthConstants.TOKEN_EXPIRATION_LENGTH)
            return cal.time
        }
        private fun createSigningKey(): Key {
            return SecretKeySpec(DatatypeConverter.parseBase64Binary(AuthConstants.SECRET_KEY), SignatureAlgorithm.HS256.jcaName)
        }
    }
}
