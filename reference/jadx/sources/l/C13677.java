package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plugin.api.LocalString;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B50D */
/* JADX INFO: loaded from: classes4.dex */
public final class C13677 {

    /* JADX INFO: renamed from: ۙۧ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f43414 = {3053, 24410, 24407, 24408, 24401, 24387, 24407, 24401, 24403, 24425, 24414, 24415, 24402, 24402, 24403, 24408, 24425, 24408, 24403, 24385, 24426, 24394, 2361, 3466, -9360, 16287, 9445, 3784, 15687, -16131, -11019, 11370, -10754, 2061, 12312, 15741, 10509, 12578, 12381, -13170, 2664, 23982, 23994, 23995, 23968};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33453(AbstractActivityC17204 abstractActivityC17204, final Runnable runnable) {
        C17159 c17159;
        Object obj;
        View view;
        int i;
        short[] sArr;
        ListView listView;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int i7;
        C17159 c171510;
        int i8;
        View view2;
        int i9;
        short[] sArr2;
        int iM2761;
        int i10;
        int i11;
        int i12;
        int iM2762;
        int i13;
        Object obj2;
        C17159 c171511;
        int i14;
        View viewM9942;
        int iM2763;
        int i15;
        int i16;
        int i17;
        View view3;
        int i18;
        short[] sArr3;
        View view4;
        int i19;
        int i20;
        int i21;
        int iM2764;
        int i22;
        int iM2765;
        int i23;
        abstractActivityC17204 = abstractActivityC17204;
        int i24 = C3779.f12953;
        int i25 = AbstractC0641.f2496;
        int iM2766 = C0619.m2761("ۙᩳ") ^ i24;
        int i26 = ((iM2766 ^ i25) * 29203) ^ (-2103536163);
        View view5 = null;
        ListView listView2 = null;
        TextView textView = null;
        final ArrayList arrayList = null;
        C6966 c6966 = null;
        short[] sArr4 = null;
        int i27 = iM2766 ^ 1280758400;
        int i28 = 0;
        int iM2767 = 0;
        int iM31611 = 0;
        int iM31612 = 0;
        int iM2768 = 0;
        short s = 0;
        int i29 = 0;
        int iM2769 = 0;
        int i30 = 0;
        int i31 = 768159598;
        Object obj3 = null;
        C17159 c171512 = null;
        String str = null;
        short[] sArr5 = null;
        int i32 = 0;
        int i33 = 0;
        C2361 c2361 = null;
        final C14867 c14867 = null;
        Iterator it = null;
        HashSet hashSet = null;
        boolean z = false;
        while (true) {
            i31 = i27 ^ (i26 & (((i31 ^ i25) * (-11229)) >> 31));
            switch (i31) {
                case -2025290442:
                case 781212869:
                    obj3 = obj3;
                    c171512 = c171512;
                    view5 = view5;
                    i32 = i32;
                    int i34 = i33;
                    sArr4 = sArr4;
                    listView2 = listView2;
                    i30 = i30;
                    i9 = i34;
                    iM2769 = C0619.m2761(C3077.m10047(f43414, 23, 3, i28)) ^ 2117273275;
                    if (C2419.m8174() >= 0) {
                        iM2762 = (C0773.m3169("۟᩶") + i24) * (-11);
                        i26 = ((iM2762 ^ i25) * 19009) ^ (-1380152488);
                        i13 = 1531496301;
                    } else {
                        iM2762 = C0619.m2761("᩶ۗ") ^ i25;
                        i26 = ((iM2762 ^ i24) * 31763) ^ 1447795160;
                        i13 = 88031987;
                    }
                    i12 = iM2762 ^ i13;
                    c171512 = c171512;
                    i32 = i32;
                    obj3 = obj3;
                    view5 = view5;
                    i27 = i12;
                    int i35 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i35;
                    break;
                case -2024987641:
                case -1880495072:
                    i32 = i32;
                    obj2 = obj3;
                    c171511 = c171512;
                    i14 = iM2769;
                    int i36 = i33;
                    sArr4 = sArr4;
                    listView2 = listView2;
                    i30 = i30;
                    i9 = i36;
                    viewM9942 = RunnableC3055.m9942(abstractActivityC17204, i14);
                    iM2767 = C0619.m2761(AbstractC0641.m2820(f43414, 26, 3, i28));
                    if (C2485.f7950 != 0) {
                        iM2763 = (i24 - C0619.m2761("ۜ᩹")) * (-21);
                        i15 = ((iM2763 ^ i25) * (-29581)) ^ 1934923748;
                        i16 = -410791488;
                    } else {
                        iM2763 = C0619.m2761("֨᩷") ^ i24;
                        i15 = ((iM2763 ^ i25) * 6975) ^ (-751655929);
                        i16 = 1241265406;
                    }
                    int i37 = iM2763 ^ i16;
                    iM2769 = i14;
                    i26 = i15;
                    c171512 = c171511;
                    i32 = i32;
                    obj3 = obj2;
                    i27 = i37;
                    view5 = viewM9942;
                    int i38 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i38;
                    break;
                case -2012530185:
                case 1692868636:
                    C1519.m5406(arrayList, c6966);
                    c17159 = c171512;
                    iM2764 = C0619.m2761("ᩳܺ") ^ i24;
                    i19 = ((iM2764 ^ i25) * (-1445)) ^ 332454890;
                    i22 = 915462145;
                    i20 = iM2764 ^ i22;
                    listView2 = listView2;
                    c171512 = c17159;
                    i27 = i20;
                    i32 = i32;
                    view5 = view5;
                    i26 = i19;
                    obj3 = obj3;
                    break;
                case -1973337279:
                case 120748914:
                    obj3 = obj3;
                    listView2 = listView2;
                    view5 = view5;
                    C17159 c171513 = (C17159) C5448.m16285();
                    TreeSet treeSet = new TreeSet(c171513.keySet());
                    arrayList = new ArrayList(treeSet.size() - 1);
                    HashSet hashSetM33452 = m33452();
                    c17159 = c171513;
                    it = treeSet.iterator();
                    hashSet = hashSetM33452;
                    z = true;
                    iM2764 = C0619.m2761("ᩳܺ") ^ i24;
                    i19 = ((iM2764 ^ i25) * (-1445)) ^ 332454890;
                    i22 = 915462145;
                    i20 = iM2764 ^ i22;
                    listView2 = listView2;
                    c171512 = c17159;
                    i27 = i20;
                    i32 = i32;
                    view5 = view5;
                    i26 = i19;
                    obj3 = obj3;
                    break;
                case -1685888436:
                case 659882923:
                    c6966 = new C6966(0);
                    c6966.f22995 = str;
                    c6966.f22994 = c171512.getOrDefault(str, str);
                    if (C20932.m47847(hashSet, str)) {
                        iM2765 = (C0619.m2761("ۤܽ") + i24) * (-71);
                        i4 = ((iM2765 ^ i25) * 14451) ^ 108975072;
                        i23 = 565904105;
                    } else {
                        iM2765 = C0619.m2761("ۡۙ") ^ i25;
                        i4 = ((iM2765 ^ i24) * 14615) ^ 943810095;
                        i23 = -298685962;
                    }
                    i27 = iM2765 ^ i23;
                    i26 = i4;
                    break;
                case -1684416336:
                case -1326442853:
                    c17159 = c171512;
                    iM2768 = C0619.m2761(C2354.m7980(sArr5, i32, 3, i28));
                    if (C0950.f3488 < 0) {
                        iM3169 = C0773.m3169("ۨۢ") ^ i25;
                        i4 = ((iM3169 ^ i24) * 19335) ^ (-219251668);
                        i5 = -1537665047;
                        int i39 = iM3169 ^ i5;
                        c171512 = c17159;
                        i27 = i39;
                        i26 = i4;
                    } else {
                        obj = obj3;
                        view = view5;
                        i = i32;
                        int i40 = i33;
                        sArr = sArr4;
                        listView = listView2;
                        i2 = i30;
                        i3 = i40;
                        iM31610 = (i25 - C0773.m3169("ܶ۠")) * 53;
                        i6 = ((iM31610 ^ i24) * 14645) ^ (-2045286324);
                        i7 = -1664457897;
                        int i41 = iM31610 ^ i7;
                        c171512 = c17159;
                        obj3 = obj;
                        i27 = i41;
                        int i42 = i;
                        view5 = view;
                        i26 = i6;
                        i32 = i42;
                        int i43 = i2;
                        listView2 = listView;
                        sArr4 = sArr;
                        i33 = i3;
                        i30 = i43;
                    }
                    break;
                case -1622844533:
                case 1708025100:
                    obj3 = obj3;
                    c171510 = c171512;
                    i8 = iM2769;
                    view2 = view5;
                    i32 = i32;
                    int i44 = i33;
                    sArr4 = sArr4;
                    listView2 = listView2;
                    i30 = i30;
                    i9 = i44;
                    short s2 = f43414[22];
                    int i45 = s2 + 13504;
                    if (!C2023.f6737) {
                        int iM31613 = C0773.m3169("ۛۙ") ^ i25;
                        s = s2;
                        iM2769 = i8;
                        i29 = i45;
                        i26 = ((iM31613 ^ i24) * 31885) ^ 541632150;
                        c171512 = c171510;
                        obj3 = obj3;
                        i27 = iM31613 ^ (-429910024);
                        i32 = i32;
                        view5 = view2;
                        int i310 = i30;
                        listView2 = listView2;
                        sArr4 = sArr4;
                        i33 = i9;
                        i30 = i310;
                    } else {
                        s = s2;
                        i29 = i45;
                        sArr2 = sArr4;
                        i33 = i9;
                        i30 = i30;
                        int iM31614 = (C0773.m3169("᩷᩵") + i25) * (-101);
                        iM2769 = i8;
                        i26 = ((iM31614 ^ i24) * 19493) ^ (-947898471);
                        listView2 = listView2;
                        c171512 = c171510;
                        i32 = i32;
                        obj3 = obj3;
                        view5 = view2;
                        i27 = iM31614 ^ 1228094139;
                        sArr4 = sArr2;
                        abstractActivityC17204 = abstractActivityC17204;
                    }
                    break;
                case -1521106809:
                case 1830889468:
                    if (C0862.f3233 == 0) {
                        obj3 = obj3;
                        c171510 = c171512;
                        i8 = iM2769;
                        sArr2 = sArr4;
                        listView2 = listView2;
                        view2 = view5;
                        i32 = i32;
                        int iM31615 = (C0773.m3169("᩷᩵") + i25) * (-101);
                        iM2769 = i8;
                        i26 = ((iM31615 ^ i24) * 19493) ^ (-947898471);
                        listView2 = listView2;
                        c171512 = c171510;
                        i32 = i32;
                        obj3 = obj3;
                        view5 = view2;
                        i27 = iM31615 ^ 1228094139;
                        sArr4 = sArr2;
                        abstractActivityC17204 = abstractActivityC17204;
                    } else {
                        obj2 = obj3;
                        c171511 = c171512;
                        i14 = iM2769;
                        viewM9942 = view5;
                        i32 = i32;
                        int i46 = i33;
                        sArr4 = sArr4;
                        listView2 = listView2;
                        i30 = i30;
                        i9 = i46;
                        iM2763 = (i24 - C0619.m2761("ۜ᩹")) * (-21);
                        i15 = ((iM2763 ^ i25) * (-29581)) ^ 1934923748;
                        i16 = -410791488;
                        int i311 = iM2763 ^ i16;
                        iM2769 = i14;
                        i26 = i15;
                        c171512 = c171511;
                        i32 = i32;
                        obj3 = obj2;
                        i27 = i311;
                        view5 = viewM9942;
                        int i312 = i30;
                        listView2 = listView2;
                        sArr4 = sArr4;
                        i33 = i9;
                        i30 = i312;
                    }
                    break;
                case -1499619539:
                case 1762155283:
                    obj3 = obj3;
                    c17159 = c171512;
                    view5 = view5;
                    i32 = i32;
                    c14867 = new C14867(abstractActivityC17204, arrayList);
                    listView2 = listView2;
                    listView2.setAdapter((ListAdapter) c14867);
                    listView2.setOnItemClickListener(c14867);
                    int i47 = DialogInterfaceC8327.f27315;
                    iM2764 = C0619.m2761("ۢܳ") ^ i24;
                    i19 = ((iM2764 ^ i25) * 15871) ^ (-557763982);
                    i22 = 1503087385;
                    i20 = iM2764 ^ i22;
                    listView2 = listView2;
                    c171512 = c17159;
                    i27 = i20;
                    i32 = i32;
                    view5 = view5;
                    i26 = i19;
                    obj3 = obj3;
                    break;
                case -1474141474:
                case -885246249:
                    str = (String) C4238.m13529(it);
                    c17159 = c171512;
                    if (!C2419.m8175(str, C13473.m33137(f43414, 41, 4, i28))) {
                        iM3169 = C0773.m3169("ᩴۤ") ^ i24;
                        i4 = ((iM3169 ^ i25) * (-8131)) ^ (-1210299517);
                        i5 = 248406125;
                        int i313 = iM3169 ^ i5;
                        c171512 = c17159;
                        i27 = i313;
                        i26 = i4;
                    } else {
                        iM2764 = C0619.m2761("ᩳܺ") ^ i24;
                        i19 = ((iM2764 ^ i25) * (-1445)) ^ 332454890;
                        i22 = 915462145;
                        i20 = iM2764 ^ i22;
                        listView2 = listView2;
                        c171512 = c17159;
                        i27 = i20;
                        i32 = i32;
                        view5 = view5;
                        i26 = i19;
                        obj3 = obj3;
                    }
                    break;
                case -1469482649:
                case 1880084158:
                    c171510 = c171512;
                    c2361 = new C2361(abstractActivityC17204);
                    view3 = view5;
                    C1343.m4952(c2361, view3);
                    if (C0487.f2131 > 0) {
                        c2361.m8004(new DialogInterface.OnDismissListener() { // from class: l.ۖۜۤ

                            /* JADX INFO: renamed from: ۙ۟᩷, reason: not valid java name and contains not printable characters */
                            private static final short[] f7988 = {3105, 29175, 29178, 29173, 29180, 29166, 29178, 29180, 29182, 29124, 29171, 29170, 29183, 29183, 29182, 29173, 29124, 29173, 29182, 29164};

