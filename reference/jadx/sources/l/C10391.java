package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۤܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 143X */
/* JADX INFO: loaded from: classes3.dex */
public class C10391 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumSet f35568;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumSet f35569;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC12260 f35570;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12260 m26292() {
        return this.f35570;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo21748(EnumC0597 enumC0597) {
        this.f35568.add(enumC0597);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26291(EnumC0597 enumC0597) {
        this.f35569.add(enumC0597);
    }

    public C10391(InterfaceC12260 interfaceC12260) {
        this.f35570 = null;
        this.f35568 = EnumSet.noneOf(EnumC0597.class);
        this.f35569 = EnumSet.noneOf(EnumC0597.class);
        this.f35570 = interfaceC12260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26290(EnumC0597 enumC0597) {
        return this.f35569.contains(enumC0597) || this.f35568.contains(enumC0597);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m26293(EnumC0597 enumC0597) {
        return this.f35568.contains(enumC0597);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26289() {
        this.f35568.clear();
        this.f35569.clear();
    }

    public C10391() {
        this(null);
    }
}
