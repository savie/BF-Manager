package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C2807 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8773 f9226;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C2807(C8773 c8773) {
        this.f9226 = c8773;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C8773 c8773 = this.f9226;
        long jM16812 = c8773.f28528.m16812(j);
        C2349 c2349 = new C2349(j, C7116.m19476((BigInteger.valueOf(jM16812).multiply(BigInteger.valueOf(c8773.f28534 - c8773.f28532)).divide(BigInteger.valueOf(c8773.f28531)).longValue() + c8773.f28532) - 30000, c8773.f28532, c8773.f28534 - 1));
        return new C9805(c2349, c2349);
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        C8773 c8773 = this.f9226;
        return c8773.f28528.m16805(c8773.f28531);
    }
}
