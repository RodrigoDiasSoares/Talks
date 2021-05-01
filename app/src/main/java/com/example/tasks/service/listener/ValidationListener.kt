package com.example.tasks.service.listener

class ValidationListener(str: String = "") {
    private var mStatus: Boolean = true
    private var mMenssage: String = ""

    init {
        if(str != ""){
            mStatus = false
            mMenssage = str
        }
    }

    fun success() = mStatus
    fun failure() = mMenssage

}