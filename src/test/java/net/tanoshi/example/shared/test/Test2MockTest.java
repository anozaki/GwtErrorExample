package net.tanoshi.example.shared.test;

import org.junit.Test;
import org.mockito.Mock;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTestWithMockito;

@GwtModule("net.tanoshi.example.GwtUnitExample")
public class Test2MockTest extends GwtTestWithMockito {

    @Mock
    Test2 test;
    
    @Test
    public void test() {
    }

}
