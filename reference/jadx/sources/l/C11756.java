package l;

import android.util.Pair;
import com.alipay.sdk.m.p.a;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
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

/* JADX INFO: renamed from: l.ۧܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11756 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38004 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f38005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29513(int i) {
        return (i >> 24) & 255;
    }

    static {
        String str = C7116.f23455;
        f38005 = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:317:0x062b  */
    /* JADX WARN: Code duplicated, block: B:383:0x071e  */
    /* JADX WARN: Code duplicated, block: B:583:0x0bbf A[PHI: r10 r24
      0x0bbf: PHI (r10v85 java.lang.String) = (r10v84 java.lang.String), (r10v86 java.lang.String) binds: [B:558:0x0b1a, B:560:0x0b28] A[DONT_GENERATE, DONT_INLINE]
      0x0bbf: PHI (r24v2 l.۬ܺ᩷) = (r24v1 l.۬ܺ᩷), (r24v3 l.۬ܺ᩷) binds: [B:558:0x0b1a, B:560:0x0b28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:626:0x0d34  */
    /* JADX WARN: Code duplicated, block: B:628:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:630:0x0d4f  */
    /* JADX WARN: Code duplicated, block: B:631:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:633:0x0d6c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m29515(C22605 c22605, C6078 c6078, long j, C22362 c22362, boolean z, boolean z2, InterfaceC5417 interfaceC5417) {
        int i;
        long jM19477;
        long j2;
        int i2;
        int i3;
        long jM19478;
        long j3;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        C22605 c22606;
        long[] jArr;
        long[] jArr2;
        C15648 c15648M46295;
        C10670 c10670;
        C19378 c19378;
        C19378 c19379;
        C19215 c19215;
        int i5;
        Pair pairCreate;
        C22199 c22199;
        ArrayList arrayList3;
        C22605 c22607;
        int i6;
        int i7;
        int i8;
        C19961 c19961;
        C21287 c21287;
        int i9;
        int iM48494;
        int iM48495;
        int iM48500;
        int iRound;
        int i10;
        C22362 c22363;
        String str2;
        int i11;
        int i12;
        String str3;
        int i13;
        int iM48516;
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
        AbstractC1928 abstractC1928;
        long j4;
        AbstractC1928 abstractC1928Of;
        String str5;
        String str6;
        AbstractC1928 abstractC1928Of2;
        ArrayList arrayList4;
        C22605 c22608 = c22605;
        ArrayList arrayList5 = c22608.f73060;
        ArrayList arrayList6 = new ArrayList();
        int i21 = 0;
        while (i21 < arrayList5.size()) {
            C22605 c22609 = (C22605) arrayList5.get(i21);
            if (c22609.f49413 != 1953653099) {
                arrayList = arrayList5;
                arrayList4 = arrayList6;
                i4 = i21;
            } else {
                C19621 c19621M50936 = c22608.m50936(1836476516);
                c19621M50936.getClass();
                C22605 c22605M50937 = c22609.m50937(1835297121);
                c22605M50937.getClass();
                C19621 c19621M50937 = c22605M50937.m50936(1751411826);
                c19621M50937.getClass();
                C21287 c21288 = c19621M50937.f63236;
                c21288.m48510(16);
                int iM48501 = c21288.m48500();
                if (iM48501 == 1936684398) {
                    i = 1;
                } else if (iM48501 == 1986618469) {
                    i = 2;
                } else if (iM48501 == 1952807028 || iM48501 == 1935832172 || iM48501 == 1937072756 || iM48501 == 1668047728 || iM48501 == 1937072752) {
                    i = 3;
                } else {
                    i = iM48501 == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    c19215 = null;
                    i5 = 1835297121;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    i4 = i21;
                    c22606 = c22609;
                } else {
                    C19621 c19621M50938 = c22609.m50936(1953196132);
                    c19621M50938.getClass();
                    C21287 c21289 = c19621M50938.f63236;
                    c21289.m48510(8);
                    int iM29513 = m29513(c21289.m48500());
                    c21289.m48503(iM29513 != 0 ? 16 : 8);
                    int iM48502 = c21289.m48500();
                    c21289.m48503(4);
                    int iM48517 = c21289.m48516();
                    int i22 = iM29513 == 0 ? 4 : 8;
                    int i23 = 0;
                    while (true) {
                        jM19477 = -9223372036854775807L;
                        if (i23 >= i22) {
                            c21289.m48503(i22);
                        } else {
                            if (c21289.m48497()[iM48517 + i23] != -1) {
                                long jM48485 = iM29513 == 0 ? c21289.m48485() : c21289.m48482();
                                if (jM48485 != 0) {
                                    j2 = jM48485;
                                    break;
                                }
                                break;
                            }
                            i23++;
                        }
                        j2 = -9223372036854775807L;
                        break;
                    }
                    c21289.m48503(10);
                    int iM48496 = c21289.m48494();
                    c21289.m48503(4);
                    int iM48503 = c21289.m48500();
                    int iM48504 = c21289.m48500();
                    c21289.m48503(4);
                    int iM48505 = c21289.m48500();
                    int iM48506 = c21289.m48500();
                    if (iM48503 == 0 && iM48504 == 65536 && ((iM48505 == -65536 || iM48505 == 65536) && iM48506 == 0)) {
                        i2 = 16;
                        i3 = 90;
                    } else if (iM48503 == 0 && iM48504 == -65536 && ((iM48505 == 65536 || iM48505 == -65536) && iM48506 == 0)) {
                        i2 = 16;
                        i3 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    } else if ((iM48503 == -65536 || iM48503 == 65536) && iM48504 == 0 && iM48505 == 0 && iM48506 == -65536) {
                        i2 = 16;
                        i3 = 180;
                    } else {
                        i2 = 16;
                        i3 = 0;
                    }
                    c21289.m48503(i2);
                    short sM48511 = c21289.m48511();
                    c21289.m48503(2);
                    C5791 c5791 = new C5791(iM48502, iM48496, i3, sM48511, c21289.m48511(), j2);
                    long j5 = j == -9223372036854775807L ? c5791.f19891 : j;
                    long j6 = m29522(c19621M50936.f63236).f19040;
                    if (j5 == -9223372036854775807L) {
                        jM19478 = -9223372036854775807L;
                    } else {
                        String str7 = C7116.f23455;
                        jM19478 = C7116.m19477(j5, 1000000L, j6, RoundingMode.DOWN);
                    }
                    C22605 c22605M50938 = c22605M50937.m50937(1835626086);
                    c22605M50938.getClass();
                    C22605 c22605M50939 = c22605M50938.m50937(1937007212);
                    c22605M50939.getClass();
                    C19621 c19621M50939 = c22605M50937.m50936(1835296868);
                    c19621M50939.getClass();
                    C21287 c212810 = c19621M50939.f63236;
                    c212810.m48510(8);
                    int iM29514 = m29513(c212810.m48500());
                    c212810.m48503(iM29514 == 0 ? 8 : 16);
                    long jM48486 = c212810.m48485();
                    int iM48518 = c212810.m48516();
                    int i24 = iM29514 == 0 ? 4 : 8;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= i24) {
                            j3 = j6;
                            c212810.m48503(i24);
                            break;
                        }
                        int i26 = iM48518;
                        j3 = j6;
                        if (c212810.m48497()[iM48518 + i25] != -1) {
                            long jM48487 = iM29514 == 0 ? c212810.m48485() : c212810.m48482();
                            if (jM48487 == 0) {
                                break;
                            }
                            String str8 = C7116.f23455;
                            jM19477 = C7116.m19477(jM48487, 1000000L, jM48486, RoundingMode.DOWN);
                            break;
                        }
                        i25++;
                        iM48518 = i26;
                        j6 = j3;
                    }
                    long j7 = jM19477;
                    int iM48497 = c212810.m48494();
                    int i27 = 3;
                    char[] cArr = {(char) (((iM48497 >> 10) & 31) + 96), (char) (((iM48497 >> 5) & 31) + 96), (char) ((iM48497 & 31) + 96)};
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
                    C22199 c221910 = new C22199(str, jM48486, j7);
                    C19621 c19621M509310 = c22605M50939.m50936(1937011556);
                    if (c19621M509310 == null) {
                        throw C2970.m9688("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
                    }
                    C21287 c212811 = c19621M509310.f63236;
                    String str9 = c221910.f71525;
                    c212811.m48510(12);
                    int iM48507 = c212811.m48500();
                    C19961 c19962 = new C19961(iM48507);
                    int i29 = 0;
                    while (true) {
                        C10264[] c10264Arr = c19962.f64163;
                        if (i29 >= iM48507) {
                            C22199 c221911 = c221910;
                            int i30 = i;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            i4 = i21;
                            C22605 c226010 = c22609;
                            long j8 = j3;
                            C19961 c19963 = c19962;
                            C19215 c19216 = null;
                            if (!z) {
                                c22606 = c226010;
                                C22605 c22605M509310 = c22606.m50937(1701082227);
                                if (c22605M509310 != null) {
                                    C19621 c19621M509311 = c22605M509310.m50936(1701606260);
                                    if (c19621M509311 == null) {
                                        pairCreate = null;
                                    } else {
                                        C21287 c212812 = c19621M509311.f63236;
                                        c212812.m48510(8);
                                        int iM29515 = m29513(c212812.m48500());
                                        int iM48512 = c212812.m48512();
                                        long[] jArr3 = new long[iM48512];
                                        long[] jArr4 = new long[iM48512];
                                        for (int i31 = 0; i31 < iM48512; i31++) {
                                            jArr3[i31] = iM29515 == 1 ? c212812.m48482() : c212812.m48485();
                                            jArr4[i31] = iM29515 == 1 ? c212812.m48518() : c212812.m48500();
                                            if (c212812.m48511() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            c212812.m48503(2);
                                        }
                                        pairCreate = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate != null) {
                                        jArr2 = (long[]) pairCreate.first;
                                        jArr = (long[]) pairCreate.second;
                                    }
                                }
                                if (c19963.f64161 != null) {
                                    if (c5791.f19887 != 0) {
                                        c10670 = new C10670(c5791.f19887);
                                        C20124 c20124M37397 = c19963.f64161.m37397();
                                        c19378 = c19963.f64161.f50812;
                                        if (c19378 != null) {
                                            c19379 = c19378.m44823(c10670);
                                        } else {
                                            c19379 = new C19378(c10670);
                                        }
                                        c20124M37397.m46303(c19379);
                                        c15648M46295 = c20124M37397.m46295();
                                    } else {
                                        c15648M46295 = c19963.f64161;
                                    }
                                    c19216 = new C19215(c5791.f19892, i30, c221911.f71526, j8, jM19478, c221911.f71527, c15648M46295, c19963.f64165, c10264Arr, c19963.f64162, jArr2, jArr, c19963.f64164);
                                }
                                c19215 = c19216;
                                i5 = 1835297121;
                                break;
                            }
                            c22606 = c226010;
                            jArr = null;
                            jArr2 = null;
                            if (c19963.f64161 != null) {
                                if (c5791.f19887 != 0) {
                                    c10670 = new C10670(c5791.f19887);
                                    C20124 c20124M37398 = c19963.f64161.m37397();
                                    c19378 = c19963.f64161.f50812;
                                    if (c19378 != null) {
                                        c19379 = c19378.m44823(c10670);
                                    } else {
                                        c19379 = new C19378(c10670);
                                    }
                                    c20124M37398.m46303(c19379);
                                    c15648M46295 = c20124M37398.m46295();
                                } else {
                                    c15648M46295 = c19963.f64161;
                                }
                                c19216 = new C19215(c5791.f19892, i30, c221911.f71526, j8, jM19478, c221911.f71527, c15648M46295, c19963.f64165, c10264Arr, c19963.f64162, jArr2, jArr, c19963.f64164);
                            }
                            c19215 = c19216;
                            i5 = 1835297121;
                            break;
                        }
                        int iM48519 = c212811.m48516();
                        int iM48508 = c212811.m48500();
                        int i32 = iM48507;
                        String str10 = "childAtomSize must be positive";
                        C5332.m15985("childAtomSize must be positive", iM48508 > 0);
                        int iM48509 = c212811.m48500();
                        int i33 = i;
                        if (iM48509 == 1635148593 || iM48509 == 1635148595 || iM48509 == 1701733238 || iM48509 == 1831958048 || iM48509 == 1836070006 || iM48509 == 1752589105 || iM48509 == 1751479857 || iM48509 == 1932670515 || iM48509 == 1211250227 || iM48509 == 1748121139 || iM48509 == 1987063864 || iM48509 == 1987063865 || iM48509 == 1635135537 || iM48509 == 1685479798 || iM48509 == 1685479729 || iM48509 == 1685481573 || iM48509 == 1685481521 || iM48509 == 1634760241) {
                            c22199 = c221910;
                            arrayList3 = arrayList6;
                            i21 = i21;
                            c22607 = c22609;
                            i6 = iM48508;
                            i7 = iM48519;
                            i8 = i29;
                            c19961 = c19962;
                            c21287 = c212811;
                            m29521(c212811, iM48509, iM48519, i6, c5791.f19892, str9, c5791.f19890, c22362, c19961, i8);
                        } else {
                            if (iM48509 == 1836069985 || iM48509 == 1701733217 || iM48509 == 1633889587 || iM48509 == 1700998451 || iM48509 == 1633889588 || iM48509 == 1835823201 || iM48509 == 1685353315 || iM48509 == 1685353317 || iM48509 == 1685353320 || iM48509 == 1685353324 || iM48509 == 1685353336 || iM48509 == 1935764850 || iM48509 == 1935767394 || iM48509 == 1819304813 || iM48509 == 1936684916 || iM48509 == 1953984371 || iM48509 == 778924082 || iM48509 == 778924083 || iM48509 == 1835557169 || iM48509 == 1835560241 || iM48509 == 1634492771 || iM48509 == 1634492791 || iM48509 == 1970037111 || iM48509 == 1332770163 || iM48509 == 1716281667 || iM48509 == 1767992678 || iM48509 == 1768973165 || iM48509 == 1718641517) {
                                c22199 = c221910;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c22607 = c22609;
                                int i34 = c5791.f19892;
                                c212811.m48510(iM48519 + 16);
                                if (z2) {
                                    iM48494 = c212811.m48494();
                                    c212811.m48503(6);
                                } else {
                                    c212811.m48503(8);
                                    iM48494 = 0;
                                }
                                if (iM48494 == 0 || iM48494 == 1) {
                                    iM48495 = c212811.m48494();
                                    c212811.m48503(6);
                                    int iM485110 = c212811.m48519();
                                    c212811.m48510(c212811.m48516() - 4);
                                    iM48500 = c212811.m48500();
                                    if (iM48494 == 1) {
                                        c212811.m48503(16);
                                    }
                                    iRound = iM485110;
                                    i10 = -1;
                                } else {
                                    if (iM48494 == 2) {
                                        c212811.m48503(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(c212811.m48518()));
                                        iM48495 = c212811.m48512();
                                        c212811.m48503(4);
                                        int iM48513 = c212811.m48512();
                                        int iM48514 = c212811.m48512();
                                        boolean z3 = (iM48514 & 1) != 0;
                                        boolean z4 = (iM48514 & 2) != 0;
                                        if (z3) {
                                            if (iM48513 == 32) {
                                                i10 = 4;
                                            } else {
                                                i10 = -1;
                                            }
                                        } else if (iM48513 == 8) {
                                            i10 = 3;
                                        } else if (iM48513 == 16) {
                                            i10 = z4 ? 268435456 : 2;
                                        } else if (iM48513 == 24) {
                                            i10 = z4 ? 1342177280 : 21;
                                        } else if (iM48513 == 32) {
                                            i10 = z4 ? 1610612736 : 22;
                                        } else {
                                            i10 = -1;
                                        }
                                        c212811.m48503(8);
                                        iM48500 = 0;
                                    }
                                    c19961 = c19962;
                                    c21287 = c212811;
                                    i8 = i9;
                                    i7 = i12;
                                    i6 = i11;
                                }
                                if (iM48509 == 1767992678) {
                                    iM48495 = -1;
                                    iRound = -1;
                                } else if (iM48509 == 1935764850) {
                                    iM48495 = 1;
                                    iRound = 8000;
                                } else if (iM48509 == 1935767394) {
                                    iM48495 = 1;
                                    iRound = 16000;
                                }
                                int iM485111 = c212811.m48516();
                                if (iM48509 == 1701733217) {
                                    Pair pairM29514 = m29514(c212811, iM48519, iM48508);
                                    if (pairM29514 != null) {
                                        int iIntValue = ((Integer) pairM29514.first).intValue();
                                        C22362 c22362M50439 = c22362 == null ? null : c22362.m50439(((C10264) pairM29514.second).f32791);
                                        c10264Arr[i9] = (C10264) pairM29514.second;
                                        c22363 = c22362M50439;
                                        iM48509 = iIntValue;
                                    } else {
                                        c22363 = c22362;
                                    }
                                    c212811.m48510(iM485111);
                                } else {
                                    c22363 = c22362;
                                }
                                String str11 = "audio/mhm1";
                                int i35 = iRound;
                                if (iM48509 == 1633889587) {
                                    str2 = "audio/ac3";
                                } else if (iM48509 == 1700998451) {
                                    str2 = "audio/eac3";
                                } else if (iM48509 == 1633889588) {
                                    str2 = "audio/ac4";
                                } else if (iM48509 == 1685353315) {
                                    str2 = "audio/vnd.dts";
                                } else if (iM48509 == 1685353320 || iM48509 == 1685353324) {
                                    str2 = "audio/vnd.dts.hd";
                                } else if (iM48509 == 1685353317) {
                                    str2 = "audio/vnd.dts.hd;profile=lbr";
                                } else if (iM48509 == 1685353336) {
                                    str2 = "audio/vnd.dts.uhd;profile=p2";
                                } else if (iM48509 == 1935764850) {
                                    str2 = "audio/3gpp";
                                } else if (iM48509 == 1935767394) {
                                    str2 = "audio/amr-wb";
                                } else if (iM48509 != 1936684916) {
                                    if (iM48509 == 1953984371) {
                                        i10 = 268435456;
                                    } else if (iM48509 == 1819304813) {
                                        if (i10 == -1) {
                                            i10 = 2;
                                        }
                                    } else if (iM48509 == 778924082 || iM48509 == 778924083) {
                                        str2 = "audio/mpeg";
                                    } else if (iM48509 == 1835557169) {
                                        str2 = "audio/mha1";
                                    } else if (iM48509 == 1835560241) {
                                        str2 = "audio/mhm1";
                                    } else if (iM48509 == 1634492771) {
                                        str2 = "audio/alac";
                                    } else if (iM48509 == 1634492791) {
                                        str2 = "audio/g711-alaw";
                                    } else if (iM48509 == 1970037111) {
                                        str2 = "audio/g711-mlaw";
                                    } else if (iM48509 == 1332770163) {
                                        str2 = "audio/opus";
                                    } else if (iM48509 == 1716281667) {
                                        str2 = "audio/flac";
                                    } else if (iM48509 == 1835823201) {
                                        str2 = "audio/true-hd";
                                    } else {
                                        str2 = iM48509 == 1767992678 ? "audio/iamf" : null;
                                    }
                                    str2 = "audio/raw";
                                } else {
                                    i10 = 2;
                                    str2 = "audio/raw";
                                }
                                C13971 c13971M29517 = null;
                                C8751 c8751 = null;
                                int i36 = iM485111;
                                String str12 = null;
                                int iIntValue2 = iM48495;
                                int i37 = i10;
                                List listOf3 = null;
                                int i38 = i35;
                                while (i36 - iM48519 < iM48508) {
                                    c212811.m48510(i36);
                                    int iM485010 = c212811.m48500();
                                    C5332.m15985(str10, iM485010 > 0);
                                    int iM485011 = c212811.m48500();
                                    int i39 = iM48519;
                                    if (iM485011 == 1835557187) {
                                        c212811.m48510(i36 + 8);
                                        c212811.m48503(1);
                                        int iM48493 = c212811.m48493();
                                        c212811.m48503(1);
                                        str12 = C17359.equals(str2, str11) ? String.format("mhm1.%02X", Integer.valueOf(iM48493)) : String.format("mha1.%02X", Integer.valueOf(iM48493));
                                        int iM48498 = c212811.m48494();
                                        byte[] bArr = new byte[iM48498];
                                        str3 = str11;
                                        c212811.m48490(0, iM48498, bArr);
                                        listOf3 = listOf3 == null ? AbstractC1928.of((Object) bArr) : AbstractC1928.of((Object) bArr, listOf3.get(0));
                                    } else {
                                        str3 = str11;
                                        if (iM485011 == 1835557200) {
                                            c212811.m48510(i36 + 8);
                                            int iM48499 = c212811.m48493();
                                            if (iM48499 > 0) {
                                                byte[] bArr2 = new byte[iM48499];
                                                c212811.m48490(0, iM48499, bArr2);
                                                listOf3 = listOf3 == null ? AbstractC1928.of((Object) bArr2) : AbstractC1928.of(listOf3.get(0), (Object) bArr2);
                                            }
                                        } else if (iM485011 == 1702061171 || (z2 && iM485011 == 2002876005)) {
                                            List list2 = listOf3;
                                            String str13 = str10;
                                            i13 = iM48500;
                                            int i40 = iIntValue2;
                                            int i41 = i38;
                                            if (iM485011 != 1702061171) {
                                                iM48516 = c212811.m48516();
                                                C5332.m15985(null, iM48516 >= i36);
                                                while (true) {
                                                    if (iM48516 - i36 >= iM485010) {
                                                        str4 = str13;
                                                        iM48516 = -1;
                                                        break;
                                                    }
                                                    c212811.m48510(iM48516);
                                                    int iM485012 = c212811.m48500();
                                                    str4 = str13;
                                                    C5332.m15985(str4, iM485012 > 0);
                                                    if (c212811.m48500() == 1702061171) {
                                                        break;
                                                    }
                                                    iM48516 += iM485012;
                                                    str13 = str4;
                                                }
                                            } else {
                                                iM48516 = i36;
                                                str4 = str13;
                                            }
                                            if (iM48516 != -1) {
                                                c13971M29517 = m29517(iM48516, c212811);
                                                str2 = c13971M29517.f44302;
                                                byte[] bArr3 = c13971M29517.f44303;
                                                if (bArr3 == null) {
                                                    i14 = iM48509;
                                                    str10 = str4;
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listOf3 = list2;
                                                } else if ("audio/vorbis".equals(str2)) {
                                                    C21287 c212813 = new C21287(bArr3);
                                                    c212813.m48503(1);
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (c212813.m48486() <= 0) {
                                                            i14 = iM48509;
                                                            break;
                                                        }
                                                        i14 = iM48509;
                                                        if (c212813.m48502() != 255) {
                                                            break;
                                                        }
                                                        i42 += 255;
                                                        c212813.m48503(1);
                                                        iM48509 = i14;
                                                    }
                                                    int iM484910 = c212813.m48493() + i42;
                                                    int i43 = 0;
                                                    while (true) {
                                                        if (c212813.m48486() <= 0) {
                                                            str10 = str4;
                                                            break;
                                                        }
                                                        str10 = str4;
                                                        if (c212813.m48502() != 255) {
                                                            break;
                                                        }
                                                        i43 += 255;
                                                        c212813.m48503(1);
                                                        str4 = str10;
                                                    }
                                                    int iM484911 = c212813.m48493() + i43;
                                                    byte[] bArr4 = new byte[iM484910];
                                                    int iM485112 = c212813.m48516();
                                                    System.arraycopy(bArr3, iM485112, bArr4, 0, iM484910);
                                                    int i44 = iM485112 + iM484910 + iM484911;
                                                    int length = bArr3.length - i44;
                                                    byte[] bArr5 = new byte[length];
                                                    System.arraycopy(bArr3, i44, bArr5, 0, length);
                                                    AbstractC1928 abstractC1928Of3 = AbstractC1928.of((Object) bArr4, (Object) bArr5);
                                                    iIntValue2 = i40;
                                                    i15 = i41;
                                                    listOf3 = abstractC1928Of3;
                                                } else {
                                                    i14 = iM48509;
                                                    str10 = str4;
                                                    if ("audio/mp4a-latm".equals(str2)) {
                                                        C24834 c24834M39348 = C16628.m39348(new C14573(bArr3, bArr3.length), false);
                                                        i15 = c24834M39348.f80326;
                                                        iIntValue2 = c24834M39348.f80325;
                                                        str12 = c24834M39348.f80327;
                                                    } else {
                                                        iIntValue2 = i40;
                                                        i15 = i41;
                                                    }
                                                    listOf3 = AbstractC1928.of((Object) bArr3);
                                                }
                                            } else {
                                                i14 = iM48509;
                                                str10 = str4;
                                                iIntValue2 = i40;
                                                i15 = i41;
                                                listOf3 = list2;
                                            }
                                        } else {
                                            if (iM485011 == 1651798644) {
                                                c212811.m48510(i36 + 8);
                                                c212811.m48503(4);
                                                i16 = iIntValue2;
                                                c8751 = new C8751(c212811.m48485(), c212811.m48485());
                                                list = listOf3;
                                            } else {
                                                listOf = listOf3;
                                                i16 = iIntValue2;
                                                if (iM485011 == 1684103987) {
                                                    c212811.m48510(i36 + 8);
                                                    c19962.f64161 = C15882.m37860(c212811, Integer.toString(i34), str9, c22363);
                                                } else if (iM485011 == 1684366131) {
                                                    c212811.m48510(i36 + 8);
                                                    c19962.f64161 = C15882.m37862(c212811, Integer.toString(i34), str9, c22363);
                                                } else if (iM485011 == 1684103988) {
                                                    c212811.m48510(i36 + 8);
                                                    c19962.f64161 = C20358.m46774(c212811, Integer.toString(i34), str9, c22363);
                                                } else if (iM485011 == 1684892784) {
                                                    if (iM48500 <= 0) {
                                                        throw C2970.m9688("Invalid sample rate for Dolby TrueHD MLP stream: " + iM48500, (Throwable) null);
                                                    }
                                                    iIntValue2 = 2;
                                                    i38 = iM48500;
                                                    list = listOf;
                                                    listOf = list;
                                                    str10 = str10;
                                                    i13 = iM48500;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listOf3 = listOf;
                                                    i14 = iM48509;
                                                } else if (iM485011 == 1684305011 || iM485011 == 1969517683) {
                                                    str10 = str10;
                                                    i13 = iM48500;
                                                    C20124 c20124 = new C20124();
                                                    c20124.m46317(i34);
                                                    c20124.m46315(str2);
                                                    i17 = i16;
                                                    c20124.m46329(i17);
                                                    i18 = i38;
                                                    c20124.m46332(i18);
                                                    c20124.m46304(c22363);
                                                    c20124.m46321(str9);
                                                    c19962.f64161 = c20124.m46295();
                                                    iIntValue2 = i17;
                                                    i38 = i18;
                                                    i19 = i37;
                                                    i37 = i19;
                                                    i15 = i38;
                                                    listOf3 = listOf;
                                                    i14 = iM48509;
                                                } else {
                                                    if (iM485011 == 1682927731) {
                                                        int i45 = iM485010 - 8;
                                                        byte[] bArr6 = f38005;
                                                        byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i45);
                                                        c212811.m48510(i36 + 8);
                                                        c212811.m48490(bArr6.length, i45, bArrCopyOf);
                                                        listOf2 = C7569.m20683(bArrCopyOf);
                                                    } else if (iM485011 == 1684425825) {
                                                        byte[] bArr7 = new byte[iM485010 - 8];
                                                        bArr7[0] = 102;
                                                        bArr7[1] = 76;
                                                        bArr7[2] = 97;
                                                        bArr7[3] = 67;
                                                        c212811.m48510(i36 + 12);
                                                        c212811.m48490(4, iM485010 - 12, bArr7);
                                                        listOf2 = AbstractC1928.of((Object) bArr7);
                                                    } else if (iM485011 == 1634492771) {
                                                        int i46 = iM485010 - 12;
                                                        byte[] bArr8 = new byte[i46];
                                                        c212811.m48510(i36 + 12);
                                                        c212811.m48490(0, i46, bArr8);
                                                        int i47 = C21528.f68786;
                                                        C21287 c212814 = new C21287(bArr8);
                                                        c212814.m48510(9);
                                                        int iM484912 = c212814.m48493();
                                                        c212814.m48510(20);
                                                        Pair pairCreate2 = Pair.create(Integer.valueOf(c212814.m48512()), Integer.valueOf(iM484912));
                                                        int iIntValue3 = ((Integer) pairCreate2.first).intValue();
                                                        i14 = iM48509;
                                                        iIntValue2 = ((Integer) pairCreate2.second).intValue();
                                                        str10 = str10;
                                                        i13 = iM48500;
                                                        listOf3 = AbstractC1928.of((Object) bArr8);
                                                        i15 = iIntValue3;
                                                    } else {
                                                        if (iM485011 == 1767990114) {
                                                            c212811.m48510(i36 + 9);
                                                            int iM485013 = c212811.m48507();
                                                            byte[] bArr9 = new byte[iM485013];
                                                            c212811.m48490(0, iM485013, bArr9);
                                                            int i48 = C21528.f68786;
                                                            C21287 c212815 = new C21287(bArr9);
                                                            while ((c212815.m48493() & 128) != 0) {
                                                            }
                                                            c212815.m48503(4);
                                                            int iM484913 = c212815.m48493();
                                                            int iM484914 = c212815.m48493();
                                                            c212815.m48503(1);
                                                            while ((c212815.m48493() & 128) != 0) {
                                                            }
                                                            while ((c212815.m48493() & 128) != 0) {
                                                            }
                                                            i13 = iM48500;
                                                            String strM48488 = c212815.m48488(4, StandardCharsets.UTF_8);
                                                            if (strM48488.equals("mp4a")) {
                                                                while ((c212815.m48493() & 128) != 0) {
                                                                }
                                                                c212815.m48503(2);
                                                                C14573 c14573 = new C14573();
                                                                c14573.m35155(c212815);
                                                                int iM35163 = c14573.m35163(5);
                                                                if (iM35163 == 31) {
                                                                    iM35163 = c14573.m35163(6) + 32;
                                                                }
                                                                strM48488 = strM48488 + ".40." + iM35163;
                                                            }
                                                            Object[] objArr = {Integer.valueOf(iM484913), Integer.valueOf(iM484914), strM48488};
                                                            String str14 = C7116.f23455;
                                                            str12 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
                                                            listOf = AbstractC1928.of((Object) bArr9);
                                                            i19 = i37;
                                                        } else {
                                                            str10 = str10;
                                                            i13 = iM48500;
                                                            if (iM485011 == 1885564227) {
                                                                c212811.m48510(i36 + 12);
                                                                ByteOrder byteOrder = (c212811.m48493() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                                int iM484915 = c212811.m48493();
                                                                if (iM48509 == 1768973165) {
                                                                    int iM19463 = C7116.m19463(iM484915, byteOrder);
                                                                    i20 = -1;
                                                                    i19 = iM19463;
                                                                } else {
                                                                    i19 = (iM48509 == 1718641517 && iM484915 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i37;
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
                                                            i14 = iM48509;
                                                        }
                                                        iIntValue2 = i16;
                                                        i37 = i19;
                                                        i15 = i38;
                                                        listOf3 = listOf;
                                                        i14 = iM48509;
                                                    }
                                                    list = listOf2;
                                                }
                                                str10 = str10;
                                                i13 = iM48500;
                                                i18 = i38;
                                                i17 = i16;
                                                iIntValue2 = i17;
                                                i38 = i18;
                                                i19 = i37;
                                                i37 = i19;
                                                i15 = i38;
                                                listOf3 = listOf;
                                                i14 = iM48509;
                                            }
                                            iIntValue2 = i16;
                                            listOf = list;
                                            str10 = str10;
                                            i13 = iM48500;
                                            i19 = i37;
                                            i37 = i19;
                                            i15 = i38;
                                            listOf3 = listOf;
                                            i14 = iM48509;
                                        }
                                        i36 += iM485010;
                                        iM48509 = i14;
                                        iM48508 = iM48508;
                                        str11 = str3;
                                        iM48500 = i13;
                                        str10 = str10;
                                        i38 = i15;
                                        iM48519 = i39;
                                    }
                                    str10 = str10;
                                    i13 = iM48500;
                                    i15 = i38;
                                    i14 = iM48509;
                                    i36 += iM485010;
                                    iM48509 = i14;
                                    iM48508 = iM48508;
                                    str11 = str3;
                                    iM48500 = i13;
                                    str10 = str10;
                                    i38 = i15;
                                    iM48519 = i39;
                                }
                                i11 = iM48508;
                                i12 = iM48519;
                                List list3 = listOf3;
                                int i49 = iIntValue2;
                                int i50 = i38;
                                if (c19962.f64161 == null && str2 != null) {
                                    C20124 c20125 = new C20124();
                                    c20125.m46317(i34);
                                    c20125.m46315(str2);
                                    c20125.m46300(str12);
                                    c20125.m46329(i49);
                                    c20125.m46332(i50);
                                    c20125.m46293(i37);
                                    c20125.m46301(list3);
                                    c20125.m46304(c22363);
                                    c20125.m46321(str9);
                                    if (c13971M29517 != null) {
                                        c20125.m46308(C18444.m42974(c13971M29517.f44301));
                                        c20125.m46322(C18444.m42974(c13971M29517.f44304));
                                    } else if (c8751 != null) {
                                        c20125.m46308(C18444.m42974(c8751.f28456));
                                        c20125.m46322(C18444.m42974(c8751.f28457));
                                    }
                                    c19962.f64161 = c20125.m46295();
                                }
                                c19961 = c19962;
                                c21287 = c212811;
                                i8 = i9;
                                i7 = i12;
                                i6 = i11;
                            } else {
                                if (iM48509 == 1414810956 || iM48509 == 1954034535 || iM48509 == 2004251764 || iM48509 == 1937010800 || iM48509 == 1664495672 || iM48509 == 1836070003) {
                                    c212811.m48510(iM48519 + 16);
                                    String str15 = "application/ttml+xml";
                                    long j9 = C25227.FOREVER_NS;
                                    if (iM48509 != 1414810956) {
                                        if (iM48509 == 1954034535) {
                                            int i51 = iM48508 - 16;
                                            byte[] bArr10 = new byte[i51];
                                            c212811.m48490(0, i51, bArr10);
                                            abstractC1928Of2 = AbstractC1928.of((Object) bArr10);
                                            str6 = "application/x-quicktime-tx3g";
                                            c22199 = c221910;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c22607 = c22609;
                                        } else {
                                            if (iM48509 == 2004251764) {
                                                str15 = "application/x-mp4-vtt";
                                            } else if (iM48509 == 1937010800) {
                                                j9 = 0;
                                            } else if (iM48509 == 1664495672) {
                                                c19962.f64165 = 1;
                                                str15 = "application/x-mp4-cea-608";
                                            } else {
                                                if (iM48509 != 1836070003) {
                                                    throw new IllegalStateException();
                                                }
                                                int iM485113 = c212811.m48516();
                                                c212811.m48503(4);
                                                if (c212811.m48500() == 1702061171) {
                                                    C13971 c13971M29518 = m29517(iM485113, c212811);
                                                    if (c13971M29518.f44303 != null && c13971M29518.f44303.length == 64) {
                                                        byte[] bArr11 = c13971M29518.f44303;
                                                        int i52 = c5791.f19889;
                                                        int i53 = c5791.f19888;
                                                        C20782.m47568(bArr11.length == 64);
                                                        ArrayList arrayList7 = new ArrayList(16);
                                                        int i54 = 0;
                                                        while (i54 < bArr11.length - 3) {
                                                            ArrayList arrayList8 = arrayList6;
                                                            C22199 c221912 = c221910;
                                                            int iM42968 = C18444.m42968(bArr11[i54], bArr11[i54 + 1], bArr11[i54 + 2], bArr11[i54 + 3]);
                                                            int i55 = (iM42968 >> 16) & 255;
                                                            int i56 = ((iM42968 >> 8) & 255) + a.g;
                                                            byte[] bArr12 = bArr11;
                                                            int iM20246 = C7376.m20246(i56, 14075, 10000, i55);
                                                            int i57 = (iM42968 & 255) + a.g;
                                                            arrayList7.add(String.format("%06x", Integer.valueOf(C7116.m19460(C7376.m20246(i57, 17790, 10000, i55), 0, 255) | (C7116.m19460(iM20246, 0, 255) << 16) | (C7116.m19460((i55 - ((i57 * 3455) / 10000)) - ((i56 * 7169) / 10000), 0, 255) << 8))));
                                                            i54 += 4;
                                                            bArr11 = bArr12;
                                                            c221910 = c221912;
                                                            i29 = i29;
                                                            arrayList6 = arrayList8;
                                                            c22609 = c22609;
                                                        }
                                                        c22199 = c221910;
                                                        i9 = i29;
                                                        arrayList3 = arrayList6;
                                                        c22607 = c22609;
                                                        StringBuilder sbM5126 = C1402.m5126("size: ", i52, "x", "\npalette: ", i53);
                                                        sbM5126.append(C17349.m40726(", ").m40728((Iterable) arrayList7));
                                                        sbM5126.append("\n");
                                                        String string = sbM5126.toString();
                                                        String str16 = C7116.f23455;
                                                        abstractC1928Of = AbstractC1928.of((Object) string.getBytes(StandardCharsets.UTF_8));
                                                        str5 = "application/vobsub";
                                                    }
                                                } else {
                                                    c22199 = c221910;
                                                    i9 = i29;
                                                    arrayList3 = arrayList6;
                                                    c22607 = c22609;
                                                    abstractC1928Of = null;
                                                    str5 = null;
                                                }
                                                str6 = str5;
                                                abstractC1928Of2 = abstractC1928Of;
                                            }
                                            abstractC1928 = null;
                                            c22199 = c221910;
                                            i9 = i29;
                                            arrayList3 = arrayList6;
                                            i21 = i21;
                                            c22607 = c22609;
                                            j4 = j9;
                                        }
                                        j4 = Long.MAX_VALUE;
                                        String str17 = str6;
                                        abstractC1928 = abstractC1928Of2;
                                        str15 = str17;
                                    } else {
                                        abstractC1928 = null;
                                        c22199 = c221910;
                                        i9 = i29;
                                        arrayList3 = arrayList6;
                                        i21 = i21;
                                        c22607 = c22609;
                                        j4 = j9;
                                    }
                                    if (str15 != null) {
                                        C20124 c20126 = new C20124();
                                        c20126.m46317(c5791.f19892);
                                        c20126.m46315(str15);
                                        c20126.m46321(str9);
                                        c20126.m46298(j4);
                                        c20126.m46301((List) abstractC1928);
                                        c19962.f64161 = c20126.m46295();
                                    }
                                } else if (iM48509 == 1835365492) {
                                    int i58 = c5791.f19892;
                                    c212811.m48510(iM48519 + 16);
                                    if (iM48509 == 1835365492) {
                                        c212811.m48484();
                                        String strM48484 = c212811.m48484();
                                        if (strM48484 != null) {
                                            C20124 c20127 = new C20124();
                                            c20127.m46317(i58);
                                            c20127.m46315(strM48484);
                                            c19962.f64161 = c20127.m46295();
                                        }
                                    }
                                } else if (iM48509 == 1667329389) {
                                    C20124 c20128 = new C20124();
                                    c20128.m46317(c5791.f19892);
                                    c20128.m46315("application/x-camera-motion");
                                    c19962.f64161 = c20128.m46295();
                                }
                                c22199 = c221910;
                                i9 = i29;
                                arrayList3 = arrayList6;
                                i21 = i21;
                                c22607 = c22609;
                            }
                            i11 = iM48508;
                            i12 = iM48519;
                            c19961 = c19962;
                            c21287 = c212811;
                            i8 = i9;
                            i7 = i12;
                            i6 = i11;
                        }
                        c21287.m48510(i7 + i6);
                        i29 = i8 + 1;
                        c22362 = c22362;
                        c19962 = c19961;
                        c212811 = c21287;
                        str9 = str9;
                        iM48507 = i32;
                        i = i33;
                        c221910 = c22199;
                        j3 = j3;
                        arrayList5 = arrayList5;
                        i21 = i21;
                        arrayList6 = arrayList3;
                        c22609 = c22607;
                    }
                }
                C19215 c19217 = (C19215) interfaceC5417.apply(c19215);
                if (c19217 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C22605 c22605M509311 = c22606.m50937(i5);
                    c22605M509311.getClass();
                    C22605 c22605M509312 = c22605M509311.m50937(1835626086);
                    c22605M509312.getClass();
                    C22605 c22605M509313 = c22605M509312.m50937(1937007212);
                    c22605M509313.getClass();
                    C9518 c9518M29516 = m29516(c19217, c22605M509313, c6078);
                    arrayList4 = arrayList2;
                    arrayList4.add(c9518M29516);
                }
            }
            i21 = i4 + 1;
            c22608 = c22605;
            arrayList6 = arrayList4;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19378 m29518(C19621 c19621) {
        int iM48519;
        C21287 c21287 = c19621.f63236;
        c21287.m48510(8);
        C19378 c19378 = new C19378(new InterfaceC8191[0]);
        while (c21287.m48486() >= 8) {
            int iM48516 = c21287.m48516();
            int iM48500 = c21287.m48500();
            int iM48501 = c21287.m48500();
            C19378 c19379 = null;
            if (iM48501 == 1835365473) {
                c21287.m48510(iM48516);
                int i = iM48516 + iM48500;
                c21287.m48503(8);
                m29520(c21287);
                while (c21287.m48516() < i) {
                    int iM48517 = c21287.m48516();
                    int iM48502 = c21287.m48500();
                    if (c21287.m48500() == 1768715124) {
                        c21287.m48510(iM48517);
                        int i2 = iM48517 + iM48502;
                        c21287.m48503(8);
                        ArrayList arrayList = new ArrayList();
                        while (c21287.m48516() < i2) {
                            AbstractC19435 abstractC19435M11583 = C3553.m11583(c21287);
                            if (abstractC19435M11583 != null) {
                                arrayList.add(abstractC19435M11583);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c19379 = new C19378(arrayList);
                            break;
                        }
                        break;
                    }
                    c21287.m48510(iM48517 + iM48502);
                }
                c19378 = c19378.m44822(c19379);
            } else if (iM48501 == 1936553057) {
                c21287.m48510(iM48516);
                int i3 = iM48516 + iM48500;
                c21287.m48503(12);
                while (c21287.m48516() < i3) {
                    int iM48518 = c21287.m48516();
                    int iM48503 = c21287.m48500();
                    if (c21287.m48500() == 1935766900) {
                        if (iM48503 < 16) {
                            break;
                        }
                        c21287.m48503(4);
                        int i4 = -1;
                        int i5 = 0;
                        for (int i6 = 0; i6 < 2; i6++) {
                            int iM48493 = c21287.m48493();
                            int iM48494 = c21287.m48493();
                            if (iM48493 == 0) {
                                i4 = iM48494;
                            } else if (iM48493 == 1) {
                                i5 = iM48494;
                            }
                        }
                        if (i4 == 12) {
                            iM48519 = 240;
                        } else if (i4 == 13) {
                            iM48519 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                        } else if (i4 == 21 && c21287.m48486() >= 8 && c21287.m48516() + 8 <= i3) {
                            int iM48504 = c21287.m48500();
                            int iM48505 = c21287.m48500();
                            if (iM48504 < 12 || iM48505 != 1936877170) {
                                iM48519 = SecP160R1Field.PInv;
                            } else {
                                iM48519 = c21287.m48519();
                            }
                        } else {
                            iM48519 = SecP160R1Field.PInv;
                        }
                        if (iM48519 == -2147483647) {
                            break;
                        }
                        c19379 = new C19378(new C10988(iM48519, i5));
                        break;
                    }
                    c21287.m48510(iM48518 + iM48503);
                }
                c19378 = c19378.m44822(c19379);
            } else if (iM48501 == -1451722374) {
                short sM48511 = c21287.m48511();
                c21287.m48503(2);
                String strM48488 = c21287.m48488(sM48511, StandardCharsets.UTF_8);
                int iMax = Math.max(strM48488.lastIndexOf(43), strM48488.lastIndexOf(45));
                try {
                    c19379 = new C19378(new C12908(Float.parseFloat(strM48488.substring(0, iMax)), Float.parseFloat(strM48488.substring(iMax, strM48488.length() - 1))));
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                }
                c19378 = c19378.m44822(c19379);
            }
            c21287.m48510(iM48516 + iM48500);
        }
        return c19378;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C5451 m29522(C21287 c21287) {
        long jM48518;
        long jM48519;
        c21287.m48510(8);
        if (m29513(c21287.m48500()) == 0) {
            jM48518 = c21287.m48485();
            jM48519 = c21287.m48485();
        } else {
            jM48518 = c21287.m48518();
            jM48519 = c21287.m48518();
        }
        return new C5451(jM48518, jM48519, c21287.m48485());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19378 m29519(C22605 c22605) {
        C21859 c21859;
        C19621 c19621M50936 = c22605.m50936(1751411826);
        C19621 c19621M50937 = c22605.m50936(1801812339);
        C19621 c19621M50938 = c22605.m50936(1768715124);
        if (c19621M50936 != null && c19621M50937 != null && c19621M50938 != null) {
            C21287 c21287 = c19621M50936.f63236;
            c21287.m48510(16);
            if (c21287.m48500() == 1835299937) {
                C21287 c21288 = c19621M50937.f63236;
                c21288.m48510(12);
                int iM48500 = c21288.m48500();
                String[] strArr = new String[iM48500];
                for (int i = 0; i < iM48500; i++) {
                    int iM48501 = c21288.m48500();
                    c21288.m48503(4);
                    strArr[i] = c21288.m48488(iM48501 - 8, StandardCharsets.UTF_8);
                }
                C21287 c21289 = c19621M50938.f63236;
                c21289.m48510(8);
                ArrayList arrayList = new ArrayList();
                while (c21289.m48486() > 8) {
                    int iM48516 = c21289.m48516();
                    int iM48502 = c21289.m48500();
                    int iM48503 = c21289.m48500() - 1;
                    if (iM48503 < 0 || iM48503 >= iM48500) {
                        j$$ExternalSyntheticOutline0.m(iM48503, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[iM48503];
                        int i2 = iM48516 + iM48502;
                        while (true) {
                            int iM48517 = c21289.m48516();
                            if (iM48517 >= i2) {
                                c21859 = null;
                                break;
                            }
                            int iM48504 = c21289.m48500();
                            if (c21289.m48500() == 1684108385) {
                                int iM48505 = c21289.m48500();
                                int iM48506 = c21289.m48500();
                                int i3 = iM48504 - 16;
                                byte[] bArr = new byte[i3];
                                c21289.m48490(0, i3, bArr);
                                c21859 = new C21859(iM48506, iM48505, str, bArr);
                                break;
                            }
                            c21289.m48510(iM48517 + iM48504);
                        }
                        if (c21859 != null) {
                            arrayList.add(c21859);
                        }
                    }
                    c21289.m48510(iM48516 + iM48502);
                }
                if (!arrayList.isEmpty()) {
                    return new C19378(arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29520(C21287 c21287) {
        int iM48516 = c21287.m48516();
        c21287.m48503(4);
        if (c21287.m48500() != 1751411826) {
            iM48516 += 4;
        }
        c21287.m48510(iM48516);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02aa A[DONT_INVERT, LOOP:14: B:102:0x02aa->B:106:0x02b4, LOOP_START, PHI: r20
      0x02aa: PHI (r20v3 int) = (r20v2 int), (r20v4 int) binds: [B:101:0x02a8, B:106:0x02b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b4 A[LOOP:14: B:102:0x02aa->B:106:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02ba A[EDGE_INSN: B:107:0x02ba->B:108:0x02bb BREAK  A[LOOP:14: B:102:0x02aa->B:106:0x02b4]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:121:0x030c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0328  */
    /* JADX WARN: Code duplicated, block: B:131:0x0350  */
    /* JADX WARN: Code duplicated, block: B:134:0x0374  */
    /* JADX WARN: Code duplicated, block: B:136:0x038a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0442  */
    /* JADX WARN: Code duplicated, block: B:167:0x044c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0454  */
    /* JADX WARN: Code duplicated, block: B:172:0x045d A[LOOP:4: B:170:0x045a->B:172:0x045d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0490  */
    /* JADX WARN: Code duplicated, block: B:178:0x0495  */
    /* JADX WARN: Code duplicated, block: B:179:0x0497  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:185:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:188:0x04df  */
    /* JADX WARN: Code duplicated, block: B:192:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:195:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:200:0x0504  */
    /* JADX WARN: Code duplicated, block: B:204:0x0511  */
    /* JADX WARN: Code duplicated, block: B:206:0x0519 A[LOOP:8: B:202:0x050a->B:206:0x0519, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0526  */
    /* JADX WARN: Code duplicated, block: B:210:0x0528  */
    /* JADX WARN: Code duplicated, block: B:212:0x0530  */
    /* JADX WARN: Code duplicated, block: B:216:0x0556  */
    /* JADX WARN: Code duplicated, block: B:217:0x0558  */
    /* JADX WARN: Code duplicated, block: B:220:0x055d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0560  */
    /* JADX WARN: Code duplicated, block: B:223:0x0563  */
    /* JADX WARN: Code duplicated, block: B:224:0x0566  */
    /* JADX WARN: Code duplicated, block: B:226:0x0569  */
    /* JADX WARN: Code duplicated, block: B:228:0x056d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0570  */
    /* JADX WARN: Code duplicated, block: B:233:0x0586  */
    /* JADX WARN: Code duplicated, block: B:235:0x0590  */
    /* JADX WARN: Code duplicated, block: B:236:0x059e  */
    /* JADX WARN: Code duplicated, block: B:239:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:241:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:242:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:245:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:252:0x0610  */
    /* JADX WARN: Code duplicated, block: B:265:0x04ec A[ADDED_TO_REGION, EDGE_INSN: B:265:0x04ec->B:191:0x04ec BREAK  A[LOOP:6: B:186:0x04d9->B:190:0x04e5], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0501 A[ADDED_TO_REGION, EDGE_INSN: B:267:0x0501->B:198:0x0501 BREAK  A[LOOP:7: B:193:0x04f0->B:197:0x04fc], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x051c A[EDGE_INSN: B:269:0x051c->B:207:0x051c BREAK  A[LOOP:8: B:202:0x050a->B:206:0x0519], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x051c A[EDGE_INSN: B:270:0x051c->B:207:0x051c BREAK  A[LOOP:8: B:202:0x050a->B:206:0x0519], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x05dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x01fc A[EDGE_INSN: B:281:0x01fc->B:73:0x01fc BREAK  A[LOOP:12: B:69:0x01df->B:72:0x01e7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7 A[LOOP:12: B:69:0x01df->B:72:0x01e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0226 A[ADDED_TO_REGION, LOOP:13: B:77:0x0226->B:79:0x022a, LOOP_START, PHI: r20 r29 r31
      0x0226: PHI (r20v6 int) = (r20v2 int), (r20v7 int) binds: [B:76:0x0224, B:79:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r29v3 int) = (r29v1 int), (r29v5 int) binds: [B:76:0x0224, B:79:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r31v4 int) = (r31v1 int), (r31v5 int) binds: [B:76:0x0224, B:79:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0249  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:87:0x0253  */
    /* JADX WARN: Code duplicated, block: B:90:0x0258  */
    /* JADX WARN: Code duplicated, block: B:92:0x025e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x027e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9518 m29516(C19215 c19215, C22605 c22605, C6078 c6078) throws C2970 {
        InterfaceC11010 c13248;
        boolean z;
        int iM48512;
        int iM48513;
        int iM48514;
        int iMo27872;
        int i;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int iM48515;
        int i2;
        int i3;
        long j;
        long j2;
        long j3;
        int iM48516;
        int i4;
        int iM48500;
        int i5;
        int i6;
        int i7;
        long[] jArrCopyOf;
        int i8;
        long[] jArrCopyOf2;
        int[] iArrCopyOf;
        int i9;
        int[] iArrCopyOf2;
        boolean z2;
        int i10;
        C19215 c19216;
        String str;
        long j4;
        int i11;
        long j5;
        boolean zM19898;
        int i12;
        int i13;
        int iMo27870;
        int i14;
        int iM48517;
        int iM48501;
        long j6;
        C19215 c19215M44551;
        long j7;
        C15648 c15648;
        int i15;
        long[] jArr3;
        int i16;
        long[] jArr4;
        int[] iArr3;
        long jM19477;
        int i17;
        int[] iArr4;
        int i18;
        int i19;
        boolean z3;
        int[] iArr5;
        int[] iArr6;
        int i20;
        int i21;
        boolean z4;
        int i22;
        C15648 c15649;
        long[] jArr5;
        int[] iArr7;
        int i23;
        int[] iArr8;
        boolean z5;
        boolean z6;
        long[] jArr6;
        int[] iArr9;
        int[] iArr10;
        long[] jArr7;
        long[] jArr8;
        int i24;
        boolean z7;
        int i25;
        int i26;
        long j8;
        long j9;
        int i27;
        int i28;
        long jM19478;
        boolean z8;
        int[] iArr11;
        long j10;
        int i29;
        int[] iArr12;
        long j11;
        int i30;
        int i31;
        int i32;
        boolean z9;
        int i33;
        int i34;
        int i35;
        long j12;
        int i36;
        long jM19479;
        C19215 c19215M44552 = c19215;
        C15648 c156410 = c19215M44552.f62163;
        C19621 c19621M50936 = c22605.m50936(1937011578);
        if (c19621M50936 != null) {
            c13248 = new C15485(c19621M50936, c156410);
        } else {
            C19621 c19621M50937 = c22605.m50936(1937013298);
            if (c19621M50937 == null) {
                throw C2970.m9688("Track has no sample table size information", (Throwable) null);
            }
            c13248 = new C13248(c19621M50937);
        }
        int iMo27871 = c13248.mo27871();
        if (iMo27871 == 0) {
            return new C9518(c19215, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (c19215M44552.f62160 == 2) {
            long j13 = c19215M44552.f62157;
            if (j13 > 0) {
                C20124 c20124M37397 = c156410.m37397();
                c20124M37397.m46296(iMo27871 / (j13 / 1000000.0f));
                c19215M44552 = c19215M44552.m44551(c20124M37397.m46295());
            }
        }
        C15648 c156411 = c19215M44552.f62163;
        C19621 c19621M50938 = c22605.m50936(1937007471);
        if (c19621M50938 == null) {
            c19621M50938 = c22605.m50936(1668232756);
            c19621M50938.getClass();
            z = true;
        } else {
            z = false;
        }
        C21287 c21287 = c19621M50938.f63236;
        C19621 c19621M50939 = c22605.m50936(1937011555);
        c19621M50939.getClass();
        C21287 c21288 = c19621M50939.f63236;
        C19621 c19621M509310 = c22605.m50936(1937011827);
        c19621M509310.getClass();
        C21287 c21289 = c19621M509310.f63236;
        C19621 c19621M509311 = c22605.m50936(1937011571);
        C21287 c212810 = c19621M509311 != null ? c19621M509311.f63236 : null;
        C19621 c19621M509312 = c22605.m50936(1668576371);
        C21287 c212811 = c19621M509312 != null ? c19621M509312.f63236 : null;
        C7260 c7260 = new C7260(c21288, c21287, z);
        c21289.m48510(12);
        int iM48518 = c21289.m48512() - 1;
        int iM48519 = c21289.m48512();
        int iM485110 = c21289.m48512();
        if (c212811 != null) {
            c212811.m48510(12);
            iM48512 = c212811.m48512();
        } else {
            iM48512 = 0;
        }
        if (c212810 != null) {
            c212810.m48510(12);
            iM48513 = c212810.m48512();
            if (iM48513 > 0) {
                iM48514 = c212810.m48512() - 1;
            } else {
                c212810 = null;
            }
            iMo27872 = c13248.mo27872();
            i = iM48514;
            String str2 = c156411.f50848;
            if (iMo27872 == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iM48518 == 0 && iM48512 == 0 && iM48513 == 0)) {
                int i37 = c7260.f23928;
                long[] jArr9 = new long[i37];
                int[] iArr13 = new int[i37];
                while (c7260.m19898()) {
                    int i38 = c7260.f23923;
                    jArr9[i38] = c7260.f23924;
                    iArr13[i38] = c7260.f23925;
                }
                long j14 = iM485110;
                int i39 = 8192 / iMo27872;
                int iM19459 = 0;
                for (int i40 = 0; i40 < i37; i40++) {
                    iM19459 += C7116.m19459(iArr13[i40], i39);
                }
                long[] jArr10 = new long[iM19459];
                iArrCopyOf2 = new int[iM19459];
                jArrCopyOf2 = new long[iM19459];
                iArrCopyOf = new int[iM19459];
                int i41 = 0;
                i11 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                while (i44 < i37) {
                    int i45 = iArr13[i44];
                    long j15 = jArr9[i44];
                    int i46 = i37;
                    int i47 = i45;
                    int i48 = i42;
                    long[] jArr11 = jArr9;
                    int i49 = i11;
                    int i50 = i48;
                    while (i47 > 0) {
                        int iMin = Math.min(i39, i47);
                        jArr10[i50] = j15;
                        int[] iArr14 = iArr13;
                        int i51 = iMo27872 * iMin;
                        iArrCopyOf2[i50] = i51;
                        i43 += i51;
                        int iMax = Math.max(i49, i51);
                        jArrCopyOf2[i50] = ((long) i41) * j14;
                        iArrCopyOf[i50] = 1;
                        j15 += (long) iArrCopyOf2[i50];
                        i41 += iMin;
                        i47 -= iMin;
                        i50++;
                        iArr13 = iArr14;
                        i49 = iMax;
                    }
                    i44++;
                    i37 = i46;
                    int i52 = i50;
                    i11 = i49;
                    jArr9 = jArr11;
                    i42 = i52;
                }
                j5 = i43;
                c19216 = c19215M44552;
                j4 = j14 * ((long) i41);
                jArrCopyOf = jArr10;
            } else {
                jArr = new long[iMo27871];
                iArr = new int[iMo27871];
                jArr2 = new long[iMo27871];
                iArr2 = new int[iMo27871];
                iM48515 = i;
                C19215 c19217 = c19215M44552;
                i2 = 0;
                i3 = 0;
                j = 0;
                j2 = 0;
                j3 = 0;
                iM48516 = 0;
                i4 = 0;
                iM48500 = 0;
                int i53 = iM48512;
                i5 = iM485110;
                i6 = iM48519;
                i7 = i53;
                while (true) {
                    if (i2 >= iMo27871) {
                        jArrCopyOf = jArr;
                        i8 = i6;
                        jArrCopyOf2 = jArr2;
                        iArrCopyOf = iArr2;
                        i9 = i4;
                        iArrCopyOf2 = iArr;
                        break;
                    }
                    zM19898 = true;
                    while (i4 == 0) {
                        zM19898 = c7260.m19898();
                        if (!zM19898) {
                            break;
                        }
                        int i54 = i6;
                        long j16 = c7260.f23924;
                        i4 = c7260.f23925;
                        j = j16;
                        i5 = i5;
                        iMo27871 = iMo27871;
                        i6 = i54;
                    }
                    i12 = iMo27871;
                    i8 = i6;
                    i13 = i5;
                    if (!zM19898) {
                        C1896.m6517("Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArr, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                        iArrCopyOf = Arrays.copyOf(iArr2, i2);
                        iMo27871 = i2;
                        i9 = i4;
                        break;
                    }
                    if (c212811 != null) {
                        while (iM48516 == 0 && i7 > 0) {
                            iM48516 = c212811.m48512();
                            iM48500 = c212811.m48500();
                            i7--;
                        }
                        iM48516--;
                    }
                    int i55 = iM48500;
                    jArr[i2] = j;
                    iMo27870 = c13248.mo27870();
                    iArr[i2] = iMo27870;
                    long[] jArr12 = jArr;
                    int[] iArr15 = iArr;
                    j3 += (long) iMo27870;
                    if (iMo27870 > i3) {
                        i3 = iMo27870;
                    }
                    jArr2[i2] = j2 + ((long) i55);
                    if (c212810 == null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    iArr2[i2] = i14;
                    if (i2 == iM48515) {
                        iArr2[i2] = 1;
                        iM48513--;
                        if (iM48513 > 0) {
                            c212810.getClass();
                            iM48515 = c212810.m48512() - 1;
                        }
                    }
                    j2 += (long) i13;
                    iM48517 = i8 - 1;
                    if (iM48517 == 0 || iM48518 <= 0) {
                        iM48501 = i13;
                    } else {
                        iM48517 = c21289.m48512();
                        iM48501 = c21289.m48500();
                        iM48518--;
                    }
                    i6 = iM48517;
                    int i56 = iM48501;
                    j += (long) iArr15[i2];
                    i4--;
                    i2++;
                    iM48500 = i55;
                    jArr = jArr12;
                    iArr = iArr15;
                    iMo27871 = i12;
                    i5 = i56;
                }
                long j17 = j2 + ((long) iM48500);
                if (c212811 == null) {
                    z2 = true;
                    break;
                }
                while (true) {
                    if (i7 <= 0) {
                        z2 = true;
                        break;
                    }
                    if (c212811.m48512() != 0) {
                        z2 = false;
                        break;
                    }
                    c212811.m48500();
                    i7--;
                }
                if (iM48513 != 0 && i8 == 0 && i9 == 0 && iM48518 == 0) {
                    i10 = iM48516;
                    if (i10 == 0 && z2) {
                        c19216 = c19217;
                    }
                    j4 = j17;
                    i11 = i3;
                    j5 = j3;
                } else {
                    i10 = iM48516;
                }
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                c19216 = c19217;
                sb.append(c19216.f62158);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(iM48513);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i8);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i9);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(iM48518);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i10);
                if (z2) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                sb.append(str);
                C1896.m6517(sb.toString());
                j4 = j17;
                i11 = i3;
                j5 = j3;
            }
            j6 = c19216.f62157;
            if (j6 > 0) {
                jM19479 = C7116.m19477(j5 * 8, 1000000L, j6, RoundingMode.HALF_DOWN);
                if (jM19479 > 0 || jM19479 >= 2147483647L) {
                    c19215M44551 = c19216;
                } else {
                    C20124 c20124M37398 = c156411.m37397();
                    c20124M37398.m46308((int) jM19479);
                    c19215M44551 = c19216.m44551(c20124M37398.m46295());
                }
            } else {
                c19215M44551 = c19216;
            }
            j7 = c19215M44551.f62159;
            c15648 = c19215M44551.f62163;
            i15 = c19215M44551.f62160;
            jArr3 = c19215M44551.f62155;
            long[] jArr13 = c19215M44551.f62162;
            RoundingMode roundingMode = RoundingMode.DOWN;
            i16 = iMo27871;
            jArr4 = jArr13;
            iArr3 = iArrCopyOf;
            jM19477 = C7116.m19477(j4, 1000000L, j7, roundingMode);
            if (jArr4 == null) {
                C7116.m19486(jArrCopyOf2, j7);
                return new C9518(c19215M44551, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM19477);
            }
            if (jArr4.length != 1 && i15 == 1 && jArrCopyOf2.length >= 2) {
                jArr3.getClass();
                long j18 = jArr3[0];
                long jM194710 = j18 + C7116.m19477(jArr4[0], c19215M44551.f62159, c19215M44551.f62154, roundingMode);
                int length = jArrCopyOf2.length - 1;
                int iM19460 = C7116.m19460(4, 0, length);
                i17 = i15;
                int iM19461 = C7116.m19460(jArrCopyOf2.length - 4, 0, length);
                long j19 = jArrCopyOf2[0];
                if (j19 <= j18 && j18 < jArrCopyOf2[iM19460] && jArrCopyOf2[iM19461] < jM194710 && jM194710 <= j4) {
                    long j20 = j4 - jM194710;
                    j4 = j4;
                    long jM194711 = C7116.m19477(j18 - j19, c15648.f50829, c19215M44551.f62159, roundingMode);
                    iArr4 = iArrCopyOf2;
                    long jM194712 = C7116.m19477(j20, c15648.f50829, c19215M44551.f62159, roundingMode);
                    if ((jM194711 != 0 || jM194712 != 0) && jM194711 <= 2147483647L && jM194712 <= 2147483647L) {
                        c6078.f20801 = (int) jM194711;
                        c6078.f20802 = (int) jM194712;
                        C7116.m19486(jArrCopyOf2, j7);
                        return new C9518(c19215M44551, jArrCopyOf, iArr4, i11, jArrCopyOf2, iArr3, C7116.m19477(jArr4[0], 1000000L, c19215M44551.f62154, roundingMode));
                    }
                }
                i18 = 1;
                if (jArr4.length == 1) {
                    if (jArr4[0] == 0) {
                        jArr3.getClass();
                        j12 = jArr3[0];
                        for (i36 = 0; i36 < jArrCopyOf2.length; i36++) {
                            jArrCopyOf2[i36] = C7116.m19477(jArrCopyOf2[i36] - j12, 1000000L, c19215M44551.f62159, RoundingMode.DOWN);
                        }
                        return new C9518(c19215M44551, jArrCopyOf, iArr4, i11, jArrCopyOf2, iArr3, C7116.m19477(j4 - j12, 1000000L, c19215M44551.f62159, RoundingMode.DOWN));
                    }
                    i18 = 1;
                }
                i19 = i17;
                if (i19 == i18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                iArr5 = new int[jArr4.length];
                iArr6 = new int[jArr4.length];
                jArr3.getClass();
                i20 = 0;
                i21 = 0;
                z4 = false;
                i22 = 0;
                while (i21 < jArr4.length) {
                    iArr11 = iArr5;
                    j10 = jArr3[i21];
                    if (j10 != -1) {
                        boolean z10 = z4;
                        int i57 = i22;
                        long jM194713 = C7116.m19477(jArr4[i21], c19215M44551.f62159, c19215M44551.f62154, RoundingMode.DOWN);
                        iArr11[i21] = C7116.m19505(jArrCopyOf2, j10, true);
                        j11 = j10 + jM194713;
                        iArr6[i21] = C7116.m19472(jArrCopyOf2, j11, z3);
                        i30 = iArr11[i21];
                        while (true) {
                            i31 = iArr11[i21];
                            iArr12 = iArr3;
                            if (i31 >= 0 || (iArr12[i31] & 1) != 0) {
                                break;
                            }
                            iArr11[i21] = i31 - 1;
                            iArr3 = iArr12;
                        }
                        if (i31 < 0) {
                            iArr11[i21] = i30;
                            while (true) {
                                i35 = iArr11[i21];
                                if (i35 < iArr6[i21] || (iArr12[i35] & 1) != 0) {
                                    break;
                                }
                                iArr11[i21] = i35 + 1;
                            }
                        }
                        if (i19 == 2 && iArr11[i21] != iArr6[i21]) {
                            while (true) {
                                i33 = iArr6[i21];
                                if (i33 >= jArrCopyOf2.length - 1) {
                                    break;
                                }
                                i34 = i33 + 1;
                                if (jArrCopyOf2[i34] > j11) {
                                    break;
                                }
                                iArr6[i21] = i34;
                            }
                        }
                        int i58 = iArr6[i21];
                        i32 = iArr11[i21];
                        int i59 = (i58 - i32) + i57;
                        if (i20 != i32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i20 = i58;
                        z4 = z9 | z10;
                        i29 = i59;
                    } else {
                        i29 = i22;
                        iArr12 = iArr3;
                    }
                    i21++;
                    jArr4 = jArr4;
                    iArr3 = iArr12;
                    iArr5 = iArr11;
                    c15648 = c15648;
                    i22 = i29;
                }
                c15649 = c15648;
                jArr5 = jArr4;
                iArr7 = iArr5;
                boolean z11 = z4;
                i23 = i22;
                iArr8 = iArr3;
                if (i23 != i16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z11 | z5;
                if (z6) {
                    jArr6 = new long[i23];
                } else {
                    jArr6 = jArrCopyOf;
                }
                if (z6) {
                    iArr9 = new int[i23];
                } else {
                    iArr9 = iArr4;
                }
                if (z6) {
                    i11 = 0;
                }
                if (z6) {
                    iArr10 = new int[i23];
                } else {
                    iArr10 = iArr8;
                }
                jArr7 = new long[i23];
                jArr8 = jArrCopyOf2;
                i24 = i11;
                z7 = false;
                i25 = 0;
                i26 = 0;
                j8 = 0;
                while (i25 < jArr5.length) {
                    j9 = jArr3[i25];
                    i27 = iArr7[i25];
                    int[] iArr16 = iArr7;
                    i28 = iArr6[i25];
                    if (z6) {
                        int i60 = i28 - i27;
                        System.arraycopy(jArrCopyOf, i27, jArr6, i26, i60);
                        System.arraycopy(iArr4, i27, iArr9, i26, i60);
                        System.arraycopy(iArr8, i27, iArr10, i26, i60);
                    }
                    int i61 = i24;
                    while (i27 < i28) {
                        int[] iArr17 = iArr8;
                        int i62 = i28;
                        long j21 = c19215M44551.f62154;
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long jM194714 = C7116.m19477(j8, 1000000L, j21, roundingMode2);
                        long j22 = j8;
                        jM19478 = C7116.m19477(jArr8[i27] - j9, 1000000L, c19215M44551.f62159, roundingMode2);
                        if (jM19478 < 0) {
                            z8 = true;
                        } else {
                            z8 = z7;
                        }
                        jArr7[i26] = jM194714 + jM19478;
                        if (!z6 && iArr9[i26] > i61) {
                            i61 = iArr4[i27];
                        }
                        i26++;
                        i27++;
                        i28 = i62;
                        z7 = z8;
                        iArr8 = iArr17;
                        j8 = j22;
                    }
                    j8 += jArr5[i25];
                    i25++;
                    iArr7 = iArr16;
                    i24 = i61;
                    iArr6 = iArr6;
                }
                long jM194715 = C7116.m19477(j8, 1000000L, c19215M44551.f62154, RoundingMode.DOWN);
                if (z7) {
                    C20124 c20124M37399 = c15649.m37397();
                    c20124M37399.m46324();
                    c19215M44551 = c19215M44551.m44551(c20124M37399.m46295());
                }
                return new C9518(c19215M44551, jArr6, iArr9, i24, jArr7, iArr10, jM194715);
            }
            i17 = i15;
            iArr4 = iArrCopyOf2;
            i18 = 1;
            if (jArr4.length == 1) {
                if (jArr4[0] == 0) {
                    jArr3.getClass();
                    j12 = jArr3[0];
                    while (i36 < jArrCopyOf2.length) {
                        jArrCopyOf2[i36] = C7116.m19477(jArrCopyOf2[i36] - j12, 1000000L, c19215M44551.f62159, RoundingMode.DOWN);
                    }
                    return new C9518(c19215M44551, jArrCopyOf, iArr4, i11, jArrCopyOf2, iArr3, C7116.m19477(j4 - j12, 1000000L, c19215M44551.f62159, RoundingMode.DOWN));
                }
                i18 = 1;
            }
            i19 = i17;
            if (i19 == i18) {
                z3 = true;
            } else {
                z3 = false;
            }
            iArr5 = new int[jArr4.length];
            iArr6 = new int[jArr4.length];
            jArr3.getClass();
            i20 = 0;
            i21 = 0;
            z4 = false;
            i22 = 0;
            while (i21 < jArr4.length) {
                iArr11 = iArr5;
                j10 = jArr3[i21];
                if (j10 != -1) {
                    boolean z12 = z4;
                    int i510 = i22;
                    long jM194716 = C7116.m19477(jArr4[i21], c19215M44551.f62159, c19215M44551.f62154, RoundingMode.DOWN);
                    iArr11[i21] = C7116.m19505(jArrCopyOf2, j10, true);
                    j11 = j10 + jM194716;
                    iArr6[i21] = C7116.m19472(jArrCopyOf2, j11, z3);
                    i30 = iArr11[i21];
                    while (true) {
                        i31 = iArr11[i21];
                        iArr12 = iArr3;
                        if (i31 >= 0) {
                            break;
                        }
                        break;
                        break;
                        iArr11[i21] = i31 - 1;
                        iArr3 = iArr12;
                    }
                    if (i31 < 0) {
                        iArr11[i21] = i30;
                        while (true) {
                            i35 = iArr11[i21];
                            if (i35 < iArr6[i21]) {
                                break;
                            }
                            break;
                            break;
                            iArr11[i21] = i35 + 1;
                        }
                    }
                    if (i19 == 2) {
                        while (true) {
                            i33 = iArr6[i21];
                            if (i33 >= jArrCopyOf2.length - 1) {
                                break;
                                break;
                            }
                            i34 = i33 + 1;
                            if (jArrCopyOf2[i34] > j11) {
                                break;
                                break;
                            }
                            iArr6[i21] = i34;
                        }
                    }
                    int i511 = iArr6[i21];
                    i32 = iArr11[i21];
                    int i512 = (i511 - i32) + i510;
                    if (i20 != i32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i20 = i511;
                    z4 = z9 | z12;
                    i29 = i512;
                } else {
                    i29 = i22;
                    iArr12 = iArr3;
                }
                i21++;
                jArr4 = jArr4;
                iArr3 = iArr12;
                iArr5 = iArr11;
                c15648 = c15648;
                i22 = i29;
            }
            c15649 = c15648;
            jArr5 = jArr4;
            iArr7 = iArr5;
            boolean z13 = z4;
            i23 = i22;
            iArr8 = iArr3;
            if (i23 != i16) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z13 | z5;
            if (z6) {
                jArr6 = new long[i23];
            } else {
                jArr6 = jArrCopyOf;
            }
            if (z6) {
                iArr9 = new int[i23];
            } else {
                iArr9 = iArr4;
            }
            if (z6) {
                i11 = 0;
            }
            if (z6) {
                iArr10 = new int[i23];
            } else {
                iArr10 = iArr8;
            }
            jArr7 = new long[i23];
            jArr8 = jArrCopyOf2;
            i24 = i11;
            z7 = false;
            i25 = 0;
            i26 = 0;
            j8 = 0;
            while (i25 < jArr5.length) {
                j9 = jArr3[i25];
                i27 = iArr7[i25];
                int[] iArr18 = iArr7;
                i28 = iArr6[i25];
                if (z6) {
                    int i63 = i28 - i27;
                    System.arraycopy(jArrCopyOf, i27, jArr6, i26, i63);
                    System.arraycopy(iArr4, i27, iArr9, i26, i63);
                    System.arraycopy(iArr8, i27, iArr10, i26, i63);
                }
                int i64 = i24;
                while (i27 < i28) {
                    int[] iArr19 = iArr8;
                    int i65 = i28;
                    long j23 = c19215M44551.f62154;
                    RoundingMode roundingMode3 = RoundingMode.DOWN;
                    long jM194717 = C7116.m19477(j8, 1000000L, j23, roundingMode3);
                    long j24 = j8;
                    jM19478 = C7116.m19477(jArr8[i27] - j9, 1000000L, c19215M44551.f62159, roundingMode3);
                    if (jM19478 < 0) {
                        z8 = true;
                    } else {
                        z8 = z7;
                    }
                    jArr7[i26] = jM194717 + jM19478;
                    if (!z6) {
                    }
                    i26++;
                    i27++;
                    i28 = i65;
                    z7 = z8;
                    iArr8 = iArr19;
                    j8 = j24;
                }
                j8 += jArr5[i25];
                i25++;
                iArr7 = iArr18;
                i24 = i64;
                iArr6 = iArr6;
            }
            long jM194718 = C7116.m19477(j8, 1000000L, c19215M44551.f62154, RoundingMode.DOWN);
            if (z7) {
                C20124 c20124M373910 = c15649.m37397();
                c20124M373910.m46324();
                c19215M44551 = c19215M44551.m44551(c20124M373910.m46295());
            }
            return new C9518(c19215M44551, jArr6, iArr9, i24, jArr7, iArr10, jM194718);
        }
        iM48513 = 0;
        iM48514 = -1;
        iMo27872 = c13248.mo27872();
        i = iM48514;
        String str3 = c156411.f50848;
        if (iMo27872 == -1) {
            jArr = new long[iMo27871];
            iArr = new int[iMo27871];
            jArr2 = new long[iMo27871];
            iArr2 = new int[iMo27871];
            iM48515 = i;
            C19215 c19218 = c19215M44552;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM48516 = 0;
            i4 = 0;
            iM48500 = 0;
            int i513 = iM48512;
            i5 = iM485110;
            i6 = iM48519;
            i7 = i513;
            while (true) {
                if (i2 >= iMo27871) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM19898 = true;
                while (i4 == 0) {
                    zM19898 = c7260.m19898();
                    if (!zM19898) {
                        break;
                        break;
                    }
                    int i514 = i6;
                    long j110 = c7260.f23924;
                    i4 = c7260.f23925;
                    j = j110;
                    i5 = i5;
                    iMo27871 = iMo27871;
                    i6 = i514;
                }
                i12 = iMo27871;
                i8 = i6;
                i13 = i5;
                if (!zM19898) {
                    C1896.m6517("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo27871 = i2;
                    i9 = i4;
                    break;
                }
                if (c212811 != null) {
                    while (iM48516 == 0) {
                        iM48516 = c212811.m48512();
                        iM48500 = c212811.m48500();
                        i7--;
                    }
                    iM48516--;
                }
                int i515 = iM48500;
                jArr[i2] = j;
                iMo27870 = c13248.mo27870();
                iArr[i2] = iMo27870;
                long[] jArr14 = jArr;
                int[] iArr110 = iArr;
                j3 += (long) iMo27870;
                if (iMo27870 > i3) {
                    i3 = iMo27870;
                }
                jArr2[i2] = j2 + ((long) i515);
                if (c212810 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM48515) {
                    iArr2[i2] = 1;
                    iM48513--;
                    if (iM48513 > 0) {
                        c212810.getClass();
                        iM48515 = c212810.m48512() - 1;
                    }
                }
                j2 += (long) i13;
                iM48517 = i8 - 1;
                if (iM48517 == 0) {
                    iM48501 = i13;
                } else {
                    iM48501 = i13;
                }
                i6 = iM48517;
                int i516 = iM48501;
                j += (long) iArr110[i2];
                i4--;
                i2++;
                iM48500 = i515;
                jArr = jArr14;
                iArr = iArr110;
                iMo27871 = i12;
                i5 = i516;
            }
            long j111 = j2 + ((long) iM48500);
            if (c212811 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c212811.m48512() != 0) {
                    z2 = false;
                    break;
                }
                c212811.m48500();
                i7--;
            }
            if (iM48513 != 0) {
                i10 = iM48516;
                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                c19216 = c19218;
                sb2.append(c19216.f62158);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iM48513);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i8);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i9);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(iM48518);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb2.append(str);
                C1896.m6517(sb2.toString());
            } else {
                i10 = iM48516;
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                c19216 = c19218;
                sb3.append(c19216.f62158);
                sb3.append(": remainingSynchronizationSamples ");
                sb3.append(iM48513);
                sb3.append(", remainingSamplesAtTimestampDelta ");
                sb3.append(i8);
                sb3.append(", remainingSamplesInChunk ");
                sb3.append(i9);
                sb3.append(", remainingTimestampDeltaChanges ");
                sb3.append(iM48518);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                C1896.m6517(sb3.toString());
            }
            j4 = j111;
            i11 = i3;
            j5 = j3;
        } else {
            jArr = new long[iMo27871];
            iArr = new int[iMo27871];
            jArr2 = new long[iMo27871];
            iArr2 = new int[iMo27871];
            iM48515 = i;
            C19215 c19219 = c19215M44552;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            iM48516 = 0;
            i4 = 0;
            iM48500 = 0;
            int i517 = iM48512;
            i5 = iM485110;
            i6 = iM48519;
            i7 = i517;
            while (true) {
                if (i2 >= iMo27871) {
                    jArrCopyOf = jArr;
                    i8 = i6;
                    jArrCopyOf2 = jArr2;
                    iArrCopyOf = iArr2;
                    i9 = i4;
                    iArrCopyOf2 = iArr;
                    break;
                }
                zM19898 = true;
                while (i4 == 0) {
                    zM19898 = c7260.m19898();
                    if (!zM19898) {
                        break;
                        break;
                    }
                    int i518 = i6;
                    long j112 = c7260.f23924;
                    i4 = c7260.f23925;
                    j = j112;
                    i5 = i5;
                    iMo27871 = iMo27871;
                    i6 = i518;
                }
                i12 = iMo27871;
                i8 = i6;
                i13 = i5;
                if (!zM19898) {
                    C1896.m6517("Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArr, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArr, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArr2, i2);
                    iArrCopyOf = Arrays.copyOf(iArr2, i2);
                    iMo27871 = i2;
                    i9 = i4;
                    break;
                }
                if (c212811 != null) {
                    while (iM48516 == 0) {
                        iM48516 = c212811.m48512();
                        iM48500 = c212811.m48500();
                        i7--;
                    }
                    iM48516--;
                }
                int i519 = iM48500;
                jArr[i2] = j;
                iMo27870 = c13248.mo27870();
                iArr[i2] = iMo27870;
                long[] jArr15 = jArr;
                int[] iArr111 = iArr;
                j3 += (long) iMo27870;
                if (iMo27870 > i3) {
                    i3 = iMo27870;
                }
                jArr2[i2] = j2 + ((long) i519);
                if (c212810 == null) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                iArr2[i2] = i14;
                if (i2 == iM48515) {
                    iArr2[i2] = 1;
                    iM48513--;
                    if (iM48513 > 0) {
                        c212810.getClass();
                        iM48515 = c212810.m48512() - 1;
                    }
                }
                j2 += (long) i13;
                iM48517 = i8 - 1;
                if (iM48517 == 0) {
                    iM48501 = i13;
                } else {
                    iM48501 = i13;
                }
                i6 = iM48517;
                int i5110 = iM48501;
                j += (long) iArr111[i2];
                i4--;
                i2++;
                iM48500 = i519;
                jArr = jArr15;
                iArr = iArr111;
                iMo27871 = i12;
                i5 = i5110;
            }
            long j113 = j2 + ((long) iM48500);
            if (c212811 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i7 <= 0) {
                    z2 = true;
                    break;
                }
                if (c212811.m48512() != 0) {
                    z2 = false;
                    break;
                }
                c212811.m48500();
                i7--;
            }
            if (iM48513 != 0) {
                i10 = iM48516;
                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                c19216 = c19219;
                sb4.append(c19216.f62158);
                sb4.append(": remainingSynchronizationSamples ");
                sb4.append(iM48513);
                sb4.append(", remainingSamplesAtTimestampDelta ");
                sb4.append(i8);
                sb4.append(", remainingSamplesInChunk ");
                sb4.append(i9);
                sb4.append(", remainingTimestampDeltaChanges ");
                sb4.append(iM48518);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                C1896.m6517(sb4.toString());
            } else {
                i10 = iM48516;
                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                c19216 = c19219;
                sb5.append(c19216.f62158);
                sb5.append(": remainingSynchronizationSamples ");
                sb5.append(iM48513);
                sb5.append(", remainingSamplesAtTimestampDelta ");
                sb5.append(i8);
                sb5.append(", remainingSamplesInChunk ");
                sb5.append(i9);
                sb5.append(", remainingTimestampDeltaChanges ");
                sb5.append(iM48518);
                sb5.append(", remainingSamplesAtTimestampOffset ");
                sb5.append(i10);
                if (z2) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb5.append(str);
                C1896.m6517(sb5.toString());
            }
            j4 = j113;
            i11 = i3;
            j5 = j3;
        }
        j6 = c19216.f62157;
        if (j6 > 0) {
            jM19479 = C7116.m19477(j5 * 8, 1000000L, j6, RoundingMode.HALF_DOWN);
            if (jM19479 > 0) {
                c19215M44551 = c19216;
            } else {
                c19215M44551 = c19216;
            }
        } else {
            c19215M44551 = c19216;
        }
        j7 = c19215M44551.f62159;
        c15648 = c19215M44551.f62163;
        i15 = c19215M44551.f62160;
        jArr3 = c19215M44551.f62155;
        long[] jArr16 = c19215M44551.f62162;
        RoundingMode roundingMode4 = RoundingMode.DOWN;
        i16 = iMo27871;
        jArr4 = jArr16;
        iArr3 = iArrCopyOf;
        jM19477 = C7116.m19477(j4, 1000000L, j7, roundingMode4);
        if (jArr4 == null) {
            C7116.m19486(jArrCopyOf2, j7);
            return new C9518(c19215M44551, jArrCopyOf, iArrCopyOf2, i11, jArrCopyOf2, iArr3, jM19477);
        }
        if (jArr4.length != 1) {
            i17 = i15;
            iArr4 = iArrCopyOf2;
        } else {
            i17 = i15;
            iArr4 = iArrCopyOf2;
        }
        i18 = 1;
        if (jArr4.length == 1) {
            if (jArr4[0] == 0) {
                jArr3.getClass();
                j12 = jArr3[0];
                while (i36 < jArrCopyOf2.length) {
                    jArrCopyOf2[i36] = C7116.m19477(jArrCopyOf2[i36] - j12, 1000000L, c19215M44551.f62159, RoundingMode.DOWN);
                }
                return new C9518(c19215M44551, jArrCopyOf, iArr4, i11, jArrCopyOf2, iArr3, C7116.m19477(j4 - j12, 1000000L, c19215M44551.f62159, RoundingMode.DOWN));
            }
            i18 = 1;
        }
        i19 = i17;
        if (i19 == i18) {
            z3 = true;
        } else {
            z3 = false;
        }
        iArr5 = new int[jArr4.length];
        iArr6 = new int[jArr4.length];
        jArr3.getClass();
        i20 = 0;
        i21 = 0;
        z4 = false;
        i22 = 0;
        while (i21 < jArr4.length) {
            iArr11 = iArr5;
            j10 = jArr3[i21];
            if (j10 != -1) {
                boolean z14 = z4;
                int i5111 = i22;
                long jM194719 = C7116.m19477(jArr4[i21], c19215M44551.f62159, c19215M44551.f62154, RoundingMode.DOWN);
                iArr11[i21] = C7116.m19505(jArrCopyOf2, j10, true);
                j11 = j10 + jM194719;
                iArr6[i21] = C7116.m19472(jArrCopyOf2, j11, z3);
                i30 = iArr11[i21];
                while (true) {
                    i31 = iArr11[i21];
                    iArr12 = iArr3;
                    if (i31 >= 0) {
                        break;
                        break;
                    }
                    break;
                    break;
                    iArr11[i21] = i31 - 1;
                    iArr3 = iArr12;
                }
                if (i31 < 0) {
                    iArr11[i21] = i30;
                    while (true) {
                        i35 = iArr11[i21];
                        if (i35 < iArr6[i21]) {
                            break;
                            break;
                        }
                        break;
                        break;
                        iArr11[i21] = i35 + 1;
                    }
                }
                if (i19 == 2) {
                    while (true) {
                        i33 = iArr6[i21];
                        if (i33 >= jArrCopyOf2.length - 1) {
                            break;
                            break;
                        }
                        i34 = i33 + 1;
                        if (jArrCopyOf2[i34] > j11) {
                            break;
                            break;
                        }
                        iArr6[i21] = i34;
                    }
                }
                int i5112 = iArr6[i21];
                i32 = iArr11[i21];
                int i5113 = (i5112 - i32) + i5111;
                if (i20 != i32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i20 = i5112;
                z4 = z9 | z14;
                i29 = i5113;
            } else {
                i29 = i22;
                iArr12 = iArr3;
            }
            i21++;
            jArr4 = jArr4;
            iArr3 = iArr12;
            iArr5 = iArr11;
            c15648 = c15648;
            i22 = i29;
        }
        c15649 = c15648;
        jArr5 = jArr4;
        iArr7 = iArr5;
        boolean z15 = z4;
        i23 = i22;
        iArr8 = iArr3;
        if (i23 != i16) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z15 | z5;
        if (z6) {
            jArr6 = new long[i23];
        } else {
            jArr6 = jArrCopyOf;
        }
        if (z6) {
            iArr9 = new int[i23];
        } else {
            iArr9 = iArr4;
        }
        if (z6) {
            i11 = 0;
        }
        if (z6) {
            iArr10 = new int[i23];
        } else {
            iArr10 = iArr8;
        }
        jArr7 = new long[i23];
        jArr8 = jArrCopyOf2;
        i24 = i11;
        z7 = false;
        i25 = 0;
        i26 = 0;
        j8 = 0;
        while (i25 < jArr5.length) {
            j9 = jArr3[i25];
            i27 = iArr7[i25];
            int[] iArr112 = iArr7;
            i28 = iArr6[i25];
            if (z6) {
                int i66 = i28 - i27;
                System.arraycopy(jArrCopyOf, i27, jArr6, i26, i66);
                System.arraycopy(iArr4, i27, iArr9, i26, i66);
                System.arraycopy(iArr8, i27, iArr10, i26, i66);
            }
            int i67 = i24;
            while (i27 < i28) {
                int[] iArr113 = iArr8;
                int i68 = i28;
                long j25 = c19215M44551.f62154;
                RoundingMode roundingMode5 = RoundingMode.DOWN;
                long jM1947110 = C7116.m19477(j8, 1000000L, j25, roundingMode5);
                long j26 = j8;
                jM19478 = C7116.m19477(jArr8[i27] - j9, 1000000L, c19215M44551.f62159, roundingMode5);
                if (jM19478 < 0) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                jArr7[i26] = jM1947110 + jM19478;
                if (!z6) {
                }
                i26++;
                i27++;
                i28 = i68;
                z7 = z8;
                iArr8 = iArr113;
                j8 = j26;
            }
            j8 += jArr5[i25];
            i25++;
            iArr7 = iArr112;
            i24 = i67;
            iArr6 = iArr6;
        }
        long jM1947111 = C7116.m19477(j8, 1000000L, c19215M44551.f62154, RoundingMode.DOWN);
        if (z7) {
            C20124 c20124M373911 = c15649.m37397();
            c20124M373911.m46324();
            c19215M44551 = c19215M44551.m44551(c20124M373911.m46295());
        }
        return new C9518(c19215M44551, jArr6, iArr9, i24, jArr7, iArr10, jM1947111);
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
    public static void m29521(C21287 c21287, int i, int i2, int i3, int i4, String str, int i5, C22362 c22362, C19961 c19961, int i6) throws C2970 {
        int i7;
        int i8;
        int i9;
        int i10;
        C6197 c6197;
        String str2;
        ByteBuffer byteBufferOrder;
        float fM48512;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM35163;
        int i19;
        C1259 c1259M26329;
        int i20;
        int iM35164;
        int i21;
        String str3;
        int i22 = i2;
        int i23 = i3;
        C22362 c22362M50439 = c22362;
        C19961 c19962 = c19961;
        c21287.m48510(i22 + 16);
        c21287.m48503(16);
        int iM48494 = c21287.m48494();
        int iM48495 = c21287.m48494();
        c21287.m48503(50);
        int iM48516 = c21287.m48516();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM29514 = m29514(c21287, i22, i23);
            if (pairM29514 != null) {
                iIntValue = ((Integer) pairM29514.first).intValue();
                c22362M50439 = c22362M50439 == null ? null : c22362M50439.m50439(((C10264) pairM29514.second).f32791);
                c19962.f64163[i6] = (C10264) pairM29514.second;
            }
            c21287.m48510(iM48516);
        }
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i24 = -1;
        List listM51441 = null;
        int i25 = -1;
        C8751 c8751 = null;
        C13971 c13971M29517 = null;
        boolean z = false;
        ByteBuffer byteBuffer = null;
        String str5 = null;
        byte[] bArr = null;
        C6197 c6198 = null;
        int i26 = 8;
        int i27 = 8;
        int iM4559 = -1;
        int i28 = -1;
        float f = 1.0f;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        C22362 c22363 = c22362M50439;
        int i32 = -1;
        while (iM48516 - i22 < i23) {
            c21287.m48510(iM48516);
            int iM48517 = c21287.m48516();
            int i33 = iM48516;
            int iM48500 = c21287.m48500();
            if (iM48500 == 0 && c21287.m48516() - i22 == i23) {
                break;
            }
            C5332.m15985("childAtomSize must be positive", iM48500 > 0);
            int iM48501 = c21287.m48500();
            if (iM48501 == 1635148611) {
                C5332.m15985(null, str4 == null);
                c21287.m48510(iM48517 + 8);
                C12153 c12153M30362 = C12153.m30362(c21287);
                ArrayList arrayList = c12153M30362.f39066;
                c19962.f64162 = c12153M30362.f39068;
                float f2 = !z ? c12153M30362.f39075 : f;
                String str6 = c12153M30362.f39067;
                int i34 = c12153M30362.f39064;
                int i35 = c12153M30362.f39072;
                int i36 = c12153M30362.f39074;
                iM4559 = c12153M30362.f39070;
                byteBufferOrder = byteBuffer;
                str5 = str6;
                i30 = i34;
                f = f2;
                i27 = c12153M30362.f39073;
                i26 = c12153M30362.f39065;
                i24 = i35;
                i28 = i36;
                str4 = "video/avc";
                listM51441 = arrayList;
            } else {
                int i37 = i32;
                if (iM48501 == 1752589123) {
                    C5332.m15985(null, str4 == null);
                    c21287.m48510(iM48517 + 8);
                    C3840 c3840M12380 = C3840.m12380(c21287);
                    List list = c3840M12380.f13078;
                    c19962.f64162 = c3840M12380.f13090;
                    float f3 = !z ? c3840M12380.f13088 : f;
                    int i38 = c3840M12380.f13096;
                    int i39 = c3840M12380.f13089;
                    String str7 = c3840M12380.f13083;
                    int i40 = c3840M12380.f13092;
                    if (i40 != -1) {
                        i37 = i40;
                    }
                    int i41 = c3840M12380.f13081;
                    int i42 = c3840M12380.f13086;
                    i24 = c3840M12380.f13091;
                    int i43 = c3840M12380.f13094;
                    int i44 = c3840M12380.f13087;
                    int i45 = c3840M12380.f13093;
                    int i46 = c3840M12380.f13080;
                    C6197 c6199 = c3840M12380.f13085;
                    c19962.f64164 = c3840M12380.f13095;
                    i30 = i38;
                    i31 = i39;
                    str5 = str7;
                    i25 = i41;
                    i27 = i45;
                    i26 = i46;
                    c6198 = c6199;
                    str4 = "video/hevc";
                    f = f3;
                    i28 = i43;
                    listM51441 = list;
                    i32 = i37;
                    i29 = i42;
                    iM4559 = i44;
                    byteBufferOrder = byteBuffer;
                } else {
                    String str8 = "childAtomSize must be positive";
                    if (iM48501 == 1818785347) {
                        C5332.m15985("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                        C5332.m15985("must have at least two layers", c6198 != null && c6198.f21095.size() >= 2);
                        c21287.m48510(iM48517 + 8);
                        c6198.getClass();
                        C3840 c3840M12381 = C3840.m12381(c21287, c6198);
                        C5332.m15985("invalid lhvC parameter sets", (c3840M12381.f13082 || c3840M12381.f13079 || c3840M12381.f13084) ? false : true);
                        C5332.m15985("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c19962.f64162 == c3840M12381.f13090);
                        int i47 = c3840M12381.f13091;
                        if (i47 != -1) {
                            C5332.m15985("colorSpace must be the same for both views", i24 == i47);
                        }
                        int i48 = c3840M12381.f13094;
                        if (i48 != -1) {
                            C5332.m15985("colorRange must be the same for both views", i28 == i48);
                        }
                        int i49 = c3840M12381.f13087;
                        if (i49 != -1) {
                            C5332.m15985("colorTransfer must be the same for both views", iM4559 == i49);
                        }
                        C5332.m15985("bitdepthLuma must be the same for both views", i27 == c3840M12381.f13093);
                        C5332.m15985("bitdepthChroma must be the same for both views", i26 == c3840M12381.f13080);
                        if (listM51441 != null) {
                            int i50 = AbstractC1928.f6477;
                            C22811 c22811 = new C22811();
                            c22811.m19806(listM51441);
                            c22811.m19806(c3840M12381.f13078);
                            listM51441 = c22811.m51441();
                        } else {
                            C5332.m15985("initializationData must be already set from hvcC atom", false);
                        }
                        String str9 = c3840M12381.f13083;
                        c19962.f64164 = false;
                        byteBufferOrder = byteBuffer;
                        str5 = str9;
                        str4 = "video/mv-hevc";
                        i32 = i37;
                    } else {
                        if (iM48501 == 1986361461) {
                            c21287.m48510(iM48517 + 8);
                            int iM48518 = c21287.m48516();
                            C5045 c5045 = null;
                            while (iM48518 - iM48517 < iM48500) {
                                c21287.m48510(iM48518);
                                int iM48502 = c21287.m48500();
                                String str10 = str8;
                                C5332.m15985(str10, iM48502 > 0);
                                int i51 = i26;
                                if (c21287.m48500() == 1702454643) {
                                    c21287.m48510(iM48518 + 8);
                                    int iM48519 = c21287.m48516();
                                    while (true) {
                                        if (iM48519 - iM48518 >= iM48502) {
                                            str3 = str10;
                                            c5045 = null;
                                            break;
                                        }
                                        c21287.m48510(iM48519);
                                        int iM48503 = c21287.m48500();
                                        C5332.m15985(str10, iM48503 > 0);
                                        str3 = str10;
                                        if (c21287.m48500() == 1937011305) {
                                            c21287.m48503(4);
                                            int iM48493 = c21287.m48493();
                                            c5045 = new C5045(new C22945((iM48493 & 1) == 1, (iM48493 & 2) == 2, (iM48493 & 8) == 8));
                                            break;
                                        }
                                        iM48519 += iM48503;
                                        str10 = str3;
                                    }
                                } else {
                                    str3 = str10;
                                }
                                iM48518 += iM48502;
                                i26 = i51;
                                str8 = str3;
                                i27 = i27;
                                i28 = i28;
                            }
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            C2062 c2062 = c5045 == null ? null : new C2062(c5045);
                            if (c2062 == null) {
                                i32 = i37;
                            } else if (c6198 == null || c6198.f21095.size() < 2) {
                                i32 = i37;
                                if (i32 == -1) {
                                    i32 = c2062.f6860.f17467.f74553 ? 5 : 4;
                                }
                            } else {
                                C5332.m15985("both eye views must be marked as available", c2062.m7117());
                                C5332.m15985("for MV-HEVC, eye_views_reversed must be set to false", !c2062.f6860.f17467.f74553);
                                i32 = i37;
                            }
                            byteBufferOrder = byteBuffer;
                            i11 = iIntValue;
                        } else {
                            i7 = i26;
                            i8 = i27;
                            i9 = i28;
                            i32 = i37;
                            if (iM48501 == 1685480259 || iM48501 == 1685485123 || iM48501 == 1685485379) {
                                i10 = i32;
                                c6197 = c6198;
                                int i52 = iM48500 - 8;
                                byte[] bArr2 = new byte[i52];
                                c21287.m48490(0, i52, bArr2);
                                if (listM51441 != null) {
                                    int i53 = AbstractC1928.f6477;
                                    C22811 c22812 = new C22811();
                                    c22812.m19806(listM51441);
                                    c22812.m19807(bArr2);
                                    listM51441 = c22812.m51441();
                                } else {
                                    C5332.m15985("initializationData must already be set from hvcC or avcC atom", false);
                                }
                                c21287.m48510(iM48517 + 8);
                                C4705 c4705M14596 = C4705.m14596(c21287);
                                if (c4705M14596 != null) {
                                    str2 = c4705M14596.f16606;
                                    str4 = "video/dolby-vision";
                                } else {
                                    str2 = str5;
                                }
                                byteBufferOrder = byteBuffer;
                                fM48512 = f;
                            } else {
                                int i54 = 12;
                                if (iM48501 == 1987076931) {
                                    C5332.m15985(null, str4 == null);
                                    int i55 = iIntValue;
                                    String str11 = i55 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c21287.m48510(iM48517 + 12);
                                    byte bM48493 = (byte) c21287.m48493();
                                    byte bM48494 = (byte) c21287.m48493();
                                    int iM48496 = c21287.m48493();
                                    i26 = iM48496 >> 4;
                                    byte b = (byte) ((iM48496 >> 1) & 7);
                                    if (str11.equals("video/x-vnd.on2.vp9")) {
                                        int i56 = C21528.f68786;
                                        listM51441 = AbstractC1928.of((Object) new byte[]{1, 1, bM48493, 2, 1, bM48494, 3, 1, (byte) i26, 4, 1, b});
                                    }
                                    boolean z2 = (iM48496 & 1) != 0;
                                    int iM48497 = c21287.m48493();
                                    int iM48498 = c21287.m48493();
                                    int iM4561 = C1259.m4561(iM48497);
                                    byteBufferOrder = byteBuffer;
                                    str4 = str11;
                                    i28 = z2 ? 1 : 2;
                                    i24 = iM4561;
                                    iM4559 = C1259.m4559(iM48498);
                                    iIntValue = i55;
                                    i27 = i26;
                                } else {
                                    i11 = iIntValue;
                                    if (iM48501 == 1635135811) {
                                        int i57 = iM48500 - 8;
                                        byte[] bArr3 = new byte[i57];
                                        c21287.m48490(0, i57, bArr3);
                                        listM51441 = AbstractC1928.of((Object) bArr3);
                                        c21287.m48510(iM48517 + 8);
                                        C10207 c10207 = new C10207();
                                        byte[] bArrM48497 = c21287.m48497();
                                        C14573 c14573 = new C14573(bArrM48497, bArrM48497.length);
                                        c14573.m35167(c21287.m48516() * 8);
                                        c14573.m35160(1);
                                        int iM35165 = c14573.m35163(3);
                                        c14573.m35161(6);
                                        boolean zM35162 = c14573.m35162();
                                        boolean zM35163 = c14573.m35162();
                                        int i58 = 2;
                                        if (iM35165 != 2) {
                                            if (iM35165 <= i58) {
                                                if (zM35162) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c10207.m26333(i15);
                                                if (zM35162) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c10207.m26330(i16);
                                            }
                                        } else if (zM35162) {
                                            c10207.m26333(zM35163 ? 12 : 10);
                                            c10207.m26330(zM35163 ? 12 : 10);
                                        } else {
                                            i58 = 2;
                                            if (iM35165 <= i58) {
                                                if (zM35162) {
                                                    i15 = 10;
                                                } else {
                                                    i15 = 8;
                                                }
                                                c10207.m26333(i15);
                                                if (zM35162) {
                                                    i16 = 10;
                                                } else {
                                                    i16 = 8;
                                                }
                                                c10207.m26330(i16);
                                            }
                                        }
                                        c14573.m35161(13);
                                        c14573.m35159();
                                        int iM35166 = c14573.m35163(4);
                                        if (iM35166 != 1) {
                                            C1896.m6513("Unsupported obu_type: " + iM35166);
                                            c1259M26329 = c10207.m26329();
                                        } else if (c14573.m35162()) {
                                            C1896.m6513("Unsupported obu_extension_flag");
                                            c1259M26329 = c10207.m26329();
                                        } else {
                                            boolean zM35164 = c14573.m35162();
                                            c14573.m35159();
                                            if (zM35164 && c14573.m35163(8) > 127) {
                                                C1896.m6513("Excessive obu_size");
                                                c1259M26329 = c10207.m26329();
                                            } else {
                                                int iM35167 = c14573.m35163(3);
                                                c14573.m35159();
                                                if (c14573.m35162()) {
                                                    C1896.m6513("Unsupported reduced_still_picture_header");
                                                    c1259M26329 = c10207.m26329();
                                                } else if (c14573.m35162()) {
                                                    C1896.m6513("Unsupported timing_info_present_flag");
                                                    c1259M26329 = c10207.m26329();
                                                } else if (c14573.m35162()) {
                                                    C1896.m6513("Unsupported initial_display_delay_present_flag");
                                                    c1259M26329 = c10207.m26329();
                                                } else {
                                                    int i59 = 5;
                                                    int iM35168 = c14573.m35163(5);
                                                    int i60 = 0;
                                                    while (i60 <= iM35168) {
                                                        c14573.m35161(i54);
                                                        if (c14573.m35163(i59) > 7) {
                                                            c14573.m35159();
                                                        }
                                                        i60++;
                                                        i59 = 5;
                                                        i54 = 12;
                                                    }
                                                    int iM35169 = c14573.m35163(4);
                                                    int iM351610 = c14573.m35163(4);
                                                    c14573.m35161(iM35169 + 1);
                                                    c14573.m35161(iM351610 + 1);
                                                    if (c14573.m35162()) {
                                                        i17 = 7;
                                                        c14573.m35161(7);
                                                    } else {
                                                        i17 = 7;
                                                    }
                                                    c14573.m35161(i17);
                                                    boolean zM35165 = c14573.m35162();
                                                    if (zM35165) {
                                                        c14573.m35161(2);
                                                    }
                                                    if (c14573.m35162()) {
                                                        i18 = 1;
                                                        iM35163 = 2;
                                                    } else {
                                                        i18 = 1;
                                                        iM35163 = c14573.m35163(1);
                                                    }
                                                    if (iM35163 > 0 && !c14573.m35162()) {
                                                        c14573.m35161(i18);
                                                    }
                                                    if (zM35165) {
                                                        i19 = 3;
                                                        c14573.m35161(3);
                                                    } else {
                                                        i19 = 3;
                                                    }
                                                    c14573.m35161(i19);
                                                    boolean zM35166 = c14573.m35162();
                                                    if (iM35167 == 2 && zM35166) {
                                                        c14573.m35159();
                                                    }
                                                    boolean z3 = iM35167 != 1 && c14573.m35162();
                                                    if (c14573.m35162()) {
                                                        int iM351611 = c14573.m35163(8);
                                                        int iM351612 = c14573.m35163(8);
                                                        int iM351613 = c14573.m35163(8);
                                                        if (z3) {
                                                            i20 = 1;
                                                        } else {
                                                            i20 = 1;
                                                            if (iM351611 == 1 && iM351612 == 13 && iM351613 == 0) {
                                                                iM35164 = 1;
                                                            }
                                                            c10207.m26332(C1259.m4561(iM351611));
                                                            if (iM35164 == i20) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = 2;
                                                            }
                                                            c10207.m26334(i21);
                                                            c10207.m26335(C1259.m4559(iM351612));
                                                        }
                                                        iM35164 = c14573.m35163(i20);
                                                        c10207.m26332(C1259.m4561(iM351611));
                                                        if (iM35164 == i20) {
                                                            i21 = 1;
                                                        } else {
                                                            i21 = 2;
                                                        }
                                                        c10207.m26334(i21);
                                                        c10207.m26335(C1259.m4559(iM351612));
                                                    }
                                                    c1259M26329 = c10207.m26329();
                                                }
                                            }
                                        }
                                        i27 = c1259M26329.f4537;
                                        i26 = c1259M26329.f4535;
                                        i24 = c1259M26329.f4536;
                                        i28 = c1259M26329.f4540;
                                        iM4559 = c1259M26329.f4541;
                                        str4 = "video/av01";
                                        iIntValue = i11;
                                        c6197 = c6198;
                                    } else if (iM48501 == 1668050025) {
                                        byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                        byteBufferOrder.position(21);
                                        byteBufferOrder.putShort(c21287.m48511());
                                        byteBufferOrder.putShort(c21287.m48511());
                                    } else {
                                        if (iM48501 == 1835295606) {
                                            byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                            short sM48511 = c21287.m48511();
                                            short sM48512 = c21287.m48511();
                                            short sM48513 = c21287.m48511();
                                            short sM48514 = c21287.m48511();
                                            short sM48515 = c21287.m48511();
                                            short sM48516 = c21287.m48511();
                                            iIntValue = i11;
                                            short sM48517 = c21287.m48511();
                                            c6197 = c6198;
                                            short sM48518 = c21287.m48511();
                                            long jM48485 = c21287.m48485();
                                            long jM48486 = c21287.m48485();
                                            i10 = i32;
                                            byteBufferOrder.position(1);
                                            byteBufferOrder.putShort(sM48515);
                                            byteBufferOrder.putShort(sM48516);
                                            byteBufferOrder.putShort(sM48511);
                                            byteBufferOrder.putShort(sM48512);
                                            byteBufferOrder.putShort(sM48513);
                                            byteBufferOrder.putShort(sM48514);
                                            byteBufferOrder.putShort(sM48517);
                                            byteBufferOrder.putShort(sM48518);
                                            byteBufferOrder.putShort((short) (jM48485 / 10000));
                                            byteBufferOrder.putShort((short) (jM48486 / 10000));
                                        } else {
                                            iIntValue = i11;
                                            i10 = i32;
                                            c6197 = c6198;
                                            if (iM48501 == 1681012275) {
                                                C5332.m15985(null, str4 == null);
                                                str4 = "video/3gpp";
                                            } else {
                                                byte[] bArrCopyOfRange = null;
                                                if (iM48501 == 1702061171) {
                                                    C5332.m15985(null, str4 == null);
                                                    c13971M29517 = m29517(iM48517, c21287);
                                                    str4 = c13971M29517.f44302;
                                                    byte[] bArr4 = c13971M29517.f44303;
                                                    if (bArr4 != null) {
                                                        listM51441 = AbstractC1928.of((Object) bArr4);
                                                    }
                                                } else if (iM48501 == 1651798644) {
                                                    c21287.m48510(iM48517 + 8);
                                                    c21287.m48503(4);
                                                    byteBufferOrder = byteBuffer;
                                                    c8751 = new C8751(c21287.m48485(), c21287.m48485());
                                                } else if (iM48501 == 1885434736) {
                                                    c21287.m48510(iM48517 + 8);
                                                    fM48512 = c21287.m48512() / c21287.m48512();
                                                    z = true;
                                                    byteBufferOrder = byteBuffer;
                                                    str2 = str5;
                                                } else if (iM48501 == 1937126244) {
                                                    int i61 = iM48517 + 8;
                                                    while (i61 - iM48517 < iM48500) {
                                                        c21287.m48510(i61);
                                                        int iM48504 = c21287.m48500();
                                                        if (c21287.m48500() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(c21287.m48497(), i61, iM48504 + i61);
                                                            break;
                                                        }
                                                        i61 += iM48504;
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    bArr = bArrCopyOfRange;
                                                } else if (iM48501 == 1936995172) {
                                                    int iM48499 = c21287.m48493();
                                                    c21287.m48503(3);
                                                    if (iM48499 != 0) {
                                                        i32 = i10;
                                                    } else {
                                                        int iM484910 = c21287.m48493();
                                                        if (iM484910 == 0) {
                                                            i32 = 0;
                                                        } else if (iM484910 == 1) {
                                                            i32 = 1;
                                                        } else if (iM484910 == 2) {
                                                            i32 = 2;
                                                        } else if (iM484910 != 3) {
                                                            i32 = i10;
                                                        } else {
                                                            i32 = 3;
                                                        }
                                                    }
                                                    i26 = i7;
                                                    i27 = i8;
                                                    i28 = i9;
                                                } else {
                                                    if (iM48501 == 1634760259) {
                                                        int i62 = iM48500 - 12;
                                                        byte[] bArr5 = new byte[i62];
                                                        c21287.m48510(iM48517 + 12);
                                                        c21287.m48490(0, i62, bArr5);
                                                        listM51441 = AbstractC1928.of((Object) bArr5);
                                                        C21287 c21288 = new C21287(bArr5);
                                                        C10207 c10208 = new C10207();
                                                        byte[] bArrM48498 = c21288.m48497();
                                                        C14573 c14574 = new C14573(bArrM48498, bArrM48498.length);
                                                        c14574.m35167(c21288.m48516() * 8);
                                                        int i63 = 1;
                                                        c14574.m35160(1);
                                                        int iM351614 = c14574.m35163(8);
                                                        int i64 = 0;
                                                        while (i64 < iM351614) {
                                                            c14574.m35160(i63);
                                                            int iM351615 = c14574.m35163(8);
                                                            for (int i65 = 0; i65 < iM351615; i65++) {
                                                                c14574.m35161(6);
                                                                boolean zM35167 = c14574.m35162();
                                                                c14574.m35159();
                                                                c14574.m35160(11);
                                                                c14574.m35161(4);
                                                                int iM351616 = c14574.m35163(4) + 8;
                                                                c10208.m26333(iM351616);
                                                                c10208.m26330(iM351616);
                                                                c14574.m35160(1);
                                                                if (zM35167) {
                                                                    int iM351617 = c14574.m35163(8);
                                                                    int iM351618 = c14574.m35163(8);
                                                                    c14574.m35160(1);
                                                                    boolean zM35168 = c14574.m35162();
                                                                    c10208.m26332(C1259.m4561(iM351617));
                                                                    c10208.m26334(zM35168 ? 1 : 2);
                                                                    c10208.m26335(C1259.m4559(iM351618));
                                                                }
                                                            }
                                                            i64++;
                                                            i63 = 1;
                                                        }
                                                        C1259 c1259M263210 = c10208.m26329();
                                                        i27 = c1259M263210.f4537;
                                                        i26 = c1259M263210.f4535;
                                                        i13 = c1259M263210.f4536;
                                                        i12 = c1259M263210.f4540;
                                                        i14 = c1259M263210.f4541;
                                                        str4 = "video/apv";
                                                    } else if (iM48501 == 1668246642 && i24 == -1 && iM4559 == -1) {
                                                        int iM48505 = c21287.m48500();
                                                        if (iM48505 == 1852009592 || iM48505 == 1852009571) {
                                                            int iM484911 = c21287.m48494();
                                                            int iM484912 = c21287.m48494();
                                                            c21287.m48503(2);
                                                            boolean z4 = iM48500 == 19 && (c21287.m48493() & 128) != 0;
                                                            int iM4562 = C1259.m4561(iM484911);
                                                            i12 = z4 ? 1 : 2;
                                                            int iM45510 = C1259.m4559(iM484912);
                                                            i26 = i7;
                                                            i27 = i8;
                                                            i13 = iM4562;
                                                            i14 = iM45510;
                                                        } else {
                                                            C1896.m6517("Unsupported color type: " + AbstractC15145.m36443(iM48505));
                                                        }
                                                    }
                                                    byteBufferOrder = byteBuffer;
                                                    iM4559 = i14;
                                                    i24 = i13;
                                                    i28 = i12;
                                                    c6198 = c6197;
                                                    i32 = i10;
                                                }
                                            }
                                            byteBufferOrder = byteBuffer;
                                        }
                                        fM48512 = f;
                                        str2 = str5;
                                    }
                                    byteBufferOrder = byteBuffer;
                                    c6198 = c6197;
                                }
                            }
                            f = fM48512;
                            str5 = str2;
                            c6198 = c6197;
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
            iM48516 = i33 + iM48500;
            i22 = i2;
            i23 = i3;
            c19962 = c19961;
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
        C20124 c20124 = new C20124();
        c20124.m46317(i4);
        c20124.m46315(str4);
        c20124.m46300(str5);
        c20124.m46291(iM48494);
        c20124.m46333(iM48495);
        c20124.m46306(i25);
        c20124.m46312(i29);
        c20124.m46325(f);
        c20124.m46307(i5);
        c20124.m46305(bArr);
        c20124.m46313(i66);
        c20124.m46301(listM51441);
        c20124.m46316(i30);
        c20124.m46331(i31);
        c20124.m46304(c22363);
        c20124.m46321(str);
        C10207 c10209 = new C10207();
        c10209.m26332(i24);
        c10209.m26334(i69);
        c10209.m26335(iM4559);
        c10209.m26331(byteBuffer != null ? byteBuffer.array() : null);
        c10209.m26333(i68);
        c10209.m26330(i67);
        c20124.m46302(c10209.m26329());
        if (c8751 != null) {
            c20124.m46308(C18444.m42974(c8751.f28456));
            c20124.m46322(C18444.m42974(c8751.f28457));
        } else if (c13971M29517 != null) {
            c20124.m46308(C18444.m42974(c13971M29517.f44301));
            c20124.m46322(C18444.m42974(c13971M29517.f44304));
        }
        c19961.f64161 = c20124.m46295();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13971 m29517(int i, C21287 c21287) {
        c21287.m48510(i + 12);
        c21287.m48503(1);
        m29523(c21287);
        c21287.m48503(2);
        int iM48493 = c21287.m48493();
        if ((iM48493 & 128) != 0) {
            c21287.m48503(2);
        }
        if ((iM48493 & 64) != 0) {
            c21287.m48503(c21287.m48493());
        }
        if ((iM48493 & 32) != 0) {
            c21287.m48503(2);
        }
        c21287.m48503(1);
        m29523(c21287);
        String strM25251 = C9681.m25251(c21287.m48493());
        if ("audio/mpeg".equals(strM25251) || "audio/vnd.dts".equals(strM25251) || "audio/vnd.dts.hd".equals(strM25251)) {
            return new C13971(-1L, -1L, strM25251, null);
        }
        c21287.m48503(4);
        long jM48485 = c21287.m48485();
        long jM48486 = c21287.m48485();
        c21287.m48503(1);
        int iM29523 = m29523(c21287);
        byte[] bArr = new byte[iM29523];
        c21287.m48490(0, iM29523, bArr);
        if (jM48486 <= 0) {
            jM48486 = -1;
        }
        return new C13971(jM48486, jM48485 > 0 ? jM48485 : -1L, strM25251, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m29514(C21287 c21287, int i, int i2) throws C2970 {
        int i3;
        int i4;
        int iM48516 = c21287.m48516();
        while (iM48516 - i < i2) {
            c21287.m48510(iM48516);
            int iM48500 = c21287.m48500();
            C5332.m15985("childAtomSize must be positive", iM48500 > 0);
            if (c21287.m48500() == 1936289382) {
                int i5 = iM48516 + 8;
                int i6 = -1;
                Integer numValueOf = null;
                int i7 = 0;
                String strM48488 = null;
                while (i5 - iM48516 < iM48500) {
                    c21287.m48510(i5);
                    int iM48501 = c21287.m48500();
                    int iM48502 = c21287.m48500();
                    if (iM48502 == 1718775137) {
                        numValueOf = Integer.valueOf(c21287.m48500());
                    } else if (iM48502 == 1935894637) {
                        c21287.m48503(4);
                        strM48488 = c21287.m48488(4, StandardCharsets.UTF_8);
                    } else if (iM48502 == 1935894633) {
                        i6 = i5;
                        i7 = iM48501;
                    }
                    i5 += iM48501;
                }
                C10264 c10264 = null;
                Pair pairCreate = null;
                bArr = null;
                byte[] bArr = null;
                if ("cenc".equals(strM48488) || "cbc1".equals(strM48488) || "cens".equals(strM48488) || "cbcs".equals(strM48488)) {
                    C5332.m15985("frma atom is mandatory", numValueOf != null);
                    C5332.m15985("schi atom is mandatory", i6 != -1);
                    int i8 = i6 + 8;
                    while (i8 - i6 < i7) {
                        c21287.m48510(i8);
                        int iM48503 = c21287.m48500();
                        if (c21287.m48500() == 1952804451) {
                            int iM29513 = m29513(c21287.m48500());
                            c21287.m48503(1);
                            if (iM29513 == 0) {
                                c21287.m48503(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iM48493 = c21287.m48493();
                                i3 = iM48493 & 15;
                                i4 = (iM48493 & 240) >> 4;
                            }
                            boolean z = c21287.m48493() == 1;
                            int iM48494 = c21287.m48493();
                            byte[] bArr2 = new byte[16];
                            c21287.m48490(0, 16, bArr2);
                            if (z && iM48494 == 0) {
                                int iM48495 = c21287.m48493();
                                bArr = new byte[iM48495];
                                c21287.m48490(0, iM48495, bArr);
                            }
                            c10264 = new C10264(z, strM48488, iM48494, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iM48503;
                    }
                    C5332.m15985("tenc atom is mandatory", c10264 != null);
                    String str = C7116.f23455;
                    pairCreate = Pair.create(numValueOf, c10264);
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iM48516 += iM48500;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m29523(C21287 c21287) {
        int iM48493 = c21287.m48493();
        int i = iM48493 & 127;
        while ((iM48493 & 128) == 128) {
            iM48493 = c21287.m48493();
            i = (i << 7) | (iM48493 & 127);
        }
        return i;
    }
}
