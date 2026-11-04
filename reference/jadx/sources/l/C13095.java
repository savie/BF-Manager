package l;

import java.math.RoundingMode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13095 implements InterfaceC5638 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f41843;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f41844;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f41845;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 f41846;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f41847;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f41848;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f41849;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C25030 f41850;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f41851;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC12789 f41852;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f41853;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f41854;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f41842 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int[] f41841 = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, EnumC6121.f20881};

    public C13095(InterfaceC12789 interfaceC12789, InterfaceC22024 interfaceC22024, C25030 c25030) throws C2970 {
        this.f41852 = interfaceC12789;
        this.f41854 = interfaceC22024;
        this.f41850 = c25030;
        int i = c25030.f80994;
        int iMax = Math.max(1, i / 10);
        this.f41847 = iMax;
        C21287 c21287 = new C21287(c25030.f80992);
        c21287.m48504();
        int iM48504 = c21287.m48504();
        this.f41853 = iM48504;
        int i2 = c25030.f80993;
        int i3 = c25030.f80995;
        int iM55770 = (C24966.m55770(i2, 4, i3, 8) / (c25030.f80991 * i2)) + 1;
        if (iM48504 != iM55770) {
            throw C2970.m9688("Expected frames per block: " + iM55770 + "; got: " + iM48504, (Throwable) null);
        }
        int iM19459 = C7116.m19459(iMax, iM48504);
        this.f41851 = new byte[iM19459 * i3];
        this.f41844 = new C21287(iM48504 * 2 * i2 * iM19459);
        int i4 = ((i3 * i) * 8) / iM48504;
        C20124 c20124 = new C20124();
        c20124.m46315("audio/raw");
        c20124.m46308(i4);
        c20124.m46322(i4);
        c20124.m46318(iMax * 2 * i2);
        c20124.m46329(i2);
        c20124.m46332(i);
        c20124.m46293(2);
        this.f41846 = c20124.m46295();
    }

    @Override // l.InterfaceC5638
    /* JADX INFO: renamed from: ۙ */
    public final void mo6573(long j) {
        this.f41848 = 0;
        this.f41843 = j;
        this.f41845 = 0;
        this.f41849 = 0L;
    }

    @Override // l.InterfaceC5638
    /* JADX INFO: renamed from: ۙ */
    public final void mo6572(int i, long j) {
        C16078 c16078 = new C16078(this.f41850, this.f41853, i, j);
        this.f41852.mo16659(c16078);
        C15648 c15648 = this.f41846;
        InterfaceC22024 interfaceC22024 = this.f41854;
        interfaceC22024.mo14384(c15648);
        interfaceC22024.mo14382(c16078.mo2295());
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
    @Override // l.InterfaceC5638
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6574(InterfaceC19502 interfaceC19502, long j) {
        C13095 c13095;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        C25030 c25030;
        int i5;
        InterfaceC19502 interfaceC19503;
        long j2;
        byte[] bArr;
        int i6;
        boolean z2;
        int i7;
        int i8;
        C21287 c21287;
        int i9;
        int i10;
        byte[] bArrM48497;
        int i11;
        int i12;
        int iM19460;
        int[] iArr;
        int i13;
        int i14;
        int iM19461;
        int i15;
        C13095 c13096;
        byte b;
        int i16;
        int i17;
        int iM42345;
        int i18;
        int i19;
        int i20 = this.f41845;
        C25030 c25031 = this.f41850;
        int i21 = i20 / (c25031.f80993 * 2);
        int i22 = this.f41847;
        int i23 = this.f41853;
        int iM19459 = C7116.m19459(i22 - i21, i23);
        int i24 = c25031.f80993;
        int i25 = c25031.f80995;
        int i26 = iM19459 * i25;
        if (j != 0) {
            c13095 = this;
            i = i23;
            i2 = i24;
            i3 = i25;
            z = false;
            i4 = i26;
            c25030 = c25031;
            i5 = i22;
            interfaceC19503 = interfaceC19502;
            j2 = j;
            while (true) {
                bArr = c13095.f41851;
                if (z && (i18 = c13095.f41848) < i4) {
                    i19 = interfaceC19503.read(bArr, c13095.f41848, (int) Math.min(i4 - i18, j2));
                    if (i19 == -1) {
                        break;
                    }
                    c13095.f41848 += i19;
                    bArr = c13095.f41851;
                    if (z) {
                    }
                }
                i6 = c13095.f41848 / i3;
                if (i6 > 0) {
                    i8 = 0;
                    while (true) {
                        c21287 = c13095.f41844;
                        if (i8 < i6) {
                            break;
                        }
                        i10 = 0;
                        while (i10 < i2) {
                            bArrM48497 = c21287.m48497();
                            int i27 = (i10 * 4) + (i8 * i3);
                            i11 = (i2 * 4) + i27;
                            i12 = (i3 / i2) - 4;
                            boolean z3 = z;
                            iM19460 = (short) (((bArr[i27 + 1] & 255) << 8) | (bArr[i27] & 255));
                            int iMin = Math.min(bArr[i27 + 2] & 255, 88);
                            iArr = f41841;
                            int i28 = iArr[iMin];
                            i13 = ((i8 * i * i2) + i10) * 2;
                            bArrM48497[i13] = (byte) (iM19460 & 255);
                            int i29 = i5;
                            bArrM48497[i13 + 1] = (byte) (iM19460 >> 8);
                            i14 = 0;
                            iM19461 = iMin;
                            int i30 = i3;
                            i15 = i28;
                            while (true) {
                                c13096 = c13095;
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
                                    C21287 c21288 = c21287;
                                    iM42345 = C18176.m42345(i17 & 7, 2, 1, i15) >> 3;
                                    if ((i17 & 8) != 0) {
                                        iM42345 = -iM42345;
                                    }
                                    iM19460 = C7116.m19460(iM19460 + iM42345, -32768, EnumC6121.f20881);
                                    i13 = (i2 * 2) + i13;
                                    bArrM48497[i13] = (byte) (iM19460 & 255);
                                    bArrM48497[i13 + 1] = (byte) (iM19460 >> 8);
                                    iM19461 = C7116.m19460(iM19461 + f41842[i17], 0, 88);
                                    i15 = iArr[iM19461];
                                    i14++;
                                    c13095 = c13096;
                                    bArr = bArr2;
                                    i11 = i31;
                                    c21287 = c21288;
                                }
                            }
                            i10++;
                            z = z3;
                            i3 = i30;
                            i5 = i29;
                            c13095 = c13096;
                        }
                        i8++;
                    }
                    z2 = z;
                    int i32 = i * i6 * 2 * c25030.f80993;
                    c21287.m48510(0);
                    c21287.m48517(i32);
                    c13095.f41848 -= i6 * i3;
                    int iM48509 = c21287.m48509();
                    c13095.f41854.mo14381(iM48509, c21287);
                    i9 = c13095.f41845 + iM48509;
                    c13095.f41845 = i9;
                    if (i9 / (c25030.f80993 * 2) >= i5) {
                        c13095.m32561(i5);
                    }
                } else {
                    z2 = z;
                }
                if (z2 && (i7 = c13095.f41845 / (c25030.f80993 * 2)) > 0) {
                    c13095.m32561(i7);
                }
                return z2;
            }
        }
        c13095 = this;
        i = i23;
        i2 = i24;
        i3 = i25;
        i4 = i26;
        c25030 = c25031;
        i5 = i22;
        interfaceC19503 = interfaceC19502;
        j2 = j;
        z = true;
        while (true) {
            bArr = c13095.f41851;
            if (z) {
            }
            i6 = c13095.f41848 / i3;
            if (i6 > 0) {
                i8 = 0;
                while (true) {
                    c21287 = c13095.f41844;
                    if (i8 < i6) {
                        break;
                        break;
                    }
                    i10 = 0;
                    while (i10 < i2) {
                        bArrM48497 = c21287.m48497();
                        int i210 = (i10 * 4) + (i8 * i3);
                        i11 = (i2 * 4) + i210;
                        i12 = (i3 / i2) - 4;
                        boolean z4 = z;
                        iM19460 = (short) (((bArr[i210 + 1] & 255) << 8) | (bArr[i210] & 255));
                        int iMin2 = Math.min(bArr[i210 + 2] & 255, 88);
                        iArr = f41841;
                        int i211 = iArr[iMin2];
                        i13 = ((i8 * i * i2) + i10) * 2;
                        bArrM48497[i13] = (byte) (iM19460 & 255);
                        int i212 = i5;
                        bArrM48497[i13 + 1] = (byte) (iM19460 >> 8);
                        i14 = 0;
                        iM19461 = iMin2;
                        int i33 = i3;
                        i15 = i211;
                        while (true) {
                            c13096 = c13095;
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
                                C21287 c21289 = c21287;
                                iM42345 = C18176.m42345(i17 & 7, 2, 1, i15) >> 3;
                                if ((i17 & 8) != 0) {
                                    iM42345 = -iM42345;
                                }
                                iM19460 = C7116.m19460(iM19460 + iM42345, -32768, EnumC6121.f20881);
                                i13 = (i2 * 2) + i13;
                                bArrM48497[i13] = (byte) (iM19460 & 255);
                                bArrM48497[i13 + 1] = (byte) (iM19460 >> 8);
                                iM19461 = C7116.m19460(iM19461 + f41842[i17], 0, 88);
                                i15 = iArr[iM19461];
                                i14++;
                                c13095 = c13096;
                                bArr = bArr3;
                                i11 = i34;
                                c21287 = c21289;
                            }
                        }
                        i10++;
                        z = z4;
                        i3 = i33;
                        i5 = i212;
                        c13095 = c13096;
                    }
                    i8++;
                }
                z2 = z;
                int i35 = i * i6 * 2 * c25030.f80993;
                c21287.m48510(0);
                c21287.m48517(i35);
                c13095.f41848 -= i6 * i3;
                int iM485010 = c21287.m48509();
                c13095.f41854.mo14381(iM485010, c21287);
                i9 = c13095.f41845 + iM485010;
                c13095.f41845 = i9;
                if (i9 / (c25030.f80993 * 2) >= i5) {
                    c13095.m32561(i5);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                c13095.m32561(i7);
            }
            return z2;
            c13095.f41848 += i19;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32561(int i) {
        long j = this.f41843;
        long j2 = this.f41849;
        C25030 c25030 = this.f41850;
        long j3 = c25030.f80994;
        String str = C7116.f23455;
        long jM19477 = j + C7116.m19477(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * c25030.f80993;
        this.f41854.mo14383(jM19477, 1, i2, this.f41845 - i2, null);
        this.f41849 += (long) i;
        this.f41845 -= i2;
    }
}
