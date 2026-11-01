package l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.᩷ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: VA9Z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21041 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f68533;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f68534;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f68535;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f68536;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18925 f68537 = new C18925();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10459 f68538 = new C10459();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f68539;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f68540;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f68541;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f68542;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f68543;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC19631 f68544;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f68545;

    /* JADX INFO: renamed from: ۙ */
    public abstract long mo23375(C2460 c2460);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo23377(C2460 c2460, long j, C10459 c10459);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47445(InterfaceC15690 interfaceC15690, InterfaceC8011 interfaceC8011) {
        this.f68541 = interfaceC15690;
        this.f68543 = interfaceC8011;
        mo23376(true);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23376(boolean z) {
        if (z) {
            this.f68538 = new C10459();
            this.f68533 = 0L;
            this.f68545 = 0;
        } else {
            this.f68545 = 1;
        }
        this.f68542 = -1L;
        this.f68536 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47444(long j, long j2) {
        this.f68537.m43598();
        if (j == 0) {
            mo23376(!this.f68535);
            return;
        }
        if (this.f68545 != 0) {
            long jM47446 = m47446(j2);
            this.f68542 = jM47446;
            InterfaceC19631 interfaceC19631 = this.f68544;
            String str = C17983.f57504;
            interfaceC19631.mo20182(jM47446);
            this.f68545 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47442(InterfaceC7222 interfaceC7222, C0954 c0954) {
        C2023.m6508(this.f68543);
        String str = C17983.f57504;
        int i = this.f68545;
        C18925 c18925 = this.f68537;
        if (i == 0) {
            while (c18925.m43597(interfaceC7222)) {
                this.f68534 = interfaceC7222.getPosition() - this.f68533;
                if (mo23377(c18925.m43599(), this.f68533, this.f68538)) {
                    this.f68533 = interfaceC7222.getPosition();
                } else {
                    C7648 c7648 = this.f68538.f35698;
                    this.f68540 = c7648.f25260;
                    if (!this.f68539) {
                        this.f68543.mo8116(c7648);
                        this.f68539 = true;
                    }
                    C15398 c15398 = this.f68538.f35699;
                    if (c15398 != null) {
                        this.f68544 = c15398;
                    } else if (interfaceC7222.getLength() == -1) {
                        this.f68544 = new C7636();
                    } else {
                        C8342 c8342M43596 = c18925.m43596();
                        this.f68544 = new C23159(this, this.f68533, interfaceC7222.getLength(), c8342M43596.f28884 + c8342M43596.f28882, c8342M43596.f28885, (c8342M43596.f28880 & 4) != 0);
                    }
                    this.f68545 = 2;
                    c18925.m43595();
                    return 0;
                }
            }
            this.f68545 = 3;
            return -1;
        }
        if (i == 1) {
            interfaceC7222.mo19214((int) this.f68533);
            this.f68545 = 2;
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long jMo20180 = this.f68544.mo20180(interfaceC7222);
        if (jMo20180 >= 0) {
            c0954.f3770 = jMo20180;
            return 1;
        }
        if (jMo20180 < -1) {
            mo45901(-(jMo20180 + 2));
        }
        if (!this.f68535) {
            InterfaceC6599 interfaceC6599Mo20181 = this.f68544.mo20181();
            C2023.m6508(interfaceC6599Mo20181);
            this.f68541.mo7690(interfaceC6599Mo20181);
            this.f68543.mo8113(interfaceC6599Mo20181.mo5383());
            this.f68535 = true;
        }
        if (this.f68534 > 0 || c18925.m43597(interfaceC7222)) {
            this.f68534 = 0L;
            C2460 c2460M43599 = c18925.m43599();
            long jMo23375 = mo23375(c2460M43599);
            if (jMo23375 >= 0) {
                long j = this.f68536;
                if (j + jMo23375 >= this.f68542) {
                    long jM47443 = m47443(j);
                    this.f68543.mo8112(c2460M43599.m7509(), c2460M43599);
                    this.f68543.mo8114(jM47443, 1, c2460M43599.m7509(), 0, null);
                    this.f68542 = -1L;
                }
            }
            this.f68536 += jMo23375;
            return 0;
        }
        this.f68545 = 3;
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47443(long j) {
        return (j * 1000000) / ((long) this.f68540);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m47446(long j) {
        return (((long) this.f68540) * j) / 1000000;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo45901(long j) {
        this.f68536 = j;
    }
}
