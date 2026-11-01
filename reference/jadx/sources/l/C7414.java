package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۟ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7414 extends AbstractC20820 {
    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo19839(Field field) {
        return m46818(this.f67661.staticFieldOffset(field), this.f67661.staticFieldBase(field));
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19845() {
        if (!super.mo19845()) {
            return false;
        }
        try {
            Class<?> cls = this.f67661.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            C15882.m37781(th);
            return false;
        }
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte mo19848(long j, Object obj) {
        return this.f67661.getByte(obj, j);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19841(Object obj, long j, byte b) {
        this.f67661.putByte(obj, j, b);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19846(long j, Object obj) {
        return this.f67661.getBoolean(obj, j);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19844(Object obj, long j, boolean z) {
        this.f67661.putBoolean(obj, j, z);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float mo19837(long j, Object obj) {
        return this.f67661.getFloat(obj, j);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19843(Object obj, long j, float f) {
        this.f67661.putFloat(obj, j, f);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final double mo19847(long j, Object obj) {
        return this.f67661.getDouble(obj, j);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19842(Object obj, long j, double d) {
        this.f67661.putDouble(obj, j, d);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19849() {
        Unsafe unsafe = this.f67661;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (C15882.m37795() != null) {
                    try {
                        Class<?> cls3 = this.f67661.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        C15882.m37781(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                C15882.m37781(th2);
                return false;
            }
        }
        return false;
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo19838(long j) {
        return this.f67661.getByte(j);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19840(long j, byte[] bArr, long j2, long j3) {
        this.f67661.copyMemory((Object) null, j, bArr, C15882.f51460 + j2, j3);
    }
}
