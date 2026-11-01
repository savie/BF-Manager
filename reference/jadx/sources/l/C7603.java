package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65YF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7603 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f25146;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Method f25147;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Method f25148;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f25149;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20127(Drawable drawable, float f, float f2) {
        C9015.m23334(drawable, f, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20128(Drawable drawable, int i, int i2, int i3, int i4) {
        C9015.m23336(drawable, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20138(Drawable drawable, int i) {
        C9015.m23335(drawable, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20129(Drawable drawable, ColorStateList colorStateList) {
        C9015.m23337(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20132(Drawable drawable, PorterDuff.Mode mode) {
        C9015.m23340(drawable, mode);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20130(Drawable drawable, Resources.Theme theme) {
        C9015.m23338(drawable, theme);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20133(Drawable drawable) {
        return C9015.m23341(drawable);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ColorFilter m20136(Drawable drawable) {
        return C9015.m23342(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20137(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m20137(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof InterfaceC6191) {
            m20137(((InterfaceC6191) drawable).mo17199());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable child = drawableContainerState.getChild(i);
            if (child != null) {
                m20137(child);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20131(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C9015.m23339(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Drawable m20139(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC17480)) ? new C23831(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Drawable m20135(Drawable drawable) {
        return drawable instanceof InterfaceC6191 ? ((InterfaceC6191) drawable).mo17199() : drawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20134(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C10426.m26324(drawable, i);
        }
        if (!f25146) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f25148 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f25146 = true;
        }
        Method method = f25148;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f25148 = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m20126(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C10426.m26323(drawable);
        }
        if (!f25149) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f25147 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f25149 = true;
        }
        Method method = f25147;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception unused2) {
            f25147 = null;
            return 0;
        }
    }
}
