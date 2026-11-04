package l;

/* JADX INFO: renamed from: l.֡ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0221 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1428;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3950 f1429;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6188 f1430;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18120 f1431;

    public AbstractC0221(InterfaceC14390 interfaceC14390, InterfaceC18120 interfaceC18120, long j, long j2, long j3, long j4, long j5, int i) {
        this.f1431 = interfaceC18120;
        this.f1428 = i;
        this.f1430 = new C6188(interfaceC14390, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6188 m1675() {
        return this.f1430;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1676(long j) {
        C3950 c3950 = this.f1429;
        if (c3950 == null || C3950.m12667(c3950) != j) {
            C6188 c6188 = this.f1430;
            this.f1429 = new C3950(j, c6188.m17835(j), 0L, c6188.f21077, c6188.f21079, c6188.f21080, c6188.f21076);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m1677() {
        return this.f1429 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1674(InterfaceC19502 interfaceC19502, C18756 c18756) {
        while (true) {
            C3950 c3950 = this.f1429;
            C20782.m47566(c3950);
            long jM12665 = C3950.m12665(c3950);
            long jM12661 = C3950.m12661(c3950);
            long jM12663 = C3950.m12663(c3950);
            long j = jM12661 - jM12665;
            long j2 = this.f1428;
            InterfaceC18120 interfaceC18120 = this.f1431;
            if (j <= j2) {
                this.f1429 = null;
                interfaceC18120.mo26630();
                return m1673(interfaceC19502, jM12665, c18756);
            }
            long position = jM12663 - interfaceC19502.getPosition();
            if (position < 0 || position > 262144) {
                return m1673(interfaceC19502, jM12663, c18756);
            }
            interfaceC19502.mo10073((int) position);
            interfaceC19502.mo10076();
            C21104 c21104Mo26629 = interfaceC18120.mo26629(interfaceC19502, C3950.m12664(c3950));
            int i = c21104Mo26629.f67398;
            if (i == -3) {
                this.f1429 = null;
                interfaceC18120.mo26630();
                return m1673(interfaceC19502, jM12663, c18756);
            }
            if (i == -2) {
                C3950.m12666(c3950, c21104Mo26629.f67399, c21104Mo26629.f67397);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = c21104Mo26629.f67397 - interfaceC19502.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC19502.mo10073((int) position2);
                    }
                    this.f1429 = null;
                    interfaceC18120.mo26630();
                    return m1673(interfaceC19502, c21104Mo26629.f67397, c18756);
                }
                C3950.m12662(c3950, c21104Mo26629.f67399, c21104Mo26629.f67397);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1673(InterfaceC19502 interfaceC19502, long j, C18756 c18756) {
        if (j == interfaceC19502.getPosition()) {
            return 0;
        }
        c18756.f60914 = j;
        return 1;
    }
}
