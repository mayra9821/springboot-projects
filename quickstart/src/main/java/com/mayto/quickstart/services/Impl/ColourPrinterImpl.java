package com.mayto.quickstart.services.Impl;

import com.mayto.quickstart.services.BluePrinter;
import com.mayto.quickstart.services.ColourPrinter;
import com.mayto.quickstart.services.GreenPrinter;
import com.mayto.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;


@Component
public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
