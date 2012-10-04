package net.tanoshi.example.shared.test;

import org.junit.Test;
import org.mockito.Mock;

import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTestWithMockito;

@GwtModule("net.tanoshi.example.GwtUnitExample")
public class Test1MockTest extends GwtTestWithMockito {

    @Mock
    Test1 test;
    
    @Test
    public void test() {
    }

}
