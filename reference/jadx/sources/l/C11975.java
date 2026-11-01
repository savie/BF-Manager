package l;

import java.math.RoundingMode;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۨ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11975 implements InterfaceC1390 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2365 f40114;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40115;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f40116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f40117;

    public C11975(long j, long j2, long j3) {
        this.f40114 = new C2365(j, new long[]{j2}, new long[]{0});
        this.f40116 = j2;
        this.f40117 = j3;
        int i = SecP160R1Field.PInv;
        if (j != -9223372036854775807L) {
            long jM41830 = C17983.m41830(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jM41830 > 0 && jM41830 <= 2147483647L) {
                i = (int) jM41830;
            }
            this.f40115 = i;
            return;
        }
        this.f40115 = SecP160R1Field.PInv;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4878(long j) {
        return this.f40114.m7189(j);
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4877() {
        return this.f40116;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ۖ */
    public final long mo4876() {
        return this.f40117;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return this.f40114.mo5382();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f40114.mo5383();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        return this.f40114.mo5381(j);
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ֨ */
    public final int mo4875() {
        return this.f40115;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29782(long j, long j2) {
        C2365 c2365 = this.f40114;
        if (c2365.m7188(j)) {
            return;
        }
        c2365.m7187(j, j2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m29783(long j) {
        return this.f40114.m7188(j);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29781(long j) {
        this.f40114.m7186(j);
    }
}
