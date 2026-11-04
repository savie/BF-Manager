package l;

import android.R;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import com.alipay.sdk.m.p.a;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2063 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩺֫᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f6861 = {7752, 23562, 26640, 28045, 7668, -11470, -11470, -11439, -11428, -11470, -11427, -11434, -11444, -11446, -11455, -11431, -11434, -11428, -11446, -11433, -11439, -11428, -11518, -11497, -11439, -11428, -11470, -11448, -11431, -11446, -11427, -11434, -11444, -11515, 9615, -401, 5599, 14735, 14729, 14748, 14740, 14836, 8569, 28952, 5390, -26543, -26534, -26539, -26538, -26536, -26543, -26517, -26538, -26531, -26534, -26517, -26537, -26533, -26534, -26558, -26543, -26554, -26560, -26543, -26534, -26539, -26538, -26536, -26543, -26517, -26533, -26537, -26560, -26517, -26537, -26533, -26534, -26558, -26543, -26554, -26560, -26601, -26526, -26539, -26536, -26559, -26543, -26562, -26620, -26538, -26517, -26604, -26562, -26501, -26537, -26560, -26562, -26512, -26543, -26537, -26562, -26500, -26543, -26548, -26620, -26548, -26539, -26560, -26560, -26554, -26562, -26506, -26531, -26534, -26506, -26531, -26534, -26500, -26543, -26548, -26562, -26620, -26538, -26562, -26620, -26548, -26620, -26613, -26613, -26613, -26501, -26537, -26560, -26512, -26543, -26537, -26562, -26531, -26544, -26607, -26620, -26612, -26548, -26604, -18010, -26604, -26613, -26613, -26613, -26562, -26620, 4900, 31051, 25820, 17904, 31313, -27787, 27678, -30297, -28960, 26082, 27917, -31084, 28641, 30749, 32655, 25919};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11757 f6862;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC12508 f6863;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21246 f6864;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13249 f6865;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7119(SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, boolean z, char c) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM2762;
        int i9;
        int iM31611;
        int i10;
        int iM31612;
        int i11;
        int i12;
        int iM31613;
        int i13;
        int iM2763;
        int i14;
        int i15;
        int i16;
        StringBuilder sb;
        int i17;
        StringBuilder sb2;
        String str;
        int i18;
        int i19;
        int i20;
        int iM2764;
        int i21;
        int i22;
        int iM31614;
        int i23;
        int i24;
        int i25;
        short s = 0;
        int i26 = 0;
        int i27 = 237693478;
        int i28 = C1826.f6190;
        int i29 = C2310.f7472;
        int iM31615 = C0773.m3169("ܰۛ") ^ i28;
        int i30 = ((iM31615 ^ i29) * 20903) ^ (-67813506);
        int i31 = iM31615 ^ (-1814512247);
        InterfaceC8697 interfaceC8697 = null;
        String str2 = null;
        StringBuilder sb3 = null;
        Iterator itM53423 = null;
        StringBuilder sb4 = null;
        int i32 = 0;
        int i33 = 0;
        int value = 0;
        int i34 = 0;
        int iM3510 = 0;
        int i35 = 0;
        InterfaceC5650 interfaceC5650 = null;
        String strM6952 = null;
        Iterator itM2357 = null;
        C21246 c21246 = null;
        String strMo9077 = null;
        StringBuilder sb5 = null;
        InterfaceC8697 interfaceC8698 = null;
        while (true) {
            i27 = i31 ^ (i30 & (((i27 ^ i29) * 23375) >> 31));
            switch (i27) {
                case -2105709028:
                case -790979842:
                    sb4 = sb4;
                    i32 = i32;
                    interfaceC8698 = (InterfaceC8697) C0950.m3796(itM53423);
                    str2 = str2;
                    sb5 = new StringBuilder(str2);
                    strMo9077 = interfaceC8698.mo18158().mo9077();
                    if (AbstractC0116.f1064 <= 0) {
                        iM31612 = C0773.m3169("֡ۨ") ^ i28;
                        i11 = ((iM31612 ^ i29) * 9689) ^ 266632981;
                        i12 = 364173558;
                    } else {
                        iM31612 = C0773.m3169("ۤۖ") ^ i29;
                        i11 = ((iM31612 ^ i28) * (-2125)) ^ 813044360;
                        i12 = 640506579;
                    }
                    i7 = iM31612 ^ i12;
                    str2 = str2;
                    i30 = i11;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case -2094199362:
                case -871411974:
                    if (((value >>> 24) & 255) <= 64) {
                        iM31613 = (i29 - C0619.m2761("ۧ᩹")) * (-75);
                        i30 = ((iM31613 ^ i28) * (-847)) ^ 724569408;
                        i13 = -2038036766;
                        i25 = iM31613 ^ i13;
                        i32 = i32;
                        StringBuilder sb6 = sb4;
                        i31 = i25;
                        sb4 = sb6;
                    } else {
                        iM3169 = (C0619.m2761("ܽۜ") ^ i29) * (-51);
                        i = ((iM3169 ^ i28) * 10961) ^ (-350673008);
                        i2 = 776101971;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    }
                    break;
                case -2056937456:
                case 154497791:
                    interfaceC5650 = (InterfaceC5650) C4238.m13529(itM2357);
                    sb4 = new StringBuilder();
                    C2023.m6955(sb4, '\n');
                    if (interfaceC5650.mo16637() != -1) {
                        iM3169 = C0773.m3169("֡᩹") ^ i29;
                        i = ((iM3169 ^ i28) * 13927) ^ (-1058027830);
                        i2 = -252866227;
                    } else {
                        iM3169 = (C0773.m3169("ܿۙ") + i29) * (-95);
                        i = ((iM3169 ^ i28) * 30053) ^ 156698425;
                        i2 = -1189465052;
                    }
                    i31 = iM3169 ^ i2;
                    i30 = i;
                    break;
                case -2039299318:
                case 2047441385:
                    C4282.m13644();
                    break;
                case -1992364691:
                case 2070862571:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    if (C2419.m8175(C1519.m5401(interfaceC8697.getType()), C3998.m12925(f6861, 24, 2, i34))) {
                        i35 = i35;
                        iM31611 = (C0773.m3169("֨ۧ") ^ i28) * 39;
                        i5 = ((iM31611 ^ i29) * (-20317)) ^ 1631086165;
                        i10 = -458959491;
                        i8 = iM31611 ^ i10;
                        i35 = i35;
                    } else {
                        int iM2765 = C0619.m2761("ܺܳ") ^ i29;
                        i5 = ((iM2765 ^ i28) * (-31703)) ^ 676157882;
                        i8 = iM2765 ^ (-334767114);
                    }
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case -1691294644:
                case -182805611:
                    i34 = 26534;
                    iM2761 = (C0773.m3169("ܿۗ") ^ i29) * 31;
                    i3 = ((iM2761 ^ i28) * (-32223)) ^ (-577724277);
                    i4 = -382800342;
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case -1685460376:
                case -1328181579:
                    if (!C0619.f2439) {
                        sb = sb4;
                        i17 = i32;
                        sb2 = sb3;
                        str = str2;
                        i18 = i33;
                        i19 = i35;
                        i20 = value;
                        iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                        i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                        i22 = -1405379157;
                        sb3 = sb2;
                        i32 = i17;
                        i16 = i18;
                        str2 = str;
                        sb4 = sb;
                        i31 = iM2764 ^ i22;
                        i30 = i21;
                        value = i20;
                        i35 = i19;
                        i33 = i16;
                    } else {
                        sb4 = sb4;
                        i32 = i32;
                        str2 = str2;
                        i33 = i33;
                        i35 = i35;
                        value = value;
                        iM2762 = (i29 - C0619.m2761("ۘ᩷")) * (-81);
                        i5 = ((iM2762 ^ i28) * 31997) ^ 921181313;
                        i9 = -1719536603;
                        i8 = iM2762 ^ i9;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i8;
                        i30 = i5;
                        i32 = i32;
                    }
                    break;
                case -1544282877:
                case 167882047:
                    C2288.m7767();
                    if (C2966.f9654 < 0) {
                        iM3169 = C0773.m3169("ۤۤ") ^ i28;
                        i = ((iM3169 ^ i29) * 25617) ^ 988988016;
                        i2 = -661033638;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    } else {
                        sb = sb4;
                        i17 = i32;
                        sb2 = sb3;
                        str = str2;
                        i18 = i33;
                        i19 = i35;
                        i20 = value;
                        iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                        i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                        i22 = -1405379157;
                        sb3 = sb2;
                        i32 = i17;
                        i16 = i18;
                        str2 = str;
                        sb4 = sb;
                        i31 = iM2764 ^ i22;
                        i30 = i21;
                        value = i20;
                        i35 = i19;
                        i33 = i16;
                    }
                    break;
                case -1435570952:
                case -566024184:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    strM6952 = "";
                    value = value;
                    iM2762 = C0619.m2761("ܰܰ") ^ i28;
                    i5 = ((iM2762 ^ i29) * (-559)) ^ (-216777481);
                    i9 = -1437716447;
                    i8 = iM2762 ^ i9;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case -1431431383:
                case -1058185343:
                    if (RunnableC3055.f9898 >= 0) {
                        sb4 = sb4;
                        i32 = i32;
                        str2 = str2;
                        i33 = i33;
                        i35 = i35;
                        value = value;
                        iM2761 = (C0773.m3169("ᩳۗ") + i28) * 91;
                        i3 = ((iM2761 ^ i29) * 4735) ^ 843718394;
                        i4 = -411883858;
                        i7 = iM2761 ^ i4;
                        i30 = i3;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    }
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    iM2762 = (i29 - C0619.m2761("ۘ᩷")) * (-81);
                    i5 = ((iM2762 ^ i28) * 31997) ^ 921181313;
                    i9 = -1719536603;
                    i8 = iM2762 ^ i9;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case -1276108717:
                case -1132690883:
                    AbstractC0641.m2813();
                    if (C3998.f13671 != 0) {
                        sb4 = sb4;
                        i32 = i32;
                        str2 = str2;
                        iM31612 = C0773.m3169("֡ۨ") ^ i28;
                        i11 = ((iM31612 ^ i29) * 9689) ^ 266632981;
                        i12 = 364173558;
                        i7 = iM31612 ^ i12;
                        str2 = str2;
                        i30 = i11;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    } else {
                        sb = sb4;
                        i17 = i32;
                        sb2 = sb3;
                        str = str2;
                        i18 = i33;
                        i19 = i35;
                        i20 = value;
                        iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                        i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                        i22 = -1405379157;
                        sb3 = sb2;
                        i32 = i17;
                        i16 = i18;
                        str2 = str;
                        sb4 = sb;
                        i31 = iM2764 ^ i22;
                        i30 = i21;
                        value = i20;
                        i35 = i19;
                        i33 = i16;
                    }
                    break;
                case -1249881644:
                case -266367496:
                    sb4 = sb4;
                    i32 = i32;
                    C3779.m12258(sb5, strMo9077);
                    C1783.m6234(sb5, strM6952);
                    m7118(spannableStringBuilder, C2023.m6952(sb5));
                    boolean zMo18155 = interfaceC8698.mo18155();
                    c21246 = this.f6864;
                    if (zMo18155) {
                        iM31614 = (C0773.m3169("᩸ۖ") + i29) * 119;
                        i23 = ((iM31614 ^ i28) * 12421) ^ (-1156421924);
                        i24 = 1849054450;
                    } else {
                        iM31614 = C0619.m2761("ᩳۚ") ^ i28;
                        i23 = ((iM31614 ^ i29) * (-2079)) ^ (-465711126);
                        i24 = 1815571216;
                    }
                    i25 = iM31614 ^ i24;
                    i30 = i23;
                    i32 = i32;
                    StringBuilder sb7 = sb4;
                    i31 = i25;
                    sb4 = sb7;
                    break;
                case -1189406543:
                case -817111931:
                    sb4 = sb4;
                    i32 = i32;
                    if (!C3998.m12923(itM2357)) {
                        iM31612 = C0619.m2761("ۢ᩵") ^ i28;
                        i11 = ((iM31612 ^ i29) * (-16563)) ^ (-1071233531);
                        i12 = -1479557442;
                        i7 = iM31612 ^ i12;
                        str2 = str2;
                        i30 = i11;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    } else {
                        iM31613 = (C0773.m3169("ۡ۟") + i28) * 127;
                        i30 = ((iM31613 ^ i29) * (-31919)) ^ 301787949;
                        i13 = -1958456725;
                        i25 = iM31613 ^ i13;
                        i32 = i32;
                        StringBuilder sb8 = sb4;
                        i31 = i25;
                        sb4 = sb8;
                    }
                    break;
                case -1168918891:
                case -1080981389:
                    break;
                case -1155250628:
                case 618852952:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    m7118(spannableStringBuilder, C1321.m4861(f6861, 6, 3, i34));
                    if (C2354.f7599 < 0) {
                        StringBuilder sb9 = new StringBuilder(str2);
                        C2023.m6955(sb9, c);
                        C1783.m6234(sb9, interfaceC8697.mo23385());
                        RunnableC1848.m6356(spannableStringBuilder, C1080.m4058(sb9));
                        iM31610 = (C0773.m3169("᩹ܶ") + i29) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM31610 ^ i28) * 17455) ^ (-1031593670);
                        i6 = -821866126;
                        i8 = iM31610 ^ i6;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i8;
                        i30 = i5;
                        i32 = i32;
                    }
                    iM2761 = (C0773.m3169("ᩳۗ") + i28) * 91;
                    i3 = ((iM2761 ^ i29) * 4735) ^ 843718394;
                    i4 = -411883858;
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case -1098729326:
                case 1901158006:
                    C3734.m12152();
                    sb = sb4;
                    i17 = i32;
                    sb2 = sb3;
                    str = str2;
                    i18 = i33;
                    i19 = i35;
                    i20 = value;
                    iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                    i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                    i22 = -1405379157;
                    sb3 = sb2;
                    i32 = i17;
                    i16 = i18;
                    str2 = str;
                    sb4 = sb;
                    i31 = iM2764 ^ i22;
                    i30 = i21;
                    value = i20;
                    i35 = i19;
                    i33 = i16;
                    break;
                case -1020632438:
                case -30066106:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    if (!C1826.m6317(itM53423)) {
                        i33 = i33;
                        i35 = i35;
                        iM31611 = (C0773.m3169("֨ۧ") ^ i28) * 39;
                        i5 = ((iM31611 ^ i29) * (-20317)) ^ 1631086165;
                        i10 = -458959491;
                        i8 = iM31611 ^ i10;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i8;
                        i30 = i5;
                        i32 = i32;
                    } else {
                        iM31612 = C0773.m3169("۠֨") ^ i28;
                        i11 = ((iM31612 ^ i29) * (-18345)) ^ 1561015032;
                        i12 = -426211533;
                        i7 = iM31612 ^ i12;
                        str2 = str2;
                        i30 = i11;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    }
                    break;
                case -905893147:
                case 242006902:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    C3779.m12258(sb3, RunnableC3646.m11809(f6861, 15, 8, i34));
                    iM31610 = C0773.m3169("ۙۢ") ^ i29;
                    i5 = ((iM31610 ^ i28) * 24853) ^ 1878929316;
                    i6 = -989867068;
                    i8 = iM31610 ^ i6;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case -827595322:
                case 1193231919:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    if (interfaceC8697.mo18153().mo27607() != i35) {
                        iM31611 = C0773.m3169("ۚ۬") ^ i29;
                        i5 = ((iM31611 ^ i28) * 7769) ^ (-1953246582);
                        i10 = -1386476832;
                    } else {
                        iM31611 = (C0773.m3169("֨ۧ") ^ i28) * 39;
                        i5 = ((iM31611 ^ i29) * (-20317)) ^ 1631086165;
                        i10 = -458959491;
                    }
                    i8 = iM31611 ^ i10;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case -690693522:
                case 1668094137:
                    value = interfaceC5650.getValue();
                    C3734.m12154(spannableStringBuilder, new BackgroundColorSpan(value), iM3510, C1826.m6305(spannableStringBuilder), 33);
                    if (C3734.f12817 >= 0) {
                        sb4 = sb4;
                        i32 = i32;
                        i35 = i35;
                        str2 = str2;
                        i33 = 33;
                        value = value;
                        iM2761 = (C0619.m2761("᩶ܿ") ^ i29) * 25;
                        i3 = ((iM2761 ^ i28) * 31561) ^ 1391515783;
                        i4 = 1080284025;
                        i7 = iM2761 ^ i4;
                        i30 = i3;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    } else {
                        int iM2766 = (i28 - C0619.m2761("᩻ۨ")) * 9;
                        i31 = iM2766 ^ 148682068;
                        i30 = ((iM2766 ^ i29) * (-31279)) ^ (-900925593);
                        i33 = 33;
                    }
                    break;
                case -283101467:
                case 2002329365:
                    C3033.m9857(spannableStringBuilder, C1080.m4058(sb4));
                    if (interfaceC5650.mo16635() < 28) {
                        iM31613 = (i29 - C0619.m2761("ۧ᩹")) * (-75);
                        i30 = ((iM31613 ^ i28) * (-847)) ^ 724569408;
                        i13 = -2038036766;
                        i25 = iM31613 ^ i13;
                        i32 = i32;
                        StringBuilder sb10 = sb4;
                        i31 = i25;
                        sb4 = sb10;
                    } else {
                        iM3169 = (C0619.m2761("ۖ۬") ^ i29) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i28) * (-20953)) ^ 980830613;
                        i2 = -1276519508;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    }
                    break;
                case -262239583:
                case 1195872992:
                    sb = sb4;
                    i17 = i32;
                    sb2 = sb3;
                    str = str2;
                    i18 = i33;
                    i19 = i35;
                    i20 = value;
                    if (C2834.m9336(arrayList) > i19) {
                        iM2764 = C0773.m3169("ۢۜ") ^ i29;
                        i21 = ((iM2764 ^ i28) * 15257) ^ (-795067884);
                        i22 = 141688683;
                    } else {
                        iM2764 = (C0619.m2761("ᩴ۟") ^ i29) * (-75);
                        i21 = ((iM2764 ^ i28) * 29131) ^ 196027146;
                        i22 = 1063797921;
                    }
                    sb3 = sb2;
                    i32 = i17;
                    i16 = i18;
                    str2 = str;
                    sb4 = sb;
                    i31 = iM2764 ^ i22;
                    i30 = i21;
                    value = i20;
                    i35 = i19;
                    i33 = i16;
                    break;
                case -150736235:
                case 2088366113:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    s = f6861[4];
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("᩶ܿ") ^ i29) * 25;
                        i3 = ((iM2761 ^ i28) * 31561) ^ 1391515783;
                        i4 = 1080284025;
                    } else {
                        iM2761 = (i29 - C0773.m3169("᩹ۗ")) * (-11);
                        i3 = ((iM2761 ^ i28) * 4917) ^ (-1170038326);
                        i4 = -2021835576;
                    }
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case -146969659:
                case -83064568:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    if (C1146.m4231()) {
                        iM2761 = C0773.m3169("ۘۖ") ^ i28;
                        i3 = ((iM2761 ^ i29) * (-26197)) ^ 290873972;
                        i4 = 412883256;
                    } else {
                        iM2761 = C0619.m2761("᩹ܳ") ^ i29;
                        i3 = ((iM2761 ^ i28) * 16091) ^ 2137881169;
                        i4 = 1303960299;
                    }
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case -98002811:
                case 1231720960:
                    sb4 = sb4;
                    i32 = i32;
                    StringBuilder sb11 = sb3;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    C1783.m6234(sb11, interfaceC8697.mo18156());
                    RunnableC1848.m6356(spannableStringBuilder, C2023.m6952(sb11));
                    iM31610 = (C0773.m3169("᩹ܶ") + i29) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i5 = ((iM31610 ^ i28) * 17455) ^ (-1031593670);
                    i6 = -821866126;
                    i8 = iM31610 ^ i6;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case -61866587:
                case 1283468639:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    i26 = (s * 2) + 1;
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ᩳۗ") + i28) * 91;
                        i3 = ((iM2761 ^ i29) * 4735) ^ 843718394;
                        i4 = -411883858;
                    } else {
                        iM2761 = C0619.m2761("ۛۚ") ^ i28;
                        i3 = ((iM2761 ^ i29) * 16479) ^ 238014903;
                        i4 = 1152837953;
                    }
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case -51016733:
                case 1765857009:
                    sb4 = sb4;
                    i32 = i32;
                    if (interfaceC8698.getParent() != 0) {
                        iM31613 = C0773.m3169("۟ۗ") ^ i28;
                        i30 = ((iM31613 ^ i29) * 11831) ^ 827200820;
                        i13 = 869183674;
                        i25 = iM31613 ^ i13;
                        i32 = i32;
                        StringBuilder sb12 = sb4;
                        i31 = i25;
                        sb4 = sb12;
                    }
                    iM31614 = C0619.m2761("ᩳۚ") ^ i28;
                    i23 = ((iM31614 ^ i29) * (-2079)) ^ (-465711126);
                    i24 = 1815571216;
                    i25 = iM31614 ^ i24;
                    i30 = i23;
                    i32 = i32;
                    StringBuilder sb13 = sb4;
                    i31 = i25;
                    sb4 = sb13;
                    break;
                case 16659579:
                case 1850026286:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    String strM2756 = C0619.m2756(f6861, 23, 1, i34);
                    if (C23916.m53419() != 0) {
                        iM2762 = (i29 - C0619.m2761("ۘ᩷")) * (-81);
                        i5 = ((iM2762 ^ i28) * 31997) ^ 921181313;
                        i9 = -1719536603;
                    } else {
                        StringBuilder sb14 = new StringBuilder(strM2756);
                        C1783.m6234(sb14, interfaceC8697.mo18156());
                        strM6952 = C2023.m6952(sb14);
                        iM2762 = C0619.m2761("ܰܰ") ^ i28;
                        i5 = ((iM2762 ^ i29) * (-559)) ^ (-216777481);
                        i9 = -1437716447;
                    }
                    i8 = iM2762 ^ i9;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i8;
                    i30 = i5;
                    i32 = i32;
                    break;
                case 52880521:
                case 2050331117:
                    C0950.m3785();
                    if (C2419.f7754 >= 0) {
                        sb4 = sb4;
                        i32 = i32;
                        str2 = str2;
                        i33 = i33;
                        i35 = i35;
                        value = value;
                        iM2761 = C0619.m2761("᩹ܳ") ^ i29;
                        i3 = ((iM2761 ^ i28) * 16091) ^ 2137881169;
                        i4 = 1303960299;
                        i7 = iM2761 ^ i4;
                        i30 = i3;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    } else {
                        iM3169 = C0773.m3169("ۤۤ") ^ i28;
                        i = ((iM3169 ^ i29) * 25617) ^ 988988016;
                        i2 = -661033638;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    }
                    break;
                case 91351540:
                case 2107148285:
                    C3734.m12154(spannableStringBuilder, new ForegroundColorSpan(C8420.m22615(value, C3296.f10758)), iM3510, C1826.m6305(spannableStringBuilder), i33);
                    iM31613 = (i29 - C0619.m2761("ۧ᩹")) * (-75);
                    i30 = ((iM31613 ^ i28) * (-847)) ^ 724569408;
                    i13 = -2038036766;
                    i25 = iM31613 ^ i13;
                    i32 = i32;
                    StringBuilder sb15 = sb4;
                    i31 = i25;
                    sb4 = sb15;
                    break;
                case 96652915:
                case 315425716:
                    sb = sb4;
                    i17 = i32;
                    sb2 = sb3;
                    str = str2;
                    i18 = i33;
                    i19 = i35;
                    i20 = value;
                    C3779.m12258(sb2, RunnableC0334.m2058(interfaceC8697.getType()));
                    C2023.m6955(sb2, '/');
                    if (C2023.f6737) {
                        iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                        i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                        i22 = -1405379157;
                    } else {
                        iM2764 = C0619.m2761("ۖۘ") ^ i28;
                        i21 = ((iM2764 ^ i29) * (-31663)) ^ (-1210543175);
                        i22 = 764377893;
                    }
                    sb3 = sb2;
                    i32 = i17;
                    i16 = i18;
                    str2 = str;
                    sb4 = sb;
                    i31 = iM2764 ^ i22;
                    i30 = i21;
                    value = i20;
                    i35 = i19;
                    i33 = i16;
                    break;
                case 104400563:
                case 976828310:
                    sb4 = sb4;
                    i32 = i32;
                    itM53423 = C23916.m53423(arrayList);
                    iM31612 = C0619.m2761("ۢ᩵") ^ i28;
                    i11 = ((iM31612 ^ i29) * (-16563)) ^ (-1071233531);
                    i12 = -1479557442;
                    i7 = iM31612 ^ i12;
                    str2 = str2;
                    i30 = i11;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case 147939888:
                case 1423132291:
                    itM2357 = C0487.m2357(interfaceC8698.values());
                    iM31613 = (i29 - C0619.m2761("ۧ᩹")) * (-75);
                    i30 = ((iM31613 ^ i28) * (-847)) ^ 724569408;
                    i13 = -2038036766;
                    i25 = iM31613 ^ i13;
                    i32 = i32;
                    StringBuilder sb16 = sb4;
                    i31 = i25;
                    sb4 = sb16;
                    break;
                case 419723733:
                case 949259846:
                    StringBuilder sb17 = sb4;
                    int i36 = i33;
                    int i37 = value;
                    i32 = 0;
                    interfaceC8697 = (InterfaceC8697) C3690.m11998(arrayList, 0);
                    String strM12266 = C3779.m12266(f6861, 5, 1, i34);
                    if (z) {
                        iM2763 = C0619.m2761("᩻ܶ") ^ i29;
                        i14 = ((iM2763 ^ i28) * 25689) ^ (-2004244212);
                        i15 = -2079837586;
                    } else {
                        iM2763 = C0619.m2761("ᩴ۬") ^ i28;
                        i14 = ((iM2763 ^ i29) * (-21193)) ^ 822706030;
                        i15 = -540913885;
                    }
                    i30 = i14;
                    value = i37;
                    i35 = 1;
                    i16 = i36;
                    str2 = strM12266;
                    sb4 = sb17;
                    i31 = iM2763 ^ i15;
                    i33 = i16;
                    break;
                case 437788900:
                case 1125481880:
                    if (C1826.f6190 > 0) {
                        iM3169 = C0773.m3169("ܶۜ") ^ i28;
                        i = ((iM3169 ^ i29) * (-21089)) ^ 461803374;
                        i2 = 330198255;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    } else {
                        sb4 = sb4;
                        i32 = i32;
                        str2 = str2;
                        i33 = i33;
                        i35 = i35;
                        value = value;
                        iM2761 = C0619.m2761("᩹ܳ") ^ i29;
                        i3 = ((iM2761 ^ i28) * 16091) ^ 2137881169;
                        i4 = 1303960299;
                        i7 = iM2761 ^ i4;
                        i30 = i3;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    }
                    break;
                case 455066196:
                case 1983773417:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    StringBuilder sb18 = new StringBuilder(str2);
                    C2023.m6955(sb18, c);
                    if (interfaceC8697.mo18153().mo27607() != i35) {
                        sb3 = sb18;
                        iM31610 = C0773.m3169("ۙۢ") ^ i29;
                        i5 = ((iM31610 ^ i28) * 24853) ^ 1878929316;
                        i6 = -989867068;
                        i8 = iM31610 ^ i6;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i8;
                        i30 = i5;
                        i32 = i32;
                    } else {
                        int iM31616 = C0773.m3169("ۙ۠") ^ i28;
                        i3 = ((iM31616 ^ i29) * (-3809)) ^ (-979171052);
                        i7 = iM31616 ^ 1787384758;
                        sb3 = sb18;
                        i30 = i3;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i7;
                        i32 = i32;
                    }
                    break;
                case 542310905:
                case 2036924465:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    int i38 = s + 1;
                    if ((i38 * i38) - i26 < 0) {
                        iM2761 = C0619.m2761("ۜܿ") ^ i28;
                        i3 = ((iM2761 ^ i29) * 5411) ^ 1191233902;
                        i4 = -1845529711;
                    } else {
                        iM2761 = C0619.m2761("ۗ᩺") ^ i29;
                        i3 = ((iM2761 ^ i28) * (-31833)) ^ 2051620588;
                        i4 = -934886897;
                    }
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case 652169964:
                case 1738597388:
                    C3779.m12258(sb4, c21246.m48430(interfaceC5650.mo16637()));
                    m7125(spannableStringBuilder, C2023.m6952(sb4));
                    sb4.setLength(i32);
                    C1080.m4046(sb4, a.h);
                    iM3169 = (C0773.m3169("ܿۙ") + i29) * (-95);
                    i = ((iM3169 ^ i28) * 30053) ^ 156698425;
                    i2 = -1189465052;
                    i31 = iM3169 ^ i2;
                    i30 = i;
                    break;
                case 657898877:
                case 1379468588:
                    sb4 = sb4;
                    i32 = i32;
                    str2 = str2;
                    i33 = i33;
                    i35 = i35;
                    value = value;
                    m7118(spannableStringBuilder, C2375.m8069(f6861, 9, 6, i34));
                    if (C3492.m11488()) {
                        iM31610 = (C0773.m3169("ܰۘ") ^ i28) * (-85);
                        i5 = ((iM31610 ^ i29) * (-28371)) ^ 859446225;
                        i6 = 160574764;
                        i8 = iM31610 ^ i6;
                        value = value;
                        i35 = i35;
                        i33 = i33;
                        str2 = str2;
                        sb4 = sb4;
                        i31 = i8;
                        i30 = i5;
                        i32 = i32;
                    }
                    iM2761 = (C0773.m3169("ᩳۗ") + i28) * 91;
                    i3 = ((iM2761 ^ i29) * 4735) ^ 843718394;
                    i4 = -411883858;
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
                case 971796583:
                case 1966335213:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("᩸۫") ^ i29;
                        i = ((iM3169 ^ i28) * 28911) ^ (-325820129);
                        i2 = -869723954;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    } else {
                        sb = sb4;
                        i17 = i32;
                        sb2 = sb3;
                        str = str2;
                        i18 = i33;
                        i19 = i35;
                        i20 = value;
                        iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                        i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                        i22 = -1405379157;
                        sb3 = sb2;
                        i32 = i17;
                        i16 = i18;
                        str2 = str;
                        sb4 = sb;
                        i31 = iM2764 ^ i22;
                        i30 = i21;
                        value = i20;
                        i35 = i19;
                        i33 = i16;
                    }
                    break;
                case 973985687:
                case 1331185034:
                    iM3510 = C0862.m3510(sb4) + C3998.m12919(spannableStringBuilder);
                    C3779.m12258(sb4, c21246.m48421(interfaceC5650));
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ۗ᩸") ^ i28;
                        i = ((iM3169 ^ i29) * 13777) ^ 703192479;
                        i2 = 331137651;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    } else {
                        sb = sb4;
                        i17 = i32;
                        sb2 = sb3;
                        str = str2;
                        i18 = i33;
                        i19 = i35;
                        i20 = value;
                        iM2764 = C0619.m2761("ۜ᩷") ^ i29;
                        i21 = ((iM2764 ^ i28) * (-3171)) ^ 1141925330;
                        i22 = -1405379157;
                        sb3 = sb2;
                        i32 = i17;
                        i16 = i18;
                        str2 = str;
                        sb4 = sb;
                        i31 = iM2764 ^ i22;
                        i30 = i21;
                        value = i20;
                        i35 = i19;
                        i33 = i16;
                    }
                    break;
                case 1364943707:
                case 1462458501:
                    sb4 = sb4;
                    i32 = i32;
                    RunnableC1848.m6356(spannableStringBuilder, C4282.m13652(C0950.m3780(f6861, 26, 8, i34), c21246.m48432(interfaceC8698.getParent())));
                    iM31614 = C0619.m2761("ᩳۚ") ^ i28;
                    i23 = ((iM31614 ^ i29) * (-2079)) ^ (-465711126);
                    i24 = 1815571216;
                    i25 = iM31614 ^ i24;
                    i30 = i23;
                    i32 = i32;
                    StringBuilder sb19 = sb4;
                    i31 = i25;
                    sb4 = sb19;
                    break;
                case 1456479735:
                case 1834312646:
                    if (interfaceC5650.mo16635() > 31) {
                        iM31613 = (i29 - C0619.m2761("ۧ᩹")) * (-75);
                        i30 = ((iM31613 ^ i28) * (-847)) ^ 724569408;
                        i13 = -2038036766;
                        i25 = iM31613 ^ i13;
                        i32 = i32;
                        StringBuilder sb110 = sb4;
                        i31 = i25;
                        sb4 = sb110;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩵") ^ i28) * (-53);
                        i = ((iM3169 ^ i29) * 13019) ^ (-1685386566);
                        i2 = -893759136;
                        i31 = iM3169 ^ i2;
                        i30 = i;
                    }
                    break;
                case 2001451374:
                case 2048808488:
                    C2287.m7745();
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("۠᩸") ^ i28;
                        i = ((iM3169 ^ i29) * (-5201)) ^ (-168394338);
                        i2 = 1740847350;
                    } else {
                        iM3169 = C0773.m3169("ۤۤ") ^ i28;
                        i = ((iM3169 ^ i29) * 25617) ^ 988988016;
                        i2 = -661033638;
                    }
                    i31 = iM3169 ^ i2;
                    i30 = i;
                    break;
                default:
                    i34 = 54072;
                    iM2761 = (C0773.m3169("ܿۗ") ^ i29) * 31;
                    i3 = ((iM2761 ^ i28) * (-32223)) ^ (-577724277);
                    i4 = -382800342;
                    i7 = iM2761 ^ i4;
                    i30 = i3;
                    value = value;
                    i35 = i35;
                    i33 = i33;
                    str2 = str2;
                    sb4 = sb4;
                    i31 = i7;
                    i32 = i32;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m7125(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM12919 = 0;
        UnderlineSpan underlineSpan = null;
        int iM129110 = 0;
        int i = 0;
        int i2 = -312849627;
        int i3 = C3779.f12953;
        int i4 = C4238.f15451;
        int iM2761 = C0619.m2761("ۧۚ") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-24211)) ^ (-1214488744);
        int i6 = -1817763487;
        while (true) {
            i2 = ((((i2 ^ i4) * (-10763)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1941919512:
                case -1506393748:
                    C11235.m28309();
                    break;
                case -1506740113:
                case -693077103:
                    C1146.m4232(spannableStringBuilder, str);
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ᩴۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17411) ^ 2059671974;
                        i6 = 288460980;
                    } else {
                        iM2761 = (C0773.m3169("۫ܺ") + i4) * (-105);
                        i5 = ((iM2761 ^ i3) * (-31085)) ^ 805692233;
                        i6 = -1252226524;
                    }
                    break;
                case -1484417157:
                case 2080296502:
                    RunnableC3055.m9933();
                    if (C0773.f2792 > 0) {
                        iM2761 = (C0619.m2761("ۚܽ") ^ i4) * 43;
                        i5 = ((iM2761 ^ i3) * 2247) ^ (-1362522070);
                        i6 = 1294532382;
                    } else {
                        iM2761 = C0773.m3169("ۛܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9437)) ^ (-274260875);
                        i6 = 1595928995;
                    }
                    break;
                case -1170234236:
                case 471728384:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6663) ^ 1396032756;
                        i6 = 1139403659;
                    } else {
                        iM2761 = C0773.m3169("ܺ᩻") ^ i3;
                        i5 = ((iM2761 ^ i4) * 29739) ^ (-568615616);
                        i6 = -124548825;
                    }
                    break;
                case -1155500212:
                case 2060452351:
                    underlineSpan = new UnderlineSpan();
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9437)) ^ (-274260875);
                        i6 = 1595928995;
                    } else {
                        iM2761 = (C0619.m2761("ۢ۫") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2761 ^ i4) * 31547) ^ (-1699767931);
                        i6 = -569155527;
                    }
                    break;
                case -1129534420:
                case 267671933:
                    iM129110 = C3998.m12919(spannableStringBuilder);
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ᩴۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17411) ^ 2059671974;
                        i6 = 288460980;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۜ") ^ i4) * 101;
                        i5 = ((iM2761 ^ i3) * 18553) ^ 2119449215;
                        i6 = 1525131361;
                    }
                    break;
                case -787797360:
                case 1607437146:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i5 = ((iM2761 ^ i4) * 17157) ^ (-1488249788);
                        i6 = -1512562943;
                    } else {
                        iM2761 = (C0619.m2761("ۘ֡") ^ i4) * 11;
                        i5 = ((iM2761 ^ i3) * (-55)) ^ (-481992846);
                        i6 = 959024591;
                    }
                    break;
                case -624715574:
                case -374859954:
                    C17202.m40372();
                    iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                    i5 = ((iM2761 ^ i4) * 17157) ^ (-1488249788);
                    i6 = -1512562943;
                    break;
                case -262600671:
                case 615948492:
                    if (AbstractC0641.f2496 < 0) {
                        if (C2354.m7983()) {
                            C17202.m40381(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM12919, C3998.m12919(spannableStringBuilder), i);
                        }
                        iM2761 = C0619.m2761("ᩴۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17411) ^ 2059671974;
                        i6 = 288460980;
                    } else {
                        iM2761 = (C0619.m2761("ۚܽ") ^ i4) * 43;
                        i5 = ((iM2761 ^ i3) * 2247) ^ (-1362522070);
                        i6 = 1294532382;
                    }
                    break;
                case -37009872:
                case 2101945522:
                    C20932.m47848();
                    if (!C1519.m5403()) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9437)) ^ (-274260875);
                        i6 = 1595928995;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6663) ^ 1396032756;
                        i6 = 1139403659;
                    }
                    break;
                case 335022760:
                case 1340201031:
                    i = 33;
                    C3734.m12154(spannableStringBuilder, underlineSpan, iM12919, iM129110, 33);
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (C0619.m2761("ۚܽ") ^ i4) * 43;
                        i5 = ((iM2761 ^ i3) * 2247) ^ (-1362522070);
                        i6 = 1294532382;
                    } else {
                        iM2761 = C0619.m2761("ܶۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 29895) ^ (-1847400222);
                        i6 = 221126556;
                    }
                    break;
                case 371680570:
                case 1785807408:
                    if (C20932.f66974 > 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9437)) ^ (-274260875);
                        i6 = 1595928995;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i3;
                        i5 = ((iM2761 ^ i4) * 17157) ^ (-1488249788);
                        i6 = -1512562943;
                    }
                    break;
                case 456162336:
                case 1233723468:
                    iM12919 = C3998.m12919(spannableStringBuilder);
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("ۛܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9437)) ^ (-274260875);
                        i6 = 1595928995;
                    } else {
                        iM2761 = C0773.m3169("֫᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6955) ^ (-1260319848);
                        i6 = 1611107477;
                    }
                    break;
                default:
                    if (C0619.m2763()) {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6663) ^ 1396032756;
                        i6 = 1139403659;
                    } else {
                        iM2761 = C0619.m2761("ܺ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * 6883) ^ (-1460278716);
                        i6 = 849920177;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0222 A[PHI: r2 r3 r7 r11 r12 r19
      0x0222: PHI (r2v4 l.ۧܽ᩸) = (r2v2 l.ۧܽ᩸), (r2v3 l.ۧܽ᩸), (r2v2 l.ۧܽ᩸) binds: [B:61:0x0220, B:45:0x0163, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r3v4 android.text.Editable) = (r3v2 android.text.Editable), (r3v3 android.text.Editable), (r3v2 android.text.Editable) binds: [B:61:0x0220, B:45:0x0163, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r7v19 l.ܳܽ᩸) = (r7v6 l.ܳܽ᩸), (r7v11 l.ܳܽ᩸), (r7v20 l.ܳܽ᩸) binds: [B:61:0x0220, B:45:0x0163, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:61:0x0220, B:45:0x0163, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:61:0x0220, B:45:0x0163, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r19v15 android.text.Editable) = (r19v4 android.text.Editable), (r19v9 android.text.Editable), (r19v16 android.text.Editable) binds: [B:61:0x0220, B:45:0x0163, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x029f A[PHI: r4 r7 r8 r19 r20
      0x029f: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:70:0x029d, B:41:0x013d, B:6:0x0055, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r7v29 l.ܳܽ᩸) = (r7v4 l.ܳܽ᩸), (r7v12 l.ܳܽ᩸), (r7v21 l.ܳܽ᩸), (r7v34 l.ܳܽ᩸) binds: [B:70:0x029d, B:41:0x013d, B:6:0x0055, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r8v5 char) = (r8v2 char), (r8v2 char), (r8v3 char), (r8v2 char) binds: [B:70:0x029d, B:41:0x013d, B:6:0x0055, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r19v25 android.text.Editable) = 
      (r19v2 android.text.Editable)
      (r19v10 android.text.Editable)
      (r19v17 android.text.Editable)
      (r19v31 android.text.Editable)
     binds: [B:70:0x029d, B:41:0x013d, B:6:0x0055, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r20v6 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:70:0x029d, B:41:0x013d, B:6:0x0055, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (l.C3779.f12953 > 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m7120(l.ViewOnClickListenerC2063 r21) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2063.m7120(l.֫ܽ᩸):void");
    }

    public ViewOnClickListenerC2063(ViewOnClickListenerC12508 viewOnClickListenerC12508, View view, C21246 c21246) {
        short[] sArr;
        int iM2761;
        int i;
        int i2;
        View viewM9333 = null;
        C11757 c11757 = null;
        int i3 = 0;
        int iM3169 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1569133079;
        int i6 = C4282.f15546;
        int i7 = C1542.f5343;
        short s = f6861[0];
        int i8 = (s * 2) + 1;
        int i9 = s + 1;
        int i10 = i8 - (i9 * i9) > 0 ? 19288 : 888;
        int iM2762 = C0619.m2761("ۢ᩺") ^ i6;
        int i11 = ((iM2762 ^ i7) * o.a.F) ^ (-1934858552);
        int i12 = -1326568201;
        while (true) {
            int i13 = iM2762 ^ i12;
            while (true) {
                i5 = ((((i5 ^ i7) * 5893) >> 31) & i11) ^ i13;
                switch (i5) {
                    case -2145807422:
                    case 792906341:
                        viewM9333 = C2834.m9333(view, 2121906937 ^ iM3169);
                        if (C3033.f9831 < 0) {
                            iM2762 = (C0773.m3169("֫۠") ^ i6) * (-113);
                            i11 = ((iM2762 ^ i7) * (-17225)) ^ (-620767276);
                            i12 = 1782136082;
                        } else {
                            iM2762 = (i6 - C0619.m2761("ۨ᩹")) * (-99);
                            i11 = ((iM2762 ^ i7) * 27723) ^ (-1094447137);
                            i12 = -1778756059;
                        }
                        break;
                    case -1871709849:
                    case 1537159070:
                        C1321.m4852();
                        if (RunnableC3055.f9898 >= 0) {
                            iM2762 = C0773.m3169("ۚܽ") ^ i6;
                            i11 = ((iM2762 ^ i7) * 7979) ^ (-1128858002);
                            i12 = 1767018791;
                        } else {
                            iM2762 = (C0619.m2761("ۘ᩸") + i7) * 39;
                            i11 = ((iM2762 ^ i6) * 32443) ^ (-1194401284);
                            i12 = -1112146012;
                        }
                        break;
                    case -1816306000:
                    case 682678263:
                        C1826.m6301();
                        AbstractC3624.m11755();
                        throw new RuntimeException();
                    case -1806861254:
                    case 913718981:
                        this.f6863 = viewOnClickListenerC12508;
                        this.f6864 = c21246;
                        sArr = f6861;
                        if (C2419.m8174() >= 0) {
                            iM2761 = C0619.m2761("۠ۖ") ^ i7;
                            i = ((iM2761 ^ i6) * 587) ^ 1648502620;
                            i2 = -370370429;
                        } else {
                            iM2761 = (i7 - C0619.m2761("᩺֫")) * 69;
                            i = ((iM2761 ^ i6) * (-1193)) ^ (-1191801936);
                            i2 = 271514625;
                        }
                        sArr2 = sArr;
                        i13 = iM2761 ^ i2;
                        i11 = i;
                        break;
                    case -1692794788:
                    case 679919601:
                        c11757.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۤܽ᩸
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view2, int i14, long j) {
                                ViewOnClickListenerC2063.m7120(this.f34774);
                            }
                        });
                        return;
                    case -1601338535:
                    case 1870676640:
                        if (C0487.f2131 > 0) {
                            iM2762 = (i7 - C0773.m3169("ܺۜ")) * (-95);
                            i11 = ((iM2762 ^ i6) * 18963) ^ 1923486004;
                            i12 = 1432397037;
                        } else {
                            iM2762 = (C0619.m2761("ۘ᩸") + i7) * 39;
                            i11 = ((iM2762 ^ i6) * 32443) ^ (-1194401284);
                            i12 = -1112146012;
                        }
                        break;
                    case -1451561402:
                    case 1089500369:
                        if (!C0862.m3503()) {
                            iM2762 = C0773.m3169("ۚܽ") ^ i6;
                            i11 = ((iM2762 ^ i7) * 7979) ^ (-1128858002);
                            i12 = 1767018791;
                        }
                        sArr = sArr2;
                        iM2761 = C0619.m2761("۠ۖ") ^ i7;
                        i = ((iM2761 ^ i6) * 587) ^ 1648502620;
                        i2 = -370370429;
                        sArr2 = sArr;
                        i13 = iM2761 ^ i2;
                        i11 = i;
                        break;
                    case -1328428445:
                    case -1067462796:
                        iM3169 = C0773.m3169(C0950.m3780(sArr2, i4, 3, i10));
                        if (C1542.f5343 > 0) {
                            iM2762 = C0773.m3169("ۢᩳ") ^ i7;
                            i11 = ((iM2762 ^ i6) * (-2501)) ^ 494210271;
                            i12 = 1713628568;
                        } else {
                            iM2762 = C0773.m3169("ۚܽ") ^ i6;
                            i11 = ((iM2762 ^ i7) * 7979) ^ (-1128858002);
                            i12 = 1767018791;
                        }
                        break;
                    case -1177263000:
                    case -699074714:
                        i4 = 1;
                        if (C1542.m5459() < 0) {
                            iM2762 = C0773.m3169("۠֡") ^ i6;
                            i11 = ((iM2762 ^ i7) * (-20325)) ^ (-797771713);
                            i12 = -1804423241;
                        } else {
                            iM2762 = (i7 - C0773.m3169("ܺۜ")) * (-95);
                            i11 = ((iM2762 ^ i6) * 18963) ^ 1923486004;
                            i12 = 1432397037;
                        }
                        break;
                    case -1104022638:
                    case -84023118:
                        c11757 = (C11757) viewM9333;
                        if (C0950.f3488 < 0) {
                            iM2762 = (C0773.m3169("ܺۢ") ^ i6) * (-51);
                            i11 = ((iM2762 ^ i7) * 10863) ^ (-452733154);
                            i12 = -1793007203;
                        }
                        sArr = sArr2;
                        iM2761 = C0619.m2761("۠ۖ") ^ i7;
                        i = ((iM2761 ^ i6) * 587) ^ 1648502620;
                        i2 = -370370429;
                        sArr2 = sArr;
                        i13 = iM2761 ^ i2;
                        i11 = i;
                        break;
                    case -253280223:
                    case 1307702673:
                        C3734.m12152();
                        RunnableC0334.m2063();
                        iM2762 = (C0619.m2761("ۘ᩸") + i7) * 39;
                        i11 = ((iM2762 ^ i6) * 32443) ^ (-1194401284);
                        i12 = -1112146012;
                        break;
                    case -75424378:
                    case 1715633859:
                        C11235.m28299(C3448.m11246(view, i3), this);
                        if (C1321.f4751 < 0) {
                            iM2762 = C0773.m3169("᩵۬") ^ i7;
                            i11 = ((iM2762 ^ i6) * (-8283)) ^ (-307627876);
                            i12 = 1435007967;
                        } else {
                            iM2762 = (i7 - C0773.m3169("ܺۜ")) * (-95);
                            i11 = ((iM2762 ^ i6) * 18963) ^ 1923486004;
                            i12 = 1432397037;
                        }
                        break;
                    case -14822531:
                    case 439718825:
                        i3 = R.id.button1;
                        if (C2287.f7432 < 0) {
                            iM2762 = C0773.m3169("ۜ۫") ^ i6;
                            i11 = ((iM2762 ^ i7) * 21843) ^ (-1425492409);
                            i12 = 1122048601;
                        } else {
                            iM2762 = (i6 - C0619.m2761("ۨ᩹")) * (-99);
                            i11 = ((iM2762 ^ i7) * 27723) ^ (-1094447137);
                            i12 = -1778756059;
                        }
                        break;
                    case 485130468:
                    case 579107806:
                        c11757.addTextChangedListener(new C5792());
                        if (C2702.f8586 > 0) {
                            iM2762 = C0619.m2761("ܽۘ") ^ i6;
                            i11 = ((iM2762 ^ i7) * 22043) ^ 1091177371;
                            i12 = -1078372238;
                        } else {
                            iM2762 = (i7 - C0773.m3169("ܺۜ")) * (-95);
                            i11 = ((iM2762 ^ i6) * 18963) ^ 1923486004;
                            i12 = 1432397037;
                        }
                        break;
                    default:
                        this.f6862 = c11757;
                        if (C11235.m28309() == 0) {
                            C13249 c13249 = new C13249(this, viewOnClickListenerC12508);
                            this.f6865 = c13249;
                            c11757.setAdapter(c13249);
                            if (C0269.m1775() > 0) {
                                iM2762 = C0619.m2761("ܿ۟") ^ i7;
                                i11 = ((iM2762 ^ i6) * 23999) ^ 1887659987;
                                i12 = -1233324847;
                            } else {
                                iM2762 = C0773.m3169("ۚܽ") ^ i6;
                                i11 = ((iM2762 ^ i7) * 7979) ^ (-1128858002);
                                i12 = 1767018791;
                            }
                            break;
                        }
                        iM2762 = (i6 - C0619.m2761("ۨ᩹")) * (-99);
                        i11 = ((iM2762 ^ i7) * 27723) ^ (-1094447137);
                        i12 = -1778756059;
                        break;
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7129() {
        /*
            Method dump skipped, instruction units count: 2178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2063.m7129():void");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0266 A[PHI: r3 r5 r7 r9 r10 r16
      0x0266: PHI (r3v6 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:67:0x0264, B:50:0x01b1, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:67:0x0264, B:50:0x01b1, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r7v5 int) = (r7v2 int), (r7v4 int), (r7v2 int) binds: [B:67:0x0264, B:50:0x01b1, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v5 short[]) binds: [B:67:0x0264, B:50:0x01b1, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:67:0x0264, B:50:0x01b1, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r16v20 l.ۧܽ᩸) = (r16v7 l.ۧܽ᩸), (r16v12 l.ۧܽ᩸), (r16v21 l.ۧܽ᩸) binds: [B:67:0x0264, B:50:0x01b1, B:31:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (l.C3033.f9831 < 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m7122(l.ViewOnClickListenerC2063 r18, l.DialogInterfaceC8327 r19, java.util.ArrayList r20, int r21) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2063.m7122(l.֫ܽ᩸, l.۠ۖۧ, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0142 A[PHI: r0 r9
      0x0142: PHI (r0v4 int) = (r0v2 int), (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:51:0x0140, B:47:0x0126, B:43:0x010c, B:39:0x00ef, B:15:0x0042, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r9v9 android.text.style.StyleSpan) = 
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v6 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
     binds: [B:51:0x0140, B:47:0x0126, B:43:0x010c, B:39:0x00ef, B:15:0x0042, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x016c A[PHI: r3
      0x016c: PHI (r3v5 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:55:0x016a, B:28:0x007f, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7127(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM2761;
        int i;
        int iM12919 = 0;
        int iM6305 = 0;
        int i2 = 0;
        int i3 = 581026661;
        int i4 = C3779.f12953;
        int i5 = C1564.f5401;
        int iM3169 = C0773.m3169("ܰۨ") ^ i5;
        int i6 = ((iM3169 ^ i4) * 21873) ^ 241690011;
        int i7 = -1240026940;
        while (true) {
            int i8 = iM3169 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-15753)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2064498642:
                    case 921735033:
                        C1343.m4943();
                        iM2761 = (C0773.m3169("᩹᩺") + i5) * 99;
                        i6 = ((iM2761 ^ i4) * 17337) ^ (-1092702410);
                        i = -246176791;
                        i8 = iM2761 ^ i;
                        break;
                    case -2012424484:
                    case 1001163054:
                        if (RunnableC3055.f9898 >= 0) {
                            iM2761 = C0619.m2761("۫ܿ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-25349)) ^ (-560735140);
                            i = -1385511764;
                        } else {
                            iM2761 = C0773.m3169("֨ۨ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-21653)) ^ 388806346;
                            i = -890333098;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1708083858:
                    case 1039401199:
                        if (C4282.m13644()) {
                            iM2761 = (C0773.m3169("᩹᩺") + i5) * 99;
                            i6 = ((iM2761 ^ i4) * 17337) ^ (-1092702410);
                            i = -246176791;
                        } else {
                            iM2761 = C0619.m2761("۫ܿ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-25349)) ^ (-560735140);
                            i = -1385511764;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1496553391:
                    case 761397399:
                        iM6305 = C1826.m6305(spannableStringBuilder);
                        if (C3492.f12043 <= 0) {
                            iM2761 = (i4 - C0773.m3169("ۡܰ")) * (-119);
                            i6 = ((iM2761 ^ i5) * (-7363)) ^ 1923267763;
                            i = -1624033251;
                        } else {
                            iM2761 = C0619.m2761("ܶ۟") ^ i4;
                            i6 = ((iM2761 ^ i5) * 15691) ^ (-1121610539);
                            i = 1986947312;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -1461626804:
                    case 1772897638:
                        RunnableC3646.m11803(spannableStringBuilder, str);
                        if (C2419.f7754 < 0) {
                            styleSpan = new StyleSpan(2);
                            if (RunnableC0334.f1808 <= 0) {
                                iM2761 = C0619.m2761("۫ܿ") ^ i4;
                                i6 = ((iM2761 ^ i5) * (-25349)) ^ (-560735140);
                                i = -1385511764;
                            } else {
                                iM2761 = C0619.m2761("֨᩷") ^ i5;
                                i6 = ((iM2761 ^ i4) * (-17519)) ^ 1771589676;
                                i = -597999571;
                            }
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -1339339621:
                    case 43005450:
                        iM12919 = C3998.m12919(spannableStringBuilder);
                        if (C1783.f6087 <= 0) {
                            iM2761 = C0619.m2761("۫ܿ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-25349)) ^ (-560735140);
                            i = -1385511764;
                        } else {
                            iM2761 = (C0773.m3169("ۙ᩵") ^ i5) * 15;
                            i6 = ((iM2761 ^ i4) * (-4231)) ^ (-779678795);
                            i = -2043102803;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -931039633:
                    case -44780398:
                        if (C1826.f6190 <= 0 || RunnableC3055.f9898 >= 0) {
                        }
                        C3734.m12154(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM12919, C3998.m12919(spannableStringBuilder), i2);
                        break;
                        break;
                    case -863914801:
                    case 22755769:
                        if (C2834.f9334 <= 0) {
                            iM2761 = C0619.m2761("۬֨") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-10101)) ^ (-1390990839);
                            i = -1908535510;
                        } else {
                            iM2761 = C0619.m2761("ᩳۚ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-31739)) ^ 596036792;
                            i = 1094210138;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -478775520:
                    case 1127809725:
                        if (C23916.f77426 <= 0) {
                            iM2761 = C0619.m2761("۫ܿ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-25349)) ^ (-560735140);
                            i = -1385511764;
                        } else {
                            iM2761 = (C0619.m2761("᩵᩵") + i4) * (-45);
                            i6 = ((iM2761 ^ i5) * 8615) ^ 1870131654;
                            i = -1389147800;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -400502561:
                    case -190238043:
                        C2375.m8065();
                        if (C20932.f66974 <= 0) {
                        }
                        iM2761 = (C0773.m3169("᩹᩺") + i5) * 99;
                        i6 = ((iM2761 ^ i4) * 17337) ^ (-1092702410);
                        i = -246176791;
                        i8 = iM2761 ^ i;
                        break;
                    case 499927134:
                    case 1610012591:
                        i2 = 33;
                        C3734.m12154(spannableStringBuilder, styleSpan, iM12919, iM6305, 33);
                        if (C3734.f12817 >= 0) {
                            iM2761 = C0619.m2761("۬֨") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-10101)) ^ (-1390990839);
                            i = -1908535510;
                        } else {
                            iM2761 = C0773.m3169("ۜ֫") ^ i4;
                            i6 = ((iM2761 ^ i5) * 18533) ^ 755960655;
                            i = -518392554;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 900188002:
                    case 1900298573:
                        C2288.m7767();
                        if (C3492.f12043 > 0) {
                            iM2761 = C0619.m2761("۫ܿ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-25349)) ^ (-560735140);
                            i = -1385511764;
                        } else {
                            iM2761 = C0619.m2761("۬֨") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-10101)) ^ (-1390990839);
                            i = -1908535510;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    default:
                        C1783.m6232();
                        break;
                }
                return;
            }
            iM3169 = (C0773.m3169("۟ۚ") ^ i5) * 97;
            i6 = ((iM3169 ^ i4) * 11475) ^ 694610171;
            i7 = -377646074;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0172 A[PHI: r10 r11 r12
      0x0172: PHI (r10v3 int) = (r10v2 int), (r10v5 int) binds: [B:9:0x0061, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:9:0x0061, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:9:0x0061, B:6:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01c9 A[PHI: r5 r7 r8 r14 r15
      0x01c9: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:52:0x01c7, B:23:0x0095, B:17:0x0076, B:15:0x0072, B:12:0x006c, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:52:0x01c7, B:23:0x0095, B:17:0x0076, B:15:0x0072, B:12:0x006c, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:52:0x01c7, B:23:0x0095, B:17:0x0076, B:15:0x0072, B:12:0x006c, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:52:0x01c7, B:23:0x0095, B:17:0x0076, B:15:0x0072, B:12:0x006c, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:52:0x01c7, B:23:0x0095, B:17:0x0076, B:15:0x0072, B:12:0x006c, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01fd A[PHI: r4 r9 r21
      0x01fd: PHI (r4v3 java.lang.Object[]) = (r4v2 java.lang.Object[]), (r4v2 java.lang.Object[]), (r4v4 java.lang.Object[]) binds: [B:56:0x01fb, B:48:0x01a8, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:56:0x01fb, B:48:0x01a8, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:56:0x01fb, B:48:0x01a8, B:31:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0232 A[PHI: r1 r2 r3 r16
      0x0232: PHI (r1v4 l.ۧܽ᩸) = (r1v3 l.ۧܽ᩸), (r1v2 l.ۧܽ᩸), (r1v2 l.ۧܽ᩸) binds: [B:36:0x00fc, B:60:0x0230, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r2v4 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v2 java.lang.Integer), (r2v2 java.lang.Integer) binds: [B:36:0x00fc, B:60:0x0230, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r3v8 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:36:0x00fc, B:60:0x0230, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:36:0x00fc, B:60:0x0230, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0264  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7121(ViewOnClickListenerC2063 viewOnClickListenerC2063, int i) {
        int iM2761;
        int i2;
        int i3;
        int i4 = C2419.f7754;
        int i5 = C3099.f10023;
        int iM3169 = C0773.m3169("ܿ֫") ^ i4;
        int i6 = ((iM3169 ^ i5) * 7045) ^ 852153178;
        Integer numM3159 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM3169 ^ (-672307181);
        C11757 c11757 = null;
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1577437675;
        char c = 0;
        Object[] objArr = null;
        int i16 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * 15561) >> 31));
            switch (i15) {
                case -2102636189:
                case 518256099:
                    objArr[0] = numM3159;
                    if (RunnableC0334.m2063()) {
                        iM2761 = (C0619.m2761("ܰ֡") + i4) * 87;
                        i2 = ((iM2761 ^ i5) * 21165) ^ (-48009728);
                        i3 = 1450198174;
                    } else {
                        iM2761 = C0619.m2761("ܳᩴ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-8047)) ^ (-381537712);
                        i3 = -25444268;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -2052688781:
                case 1031594593:
                    i13 = 11667;
                    int iM2762 = C0619.m2761("᩶ܰ") ^ i4;
                    i6 = ((iM2762 ^ i5) * 11141) ^ 1963081469;
                    i7 = iM2762 ^ 1024678581;
                    break;
                case -1926903513:
                case -1924422056:
                    i9 = s + s2;
                    if (C2419.m8174() >= 0) {
                        iM2761 = (i4 - C0773.m3169("ۧ֨")) * (-71);
                        i2 = ((iM2761 ^ i5) * (-27857)) ^ 671354508;
                        i3 = 1072685414;
                    } else {
                        iM2761 = C0619.m2761("ۡ֡") ^ i4;
                        i2 = ((iM2761 ^ i5) * 30783) ^ 114019416;
                        i3 = 678087409;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -1848542983:
                case -1681271469:
                    int i17 = i11 + i12;
                    if ((i17 + i17) - i10 >= 0) {
                        iM2761 = C0619.m2761("֨֫") ^ i5;
                        i2 = ((iM2761 ^ i4) * 25295) ^ 1842196845;
                        i3 = 1472327135;
                    } else {
                        iM2761 = C0619.m2761("۠᩵") ^ i4;
                        i2 = ((iM2761 ^ i5) * 1181) ^ (-2040572985);
                        i3 = -1257517954;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -1688410377:
                case 1519965961:
                    C23916.m53425(c11757, String.format(C2878.m9486(sArr2, i14, i8, i13), objArr));
                    break;
                case -1660802384:
                case -86473322:
                    c = '$';
                    if (C3077.f9998) {
                        iM2761 = (i4 - C0619.m2761("ۡ᩸")) * (-87);
                        i2 = ((iM2761 ^ i5) * 18029) ^ (-1927925663);
                        i3 = 1357992443;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۧ֨")) * (-71);
                        i2 = ((iM2761 ^ i5) * (-27857)) ^ 671354508;
                        i3 = 1072685414;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -1395686248:
                case -814751568:
                    s = sArr[c];
                    s2 = 9041;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ᩴ᩺") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-907)) ^ 248075862;
                        i3 = 2094257116;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۢ᩺")) * (-89);
                        i2 = ((iM2761 ^ i4) * (-15907)) ^ 240785815;
                        i3 = -966819675;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -1304204846:
                case 1980561535:
                    sArr2 = f6861;
                    i14 = 37;
                    i8 = 5;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ᩴ᩺") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-907)) ^ 248075862;
                        i3 = 2094257116;
                    } else {
                        iM2761 = (C0619.m2761("ۧܰ") + i5) * (-87);
                        i2 = ((iM2761 ^ i4) * (-32595)) ^ (-448748745);
                        i3 = 1625118064;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -1251499963:
                case 1169658358:
                    c11757 = viewOnClickListenerC2063.f6862;
                    numM3159 = C0773.m3159(i);
                    if (C3734.f12817 >= 0) {
                        i16 = 1;
                        iM2761 = (C0773.m3169("֫ۘ") + i5) * (-63);
                        i2 = ((iM2761 ^ i4) * (-7651)) ^ (-1778968280);
                        i3 = 677870562;
                        i7 = iM2761 ^ i3;
                        i6 = i2;
                    } else {
                        int iM31610 = C0773.m3169("ۖۗ") ^ i5;
                        i6 = ((iM31610 ^ i4) * (-21661)) ^ (-1990231034);
                        i7 = iM31610 ^ 292829757;
                        i16 = 1;
                    }
                    break;
                case -857633002:
                case 261333594:
                    i13 = 14764;
                    int iM2763 = C0619.m2761("᩶ܰ") ^ i4;
                    i6 = ((iM2763 ^ i5) * 11141) ^ 1963081469;
                    i7 = iM2763 ^ 1024678581;
                    break;
                case -703647414:
                case -437128922:
                    C3033.m9845();
                    if (C2354.m7983()) {
                        iM2761 = (C0773.m3169("֫ۘ") + i5) * (-63);
                        i2 = ((iM2761 ^ i4) * (-7651)) ^ (-1778968280);
                        i3 = 677870562;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩺") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-907)) ^ 248075862;
                        i3 = 2094257116;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -444498948:
                case 930098387:
                    C1343.m4943();
                    iM2761 = C0619.m2761("ᩴ᩺") ^ i4;
                    i2 = ((iM2761 ^ i5) * (-907)) ^ 248075862;
                    i3 = 2094257116;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -227324660:
                case 1795168177:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ᩴ᩺") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-907)) ^ 248075862;
                        i3 = 2094257116;
                    } else {
                        iM2761 = (C0619.m2761("ܰ֡") + i4) * 87;
                        i2 = ((iM2761 ^ i5) * 21165) ^ (-48009728);
                        i3 = 1450198174;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case -190358320:
                case 2111019668:
                    C2966.m9664();
                    C13473.m33144();
                    break;
                case 417979655:
                case 1997404898:
                    C3033.m9845();
                    if (C2834.f9334 > 0) {
                        iM2761 = C0619.m2761("ᩴ᩺") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-907)) ^ 248075862;
                        i3 = 2094257116;
                    } else {
                        iM2761 = (C0773.m3169("᩵ܰ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM2761 ^ i4) * 21247) ^ 692664137;
                        i3 = 671283483;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case 718546747:
                case 1227233914:
                    objArr = new Object[i16];
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۧ֨")) * (-71);
                        i2 = ((iM2761 ^ i5) * (-27857)) ^ 671354508;
                        i3 = 1072685414;
                    } else {
                        iM2761 = C0619.m2761("ܺᩳ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 25127) ^ (-1249843629);
                        i3 = 1186067740;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case 1330720463:
                case 1603948501:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0619.m2761("ܰ֡") + i4) * 87;
                        i2 = ((iM2761 ^ i5) * 21165) ^ (-48009728);
                        i3 = 1450198174;
                    } else {
                        iM2761 = (C0619.m2761("ۡ۟") + i5) * 55;
                        i2 = ((iM2761 ^ i4) * 26369) ^ 1677529327;
                        i3 = -1845780205;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                case 1811463215:
                case 2135407222:
                    sArr = f6861;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("֫ۘ") + i5) * (-63);
                        i2 = ((iM2761 ^ i4) * (-7651)) ^ (-1778968280);
                        i3 = 677870562;
                    } else {
                        iM2761 = (C0619.m2761("ܶۡ") ^ i4) * (-105);
                        i2 = ((iM2761 ^ i5) * 13219) ^ (-380693739);
                        i3 = -34070239;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
                default:
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 81739681;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("᩵ܰ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM2761 ^ i4) * 21247) ^ 692664137;
                        i3 = 671283483;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۗ֫")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM2761 ^ i4) * 6089) ^ 1599674374;
                        i3 = 1905943189;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7130(String str) {
        C11757 c11757 = null;
        int i = 0;
        boolean z = false;
        int i2 = 2088894735;
        int i3 = C3779.f12953;
        int i4 = C2834.f9334;
        int iM3169 = C0773.m3169("ۢۛ") ^ i4;
        int i5 = ((iM3169 ^ i3) * (-10529)) ^ (-552664537);
        int i6 = 672167935;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27743)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2040340368:
                case 1733893654:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10743) ^ 40140635;
                        i6 = -547713904;
                    } else {
                        iM3169 = C0619.m2761("᩹ۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-19287)) ^ 1422351252;
                        i6 = -801237033;
                    }
                    break;
                case -1986184761:
                case 996998622:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10743) ^ 40140635;
                        i6 = -547713904;
                    } else {
                        iM3169 = (C0619.m2761("ܺۨ") ^ i4) * 19;
                        i5 = ((iM3169 ^ i3) * 17843) ^ 450533445;
                        i6 = -2126433121;
                    }
                    break;
                case -1742834732:
                case 1648760607:
                    c11757 = this.f6862;
                    if (C1783.m6232()) {
                        iM3169 = (i3 - C0773.m3169("ۧᩳ")) * 63;
                        i5 = ((iM3169 ^ i4) * 15841) ^ (-1307950815);
                        i6 = -1752541728;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۬᩸")) * (-101);
                        i5 = ((iM3169 ^ i3) * 9915) ^ 232862946;
                        i6 = 1372072843;
                    }
                    break;
                case -1725259307:
                case 1543380302:
                    if (!C2878.f9462) {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10743) ^ 40140635;
                        i6 = -547713904;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۬᩸")) * (-101);
                        i5 = ((iM3169 ^ i3) * 9915) ^ 232862946;
                        i6 = 1372072843;
                    }
                    break;
                case -1608733423:
                case -1554512658:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("᩷ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2489)) ^ 1728894819;
                        i6 = 518984891;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15093)) ^ (-983169286);
                        i6 = 755977498;
                    }
                    break;
                case -1471842416:
                case 893905223:
                    C2354.m7978(c11757, str);
                    z = true;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("᩷ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2489)) ^ 1728894819;
                        i6 = 518984891;
                    } else {
                        iM3169 = C0773.m3169("᩵ۖ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15853)) ^ 1786871336;
                        i6 = -1104153453;
                    }
                    break;
                case -1412916138:
                case -1065451823:
                    i = 0;
                    c11757.m29524(false);
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("ۚ᩹") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10829) ^ (-168838722);
                        i6 = 1919330983;
                    } else {
                        iM3169 = (C0619.m2761("֡ܺ") ^ i4) * (-103);
                        i5 = ((iM3169 ^ i3) * 21429) ^ (-257089164);
                        i6 = 753351814;
                    }
                    break;
                case -1258919782:
                case 1564918860:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۖ۠") + i4) * 81;
                        i5 = ((iM3169 ^ i3) * 17685) ^ 1982392931;
                        i6 = -960268857;
                    } else {
                        iM3169 = (C0773.m3169("֨֫") + i3) * 59;
                        i5 = ((iM3169 ^ i4) * (-23185)) ^ (-1065602492);
                        i6 = -1389708547;
                    }
                    break;
                case -1147148566:
                case 747433646:
                    c11757.setSelection(i, c11757.length());
                    break;
                case -959050910:
                case -799754883:
                    C2354.m7983();
                    break;
                case -464748709:
                case -106596964:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10743) ^ 40140635;
                        i6 = -547713904;
                    } else {
                        iM3169 = (C0619.m2761("ܶۤ") ^ i4) * (-63);
                        i5 = ((iM3169 ^ i3) * 17485) ^ (-1737173058);
                        i6 = -939389788;
                    }
                    break;
                case -377326297:
                case 1441736891:
                    C0862.m3503();
                    if (!C4282.m13644()) {
                        iM3169 = (C0773.m3169("ۖ۠") + i4) * 81;
                        i5 = ((iM3169 ^ i3) * 17685) ^ 1982392931;
                        i6 = -960268857;
                    } else {
                        iM3169 = C0773.m3169("᩷ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2489)) ^ 1728894819;
                        i6 = 518984891;
                    }
                    break;
                case -155054266:
                case 1092904407:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i4 - C0773.m3169("۬᩸")) * (-101);
                        i5 = ((iM3169 ^ i3) * 9915) ^ 232862946;
                        i6 = 1372072843;
                    } else {
                        iM3169 = C0773.m3169("᩷ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2489)) ^ 1728894819;
                        i6 = 518984891;
                    }
                    break;
                case -112955132:
                case 1664096517:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10743) ^ 40140635;
                        i6 = -547713904;
                    } else {
                        iM3169 = C0619.m2761("ܺܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 27155) ^ 858431090;
                        i6 = -1967080735;
                    }
                    break;
                case 409572232:
                case 930379307:
                    C3448.m11248();
                    RunnableC0334.m2063();
                    iM3169 = (C0773.m3169("ۖ۠") + i4) * 81;
                    i5 = ((iM3169 ^ i3) * 17685) ^ 1982392931;
                    i6 = -960268857;
                    break;
                default:
                    c11757.m29524(z);
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩷ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-2489)) ^ 1728894819;
                        i6 = 518984891;
                    } else {
                        iM3169 = C0773.m3169("᩷ۢ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-29137)) ^ 1807320711;
                        i6 = 85429459;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[PHI: r2
      0x0063: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:24:0x0061, B:13:0x003f, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x0162 A[PHI: r0
      0x0162: PHI (r0v4 int) = (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int) binds: [B:52:0x0160, B:35:0x00bc, B:16:0x0045, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0191 A[PHI: r8
      0x0191: PHI (r8v8 android.text.style.StyleSpan) = 
      (r8v4 android.text.style.StyleSpan)
      (r8v4 android.text.style.StyleSpan)
      (r8v7 android.text.style.StyleSpan)
      (r8v4 android.text.style.StyleSpan)
      (r8v4 android.text.style.StyleSpan)
     binds: [B:56:0x018f, B:39:0x00d8, B:31:0x009e, B:10:0x0035, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7118(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM3169;
        int i;
        int iM6305 = 0;
        int iM12919 = 0;
        int i2 = 994756844;
        int i3 = C3033.f9831;
        int i4 = RunnableC0334.f1808;
        int iM2761 = (C0619.m2761("۫֨") + i3) * (-19);
        int i5 = ((iM2761 ^ i4) * (-1957)) ^ (-540780843);
        int i6 = -710688529;
        while (true) {
            int i7 = iM2761 ^ i6;
            StyleSpan styleSpan = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-1203)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2119020708:
                    case 701390691:
                        if (C3779.f12953 > 0) {
                            iM3169 = C0619.m2761("ۗۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1055) ^ 678152743;
                            i = 679032606;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -2117139989:
                    case -320415312:
                        if (C3077.f9998) {
                            iM3169 = C0773.m3169("ᩳۜ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 24443) ^ 1257517979;
                            i = -1274115238;
                        } else {
                            iM3169 = (C0773.m3169("᩸ܽ") + i3) * 37;
                            i5 = ((iM3169 ^ i4) * 24039) ^ 1577543753;
                            i = -188889548;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1968243065:
                    case 1275287335:
                        if (C11235.f35427 >= 0) {
                            iM3169 = (C0773.m3169("᩸ܽ") + i3) * 37;
                            i5 = ((iM3169 ^ i4) * 24039) ^ 1577543753;
                            i = -188889548;
                        } else {
                            iM3169 = (C0773.m3169("ᩴۗ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-10461)) ^ 1054895277;
                            i = 1016077533;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1683970826:
                    case -946310159:
                        C3734.m12154(spannableStringBuilder, styleSpan, iM6305, iM12919, 33);
                        break;
                    case -1592881413:
                    case -1368530456:
                        C2310.m7813();
                        if (RunnableC3055.f9898 >= 0) {
                            iM3169 = C0773.m3169("۠᩵") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-15565)) ^ 405953648;
                            i = 1701982904;
                        } else {
                            iM3169 = C0773.m3169("᩻᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * 30341) ^ (-605072095);
                            i = 1129107217;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1365159546:
                    case -593284218:
                        iM6305 = C1826.m6305(spannableStringBuilder);
                        if (AbstractC0116.f1064 <= 0) {
                            iM3169 = (C0773.m3169("ᩴۗ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-10461)) ^ 1054895277;
                            i = 1016077533;
                        } else {
                            iM3169 = C0773.m3169("ۜܽ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-21291)) ^ 805773797;
                            i = 1249142455;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1152981902:
                    case -56493061:
                        C1564.m5509();
                        iM3169 = (C0773.m3169("᩸ܽ") + i3) * 37;
                        i5 = ((iM3169 ^ i4) * 24039) ^ 1577543753;
                        i = -188889548;
                        i7 = iM3169 ^ i;
                        break;
                    case -1113934836:
                    case -625665790:
                        iM12919 = C3998.m12919(spannableStringBuilder);
                        if (AbstractC0116.f1064 <= 0) {
                            iM3169 = C0773.m3169("۠᩵") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-15565)) ^ 405953648;
                            i = 1701982904;
                        } else {
                            iM3169 = (C0619.m2761("ۙۚ") + i4) * (-45);
                            i5 = ((iM3169 ^ i3) * 25341) ^ 1670358165;
                            i = 381228070;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -415578924:
                    case 1811744445:
                        if (C1783.f6087 <= 0) {
                            iM3169 = C0773.m3169("᩻᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * 30341) ^ (-605072095);
                            i = 1129107217;
                        } else {
                            iM3169 = (C0773.m3169("ܽۙ") ^ i3) * 29;
                            i5 = ((iM3169 ^ i4) * (-32297)) ^ 1369627954;
                            i = 1513730489;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -185388792:
                    case 2084663004:
                        if (C2966.m9664()) {
                            iM3169 = C0773.m3169("ۧۚ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-11685)) ^ (-1528789582);
                            i = 1098755839;
                        } else {
                            iM3169 = C0773.m3169("᩻᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * 30341) ^ (-605072095);
                            i = 1129107217;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1047253674:
                    case 1609895231:
                        C0269.m1775();
                        C1146.m4231();
                        break;
                    case 1499478098:
                    case 1983640903:
                        if (C2878.f9462) {
                            iM3169 = (C0773.m3169("ᩴۗ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-10461)) ^ 1054895277;
                            i = 1016077533;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩷᩶")) * 53;
                            i5 = ((iM3169 ^ i3) * 28177) ^ (-72895263);
                            i = -856247040;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1519316154:
                    case 1995472515:
                        C2375.m8065();
                        if (C2702.m8876()) {
                            iM3169 = (C0773.m3169("ᩴۗ") + i4) * 75;
                            i5 = ((iM3169 ^ i3) * (-10461)) ^ 1054895277;
                            i = 1016077533;
                        } else {
                            iM3169 = C0773.m3169("۠᩵") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-15565)) ^ 405953648;
                            i = 1701982904;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 2039314856:
                    case 2144027545:
                        RunnableC3646.m11803(spannableStringBuilder, str);
                        if (!C2878.f9462) {
                            styleSpan = new StyleSpan(1);
                            if (C3998.f13671 != 0) {
                                iM3169 = C0773.m3169("᩻᩸") ^ i4;
                                i5 = ((iM3169 ^ i3) * 30341) ^ (-605072095);
                                i = 1129107217;
                            } else {
                                iM3169 = C0773.m3169("᩻ܽ") ^ i3;
                                i5 = ((iM3169 ^ i4) * 8811) ^ 1128676259;
                                i = 1380297604;
                            }
                            i7 = iM3169 ^ i;
                        }
                        break;
                    default:
                        if (C3099.f10023 <= 0) {
                            iM3169 = C0773.m3169("᩻᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * 30341) ^ (-605072095);
                            i = 1129107217;
                        } else {
                            iM3169 = (C0773.m3169("ᩳۡ") ^ i4) * 87;
                            i5 = ((iM3169 ^ i3) * (-28299)) ^ (-571911051);
                            i = 1063776907;
                        }
                        i7 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM2761 = C0773.m3169("ܿۗ") ^ i3;
            i5 = ((iM2761 ^ i4) * (-31273)) ^ (-1291145144);
            i6 = 1322404393;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[PHI: r2
      0x00b9: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:36:0x00b7, B:21:0x0056, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0102 A[PHI: r0
      0x0102: PHI (r0v4 int) = (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int) binds: [B:44:0x0100, B:32:0x009e, B:14:0x0040, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m7128(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM3169;
        int i;
        int iM6305 = 0;
        int iM6306 = 0;
        int i2 = -1369225870;
        int i3 = C3779.f12953;
        int i4 = C1321.f4751;
        int iM2761 = (C0619.m2761("ۤۜ") + i4) * (-19);
        int i5 = ((iM2761 ^ i3) * 5587) ^ 1743507402;
        int i6 = 1319488980;
        while (true) {
            int i7 = iM2761 ^ i6;
            RelativeSizeSpan relativeSizeSpan = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 3063) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2118254225:
                    case -932422556:
                        iM6306 = C1826.m6305(spannableStringBuilder);
                        if (AbstractC0116.m1243() != 0) {
                            iM3169 = C0773.m3169("᩵ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 24745) ^ 1760311732;
                            i = 591296445;
                        } else {
                            iM3169 = C0619.m2761("ۧۤ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-12139)) ^ 202827816;
                            i = -1628070089;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2110726770:
                    case 1042878086:
                        if (C2834.m9344() >= 0) {
                            iM3169 = (i3 - C0619.m2761("ܺۧ")) * 97;
                            i5 = ((iM3169 ^ i4) * 6859) ^ 1539172896;
                            i = 420425875;
                        } else {
                            iM3169 = (C0773.m3169("֨᩶") + i4) * (-57);
                            i5 = ((iM3169 ^ i3) * 24003) ^ 2101302980;
                            i = 1899137594;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1761885051:
                    case 1989484570:
                        if (C2702.f8586 <= 0) {
                            iM3169 = C0773.m3169("᩵ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 24745) ^ 1760311732;
                            i = 591296445;
                        } else {
                            iM3169 = C0619.m2761("᩸ۘ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-32389)) ^ 299120191;
                            i = -653323544;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1392946897:
                    case -854598535:
                        if (C1080.f3865 >= 0) {
                            iM3169 = C0773.m3169("᩸۟") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-10805)) ^ (-1845767266);
                            i = 1871857279;
                        } else {
                            iM3169 = (i3 - C0619.m2761("ܺۧ")) * 97;
                            i5 = ((iM3169 ^ i4) * 6859) ^ 1539172896;
                            i = 420425875;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1304847198:
                    case 178591108:
                        C2375.m8065();
                        if (C4282.f15546 > 0) {
                            iM3169 = C0773.m3169("᩸۟") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-10805)) ^ (-1845767266);
                            i = 1871857279;
                        } else {
                            iM3169 = C0773.m3169("᩶ᩴ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 26977) ^ 85190519;
                            i = 516676520;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1240312181:
                    case 398668464:
                        if (C1519.f5300 < 0) {
                            iM3169 = (C0619.m2761("ۡ֨") + i4) * 67;
                            i5 = ((iM3169 ^ i3) * 1633) ^ 48895254;
                            i = 1088367492;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -622531550:
                    case 1052282276:
                        if (C3099.f10023 <= 0) {
                            iM3169 = C0773.m3169("᩶ᩴ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 26977) ^ 85190519;
                            i = 516676520;
                        } else {
                            iM3169 = C0773.m3169("ۤ᩷") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-27211)) ^ 1438889342;
                            i = 397518755;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -613581510:
                    case 88823708:
                        if (C0862.f3233 != 0) {
                            iM3169 = C0773.m3169("᩶ᩴ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 26977) ^ 85190519;
                            i = 516676520;
                        } else {
                            iM3169 = C0773.m3169("᩵ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 24745) ^ 1760311732;
                            i = 591296445;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -342035735:
                    case 1200775895:
                        if (C2354.f7599 >= 0) {
                            iM3169 = (i3 - C0619.m2761("ܺۧ")) * 97;
                            i5 = ((iM3169 ^ i4) * 6859) ^ 1539172896;
                            i = 420425875;
                        } else {
                            iM3169 = (C0773.m3169("ܰᩳ") + i3) * 69;
                            i5 = ((iM3169 ^ i4) * 10689) ^ 1885031517;
                            i = 563087405;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -332218077:
                    case 1416990202:
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("᩸۟") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-10805)) ^ (-1845767266);
                            i = 1871857279;
                        } else {
                            iM3169 = (C0773.m3169("ܿܳ") + i4) * (-23);
                            i5 = ((iM3169 ^ i3) * 15313) ^ 1776227231;
                            i = -474749682;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -258707266:
                    case 984799006:
                        iM6305 = C1826.m6305(spannableStringBuilder);
                        if (C1542.f5343 <= 0) {
                            iM3169 = C0773.m3169("᩶ᩴ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 26977) ^ 85190519;
                            i = 516676520;
                        } else {
                            iM3169 = C0619.m2761("ܰ᩵") ^ i4;
                            i5 = ((iM3169 ^ i3) * 24621) ^ 360259850;
                            i = -1118473698;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 281150974:
                    case 1175004206:
                        C1564.m5509();
                        break;
                    case 466441248:
                    case 1544364354:
                        RunnableC3646.m11803(spannableStringBuilder, str);
                        if (!C3077.f9998) {
                        }
                        relativeSizeSpan = new RelativeSizeSpan(0.8f);
                        if (C2834.f9334 > 0) {
                            iM3169 = C0773.m3169("᩹۠") ^ i3;
                            i5 = ((iM3169 ^ i4) * 21115) ^ (-1606108923);
                            i = -503890219;
                            i7 = iM3169 ^ i;
                        }
                        break;
                        break;
                        break;
                    case 507691369:
                    case 946707601:
                        C17202.m40381(spannableStringBuilder, relativeSizeSpan, iM6305, iM6306, 33);
                        break;
                    default:
                        RunnableC3055.m9933();
                        iM3169 = C0773.m3169("᩸۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-10805)) ^ (-1845767266);
                        i = 1871857279;
                        i7 = iM3169 ^ i;
                        break;
                }
                return;
            }
            iM2761 = C0773.m3169("ۤ֨") ^ i4;
            i5 = ((iM2761 ^ i3) * (-27423)) ^ (-370707009);
            i6 = 174150928;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 107961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r70) {
        /*
            Method dump skipped, instruction units count: 10796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2063.onClick(android.view.View):void");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[PHI: r3
      0x0075: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:27:0x0073, B:13:0x003f, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147 A[PHI: r9
      0x0147: PHI (r9v9 android.text.style.StyleSpan) = 
      (r9v4 android.text.style.StyleSpan)
      (r9v5 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
     binds: [B:50:0x0145, B:38:0x00e0, B:18:0x004c, B:16:0x0048, B:7:0x002f, B:22:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m7124(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM2761;
        int i;
        int iM6305 = 0;
        int iM6306 = 0;
        int i2 = 0;
        int i3 = -676331832;
        int i4 = C20932.f66974;
        int i5 = C2834.f9334;
        int iM2762 = (C0619.m2761("֡ۙ") ^ i4) * 73;
        int i6 = ((iM2762 ^ i5) * (-7589)) ^ (-799288531);
        int i7 = -1382601645;
        while (true) {
            int i8 = iM2762 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 9189) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2140446153:
                    case -299860065:
                        AbstractC0641.m2813();
                        C2310.m7813();
                        iM2761 = C0773.m3169("ۚۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21495)) ^ (-757294592);
                        i = -40246620;
                        i8 = iM2761 ^ i;
                        break;
                    case -2111873263:
                    case 1164821268:
                        C1146.m4231();
                        if (C2485.m8357() <= 0) {
                            iM2761 = C0619.m2761("ܳ᩻") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-9663)) ^ (-1363809842);
                            i = -614672465;
                        } else {
                            iM2761 = C0773.m3169("ۖᩴ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 30133) ^ (-262786250);
                            i = -1560803572;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -2009849385:
                    case -1413026010:
                        if (C0862.f3233 == 0) {
                        }
                        iM2761 = C0619.m2761("ܳ᩻") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-9663)) ^ (-1363809842);
                        i = -614672465;
                        i8 = iM2761 ^ i;
                        break;
                    case -1713846186:
                    case -1272235060:
                        if (C4238.f15451 < 0) {
                            iM2761 = C0619.m2761("֫ۜ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 20475) ^ (-112322791);
                            i = 1964999916;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -1472416953:
                    case -984570707:
                        C1146.m4232(spannableStringBuilder, str);
                        if (RunnableC0334.f1808 > 0) {
                            styleSpan = new StyleSpan(1);
                            if (C1826.f6190 <= 0) {
                                iM2761 = C0773.m3169("ۚۘ") ^ i5;
                                i6 = ((iM2761 ^ i4) * (-21495)) ^ (-757294592);
                                i = -40246620;
                            } else {
                                iM2761 = (i4 - C0773.m3169("ۗ۬")) * 17;
                                i6 = ((iM2761 ^ i5) * (-28435)) ^ (-482289485);
                                i = -1450253689;
                            }
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -1442039439:
                    case -242162046:
                        RunnableC3055.m9933();
                        if (C0269.f1558 > 0) {
                        }
                        iM2761 = C0773.m3169("ۚۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21495)) ^ (-757294592);
                        i = -40246620;
                        i8 = iM2761 ^ i;
                        break;
                    case -1294955446:
                    case -686052471:
                        C23916.m53419();
                        break;
                    case -196215766:
                    case 1526819491:
                        if (C1542.m5459() >= 0) {
                            iM2761 = C0773.m3169("ۖᩴ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 30133) ^ (-262786250);
                            i = -1560803572;
                        } else {
                            iM2761 = C0773.m3169("᩹ۢ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-5811)) ^ (-837693520);
                            i = -1335505764;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -13679931:
                    case 1211826521:
                        iM6305 = C1826.m6305(spannableStringBuilder);
                        if (!RunnableC1848.f6235) {
                            iM2761 = C0619.m2761("ܿᩴ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-17085)) ^ (-224168662);
                            i = -2098167593;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case 356798315:
                    case 1088784409:
                        i2 = 33;
                        C17202.m40381(spannableStringBuilder, styleSpan, iM6305, iM6306, 33);
                        if (RunnableC0334.f1808 <= 0) {
                            iM2761 = C0619.m2761("ܳ᩻") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-9663)) ^ (-1363809842);
                            i = -614672465;
                        } else {
                            iM2761 = C0773.m3169("᩶᩷") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-4965)) ^ 1512336315;
                            i = -456263411;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 1607727864:
                    case 1921886413:
                        if (C13473.f42873 != 0) {
                            iM2761 = C0773.m3169("ۚۘ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-21495)) ^ (-757294592);
                            i = -40246620;
                        } else {
                            iM2761 = C0773.m3169("ܳ֫") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-25929)) ^ (-132250814);
                            i = -1157321438;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 2009157348:
                    case 2114200599:
                        iM6306 = C1826.m6305(spannableStringBuilder);
                        if (C1542.f5343 <= 0) {
                            iM2761 = C0773.m3169("ۛۛ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-6559)) ^ 598737936;
                            i = -849989215;
                        } else {
                            iM2761 = (C0619.m2761("֨۫") ^ i5) * 49;
                            i6 = ((iM2761 ^ i4) * 9289) ^ 309076260;
                            i = 1813784378;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    default:
                        if (C17202.f56030 && C3099.f10023 > 0) {
                            C3734.m12154(spannableStringBuilder, new RelativeSizeSpan(1.1f), iM6305, C1826.m6305(spannableStringBuilder), i2);
                        }
                        iM2761 = C0773.m3169("ۚۘ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-21495)) ^ (-757294592);
                        i = -40246620;
                        i8 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM2762 = C0619.m2761("᩺ۤ") ^ i5;
            i6 = ((iM2762 ^ i4) * (-25459)) ^ 426927067;
            i7 = -1586826779;
        }
    }
}
