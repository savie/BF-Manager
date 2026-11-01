package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۢᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9758 implements InterfaceC1995 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2806 f32811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Method f32812;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f32813;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f32814;

    public C9758(C2806 c2806, String str, Class cls, Class cls2) {
        this.f32811 = c2806;
        this.f32812 = AbstractC18245.m42416(cls, C16523.m38890("get", str, "Case"), new Class[0]);
        this.f32814 = AbstractC18245.m42416(cls2, C16523.m38890("get", str, "Case"), new Class[0]);
        this.f32813 = AbstractC18245.m42416(cls2, C0252.m1693("clear", str), new Class[0]);
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo6415(AbstractC18245 abstractC18245) {
        return ((InterfaceC12601) AbstractC18245.m42415(this.f32812, abstractC18245, new Object[0])).getNumber() != 0;
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo6413(AbstractC0584 abstractC0584) {
        return ((InterfaceC12601) AbstractC18245.m42415(this.f32814, abstractC0584, new Object[0])).getNumber() != 0;
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ۙ */
    public final C19741 mo6411(AbstractC18245 abstractC18245) {
        int number = ((InterfaceC12601) AbstractC18245.m42415(this.f32812, abstractC18245, new Object[0])).getNumber();
        if (number > 0) {
            return this.f32811.m8521(number);
        }
        return null;
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ܰ */
    public final C19741 mo6414(AbstractC0584 abstractC0584) {
        int number = ((InterfaceC12601) AbstractC18245.m42415(this.f32814, abstractC0584, new Object[0])).getNumber();
        if (number > 0) {
            return this.f32811.m8521(number);
        }
        return null;
    }

    @Override // l.InterfaceC1995
    /* JADX INFO: renamed from: ۙ */
    public final void mo6412(AbstractC0584 abstractC0584) {
        AbstractC18245.m42415(this.f32813, abstractC0584, new Object[0]);
    }
}
