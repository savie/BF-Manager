package l;

import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۜ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H9SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6784 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f22609;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Field f22610;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Field f22611;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Field f22612;

    static {
        try {
            Field declaredField = C16390.class.getDeclaredField("mTitleTextView");
            f22612 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C16390.class.getDeclaredField("mSubtitleTextView");
            f22610 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = C16390.class.getDeclaredField("mMenuView");
            f22609 = declaredField3;
            declaredField3.setAccessible(true);
            Field declaredField4 = C16390.class.getDeclaredField("mNavButtonView");
            f22611 = declaredField4;
            declaredField4.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static TextView m18918(C16390 c16390) {
        try {
            return (TextView) f22612.get(c16390);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static TextView m18916(C16390 c16390) {
        try {
            return (TextView) f22610.get(c16390);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17531 m18915(C16390 c16390) {
        try {
            return (C17531) f22609.get(c16390);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ImageButton m18917(C16390 c16390) {
        try {
            return (ImageButton) f22611.get(c16390);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
