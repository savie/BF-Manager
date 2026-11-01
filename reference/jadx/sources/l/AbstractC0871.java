package l;

/* JADX INFO: renamed from: l.֨ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0871 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22039 f3542;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3543;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11456 f3544;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4399 f3545;

    public AbstractC0871(InterfaceC2282 interfaceC2282, InterfaceC22039 interfaceC22039, long j, long j2, long j3, long j4, long j5, int i) {
        this.f3542 = interfaceC22039;
        this.f3543 = i;
        this.f3545 = new C4399(interfaceC2282, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4399 m3484() {
        return this.f3545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3485(long j) {
        C11456 c11456 = this.f3544;
        if (c11456 == null || C11456.m28592(c11456) != j) {
            C4399 c4399 = this.f3545;
            this.f3544 = new C11456(j, c4399.m12262(j), 0L, c4399.f15664, c4399.f15663, c4399.f15665, c4399.f15662);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m3486() {
        return this.f3544 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3483(InterfaceC7222 interfaceC7222, C0954 c0954) {
        while (true) {
            C11456 c11456 = this.f3544;
            C2023.m6508(c11456);
            long jM28598 = C11456.m28598(c11456);
            long jM28594 = C11456.m28594(c11456);
            long jM28597 = C11456.m28597(c11456);
            long j = jM28594 - jM28598;
            long j2 = this.f3543;
            InterfaceC22039 interfaceC22039 = this.f3542;
            if (j <= j2) {
                this.f3544 = null;
                interfaceC22039.mo3847();
                return m3482(interfaceC7222, jM28598, c0954);
            }
            long position = jM28597 - interfaceC7222.getPosition();
            if (position < 0 || position > 262144) {
                return m3482(interfaceC7222, jM28597, c0954);
            }
            interfaceC7222.mo19214((int) position);
            interfaceC7222.mo19217();
            C5105 c5105Mo3846 = interfaceC22039.mo3846(interfaceC7222, C11456.m28596(c11456));
            int i = c5105Mo3846.f17797;
            if (i == -3) {
                this.f3544 = null;
                interfaceC22039.mo3847();
                return m3482(interfaceC7222, jM28597, c0954);
            }
            if (i == -2) {
                C11456.m28599(c11456, c5105Mo3846.f17798, c5105Mo3846.f17796);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = c5105Mo3846.f17796 - interfaceC7222.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC7222.mo19214((int) position2);
                    }
                    this.f3544 = null;
                    interfaceC22039.mo3847();
                    return m3482(interfaceC7222, c5105Mo3846.f17796, c0954);
                }
                C11456.m28595(c11456, c5105Mo3846.f17798, c5105Mo3846.f17796);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3482(InterfaceC7222 interfaceC7222, long j, C0954 c0954) {
        if (j == interfaceC7222.getPosition()) {
            return 0;
        }
        c0954.f3770 = j;
        return 1;
    }
}
