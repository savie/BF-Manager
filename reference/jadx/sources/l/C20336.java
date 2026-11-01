package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.᩶ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18RZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20336 extends AbstractC21041 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f65860;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C16103 f65861;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10128 f65862;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f65863;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C20711 f65864;

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۙ */
    public final void mo23376(boolean z) {
        super.mo23376(z);
        if (z) {
            this.f65861 = null;
            this.f65864 = null;
            this.f65862 = null;
        }
        this.f65863 = 0;
        this.f65860 = false;
    }

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo45901(long j) {
        super.mo45901(j);
        this.f65860 = j != 0;
        C20711 c20711 = this.f65864;
        this.f65863 = c20711 != null ? c20711.f67342 : 0;
    }

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۙ */
    public final long mo23375(C2460 c2460) {
        int i;
        if ((c2460.m7518()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c2460.m7518()[0];
        C16103 c16103 = this.f65861;
        C2023.m6508(c16103);
        int i2 = c16103.f52073;
        C20711 c20711 = c16103.f52072;
        if (!c16103.f52069[(b >> 1) & (255 >>> (8 - i2))].f24239) {
            i = c20711.f67342;
        } else {
            i = c20711.f67339;
        }
        long j = this.f65860 ? (this.f65863 + i) / 4 : 0;
        if (c2460.m7521() < c2460.m7509() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(c2460.m7518(), c2460.m7509() + 4);
            c2460.m7508(bArrCopyOf.length, bArrCopyOf);
        } else {
            c2460.m7501(c2460.m7509() + 4);
        }
        byte[] bArrM7518 = c2460.m7518();
        bArrM7518[c2460.m7509() - 4] = (byte) (j & 255);
        bArrM7518[c2460.m7509() - 3] = (byte) ((j >>> 8) & 255);
        bArrM7518[c2460.m7509() - 2] = (byte) ((j >>> 16) & 255);
        bArrM7518[c2460.m7509() - 1] = (byte) ((j >>> 24) & 255);
        this.f65860 = true;
        this.f65863 = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0384 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x0386  */
    @Override // l.AbstractC21041
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23377(C2460 c2460, long j, C10459 c10459) throws C22861 {
        C16103 c16103;
        int i;
        long jFloor;
        if (this.f65861 == null) {
            C20711 c20711 = this.f65864;
            int i2 = 4;
            if (c20711 != null) {
                C10128 c10128 = this.f65862;
                if (c10128 == null) {
                    this.f65862 = C15773.m37514(c2460, true, true);
                } else {
                    byte[] bArr = new byte[c2460.m7509()];
                    System.arraycopy(c2460.m7518(), 0, bArr, 0, c2460.m7509());
                    int i3 = c20711.f67341;
                    int i4 = 5;
                    C15773.m37515(5, c2460, false);
                    int iM7516 = c2460.m7516() + 1;
                    C8717 c8717 = new C8717(c2460.m7518());
                    c8717.m22563(c2460.m7500() * 8);
                    int i5 = 0;
                    while (true) {
                        int i6 = 16;
                        if (i5 >= iM7516) {
                            int i7 = 6;
                            int iM22562 = c8717.m22562(6) + 1;
                            for (int i8 = 0; i8 < iM22562; i8++) {
                                if (c8717.m22562(16) != 0) {
                                    throw C22861.m50610("placeholder of time domain transforms not zeroed out", (Throwable) null);
                                }
                            }
                            int i9 = 1;
                            int iM22563 = c8717.m22562(6) + 1;
                            int i10 = 0;
                            while (true) {
                                int i11 = 3;
                                if (i10 >= iM22563) {
                                    int iM22564 = c8717.m22562(i7) + 1;
                                    int i12 = 0;
                                    while (i12 < iM22564) {
                                        if (c8717.m22562(16) > 2) {
                                            throw C22861.m50610("residueType greater than 2 is not decodable", (Throwable) null);
                                        }
                                        c8717.m22563(24);
                                        c8717.m22563(24);
                                        c8717.m22563(24);
                                        int iM22565 = c8717.m22562(i7) + 1;
                                        int i13 = 8;
                                        c8717.m22563(8);
                                        int[] iArr = new int[iM22565];
                                        for (int i14 = 0; i14 < iM22565; i14++) {
                                            iArr[i14] = ((c8717.m22564() ? c8717.m22562(5) : 0) * 8) + c8717.m22562(3);
                                        }
                                        int i15 = 0;
                                        while (i15 < iM22565) {
                                            int i16 = 0;
                                            while (i16 < i13) {
                                                if ((iArr[i15] & (1 << i16)) != 0) {
                                                    c8717.m22563(i13);
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
                                    int iM22566 = c8717.m22562(i7) + 1;
                                    for (int i17 = 0; i17 < iM22566; i17++) {
                                        int iM22567 = c8717.m22562(16);
                                        if (iM22567 != 0) {
                                            C0303.m1853("mapping type other than 0 not supported: " + iM22567);
                                        } else {
                                            int iM22568 = c8717.m22564() ? c8717.m22562(4) + 1 : 1;
                                            if (c8717.m22564()) {
                                                int iM22569 = c8717.m22562(8) + 1;
                                                for (int i18 = 0; i18 < iM22569; i18++) {
                                                    int i19 = i3 - 1;
                                                    int i20 = 0;
                                                    for (int i21 = i19; i21 > 0; i21 >>>= 1) {
                                                        i20++;
                                                    }
                                                    c8717.m22563(i20);
                                                    int i22 = 0;
                                                    while (i19 > 0) {
                                                        i22++;
                                                        i19 >>>= 1;
                                                    }
                                                    c8717.m22563(i22);
                                                }
                                            }
                                            if (c8717.m22562(2) != 0) {
                                                throw C22861.m50610("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                                            }
                                            if (iM22568 > 1) {
                                                for (int i23 = 0; i23 < i3; i23++) {
                                                    c8717.m22563(4);
                                                }
                                            }
                                            for (int i24 = 0; i24 < iM22568; i24++) {
                                                c8717.m22563(8);
                                                c8717.m22563(8);
                                                c8717.m22563(8);
                                            }
                                        }
                                    }
                                    int iM225610 = c8717.m22562(6);
                                    int i25 = iM225610 + 1;
                                    C7305[] c7305Arr = new C7305[i25];
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        boolean zM22564 = c8717.m22564();
                                        c8717.m22562(16);
                                        c8717.m22562(16);
                                        c8717.m22562(8);
                                        c7305Arr[i26] = new C7305(zM22564);
                                    }
                                    if (c8717.m22564()) {
                                        int i27 = 0;
                                        while (iM225610 > 0) {
                                            i27++;
                                            iM225610 >>>= 1;
                                        }
                                        c16103 = new C16103(c20711, c10128, bArr, c7305Arr, i27);
                                        break;
                                    }
                                    throw C22861.m50610("framing bit after modes not set as expected", (Throwable) null);
                                }
                                int iM225611 = c8717.m22562(i6);
                                if (iM225611 == 0) {
                                    i = iM22563;
                                    int i28 = 8;
                                    c8717.m22563(8);
                                    c8717.m22563(16);
                                    c8717.m22563(16);
                                    c8717.m22563(6);
                                    c8717.m22563(8);
                                    int iM225612 = c8717.m22562(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iM225612) {
                                        c8717.m22563(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iM225611 != i9) {
                                        throw C22861.m50610("floor type greater than 1 not decodable: " + iM225611, (Throwable) null);
                                    }
                                    int iM225613 = c8717.m22562(5);
                                    int[] iArr2 = new int[iM225613];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iM225613; i31++) {
                                        int iM225614 = c8717.m22562(4);
                                        iArr2[i31] = iM225614;
                                        if (iM225614 > i30) {
                                            i30 = iM225614;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr3[i33] = c8717.m22562(i11) + 1;
                                        int iM225615 = c8717.m22562(2);
                                        if (iM225615 > 0) {
                                            c8717.m22563(8);
                                        }
                                        int i34 = iM22563;
                                        int i35 = i32;
                                        int i36 = 8;
                                        int i37 = 0;
                                        while (i37 < (1 << iM225615)) {
                                            c8717.m22563(i36);
                                            i37++;
                                            i36 = 8;
                                        }
                                        i33++;
                                        i11 = 3;
                                        iM22563 = i34;
                                        i32 = i35;
                                    }
                                    i = iM22563;
                                    c8717.m22563(2);
                                    int iM225616 = c8717.m22562(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < iM225613; i40++) {
                                        i38 += iArr3[iArr2[i40]];
                                        while (i39 < i38) {
                                            c8717.m22563(iM225616);
                                            i39++;
                                        }
                                    }
                                }
                                i10++;
                                i7 = 6;
                                i9 = 1;
                                i6 = 16;
                                iM22563 = i;
                            }
                        } else {
                            if (c8717.m22562(24) != 5653314) {
                                throw C22861.m50610("expected code book to start with [0x56, 0x43, 0x42] at " + c8717.m22561(), (Throwable) null);
                            }
                            int iM225617 = c8717.m22562(16);
                            int iM225618 = c8717.m22562(24);
                            if (!c8717.m22564()) {
                                boolean zM22565 = c8717.m22564();
                                for (int i41 = 0; i41 < iM225618; i41++) {
                                    if (zM22565) {
                                        if (c8717.m22564()) {
                                            c8717.m22563(i4);
                                        }
                                    } else {
                                        c8717.m22563(i4);
                                    }
                                }
                            } else {
                                c8717.m22563(i4);
                                int iM225619 = 0;
                                while (iM225619 < iM225618) {
                                    int i42 = 0;
                                    for (int i43 = iM225618 - iM225619; i43 > 0; i43 >>>= 1) {
                                        i42++;
                                    }
                                    iM225619 += c8717.m22562(i42);
                                }
                            }
                            int iM225620 = c8717.m22562(i2);
                            if (iM225620 > 2) {
                                throw C22861.m50610("lookup type greater than 2 not decodable: " + iM225620, (Throwable) null);
                            }
                            if (iM225620 == 1 || iM225620 == 2) {
                                c8717.m22563(32);
                                c8717.m22563(32);
                                int iM225621 = c8717.m22562(i2) + 1;
                                c8717.m22563(1);
                                if (iM225620 == 1) {
                                    jFloor = iM225617 != 0 ? (long) Math.floor(Math.pow(iM225618, 1.0d / ((double) iM225617))) : 0L;
                                } else {
                                    jFloor = ((long) iM225618) * ((long) iM225617);
                                }
                                c8717.m22563((int) (jFloor * ((long) iM225621)));
                            }
                            i5++;
                            i2 = 4;
                            i4 = 5;
                        }
                    }
                }
                this.f65861 = c16103;
                if (c16103 == null) {
                    return true;
                }
                C20711 c20712 = c16103.f52072;
                ArrayList arrayList = new ArrayList();
                arrayList.add(c20712.f67344);
                arrayList.add(c16103.f52071);
                C0987 c0987M37513 = C15773.m37513(AbstractC22433.m49800(c16103.f52070.f34617));
                C10471 c10471 = new C10471();
                c10471.m26521("audio/ogg");
                c10471.m26533("audio/vorbis");
                c10471.m26515(c20712.f67343);
                c10471.m26528(c20712.f67340);
                c10471.m26494(c20712.f67341);
                c10471.m26511(c20712.f67338);
                c10471.m26503((List) arrayList);
                c10471.m26504(c0987M37513);
                c10459.f35698 = c10471.m26497();
                return true;
            }
            C15773.m37515(1, c2460, false);
            c2460.m7533();
            int iM7517 = c2460.m7516();
            int iM7533 = c2460.m7533();
            int iM7502 = c2460.m7502();
            int i44 = iM7502 <= 0 ? -1 : iM7502;
            int iM7503 = c2460.m7502();
            int i45 = iM7503 <= 0 ? -1 : iM7503;
            c2460.m7502();
            int iM7518 = c2460.m7516();
            int iPow = (int) Math.pow(2.0d, iM7518 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM7518 & 240) >> 4);
            c2460.m7516();
            this.f65864 = new C20711(iM7517, iM7533, i44, i45, iPow, iPow2, Arrays.copyOf(c2460.m7518(), c2460.m7509()));
            c16103 = null;
            this.f65861 = c16103;
            if (c16103 == null) {
                return true;
            }
            C20711 c20713 = c16103.f52072;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c20713.f67344);
            arrayList2.add(c16103.f52071);
            C0987 c0987M37514 = C15773.m37513(AbstractC22433.m49800(c16103.f52070.f34617));
            C10471 c10472 = new C10471();
            c10472.m26521("audio/ogg");
            c10472.m26533("audio/vorbis");
            c10472.m26515(c20713.f67343);
            c10472.m26528(c20713.f67340);
            c10472.m26494(c20713.f67341);
            c10472.m26511(c20713.f67338);
            c10472.m26503((List) arrayList2);
            c10472.m26504(c0987M37514);
            c10459.f35698 = c10472.m26497();
            return true;
        }
        c10459.f35698.getClass();
        return false;
    }
}
