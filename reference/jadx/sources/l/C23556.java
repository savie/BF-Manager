package l;

import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79CQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Field f76089;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f76090;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76091;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76092;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Field f76093;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76094;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Method f76095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Field f76096;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f76097;

    public C23556(Object obj) {
        this.f76097 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f76096 = cls.getDeclaredField("contentInsets");
        } catch (Exception unused) {
            this.f76096 = null;
        }
        try {
            this.f76089 = cls.getDeclaredField("visibleInsets");
        } catch (Exception unused2) {
            this.f76089 = null;
        }
        try {
            this.f76093 = cls.getDeclaredField("touchableRegion");
        } catch (Exception unused3) {
            this.f76093 = null;
        }
        try {
            this.f76092 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_FRAME").get(null)).intValue();
            this.f76090 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_CONTENT").get(null)).intValue();
            this.f76091 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_VISIBLE").get(null)).intValue();
            this.f76094 = ((Integer) cls.getDeclaredField("TOUCHABLE_INSETS_REGION").get(null)).intValue();
        } catch (Exception unused4) {
        }
        try {
            this.f76095 = cls.getDeclaredMethod("setTouchableInsets", Integer.TYPE);
        } catch (Exception unused5) {
            this.f76095 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect m52757() {
        Field field = this.f76096;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f76097);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect m52758() {
        Field field = this.f76089;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Rect) field.get(this.f76097);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Region m52759() {
        Field field = this.f76093;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            return (Region) field.get(this.f76097);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52760() {
        int i;
        Method method = this.f76095;
        if (method == null) {
            return;
        }
        int i2 = this.f76094;
        int i3 = this.f76092;
        int i4 = this.f76090;
        if (i3 == i4 && i4 == (i = this.f76091) && i == i2) {
            return;
        }
        try {
            method.invoke(this.f76097, Integer.valueOf(i2));
        } catch (Exception unused) {
        }
    }
}
