package com.mobilevreni.ttsane.functions.recognize;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.mobilevreni.ttsane.utils.RecognizeUtils;

/**
 * Created by Jazzcript.
 */
public class StopRecognize implements FREFunction {
    @Override
    public FREObject call(FREContext freContext, FREObject[] freObjects) {

        RecognizeUtils.getInstance().stop();

        return null;
    }
}
