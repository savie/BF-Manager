package l;

/* JADX INFO: renamed from: l.۫᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13394 extends AbstractC8909 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8909 f42684 = new C13394(9);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f42685;

    public C13394(int i) {
        super(5);
        this.f42685 = 1 << (i - 1);
    }

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ */
    public final int mo17251(int i, int i2, byte[] bArr, byte[] bArr2) {
        C17123 c17123;
        C17123 c17124;
        byte[] bArr3 = bArr;
        int i3 = 0;
        C23800.m53094(0, i, bArr3);
        C23800.m53094(0, i2, bArr2);
        int i4 = i - 12;
        int i5 = i - 5;
        C15631 c15631 = new C15631(this);
        C17123 c17125 = new C17123();
        C17123 c17126 = new C17123();
        C17123 c17127 = new C17123();
        int iM40279 = 1;
        int iM56603 = 0;
        while (iM40279 < i4) {
            if (c15631.m37385(bArr3, iM40279, i5, c17125)) {
                int i6 = c17125.f55865;
                int iM402710 = i3;
                int iM56604 = iM56603;
                int i7 = c17125.f55866;
                int i8 = c17125.f55867;
                int i9 = i6;
                while (true) {
                    if (c17125.m40279() < i4) {
                        int i10 = i8;
                        int i11 = i7;
                        int i12 = i9;
                        C17123 c17128 = c17127;
                        C17123 c17129 = c17126;
                        if (c15631.m37384(bArr, c17125.m40279() - 2, c17125.f55866 + 1, i5, c17125.f55865, c17126)) {
                            int i13 = c17125.f55866;
                            c17126 = c17129;
                            if (i11 < i13 && c17126.f55866 < i13 + i12) {
                                c17125.f55865 = i12;
                                c17125.f55866 = i11;
                                c17125.f55867 = i10;
                            }
                            if (c17126.f55866 - c17125.f55866 < 3) {
                                C17869.m41713(c17126, c17125);
                                i8 = i10;
                                i7 = i11;
                                i9 = i12;
                                c17127 = c17128;
                            } else {
                                while (true) {
                                    int i14 = c17126.f55866;
                                    int i15 = c17125.f55866;
                                    if (i14 - i15 < 18) {
                                        int i16 = c17125.f55865;
                                        if (i16 > 18) {
                                            i16 = 18;
                                        }
                                        if (i15 + i16 > c17126.m40279() - 4) {
                                            i16 = ((c17126.f55866 - c17125.f55866) + c17126.f55865) - 4;
                                        }
                                        int i17 = i16 - (c17126.f55866 - c17125.f55866);
                                        if (i17 > 0) {
                                            c17126.m40280(i17);
                                        }
                                    }
                                    if (c17126.f55866 + c17126.f55865 < i4) {
                                        c17124 = c17126;
                                        if (c15631.m37384(bArr, c17126.m40279() - 3, c17126.f55866, i5, c17126.f55865, c17128)) {
                                            C17123 c171210 = c17128;
                                            if (c171210.f55866 >= c17125.m40279() + 3) {
                                                if (c17124.f55866 < c17125.m40279()) {
                                                    int i18 = c17124.f55866 - c17125.f55866;
                                                    if (i18 < 15) {
                                                        if (c17125.f55865 > 18) {
                                                            c17125.f55865 = 18;
                                                        }
                                                        if (c17125.m40279() > c17124.m40279() - 4) {
                                                            c17125.f55865 = (c17124.m40279() - c17125.f55866) - 4;
                                                        }
                                                        c17124.m40280(c17125.m40279() - c17124.f55866);
                                                    } else {
                                                        c17125.f55865 = i18;
                                                    }
                                                }
                                                C17123 c171211 = c17125;
                                                iM56604 = C25329.m56603(bArr, bArr2, iM402710, c17125.f55866, c17125.f55867, c17125.f55865, iM56604, i2);
                                                iM402710 = c171211.m40279();
                                                C17869.m41713(c17124, c171211);
                                                C17869.m41713(c171210, c17124);
                                                c17128 = c171210;
                                                c17125 = c171211;
                                            } else if (c171210.f55866 >= c17125.m40279()) {
                                                if (c17124.f55866 < c17125.m40279()) {
                                                    c17124.m40280(c17125.m40279() - c17124.f55866);
                                                    if (c17124.f55865 < 4) {
                                                        C17869.m41713(c171210, c17124);
                                                    }
                                                }
                                                C17123 c171212 = c17125;
                                                iM56604 = C25329.m56603(bArr, bArr2, iM402710, c17125.f55866, c17125.f55867, c17125.f55865, iM56604, i2);
                                                iM402710 = c171212.m40279();
                                                C17869.m41713(c171210, c171212);
                                                i9 = c17124.f55865;
                                                i7 = c17124.f55866;
                                                i8 = c17124.f55867;
                                                c17127 = c171210;
                                                c17125 = c171212;
                                                c17126 = c17124;
                                            } else {
                                                C17869.m41713(c171210, c17124);
                                                c17128 = c171210;
                                            }
                                            c17126 = c17124;
                                        }
                                    } else {
                                        c17124 = c17126;
                                    }
                                    c17125 = c17125;
                                    c17123 = c17128;
                                    if (c17124.f55866 < c17125.m40279()) {
                                        c17125.f55865 = c17124.f55866 - c17125.f55866;
                                    }
                                    iM56603 = C25329.m56603(bArr, bArr2, c17125.m40279(), c17124.f55866, c17124.f55867, c17124.f55865, C25329.m56603(bArr, bArr2, iM402710, c17125.f55866, c17125.f55867, c17125.f55865, iM56604, i2), i2);
                                    iM40279 = c17124.m40279();
                                }
                            }
                        } else {
                            c17123 = c17128;
                            c17124 = c17129;
                        }
                        i3 = iM40279;
                        c17127 = c17123;
                        c17125 = c17125;
                        c17126 = c17124;
                        bArr3 = bArr;
                    } else {
                        c17123 = c17127;
                        c17124 = c17126;
                    }
                    iM56603 = C25329.m56603(bArr, bArr2, iM402710, c17125.f55866, c17125.f55867, c17125.f55865, iM56604, i2);
                    iM40279 = c17125.m40279();
                    i3 = iM40279;
                    c17127 = c17123;
                    c17125 = c17125;
                    c17126 = c17124;
                    bArr3 = bArr;
                }
            } else {
                iM40279++;
            }
        }
        return C25329.m56602(bArr, i3, i - i3, bArr2, iM56603, i2);
    }
}
