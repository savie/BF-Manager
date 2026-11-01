package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩷ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20820 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Unsafe f67661;

    /* JADX INFO: renamed from: ۖ */
    public abstract float mo19837(long j, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract byte mo19838(long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo19839(Field field);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19840(long j, byte[] bArr, long j2, long j3);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19841(Object obj, long j, byte b);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19842(Object obj, long j, double d);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19843(Object obj, long j, float f);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19844(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo19846(long j, Object obj);

    /* JADX INFO: renamed from: ۨ */
    public abstract double mo19847(long j, Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract byte mo19848(long j, Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo19849();

    public AbstractC20820(Unsafe unsafe) {
        this.f67661 = unsafe;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m46825(Field field) {
        return this.f67661.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46819(Class cls) {
        return this.f67661.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m46824(Class cls) {
        return this.f67661.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo19845() {
        Unsafe unsafe = this.f67661;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            C15882.m37781(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m46823(long j, Object obj) {
        return this.f67661.getInt(obj, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46820(int i, long j, Object obj) {
        this.f67661.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m46826(long j, Object obj) {
        return this.f67661.getLong(obj, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46822(Object obj, long j, long j2) {
        this.f67661.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object m46818(long j, Object obj) {
        return this.f67661.getObject(obj, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46821(long j, Object obj, Object obj2) {
        this.f67661.putObject(obj, j, obj2);
    }
}
