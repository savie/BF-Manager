package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩷۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes.dex */
public final class C22086 extends AbstractC10897 {
    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15119(Field field) {
        return m27658(this.f34503.staticFieldOffset(field), this.f34503.staticFieldBase(field));
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27657() {
        if (!super.mo27657()) {
            return false;
        }
        try {
            Class<?> cls = this.f34503.getClass();
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
            C22832.m51512(th);
            return false;
        }
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo15127(long j, Object obj) {
        return this.f34503.getByte(obj, j);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15121(Object obj, long j, byte b) {
        this.f34503.putByte(obj, j, b);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15125(long j, Object obj) {
        return this.f34503.getBoolean(obj, j);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15124(Object obj, long j, boolean z) {
        this.f34503.putBoolean(obj, j, z);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ᩸ */
    public final float mo15129(long j, Object obj) {
        return this.f34503.getFloat(obj, j);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15123(Object obj, long j, float f) {
        this.f34503.putFloat(obj, j, f);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۤ */
    public final double mo15126(long j, Object obj) {
        return this.f34503.getDouble(obj, j);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15122(Object obj, long j, double d) {
        this.f34503.putDouble(obj, j, d);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15128() {
        Unsafe unsafe = this.f34503;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (C22832.m51528() != null) {
                    try {
                        Class<?> cls3 = this.f34503.getClass();
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
                        C22832.m51512(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                C22832.m51512(th2);
                return false;
            }
        }
        return false;
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final byte mo15118(long j) {
        return this.f34503.getByte(j);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15120(long j, byte[] bArr, long j2, long j3) {
        this.f34503.copyMemory((Object) null, j, bArr, C22832.f74008 + j2, j3);
    }
}
