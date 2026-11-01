package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۙᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C4839 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f16998;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Method f16999;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Method f17000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f17001;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f17002;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f17003;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Method f17004;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f17005;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Method f17006;

    public C4839(Class cls, Class cls2, String str) {
        this.f17002 = AbstractC18245.m42416(cls, C16523.m38890("get", str, "List"), new Class[0]);
        this.f17006 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "List"), new Class[0]);
        String strM1693 = C0252.m1693("get", str);
        Class cls3 = Integer.TYPE;
        Method methodM42416 = AbstractC18245.m42416(cls, strM1693, cls3);
        this.f16998 = methodM42416;
        this.f17004 = AbstractC18245.m42416(cls2, C0252.m1693("get", str), cls3);
        Class<?> returnType = methodM42416.getReturnType();
        this.f17000 = AbstractC18245.m42416(cls2, C0252.m1693("set", str), cls3, returnType);
        this.f17001 = AbstractC18245.m42416(cls2, C0252.m1693("add", str), returnType);
        this.f17003 = AbstractC18245.m42416(cls, C16523.m38890("get", str, "Count"), new Class[0]);
        this.f16999 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "Count"), new Class[0]);
        this.f17005 = AbstractC18245.m42416(cls2, C0252.m1693("clear", str), new Class[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13425(AbstractC18245 abstractC18245) {
        return AbstractC18245.m42415(this.f17002, abstractC18245, new Object[0]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m13431(AbstractC0584 abstractC0584) {
        return AbstractC18245.m42415(this.f17006, abstractC0584, new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13423(int i, AbstractC18245 abstractC18245) {
        return AbstractC18245.m42415(this.f16998, abstractC18245, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13424(AbstractC0584 abstractC0584, int i) {
        return AbstractC18245.m42415(this.f17004, abstractC0584, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13427(AbstractC0584 abstractC0584, int i, Object obj) {
        AbstractC18245.m42415(this.f17000, abstractC0584, Integer.valueOf(i), obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13428(AbstractC0584 abstractC0584, Object obj) {
        AbstractC18245.m42415(this.f17001, abstractC0584, obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m13430(AbstractC18245 abstractC18245) {
        return ((Integer) AbstractC18245.m42415(this.f17003, abstractC18245, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m13429(AbstractC0584 abstractC0584) {
        return ((Integer) AbstractC18245.m42415(this.f16999, abstractC0584, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13426(AbstractC0584 abstractC0584) {
        AbstractC18245.m42415(this.f17005, abstractC0584, new Object[0]);
    }
}
