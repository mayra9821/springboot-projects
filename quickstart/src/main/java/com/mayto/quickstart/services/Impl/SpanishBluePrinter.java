package com.mayto.quickstart.services.Impl;

import com.mayto.quickstart.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Azul";
    }
}
