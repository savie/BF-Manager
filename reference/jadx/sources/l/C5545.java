package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C5545 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f19009;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Method f19010;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f19011;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f19012;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f19013;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Method f19014;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f19015;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Method f19016;

    public C5545(String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
        Method methodM42416 = AbstractC18245.m42416(cls, C0252.m1693("get", str), new Class[0]);
        this.f19010 = methodM42416;
        this.f19012 = AbstractC18245.m42416(cls2, C0252.m1693("get", str), new Class[0]);
        this.f19014 = AbstractC18245.m42416(cls2, C0252.m1693("set", str), methodM42416.getReturnType());
        this.f19016 = z2 ? AbstractC18245.m42416(cls, C0252.m1693("has", str), new Class[0]) : null;
        this.f19009 = z2 ? AbstractC18245.m42416(cls2, C0252.m1693("has", str), new Class[0]) : null;
        this.f19013 = AbstractC18245.m42416(cls2, C0252.m1693("clear", str), new Class[0]);
        this.f19011 = z ? AbstractC18245.m42416(cls, C16523.m38890("get", str2, "Case"), new Class[0]) : null;
        this.f19015 = z ? AbstractC18245.m42416(cls2, C16523.m38890("get", str2, "Case"), new Class[0]) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m15285(AbstractC18245 abstractC18245) {
        return AbstractC18245.m42415(this.f19010, abstractC18245, new Object[0]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m15291(AbstractC0584 abstractC0584) {
        return AbstractC18245.m42415(this.f19012, abstractC0584, new Object[0]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m15290(AbstractC18245 abstractC18245) {
        return ((InterfaceC12601) AbstractC18245.m42415(this.f19011, abstractC18245, new Object[0])).getNumber();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m15288(AbstractC0584 abstractC0584) {
        return ((InterfaceC12601) AbstractC18245.m42415(this.f19015, abstractC0584, new Object[0])).getNumber();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15287(AbstractC0584 abstractC0584, Object obj) {
        AbstractC18245.m42415(this.f19014, abstractC0584, obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m15289(AbstractC18245 abstractC18245) {
        return ((Boolean) AbstractC18245.m42415(this.f19016, abstractC18245, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m15284(AbstractC0584 abstractC0584) {
        return ((Boolean) AbstractC18245.m42415(this.f19009, abstractC0584, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15286(AbstractC0584 abstractC0584) {
        AbstractC18245.m42415(this.f19013, abstractC0584, new Object[0]);
    }
}
