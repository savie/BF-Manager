package l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۤ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10897 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Unsafe f34503;

    /* JADX INFO: renamed from: ۙ */
    public abstract byte mo15118(long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo15119(Field field);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15120(long j, byte[] bArr, long j2, long j3);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15121(Object obj, long j, byte b);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15122(Object obj, long j, double d);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15123(Object obj, long j, float f);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15124(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo15125(long j, Object obj);

    /* JADX INFO: renamed from: ۤ */
    public abstract double mo15126(long j, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte mo15127(long j, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo15128();

    /* JADX INFO: renamed from: ᩸ */
    public abstract float mo15129(long j, Object obj);

    public AbstractC10897(Unsafe unsafe) {
        this.f34503 = unsafe;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m27662(Field field) {
        return this.f34503.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27653(Class cls) {
        return this.f34503.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27661(Class cls) {
        return this.f34503.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo27657() {
        Unsafe unsafe = this.f34503;
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
            C22832.m51512(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27660(long j, Object obj) {
        return this.f34503.getInt(obj, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27654(int i, long j, Object obj) {
        this.f34503.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m27659(long j, Object obj) {
        return this.f34503.getLong(obj, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27656(Object obj, long j, long j2) {
        this.f34503.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object m27658(long j, Object obj) {
        return this.f34503.getObject(obj, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27655(long j, Object obj, Object obj2) {
        this.f34503.putObject(obj, j, obj2);
    }
}
