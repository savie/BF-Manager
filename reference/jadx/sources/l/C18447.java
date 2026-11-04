package l;

import java.math.RoundingMode;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ܿܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18447 implements InterfaceC10242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f60053;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f60054;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f60055;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20994 f60056;

    public C18447(long j, long j2, long j3) {
        this.f60056 = new C20994(j, new long[]{j2}, new long[]{0});
        this.f60054 = j2;
        this.f60055 = j3;
        int i = SecP160R1Field.PInv;
        if (j != -9223372036854775807L) {
            long jM19477 = C7116.m19477(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jM19477 > 0 && jM19477 <= 2147483647L) {
                i = (int) jM19477;
            }
            this.f60053 = i;
            return;
        }
        this.f60053 = SecP160R1Field.PInv;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2549(long j) {
        return this.f60056.m47986(j);
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2548() {
        return this.f60054;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩸ */
    public final long mo2550() {
        return this.f60055;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return this.f60056.mo2298();
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f60056.mo2295();
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        return this.f60056.mo2290(j);
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ۫ */
    public final int mo2547() {
        return this.f60053;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42977(long j, long j2) {
        C20994 c20994 = this.f60056;
        if (c20994.m47985(j)) {
            return;
        }
        c20994.m47984(j, j2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m42978(long j) {
        return this.f60056.m47985(j);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42979(long j) {
        this.f60056.m47987(j);
    }
}
