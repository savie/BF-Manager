package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۧܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18RZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11712 extends AbstractC5747 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f37892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2018 f37893;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C19786 f37894;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C13073 f37895;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f37896;

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۙ */
    public final void mo16809(boolean z) {
        super.mo16809(z);
        if (z) {
            this.f37893 = null;
            this.f37895 = null;
            this.f37894 = null;
        }
        this.f37896 = 0;
        this.f37892 = false;
    }

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۤ */
    public final void mo16811(long j) {
        super.mo16811(j);
        this.f37892 = j != 0;
        C13073 c13073 = this.f37895;
        this.f37896 = c13073 != null ? c13073.f41815 : 0;
    }

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۙ */
    public final long mo16806(C21287 c21287) {
        int i;
        if ((c21287.m48497()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c21287.m48497()[0];
        C2018 c2018 = this.f37893;
        C20782.m47566(c2018);
        int i2 = c2018.f6725;
        C13073 c13073 = c2018.f6723;
        if (!c2018.f6726[(b >> 1) & (255 >>> (8 - i2))].f50049) {
            i = c13073.f41815;
        } else {
            i = c13073.f41820;
        }
        long j = this.f37892 ? (this.f37896 + i) / 4 : 0;
        if (c21287.m48513() < c21287.m48509() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(c21287.m48497(), c21287.m48509() + 4);
            c21287.m48491(bArrCopyOf.length, bArrCopyOf);
        } else {
            c21287.m48517(c21287.m48509() + 4);
        }
        byte[] bArrM48497 = c21287.m48497();
        bArrM48497[c21287.m48509() - 4] = (byte) (j & 255);
        bArrM48497[c21287.m48509() - 3] = (byte) ((j >>> 8) & 255);
        bArrM48497[c21287.m48509() - 2] = (byte) ((j >>> 16) & 255);
        bArrM48497[c21287.m48509() - 1] = (byte) ((j >>> 24) & 255);
        this.f37892 = true;
        this.f37896 = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0384 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x0386  */
    @Override // l.AbstractC5747
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16810(C21287 c21287, long j, C15441 c15441) throws C2970 {
        C2018 c2018;
        int i;
        long jFloor;
        if (this.f37893 == null) {
            C13073 c13073 = this.f37895;
            int i2 = 4;
            if (c13073 != null) {
                C19786 c19786 = this.f37894;
                if (c19786 == null) {
                    this.f37894 = C5616.m16597(c21287, true, true);
                } else {
                    byte[] bArr = new byte[c21287.m48509()];
                    System.arraycopy(c21287.m48497(), 0, bArr, 0, c21287.m48509());
                    int i3 = c13073.f41818;
                    int i4 = 5;
                    C5616.m16598(5, c21287, false);
                    int iM48493 = c21287.m48493() + 1;
                    C22770 c22770 = new C22770(c21287.m48497());
                    c22770.m51346(c21287.m48516() * 8);
                    int i5 = 0;
                    while (true) {
                        int i6 = 16;
                        if (i5 >= iM48493) {
                            int i7 = 6;
                            int iM51345 = c22770.m51345(6) + 1;
                            for (int i8 = 0; i8 < iM51345; i8++) {
                                if (c22770.m51345(16) != 0) {
                                    throw C2970.m9688("placeholder of time domain transforms not zeroed out", (Throwable) null);
                                }
                            }
                            int i9 = 1;
                            int iM51346 = c22770.m51345(6) + 1;
                            int i10 = 0;
                            while (true) {
                                int i11 = 3;
                                if (i10 >= iM51346) {
                                    int iM51347 = c22770.m51345(i7) + 1;
                                    int i12 = 0;
                                    while (i12 < iM51347) {
                                        if (c22770.m51345(16) > 2) {
                                            throw C2970.m9688("residueType greater than 2 is not decodable", (Throwable) null);
                                        }
                                        c22770.m51346(24);
                                        c22770.m51346(24);
                                        c22770.m51346(24);
                                        int iM51348 = c22770.m51345(i7) + 1;
                                        int i13 = 8;
                                        c22770.m51346(8);
                                        int[] iArr = new int[iM51348];
                                        for (int i14 = 0; i14 < iM51348; i14++) {
                                            iArr[i14] = ((c22770.m51347() ? c22770.m51345(5) : 0) * 8) + c22770.m51345(3);
                                        }
                                        int i15 = 0;
                                        while (i15 < iM51348) {
                                            int i16 = 0;
                                            while (i16 < i13) {
                                                if ((iArr[i15] & (1 << i16)) != 0) {
                                                    c22770.m51346(i13);
                                                }
                                                i16++;
                                                i13 = 8;
                                            }
                                            i15++;
                                            i13 = 8;
                                        }
                                        i12++;
                                        i7 = 6;
                                    }
                                    int iM51349 = c22770.m51345(i7) + 1;
                                    for (int i17 = 0; i17 < iM51349; i17++) {
                                        int iM513410 = c22770.m51345(16);
                                        if (iM513410 != 0) {
                                            C1896.m6515("mapping type other than 0 not supported: " + iM513410);
                                        } else {
                                            int iM513411 = c22770.m51347() ? c22770.m51345(4) + 1 : 1;
                                            if (c22770.m51347()) {
                                                int iM513412 = c22770.m51345(8) + 1;
                                                for (int i18 = 0; i18 < iM513412; i18++) {
                                                    int i19 = i3 - 1;
                                                    int i20 = 0;
                                                    for (int i21 = i19; i21 > 0; i21 >>>= 1) {
                                                        i20++;
                                                    }
                                                    c22770.m51346(i20);
                                                    int i22 = 0;
                                                    while (i19 > 0) {
                                                        i22++;
                                                        i19 >>>= 1;
                                                    }
                                                    c22770.m51346(i22);
                                                }
                                            }
                                            if (c22770.m51345(2) != 0) {
                                                throw C2970.m9688("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                                            }
                                            if (iM513411 > 1) {
                                                for (int i23 = 0; i23 < i3; i23++) {
                                                    c22770.m51346(4);
                                                }
                                            }
                                            for (int i24 = 0; i24 < iM513411; i24++) {
                                                c22770.m51346(8);
                                                c22770.m51346(8);
                                                c22770.m51346(8);
                                            }
                                        }
                                    }
                                    int iM513413 = c22770.m51345(6);
                                    int i25 = iM513413 + 1;
                                    C15310[] c15310Arr = new C15310[i25];
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        boolean zM51347 = c22770.m51347();
                                        c22770.m51345(16);
                                        c22770.m51345(16);
                                        c22770.m51345(8);
                                        c15310Arr[i26] = new C15310(zM51347);
                                    }
                                    if (c22770.m51347()) {
                                        int i27 = 0;
                                        while (iM513413 > 0) {
                                            i27++;
                                            iM513413 >>>= 1;
                                        }
                                        c2018 = new C2018(c13073, c19786, bArr, c15310Arr, i27);
                                        break;
                                    }
                                    throw C2970.m9688("framing bit after modes not set as expected", (Throwable) null);
                                }
                                int iM513414 = c22770.m51345(i6);
                                if (iM513414 == 0) {
                                    i = iM51346;
                                    int i28 = 8;
                                    c22770.m51346(8);
                                    c22770.m51346(16);
                                    c22770.m51346(16);
                                    c22770.m51346(6);
                                    c22770.m51346(8);
                                    int iM513415 = c22770.m51345(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iM513415) {
                                        c22770.m51346(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iM513414 != i9) {
                                        throw C2970.m9688("floor type greater than 1 not decodable: " + iM513414, (Throwable) null);
                                    }
                                    int iM513416 = c22770.m51345(5);
                                    int[] iArr2 = new int[iM513416];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iM513416; i31++) {
                                        int iM513417 = c22770.m51345(4);
                                        iArr2[i31] = iM513417;
                                        if (iM513417 > i30) {
                                            i30 = iM513417;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr3[i33] = c22770.m51345(i11) + 1;
                                        int iM513418 = c22770.m51345(2);
                                        if (iM513418 > 0) {
                                            c22770.m51346(8);
                                        }
                                        int i34 = iM51346;
                                        int i35 = i32;
                                        int i36 = 8;
                                        int i37 = 0;
                                        while (i37 < (1 << iM513418)) {
                                            c22770.m51346(i36);
                                            i37++;
                                            i36 = 8;
                                        }
                                        i33++;
                                        i11 = 3;
                                        iM51346 = i34;
                                        i32 = i35;
                                    }
                                    i = iM51346;
                                    c22770.m51346(2);
                                    int iM513419 = c22770.m51345(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < iM513416; i40++) {
                                        i38 += iArr3[iArr2[i40]];
                                        while (i39 < i38) {
                                            c22770.m51346(iM513419);
                                            i39++;
                                        }
                                    }
                                }
                                i10++;
                                i7 = 6;
                                i9 = 1;
                                i6 = 16;
                                iM51346 = i;
                            }
                        } else {
                            if (c22770.m51345(24) != 5653314) {
                                throw C2970.m9688("expected code book to start with [0x56, 0x43, 0x42] at " + c22770.m51344(), (Throwable) null);
                            }
                            int iM513420 = c22770.m51345(16);
                            int iM513421 = c22770.m51345(24);
                            if (!c22770.m51347()) {
                                boolean zM51348 = c22770.m51347();
                                for (int i41 = 0; i41 < iM513421; i41++) {
                                    if (zM51348) {
                                        if (c22770.m51347()) {
                                            c22770.m51346(i4);
                                        }
                                    } else {
                                        c22770.m51346(i4);
                                    }
                                }
                            } else {
                                c22770.m51346(i4);
                                int iM513422 = 0;
                                while (iM513422 < iM513421) {
                                    int i42 = 0;
                                    for (int i43 = iM513421 - iM513422; i43 > 0; i43 >>>= 1) {
                                        i42++;
                                    }
                                    iM513422 += c22770.m51345(i42);
                                }
                            }
                            int iM513423 = c22770.m51345(i2);
                            if (iM513423 > 2) {
                                throw C2970.m9688("lookup type greater than 2 not decodable: " + iM513423, (Throwable) null);
                            }
                            if (iM513423 == 1 || iM513423 == 2) {
                                c22770.m51346(32);
                                c22770.m51346(32);
                                int iM513424 = c22770.m51345(i2) + 1;
                                c22770.m51346(1);
                                if (iM513423 == 1) {
                                    jFloor = iM513420 != 0 ? (long) Math.floor(Math.pow(iM513421, 1.0d / ((double) iM513420))) : 0L;
                                } else {
                                    jFloor = ((long) iM513421) * ((long) iM513420);
                                }
                                c22770.m51346((int) (jFloor * ((long) iM513424)));
                            }
                            i5++;
                            i2 = 4;
                            i4 = 5;
                        }
                    }
                }
                this.f37893 = c2018;
                if (c2018 == null) {
                    return true;
                }
                C13073 c13074 = c2018.f6723;
                ArrayList arrayList = new ArrayList();
                arrayList.add(c13074.f41817);
                arrayList.add(c2018.f6724);
                C19378 c19378M16596 = C5616.m16596(AbstractC1928.m6615(c2018.f6722.f63651));
                C20124 c20124 = new C20124();
                c20124.m46327("audio/ogg");
                c20124.m46315("audio/vorbis");
                c20124.m46308(c13074.f41819);
                c20124.m46322(c13074.f41814);
                c20124.m46329(c13074.f41818);
                c20124.m46332(c13074.f41816);
                c20124.m46301((List) arrayList);
                c20124.m46303(c19378M16596);
                c15441.f50296 = c20124.m46295();
                return true;
            }
            C5616.m16598(1, c21287, false);
            c21287.m48506();
            int iM48494 = c21287.m48493();
            int iM48506 = c21287.m48506();
            int iM48483 = c21287.m48483();
            int i44 = iM48483 <= 0 ? -1 : iM48483;
            int iM48484 = c21287.m48483();
            int i45 = iM48484 <= 0 ? -1 : iM48484;
            c21287.m48483();
            int iM48495 = c21287.m48493();
            int iPow = (int) Math.pow(2.0d, iM48495 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM48495 & 240) >> 4);
            c21287.m48493();
            this.f37895 = new C13073(iM48494, iM48506, i44, i45, iPow, iPow2, Arrays.copyOf(c21287.m48497(), c21287.m48509()));
            c2018 = null;
            this.f37893 = c2018;
            if (c2018 == null) {
                return true;
            }
            C13073 c13075 = c2018.f6723;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c13075.f41817);
            arrayList2.add(c2018.f6724);
            C19378 c19378M16597 = C5616.m16596(AbstractC1928.m6615(c2018.f6722.f63651));
            C20124 c20125 = new C20124();
            c20125.m46327("audio/ogg");
            c20125.m46315("audio/vorbis");
            c20125.m46308(c13075.f41819);
            c20125.m46322(c13075.f41814);
            c20125.m46329(c13075.f41818);
            c20125.m46332(c13075.f41816);
            c20125.m46301((List) arrayList2);
            c20125.m46303(c19378M16597);
            c15441.f50296 = c20125.m46295();
            return true;
        }
        c15441.f50296.getClass();
        return false;
    }
}
