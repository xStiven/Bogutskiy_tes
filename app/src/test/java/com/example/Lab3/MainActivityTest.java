package com.example.Lab3;

import android.content.Context;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest extends TestCase {
    @Mock
    Context mContext;

    public String[] tags = new String[]{"Червоний:-65536", "Зелений:-144357", "Помаранчевий:-26368",
            "Жовтий:-598252", "Блакитний:-16728876", "Синій:-14401322", "Фіолетовий:-9422635",
            "Чорний:-16777216", "Рожевий:-841281027", };

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testOnCreate() {
    }
    @Test
    public void testArray2dict() {
        Map map = MainActivity.array2dict(tags);
        int map_length = map.size();
        assertTrue(map_length == 9);
    }

    public void testOnYesClick() {
    }

    public void testOnNoClick() {
    }

    public void testChangeColors() {
    }

    public void testRandomChangeColors() {
    }

    public void testFixedChangeColors() {
    }

    /**
     * MockCharSequence for test.
     */
    private static class MockCharSequence implements CharSequence {
        private char mText[];
        public MockCharSequence(String text) {
            mText = text.toCharArray();
        }
        public char charAt(int arg0) {
            if (arg0 >= 0 && arg0 < mText.length) {
                return mText[arg0];
            }
            throw new IndexOutOfBoundsException();
        }
        public int length() {
            return mText.length;
        }
        public CharSequence subSequence(int arg0, int arg1) {
            return null;
        }
    }
}