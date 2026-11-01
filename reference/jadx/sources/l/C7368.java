package l;

import java.math.RoundingMode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7368 implements InterfaceC20774 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f24442;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f24443;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f24444;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f24445;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f24446;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f24447;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7648 f24448;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f24449;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15690 f24450;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0312 f24451;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f24452;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC8011 f24453;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f24441 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f24440 = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, EnumC23529.f76192};

    public C7368(InterfaceC15690 interfaceC15690, InterfaceC8011 interfaceC8011, C0312 c0312) throws C22861 {
        this.f24450 = interfaceC15690;
        this.f24453 = interfaceC8011;
        this.f24451 = c0312;
        int i = c0312.f1677;
        int iMax = Math.max(1, i / 10);
        this.f24447 = iMax;
        C2460 c2460 = new C2460(c0312.f1678);
        c2460.m7528();
        int iM7528 = c2460.m7528();
        this.f24443 = iM7528;
        int i2 = c0312.f1680;
        int i3 = c0312.f1679;
        int iM38346 = (C16236.m38346(i2, 4, i3, 8) / (c0312.f1676 * i2)) + 1;
        if (iM7528 != iM38346) {
            throw C22861.m50610("Expected frames per block: " + iM38346 + "; got: " + iM7528, (Throwable) null);
        }
        int iM41812 = C17983.m41812(iMax, iM7528);
        this.f24446 = new byte[iM41812 * i3];
        this.f24445 = new C2460(iM7528 * 2 * i2 * iM41812);
        int i4 = ((i3 * i) * 8) / iM7528;
        C10471 c10471 = new C10471();
        c10471.m26533("audio/raw");
        c10471.m26515(i4);
        c10471.m26528(i4);
        c10471.m26531(iMax * 2 * i2);
        c10471.m26494(i2);
        c10471.m26511(i);
        c10471.m26512(2);
        this.f24448 = c10471.m26497();
    }

    @Override // l.InterfaceC20774
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19637(long j) {
        this.f24442 = 0;
        this.f24444 = j;
        this.f24449 = 0;
        this.f24452 = 0L;
    }

    @Override // l.InterfaceC20774
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19636(int i, long j) {
        C17246 c17246 = new C17246(this.f24451, this.f24443, i, j);
        this.f24450.mo7690(c17246);
        C7648 c7648 = this.f24448;
        InterfaceC8011 interfaceC8011 = this.f24453;
        interfaceC8011.mo8116(c7648);
        interfaceC8011.mo8113(c17246.mo5383());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0177  */
    /* JADX WARN: Code duplicated, block: B:37:0x017b  */
    /* JADX WARN: Code duplicated, block: B:43:0x005b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0140 A[EDGE_INSN: B:47:0x0140->B:34:0x0140 BREAK  A[LOOP:1: B:17:0x0061->B:33:0x0130], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0051 -> B:12:0x0053). Please report as a decompilation issue!!! */
    @Override // l.InterfaceC20774
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19638(InterfaceC7222 interfaceC7222, long j) {
        C7368 c7368;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        C0312 c0312;
        int i5;
        InterfaceC7222 interfaceC7223;
        long j2;
        byte[] bArr;
        int i6;
        boolean z2;
        int i7;
        int i8;
        C2460 c2460;
        int i9;
        int i10;
        byte[] bArrM7518;
        int i11;
        int i12;
        int iM41813;
        int[] iArr;
        int i13;
        int i14;
        int iM41814;
        int i15;
        C7368 c7369;
        byte b;
        int i16;
        int i17;
        int iM41614;
        int i18;
        int i19;
        int i20 = this.f24449;
        C0312 c0313 = this.f24451;
        int i21 = i20 / (c0313.f1680 * 2);
        int i22 = this.f24447;
        int i23 = this.f24443;
        int iM41812 = C17983.m41812(i22 - i21, i23);
        int i24 = c0313.f1680;
        int i25 = c0313.f1679;
        int i26 = iM41812 * i25;
        if (j != 0) {
            c7368 = this;
            i = i23;
            i2 = i24;
            i3 = i25;
            z = false;
            i4 = i26;
            c0312 = c0313;
            i5 = i22;
            interfaceC7223 = interfaceC7222;
            j2 = j;
            while (true) {
                bArr = c7368.f24446;
                if (z && (i18 = c7368.f24442) < i4) {
                    i19 = interfaceC7223.read(bArr, c7368.f24442, (int) Math.min(i4 - i18, j2));
                    if (i19 == -1) {
                        break;
                    }
                    c7368.f24442 += i19;
                    bArr = c7368.f24446;
                    if (z) {
                    }
                }
                i6 = c7368.f24442 / i3;
                if (i6 > 0) {
                    i8 = 0;
                    while (true) {
                        c2460 = c7368.f24445;
                        if (i8 < i6) {
                            break;
                        }
                        i10 = 0;
                        while (i10 < i2) {
                            bArrM7518 = c2460.m7518();
                            int i27 = (i10 * 4) + (i8 * i3);
                            i11 = (i2 * 4) + i27;
                            i12 = (i3 / i2) - 4;
                            boolean z3 = z;
                            iM41813 = (short) (((bArr[i27 + 1] & 255) << 8) | (bArr[i27] & 255));
                            int iMin = Math.min(bArr[i27 + 2] & 255, 88);
                            iArr = f24440;
                            int i28 = iArr[iMin];
                            i13 = ((i8 * i * i2) + i10) * 2;
                            bArrM7518[i13] = (byte) (iM41813 & 255);
                            int i29 = i5;
                            bArrM7518[i13 + 1] = (byte) (iM41813 >> 8);
                            i14 = 0;
                            iM41814 = iMin;
                            int i30 = i3;
                            i15 = i28;
                            while (true) {
                                c7369 = c7368;
                                if (i14 < i12 * 2) {
                                    b = bArr[((i14 / 8) * i2 * 4) + i11 + ((i14 / 2) % 4)];
                                    byte[] bArr2 = bArr;
                                    i16 = b & 255;
                                    if (i14 % 2 == 0) {
                                        i17 = b & 15;
                                    } else {
                                        i17 = i16 >> 4;
                                    }
                                    int i31 = i11;
                                    C2460 c2461 = c2460;
                                    iM41614 = C17922.m41614(i17 & 7, 2, 1, i15) >> 3;
                                    if ((i17 & 8) != 0) {
                                        iM41614 = -iM41614;
                                    }
                                    iM41813 = C17983.m41813(iM41813 + iM41614, -32768, EnumC23529.f76192);
                                    i13 = (i2 * 2) + i13;
                                    bArrM7518[i13] = (byte) (iM41813 & 255);
                                    bArrM7518[i13 + 1] = (byte) (iM41813 >> 8);
                                    iM41814 = C17983.m41813(iM41814 + f24441[i17], 0, 88);
                                    i15 = iArr[iM41814];
                                    i14++;
                                    c7368 = c7369;
                                    bArr = bArr2;
                                    i11 = i31;
                                    c2460 = c2461;
                                }
                            }
                            i10++;
                            z = z3;
                            i3 = i30;
                            i5 = i29;
                            c7368 = c7369;
                        }
                        i8++;
                    }
                    z2 = z;
                    int i32 = i * i6 * 2 * c0312.f1680;
                    c2460.m7510(0);
                    c2460.m7501(i32);
                    c7368.f24442 -= i6 * i3;
                    int iM7509 = c2460.m7509();
                    c7368.f24453.mo8112(iM7509, c2460);
                    i9 = c7368.f24449 + iM7509;
                    c7368.f24449 = i9;
                    if (i9 / (c0312.f1680 * 2) >= i5) {
                        c7368.m19635(i5);
                    }
                } else {
                    z2 = z;
                }
                if (z2 && (i7 = c7368.f24449 / (c0312.f1680 * 2)) > 0) {
                    c7368.m19635(i7);
                }
                return z2;
            }
        }
        c7368 = this;
        i = i23;
        i2 = i24;
        i3 = i25;
        i4 = i26;
        c0312 = c0313;
        i5 = i22;
        interfaceC7223 = interfaceC7222;
        j2 = j;
        z = true;
        while (true) {
            bArr = c7368.f24446;
            if (z) {
            }
            i6 = c7368.f24442 / i3;
            if (i6 > 0) {
                i8 = 0;
                while (true) {
                    c2460 = c7368.f24445;
                    if (i8 < i6) {
                        break;
                        break;
                    }
                    i10 = 0;
                    while (i10 < i2) {
                        bArrM7518 = c2460.m7518();
                        int i210 = (i10 * 4) + (i8 * i3);
                        i11 = (i2 * 4) + i210;
                        i12 = (i3 / i2) - 4;
                        boolean z4 = z;
                        iM41813 = (short) (((bArr[i210 + 1] & 255) << 8) | (bArr[i210] & 255));
                        int iMin2 = Math.min(bArr[i210 + 2] & 255, 88);
                        iArr = f24440;
                        int i211 = iArr[iMin2];
                        i13 = ((i8 * i * i2) + i10) * 2;
                        bArrM7518[i13] = (byte) (iM41813 & 255);
                        int i212 = i5;
                        bArrM7518[i13 + 1] = (byte) (iM41813 >> 8);
                        i14 = 0;
                        iM41814 = iMin2;
                        int i33 = i3;
                        i15 = i211;
                        while (true) {
                            c7369 = c7368;
                            if (i14 < i12 * 2) {
                                b = bArr[((i14 / 8) * i2 * 4) + i11 + ((i14 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                i16 = b & 255;
                                if (i14 % 2 == 0) {
                                    i17 = b & 15;
                                } else {
                                    i17 = i16 >> 4;
                                }
                                int i34 = i11;
                                C2460 c2462 = c2460;
                                iM41614 = C17922.m41614(i17 & 7, 2, 1, i15) >> 3;
                                if ((i17 & 8) != 0) {
                                    iM41614 = -iM41614;
                                }
                                iM41813 = C17983.m41813(iM41813 + iM41614, -32768, EnumC23529.f76192);
                                i13 = (i2 * 2) + i13;
                                bArrM7518[i13] = (byte) (iM41813 & 255);
                                bArrM7518[i13 + 1] = (byte) (iM41813 >> 8);
                                iM41814 = C17983.m41813(iM41814 + f24441[i17], 0, 88);
                                i15 = iArr[iM41814];
                                i14++;
                                c7368 = c7369;
                                bArr = bArr3;
                                i11 = i34;
                                c2460 = c2462;
                            }
                        }
                        i10++;
                        z = z4;
                        i3 = i33;
                        i5 = i212;
                        c7368 = c7369;
                    }
                    i8++;
                }
                z2 = z;
                int i35 = i * i6 * 2 * c0312.f1680;
                c2460.m7510(0);
                c2460.m7501(i35);
                c7368.f24442 -= i6 * i3;
                int iM75010 = c2460.m7509();
                c7368.f24453.mo8112(iM75010, c2460);
                i9 = c7368.f24449 + iM75010;
                c7368.f24449 = i9;
                if (i9 / (c0312.f1680 * 2) >= i5) {
                    c7368.m19635(i5);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                c7368.m19635(i7);
            }
            return z2;
            c7368.f24442 += i19;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19635(int i) {
        long j = this.f24444;
        long j2 = this.f24452;
        C0312 c0312 = this.f24451;
        long j3 = c0312.f1677;
        String str = C17983.f57504;
        long jM41830 = j + C17983.m41830(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * c0312.f1680;
        this.f24453.mo8114(jM41830, 1, i2, this.f24449 - i2, null);
        this.f24452 += (long) i;
        this.f24449 -= i2;
    }
}
