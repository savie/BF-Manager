package l;

/* JADX INFO: renamed from: l.᩶֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F8IP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20994 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f67116;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11590 f67117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11590 f67118;

    public C20994(long j, long[] jArr, long[] jArr2) {
        C20782.m47565(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            C11590 c11590 = new C11590(i);
            this.f67118 = c11590;
            C11590 c11591 = new C11590(i);
            this.f67117 = c11591;
            c11590.m29118(0L);
            c11591.m29118(0L);
        } else {
            this.f67118 = new C11590(length);
            this.f67117 = new C11590(length);
        }
        this.f67118.m29119(jArr);
        this.f67117.m29119(jArr2);
        this.f67116 = j;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return this.f67117.m29116() > 0;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f67116;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C11590 c11590 = this.f67117;
        if (c11590.m29116() != 0) {
            int iM19470 = C7116.m19470(c11590, j);
            long jM29117 = c11590.m29117(iM19470);
            C11590 c11591 = this.f67118;
            C2349 c2349 = new C2349(jM29117, c11591.m29117(iM19470));
            if (jM29117 == j || iM19470 == c11590.m29116() - 1) {
                return new C9805(c2349, c2349);
            }
            int i = iM19470 + 1;
            return new C9805(c2349, new C2349(c11590.m29117(i), c11591.m29117(i)));
        }
        C2349 c23410 = C2349.f7572;
        return new C9805(c23410, c23410);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47984(long j, long j2) {
        C11590 c11590 = this.f67117;
        int iM29116 = c11590.m29116();
        C11590 c11591 = this.f67118;
        if (iM29116 == 0 && j > 0) {
            c11591.m29118(0L);
            c11590.m29118(0L);
        }
        c11591.m29118(j2);
        c11590.m29118(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m47986(long j) {
        C11590 c11590 = this.f67117;
        if (c11590.m29116() == 0) {
            return -9223372036854775807L;
        }
        return c11590.m29117(C7116.m19470(this.f67118, j));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47985(long j) {
        C11590 c11590 = this.f67117;
        return c11590.m29116() != 0 && j - c11590.m29117(c11590.m29116() - 1) < 100000;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m47987(long j) {
        this.f67116 = j;
    }
}
