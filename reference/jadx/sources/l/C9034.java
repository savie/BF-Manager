package l;

import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۡܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 79CQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9034 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Field f30835;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f30836;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Field f30837;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30838;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Method f30839;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f30840;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30841;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Field f30842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30843;

    public C9034(Object obj) {
        this.f30836 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f30842 = cls.getDeclaredField("contentInsets");
        } catch (Exception unused) {
            this.f30842 = null;
        }
        try {
            this.f30837 = cls.getDeclaredField("visibleInsets");
        } catch (Exception unused2) {
            this.f30837 = null;
        }
        try {
            this.f30835 = cls.getDeclaredField("touchableRegion");
        } catch (Exception unused3) {
            this.f30835 = null;
        }
        try {
            this.f30840 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_FRAME").get(null)).intValue();
            this.f30838 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_CONTENT").get(null)).intValue();
            this.f30841 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_VISIBLE").get(null)).intValue();
            this.f30843 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_REGION").get(null)).intValue();
        } catch (Exception unused4) {
        }
        try {
            this.f30839 = cls.getDeclaredMethod("setTouchableInsets", Integer.TYPE);
        } catch (Exception unused5) {
            this.f30839 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect m23368() {
        Field field = this.f30842;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f30836);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect m23369() {
        Field field = this.f30837;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f30836);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Region m23370() {
        Field field = this.f30835;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Region) field.get(this.f30836);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23367() {
        int i;
        Method method = this.f30839;
        if (method == null) {
            return;
        }
        int i2 = this.f30843;
        int i3 = this.f30840;
        int i4 = this.f30838;
        if (i3 == i4 && i4 == (i = this.f30841) && i == i2) {
            return;
        }
        try {
            method.invoke(this.f30836, Integer.valueOf(i2));
        } catch (Exception unused) {
        }
    }
}
