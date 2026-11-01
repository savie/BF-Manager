package l;

import android.widget.ImageButton;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩹ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H9SC */
/* JADX INFO: loaded from: classes.dex */
public final class C22377 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Field f73063;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Field f73064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Field f73065;

    static {
        try {
            Field declaredField = C6938.class.getDeclaredField("mTitleTextView");
            f73064 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C6938.class.getDeclaredField("mSubtitleTextView");
            f73065 = declaredField2;
            declaredField2.setAccessible(true);
            C6938.class.getDeclaredField("mMenuView").setAccessible(true);
            Field declaredField3 = C6938.class.getDeclaredField("mNavButtonView");
            f73063 = declaredField3;
            declaredField3.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static TextView m49629(C6938 c6938) {
        try {
            return (TextView) f73064.get(c6938);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static TextView m49630(C6938 c6938) {
        try {
            return (TextView) f73065.get(c6938);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ImageButton m49628(C6938 c6938) {
        try {
            return (ImageButton) f73063.get(c6938);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
