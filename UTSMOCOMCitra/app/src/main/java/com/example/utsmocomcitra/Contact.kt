package com.example.contactapp.data

data class Contact(
    val id: Int,
    var name: String,
    var address: String,
    var phone: String,
    var email: String
)

object ContactRepository {
    val contactList = mutableListOf<Contact>()

    private var nextId = 1

    fun addContact(name: String, address: String, phone: String, email: String) {
        contactList.add(Contact(nextId++, name, address, phone, email))
    }


}