                            {
                                int i48 = -1468933801;
                                int i49 = C2375.f7641;
                                int i50 = RunnableC0334.f1808;
                                int iM31616 = (C0773.m3169("᩻ۘ") + i49) * 53;
                                int i51 = ((iM31616 ^ i50) * 28033) ^ (-649846838);
                                int i52 = 1474196875;
                                while (true) {
                                    i48 = ((((i48 ^ i50) * 24689) >> 31) & i51) ^ (iM31616 ^ i52);
                                    switch (i48) {
                                        case -2146840050:
                                        case 1696493221:
                                            if (AbstractC0641.f2496 >= 0) {
                                                iM31616 = (C0773.m3169("֫۬") + i50) * (-61);
                                                i51 = ((iM31616 ^ i49) * (-18143)) ^ 1647414620;
                                                i52 = -1570900236;
                                            } else {
                                                iM31616 = (C0619.m2761("۟ۢ") + i50) * 99;
                                                i51 = ((iM31616 ^ i49) * (-28625)) ^ (-2027473603);
                                                i52 = -1455112597;
                                            }
                                            break;
                                        case -2108367671:
                                        case 215370962:
                                            if (C1826.f6190 <= 0) {
                                                iM31616 = (C0773.m3169("֫۬") + i50) * (-61);
                                                i51 = ((iM31616 ^ i49) * (-18143)) ^ 1647414620;
                                                i52 = -1570900236;
                                            } else {
                                                iM31616 = (C0619.m2761("ۧܶ") ^ i50) * (-43);
                                                i51 = ((iM31616 ^ i49) * 26579) ^ (-1683306599);
                                                i52 = 848054883;
                                            }
                                            break;
                                        case -1844995731:
                                        case -338963174:
                                            if (RunnableC3646.f12471) {
                                                iM31616 = C0773.m3169("ۗ֫") ^ i49;
                                                i51 = ((iM31616 ^ i50) * (-20415)) ^ (-433060866);
                                                i52 = 1484621902;
                                            } else {
                                                iM31616 = (C0619.m2761("֡ۖ") + i50) * 31;
                                                i51 = ((iM31616 ^ i49) * 143) ^ 934480644;
                                                i52 = -1059939092;
                                            }
                                            break;
                                        case -1823919452:
                                        case 329271729:
                                            C1321.m4852();
                                            C1080.m4050();
                                            iM31616 = C0773.m3169("ۗ֫") ^ i49;
                                            i51 = ((iM31616 ^ i50) * (-20415)) ^ (-433060866);
                                            i52 = 1484621902;
                                            break;
                                        case -1747334942:
                                        case -398052487:
                                            return;
                                        case -1442393054:
                                        case -49404584:
                                            if (C1519.m5403()) {
                                                iM31616 = C0773.m3169("ۤ᩵") ^ i50;
                                                i51 = ((iM31616 ^ i49) * (-14551)) ^ (-1028821468);
                                                i52 = -1570322884;
                                            } else {
                                                iM31616 = C0619.m2761("᩺ܰ") ^ i49;
                                                i51 = ((iM31616 ^ i50) * 7435) ^ 949528030;
                                                i52 = -1637453518;
                                            }
                                            break;
                                        case -1168264287:
                                        case 1624255677:
                                            if (C3779.f12953 <= 0) {
                                                iM31616 = C0619.m2761("᩺ܰ") ^ i49;
                                                i51 = ((iM31616 ^ i50) * 7435) ^ 949528030;
                                                i52 = -1637453518;
                                            } else {
                                                iM31616 = (i49 - C0619.m2761("ܺۚ")) * (-121);
                                                i51 = ((iM31616 ^ i50) * (-12979)) ^ 1930441212;
                                                i52 = -1173030062;
                                            }
                                            break;
                                        case -1023453409:
                                        case 1116163248:
                                            if (C2287.f7432 >= 0) {
                                                iM31616 = C0619.m2761("᩺ܰ") ^ i49;
                                                i51 = ((iM31616 ^ i50) * 7435) ^ 949528030;
                                                i52 = -1637453518;
                                            } else {
                                                iM31616 = (C0773.m3169("ᩴۨ") + i49) * 77;
                                                i51 = ((iM31616 ^ i50) * 14739) ^ (-754053015);
                                                i52 = 725430043;
                                            }
                                            break;
                                        case -899108093:
                                        case 1204719105:
                                            if (C3077.m10041()) {
                                                iM31616 = C0773.m3169("ۗ֫") ^ i49;
                                                i51 = ((iM31616 ^ i50) * (-20415)) ^ (-433060866);
                                                i52 = 1484621902;
                                            } else {
                                                iM31616 = (i49 - C0773.m3169("۬᩵")) * (-105);
                                                i51 = ((iM31616 ^ i50) * (-19861)) ^ 1211293519;
                                                i52 = -333852088;
                                            }
                                            break;
                                        case -615639553:
                                        case 748930435:
                                            C2419.m8174();
                                            C1542.m5459();
                                            throw new RuntimeException();
                                        case -356786499:
                                        case 542033571:
                                            C3448.m11248();
                                            if (C2834.f9334 > 0) {
                                                iM31616 = (C0619.m2761("֡ܺ") + i50) * 33;
                                                i51 = ((iM31616 ^ i49) * (-18657)) ^ (-1081971650);
                                                i52 = -1755518143;
                                            } else {
                                                iM31616 = (C0773.m3169("֫۬") + i50) * (-61);
                                                i51 = ((iM31616 ^ i49) * (-18143)) ^ 1647414620;
                                                i52 = -1570900236;
                                            }
                                            break;
                                        case 891003105:
                                        case 2032929277:
                                            if (C1146.f4234 >= 0) {
                                                iM31616 = C0619.m2761("᩺ܰ") ^ i49;
                                                i51 = ((iM31616 ^ i50) * 7435) ^ 949528030;
                                                i52 = -1637453518;
                                            } else {
                                                iM31616 = C0773.m3169("ᩳ۫") ^ i49;
                                                i51 = ((iM31616 ^ i50) * (-16797)) ^ 1869775626;
                                                i52 = 737763945;
                                            }
                                            break;
                                        case 906008158:
                                        case 2014447676:
                                            if (C2023.f6737) {
                                                iM31616 = (C0619.m2761("֡ܺ") + i50) * 33;
                                                i51 = ((iM31616 ^ i49) * (-18657)) ^ (-1081971650);
                                                i52 = -1755518143;
                                            } else {
                                                iM31616 = (i49 - C0773.m3169("ۖۧ")) * (-53);
                                                i51 = ((iM31616 ^ i50) * (-21391)) ^ 1571988336;
                                                i52 = 634602786;
                                            }
                                            break;
                                        case 928923410:
                                        case 1712414693:
                                            if (C1146.f4234 < 0) {
                                                iM31616 = (C0773.m3169("֫۬") + i50) * (-61);
                                                i51 = ((iM31616 ^ i49) * (-18143)) ^ 1647414620;
                                                i52 = -1570900236;
                                            } else {
                                                iM31616 = C0773.m3169("ۗ֫") ^ i49;
                                                i51 = ((iM31616 ^ i50) * (-20415)) ^ (-433060866);
                                                i52 = 1484621902;
                                            }
                                            break;
                                        case 2055974601:
                                        case 2119922136:
                                            C2310.m7813();
                                            if (C0619.f2439) {
                                                iM31616 = C0773.m3169("ۗ֫") ^ i49;
                                                i51 = ((iM31616 ^ i50) * (-20415)) ^ (-433060866);
                                                i52 = 1484621902;
                                            } else {
                                                iM31616 = C0619.m2761("᩶ܿ") ^ i49;
                                                i51 = ((iM31616 ^ i50) * (-10665)) ^ 1180313246;
                                                i52 = 1132695778;
                                            }
                                            break;
                                        default:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM31616 = (C0773.m3169("֫۬") + i50) * (-61);
                                                i51 = ((iM31616 ^ i49) * (-18143)) ^ 1647414620;
                                                i52 = -1570900236;
                                            } else {
                                                iM31616 = (C0773.m3169("ۗۚ") ^ i50) * (-23);
                                                i51 = ((iM31616 ^ i49) * 13811) ^ (-1305347475);
                                                i52 = 1405208624;
                                            }
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:38:0x012b  */
                            /* JADX WARN: Code duplicated, block: B:64:0x025b  */
                            /* JADX WARN: Code duplicated, block: B:94:0x0397 A[PHI: r7 r11 r15 r16 r17 r23
                              0x0397: PHI (r7v3 l.ᩳ֫ܺ) = (r7v2 l.ᩳ֫ܺ), (r7v2 l.ᩳ֫ܺ), (r7v2 l.ᩳ֫ܺ), (r7v4 l.ᩳ֫ܺ) binds: [B:93:0x0395, B:85:0x0356, B:81:0x0339, B:49:0x01ba] A[DONT_GENERATE, DONT_INLINE]
                              0x0397: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:93:0x0395, B:85:0x0356, B:81:0x0339, B:49:0x01ba] A[DONT_GENERATE, DONT_INLINE]
                              0x0397: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:93:0x0395, B:85:0x0356, B:81:0x0339, B:49:0x01ba] A[DONT_GENERATE, DONT_INLINE]
                              0x0397: PHI (r16v4 short) = (r16v2 short), (r16v2 short), (r16v3 short), (r16v2 short) binds: [B:93:0x0395, B:85:0x0356, B:81:0x0339, B:49:0x01ba] A[DONT_GENERATE, DONT_INLINE]
                              0x0397: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:93:0x0395, B:85:0x0356, B:81:0x0339, B:49:0x01ba] A[DONT_GENERATE, DONT_INLINE]
                              0x0397: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:93:0x0395, B:85:0x0356, B:81:0x0339, B:49:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int iM27610;
                                int i48;
                                int i49;
                                int iM31616;
                                int i50;
                                short[] sArr6;
                                DialogInterfaceOnDismissListenerC2491 dialogInterfaceOnDismissListenerC2491 = this;
                                int i51 = 1166157513;
                                int i52 = AbstractC0641.f2496;
                                int i53 = C0773.f2792;
                                int iM27611 = C0619.m2761("ܿ۟") ^ i52;
                                int i54 = ((iM27611 ^ i53) * 2253) ^ (-1091868450);
                                int i55 = iM27611 ^ (-2121818236);
                                short[] sArr7 = null;
                                short[] sArr8 = null;
                                int i56 = 0;
                                short s3 = 0;
                                int i57 = 0;
                                int i58 = 0;
                                short s4 = 0;
                                char c = 0;
                                int i59 = 0;
                                int i60 = 0;
                                C6966 c6967 = null;
                                String strM8166 = null;
                                InterfaceC18752 interfaceC18752M11489 = null;
                                Iterator itM4942 = null;
                                StringBuilder sb = null;
                                Iterator itM4943 = null;
                                Iterator itM13647 = null;
                                ArrayList arrayList2 = null;
                                while (true) {
                                    i51 = i55 ^ (i54 & (((i51 ^ i53) * 16457) >> 31));
                                    switch (i51) {
                                        case -2131266685:
                                        case 923148523:
                                            ((C6966) C0950.m3796(itM4943)).f22993 = false;
                                            iM27610 = C0619.m2761("ۧ֨") ^ i52;
                                            i48 = ((iM27610 ^ i53) * 14537) ^ (-879938035);
                                            i49 = 2117557631;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -2067162936:
                                        case -1744464507:
                                            int i61 = s3 + s4;
                                            if (i58 - (i61 * i61) < 0) {
                                                iM27610 = C0773.m3169("֡ۛ") ^ i53;
                                                i48 = ((iM27610 ^ i52) * (-27965)) ^ (-484275082);
                                                i49 = 2066872629;
                                            } else {
                                                iM27610 = (i52 - C0619.m2761("ۗ֡")) * 19;
                                                i48 = ((iM27610 ^ i53) * (-15125)) ^ 1973224071;
                                                i49 = -714793573;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1761005560:
                                        case 8274518:
                                            if (C3099.f10023 > 0) {
                                                iM27610 = C0773.m3169("᩵ۢ") ^ i53;
                                                i48 = ((iM27610 ^ i52) * 10351) ^ 1820866488;
                                                i49 = 462078109;
                                                i55 = iM27610 ^ i49;
                                                i54 = i48;
                                            } else {
                                                iM31616 = (C0619.m2761("ۢ۟") ^ i52) * 15;
                                                i54 = ((iM31616 ^ i53) * (-18045)) ^ (-1073007099);
                                                i50 = 1223672735;
                                                i55 = iM31616 ^ i50;
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            }
                                            break;
                                        case -1733499709:
                                        case 1341008511:
                                            i56 = 29083;
                                            iM27610 = C0619.m2761("᩶ۚ") ^ i53;
                                            i48 = ((iM27610 ^ i52) * 24791) ^ 83316959;
                                            i49 = 416384294;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1728123900:
                                        case 1502796031:
                                            C0862.m3503();
                                            if (C3690.f12684 > 0) {
                                                iM27610 = (C0773.m3169("ܶ֡") + i53) * 45;
                                                i48 = ((iM27610 ^ i52) * (-22191)) ^ 1972896443;
                                                i49 = -2031894517;
                                                i55 = iM27610 ^ i49;
                                                i54 = i48;
                                            } else {
                                                sArr6 = sArr7;
                                                int iM27612 = (i53 - C0619.m2761("۬᩹")) * 35;
                                                i55 = iM27612 ^ 1661612195;
                                                sArr7 = sArr6;
                                                i54 = ((iM27612 ^ i52) * 583) ^ (-1386554938);
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            }
                                            break;
                                        case -1715593244:
                                        case -730166337:
                                            s3 = sArr7[c];
                                            i59 = s3 * s3;
                                            if (C2354.f7599 < 0) {
                                                iM27610 = C0773.m3169("ܶܽ") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-9277)) ^ 1586976138;
                                                i49 = 1321990078;
                                                i55 = iM27610 ^ i49;
                                                i54 = i48;
                                            } else {
                                                sArr6 = sArr7;
                                                int iM27613 = (i53 - C0619.m2761("۬᩹")) * 35;
                                                i55 = iM27613 ^ 1661612195;
                                                sArr7 = sArr6;
                                                i54 = ((iM27613 ^ i52) * 583) ^ (-1386554938);
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            }
                                            break;
                                        case -1713959817:
                                        case 189984246:
                                            if (C3690.f12684 <= 0) {
                                                iM31616 = (C0619.m2761("ۢ۟") ^ i52) * 15;
                                                i54 = ((iM31616 ^ i53) * (-18045)) ^ (-1073007099);
                                                i50 = 1223672735;
                                            } else {
                                                iM31616 = (i53 - C0773.m3169("ۤۤ")) * (-17);
                                                i54 = ((iM31616 ^ i52) * 26885) ^ 1258434919;
                                                i50 = -917225576;
                                            }
                                            i55 = iM31616 ^ i50;
                                            dialogInterfaceOnDismissListenerC2491 = this;
                                            break;
                                        case -1595883953:
                                        case 1889338978:
                                            C3779.m12264();
                                            sArr6 = sArr7;
                                            int iM27614 = (i53 - C0619.m2761("۬᩹")) * 35;
                                            i55 = iM27614 ^ 1661612195;
                                            sArr7 = sArr6;
                                            i54 = ((iM27614 ^ i52) * 583) ^ (-1386554938);
                                            dialogInterfaceOnDismissListenerC2491 = this;
                                            break;
                                        case -1453752393:
                                        case 1819736651:
                                            StringBuilder sb2 = new StringBuilder();
                                            itM4942 = C1343.m4942(arrayList2);
                                            sb = sb2;
                                            iM27610 = C0619.m2761("ᩳܺ") ^ i53;
                                            i48 = ((iM27610 ^ i52) * (-22703)) ^ (-556097143);
                                            i49 = -1966468284;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1428381985:
                                        case 682552113:
                                            sArr6 = f7988;
                                            if (C1519.f5300 < 0) {
                                                int iM31617 = (C0773.m3169("֡᩺") + i52) * 57;
                                                i48 = ((iM31617 ^ i53) * (-23173)) ^ 1999315960;
                                                i55 = iM31617 ^ 697126981;
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                                sArr7 = sArr6;
                                                i54 = i48;
                                            } else {
                                                int iM27615 = (i53 - C0619.m2761("۬᩹")) * 35;
                                                i55 = iM27615 ^ 1661612195;
                                                sArr7 = sArr6;
                                                i54 = ((iM27615 ^ i52) * 583) ^ (-1386554938);
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            }
                                            break;
                                        case -1425912524:
                                        case 1157266605:
                                            c6967 = (C6966) C0950.m3796(itM4942);
                                            if (c6967.f22993) {
                                                iM27610 = (C0619.m2761("᩻ۡ") + i52) * 13;
                                                i48 = ((iM27610 ^ i53) * 3791) ^ (-2032635377);
                                                i49 = -481877177;
                                            } else {
                                                iM27610 = C0619.m2761("ᩳܺ") ^ i53;
                                                i48 = ((iM27610 ^ i52) * (-22703)) ^ (-556097143);
                                                i49 = -1966468284;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1399552561:
                                        case -297433825:
                                            if (C2287.m7738(sb) > 0) {
                                                iM27610 = C0773.m3169("ۡۜ") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-14913)) ^ 1702606585;
                                                i49 = -1465236000;
                                            } else {
                                                iM27610 = (C0619.m2761("᩸ۙ") ^ i53) * (-67);
                                                i48 = ((iM27610 ^ i52) * 26749) ^ (-227299428);
                                                i49 = 1857399053;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1397013456:
                                        case 578751497:
                                            C1080.m4046(sb, '|');
                                            iM27610 = (C0619.m2761("᩸ۙ") ^ i53) * (-67);
                                            i48 = ((iM27610 ^ i52) * 26749) ^ (-227299428);
                                            i49 = 1857399053;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1257897882:
                                        case 1888147664:
                                            if (((C6966) C0950.m3796(itM13647)).f22993) {
                                                iM27610 = C0619.m2761("ܰ᩹") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-14413)) ^ 538251080;
                                                i49 = 1289101484;
                                            } else {
                                                iM27610 = C0773.m3169("᩵ۙ") ^ i53;
                                                i48 = ((iM27610 ^ i52) * (-31979)) ^ 140687159;
                                                i49 = -607896550;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1155509539:
                                        case 1783416491:
                                            ArrayList arrayList3 = arrayList;
                                            itM13647 = C4282.m13647(arrayList3);
                                            arrayList2 = arrayList3;
                                            iM27610 = C0619.m2761("ܰ᩹") ^ i52;
                                            i48 = ((iM27610 ^ i53) * (-14413)) ^ 538251080;
                                            i49 = 1289101484;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1070173674:
                                        case -192509456:
                                            c = 0;
                                            if (C1343.m4943()) {
                                                iM27610 = C0619.m2761("᩸᩵") ^ i53;
                                                i48 = ((iM27610 ^ i52) * 27679) ^ (-133083839);
                                                i49 = -1494762005;
                                            } else {
                                                iM27610 = C0773.m3169("ܶ۟") ^ i52;
                                                i48 = ((iM27610 ^ i53) * 3575) ^ (-930208416);
                                                i49 = -1968492083;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -1004632949:
                                        case -755655979:
                                            i60 = 366952336;
                                            if (C2702.f8586 <= 0) {
                                                iM27610 = C0773.m3169("ܶ۟") ^ i52;
                                                i48 = ((iM27610 ^ i53) * 3575) ^ (-930208416);
                                                i49 = -1968492083;
                                            } else {
                                                iM27610 = (C0619.m2761("ۧ۫") + i53) * 53;
                                                i48 = ((iM27610 ^ i52) * 12007) ^ (-314825574);
                                                i49 = -1004346741;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -972862441:
                                        case 51463625:
                                            if (C1826.m6317(itM13647)) {
                                                iM27610 = C0773.m3169("᩻۠") ^ i53;
                                                i48 = ((iM27610 ^ i52) * 25761) ^ 1546152424;
                                                i49 = -946126070;
                                            } else {
                                                iM27610 = C0773.m3169("ܶܿ") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-25065)) ^ (-2005080824);
                                                i49 = -86953631;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -751175435:
                                        case -136707220:
                                            C2375.m8061(C2966.m9665(interfaceC18752M11489, strM8166, C1080.m4058(sb)));
                                            if (C2310.f7472 >= 0) {
                                                iM27610 = C0773.m3169("ۧ᩺") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-26387)) ^ (-1730311437);
                                                i49 = -750273154;
                                            } else {
                                                iM27610 = (C0619.m2761("᩷᩹") + i52) * 31;
                                                i48 = ((iM27610 ^ i53) * 9767) ^ 889021338;
                                                i49 = -1345755576;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -186510548:
                                        case 1484521323:
                                            if (C3998.m12923(itM4943)) {
                                                iM27610 = C0773.m3169("ܽ᩹") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-11131)) ^ (-1593223605);
                                                i49 = 170007725;
                                            } else {
                                                iM27610 = C0773.m3169("᩵ۙ") ^ i53;
                                                i48 = ((iM27610 ^ i52) * (-31979)) ^ 140687159;
                                                i49 = -607896550;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -145798723:
                                        case 2139804644:
                                            C1080.m4055(runnable);
                                            break;
                                        case -128495414:
                                        case 452407423:
                                            if (C3998.m12923(itM4942)) {
                                                iM27610 = (C0773.m3169("֡֡") ^ i53) * (-85);
                                                i48 = ((iM27610 ^ i52) * (-10019)) ^ 1312219412;
                                                i49 = 1514429367;
                                            } else {
                                                iM27610 = (C0773.m3169("ᩳ᩷") + i53) * 75;
                                                i48 = ((iM27610 ^ i52) * (-9521)) ^ (-1095397793);
                                                i49 = -1277481865;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case -89940812:
                                        case 650017976:
                                            interfaceC18752M11489 = C3492.m11489(ApplicationC17729.f58258);
                                            sArr8 = f7988;
                                            if (C2702.f8586 <= 0) {
                                                iM27610 = C0773.m3169("ܶ۟") ^ i52;
                                                i48 = ((iM27610 ^ i53) * 3575) ^ (-930208416);
                                                i49 = -1968492083;
                                            } else {
                                                iM27610 = C0619.m2761("᩸ܰ") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-26343)) ^ (-1184828317);
                                                i49 = -1334171637;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case 162477254:
                                        case 723395187:
                                            i56 = 2496;
                                            iM27610 = C0619.m2761("᩶ۚ") ^ i53;
                                            i48 = ((iM27610 ^ i52) * 24791) ^ 83316959;
                                            i49 = 416384294;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case 199508754:
                                        case 302761315:
                                            strM8166 = C2419.m8166(sArr8, i57, 19, i56);
                                            if (AbstractC0641.f2496 >= 0) {
                                                iM27610 = (C0773.m3169("ܶ֡") + i53) * 45;
                                                i48 = ((iM27610 ^ i52) * (-22191)) ^ 1972896443;
                                                i49 = -2031894517;
                                            } else {
                                                iM27610 = (C0619.m2761("֨ܺ") ^ i53) * (-103);
                                                i48 = ((iM27610 ^ i52) * (-18005)) ^ (-1813681246);
                                                i49 = 824377014;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case 210627531:
                                        case 1763148601:
                                            if (C0950.m3785() != 0) {
                                                iM31616 = (C0619.m2761("ۢ۟") ^ i52) * 15;
                                                i54 = ((iM31616 ^ i53) * (-18045)) ^ (-1073007099);
                                                i50 = 1223672735;
                                                i55 = iM31616 ^ i50;
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            } else {
                                                iM27610 = (C0773.m3169("ܶ֡") + i53) * 45;
                                                i48 = ((iM27610 ^ i52) * (-22191)) ^ 1972896443;
                                                i49 = -2031894517;
                                                i55 = iM27610 ^ i49;
                                                i54 = i48;
                                            }
                                            break;
                                        case 382661323:
                                        case 1851976613:
                                            C3779.m12258(sb, c6967.f22995);
                                            iM27610 = C0619.m2761("ᩳܺ") ^ i53;
                                            i48 = ((iM27610 ^ i52) * (-22703)) ^ (-556097143);
                                            i49 = -1966468284;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case 984385089:
                                        case 1936446729:
                                            i57 = 1;
                                            if (C1343.f4799 == 0) {
                                                iM27610 = C0619.m2761("ۤ᩹") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-4615)) ^ (-200462161);
                                                i49 = -2127485195;
                                                i55 = iM27610 ^ i49;
                                                i54 = i48;
                                            } else {
                                                iM31616 = (C0619.m2761("ۢ۟") ^ i52) * 15;
                                                i54 = ((iM31616 ^ i53) * (-18045)) ^ (-1073007099);
                                                i50 = 1223672735;
                                                i55 = iM31616 ^ i50;
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            }
                                            break;
                                        case 1248739029:
                                        case 2128499898:
                                            int i62 = i59 + i60;
                                            i58 = i62 + i62;
                                            s4 = 19156;
                                            if (C3033.f9831 >= 0) {
                                                iM27610 = C0773.m3169("ܶ۟") ^ i52;
                                                i48 = ((iM27610 ^ i53) * 3575) ^ (-930208416);
                                                i49 = -1968492083;
                                            } else {
                                                iM27610 = C0773.m3169("ۤۜ") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-20321)) ^ (-1416324624);
                                                i49 = 236769602;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case 1396693292:
                                        case 1915140692:
                                            AbstractC0116.m1243();
                                            if (C2375.f7641 <= 0) {
                                                iM27610 = C0773.m3169("ۧ᩺") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-26387)) ^ (-1730311437);
                                                i49 = -750273154;
                                                i55 = iM27610 ^ i49;
                                                i54 = i48;
                                            } else {
                                                sArr6 = sArr7;
                                                int iM27616 = (i53 - C0619.m2761("۬᩹")) * 35;
                                                i55 = iM27616 ^ 1661612195;
                                                sArr7 = sArr6;
                                                i54 = ((iM27616 ^ i52) * 583) ^ (-1386554938);
                                                dialogInterfaceOnDismissListenerC2491 = this;
                                            }
                                            break;
                                        case 1522346019:
                                        case 1787859134:
                                            if (C23916.f77426 > 0) {
                                                iM27610 = C0773.m3169("ۧ᩺") ^ i52;
                                                i48 = ((iM27610 ^ i53) * (-26387)) ^ (-1730311437);
                                                i49 = -750273154;
                                            } else {
                                                iM27610 = C0773.m3169("֨֡") ^ i53;
                                                i48 = ((iM27610 ^ i52) * (-25361)) ^ 2118911302;
                                                i49 = 12088836;
                                            }
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        case 1814593868:
                                        case 1879327322:
                                            itM4943 = C1343.m4942(arrayList2);
                                            iM27610 = C0619.m2761("ۧ֨") ^ i52;
                                            i48 = ((iM27610 ^ i53) * 14537) ^ (-879938035);
                                            i49 = 2117557631;
                                            i55 = iM27610 ^ i49;
                                            i54 = i48;
                                            break;
                                        default:
                                            C2023.m6964();
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        i32 = i32;
                        obj3 = obj3;
                        iM31612 = C0773.m3169(C1826.m6310(f43414, 35, 3, i28));
                        if (C23916.f77426 > 0) {
                            int iM31616 = C0773.m3169("᩸ۤ") ^ i25;
                            i21 = ((iM31616 ^ i24) * (-9047)) ^ (-2131318823);
                            c171512 = c171510;
                            obj3 = obj3;
                            i27 = iM31616 ^ (-2043626830);
                            int i48 = i32;
                            view5 = view3;
                            i26 = i21;
                            i32 = i48;
                        } else {
                            view2 = view3;
                            i8 = iM2769;
                            sArr2 = sArr4;
                            listView2 = listView2;
                            int iM31617 = (C0773.m3169("᩷᩵") + i25) * (-101);
                            iM2769 = i8;
                            i26 = ((iM31617 ^ i24) * 19493) ^ (-947898471);
                            listView2 = listView2;
                            c171512 = c171510;
                            i32 = i32;
                            obj3 = obj3;
                            view5 = view2;
                            i27 = iM31617 ^ 1228094139;
                            sArr4 = sArr2;
                            abstractActivityC17204 = abstractActivityC17204;
                        }
                    } else {
                        i17 = i30;
                        i18 = i33;
                        sArr3 = sArr4;
                        int iM27610 = (C0619.m2761("ۢۛ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        view4 = view3;
                        i26 = ((iM27610 ^ i24) * (-31311)) ^ (-481101926);
                        sArr4 = sArr3;
                        i33 = i18;
                        i30 = i17;
                        c171512 = c171510;
                        listView2 = listView2;
                        i27 = iM27610 ^ (-90641654);
                        i32 = i32;
                        view5 = view4;
                    }
                    break;
                case -1453106800:
                case 395411114:
                    i9 = i33;
                    i28 = 5755;
                    iM2761 = C0619.m2761("ۗܿ") ^ i24;
                    i10 = ((iM2761 ^ i25) * (-14721)) ^ 573583239;
                    i11 = -1362098360;
                    i12 = iM2761 ^ i11;
                    iM2769 = iM2769;
                    i26 = i10;
                    c171512 = c171512;
                    i32 = i32;
                    obj3 = obj3;
                    view5 = view5;
                    i27 = i12;
                    int i314 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i314;
                    break;
                case -1296205423:
                case 850541974:
                    C2375.m8065();
                    C2834.m9344();
                    obj2 = obj3;
                    c171511 = c171512;
                    i14 = iM2769;
                    viewM9942 = view5;
                    i32 = i32;
                    int i49 = i33;
                    sArr4 = sArr4;
                    listView2 = listView2;
                    i30 = i30;
                    i9 = i49;
                    iM2763 = (i24 - C0619.m2761("ۜ᩹")) * (-21);
                    i15 = ((iM2763 ^ i25) * (-29581)) ^ 1934923748;
                    i16 = -410791488;
                    int i315 = iM2763 ^ i16;
                    iM2769 = i14;
                    i26 = i15;
                    c171512 = c171511;
                    i32 = i32;
                    obj3 = obj2;
                    i27 = i315;
                    view5 = viewM9942;
                    int i316 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i316;
                    break;
                case -755469247:
                case 1463354174:
                    c6966.f22993 = z;
                    iM2765 = C0619.m2761("ۡۙ") ^ i25;
                    i4 = ((iM2765 ^ i24) * 14615) ^ 943810095;
                    i23 = -298685962;
                    i27 = iM2765 ^ i23;
                    i26 = i4;
                    break;
                case -685586939:
                case 583152767:
                    C0619.m2763();
                    if (RunnableC1848.f6235) {
                        obj3 = obj3;
                        c171512 = c171512;
                        view5 = view5;
                        i32 = i32;
                        int i50 = i33;
                        sArr4 = sArr4;
                        listView2 = listView2;
                        i30 = i30;
                        i9 = i50;
                        iM2762 = (C0773.m3169("۟᩶") + i24) * (-11);
                        i26 = ((iM2762 ^ i25) * 19009) ^ (-1380152488);
                        i13 = 1531496301;
                        i12 = iM2762 ^ i13;
                        c171512 = c171512;
                        i32 = i32;
                        obj3 = obj3;
                        view5 = view5;
                        i27 = i12;
                        int i317 = i30;
                        listView2 = listView2;
                        sArr4 = sArr4;
                        i33 = i9;
                        i30 = i317;
                    }
                    obj2 = obj3;
                    c171511 = c171512;
                    i14 = iM2769;
                    viewM9942 = view5;
                    i32 = i32;
                    int i410 = i33;
                    sArr4 = sArr4;
                    listView2 = listView2;
                    i30 = i30;
                    i9 = i410;
                    iM2763 = (i24 - C0619.m2761("ۜ᩹")) * (-21);
                    i15 = ((iM2763 ^ i25) * (-29581)) ^ 1934923748;
                    i16 = -410791488;
                    int i318 = iM2763 ^ i16;
                    iM2769 = i14;
                    i26 = i15;
                    c171512 = c171511;
                    i32 = i32;
                    obj3 = obj2;
                    i27 = i318;
                    view5 = viewM9942;
                    int i319 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i319;
                    break;
                case -625128540:
                case 1897372211:
                    C1343.m4943();
                    C0950.m3785();
                    break;
                case -64330059:
                case 1617208327:
                    c171510 = c171512;
                    i17 = i30;
                    view3 = view5;
                    i32 = i32;
                    i18 = i33;
                    sArr3 = sArr4;
                    listView2 = (ListView) C2834.m9333(view3, iM2767 ^ 2128299530);
                    C18597.m43179(listView2);
                    obj3 = null;
                    listView2.setDivider(null);
                    if (C0773.f2792 <= 0) {
                        int iM27611 = (C0619.m2761("ۢۛ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        view4 = view3;
                        i26 = ((iM27611 ^ i24) * (-31311)) ^ (-481101926);
                        sArr4 = sArr3;
                        i33 = i18;
                        i30 = i17;
                        c171512 = c171510;
                        listView2 = listView2;
                        i27 = iM27611 ^ (-90641654);
                    } else {
                        view4 = view3;
                        int iM27612 = (C0619.m2761("ۙ᩶") ^ i24) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        sArr4 = sArr3;
                        i33 = i18;
                        i30 = i17;
                        c171512 = c171510;
                        i27 = iM27612 ^ 14846201;
                        listView2 = listView2;
                        i26 = ((iM27612 ^ i25) * 4025) ^ 285372487;
                    }
                    i32 = i32;
                    view5 = view4;
                    break;
                case -32202893:
                case 1456500793:
                    obj2 = obj3;
                    c171511 = c171512;
                    int i51 = i33;
                    int i52 = i30;
                    view3 = view5;
                    i32 = i32;
                    short[] sArr6 = sArr4;
                    listView2 = listView2;
                    i30 = i52;
                    int iM27613 = C0619.m2761(C1146.m4222(sArr6, i51, i52, i28)) ^ 2098731690;
                    sArr4 = sArr6;
                    TextView textView2 = textView;
                    C1080.m4060(textView2, iM27613);
                    if (C1146.f4234 < 0) {
                        int iM31618 = (C0773.m3169("ܳ֫") ^ i25) * q.h;
                        textView = textView2;
                        i21 = ((iM31618 ^ i24) * 1081) ^ (-1571067865);
                        i30 = i30;
                        c171512 = c171511;
                        i27 = iM31618 ^ (-854967568);
                        listView2 = listView2;
                        sArr4 = sArr4;
                        i33 = i51;
                        obj3 = obj2;
                        int i411 = i32;
                        view5 = view3;
                        i26 = i21;
                        i32 = i411;
                    } else {
                        viewM9942 = view3;
                        textView = textView2;
                        i9 = i51;
                        i14 = iM2769;
                        iM2763 = (i24 - C0619.m2761("ۜ᩹")) * (-21);
                        i15 = ((iM2763 ^ i25) * (-29581)) ^ 1934923748;
                        i16 = -410791488;
                        int i3110 = iM2763 ^ i16;
                        iM2769 = i14;
                        i26 = i15;
                        c171512 = c171511;
                        i32 = i32;
                        obj3 = obj2;
                        i27 = i3110;
                        view5 = viewM9942;
                        int i3111 = i30;
                        listView2 = listView2;
                        sArr4 = sArr4;
                        i33 = i9;
                        i30 = i3111;
                    }
                    break;
                case 68773904:
                case 1823824212:
                    obj3 = obj3;
                    c171512 = c171512;
                    iM2769 = iM2769;
                    view5 = view5;
                    i32 = i32;
                    int i53 = i33;
                    sArr4 = sArr4;
                    listView2 = listView2;
                    i30 = i30;
                    i9 = i53;
                    int i54 = (s * s) + 182358016;
                    if ((i54 + i54) - (i29 * i29) < 0) {
                        iM2761 = (C0619.m2761("ܰܺ") + i25) * 57;
                        i10 = ((iM2761 ^ i24) * (-22797)) ^ (-1207783708);
                        i11 = 1084408460;
                    } else {
                        iM2761 = (i24 - C0619.m2761("ۧ᩶")) * 5;
                        i10 = ((iM2761 ^ i25) * 28819) ^ (-787367671);
                        i11 = -1397581950;
                    }
                    i12 = iM2761 ^ i11;
                    iM2769 = iM2769;
                    i26 = i10;
                    c171512 = c171512;
                    i32 = i32;
                    obj3 = obj3;
                    view5 = view5;
                    i27 = i12;
                    int i3112 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i3112;
                    break;
                case 216405036:
                case 945647133:
                    c17159 = c171512;
                    C3492.m11487(c2361, iM31612 ^ 2120977681, obj3);
                    sArr5 = f43414;
                    i32 = 38;
                    iM3169 = (i24 - C0773.m3169("᩸ۛ")) * 51;
                    i4 = ((iM3169 ^ i25) * (-75)) ^ 639542364;
                    i5 = -129701998;
                    int i3113 = iM3169 ^ i5;
                    c171512 = c17159;
                    i27 = i3113;
                    i26 = i4;
                    break;
                case 520862224:
                case 1067035211:
                    obj3 = obj3;
                    c17159 = c171512;
                    listView2 = listView2;
                    view5 = view5;
                    i32 = i32;
                    if (C3998.m12923(it)) {
                        iM2764 = C0619.m2761("ۚ֡") ^ i25;
                        i19 = ((iM2764 ^ i24) * 6655) ^ 1377624884;
                        i22 = 1105819938;
                    } else {
                        iM2764 = (C0619.m2761("᩵᩺") + i25) * 79;
                        i19 = ((iM2764 ^ i24) * (-13901)) ^ (-2129744285);
                        i22 = 2121471412;
                    }
                    i20 = iM2764 ^ i22;
                    listView2 = listView2;
                    c171512 = c17159;
                    i27 = i20;
                    i32 = i32;
                    view5 = view5;
                    i26 = i19;
                    obj3 = obj3;
                    break;
                case 563802188:
                case 1902019403:
                    C2288.m7767();
                    if (RunnableC0334.f1808 <= 0) {
                        c171510 = c171512;
                        view3 = view5;
                        i17 = i30;
                        i18 = i33;
                        sArr3 = sArr4;
                        int iM27614 = (C0619.m2761("ۢۛ") ^ i25) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        view4 = view3;
                        i26 = ((iM27614 ^ i24) * (-31311)) ^ (-481101926);
                        sArr4 = sArr3;
                        i33 = i18;
                        i30 = i17;
                        c171512 = c171510;
                        listView2 = listView2;
                        i27 = iM27614 ^ (-90641654);
                        i32 = i32;
                        view5 = view4;
                    } else {
                        obj2 = obj3;
                        c171511 = c171512;
                        i14 = iM2769;
                        viewM9942 = view5;
                        i32 = i32;
                        int i412 = i33;
                        sArr4 = sArr4;
                        listView2 = listView2;
                        i30 = i30;
                        i9 = i412;
                        iM2763 = (i24 - C0619.m2761("ۜ᩹")) * (-21);
                        i15 = ((iM2763 ^ i25) * (-29581)) ^ 1934923748;
                        i16 = -410791488;
                        int i3114 = iM2763 ^ i16;
                        iM2769 = i14;
                        i26 = i15;
                        c171512 = c171511;
                        i32 = i32;
                        obj3 = obj2;
                        i27 = i3114;
                        view5 = viewM9942;
                        int i3115 = i30;
                        listView2 = listView2;
                        sArr4 = sArr4;
                        i33 = i9;
                        i30 = i3115;
                    }
                    break;
                case 780951265:
                case 1829214335:
                    C2375.m8063(c2361, iM2768 ^ 2126460239, obj3);
                    C11235.m28299(C2310.m7808(C3099.m10090(c2361)), new View.OnClickListener() { // from class: l.۠ۜۤ
                        {
                            int i55 = -1584603201;
                            int i56 = C1783.f6087;
                            int i57 = C23916.f77426;
                            int iM31619 = C0773.m3169("֫ۨ") ^ i57;
                            int i58 = ((iM31619 ^ i56) * 5049) ^ 2033228517;
                            int i59 = 456081917;
                            while (true) {
                                i55 = ((((i55 ^ i56) * (-10769)) >> 31) & i58) ^ (iM31619 ^ i59);
                                switch (i55) {
                                    case -2014445447:
                                    case 1718743894:
                                        if (C1080.f3865 >= 0) {
                                            iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                            i59 = 314393350;
                                        } else {
                                            iM31619 = C0773.m3169("ۡ۬") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 30291) ^ 1219526072;
                                            i59 = 334192300;
                                        }
                                        break;
                                    case -1841037660:
                                    case -1659875557:
                                        C0619.m2763();
                                        if (AbstractC3624.m11755() != 0) {
                                            iM31619 = (i57 - C0773.m3169("ۢ۫")) * (-7);
                                            i58 = ((iM31619 ^ i56) * 5647) ^ 1086608720;
                                            i59 = -577247848;
                                        } else {
                                            iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                            i59 = 314393350;
                                        }
                                        break;
                                    case -1739918061:
                                    case -488952284:
                                        if (C0862.f3233 != 0) {
                                            iM31619 = C0773.m3169("᩹۠") ^ i57;
                                            i58 = ((iM31619 ^ i56) * (-31807)) ^ (-2116705211);
                                            i59 = 382631140;
                                        } else {
                                            iM31619 = C0619.m2761("۟ۨ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * (-28071)) ^ (-1868420716);
                                            i59 = -454981566;
                                        }
                                        break;
                                    case -1715790407:
                                    case 1562182323:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM31619 = C0773.m3169("᩹۠") ^ i57;
                                            i58 = ((iM31619 ^ i56) * (-31807)) ^ (-2116705211);
                                            i59 = 382631140;
                                        } else {
                                            iM31619 = C0773.m3169("ܽ۫") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 13417) ^ 1541854441;
                                            i59 = -763462741;
                                        }
                                        break;
                                    case -1500115518:
                                    case 605605339:
                                        if (C2288.f7433 <= 0) {
                                            iM31619 = C0773.m3169("᩹۠") ^ i57;
                                            i58 = ((iM31619 ^ i56) * (-31807)) ^ (-2116705211);
                                            i59 = 382631140;
                                        } else {
                                            iM31619 = C0773.m3169("ۙܶ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 30131) ^ (-1903004912);
                                            i59 = 325187912;
                                        }
                                        break;
                                    case -1101440643:
                                    case -90238416:
                                        if (!C3099.m10095()) {
                                            iM31619 = (C0773.m3169("ܺ֨") + i57) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i58 = ((iM31619 ^ i56) * 31015) ^ 2072413954;
                                            i59 = -1587759982;
                                        } else {
                                            iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                            i59 = 314393350;
                                        }
                                        break;
                                    case -842000531:
                                    case 1123227219:
                                        return;
                                    case -741894202:
                                    case 567059702:
                                        if (C1146.m4231()) {
                                            iM31619 = C0773.m3169("᩵ᩳ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * (-353)) ^ (-377197093);
                                            i59 = -324982102;
                                        } else {
                                            iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                            i59 = 314393350;
                                        }
                                        break;
                                    case -733475644:
                                    case 26414941:
                                        C0619.m2763();
                                        C0487.m2356();
                                        throw new RuntimeException();
                                    case -570294211:
                                    case 914662152:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                            i59 = 314393350;
                                        } else {
                                            iM31619 = C0619.m2761("֡۟") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 6101) ^ (-519178123);
                                            i59 = -1074218085;
                                        }
                                        break;
                                    case -171153613:
                                    case 1442406352:
                                        if (C3998.f13671 != 0) {
                                            iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                            i59 = 314393350;
                                        } else {
                                            iM31619 = (i56 - C0773.m3169("ܳ᩷")) * (-43);
                                            i58 = ((iM31619 ^ i57) * (-11907)) ^ (-1906538312);
                                            i59 = -1574329349;
                                        }
                                        break;
                                    case 656151703:
                                    case 741217525:
                                        C1519.m5403();
                                        if (C13473.f42873 == 0) {
                                            iM31619 = (C0773.m3169("ܺ֨") + i57) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i58 = ((iM31619 ^ i56) * 31015) ^ 2072413954;
                                            i59 = -1587759982;
                                        } else {
                                            iM31619 = C0619.m2761("᩶ܶ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * (-8753)) ^ 813192607;
                                            i59 = -663442222;
                                        }
                                        break;
                                    case 688443665:
                                    case 2073989368:
                                        if (C2023.f6737) {
                                            iM31619 = C0773.m3169("᩹۠") ^ i57;
                                            i58 = ((iM31619 ^ i56) * (-31807)) ^ (-2116705211);
                                            i59 = 382631140;
                                        } else {
                                            iM31619 = (C0619.m2761("۟ܳ") + i56) * 109;
                                            i58 = ((iM31619 ^ i57) * (-5433)) ^ 253048594;
                                            i59 = -631387727;
                                        }
                                        break;
                                    case 696414627:
                                    case 935635700:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31619 = (i57 - C0773.m3169("ۢ۫")) * (-7);
                                            i58 = ((iM31619 ^ i56) * 5647) ^ 1086608720;
                                            i59 = -577247848;
                                        } else {
                                            iM31619 = (C0773.m3169("۠᩵") ^ i57) * (-45);
                                            i58 = ((iM31619 ^ i56) * 15745) ^ (-1446843899);
                                            i59 = -118820406;
                                        }
                                        break;
                                    case 729121217:
                                    case 1001579909:
                                        if (AbstractC0116.m1243() != 0) {
                                            iM31619 = C0773.m3169("᩹۠") ^ i57;
                                            i58 = ((iM31619 ^ i56) * (-31807)) ^ (-2116705211);
                                            i59 = 382631140;
                                        } else {
                                            iM31619 = C0773.m3169("ۘۡ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 23183) ^ 206184584;
                                            i59 = -1123186458;
                                        }
                                        break;
                                    default:
                                        C17202.m40372();
                                        iM31619 = (C0619.m2761("ۤۡ") + i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                        i58 = ((iM31619 ^ i57) * (-17797)) ^ 721894118;
                                        i59 = 314393350;
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            Iterator itM13647 = null;
                            C6966 c6967 = null;
                            boolean z2 = false;
                            int i55 = 148895445;
                            int i56 = C0487.f2131;
                            int i57 = C3734.f12817;
                            int iM31619 = (i56 - C0773.m3169("ᩴۤ")) * 63;
                            int i58 = ((iM31619 ^ i57) * 701) ^ 697211735;
                            int i59 = -629307649;
                            while (true) {
                                i55 = ((((i55 ^ i57) * (-13097)) >> 31) & i58) ^ (iM31619 ^ i59);
                                switch (i55) {
                                    case -2055093583:
                                    case 554402957:
                                        AbstractC0641.m2813();
                                        iM31619 = (C0619.m2761("ܰ᩵") ^ i57) * (-67);
                                        i58 = ((iM31619 ^ i56) * (-7913)) ^ 177515571;
                                        i59 = -1941118314;
                                        break;
                                    case -2052891813:
                                    case -1401099495:
                                        C23916.m53419();
                                        if (C0487.f2131 > 0) {
                                            iM31619 = C0619.m2761("֫ۗ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 27229) ^ 827937319;
                                            i59 = -1046103982;
                                        } else {
                                            iM31619 = (C0619.m2761("۠۟") + i57) * (-107);
                                            i58 = ((iM31619 ^ i56) * (-26957)) ^ 109330492;
                                            i59 = -1869209195;
                                        }
                                        break;
                                    case -2050758509:
                                    case 1500231051:
                                        if (C0619.f2439) {
                                            iM31619 = (C0619.m2761("ۨۧ") ^ i56) * (-123);
                                            i58 = ((iM31619 ^ i57) * (-23397)) ^ (-773154084);
                                            i59 = 269939482;
                                        } else {
                                            iM31619 = (i57 - C0773.m3169("᩶ۜ")) * 99;
                                            i58 = ((iM31619 ^ i56) * 6747) ^ (-1380313054);
                                            i59 = -343188221;
                                        }
                                        break;
                                    case -1873771640:
                                    case 1932867383:
                                        if (C3779.f12953 <= 0) {
                                            iM31619 = C0619.m2761("֫ۗ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 27229) ^ 827937319;
                                            i59 = -1046103982;
                                        } else {
                                            iM31619 = (C0773.m3169("᩹֡") ^ i56) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i58 = ((iM31619 ^ i57) * (-24973)) ^ 1035114785;
                                            i59 = 696781464;
                                        }
                                        break;
                                    case -1706936254:
                                    case -1266847928:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM31619 = C0773.m3169("ܰܰ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 7673) ^ 128349609;
                                            i59 = -167506938;
                                        } else {
                                            iM31619 = C0619.m2761("ܶ֨") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 135) ^ 1636829690;
                                            i59 = -297755075;
                                        }
                                        break;
                                    case -1556656027:
                                    case 1888336794:
                                        C0487.m2356();
                                        break;
                                    case -1539462056:
                                    case -812562816:
                                        itM13647 = C4282.m13647(arrayList);
                                        iM31619 = (C0773.m3169("ܿ۫") + i56) * 37;
                                        i58 = ((iM31619 ^ i57) * 21203) ^ (-1869245605);
                                        i59 = 1630105105;
                                        break;
                                    case -1206450293:
                                    case 1734716612:
                                        if (C2485.f7950 != 0) {
                                            iM31619 = C0773.m3169("ܰܰ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 7673) ^ 128349609;
                                            i59 = -167506938;
                                        } else {
                                            iM31619 = C0619.m2761("ۖۢ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 12597) ^ (-189609911);
                                            i59 = -1286852212;
                                        }
                                        break;
                                    case -1093107313:
                                    case 1662264511:
                                        if (!C3099.m10095()) {
                                            iM31619 = (C0619.m2761("ۨۧ") ^ i56) * (-123);
                                            i58 = ((iM31619 ^ i57) * (-23397)) ^ (-773154084);
                                            i59 = 269939482;
                                        } else {
                                            iM31619 = C0619.m2761("֫ۗ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 27229) ^ 827937319;
                                            i59 = -1046103982;
                                        }
                                        break;
                                    case -950990044:
                                    case -13458685:
                                        z2 = c6967.f22993;
                                        if (C1321.f4751 >= 0) {
                                            iM31619 = C0773.m3169("ܰܰ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 7673) ^ 128349609;
                                            i59 = -167506938;
                                        } else {
                                            iM31619 = (C0773.m3169("ܰۛ") ^ i56) * 5;
                                            i58 = ((iM31619 ^ i57) * 31419) ^ 656156852;
                                            i59 = -526432534;
                                        }
                                        break;
                                    case -911725876:
                                    case -522551221:
                                        c14867.notifyDataSetChanged();
                                        break;
                                    case -690730554:
                                    case 1190235832:
                                        if (!C17202.f56030) {
                                            iM31619 = (C0619.m2761("۠۟") + i57) * (-107);
                                            i58 = ((iM31619 ^ i56) * (-26957)) ^ 109330492;
                                            i59 = -1869209195;
                                        } else {
                                            iM31619 = (C0619.m2761("ܰ᩵") ^ i57) * (-67);
                                            i58 = ((iM31619 ^ i56) * (-7913)) ^ 177515571;
                                            i59 = -1941118314;
                                        }
                                        break;
                                    case -610206263:
                                    case 2068886966:
                                        if (C3099.f10023 <= 0) {
                                            iM31619 = C0773.m3169("ܰܰ") ^ i57;
                                            i58 = ((iM31619 ^ i56) * 7673) ^ 128349609;
                                            i59 = -167506938;
                                        } else {
                                            iM31619 = C0619.m2761("ۗ֨") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 28563) ^ (-750799832);
                                            i59 = 1310337826;
                                        }
                                        break;
                                    case -484909752:
                                    case 1989522532:
                                        if (C0862.m3503()) {
                                            iM31619 = (C0773.m3169("᩹ۡ") + i56) * 41;
                                            i58 = ((iM31619 ^ i57) * 10823) ^ 1447941968;
                                            i59 = 1375234088;
                                        } else {
                                            iM31619 = (C0619.m2761("۠۟") + i57) * (-107);
                                            i58 = ((iM31619 ^ i56) * (-26957)) ^ 109330492;
                                            i59 = -1869209195;
                                        }
                                        break;
                                    case -278441747:
                                    case 510229287:
                                        if (C1542.m5459() >= 0) {
                                            iM31619 = C0619.m2761("֫ۗ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 27229) ^ 827937319;
                                            i59 = -1046103982;
                                        } else {
                                            iM31619 = (C0619.m2761("᩸۫") + i57) * (-63);
                                            i58 = ((iM31619 ^ i56) * (-30045)) ^ (-1915307984);
                                            i59 = 646237000;
                                        }
                                        break;
                                    case -271270583:
                                    case 44684197:
                                        if (C1826.m6317(itM13647)) {
                                            iM31619 = (i57 - C0619.m2761("ܽܶ")) * 45;
                                            i58 = ((iM31619 ^ i56) * (-27757)) ^ (-2067860301);
                                            i59 = 1523898363;
                                        } else {
                                            iM31619 = (i57 - C0773.m3169("ᩴۘ")) * 13;
                                            i58 = ((iM31619 ^ i56) * (-8617)) ^ 637630152;
                                            i59 = 1478011677;
                                        }
                                        break;
                                    case 1338723546:
                                    case 1462248547:
                                        if (C3492.f12043 <= 0) {
                                            iM31619 = (C0619.m2761("۠۟") + i57) * (-107);
                                            i58 = ((iM31619 ^ i56) * (-26957)) ^ 109330492;
                                            i59 = -1869209195;
                                        } else {
                                            iM31619 = (C0619.m2761("᩵ۘ") ^ i57) * (-63);
                                            i58 = ((iM31619 ^ i56) * 4231) ^ (-53814623);
                                            i59 = 930294782;
                                        }
                                        break;
                                    case 1763669851:
                                    case 1862808896:
                                        c6967 = (C6966) C0950.m3796(itM13647);
                                        if (C0862.f3233 != 0) {
                                            iM31619 = (C0619.m2761("۠۟") + i57) * (-107);
                                            i58 = ((iM31619 ^ i56) * (-26957)) ^ 109330492;
                                            i59 = -1869209195;
                                        } else {
                                            iM31619 = C0773.m3169("֨ܳ") ^ i56;
                                            i58 = ((iM31619 ^ i57) * 15883) ^ 521816809;
                                            i59 = -803145033;
                                        }
                                        break;
                                    default:
                                        c6967.f22993 = !z2;
                                        iM31619 = (C0773.m3169("ܿ۫") + i56) * 37;
                                        i58 = ((iM31619 ^ i57) * 21203) ^ (-1869245605);
                                        i59 = 1630105105;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case 793322391:
                case 1965808707:
                    obj3 = obj3;
                    c171510 = c171512;
                    listView2 = listView2;
                    view5 = view5;
                    i32 = i32;
                    textView = (TextView) C3448.m11246(view5, iM31611 ^ 2102734556);
                    sArr2 = f43414;
                    i33 = 32;
                    i30 = 3;
                    if (C3099.f10023 > 0) {
                        int iM27615 = (C0619.m2761("ۜۙ") + i24) * 21;
                        i19 = ((iM27615 ^ i25) * (-3411)) ^ 2052541587;
                        i20 = iM27615 ^ 1061233302;
                        listView2 = listView2;
                        c171512 = c171510;
                        sArr4 = sArr2;
                        i27 = i20;
                        i32 = i32;
                        view5 = view5;
                        i26 = i19;
                        obj3 = obj3;
                    } else {
                        view2 = view5;
                        i8 = iM2769;
                        int iM31619 = (C0773.m3169("᩷᩵") + i25) * (-101);
                        iM2769 = i8;
                        i26 = ((iM31619 ^ i24) * 19493) ^ (-947898471);
                        listView2 = listView2;
                        c171512 = c171510;
                        i32 = i32;
                        obj3 = obj3;
                        view5 = view2;
                        i27 = iM31619 ^ 1228094139;
                        sArr4 = sArr2;
                        abstractActivityC17204 = abstractActivityC17204;
                    }
                    break;
                case 1152652971:
                case 1665637473:
                    i9 = i33;
                    i28 = 24015;
                    iM2761 = C0619.m2761("ۗܿ") ^ i24;
                    i10 = ((iM2761 ^ i25) * (-14721)) ^ 573583239;
                    i11 = -1362098360;
                    i12 = iM2761 ^ i11;
                    iM2769 = iM2769;
                    i26 = i10;
                    c171512 = c171512;
                    i32 = i32;
                    obj3 = obj3;
                    view5 = view5;
                    i27 = i12;
                    int i3116 = i30;
                    listView2 = listView2;
                    sArr4 = sArr4;
                    i33 = i9;
                    i30 = i3116;
                    break;
                default:
                    obj = obj3;
                    c17159 = c171512;
                    int i55 = i33;
                    view = view5;
                    i = i32;
                    sArr = sArr4;
                    listView = listView2;
                    i2 = i30;
                    i3 = i55;
                    iM31611 = C0773.m3169(C1542.m5471(f43414, 29, 3, i28));
                    if (C1783.f6087 <= 0) {
                        iM31610 = (i25 - C0773.m3169("ܶ۠")) * 53;
                        i6 = ((iM31610 ^ i24) * 14645) ^ (-2045286324);
                        i7 = -1664457897;
                    } else {
                        iM31610 = (i25 - C0773.m3169("ۤ۫")) * (-97);
                        i6 = ((iM31610 ^ i24) * 14267) ^ (-1874481883);
                        i7 = 1244437986;
                    }
                    int i413 = iM31610 ^ i7;
                    c171512 = c17159;
                    obj3 = obj;
                    i27 = i413;
                    int i414 = i;
                    view5 = view;
                    i26 = i6;
                    i32 = i414;
                    int i415 = i2;
                    listView2 = listView;
                    sArr4 = sArr;
                    i33 = i3;
                    i30 = i415;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0343 A[PHI: r5 r11 r12 r14 r16 r17 r19 r21 r25
      0x0343: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r11v26 short[]) = (r11v7 short[]), (r11v20 short[]), (r11v28 short[]) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r12v5 int) = (r12v2 int), (r12v4 int), (r12v2 int) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r14v5 short[]) = (r14v2 short[]), (r14v4 short[]), (r14v2 short[]) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v7 int) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r21v3 short) = (r21v2 short), (r21v2 short), (r21v7 short) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0343: PHI (r25v24 java.util.HashSet) = (r25v4 java.util.HashSet), (r25v18 java.util.HashSet), (r25v29 java.util.HashSet) binds: [B:78:0x0341, B:15:0x008b, B:6:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (l.C0862.f3233 == 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet m33452() {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13677.m33452():java.util.HashSet");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f2 A[PHI: r0 r1 r4 r5
      0x01f2: PHI (r0v6 bin.mt.plugin.api.LocalString) = 
      (r0v5 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
     binds: [B:64:0x01f0, B:43:0x0112, B:28:0x009b, B:24:0x007b, B:14:0x0054, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r1v4 java.util.HashSet) = 
      (r1v3 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
      (r1v2 java.util.HashSet)
     binds: [B:64:0x01f0, B:43:0x0112, B:28:0x009b, B:24:0x007b, B:14:0x0054, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r4v5 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:64:0x01f0, B:43:0x0112, B:28:0x009b, B:24:0x007b, B:14:0x0054, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r5v5 l.ܺ᩺֫) = (r5v2 l.ܺ᩺֫), (r5v2 l.ܺ᩺֫), (r5v2 l.ܺ᩺֫), (r5v4 l.ܺ᩺֫), (r5v2 l.ܺ᩺֫), (r5v2 l.ܺ᩺֫) binds: [B:64:0x01f0, B:43:0x0112, B:28:0x009b, B:24:0x007b, B:14:0x0054, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Set m33454() {
        int iM2761;
        int i;
        LocalString localStringM16285 = null;
        HashSet hashSetM33452 = null;
        Iterator it = null;
        String str = null;
        C17159 c17159 = null;
        int i2 = -218739638;
        int i3 = C0269.f1558;
        int i4 = C3492.f12043;
        int iM3169 = (C0773.m3169("ܿ᩶") + i4) * 101;
        int i5 = ((iM3169 ^ i3) * (-21465)) ^ 1715736721;
        int i6 = 1695754956;
        while (true) {
            int i7 = iM3169 ^ i6;
            C18037 c18037 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-20187)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2055586460:
                    case -2051161684:
                        localStringM16285 = C5448.m16285();
                        hashSetM33452 = m33452();
                        if (C3734.f12817 >= 0) {
                            iM2761 = (C0773.m3169("ۢۧ") + i4) * (-27);
                            i5 = ((iM2761 ^ i3) * (-26031)) ^ 1015078768;
                            i = -1458877927;
                        } else {
                            iM2761 = C0619.m2761("۬᩶") ^ i4;
                            i5 = ((iM2761 ^ i3) * 14539) ^ 855075434;
                            i = 899876789;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1849256349:
                    case -1209997525:
                        C2310.m7813();
                        iM2761 = (C0619.m2761("ܶۘ") ^ i3) * 37;
                        i5 = ((iM2761 ^ i4) * 12233) ^ 1765466;
                        i = -1797825303;
                        i7 = iM2761 ^ i;
                        break;
                    case -1629128432:
                    case 1006355195:
                        if (C2310.f7472 >= 0) {
                            iM2761 = (C0773.m3169("ۢۧ") + i4) * (-27);
                            i5 = ((iM2761 ^ i3) * (-26031)) ^ 1015078768;
                            i = -1458877927;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ۘۖ")) * 57;
                            i5 = ((iM2761 ^ i3) * (-20665)) ^ 1197600511;
                            i = 2087005413;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1479966190:
                    case 1361896838:
                        return C4681.unmodifiableSet(c18037);
                    case -1476425837:
                    case -474470192:
                        if (C1826.m6317(it)) {
                            iM2761 = (i3 - C0619.m2761("ܺܳ")) * 101;
                            i5 = ((iM2761 ^ i4) * 15281) ^ (-1255892791);
                            i = 405513064;
                        } else {
                            iM2761 = C0773.m3169("ۜ᩵") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-26547)) ^ (-1752190249);
                            i = -1270877758;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1267793215:
                    case 712577874:
                        if (C2023.f6737) {
                            iM2761 = C0773.m3169("֨ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 3721) ^ 41351309;
                            i = -1542009495;
                        } else {
                            iM2761 = (C0619.m2761("ۘ۬") + i3) * 83;
                            i5 = ((iM2761 ^ i4) * (-10691)) ^ (-403393474);
                            i = -1926881942;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1244052350:
                    case -1158769774:
                        if (C23916.f77426 <= 0) {
                            iM2761 = C0773.m3169("֨ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 3721) ^ 41351309;
                            i = -1542009495;
                        } else {
                            iM2761 = C0773.m3169("ۜ᩹") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-9203)) ^ (-1379566372);
                            i = -1483116267;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1183402946:
                    case 1485471889:
                        c18037.add(c17159.getOrDefault(str, str));
                        iM2761 = C0773.m3169("֨ۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-7095)) ^ (-1097461604);
                        i = -855767298;
                        i7 = iM2761 ^ i;
                        break;
                    case -1101698602:
                    case -465517480:
                        str = (String) C4238.m13529(it);
                        if (C2878.f9462) {
                            iM2761 = (C0773.m3169("ۢۧ") + i4) * (-27);
                            i5 = ((iM2761 ^ i3) * (-26031)) ^ 1015078768;
                            i = -1458877927;
                        } else {
                            iM2761 = C0773.m3169("֨ۛ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 32523) ^ 1502066610;
                            i = -596883626;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1028057752:
                    case 643132022:
                        if (C2354.f7599 < 0) {
                            iM2761 = (C0619.m2761("᩻֡") + i3) * 115;
                            i5 = ((iM2761 ^ i4) * (-22411)) ^ 892005086;
                            i = -1947147107;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -982071363:
                    case 598149330:
                        if (C17202.f56030) {
                            iM2761 = C0619.m2761("ۜۚ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 20669) ^ 1459642856;
                            i = 1689697313;
                        } else {
                            iM2761 = (C0773.m3169("ۢۧ") + i4) * (-27);
                            i5 = ((iM2761 ^ i3) * (-26031)) ^ 1015078768;
                            i = -1458877927;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -758308550:
                    case 1105663224:
                        C1519.m5403();
                        C2966.m9664();
                        return null;
                    case -285567969:
                    case -215324294:
                        c17159 = (C17159) localStringM16285;
                        if (C3099.m10095()) {
                            iM2761 = (C0773.m3169("ۢۧ") + i4) * (-27);
                            i5 = ((iM2761 ^ i3) * (-26031)) ^ 1015078768;
                            i = -1458877927;
                        } else {
                            iM2761 = C0619.m2761("᩷֫") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-30463)) ^ 192619629;
                            i = -1434250525;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -221706274:
                    case 1582022495:
                        if (C2375.f7641 <= 0) {
                            iM2761 = (C0619.m2761("ܶۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * 12233) ^ 1765466;
                            i = -1797825303;
                        } else {
                            iM2761 = C0773.m3169("ܳ᩺") ^ i3;
                            i5 = ((iM2761 ^ i4) * 7003) ^ (-1732527680);
                            i = -1314711384;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -188336611:
                    case 232590038:
                        if (C4282.f15546 > 0) {
                            c18037 = new C18037(hashSetM33452.size());
                            it = hashSetM33452.iterator();
                            iM2761 = C0773.m3169("֨ۙ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-7095)) ^ (-1097461604);
                            i = -855767298;
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case 143196576:
                    case 1274085184:
                        C1564.m5509();
                        if (C2375.m8065() <= 0) {
                            iM2761 = (C0619.m2761("ܶۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * 12233) ^ 1765466;
                            i = -1797825303;
                        } else {
                            iM2761 = (C0773.m3169("ۢۧ") + i4) * (-27);
                            i5 = ((iM2761 ^ i3) * (-26031)) ^ 1015078768;
                            i = -1458877927;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 499737478:
                    case 1307406751:
                        if (C1519.f5300 >= 0) {
                            iM2761 = (C0619.m2761("ܶۘ") ^ i3) * 37;
                            i5 = ((iM2761 ^ i4) * 12233) ^ 1765466;
                            i = -1797825303;
                        } else {
                            iM2761 = C0773.m3169("֨ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 3721) ^ 41351309;
                            i = -1542009495;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        if (C0269.f1558 > 0) {
                            iM2761 = (C0619.m2761("ۢۤ") + i4) * 75;
                            i5 = ((iM2761 ^ i3) * (-3513)) ^ 1017593867;
                            i = 726233575;
                            i7 = iM2761 ^ i;
                        }
                        break;
                }
            }
            iM3169 = (C0619.m2761("ܳ᩻") + i4) * 49;
            i5 = ((iM3169 ^ i3) * 19367) ^ (-197950051);
            i6 = 387255324;
        }
    }
}
