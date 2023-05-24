package com.testapi.demo;

import java.io.FileNotFoundException;

interface CustomerMethods {
    void subscriber() throws FileNotFoundException, InterruptedException;
    void leads();
    void Quotes();
    void orders();
    void Templates();
}
