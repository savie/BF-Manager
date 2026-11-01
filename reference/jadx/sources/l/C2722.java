package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۖᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C2722 extends C22479 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f10467;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Method f10468;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Method f10469;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Method f10470;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Method f10471;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7040 f10472;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f10473;

    public C2722(C19741 c19741, String str, Class cls, Class cls2, String str2) {
        super(c19741, str, cls, cls2, str2);
        this.f10472 = c19741.m44901();
        this.f10471 = AbstractC18245.m42416(this.f73378, "valueOf", C21857.class);
        this.f10467 = AbstractC18245.m42416(this.f73378, "getValueDescriptor", new Class[0]);
        boolean zM44905 = c19741.m44905();
        this.f10473 = !zM44905;
        if (zM44905) {
            return;
        }
        this.f10470 = AbstractC18245.m42416(cls, C16523.m38890("get", str, "Value"), new Class[0]);
        this.f10468 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "Value"), new Class[0]);
        this.f10469 = AbstractC18245.m42416(cls2, C16523.m38890("set", str, "Value"), Integer.TYPE);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo8303(AbstractC18245 abstractC18245) {
        if (this.f10473) {
            return this.f10472.m18885(((Integer) AbstractC18245.m42415(this.f10470, abstractC18245, new Object[0])).intValue());
        }
        return AbstractC18245.m42415(this.f10467, this.f73379.m15285(abstractC18245), new Object[0]);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo8304(AbstractC0584 abstractC0584) {
        if (this.f10473) {
            return this.f10472.m18885(((Integer) AbstractC18245.m42415(this.f10468, abstractC0584, new Object[0])).intValue());
        }
        return AbstractC18245.m42415(this.f10467, this.f73379.m15291(abstractC0584), new Object[0]);
    }

    @Override // l.C22479, l.InterfaceC23869
    /* JADX INFO: renamed from: ۙ */
    public final void mo4666(AbstractC0584 abstractC0584, Object obj) {
        if (this.f10473) {
            AbstractC18245.m42415(this.f10469, abstractC0584, Integer.valueOf(((C21857) obj).getNumber()));
        } else {
            super.mo4666(abstractC0584, AbstractC18245.m42415(this.f10471, (Object) null, obj));
        }
    }
}
