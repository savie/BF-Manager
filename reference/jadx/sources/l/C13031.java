package l;

import android.R;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import moe.shizuku.server.IShizukuApplication;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۬ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13031 {

    /* JADX INFO: renamed from: ᩻᩸᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f43468 = {3215, -15750, -15752, -15761, -15758, -15763, -15758, -15761, -15774, -15765, -15767, -15756, -15763, -15758, -15745, -15746, -15767, -15767, -15746, -15752, -15746, -15758, -15763, -15746, -15767, -15750, -15752, -15761, -15758, -15763, -15758, -15761, -15774, -15818, -15750, -15753, -15758, -15750, -15768, -15750, -15765, -15765, -15753, -15758, -15752, -15750, -15761, -15758, -15756, -15755, -15750, -15765, -15765, -15764, -15758, -15745, -15748, -15746, -15761, -15818, -15765, -15767, -15756, -15763, -15758, -15745, -15746, -15767, -15768, -15746, -15767, -15763, -15758, -15752, -15746, -15750, -15755, -15745, -15767, -15756, -15758, -15745, -15839, -15752, -15756, -15755, -15768, -15761, -15767, -15750, -15758, -15755, -15761, -15804, -15767, -15746, -15747, -15746, -15767, -15746, -15755, -15752, -15746, -15745, -15804, -15758, -15745, -15768, -15753, -15750, -15774, -15756, -15762, -15761, -15804, -15752, -15756, -15755, -15768, -15761, -15767, -15750, -15758, -15755, -15761, -15777, -15758, -15754, -15746, -15755, -15768, -15758, -15756, -15755, -15799, -15750, -15761, -15758, -15756, -15753, -15750, -15751, -15746, -15753, -15753, -15750, -15774, -15756, -15762, -15761, -15786, -15750, -15755, -15750, -15748, -15746, -15767, -15761, -15758, -15761, -15753, -15746, -15784, -15753, -15750, -15768, -15768, -15755, -15750, -15754, -15746, -15808, -15750, -15818, -15775, -15802, -15824, -15821, -15801, -15819, -15808, -15750, -15818, -15775, -15802, -15824, -15822, -15824, -15801, -15819, -15808, -15801, -15764, -15809, -15802, -15824, -15761, -15746, -15773, -15761, -15768, -15746, -15765, -15750, -15767, -15750, -15761, -15756, -15767, -15750, -15765, -15765, -15839, -15745, -15746, -15768, -15752, -15767, -15758, -15765, -15761, -15758, -15756, -15755, -15757, -15758, -15755, -15761, -15768, -15762, -15754, -15754, -15750, -15767, -15774, -15752, -15756, -15754, -15754, -15746, -15755, -15761, -15760, -15746, -15774, -15763, -15750, -15753, -15762, -15746, -15765, -15750, -15761, -15757, -15768, -15762, -15751, -15759, -15746, -15752, -15761};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f43469;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20945 f43470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f43471;

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[PHI: r10
      0x00c3: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v1 java.lang.Object) binds: [B:31:0x00c1, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x014d A[PHI: r6 r7
      0x014d: PHI (r6v2 l.ۚ֫ᩴ) = (r6v1 l.ۚ֫ᩴ), (r6v3 l.ۚ֫ᩴ) binds: [B:42:0x0124, B:46:0x014b] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r7v7 l.ۚۢۨ) = (r7v2 l.ۚۢۨ), (r7v1 l.ۚۢۨ) binds: [B:42:0x0124, B:46:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13031 m32244(String str, byte[] bArr) {
        int iM45029;
        int i;
        int i2;
        C20945 c20945M47103 = null;
        C13031 c13031 = null;
        C16667 c16667 = null;
        XmlResourceParserC11068 xmlResourceParserC11068M47106 = null;
        int next = 0;
        InterfaceC5046 interfaceC5046M2917 = null;
        InterfaceC5046 interfaceC5046Filter = null;
        InterfaceC14592 list = null;
        Object objCollect = null;
        List list2 = null;
        int i3 = 557821535;
        int i4 = C0629.f2722;
        int i5 = ThreadFactoryC3888.f14547;
        int iM11306 = (i5 - ThreadFactoryC3888.m11306("ۚۜ")) * 17;
        int i6 = ((iM11306 ^ i4) * 26959) ^ (-304629702);
        int i7 = iM11306 ^ 1268483980;
        C5269 c5269 = null;
        C13031 c13032 = null;
        while (true) {
            i3 = i7 ^ (i6 & (((i3 ^ i4) * 3199) >> 31));
            switch (i3) {
                case -1966744383:
                case -1116492693:
                    if (next != 1) {
                        iM45029 = C19806.m45029("᩹᩹") ^ i4;
                        i = ((iM45029 ^ i5) * 29217) ^ 259269073;
                        i2 = -1097295693;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ۚۗ")) * 29;
                        i = ((iM45029 ^ i4) * 4911) ^ 140608967;
                        i2 = -348468002;
                    }
                    int i8 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i8;
                    break;
                case -1895511817:
                case -644007932:
                    C1189.m4368();
                    if (!C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۛ") ^ i4;
                        i = ((iM45029 ^ i5) * 13839) ^ 1803034913;
                        i2 = -1551021625;
                        int i9 = i;
                        i7 = iM45029 ^ i2;
                        i6 = i9;
                    } else {
                        int iM450210 = C19806.m45029("᩵۟") ^ i5;
                        i7 = (-1807731154) ^ iM450210;
                        i6 = ((iM450210 ^ i4) * (-31289)) ^ 1819311972;
                        c5269 = null;
                    }
                    break;
                case -1888264272:
                case 43888312:
                    interfaceC5046Filter = interfaceC5046M2917.filter(c5269);
                    list = C1890.toList();
                    if (C2249.m6915() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i4;
                        i = ((iM45029 ^ i5) * 13165) ^ (-1724701364);
                        i2 = -24889665;
                        int i10 = i;
                        i7 = iM45029 ^ i2;
                        i6 = i10;
                    } else {
                        int iM450211 = C19806.m45029("᩵۟") ^ i5;
                        i7 = (-1807731154) ^ iM450211;
                        i6 = ((iM450211 ^ i4) * (-31289)) ^ 1819311972;
                        c5269 = null;
                    }
                    break;
                case -1557805714:
                case -621891050:
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۛ") ^ i4;
                        i = ((iM45029 ^ i5) * 13839) ^ 1803034913;
                        i2 = -1551021625;
                    } else {
                        iM45029 = C19806.m45029("ۖ֨") ^ i5;
                        i = ((iM45029 ^ i4) * (-9595)) ^ (-1182720250);
                        i2 = -2136820860;
                    }
                    int i11 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i11;
                    break;
                case -1552517464:
                case 575346774:
                    return c13032;
                case -1376516265:
                case 1009760102:
                    try {
                        m32245(next, xmlResourceParserC11068M47106, c16667);
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۧ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i5) * (-3393)) ^ 2013517305;
                        i2 = 132303523;
                    } catch (Exception unused) {
                        iM45029 = (i5 - C19806.m45029("ۚۗ")) * 29;
                        i = ((iM45029 ^ i4) * 4911) ^ 140608967;
                        i2 = -348468002;
                    }
                    int i12 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i12;
                    break;
                case -1327348653:
                case 1808675842:
                    C1398.m4895();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨ۛ")) * (-127);
                        i = ((iM45029 ^ i5) * (-18379)) ^ 1087896219;
                        i2 = 1950716314;
                    } else {
                        iM45029 = C19806.m45029("ܶ֫") ^ i5;
                        i = ((iM45029 ^ i4) * (-3969)) ^ 1570095436;
                        i2 = -1992955833;
                    }
                    int i13 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i13;
                    break;
                case -1289491622:
                case 854454938:
                    list2 = (List) objCollect;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6239(list2)) {
                        iM45029 = C19806.m45029("۬۠") ^ i5;
                        i = ((iM45029 ^ i4) * 31943) ^ (-525570734);
                        i2 = 276149331;
                    } else {
                        iM45029 = C19806.m45029("֡ۖ") ^ i5;
                        i = ((iM45029 ^ i4) * 5521) ^ 1861865721;
                        i2 = -524939238;
                    }
                    int i14 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i14;
                    break;
                case -1227542709:
                case -204074025:
                    c13031.f43469 = list2;
                    c13031.f43470 = c20945M47103;
                    return c13031;
                case -1054800406:
                case -181304258:
                    if (!RunnableC1564.f6300) {
                        c5269 = new C5269(0);
                        if (C1977.m6356()) {
                            iM45029 = C19806.m45029("۫ᩴ") ^ i5;
                            i = ((iM45029 ^ i4) * (-14337)) ^ 1906657436;
                            i2 = 335755425;
                        } else {
                            iM45029 = (i5 - C19806.m45029("ᩴۤ")) * (-37);
                            i = ((iM45029 ^ i4) * 27815) ^ 1551191008;
                            i2 = -2037826396;
                        }
                        int i15 = i;
                        i7 = iM45029 ^ i2;
                        i6 = i15;
                    } else {
                        int iM450212 = C19806.m45029("᩵۟") ^ i5;
                        i7 = (-1807731154) ^ iM450212;
                        i6 = ((iM450212 ^ i4) * (-31289)) ^ 1819311972;
                        c5269 = null;
                    }
                    break;
                case -1038055648:
                case -458748350:
                    C1977.m6356();
                    if (C0629.m2907()) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨ۛ")) * (-127);
                        i = ((iM45029 ^ i5) * (-18379)) ^ 1087896219;
                        i2 = 1950716314;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۛ") ^ i4;
                        i = ((iM45029 ^ i5) * 13839) ^ 1803034913;
                        i2 = -1551021625;
                    }
                    int i16 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i16;
                    break;
                case -800355821:
                case 571932757:
                    interfaceC5046M2917 = C0629.m2917(c16667.values());
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("۫ᩴ") ^ i5;
                        i = ((iM45029 ^ i4) * (-14337)) ^ 1906657436;
                        i2 = 335755425;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ᩳܰ")) * (-83);
                        i = ((iM45029 ^ i5) * 11789) ^ 818728071;
                        i2 = 1927970609;
                    }
                    int i17 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i17;
                    break;
                case -691937262:
                case 1799549582:
                    c13032 = null;
                    iM45029 = C19806.m45029("ۛۛ") ^ i4;
                    i = ((iM45029 ^ i5) * 12299) ^ 450075782;
                    i2 = 643507760;
                    int i18 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i18;
                    break;
                case -557840595:
                case 1611619948:
                    c16667 = new C16667();
                    iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i5;
                    i = ((iM45029 ^ i4) * 9503) ^ (-493471252);
                    i2 = 1213099027;
                    int i19 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i19;
                    break;
                case -547977354:
                case -141513551:
                    C0962.m3746();
                    iM45029 = (i4 - ThreadFactoryC3888.m11306("֨ۛ")) * (-127);
                    i = ((iM45029 ^ i5) * (-18379)) ^ 1087896219;
                    i2 = 1950716314;
                    int i110 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i110;
                    break;
                case -544723999:
                case -92448351:
                    c13031 = new C13031();
                    if (C1189.m4368() > 0) {
                        iM45029 = C19806.m45029("ܳ᩶") ^ i5;
                        i = ((iM45029 ^ i4) * (-22785)) ^ 1452156742;
                        i2 = 2055620610;
                        int i111 = i;
                        i7 = iM45029 ^ i2;
                        i6 = i111;
                    } else {
                        int iM450213 = C19806.m45029("᩵۟") ^ i5;
                        i7 = (-1807731154) ^ iM450213;
                        i6 = ((iM450213 ^ i4) * (-31289)) ^ 1819311972;
                        c5269 = null;
                    }
                    break;
                case -303505962:
                case 53398259:
                    objCollect = interfaceC5046Filter.collect(list);
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ܶ֫") ^ i5;
                        i = ((iM45029 ^ i4) * (-3969)) ^ 1570095436;
                        i2 = -1992955833;
                    } else {
                        iM45029 = (C19806.m45029("ܽ᩹") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i4) * 9887) ^ (-1965567964);
                        i2 = -1832442878;
                    }
                    int i112 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i112;
                    break;
                case -249334948:
                case -143012456:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۛ") ^ i4;
                        i = ((iM45029 ^ i5) * 13839) ^ 1803034913;
                        i2 = -1551021625;
                    } else {
                        iM45029 = C19806.m45029("֫᩷") ^ i5;
                        i = ((iM45029 ^ i4) * 28847) ^ (-885709268);
                        i2 = -1936854466;
                    }
                    int i113 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i113;
                    break;
                case -149545618:
                case 234869486:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ֫") ^ i4;
                        i = ((iM45029 ^ i5) * (-3295)) ^ 1168843313;
                        i2 = -468269879;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") + i4) * (-125);
                        i = ((iM45029 ^ i5) * 25003) ^ 1335314622;
                        i2 = 265127700;
                    }
                    int i114 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i114;
                    break;
                case 415376029:
                case 1175905059:
                    return c13032;
                case 506374440:
                case 2008618021:
                    xmlResourceParserC11068M47106 = c20945M47103.m47106();
                    iM45029 = (ThreadFactoryC3888.m11306("ۚۧ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM45029 ^ i5) * (-3393)) ^ 2013517305;
                    i2 = 132303523;
                    int i115 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i115;
                    break;
                case 670376376:
                case 1550987360:
                    next = xmlResourceParserC11068M47106.next();
                    iM45029 = (C19806.m45029("ۛۨ") ^ i4) * 23;
                    i = ((iM45029 ^ i5) * 25121) ^ (-158289631);
                    i2 = 59351108;
                    int i116 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i116;
                    break;
                case 743370110:
                case 753220517:
                    c13031.f43471 = str;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") + i4) * (-125);
                        i = ((iM45029 ^ i5) * 25003) ^ 1335314622;
                        i2 = 265127700;
                        int i117 = i;
                        i7 = iM45029 ^ i2;
                        i6 = i117;
                    } else {
                        int iM450214 = C19806.m45029("ܰۗ") ^ i5;
                        i6 = ((iM450214 ^ i4) * 31983) ^ 492031080;
                        i7 = iM450214 ^ 913060303;
                    }
                    break;
                case 799294347:
                case 1279651145:
                    C1025.m3861();
                    RunnableC1606.m5473();
                    return null;
                case 892611988:
                case 1613766898:
                    try {
                        c20945M47103 = C20945.m47103(bArr);
                        iM45029 = C19806.m45029("ܿۨ") ^ i4;
                        i = ((iM45029 ^ i5) * 26271) ^ (-744369129);
                        i2 = -857269076;
                    } catch (IOException unused2) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܺ") ^ i4;
                        i = ((iM45029 ^ i5) * (-8941)) ^ (-344255036);
                        i2 = -1340506702;
                    }
                    int i118 = i;
                    i7 = iM45029 ^ i2;
                    i6 = i118;
                    break;
                default:
                    if (C1025.f4800 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻᩸") + i4) * (-125);
                        i = ((iM45029 ^ i5) * 25003) ^ 1335314622;
                        i2 = 265127700;
                        int i119 = i;
                        i7 = iM45029 ^ i2;
                        i6 = i119;
                    } else {
                        int iM450215 = C19806.m45029("᩵۟") ^ i5;
                        i7 = (-1807731154) ^ iM450215;
                        i6 = ((iM450215 ^ i4) * (-31289)) ^ 1819311972;
                        c5269 = null;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32246() {
        return this.f43471;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m32248() {
        return this.f43469;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20945 m32247() {
        return this.f43470;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0528 A[PHI: r29
      0x0528: PHI (r29v42 l.᩻ۜᩴ) = 
      (r29v14 l.᩻ۜᩴ)
      (r29v15 l.᩻ۜᩴ)
      (r29v20 l.᩻ۜᩴ)
      (r29v21 l.᩻ۜᩴ)
      (r29v22 l.᩻ۜᩴ)
      (r29v23 l.᩻ۜᩴ)
      (r29v24 l.᩻ۜᩴ)
      (r29v26 l.᩻ۜᩴ)
      (r29v30 l.᩻ۜᩴ)
      (r29v41 l.᩻ۜᩴ)
      (r29v47 l.᩻ۜᩴ)
     binds: [B:105:0x050f, B:102:0x04f4, B:88:0x0460, B:82:0x041d, B:79:0x0402, B:71:0x03ab, B:68:0x038a, B:60:0x0316, B:43:0x023a, B:9:0x0095, B:6:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x05df A[PHI: r8 r15 r17 r29
      0x05df: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:118:0x05c9, B:109:0x0545] A[DONT_GENERATE, DONT_INLINE]
      0x05df: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:118:0x05c9, B:109:0x0545] A[DONT_GENERATE, DONT_INLINE]
      0x05df: PHI (r17v4 java.lang.Object) = (r17v3 java.lang.Object), (r17v2 java.lang.Object) binds: [B:118:0x05c9, B:109:0x0545] A[DONT_GENERATE, DONT_INLINE]
      0x05df: PHI (r29v12 l.᩻ۜᩴ) = (r29v10 l.᩻ۜᩴ), (r29v13 l.᩻ۜᩴ) binds: [B:118:0x05c9, B:109:0x0545] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x0aca A[PHI: r5 r6 r9 r16 r19 r20 r23 r29
      0x0aca: PHI (r5v23 int) = (r5v19 int), (r5v24 int) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r6v115 int) = (r6v112 int), (r6v116 int) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r9v4 ??) = (r9v3 ??), (r9v23 ??) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r16v4 int) = (r16v3 int), (r16v2 int) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v2 java.lang.String) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r20v20 java.lang.String) = (r20v9 java.lang.String), (r20v21 java.lang.String) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r23v13 java.lang.String) = (r23v9 java.lang.String), (r23v14 java.lang.String) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]
      0x0aca: PHI (r29v58 java.lang.String) = (r29v54 java.lang.String), (r29v59 java.lang.String) binds: [B:214:0x0ab0, B:195:0x093c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x02a9 A[PHI: r11 r29
      0x02a9: PHI (r11v6 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:50:0x0292, B:6:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r29v46 l.᩻ۜᩴ) = (r29v28 l.᩻ۜᩴ), (r29v47 l.᩻ۜᩴ) binds: [B:50:0x0292, B:6:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x035b A[PHI: r10 r29
      0x035b: PHI (r10v4 java.lang.String) = 
      (r10v3 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
      (r10v2 java.lang.String)
     binds: [B:63:0x0342, B:54:0x02cd, B:46:0x0262, B:40:0x0217, B:34:0x01d1, B:30:0x0195, B:27:0x016e, B:24:0x0146, B:21:0x0120, B:18:0x00f8, B:15:0x00d0, B:12:0x00a8, B:9:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r29v40 l.᩻ۜᩴ) = 
      (r29v25 l.᩻ۜᩴ)
      (r29v27 l.᩻ۜᩴ)
      (r29v29 l.᩻ۜᩴ)
      (r29v31 l.᩻ۜᩴ)
      (r29v32 l.᩻ۜᩴ)
      (r29v33 l.᩻ۜᩴ)
      (r29v34 l.᩻ۜᩴ)
      (r29v35 l.᩻ۜᩴ)
      (r29v36 l.᩻ۜᩴ)
      (r29v37 l.᩻ۜᩴ)
      (r29v38 l.᩻ۜᩴ)
      (r29v39 l.᩻ۜᩴ)
      (r29v41 l.᩻ۜᩴ)
     binds: [B:63:0x0342, B:54:0x02cd, B:46:0x0262, B:40:0x0217, B:34:0x01d1, B:30:0x0195, B:27:0x016e, B:24:0x0146, B:21:0x0120, B:18:0x00f8, B:15:0x00d0, B:12:0x00a8, B:9:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x06e6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32245(int i, XmlResourceParserC11068 xmlResourceParserC11068, final C16667 c16667) {
        InterfaceC23537 interfaceC23537;
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int i5;
        InterfaceC23537 interfaceC23538;
        String str;
        int iM11306;
        int i6;
        int i7;
        int iM11307;
        int i8;
        int i9;
        ?? r9;
        int iM450211;
        int i10;
        int i11;
        int iM11308;
        int i12;
        int iM11309;
        int i13;
        int i14;
        XmlResourceParserC11068 xmlResourceParserC11069 = xmlResourceParserC11068;
        int i15 = 0;
        boolean z = false;
        int i16 = -1527508779;
        int i17 = C2249.f8050;
        int i18 = C2124.f7782;
        int iM450212 = C19806.m45029("ۢ᩺") ^ i18;
        int i19 = ((iM450212 ^ i17) * 6719) ^ 1605142149;
        int i20 = iM450212 ^ (-1975818572);
        C1035 c1035 = null;
        String attributeName = null;
        String strM10964 = null;
        String strM9716 = null;
        String attributeValue = null;
        InterfaceC23537 interfaceC23539 = null;
        int iM27908 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int attributeCount = 0;
        int i27 = 0;
        String prefix = null;
        String str2 = null;
        Object obj = null;
        ?? r10 = 0;
        Object obj2 = null;
        int i28 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * (-9947)) >> 31));
            switch (i16) {
                case -2097414016:
                case -1806316346:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    if (!AbstractC0464.m2315(str2, ThreadFactoryC3888.m11312(f43468, 25, 14, i21))) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i29 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str3 = attributeName;
                        i20 = i29;
                        attributeName = str3;
                        String str4 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str4;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ۧۛ") ^ i17;
                        i19 = ((iM450211 ^ i18) * IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation) ^ 1528790098;
                        i10 = -506607281;
                        i11 = iM450211 ^ i10;
                        i27 = i27;
                        strM10964 = strM10964;
                        str2 = str2;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str5 = attributeName;
                        i20 = i11;
                        attributeName = str5;
                    }
                    break;
                case -2062112465:
                case 1080075882:
                    interfaceC23537 = interfaceC23539;
                    if (!c1035.f4822) {
                        iM45029 = (C19806.m45029("ۖۗ") + i17) * 63;
                        i2 = ((iM45029 ^ i18) * (-26771)) ^ 28188778;
                        i3 = -454065863;
                        interfaceC23538 = interfaceC23537;
                        i20 = iM45029 ^ i3;
                        i19 = i2;
                        interfaceC23539 = interfaceC23538;
                    } else {
                        interfaceC23539 = interfaceC23537;
                        i27 = i27;
                        attributeName = attributeName;
                        iM11308 = C19806.m45029("۟ۡ") ^ i17;
                        i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                        i12 = -2084389338;
                        i11 = iM11308 ^ i12;
                        i27 = i27;
                        String str6 = attributeName;
                        i20 = i11;
                        attributeName = str6;
                    }
                    break;
                case -2050928829:
                case -1944977702:
                    interfaceC23537 = interfaceC23539;
                    if (C6493.m17688(xmlResourceParserC11069.getAttributeValue(i23))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩺") ^ i18) * (-17);
                        i2 = ((iM45029 ^ i17) * 27553) ^ 184301916;
                        i3 = 81613062;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -2038716410:
                case -1397672484:
                    String str7 = attributeName;
                    String str8 = str2;
                    String str9 = strM10964;
                    interfaceC23539 = new InterfaceC23537() { // from class: l.᩹ۢۨ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final /* bridge */ /* synthetic */ void n(Object obj3) {
                            mo1000((Integer) obj3);
                        }

                        @Override // l.InterfaceC23537
                        /* JADX INFO: renamed from: ۨ */
                        public final /* synthetic */ void mo1000(Integer num) {
                            C10837.m27159((InterfaceC23537) this, num);
                        }

                        public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                            return C10837.m27158((InterfaceC23537) this, intConsumer);
                        }

                        @Override // java.util.function.IntConsumer
                        public final void accept(int i30) {
                            C16667 c16668 = null;
                            Object obj3 = null;
                            Object c1036 = null;
                            int i31 = -1696415508;
                            int i32 = C1148.f5161;
                            int i33 = C10634.f36300;
                            int iM113010 = (ThreadFactoryC3888.m11306("᩵᩻") ^ i32) * 57;
                            int i34 = ((iM113010 ^ i33) * (-9915)) ^ 50185734;
                            int i35 = -1172852652;
                            while (true) {
                                i31 = ((((i31 ^ i33) * (-20219)) >> 31) & i34) ^ (iM113010 ^ i35);
                                switch (i31) {
                                    case -2130657602:
                                    case -1381948044:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM113010 = (C19806.m45029("ۛ۫") + i33) * 81;
                                            i34 = ((iM113010 ^ i32) * (-6233)) ^ 2060967099;
                                            i35 = 876526307;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        }
                                        break;
                                    case -1941466841:
                                    case 1156052648:
                                        if (C0629.f2722 <= 0) {
                                            iM113010 = C19806.m45029("᩻ܿ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-28119)) ^ (-1913744420);
                                            i35 = 408792562;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۤᩴ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 1081) ^ (-207945449);
                                            i35 = -1268460476;
                                        }
                                        break;
                                    case -1669433078:
                                    case 825583479:
                                        if (i30 != -1) {
                                            iM113010 = C19806.m45029("᩸ۤ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-22871)) ^ (-393647868);
                                            i35 = -571605039;
                                        } else {
                                            iM113010 = (i32 - ThreadFactoryC3888.m11306("ۢܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i34 = ((iM113010 ^ i33) * 17773) ^ 566326197;
                                            i35 = 824403907;
                                        }
                                        break;
                                    case -1618613434:
                                    case 381860175:
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        if (C1937.f7317 < 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۡ۬") + i33) * 7;
                                            i34 = ((iM113010 ^ i32) * 15793) ^ 1267751027;
                                            i35 = 1345351060;
                                        } else {
                                            iM113010 = C19806.m45029("᩻ܿ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-28119)) ^ (-1913744420);
                                            i35 = 408792562;
                                        }
                                        break;
                                    case -1532879117:
                                    case 138917243:
                                        ((C1035) c1036).f4822 = true;
                                        iM113010 = (i32 - ThreadFactoryC3888.m11306("ۢܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                        i34 = ((iM113010 ^ i33) * 17773) ^ 566326197;
                                        i35 = 824403907;
                                        break;
                                    case -1423159291:
                                    case 1743637553:
                                        C0050.m946();
                                        iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                        i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                        i35 = 1497276661;
                                        break;
                                    case -1009474859:
                                    case -137122706:
                                        if (C1025.f4800 >= 0) {
                                            iM113010 = C19806.m45029("᩶᩵") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 6873) ^ 820945458;
                                            i35 = 1769122327;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 12787) ^ 229933502;
                                            i35 = -1498241536;
                                        }
                                        break;
                                    case -913866480:
                                    case 1763213710:
                                        RunnableC1606.m5473();
                                        if (C3577.f13150 >= 0) {
                                            iM113010 = C19806.m45029("᩻ܿ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-28119)) ^ (-1913744420);
                                            i35 = 408792562;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        }
                                        break;
                                    case -875071053:
                                    case -27532520:
                                        if (C10634.f36300 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("۟ܶ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-8543)) ^ (-2047581290);
                                            i35 = -759520874;
                                        }
                                        break;
                                    case -794964363:
                                    case -654240421:
                                        if (C3743.f13569) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۧܿ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-879)) ^ (-676221592);
                                            i35 = 1110540087;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۡ۬") + i33) * 7;
                                            i34 = ((iM113010 ^ i32) * 15793) ^ 1267751027;
                                            i35 = 1345351060;
                                        }
                                        break;
                                    case -735839955:
                                    case 542454001:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۡ۬") + i33) * 7;
                                            i34 = ((iM113010 ^ i32) * 15793) ^ 1267751027;
                                            i35 = 1345351060;
                                        } else {
                                            iM113010 = C19806.m45029("ܽۙ") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 16567) ^ (-1207034854);
                                            i35 = -770531409;
                                        }
                                        break;
                                    case -641565695:
                                    case 770113107:
                                        if (c16668.mo8945(i30)) {
                                            c1036 = obj3;
                                            iM113010 = C19806.m45029("۟֡") ^ i33;
                                            i34 = ((iM113010 ^ i32) * 7917) ^ 1185531422;
                                            i35 = -1220308046;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۘܽ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * (-30811)) ^ 655333642;
                                            i35 = -760099003;
                                        }
                                        break;
                                    case -566813531:
                                    case 646891357:
                                        C3660.m10791();
                                        break;
                                    case -397776795:
                                    case -91555679:
                                        if (C0526.f2219) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۨۚ") ^ i33) * (-127);
                                            i34 = ((iM113010 ^ i32) * 9703) ^ 2131646834;
                                            i35 = 549513345;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩶ܺ") ^ i33;
                                            i34 = ((iM113010 ^ i32) * 2631) ^ 760223301;
                                            i35 = -1909284712;
                                        }
                                        break;
                                    case -46834076:
                                    case 1669210872:
                                        if (C0817.f3443) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ܿ۟") ^ i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i34 = ((iM113010 ^ i33) * (-18853)) ^ 877356327;
                                            i35 = -942674928;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        }
                                        break;
                                    case 473119896:
                                    case 1611882456:
                                        CallableC1627.m5507();
                                        if (C1398.f5802 <= 0) {
                                            iM113010 = C19806.m45029("᩶᩵") ^ i32;
                                            i34 = ((iM113010 ^ i33) * 6873) ^ 820945458;
                                            i35 = 1769122327;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        }
                                        break;
                                    case 849620018:
                                    case 1659517142:
                                        c16668 = c16667;
                                        obj3 = c16668.get(i30);
                                        if (obj3 == null) {
                                            iM113010 = (C19806.m45029("ۗ۟") + i32) * (-61);
                                            i34 = ((iM113010 ^ i33) * (-22503)) ^ 846724868;
                                            i35 = 1271663276;
                                        } else {
                                            c1036 = obj3;
                                            iM113010 = C19806.m45029("۟֡") ^ i33;
                                            i34 = ((iM113010 ^ i32) * 7917) ^ 1185531422;
                                            i35 = -1220308046;
                                        }
                                        break;
                                    case 932210284:
                                    case 1840638027:
                                        c1036 = new C1035(i30);
                                        c16668.mo8944(i30, c1036);
                                        iM113010 = C19806.m45029("۟֡") ^ i33;
                                        i34 = ((iM113010 ^ i32) * 7917) ^ 1185531422;
                                        i35 = -1220308046;
                                        break;
                                    case 1023008455:
                                    case 1841201610:
                                        if (C0526.f2219) {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        } else {
                                            iM113010 = (C19806.m45029("ۤ᩷") + i33) * 3;
                                            i34 = ((iM113010 ^ i32) * (-24815)) ^ (-453006378);
                                            i35 = -893228780;
                                        }
                                        break;
                                    case 1840675438:
                                    case 2055239317:
                                        break;
                                    default:
                                        if (C1377.f5749) {
                                            iM113010 = (ThreadFactoryC3888.m11306("ۤۗ") + i32) * (-31);
                                            i34 = ((iM113010 ^ i33) * (-14359)) ^ 1290082333;
                                            i35 = 1940264891;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩹֨") ^ i32;
                                            i34 = ((iM113010 ^ i33) * (-4833)) ^ 385267813;
                                            i35 = 1497276661;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        public final Consumer andThen(Consumer consumer) {
                            return C1455.$default$andThen(this, consumer);
                        }
                    };
                    i27 = 3;
                    if (i != 2) {
                        iM11307 = (i18 - ThreadFactoryC3888.m11306("ܶۖ")) * 35;
                        i8 = ((iM11307 ^ i17) * (-32139)) ^ 1925045127;
                        i9 = 18786856;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩻᩶") ^ i17;
                        i8 = ((iM11307 ^ i18) * 17327) ^ 131867807;
                        i9 = -1985936983;
                    }
                    i19 = i8;
                    strM10964 = str9;
                    attributeName = str7;
                    i20 = iM11307 ^ i9;
                    str2 = str8;
                    i25 = 4;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    break;
                case -2030773687:
                case -1639057301:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C3743.m10964(f43468, 196, 4, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ᩴܳ")) * (-103);
                        i2 = ((iM45029 ^ i18) * 1881) ^ 1179422121;
                        i3 = 192623973;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1948652537:
                case 684275310:
                    z = false;
                    iM11308 = (C19806.m45029("ۧۧ") ^ i18) * (-27);
                    i19 = ((iM11308 ^ i17) * (-26491)) ^ 1365389821;
                    i12 = 1255656375;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str10 = attributeName;
                    i20 = i11;
                    attributeName = str10;
                    break;
                case -1938649848:
                case -1148790926:
                    attributeName = attributeName;
                    strM10964 = strM10964;
                    i25 = i25;
                    i27 = i27;
                    String name = xmlResourceParserC11068.getName();
                    RunnableC3388.m10051(name);
                    switch (ThreadFactoryC3888.m11306(name)) {
                        case -1655966961:
                            str = name;
                            iM11306 = C19806.m45029("ۨ᩺") ^ i17;
                            i6 = ((iM11306 ^ i18) * (-23325)) ^ (-993748513);
                            i7 = -1749331726;
                            r10 = r10;
                            int i210 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str11 = attributeName;
                            i20 = i210;
                            attributeName = str11;
                            String str12 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str12;
                            break;
                        case -987494927:
                            str = name;
                            iM11306 = (ThreadFactoryC3888.m11306("ܶܳ") ^ i17) * (-39);
                            i6 = ((iM11306 ^ i18) * (-4843)) ^ (-1849987845);
                            i7 = 83704336;
                            r10 = r10;
                            int i211 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str13 = attributeName;
                            i20 = i211;
                            attributeName = str13;
                            String str14 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str14;
                            break;
                        case -808719889:
                            str = name;
                            iM11306 = C19806.m45029("ۙ֫") ^ i18;
                            i6 = ((iM11306 ^ i17) * 28679) ^ (-1956104619);
                            i7 = 2090603461;
                            r10 = r10;
                            int i212 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str15 = attributeName;
                            i20 = i212;
                            attributeName = str15;
                            String str16 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str16;
                            break;
                        case 790287890:
                            str = name;
                            iM11306 = (i17 - ThreadFactoryC3888.m11306("ۚۤ")) * (-31);
                            i6 = ((iM11306 ^ i18) * (-29179)) ^ 1044518272;
                            i7 = 921678085;
                            r10 = r10;
                            int i213 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str17 = attributeName;
                            i20 = i213;
                            attributeName = str17;
                            String str18 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str18;
                            break;
                        case 1554253136:
                            str = name;
                            iM11306 = (ThreadFactoryC3888.m11306("᩺ۙ") ^ i18) * (-51);
                            i6 = ((iM11306 ^ i17) * 9333) ^ (-411066914);
                            i7 = 1192463517;
                            r10 = r10;
                            int i214 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str19 = attributeName;
                            i20 = i214;
                            attributeName = str19;
                            String str110 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str110;
                            break;
                        case 1723095833:
                            str = name;
                            iM11306 = C19806.m45029("ۧ۫") ^ i17;
                            i6 = ((iM11306 ^ i18) * 5261) ^ 156278852;
                            i7 = 1637591253;
                            r10 = r10;
                            int i215 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str111 = attributeName;
                            i20 = i215;
                            attributeName = str111;
                            String str112 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str112;
                            break;
                        case 1984153269:
                            int iM113010 = (ThreadFactoryC3888.m11306("ܳ۟") ^ i18) * (-87);
                            i19 = ((iM113010 ^ i17) * 27633) ^ 1201160131;
                            i27 = i27;
                            attributeName = attributeName;
                            i20 = iM113010 ^ 58489786;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = name;
                            break;
                        default:
                            str2 = name;
                            iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                            str = str2;
                            i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                            i7 = 2104168857;
                            r10 = r10;
                            int i216 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str113 = attributeName;
                            i20 = i216;
                            attributeName = str113;
                            String str114 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str114;
                            break;
                    }
                    break;
                case -1917754426:
                case 1971416608:
                    interfaceC23537 = interfaceC23539;
                    if (C6493.m17688(xmlResourceParserC11069.getAttributeValue(i23))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ᩷") ^ i18) * (-49);
                        i2 = ((iM45029 ^ i17) * 26813) ^ (-1508901913);
                        i3 = -1431010155;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1842599979:
                case 1230010495:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C1025.m3859(f43468, 200, 9, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧܰ") ^ i17;
                        i2 = ((iM45029 ^ i18) * 23641) ^ (-1045279914);
                        i3 = 746842026;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1835005289:
                case 1368302035:
                    attributeName = attributeName;
                    int i30 = attributeCount;
                    i27 = i27;
                    if (i23 == i30) {
                        attributeCount = i30;
                        String str20 = str2;
                        strM10964 = strM10964;
                        i25 = i25;
                        str = str20;
                        iM11306 = ThreadFactoryC3888.m11306("ܿۡ") ^ i18;
                        i6 = ((iM11306 ^ i17) * 29459) ^ 1972441;
                        i7 = -1056558273;
                        r10 = r10;
                        int i217 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str115 = attributeName;
                        i20 = i217;
                        attributeName = str115;
                        String str116 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str116;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("ۜۨ") + i18) * 17;
                        attributeCount = i30;
                        i13 = ((iM11309 ^ i17) * 3743) ^ 1229027026;
                        i14 = 791801342;
                        int i31 = iM11309 ^ i14;
                        i27 = i27;
                        i19 = i13;
                        attributeName = attributeName;
                        i20 = i31;
                    }
                    break;
                case -1813923459:
                case -1231203658:
                    interfaceC23539.accept(xmlResourceParserC11068.m27895());
                    interfaceC23539.accept(xmlResourceParserC11068.m27893());
                    break;
                case -1803596120:
                case 1530756681:
                    attributeName = attributeName;
                    i27 = i27;
                    String str21 = str2;
                    strM10964 = strM10964;
                    i25 = i25;
                    str = str21;
                    if (i != i27) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۘ") ^ i18;
                        i6 = ((iM11306 ^ i17) * 30971) ^ (-1777074944);
                        i7 = 1192868191;
                        r10 = r10;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۡ") ^ i18;
                        i6 = ((iM11306 ^ i17) * 29459) ^ 1972441;
                        i7 = -1056558273;
                        r10 = r10;
                    }
                    int i218 = iM11306 ^ i7;
                    i19 = i6;
                    i27 = i27;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str117 = attributeName;
                    i20 = i218;
                    attributeName = str117;
                    String str118 = str;
                    i25 = i25;
                    strM10964 = strM10964;
                    str2 = str118;
                    break;
                case -1694601876:
                case 398837439:
                    interfaceC23537 = interfaceC23539;
                    if (c16667.mo8945(iM27908)) {
                        obj = obj2;
                        iM45029 = (C19806.m45029("᩹۬") ^ i18) * 57;
                        i2 = ((iM45029 ^ i17) * (-19521)) ^ (-83831100);
                        i3 = 1236553183;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗᩳ") ^ i17) * (-15);
                        i2 = ((iM45029 ^ i18) * (-11607)) ^ (-1358175904);
                        i3 = -1374758808;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1583783602:
                case 1340895174:
                    interfaceC23537 = interfaceC23539;
                    strM9716 = MenuItemOnMenuItemClickListenerC3244.m9716(attributeName);
                    if (C2124.m6675(strM9716, C3577.m10571(f43468, 139, 5, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (i17 - C19806.m45029("ۙۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM45029 ^ i18) * (-7575)) ^ 1054956379;
                        i3 = 2126296533;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1580900206:
                case -563069184:
                    interfaceC23539.accept(xmlResourceParserC11068.m27895());
                    break;
                case -1577573026:
                case 472699034:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    if (!C1460.m5058(str2, C3743.m10964(f43468, 50, 18, i21))) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i219 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str119 = attributeName;
                        i20 = i219;
                        attributeName = str119;
                        String str1110 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str1110;
                    } else {
                        iM450211 = C19806.m45029("ܶ۬") ^ i18;
                        i19 = ((iM450211 ^ i17) * 18327) ^ (-37676183);
                        i10 = 147905152;
                        i11 = iM450211 ^ i10;
                        i27 = i27;
                        strM10964 = strM10964;
                        str2 = str2;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str120 = attributeName;
                        i20 = i11;
                        attributeName = str120;
                    }
                    break;
                case -1538845516:
                case -1393098461:
                    i26 = -1;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str121 = attributeName;
                    i20 = i11;
                    attributeName = str121;
                    break;
                case -1537279800:
                case 1386518708:
                    interfaceC23537 = interfaceC23539;
                    attributeValue = xmlResourceParserC11069.getAttributeValue(i23);
                    if (RunnableC1895.m6176(attributeName, C3743.m10964(f43468, 162, 5, i21))) {
                        iM45029 = C19806.m45029("۬ܳ") ^ i17;
                        i2 = ((iM45029 ^ i18) * (-9023)) ^ (-913042019);
                        i3 = 472085438;
                    } else {
                        iM45029 = C19806.m45029("ۘۚ") ^ i17;
                        i2 = ((iM45029 ^ i18) * 8311) ^ (-1945488653);
                        i3 = 1282569399;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1536607621:
                case -238305075:
                    c1035.f4824 = attributeName;
                    i27 = i27;
                    attributeName = attributeName;
                    iM11308 = C19806.m45029("۟ۡ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                    i12 = -2084389338;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str122 = attributeName;
                    i20 = i11;
                    attributeName = str122;
                    break;
                case -1466578834:
                case -280472774:
                    c1035.f4824 = C0252.m1693(strM10964, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM11308 = C19806.m45029("۟ۡ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                    i12 = -2084389338;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str123 = attributeName;
                    i20 = i11;
                    attributeName = str123;
                    break;
                case -1407188899:
                case -77756545:
                    i26 = 0;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str124 = attributeName;
                    i20 = i11;
                    attributeName = str124;
                    break;
                case -1316378113:
                case 1084605865:
                    interfaceC23537 = interfaceC23539;
                    c1035.f4823.add(i24);
                    if (c1035.f4824 != null) {
                        interfaceC23539 = interfaceC23537;
                        i27 = i27;
                        attributeName = attributeName;
                        iM11308 = C19806.m45029("۟ۡ") ^ i17;
                        i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                        i12 = -2084389338;
                        i11 = iM11308 ^ i12;
                        i27 = i27;
                        String str125 = attributeName;
                        i20 = i11;
                        attributeName = str125;
                    } else {
                        iM45029 = (C19806.m45029("֨ۢ") ^ i17) * 35;
                        i2 = ((iM45029 ^ i18) * (-21191)) ^ 1063167943;
                        i3 = 303129510;
                        interfaceC23538 = interfaceC23537;
                        i20 = iM45029 ^ i3;
                        i19 = i2;
                        interfaceC23539 = interfaceC23538;
                    }
                    break;
                case -1314864224:
                case 1803663129:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    if (!AbstractC0464.m2315(str2, MenuItemOnMenuItemClickListenerC3244.m9715(f43468, 39, 11, i21))) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i2110 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str1111 = attributeName;
                        i20 = i2110;
                        attributeName = str1111;
                        String str1112 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str1112;
                    } else {
                        i26 = i25;
                        iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                        i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                        i10 = 2025616387;
                        i11 = iM450211 ^ i10;
                        i27 = i27;
                        strM10964 = strM10964;
                        str2 = str2;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str126 = attributeName;
                        i20 = i11;
                        attributeName = str126;
                    }
                    break;
                case -1295128160:
                case 1925136179:
                    interfaceC23537 = interfaceC23539;
                    if (C2124.m6675(strM9716, C3577.m10571(f43468, Scalar25519.TARGET_LENGTH, 7, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1272853366:
                case -832909621:
                    interfaceC23537 = interfaceC23539;
                    if (C6493.m17688(xmlResourceParserC11069.getAttributeValue(i23))) {
                        iM45029 = C19806.m45029("ܳۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * 26865) ^ (-355689918);
                        i3 = 947326915;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1271675630:
                case 663743316:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    if (!AbstractC0464.m2315(str2, C1189.m4365(f43468, 9, 8, i21))) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i2111 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str1113 = attributeName;
                        i20 = i2111;
                        attributeName = str1113;
                        String str1114 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str1114;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ᩳᩴ") ^ i18) * (-3);
                        i19 = ((iM450211 ^ i17) * 6971) ^ 1463463441;
                        i10 = 1428490748;
                        i11 = iM450211 ^ i10;
                        i27 = i27;
                        strM10964 = strM10964;
                        str2 = str2;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str127 = attributeName;
                        i20 = i11;
                        attributeName = str127;
                    }
                    break;
                case -1270331381:
                case -3416158:
                    InterfaceC23537 interfaceC235310 = interfaceC23539;
                    int attributeNameResource = (xmlResourceParserC11069.getAttributeNameResource(i23) >>> 24) & 255;
                    if (attributeNameResource > r10) {
                        iM450210 = C19806.m45029("۟֡") ^ i18;
                        i4 = ((iM450210 ^ i17) * (-27435)) ^ (-1370513253);
                        i5 = 1336209162;
                    } else {
                        iM450210 = C19806.m45029("۫۬") ^ i17;
                        i4 = ((iM450210 ^ i18) * 3607) ^ 882742699;
                        i5 = 553574367;
                    }
                    int i32 = iM450210 ^ i5;
                    i15 = attributeNameResource;
                    i19 = i4;
                    interfaceC23538 = interfaceC235310;
                    i20 = i32;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1245497762:
                case 1544062054:
                    z = true;
                    iM11308 = (C19806.m45029("ۧۧ") ^ i18) * (-27);
                    i19 = ((iM11308 ^ i17) * (-26491)) ^ 1365389821;
                    i12 = 1255656375;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str128 = attributeName;
                    i20 = i11;
                    attributeName = str128;
                    break;
                case -1193568039:
                case 1366226884:
                    i26 = 6;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str129 = attributeName;
                    i20 = i11;
                    attributeName = str129;
                    break;
                case -1168350217:
                case 2079626730:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C0050.m940(f43468, 250, 4, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩺") ^ i17) * 65;
                        i2 = ((iM45029 ^ i18) * (-1559)) ^ 1521995493;
                        i3 = 1805540013;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1136042263:
                case 1319309756:
                    c1035.f4822 = r10;
                    i27 = i27;
                    attributeName = attributeName;
                    iM11308 = C19806.m45029("۟ۡ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                    i12 = -2084389338;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str1210 = attributeName;
                    i20 = i11;
                    attributeName = str1210;
                    break;
                case -1120789504:
                case -570405660:
                    interfaceC23537 = interfaceC23539;
                    i24 = (i23 * 20) + i22;
                    iM27908 = xmlResourceParserC11069.m27908(i23);
                    obj2 = c16667.get(iM27908);
                    if (obj2 == null) {
                        iM45029 = C19806.m45029("᩵ۖ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-1751)) ^ 517583614;
                        i3 = 1616739253;
                    } else {
                        obj = obj2;
                        iM45029 = (C19806.m45029("᩹۬") ^ i18) * 57;
                        i2 = ((iM45029 ^ i17) * (-19521)) ^ (-83831100);
                        i3 = 1236553183;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1041088182:
                case 1176093391:
                    interfaceC23537 = interfaceC23539;
                    if (z) {
                        iM45029 = (C19806.m45029("ۢ᩻") + i17) * 115;
                        i2 = ((iM45029 ^ i18) * 1097) ^ 1559154970;
                        i3 = 168190836;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -1013226460:
                case 647389403:
                    attributeName = attributeName;
                    i27 = i27;
                    switch (i26) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            iM11308 = ThreadFactoryC3888.m11306("֡ᩴ") ^ i18;
                            i19 = ((iM11308 ^ i17) * 4927) ^ 1504463121;
                            i12 = -1034389338;
                            i11 = iM11308 ^ i12;
                            i27 = i27;
                            String str1211 = attributeName;
                            i20 = i11;
                            attributeName = str1211;
                            break;
                        default:
                            String str22 = str2;
                            strM10964 = strM10964;
                            i25 = i25;
                            str = str22;
                            iM11306 = C19806.m45029("ۤۘ") ^ i17;
                            i6 = ((iM11306 ^ i18) * 14327) ^ 1772340761;
                            i7 = -391464075;
                            r10 = r10;
                            int i2112 = iM11306 ^ i7;
                            i19 = i6;
                            i27 = i27;
                            xmlResourceParserC11069 = xmlResourceParserC11068;
                            String str1115 = attributeName;
                            i20 = i2112;
                            attributeName = str1115;
                            String str1116 = str;
                            i25 = i25;
                            strM10964 = strM10964;
                            str2 = str1116;
                            break;
                    }
                    break;
                case -1009391095:
                case -526560303:
                    interfaceC23537 = interfaceC23539;
                    if (i15 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۟") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-17177)) ^ 1743422927;
                        i3 = -1178496026;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -958207604:
                case 964649013:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C19806.m45020(f43468, 167, 4, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = C19806.m45029("ۛ᩸") ^ i18;
                        i2 = ((iM45029 ^ i17) * 21945) ^ 1161318067;
                        i3 = -371814243;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -939578826:
                case 1940154438:
                    interfaceC23537 = interfaceC23539;
                    c1035.f4823.add(i24);
                    if (c1035.f4824 != null) {
                        interfaceC23539 = interfaceC23537;
                        i27 = i27;
                        attributeName = attributeName;
                        iM11308 = C19806.m45029("۟ۡ") ^ i17;
                        i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                        i12 = -2084389338;
                        i11 = iM11308 ^ i12;
                        i27 = i27;
                        String str1212 = attributeName;
                        i20 = i11;
                        attributeName = str1212;
                    } else {
                        iM45029 = C19806.m45029("۬᩻") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-19967)) ^ 1239512797;
                        i3 = -739095169;
                        interfaceC23538 = interfaceC23537;
                        i20 = iM45029 ^ i3;
                        i19 = i2;
                        interfaceC23539 = interfaceC23538;
                    }
                    break;
                case -925373628:
                case 1985004820:
                    str = str2;
                    i21 = 36919;
                    iM11306 = C19806.m45029("᩸ܿ") ^ i18;
                    i6 = ((iM11306 ^ i17) * 8981) ^ (-1546768507);
                    i7 = -618035184;
                    r10 = r10;
                    int i2113 = iM11306 ^ i7;
                    i19 = i6;
                    i27 = i27;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str1117 = attributeName;
                    i20 = i2113;
                    attributeName = str1117;
                    String str1118 = str;
                    i25 = i25;
                    strM10964 = strM10964;
                    str2 = str1118;
                    break;
                case -903489021:
                case -207082509:
                    i26 = 2;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str1213 = attributeName;
                    i20 = i11;
                    attributeName = str1213;
                    break;
                case -888012439:
                case 55854817:
                    break;
                case -871321794:
                case 1476416240:
                    i26 = 1;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str1214 = attributeName;
                    i20 = i11;
                    attributeName = str1214;
                    break;
                case -813711451:
                case -115955383:
                    interfaceC23537 = interfaceC23539;
                    if (C1460.m5058(attributeName, C1875.m6105(f43468, 144, 13, i21))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܰᩴ")) * (-83);
                        i2 = ((iM45029 ^ i18) * 22475) ^ 885580624;
                        i3 = 71537351;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -741823725:
                case 1237393309:
                    attributeName = attributeName;
                    i27 = i27;
                    String str23 = str2;
                    strM10964 = strM10964;
                    i25 = i25;
                    str = str23;
                    interfaceC23539.accept(xmlResourceParserC11068.m27895());
                    interfaceC23539.accept(xmlResourceParserC11068.m27893());
                    prefix = xmlResourceParserC11068.getPrefix();
                    i28 = 0;
                    r9 = 1;
                    r10 = 1;
                    if (prefix != null) {
                        iM11306 = (C19806.m45029("۫ۖ") ^ i17) * 17;
                        i6 = ((iM11306 ^ i18) * 31837) ^ (-1230342653);
                        i7 = -1862786659;
                    } else {
                        iM11306 = C19806.m45029("ۧ۟") ^ i17;
                        i6 = ((iM11306 ^ i18) * (-8061)) ^ 360897358;
                        i7 = 2078628549;
                        r10 = r9;
                    }
                    int i2114 = iM11306 ^ i7;
                    i19 = i6;
                    i27 = i27;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str1119 = attributeName;
                    i20 = i2114;
                    attributeName = str1119;
                    String str11110 = str;
                    i25 = i25;
                    strM10964 = strM10964;
                    str2 = str11110;
                    break;
                case -720765918:
                case 1134638251:
                    i23++;
                    iM11308 = C19806.m45029("ۖۛ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-29741)) ^ (-2146038281);
                    i12 = 1388544317;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str1215 = attributeName;
                    i20 = i11;
                    attributeName = str1215;
                    break;
                case -667714435:
                case 364039382:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C1189.m4365(f43468, 242, 3, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (C19806.m45029("ۚ᩶") ^ i17) * (-21);
                        i2 = ((iM45029 ^ i18) * 3633) ^ 451530263;
                        i3 = 772923547;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -661607867:
                case 336461494:
                    interfaceC23537 = interfaceC23539;
                    if (C2124.m6675(strM9716, C0817.m3406(f43468, 157, 5, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۖ") + i18) * 79;
                        i2 = ((iM45029 ^ i17) * (-2565)) ^ 542903505;
                        i3 = -801248542;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -640317530:
                case -39841945:
                    attributeName = attributeName;
                    i27 = i27;
                    String str24 = str2;
                    strM10964 = strM10964;
                    i25 = i25;
                    str = str24;
                    short s = f43468[0];
                    int i33 = (s * 2) + 1;
                    int i34 = s + 1;
                    if (i33 - (i34 * i34) <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫۠") ^ i18) * (-65);
                        i6 = ((iM11306 ^ i17) * (-23547)) ^ 103347567;
                        i7 = -1804866916;
                        r10 = r10;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۚ") ^ i17;
                        i6 = ((iM11306 ^ i18) * 19185) ^ 1347882832;
                        i7 = -1238142433;
                        r10 = r10;
                    }
                    int i2115 = iM11306 ^ i7;
                    i19 = i6;
                    i27 = i27;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str11111 = attributeName;
                    i20 = i2115;
                    attributeName = str11111;
                    String str11112 = str;
                    i25 = i25;
                    strM10964 = strM10964;
                    str2 = str11112;
                    break;
                case -611693046:
                case 2135669501:
                    i26 = 5;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str1216 = attributeName;
                    i20 = i11;
                    attributeName = str1216;
                    break;
                case -564947207:
                case 387573427:
                    interfaceC23539.accept(xmlResourceParserC11069.m27899(i23));
                    interfaceC23539.accept(xmlResourceParserC11069.m27906(i23));
                    interfaceC23539.accept(xmlResourceParserC11069.m27902(i23));
                    i27 = i27;
                    if (xmlResourceParserC11069.m27894(i23) != i27) {
                        attributeName = attributeName;
                        iM11308 = C19806.m45029("۟ۡ") ^ i17;
                        i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                        i12 = -2084389338;
                        i11 = iM11308 ^ i12;
                        i27 = i27;
                        String str1217 = attributeName;
                        i20 = i11;
                        attributeName = str1217;
                    } else {
                        iM11309 = (i17 - ThreadFactoryC3888.m11306("۬۬")) * 27;
                        attributeName = attributeName;
                        i13 = ((iM11309 ^ i18) * 1527) ^ (-812415690);
                        i14 = -1805486383;
                        int i35 = iM11309 ^ i14;
                        i27 = i27;
                        i19 = i13;
                        attributeName = attributeName;
                        i20 = i35;
                    }
                    break;
                case -455753315:
                case 1729048620:
                    interfaceC23537 = interfaceC23539;
                    if (C6493.m17688(xmlResourceParserC11069.getAttributeValue(i23))) {
                        iM45029 = (C19806.m45029("ᩴ۟") + i18) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM45029 ^ i17) * (-11145)) ^ (-54141573);
                        i3 = -904602357;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -390694137:
                case 1221393226:
                    interfaceC23537 = interfaceC23539;
                    c1035 = (C1035) obj;
                    attributeName = xmlResourceParserC11069.getAttributeName(i23);
                    int attributeNameResource2 = xmlResourceParserC11069.getAttributeNameResource(i23);
                    strM10964 = C3743.m10964(f43468, 75, 8, i21);
                    switch (attributeNameResource2) {
                        case R.attr.label:
                            iM45029 = (ThreadFactoryC3888.m11306("۟ۖ") + i17) * (-61);
                            i2 = ((iM45029 ^ i18) * 6505) ^ (-115309052);
                            i3 = -372017384;
                            break;
                        case R.attr.textOn:
                        case R.attr.textOff:
                        case R.attr.text:
                        case R.attr.hint:
                        case R.attr.title:
                        case R.attr.titleCondensed:
                        case R.attr.summary:
                        case R.attr.summaryOn:
                        case R.attr.summaryOff:
                        case R.attr.dialogTitle:
                        case R.attr.dialogMessage:
                        case R.attr.popupCharacters:
                        case R.attr.keyOutputText:
                        case R.attr.keyLabel:
                        case R.attr.imeActionLabel:
                        case R.attr.contentDescription:
                        case R.attr.queryHint:
                        case R.attr.switchTextOn:
                        case R.attr.switchTextOff:
                        case R.attr.format12Hour:
                        case R.attr.format24Hour:
                        case R.attr.tooltipText:
                        case R.attr.autofillHints:
                            iM45029 = ThreadFactoryC3888.m11306("ۢᩳ") ^ i17;
                            i2 = ((iM45029 ^ i18) * (-5269)) ^ 1881724737;
                            i3 = 1305664888;
                            break;
                        default:
                            iM45029 = (C19806.m45029("ۡ᩸") + i18) * (-95);
                            i2 = ((iM45029 ^ i17) * (-24291)) ^ (-1365355792);
                            i3 = 683148553;
                            break;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -320836628:
                case 901603455:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C10634.m26821(f43468, 213, 11, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۡ") + i18) * (-41);
                        i2 = ((iM45029 ^ i17) * 12087) ^ 997598944;
                        i3 = -2100847811;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -320217778:
                case 1585069740:
                    interfaceC23537 = interfaceC23539;
                    if (C2124.m6675(strM9716, C2249.m6918(f43468, 235, 7, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = C19806.m45029("ܺۖ") ^ i18;
                        i2 = ((iM45029 ^ i17) * 14469) ^ 324248627;
                        i3 = -1347937110;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -219918027:
                case 175234473:
                    interfaceC23537 = interfaceC23539;
                    c1035.f4823.add(i24);
                    if (c1035.f4824 != null) {
                        interfaceC23539 = interfaceC23537;
                        i27 = i27;
                        attributeName = attributeName;
                        iM11308 = C19806.m45029("۟ۡ") ^ i17;
                        i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                        i12 = -2084389338;
                        i11 = iM11308 ^ i12;
                        i27 = i27;
                        String str1218 = attributeName;
                        i20 = i11;
                        attributeName = str1218;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܿ") ^ i18;
                        i2 = ((iM45029 ^ i17) * 14315) ^ 1957084644;
                        i3 = 1283593686;
                        interfaceC23538 = interfaceC23537;
                        i20 = iM45029 ^ i3;
                        i19 = i2;
                        interfaceC23539 = interfaceC23538;
                    }
                    break;
                case -198734423:
                case 1449422841:
                    attributeName = attributeName;
                    i27 = i27;
                    String str25 = str2;
                    strM10964 = strM10964;
                    i25 = i25;
                    str = str25;
                    r9 = r10;
                    if (C1977.m6360(prefix) == 0) {
                        iM11306 = C19806.m45029("ۧ۟") ^ i17;
                        i6 = ((iM11306 ^ i18) * (-8061)) ^ 360897358;
                        i7 = 2078628549;
                        r10 = r9;
                    } else {
                        iM11306 = C19806.m45029("ۤۘ") ^ i17;
                        i6 = ((iM11306 ^ i18) * 14327) ^ 1772340761;
                        i7 = -391464075;
                        r10 = r10;
                    }
                    int i2116 = iM11306 ^ i7;
                    i19 = i6;
                    i27 = i27;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str11113 = attributeName;
                    i20 = i2116;
                    attributeName = str11113;
                    String str11114 = str;
                    i25 = i25;
                    strM10964 = strM10964;
                    str2 = str11114;
                    break;
                case -69138821:
                case 1737511644:
                    interfaceC23537 = interfaceC23539;
                    if (C1460.m5058(attributeName, C0817.m3406(f43468, 108, 31, i21))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    } else {
                        iM45029 = C19806.m45029("ۤᩴ") ^ i17;
                        i2 = ((iM45029 ^ i18) * (-3479)) ^ (-722026376);
                        i3 = 963971126;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case -35389818:
                case 943698851:
                    interfaceC23537 = interfaceC23539;
                    if (AbstractC0464.m2315(attributeName, C3743.m10964(f43468, 83, 25, i21))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    } else {
                        iM45029 = (C19806.m45029("۟᩺") ^ i17) * 29;
                        i2 = ((iM45029 ^ i18) * (-25927)) ^ 1539606960;
                        i3 = -1394812264;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case 665940:
                case 813884822:
                    String str26 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    i25 = i25;
                    if (i == i25) {
                        attributeName = attributeName;
                        iM11306 = (i18 - ThreadFactoryC3888.m11306("ۤۧ")) * 85;
                        str = str26;
                        i6 = ((iM11306 ^ i17) * 8289) ^ (-1866896779);
                        i7 = 396307130;
                        r10 = r10;
                        int i2117 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str11115 = attributeName;
                        i20 = i2117;
                        attributeName = str11115;
                        String str11116 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str11116;
                    } else {
                        int iM113011 = (i17 - ThreadFactoryC3888.m11306("ۧ᩻")) * (-125);
                        i19 = ((iM113011 ^ i18) * (-8711)) ^ (-32795614);
                        i27 = i27;
                        attributeName = attributeName;
                        i20 = iM113011 ^ 212001680;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str26;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                    }
                    break;
                case 117961117:
                case 308407897:
                    interfaceC23537 = interfaceC23539;
                    c1035.f4823.add(i24);
                    if (c1035.f4824 != null) {
                        interfaceC23539 = interfaceC23537;
                        i27 = i27;
                        attributeName = attributeName;
                        iM11308 = C19806.m45029("۟ۡ") ^ i17;
                        i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                        i12 = -2084389338;
                        i11 = iM11308 ^ i12;
                        i27 = i27;
                        String str1219 = attributeName;
                        i20 = i11;
                        attributeName = str1219;
                    } else {
                        iM45029 = C19806.m45029("᩸۠") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-1735)) ^ 1417585144;
                        i3 = -552766195;
                        interfaceC23538 = interfaceC23537;
                        i20 = iM45029 ^ i3;
                        i19 = i2;
                        interfaceC23539 = interfaceC23538;
                    }
                    break;
                case 185027644:
                case 239434867:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    if (!AbstractC0464.m2315(str2, C1937.m6288(f43468, 17, 8, i21))) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i2118 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str11117 = attributeName;
                        i20 = i2118;
                        attributeName = str11117;
                        String str11118 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str11118;
                    } else {
                        iM450211 = (i17 - ThreadFactoryC3888.m11306("ۡۚ")) * 23;
                        i19 = ((iM450211 ^ i18) * (-26751)) ^ 1494826433;
                        i10 = -1150246583;
                        i11 = iM450211 ^ i10;
                        i27 = i27;
                        strM10964 = strM10964;
                        str2 = str2;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str12110 = attributeName;
                        i20 = i11;
                        attributeName = str12110;
                    }
                    break;
                case 338236811:
                case 1082693827:
                    interfaceC23537 = interfaceC23539;
                    C1035 c1036 = new C1035(iM27908);
                    c16667.mo8944(iM27908, c1036);
                    obj = c1036;
                    iM45029 = (C19806.m45029("᩹۬") ^ i18) * 57;
                    i2 = ((iM45029 ^ i17) * (-19521)) ^ (-83831100);
                    i3 = 1236553183;
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case 399692720:
                case 1526885353:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C2642.m8172(f43468, 228, 7, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (C19806.m45029("ܿ۫") + i17) * 83;
                        i2 = ((iM45029 ^ i18) * 24647) ^ 1375892868;
                        i3 = 1040467917;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case 432056010:
                case 1744492007:
                    interfaceC23537 = interfaceC23539;
                    if (C0817.m3404(strM9716, C2477.m7604(f43468, 245, 5, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֡") ^ i18) * (-39);
                        i2 = ((iM45029 ^ i17) * 27067) ^ (-156165377);
                        i3 = 2097732894;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case 447984464:
                case 904275902:
                    str = str2;
                    i21 = 49691;
                    iM11306 = C19806.m45029("᩸ܿ") ^ i18;
                    i6 = ((iM11306 ^ i17) * 8981) ^ (-1546768507);
                    i7 = -618035184;
                    r10 = r10;
                    int i2119 = iM11306 ^ i7;
                    i19 = i6;
                    i27 = i27;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str11119 = attributeName;
                    i20 = i2119;
                    attributeName = str11119;
                    String str111110 = str;
                    i25 = i25;
                    strM10964 = strM10964;
                    str2 = str111110;
                    break;
                case 503781061:
                case 675979904:
                    attributeCount = xmlResourceParserC11068.getAttributeCount();
                    i22 = xmlResourceParserC11069.f37566;
                    i23 = i28;
                    iM11308 = C19806.m45029("ۖۛ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-29741)) ^ (-2146038281);
                    i12 = 1388544317;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str12111 = attributeName;
                    i20 = i11;
                    attributeName = str12111;
                    break;
                case 565069044:
                case 2079436310:
                    i26 = 3;
                    strM10964 = strM10964;
                    iM450211 = (ThreadFactoryC3888.m11306("ۖᩳ") + i18) * (-57);
                    i19 = ((iM450211 ^ i17) * (-27589)) ^ 1953814994;
                    i10 = 2025616387;
                    i11 = iM450211 ^ i10;
                    i27 = i27;
                    strM10964 = strM10964;
                    str2 = str2;
                    xmlResourceParserC11069 = xmlResourceParserC11068;
                    String str12112 = attributeName;
                    i20 = i11;
                    attributeName = str12112;
                    break;
                case 746698194:
                case 1431602690:
                    interfaceC23537 = interfaceC23539;
                    if (C2124.m6675(strM9716, C1461.m5070(f43468, BERTags.FLAGS, 4, i21))) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۡ") ^ i18;
                        i2 = ((iM45029 ^ i17) * (-10563)) ^ (-1804044889);
                        i3 = -1335593094;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ֨") ^ i17;
                        i2 = ((iM45029 ^ i18) * 7131) ^ (-967111714);
                        i3 = -1688084185;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
                case 946037782:
                case 1498293797:
                    attributeName = attributeName;
                    i27 = i27;
                    str2 = str2;
                    if (!C1460.m5058(str2, C0050.m940(f43468, 68, 7, i21))) {
                        strM10964 = strM10964;
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i21110 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str111111 = attributeName;
                        i20 = i21110;
                        attributeName = str111111;
                        String str111112 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str111112;
                    } else {
                        int iM450213 = C19806.m45029("ۚ۠") ^ i17;
                        i19 = ((iM450213 ^ i18) * (-751)) ^ (-1495201953);
                        i11 = iM450213 ^ 2025329392;
                        str2 = str2;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str12113 = attributeName;
                        i20 = i11;
                        attributeName = str12113;
                    }
                    break;
                case 991514531:
                case 1688941721:
                    interfaceC23537 = interfaceC23539;
                    c1035.f4824 = ViewTreeObserverOnPreDrawListenerC3327.m9865(ViewGroupOnHierarchyChangeListenerC1916.m6241(f43468, 209, 4, i21), attributeName);
                    interfaceC23539 = interfaceC23537;
                    i27 = i27;
                    attributeName = attributeName;
                    iM11308 = C19806.m45029("۟ۡ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                    i12 = -2084389338;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str12114 = attributeName;
                    i20 = i11;
                    attributeName = str12114;
                    break;
                case 1057422858:
                case 1606009657:
                    c1035.f4824 = C0252.m1693(strM10964, attributeName);
                    i27 = i27;
                    attributeName = attributeName;
                    iM11308 = C19806.m45029("۟ۡ") ^ i17;
                    i19 = ((iM11308 ^ i18) * (-4703)) ^ (-591845681);
                    i12 = -2084389338;
                    i11 = iM11308 ^ i12;
                    i27 = i27;
                    String str12115 = attributeName;
                    i20 = i11;
                    attributeName = str12115;
                    break;
                case 1473835279:
                case 1639149554:
                    attributeName = attributeName;
                    str2 = str2;
                    i27 = i27;
                    strM10964 = strM10964;
                    if (!AbstractC0464.m2315(str2, C0797.m3361(f43468, 1, 8, i21))) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۤۗ") + i17) * 45;
                        str = str2;
                        i6 = ((iM11306 ^ i18) * (-27319)) ^ 614328558;
                        i7 = 2104168857;
                        r10 = r10;
                        int i21111 = iM11306 ^ i7;
                        i19 = i6;
                        i27 = i27;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str111113 = attributeName;
                        i20 = i21111;
                        attributeName = str111113;
                        String str111114 = str;
                        i25 = i25;
                        strM10964 = strM10964;
                        str2 = str111114;
                    } else {
                        iM450211 = (C19806.m45029("᩸ܳ") + i18) * 67;
                        i19 = ((iM450211 ^ i17) * (-19865)) ^ 1050091561;
                        i10 = -1244581459;
                        i11 = iM450211 ^ i10;
                        i27 = i27;
                        strM10964 = strM10964;
                        str2 = str2;
                        xmlResourceParserC11069 = xmlResourceParserC11068;
                        String str12116 = attributeName;
                        i20 = i11;
                        attributeName = str12116;
                    }
                    break;
                default:
                    interfaceC23537 = interfaceC23539;
                    if (attributeValue.matches(C2642.m8172(f43468, 171, 25, i21))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i18) * (-37);
                        i2 = ((iM45029 ^ i17) * 8865) ^ 809288954;
                        i3 = 866077215;
                    } else {
                        iM45029 = C19806.m45029("ۘۚ") ^ i17;
                        i2 = ((iM45029 ^ i18) * 8311) ^ (-1945488653);
                        i3 = 1282569399;
                    }
                    interfaceC23538 = interfaceC23537;
                    i20 = iM45029 ^ i3;
                    i19 = i2;
                    interfaceC23539 = interfaceC23538;
                    break;
            }
            return;
        }
    }
}
