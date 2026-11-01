package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩸֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2SJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21241 implements InterfaceC7836 {

    /* JADX INFO: renamed from: ᩸֫ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f69195 = {6081, 5561, 5606, 5626, 5603, 5617, 5631, 5624, 5561, 5605, 5619, 5623, 5604, 5621, 5630, 5602, 5619, 5614, 5602, 5627, 5625, 5604, 5619, 5606, 5625, 5605, 5631, 5602, 5619, 5627, 5605, 5629, 5631, 5624, 5618, 5600, 5621, 5605, 5625};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69196;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69197;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69198;

    @Override // l.InterfaceC7836
    public final void reset() {
        int i = 0;
        int i2 = -1127402961;
        int i3 = RunnableC3388.f12514;
        int i4 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("ۙۚ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-27635)) ^ 547067893;
        int i6 = -1554634392;
        while (true) {
            i2 = ((((i2 ^ i3) * 16369) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2077799334:
                case -997230698:
                    C1668.m5583();
                    iM11306 = C19806.m45029("ۛ֫") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-5583)) ^ 379330819;
                    i6 = 615717930;
                    break;
                case -2019599843:
                case -1345412784:
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21083)) ^ 492155343;
                        i6 = 2098333995;
                    } else {
                        iM11306 = C19806.m45029("֨۠") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-2907)) ^ (-864682500);
                        i6 = 1738892205;
                    }
                    break;
                case -1928952326:
                case -1646276064:
                    this.f69196 = true;
                    break;
                case -1626131398:
                case -608308209:
                    C0817.m3399();
                    if (C0216.f1393 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21083)) ^ 492155343;
                        i6 = 2098333995;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ֫")) * 51;
                        i5 = ((iM11306 ^ i3) * (-1445)) ^ (-72854977);
                        i6 = 1521438636;
                    }
                    break;
                case -1551435941:
                case 1136235222:
                    if (C0526.m2437() >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ֫")) * 51;
                        i5 = ((iM11306 ^ i3) * (-1445)) ^ (-72854977);
                        i6 = 1521438636;
                    } else {
                        iM11306 = C19806.m45029("ۛ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5583)) ^ 379330819;
                        i6 = 615717930;
                    }
                    break;
                case -1213890640:
                case -441602154:
                    if (C7105.m18985()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤۖ")) * (-27);
                        i5 = ((iM11306 ^ i3) * (-29491)) ^ 1162907947;
                        i6 = 2073743379;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 1411) ^ 1236773628;
                        i6 = -737623633;
                    }
                    break;
                case -1162659931:
                case 1080423118:
                    RunnableC3388.m10064();
                    break;
                case -1105071826:
                case -102599810:
                    i = 0;
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("ۗۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27109) ^ 1943035748;
                        i6 = -1279014746;
                    } else {
                        iM11306 = C19806.m45029("ۛ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5583)) ^ 379330819;
                        i6 = 615717930;
                    }
                    break;
                case -1085111875:
                case -500089792:
                    if (C19806.f63586) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤۖ")) * (-27);
                        i5 = ((iM11306 ^ i3) * (-29491)) ^ 1162907947;
                        i6 = 2073743379;
                    } else {
                        iM11306 = C19806.m45029("᩺ۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 30227) ^ 201736377;
                        i6 = -138402555;
                    }
                    break;
                case -914416036:
                case 422352964:
                    if (C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21083)) ^ 492155343;
                        i6 = 2098333995;
                    } else {
                        iM11306 = C19806.m45029("ۛۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28259)) ^ 1880409092;
                        i6 = -1176516574;
                    }
                    break;
                case -357294656:
                case 1882942839:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21083)) ^ 492155343;
                        i6 = 2098333995;
                    } else {
                        iM11306 = (C19806.m45029("᩸᩹") ^ i4) * 37;
                        i5 = ((iM11306 ^ i3) * 18293) ^ (-788855496);
                        i6 = -301880338;
                    }
                    break;
                case -106617814:
                case 292830646:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("֡ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16045)) ^ (-1524158246);
                        i6 = 1032237905;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۙ᩵")) * (-33);
                        i5 = ((iM11306 ^ i3) * (-20165)) ^ 78384844;
                        i6 = 413702080;
                    }
                    break;
                case 654670205:
                case 767812603:
                    if (C0962.f3784) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ֫")) * 51;
                        i5 = ((iM11306 ^ i3) * (-1445)) ^ (-72854977);
                        i6 = 1521438636;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩹֫")) * 67;
                        i5 = ((iM11306 ^ i3) * 8231) ^ 284664934;
                        i6 = 1356861417;
                    }
                    break;
                case 728744501:
                case 1586744311:
                    this.f69198 = i;
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤۖ")) * (-27);
                        i5 = ((iM11306 ^ i3) * (-29491)) ^ 1162907947;
                        i6 = 2073743379;
                    } else {
                        iM11306 = (C19806.m45029("۬ܳ") + i3) * (-67);
                        i5 = ((iM11306 ^ i4) * (-1509)) ^ (-945247319);
                        i6 = 945389006;
                    }
                    break;
                case 1617285578:
                case 1683246995:
                    C1461.m5080();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = C19806.m45029("֡ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16045)) ^ (-1524158246);
                        i6 = 1032237905;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܶ֫")) * 51;
                        i5 = ((iM11306 ^ i3) * (-1445)) ^ (-72854977);
                        i6 = 1521438636;
                    }
                    break;
                default:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("֡ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-16045)) ^ (-1524158246);
                        i6 = 1032237905;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩹۟")) * (-15);
                        i5 = ((iM11306 ^ i4) * (-7999)) ^ 612061619;
                        i6 = 1544777449;
                    }
                    break;
            }
            return;
        }
    }

    public C21241(String str) {
        int i = 0;
        int i2 = -845015643;
        int i3 = C1189.f5284;
        int i4 = RunnableC0195.f1321;
        int iM11306 = ThreadFactoryC3888.m11306("᩸֫") ^ i3;
        int i5 = ((iM11306 ^ i4) * 30831) ^ (-2093223708);
        int i6 = 1380661080;
        while (true) {
            i2 = ((((i2 ^ i4) * 18445) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2128419961:
                case -7893037:
                    C0050.m946();
                    throw new RuntimeException();
                case -1713926639:
                case -747899823:
                    if (C0278.m1789() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ۖ")) * (-67);
                        i5 = ((iM11306 ^ i4) * 21741) ^ (-744236813);
                        i6 = -362798687;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۗ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * (-959)) ^ 1979059342;
                        i6 = 487080324;
                    }
                    break;
                case -1713757035:
                case 1963059511:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * (-39);
                        i5 = ((iM11306 ^ i4) * 24277) ^ 692246910;
                        i6 = 1685515350;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") + i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 28581) ^ 1601457043;
                        i6 = 1666860440;
                    }
                    break;
                case -1635112645:
                case 1728926781:
                    C0050.m946();
                    iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * (-39);
                    i5 = ((iM11306 ^ i4) * 24277) ^ 692246910;
                    i6 = 1685515350;
                    break;
                case -1477243793:
                case -1313018247:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29053)) ^ (-1802464803);
                        i6 = 159042775;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") ^ i4) * (-31);
                        i5 = ((iM11306 ^ i3) * (-24935)) ^ (-1233549057);
                        i6 = -1051470972;
                    }
                    break;
                case -1431314031:
                case -1255345239:
                    RunnableC3388.m10064();
                    if (C2124.f7782 > 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۗ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * (-959)) ^ 1979059342;
                        i6 = 487080324;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * (-39);
                        i5 = ((iM11306 ^ i4) * 24277) ^ 692246910;
                        i6 = 1685515350;
                    }
                    break;
                case -1359741481:
                case 279935597:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ۖ")) * (-67);
                        i5 = ((iM11306 ^ i4) * 21741) ^ (-744236813);
                        i6 = -362798687;
                    } else {
                        iM11306 = (C19806.m45029("ۧۚ") + i3) * 87;
                        i5 = ((iM11306 ^ i4) * (-5333)) ^ (-660336237);
                        i6 = -1712800731;
                    }
                    break;
                case -1205077770:
                case -1012696454:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ۖ")) * (-67);
                        i5 = ((iM11306 ^ i4) * 21741) ^ (-744236813);
                        i6 = -362798687;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * 25139) ^ 894498786;
                        i6 = -895351715;
                    }
                    break;
                case -763023135:
                case 957344246:
                    if (C2704.f10408) {
                        iM11306 = (i3 - C19806.m45029("ۢ᩵")) * 97;
                        i5 = ((iM11306 ^ i4) * 4045) ^ 1168417171;
                        i6 = 612520009;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܰ") ^ i3) * (-39);
                        i5 = ((iM11306 ^ i4) * 24277) ^ 692246910;
                        i6 = 1685515350;
                    }
                    break;
                case -650754800:
                case 616915881:
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21279) ^ 538178368;
                        i6 = 973169440;
                    } else {
                        iM11306 = (C19806.m45029("ۖۖ") + i3) * (-37);
                        i5 = ((iM11306 ^ i4) * (-16339)) ^ 1981101409;
                        i6 = -897557111;
                    }
                    break;
                case -396336890:
                case -142326526:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ۖ")) * (-67);
                        i5 = ((iM11306 ^ i4) * 21741) ^ (-744236813);
                        i6 = -362798687;
                    } else {
                        iM11306 = C19806.m45029("᩸ܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24721)) ^ 1908694171;
                        i6 = -1276707856;
                    }
                    break;
                case -343053791:
                case 2090288273:
                    this.f69196 = true;
                    return;
                case -328948916:
                case 1769410395:
                    if (CallableC1627.f6528) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ۚ")) * (-75);
                        i5 = ((iM11306 ^ i3) * (-12905)) ^ (-1643475106);
                        i6 = -1722436928;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21279) ^ 538178368;
                        i6 = 973169440;
                    }
                    break;
                case 254223522:
                case 796445147:
                    this.f69198 = i;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 21279) ^ 538178368;
                        i6 = 973169440;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩵") ^ i4) * (-119);
                        i5 = ((iM11306 ^ i3) * (-17571)) ^ (-897471533);
                        i6 = -1418131169;
                    }
                    break;
                case 1345414801:
                case 1949691750:
                    if (C1668.f6641 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29053)) ^ (-1802464803);
                        i6 = 159042775;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۗ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * (-959)) ^ 1979059342;
                        i6 = 487080324;
                    }
                    break;
                default:
                    this.f69197 = str;
                    i = 0;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸ۖ")) * (-67);
                        i5 = ((iM11306 ^ i4) * 21741) ^ (-744236813);
                        i6 = -362798687;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۜۜ")) * (-123);
                        i5 = ((iM11306 ^ i3) * (-25545)) ^ (-1292669323);
                        i6 = 1906611561;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC7836
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo20667() {
        return this.f69196;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0264 A[PHI: r14 r15 r24
      0x0264: PHI (r14v4 java.lang.String) = (r14v3 java.lang.String), (r14v2 java.lang.String), (r14v2 java.lang.String) binds: [B:51:0x0262, B:47:0x0234, B:43:0x0203] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v2 java.lang.String), (r15v4 java.lang.String) binds: [B:51:0x0262, B:47:0x0234, B:43:0x0203] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r24v25 long) = (r24v23 long), (r24v24 long), (r24v26 long) binds: [B:51:0x0262, B:47:0x0234, B:43:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC7836
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20666() throws JSONException, C4987 {
        boolean z;
        int iM45029;
        int i;
        int i2;
        C21947 c21947;
        String str;
        short[] sArr;
        int iM11306;
        int i3;
        int i4;
        short[] sArr2;
        C5013 c5013M13902;
        int iM11307;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        boolean z2;
        String str2;
        C21947 c21948;
        int iM48780;
        int iM11308;
        int i11;
        int i12;
        JSONObject jSONObject;
        String str3;
        int iM450210;
        int i13;
        int i14;
        int i15 = 2092688016;
        int i16 = C3535.f13026;
        int i17 = C3577.f13150;
        int iM11309 = (i17 - ThreadFactoryC3888.m11306("᩶ܳ")) * 3;
        int i18 = ((iM11309 ^ i16) * (-21713)) ^ (-1722973718);
        int i19 = iM11309 ^ (-1417288304);
        C5013 c5013 = null;
        C21947 c21949 = null;
        JSONObject jSONObjectM48779 = null;
        String strM10571 = null;
        ArrayList arrayList = null;
        C18419 c18419 = null;
        long jM3005 = 0;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i20 = 0;
        boolean z3 = false;
        int i21 = 0;
        int i22 = 0;
        short s = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        JSONArray jSONArray = null;
        JSONObject jSONObject2 = null;
        String strM5479 = null;
        int i27 = 0;
        String strM54710 = null;
        int iM3005 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * 24551) >> 31));
            switch (i15) {
                case -2088321358:
                case -554510534:
                    z3 = true;
                    iM450210 = ThreadFactoryC3888.m11306("᩻᩺") ^ i16;
                    i13 = ((iM450210 ^ i17) * (-22735)) ^ (-322099175);
                    i14 = -1639213933;
                    i19 = iM450210 ^ i14;
                    i18 = i13;
                    break;
                case -2086533527:
                case -1045895213:
                    c18419.m42722(z3);
                    C3660.m10788(arrayList, c18419);
                    i27++;
                    jSONObject = jSONObjectM48779;
                    str3 = strM10571;
                    int iM113010 = (ThreadFactoryC3888.m11306("֡ܶ") ^ i17) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i19 = iM113010 ^ (-388648294);
                    jSONObjectM48779 = jSONObject;
                    strM10571 = str3;
                    i18 = ((iM113010 ^ i16) * (-12261)) ^ (-656239468);
                    jM3005 = jM3005;
                    break;
                case -1868672483:
                case 449785240:
                    jM3005 = jM3005;
                    strM5479 = RunnableC1606.m5479(jSONObject2, C0050.m940(f69195, 34, 1, i20));
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("֨ۗ") ^ i16;
                        i = ((iM45029 ^ i17) * (-15659)) ^ 584559446;
                        i2 = 448091026;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩻") + i16) * 7;
                        i = ((iM45029 ^ i17) * 31927) ^ 664938140;
                        i2 = 2124418601;
                    }
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    jM3005 = jM3005;
                    break;
                case -1809167335:
                case -1266595058:
                    c18419.m42719(jM3005);
                    jM3005 = jM3005;
                    if (C1875.m6106(jSONObject2, C0962.m3747(f69195, 38, 1, i20)) != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۫") ^ i17;
                        i = ((iM45029 ^ i16) * (-21791)) ^ (-1431069648);
                        i2 = 1144999837;
                    } else {
                        iM45029 = C19806.m45029("ۨܿ") ^ i16;
                        i = ((iM45029 ^ i17) * (-15273)) ^ (-376965596);
                        i2 = 339874052;
                    }
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    jM3005 = jM3005;
                    break;
                case -1751562774:
                case 142210237:
                    jM3005 = jM3005;
                    i22 = i22;
                    i24 = i24;
                    short[] sArr6 = sArr3;
                    i25 = i25;
                    z3 = z3;
                    c21949 = c21949;
                    strM10571 = strM10571;
                    sArr5 = sArr5;
                    int i28 = i26;
                    c5013M13902 = C5013.m13902(C1066.m4040(sArr6, i25, i28, i20));
                    sArr4 = f69195;
                    if (C1875.m6086() == 0) {
                        int iM450211 = C19806.m45029("᩷۟") ^ i17;
                        i8 = i20;
                        i9 = ((iM450211 ^ i16) * 10521) ^ (-867309140);
                        i10 = iM450211 ^ (-2019226874);
                        sArr3 = sArr6;
                        i25 = i25;
                        i26 = i28;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        i18 = i9;
                        strM10571 = strM10571;
                        i20 = i8;
                        c21949 = c21949;
                        z3 = z3;
                        i19 = i10;
                        i24 = i24;
                        int i29 = i22;
                        c5013 = c5013M13902;
                        i22 = i29;
                    } else {
                        i20 = i20;
                        sArr3 = sArr6;
                        i26 = i28;
                        int iM450212 = C19806.m45029("ۢ᩵") ^ i17;
                        i18 = ((iM450212 ^ i16) * (-23507)) ^ (-433852865);
                        i6 = iM450212 ^ 1769405196;
                        i25 = i25;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        sArr3 = sArr3;
                        strM10571 = strM10571;
                        c21949 = c21949;
                        z3 = z3;
                        i24 = i24;
                        int i30 = i20;
                        i19 = i6;
                        i20 = i30;
                        int i31 = i22;
                        c5013 = c5013M13902;
                        i22 = i31;
                    }
                    break;
                case -1626492245:
                case 1163254178:
                    ThreadFactoryC3888.m11300();
                    if (RunnableC0195.f1321 < 0) {
                        iM450210 = C19806.m45029("ۘܺ") ^ i17;
                        i13 = ((iM450210 ^ i16) * (-14963)) ^ (-394751172);
                        i14 = -800809917;
                        i19 = iM450210 ^ i14;
                        i18 = i13;
                    } else {
                        j = jM3005;
                        iM48780 = i24;
                        str2 = strM10571;
                        z2 = z3;
                        c21948 = c21949;
                        iM11308 = (C19806.m45029("ۙ᩵") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = iM48780;
                        i18 = ((iM11308 ^ i17) * (-9043)) ^ (-1528598947);
                        i12 = -193770885;
                        i19 = iM11308 ^ i12;
                        strM10571 = str2;
                        jM3005 = j;
                        int i32 = i11;
                        c21949 = c21948;
                        z3 = z2;
                        i24 = i32;
                    }
                    break;
                case -1609887984:
                case -1012784845:
                    jM3005 = jM3005;
                    if (i27 < jSONArray.length()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i16;
                        i = ((iM45029 ^ i17) * (-18235)) ^ 788388226;
                        i2 = -306348809;
                    } else {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("᩹᩵")) * (-53);
                        i = ((iM45029 ^ i16) * (-19205)) ^ 1637140193;
                        i2 = 568907777;
                    }
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    jM3005 = jM3005;
                    break;
                case -1560599765:
                case 2078011666:
                    i20 = i20;
                    jM3005 = jM3005;
                    i24 = i24;
                    sArr3 = sArr3;
                    i25 = i25;
                    z3 = z3;
                    c21949 = c21949;
                    strM10571 = strM10571;
                    sArr5 = sArr5;
                    sArr2 = sArr4;
                    C5013 c5014 = c5013;
                    i22 = i22;
                    c5013M13902 = c5014;
                    s = f69195[0];
                    i23 = s * 2;
                    if (RunnableC1606.m5473() == 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۗۛ") ^ i16) * 37;
                        i18 = ((iM11307 ^ i17) * (-6297)) ^ (-1811684964);
                        i5 = -568936013;
                        i6 = iM11307 ^ i5;
                        i25 = i25;
                        sArr4 = sArr2;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        sArr3 = sArr3;
                        strM10571 = strM10571;
                        c21949 = c21949;
                        z3 = z3;
                        i24 = i24;
                        int i33 = i20;
                        i19 = i6;
                        i20 = i33;
                        int i34 = i22;
                        c5013 = c5013M13902;
                        i22 = i34;
                    } else {
                        sArr4 = sArr2;
                        int iM450213 = C19806.m45029("ۢ᩵") ^ i17;
                        i18 = ((iM450213 ^ i16) * (-23507)) ^ (-433852865);
                        i6 = iM450213 ^ 1769405196;
                        i25 = i25;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        sArr3 = sArr3;
                        strM10571 = strM10571;
                        c21949 = c21949;
                        z3 = z3;
                        i24 = i24;
                        int i35 = i20;
                        i19 = i6;
                        i20 = i35;
                        int i36 = i22;
                        c5013 = c5013M13902;
                        i22 = i36;
                    }
                    break;
                case -1424971332:
                case -963823789:
                    int i37 = i20;
                    i24 = i24;
                    C21947 c219410 = c21949;
                    int i38 = this.f69198;
                    int i39 = C14892.f48653;
                    sArr3 = f69195;
                    i25 = 1;
                    i26 = 14;
                    int iM113011 = ThreadFactoryC3888.m11306("᩶֫") ^ i16;
                    sArr4 = sArr4;
                    c5013 = c5013;
                    sArr5 = sArr5;
                    i22 = i38;
                    strM10571 = strM10571;
                    i20 = i37;
                    i19 = iM113011 ^ (-931512320);
                    i18 = ((iM113011 ^ i17) * (-28067)) ^ 555622754;
                    c21949 = c219410;
                    z3 = z3;
                    jM3005 = jM3005;
                    i24 = i24;
                    break;
                case -1302482843:
                case 2001271650:
                    jM3005 = jM3005;
                    jSONObject2 = jSONArray.getJSONObject(i27);
                    c18419 = new C18419();
                    sArr5 = f69195;
                    i21 = 31;
                    iM45029 = (ThreadFactoryC3888.m11306("۫۬") ^ i16) * 41;
                    i = ((iM45029 ^ i17) * 3541) ^ (-1198099485);
                    i2 = 286763878;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    jM3005 = jM3005;
                    break;
                case -1209797096:
                case 1250493810:
                    C7105.m18985();
                    if (RunnableC1606.f6488 >= 0) {
                        jM3005 = jM3005;
                        z = z3;
                        c21947 = c21949;
                        str = strM10571;
                        sArr = sArr5;
                        iM11306 = (i17 - C19806.m45029("ۗۤ")) * (-105);
                        i3 = ((iM11306 ^ i16) * 28957) ^ (-693031946);
                        i4 = 1449780162;
                        i19 = iM11306 ^ i4;
                        i18 = i3;
                        sArr5 = sArr;
                        jM3005 = jM3005;
                        strM10571 = str;
                        c21949 = c21947;
                        z3 = z;
                        i24 = i24;
                    } else {
                        j = jM3005;
                        iM48780 = i24;
                        str2 = strM10571;
                        z2 = z3;
                        c21948 = c21949;
                        iM11308 = (C19806.m45029("ۙ᩵") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = iM48780;
                        i18 = ((iM11308 ^ i17) * (-9043)) ^ (-1528598947);
                        i12 = -193770885;
                        i19 = iM11308 ^ i12;
                        strM10571 = str2;
                        jM3005 = j;
                        int i310 = i11;
                        c21949 = c21948;
                        z3 = z2;
                        i24 = i310;
                    }
                    break;
                case -997248788:
                case 1940881687:
                    jM3005 = jM3005;
                    c18419.m42724(C0671.m3005(jSONObject2, ViewTreeObserverOnPreDrawListenerC3327.m9869(f69195, 36, 1, i20)));
                    if (C0050.f912 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹֫") ^ i17) * (-99);
                        i = ((iM45029 ^ i16) * 7323) ^ 1220648370;
                        i2 = -407215837;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        jM3005 = jM3005;
                    } else {
                        z3 = z3;
                        c21949 = c21949;
                        strM10571 = strM10571;
                        sArr5 = sArr5;
                        C5013 c5015 = c5013;
                        i22 = i22;
                        c5013M13902 = c5015;
                        int iM450214 = C19806.m45029("ۢ᩵") ^ i17;
                        i18 = ((iM450214 ^ i16) * (-23507)) ^ (-433852865);
                        i6 = iM450214 ^ 1769405196;
                        i25 = i25;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        sArr3 = sArr3;
                        strM10571 = strM10571;
                        c21949 = c21949;
                        z3 = z3;
                        i24 = i24;
                        int i311 = i20;
                        i19 = i6;
                        i20 = i311;
                        int i312 = i22;
                        c5013 = c5013M13902;
                        i22 = i312;
                    }
                    break;
                case -979503426:
                case 1945855162:
                    jM3005 = C0671.m3005(jSONObject2, C19806.m45020(f69195, 37, 1, i20));
                    iM450210 = (C19806.m45029("ܶۡ") + i16) * (-51);
                    i13 = ((iM450210 ^ i17) * (-21511)) ^ 2075190622;
                    i14 = 1386698124;
                    i19 = iM450210 ^ i14;
                    i18 = i13;
                    break;
                case -733973272:
                case 647730463:
                    C2249.m6915();
                    if (C7105.f23796 < 0) {
                        j = jM3005;
                        iM48780 = i24;
                        str2 = strM10571;
                        z2 = z3;
                        c21948 = c21949;
                        iM11308 = (C19806.m45029("ۙ᩵") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = iM48780;
                        i18 = ((iM11308 ^ i17) * (-9043)) ^ (-1528598947);
                        i12 = -193770885;
                        i19 = iM11308 ^ i12;
                        strM10571 = str2;
                        jM3005 = j;
                        int i313 = i11;
                        c21949 = c21948;
                        z3 = z2;
                        i24 = i313;
                    } else {
                        jM3005 = jM3005;
                        z3 = z3;
                        c21949 = c21949;
                        strM10571 = strM10571;
                        sArr5 = sArr5;
                        C5013 c5016 = c5013;
                        i22 = i22;
                        c5013M13902 = c5016;
                        int iM450215 = C19806.m45029("ۢ᩵") ^ i17;
                        i18 = ((iM450215 ^ i16) * (-23507)) ^ (-433852865);
                        i6 = iM450215 ^ 1769405196;
                        i25 = i25;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        sArr3 = sArr3;
                        strM10571 = strM10571;
                        c21949 = c21949;
                        z3 = z3;
                        i24 = i24;
                        int i314 = i20;
                        i19 = i6;
                        i20 = i314;
                        int i315 = i22;
                        c5013 = c5013M13902;
                        i22 = i315;
                    }
                    break;
                case -707232356:
                case 868176139:
                    return arrayList;
                case -511144780:
                case 1183461738:
                    jM3005 = jM3005;
                    c18419.m42720(strM5479);
                    c18419.m42733(RunnableC1606.m5479(jSONObject2, RunnableC3388.m10056(f69195, 35, 1, i20)));
                    if (C0216.f1393 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۧ") ^ i17;
                        i = ((iM45029 ^ i16) * 32485) ^ (-1612058178);
                        i2 = -379455255;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        jM3005 = jM3005;
                    } else {
                        z3 = z3;
                        c21949 = c21949;
                        strM10571 = strM10571;
                        sArr5 = sArr5;
                        C5013 c5017 = c5013;
                        i22 = i22;
                        c5013M13902 = c5017;
                        int iM450216 = C19806.m45029("ۢ᩵") ^ i17;
                        i18 = ((iM450216 ^ i16) * (-23507)) ^ (-433852865);
                        i6 = iM450216 ^ 1769405196;
                        i25 = i25;
                        sArr5 = sArr5;
                        jM3005 = jM3005;
                        sArr3 = sArr3;
                        strM10571 = strM10571;
                        c21949 = c21949;
                        z3 = z3;
                        i24 = i24;
                        int i316 = i20;
                        i19 = i6;
                        i20 = i316;
                        int i317 = i22;
                        c5013 = c5013M13902;
                        i22 = i317;
                    }
                    break;
                case -440455846:
                case 1313748002:
                    j = jM3005;
                    z2 = z3;
                    str2 = strM10571;
                    c21948 = c21949;
                    iM48780 = c21948.m48780(ThreadFactoryC3888.m11312(f69195, 23, 3, i20));
                    if (C3535.m10431() <= 0) {
                        iM11308 = (C19806.m45029("ۙ᩵") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = iM48780;
                        i18 = ((iM11308 ^ i17) * (-9043)) ^ (-1528598947);
                        i12 = -193770885;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ᩴۙ") + i16) * 53;
                        i11 = iM48780;
                        i18 = ((iM11308 ^ i17) * 1909) ^ (-193154596);
                        i12 = -518728808;
                    }
                    i19 = iM11308 ^ i12;
                    strM10571 = str2;
                    jM3005 = j;
                    int i318 = i11;
                    c21949 = c21948;
                    z3 = z2;
                    i24 = i318;
                    break;
                case -227730363:
                case 1268969548:
                    z3 = false;
                    iM450210 = ThreadFactoryC3888.m11306("᩻᩺") ^ i16;
                    i13 = ((iM450210 ^ i17) * (-22735)) ^ (-322099175);
                    i14 = -1639213933;
                    i19 = iM450210 ^ i14;
                    i18 = i13;
                    break;
                case -205826420:
                case 1563806784:
                    C2788.m8472();
                    return null;
                case 42596554:
                case 1100856738:
                    jSONObject = jSONObjectM48779;
                    str3 = strM10571;
                    JSONArray jSONArray2 = jSONObject.getJSONArray(str3);
                    jSONArray = jSONArray2;
                    arrayList = new ArrayList(jSONArray2.length());
                    i27 = 0;
                    int iM113012 = (ThreadFactoryC3888.m11306("֡ܶ") ^ i17) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i19 = iM113012 ^ (-388648294);
                    jSONObjectM48779 = jSONObject;
                    strM10571 = str3;
                    i18 = ((iM113012 ^ i16) * (-12261)) ^ (-656239468);
                    jM3005 = jM3005;
                    break;
                case 93838324:
                case 1206570596:
                    i20 = i20;
                    jM3005 = jM3005;
                    i24 = i24;
                    short[] sArr7 = sArr3;
                    i25 = i25;
                    z3 = z3;
                    c21949 = c21949;
                    strM10571 = strM10571;
                    sArr5 = sArr5;
                    sArr2 = sArr4;
                    C5013 c5018 = c5013;
                    i22 = i22;
                    c5013M13902 = c5018;
                    int i40 = s + 1;
                    if ((i23 + 1) - (i40 * i40) <= 0) {
                        iM11307 = (i17 - ThreadFactoryC3888.m11306("ۢܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        sArr3 = sArr7;
                        i18 = ((iM11307 ^ i16) * (-3955)) ^ (-762388854);
                        i5 = 71062059;
                    } else {
                        sArr3 = sArr7;
                        iM11307 = ThreadFactoryC3888.m11306("ۜۛ") ^ i16;
                        i18 = ((iM11307 ^ i17) * (-2695)) ^ 244399034;
                        i5 = 1951579276;
                    }
                    i6 = iM11307 ^ i5;
                    i25 = i25;
                    sArr4 = sArr2;
                    sArr5 = sArr5;
                    jM3005 = jM3005;
                    sArr3 = sArr3;
                    strM10571 = strM10571;
                    c21949 = c21949;
                    z3 = z3;
                    i24 = i24;
                    int i319 = i20;
                    i19 = i6;
                    i20 = i319;
                    int i3110 = i22;
                    c5013 = c5013M13902;
                    i22 = i3110;
                    break;
                case 137493694:
                case 1356233288:
                    jM3005 = jM3005;
                    i24 = i24;
                    z = z3;
                    c21947 = c21949;
                    str = strM10571;
                    sArr = sArr5;
                    this.f69196 = c21947.m48777(C1668.m5577(f69195, 19, 4, i20));
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻۫") ^ i17) * (-127);
                        i3 = ((iM11306 ^ i16) * 14357) ^ 298118964;
                        i4 = -701590183;
                    } else {
                        iM11306 = (i17 - C19806.m45029("ۗۤ")) * (-105);
                        i3 = ((iM11306 ^ i16) * 28957) ^ (-693031946);
                        i4 = 1449780162;
                    }
                    i19 = iM11306 ^ i4;
                    i18 = i3;
                    sArr5 = sArr;
                    jM3005 = jM3005;
                    strM10571 = str;
                    c21949 = c21947;
                    z3 = z;
                    i24 = i24;
                    break;
                case 168054766:
                case 2060153867:
                    throw new C4987(c21949.m48781());
                case 425362509:
                case 733109228:
                    c5013M13902 = c5013;
                    i7 = 33445;
                    int iM113013 = (ThreadFactoryC3888.m11306("۬᩶") + i17) * (-107);
                    i8 = i7;
                    i9 = ((iM113013 ^ i16) * (-975)) ^ 1998330161;
                    i10 = iM113013 ^ (-1923235982);
                    sArr3 = sArr3;
                    i25 = i25;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    jM3005 = jM3005;
                    i18 = i9;
                    strM10571 = strM10571;
                    i20 = i8;
                    c21949 = c21949;
                    z3 = z3;
                    i19 = i10;
                    i24 = i24;
                    int i210 = i22;
                    c5013 = c5013M13902;
                    i22 = i210;
                    break;
                case 493580829:
                case 2075458261:
                    jM3005 = jM3005;
                    i24 = i24;
                    String str4 = strM10571;
                    z = z3;
                    short[] sArr8 = sArr5;
                    short[] sArr9 = sArr4;
                    C5013 c5019 = c5013;
                    C3577.m10570(c5019, C2249.m6918(sArr9, 15, 4, i20), this.f69197);
                    int i41 = i22;
                    c5019.m13906(i41);
                    C21947 c21947M13910 = c5019.m13910();
                    if (!c21947M13910.m48774()) {
                        int iM113014 = (ThreadFactoryC3888.m11306("֫۠") + i17) * 51;
                        i19 = iM113014 ^ (-1379671501);
                        i18 = ((iM113014 ^ i16) * (-20305)) ^ (-1859183796);
                        sArr4 = sArr9;
                        sArr5 = sArr8;
                        jM3005 = jM3005;
                        strM10571 = str4;
                        c21949 = c21947M13910;
                        i22 = i41;
                        c5013 = c5019;
                        z3 = z;
                        i24 = i24;
                    } else {
                        int iM113015 = (i16 - ThreadFactoryC3888.m11306("֡ۛ")) * (-49);
                        i18 = ((iM113015 ^ i17) * (-23871)) ^ 1502723822;
                        i19 = iM113015 ^ (-1375287051);
                        sArr4 = sArr9;
                        i22 = i41;
                        sArr5 = sArr8;
                        c5013 = c5019;
                        strM10571 = str4;
                        z3 = z;
                        c21949 = c21947M13910;
                        i24 = i24;
                        jM3005 = jM3005;
                    }
                    break;
                case 632491524:
                case 1673436133:
                    C0817.m3399();
                    jM3005 = jM3005;
                    z3 = z3;
                    c21949 = c21949;
                    strM10571 = strM10571;
                    sArr5 = sArr5;
                    C5013 c50110 = c5013;
                    i22 = i22;
                    c5013M13902 = c50110;
                    int iM450217 = C19806.m45029("ۢ᩵") ^ i17;
                    i18 = ((iM450217 ^ i16) * (-23507)) ^ (-433852865);
                    i6 = iM450217 ^ 1769405196;
                    i25 = i25;
                    sArr5 = sArr5;
                    jM3005 = jM3005;
                    sArr3 = sArr3;
                    strM10571 = strM10571;
                    c21949 = c21949;
                    z3 = z3;
                    i24 = i24;
                    int i3111 = i20;
                    i19 = i6;
                    i20 = i3111;
                    int i3112 = i22;
                    c5013 = c5013M13902;
                    i22 = i3112;
                    break;
                case 701923091:
                case 2145120108:
                    jM3005 = jM3005;
                    c18419.m42715(strM54710);
                    c18419.m42731(C2477.m7600(jSONObject2, C0278.m1774(f69195, 33, 1, i20)));
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("֨ۗ") ^ i16;
                        i = ((iM45029 ^ i17) * (-15659)) ^ 584559446;
                        i2 = 448091026;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩻") ^ i17) * 87;
                        i = ((iM45029 ^ i16) * (-11149)) ^ (-1191528109);
                        i2 = -2128228395;
                    }
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    jM3005 = jM3005;
                    break;
                case 990081100:
                case 1867252259:
                    i24 = i24;
                    this.f69198 = i24;
                    jSONObjectM48779 = c21949.m48779();
                    strM10571 = C3577.m10571(f69195, 26, 5, i20);
                    int iM113016 = ThreadFactoryC3888.m11306("۬ܰ") ^ i16;
                    i19 = iM113016 ^ 1567168785;
                    i18 = ((iM113016 ^ i17) * (-11785)) ^ (-1659464368);
                    z3 = z3;
                    jM3005 = jM3005;
                    i24 = i24;
                    break;
                case 1273023368:
                case 1811568747:
                    jM3005 = jM3005;
                    c18419.m42730(iM3005);
                    strM54710 = RunnableC1606.m5479(jSONObject2, ViewTreeObserverOnPreDrawListenerC3327.m9869(f69195, 32, 1, i20));
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("֨ۗ") ^ i16;
                        i = ((iM45029 ^ i17) * (-15659)) ^ 584559446;
                        i2 = 448091026;
                    } else {
                        iM45029 = C19806.m45029("᩵ܳ") ^ i16;
                        i = ((iM45029 ^ i17) * (-32709)) ^ 422411097;
                        i2 = 1983215698;
                    }
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    jM3005 = jM3005;
                    break;
                case 1342486665:
                case 2072514586:
                    c5013M13902 = c5013;
                    i7 = 5526;
                    int iM113017 = (ThreadFactoryC3888.m11306("۬᩶") + i17) * (-107);
                    i8 = i7;
                    i9 = ((iM113017 ^ i16) * (-975)) ^ 1998330161;
                    i10 = iM113017 ^ (-1923235982);
                    sArr3 = sArr3;
                    i25 = i25;
                    sArr4 = sArr4;
                    sArr5 = sArr5;
                    jM3005 = jM3005;
                    i18 = i9;
                    strM10571 = strM10571;
                    i20 = i8;
                    c21949 = c21949;
                    z3 = z3;
                    i19 = i10;
                    i24 = i24;
                    int i211 = i22;
                    c5013 = c5013M13902;
                    i22 = i211;
                    break;
                default:
                    jM3005 = jM3005;
                    iM3005 = C0671.m3005(jSONObject2, C0962.m3747(sArr5, i21, 1, i20));
                    if (C1937.f7317 < 0) {
                        iM45029 = (i17 - C19806.m45029("۫ܺ")) * 21;
                        i = ((iM45029 ^ i16) * (-19647)) ^ 479214280;
                        i2 = -115045636;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        jM3005 = jM3005;
                    } else {
                        z = z3;
                        c21947 = c21949;
                        str = strM10571;
                        sArr = sArr5;
                        iM11306 = (i17 - C19806.m45029("ۗۤ")) * (-105);
                        i3 = ((iM11306 ^ i16) * 28957) ^ (-693031946);
                        i4 = 1449780162;
                        i19 = iM11306 ^ i4;
                        i18 = i3;
                        sArr5 = sArr;
                        jM3005 = jM3005;
                        strM10571 = str;
                        c21949 = c21947;
                        z3 = z;
                        i24 = i24;
                    }
                    break;
            }
        }
    }
}
