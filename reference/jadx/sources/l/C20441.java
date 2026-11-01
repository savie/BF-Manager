package l;

import android.util.Pair;
import com.alipay.sdk.m.p.a;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.᩶᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20441 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66270 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f66271;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46229(int i) {
        return (i >> 24) & 255;
    }

    static {
        String str = C17983.f57504;
        f66271 = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:317:0x062b  */
    /* JADX WARN: Code duplicated, block: B:383:0x071e  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bbf A[PHI: r10 r24
      0x0bbf: PHI (r10v85 java.lang.String) = (r10v84 java.lang.String), (r10v86 java.lang.String) binds: [B:558:0x0b1a, B:560:0x0b28] A[DONT_GENERATE, DONT_INLINE]
      0x0bbf: PHI (r24v2 l.᩸᩸ܰ) = (r24v1 l.᩸᩸ܰ), (r24v3 l.᩸᩸ܰ) binds: [B:558:0x0b1a, B:560:0x0b28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:626:0x0d34  */
    /* JADX WARN: Code duplicated, block: B:628:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d4f  */
    /* JADX WARN: Code duplicated, block: B:631:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:633:0x0d6c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m46231(C10223 c10223, C2988 c2988, long j, C8354 c8354, boolean z, boolean z2, InterfaceC11955 interfaceC11955) {
        int i;
        long jM41830;
        long j2;
        int i2;
        int i3;
        long jM41831;
        long j3;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        C10223 c10224;
        long[] jArr;
        long[] jArr2;
        C7648 c7648M26497;
        C8812 c8812;
        C0987 c0987;
        C0987 c0988;
        C22453 c22453;
        int i5;
        Pair pairCreate;
        C19030 c19030;
        ArrayList arrayList3;
        C10223 c10225;
        int i6;
        int i7;
        int i8;
        C9153 c9153;
        C2460 c2460;
        int i9;
        int iM7519;
        int iM75110;
        int iM7499;
        int iRound;
        int i10;
        C8354 c8355;
        String str2;
        int i11;
        int i12;
        String str3;
        int i13;
        int iM7500;
        String str4;
        int i14;
        int i15;
        List listOf;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        List listOf2;
        List list;
        AbstractC22433 abstractC22433;
        long j4;
        AbstractC22433 abstractC22433Of;
        String str5;
        String str6;
        AbstractC22433 abstractC22433Of2;
        ArrayList arrayList4;
        C10223 c10226 = c10223;
        ArrayList arrayList5 = c10226.f34899;
        ArrayList arrayList6 = new ArrayList();
        int i21 = 0;
        while (i21 < arrayList5.size()) {
            C10223 c10227 = (C10223) arrayList5.get(i21);
            if (c10227.f67638 != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i4 = i21;
            } else {
                C7400 c7400M26005 = c10226.m26005(1836476516);
                c7400M26005.getClass();
                C10223 c10223M26006 = c10227.m26006(1835297121);
                c10223M26006.getClass();
                C7400 c7400M26006 = c10223M26006.m26005(1751411826);
                c7400M26006.getClass();
                C2460 c2461 = c7400M26006.f24593;
                c2461.m7510(16);
                int iM74910 = c2461.m7499();
                if (iM74910 == 1936684398) {
                    i = 1;
                } else if (iM74910 == 1986618469) {
                    i = 2;
                } else if (iM74910 == 1952807028 || iM74910 == 1935832172 || iM74910 == 1937072756 || iM74910 == 1668047728 || iM74910 == 1937072752) {
                    i = 3;
                } else {
                    i = iM74910 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    c22453 = null;
                    i5 = 1835297121;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i4 = i21;
                    c10224 = c10227;
                } else {
                    C7400 c7400M26007 = c10227.m26005(1953196132);
                    c7400M26007.getClass();
                    C2460 c2462 = c7400M26007.f24593;
                    c2462.m7510(8);
                    int iM46229 = m46229(c2462.m7499());
                    c2462.m7535(iM46229 != 0 ? 16 : 8);
                    int iM74911 = c2462.m7499();
                    c2462.m7535(4);
                    int iM7501 = c2462.m7500();
                    int i22 = iM46229 == 0 ? 4 : 8;
                    int i23 = 0;
                    while (true) {
                        jM41830 = -9223372036854775807L;
                        if (i23 >= i22) {
                            c2462.m7535(i22);
                        } else {
                            if (c2462.m7518()[iM7501 + i23] != -1) {
                                long jM7532 = iM46229 == 0 ? c2462.m7532() : c2462.m7526();
                                if (jM7532 != 0) {
                                    j2 = jM7532;
                                    break;
                                }
                                break;
                            }
                            i23++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    c2462.m7535(10);
                    int iM75111 = c2462.m7519();
                    c2462.m7535(4);
                    int iM74912 = c2462.m7499();
                    int iM74913 = c2462.m7499();
                    c2462.m7535(4);
                    int iM74914 = c2462.m7499();
                    int iM74915 = c2462.m7499();
                    if (iM74912 == 0 && iM74913 == 65536 && ((iM74914 == -65536 || iM74914 == 65536) && iM74915 == 0)) {
                        i2 = 16;
                        i3 = 90;
                    } else if (iM74912 == 0 && iM74913 == -65536 && ((iM74914 == 65536 || iM74914 == -65536) && iM74915 == 0)) {
                        i2 = 16;
                        i3 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    } else if ((iM74912 == -65536 || iM74912 == 65536) && iM74913 == 0 && iM74914 == 0 && iM74915 == -65536) {
                        i2 = 16;
                        i3 = 180;
                    } else {
                        i2 = 16;
                        i3 = 0;
                    }
                    c2462.m7535(i2);
                    short sM7530 = c2462.m7530();
                    c2462.m7535(2);
                    C21146 c21146 = new C21146(iM74911, iM75111, i3, sM7530, c2462.m7530(), j2);
                    long j5 = j == -9223372036854775807L ? c21146.f68874 : j;
                    long j6 = m46238(c7400M26005.f24593).f65285;
                    if (j5 == -9223372036854775807L) {
                        jM41831 = -9223372036854775807L;
                    } else {
                        String str7 = C17983.f57504;
                        jM41831 = C17983.m41830(j5, 1000000L, j6, RoundingMode.DOWN);
                    }
                    C10223 c10223M26007 = c10223M26006.m26006(1835626086);
                    c10223M26007.getClass();
                    C10223 c10223M26008 = c10223M26007.m26006(1937007212);
                    c10223M26008.getClass();
                    C7400 c7400M26008 = c10223M26006.m26005(1835296868);
                    c7400M26008.getClass();
                    C2460 c2463 = c7400M26008.f24593;
                    c2463.m7510(8);
                    int iM462210 = m46229(c2463.m7499());
                    c2463.m7535(iM462210 == 0 ? 8 : 16);
                    long jM7533 = c2463.m7532();
                    int iM7502 = c2463.m7500();
                    int i24 = iM462210 == 0 ? 4 : 8;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= i24) {
                            j3 = j6;
                            c2463.m7535(i24);
                            break;
                        }
                        int i26 = iM7502;
                        j3 = j6;
                        if (c2463.m7518()[iM7502 + i25] != -1) {
                            long jM7534 = iM462210 == 0 ? c2463.m7532() : c2463.m7526();
                            if (jM7534 == 0) {
                                break;
                            }
                            String str8 = C17983.f57504;
                            jM41830 = C17983.m41830(jM7534, 1000000L, jM7533, RoundingMode.DOWN);
                            break;
                        }
                        i25++;
                        iM7502 = i26;
                        j6 = j3;
                    }
                    long j7 = jM41830;
                    int iM75112 = c2463.m7519();
                    int i27 = 3;
                    char[] cArr = {(char) (((iM75112 >> 10) & 31) + 96), (char) (((iM75112 >> 5) & 31) + 96), (char) ((iM75112 & 31) + 96)};
                    int i28 = 0;
                    while (true) {
                        if (i28 >= i27) {
                            str = new String(cArr);
                            break;
                        }
                        char c = cArr[i28];
                        if (c < 'a' || c > 'z') {
                            str = null;
                            break;
                        }
                        i28++;
                        i27 = 3;
                    }
                    C19030 c19031 = new C19030(str, jM7533, j7);
                    C7400 c7400M26009 = c10223M26008.m26005(1937011556);
                    if (c7400M26009 == null) {
                        throw C22861.m50610("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
                    }
                    C2460 c2464 = c7400M26009.f24593;
                    String str9 = c19031.f61557;
                    c2464.m7510(12);
                    int iM74916 = c2464.m7499();
                    C9153 c9154 = new C9153(iM74916);
                    int i29 = 0;
                    while (true) {
                        C1285[] c1285Arr = c9154.f31106;
                        if (i29 >= iM74916) {
                            C19030 c19032 = c19031;
                            int i30 = i;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i4 = i21;
                            C10223 c10228 = c10227;
                            long j8 = j3;
                            C9153 c9155 = c9154;
                            C22453 c22454 = null;
                            if (!z) {
                                c10224 = c10228;
                                C10223 c10223M26009 = c10224.m26006(1701082227);
                                if (c10223M26009 != null) {
                                    C7400 c7400M260010 = c10223M26009.m26005(1701606260);
                                    if (c7400M260010 == null) {
                                        pairCreate = null;
                                    } else {
                                        C2460 c2465 = c7400M260010.f24593;
                                        c2465.m7510(8);
                                        int iM462211 = m46229(c2465.m7499());
                                        int iM7531 = c2465.m7531();
                                        long[] jArr3 = new long[iM7531];
                                        long[] jArr4 = new long[iM7531];
                                        for (int i31 = 0; i31 < iM7531; i31++) {
                                            jArr3[i31] = iM462211 == 1 ? c2465.m7526() : c2465.m7532();
                                            jArr4[i31] = iM462211 == 1 ? c2465.m7529() : c2465.m7499();
                                            if (c2465.m7530() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            c2465.m7535(2);
                                        }
                                        pairCreate = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate != null) {
                                        jArr2 = (long[]) pairCreate.first;
                                        jArr = (long[]) pairCreate.second;
                                    }
                                }
                                if (c9155.f31105 != null) {
                                    if (c21146.f68871 != 0) {
                                        c8812 = new C8812(c21146.f68871);
                                        C10471 c10471M20201 = c9155.f31105.m20201();
                                        c0987 = c9155.f31105.f25258;
                                        if (c0987 != null) {
                                            c0988 = c0987.m3792(c8812);
                                        } else {
                                            c0988 = new C0987(c8812);
                                        }
                                        c10471M20201.m26504(c0988);
                                        c7648M26497 = c10471M20201.m26497();
                                    } else {
                                        c7648M26497 = c9155.f31105;
                                    }
                                    c22454 = new C22453(c21146.f68870, i30, c19032.f61558, j8, jM41831, c19032.f61559, c7648M26497, c9155.f31104, c1285Arr, c9155.f31107, jArr2, jArr, c9155.f31108);
                                }
                                c22453 = c22454;
                                i5 = 1835297121;
                                break;
                            }
                            c10224 = c10228;
                            jArr = null;
                            jArr2 = null;
                            if (c9155.f31105 != null) {
                                if (c21146.f68871 != 0) {
                                    c8812 = new C8812(c21146.f68871);
                                    C10471 c10471M20202 = c9155.f31105.m20201();
                                    c0987 = c9155.f31105.f25258;
                                    if (c0987 != null) {
                                        c0988 = c0987.m3792(c8812);
                                    } else {
                                        c0988 = new C0987(c8812);
                                    }
                                    c10471M20202.m26504(c0988);
                                    c7648M26497 = c10471M20202.m26497();
                                } else {
                                    c7648M26497 = c9155.f31105;
                                }
                                c22454 = new C22453(c21146.f68870, i30, c19032.f61558, j8, jM41831, c19032.f61559, c7648M26497, c9155.f31104, c1285Arr, c9155.f31107, jArr2, jArr, c9155.f31108);
                            }
                            c22453 = c22454;
                            i5 = 1835297121;
                            break;
                        }
                        int iM7503 = c2464.m7500();
                        int iM74917 = c2464.m7499();
                        int i32 = iM74916;
                        String str10 = "childAtomSize must be positive";
                        C19923.m45219("childAtomSize must be positive", iM74917 > 0);
                        int iM74918 = c2464.m7499();
                        int i33 = i;
                        if (iM74918 == 1635148593 || iM74918 == 1635148595 || iM74918 == 1701733238 || iM74918 == 1831958048 || iM74918 == 1836070006 || iM74918 == 1752589105 || iM74918 == 1751479857 || iM74918 == 1932670515 || iM74918 == 1211250227 || iM74918 == 1748121139 || iM74918 == 1987063864 || iM74918 == 1987063865 || iM74918 == 1635135537 || iM74918 == 1685479798 || iM74918 == 1685479729 || iM74918 == 1685481573 || iM74918 == 1685481521 || iM74918 == 1634760241) {
                            c19030 = c19031;
                            arrayList3 = arrayList6;
                            i21 = i21;
                            c10225 = c10227;
                            i6 = iM74917;
                            i7 = iM7503;
                            i8 = i29;
                            c9153 = c9154;
                            c2460 = c2464;
                            m46237(c2464, iM74918, iM7503, i6, c21146.f68870, str9, c21146.f68872, c8354, c9153, i8);
                        } else {
                            if (iM74918 == 1836069985 || iM74918 == 1701733217 || iM74918 == 1633889587 || iM74918 == 1700998451 || iM74918 == 1633889588 || iM74918 == 1835823201 || iM74918 == 1685353315 || iM74918 == 1685353317 || iM74918 == 1685353320 || iM74918 == 1685353324 || iM74918 == 1685353336 || iM74918 == 1935764850 || iM74918 == 1935767394 || iM74918 == 1819304813 || iM74918 == 1936684916 || iM74918 == 1953984371 || iM74918 == 778924082 || iM74918 == 778924083 || iM74918 == 1835557169 || iM74918 == 1835560241 || iM74918 == 1634492771 || iM74918 == 1634492791 || iM74918 == 1970037111 || iM74918 == 1332770163 || iM74918 == 1716281667 || iM74918 == 1767992678 || iM74918 == 1768973165 || iM74918 == 1718641517) {
                                c19030 = c19031;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c10225 = c10227;
                                int i34 = c21146.f68870;
                                c2464.m7510(iM7503 + 16);
                                if (z2) {
                                    iM7519 = c2464.m7519();
                                    c2464.m7535(6);
                                } else {
                                    c2464.m7535(8);
                                    iM7519 = 0;
                                }
                                if (iM7519 == 0 || iM7519 == 1) {
                                    iM75110 = c2464.m7519();
                                    c2464.m7535(6);
                                    int iM7513 = c2464.m7513();
                                    c2464.m7510(c2464.m7500() - 4);
                                    iM7499 = c2464.m7499();
                                    if (iM7519 == 1) {
                                        c2464.m7535(16);
                                    }
                                    iRound = iM7513;
                                    i10 = -1;
                                } else {
                                    if (iM7519 == 2) {
                                        c2464.m7535(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c2464.m7529()));
                                        iM75110 = c2464.m7531();
                                        c2464.m7535(4);
                                        int iM7532 = c2464.m7531();
                                        int iM7533 = c2464.m7531();
                                        boolean z3 = (iM7533 & 1) != 0;
                                        boolean z4 = (iM7533 & 2) != 0;
                                        if (z3) {
                                            if (iM7532 == 32) {
                                                i10 = 4;
                                            } else {
                                                i10 = -1;
                                            }
                                        } else if (iM7532 == 8) {
                                            i10 = 3;
                                        } else if (iM7532 == 16) {
                                            i10 = z4 ? 268435456 : 2;
                                        } else if (iM7532 == 24) {
                                            i10 = z4 ? 1342177280 : 21;
                                        } else if (iM7532 == 32) {
                                            i10 = z4 ? 1610612736 : 22;
                                        } else {
                                            i10 = -1;
                                        }
                                        c2464.m7535(8);
                                        iM7499 = 0;
                                    }
                                    c9153 = c9154;
                                    c2460 = c2464;
                                    i8 = i9;
                                    i7 = i12;
                                    i6 = i11;
                                }
                                if (iM74918 == 1767992678) {
                                    iM75110 = -1;
                                    iRound = -1;
                                } else if (iM74918 == 1935764850) {
                                    iM75110 = 1;
                                    iRound = 8000;
                                } else if (iM74918 == 1935767394) {
                                    iM75110 = 1;
                                    iRound = 16000;
                                }
                                int iM7504 = c2464.m7500();
                                if (iM74918 == 1701733217) {
                                    Pair pairM46230 = m46230(c2464, iM7503, iM74917);
                                    if (pairM46230 != null) {
                                        int iIntValue = ((Integer) pairM46230.first).intValue();
                                        C8354 c8354M21875 = c8354 == null ? null : c8354.m21875(((C1285) pairM46230.second).f5532);
                                        c1285Arr[i9] = (C1285) pairM46230.second;
                                        c8355 = c8354M21875;
                                        iM74918 = iIntValue;
                                    } else {
                                        c8355 = c8354;
                                    }
                                    c2464.m7510(iM7504);
                                } else {
                                    c8355 = c8354;
                                }
                                String str11 = "audio/mhm1";
                                int i35 = iRound;
                                if (iM74918 == 1633889587) {
                                    str2 = "audio/ac3";
                                } else if (iM74918 == 1700998451) {
                                    str2 = "audio/eac3";
                                } else if (iM74918 == 1633889588) {
                                    str2 = "audio/ac4";
                                } else if (iM74918 == 1685353315) {
                                    str2 = "audio/vnd.dts";
                                } else if (iM74918 == 1685353320 || iM74918 == 1685353324) {
                                    str2 = "audio/vnd.dts.hd";
                                } else if (iM74918 == 1685353317) {
                                    str2 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (iM74918 == 1685353336) {
                                    str2 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iM74918 == 1935764850) {
                                    str2 = "audio/3gpp";
                                } else if (iM74918 == 1935767394) {
                                    str2 = "audio/amr-wb";
                                } else if (iM74918 != 1936684916) {
                                    if (iM74918 == 1953984371) {
                                        i10 = 268435456;
                                    } else if (iM74918 == 1819304813) {
                                        if (i10 == -1) {
                                            i10 = 2;
                                        }
                                    } else if (iM74918 == 778924082 || iM74918 == 778924083) {
                                        str2 = "audio/mpeg";
                                    } else if (iM74918 == 1835557169) {
                                        str2 = "audio/mha1";
                                    } else if (iM74918 == 1835560241) {
                                        str2 = "audio/mhm1";
                                    } else if (iM74918 == 1634492771) {
                                        str2 = "audio/alac";
                                    } else if (iM74918 == 1634492791) {
                                        str2 = "audio/g711-alaw";
                                    } else if (iM74918 == 1970037111) {
                                        str2 = "audio/g711-mlaw";
                                    } else if (iM74918 == 1332770163) {
                                        str2 = "audio/opus";
                                    } else if (iM74918 == 1716281667) {
                                        str2 = "audio/flac";
                                    } else if (iM74918 == 1835823201) {
                                        str2 = "audio/true-hd";
                                    } else {
                                        str2 = iM74918 == 1767992678 ? "audio/iamf" : null;
                                    }
                                    str2 = "audio/raw";
                                } else {
                                    i10 = 2;
                                    str2 = "audio/raw";
                                }
                                C21852 c21852M46235 = null;
                                C23264 c23264 = null;
                                int i36 = iM7504;
                                String str12 = null;
                                int iIntValue2 = iM75110;
                                int i37 = i10;
                                List listOf3 = null;
                                int i38 = i35;
                                while (i36 - iM7503 < iM74917) {
                                    c2464.m7510(i36);
                                    int iM74919 = c2464.m7499();
                                    C19923.m45219(str10, iM74919 > 0);
                                    int iM74920 = c2464.m7499();
                                    int i39 = iM7503;
                                    if (iM74920 == 1835557187) {
                                        c2464.m7510(i36 + 8);
                                        c2464.m7535(1);
                                        int iM7516 = c2464.m7516();
                                        c2464.m7535(1);
                                        str12 = C13638.equals(str2, str11) ? String.format("mhm1.%02X", Integer.valueOf(iM7516)) : String.format("mha1.%02X", Integer.valueOf(iM7516));
                                        int iM75113 = c2464.m7519();
                                        byte[] bArr = new byte[iM75113];
                                        str3 = str11;
                                        c2464.m7507(0, iM75113, bArr);
                                        listOf3 = listOf3 == null ? AbstractC22433.of((Object) bArr) : AbstractC22433.of((Object) bArr, listOf3.get(0));
                                    } else {
                                        str3 = str11;
                                        if (iM74920 == 1835557200) {
                                            c2464.m7510(i36 + 8);
                                            int iM7517 = c2464.m7516();
                                            if (iM7517 > 0) {
                                                byte[] bArr2 = new byte[iM7517];
                                                c2464.m7507(0, iM7517, bArr2);
                                                listOf3 = listOf3 == null ? AbstractC22433.of((Object) bArr2) : AbstractC22433.of(listOf3.get(0), (Object) bArr2);
                                            }
                                        } else if (iM74920 == 1702061171 || (z2 && iM74920 == 2002876005)) {
                                            List list2 = listOf3;
                                            String str13 = str10;
                                            i13 = iM7499;
                                            int i40 = iIntValue2;
                                            int i41 = i38;
                                            if (iM74920 != 1702061171) {
                                                iM7500 = c2464.m7500();
                                                C19923.m45219(null, iM7500 >= i36);
                                                while (true) {
                                                    if (iM7500 - i36 >= iM74919) {
                                                        str4 = str13;
                                                        iM7500 = -1;
                                                        break;
                                                    }
                                                    c2464.m7510(iM7500);
                                                    int iM74921 = c2464.m7499();
                                                    str4 = str13;
                                                    C19923.m45219(str4, iM74921 > 0);
                                                    if (c2464.m7499() == 1702061171) {
                                                        break;
                                                    }
                                                    iM7500 += iM74921;
                                                    str13 = str4;
                                                }
                                            } else {
                                                iM7500 = i36;
                                                str4 = str13;
                                            }
                                            if (iM7500 != -1) {
                                                c21852M46235 = m46235(iM7500, c2464);
                                                str2 = c21852M46235.f70925;
                                                byte[] bArr3 = c21852M46235.f70926;
                                                if (bArr3 == null) {
                                                    i14 = iM74918;
                                                    str10 = str4;
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listOf3 = list2;
                                                } else if ("audio/vorbis".equals(str2)) {
                                                    C2460 c2466 = new C2460(bArr3);
                                                    c2466.m7535(1);
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (c2466.m7503() <= 0) {
                                                            i14 = iM74918;
                                                            break;
                                                        }
                                                        i14 = iM74918;
                                                        if (c2466.m7534() != 255) {
                                                            break;
                                                        }
                                                        i42 += 255;
                                                        c2466.m7535(1);
                                                        iM74918 = i14;
                                                    }
                                                    int iM7518 = c2466.m7516() + i42;
                                                    int i43 = 0;
                                                    while (true) {
                                                        if (c2466.m7503() <= 0) {
                                                            str10 = str4;
                                                            break;
                                                        }
                                                        str10 = str4;
                                                        if (c2466.m7534() != 255) {
                                                            break;
                                                        }
                                                        i43 += 255;
                                                        c2466.m7535(1);
                                                        str4 = str10;
                                                    }
                                                    int iM75114 = c2466.m7516() + i43;
                                                    byte[] bArr4 = new byte[iM7518];
                                                    int iM7505 = c2466.m7500();
                                                    System.arraycopy(bArr3, iM7505, bArr4, 0, iM7518);
                                                    int i44 = iM7505 + iM7518 + iM75114;
                                                    int length = bArr3.length - i44;
                                                    byte[] bArr5 = new byte[length];
                                                    System.arraycopy(bArr3, i44, bArr5, 0, length);
                                                    AbstractC22433 abstractC22433Of3 = AbstractC22433.of((Object) bArr4, (Object) bArr5);
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listOf3 = abstractC22433Of3;
                                                } else {
                                                    i14 = iM74918;
                                                    str10 = str4;
                                                    if ("audio/mp4a-latm".equals(str2)) {
                                                        C17369 c17369M16484 = C6080.m16484(new C11634(bArr3, bArr3.length), false);
                                                        i15 = c17369M16484.f55267;
                                                        iIntValue2 = c17369M16484.f55266;
                                                        str12 = c17369M16484.f55268;
                                                    } else {
                                                        iIntValue2 = i40;
                                                        i15 = i41;
                                                    }
                                                    listOf3 = AbstractC22433.of((Object) bArr3);
                                                }
                                            } else {
                                                i14 = iM74918;
                                                str10 = str4;
                                                iIntValue2 = i40;
                                                i15 = i41;
                                                listOf3 = list2;
                                            }
                                        } else {
                                            if (iM74920 == 1651798644) {
                                                c2464.m7510(i36 + 8);
                                                c2464.m7535(4);
                                                i16 = iIntValue2;
                                                c23264 = new C23264(c2464.m7532(), c2464.m7532());
                                                list = listOf3;
                                            } else {
                                                listOf = listOf3;
                                                i16 = iIntValue2;
                                                if (iM74920 == 1684103987) {
                                                    c2464.m7510(i36 + 8);
                                                    c9154.f31105 = C23720.m52240(c2464, Integer.toString(i34), str9, c8355);
                                                } else if (iM74920 == 1684366131) {
                                                    c2464.m7510(i36 + 8);
                                                    c9154.f31105 = C23720.m52242(c2464, Integer.toString(i34), str9, c8355);
                                                } else if (iM74920 == 1684103988) {
                                                    c2464.m7510(i36 + 8);
                                                    c9154.f31105 = C9609.m24510(c2464, Integer.toString(i34), str9, c8355);
                                                } else if (iM74920 == 1684892784) {
                                                    if (iM7499 <= 0) {
                                                        throw C22861.m50610("Invalid sample rate for Dolby TrueHD MLP stream: " + iM7499, (Throwable) null);
                                                    }
                                                    iIntValue2 = 2;
                                                    i38 = iM7499;
                                                    list = listOf;
                                                    listOf = list;
                                                    str10 = str10;
                                                    i13 = iM7499;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listOf3 = listOf;
                                                    i14 = iM74918;
                                                } else if (iM74920 == 1684305011 || iM74920 == 1969517683) {
                                                    str10 = str10;
                                                    i13 = iM7499;
                                                    C10471 c10471 = new C10471();
                                                    c10471.m26523(i34);
                                                    c10471.m26533(str2);
                                                    i17 = i16;
                                                    c10471.m26494(i17);
                                                    i18 = i38;
                                                    c10471.m26511(i18);
                                                    c10471.m26506(c8355);
                                                    c10471.m26509(str9);
                                                    c9154.f31105 = c10471.m26497();
                                                    iIntValue2 = i17;
                                                    i38 = i18;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listOf3 = listOf;
                                                    i14 = iM74918;
                                                } else {
                                                    if (iM74920 == 1682927731) {
                                                        int i45 = iM74919 - 8;
                                                        byte[] bArr6 = f66271;
                                                        byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i45);
                                                        c2464.m7510(i36 + 8);
                                                        c2464.m7507(bArr6.length, i45, bArrCopyOf);
                                                        listOf2 = C17874.m41462(bArrCopyOf);
                                                    } else if (iM74920 == 1684425825) {
                                                        byte[] bArr7 = new byte[iM74919 - 8];
                                                        bArr7[0] = 102;
                                                        bArr7[1] = 76;
                                                        bArr7[2] = 97;
                                                        bArr7[3] = 67;
                                                        c2464.m7510(i36 + 12);
                                                        c2464.m7507(4, iM74919 - 12, bArr7);
                                                        listOf2 = AbstractC22433.of((Object) bArr7);
                                                    } else if (iM74920 == 1634492771) {
                                                        int i46 = iM74919 - 12;
                                                        byte[] bArr8 = new byte[i46];
                                                        c2464.m7510(i36 + 12);
                                                        c2464.m7507(0, i46, bArr8);
                                                        int i47 = C2419.f9699;
                                                        C2460 c2467 = new C2460(bArr8);
                                                        c2467.m7510(9);
                                                        int iM75115 = c2467.m7516();
                                                        c2467.m7510(20);
                                                        Pair pairCreate2 = Pair.create(Integer.valueOf(c2467.m7531()), Integer.valueOf(iM75115));
                                                        int iIntValue3 = ((Integer) pairCreate2.first).intValue();
                                                        i14 = iM74918;
                                                        iIntValue2 = ((Integer) pairCreate2.second).intValue();
                                                        str10 = str10;
                                                        i13 = iM7499;
                                                        listOf3 = AbstractC22433.of((Object) bArr8);
                                                        i15 = iIntValue3;
                                                    } else {
                                                        if (iM74920 == 1767990114) {
                                                            c2464.m7510(i36 + 9);
                                                            int iM7498 = c2464.m7498();
                                                            byte[] bArr9 = new byte[iM7498];
                                                            c2464.m7507(0, iM7498, bArr9);
                                                            int i48 = C2419.f9699;
                                                            C2460 c2468 = new C2460(bArr9);
                                                            while ((c2468.m7516() & 128) != 0) {
                                                            }
                                                            c2468.m7535(4);
                                                            int iM75116 = c2468.m7516();
                                                            int iM75117 = c2468.m7516();
                                                            c2468.m7535(1);
                                                            while ((c2468.m7516() & 128) != 0) {
                                                            }
                                                            while ((c2468.m7516() & 128) != 0) {
                                                            }
                                                            i13 = iM7499;
                                                            String strM7505 = c2468.m7505(4, StandardCharsets.UTF_8);
                                                            if (strM7505.equals("mp4a")) {
                                                                while ((c2468.m7516() & 128) != 0) {
                                                                }
                                                                c2468.m7535(2);
                                                                C11634 c11634 = new C11634();
                                                                c11634.m29033(c2468);
                                                                int iM29039 = c11634.m29039(5);
                                                                if (iM29039 == 31) {
                                                                    iM29039 = c11634.m29039(6) + 32;
                                                                }
                                                                strM7505 = strM7505 + ".40." + iM29039;
                                                            }
                                                            Object[] objArr = {Integer.valueOf(iM75116), Integer.valueOf(iM75117), strM7505};
                                                            String str14 = C17983.f57504;
                                                            str12 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
                                                            listOf = AbstractC22433.of((Object) bArr9);
                                                            i19 = i37;
                                                        } else {
                                                            str10 = str10;
                                                            i13 = iM7499;
                                                            if (iM74920 == 1885564227) {
                                                                c2464.m7510(i36 + 12);
                                                                ByteOrder byteOrder = (c2464.m7516() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                                int iM75118 = c2464.m7516();
                                                                if (iM74918 == 1768973165) {
                                                                    int iM41816 = C17983.m41816(iM75118, byteOrder);
                                                                    i20 = -1;
                                                                    i19 = iM41816;
                                                                } else {
                                                                    i19 = (iM74918 == 1718641517 && iM75118 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i37;
                                                                    i20 = -1;
                                                                }
                                                                if (i19 != i20) {
                                                                    str2 = "audio/raw";
                                                                }
                                                            }
                                                            i18 = i38;
                                                            i17 = i16;
                                                            iIntValue2 = i17;
                                                            i38 = i18;
                                                            i19 = i37;
                                                            i37 = i19;
                                                            i15 = i38;
                                                            listOf3 = listOf;
                                                            i14 = iM74918;
                                                        }
                                                        iIntValue2 = i16;
                                                        i37 = i19;
                                                        i15 = i38;
                                                        listOf3 = listOf;
                                                        i14 = iM74918;
                                                    }
                                                    list = listOf2;
                                                }
                                                str10 = str10;
                                                i13 = iM7499;
                                                i18 = i38;
                                                i17 = i16;
                                                iIntValue2 = i17;
                                                i38 = i18;
                                                i19 = i37;
                                                i37 = i19;
                                                i15 = i38;
                                                listOf3 = listOf;
                                                i14 = iM74918;
                                            }
                                            iIntValue2 = i16;
                                            listOf = list;
                                            str10 = str10;
                                            i13 = iM7499;
                                            i19 = i37;
                                            i37 = i19;
                                            i15 = i38;
                                            listOf3 = listOf;
                                            i14 = iM74918;
                                        }
                                        i36 += iM74919;
                                        iM74918 = i14;
                                        iM74917 = iM74917;
                                        str11 = str3;
                                        iM7499 = i13;
                                        str10 = str10;
                                        i38 = i15;
                                        iM7503 = i39;
                                    }
                                    str10 = str10;
                                    i13 = iM7499;
                                    i15 = i38;
                                    i14 = iM74918;
                                    i36 += iM74919;
                                    iM74918 = i14;
                                    iM74917 = iM74917;
                                    str11 = str3;
                                    iM7499 = i13;
                                    str10 = str10;
                                    i38 = i15;
                                    iM7503 = i39;
                                }
                                i11 = iM74917;
                                i12 = iM7503;
                                List list3 = listOf3;
                                int i49 = iIntValue2;
                                int i50 = i38;
                                if (c9154.f31105 == null && str2 != null) {
                                    C10471 c10472 = new C10471();
                                    c10472.m26523(i34);
                                    c10472.m26533(str2);
                                    c10472.m26502(str12);
                                    c10472.m26494(i49);
                                    c10472.m26511(i50);
                                    c10472.m26512(i37);
                                    c10472.m26503(list3);
                                    c10472.m26506(c8355);
                                    c10472.m26509(str9);
                                    if (c21852M46235 != null) {
                                        c10472.m26515(C17039.m39822(c21852M46235.f70924));
                                        c10472.m26528(C17039.m39822(c21852M46235.f70923));
                                    } else if (c23264 != null) {
                                        c10472.m26515(C17039.m39822(c23264.f75486));
                                        c10472.m26528(C17039.m39822(c23264.f75487));
                                    }
                                    c9154.f31105 = c10472.m26497();
                                }
                                c9153 = c9154;
                                c2460 = c2464;
                                i8 = i9;
                                i7 = i12;
                                i6 = i11;
                            } else {
                                if (iM74918 == 1414810956 || iM74918 == 1954034535 || iM74918 == 2004251764 || iM74918 == 1937010800 || iM74918 == 1664495672 || iM74918 == 1836070003) {
                                    c2464.m7510(iM7503 + 16);
                                    String str15 = "application/ttml+xml";
                                    long j9 = C17492.FOREVER_NS;
                                    if (iM74918 != 1414810956) {
                                        if (iM74918 == 1954034535) {
                                            int i51 = iM74917 - 16;
                                            byte[] bArr10 = new byte[i51];
                                            c2464.m7507(0, i51, bArr10);
                                            abstractC22433Of2 = AbstractC22433.of((Object) bArr10);
                                            str6 = "application/x-quicktime-tx3g";
                                            c19030 = c19031;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c10225 = c10227;
                                        } else {
                                            if (iM74918 == 2004251764) {
                                                str15 = "application/x-mp4-vtt";
                                            } else if (iM74918 == 1937010800) {
                                                j9 = 0;
                                            } else if (iM74918 == 1664495672) {
                                                c9154.f31104 = 1;
                                                str15 = "application/x-mp4-cea-608";
                                            } else {
                                                if (iM74918 != 1836070003) {
                                                    throw new IllegalStateException();
                                                }
                                                int iM7506 = c2464.m7500();
                                                c2464.m7535(4);
                                                if (c2464.m7499() == 1702061171) {
                                                    C21852 c21852M46236 = m46235(iM7506, c2464);
                                                    if (c21852M46236.f70926 != null && c21852M46236.f70926.length == 64) {
                                                        byte[] bArr11 = c21852M46236.f70926;
                                                        int i52 = c21146.f68875;
                                                        int i53 = c21146.f68873;
                                                        C2023.m6510(bArr11.length == 64);
                                                        ArrayList arrayList7 = new ArrayList(16);
                                                        int i54 = 0;
                                                        while (i54 < bArr11.length - 3) {
                                                            ArrayList arrayList8 = arrayList6;
                                                            C19030 c19033 = c19031;
                                                            int iM39816 = C17039.m39816(bArr11[i54], bArr11[i54 + 1], bArr11[i54 + 2], bArr11[i54 + 3]);
                                                            int i55 = (iM39816 >> 16) & 255;
                                                            int i56 = ((iM39816 >> 8) & 255) + a.g;
                                                            byte[] bArr12 = bArr11;
                                                            int iM3428 = C0833.m3428(i56, 14075, 10000, i55);
                                                            int i57 = (iM39816 & 255) + a.g;
                                                            arrayList7.add(String.format("%06x", Integer.valueOf(C17983.m41813(C0833.m3428(i57, 17790, 10000, i55), 0, 255) | (C17983.m41813(iM3428, 0, 255) << 16) | (C17983.m41813((i55 - ((i57 * 3455) / 10000)) - ((i56 * 7169) / 10000), 0, 255) << 8))));
                                                            i54 += 4;
                                                            bArr11 = bArr12;
                                                            c19031 = c19033;
                                                            i29 = i29;
                                                            arrayList6 = arrayList8;
                                                            c10227 = c10227;
                                                        }
                                                        c19030 = c19031;
                                                        i9 = i29;
                                                        arrayList3 = arrayList6;
                                                        c10225 = c10227;
                                                        StringBuilder sbM2791 = C0589.m2791("size: ", i52, "x", "\npalette: ", i53);
                                                        sbM2791.append(C13366.m32865(", ").m32867((Iterable) arrayList7));
                                                        sbM2791.append("\n");
                                                        String string = sbM2791.toString();
                                                        String str16 = C17983.f57504;
                                                        abstractC22433Of = AbstractC22433.of((Object) string.getBytes(StandardCharsets.UTF_8));
                                                        str5 = "application/vobsub";
                                                    }
                                                } else {
                                                    c19030 = c19031;
                                                    i9 = i29;
                                                    arrayList3 = arrayList6;
                                                    c10225 = c10227;
                                                    abstractC22433Of = null;
                                                    str5 = null;
                                                }
                                                str6 = str5;
                                                abstractC22433Of2 = abstractC22433Of;
                                            }
                                            abstractC22433 = null;
                                            c19030 = c19031;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c10225 = c10227;
                                            j4 = j9;
                                        }
                                        j4 = Long.MAX_VALUE;
                                        String str17 = str6;
                                        abstractC22433 = abstractC22433Of2;
                                        str15 = str17;
                                    } else {
                                        abstractC22433 = null;
                                        c19030 = c19031;
                                        i9 = i29;
                                        arrayList3 = arrayList6;
                                        i21 = i21;
                                        c10225 = c10227;
                                        j4 = j9;
                                    }
                                    if (str15 != null) {
                                        C10471 c10473 = new C10471();
                                        c10473.m26523(c21146.f68870);
                                        c10473.m26533(str15);
                                        c10473.m26509(str9);
                                        c10473.m26500(j4);
                                        c10473.m26503((List) abstractC22433);
                                        c9154.f31105 = c10473.m26497();
                                    }
                                } else if (iM74918 == 1835365492) {
                                    int i58 = c21146.f68870;
                                    c2464.m7510(iM7503 + 16);
                                    if (iM74918 == 1835365492) {
                                        c2464.m7514();
                                        String strM7514 = c2464.m7514();
                                        if (strM7514 != null) {
                                            C10471 c10474 = new C10471();
                                            c10474.m26523(i58);
                                            c10474.m26533(strM7514);
                                            c9154.f31105 = c10474.m26497();
                                        }
                                    }
                                } else if (iM74918 == 1667329389) {
                                    C10471 c10475 = new C10471();
                                    c10475.m26523(c21146.f68870);
                                    c10475.m26533("application/x-camera-motion");
                                    c9154.f31105 = c10475.m26497();
                                }
                                c19030 = c19031;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c10225 = c10227;
                            }
                            i11 = iM74917;
                            i12 = iM7503;
                            c9153 = c9154;
                            c2460 = c2464;
                            i8 = i9;
                            i7 = i12;
                            i6 = i11;
                        }
                        c2460.m7510(i7 + i6);
                        i29 = i8 + 1;
                        c8354 = c8354;
                        c9154 = c9153;
                        c2464 = c2460;
                        str9 = str9;
                        iM74916 = i32;
                        i = i33;
                        c19031 = c19030;
                        j3 = j3;
                        arrayList5 = arrayList5;
                        i21 = i21;
                        arrayList6 = arrayList3;
                        c10227 = c10225;
                    }
                }
                C22453 c22455 = (C22453) interfaceC11955.apply(c22453);
                if (c22455 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C10223 c10223M260010 = c10224.m26006(i5);
                    c10223M260010.getClass();
                    C10223 c10223M260011 = c10223M260010.m26006(1835626086);
                    c10223M260011.getClass();
                    C10223 c10223M260012 = c10223M260011.m26006(1937007212);
                    c10223M260012.getClass();
                    C4107 c4107M46234 = m46234(c22455, c10223M260012, c2988);
                    arrayList4 = arrayList2;
                    arrayList4.add(c4107M46234);
                }
            }
            i21 = i4 + 1;
            c10226 = c10223;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0987 m46232(C7400 c7400) {
        int iM7513;
        C2460 c2460 = c7400.f24593;
        c2460.m7510(8);
        C0987 c0987 = new C0987(new InterfaceC22155[0]);
        while (c2460.m7503() >= 8) {
            int iM7500 = c2460.m7500();
            int iM7499 = c2460.m7499();
            int iM74910 = c2460.m7499();
            C0987 c0988 = null;
            if (iM74910 == 1835365473) {
                c2460.m7510(iM7500);
                int i = iM7500 + iM7499;
                c2460.m7535(8);
                m46236(c2460);
                while (c2460.m7500() < i) {
                    int iM7501 = c2460.m7500();
                    int iM74911 = c2460.m7499();
                    if (c2460.m7499() == 1768715124) {
                        c2460.m7510(iM7501);
                        int i2 = iM7501 + iM74911;
                        c2460.m7535(8);
                        ArrayList arrayList = new ArrayList();
                        while (c2460.m7500() < i2) {
                            AbstractC22370 abstractC22370M28237 = C11269.m28237(c2460);
                            if (abstractC22370M28237 != null) {
                                arrayList.add(abstractC22370M28237);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c0988 = new C0987(arrayList);
                            break;
                        }
                        break;
                    }
                    c2460.m7510(iM7501 + iM74911);
                }
                c0987 = c0987.m3791(c0988);
            } else if (iM74910 == 1936553057) {
                c2460.m7510(iM7500);
                int i3 = iM7500 + iM7499;
                c2460.m7535(12);
                while (c2460.m7500() < i3) {
                    int iM7502 = c2460.m7500();
                    int iM74912 = c2460.m7499();
                    if (c2460.m7499() == 1935766900) {
                        if (iM74912 < 16) {
                            break;
                        }
                        c2460.m7535(4);
                        int i4 = -1;
                        int i5 = 0;
                        for (int i6 = 0; i6 < 2; i6++) {
                            int iM7516 = c2460.m7516();
                            int iM7517 = c2460.m7516();
                            if (iM7516 == 0) {
                                i4 = iM7517;
                            } else if (iM7516 == 1) {
                                i5 = iM7517;
                            }
                        }
                        if (i4 == 12) {
                            iM7513 = 240;
                        } else if (i4 == 13) {
                            iM7513 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else if (i4 == 21 && c2460.m7503() >= 8 && c2460.m7500() + 8 <= i3) {
                            int iM74913 = c2460.m7499();
                            int iM74914 = c2460.m7499();
                            if (iM74913 < 12 || iM74914 != 1936877170) {
                                iM7513 = SecP160R1Field.PInv;
                            } else {
                                iM7513 = c2460.m7513();
                            }
                        } else {
                            iM7513 = SecP160R1Field.PInv;
                        }
                        if (iM7513 == -2147483647) {
                            break;
                        }
                        c0988 = new C0987(new C8259(iM7513, i5));
                        break;
                    }
                    c2460.m7510(iM7502 + iM74912);
                }
                c0987 = c0987.m3791(c0988);
            } else if (iM74910 == -1451722374) {
                short sM7530 = c2460.m7530();
                c2460.m7535(2);
                String strM7505 = c2460.m7505(sM7530, StandardCharsets.UTF_8);
                int iMax = Math.max(strM7505.lastIndexOf(43), strM7505.lastIndexOf(45));
                try {
                    c0988 = new C0987(new C15868(Float.parseFloat(strM7505.substring(0, iMax)), Float.parseFloat(strM7505.substring(iMax, strM7505.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                c0987 = c0987.m3791(c0988);
            }
            c2460.m7510(iM7500 + iM7499);
        }
        return c0987;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C20101 m46238(C2460 c2460) {
        long jM7529;
        long jM75210;
        c2460.m7510(8);
        if (m46229(c2460.m7499()) == 0) {
            jM7529 = c2460.m7532();
            jM75210 = c2460.m7532();
        } else {
            jM7529 = c2460.m7529();
            jM75210 = c2460.m7529();
        }
        return new C20101(jM7529, jM75210, c2460.m7532());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0987 m46233(C10223 c10223) {
        C19395 c19395;
        C7400 c7400M26005 = c10223.m26005(1751411826);
        C7400 c7400M26006 = c10223.m26005(1801812339);
        C7400 c7400M26007 = c10223.m26005(1768715124);
        if (c7400M26005 != null && c7400M26006 != null && c7400M26007 != null) {
            C2460 c2460 = c7400M26005.f24593;
            c2460.m7510(16);
            if (c2460.m7499() == 1835299937) {
                C2460 c2461 = c7400M26006.f24593;
                c2461.m7510(12);
                int iM7499 = c2461.m7499();
                String[] strArr = new String[iM7499];
                for (int i = 0; i < iM7499; i++) {
                    int iM74910 = c2461.m7499();
                    c2461.m7535(4);
                    strArr[i] = c2461.m7505(iM74910 - 8, StandardCharsets.UTF_8);
                }
                C2460 c2462 = c7400M26007.f24593;
                c2462.m7510(8);
                ArrayList arrayList = new ArrayList();
                while (c2462.m7503() > 8) {
                    int iM7500 = c2462.m7500();
                    int iM74911 = c2462.m7499();
                    int iM74912 = c2462.m7499() - 1;
                    if (iM74912 < 0 || iM74912 >= iM7499) {
                        C7309.m19506(iM74912, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[iM74912];
                        int i2 = iM7500 + iM74911;
                        while (true) {
                            int iM7501 = c2462.m7500();
                            if (iM7501 >= i2) {
                                c19395 = null;
                                break;
                            }
                            int iM74913 = c2462.m7499();
                            if (c2462.m7499() == 1684108385) {
                                int iM74914 = c2462.m7499();
                                int iM74915 = c2462.m7499();
                                int i3 = iM74913 - 16;
                                byte[] bArr = new byte[i3];
                                c2462.m7507(0, i3, bArr);
                                c19395 = new C19395(iM74915, iM74914, str, bArr);
                                break;
                            }
                            c2462.m7510(iM7501 + iM74913);
                        }
                        if (c19395 != null) {
                            arrayList.add(c19395);
                        }
                    }
                    c2462.m7510(iM7500 + iM74911);
                }
                if (!arrayList.isEmpty()) {
                    return new C0987(arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46236(C2460 c2460) {
        int iM7500 = c2460.m7500();
        c2460.m7535(4);
        if (c2460.m7499() != 1751411826) {
            iM7500 += 4;
        }
        c2460.m7510(iM7500);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ac A[DONT_INVERT, LOOP:14: B:102:0x02ac->B:106:0x02b6, LOOP_START, PHI: r20
      0x02ac: PHI (r20v3 int) = (r20v2 int), (r20v4 int) binds: [B:101:0x02aa, B:106:0x02b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b6 A[LOOP:14: B:102:0x02ac->B:106:0x02b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02bc A[EDGE_INSN: B:107:0x02bc->B:108:0x02bd BREAK  A[LOOP:14: B:102:0x02ac->B:106:0x02b6]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x0301  */
    /* JADX WARN: Code duplicated, block: B:121:0x0304  */
    /* JADX WARN: Code duplicated, block: B:126:0x0322  */
    /* JADX WARN: Code duplicated, block: B:131:0x0348  */
    /* JADX WARN: Code duplicated, block: B:134:0x036c  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f  */
    /* JADX WARN: Code duplicated, block: B:162:0x042f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0438  */
    /* JADX WARN: Code duplicated, block: B:167:0x0440  */
    /* JADX WARN: Code duplicated, block: B:170:0x0449 A[LOOP:4: B:168:0x0446->B:170:0x0449, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x047b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0480  */
    /* JADX WARN: Code duplicated, block: B:177:0x0482  */
    /* JADX WARN: Code duplicated, block: B:181:0x0493  */
    /* JADX WARN: Code duplicated, block: B:183:0x049c  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:204:0x0500 A[LOOP:8: B:200:0x04f1->B:204:0x0500, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x050d  */
    /* JADX WARN: Code duplicated, block: B:208:0x050f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0516  */
    /* JADX WARN: Code duplicated, block: B:214:0x0533  */
    /* JADX WARN: Code duplicated, block: B:215:0x0535  */
    /* JADX WARN: Code duplicated, block: B:218:0x053a  */
    /* JADX WARN: Code duplicated, block: B:219:0x053d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0540  */
    /* JADX WARN: Code duplicated, block: B:222:0x0543  */
    /* JADX WARN: Code duplicated, block: B:224:0x0546  */
    /* JADX WARN: Code duplicated, block: B:226:0x054a  */
    /* JADX WARN: Code duplicated, block: B:227:0x054d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0561  */
    /* JADX WARN: Code duplicated, block: B:233:0x056b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0579  */
    /* JADX WARN: Code duplicated, block: B:237:0x0584  */
    /* JADX WARN: Code duplicated, block: B:239:0x05af  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:250:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:267:0x0503 A[EDGE_INSN: B:267:0x0503->B:205:0x0503 BREAK  A[LOOP:8: B:200:0x04f1->B:204:0x0500], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0503 A[EDGE_INSN: B:268:0x0503->B:205:0x0503 BREAK  A[LOOP:8: B:200:0x04f1->B:204:0x0500], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x01fe A[EDGE_INSN: B:279:0x01fe->B:73:0x01fe BREAK  A[LOOP:12: B:69:0x01e1->B:72:0x01e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01df  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9 A[LOOP:12: B:69:0x01e1->B:72:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0228 A[ADDED_TO_REGION, LOOP:13: B:77:0x0228->B:79:0x022c, LOOP_START, PHI: r20 r29 r31
      0x0228: PHI (r20v6 int) = (r20v2 int), (r20v7 int) binds: [B:76:0x0226, B:79:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r29v3 int) = (r29v1 int), (r29v5 int) binds: [B:76:0x0226, B:79:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r31v4 int) = (r31v1 int), (r31v5 int) binds: [B:76:0x0226, B:79:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x024b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Code duplicated, block: B:87:0x0255  */
    /* JADX WARN: Code duplicated, block: B:90:0x025a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0260  */
    /* JADX WARN: Code duplicated, block: B:95:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0280  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4107 m46234(C22453 c22453, C10223 c10223, C2988 c2988) throws C22861 {
        InterfaceC8447 c7741;
        boolean z;
        int iM7531;
        int iM7532;
        int iM7533;
        int iMo20390;
        int i;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int iM7534;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        int iM7535;
        int i4;
        int iM7499;
        int i5;
        int i6;
        int i7;
        long[] jArrCopyOf;
        int i8;
        long[] jArrCopyOf2;
        int[] iArrCopyOf;
        int i9;
        int[] iArrCopyOf2;
        long j4;
        boolean z2;
        int i10;
        C22453 c22454;
        String str;
        int i11;
        int[] iArr3;
        long j5;
        boolean zM37110;
        int i12;
        int i13;
        int iMo20388;
        int i14;
        int iM7536;
        int iM74910;
        long j6;
        C22453 c22453M49947;
        long j7;
        C7648 c7648;
        int i15;
        long[] jArr3;
        int i16;
        long jM41830;
        long[] jArr4;
        int i17;
        C7648 c7649;
        int i18;
        int i19;
        boolean z3;
        int[] iArr4;
        int[] iArr5;
        int i20;
        int i21;
        boolean z4;
        int i22;
        int[] iArr6;
        int[] iArr7;
        boolean z5;
        boolean z6;
        long[] jArr5;
        int[] iArr8;
        int[] iArr9;
        long[] jArr6;
        int i23;
        long[] jArr7;
        boolean z7;
        int i24;
        int i25;
        long j8;
        long j9;
        int i26;
        int i27;
        int i28;
        boolean z8;
        boolean z9;
        long jM41831;
        boolean z10;
        int[] iArr10;
        long j10;
        int[] iArr11;
        long j11;
        int i29;
        int i30;
        int i31;
        boolean z11;
        int i32;
        int i33;
        int i34;
        long j12;
        int i35;
        long jM41832;
        C22453 c22453M49948 = c22453;
        C7648 c76410 = c22453M49948.f73295;
        C7400 c7400M26005 = c10223.m26005(1937011578);
        if (c7400M26005 != null) {
            c7741 = new C10564(c7400M26005, c76410);
        } else {
            C7400 c7400M26006 = c10223.m26005(1937013298);
            if (c7400M26006 == null) {
                throw C22861.m50610("Track has no sample table size information", (Throwable) null);
            }
            c7741 = new C7741(c7400M26006);
        }
        int iMo20389 = c7741.mo20389();
        if (iMo20389 == 0) {
            return new C4107(c22453, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (c22453M49948.f73304 == 2) {
            long j13 = c22453M49948.f73294;
            if (j13 > 0) {
                C10471 c10471M20201 = c76410.m20201();
                c10471M20201.m26498(iMo20389 / (j13 / 1000000.0f));
                c22453M49948 = c22453M49948.m49947(c10471M20201.m26497());
            }
        }
        C7648 c76411 = c22453M49948.f73295;
        C7400 c7400M26007 = c10223.m26005(1937007471);
        if (c7400M26007 == null) {
            c7400M26007 = c10223.m26005(1668232756);
            c7400M26007.getClass();
            z = true;
        } else {
            z = false;
        }
        C2460 c2460 = c7400M26007.f24593;
        C7400 c7400M26008 = c10223.m26005(1937011555);
        c7400M26008.getClass();
        C2460 c2461 = c7400M26008.f24593;
        C7400 c7400M26009 = c10223.m26005(1937011827);
        c7400M26009.getClass();
        C2460 c2462 = c7400M26009.f24593;
        C7400 c7400M260010 = c10223.m26005(1937011571);
        C2460 c2463 = c7400M260010 != null ? c7400M260010.f24593 : null;
        C7400 c7400M260011 = c10223.m26005(1668576371);
        C2460 c2464 = c7400M260011 != null ? c7400M260011.f24593 : null;
        C15503 c15503 = new C15503(c2461, c2460, z);
        c2462.m7510(12);
        int iM7537 = c2462.m7531() - 1;
        int iM7538 = c2462.m7531();
        int iM7539 = c2462.m7531();
        if (c2464 != null) {
            c2464.m7510(12);
            iM7531 = c2464.m7531();
        } else {
            iM7531 = 0;
        }
        if (c2463 != null) {
            c2463.m7510(12);
            iM7532 = c2463.m7531();
            if (iM7532 > 0) {
                iM7533 = c2463.m7531() - 1;
            } else {
                c2463 = null;
            }
            iMo20390 = c7741.mo20390();
            i = iM7533;
            String str2 = c76411.f25265;
            if (iMo20390 == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM7537 == 0 && iM7531 == 0 && iM7532 == 0)) {
                int i36 = c15503.f50504;
                long[] jArr8 = new long[i36];
                int[] iArr12 = new int[i36];
                while (c15503.m37110()) {
                    int i37 = c15503.f50508;
                    jArr8[i37] = c15503.f50503;
                    iArr12[i37] = c15503.f50511;
                }
                long j14 = iM7539;
                int i38 = 8192 / iMo20390;
                int iM41812 = 0;
                for (int i39 = 0; i39 < i36; i39++) {
                    iM41812 += C17983.m41812(iArr12[i39], i38);
                }
                long[] jArr9 = new long[iM41812];
                iArrCopyOf2 = new int[iM41812];
                jArrCopyOf2 = new long[iM41812];
                int[] iArr13 = new int[iM41812];
                int i40 = 0;
                i11 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                while (i43 < i36) {
                    int i44 = iArr12[i43];
                    long j15 = jArr8[i43];
                    int i45 = i36;
                    int i46 = i44;
                    int i47 = i41;
                    long[] jArr10 = jArr8;
                    int i48 = i11;
                    int i49 = i47;
                    while (i46 > 0) {
                        int iMin = Math.min(i38, i46);
                        jArr9[i49] = j15;
                        int[] iArr14 = iArr12;
                        int i50 = iMo20390 * iMin;
                        iArrCopyOf2[i49] = i50;
                        i42 += i50;
                        int iMax = Math.max(i48, i50);
                        jArrCopyOf2[i49] = ((long) i40) * j14;
                        iArr13[i49] = 1;
                        j15 += (long) iArrCopyOf2[i49];
                        i40 += iMin;
                        i46 -= iMin;
                        i49++;
                        iArr12 = iArr14;
                        i48 = iMax;
                    }
                    i43++;
                    i36 = i45;
                    int i51 = i49;
                    i11 = i48;
                    jArr8 = jArr10;
                    i41 = i51;
                }
                j5 = i42;
                c22454 = c22453M49948;
                j4 = j14 * ((long) i40);
                jArrCopyOf = jArr9;
                iArr3 = iArr13;
            } else {
                jArr = new long[iMo20389];
                iArr = new int[iMo20389];
                jArr2 = new long[iMo20389];
                iArr2 = new int[iMo20389];
                iM7534 = i;
                C22453 c22455 = c22453M49948;
                i2 = 0;
                i3 = 0;
                j = 0;
                j2 = 0;
                j3 = 0;
                iM7535 = 0;
                i4 = 0;
                iM7499 = 0;
                int i52 = iM7531;
                i5 = iM7539;
                i6 = iM7538;
                i7 = i52;
                while (true) {
                    if (i2 >= iMo20389) {
                        jArrCopyOf = jArr;
                        i8 = i6;
                        jArrCopyOf2 = jArr2;
                        iArrCopyOf = iArr2;
                        i9 = i4;
                        iArrCopyOf2 = iArr;
                        break;
                    }
                    zM37110 = true;
                    while (i4 == 0) {
                        zM37110 = c15503.m37110();
                        if (!zM37110) {
                            break;
                        }
                        int i53 = i6;
                        long j16 = c15503.f50503;
                        i4 = c15503.f50511;
                        j = j16;
                        i5 = i5;
                        iMo20389 = iMo20389;
                        i6 = i53;
                    }
                    i12 = iMo20389;
                    i8 = i6;
                    i13 = i5;
                    if (!zM37110) {
                        C0303.m1848("Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArr, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                        iArrCopyOf = Arrays.copyOf(iArr2, i2);
                        iMo20389 = i2;
                        i9 = i4;
                        break;
                    }
                    if (c2464 != null) {
                        while (iM7535 == 0 && i7 > 0) {
                            iM7535 = c2464.m7531();
                            iM7499 = c2464.m7499();
                            i7--;
                        }
                        iM7535--;
                    }
                    int i54 = iM7499;
                    jArr[i2] = j;
                    iMo20388 = c7741.mo20388();
                    iArr[i2] = iMo20388;
                    long[] jArr11 = jArr;
                    int[] iArr15 = iArr;
                    j3 += (long) iMo20388;
                    if (iMo20388 > i3) {
                        i3 = iMo20388;
                    }
                    jArr2[i2] = j2 + ((long) i54);
                    if (c2463 == null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    iArr2[i2] = i14;
                    if (i2 == iM7534) {
                        iArr2[i2] = 1;
                        iM7532--;
                        if (iM7532 > 0) {
                            c2463.getClass();
                            iM7534 = c2463.m7531() - 1;
                        }
                    }
                    j2 += (long) i13;
                    iM7536 = i8 - 1;
                    if (iM7536 == 0 || iM7537 <= 0) {
                        iM74910 = i13;
                    } else {
                        iM7536 = c2462.m7531();
                        iM74910 = c2462.m7499();
                        iM7537--;
                    }
                    i6 = iM7536;
                    int i55 = iM74910;
                    j += (long) iArr15[i2];
                    i4--;
                    i2++;
                    iM7499 = i54;
                    jArr = jArr11;
                    iArr = iArr15;
                    iMo20389 = i12;
                    i5 = i55;
                }
                j4 = j2 + ((long) iM7499);
                if (c2464 == null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i7 <= 0) {
                        z2 = true;
                        break;
                    }
                    if (c2464.m7531() != 0) {
                        z2 = false;
                        break;
                    }
                    c2464.m7499();
                    i7--;
                }
                if (iM7532 != 0 && i8 == 0 && i9 == 0 && iM7537 == 0) {
                    i10 = iM7535;
                    if (i10 == 0 && z2) {
                        c22454 = c22455;
                    }
                    iMo20389 = iMo20389;
                    i11 = i3;
                    iArr3 = iArrCopyOf;
                    j5 = j3;
                } else {
                    i10 = iM7535;
                }
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                c22454 = c22455;
                C23821.m52500(sb, c22454.f73305, ": remainingSynchronizationSamples ", iM7532, ", remainingSamplesAtTimestampDelta ");
                C23821.m52500(sb, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb.append(iM7537);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i10);
                if (z2) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                sb.append(str);
                C0303.m1848(sb.toString());
                iMo20389 = iMo20389;
                i11 = i3;
                iArr3 = iArrCopyOf;
                j5 = j3;
            }
            j6 = c22454.f73294;
            if (j6 > 0) {
                jM41832 = C17983.m41830(8 * j5, 1000000L, j6, RoundingMode.HALF_DOWN);
                if (jM41832 > 0 || jM41832 >= 2147483647L) {
                    c22453M49947 = c22454;
                } else {
                    C10471 c10471M20202 = c76411.m20201();
                    c10471M20202.m26515((int) jM41832);
                    c22453M49947 = c22454.m49947(c10471M20202.m26497());
                }
            } else {
                c22453M49947 = c22454;
            }
            j7 = c22453M49947.f73303;
            c7648 = c22453M49947.f73295;
            i15 = c22453M49947.f73304;
            jArr3 = c22453M49947.f73300;
            long[] jArr12 = c22453M49947.f73302;
            RoundingMode roundingMode = RoundingMode.DOWN;
            i16 = iMo20389;
            jM41830 = C17983.m41830(j4, 1000000L, j7, roundingMode);
            jArr4 = jArr12;
            if (jArr4 == null) {
                C17983.m41839(jArrCopyOf2, j7);
                return new C4107(c22453M49947, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM41830);
            }
            if (jArr4.length == 1 || i15 != 1 || jArrCopyOf2.length < 2) {
                i17 = i15;
                c7649 = c7648;
            } else {
                jArr3.getClass();
                long j17 = jArr3[0];
                long jM41833 = j17 + C17983.m41830(jArr4[0], c22453M49947.f73303, c22453M49947.f73301, roundingMode);
                int length = jArrCopyOf2.length - 1;
                int iM41813 = C17983.m41813(4, 0, length);
                int iM41814 = C17983.m41813(jArrCopyOf2.length - 4, 0, length);
                long j18 = jArrCopyOf2[0];
                if (j18 <= j17 && j17 < jArrCopyOf2[iM41813] && jArrCopyOf2[iM41814] < jM41833 && jM41833 <= j4) {
                    long j19 = j4 - jM41833;
                    long jM41834 = C17983.m41830(j17 - j18, c7648.f25260, c22453M49947.f73303, roundingMode);
                    i17 = i15;
                    c7649 = c7648;
                    long jM41835 = C17983.m41830(j19, c7648.f25260, c22453M49947.f73303, roundingMode);
                    if ((jM41834 != 0 || jM41835 != 0) && jM41834 <= 2147483647L && jM41835 <= 2147483647L) {
                        c2988.f11217 = (int) jM41834;
                        c2988.f11218 = (int) jM41835;
                        C17983.m41839(jArrCopyOf2, j7);
                        return new C4107(c22453M49947, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C17983.m41830(jArr4[0], 1000000L, c22453M49947.f73301, roundingMode));
                    }
                } else {
                    i17 = i15;
                    c7649 = c7648;
                }
            }
            i18 = 1;
            if (jArr4.length == 1) {
                if (jArr4[0] == 0) {
                    jArr3.getClass();
                    j12 = jArr3[0];
                    for (i35 = 0; i35 < jArrCopyOf2.length; i35++) {
                        jArrCopyOf2[i35] = C17983.m41830(jArrCopyOf2[i35] - j12, 1000000L, c22453M49947.f73303, RoundingMode.DOWN);
                    }
                    return new C4107(c22453M49947, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C17983.m41830(j4 - j12, 1000000L, c22453M49947.f73303, RoundingMode.DOWN));
                }
                i18 = 1;
            }
            i19 = i17;
            if (i19 == i18) {
                z3 = true;
            } else {
                z3 = false;
            }
            iArr4 = new int[jArr4.length];
            iArr5 = new int[jArr4.length];
            jArr3.getClass();
            i20 = 0;
            i21 = 0;
            z4 = false;
            i22 = 0;
            while (i21 < jArr4.length) {
                iArr10 = iArr4;
                j10 = jArr3[i21];
                if (j10 != -1) {
                    boolean z12 = z4;
                    int i56 = i22;
                    iArr11 = iArr5;
                    long jM41836 = C17983.m41830(jArr4[i21], c22453M49947.f73303, c22453M49947.f73301, RoundingMode.DOWN);
                    iArr10[i21] = C17983.m41855(jArrCopyOf2, j10, true);
                    j11 = j10 + jM41836;
                    iArr11[i21] = C17983.m41825(jArrCopyOf2, j11, z3);
                    i29 = iArr10[i21];
                    while (true) {
                        i30 = iArr10[i21];
                        if (i30 < 0 || (iArr3[i30] & 1) != 0) {
                            break;
                        }
                        iArr10[i21] = i30 - 1;
                    }
                    if (i30 < 0) {
                        iArr10[i21] = i29;
                        while (true) {
                            i34 = iArr10[i21];
                            if (i34 >= iArr11[i21] || (iArr3[i34] & 1) != 0) {
                                break;
                            }
                            iArr10[i21] = i34 + 1;
                        }
                    }
                    if (i19 == 2 && iArr10[i21] != iArr11[i21]) {
                        while (true) {
                            i32 = iArr11[i21];
                            if (i32 < jArrCopyOf2.length - 1) {
                                break;
                            }
                            i33 = i32 + 1;
                            if (jArrCopyOf2[i33] <= j11) {
                                break;
                            }
                            iArr11[i21] = i33;
                        }
                    }
                    int i57 = iArr11[i21];
                    i31 = iArr10[i21];
                    int i58 = (i57 - i31) + i56;
                    if (i20 != i31) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i20 = i57;
                    z4 = z11 | z12;
                    i22 = i58;
                } else {
                    iArr11 = iArr5;
                }
                i21++;
                iArr4 = iArr10;
                iArr5 = iArr11;
                jArr4 = jArr4;
            }
            iArr6 = iArr4;
            long[] jArr13 = jArr4;
            iArr7 = iArr5;
            boolean z13 = z4;
            if (i22 != i16) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z13 | z5;
            if (z6) {
                jArr5 = new long[i22];
            } else {
                jArr5 = jArrCopyOf;
            }
            if (z6) {
                iArr8 = new int[i22];
            } else {
                iArr8 = iArrCopyOf2;
            }
            if (z6) {
                i11 = 0;
            }
            if (z6) {
                iArr9 = new int[i22];
            } else {
                iArr9 = iArr3;
            }
            jArr6 = new long[i22];
            i23 = i11;
            z7 = false;
            i24 = 0;
            i25 = 0;
            j8 = 0;
            for (jArr7 = jArr13; i25 < jArr7.length; jArr7 = jArr7) {
                j9 = jArr3[i25];
                i26 = iArr6[i25];
                int[] iArr16 = iArr6;
                i27 = iArr7[i25];
                if (z6) {
                    int i59 = i27 - i26;
                    System.arraycopy(jArrCopyOf, i26, jArr5, i24, i59);
                    System.arraycopy(iArrCopyOf2, i26, iArr8, i24, i59);
                    System.arraycopy(iArr3, i26, iArr9, i24, i59);
                }
                int[] iArr17 = iArr3;
                i28 = i26;
                int i60 = i23;
                z8 = z7;
                while (i28 < i27) {
                    int[] iArr18 = iArr9;
                    z9 = z8;
                    long j20 = c22453M49947.f73301;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jM41837 = C17983.m41830(j8, 1000000L, j20, roundingMode2);
                    long[] jArr14 = jArrCopyOf2;
                    long[] jArr15 = jArrCopyOf;
                    jM41831 = C17983.m41830(jArrCopyOf2[i28] - j9, 1000000L, c22453M49947.f73303, roundingMode2);
                    if (jM41831 < 0) {
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    jArr6[i24] = jM41837 + jM41831;
                    if (!z6 && iArr8[i24] > i60) {
                        i60 = iArrCopyOf2[i28];
                    }
                    i24++;
                    i28++;
                    z8 = z10;
                    iArr9 = iArr18;
                    jArrCopyOf = jArr15;
                    jArrCopyOf2 = jArr14;
                }
                z7 = z8;
                j8 += jArr7[i25];
                i25++;
                iArr6 = iArr16;
                i23 = i60;
                iArr3 = iArr17;
                iArr9 = iArr9;
            }
            int[] iArr19 = iArr9;
            long jM41838 = C17983.m41830(j8, 1000000L, c22453M49947.f73301, RoundingMode.DOWN);
            if (z7) {
                C10471 c10471M20203 = c7649.m20201();
                c10471M20203.m26518();
                c22453M49947 = c22453M49947.m49947(c10471M20203.m26497());
            }
            return new C4107(c22453M49947, jArr5, iArr8, i23, jArr6, iArr19, jM41838);
        }
        iM7532 = 0;
        iM7533 = -1;
        iMo20390 = c7741.mo20390();
        i = iM7533;
        String str3 = c76411.f25265;
        if (iMo20390 == -1) {
            jArr = new long[iMo20389];
            iArr = new int[iMo20389];
            jArr2 = new long[iMo20389];
            iArr2 = new int[iMo20389];
            iM7534 = i;
            C22453 c22456 = c22453M49948;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM7535 = 0;
            i4 = 0;
            iM7499 = 0;
            int i510 = iM7531;
            i5 = iM7539;
            i6 = iM7538;
            i7 = i510;
            while (true) {
                if (i2 >= iMo20389) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM37110 = true;
                while (i4 == 0) {
                    zM37110 = c15503.m37110();
                    if (!zM37110) {
                        break;
                        break;
                    }
                    int i511 = i6;
                    long j110 = c15503.f50503;
                    i4 = c15503.f50511;
                    j = j110;
                    i5 = i5;
                    iMo20389 = iMo20389;
                    i6 = i511;
                }
                i12 = iMo20389;
                i8 = i6;
                i13 = i5;
                if (!zM37110) {
                    C0303.m1848("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo20389 = i2;
                    i9 = i4;
                    break;
                }
                if (c2464 != null) {
                    while (iM7535 == 0) {
                        iM7535 = c2464.m7531();
                        iM7499 = c2464.m7499();
                        i7--;
                    }
                    iM7535--;
                }
                int i512 = iM7499;
                jArr[i2] = j;
                iMo20388 = c7741.mo20388();
                iArr[i2] = iMo20388;
                long[] jArr16 = jArr;
                int[] iArr110 = iArr;
                j3 += (long) iMo20388;
                if (iMo20388 > i3) {
                    i3 = iMo20388;
                }
                jArr2[i2] = j2 + ((long) i512);
                if (c2463 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM7534) {
                    iArr2[i2] = 1;
                    iM7532--;
                    if (iM7532 > 0) {
                        c2463.getClass();
                        iM7534 = c2463.m7531() - 1;
                    }
                }
                j2 += (long) i13;
                iM7536 = i8 - 1;
                if (iM7536 == 0) {
                    iM74910 = i13;
                } else {
                    iM74910 = i13;
                }
                i6 = iM7536;
                int i513 = iM74910;
                j += (long) iArr110[i2];
                i4--;
                i2++;
                iM7499 = i512;
                jArr = jArr16;
                iArr = iArr110;
                iMo20389 = i12;
                i5 = i513;
            }
            j4 = j2 + ((long) iM7499);
            if (c2464 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c2464.m7531() != 0) {
                    z2 = false;
                    break;
                }
                c2464.m7499();
                i7--;
            }
            if (iM7532 != 0) {
                i10 = iM7535;
                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                c22454 = c22456;
                C23821.m52500(sb2, c22454.f73305, ": remainingSynchronizationSamples ", iM7532, ", remainingSamplesAtTimestampDelta ");
                C23821.m52500(sb2, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb2.append(iM7537);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb2.append(str);
                C0303.m1848(sb2.toString());
            } else {
                i10 = iM7535;
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                c22454 = c22456;
                C23821.m52500(sb3, c22454.f73305, ": remainingSynchronizationSamples ", iM7532, ", remainingSamplesAtTimestampDelta ");
                C23821.m52500(sb3, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb3.append(iM7537);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                C0303.m1848(sb3.toString());
            }
            iMo20389 = iMo20389;
            i11 = i3;
            iArr3 = iArrCopyOf;
            j5 = j3;
        } else {
            jArr = new long[iMo20389];
            iArr = new int[iMo20389];
            jArr2 = new long[iMo20389];
            iArr2 = new int[iMo20389];
            iM7534 = i;
            C22453 c22457 = c22453M49948;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM7535 = 0;
            i4 = 0;
            iM7499 = 0;
            int i514 = iM7531;
            i5 = iM7539;
            i6 = iM7538;
            i7 = i514;
            while (true) {
                if (i2 >= iMo20389) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM37110 = true;
                while (i4 == 0) {
                    zM37110 = c15503.m37110();
                    if (!zM37110) {
                        break;
                        break;
                    }
                    int i515 = i6;
                    long j111 = c15503.f50503;
                    i4 = c15503.f50511;
                    j = j111;
                    i5 = i5;
                    iMo20389 = iMo20389;
                    i6 = i515;
                }
                i12 = iMo20389;
                i8 = i6;
                i13 = i5;
                if (!zM37110) {
                    C0303.m1848("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo20389 = i2;
                    i9 = i4;
                    break;
                }
                if (c2464 != null) {
                    while (iM7535 == 0) {
                        iM7535 = c2464.m7531();
                        iM7499 = c2464.m7499();
                        i7--;
                    }
                    iM7535--;
                }
                int i516 = iM7499;
                jArr[i2] = j;
                iMo20388 = c7741.mo20388();
                iArr[i2] = iMo20388;
                long[] jArr17 = jArr;
                int[] iArr111 = iArr;
                j3 += (long) iMo20388;
                if (iMo20388 > i3) {
                    i3 = iMo20388;
                }
                jArr2[i2] = j2 + ((long) i516);
                if (c2463 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM7534) {
                    iArr2[i2] = 1;
                    iM7532--;
                    if (iM7532 > 0) {
                        c2463.getClass();
                        iM7534 = c2463.m7531() - 1;
                    }
                }
                j2 += (long) i13;
                iM7536 = i8 - 1;
                if (iM7536 == 0) {
                    iM74910 = i13;
                } else {
                    iM74910 = i13;
                }
                i6 = iM7536;
                int i517 = iM74910;
                j += (long) iArr111[i2];
                i4--;
                i2++;
                iM7499 = i516;
                jArr = jArr17;
                iArr = iArr111;
                iMo20389 = i12;
                i5 = i517;
            }
            j4 = j2 + ((long) iM7499);
            if (c2464 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c2464.m7531() != 0) {
                    z2 = false;
                    break;
                }
                c2464.m7499();
                i7--;
            }
            if (iM7532 != 0) {
                i10 = iM7535;
                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                c22454 = c22457;
                C23821.m52500(sb4, c22454.f73305, ": remainingSynchronizationSamples ", iM7532, ", remainingSamplesAtTimestampDelta ");
                C23821.m52500(sb4, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb4.append(iM7537);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                C0303.m1848(sb4.toString());
            } else {
                i10 = iM7535;
                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                c22454 = c22457;
                C23821.m52500(sb5, c22454.f73305, ": remainingSynchronizationSamples ", iM7532, ", remainingSamplesAtTimestampDelta ");
                C23821.m52500(sb5, i8, ", remainingSamplesInChunk ", i9, ", remainingTimestampDeltaChanges ");
                sb5.append(iM7537);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb5.append(str);
                C0303.m1848(sb5.toString());
            }
            iMo20389 = iMo20389;
            i11 = i3;
            iArr3 = iArrCopyOf;
            j5 = j3;
        }
        j6 = c22454.f73294;
        if (j6 > 0) {
            jM41832 = C17983.m41830(8 * j5, 1000000L, j6, RoundingMode.HALF_DOWN);
            if (jM41832 > 0) {
                c22453M49947 = c22454;
            } else {
                c22453M49947 = c22454;
            }
        } else {
            c22453M49947 = c22454;
        }
        j7 = c22453M49947.f73303;
        c7648 = c22453M49947.f73295;
        i15 = c22453M49947.f73304;
        jArr3 = c22453M49947.f73300;
        long[] jArr18 = c22453M49947.f73302;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        i16 = iMo20389;
        jM41830 = C17983.m41830(j4, 1000000L, j7, roundingMode3);
        jArr4 = jArr18;
        if (jArr4 == null) {
            C17983.m41839(jArrCopyOf2, j7);
            return new C4107(c22453M49947, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM41830);
        }
        if (jArr4.length == 1) {
            i17 = i15;
            c7649 = c7648;
        } else {
            i17 = i15;
            c7649 = c7648;
        }
        i18 = 1;
        if (jArr4.length == 1) {
            if (jArr4[0] == 0) {
                jArr3.getClass();
                j12 = jArr3[0];
                while (i35 < jArrCopyOf2.length) {
                    jArrCopyOf2[i35] = C17983.m41830(jArrCopyOf2[i35] - j12, 1000000L, c22453M49947.f73303, RoundingMode.DOWN);
                }
                return new C4107(c22453M49947, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, C17983.m41830(j4 - j12, 1000000L, c22453M49947.f73303, RoundingMode.DOWN));
            }
            i18 = 1;
        }
        i19 = i17;
        if (i19 == i18) {
            z3 = true;
        } else {
            z3 = false;
        }
        iArr4 = new int[jArr4.length];
        iArr5 = new int[jArr4.length];
        jArr3.getClass();
        i20 = 0;
        i21 = 0;
        z4 = false;
        i22 = 0;
        while (i21 < jArr4.length) {
            iArr10 = iArr4;
            j10 = jArr3[i21];
            if (j10 != -1) {
                boolean z14 = z4;
                int i518 = i22;
                iArr11 = iArr5;
                long jM41839 = C17983.m41830(jArr4[i21], c22453M49947.f73303, c22453M49947.f73301, RoundingMode.DOWN);
                iArr10[i21] = C17983.m41855(jArrCopyOf2, j10, true);
                j11 = j10 + jM41839;
                iArr11[i21] = C17983.m41825(jArrCopyOf2, j11, z3);
                i29 = iArr10[i21];
                while (true) {
                    i30 = iArr10[i21];
                    if (i30 < 0) {
                        break;
                    }
                    break;
                    break;
                    iArr10[i21] = i30 - 1;
                }
                if (i30 < 0) {
                    iArr10[i21] = i29;
                    while (true) {
                        i34 = iArr10[i21];
                        if (i34 >= iArr11[i21]) {
                            break;
                        }
                        break;
                        break;
                        iArr10[i21] = i34 + 1;
                    }
                }
                if (i19 == 2) {
                    while (true) {
                        i32 = iArr11[i21];
                        if (i32 < jArrCopyOf2.length - 1) {
                            break;
                            break;
                        }
                        i33 = i32 + 1;
                        if (jArrCopyOf2[i33] <= j11) {
                            break;
                            break;
                        }
                        iArr11[i21] = i33;
                    }
                }
                int i519 = iArr11[i21];
                i31 = iArr10[i21];
                int i520 = (i519 - i31) + i518;
                if (i20 != i31) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i20 = i519;
                z4 = z11 | z14;
                i22 = i520;
            } else {
                iArr11 = iArr5;
            }
            i21++;
            iArr4 = iArr10;
            iArr5 = iArr11;
            jArr4 = jArr4;
        }
        iArr6 = iArr4;
        long[] jArr19 = jArr4;
        iArr7 = iArr5;
        boolean z15 = z4;
        if (i22 != i16) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z15 | z5;
        if (z6) {
            jArr5 = new long[i22];
        } else {
            jArr5 = jArrCopyOf;
        }
        if (z6) {
            iArr8 = new int[i22];
        } else {
            iArr8 = iArrCopyOf2;
        }
        if (z6) {
            i11 = 0;
        }
        if (z6) {
            iArr9 = new int[i22];
        } else {
            iArr9 = iArr3;
        }
        jArr6 = new long[i22];
        i23 = i11;
        z7 = false;
        i24 = 0;
        i25 = 0;
        j8 = 0;
        while (i25 < jArr7.length) {
            j9 = jArr3[i25];
            i26 = iArr6[i25];
            int[] iArr112 = iArr6;
            i27 = iArr7[i25];
            if (z6) {
                int i521 = i27 - i26;
                System.arraycopy(jArrCopyOf, i26, jArr5, i24, i521);
                System.arraycopy(iArrCopyOf2, i26, iArr8, i24, i521);
                System.arraycopy(iArr3, i26, iArr9, i24, i521);
            }
            int[] iArr113 = iArr3;
            i28 = i26;
            int i61 = i23;
            z8 = z7;
            while (i28 < i27) {
                int[] iArr114 = iArr9;
                z9 = z8;
                long j21 = c22453M49947.f73301;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jM418310 = C17983.m41830(j8, 1000000L, j21, roundingMode4);
                long[] jArr110 = jArrCopyOf2;
                long[] jArr111 = jArrCopyOf;
                jM41831 = C17983.m41830(jArrCopyOf2[i28] - j9, 1000000L, c22453M49947.f73303, roundingMode4);
                if (jM41831 < 0) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                jArr6[i24] = jM418310 + jM41831;
                if (!z6) {
                }
                i24++;
                i28++;
                z8 = z10;
                iArr9 = iArr114;
                jArrCopyOf = jArr111;
                jArrCopyOf2 = jArr110;
            }
            z7 = z8;
            j8 += jArr7[i25];
            i25++;
            iArr6 = iArr112;
            i23 = i61;
            iArr3 = iArr113;
            iArr9 = iArr9;
        }
        int[] iArr115 = iArr9;
        long jM418311 = C17983.m41830(j8, 1000000L, c22453M49947.f73301, RoundingMode.DOWN);
        if (z7) {
            C10471 c10471M20204 = c7649.m20201();
            c10471M20204.m26518();
            c22453M49947 = c22453M49947.m49947(c10471M20204.m26497());
        }
        return new C4107(c22453M49947, jArr5, iArr8, i23, jArr6, iArr115, jM418311);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0456 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0458  */
    /* JADX WARN: Code duplicated, block: B:204:0x045b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0462  */
    /* JADX WARN: Code duplicated, block: B:208:0x0465  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:278:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:343:0x0739  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46237(C2460 c2460, int i, int i2, int i3, int i4, String str, int i5, C8354 c8354, C9153 c9153, int i6) throws C22861 {
        int i7;
        int i8;
        int i9;
        int i10;
        C3166 c3166;
        String str2;
        ByteBuffer byteBufferOrder;
        float fM7531;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM29039;
        int i19;
        C4119 c4119M32773;
        int i20;
        int iM290310;
        int i21;
        String str3;
        int i22 = i2;
        int i23 = i3;
        C8354 c8354M21875 = c8354;
        C9153 c9154 = c9153;
        c2460.m7510(i22 + 16);
        c2460.m7535(16);
        int iM7519 = c2460.m7519();
        int iM75110 = c2460.m7519();
        c2460.m7535(50);
        int iM7500 = c2460.m7500();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM46230 = m46230(c2460, i22, i23);
            if (pairM46230 != null) {
                iIntValue = ((Integer) pairM46230.first).intValue();
                c8354M21875 = c8354M21875 == null ? null : c8354M21875.m21875(((C1285) pairM46230.second).f5532);
                c9154.f31106[i6] = (C1285) pairM46230.second;
            }
            c2460.m7510(iM7500);
        }
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i24 = -1;
        List listM13309 = null;
        int i25 = -1;
        C23264 c23264 = null;
        C21852 c21852M46235 = null;
        boolean z = false;
        ByteBuffer byteBuffer = null;
        String str5 = null;
        byte[] bArr = null;
        C3166 c3167 = null;
        int i26 = 8;
        int i27 = 8;
        int iM11703 = -1;
        int i28 = -1;
        float f = 1.0f;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        C8354 c8355 = c8354M21875;
        int i32 = -1;
        while (iM7500 - i22 < i23) {
            c2460.m7510(iM7500);
            int iM7501 = c2460.m7500();
            int i33 = iM7500;
            int iM7499 = c2460.m7499();
            if (iM7499 == 0 && c2460.m7500() - i22 == i23) {
                break;
            }
            C19923.m45219("childAtomSize must be positive", iM7499 > 0);
            int iM74910 = c2460.m7499();
            if (iM74910 == 1635148611) {
                C19923.m45219(null, str4 == null);
                c2460.m7510(iM7501 + 8);
                C3257 c3257M9737 = C3257.m9737(c2460);
                ArrayList arrayList = c3257M9737.f12107;
                c9154.f31107 = c3257M9737.f12105;
                float f2 = !z ? c3257M9737.f12111 : f;
                String str6 = c3257M9737.f12106;
                int i34 = c3257M9737.f12102;
                int i35 = c3257M9737.f12104;
                int i36 = c3257M9737.f12101;
                iM11703 = c3257M9737.f12110;
                byteBufferOrder = byteBuffer;
                str5 = str6;
                i30 = i34;
                f = f2;
                i27 = c3257M9737.f12108;
                i26 = c3257M9737.f12103;
                i24 = i35;
                i28 = i36;
                str4 = "video/avc";
                listM13309 = arrayList;
            } else {
                int i37 = i32;
                if (iM74910 == 1752589123) {
                    C19923.m45219(null, str4 == null);
                    c2460.m7510(iM7501 + 8);
                    C13656 c13656M33348 = C13656.m33348(c2460);
                    List list = c13656M33348.f45028;
                    c9154.f31107 = c13656M33348.f45042;
                    float f3 = !z ? c13656M33348.f45039 : f;
                    int i38 = c13656M33348.f45044;
                    int i39 = c13656M33348.f45038;
                    String str7 = c13656M33348.f45035;
                    int i40 = c13656M33348.f45041;
                    if (i40 != -1) {
                        i37 = i40;
                    }
                    int i41 = c13656M33348.f45036;
                    int i42 = c13656M33348.f45026;
                    i24 = c13656M33348.f45030;
                    int i43 = c13656M33348.f45027;
                    int i44 = c13656M33348.f45043;
                    int i45 = c13656M33348.f45037;
                    int i46 = c13656M33348.f45029;
                    C3166 c3168 = c13656M33348.f45033;
                    c9154.f31108 = c13656M33348.f45040;
                    i30 = i38;
                    i31 = i39;
                    str5 = str7;
                    i25 = i41;
                    i27 = i45;
                    i26 = i46;
                    c3167 = c3168;
                    str4 = "video/hevc";
                    f = f3;
                    i28 = i43;
                    listM13309 = list;
                    i32 = i37;
                    i29 = i42;
                    iM11703 = i44;
                    byteBufferOrder = byteBuffer;
                } else {
                    String str8 = "childAtomSize must be positive";
                    if (iM74910 == 1818785347) {
                        C19923.m45219("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                        C19923.m45219("must have at least two layers", c3167 != null && c3167.f11912.size() >= 2);
                        c2460.m7510(iM7501 + 8);
                        c3167.getClass();
                        C13656 c13656M33349 = C13656.m33349(c2460, c3167);
                        C19923.m45219("invalid lhvC parameter sets", (c13656M33349.f45034 || c13656M33349.f45032 || c13656M33349.f45031) ? false : true);
                        C19923.m45219("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c9154.f31107 == c13656M33349.f45042);
                        int i47 = c13656M33349.f45030;
                        if (i47 != -1) {
                            C19923.m45219("colorSpace must be the same for both views", i24 == i47);
                        }
                        int i48 = c13656M33349.f45027;
                        if (i48 != -1) {
                            C19923.m45219("colorRange must be the same for both views", i28 == i48);
                        }
                        int i49 = c13656M33349.f45043;
                        if (i49 != -1) {
                            C19923.m45219("colorTransfer must be the same for both views", iM11703 == i49);
                        }
                        C19923.m45219("bitdepthLuma must be the same for both views", i27 == c13656M33349.f45037);
                        C19923.m45219("bitdepthChroma must be the same for both views", i26 == c13656M33349.f45029);
                        if (listM13309 != null) {
                            int i50 = AbstractC22433.f73217;
                            C4793 c4793 = new C4793();
                            c4793.m52162(listM13309);
                            c4793.m52162(c13656M33349.f45028);
                            listM13309 = c4793.m13309();
                        } else {
                            C19923.m45219("initializationData must be already set from hvcC atom", false);
                        }
                        String str9 = c13656M33349.f45035;
                        c9154.f31108 = false;
                        byteBufferOrder = byteBuffer;
                        str5 = str9;
                        str4 = "video/mv-hevc";
                        i32 = i37;
                    } else {
                        if (iM74910 == 1986361461) {
                            c2460.m7510(iM7501 + 8);
                            int iM7502 = c2460.m7500();
                            C18324 c18324 = null;
                            while (iM7502 - iM7501 < iM7499) {
                                c2460.m7510(iM7502);
                                int iM74911 = c2460.m7499();
                                String str10 = str8;
                                C19923.m45219(str10, iM74911 > 0);
                                int i51 = i26;
                                if (c2460.m7499() == 1702454643) {
                                    c2460.m7510(iM7502 + 8);
                                    int iM7503 = c2460.m7500();
                                    while (true) {
                                        if (iM7503 - iM7502 >= iM74911) {
                                            str3 = str10;
                                            c18324 = null;
                                            break;
                                        }
                                        c2460.m7510(iM7503);
                                        int iM74912 = c2460.m7499();
                                        C19923.m45219(str10, iM74912 > 0);
                                        str3 = str10;
                                        if (c2460.m7499() == 1937011305) {
                                            c2460.m7535(4);
                                            int iM7516 = c2460.m7516();
                                            c18324 = new C18324(new C19736((iM7516 & 1) == 1, (iM7516 & 2) == 2, (iM7516 & 8) == 8));
                                            break;
                                        }
                                        iM7503 += iM74912;
                                        str10 = str3;
                                    }
                                } else {
                                    str3 = str10;
                                }
                                iM7502 += iM74911;
                                i26 = i51;
                                str8 = str3;
                                i27 = i27;
                                i28 = i28;
                            }
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            C16208 c16208 = c18324 == null ? null : new C16208(c18324);
                            if (c16208 == null) {
                                i32 = i37;
                            } else if (c3167 == null || c3167.f11912.size() < 2) {
                                i32 = i37;
                                if (i32 == -1) {
                                    i32 = c16208.f52319.f58461.f63421 ? 5 : 4;
                                }
                            } else {
                                C19923.m45219("both eye views must be marked as available", c16208.m38319());
                                C19923.m45219("for MV-HEVC, eye_views_reversed must be set to false", !c16208.f52319.f58461.f63421);
                                i32 = i37;
                            }
                            byteBufferOrder = byteBuffer;
                            i11 = iIntValue;
                        } else {
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            i32 = i37;
                            if (iM74910 == 1685480259 || iM74910 == 1685485123 || iM74910 == 1685485379) {
                                i10 = i32;
                                c3166 = c3167;
                                int i52 = iM7499 - 8;
                                byte[] bArr2 = new byte[i52];
                                c2460.m7507(0, i52, bArr2);
                                if (listM13309 != null) {
                                    int i53 = AbstractC22433.f73217;
                                    C4793 c4794 = new C4793();
                                    c4794.m52162(listM13309);
                                    c4794.m52163(bArr2);
                                    listM13309 = c4794.m13309();
                                } else {
                                    C19923.m45219("initializationData must already be set from hvcC or avcC atom", false);
                                }
                                c2460.m7510(iM7501 + 8);
                                C8106 c8106M21323 = C8106.m21323(c2460);
                                if (c8106M21323 != null) {
                                    str2 = c8106M21323.f28384;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str2 = str5;
                                }
                                byteBufferOrder = byteBuffer;
                                fM7531 = f;
                            } else {
                                int i54 = 12;
                                if (iM74910 == 1987076931) {
                                    C19923.m45219(null, str4 == null);
                                    int i55 = iIntValue;
                                    String str11 = i55 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c2460.m7510(iM7501 + 12);
                                    byte bM7516 = (byte) c2460.m7516();
                                    byte bM7517 = (byte) c2460.m7516();
                                    int iM7517 = c2460.m7516();
                                    i26 = iM7517 >> 4;
                                    byte b = (byte) ((iM7517 >> 1) & 7);
                                    if (str11.equals("video/x-vnd.on2.vp9")) {
                                        int i56 = C2419.f9699;
                                        listM13309 = AbstractC22433.of((Object) new byte[]{1, 1, bM7516, 2, 1, bM7517, 3, 1, (byte) i26, 4, 1, b});
                                    }
                                    boolean z2 = (iM7517 & 1) != 0;
                                    int iM7518 = c2460.m7516();
                                    int iM75111 = c2460.m7516();
                                    int iM11700 = C4119.m11700(iM7518);
                                    byteBufferOrder = byteBuffer;
                                    str4 = str11;
                                    i28 = z2 ? 1 : 2;
                                    i24 = iM11700;
                                    iM11703 = C4119.m11703(iM75111);
                                    iIntValue = i55;
                                    i27 = i26;
                                } else {
                                    i11 = iIntValue;
                                    if (iM74910 == 1635135811) {
                                        int i57 = iM7499 - 8;
                                        byte[] bArr3 = new byte[i57];
                                        c2460.m7507(0, i57, bArr3);
                                        listM13309 = AbstractC22433.of((Object) bArr3);
                                        c2460.m7510(iM7501 + 8);
                                        C13293 c13293 = new C13293();
                                        byte[] bArrM7518 = c2460.m7518();
                                        C11634 c11634 = new C11634(bArrM7518, bArrM7518.length);
                                        c11634.m29029(c2460.m7500() * 8);
                                        c11634.m29043(1);
                                        int iM290311 = c11634.m29039(3);
                                        c11634.m29034(6);
                                        boolean zM29035 = c11634.m29035();
                                        boolean zM29036 = c11634.m29035();
                                        int i58 = 2;
                                        if (iM290311 != 2) {
                                            if (iM290311 <= i58) {
                                                if (zM29035) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c13293.m32776(i15);
                                                if (zM29035) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c13293.m32774(i16);
                                            }
                                        } else if (zM29035) {
                                            c13293.m32776(zM29036 ? 12 : 10);
                                            c13293.m32774(zM29036 ? 12 : 10);
                                        } else {
                                            i58 = 2;
                                            if (iM290311 <= i58) {
                                                if (zM29035) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c13293.m32776(i15);
                                                if (zM29035) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c13293.m32774(i16);
                                            }
                                        }
                                        c11634.m29034(13);
                                        c11634.m29042();
                                        int iM290312 = c11634.m29039(4);
                                        if (iM290312 != 1) {
                                            C0303.m1851("Unsupported obu_type: " + iM290312);
                                            c4119M32773 = c13293.m32773();
                                        } else if (c11634.m29035()) {
                                            C0303.m1851("Unsupported obu_extension_flag");
                                            c4119M32773 = c13293.m32773();
                                        } else {
                                            boolean zM29037 = c11634.m29035();
                                            c11634.m29042();
                                            if (zM29037 && c11634.m29039(8) > 127) {
                                                C0303.m1851("Excessive obu_size");
                                                c4119M32773 = c13293.m32773();
                                            } else {
                                                int iM290313 = c11634.m29039(3);
                                                c11634.m29042();
                                                if (c11634.m29035()) {
                                                    C0303.m1851("Unsupported reduced_still_picture_header");
                                                    c4119M32773 = c13293.m32773();
                                                } else if (c11634.m29035()) {
                                                    C0303.m1851("Unsupported timing_info_present_flag");
                                                    c4119M32773 = c13293.m32773();
                                                } else if (c11634.m29035()) {
                                                    C0303.m1851("Unsupported initial_display_delay_present_flag");
                                                    c4119M32773 = c13293.m32773();
                                                } else {
                                                    int i59 = 5;
                                                    int iM290314 = c11634.m29039(5);
                                                    int i60 = 0;
                                                    while (i60 <= iM290314) {
                                                        c11634.m29034(i54);
                                                        if (c11634.m29039(i59) > 7) {
                                                            c11634.m29042();
                                                        }
                                                        i60++;
                                                        i59 = 5;
                                                        i54 = 12;
                                                    }
                                                    int iM290315 = c11634.m29039(4);
                                                    int iM290316 = c11634.m29039(4);
                                                    c11634.m29034(iM290315 + 1);
                                                    c11634.m29034(iM290316 + 1);
                                                    if (c11634.m29035()) {
                                                        i17 = 7;
                                                        c11634.m29034(7);
                                                    } else {
                                                        i17 = 7;
                                                    }
                                                    c11634.m29034(i17);
                                                    boolean zM29038 = c11634.m29035();
                                                    if (zM29038) {
                                                        c11634.m29034(2);
                                                    }
                                                    if (c11634.m29035()) {
                                                        i18 = 1;
                                                        iM29039 = 2;
                                                    } else {
                                                        i18 = 1;
                                                        iM29039 = c11634.m29039(1);
                                                    }
                                                    if (iM29039 > 0 && !c11634.m29035()) {
                                                        c11634.m29034(i18);
                                                    }
                                                    if (zM29038) {
                                                        i19 = 3;
                                                        c11634.m29034(3);
                                                    } else {
                                                        i19 = 3;
                                                    }
                                                    c11634.m29034(i19);
                                                    boolean zM29039 = c11634.m29035();
                                                    if (iM290313 == 2 && zM29039) {
                                                        c11634.m29042();
                                                    }
                                                    boolean z3 = iM290313 != 1 && c11634.m29035();
                                                    if (c11634.m29035()) {
                                                        int iM290317 = c11634.m29039(8);
                                                        int iM290318 = c11634.m29039(8);
                                                        int iM290319 = c11634.m29039(8);
                                                        if (z3) {
                                                            i20 = 1;
                                                        } else {
                                                            i20 = 1;
                                                            if (iM290317 == 1 && iM290318 == 13 && iM290319 == 0) {
                                                                iM290310 = 1;
                                                            }
                                                            c13293.m32777(C4119.m11700(iM290317));
                                                            if (iM290310 == i20) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = 2;
                                                            }
                                                            c13293.m32778(i21);
                                                            c13293.m32772(C4119.m11703(iM290318));
                                                        }
                                                        iM290310 = c11634.m29039(i20);
                                                        c13293.m32777(C4119.m11700(iM290317));
                                                        if (iM290310 == i20) {
                                                            i21 = 1;
                                                        } else {
                                                            i21 = 2;
                                                        }
                                                        c13293.m32778(i21);
                                                        c13293.m32772(C4119.m11703(iM290318));
                                                    }
                                                    c4119M32773 = c13293.m32773();
                                                }
                                            }
                                        }
                                        i27 = c4119M32773.f15083;
                                        i26 = c4119M32773.f15085;
                                        i24 = c4119M32773.f15087;
                                        i28 = c4119M32773.f15088;
                                        iM11703 = c4119M32773.f15084;
                                        str4 = "video/av01";
                                        iIntValue = i11;
                                        c3166 = c3167;
                                    } else if (iM74910 == 1668050025) {
                                        byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                        byteBufferOrder.position(21);
                                        byteBufferOrder.putShort(c2460.m7530());
                                        byteBufferOrder.putShort(c2460.m7530());
                                    } else {
                                        if (iM74910 == 1835295606) {
                                            byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            short sM7530 = c2460.m7530();
                                            short sM7531 = c2460.m7530();
                                            short sM7532 = c2460.m7530();
                                            short sM7533 = c2460.m7530();
                                            short sM7534 = c2460.m7530();
                                            short sM7535 = c2460.m7530();
                                            iIntValue = i11;
                                            short sM7536 = c2460.m7530();
                                            c3166 = c3167;
                                            short sM7537 = c2460.m7530();
                                            long jM7532 = c2460.m7532();
                                            long jM7533 = c2460.m7532();
                                            i10 = i32;
                                            byteBufferOrder.position(1);
                                            byteBufferOrder.putShort(sM7534);
                                            byteBufferOrder.putShort(sM7535);
                                            byteBufferOrder.putShort(sM7530);
                                            byteBufferOrder.putShort(sM7531);
                                            byteBufferOrder.putShort(sM7532);
                                            byteBufferOrder.putShort(sM7533);
                                            byteBufferOrder.putShort(sM7536);
                                            byteBufferOrder.putShort(sM7537);
                                            byteBufferOrder.putShort((short) (jM7532 / 10000));
                                            byteBufferOrder.putShort((short) (jM7533 / 10000));
                                        } else {
                                            iIntValue = i11;
                                            i10 = i32;
                                            c3166 = c3167;
                                            if (iM74910 == 1681012275) {
                                                C19923.m45219(null, str4 == null);
                                                str4 = "video/3gpp";
                                            } else {
                                                byte[] bArrCopyOfRange = null;
                                                if (iM74910 == 1702061171) {
                                                    C19923.m45219(null, str4 == null);
                                                    c21852M46235 = m46235(iM7501, c2460);
                                                    str4 = c21852M46235.f70925;
                                                    byte[] bArr4 = c21852M46235.f70926;
                                                    if (bArr4 != null) {
                                                        listM13309 = AbstractC22433.of((Object) bArr4);
                                                    }
                                                } else if (iM74910 == 1651798644) {
                                                    c2460.m7510(iM7501 + 8);
                                                    c2460.m7535(4);
                                                    byteBufferOrder = byteBuffer;
                                                    c23264 = new C23264(c2460.m7532(), c2460.m7532());
                                                } else if (iM74910 == 1885434736) {
                                                    c2460.m7510(iM7501 + 8);
                                                    fM7531 = c2460.m7531() / c2460.m7531();
                                                    z = true;
                                                    byteBufferOrder = byteBuffer;
                                                    str2 = str5;
                                                } else if (iM74910 == 1937126244) {
                                                    int i61 = iM7501 + 8;
                                                    while (i61 - iM7501 < iM7499) {
                                                        c2460.m7510(i61);
                                                        int iM74913 = c2460.m7499();
                                                        if (c2460.m7499() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(c2460.m7518(), i61, iM74913 + i61);
                                                            break;
                                                        }
                                                        i61 += iM74913;
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    bArr = bArrCopyOfRange;
                                                } else if (iM74910 == 1936995172) {
                                                    int iM75112 = c2460.m7516();
                                                    c2460.m7535(3);
                                                    if (iM75112 != 0) {
                                                        i32 = i10;
                                                    } else {
                                                        int iM75113 = c2460.m7516();
                                                        if (iM75113 == 0) {
                                                            i32 = 0;
                                                        } else if (iM75113 == 1) {
                                                            i32 = 1;
                                                        } else if (iM75113 == 2) {
                                                            i32 = 2;
                                                        } else if (iM75113 != 3) {
                                                            i32 = i10;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                    i26 = i7;
                                                    i27 = i8;
                                                    i28 = i9;
                                                } else {
                                                    if (iM74910 == 1634760259) {
                                                        int i62 = iM7499 - 12;
                                                        byte[] bArr5 = new byte[i62];
                                                        c2460.m7510(iM7501 + 12);
                                                        c2460.m7507(0, i62, bArr5);
                                                        listM13309 = AbstractC22433.of((Object) bArr5);
                                                        C2460 c2461 = new C2460(bArr5);
                                                        C13293 c13294 = new C13293();
                                                        byte[] bArrM7519 = c2461.m7518();
                                                        C11634 c11635 = new C11634(bArrM7519, bArrM7519.length);
                                                        c11635.m29029(c2461.m7500() * 8);
                                                        int i63 = 1;
                                                        c11635.m29043(1);
                                                        int iM290320 = c11635.m29039(8);
                                                        int i64 = 0;
                                                        while (i64 < iM290320) {
                                                            c11635.m29043(i63);
                                                            int iM290321 = c11635.m29039(8);
                                                            for (int i65 = 0; i65 < iM290321; i65++) {
                                                                c11635.m29034(6);
                                                                boolean zM290310 = c11635.m29035();
                                                                c11635.m29042();
                                                                c11635.m29043(11);
                                                                c11635.m29034(4);
                                                                int iM290322 = c11635.m29039(4) + 8;
                                                                c13294.m32776(iM290322);
                                                                c13294.m32774(iM290322);
                                                                c11635.m29043(1);
                                                                if (zM290310) {
                                                                    int iM290323 = c11635.m29039(8);
                                                                    int iM290324 = c11635.m29039(8);
                                                                    c11635.m29043(1);
                                                                    boolean zM290311 = c11635.m29035();
                                                                    c13294.m32777(C4119.m11700(iM290323));
                                                                    c13294.m32778(zM290311 ? 1 : 2);
                                                                    c13294.m32772(C4119.m11703(iM290324));
                                                                }
                                                            }
                                                            i64++;
                                                            i63 = 1;
                                                        }
                                                        C4119 c4119M32774 = c13294.m32773();
                                                        i27 = c4119M32774.f15083;
                                                        i26 = c4119M32774.f15085;
                                                        i13 = c4119M32774.f15087;
                                                        i12 = c4119M32774.f15088;
                                                        i14 = c4119M32774.f15084;
                                                        str4 = "video/apv";
                                                    } else if (iM74910 == 1668246642 && i24 == -1 && iM11703 == -1) {
                                                        int iM74914 = c2460.m7499();
                                                        if (iM74914 == 1852009592 || iM74914 == 1852009571) {
                                                            int iM75114 = c2460.m7519();
                                                            int iM75115 = c2460.m7519();
                                                            c2460.m7535(2);
                                                            boolean z4 = iM7499 == 19 && (c2460.m7516() & 128) != 0;
                                                            int iM11701 = C4119.m11700(iM75114);
                                                            i12 = z4 ? 1 : 2;
                                                            int iM11704 = C4119.m11703(iM75115);
                                                            i26 = i7;
                                                            i27 = i8;
                                                            i13 = iM11701;
                                                            i14 = iM11704;
                                                        } else {
                                                            C0303.m1848("Unsupported color type: " + AbstractC20806.m46786(iM74914));
                                                        }
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    iM11703 = i14;
                                                    i24 = i13;
                                                    i28 = i12;
                                                    c3167 = c3166;
                                                    i32 = i10;
                                                }
                                            }
                                            byteBufferOrder = byteBuffer;
                                        }
                                        fM7531 = f;
                                        str2 = str5;
                                    }
                                    byteBufferOrder = byteBuffer;
                                    c3167 = c3166;
                                }
                            }
                            f = fM7531;
                            str5 = str2;
                            c3167 = c3166;
                            i26 = i7;
                            i32 = i10;
                            i27 = i8;
                            i28 = i9;
                        }
                        iIntValue = i11;
                        i26 = i7;
                        i27 = i8;
                        i28 = i9;
                    }
                }
            }
            iM7500 = i33 + iM7499;
            i22 = i2;
            i23 = i3;
            c9154 = c9153;
            byteBuffer = byteBufferOrder;
            iIntValue = iIntValue;
        }
        int i66 = i32;
        int i67 = i26;
        int i68 = i27;
        int i69 = i28;
        if (str4 == null) {
            return;
        }
        C10471 c10471 = new C10471();
        c10471.m26523(i4);
        c10471.m26533(str4);
        c10471.m26502(str5);
        c10471.m26525(iM7519);
        c10471.m26534(iM75110);
        c10471.m26517(i25);
        c10471.m26493(i29);
        c10471.m26519(f);
        c10471.m26514(i5);
        c10471.m26507(bArr);
        c10471.m26524(i66);
        c10471.m26503(listM13309);
        c10471.m26526(i30);
        c10471.m26527(i31);
        c10471.m26506(c8355);
        c10471.m26509(str);
        C13293 c13295 = new C13293();
        c13295.m32777(i24);
        c13295.m32778(i69);
        c13295.m32772(iM11703);
        c13295.m32775(byteBuffer != null ? byteBuffer.array() : null);
        c13295.m32776(i68);
        c13295.m32774(i67);
        c10471.m26505(c13295.m32773());
        if (c23264 != null) {
            c10471.m26515(C17039.m39822(c23264.f75486));
            c10471.m26528(C17039.m39822(c23264.f75487));
        } else if (c21852M46235 != null) {
            c10471.m26515(C17039.m39822(c21852M46235.f70924));
            c10471.m26528(C17039.m39822(c21852M46235.f70923));
        }
        c9153.f31105 = c10471.m26497();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21852 m46235(int i, C2460 c2460) {
        c2460.m7510(i + 12);
        c2460.m7535(1);
        m46239(c2460);
        c2460.m7535(2);
        int iM7516 = c2460.m7516();
        if ((iM7516 & 128) != 0) {
            c2460.m7535(2);
        }
        if ((iM7516 & 64) != 0) {
            c2460.m7535(c2460.m7516());
        }
        if ((iM7516 & 32) != 0) {
            c2460.m7535(2);
        }
        c2460.m7535(1);
        m46239(c2460);
        String strM17978 = C6632.m17978(c2460.m7516());
        if ("audio/mpeg".equals(strM17978) || "audio/vnd.dts".equals(strM17978) || "audio/vnd.dts.hd".equals(strM17978)) {
            return new C21852(-1L, -1L, strM17978, null);
        }
        c2460.m7535(4);
        long jM7532 = c2460.m7532();
        long jM7533 = c2460.m7532();
        c2460.m7535(1);
        int iM46239 = m46239(c2460);
        byte[] bArr = new byte[iM46239];
        c2460.m7507(0, iM46239, bArr);
        if (jM7533 <= 0) {
            jM7533 = -1;
        }
        return new C21852(jM7533, jM7532 > 0 ? jM7532 : -1L, strM17978, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m46230(C2460 c2460, int i, int i2) throws C22861 {
        int i3;
        int i4;
        int iM7500 = c2460.m7500();
        while (iM7500 - i < i2) {
            c2460.m7510(iM7500);
            int iM7499 = c2460.m7499();
            C19923.m45219("childAtomSize must be positive", iM7499 > 0);
            if (c2460.m7499() == 1936289382) {
                int i5 = iM7500 + 8;
                int i6 = -1;
                Integer numValueOf = null;
                int i7 = 0;
                String strM7505 = null;
                while (i5 - iM7500 < iM7499) {
                    c2460.m7510(i5);
                    int iM74910 = c2460.m7499();
                    int iM74911 = c2460.m7499();
                    if (iM74911 == 1718775137) {
                        numValueOf = Integer.valueOf(c2460.m7499());
                    } else if (iM74911 == 1935894637) {
                        c2460.m7535(4);
                        strM7505 = c2460.m7505(4, StandardCharsets.UTF_8);
                    } else if (iM74911 == 1935894633) {
                        i6 = i5;
                        i7 = iM74910;
                    }
                    i5 += iM74910;
                }
                C1285 c1285 = null;
                Pair pairCreate = null;
                bArr = null;
                byte[] bArr = null;
                if ("cenc".equals(strM7505) || "cbc1".equals(strM7505) || "cens".equals(strM7505) || "cbcs".equals(strM7505)) {
                    C19923.m45219("frma atom is mandatory", numValueOf != null);
                    C19923.m45219("schi atom is mandatory", i6 != -1);
                    int i8 = i6 + 8;
                    while (i8 - i6 < i7) {
                        c2460.m7510(i8);
                        int iM74912 = c2460.m7499();
                        if (c2460.m7499() == 1952804451) {
                            int iM46229 = m46229(c2460.m7499());
                            c2460.m7535(1);
                            if (iM46229 == 0) {
                                c2460.m7535(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM7516 = c2460.m7516();
                                i3 = iM7516 & 15;
                                i4 = (iM7516 & 240) >> 4;
                            }
                            boolean z = c2460.m7516() == 1;
                            int iM7517 = c2460.m7516();
                            byte[] bArr2 = new byte[16];
                            c2460.m7507(0, 16, bArr2);
                            if (z && iM7517 == 0) {
                                int iM7518 = c2460.m7516();
                                bArr = new byte[iM7518];
                                c2460.m7507(0, iM7518, bArr);
                            }
                            c1285 = new C1285(z, strM7505, iM7517, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iM74912;
                    }
                    C19923.m45219("tenc atom is mandatory", c1285 != null);
                    String str = C17983.f57504;
                    pairCreate = Pair.create(numValueOf, c1285);
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iM7500 += iM7499;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m46239(C2460 c2460) {
        int iM7516 = c2460.m7516();
        int i = iM7516 & 127;
        while ((iM7516 & 128) == 128) {
            iM7516 = c2460.m7516();
            i = (i << 7) | (iM7516 & 127);
        }
        return i;
    }
}
