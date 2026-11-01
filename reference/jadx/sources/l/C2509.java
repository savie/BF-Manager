package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes3.dex */
public final class C2509 extends AbstractC3650 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f9919;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9920;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f9921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f9922;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f9923;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f9924;

    public C2509() {
        throw null;
    }

    public C2509(InterfaceC12783 interfaceC12783, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList) {
        super(interfaceC12783, i);
        this.f9923 = interfaceC12783.mo31752(i);
        this.f9921 = z;
        this.f9919 = z2;
        this.f9924 = z3;
        this.f9922 = z4;
        this.f13381 = i2;
        this.f9920 = arrayList;
    }

    @Override // l.InterfaceC3609
    public final InterfaceC9961 getValue() {
        return (InterfaceC9961) this.f9920.get(0);
    }

    @Override // l.InterfaceC3609
    public final InterfaceC9961 getValue(int i) {
        return (InterfaceC9961) this.f9920.get(i);
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int mo7647() {
        return this.f9920.size();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final String mo7645() {
        String str = this.f9923;
        return str == null ? "" : str;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7644() {
        return this.f9921;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7649() {
        return this.f9919;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo7648() {
        return this.f9924;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean mo7646() {
        return this.f9922;
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    public final Iterable values() {
        return this.f9920;
    }
}
