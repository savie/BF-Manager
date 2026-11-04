package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩹֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23214 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۤۧۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f75199 = {169, 24773, 24788, 24780, 24828, 24795, 24787, 24794, 24708, 24826, 24830, 24708, 24705, 24716, 24710, 24716, 24707, 24710, 24716, 24707, 24711, 24711, 24710, 24705, 24704, 24707};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75200;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f75201;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75202;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IWXAPI f75203;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f75204;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75205;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C23214(AbstractActivityC17204 abstractActivityC17204, String str, long j, int i, String str2, IWXAPI iwxapi) {
        int i2 = 1640460264;
        int i3 = C0773.f2792;
        int i4 = C2834.f9334;
        this.f75204 = abstractActivityC17204;
        this.f75202 = str;
        this.f75201 = j;
        this.f75200 = i;
        this.f75205 = str2;
        this.f75203 = iwxapi;
        int iM3169 = C0773.m3169("ۚ᩹") ^ i4;
        int i5 = ((iM3169 ^ i3) * 12815) ^ 1665618884;
        int i6 = -1783591302;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i3) * 32231) >> 31));
            switch (i2) {
                case -2045731940:
                case 306208782:
                    C2287.m7745();
                    C0773.m3161();
                    iM3169 = (i4 - C0773.m3169("۬ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i5 = ((iM3169 ^ i3) * (-30281)) ^ 1610915169;
                    i6 = 1329296550;
                    break;
                case -1848339562:
                case 1147071675:
                    C20932.m47848();
                    if (!C1343.m4943()) {
                        iM3169 = (i4 - C0773.m3169("۬ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i3) * (-30281)) ^ 1610915169;
                        i6 = 1329296550;
                    } else {
                        iM3169 = C0773.m3169("ۘۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 29657) ^ (-305344987);
                        i6 = 892945148;
                    }
                    break;
                case -1830684712:
                case -874778928:
                    C3492.m11488();
                    RunnableC1848.m6360();
                    throw new RuntimeException();
                case -1646980688:
                case 2054171693:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i4 - C0773.m3169("۬ܶ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i3) * (-30281)) ^ 1610915169;
                        i6 = 1329296550;
                    } else {
                        iM3169 = C0619.m2761("ᩴۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-11625)) ^ (-1603023372);
                        i6 = 1625104980;
                    }
                    break;
                case -732917457:
                case -97388771:
                    if (C3690.f12684 > 0) {
                        iM3169 = C0773.m3169("ۘۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 29657) ^ (-305344987);
                        i6 = 892945148;
                    } else {
                        iM3169 = C0619.m2761("֫ۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 31255) ^ (-353957485);
                        i6 = 918561433;
                    }
                    break;
                case 351145793:
                case 1707985918:
                    return;
                default:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۙۖ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 18779) ^ 2125864894;
                        i6 = -1692794910;
                    } else {
                        iM3169 = C0619.m2761("᩸ۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-6351)) ^ 2023279034;
                        i6 = 1718832260;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C3779.m12267(this, this.f75204);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0200 A[PHI: r2 r5 r6 r13 r27
      0x0200: PHI (r2v54 int) = (r2v2 int), (r2v50 int), (r2v2 int) binds: [B:42:0x01fe, B:38:0x01d2, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r5v7 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:42:0x01fe, B:38:0x01d2, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r6v7 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]) binds: [B:42:0x01fe, B:38:0x01d2, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r13v7 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:42:0x01fe, B:38:0x01d2, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x0200: PHI (r27v44 short[]) = (r27v33 short[]), (r27v34 short[]), (r27v45 short[]) binds: [B:42:0x01fe, B:38:0x01d2, B:18:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        JSONObject jSONObject;
        int i;
        long j;
        short[] sArr;
        int iM2761;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int iM2762;
        int i8;
        String str2;
        long j2;
        JSONObject jSONObject2;
        String str3;
        int i9;
        int i10;
        C2592 c2592M12270;
        int i11;
        final JSONObject jSONObject3;
        int iM2763;
        int i12;
        int i13 = C2966.f9654;
        int i14 = AbstractC3624.f12429;
        int iM2764 = (C0619.m2761("۠۫") + i13) * 19;
        int i15 = ((iM2764 ^ i14) * (-10145)) ^ 62082949;
        long j3 = 0;
        JSONObject jSONObjectM43548 = null;
        String strM4238 = null;
        String strM3780 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i16 = iM2764 ^ (-2008157693);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        String str4 = null;
        int i23 = 525230911;
        C2592 c2592 = null;
        JSONObject jSONObject4 = null;
        PayReq payReq = null;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            i23 = i16 ^ (i15 & (((i23 ^ i14) * (-22049)) >> 31));
            switch (i23) {
                case -2080385145:
                case 2024802909:
                    strM3780 = C0950.m3780(f75199, 24, 1, i20);
                    if (!C1321.m4852()) {
                        sArr5 = sArr5;
                        i11 = i22;
                        str2 = str4;
                        i10 = i24;
                        String str5 = strM4238;
                        i9 = i17;
                        c2592M12270 = c2592;
                        j2 = j3;
                        jSONObject2 = jSONObjectM43548;
                        str3 = str5;
                        int iM2765 = C0619.m2761("ۚ᩵") ^ i13;
                        jSONObjectM43548 = jSONObject2;
                        int i26 = i10;
                        str4 = str2;
                        i15 = ((iM2765 ^ i14) * (-17175)) ^ 956871180;
                        j = j2;
                        c2592 = c2592M12270;
                        i22 = i11;
                        sArr5 = sArr5;
                        i17 = i9;
                        i16 = iM2765 ^ (-1863680876);
                        i24 = i26;
                        strM4238 = str3;
                        j3 = j;
                    } else {
                        iM2763 = (C0619.m2761("ܺۡ") + i14) * 35;
                        i6 = ((iM2763 ^ i13) * (-21111)) ^ 5432616;
                        i12 = -1224244602;
                        i16 = iM2763 ^ i12;
                        i15 = i6;
                    }
                    break;
                case -2049825613:
                case -248045841:
                    sArr5 = sArr5;
                    i = i24;
                    c2592 = c2592;
                    i22 = i22;
                    j3 = j3;
                    jSONObject = jSONObjectM43548;
                    strM4238 = strM4238;
                    i17 = i17;
                    String strM3167 = C0773.m3167();
                    String str6 = this.f75202;
                    if (!C15243.m36589((Object) str6, (Object) strM3167)) {
                        str4 = str6;
                        jSONObjectM43548 = jSONObject;
                        int iM2766 = C0619.m2761("ܳܳ") ^ i14;
                        i24 = i;
                        str4 = str4;
                        i15 = ((iM2766 ^ i13) * 13223) ^ (-1503717363);
                        sArr5 = sArr5;
                        i16 = iM2766 ^ (-1244293379);
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    } else {
                        int iM2767 = C0619.m2761("᩷۬") ^ i13;
                        i4 = ((iM2767 ^ i14) * 11721) ^ (-2035033859);
                        i5 = iM2767 ^ 824703463;
                        i24 = i;
                        jSONObjectM43548 = jSONObject;
                        str4 = str6;
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                        sArr = sArr5;
                        i16 = i5;
                        i15 = i4;
                        sArr5 = sArr;
                    }
                    break;
                case -1851858511:
                case -1127668919:
                    sArr5 = sArr5;
                    str4 = str4;
                    i = i24;
                    long j4 = j3;
                    JSONObject jSONObject5 = jSONObjectM43548;
                    strM4238 = strM4238;
                    i17 = i17;
                    if (j4 != C3076.f9997) {
                        c2592 = c2592;
                        i22 = i22;
                        jSONObjectM43548 = jSONObject5;
                        j3 = j4;
                        int iM2768 = C0619.m2761("ܳܳ") ^ i14;
                        i24 = i;
                        str4 = str4;
                        i15 = ((iM2768 ^ i13) * 13223) ^ (-1503717363);
                        sArr5 = sArr5;
                        i16 = iM2768 ^ (-1244293379);
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    } else {
                        int iM2769 = C0619.m2761("ۚۘ") ^ i14;
                        jSONObjectM43548 = jSONObject5;
                        str4 = str4;
                        i15 = ((iM2769 ^ i13) * 20489) ^ (-1656976976);
                        i16 = iM2769 ^ 1327250676;
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j4;
                        i24 = i;
                        sArr5 = sArr5;
                    }
                    break;
                case -1807592786:
                case 445770497:
                    C11235.m28309();
                    break;
                case -1728539186:
                case 199030678:
                    if (C23916.f77426 <= 0) {
                        sArr5 = sArr5;
                        i11 = i22;
                        str2 = str4;
                        i10 = i24;
                        String str7 = strM4238;
                        i9 = i17;
                        c2592M12270 = c2592;
                        j2 = j3;
                        jSONObject2 = jSONObjectM43548;
                        str3 = str7;
                        int iM27610 = C0619.m2761("ۚ᩵") ^ i13;
                        jSONObjectM43548 = jSONObject2;
                        int i27 = i10;
                        str4 = str2;
                        i15 = ((iM27610 ^ i14) * (-17175)) ^ 956871180;
                        j = j2;
                        c2592 = c2592M12270;
                        i22 = i11;
                        sArr5 = sArr5;
                        i17 = i9;
                        i16 = iM27610 ^ (-1863680876);
                        i24 = i27;
                        strM4238 = str3;
                        j3 = j;
                    } else {
                        sArr5 = sArr5;
                        str = strM4238;
                        i9 = i17;
                        jSONObject3 = jSONObjectM43548;
                        int iM3169 = (C0773.m3169("ۛ۠") ^ i13) * (-77);
                        i6 = ((iM3169 ^ i14) * (-1809)) ^ 905787492;
                        i7 = iM3169 ^ 271261870;
                        jSONObjectM43548 = jSONObject3;
                        i17 = i9;
                        strM4238 = str;
                        sArr5 = sArr5;
                        i16 = i7;
                        i15 = i6;
                    }
                    break;
                case -1623998818:
                case 1431876570:
                    C3099.m10095();
                    if (!C1519.m5403()) {
                        iM2763 = (C0619.m2761("᩹ۤ") ^ i14) * 37;
                        i6 = ((iM2763 ^ i13) * 9061) ^ 1858018598;
                        i12 = -223039757;
                        i16 = iM2763 ^ i12;
                        i15 = i6;
                    } else {
                        sArr5 = sArr5;
                        i11 = i22;
                        str2 = str4;
                        i10 = i24;
                        String str8 = strM4238;
                        i9 = i17;
                        c2592M12270 = c2592;
                        j2 = j3;
                        jSONObject2 = jSONObjectM43548;
                        str3 = str8;
                        int iM27611 = C0619.m2761("ۚ᩵") ^ i13;
                        jSONObjectM43548 = jSONObject2;
                        int i28 = i10;
                        str4 = str2;
                        i15 = ((iM27611 ^ i14) * (-17175)) ^ 956871180;
                        j = j2;
                        c2592 = c2592M12270;
                        i22 = i11;
                        sArr5 = sArr5;
                        i17 = i9;
                        i16 = iM27611 ^ (-1863680876);
                        i24 = i28;
                        strM4238 = str3;
                        j3 = j;
                    }
                    break;
                case -1618641915:
                case 767224195:
                    i20 = 26338;
                    iM2761 = C0619.m2761("֫ᩴ") ^ i14;
                    i2 = ((iM2761 ^ i13) * 24383) ^ (-1273235012);
                    i3 = -1160052980;
                    int i29 = iM2761 ^ i3;
                    i24 = i24;
                    str4 = str4;
                    sArr5 = sArr5;
                    i16 = i29;
                    i15 = i2;
                    jSONObjectM43548 = jSONObjectM43548;
                    i17 = i17;
                    strM4238 = strM4238;
                    j3 = j3;
                    c2592 = c2592;
                    i22 = i22;
                    break;
                case -1607271397:
                case 1088658515:
                    sArr5 = sArr5;
                    str2 = str4;
                    j2 = j3;
                    jSONObject2 = jSONObjectM43548;
                    str3 = strM4238;
                    i9 = i17;
                    i10 = i24;
                    C17930 c17930 = C3076.f9993;
                    c2592M12270 = C3779.m12270(4370);
                    c2592M12270.m8681(this.f75200);
                    i11 = 1;
                    if (C3448.f11240 >= 0) {
                        int iM27612 = C0619.m2761("ۚ᩵") ^ i13;
                        jSONObjectM43548 = jSONObject2;
                        int i210 = i10;
                        str4 = str2;
                        i15 = ((iM27612 ^ i14) * (-17175)) ^ 956871180;
                        j = j2;
                        c2592 = c2592M12270;
                        i22 = i11;
                        sArr5 = sArr5;
                        i17 = i9;
                        i16 = iM27612 ^ (-1863680876);
                        i24 = i210;
                        strM4238 = str3;
                        j3 = j;
                    } else {
                        int iM27613 = C0619.m2761("᩹᩶") ^ i14;
                        int i30 = ((iM27613 ^ i13) * 843) ^ (-1579554839);
                        jSONObjectM43548 = jSONObject2;
                        sArr5 = sArr5;
                        i16 = iM27613 ^ 1340331704;
                        i24 = i10;
                        str4 = str2;
                        i15 = i30;
                        c2592 = c2592M12270;
                        i17 = i9;
                        i22 = 1;
                        strM4238 = str3;
                        j3 = j2;
                    }
                    break;
                case -1494725793:
                case 82955264:
                    sArr5 = sArr5;
                    str = strM4238;
                    i9 = i17;
                    jSONObject3 = jSONObjectM43548;
                    String strM4239 = C1146.m4238(jSONObject3, C1826.m6310(f75199, 1, 7, i20));
                    if (C4282.f15546 <= 0) {
                        int iM31610 = (C0773.m3169("ۛ۠") ^ i13) * (-77);
                        i6 = ((iM31610 ^ i14) * (-1809)) ^ 905787492;
                        i7 = iM31610 ^ 271261870;
                        jSONObjectM43548 = jSONObject3;
                        i17 = i9;
                        strM4238 = str;
                        sArr5 = sArr5;
                        i16 = i7;
                        i15 = i6;
                    } else {
                        final String str9 = str4;
                        i10 = i24;
                        final long j5 = j3;
                        str3 = str;
                        C3076.f9994 = new Runnable() { // from class: l.ܶ֨᩻

                            /* JADX INFO: renamed from: ܳ᩻֨, reason: not valid java name and contains not printable characters */
                            private static final short[] f51225 = {7200, 23140, 23161, 23151, 23150, 23161, 23106, 23151, 23148, 23150, 23167, 23128, 23167, 23161, 23138, 23141, 23148, 23075, 23077, 23077, 23077, 23074};

                            {
                                int i31 = -895614904;
                                int i32 = C2419.f7754;
                                int i33 = AbstractC0641.f2496;
                                int iM27614 = C0619.m2761("ۛ᩶") ^ i33;
                                int i34 = ((iM27614 ^ i32) * 17255) ^ 1196112798;
                                int i35 = 1079655354;
                                while (true) {
                                    i31 = ((((i31 ^ i32) * 13563) >> 31) & i34) ^ (iM27614 ^ i35);
                                    switch (i31) {
                                        case -1803704339:
                                        case -632303571:
                                            if (C3998.f13671 != 0) {
                                                iM27614 = C0773.m3169("ۢ۫") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 11727) ^ (-302826247);
                                                i35 = 630320957;
                                            } else {
                                                iM27614 = (C0619.m2761("ᩴۢ") + i32) * (-43);
                                                i34 = ((iM27614 ^ i33) * (-10859)) ^ 1253100344;
                                                i35 = -850240616;
                                            }
                                            break;
                                        case -1781198732:
                                        case 1521684926:
                                            if (C1343.m4943()) {
                                                iM27614 = (C0619.m2761("᩻ۙ") + i33) * 49;
                                                i34 = ((iM27614 ^ i32) * 15759) ^ (-22099802);
                                                i35 = 134055261;
                                            } else {
                                                iM27614 = C0773.m3169("ۢ۫") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 11727) ^ (-302826247);
                                                i35 = 630320957;
                                            }
                                            break;
                                        case -1577246628:
                                        case 1918685482:
                                            RunnableC3646.m11813();
                                            if (C1783.f6087 <= 0) {
                                                iM27614 = C0773.m3169("ᩴۨ") ^ i33;
                                                i34 = ((iM27614 ^ i32) * (-13619)) ^ (-1511822195);
                                                i35 = -767751454;
                                            } else {
                                                iM27614 = C0773.m3169("ܶۚ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 31623) ^ 939076932;
                                                i35 = -759195564;
                                            }
                                            break;
                                        case -1471322955:
                                        case -378897383:
                                            if (C23916.f77426 <= 0) {
                                                iM27614 = C0773.m3169("ᩴۨ") ^ i33;
                                                i34 = ((iM27614 ^ i32) * (-13619)) ^ (-1511822195);
                                                i35 = -767751454;
                                            } else {
                                                iM27614 = C0619.m2761("᩸᩺") ^ i33;
                                                i34 = ((iM27614 ^ i32) * (-9999)) ^ (-1203353672);
                                                i35 = 2054200814;
                                            }
                                            break;
                                        case -1377373442:
                                        case -213290344:
                                            C3099.m10095();
                                            if (C2310.f7472 < 0) {
                                                iM27614 = C0619.m2761("ܽ᩶") ^ i32;
                                                i34 = ((iM27614 ^ i33) * (-17067)) ^ (-1611781885);
                                                i35 = -97785223;
                                            } else {
                                                iM27614 = C0773.m3169("ܶۚ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 31623) ^ 939076932;
                                                i35 = -759195564;
                                            }
                                            break;
                                        case -1075139402:
                                        case 1517728443:
                                            if (C2023.f6737) {
                                                iM27614 = C0773.m3169("ۢ۫") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 11727) ^ (-302826247);
                                                i35 = 630320957;
                                            } else {
                                                iM27614 = C0619.m2761("᩹ۘ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * (-6369)) ^ (-269238542);
                                                i35 = -1715969933;
                                            }
                                            break;
                                        case -896581453:
                                        case 730671256:
                                            if (RunnableC0334.f1808 <= 0) {
                                                iM27614 = C0773.m3169("ᩴۨ") ^ i33;
                                                i34 = ((iM27614 ^ i32) * (-13619)) ^ (-1511822195);
                                                i35 = -767751454;
                                            } else {
                                                iM27614 = C0773.m3169("᩵ܽ") ^ i33;
                                                i34 = ((iM27614 ^ i32) * 8175) ^ 972107792;
                                                i35 = -499393660;
                                            }
                                            break;
                                        case -683059880:
                                        case -144055111:
                                            if (C1519.m5403()) {
                                                iM27614 = C0619.m2761("᩹᩺") ^ i33;
                                                i34 = ((iM27614 ^ i32) * 26209) ^ (-898839372);
                                                i35 = -794793880;
                                            } else {
                                                iM27614 = C0619.m2761("ܽ᩶") ^ i32;
                                                i34 = ((iM27614 ^ i33) * (-17067)) ^ (-1611781885);
                                                i35 = -97785223;
                                            }
                                            break;
                                        case -570045376:
                                        case 385561354:
                                            if (C2834.f9334 <= 0) {
                                                iM27614 = C0773.m3169("ᩴۨ") ^ i33;
                                                i34 = ((iM27614 ^ i32) * (-13619)) ^ (-1511822195);
                                                i35 = -767751454;
                                            } else {
                                                iM27614 = C0773.m3169("ܳ᩹") ^ i33;
                                                i34 = ((iM27614 ^ i32) * 263) ^ (-200833090);
                                                i35 = 580389089;
                                            }
                                            break;
                                        case -496045510:
                                        case 1523105722:
                                            C1783.m6232();
                                            throw new RuntimeException();
                                        case -257538274:
                                        case 96456060:
                                            if (C1519.f5300 >= 0) {
                                                iM27614 = C0773.m3169("ܶۚ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 31623) ^ 939076932;
                                                i35 = -759195564;
                                            } else {
                                                iM27614 = C0619.m2761("ۗ۬") ^ i32;
                                                i34 = ((iM27614 ^ i33) * (-26755)) ^ (-1127779272);
                                                i35 = 2132737990;
                                            }
                                            break;
                                        case -251971723:
                                        case 1491838436:
                                            if (!C3779.m12264()) {
                                                iM27614 = (C0773.m3169("۬ۤ") ^ i33) * (-81);
                                                i34 = ((iM27614 ^ i32) * (-6735)) ^ 1578028584;
                                                i35 = -2120134120;
                                            } else {
                                                iM27614 = C0773.m3169("ܶۚ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 31623) ^ 939076932;
                                                i35 = -759195564;
                                            }
                                            break;
                                        case -236448671:
                                        case 201188595:
                                            if (C3033.f9831 >= 0) {
                                                iM27614 = (C0773.m3169("۬ۤ") ^ i33) * (-81);
                                                i34 = ((iM27614 ^ i32) * (-6735)) ^ 1578028584;
                                                i35 = -2120134120;
                                            } else {
                                                iM27614 = C0619.m2761("ܽۨ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 20263) ^ 1399851023;
                                                i35 = -758892673;
                                            }
                                            break;
                                        case 298621574:
                                        case 1938548397:
                                            return;
                                        case 1345706750:
                                        case 1760392478:
                                            if (C2878.m9491() <= 0) {
                                                iM27614 = C0773.m3169("ܶۚ") ^ i32;
                                                i34 = ((iM27614 ^ i33) * 31623) ^ 939076932;
                                                i35 = -759195564;
                                            } else {
                                                iM27614 = C0619.m2761("ۗ᩶") ^ i32;
                                                i34 = ((iM27614 ^ i33) * (-26953)) ^ 2069489043;
                                                i35 = 2040478612;
                                            }
                                            break;
                                        default:
                                            C1519.m5403();
                                            iM27614 = C0773.m3169("ܶۚ") ^ i32;
                                            i34 = ((iM27614 ^ i33) * 31623) ^ 939076932;
                                            i35 = -759195564;
                                            break;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                short s2;
                                int iM27614;
                                int i31;
                                int i32;
                                short s3;
                                int iM27615;
                                int i33;
                                int i34;
                                int i35;
                                int iM27616;
                                int i36;
                                int i37;
                                int i38;
                                int iM31611;
                                short[] sArr6;
                                RunnableC15754 runnableC15754 = this;
                                int i39 = C1783.f6087;
                                int i40 = C2419.f7754;
                                int iM27617 = C0619.m2761("۟۬") ^ i39;
                                int i41 = ((iM27617 ^ i40) * (-759)) ^ (-494815695);
                                short[] sArr7 = null;
                                short[] sArr8 = null;
                                short[] sArr9 = null;
                                int i42 = iM27617 ^ (-1413564638);
                                int i43 = 0;
                                int i44 = 0;
                                int i45 = 0;
                                int i46 = 0;
                                int i47 = 0;
                                int i48 = 0;
                                int i49 = 0;
                                int i50 = 0;
                                char c = 0;
                                short s4 = 0;
                                int i51 = -1214907782;
                                int i52 = 0;
                                String strM42310 = null;
                                JSONObject jSONObject6 = null;
                                String strM9486 = null;
                                while (true) {
                                    i51 = i42 ^ (i41 & (((i51 ^ i40) * 6807) >> 31));
                                    switch (i51) {
                                        case -1929375869:
                                        case -1232491990:
                                            sArr9 = sArr9;
                                            int i53 = i46 + i47;
                                            if ((i53 + i53) - i45 < 0) {
                                                iM27614 = (i39 - C0773.m3169("۫ۨ")) * (-67);
                                                i31 = ((iM27614 ^ i40) * 24143) ^ 1054204173;
                                                i32 = 1158231809;
                                            } else {
                                                iM27614 = (C0619.m2761("֨֨") + i40) * (-33);
                                                i31 = ((iM27614 ^ i39) * (-6251)) ^ (-2042201792);
                                                i32 = -52906532;
                                            }
                                            sArr6 = sArr9;
                                            i42 = iM27614 ^ i32;
                                            i41 = i31;
                                            sArr9 = sArr6;
                                            break;
                                        case -1801450006:
                                        case 1692147818:
                                            i48 = 23051;
                                            iM27614 = (C0619.m2761("ܺۨ") ^ i39) * 57;
                                            i31 = ((iM27614 ^ i40) * 26059) ^ (-1957900849);
                                            i32 = 1055325334;
                                            sArr6 = sArr9;
                                            i42 = iM27614 ^ i32;
                                            i41 = i31;
                                            sArr9 = sArr6;
                                            break;
                                        case -1605092045:
                                        case 1910310374:
                                            RunnableC1848.m6360();
                                            if (AbstractC0641.f2496 >= 0) {
                                                sArr9 = sArr9;
                                                iM27614 = C0773.m3169("ܽ᩹") ^ i39;
                                                i31 = ((iM27614 ^ i40) * (-3145)) ^ (-1525975020);
                                                i32 = -2114259991;
                                                sArr6 = sArr9;
                                                i42 = iM27614 ^ i32;
                                                i41 = i31;
                                                sArr9 = sArr6;
                                            } else {
                                                sArr9 = sArr9;
                                                s3 = s4;
                                                iM27615 = C0619.m2761("᩵ۖ") ^ i39;
                                                i33 = ((iM27615 ^ i40) * 5193) ^ (-1051311298);
                                                i34 = 20270339;
                                                i35 = iM27615 ^ i34;
                                                s4 = s3;
                                                i41 = i33;
                                                sArr9 = sArr9;
                                                i42 = i35;
                                                runnableC15754 = this;
                                            }
                                            break;
                                        case -1357095871:
                                        case 1478547110:
                                            C3492.m11488();
                                            if (!C2702.m8876()) {
                                                sArr9 = sArr9;
                                                iM27614 = C0773.m3169("ܽ᩹") ^ i39;
                                                i31 = ((iM27614 ^ i40) * (-3145)) ^ (-1525975020);
                                                i32 = -2114259991;
                                                sArr6 = sArr9;
                                                i42 = iM27614 ^ i32;
                                                i41 = i31;
                                                sArr9 = sArr6;
                                            } else {
                                                sArr9 = sArr9;
                                                iM27616 = C0619.m2761("ۧ᩺") ^ i39;
                                                i41 = ((iM27616 ^ i40) * (-14335)) ^ (-706315179);
                                                i36 = -124982985;
                                                i35 = iM27616 ^ i36;
                                                sArr9 = sArr9;
                                                i42 = i35;
                                                runnableC15754 = this;
                                            }
                                            break;
                                        case -1296535374:
                                        case 1616780520:
                                            RunnableC1848.m6360();
                                            if (AbstractC0116.f1064 > 0) {
                                                sArr9 = sArr9;
                                                s2 = s4;
                                                int iM27618 = (C0619.m2761("۠ۜ") + i40) * 3;
                                                s4 = s2;
                                                i41 = ((iM27618 ^ i39) * 18273) ^ (-1019491791);
                                                sArr6 = sArr9;
                                                i42 = iM27618 ^ (-390800012);
                                                sArr9 = sArr6;
                                            }
                                            sArr9 = sArr9;
                                            iM27614 = C0773.m3169("ܽ᩹") ^ i39;
                                            i31 = ((iM27614 ^ i40) * (-3145)) ^ (-1525975020);
                                            i32 = -2114259991;
                                            sArr6 = sArr9;
                                            i42 = iM27614 ^ i32;
                                            i41 = i31;
                                            sArr9 = sArr6;
                                            break;
                                        case -1152048946:
                                        case 2053018247:
                                            sArr9 = sArr9;
                                            C17930 c17931 = C3076.f9993;
                                            sArr8 = f51225;
                                            i49 = 1;
                                            if (C2288.f7433 > 0) {
                                                iM27614 = (C0619.m2761("ۡ᩶") + i40) * (-51);
                                                i31 = ((iM27614 ^ i39) * 28949) ^ 348080567;
                                                i32 = -74436729;
                                                sArr6 = sArr9;
                                                i42 = iM27614 ^ i32;
                                                i41 = i31;
                                                sArr9 = sArr6;
                                            }
                                            s2 = s4;
                                            int iM27619 = (C0619.m2761("۠ۜ") + i40) * 3;
                                            s4 = s2;
                                            i41 = ((iM27619 ^ i39) * 18273) ^ (-1019491791);
                                            sArr6 = sArr9;
                                            i42 = iM27619 ^ (-390800012);
                                            sArr9 = sArr6;
                                            break;
                                        case -985073631:
                                        case -531532782:
                                            strM42310 = C1146.m4238(jSONObject6, strM9486);
                                            sArr9 = f51225;
                                            i43 = 8;
                                            i44 = 14;
                                            if (C2878.f9462) {
                                                iM31611 = (i40 - C0773.m3169("᩻ۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i38 = ((iM31611 ^ i39) * 6453) ^ (-155112408);
                                                i37 = 1351826211;
                                            } else {
                                                iM31611 = C0773.m3169("ۛۤ") ^ i40;
                                                i38 = ((iM31611 ^ i39) * (-3047)) ^ (-401005367);
                                                i37 = 1933292603;
                                            }
                                            i42 = iM31611 ^ i37;
                                            i41 = i38;
                                            break;
                                        case -875667261:
                                        case 472443063:
                                            C1080.m4050();
                                            sArr9 = sArr9;
                                            s3 = s4;
                                            iM27615 = C0619.m2761("᩵ۖ") ^ i39;
                                            i33 = ((iM27615 ^ i40) * 5193) ^ (-1051311298);
                                            i34 = 20270339;
                                            i35 = iM27615 ^ i34;
                                            s4 = s3;
                                            i41 = i33;
                                            sArr9 = sArr9;
                                            i42 = i35;
                                            runnableC15754 = this;
                                            break;
                                        case -816344140:
                                        case 1536569189:
                                            sArr9 = sArr9;
                                            i45 = i52 * i52;
                                            i46 = s4 * s4;
                                            i47 = 19713600;
                                            if (C1564.f5401 > 0) {
                                                iM27614 = (C0619.m2761("ۜۢ") ^ i40) * (-55);
                                                i31 = ((iM27614 ^ i39) * 8465) ^ 310802323;
                                                i32 = 594110703;
                                                sArr6 = sArr9;
                                                i42 = iM27614 ^ i32;
                                                i41 = i31;
                                                sArr9 = sArr6;
                                            } else {
                                                s3 = s4;
                                                iM27615 = C0619.m2761("᩵ۖ") ^ i39;
                                                i33 = ((iM27615 ^ i40) * 5193) ^ (-1051311298);
                                                i34 = 20270339;
                                                i35 = iM27615 ^ i34;
                                                s4 = s3;
                                                i41 = i33;
                                                sArr9 = sArr9;
                                                i42 = i35;
                                                runnableC15754 = this;
                                            }
                                            break;
                                        case -779418380:
                                        case -777088312:
                                            i48 = 62887;
                                            iM27614 = (C0619.m2761("ܺۨ") ^ i39) * 57;
                                            i31 = ((iM27614 ^ i40) * 26059) ^ (-1957900849);
                                            i32 = 1055325334;
                                            sArr6 = sArr9;
                                            i42 = iM27614 ^ i32;
                                            i41 = i31;
                                            sArr9 = sArr6;
                                            break;
                                        case -597374180:
                                        case -78860584:
                                            C0269.m1781(strM42310, RunnableC3646.m11809(sArr9, i43, i44, i48));
                                            if (!C1080.m4050()) {
                                                iM31611 = (i40 - C0773.m3169("᩻ۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i38 = ((iM31611 ^ i39) * 6453) ^ (-155112408);
                                                i37 = 1351826211;
                                                i42 = iM31611 ^ i37;
                                                i41 = i38;
                                            } else {
                                                sArr9 = sArr9;
                                                String str10 = str9;
                                                if (C3099.f10023 > 0) {
                                                    C2966.m9674(new Thread(new RunnableC11279(str10, strM42310, j5)));
                                                }
                                                s3 = s4;
                                                iM27615 = C0619.m2761("᩵ۖ") ^ i39;
                                                i33 = ((iM27615 ^ i40) * 5193) ^ (-1051311298);
                                                i34 = 20270339;
                                                i35 = iM27615 ^ i34;
                                                s4 = s3;
                                                i41 = i33;
                                                sArr9 = sArr9;
                                                i42 = i35;
                                                runnableC15754 = this;
                                            }
                                            break;
                                        case -511048391:
                                        case 152038929:
                                            sArr9 = sArr9;
                                            s3 = s4;
                                            sArr7 = f51225;
                                            c = 0;
                                            if (C3690.f12684 <= 0) {
                                                iM27615 = C0619.m2761("᩵ۖ") ^ i39;
                                                i33 = ((iM27615 ^ i40) * 5193) ^ (-1051311298);
                                                i34 = 20270339;
                                            } else {
                                                iM27615 = (C0619.m2761("۟ۢ") + i40) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i33 = ((iM27615 ^ i39) * (-15413)) ^ (-2108932659);
                                                i34 = 187165279;
                                            }
                                            i35 = iM27615 ^ i34;
                                            s4 = s3;
                                            i41 = i33;
                                            sArr9 = sArr9;
                                            i42 = i35;
                                            runnableC15754 = this;
                                            break;
                                        case -440693137:
                                        case 1258430452:
                                            C1783.m6232();
                                            break;
                                        case 379675088:
                                        case 801984439:
                                            sArr9 = sArr9;
                                            strM9486 = C2878.m9486(sArr8, i49, i50, i48);
                                            jSONObject6 = jSONObject3;
                                            if (C2419.f7754 >= 0) {
                                                iM27614 = C0773.m3169("ܽ᩹") ^ i39;
                                                i31 = ((iM27614 ^ i40) * (-3145)) ^ (-1525975020);
                                                i32 = -2114259991;
                                            } else {
                                                iM27614 = (i39 - C0619.m2761("ۧۨ")) * q.h;
                                                i31 = ((iM27614 ^ i40) * 31685) ^ 1871168260;
                                                i32 = -612722861;
                                            }
                                            sArr6 = sArr9;
                                            i42 = iM27614 ^ i32;
                                            i41 = i31;
                                            sArr9 = sArr6;
                                            break;
                                        case 879009780:
                                        case 940464810:
                                            sArr9 = sArr9;
                                            i50 = 7;
                                            if (C20932.m47848() == 0) {
                                                iM27614 = C0619.m2761("᩹᩵") ^ i40;
                                                i31 = ((iM27614 ^ i39) * 5447) ^ 194454983;
                                                i32 = -1630146746;
                                                sArr6 = sArr9;
                                                i42 = iM27614 ^ i32;
                                                i41 = i31;
                                                sArr9 = sArr6;
                                            } else {
                                                iM27616 = C0619.m2761("ۧ᩺") ^ i39;
                                                i41 = ((iM27616 ^ i40) * (-14335)) ^ (-706315179);
                                                i36 = -124982985;
                                                i35 = iM27616 ^ i36;
                                                sArr9 = sArr9;
                                                i42 = i35;
                                                runnableC15754 = this;
                                            }
                                            break;
                                        case 1795635899:
                                        case 1831899911:
                                            sArr9 = sArr9;
                                            s2 = s4;
                                            int i54 = s2 + 4440;
                                            if (C0773.f2792 > 0) {
                                                int iM31612 = C0773.m3169("᩶ۨ") ^ i39;
                                                s4 = s2;
                                                i52 = i54;
                                                sArr9 = sArr9;
                                                i41 = ((iM31612 ^ i40) * (-19079)) ^ 1906080015;
                                                i42 = iM31612 ^ 295796129;
                                                runnableC15754 = this;
                                            } else {
                                                i52 = i54;
                                                int iM276110 = (C0619.m2761("۠ۜ") + i40) * 3;
                                                s4 = s2;
                                                i41 = ((iM276110 ^ i39) * 18273) ^ (-1019491791);
                                                sArr6 = sArr9;
                                                i42 = iM276110 ^ (-390800012);
                                                sArr9 = sArr6;
                                            }
                                            break;
                                        default:
                                            sArr9 = sArr9;
                                            s4 = sArr7[c];
                                            if (C0862.f3233 != 0) {
                                                iM27616 = C0619.m2761("ۧ᩺") ^ i39;
                                                i41 = ((iM27616 ^ i40) * (-14335)) ^ (-706315179);
                                                i36 = -124982985;
                                            } else {
                                                iM27616 = C0773.m3169("᩶ᩳ") ^ i39;
                                                i41 = ((iM27616 ^ i40) * (-16863)) ^ 1223185757;
                                                i36 = 654816332;
                                            }
                                            i35 = iM27616 ^ i36;
                                            sArr9 = sArr9;
                                            i42 = i35;
                                            runnableC15754 = this;
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        JSONObject jSONObject6 = new JSONObject(strM4239);
                        if (C2966.f9654 >= 0) {
                            jSONObject2 = jSONObject3;
                            str2 = str9;
                            jSONObject4 = jSONObject6;
                            c2592M12270 = c2592;
                            i11 = i22;
                            j2 = j5;
                            int iM27614 = C0619.m2761("ۚ᩵") ^ i13;
                            jSONObjectM43548 = jSONObject2;
                            int i211 = i10;
                            str4 = str2;
                            i15 = ((iM27614 ^ i14) * (-17175)) ^ 956871180;
                            j = j2;
                            c2592 = c2592M12270;
                            i22 = i11;
                            sArr5 = sArr5;
                            i17 = i9;
                            i16 = iM27614 ^ (-1863680876);
                            i24 = i211;
                            strM4238 = str3;
                            j3 = j;
                        } else {
                            int iM27615 = C0619.m2761("֨ۛ") ^ i14;
                            jSONObjectM43548 = jSONObject3;
                            i16 = iM27615 ^ 1900198912;
                            i15 = ((iM27615 ^ i13) * (-841)) ^ (-1520697301);
                            i17 = i9;
                            strM4238 = str3;
                            j3 = j5;
                            i24 = i10;
                            sArr5 = sArr5;
                            str4 = str9;
                            jSONObject4 = jSONObject6;
                        }
                    }
                    break;
                case -1383536452:
                case -453892496:
                    C2966.m9664();
                    C1542.m5459();
                    sArr5 = sArr5;
                    iM2762 = C0619.m2761("ᩳ᩸") ^ i14;
                    i4 = ((iM2762 ^ i13) * (-2171)) ^ (-1573440077);
                    i8 = -542361855;
                    i5 = iM2762 ^ i8;
                    sArr = sArr5;
                    i16 = i5;
                    i15 = i4;
                    sArr5 = sArr;
                    break;
                case -1074971923:
                case -695530315:
                    payReq.packageValue = RunnableC3646.m11810(jSONObject4, strM3780);
                    sArr5 = f75199;
                    i24 = 25;
                    i25 = 1;
                    iM2763 = (i13 - C0773.m3169("᩵ۙ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i6 = ((iM2763 ^ i14) * (-7605)) ^ 1444365561;
                    i12 = -591849633;
                    i16 = iM2763 ^ i12;
                    i15 = i6;
                    break;
                case -1012205787:
                case -337607489:
                    sArr5 = sArr5;
                    str = strM4238;
                    if (!C3492.m11490(C4282.m13650(f75199, 9, 2, i20), str)) {
                        strM4238 = str;
                        i = i24;
                        int iM27616 = C0619.m2761("ܳܳ") ^ i14;
                        i24 = i;
                        str4 = str4;
                        i15 = ((iM27616 ^ i13) * 13223) ^ (-1503717363);
                        sArr5 = sArr5;
                        i16 = iM27616 ^ (-1244293379);
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    } else {
                        int iM31611 = (C0773.m3169("ۡ۠") + i14) * (-59);
                        i6 = ((iM31611 ^ i13) * 30231) ^ (-1453128358);
                        i7 = iM31611 ^ 1912693515;
                        strM4238 = str;
                        sArr5 = sArr5;
                        i16 = i7;
                        i15 = i6;
                    }
                    break;
                case -677303422:
                case -117188724:
                    sArr5 = sArr5;
                    payReq.timeStamp = RunnableC3646.m11810(jSONObject4, C2375.m8069(f75199, 23, 1, i20));
                    if (C2310.f7472 < 0) {
                        iM2762 = C0619.m2761("᩹ᩳ") ^ i14;
                        i4 = ((iM2762 ^ i13) * (-7911)) ^ 1079554049;
                        i8 = 861826701;
                        i5 = iM2762 ^ i8;
                        sArr = sArr5;
                        i16 = i5;
                        i15 = i4;
                        sArr5 = sArr;
                    } else {
                        i11 = i22;
                        str2 = str4;
                        i10 = i24;
                        String str10 = strM4238;
                        i9 = i17;
                        c2592M12270 = c2592;
                        j2 = j3;
                        jSONObject2 = jSONObjectM43548;
                        str3 = str10;
                        int iM27617 = C0619.m2761("ۚ᩵") ^ i13;
                        jSONObjectM43548 = jSONObject2;
                        int i212 = i10;
                        str4 = str2;
                        i15 = ((iM27617 ^ i14) * (-17175)) ^ 956871180;
                        j = j2;
                        c2592 = c2592M12270;
                        i22 = i11;
                        sArr5 = sArr5;
                        i17 = i9;
                        i16 = iM27617 ^ (-1863680876);
                        i24 = i212;
                        strM4238 = str3;
                        j3 = j;
                    }
                    break;
                case -232436154:
                case 1725240286:
                    sArr5 = sArr5;
                    payReq = new PayReq();
                    payReq.appId = C3076.m10032();
                    sArr2 = f75199;
                    i19 = 11;
                    if (!C13473.m33144()) {
                        c2592 = c2592;
                        i22 = i22;
                        j3 = j3;
                        jSONObjectM43548 = jSONObjectM43548;
                        strM4238 = strM4238;
                        i17 = i17;
                        str4 = str4;
                        i24 = i24;
                        iM2761 = C0773.m3169("ۗ᩶") ^ i13;
                        i2 = ((iM2761 ^ i14) * 15893) ^ (-140668694);
                        i3 = 36476194;
                        int i213 = iM2761 ^ i3;
                        i24 = i24;
                        str4 = str4;
                        sArr5 = sArr5;
                        i16 = i213;
                        i15 = i2;
                        jSONObjectM43548 = jSONObjectM43548;
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    } else {
                        iM2762 = C0619.m2761("ۢ᩵") ^ i13;
                        i4 = ((iM2762 ^ i14) * (-13717)) ^ (-524936535);
                        i8 = -648851388;
                        i5 = iM2762 ^ i8;
                        sArr = sArr5;
                        i16 = i5;
                        i15 = i4;
                        sArr5 = sArr;
                    }
                    break;
                case -224660137:
                case 164342439:
                    sArr5 = sArr5;
                    c2592 = c2592;
                    i22 = i22;
                    j3 = j3;
                    jSONObjectM43548 = jSONObjectM43548;
                    strM4238 = strM4238;
                    i17 = i17;
                    str4 = str4;
                    i24 = i24;
                    int i31 = (s * s) + 19589476;
                    if ((i21 * i21) - (i31 + i31) <= 0) {
                        iM2761 = C0619.m2761("ܳۨ") ^ i14;
                        i2 = ((iM2761 ^ i13) * 4133) ^ 1881028628;
                        i3 = 981843973;
                    } else {
                        iM2761 = (C0619.m2761("ۖ᩻") + i13) * (-3);
                        i2 = ((iM2761 ^ i14) * 21043) ^ 1570938016;
                        i3 = 86444555;
                    }
                    int i214 = iM2761 ^ i3;
                    i24 = i24;
                    str4 = str4;
                    sArr5 = sArr5;
                    i16 = i214;
                    i15 = i2;
                    jSONObjectM43548 = jSONObjectM43548;
                    i17 = i17;
                    strM4238 = strM4238;
                    j3 = j3;
                    c2592 = c2592;
                    i22 = i22;
                    break;
                case -35595956:
                case 555872329:
                    sArr5 = sArr5;
                    c2592 = c2592;
                    i22 = i22;
                    j3 = j3;
                    jSONObjectM43548 = jSONObjectM43548;
                    strM4238 = strM4238;
                    i17 = i17;
                    str4 = str4;
                    i24 = i24;
                    short s2 = f75199[0];
                    int i32 = s2 + 4426;
                    if (C3448.m11248() == 0) {
                        int iM27618 = C0619.m2761("۠ۤ") ^ i13;
                        s = s2;
                        i21 = i32;
                        i15 = ((iM27618 ^ i14) * o.a.x) ^ 798309765;
                        i24 = i24;
                        str4 = str4;
                        i17 = i17;
                        strM4238 = strM4238;
                        jSONObjectM43548 = jSONObjectM43548;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                        sArr = sArr5;
                        i16 = iM27618 ^ (-1797999776);
                        sArr5 = sArr;
                    } else {
                        s = s2;
                        i21 = i32;
                        iM2761 = C0773.m3169("ۗ᩶") ^ i13;
                        i2 = ((iM2761 ^ i14) * 15893) ^ (-140668694);
                        i3 = 36476194;
                        int i215 = iM2761 ^ i3;
                        i24 = i24;
                        str4 = str4;
                        sArr5 = sArr5;
                        i16 = i215;
                        i15 = i2;
                        jSONObjectM43548 = jSONObjectM43548;
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    }
                    break;
                case -29861033:
                case 938943525:
                    break;
                case 68006511:
                case 1752775002:
                    sArr5 = sArr5;
                    i22 = i22;
                    str4 = str4;
                    i = i24;
                    long j6 = j3;
                    strM4238 = strM4238;
                    i17 = i17;
                    C2592 c2593 = c2592;
                    c2593.m8674(i22);
                    j3 = j6;
                    C2023.m6965(c2593, this.f75205);
                    jSONObjectM43548 = C18738.m43548(c2593);
                    if (C15243.m36589((Object) str4, (Object) C0773.m3167())) {
                        int iM27619 = (C0619.m2761("᩻ۢ") ^ i13) * 19;
                        str4 = str4;
                        i15 = ((iM27619 ^ i14) * (-13481)) ^ (-149318542);
                        i24 = i;
                        c2592 = c2593;
                        i22 = i22;
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        i16 = iM27619 ^ 951598077;
                        sArr5 = sArr5;
                    } else {
                        c2592 = c2593;
                        int iM276110 = C0619.m2761("ܳܳ") ^ i14;
                        i24 = i;
                        str4 = str4;
                        i15 = ((iM276110 ^ i13) * 13223) ^ (-1503717363);
                        sArr5 = sArr5;
                        i16 = iM276110 ^ (-1244293379);
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    }
                    break;
                case 234182540:
                case 1861685922:
                    C2702.m8876();
                    if (C1146.f4234 >= 0) {
                        sArr5 = sArr5;
                        str = strM4238;
                        i9 = i17;
                        jSONObject3 = jSONObjectM43548;
                        int iM31612 = (C0773.m3169("ۛ۠") ^ i13) * (-77);
                        i6 = ((iM31612 ^ i14) * (-1809)) ^ 905787492;
                        i7 = iM31612 ^ 271261870;
                        jSONObjectM43548 = jSONObject3;
                        i17 = i9;
                        strM4238 = str;
                        sArr5 = sArr5;
                        i16 = i7;
                        i15 = i6;
                    } else {
                        sArr5 = sArr5;
                        iM2762 = C0619.m2761("ᩳ᩸") ^ i14;
                        i4 = ((iM2762 ^ i13) * (-2171)) ^ (-1573440077);
                        i8 = -542361855;
                        i5 = iM2762 ^ i8;
                        sArr = sArr5;
                        i16 = i5;
                        i15 = i4;
                        sArr5 = sArr;
                    }
                    break;
                case 313687572:
                case 2047829798:
                    payReq.sign = RunnableC3646.m11810(jSONObject4, C3998.m12925(sArr5, i24, i25, i20));
                    this.f75203.sendReq(payReq);
                    sArr5 = sArr5;
                    strM4238 = strM4238;
                    i = i24;
                    int iM276111 = C0619.m2761("ܳܳ") ^ i14;
                    i24 = i;
                    str4 = str4;
                    i15 = ((iM276111 ^ i13) * 13223) ^ (-1503717363);
                    sArr5 = sArr5;
                    i16 = iM276111 ^ (-1244293379);
                    i17 = i17;
                    strM4238 = strM4238;
                    j3 = j3;
                    c2592 = c2592;
                    i22 = i22;
                    break;
                case 734086456:
                case 858158795:
                    sArr5 = sArr5;
                    payReq.prepayId = RunnableC3646.m11810(jSONObject4, C3998.m12925(sArr3, i18, 1, i20));
                    sArr4 = f75199;
                    i17 = 22;
                    if (C2966.f9654 >= 0) {
                        iM2762 = C0619.m2761("ᩳ᩸") ^ i14;
                        i4 = ((iM2762 ^ i13) * (-2171)) ^ (-1573440077);
                        i8 = -542361855;
                    } else {
                        iM2762 = (C0773.m3169("᩵ۚ") + i13) * (-105);
                        i4 = ((iM2762 ^ i14) * 12915) ^ (-1947345985);
                        i8 = -1296030635;
                    }
                    i5 = iM2762 ^ i8;
                    sArr = sArr5;
                    i16 = i5;
                    i15 = i4;
                    sArr5 = sArr;
                    break;
                case 806017474:
                case 1902644698:
                    i20 = 24757;
                    iM2761 = C0619.m2761("֫ᩴ") ^ i14;
                    i2 = ((iM2761 ^ i13) * 24383) ^ (-1273235012);
                    i3 = -1160052980;
                    int i216 = iM2761 ^ i3;
                    i24 = i24;
                    str4 = str4;
                    sArr5 = sArr5;
                    i16 = i216;
                    i15 = i2;
                    jSONObjectM43548 = jSONObjectM43548;
                    i17 = i17;
                    strM4238 = strM4238;
                    j3 = j3;
                    c2592 = c2592;
                    i22 = i22;
                    break;
                case 984556025:
                case 1110378660:
                    sArr5 = sArr5;
                    strM4238 = C1146.m4238(jSONObject4, C13473.m33137(f75199, 8, 1, i20));
                    iM2762 = (C0773.m3169("۬ۖ") ^ i13) * (-43);
                    i4 = ((iM2762 ^ i14) * 28117) ^ (-1045532423);
                    i8 = 1881562914;
                    i5 = iM2762 ^ i8;
                    sArr = sArr5;
                    i16 = i5;
                    i15 = i4;
                    sArr5 = sArr;
                    break;
                case 1046776237:
                case 1471438436:
                    sArr5 = sArr5;
                    payReq.nonceStr = RunnableC3646.m11810(jSONObject4, C2485.m8350(sArr4, i17, 1, i20));
                    if (C1343.f4799 == 0) {
                        iM2762 = (C0773.m3169("ۛ᩷") + i13) * (-63);
                        i4 = ((iM2762 ^ i14) * 27093) ^ 1422293015;
                        i8 = -2091733123;
                        i5 = iM2762 ^ i8;
                        sArr = sArr5;
                        i16 = i5;
                        i15 = i4;
                        sArr5 = sArr;
                    } else {
                        c2592 = c2592;
                        i22 = i22;
                        j3 = j3;
                        jSONObjectM43548 = jSONObjectM43548;
                        strM4238 = strM4238;
                        i17 = i17;
                        str4 = str4;
                        i24 = i24;
                        iM2761 = C0773.m3169("ۗ᩶") ^ i13;
                        i2 = ((iM2761 ^ i14) * 15893) ^ (-140668694);
                        i3 = 36476194;
                        int i217 = iM2761 ^ i3;
                        i24 = i24;
                        str4 = str4;
                        sArr5 = sArr5;
                        i16 = i217;
                        i15 = i2;
                        jSONObjectM43548 = jSONObjectM43548;
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    }
                    break;
                case 1145862740:
                case 1849207523:
                    sArr5 = sArr5;
                    payReq.partnerId = AbstractC0116.m1236(sArr2, i19, 10, i20);
                    sArr3 = f75199;
                    i18 = 21;
                    if (RunnableC3055.m9933() != 0) {
                        iM2762 = C0619.m2761("ᩳ᩸") ^ i14;
                        i4 = ((iM2762 ^ i13) * (-2171)) ^ (-1573440077);
                        i8 = -542361855;
                    } else {
                        iM2762 = (C0619.m2761("ܶ֨") ^ i14) * 27;
                        i4 = ((iM2762 ^ i13) * (-27585)) ^ 1624078118;
                        i8 = 825402083;
                    }
                    i5 = iM2762 ^ i8;
                    sArr = sArr5;
                    i16 = i5;
                    i15 = i4;
                    sArr5 = sArr;
                    break;
                default:
                    sArr5 = sArr5;
                    i22 = i22;
                    String str11 = str4;
                    jSONObject = jSONObjectM43548;
                    strM4238 = strM4238;
                    i17 = i17;
                    i = i24;
                    long j7 = C3076.f9997;
                    c2592 = c2592;
                    long j8 = this.f75201;
                    if (j8 == j7) {
                        int iM27620 = C0619.m2761("֫᩹") ^ i13;
                        int i33 = ((iM27620 ^ i14) * 31211) ^ 596442757;
                        i22 = i22;
                        c2592 = c2592;
                        i16 = iM27620 ^ 1026421750;
                        sArr5 = sArr5;
                        j = j8;
                        i15 = i33;
                        i24 = i;
                        str4 = str11;
                        i17 = i17;
                        strM4238 = strM4238;
                        jSONObjectM43548 = jSONObject;
                        j3 = j;
                    } else {
                        j3 = j8;
                        str4 = str11;
                        jSONObjectM43548 = jSONObject;
                        int iM276112 = C0619.m2761("ܳܳ") ^ i14;
                        i24 = i;
                        str4 = str4;
                        i15 = ((iM276112 ^ i13) * 13223) ^ (-1503717363);
                        sArr5 = sArr5;
                        i16 = iM276112 ^ (-1244293379);
                        i17 = i17;
                        strM4238 = strM4238;
                        j3 = j3;
                        c2592 = c2592;
                        i22 = i22;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractActivityC17204 abstractActivityC17204 = null;
        int i = 2074439863;
        int i2 = C2287.f7432;
        int i3 = C2375.f7641;
        int iM2761 = C0619.m2761("ۨܰ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-9191)) ^ (-1552219257);
        int i5 = 1361240568;
        while (true) {
            i = ((((i ^ i3) * 25409) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1887528550:
                case -1626627736:
                    C17202.m40372();
                    C1519.m5403();
                    break;
                case -1881826051:
                case -743858151:
                    C2375.m8065();
                    AbstractC0116.m1243();
                    iM2761 = (C0773.m3169("֨ۖ") + i3) * (-25);
                    i4 = ((iM2761 ^ i2) * (-13833)) ^ 991600250;
                    i5 = 154801369;
                    break;
                case -1617913369:
                case 544318066:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("᩶۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6627)) ^ 2080155488;
                        i5 = -2004595117;
                    } else {
                        iM2761 = (C0773.m3169("ۚۛ") + i3) * (-125);
                        i4 = ((iM2761 ^ i2) * 523) ^ 1342490692;
                        i5 = 1479268777;
                    }
                    break;
                case -1256352208:
                case 1658631520:
                    abstractActivityC17204 = this.f75204;
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ۙۢ") ^ i2) * (-59);
                        i4 = ((iM2761 ^ i3) * (-22743)) ^ 84430428;
                        i5 = 413146681;
                    } else {
                        iM2761 = C0773.m3169("᩶۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6627)) ^ 2080155488;
                        i5 = -2004595117;
                    }
                    break;
                case -1228035193:
                case 1324617838:
                    if (C2419.m8174() >= 0) {
                        iM2761 = (i2 - C0619.m2761("ܰᩳ")) * (-41);
                        i4 = ((iM2761 ^ i3) * (-32007)) ^ (-1296171009);
                        i5 = 588405413;
                    } else {
                        iM2761 = (C0773.m3169("ܳۙ") ^ i3) * 87;
                        i4 = ((iM2761 ^ i2) * (-11559)) ^ (-2030757520);
                        i5 = -716940215;
                    }
                    break;
                case -912605436:
                case 1644367769:
                    RunnableC3055.m9930(abstractActivityC17204, exc, null);
                    break;
                case -785014087:
                case -147028666:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩶۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6627)) ^ 2080155488;
                        i5 = -2004595117;
                    } else {
                        iM2761 = C0619.m2761("᩸ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24203) ^ (-1955978246);
                        i5 = 1782475673;
                    }
                    break;
                case -572215739:
                case 320607515:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ܰᩳ")) * (-41);
                        i4 = ((iM2761 ^ i3) * (-32007)) ^ (-1296171009);
                        i5 = 588405413;
                    } else {
                        iM2761 = C0619.m2761("ۨ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31131)) ^ 1451819830;
                        i5 = 1842072044;
                    }
                    break;
                case -461449086:
                case -331239610:
                    if (C0950.m3785() != 0) {
                        iM2761 = (i2 - C0619.m2761("ܰᩳ")) * (-41);
                        i4 = ((iM2761 ^ i3) * (-32007)) ^ (-1296171009);
                        i5 = 588405413;
                    } else {
                        iM2761 = C0619.m2761("ܿۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8265) ^ (-1261154966);
                        i5 = 528998553;
                    }
                    break;
                case -434133442:
                case -401191910:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ۖۤ")) * 97;
                        i4 = ((iM2761 ^ i3) * 7739) ^ (-1851646414);
                        i5 = 122316198;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܶۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i3) * 32223) ^ (-537702010);
                        i5 = 1421212180;
                    }
                    break;
                case 68772283:
                case 742994557:
                    AbstractC3624.m11755();
                    if (C1826.m6301() >= 0) {
                        iM2761 = (i2 - C0619.m2761("ܰᩳ")) * (-41);
                        i4 = ((iM2761 ^ i3) * (-32007)) ^ (-1296171009);
                        i5 = 588405413;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۖۤ")) * 97;
                        i4 = ((iM2761 ^ i3) * 7739) ^ (-1851646414);
                        i5 = 122316198;
                    }
                    break;
                case 143715187:
                case 1116258566:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("ۗ᩸") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-14175)) ^ 2080862413;
                        i5 = -939205537;
                    } else {
                        iM2761 = (C0773.m3169("֨ۖ") + i3) * (-25);
                        i4 = ((iM2761 ^ i2) * (-13833)) ^ 991600250;
                        i5 = 154801369;
                    }
                    break;
                case 209199083:
                case 1328850668:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ܰᩳ")) * (-41);
                        i4 = ((iM2761 ^ i3) * (-32007)) ^ (-1296171009);
                        i5 = 588405413;
                    } else {
                        iM2761 = (C0619.m2761("ᩴۚ") + i3) * 35;
                        i4 = ((iM2761 ^ i2) * 16765) ^ (-420355616);
                        i5 = 513900927;
                    }
                    break;
                case 420839778:
                case 754568983:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۗ᩸") + i3) * 37;
                        i4 = ((iM2761 ^ i2) * (-14175)) ^ 2080862413;
                        i5 = -939205537;
                    } else {
                        iM2761 = C0773.m3169("ۙۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28331) ^ 2039356623;
                        i5 = -819731507;
                    }
                    break;
                case 780658315:
                case 1598932719:
                    if (C0862.f3233 != 0) {
                        iM2761 = (i2 - C0773.m3169("ۖۤ")) * 97;
                        i4 = ((iM2761 ^ i3) * 7739) ^ (-1851646414);
                        i5 = 122316198;
                    } else {
                        iM2761 = (C0773.m3169("֨ۖ") + i3) * (-25);
                        i4 = ((iM2761 ^ i2) * (-13833)) ^ 991600250;
                        i5 = 154801369;
                    }
                    break;
                default:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("᩶۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6627)) ^ 2080155488;
                        i5 = -2004595117;
                    } else {
                        iM2761 = C0619.m2761("֨ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26869)) ^ (-931316508);
                        i5 = 1744921635;
                    }
                    break;
            }
            return;
        }
    }
}
