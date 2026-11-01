package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۜᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6930 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23159 f23301;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    public C6930(C23159 c23159) {
        this.f23301 = c23159;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C23159 c23159 = this.f23301;
        long jM47446 = c23159.f75179.m47446(j);
        C22828 c22828 = new C22828(j, C17983.m41829((BigInteger.valueOf(jM47446).multiply(BigInteger.valueOf(c23159.f75175 - c23159.f75178)).divide(BigInteger.valueOf(c23159.f75183)).longValue() + c23159.f75178) - 30000, c23159.f75178, c23159.f75175 - 1));
        return new C12950(c22828, c22828);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        C23159 c23159 = this.f23301;
        return c23159.f75179.m47443(c23159.f75183);
    }
}
