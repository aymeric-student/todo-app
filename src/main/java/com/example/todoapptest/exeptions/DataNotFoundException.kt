package com.example.todoapptest.exeptions

class DataNotFoundException : Exception {

    constructor() : super() {}
    constructor(message : String) : super(message)
}