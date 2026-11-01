package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes.dex */
public final class C23159 implements InterfaceC19631 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f75174;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f75175;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f75176;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f75177;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f75178;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC21041 f75179;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8342 f75180;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f75181;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f75182;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f75183;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f75184;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f75185;

    public C23159(AbstractC21041 abstractC21041, long j, long j2, long j3, long j4, boolean z) {
        C2023.m6507(j >= 0 && j2 > j);
        this.f75179 = abstractC21041;
        this.f75178 = j;
        this.f75175 = j2;
        if (j3 == j2 - j || z) {
            this.f75183 = j4;
            this.f75176 = 4;
        } else {
            this.f75176 = 0;
        }
        this.f75180 = new C8342();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    @Override // l.InterfaceC19631
    /* JADX INFO: renamed from: ۙ */
    public final long mo20180(InterfaceC7222 interfaceC7222) throws IOException {
        long j;
        long jM41829;
        long j2;
        long j3;
        int i = this.f75176;
        long j4 = this.f75175;
        C8342 c8342 = this.f75180;
        if (i == 0) {
            j = 0;
            long position = interfaceC7222.getPosition();
            this.f75184 = position;
            this.f75176 = 1;
            long j5 = j4 - 65307;
            if (j5 > position) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f75174 == this.f75177) {
                    jM41829 = -1;
                } else {
                    long position2 = interfaceC7222.getPosition();
                    if (!c8342.m21790(interfaceC7222, this.f75177)) {
                        jM41829 = this.f75174;
                        if (jM41829 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        c8342.m21791(interfaceC7222, false);
                        interfaceC7222.mo19217();
                        long j6 = this.f75185;
                        long j7 = c8342.f28885;
                        long j8 = j6 - j7;
                        int i2 = c8342.f28884 + c8342.f28882;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.f75177 = position2;
                                this.f75182 = j7;
                            } else {
                                this.f75174 = interfaceC7222.getPosition() + ((long) i2);
                                this.f75181 = c8342.f28885;
                            }
                            long j9 = this.f75177;
                            jM41829 = this.f75174;
                            if (j9 - jM41829 < 100000) {
                                this.f75177 = jM41829;
                            } else {
                                long position3 = interfaceC7222.getPosition() - (((long) i2) * (j8 <= 0 ? 2L : 1L));
                                long j10 = this.f75177;
                                long j11 = this.f75174;
                                jM41829 = C17983.m41829((((j10 - j11) * j8) / (this.f75182 - this.f75181)) + position3, j11, j10 - 1);
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                            jM41829 = -1;
                        }
                        if (jM41829 != j2) {
                            return jM41829;
                        }
                        this.f75176 = 3;
                        j3 = 2;
                    }
                }
                j2 = -1;
                if (jM41829 != j2) {
                    return jM41829;
                }
                this.f75176 = 3;
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
                c8342.m21790(interfaceC7222, j2);
                c8342.m21791(interfaceC7222, false);
                if (c8342.f28885 <= this.f75185) {
                    interfaceC7222.mo19214(c8342.f28884 + c8342.f28882);
                    this.f75174 = interfaceC7222.getPosition();
                    this.f75181 = c8342.f28885;
                    j2 = -1;
                } else {
                    interfaceC7222.mo19217();
                    this.f75176 = 4;
                    return -(this.f75181 + j3);
                }
            }
        } else {
            j = 0;
        }
        c8342.f28880 = 0;
        c8342.f28885 = j;
        c8342.f28883 = 0;
        c8342.f28884 = 0;
        c8342.f28882 = 0;
        if (!c8342.m21790(interfaceC7222, -1L)) {
            throw new EOFException();
        }
        c8342.m21791(interfaceC7222, false);
        interfaceC7222.mo19214(c8342.f28884 + c8342.f28882);
        long j12 = c8342.f28885;
        while ((c8342.f28880 & 4) != 4 && c8342.m21790(interfaceC7222, -1L) && interfaceC7222.getPosition() < j4 && c8342.m21791(interfaceC7222, true)) {
            try {
                interfaceC7222.mo19214(c8342.f28884 + c8342.f28882);
                j12 = c8342.f28885;
            } catch (EOFException unused) {
            }
        }
        this.f75183 = j12;
        this.f75176 = 4;
        return this.f75184;
    }

    @Override // l.InterfaceC19631
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6599 mo20181() {
        if (this.f75183 != 0) {
            return new C6930(this);
        }
        return null;
    }

    @Override // l.InterfaceC19631
    /* JADX INFO: renamed from: ۙ */
    public final void mo20182(long j) {
        this.f75185 = C17983.m41829(j, 0L, this.f75183 - 1);
        this.f75176 = 2;
        this.f75174 = this.f75178;
        this.f75177 = this.f75175;
        this.f75181 = 0L;
        this.f75182 = this.f75183;
    }
}
