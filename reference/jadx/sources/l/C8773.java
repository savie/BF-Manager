package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes4.dex */
public final class C8773 implements InterfaceC22901 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f28524;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f28525;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f28526;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10966 f28527;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5747 f28528;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f28529;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f28530;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f28531;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f28532;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f28533;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f28534;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f28535;

    public C8773(AbstractC5747 abstractC5747, long j, long j2, long j3, long j4, boolean z) {
        C20782.m47565(j >= 0 && j2 > j);
        this.f28528 = abstractC5747;
        this.f28532 = j;
        this.f28534 = j2;
        if (j3 == j2 - j || z) {
            this.f28531 = j4;
            this.f28524 = 4;
        } else {
            this.f28524 = 0;
        }
        this.f28527 = new C10966();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    @Override // l.InterfaceC22901
    /* JADX INFO: renamed from: ۙ */
    public final long mo19922(InterfaceC19502 interfaceC19502) throws IOException {
        long j;
        long jM19476;
        long j2;
        long j3;
        int i = this.f28524;
        long j4 = this.f28534;
        C10966 c10966 = this.f28527;
        if (i == 0) {
            j = 0;
            long position = interfaceC19502.getPosition();
            this.f28530 = position;
            this.f28524 = 1;
            long j5 = j4 - 65307;
            if (j5 > position) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f28529 == this.f28525) {
                    jM19476 = -1;
                } else {
                    long position2 = interfaceC19502.getPosition();
                    if (!c10966.m27797(interfaceC19502, this.f28525)) {
                        jM19476 = this.f28529;
                        if (jM19476 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        c10966.m27798(interfaceC19502, false);
                        interfaceC19502.mo10076();
                        long j6 = this.f28535;
                        long j7 = c10966.f34647;
                        long j8 = j6 - j7;
                        int i2 = c10966.f34643 + c10966.f34642;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.f28525 = position2;
                                this.f28533 = j7;
                            } else {
                                this.f28529 = interfaceC19502.getPosition() + ((long) i2);
                                this.f28526 = c10966.f34647;
                            }
                            long j9 = this.f28525;
                            jM19476 = this.f28529;
                            if (j9 - jM19476 < 100000) {
                                this.f28525 = jM19476;
                            } else {
                                long position3 = interfaceC19502.getPosition() - (((long) i2) * (j8 <= 0 ? 2L : 1L));
                                long j10 = this.f28525;
                                long j11 = this.f28529;
                                jM19476 = C7116.m19476((((j10 - j11) * j8) / (this.f28533 - this.f28526)) + position3, j11, j10 - 1);
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                            jM19476 = -1;
                        }
                        if (jM19476 != j2) {
                            return jM19476;
                        }
                        this.f28524 = 3;
                        j3 = 2;
                    }
                }
                j2 = -1;
                if (jM19476 != j2) {
                    return jM19476;
                }
                this.f28524 = 3;
                j3 = 2;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j3 = 2;
                j2 = -1;
            }
            while (true) {
                c10966.m27797(interfaceC19502, j2);
                c10966.m27798(interfaceC19502, false);
                if (c10966.f34647 <= this.f28535) {
                    interfaceC19502.mo10073(c10966.f34643 + c10966.f34642);
                    this.f28529 = interfaceC19502.getPosition();
                    this.f28526 = c10966.f34647;
                    j2 = -1;
                } else {
                    interfaceC19502.mo10076();
                    this.f28524 = 4;
                    return -(this.f28526 + j3);
                }
            }
        } else {
            j = 0;
        }
        c10966.f34644 = 0;
        c10966.f34647 = j;
        c10966.f34646 = 0;
        c10966.f34643 = 0;
        c10966.f34642 = 0;
        if (!c10966.m27797(interfaceC19502, -1L)) {
            throw new EOFException();
        }
        c10966.m27798(interfaceC19502, false);
        interfaceC19502.mo10073(c10966.f34643 + c10966.f34642);
        long j12 = c10966.f34647;
        while ((c10966.f34644 & 4) != 4 && c10966.m27797(interfaceC19502, -1L) && interfaceC19502.getPosition() < j4 && c10966.m27798(interfaceC19502, true)) {
            try {
                interfaceC19502.mo10073(c10966.f34643 + c10966.f34642);
                j12 = c10966.f34647;
            } catch (EOFException unused) {
            }
        }
        this.f28531 = j12;
        this.f28524 = 4;
        return this.f28530;
    }

    @Override // l.InterfaceC22901
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9060 mo19923() {
        if (this.f28531 != 0) {
            return new C2807(this);
        }
        return null;
    }

    @Override // l.InterfaceC22901
    /* JADX INFO: renamed from: ۙ */
    public final void mo19924(long j) {
        this.f28535 = C7116.m19476(j, 0L, this.f28531 - 1);
        this.f28524 = 2;
        this.f28529 = this.f28532;
        this.f28525 = this.f28534;
        this.f28526 = 0L;
        this.f28533 = this.f28531;
    }
}
