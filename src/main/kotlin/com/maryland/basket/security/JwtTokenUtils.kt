//package com.maryland.basket.security
//
//import io.jsonwebtoken.Claims
//import io.jsonwebtoken.Jwts
//import kotlinx.serialization.Serializable
//import org.springframework.security.core.userdetails.UserDetails
//
//
//@Component
//class JwtTokenUtil : Serializable {
//    @Value("\${jwt.secret}")
//    private val secret: String? = null
//
//    @Value("\${jwt.expiration}")
//    private val expiration: Long? = null
//    fun getUsernameFromToken(token: String): String? {
//        val username: String?
//        username = try {
//            val claims = getClaimsFromToken(token)
//            claims!!.subject
//        } catch (e: Exception) {
//            null
//        }
//        return username
//    }
//
//    fun getCreatedDateFromToken(token: String): Date? {
//        var created: Date?
//        try {
//            val claims = getClaimsFromToken(token)
//            created = Date(claims!![CLAIM_KEY_CREATED] as Long?)
//        } catch (e: Exception) {
//            created = null
//        }
//        return created
//    }
//
//    fun getExpirationDateFromToken(token: String): Date? {
//        val expiration: Date?
//        expiration = try {
//            val claims = getClaimsFromToken(token)
//            claims!!.expiration
//        } catch (e: Exception) {
//            null
//        }
//        return expiration
//    }
//
//    fun getAudienceFromToken(token: String): String? {
//        val audience: String?
//        audience = try {
//            val claims = getClaimsFromToken(token)
//            claims!![CLAIM_KEY_AUDIENCE] as String?
//        } catch (e: Exception) {
//            null
//        }
//        return audience
//    }
//
//    private fun getClaimsFromToken(token: String): Claims? {
//        val claims: Claims?
//        claims = try {
//            Jwts.parser()
//                    .setSigningKey(secret)
//                    .parseClaimsJws(token)
//                    .body
//        } catch (e: Exception) {
//            null
//        }
//        return claims
//    }
//
//    private fun generateExpirationDate(): Date {
//        return Date(System.currentTimeMillis() + expiration!! * 1000)
//    }
//
//    private fun isTokenExpired(token: String): Boolean {
//        val expiration: Date? = getExpirationDateFromToken(token)
//        return expiration.before(Date())
//    }
//
//    private fun isCreatedBeforeLastPasswordReset(created: Date?, lastPasswordReset: Date?): Boolean {
//        return lastPasswordReset != null && created.before(lastPasswordReset)
//    }
//
//    private fun generateAudience(device: Device): String {
//        var audience = AUDIENCE_UNKNOWN
//        if (device.isNormal()) {
//            audience = AUDIENCE_WEB
//        } else if (device.isTablet()) {
//            audience = AUDIENCE_TABLET
//        } else if (device.isMobile()) {
//            audience = AUDIENCE_MOBILE
//        }
//        return audience
//    }
//
//    private fun ignoreTokenExpiration(token: String): Boolean {
//        val audience = getAudienceFromToken(token)
//        return AUDIENCE_TABLET == audience || AUDIENCE_MOBILE == audience
//    }
//
//    fun generateToken(userDetails: UserDetails, device: Device): String {
//        val claims: MutableMap<String, Any> = HashMap()
//        claims[CLAIM_KEY_USERNAME] = userDetails.username
//        claims[CLAIM_KEY_AUDIENCE] = generateAudience(device)
//        claims[CLAIM_KEY_CREATED] = Date()
//        return generateToken(claims)
//    }
//
//    fun generateToken(claims: Map<String, Any>?): String {
//        return Jwts.builder()
//                .setClaims(claims)
//                .setExpiration(generateExpirationDate())
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact()
//    }
//
//    fun canTokenBeRefreshed(token: String, lastPasswordReset: Date?): Boolean {
//        val created: Date? = getCreatedDateFromToken(token)
//        return (!isCreatedBeforeLastPasswordReset(created, lastPasswordReset)
//                && (!isTokenExpired(token) || ignoreTokenExpiration(token)))
//    }
//
//    fun refreshToken(token: String): String? {
//        var refreshedToken: String?
//        try {
//            val claims = getClaimsFromToken(token)
//            claims!![CLAIM_KEY_CREATED] = Date()
//            refreshedToken = generateToken(claims)
//        } catch (e: Exception) {
//            refreshedToken = null
//        }
//        return refreshedToken
//    }
//
//    fun validateToken(token: String, userDetails: UserDetails): Boolean {
//        val user = userDetails as JwtUser
//        val username = getUsernameFromToken(token)
//        val created: Date? = getCreatedDateFromToken(token)
//        //final Date expiration = getExpirationDateFromToken(token);
//        return (username == user.username && !isTokenExpired(token)
//                && !isCreatedBeforeLastPasswordReset(created, user.getLastPasswordResetDate()))
//    }
//
//    companion object {
//        private const val serialVersionUID = -3301605591108950415L
//        const val CLAIM_KEY_USERNAME = "sub"
//        const val CLAIM_KEY_AUDIENCE = "audience"
//        const val CLAIM_KEY_CREATED = "created"
//        private const val AUDIENCE_UNKNOWN = "unknown"
//        private const val AUDIENCE_WEB = "web"
//        private const val AUDIENCE_MOBILE = "mobile"
//        private const val AUDIENCE_TABLET = "tablet"
//    }
//}