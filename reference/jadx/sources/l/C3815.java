package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C3815 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f13007;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Method f13008;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f13009;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Method f13010;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f13011;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Method f13012;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f13013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Method f13014;

    public C3815(String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
        Method methodM24124 = AbstractC9035.m24124(cls, C25272.m56409("get", str), new Class[0]);
        this.f13014 = methodM24124;
        this.f13012 = AbstractC9035.m24124(cls2, C25272.m56409("get", str), new Class[0]);
        this.f13008 = AbstractC9035.m24124(cls2, C25272.m56409("set", str), methodM24124.getReturnType());
        this.f13011 = z2 ? AbstractC9035.m24124(cls, C25272.m56409("has", str), new Class[0]) : null;
        this.f13010 = z2 ? AbstractC9035.m24124(cls2, C25272.m56409("has", str), new Class[0]) : null;
        this.f13009 = AbstractC9035.m24124(cls2, C25272.m56409("clear", str), new Class[0]);
        this.f13007 = z ? AbstractC9035.m24124(cls, C14442.m34865("get", str2, "Case"), new Class[0]) : null;
        this.f13013 = z ? AbstractC9035.m24124(cls2, C14442.m34865("get", str2, "Case"), new Class[0]) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m12347(AbstractC9035 abstractC9035) {
        return AbstractC9035.m24123(this.f13014, abstractC9035, new Object[0]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m12353(AbstractC15001 abstractC15001) {
        return AbstractC9035.m24123(this.f13012, abstractC15001, new Object[0]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m12352(AbstractC9035 abstractC9035) {
        return ((InterfaceC5547) AbstractC9035.m24123(this.f13007, abstractC9035, new Object[0])).getNumber();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m12350(AbstractC15001 abstractC15001) {
        return ((InterfaceC5547) AbstractC9035.m24123(this.f13013, abstractC15001, new Object[0])).getNumber();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12349(AbstractC15001 abstractC15001, Object obj) {
        AbstractC9035.m24123(this.f13008, abstractC15001, obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m12351(AbstractC9035 abstractC9035) {
        return ((Boolean) AbstractC9035.m24123(this.f13011, abstractC9035, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m12354(AbstractC15001 abstractC15001) {
        return ((Boolean) AbstractC9035.m24123(this.f13010, abstractC15001, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12348(AbstractC15001 abstractC15001) {
        AbstractC9035.m24123(this.f13009, abstractC15001, new Object[0]);
    }
}
