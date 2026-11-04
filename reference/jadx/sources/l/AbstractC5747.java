package l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۚܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: VA9Z */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f19779;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f19780;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19781;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f19782;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f19784;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22901 f19785;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f19786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f19787;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f19789;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f19790;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f19791;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22155 f19788 = new C22155();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15441 f19783 = new C15441();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo16806(C21287 c21287);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo16810(C21287 c21287, long j, C15441 c15441);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16808(InterfaceC12789 interfaceC12789, InterfaceC22024 interfaceC22024) {
        this.f19789 = interfaceC12789;
        this.f19787 = interfaceC22024;
        mo16809(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16809(boolean z) {
        if (z) {
            this.f19783 = new C15441();
            this.f19784 = 0L;
            this.f19791 = 0;
        } else {
            this.f19791 = 1;
        }
        this.f19786 = -1L;
        this.f19780 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16807(long j, long j2) {
        this.f19788.m50119();
        if (j == 0) {
            mo16809(!this.f19779);
            return;
        }
        if (this.f19791 != 0) {
            long jM16812 = m16812(j2);
            this.f19786 = jM16812;
            InterfaceC22901 interfaceC22901 = this.f19785;
            String str = C7116.f23455;
            interfaceC22901.mo19924(jM16812);
            this.f19791 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16804(InterfaceC19502 interfaceC19502, C18756 c18756) {
        C20782.m47566(this.f19787);
        String str = C7116.f23455;
        int i = this.f19791;
        C22155 c22155 = this.f19788;
        if (i == 0) {
            while (c22155.m50118(interfaceC19502)) {
                this.f19790 = interfaceC19502.getPosition() - this.f19784;
                if (mo16810(c22155.m50120(), this.f19784, this.f19783)) {
                    this.f19784 = interfaceC19502.getPosition();
                } else {
                    C15648 c15648 = this.f19783.f50296;
                    this.f19781 = c15648.f50829;
                    if (!this.f19782) {
                        this.f19787.mo14384(c15648);
                        this.f19782 = true;
                    }
                    C7282 c7282 = this.f19783.f50297;
                    if (c7282 != null) {
                        this.f19785 = c7282;
                    } else if (interfaceC19502.getLength() == -1) {
                        this.f19785 = new C13204();
                    } else {
                        C10966 c10966M50117 = c22155.m50117();
                        this.f19785 = new C8773(this, this.f19784, interfaceC19502.getLength(), c10966M50117.f34643 + c10966M50117.f34642, c10966M50117.f34647, (c10966M50117.f34644 & 4) != 0);
                    }
                    this.f19791 = 2;
                    c22155.m50121();
                    return 0;
                }
            }
            this.f19791 = 3;
            return -1;
        }
        if (i == 1) {
            interfaceC19502.mo10073((int) this.f19784);
            this.f19791 = 2;
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long jMo19922 = this.f19785.mo19922(interfaceC19502);
        if (jMo19922 >= 0) {
            c18756.f60914 = jMo19922;
            return 1;
        }
        if (jMo19922 < -1) {
            mo16811(-(jMo19922 + 2));
        }
        if (!this.f19779) {
            InterfaceC9060 interfaceC9060Mo19923 = this.f19785.mo19923();
            C20782.m47566(interfaceC9060Mo19923);
            this.f19789.mo16659(interfaceC9060Mo19923);
            this.f19787.mo14382(interfaceC9060Mo19923.mo2295());
            this.f19779 = true;
        }
        if (this.f19790 > 0 || c22155.m50118(interfaceC19502)) {
            this.f19790 = 0L;
            C21287 c21287M50120 = c22155.m50120();
            long jMo16806 = mo16806(c21287M50120);
            if (jMo16806 >= 0) {
                long j = this.f19780;
                if (j + jMo16806 >= this.f19786) {
                    long jM16805 = m16805(j);
                    this.f19787.mo14381(c21287M50120.m48509(), c21287M50120);
                    this.f19787.mo14383(jM16805, 1, c21287M50120.m48509(), 0, null);
                    this.f19786 = -1L;
                }
            }
            this.f19780 += jMo16806;
            return 0;
        }
        this.f19791 = 3;
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m16805(long j) {
        return (j * 1000000) / ((long) this.f19781);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m16812(long j) {
        return (((long) this.f19781) * j) / 1000000;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo16811(long j) {
        this.f19780 = j;
    }
}
