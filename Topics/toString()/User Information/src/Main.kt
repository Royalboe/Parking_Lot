class CustomerInfo(
        /** Unique user id */
        val uid: String,
        /** Operation system: Windows, Linux, macOS, iOS */
        val operationSystem: String,
        /** In GB */
        val ram: Int,
        /** In GHz */
        val coreSpeed: Double,
        val timeStamp: Long
    ) {

        //put your code here
        override fun toString(): String {
            return "Id: $uid; Operation System: $operationSystem; RAM: $ram; Core Speed: $coreSpeed; Timestamp: $timeStamp"
        }
}

fun sendCustomerInfoToServer(customer: CustomerInfo) {
    Server.send(customer.toString())
}
