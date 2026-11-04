package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩵֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C20223 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f64906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f64907;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f64908;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f64909;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f64910;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f64911;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Method f64912;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f64913;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Method f64914;

    public C20223(Class cls, Class cls2, String str) {
        this.f64912 = AbstractC9035.m24124(cls, C14442.m34865("get", str, "List"), new Class[0]);
        this.f64911 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "List"), new Class[0]);
        String strM56409 = C25272.m56409("get", str);
        Class cls3 = Integer.TYPE;
        Method methodM24124 = AbstractC9035.m24124(cls, strM56409, cls3);
        this.f64910 = methodM24124;
        this.f64908 = AbstractC9035.m24124(cls2, C25272.m56409("get", str), cls3);
        Class<?> returnType = methodM24124.getReturnType();
        this.f64906 = AbstractC9035.m24124(cls2, C25272.m56409("set", str), cls3, returnType);
        this.f64907 = AbstractC9035.m24124(cls2, C25272.m56409("add", str), returnType);
        this.f64909 = AbstractC9035.m24124(cls, C14442.m34865("get", str, "Count"), new Class[0]);
        this.f64914 = AbstractC9035.m24124(cls2, C14442.m34865("get", str, "Count"), new Class[0]);
        this.f64913 = AbstractC9035.m24124(cls2, C25272.m56409("clear", str), new Class[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m46493(AbstractC9035 abstractC9035) {
        return AbstractC9035.m24123(this.f64912, abstractC9035, new Object[0]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m46500(AbstractC15001 abstractC15001) {
        return AbstractC9035.m24123(this.f64911, abstractC15001, new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m46492(int i, AbstractC9035 abstractC9035) {
        return AbstractC9035.m24123(this.f64910, abstractC9035, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m46494(AbstractC15001 abstractC15001, int i) {
        return AbstractC9035.m24123(this.f64908, abstractC15001, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46496(AbstractC15001 abstractC15001, int i, Object obj) {
        AbstractC9035.m24123(this.f64906, abstractC15001, Integer.valueOf(i), obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46497(AbstractC15001 abstractC15001, Object obj) {
        AbstractC9035.m24123(this.f64907, abstractC15001, obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46499(AbstractC9035 abstractC9035) {
        return ((Integer) AbstractC9035.m24123(this.f64909, abstractC9035, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m46498(AbstractC15001 abstractC15001) {
        return ((Integer) AbstractC9035.m24123(this.f64914, abstractC15001, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46495(AbstractC15001 abstractC15001) {
        AbstractC9035.m24123(this.f64913, abstractC15001, new Object[0]);
    }
}
