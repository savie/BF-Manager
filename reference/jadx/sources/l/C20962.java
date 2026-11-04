package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1W9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20962 {

    /* JADX INFO: renamed from: ۫ۛ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f67041 = {1529, 15423, 10691, -2245, 11266, 14478, 11330, -3465, -9802, -2575, -13955, -14438, 13109, 12594, 15609, -12914, 9762, 11255, -13173, -20946, -20935, -20945, -20946, -20935, -20935, -20952, -20946, -20935, -20951, -20946, -20935, -20951, -20953, -20946, -20935, -20951, -20934, -520, -15807, 9768, -8672, -14800, -15704, -13136, -16046, 10473, -14478, -16338, 14005, -8911, 11392, -10677, 7785, -19011, -18431, -18941, -31063, -18059, 19867, -31384, -19595, 21789, -30871, -21759, 17907, 7356, 7441, 7430, 7440, 7441, 7430, 7430, 7447, 7441, 7430, 7446, 7441, 7430, 7446, 7448, 7441, 7430, 7446, 7429, 5269, 10937, -10287, -10392, -13010, -11694, -10856, 13306, -12199, -7773, 8422, 12968, 13813, 8422, -6889, 2574, -1343, 5526, -31590, -31589, -31587, -31604, -31609, -31602, -31606, -31588, -31585, -31603, -31589, -31536, -31585, -31602, -31595, -31598, -31593, -31588, -31557, -31604, -31604, -31599, -31604, 9397, -19286, -19316, -19321, -19312, -19321, -19255, -19318, -19321, -19320, -19327, -19255, -19287, -19324, -19316, -19325, -19323, -19310, -19235, -19286, -19316, -19321, -19312, -19321, -19255, -19318, -19321, -19320, -19327, -19255, -19275, -19310, -19308, -19313, -19320, -19327, -19235, -19286, -19316, -19321, -19312, -19321, -19255, -19318, -19321, -19320, -19327, -19255, -19291, -19314, -19321, -19308, -19275, -19325, -19305, -19309, -19325, -19320, -19323, -19325, -19235, -19292, -19291, -19294, -19296, -19281, -19284, -19275, -19268, -19267, -19292, -19267, -19291, -19267, -19281, -19267, -19275, 3757, -5400, -19513, 28171, -31077, 28323, 26564, 29101};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23255 f67042;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Main f67043;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f67044;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1255 f67045;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8614 f67046;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f67047;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67048;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f67049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public TreeSet f67050;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23255 f67051;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47928(C20962 c20962, boolean[] zArr, C1255 c1255) {
        boolean z = false;
        int i = -393612529;
        int i2 = C4282.f15546;
        int i3 = C20932.f66974;
        int iM2761 = C0619.m2761("֡ۚ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 24233) ^ 1002543283;
        int i5 = 2077281725;
        while (true) {
            i = ((((i ^ i2) * 26899) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1757159671:
                case -264149947:
                    break;
                case -1533612296:
                case 809092375:
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ۚ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21015) ^ (-1012049505);
                        i5 = -823108002;
                    } else {
                        iM2761 = (C0619.m2761("ۚۖ") + i3) * 51;
                        i4 = ((iM2761 ^ i2) * (-10199)) ^ 1179408508;
                        i5 = -820948118;
                    }
                    break;
                case -1427062825:
                case 2059890591:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0773.m3169("۠᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 13355) ^ 292294345;
                        i5 = -2077919813;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩻᩹")) * 45;
                        i4 = ((iM2761 ^ i3) * (-7119)) ^ 1105737137;
                        i5 = 17843698;
                    }
                    break;
                case -1366766748:
                case 918644095:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩵ۡ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-16797)) ^ 1764231552;
                        i5 = -461003481;
                    } else {
                        iM2761 = C0773.m3169("ᩴۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5977) ^ (-1674583830);
                        i5 = 1458057007;
                    }
                    break;
                case -1179013543:
                case -245775210:
                    c20962.f67048 = true;
                    C3448.m11239(c1255, true);
                    c20962.f67048 = z;
                    break;
                case -1140406000:
                case 1730805555:
                    RunnableC0334.m2063();
                    if (!C17202.m40372()) {
                        iM2761 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31047)) ^ (-706644112);
                        i5 = -513427805;
                    } else {
                        iM2761 = (C0773.m3169("֨۠") + i2) * (-79);
                        i4 = ((iM2761 ^ i3) * 13797) ^ 1661047953;
                        i5 = 1387010941;
                    }
                    break;
                case -708586445:
                case 1239862297:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("۠᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 13355) ^ 292294345;
                        i5 = -2077919813;
                    } else {
                        iM2761 = C0773.m3169("ܳۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28201)) ^ 1931959607;
                        i5 = -907560401;
                    }
                    break;
                case -538498226:
                case -16356162:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("֨۠") + i2) * (-79);
                        i4 = ((iM2761 ^ i3) * 13797) ^ 1661047953;
                        i5 = 1387010941;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21865) ^ 881769354;
                        i5 = -1038313125;
                    }
                    break;
                case -476850624:
                case 1342273353:
                    if (!C17202.f56030) {
                        iM2761 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31047)) ^ (-706644112);
                        i5 = -513427805;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21015) ^ (-1012049505);
                        i5 = -823108002;
                    }
                    break;
                case -465799168:
                case 749857314:
                    C20932.m47848();
                    if (C3448.f11240 < 0) {
                        iM2761 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31047)) ^ (-706644112);
                        i5 = -513427805;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩵ۡ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-16797)) ^ 1764231552;
                        i5 = -461003481;
                    }
                    break;
                case -388980397:
                case 801444156:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("۠᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 13355) ^ 292294345;
                        i5 = -2077919813;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩵ۚ")) * 11;
                        i4 = ((iM2761 ^ i3) * 4061) ^ 805870236;
                        i5 = -1160705762;
                    }
                    break;
                case -314252501:
                case 570423883:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("۠᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 13355) ^ 292294345;
                        i5 = -2077919813;
                    } else {
                        iM2761 = C0773.m3169("᩹۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10903) ^ 1723677450;
                        i5 = -708206659;
                    }
                    break;
                case -74429341:
                case 1360834657:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31047)) ^ (-706644112);
                        i5 = -513427805;
                    } else {
                        iM2761 = (C0619.m2761("ܳۘ") ^ i2) * 73;
                        i4 = ((iM2761 ^ i3) * 15383) ^ 740774668;
                        i5 = -704476312;
                    }
                    break;
                case 674538926:
                case 1889969139:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۙܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31047)) ^ (-706644112);
                        i5 = -513427805;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܶ֡")) * (-113);
                        i4 = ((iM2761 ^ i2) * 7183) ^ (-1339674426);
                        i5 = 717340729;
                    }
                    break;
                case 700424358:
                case 962828712:
                    C3779.m12264();
                    break;
                case 1272399654:
                case 1898178265:
                    z = false;
                    if (zArr[0]) {
                        iM2761 = C0773.m3169("ܺ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22991) ^ 286029166;
                        i5 = -723370242;
                    } else {
                        iM2761 = C0619.m2761("ܺ۫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12711)) ^ 1921315446;
                        i5 = -1821016019;
                    }
                    break;
                case 1358586184:
                case 1917364951:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i3 - C0773.m3169("᩵ۡ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-16797)) ^ 1764231552;
                        i5 = -461003481;
                    } else {
                        iM2761 = C0619.m2761("᩷᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2625)) ^ (-864994427);
                        i5 = 1342761465;
                    }
                    break;
                default:
                    C2287.m7745();
                    iM2761 = (i3 - C0773.m3169("᩵ۡ")) * 71;
                    i4 = ((iM2761 ^ i2) * (-16797)) ^ 1764231552;
                    i5 = -461003481;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m47937(String str) throws C4866 {
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int iM3169;
        int i6;
        int i7;
        int iM2763;
        int i8;
        int i9;
        int i10 = C3690.f12684;
        int i11 = C3033.f9831;
        int iM31610 = C0773.m3169("ۡۜ") ^ i10;
        int i12 = ((iM31610 ^ i11) * 8313) ^ (-1831476331);
        String[] strArr = null;
        String strM6365 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i13 = iM31610 ^ (-1535614360);
        ArrayList arrayList = null;
        int length = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 581387330;
        char c2 = 0;
        C11965 c11965M44162 = null;
        int i19 = 0;
        while (true) {
            i18 = i13 ^ (i12 & (((i18 ^ i11) * 7519) >> 31));
            switch (i18) {
                case -1702101229:
                case -550155185:
                    arrayList = arrayList;
                    s = s;
                    s2 = s2;
                    sArr = f67041;
                    c2 = 202;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("ᩴᩴ") + i11) * (-43);
                        i3 = ((iM2761 ^ i10) * (-13533)) ^ (-248883798);
                        i4 = 384496311;
                    } else {
                        iM2761 = C0619.m2761("ۗۨ") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-29681)) ^ 2034451542;
                        i4 = -1591083060;
                    }
                    int i20 = iM2761 ^ i4;
                    s = s;
                    s2 = s2;
                    i13 = i20;
                    i12 = i3;
                    arrayList = arrayList;
                    break;
                case -1646647965:
                case 525007258:
                    s = s;
                    s2 = s2;
                    arrayList = new ArrayList();
                    sArr2 = f67041;
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۨܶ") ^ i10;
                        i6 = ((iM3169 ^ i11) * 13723) ^ (-317144379);
                        i7 = 1361532578;
                    } else {
                        iM3169 = C0773.m3169("ۗܰ") ^ i11;
                        i6 = ((iM3169 ^ i10) * 12411) ^ 1292871340;
                        i7 = -558245407;
                    }
                    int i21 = iM3169 ^ i7;
                    s2 = s2;
                    short s3 = s;
                    i13 = i21;
                    i12 = i6;
                    s = s3;
                    break;
                case -1614315914:
                case 1525686696:
                    C0950.m3785();
                    if (C3033.f9831 >= 0) {
                        arrayList = arrayList;
                        s = s;
                        s2 = s2;
                        iM2761 = (C0619.m2761("ᩴᩴ") + i11) * (-43);
                        i3 = ((iM2761 ^ i10) * (-13533)) ^ (-248883798);
                        i4 = 384496311;
                        int i22 = iM2761 ^ i4;
                        s = s;
                        s2 = s2;
                        i13 = i22;
                        i12 = i3;
                        arrayList = arrayList;
                    }
                    iM2762 = (i10 - C0619.m2761("ۚܽ")) * (-79);
                    i3 = ((iM2762 ^ i11) * 10491) ^ (-1570639091);
                    i5 = -1978334696;
                    i13 = iM2762 ^ i5;
                    i12 = i3;
                    arrayList = arrayList;
                    break;
                case -1613077411:
                case 1153970046:
                    s = sArr[c2];
                    s2 = 13732;
                    if (C3690.f12684 <= 0) {
                        iM2762 = (i10 - C0619.m2761("ۚܽ")) * (-79);
                        i3 = ((iM2762 ^ i11) * 10491) ^ (-1570639091);
                        i5 = -1978334696;
                    } else {
                        iM2762 = C0619.m2761("᩻᩻") ^ i11;
                        i3 = ((iM2762 ^ i10) * (-881)) ^ 1801289036;
                        i5 = 1475235883;
                    }
                    i13 = iM2762 ^ i5;
                    i12 = i3;
                    arrayList = arrayList;
                    break;
                case -1549983675:
                case -232421607:
                    C1321.m4852();
                    if (C2288.f7433 <= 0) {
                        s = s;
                        s2 = s2;
                        iM3169 = C0773.m3169("ۗܰ") ^ i11;
                        i6 = ((iM3169 ^ i10) * 12411) ^ 1292871340;
                        i7 = -558245407;
                        int i23 = iM3169 ^ i7;
                        s2 = s2;
                        short s4 = s;
                        i13 = i23;
                        i12 = i6;
                        s = s4;
                    } else {
                        s = s;
                        int iM31611 = C0773.m3169("᩵᩺") ^ i10;
                        i2 = ((iM31611 ^ i11) * 13177) ^ (-731967504);
                        s = s;
                        i13 = iM31611 ^ (-239687702);
                        i12 = i2;
                    }
                    break;
                case -1314735448:
                case -817453009:
                    C4282.m13644();
                    C2375.m8065();
                    return null;
                case -1295716799:
                case 305635260:
                    i14++;
                    iM3169 = C0619.m2761("۟ܽ") ^ i11;
                    i6 = ((iM3169 ^ i10) * 28719) ^ (-258922503);
                    i7 = -471683374;
                    int i24 = iM3169 ^ i7;
                    s2 = s2;
                    short s5 = s;
                    i13 = i24;
                    i12 = i6;
                    s = s5;
                    break;
                case -1209943949:
                case 205410630:
                    i = i15;
                    s = s;
                    s2 = s2;
                    if (i14 < length) {
                        iM2763 = C0619.m2761("ܰ֫") ^ i11;
                        i8 = ((iM2763 ^ i10) * 13201) ^ 356573152;
                        i9 = 1414496760;
                    } else {
                        iM2763 = C0619.m2761("ܳۡ") ^ i10;
                        i8 = ((iM2763 ^ i11) * 31497) ^ (-468170417);
                        i9 = 209243218;
                    }
                    s = s;
                    s2 = s2;
                    i13 = iM2763 ^ i9;
                    i12 = i8;
                    i15 = i;
                    break;
                case -1204732703:
                case -174417829:
                    s = s;
                    s2 = s2;
                    if (((s * s) + 47141956) - (s * s2) < 0) {
                        iM3169 = (C0619.m2761("ۛۗ") + i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM3169 ^ i11) * 17807) ^ (-1797421539);
                        i7 = 1058814811;
                    } else {
                        iM3169 = C0773.m3169("ۡۗ") ^ i11;
                        i6 = ((iM3169 ^ i10) * (-3023)) ^ 1095933229;
                        i7 = -1554233093;
                    }
                    int i25 = iM3169 ^ i7;
                    s2 = s2;
                    short s6 = s;
                    i13 = i25;
                    i12 = i6;
                    s = s6;
                    break;
                case -1147976151:
                case 1561531528:
                    i = i15;
                    s = s;
                    s2 = s2;
                    strM6365 = RunnableC1848.m6365(strArr[i14]);
                    if (C1564.m5512(strM6365)) {
                        iM2763 = (C0773.m3169("᩹ۧ") ^ i11) * (-27);
                        i8 = ((iM2763 ^ i10) * 14855) ^ (-938472271);
                        i9 = -1588597880;
                    } else {
                        iM2763 = C0619.m2761("۟۬") ^ i10;
                        i8 = ((iM2763 ^ i11) * (-23199)) ^ 5645834;
                        i9 = 423215241;
                    }
                    s = s;
                    s2 = s2;
                    i13 = iM2763 ^ i9;
                    i12 = i8;
                    i15 = i;
                    break;
                case -1058860426:
                case 1283503943:
                    i16 = 60130;
                    iM3169 = C0773.m3169("᩷᩷") ^ i11;
                    i6 = ((iM3169 ^ i10) * (-25025)) ^ 308680367;
                    i7 = -258632496;
                    int i26 = iM3169 ^ i7;
                    s2 = s2;
                    short s7 = s;
                    i13 = i26;
                    i12 = i6;
                    s = s7;
                    break;
                case -894810890:
                case -533173330:
                    C1519.m5406(arrayList, c11965M44162);
                    i = i15;
                    s = s;
                    s2 = s2;
                    iM2763 = (C0773.m3169("᩹ۧ") ^ i11) * (-27);
                    i8 = ((iM2763 ^ i10) * 14855) ^ (-938472271);
                    i9 = -1588597880;
                    s = s;
                    s2 = s2;
                    i13 = iM2763 ^ i9;
                    i12 = i8;
                    i15 = i;
                    break;
                case -340637049:
                case 825883338:
                    String[] strArrM5508 = C1564.m5508(str, C0950.m3780(sArr2, i17, i15, i16));
                    length = strArrM5508.length;
                    c = 0;
                    i14 = 0;
                    strArr = strArrM5508;
                    iM3169 = C0619.m2761("۟ܽ") ^ i11;
                    i6 = ((iM3169 ^ i10) * 28719) ^ (-258922503);
                    i7 = -471683374;
                    int i27 = iM3169 ^ i7;
                    s2 = s2;
                    short s8 = s;
                    i13 = i27;
                    i12 = i6;
                    s = s8;
                    break;
                case -240547247:
                case 2017717496:
                    i = i15;
                    s = s;
                    s2 = s2;
                    Object[] objArr = new Object[i19];
                    objArr[c] = strM6365;
                    short[] sArr3 = f67041;
                    if (C1783.f6087 <= 0 || C2702.f8586 <= 0) {
                        iM2763 = C0619.m2761("ܰ᩷") ^ i10;
                        i8 = ((iM2763 ^ i11) * (-21705)) ^ (-1018085416);
                        i9 = 2004276395;
                        s = s;
                        s2 = s2;
                        i13 = iM2763 ^ i9;
                        i12 = i8;
                        i15 = i;
                    } else {
                        int iM31612 = C0773.m3169(C2966.m9670(sArr3, 204, 3, i16));
                        if (RunnableC0334.f1808 > 0) {
                            throw new C4866(C17202.m40366(iM31612 ^ 2118986371, objArr));
                        }
                        i15 = i;
                        iM3169 = C0773.m3169("ۗܰ") ^ i11;
                        i6 = ((iM3169 ^ i10) * 12411) ^ 1292871340;
                        i7 = -558245407;
                        int i28 = iM3169 ^ i7;
                        s2 = s2;
                        short s9 = s;
                        i13 = i28;
                        i12 = i6;
                        s = s9;
                    }
                    break;
                case -102304617:
                case 847997756:
                    return arrayList;
                case 138625189:
                case 1876216460:
                    s = s;
                    s2 = s2;
                    i17 = 203;
                    i15 = 1;
                    if (C3033.m9845() > 0) {
                        iM3169 = (i10 - C0773.m3169("ۘۨ")) * (-99);
                        i6 = ((iM3169 ^ i11) * (-1097)) ^ (-1071479109);
                        i7 = 1139811735;
                        int i29 = iM3169 ^ i7;
                        s2 = s2;
                        short s10 = s;
                        i13 = i29;
                        i12 = i6;
                        s = s10;
                    } else {
                        arrayList = arrayList;
                        iM2761 = (C0619.m2761("ᩴᩴ") + i11) * (-43);
                        i3 = ((iM2761 ^ i10) * (-13533)) ^ (-248883798);
                        i4 = 384496311;
                        int i210 = iM2761 ^ i4;
                        s = s;
                        s2 = s2;
                        i13 = i210;
                        i12 = i3;
                        arrayList = arrayList;
                    }
                    break;
                case 144793631:
                case 828711282:
                    if (C1146.f4234 >= 0) {
                        iM2762 = (i10 - C0619.m2761("ۚܽ")) * (-79);
                        i3 = ((iM2762 ^ i11) * 10491) ^ (-1570639091);
                        i5 = -1978334696;
                        i13 = iM2762 ^ i5;
                        i12 = i3;
                        arrayList = arrayList;
                    } else {
                        s = s;
                        int iM31613 = C0773.m3169("᩵᩺") ^ i10;
                        i2 = ((iM31613 ^ i11) * 13177) ^ (-731967504);
                        s = s;
                        i13 = iM31613 ^ (-239687702);
                        i12 = i2;
                    }
                    break;
                case 422025397:
                case 1908337253:
                    C3998.m12920();
                    C2834.m9344();
                    s = s;
                    int iM31614 = C0773.m3169("᩵᩺") ^ i10;
                    i2 = ((iM31614 ^ i11) * 13177) ^ (-731967504);
                    s = s;
                    i13 = iM31614 ^ (-239687702);
                    i12 = i2;
                    break;
                case 667572740:
                case 1809331913:
                    i = i15;
                    s = s;
                    s2 = s2;
                    i19 = 1;
                    iM2763 = C0619.m2761("ۛܶ") ^ i11;
                    i8 = ((iM2763 ^ i10) * 20905) ^ 2143490947;
                    i9 = -742011214;
                    s = s;
                    s2 = s2;
                    i13 = iM2763 ^ i9;
                    i12 = i8;
                    i15 = i;
                    break;
                case 700399984:
                case 1959022303:
                    i16 = 35583;
                    iM3169 = C0773.m3169("᩷᩷") ^ i11;
                    i6 = ((iM3169 ^ i10) * (-25025)) ^ 308680367;
                    i7 = -258632496;
                    int i211 = iM3169 ^ i7;
                    s2 = s2;
                    short s11 = s;
                    i13 = i211;
                    i12 = i6;
                    s = s11;
                    break;
                case 1008285347:
                case 1911818681:
                    i = i15;
                    s = s;
                    s2 = s2;
                    try {
                        c11965M44162 = C19051.m44162(strM6365);
                        C3099.m10086(c11965M44162);
                        iM2763 = (C0773.m3169("ۧۢ") + i11) * 63;
                        i8 = ((iM2763 ^ i10) * 28269) ^ (-1132613485);
                        i9 = 1182522949;
                    } catch (Exception unused) {
                        iM2763 = (i10 - C0773.m3169("᩵ۚ")) * (-25);
                        i8 = ((iM2763 ^ i11) * (-4779)) ^ 257685354;
                        i9 = 723970892;
                    }
                    s = s;
                    s2 = s2;
                    i13 = iM2763 ^ i9;
                    i12 = i8;
                    i15 = i;
                    break;
                case 1026149959:
                case 1505750873:
                    Object[] objArr2 = new Object[i19];
                    objArr2[c] = strM6365;
                    s = s;
                    short[] sArr4 = f67041;
                    if (AbstractC3624.f12429 > 0) {
                        s2 = s2;
                        if (C2287.f7432 < 0) {
                            i = i15;
                            int iM31615 = C0773.m3169(C0619.m2756(sArr4, 207, 3, i16));
                            if (C1343.f4799 == 0) {
                                throw new C4866(C3734.m12148(iM31615 ^ 2098211058, objArr2));
                            }
                            i15 = i;
                            iM3169 = C0773.m3169("ۗܰ") ^ i11;
                            i6 = ((iM3169 ^ i10) * 12411) ^ 1292871340;
                            i7 = -558245407;
                            int i212 = iM3169 ^ i7;
                            s2 = s2;
                            short s12 = s;
                            i13 = i212;
                            i12 = i6;
                            s = s12;
                        } else {
                            s = s;
                            s2 = s2;
                            iM2762 = (i10 - C0619.m2761("ۚܽ")) * (-79);
                            i3 = ((iM2762 ^ i11) * 10491) ^ (-1570639091);
                            i5 = -1978334696;
                            i13 = iM2762 ^ i5;
                            i12 = i3;
                            arrayList = arrayList;
                        }
                    } else {
                        int iM31616 = C0773.m3169("᩵᩺") ^ i10;
                        i2 = ((iM31616 ^ i11) * 13177) ^ (-731967504);
                        s = s;
                        i13 = iM31616 ^ (-239687702);
                        i12 = i2;
                    }
                    break;
                case 1092157182:
                case 1910540882:
                    i = i15;
                    s = s;
                    s2 = s2;
                    if (m47931(c11965M44162)) {
                        iM2763 = (C0619.m2761("ܳ᩷") + i11) * 83;
                        i8 = ((iM2763 ^ i10) * 7755) ^ 1760472086;
                        i9 = 612953060;
                    } else {
                        iM2763 = (i10 - C0619.m2761("᩵᩹")) * 83;
                        i8 = ((iM2763 ^ i11) * 8219) ^ 675165684;
                        i9 = 1047813549;
                    }
                    s = s;
                    s2 = s2;
                    i13 = iM2763 ^ i9;
                    i12 = i8;
                    i15 = i;
                    break;
                default:
                    if (C3690.f12684 > 0) {
                        s = s;
                        int iM31617 = C0773.m3169("᩵᩺") ^ i10;
                        i2 = ((iM31617 ^ i11) * 13177) ^ (-731967504);
                        s = s;
                        i13 = iM31617 ^ (-239687702);
                    } else {
                        int iM31618 = (C0773.m3169("ۨۗ") + i10) * 99;
                        i2 = ((iM31618 ^ i11) * 5755) ^ (-1555056029);
                        i13 = iM31618 ^ (-945764613);
                    }
                    i12 = i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47924(C20962 c20962, C1255 c1255, C1255 c1256, List list, C9651 c9651, boolean z) {
        int i = 669650605;
        int i2 = C1826.f6190;
        int i3 = C4238.f15451;
        int iM2761 = (C0619.m2761("ۗۛ") + i3) * 17;
        int i4 = ((iM2761 ^ i2) * (-12069)) ^ 1707326012;
        int i5 = 1850255754;
        while (true) {
            i = ((((i ^ i2) * (-18155)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1847933407:
                case -1271187839:
                    C1564.m5509();
                    if (C1343.m4943()) {
                        iM2761 = (C0773.m3169("ۧۖ") ^ i2) * (-61);
                        i4 = ((iM2761 ^ i3) * (-15841)) ^ (-1380030742);
                        i5 = -616746526;
                    } else {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i3) * 65;
                        i4 = ((iM2761 ^ i2) * 4221) ^ (-2113158109);
                        i5 = -2042751107;
                    }
                    break;
                case -1832291845:
                case -1315008558:
                    c20962.m47929(C13473.m33141(c1255), C2485.m8360(c1256), list, c9651, z);
                    break;
                case -1558008784:
                case -157446874:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ۢܳ") ^ i3) * 29;
                        i4 = ((iM2761 ^ i2) * (-20185)) ^ (-933372490);
                        i5 = -159219266;
                    } else {
                        iM2761 = C0773.m3169("᩹᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3531) ^ (-1877625950);
                        i5 = -646969816;
                    }
                    break;
                case -1453785232:
                case -1419988039:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i3) * 65;
                        i4 = ((iM2761 ^ i2) * 4221) ^ (-2113158109);
                        i5 = -2042751107;
                    } else {
                        iM2761 = C0773.m3169("۬ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22633)) ^ 1189811212;
                        i5 = -869301928;
                    }
                    break;
                case -1351435687:
                case 2123506245:
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ܿۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31581) ^ 1809317079;
                        i5 = 1076516724;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֡ᩴ")) * 83;
                        i4 = ((iM2761 ^ i3) * 11617) ^ (-1052179019);
                        i5 = 37067677;
                    }
                    break;
                case -596276407:
                case 1146490982:
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * 24737) ^ 1344017278;
                        i5 = 925558423;
                    } else {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i3) * 65;
                        i4 = ((iM2761 ^ i2) * 4221) ^ (-2113158109);
                        i5 = -2042751107;
                    }
                    break;
                case -493919159:
                case 229930861:
                    C2834.m9344();
                    break;
                case -278899233:
                case 1408843992:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * 24737) ^ 1344017278;
                        i5 = 925558423;
                    } else {
                        iM2761 = C0619.m2761("ۜۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11603)) ^ (-297389645);
                        i5 = -879275461;
                    }
                    break;
                case -106417549:
                case 1261013604:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * 24737) ^ 1344017278;
                        i5 = 925558423;
                    } else {
                        iM2761 = C0619.m2761("ܺܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27903) ^ (-1486697473);
                        i5 = -244364412;
                    }
                    break;
                case 387518965:
                case 1282486615:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("ۗ۬") ^ i3) * (-85);
                        i4 = ((iM2761 ^ i2) * 24737) ^ 1344017278;
                        i5 = 925558423;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܺۚ")) * 57;
                        i4 = ((iM2761 ^ i2) * (-27909)) ^ (-1884451371);
                        i5 = 1462830130;
                    }
                    break;
                case 421108281:
                case 1875145761:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("ۢܳ") ^ i3) * 29;
                        i4 = ((iM2761 ^ i2) * (-20185)) ^ (-933372490);
                        i5 = -159219266;
                    } else {
                        iM2761 = C0773.m3169("ۧ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22831)) ^ (-1419092343);
                        i5 = -164842894;
                    }
                    break;
                case 480030190:
                case 1675289955:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i2 - C0619.m2761("֡ᩴ")) * 83;
                        i4 = ((iM2761 ^ i3) * 11617) ^ (-1052179019);
                        i5 = 37067677;
                    } else {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i3) * 65;
                        i4 = ((iM2761 ^ i2) * 4221) ^ (-2113158109);
                        i5 = -2042751107;
                    }
                    break;
                case 772485786:
                case 1547418047:
                    C1564.m5509();
                    RunnableC3055.m9933();
                    iM2761 = (C0773.m3169("ۙۖ") ^ i3) * 65;
                    i4 = ((iM2761 ^ i2) * 4221) ^ (-2113158109);
                    i5 = -2042751107;
                    break;
                case 1880999485:
                case 1970564907:
                    if (C1783.m6232()) {
                        iM2761 = C0773.m3169("᩺ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3931)) ^ 2032968424;
                        i5 = 501789331;
                    } else {
                        iM2761 = (C0619.m2761("ۢܳ") ^ i3) * 29;
                        i4 = ((iM2761 ^ i2) * (-20185)) ^ (-933372490);
                        i5 = -159219266;
                    }
                    break;
                case 2056806663:
                case 2135727235:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0619.m2761("ۢܳ") ^ i3) * 29;
                        i4 = ((iM2761 ^ i2) * (-20185)) ^ (-933372490);
                        i5 = -159219266;
                    } else {
                        iM2761 = C0619.m2761("ܶۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22375) ^ 1895267740;
                        i5 = -1954185125;
                    }
                    break;
                default:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ۙۖ") ^ i3) * 65;
                        i4 = ((iM2761 ^ i2) * 4221) ^ (-2113158109);
                        i5 = -2042751107;
                    } else {
                        iM2761 = C0773.m3169("֫ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 11179) ^ 1733410661;
                        i5 = 351814477;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47931(l.InterfaceC4859 r33) {
        /*
            Method dump skipped, instruction units count: 3290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20962.m47931(l.ۙۧۛ):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public C20962(l.AbstractC22044 r49, l.C8614 r50, java.lang.String r51) {
        /*
            Method dump skipped, instruction units count: 4004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20962.<init>(l.᩷ۨᩴ, l.۠ۨܳ, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47927(C20962 c20962, boolean z) {
        C23255 c23255 = null;
        int i = 0;
        int i2 = 421946644;
        int i3 = C0487.f2131;
        int i4 = C3448.f11240;
        int iM3169 = (C0773.m3169("۠ۗ") + i4) * 99;
        int i5 = ((iM3169 ^ i3) * 13469) ^ (-1964947051);
        int i6 = 590055455;
        while (true) {
            i2 = ((((i2 ^ i3) * 15381) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1976653112:
                case -24125092:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ۛܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-8749)) ^ 1058563396;
                        i6 = -972802174;
                    } else {
                        iM3169 = (C0773.m3169("᩺᩸") ^ i4) * (-41);
                        i5 = ((iM3169 ^ i3) * 8389) ^ (-253846334);
                        i6 = -1835287388;
                    }
                    break;
                case -1904705277:
                case 805664307:
                    if (C20932.m47848() != 0) {
                        iM3169 = (i4 - C0773.m3169("᩸᩷")) * 81;
                        i5 = ((iM3169 ^ i3) * (-1285)) ^ 2065110687;
                        i6 = 203440122;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۘ֡")) * (-13);
                        i5 = ((iM3169 ^ i3) * 1551) ^ (-1566662091);
                        i6 = 1247068759;
                    }
                    break;
                case -845611143:
                case 580351047:
                    C4282.m13644();
                    C3448.m11248();
                    iM3169 = C0773.m3169("ۛܺ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-8749)) ^ 1058563396;
                    i6 = -972802174;
                    break;
                case -780817627:
                case 1083175858:
                    C0487.m2356();
                    C2702.m8876();
                    break;
                case -735570000:
                case 124260906:
                    RunnableC1848.m6360();
                    if (C23916.f77426 > 0) {
                        iM3169 = C0773.m3169("ۢ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15183)) ^ 1886217678;
                        i6 = -1064228445;
                    } else {
                        iM3169 = (C0619.m2761("֡ۚ") ^ i3) * 63;
                        i5 = ((iM3169 ^ i4) * (-21235)) ^ 1737973179;
                        i6 = 143811206;
                    }
                    break;
                case -646727097:
                case 1919454765:
                    C0487.m2356();
                    if (!C2878.f9462) {
                        iM3169 = C0773.m3169("ۛܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-8749)) ^ 1058563396;
                        i6 = -972802174;
                    } else {
                        iM3169 = (C0619.m2761("֡ۚ") ^ i3) * 63;
                        i5 = ((iM3169 ^ i4) * (-21235)) ^ 1737973179;
                        i6 = 143811206;
                    }
                    break;
                case -592818455:
                case 1569236646:
                    if (C3779.m12264()) {
                        iM3169 = (C0773.m3169("֫۟") ^ i4) * 55;
                        i5 = ((iM3169 ^ i3) * (-22265)) ^ (-803556481);
                        i6 = -1178547321;
                    } else {
                        iM3169 = C0619.m2761("᩷ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23779) ^ 341903484;
                        i6 = 270146542;
                    }
                    break;
                case -393421565:
                case 221701958:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("᩷ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23779) ^ 341903484;
                        i6 = 270146542;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۙ᩹")) * (-105);
                        i5 = ((iM3169 ^ i4) * 9407) ^ (-939451523);
                        i6 = -1103000319;
                    }
                    break;
                case -338806694:
                case 284877912:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ۛܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-8749)) ^ 1058563396;
                        i6 = -972802174;
                    } else {
                        iM3169 = (C0773.m3169("᩷᩸") + i4) * (-37);
                        i5 = ((iM3169 ^ i3) * 16165) ^ (-572540452);
                        i6 = 1642836539;
                    }
                    break;
                case -326913149:
                case 1308165090:
                    C2485.m8358(c23255, i);
                    break;
                case -269752251:
                case 1729157950:
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0773.m3169("ۛܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-8749)) ^ 1058563396;
                        i6 = -972802174;
                    } else {
                        iM3169 = C0619.m2761("ܿۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11785) ^ 2058015623;
                        i6 = -1654715819;
                    }
                    break;
                case -135099224:
                case 1457703790:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۢ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15183)) ^ 1886217678;
                        i6 = -1064228445;
                    } else {
                        iM3169 = (C0773.m3169("ܽ᩻") ^ i4) * (-69);
                        i5 = ((iM3169 ^ i3) * 22225) ^ 268625611;
                        i6 = -1951667731;
                    }
                    break;
                case 201496187:
                case 478156562:
                    i = 8;
                    iM3169 = (i4 - C0773.m3169("ۤ֡")) * (-5);
                    i5 = ((iM3169 ^ i3) * 27379) ^ 2053859952;
                    i6 = 996842257;
                    break;
                case 337929077:
                case 685263163:
                    C2375.m8065();
                    if (!C3690.m11987()) {
                        iM3169 = (C0619.m2761("֡ۚ") ^ i3) * 63;
                        i5 = ((iM3169 ^ i4) * (-21235)) ^ 1737973179;
                        i6 = 143811206;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩸᩷")) * 81;
                        i5 = ((iM3169 ^ i3) * (-1285)) ^ 2065110687;
                        i6 = 203440122;
                    }
                    break;
                case 381308307:
                case 1523451961:
                    i = 0;
                    iM3169 = (i4 - C0773.m3169("ۤ֡")) * (-5);
                    i5 = ((iM3169 ^ i3) * 27379) ^ 2053859952;
                    i6 = 996842257;
                    break;
                case 464171710:
                case 1499807756:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۢ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15183)) ^ 1886217678;
                        i6 = -1064228445;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۨ") + i3) * 65;
                        i5 = ((iM3169 ^ i4) * 2645) ^ 1949820611;
                        i6 = -798620512;
                    }
                    break;
                case 619907147:
                case 1693279513:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0773.m3169("ۢ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-15183)) ^ 1886217678;
                        i6 = -1064228445;
                    } else {
                        iM3169 = (C0619.m2761("ۗᩴ") + i3) * 47;
                        i5 = ((iM3169 ^ i4) * 11529) ^ (-218247979);
                        i6 = -1014016168;
                    }
                    break;
                case 1552924852:
                case 2115549328:
                    if (C3998.m12920()) {
                        iM3169 = C0773.m3169("ۢ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 13483) ^ 436975209;
                        i6 = 126581183;
                    } else {
                        iM3169 = C0619.m2761("᩷ᩳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23779) ^ 341903484;
                        i6 = 270146542;
                    }
                    break;
                default:
                    c23255 = c20962.f67051;
                    if (z) {
                        iM3169 = C0619.m2761("۟ᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-5313)) ^ 2037134175;
                        i6 = 1304404052;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۗ") + i4) * (-117);
                        i5 = ((iM3169 ^ i3) * (-6167)) ^ 111209801;
                        i6 = -934099158;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x02a8 A[PHI: r21
      0x02a8: PHI (r21v16 int) = (r21v5 int), (r21v14 int), (r21v20 int) binds: [B:58:0x028d, B:22:0x00a8, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47925(C20962 c20962, final C1255 c1255, boolean z) {
        int iM2761;
        int i;
        int i2;
        int i3;
        short[] sArr;
        int iM2762;
        int i4;
        short s;
        int i5;
        int iM3169;
        int i6;
        int iM2763;
        int i7;
        final C20962 c20963 = c20962;
        int i8 = C0773.f2792;
        int i9 = AbstractC0116.f1064;
        int iM31610 = (C0773.m3169("ܺܺ") + i8) * 89;
        int i10 = ((iM31610 ^ i9) * 24561) ^ 1636035637;
        C2361 c2361M3794 = null;
        Object obj = null;
        String strM9670 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i11 = iM31610 ^ (-1187645063);
        int iM31611 = 0;
        int i12 = 0;
        int i13 = 0;
        int iM2764 = 0;
        int i14 = 0;
        DialogInterfaceOnClickListenerC23081 dialogInterfaceOnClickListenerC23081 = null;
        int i15 = 0;
        int i16 = -1139128619;
        short s2 = 0;
        final boolean[] zArr = null;
        int i17 = 0;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i9) * (-21095)) >> 31));
            switch (i16) {
                case -2058462941:
                case 823086265:
                    i17 = 1;
                    zArr = new boolean[]{false};
                    if (C17202.f56030) {
                        int iM31612 = C0773.m3169("᩵ۧ") ^ i8;
                        i11 = iM31612 ^ (-1770859391);
                        i10 = ((iM31612 ^ i9) * (-14065)) ^ (-1671298285);
                        i17 = 1;
                    } else {
                        iM2761 = (i8 - C0773.m3169("۬ۨ")) * 3;
                        i17 = i17;
                        i = ((iM2761 ^ i9) * (-20053)) ^ (-720478783);
                        i2 = 2142064545;
                        i4 = i17;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        i17 = i4;
                    }
                    break;
                case -2048039776:
                case 1616748920:
                    i17 = i17;
                    s = s2;
                    sArr2 = f67041;
                    if (C1080.m4050()) {
                        iM3169 = C0773.m3169("ۤۢ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-31195)) ^ 252365258;
                        i6 = -601950017;
                        i5 = iM3169 ^ i6;
                        s2 = s;
                        i17 = i17;
                    } else {
                        int iM2765 = (C0619.m2761("ܳ᩻") ^ i9) * 127;
                        i10 = ((iM2765 ^ i8) * (-5523)) ^ (-2099618754);
                        i5 = iM2765 ^ 172412461;
                        s2 = s;
                        i17 = i17;
                        dialogInterfaceOnClickListenerC23081 = null;
                    }
                    i11 = i5;
                    c20963 = c20962;
                    break;
                case -2021153408:
                case -711679108:
                    i15 = 45529;
                    iM2761 = C0619.m2761("ܰ֨") ^ i9;
                    i = ((iM2761 ^ i8) * (-26515)) ^ 818535190;
                    i2 = -1340659433;
                    i4 = i17;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    i17 = i4;
                    break;
                case -1984957969:
                case -131732095:
                    C1321.m4857(c2361M3794, C0619.m2761(strM9670) ^ 2129891279);
                    if (C23916.f77426 > 0) {
                        dialogInterfaceOnClickListenerC23081 = new DialogInterfaceOnClickListenerC23081(i17, zArr);
                        i17 = i17;
                        iM2764 = C0619.m2761(C3033.m9847(f67041, 91, 3, i15));
                        if (C17202.f56030) {
                            iM2761 = C0619.m2761("֡۟") ^ i8;
                            i = ((iM2761 ^ i9) * (-4231)) ^ (-1463993981);
                            i2 = 1245261144;
                        } else {
                            i17 = i17;
                            iM2761 = (i8 - C0773.m3169("۬ۨ")) * 3;
                            i17 = i17;
                            i = ((iM2761 ^ i9) * (-20053)) ^ (-720478783);
                            i2 = 2142064545;
                        }
                        i4 = i17;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        i17 = i4;
                    } else {
                        i17 = i17;
                        s = s2;
                        int iM2766 = (C0619.m2761("ܳ᩻") ^ i9) * 127;
                        i10 = ((iM2766 ^ i8) * (-5523)) ^ (-2099618754);
                        i5 = iM2766 ^ 172412461;
                        s2 = s;
                        i17 = i17;
                        dialogInterfaceOnClickListenerC23081 = null;
                        i11 = i5;
                        c20963 = c20962;
                    }
                    break;
                case -1846135779:
                case -606004076:
                    iM31611 = 2099490107 ^ C0773.m3169(RunnableC3646.m11809(sArr4, i14, 3, i15));
                    if (C3998.f13671 != 0) {
                        obj = null;
                        int iM31613 = C0773.m3169("֨ᩳ") ^ i8;
                        i11 = iM31613 ^ 1173597346;
                        i10 = ((iM31613 ^ i9) * (-11669)) ^ 1187177818;
                        sArr4 = sArr4;
                    } else {
                        int iM2767 = (C0619.m2761("ۘ᩵") + i9) * 33;
                        i11 = iM2767 ^ 1061673824;
                        i10 = ((iM2767 ^ i8) * (-1383)) ^ 1459825361;
                        obj = null;
                    }
                    break;
                case -1404222481:
                case -910977721:
                    i3 = i17;
                    sArr = sArr3;
                    iM2762 = C0619.m2761(C4282.m13650(sArr, 85, 3, i15));
                    if (C1564.m5509() > 0) {
                        int iM31614 = C0773.m3169("ۤۛ") ^ i8;
                        sArr3 = sArr;
                        i12 = iM2762;
                        i10 = ((iM31614 ^ i9) * (-31271)) ^ (-281589886);
                        i13 = 2101741450;
                        i4 = i3;
                        i11 = iM31614 ^ 594393777;
                        i17 = i4;
                    } else {
                        i13 = 2101741450;
                        int iM31615 = (C0773.m3169("ۗ۫") + i8) * 85;
                        int i18 = iM2762;
                        i10 = ((iM31615 ^ i9) * (-31631)) ^ 398334012;
                        int i19 = i3;
                        i11 = iM31615 ^ 1334859203;
                        i17 = i19;
                        sArr3 = sArr;
                        i12 = i18;
                    }
                    break;
                case -1367319448:
                case 1415936981:
                    i17 = i17;
                    s2 = sArr2[84];
                    if (AbstractC0641.f2496 >= 0) {
                        iM2763 = (C0619.m2761("ۘۜ") ^ i9) * 87;
                        i10 = ((iM2763 ^ i8) * 7553) ^ (-1423363473);
                        i7 = 1228275421;
                    } else {
                        iM2763 = (i9 - C0619.m2761("ۨ֨")) * (-63);
                        i10 = ((iM2763 ^ i8) * (-32521)) ^ 333337869;
                        i7 = 279767146;
                    }
                    i5 = iM2763 ^ i7;
                    i17 = i17;
                    i11 = i5;
                    c20963 = c20962;
                    break;
                case -1218794471:
                case 1168905624:
                    RunnableC1848.m6359(c2361M3794, iM31611, obj);
                    c2361M3794.m8004(new DialogInterface.OnDismissListener(c20963) { // from class: l.ۨ֨ۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C20962 f38737;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            boolean[] zArr2 = null;
                            int i20 = 551017409;
                            int i21 = C3099.f10023;
                            int i22 = C3734.f12817;
                            int iM2768 = C0619.m2761("ᩴ᩶") ^ i22;
                            int i23 = ((iM2768 ^ i21) * (-517)) ^ (-945910073);
                            int i24 = 2050456631;
                            while (true) {
                                i20 = ((((i20 ^ i21) * 30387) >> 31) & i23) ^ (iM2768 ^ i24);
                                switch (i20) {
                                    case -2092818831:
                                    case -1725555475:
                                        if (C2834.m9344() >= 0) {
                                            iM2768 = C0773.m3169("᩶ۖ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 26433) ^ 1227203527;
                                            i24 = -1415065626;
                                        } else {
                                            iM2768 = (i21 - C0619.m2761("᩸ۜ")) * (-125);
                                            i23 = ((iM2768 ^ i22) * (-12065)) ^ (-624884754);
                                            i24 = 1238313784;
                                        }
                                        break;
                                    case -2013077111:
                                    case 1754969374:
                                        C1146.m4231();
                                        if (C2354.f7599 >= 0) {
                                            iM2768 = (C0619.m2761("ۢۖ") + i21) * (-7);
                                            i23 = ((iM2768 ^ i22) * 23931) ^ 729760583;
                                            i24 = -1343032407;
                                        } else {
                                            iM2768 = C0619.m2761("֡۟") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 3905) ^ 822508538;
                                            i24 = 1340378649;
                                        }
                                        break;
                                    case -1698665619:
                                    case -258793294:
                                        if (C1783.f6087 <= 0) {
                                            iM2768 = (C0619.m2761("ۢۖ") + i21) * (-7);
                                            i23 = ((iM2768 ^ i22) * 23931) ^ 729760583;
                                            i24 = -1343032407;
                                        } else {
                                            iM2768 = (C0619.m2761("ۜۗ") + i21) * (-37);
                                            i23 = ((iM2768 ^ i22) * (-5559)) ^ 428536136;
                                            i24 = 2046612535;
                                        }
                                        break;
                                    case -1463777442:
                                    case 919393521:
                                        if (C4282.f15546 <= 0) {
                                            iM2768 = (C0619.m2761("ۢۖ") + i21) * (-7);
                                            i23 = ((iM2768 ^ i22) * 23931) ^ 729760583;
                                            i24 = -1343032407;
                                        } else {
                                            iM2768 = C0619.m2761("ܿܶ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 7719) ^ 1884304263;
                                            i24 = 1703086556;
                                        }
                                        break;
                                    case -1202664177:
                                    case -407213359:
                                        if (AbstractC0116.m1243() != 0) {
                                            iM2768 = C0619.m2761("֡۟") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 3905) ^ 822508538;
                                            i24 = 1340378649;
                                        } else {
                                            iM2768 = (i21 - C0619.m2761("ۡۗ")) * (-57);
                                            i23 = ((iM2768 ^ i22) * 9407) ^ (-1096861493);
                                            i24 = 1970234484;
                                        }
                                        break;
                                    case -1108483412:
                                    case 262452563:
                                        if (C20932.m47848() != 0) {
                                            iM2768 = (C0619.m2761("᩸ᩴ") ^ i21) * (-49);
                                            i23 = ((iM2768 ^ i22) * (-21791)) ^ (-1989050456);
                                            i24 = -1872849617;
                                        } else {
                                            iM2768 = (i21 - C0773.m3169("᩺ܶ")) * (-17);
                                            i23 = ((iM2768 ^ i22) * (-26391)) ^ 1508597643;
                                            i24 = 767435025;
                                        }
                                        break;
                                    case -1033703752:
                                    case 551050596:
                                        if (C23916.f77426 <= 0) {
                                            iM2768 = (C0619.m2761("ۢۖ") + i21) * (-7);
                                            i23 = ((iM2768 ^ i22) * 23931) ^ 729760583;
                                            i24 = -1343032407;
                                        } else {
                                            iM2768 = C0619.m2761("᩻۠") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 16399) ^ 1353346362;
                                            i24 = 204859793;
                                        }
                                        break;
                                    case -621480450:
                                    case -393935195:
                                        if (C2702.f8586 <= 0) {
                                            iM2768 = (C0773.m3169("۠᩻") ^ i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i23 = ((iM2768 ^ i22) * (-7307)) ^ (-1001733261);
                                            i24 = 818616414;
                                        } else {
                                            iM2768 = C0773.m3169("᩶ۖ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 26433) ^ 1227203527;
                                            i24 = -1415065626;
                                        }
                                        break;
                                    case -282788852:
                                    case 1383682692:
                                        if (C1783.m6232()) {
                                            iM2768 = C0619.m2761("ܿ᩷") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 1921) ^ (-266525608);
                                            i24 = 687724301;
                                        } else {
                                            iM2768 = C0773.m3169("᩶ۖ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 26433) ^ 1227203527;
                                            i24 = -1415065626;
                                        }
                                        break;
                                    case -115433601:
                                    case 1067254295:
                                        C20962.m47928(this.f38737, zArr2, c1255);
                                        break;
                                    case 157397179:
                                    case 515059652:
                                        AbstractC0641.m2813();
                                        C2702.m8876();
                                        iM2768 = C0773.m3169("᩶ۖ") ^ i22;
                                        i23 = ((iM2768 ^ i21) * 26433) ^ 1227203527;
                                        i24 = -1415065626;
                                        break;
                                    case 252344775:
                                    case 290387275:
                                        if (C3690.f12684 <= 0) {
                                            iM2768 = C0773.m3169("᩶ۖ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 26433) ^ 1227203527;
                                            i24 = -1415065626;
                                        } else {
                                            iM2768 = (C0619.m2761("֨ᩴ") + i22) * (-89);
                                            i23 = ((iM2768 ^ i21) * 10987) ^ 557315465;
                                            i24 = -1800325940;
                                        }
                                        break;
                                    case 927273804:
                                    case 1530428104:
                                        zArr2 = zArr;
                                        if (C1564.f5401 <= 0) {
                                            iM2768 = (C0619.m2761("᩸ᩴ") ^ i21) * (-49);
                                            i23 = ((iM2768 ^ i22) * (-21791)) ^ (-1989050456);
                                            i24 = -1872849617;
                                        } else {
                                            iM2768 = (i21 - C0773.m3169("᩹᩵")) * 71;
                                            i23 = ((iM2768 ^ i22) * (-833)) ^ (-57378039);
                                            i24 = -2029644519;
                                        }
                                        break;
                                    case 1024185959:
                                    case 1051998847:
                                        RunnableC1848.m6360();
                                        break;
                                    case 1109313004:
                                    case 1604022870:
                                        if (C2834.m9344() >= 0) {
                                            iM2768 = (C0773.m3169("۠᩻") ^ i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i23 = ((iM2768 ^ i22) * (-7307)) ^ (-1001733261);
                                            i24 = 818616414;
                                        } else {
                                            iM2768 = (i22 - C0773.m3169("᩷ۗ")) * (-103);
                                            i23 = ((iM2768 ^ i21) * 29725) ^ 1342504415;
                                            i24 = 1555157145;
                                        }
                                        break;
                                    default:
                                        if (C0269.f1558 <= 0) {
                                            iM2768 = C0619.m2761("֡۟") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 3905) ^ 822508538;
                                            i24 = 1340378649;
                                        } else {
                                            iM2768 = (C0773.m3169("۠᩻") ^ i21) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i23 = ((iM2768 ^ i22) * (-7307)) ^ (-1001733261);
                                            i24 = 818616414;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i20 = 476296609;
                            int i21 = C2354.f7599;
                            int i22 = C2375.f7641;
                            int iM2768 = (i21 - C0619.m2761("֫ۖ")) * 89;
                            int i23 = ((iM2768 ^ i22) * (-7453)) ^ (-318913161);
                            int i24 = 2084661024;
                            while (true) {
                                i20 = ((((i20 ^ i22) * (-7691)) >> 31) & i23) ^ (iM2768 ^ i24);
                                switch (i20) {
                                    case -2103543187:
                                    case 756309242:
                                        if (C2375.m8065() <= 0) {
                                            iM2768 = (C0619.m2761("ܽ᩺") + i22) * 65;
                                            i23 = ((iM2768 ^ i21) * 1315) ^ 368654400;
                                            i24 = -193584824;
                                        } else {
                                            iM2768 = C0619.m2761("᩸ۘ") ^ i21;
                                            i23 = ((iM2768 ^ i22) * (-17245)) ^ 1179146326;
                                            i24 = 845810952;
                                        }
                                        break;
                                    case -2085515012:
                                    case 145277509:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM2768 = (C0619.m2761("ܽ᩺") + i22) * 65;
                                            i23 = ((iM2768 ^ i21) * 1315) ^ 368654400;
                                            i24 = -193584824;
                                        } else {
                                            iM2768 = (C0619.m2761("᩷ۚ") ^ i22) * (-81);
                                            i23 = ((iM2768 ^ i21) * 19385) ^ 166351473;
                                            i24 = 218365153;
                                        }
                                        break;
                                    case -2019659950:
                                    case 1473049665:
                                        if (RunnableC1848.f6235) {
                                            iM2768 = (C0619.m2761("ܽ᩺") + i22) * 65;
                                            i23 = ((iM2768 ^ i21) * 1315) ^ 368654400;
                                            i24 = -193584824;
                                        } else {
                                            iM2768 = (C0773.m3169("ᩳۛ") + i21) * (-89);
                                            i23 = ((iM2768 ^ i22) * 20451) ^ (-1295970428);
                                            i24 = 1340294917;
                                        }
                                        break;
                                    case -1880302932:
                                    case -1738636037:
                                        if (!C2023.f6737) {
                                            iM2768 = C0773.m3169("ۢ֨") ^ i21;
                                            i23 = ((iM2768 ^ i22) * 14523) ^ 975059339;
                                            i24 = 1195189907;
                                        } else {
                                            iM2768 = (C0773.m3169("ۚᩳ") + i22) * (-57);
                                            i23 = ((iM2768 ^ i21) * (-10387)) ^ 1746745844;
                                            i24 = -612158732;
                                        }
                                        break;
                                    case -1778045319:
                                    case -1363919611:
                                        if (C0862.f3233 != 0) {
                                            iM2768 = C0773.m3169("֡ۘ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * (-25961)) ^ 811338309;
                                            i24 = -327113259;
                                        } else {
                                            iM2768 = (i21 - C0619.m2761("᩻ۡ")) * 75;
                                            i23 = ((iM2768 ^ i22) * (-24669)) ^ 269774942;
                                            i24 = 141113582;
                                        }
                                        break;
                                    case -1597652331:
                                    case -1576452104:
                                        if (C0862.f3233 != 0) {
                                            iM2768 = (C0773.m3169("ۚᩳ") + i22) * (-57);
                                            i23 = ((iM2768 ^ i21) * (-10387)) ^ 1746745844;
                                            i24 = -612158732;
                                        } else {
                                            iM2768 = (i22 - C0619.m2761("ۖ᩷")) * 33;
                                            i23 = ((iM2768 ^ i21) * (-22637)) ^ (-1723460188);
                                            i24 = 202646100;
                                        }
                                        break;
                                    case -1565921311:
                                    case 1721494069:
                                        if (C11235.f35427 >= 0) {
                                            iM2768 = C0773.m3169("ۢ֨") ^ i21;
                                            i23 = ((iM2768 ^ i22) * 14523) ^ 975059339;
                                            i24 = 1195189907;
                                        } else {
                                            iM2768 = C0619.m2761("ۡܿ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * (-20753)) ^ 1288586986;
                                            i24 = -213899435;
                                        }
                                        break;
                                    case -681708539:
                                    case 1539429659:
                                        C2485.m8357();
                                        throw new RuntimeException();
                                    case -600904408:
                                    case 565768266:
                                        C13473.m33144();
                                        iM2768 = C0773.m3169("ۢ֨") ^ i21;
                                        i23 = ((iM2768 ^ i22) * 14523) ^ 975059339;
                                        i24 = 1195189907;
                                        break;
                                    case -531076611:
                                    case 624518224:
                                        if (C2419.m8174() >= 0) {
                                            iM2768 = C0773.m3169("֡ۘ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * (-25961)) ^ 811338309;
                                            i24 = -327113259;
                                        } else {
                                            iM2768 = C0619.m2761("ۢᩳ") ^ i21;
                                            i23 = ((iM2768 ^ i22) * 24413) ^ 27280268;
                                            i24 = -151319436;
                                        }
                                        break;
                                    case 148402759:
                                    case 605268016:
                                        return;
                                    case 478563148:
                                    case 1113487600:
                                        if (C1519.f5300 >= 0) {
                                            iM2768 = C0773.m3169("֡ۘ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * (-25961)) ^ 811338309;
                                            i24 = -327113259;
                                        } else {
                                            iM2768 = C0619.m2761("ۙܶ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 11059) ^ (-1082918912);
                                            i24 = -630558207;
                                        }
                                        break;
                                    case 909521740:
                                    case 1488274846:
                                        if (C0487.f2131 > 0) {
                                            iM2768 = (C0773.m3169("ۚᩳ") + i22) * (-57);
                                            i23 = ((iM2768 ^ i21) * (-10387)) ^ 1746745844;
                                            i24 = -612158732;
                                        } else {
                                            iM2768 = C0773.m3169("ᩳ᩷") ^ i21;
                                            i23 = ((iM2768 ^ i22) * 5035) ^ (-586199786);
                                            i24 = -577511234;
                                        }
                                        break;
                                    case 1129935552:
                                    case 1637193979:
                                        if (C13473.f42873 != 0) {
                                            iM2768 = (C0773.m3169("ۚᩳ") + i22) * (-57);
                                            i23 = ((iM2768 ^ i21) * (-10387)) ^ 1746745844;
                                            i24 = -612158732;
                                        } else {
                                            iM2768 = C0773.m3169("ۧ۠") ^ i21;
                                            i23 = ((iM2768 ^ i22) * (-6893)) ^ 1646761001;
                                            i24 = 332481973;
                                        }
                                        break;
                                    case 1307617098:
                                    case 1904225395:
                                        C13473.m33144();
                                        if (!C2878.f9462) {
                                            iM2768 = C0773.m3169("֡ۘ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * (-25961)) ^ 811338309;
                                            i24 = -327113259;
                                        } else {
                                            iM2768 = (C0773.m3169("ۚᩳ") + i22) * (-57);
                                            i23 = ((iM2768 ^ i21) * (-10387)) ^ 1746745844;
                                            i24 = -612158732;
                                        }
                                        break;
                                    default:
                                        this.f38737 = c20963;
                                        if (C2966.f9654 >= 0) {
                                            iM2768 = C0773.m3169("֡ۘ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * (-25961)) ^ 811338309;
                                            i24 = -327113259;
                                        } else {
                                            iM2768 = C0619.m2761("֨ܽ") ^ i22;
                                            i23 = ((iM2768 ^ i21) * 1877) ^ (-483010175);
                                            i24 = -1803138287;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    C1321.m4860(c2361M3794);
                    i17 = i17;
                    iM2761 = (i8 - C0773.m3169("ۧ᩶")) * (-57);
                    i = ((iM2761 ^ i9) * 10625) ^ (-1167180200);
                    i2 = 1090044182;
                    i4 = i17;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    i17 = i4;
                    break;
                case -805889645:
                case 1098290914:
                    C0950.m3785();
                    C1783.m6232();
                    iM2761 = (i8 - C0773.m3169("۬ۨ")) * 3;
                    i17 = i17;
                    i = ((iM2761 ^ i9) * (-20053)) ^ (-720478783);
                    i2 = 2142064545;
                    i4 = i17;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    i17 = i4;
                    break;
                case -613862080:
                case -454060230:
                    i17 = i17;
                    c2361M3794 = C0950.m3794(c20963.f67043);
                    sArr3 = f67041;
                    if (C3998.f13671 == 0) {
                        iM2761 = (C0619.m2761("ܿ۠") + i9) * 5;
                        i = ((iM2761 ^ i8) * (-8989)) ^ 729365088;
                        i2 = -584257674;
                        i4 = i17;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        i17 = i4;
                    } else {
                        iM2763 = (C0619.m2761("ۘۜ") ^ i9) * 87;
                        i10 = ((iM2763 ^ i8) * 7553) ^ (-1423363473);
                        i7 = 1228275421;
                        i5 = iM2763 ^ i7;
                        i17 = i17;
                        i11 = i5;
                        c20963 = c20962;
                    }
                    break;
                case -553875360:
                case 1840065328:
                    i15 = 52892;
                    iM2761 = C0619.m2761("ܰ֨") ^ i9;
                    i = ((iM2761 ^ i8) * (-26515)) ^ 818535190;
                    i2 = -1340659433;
                    i4 = i17;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    i17 = i4;
                    break;
                case -543017064:
                case -331789674:
                    i17 = i17;
                    s = s2;
                    if ((s * 2406) - ((s2 * s2) + 1447209) > 0) {
                        iM3169 = (C0619.m2761("ۤ᩷") + i9) * 101;
                        i10 = ((iM3169 ^ i8) * 30997) ^ (-742963334);
                        i6 = -852100709;
                    } else {
                        iM3169 = C0773.m3169("ۛۢ") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-24243)) ^ 1401101494;
                        i6 = -1492516686;
                    }
                    i5 = iM3169 ^ i6;
                    s2 = s;
                    i17 = i17;
                    i11 = i5;
                    c20963 = c20962;
                    break;
                case -277151393:
                case 950526127:
                    C3492.m11487(c2361M3794, 2129045212 ^ iM2764, dialogInterfaceOnClickListenerC23081);
                    sArr4 = f67041;
                    if (C3734.m12152() >= 0) {
                        i14 = 94;
                        int iM31616 = C0773.m3169("֨ᩳ") ^ i8;
                        i11 = iM31616 ^ 1173597346;
                        i10 = ((iM31616 ^ i9) * (-11669)) ^ 1187177818;
                        sArr4 = sArr4;
                    } else {
                        int iM31617 = C0773.m3169("ܽܿ") ^ i9;
                        i11 = iM31617 ^ (-536934774);
                        i10 = ((iM31617 ^ i8) * (-14529)) ^ (-645225344);
                        i14 = 94;
                    }
                    break;
                case 10668993:
                case 1193017246:
                    C2354.m7983();
                    if (AbstractC0116.f1064 > 0) {
                        int iM31618 = C0773.m3169("֨ᩳ") ^ i8;
                        i11 = iM31618 ^ 1173597346;
                        i10 = ((iM31618 ^ i9) * (-11669)) ^ 1187177818;
                        sArr4 = sArr4;
                    } else {
                        iM2761 = (i8 - C0773.m3169("۬ۨ")) * 3;
                        i17 = i17;
                        i = ((iM2761 ^ i9) * (-20053)) ^ (-720478783);
                        i2 = 2142064545;
                        i4 = i17;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        i17 = i4;
                    }
                    break;
                case 142591056:
                case 929897920:
                    if (C0269.m1775() > 0) {
                        i17 = i17;
                        iM2763 = (C0619.m2761("ۘۜ") ^ i9) * 87;
                        i10 = ((iM2763 ^ i8) * 7553) ^ (-1423363473);
                        i7 = 1228275421;
                        i5 = iM2763 ^ i7;
                        i17 = i17;
                        i11 = i5;
                        c20963 = c20962;
                    } else {
                        i3 = i17;
                        iM2762 = i12;
                        sArr = sArr3;
                        int iM31619 = (C0773.m3169("ۗ۫") + i8) * 85;
                        int i110 = iM2762;
                        i10 = ((iM31619 ^ i9) * (-31631)) ^ 398334012;
                        int i111 = i3;
                        i11 = iM31619 ^ 1334859203;
                        i17 = i111;
                        sArr3 = sArr;
                        i12 = i110;
                    }
                    break;
                case 678796838:
                case 818058638:
                    C20932.m47848();
                    break;
                case 789239381:
                case 796850587:
                    if (C2485.f7950 == 0) {
                        i3 = i17;
                        iM2762 = i12;
                        sArr = sArr3;
                        int iM316110 = (C0773.m3169("ۗ۫") + i8) * 85;
                        int i112 = iM2762;
                        i10 = ((iM316110 ^ i9) * (-31631)) ^ 398334012;
                        int i113 = i3;
                        i11 = iM316110 ^ 1334859203;
                        i17 = i113;
                        sArr3 = sArr;
                        i12 = i112;
                    } else {
                        iM2761 = (i8 - C0773.m3169("۬ۨ")) * 3;
                        i17 = i17;
                        i = ((iM2761 ^ i9) * (-20053)) ^ (-720478783);
                        i2 = 2142064545;
                        i4 = i17;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        i17 = i4;
                    }
                    break;
                case 974416384:
                case 1199878642:
                    break;
                case 1374887535:
                case 2032007167:
                    i17 = i17;
                    C2485.m8345(c2361M3794, i12 ^ i13);
                    strM9670 = C2966.m9670(f67041, 88, 3, i15);
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0773.m3169("᩵ܳ") + i9) * (-125);
                        i = ((iM2761 ^ i8) * 5725) ^ 579544965;
                        i2 = 57668559;
                        i4 = i17;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        i17 = i4;
                    } else {
                        s = s2;
                        int iM2768 = (C0619.m2761("ܳ᩻") ^ i9) * 127;
                        i10 = ((iM2768 ^ i8) * (-5523)) ^ (-2099618754);
                        i5 = iM2768 ^ 172412461;
                        s2 = s;
                        i17 = i17;
                        dialogInterfaceOnClickListenerC23081 = null;
                        i11 = i5;
                        c20963 = c20962;
                    }
                    break;
                case 1584349689:
                case 1982946543:
                    i17 = i17;
                    if (z) {
                        iM2761 = (i8 - C0773.m3169("ۧ᩶")) * (-57);
                        i = ((iM2761 ^ i9) * 10625) ^ (-1167180200);
                        i2 = 1090044182;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۜ") ^ i8) * (-103);
                        i = ((iM2761 ^ i9) * (-25605)) ^ (-1742795732);
                        i2 = -743012281;
                    }
                    i4 = i17;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    i17 = i4;
                    break;
                default:
                    i17 = i17;
                    if (c20963.f67048) {
                        iM2761 = (i8 - C0773.m3169("ۧ᩶")) * (-57);
                        i = ((iM2761 ^ i9) * 10625) ^ (-1167180200);
                        i2 = 1090044182;
                    } else {
                        iM2761 = (i9 - C0619.m2761("ܰܿ")) * (-65);
                        i = ((iM2761 ^ i8) * (-24263)) ^ (-1660625540);
                        i2 = -2106940932;
                    }
                    i4 = i17;
                    i11 = iM2761 ^ i2;
                    i10 = i;
                    i17 = i4;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01ea A[PHI: r4 r5 r21 r26
      0x01ea: PHI (r4v4 android.view.View) = (r4v2 android.view.View), (r4v3 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View) binds: [B:85:0x01ea, B:47:0x01e8, B:42:0x019c, B:26:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r5v4 android.view.View) = (r5v2 android.view.View), (r5v2 android.view.View), (r5v3 android.view.View), (r5v2 android.view.View) binds: [B:85:0x01ea, B:47:0x01e8, B:42:0x019c, B:26:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r21v34 short[]) = (r21v2 short[]), (r21v30 short[]), (r21v2 short[]), (r21v2 short[]) binds: [B:85:0x01ea, B:47:0x01e8, B:42:0x019c, B:26:0x00e1] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r26v13 int) = (r26v3 int), (r26v12 int), (r26v3 int), (r26v3 int) binds: [B:85:0x01ea, B:47:0x01e8, B:42:0x019c, B:26:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47920(C20962 c20962) {
        short[] sArr;
        int iM3169;
        int i;
        int iM31610;
        int i2;
        int i3;
        short[] sArr2;
        int iM2761;
        int i4;
        int iM31611;
        int i5;
        int i6;
        short[] sArr3;
        final C20962 c20963 = c20962;
        int i7 = C2966.f9654;
        int i8 = C3779.f12953;
        int iM31612 = (C0773.m3169("ܳۜ") + i8) * (-105);
        int i9 = ((iM31612 ^ i7) * (-28285)) ^ (-1234077943);
        Object obj = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i10 = iM31612 ^ 296284585;
        int i11 = 0;
        int i12 = 0;
        int iM2762 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        int iM31613 = 0;
        int i18 = -1253559296;
        int i19 = 0;
        C2361 c2361M13539 = null;
        View viewM9333 = null;
        View viewM9942 = null;
        Main main = null;
        SpannableString spannableStringM48355 = null;
        while (true) {
            i18 = i10 ^ (i9 & (((i18 ^ i7) * 28981) >> 31));
            switch (i18) {
                case -2037505831:
                case 1011455214:
                    if (C2287.f7432 >= 0) {
                        iM31611 = (C0773.m3169("ۧۘ") ^ i7) * (-7);
                        i5 = ((iM31611 ^ i8) * (-25261)) ^ (-1357849042);
                        i6 = 1767635671;
                        i10 = iM31611 ^ i6;
                        i9 = i5;
                    } else {
                        sArr5 = sArr5;
                        spannableStringM48355 = spannableStringM48355;
                        sArr2 = sArr4;
                        main = main;
                        i17 = i17;
                        iM2761 = (i7 - C0619.m2761("ᩳۘ")) * (-89);
                        sArr = sArr2;
                        i2 = ((iM2761 ^ i8) * (-6703)) ^ 1609654218;
                        i4 = -1666702515;
                        i10 = iM2761 ^ i4;
                        i9 = i2;
                        spannableStringM48355 = spannableStringM48355;
                        sArr5 = sArr5;
                        short[] sArr7 = sArr;
                        i17 = i17;
                        main = main;
                        sArr4 = sArr7;
                    }
                    break;
                case -1888970204:
                case -1344452068:
                    C11235.m28299(C2310.m7808(C1321.m4860(c2361M13539)), new View.OnClickListener() { // from class: l.᩵֨ۤ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3690.m11988(this.f64897.f67043, C13047.m32491());
                        }
                    });
                    break;
                case -1841774067:
                case 127163653:
                    viewM9333 = C2834.m9333(viewM9942, i11 ^ i12);
                    if (C1321.f4751 >= 0) {
                        iM31611 = (C0773.m3169("ۧۘ") ^ i7) * (-7);
                        i5 = ((iM31611 ^ i8) * (-25261)) ^ (-1357849042);
                        i6 = 1767635671;
                    } else {
                        iM31611 = C0619.m2761("֫ᩴ") ^ i7;
                        i5 = ((iM31611 ^ i8) * 13787) ^ (-1534569729);
                        i6 = 1676239041;
                    }
                    i10 = iM31611 ^ i6;
                    i9 = i5;
                    break;
                case -1708581200:
                case 544715081:
                    sArr = sArr4;
                    i15 = 54106;
                    iM3169 = (C0773.m3169("ۖۡ") ^ i7) * 75;
                    i9 = ((iM3169 ^ i8) * 2763) ^ (-981383832);
                    i = -52455746;
                    i10 = iM3169 ^ i;
                    c20963 = c20962;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr8 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr8;
                    break;
                case -1652703990:
                case -1362092153:
                    C0950.m3785();
                    if (!C2878.f9462) {
                        sArr5 = sArr5;
                        short[] sArr9 = sArr4;
                        main = main;
                        i17 = i17;
                        sArr = sArr9;
                        iM3169 = C0619.m2761("ۚۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 10883) ^ (-1724358048);
                        i = 613522078;
                        i10 = iM3169 ^ i;
                        c20963 = c20962;
                        spannableStringM48355 = spannableStringM48355;
                        sArr5 = sArr5;
                        short[] sArr10 = sArr;
                        i17 = i17;
                        main = main;
                        sArr4 = sArr10;
                    }
                    sArr5 = sArr5;
                    spannableStringM48355 = spannableStringM48355;
                    sArr2 = sArr4;
                    main = main;
                    i17 = i17;
                    iM2761 = (i7 - C0619.m2761("ᩳۘ")) * (-89);
                    sArr = sArr2;
                    i2 = ((iM2761 ^ i8) * (-6703)) ^ 1609654218;
                    i4 = -1666702515;
                    i10 = iM2761 ^ i4;
                    i9 = i2;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr11 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr11;
                    break;
                case -1566041387:
                case -244124548:
                    C2375.m8063(c2361M13539, C0773.m3169(C2966.m9670(sArr6, i14, 3, i15)) ^ 2119776979, obj);
                    if (C2485.m8357() <= 0) {
                        iM31611 = (C0773.m3169("ۧۘ") ^ i7) * (-7);
                        i5 = ((iM31611 ^ i8) * (-25261)) ^ (-1357849042);
                        i6 = 1767635671;
                    } else {
                        iM31611 = (C0619.m2761("᩷ۙ") + i8) * (-123);
                        i5 = ((iM31611 ^ i7) * 14599) ^ (-1308016635);
                        i6 = -1923665796;
                    }
                    i10 = iM31611 ^ i6;
                    i9 = i5;
                    break;
                case -1325753052:
                case 541292770:
                    sArr5 = sArr5;
                    spannableStringM48355 = spannableStringM48355;
                    short[] sArr12 = sArr4;
                    main = main;
                    i17 = i17;
                    sArr = sArr12;
                    short s2 = s;
                    if ((i16 + 200505600) - (s2 * 28320) >= 0) {
                        iM31610 = C0619.m2761("ۗ֨") ^ i8;
                        i2 = ((iM31610 ^ i7) * 12519) ^ (-112005211);
                        i3 = 166670798;
                    } else {
                        iM31610 = C0773.m3169("ۛܽ") ^ i8;
                        i2 = ((iM31610 ^ i7) * 26741) ^ (-1027911066);
                        i3 = -34634946;
                    }
                    i10 = iM31610 ^ i3;
                    c20963 = c20962;
                    s = s2;
                    i9 = i2;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr13 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr13;
                    break;
                case -1139292962:
                case 1829764636:
                    sArr5 = sArr5;
                    spannableStringM48355 = spannableStringM48355;
                    sArr2 = sArr4;
                    main = main;
                    i17 = i17;
                    iM31613 = C0773.m3169(C0487.m2361(sArr2, i17, 3, i15));
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i7 - C0619.m2761("ᩳۘ")) * (-89);
                        sArr = sArr2;
                        i2 = ((iM2761 ^ i8) * (-6703)) ^ 1609654218;
                        i4 = -1666702515;
                    } else {
                        sArr = sArr2;
                        iM2761 = C0619.m2761("ܰܿ") ^ i8;
                        i2 = ((iM2761 ^ i7) * 20849) ^ (-828439073);
                        i4 = 1975972133;
                    }
                    i10 = iM2761 ^ i4;
                    i9 = i2;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr14 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr14;
                    break;
                case -730398262:
                case 1611511695:
                    sArr = sArr4;
                    i15 = 65374;
                    iM3169 = (C0773.m3169("ۖۡ") ^ i7) * 75;
                    i9 = ((iM3169 ^ i8) * 2763) ^ (-981383832);
                    i = -52455746;
                    i10 = iM3169 ^ i;
                    c20963 = c20962;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr15 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr15;
                    break;
                case -726532825:
                case -578966955:
                    RunnableC3055.m9933();
                    sArr5 = sArr5;
                    spannableStringM48355 = spannableStringM48355;
                    sArr2 = sArr4;
                    main = main;
                    i17 = i17;
                    iM2761 = (i7 - C0619.m2761("ᩳۘ")) * (-89);
                    sArr = sArr2;
                    i2 = ((iM2761 ^ i8) * (-6703)) ^ 1609654218;
                    i4 = -1666702515;
                    i10 = iM2761 ^ i4;
                    i9 = i2;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr16 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr16;
                    break;
                case -718118159:
                case -38039809:
                    C1080.m4050();
                    C3099.m10095();
                    break;
                case -510787968:
                case 820434487:
                    sArr5 = sArr5;
                    spannableStringM48355 = spannableStringM48355;
                    short[] sArr17 = sArr4;
                    main = main;
                    i17 = i17;
                    sArr = sArr17;
                    s = f67041[52];
                    i16 = s * s;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۚۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 10883) ^ (-1724358048);
                        i = 613522078;
                    } else {
                        iM3169 = C0773.m3169("᩸۠") ^ i7;
                        i9 = ((iM3169 ^ i8) * 22437) ^ (-19953929);
                        i = -1117813175;
                    }
                    i10 = iM3169 ^ i;
                    c20963 = c20962;
                    spannableStringM48355 = spannableStringM48355;
                    sArr5 = sArr5;
                    short[] sArr18 = sArr;
                    i17 = i17;
                    main = main;
                    sArr4 = sArr18;
                    break;
                case -439305804:
                case -188644890:
                    sArr3 = sArr5;
                    spannableStringM48355 = ViewOnClickListenerC21202.m48355();
                    main = c20963.f67043;
                    sArr4 = f67041;
                    i17 = 53;
                    if (C1146.m4231()) {
                        int iM31614 = (C0773.m3169("ᩴۘ") ^ i7) * (-53);
                        i9 = ((iM31614 ^ i8) * 25639) ^ 30718623;
                        i10 = iM31614 ^ 368104177;
                        c20963 = c20962;
                        sArr5 = sArr3;
                    } else {
                        int iM31615 = (i8 - C0773.m3169("ۤۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = iM31615 ^ (-2017811127);
                        i9 = ((iM31615 ^ i7) * 31485) ^ (-563963165);
                        sArr5 = sArr3;
                        c20963 = c20962;
                    }
                    break;
                case -17404117:
                case 784132064:
                    C23916.m53425((TextView) viewM9333, spannableStringM48355);
                    c2361M13539 = C4238.m13539(main);
                    C4282.m13657(c2361M13539, viewM9942);
                    if (C4238.m13540() <= 0) {
                        iM31611 = C0773.m3169("ۢۖ") ^ i7;
                        i5 = ((iM31611 ^ i8) * 24315) ^ (-1714488906);
                        i6 = 6464765;
                    } else {
                        iM31611 = (i8 - C0773.m3169("ۢܿ")) * (-75);
                        i5 = ((iM31611 ^ i7) * 953) ^ (-1824827528);
                        i6 = -1204812896;
                    }
                    i10 = iM31611 ^ i6;
                    i9 = i5;
                    break;
                case 120713645:
                case 218699925:
                    if (C2354.f7599 < 0) {
                        sArr3 = sArr5;
                        int iM31616 = (i8 - C0773.m3169("ۤۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = iM31616 ^ (-2017811127);
                        i9 = ((iM31616 ^ i7) * 31485) ^ (-563963165);
                        sArr5 = sArr3;
                        c20963 = c20962;
                    } else {
                        sArr5 = sArr5;
                        spannableStringM48355 = spannableStringM48355;
                        sArr2 = sArr4;
                        main = main;
                        i17 = i17;
                        iM2761 = (i7 - C0619.m2761("ᩳۘ")) * (-89);
                        sArr = sArr2;
                        i2 = ((iM2761 ^ i8) * (-6703)) ^ 1609654218;
                        i4 = -1666702515;
                        i10 = iM2761 ^ i4;
                        i9 = i2;
                        spannableStringM48355 = spannableStringM48355;
                        sArr5 = sArr5;
                        short[] sArr19 = sArr;
                        i17 = i17;
                        main = main;
                        sArr4 = sArr19;
                    }
                    break;
                case 527903129:
                case 1549684252:
                    viewM9942 = RunnableC3055.m9942(main, iM31613 ^ 2122493459);
                    sArr5 = f67041;
                    i19 = 56;
                    if (C3492.f12043 <= 0) {
                        iM31611 = (C0773.m3169("ۧۘ") ^ i7) * (-7);
                        i5 = ((iM31611 ^ i8) * (-25261)) ^ (-1357849042);
                        i6 = 1767635671;
                    } else {
                        iM31611 = (i8 - C0773.m3169("۠᩸")) * 61;
                        i5 = ((iM31611 ^ i7) * 25713) ^ (-80687417);
                        i6 = 970342235;
                    }
                    i10 = iM31611 ^ i6;
                    i9 = i5;
                    break;
                case 1756265613:
                case 2087056395:
                    iM2762 = C0619.m2761(C2485.m8350(f67041, 59, 3, i15));
                    i13 = 2120072230;
                    if (C1080.f3865 < 0) {
                        iM31611 = (C0619.m2761("ᩳۚ") + i8) * (-47);
                        i5 = ((iM31611 ^ i7) * 22821) ^ (-505587232);
                        i6 = 647565442;
                        i10 = iM31611 ^ i6;
                        i9 = i5;
                    } else {
                        sArr3 = sArr5;
                        int iM31617 = (i8 - C0773.m3169("ۤۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i10 = iM31617 ^ (-2017811127);
                        i9 = ((iM31617 ^ i7) * 31485) ^ (-563963165);
                        sArr5 = sArr3;
                        c20963 = c20962;
                    }
                    break;
                case 1880949673:
                case 2062992399:
                    obj = null;
                    C2419.m8168(c2361M13539, iM2762 ^ i13, null);
                    sArr6 = f67041;
                    i14 = 62;
                    if (C3492.f12043 > 0) {
                        iM31611 = (C0773.m3169("ܳܽ") + i7) * (-81);
                        i5 = ((iM31611 ^ i8) * (-21219)) ^ (-1948748184);
                        i6 = -1176800833;
                        i10 = iM31611 ^ i6;
                        i9 = i5;
                    } else {
                        sArr5 = sArr5;
                        spannableStringM48355 = spannableStringM48355;
                        sArr2 = sArr4;
                        main = main;
                        i17 = i17;
                        iM2761 = (i7 - C0619.m2761("ᩳۘ")) * (-89);
                        sArr = sArr2;
                        i2 = ((iM2761 ^ i8) * (-6703)) ^ 1609654218;
                        i4 = -1666702515;
                        i10 = iM2761 ^ i4;
                        i9 = i2;
                        spannableStringM48355 = spannableStringM48355;
                        sArr5 = sArr5;
                        short[] sArr110 = sArr;
                        i17 = i17;
                        main = main;
                        sArr4 = sArr110;
                    }
                    break;
                default:
                    sArr5 = sArr5;
                    int i20 = i19;
                    int iM31618 = C0773.m3169(C3448.m11252(sArr5, i20, 3, i15));
                    if (AbstractC3624.m11755() != 0) {
                        i19 = i20;
                        i12 = 2119834084;
                        i11 = iM31618;
                        short[] sArr20 = sArr4;
                        main = main;
                        i17 = i17;
                        sArr = sArr20;
                        iM3169 = C0619.m2761("ۚۗ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 10883) ^ (-1724358048);
                        i = 613522078;
                        i10 = iM3169 ^ i;
                        c20963 = c20962;
                        spannableStringM48355 = spannableStringM48355;
                        sArr5 = sArr5;
                        short[] sArr111 = sArr;
                        i17 = i17;
                        main = main;
                        sArr4 = sArr111;
                    } else {
                        int iM31619 = (i7 - C0773.m3169("۟ܰ")) * 123;
                        i19 = i20;
                        i10 = iM31619 ^ (-270337237);
                        i11 = iM31618;
                        i9 = ((iM31619 ^ i8) * 3575) ^ 1061675128;
                        sArr5 = sArr5;
                        i12 = 2119834084;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47923(C20962 c20962, C1255 c1255, C1255 c1256) {
        int iM2761;
        int i;
        int i2;
        InterfaceC18752 interfaceC18752;
        short[] sArr;
        int i3;
        int iM2762;
        int i4;
        short[] sArr2;
        int i5;
        int i6;
        int i7;
        InterfaceC18752 interfaceC18753;
        InterfaceC18752 interfaceC18752M8173;
        String strM8881;
        int iM3169;
        int i8;
        int i9;
        C20962 c20963 = c20962;
        int i10 = C2375.f7641;
        int i11 = C1783.f6087;
        int iM2763 = (i11 - C0619.m2761("ܿ֫")) * (-93);
        int i12 = ((iM2763 ^ i10) * (-22869)) ^ (-958733769);
        C1255 c1257 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i13 = iM2763 ^ (-1046005227);
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        short s2 = 0;
        InterfaceC18752 interfaceC18754 = null;
        int i18 = 0;
        int i19 = 1968324822;
        InterfaceC18752 interfaceC18752M12143 = null;
        InterfaceC18752 interfaceC18755 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i20 = 0;
        String str = null;
        String strM4058 = null;
        int i21 = 0;
        InterfaceC18752 interfaceC18752M9665 = null;
        String strM6952 = null;
        InterfaceC18752 interfaceC18752M40375 = null;
        boolean zM33141 = false;
        while (true) {
            i19 = i13 ^ (i12 & (((i19 ^ i10) * 32591) >> 31));
            switch (i19) {
                case -2119252735:
                case 1810640276:
                    i21 = i21;
                    i20 = i20;
                    InterfaceC18752 interfaceC18756 = interfaceC18754;
                    str = str;
                    interfaceC18752M12143 = C3734.m12143(interfaceC18756, str, C13473.m33141(c1255));
                    sArr = f67041;
                    if (C1542.m5459() < 0) {
                        int iM31610 = (i11 - C0773.m3169("᩵᩵")) * (-115);
                        i13 = iM31610 ^ (-1854142106);
                        interfaceC18754 = interfaceC18756;
                        str = str;
                        i12 = ((iM31610 ^ i10) * 25839) ^ (-329771417);
                        i21 = i21;
                        i20 = i20;
                        i18 = 69;
                        sArr3 = sArr;
                        c20963 = c20962;
                    } else {
                        interfaceC18752 = interfaceC18756;
                        i3 = 69;
                        int iM2764 = C0619.m2761("᩺ۛ") ^ i11;
                        i13 = iM2764 ^ 1451739807;
                        i12 = ((iM2764 ^ i10) * (-19771)) ^ 1581698400;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr;
                        c20963 = c20962;
                        int i22 = i20;
                        i18 = i3;
                        i20 = i22;
                    }
                    break;
                case -1655447191:
                case 1934026225:
                    C0773.m3161();
                    if (C3099.f10023 > 0) {
                        iM2761 = (C0773.m3169("ۚۗ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i10) * (-679)) ^ 350564754;
                        i2 = 1645784615;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                    } else {
                        strM8881 = str;
                        sArr2 = sArr3;
                        i6 = i21;
                        interfaceC18752M8173 = interfaceC18754;
                        i5 = i18;
                        i7 = i20;
                        interfaceC18753 = interfaceC18752M12143;
                        iM3169 = (C0773.m3169("֡ᩴ") + i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM3169 ^ i11) * 30463) ^ 1502963651;
                        i9 = -1956597689;
                        i13 = iM3169 ^ i9;
                        i12 = i8;
                        interfaceC18752M12143 = interfaceC18753;
                        i21 = i6;
                        i20 = i7;
                        sArr3 = sArr2;
                        i18 = i5;
                        interfaceC18754 = interfaceC18752M8173;
                        str = strM8881;
                        c20963 = c20962;
                    }
                    break;
                case -1632065208:
                case 376611237:
                    sArr3 = sArr3;
                    i21 = i21;
                    str = str;
                    interfaceC18752 = interfaceC18754;
                    i18 = i18;
                    i20 = i20;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    int i23 = i16 + 107889769;
                    i17 = i23 + i23;
                    s = 10387;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2762 = (C0773.m3169("۫ۛ") + i10) * 67;
                        i12 = ((iM2762 ^ i11) * (-4953)) ^ 2141602179;
                        i4 = 187246322;
                    } else {
                        iM2762 = C0619.m2761("ܳ᩷") ^ i11;
                        i12 = ((iM2762 ^ i10) * (-4561)) ^ (-692082173);
                        i4 = 1406097153;
                    }
                    i13 = iM2762 ^ i4;
                    c20963 = c20962;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    i20 = i20;
                    i18 = i18;
                    interfaceC18754 = interfaceC18752;
                    str = str;
                    i21 = i21;
                    sArr3 = sArr3;
                    break;
                case -1593616914:
                case -565369536:
                    i14 = 55271;
                    iM2762 = C0773.m3169("ۤܳ") ^ i10;
                    interfaceC18752 = interfaceC18754;
                    i12 = ((iM2762 ^ i11) * (-29679)) ^ (-2134240089);
                    i4 = 482554038;
                    i13 = iM2762 ^ i4;
                    c20963 = c20962;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    i20 = i20;
                    i18 = i18;
                    interfaceC18754 = interfaceC18752;
                    str = str;
                    i21 = i21;
                    sArr3 = sArr3;
                    break;
                case -1526107792:
                case 1543624021:
                    sArr3 = sArr3;
                    i21 = i21;
                    str = str;
                    interfaceC18752 = interfaceC18754;
                    i18 = i18;
                    i20 = i20;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    s2 = sArr6[65];
                    i16 = s2 * s2;
                    if (C1146.f4234 >= 0) {
                        iM2762 = (i10 - C0619.m2761("᩸᩶")) * (-17);
                        i12 = ((iM2762 ^ i11) * 2841) ^ (-1997653732);
                        i4 = -948883815;
                    } else {
                        iM2762 = C0619.m2761("ۙۚ") ^ i10;
                        i12 = ((iM2762 ^ i11) * 19463) ^ (-1289175505);
                        i4 = -362355184;
                    }
                    i13 = iM2762 ^ i4;
                    c20963 = c20962;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    i20 = i20;
                    i18 = i18;
                    interfaceC18754 = interfaceC18752;
                    str = str;
                    i21 = i21;
                    sArr3 = sArr3;
                    break;
                case -1282485450:
                case 982298936:
                    sArr3 = sArr3;
                    int i24 = i18;
                    i21 = i21;
                    i20 = i20;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    InterfaceC18752 interfaceC18752M40376 = C17202.m40375(interfaceC18752M12143, C4238.m13530(sArr3, i24, 4, i14), C13473.m33141(c1256));
                    C1255 c1258 = c20963.f67045;
                    if (C2419.f7754 < 0) {
                        int iM2765 = C0619.m2761("᩺ᩴ") ^ i11;
                        int i25 = ((iM2765 ^ i10) * (-32505)) ^ 1168756437;
                        i13 = iM2765 ^ (-200578977);
                        c1257 = c1258;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        i21 = i21;
                        i20 = i20;
                        i18 = i24;
                        sArr3 = sArr3;
                        interfaceC18755 = interfaceC18752M40376;
                        i12 = i25;
                        c20963 = c20962;
                    } else {
                        c1257 = c1258;
                        str = str;
                        interfaceC18752 = interfaceC18754;
                        i18 = i24;
                        interfaceC18755 = interfaceC18752M40376;
                        iM2762 = (i10 - C0619.m2761("᩸᩶")) * (-17);
                        i12 = ((iM2762 ^ i11) * 2841) ^ (-1997653732);
                        i4 = -948883815;
                        i13 = iM2762 ^ i4;
                        c20963 = c20962;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        i20 = i20;
                        i18 = i18;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr3;
                    }
                    break;
                case -1103343981:
                case 858363829:
                    zM33141 = C13473.m33141(c1257);
                    sArr4 = f67041;
                    i21 = 73;
                    i20 = 3;
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("۬᩻") ^ i10;
                        i = ((iM2761 ^ i11) * 14951) ^ 1203185795;
                        i2 = 679564626;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                    } else {
                        str = str;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        sArr3 = sArr3;
                        i21 = 73;
                        interfaceC18752 = interfaceC18754;
                        i18 = i18;
                        i20 = 3;
                        iM2762 = (C0773.m3169("۫ۛ") + i10) * 67;
                        i12 = ((iM2762 ^ i11) * (-4953)) ^ 2141602179;
                        i4 = 187246322;
                        i13 = iM2762 ^ i4;
                        c20963 = c20962;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        i20 = i20;
                        i18 = i18;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr3;
                    }
                    break;
                case -1066962740:
                case 1713247486:
                    if (!C2023.f6737) {
                        strM8881 = str;
                        sArr2 = sArr3;
                        i6 = i21;
                        interfaceC18752M8173 = interfaceC18754;
                        i5 = i18;
                        i7 = i20;
                        interfaceC18753 = interfaceC18752M12143;
                        iM3169 = (C0773.m3169("֡ᩴ") + i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM3169 ^ i11) * 30463) ^ 1502963651;
                        i9 = -1956597689;
                        i13 = iM3169 ^ i9;
                        i12 = i8;
                        interfaceC18752M12143 = interfaceC18753;
                        i21 = i6;
                        i20 = i7;
                        sArr3 = sArr2;
                        i18 = i5;
                        interfaceC18754 = interfaceC18752M8173;
                        str = strM8881;
                        c20963 = c20962;
                    } else {
                        sArr = sArr3;
                        i21 = i21;
                        str = str;
                        interfaceC18752 = interfaceC18754;
                        int i26 = i18;
                        i20 = i20;
                        i3 = i26;
                        int iM2766 = C0619.m2761("᩺ۛ") ^ i11;
                        i13 = iM2766 ^ 1451739807;
                        i12 = ((iM2766 ^ i10) * (-19771)) ^ 1581698400;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr;
                        c20963 = c20962;
                        int i27 = i20;
                        i18 = i3;
                        i20 = i27;
                    }
                    break;
                case -1014385807:
                case 799408308:
                    strM4058 = C1080.m4058(AbstractC0116.m1233(c20963.f67042));
                    sArr5 = f67041;
                    i15 = 80;
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = (i11 - C0619.m2761("ۡ֨")) * 123;
                        i = ((iM2761 ^ i10) * 26711) ^ (-646214045);
                        i2 = -94308956;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                    } else {
                        sArr3 = sArr3;
                        i21 = i21;
                        str = str;
                        interfaceC18752 = interfaceC18754;
                        i18 = i18;
                        i20 = i20;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        iM2762 = (i10 - C0619.m2761("᩸᩶")) * (-17);
                        i12 = ((iM2762 ^ i11) * 2841) ^ (-1997653732);
                        i4 = -948883815;
                        i13 = iM2762 ^ i4;
                        c20963 = c20962;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        i20 = i20;
                        i18 = i18;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr3;
                    }
                    break;
                case -893732433:
                case -28544408:
                    i14 = 7541;
                    iM2762 = C0773.m3169("ۤܳ") ^ i10;
                    interfaceC18752 = interfaceC18754;
                    i12 = ((iM2762 ^ i11) * (-29679)) ^ (-2134240089);
                    i4 = 482554038;
                    i13 = iM2762 ^ i4;
                    c20963 = c20962;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    i20 = i20;
                    i18 = i18;
                    interfaceC18754 = interfaceC18752;
                    str = str;
                    i21 = i21;
                    sArr3 = sArr3;
                    break;
                case -890367701:
                case -316064399:
                    sArr3 = sArr3;
                    i21 = i21;
                    str = str;
                    interfaceC18752 = interfaceC18754;
                    i18 = i18;
                    i20 = i20;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    sArr6 = f67041;
                    if (AbstractC3624.f12429 > 0) {
                        iM2762 = C0619.m2761("۟ۜ") ^ i11;
                        i12 = ((iM2762 ^ i10) * 2623) ^ 1477838347;
                        i4 = -281164965;
                        i13 = iM2762 ^ i4;
                        c20963 = c20962;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        i20 = i20;
                        i18 = i18;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr3;
                    } else {
                        interfaceC18752M12143 = interfaceC18752M12143;
                        sArr = sArr3;
                        i3 = i18;
                        int iM2767 = C0619.m2761("᩺ۛ") ^ i11;
                        i13 = iM2767 ^ 1451739807;
                        i12 = ((iM2767 ^ i10) * (-19771)) ^ 1581698400;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr;
                        c20963 = c20962;
                        int i28 = i20;
                        i18 = i3;
                        i20 = i28;
                    }
                    break;
                case -672149323:
                case 435930963:
                    sArr3 = sArr3;
                    i21 = i21;
                    str = str;
                    interfaceC18752 = interfaceC18754;
                    i18 = i18;
                    i20 = i20;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    int i29 = s2 + s;
                    if (i17 - (i29 * i29) < 0) {
                        iM2762 = C0773.m3169("ۜۨ") ^ i11;
                        i12 = ((iM2762 ^ i10) * (-10503)) ^ (-1194587579);
                        i4 = -1803970758;
                    } else {
                        iM2762 = (C0619.m2761("ܶܶ") ^ i10) * 21;
                        i12 = ((iM2762 ^ i11) * 16637) ^ 65033128;
                        i4 = 1552273538;
                    }
                    i13 = iM2762 ^ i4;
                    c20963 = c20962;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    i20 = i20;
                    i18 = i18;
                    interfaceC18754 = interfaceC18752;
                    str = str;
                    i21 = i21;
                    sArr3 = sArr3;
                    break;
                case -521084357:
                case -100578228:
                    C0862.m3503();
                    break;
                case -364423642:
                case 1554336145:
                    C2375.m8061(C2966.m9665(interfaceC18752M9665, C1564.m5510(sArr5, i15, 4, i14), strM4058));
                    break;
                case -129637490:
                case 1379712099:
                    AbstractC0641.m2813();
                    C2310.m7813();
                    sArr3 = sArr3;
                    i21 = i21;
                    str = str;
                    interfaceC18752 = interfaceC18754;
                    i18 = i18;
                    i20 = i20;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    iM2762 = (i10 - C0619.m2761("᩸᩶")) * (-17);
                    i12 = ((iM2762 ^ i11) * 2841) ^ (-1997653732);
                    i4 = -948883815;
                    i13 = iM2762 ^ i4;
                    c20963 = c20962;
                    interfaceC18752M12143 = interfaceC18752M12143;
                    i20 = i20;
                    i18 = i18;
                    interfaceC18754 = interfaceC18752;
                    str = str;
                    i21 = i21;
                    sArr3 = sArr3;
                    break;
                case -22259225:
                case 1746761728:
                    sArr2 = sArr3;
                    i5 = i18;
                    i6 = i21;
                    i7 = i20;
                    interfaceC18753 = interfaceC18752M12143;
                    interfaceC18752M8173 = C2419.m8173(ApplicationC17729.f58258);
                    strM8881 = C2702.m8881(f67041, 66, 3, i14);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("֡ᩴ") + i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM3169 ^ i11) * 30463) ^ 1502963651;
                        i9 = -1956597689;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩷") ^ i10;
                        i8 = ((iM3169 ^ i11) * (-30711)) ^ 1074480121;
                        i9 = 523368302;
                    }
                    i13 = iM3169 ^ i9;
                    i12 = i8;
                    interfaceC18752M12143 = interfaceC18753;
                    i21 = i6;
                    i20 = i7;
                    sArr3 = sArr2;
                    i18 = i5;
                    interfaceC18754 = interfaceC18752M8173;
                    str = strM8881;
                    c20963 = c20962;
                    break;
                case 481335496:
                case 1836394702:
                    C1321.m4852();
                    if (C2485.f7950 == 0) {
                        strM8881 = str;
                        sArr2 = sArr3;
                        i6 = i21;
                        interfaceC18752M8173 = interfaceC18754;
                        i5 = i18;
                        i7 = i20;
                        interfaceC18753 = interfaceC18752M12143;
                        iM3169 = (C0773.m3169("֡ᩴ") + i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM3169 ^ i11) * 30463) ^ 1502963651;
                        i9 = -1956597689;
                        i13 = iM3169 ^ i9;
                        i12 = i8;
                        interfaceC18752M12143 = interfaceC18753;
                        i21 = i6;
                        i20 = i7;
                        sArr3 = sArr2;
                        i18 = i5;
                        interfaceC18754 = interfaceC18752M8173;
                        str = strM8881;
                        c20963 = c20962;
                    } else {
                        sArr3 = sArr3;
                        i21 = i21;
                        str = str;
                        interfaceC18752 = interfaceC18754;
                        i18 = i18;
                        i20 = i20;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        iM2762 = (i10 - C0619.m2761("᩸᩶")) * (-17);
                        i12 = ((iM2762 ^ i11) * 2841) ^ (-1997653732);
                        i4 = -948883815;
                        i13 = iM2762 ^ i4;
                        c20963 = c20962;
                        interfaceC18752M12143 = interfaceC18752M12143;
                        i20 = i20;
                        i18 = i18;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr3;
                    }
                    break;
                case 1290280743:
                case 1549742116:
                    interfaceC18752M40375 = C17202.m40375(interfaceC18755, RunnableC3055.m9937(sArr4, i21, i20, i14), zM33141);
                    strM6952 = C2023.m6952(AbstractC3624.m11756(c20963.f67051));
                    sArr7 = f67041;
                    if (C0862.f3233 == 0) {
                        iM2761 = C0773.m3169("᩻ۖ") ^ i10;
                        i = ((iM2761 ^ i11) * 13011) ^ 1406709399;
                        i2 = -152480598;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                    } else {
                        sArr = sArr3;
                        i21 = i21;
                        str = str;
                        interfaceC18752 = interfaceC18754;
                        int i210 = i18;
                        i20 = i20;
                        i3 = i210;
                        int iM2768 = C0619.m2761("᩺ۛ") ^ i11;
                        i13 = iM2768 ^ 1451739807;
                        i12 = ((iM2768 ^ i10) * (-19771)) ^ 1581698400;
                        interfaceC18754 = interfaceC18752;
                        str = str;
                        i21 = i21;
                        sArr3 = sArr;
                        c20963 = c20962;
                        int i211 = i20;
                        i18 = i3;
                        i20 = i211;
                    }
                    break;
                default:
                    interfaceC18752M9665 = C2966.m9665(interfaceC18752M40375, C2966.m9670(sArr7, 76, 4, i14), strM6952);
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0773.m3169("ۚۗ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i10) * (-679)) ^ 350564754;
                        i2 = 1645784615;
                    } else {
                        iM2761 = (C0619.m2761("ۨ֡") ^ i11) * (-83);
                        i = ((iM2761 ^ i10) * 16635) ^ 613209787;
                        i2 = 862159634;
                    }
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0365 A[PHI: r16 r17
      0x0365: PHI (r16v25 l.᩹ۖ᩸) = (r16v3 l.᩹ۖ᩸), (r16v4 l.᩹ۖ᩸), (r16v26 l.᩹ۖ᩸) binds: [B:84:0x0363, B:80:0x033e, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0365: PHI (r17v27 java.lang.Exception) = (r17v4 java.lang.Exception), (r17v5 java.lang.Exception), (r17v28 java.lang.Exception) binds: [B:84:0x0363, B:80:0x033e, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x039d A[PHI: r7 r16 r17
      0x039d: PHI (r7v2 short) = (r7v1 short), (r7v3 short) binds: [B:88:0x039b, B:68:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r16v7 l.᩹ۖ᩸) = (r16v2 l.᩹ۖ᩸), (r16v8 l.᩹ۖ᩸) binds: [B:88:0x039b, B:68:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r17v8 java.lang.Exception) = (r17v3 java.lang.Exception), (r17v9 java.lang.Exception) binds: [B:88:0x039b, B:68:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x040c A[PHI: r8 r16 r17
      0x040c: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:96:0x040a, B:64:0x027a, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r16v19 l.᩹ۖ᩸) = (r16v0 l.᩹ۖ᩸), (r16v9 l.᩹ۖ᩸), (r16v20 l.᩹ۖ᩸) binds: [B:96:0x040a, B:64:0x027a, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x040c: PHI (r17v20 java.lang.Exception) = (r17v1 java.lang.Exception), (r17v10 java.lang.Exception), (r17v21 java.lang.Exception) binds: [B:96:0x040a, B:64:0x027a, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (l.C1783.m6232() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (l.C0619.f2439 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (l.AbstractC3624.f12429 <= 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        r17 = r0;
        r16 = r2;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47926(l.C20962 r20, l.C8614 r21, l.DialogInterfaceC8327 r22, final l.C1255 r23, java.lang.String r24, final l.C1255 r25) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20962.m47926(l.᩶֨ۤ, l.۠ۨܳ, l.۠ۖۧ, l.֨ܶ, java.lang.String, l.֨ܶ):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a4 A[PHI: r1 r2 r18
      0x03a4: PHI (r1v4 l.ۙۧۛ) = (r1v3 l.ۙۧۛ), (r1v1 l.ۙۧۛ) binds: [B:100:0x03a2, B:96:0x037e] A[DONT_GENERATE, DONT_INLINE]
      0x03a4: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String) binds: [B:100:0x03a2, B:96:0x037e] A[DONT_GENERATE, DONT_INLINE]
      0x03a4: PHI (r18v13 int) = (r18v12 int), (r18v14 int) binds: [B:100:0x03a2, B:96:0x037e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x041d A[PHI: r18
      0x041d: PHI (r18v10 int) = (r18v8 int), (r18v11 int) binds: [B:110:0x041b, B:105:0x03db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0451 A[PHI: r7 r18
      0x0451: PHI (r7v4 l.ۙۧۛ) = (r7v1 l.ۙۧۛ), (r7v3 l.ۙۧۛ), (r7v1 l.ۙۧۛ) binds: [B:114:0x044f, B:78:0x02b8, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0451: PHI (r18v52 int) = (r18v7 int), (r18v21 int), (r18v55 int) binds: [B:114:0x044f, B:78:0x02b8, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x047d A[PHI: r14 r18
      0x047d: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v1 java.lang.String), (r14v1 java.lang.String), (r14v1 java.lang.String) binds: [B:49:0x0157, B:24:0x008c, B:21:0x0081, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x047d: PHI (r18v56 int) = (r18v32 int), (r18v44 int), (r18v46 int), (r18v60 int) binds: [B:49:0x0157, B:24:0x008c, B:21:0x0081, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x04ad A[PHI: r8 r18
      0x04ad: PHI (r8v3 java.lang.String) = 
      (r8v1 java.lang.String)
      (r8v2 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
     binds: [B:120:0x04ab, B:74:0x0293, B:31:0x00b9, B:27:0x0098, B:18:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x04ad: PHI (r18v47 int) = (r18v6 int), (r18v22 int), (r18v42 int), (r18v43 int), (r18v49 int) binds: [B:120:0x04ab, B:74:0x0293, B:31:0x00b9, B:27:0x0098, B:18:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[PHI: r18
      0x009c: PHI (r18v53 int) = (r18v43 int), (r18v44 int), (r18v54 int) binds: [B:27:0x0098, B:24:0x008c, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x017e A[PHI: r13 r18
      0x017e: PHI (r13v4 l.ۙۧۛ) = (r13v3 l.ۙۧۛ), (r13v1 l.ۙۧۛ) binds: [B:53:0x017c, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x017e: PHI (r18v45 int) = (r18v31 int), (r18v46 int) binds: [B:53:0x017c, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0273 A[PHI: r9 r18
      0x0273: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v1 java.lang.String) binds: [B:70:0x025b, B:61:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r18v26 int) = (r18v23 int), (r18v27 int) binds: [B:70:0x025b, B:61:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0360 A[PHI: r3 r4 r18
      0x0360: PHI (r3v3 int) = (r3v2 int), (r3v1 int) binds: [B:92:0x0346, B:87:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r4v3 int) = (r4v2 int), (r4v1 int) binds: [B:92:0x0346, B:87:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r18v17 int) = (r18v15 int), (r18v19 int) binds: [B:92:0x0346, B:87:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m47940(ArrayList arrayList) {
        int i;
        int iM3169;
        int i2;
        int i3;
        int i4;
        InterfaceC4859 interfaceC4859 = null;
        String strM2823 = null;
        int i5 = 0;
        int i6 = 0;
        ArrayList arrayList2 = null;
        Iterator itM4942 = null;
        InterfaceC4859 interfaceC48510 = null;
        String strM2824 = null;
        String strMo6804 = null;
        C4245 c4245M52087 = null;
        C4245 c4245M52088 = null;
        Iterator itM4943 = null;
        InterfaceC4859 interfaceC48511 = null;
        String strMo6805 = null;
        int i7 = 2003435341;
        int i8 = AbstractC0116.f1064;
        int i9 = C1519.f5300;
        int iM2761 = (C0619.m2761("ᩳ᩻") ^ i8) * (-65);
        int i10 = ((iM2761 ^ i9) * 14665) ^ (-1925108416);
        int i11 = iM2761 ^ 1866476362;
        Iterator itM13647 = null;
        while (true) {
            int i12 = i11 ^ (i10 & (((i7 ^ i9) * (-32765)) >> 31));
            switch (i12) {
                case -2094848016:
                case -29552908:
                    i = i12;
                    if (C3099.m10097(arrayList)) {
                        iM3169 = C0773.m3169("ܳۢ") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-8465)) ^ 964037093;
                        i3 = 317691658;
                    } else {
                        iM3169 = C0773.m3169("֫ܽ") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-12921)) ^ (-1184847257);
                        i3 = -1222657073;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -2057116241:
                case 1419833254:
                    i = i12;
                    strM2824 = AbstractC0641.m2823(interfaceC48510);
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("֡֨") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-18807)) ^ (-1256725859);
                        i3 = 1909449542;
                    } else {
                        iM3169 = C0773.m3169("ۛܽ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 20585) ^ (-392848671);
                        i3 = 2063073637;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -2007306170:
                case -1213427095:
                    return arrayList2;
                case -1926452428:
                case 1136673084:
                    C2023.m6964();
                    AbstractC3624.m11755();
                    return null;
                case -1821453858:
                case 490803070:
                    i = i12;
                    if (C2375.m8073(strMo6804, i5) == i6) {
                        iM3169 = C0619.m2761("֫ۘ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 15847) ^ (-1840497152);
                        i3 = -1337957309;
                    } else {
                        iM3169 = (C0619.m2761("ۧۚ") + i8) * (-57);
                        i2 = ((iM3169 ^ i9) * (-20825)) ^ (-1203123282);
                        i3 = -2101330169;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1775736530:
                case -1383493926:
                    i = i12;
                    c4245M52087 = AbstractC23166.m52087(strM2824);
                    c4245M52088 = AbstractC23166.m52087(strMo6804);
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 13875) ^ (-909668622);
                        i3 = 1306552157;
                    } else {
                        iM3169 = C0619.m2761("ۖܳ") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-3999)) ^ 1801199515;
                        i3 = -100364485;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1742056171:
                case 1400834698:
                    i = i12;
                    C1519.m5406(arrayList2, interfaceC48511);
                    int iM31610 = C0773.m3169("۟֫") ^ i9;
                    i10 = ((iM31610 ^ i8) * 16975) ^ 566514492;
                    i4 = i;
                    i11 = iM31610 ^ (-1496685585);
                    i7 = i4;
                    break;
                case -1690993562:
                case -203772339:
                    i = i12;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("֡֨") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-18807)) ^ (-1256725859);
                        i3 = 1909449542;
                    } else {
                        iM3169 = C0773.m3169("ܶۚ") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-6545)) ^ (-555725189);
                        i3 = 760950272;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1681384062:
                case -1109406312:
                    i = i12;
                    strMo6805 = interfaceC48511.mo6804();
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("֫᩵") ^ i8;
                        i2 = ((iM3169 ^ i9) * 10673) ^ (-1107201646);
                        i3 = 1359213804;
                    } else {
                        iM3169 = C0773.m3169("ۖۛ") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-7345)) ^ (-572956799);
                        i3 = -2000010178;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1638490762:
                case 512234506:
                    C0862.m3503();
                    if (C11235.f35427 < 0) {
                        i = i12;
                        iM3169 = C0773.m3169("֨ۨ") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-16219)) ^ 1891586749;
                        i3 = 1981157170;
                        i4 = i;
                        i11 = iM3169 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    i = i12;
                    iM3169 = C0619.m2761("᩶ܿ") ^ i9;
                    i2 = ((iM3169 ^ i8) * 11755) ^ (-700007938);
                    i3 = 2024159338;
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1527174326:
                case -488373527:
                    i = i12;
                    C2287.m7745();
                    if (C3734.f12817 < 0) {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i9;
                        i2 = ((iM3169 ^ i8) * 11755) ^ (-700007938);
                        i3 = 2024159338;
                    } else {
                        iM3169 = C0773.m3169("֫᩵") ^ i8;
                        i2 = ((iM3169 ^ i9) * 10673) ^ (-1107201646);
                        i3 = 1359213804;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1511215789:
                case 2129012507:
                    i = i12;
                    strMo6804 = interfaceC48510.mo6804();
                    if (C11235.m28315(strM2824, i5) == i6) {
                        iM3169 = C0619.m2761("ܶ֫") ^ i8;
                        i2 = ((iM3169 ^ i9) * 18263) ^ (-577293958);
                        i3 = -1754216105;
                    } else {
                        iM3169 = (C0619.m2761("ۧۚ") + i8) * (-57);
                        i2 = ((iM3169 ^ i9) * (-20825)) ^ (-1203123282);
                        i3 = -2101330169;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1490200444:
                case 1976675037:
                    i = i12;
                    C1343.m4943();
                    iM3169 = (i8 - C0619.m2761("۟ۤ")) * 77;
                    i2 = ((iM3169 ^ i9) * (-17623)) ^ (-1538288964);
                    i3 = 2127588503;
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1478781988:
                case -1412262132:
                    i = i12;
                    C2702.m8876();
                    if (C3033.f9831 < 0) {
                        iM3169 = (i8 - C0619.m2761("۟ۤ")) * 77;
                        i2 = ((iM3169 ^ i9) * (-17623)) ^ (-1538288964);
                        i3 = 2127588503;
                    } else {
                        iM3169 = C0773.m3169("֡֨") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-18807)) ^ (-1256725859);
                        i3 = 1909449542;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1430558809:
                case 360660515:
                    i = i12;
                    if (C1826.m6317(itM13647)) {
                        iM3169 = (C0619.m2761("ۚ۠") ^ i9) * (-5);
                        i2 = ((iM3169 ^ i8) * (-5117)) ^ 2006344262;
                        i3 = -1185275047;
                    } else {
                        iM3169 = C0773.m3169("ܳۢ") ^ i9;
                        i2 = ((iM3169 ^ i8) * (-8465)) ^ 964037093;
                        i3 = 317691658;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1277601040:
                case 1328889183:
                    i = i12;
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("֨ۨ") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-16219)) ^ 1891586749;
                        i3 = 1981157170;
                    } else {
                        iM3169 = (C0619.m2761("ۜ֫") + i8) * (-65);
                        i2 = ((iM3169 ^ i9) * (-8923)) ^ 1638131062;
                        i3 = 232205249;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1275199889:
                case 920268344:
                    i = i12;
                    i5 = 42;
                    i6 = -1;
                    if (C2375.m8073(strM2823, 42) == -1) {
                        iM3169 = (C0619.m2761("ܺۛ") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM3169 ^ i9) * (-25983)) ^ 2074930448;
                        i3 = -996686695;
                    } else {
                        iM3169 = C0619.m2761("ᩳܶ") ^ i9;
                        i2 = ((iM3169 ^ i8) * 27851) ^ (-150975645);
                        i3 = 452382873;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1268895886:
                case 780529360:
                    i = i12;
                    RunnableC0334.m2054(arrayList2, interfaceC48510);
                    iM3169 = (C0619.m2761("᩶᩶") ^ i9) * 43;
                    i2 = ((iM3169 ^ i8) * (-30289)) ^ (-1110875996);
                    i3 = -542616145;
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1252195598:
                case 1751227650:
                    i = i12;
                    itM13647 = C4282.m13647(arrayList);
                    iM3169 = (C0619.m2761("ܳۛ") ^ i8) * 89;
                    i2 = ((iM3169 ^ i9) * 9135) ^ (-120124063);
                    i3 = 2064162743;
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -1011790287:
                case 1428013946:
                    i = i12;
                    C2878.m9491();
                    if (C2966.m9664()) {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i9;
                        i2 = ((iM3169 ^ i8) * 11755) ^ (-700007938);
                        i3 = 2024159338;
                    } else {
                        iM3169 = C0773.m3169("֡֨") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-18807)) ^ (-1256725859);
                        i3 = 1909449542;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -980714619:
                case -757465082:
                    i = i12;
                    ArrayList arrayList3 = new ArrayList();
                    itM4942 = C1343.m4942(arrayList);
                    arrayList2 = arrayList3;
                    iM3169 = (C0619.m2761("᩶᩶") ^ i9) * 43;
                    i2 = ((iM3169 ^ i8) * (-30289)) ^ (-1110875996);
                    i3 = -542616145;
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -966783070:
                case 1373301008:
                    i = i12;
                    interfaceC48511 = (InterfaceC4859) C0950.m3796(itM4943);
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ܰ᩶") ^ i9;
                        i2 = ((iM3169 ^ i8) * 16397) ^ 252045218;
                        i3 = 1033530256;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩵") ^ i8) * (-109);
                        i2 = ((iM3169 ^ i9) * 3163) ^ 1027511108;
                        i3 = -1526813241;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -943412563:
                case -605058559:
                    i = i12;
                    strM2823 = AbstractC0641.m2823(interfaceC4859);
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("ۖۜ") + i9) * (-19);
                        i2 = ((iM3169 ^ i8) * 643) ^ (-1082185557);
                        i3 = 1996692139;
                    } else {
                        iM3169 = C0773.m3169("᩻ۘ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 24593) ^ 1422404169;
                        i3 = 851961913;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -851703395:
                case 613264246:
                    i = i12;
                    if (AbstractC23166.m52089(interfaceC48510, interfaceC48511)) {
                        iM3169 = C0619.m2761("ۗܿ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 32433) ^ (-728805597);
                        i3 = -590285031;
                        i4 = i;
                        i11 = iM3169 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    int iM31611 = C0773.m3169("۟֫") ^ i9;
                    i10 = ((iM31611 ^ i8) * 16975) ^ 566514492;
                    i4 = i;
                    i11 = iM31611 ^ (-1496685585);
                    i7 = i4;
                    break;
                case -846077638:
                case 142493547:
                    return arrayList;
                case -657534483:
                case 1268241045:
                    i = i12;
                    c4245M52087.m13568reset((CharSequence) AbstractC0641.m2823(interfaceC48511));
                    if (c4245M52087.matches()) {
                        iM3169 = C0619.m2761("ۘ᩹") ^ i9;
                        i2 = ((iM3169 ^ i8) * 10537) ^ 1545612781;
                        i3 = -1946061804;
                        i4 = i;
                        i11 = iM3169 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    int iM31612 = C0773.m3169("۟֫") ^ i9;
                    i10 = ((iM31612 ^ i8) * 16975) ^ 566514492;
                    i4 = i;
                    i11 = iM31612 ^ (-1496685585);
                    i7 = i4;
                    break;
                case -425511072:
                case -214292744:
                    i = i12;
                    interfaceC48510 = (InterfaceC4859) C4238.m13529(itM4942);
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("֨ۨ") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-16219)) ^ 1891586749;
                        i3 = 1981157170;
                    } else {
                        iM3169 = (i9 - C0619.m2761("ۗۗ")) * (-45);
                        i2 = ((iM3169 ^ i8) * (-29615)) ^ (-1274683064);
                        i3 = -498601493;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -329163239:
                case 1435246970:
                    i = i12;
                    if (C3998.m12923(itM4942)) {
                        iM3169 = C0773.m3169("۫ۚ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 30693) ^ 976612324;
                        i3 = -490924141;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩸") + i9) * (-17);
                        i2 = ((iM3169 ^ i8) * 22503) ^ 7169652;
                        i3 = -1606755177;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -94183487:
                case 2041850236:
                    i = i12;
                    if (C1826.m6317(itM4943)) {
                        iM3169 = (i9 - C0773.m3169("ۧܳ")) * (-7);
                        i2 = ((iM3169 ^ i8) * 6743) ^ (-1566565357);
                        i3 = 636491225;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩶") ^ i9) * 43;
                        i2 = ((iM3169 ^ i8) * (-30289)) ^ (-1110875996);
                        i3 = -542616145;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case -93552458:
                case 931449516:
                    i = i12;
                    if (C2375.m8073(interfaceC4859.mo6804(), i5) != i6) {
                        iM3169 = C0619.m2761("ᩳܶ") ^ i9;
                        i2 = ((iM3169 ^ i8) * 27851) ^ (-150975645);
                        i3 = 452382873;
                    } else {
                        iM3169 = (C0619.m2761("ܳۛ") ^ i8) * 89;
                        i2 = ((iM3169 ^ i9) * 9135) ^ (-120124063);
                        i3 = 2064162743;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 466789882:
                case 1583465185:
                    i = i12;
                    interfaceC4859 = (InterfaceC4859) C4238.m13529(itM13647);
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۖۜ") + i9) * (-19);
                        i2 = ((iM3169 ^ i8) * 643) ^ (-1082185557);
                        i3 = 1996692139;
                    } else {
                        iM3169 = (i8 - C0773.m3169("ۤ᩹")) * (-41);
                        i2 = ((iM3169 ^ i9) * 17405) ^ (-536439254);
                        i3 = -1863615764;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 628802585:
                case 1511885404:
                    i = i12;
                    itM4943 = C1343.m4942(this.f67044);
                    int iM31613 = C0773.m3169("۟֫") ^ i9;
                    i10 = ((iM31613 ^ i8) * 16975) ^ 566514492;
                    i4 = i;
                    i11 = iM31613 ^ (-1496685585);
                    i7 = i4;
                    break;
                case 691849386:
                case 1241358615:
                    if (C3492.f12043 <= 0) {
                        i = i12;
                        iM3169 = C0773.m3169("֡֨") ^ i8;
                        i2 = ((iM3169 ^ i9) * (-18807)) ^ (-1256725859);
                        i3 = 1909449542;
                    } else {
                        iM3169 = C0619.m2761("ۙۤ") ^ i9;
                        i = i12;
                        i2 = ((iM3169 ^ i8) * (-8595)) ^ (-1088994666);
                        i3 = -1513994146;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 751563484:
                case 1913144526:
                    if (!RunnableC1848.f6235) {
                        i = i12;
                        iM3169 = C0619.m2761("᩺ܰ") ^ i8;
                        i2 = ((iM3169 ^ i9) * 13875) ^ (-909668622);
                        i3 = 1306552157;
                        i4 = i;
                        i11 = iM3169 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    i = i12;
                    iM3169 = C0619.m2761("᩶ܿ") ^ i9;
                    i2 = ((iM3169 ^ i8) * 11755) ^ (-700007938);
                    i3 = 2024159338;
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                case 880341471:
                case 1471418052:
                    i = i12;
                    c4245M52088.m13568reset((CharSequence) strMo6805);
                    if (c4245M52088.matches()) {
                        iM3169 = C0773.m3169("᩶ۡ") ^ i9;
                        i2 = ((iM3169 ^ i8) * 29667) ^ (-1062015981);
                        i3 = -68157342;
                        i4 = i;
                        i11 = iM3169 ^ i3;
                        i10 = i2;
                        i7 = i4;
                    }
                    int iM31614 = C0773.m3169("۟֫") ^ i9;
                    i10 = ((iM31614 ^ i8) * 16975) ^ 566514492;
                    i4 = i;
                    i11 = iM31614 ^ (-1496685585);
                    i7 = i4;
                    break;
                case 1245721684:
                case 2059141962:
                    i = i12;
                    C0862.m3503();
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("֫᩵") ^ i8;
                        i2 = ((iM3169 ^ i9) * 10673) ^ (-1107201646);
                        i3 = 1359213804;
                    } else {
                        iM3169 = C0619.m2761("ܰ᩶") ^ i9;
                        i2 = ((iM3169 ^ i8) * 16397) ^ 252045218;
                        i3 = 1033530256;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
                default:
                    i = i12;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("֫᩵") ^ i8;
                        i2 = ((iM3169 ^ i9) * 10673) ^ (-1107201646);
                        i3 = 1359213804;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩵") ^ i9;
                        i2 = ((iM3169 ^ i8) * 12043) ^ (-640400411);
                        i3 = -1874115587;
                    }
                    i4 = i;
                    i11 = iM3169 ^ i3;
                    i10 = i2;
                    i7 = i4;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m47933(C20962 c20962) {
        C23255 c23255 = null;
        InterfaceC19106 interfaceC19106M1233 = null;
        String strM6952 = null;
        boolean zM33141 = false;
        String strM4058 = null;
        int i = 1934048465;
        int i2 = C4282.f15546;
        int i3 = C2966.f9654;
        int iM3169 = (C0773.m3169("ܽۢ") ^ i3) * 57;
        int i4 = ((iM3169 ^ i2) * (-23815)) ^ (-1362938484);
        int i5 = 2093770238;
        while (true) {
            i = ((((i ^ i2) * 26515) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2075752261:
                case 621972254:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27013)) ^ 454045134;
                        i5 = 1646671995;
                    } else {
                        iM3169 = C0773.m3169("ܰ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11245)) ^ 1304506162;
                        i5 = -1788031982;
                    }
                    break;
                case -2027763160:
                case -869512177:
                    c23255 = c20962.f67042;
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0619.m2761("᩻ۡ") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * 14949) ^ 741268175;
                        i5 = 1252429090;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۠ۘ")) * 119;
                        i4 = ((iM3169 ^ i3) * (-20185)) ^ 130302847;
                        i5 = 737564211;
                    }
                    break;
                case -1962779559:
                case 1513608499:
                    interfaceC19106M1233 = AbstractC0116.m1233(c23255);
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܶܿ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-28921)) ^ (-917468021);
                        i5 = 1992133865;
                    } else {
                        iM3169 = C0773.m3169("ܰܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8529)) ^ 1110453494;
                        i5 = 1213045510;
                    }
                    break;
                case -1657238237:
                case 294355230:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27013)) ^ 454045134;
                        i5 = 1646671995;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֨ۖ")) * 75;
                        i4 = ((iM3169 ^ i2) * (-4109)) ^ 706904567;
                        i5 = -407175716;
                    }
                    break;
                case -1627977794:
                case -1463396827:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳۖ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6639)) ^ (-2038309680);
                        i5 = 1281997426;
                    } else {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27013)) ^ 454045134;
                        i5 = 1646671995;
                    }
                    break;
                case -1596022063:
                case 1375132036:
                    if (C2310.f7472 < 0) {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27013)) ^ 454045134;
                        i5 = 1646671995;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܶۨ")) * 55;
                        i4 = ((iM3169 ^ i3) * 21157) ^ (-1245230054);
                        i5 = -1348237527;
                    }
                    break;
                case -1223290305:
                case 742507592:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-28921)) ^ (-917468021);
                        i5 = 1992133865;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۙۙ")) * 21;
                        i4 = ((iM3169 ^ i2) * (-13783)) ^ (-2070550720);
                        i5 = -1088743326;
                    }
                    break;
                case -1173485771:
                case 1115304897:
                    C2288.m7767();
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("᩻ۡ") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * 14949) ^ 741268175;
                        i5 = 1252429090;
                    } else {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27013)) ^ 454045134;
                        i5 = 1646671995;
                    }
                    break;
                case -770596998:
                case -274502277:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27013)) ^ 454045134;
                        i5 = 1646671995;
                    } else {
                        iM3169 = (C0619.m2761("۠ܺ") ^ i2) * (-119);
                        i4 = ((iM3169 ^ i3) * 2751) ^ 1813780754;
                        i5 = -1817284891;
                    }
                    break;
                case -715999035:
                case 2088263289:
                    strM6952 = C2023.m6952(interfaceC19106M1233);
                    zM33141 = C13473.m33141(c20962.f67045);
                    if (zM33141) {
                        iM3169 = C0773.m3169("۫᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8295) ^ 722003734;
                        i5 = -1169804454;
                    } else {
                        iM3169 = (C0773.m3169("᩻ܿ") ^ i2) * (-39);
                        i4 = ((iM3169 ^ i3) * (-3139)) ^ (-732437392);
                        i5 = 2068143371;
                    }
                    break;
                case -373161820:
                case -12925372:
                    AbstractC0641.m2813();
                    C3779.m12264();
                    iM3169 = (i2 - C0619.m2761("ܶۨ")) * 55;
                    i4 = ((iM3169 ^ i3) * 21157) ^ (-1245230054);
                    i5 = -1348237527;
                    break;
                case 141815200:
                case 403296503:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-28921)) ^ (-917468021);
                        i5 = 1992133865;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۜۚ")) * 33;
                        i4 = ((iM3169 ^ i3) * (-13927)) ^ (-1303833602);
                        i5 = -490175676;
                    }
                    break;
                case 281632386:
                case 1318656080:
                    strM4058 = "";
                    iM3169 = (C0773.m3169("ᩴۜ") + i3) * 75;
                    i4 = ((iM3169 ^ i2) * (-24251)) ^ (-1662329717);
                    i5 = -1480150247;
                    break;
                case 541071052:
                case 1805826210:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ᩳۖ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6639)) ^ (-2038309680);
                        i5 = 1281997426;
                    } else {
                        iM3169 = C0773.m3169("᩶ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28253) ^ (-361583346);
                        i5 = -519246200;
                    }
                    break;
                case 660145782:
                case 1081302415:
                    strM4058 = C1080.m4058(AbstractC0116.m1233(c20962.f67051));
                    iM3169 = (C0773.m3169("ᩴۜ") + i3) * 75;
                    i4 = ((iM3169 ^ i2) * (-24251)) ^ (-1662329717);
                    i5 = -1480150247;
                    break;
                case 918106023:
                case 1553082173:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ܶܿ") + i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-28921)) ^ (-917468021);
                        i5 = 1992133865;
                    } else {
                        iM3169 = C0773.m3169("ܳܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3077)) ^ 189475945;
                        i5 = -1180969892;
                    }
                    break;
                case 1056123983:
                case 2081427650:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("᩻ۡ") ^ i2) * q.h;
                        i4 = ((iM3169 ^ i3) * 14949) ^ 741268175;
                        i5 = 1252429090;
                    } else {
                        iM3169 = (C0619.m2761("ܽ᩶") + i2) * (-51);
                        i4 = ((iM3169 ^ i3) * (-24625)) ^ 388095006;
                        i5 = -1774420344;
                    }
                    break;
                case 1411740072:
                case 1902054444:
                    C3448.m11248();
                    break;
                default:
                    C3448.m11245(new C6046(c20962, zM33141, strM4058, strM6952));
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0136 A[PHI: r2
      0x0136: PHI (r2v7 l.᩷ۨᩴ) = (r2v6 l.᩷ۨᩴ), (r2v2 l.᩷ۨᩴ), (r2v2 l.᩷ۨᩴ) binds: [B:35:0x0134, B:12:0x0049, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0261 A[PHI: r1 r5 r7
      0x0261: PHI (r1v8 l.᩷ۨᩴ) = (r1v1 l.᩷ۨᩴ), (r1v1 l.᩷ۨᩴ), (r1v7 l.᩷ۨᩴ), (r1v1 l.᩷ۨᩴ) binds: [B:66:0x025f, B:54:0x0207, B:43:0x0198, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:66:0x025f, B:54:0x0207, B:43:0x0198, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r7v5 int) = (r7v1 int), (r7v4 int), (r7v1 int), (r7v1 int) binds: [B:66:0x025f, B:54:0x0207, B:43:0x0198, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x028b  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e1 A[PHI: r3 r6
      0x02e1: PHI (r3v3 l.᩷ۨᩴ) = (r3v2 l.᩷ۨᩴ), (r3v2 l.᩷ۨᩴ), (r3v6 l.᩷ۨᩴ) binds: [B:76:0x02df, B:58:0x0229, B:39:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r6v5 short) = (r6v1 short), (r6v4 short), (r6v1 short) binds: [B:76:0x02df, B:58:0x0229, B:39:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47929(boolean z, boolean z2, List list, C9651 c9651, boolean z3) {
        int iM3169;
        int i;
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22044M7806 = null;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1850186776;
        int i5 = AbstractC0116.f1064;
        int i6 = C0269.f1558;
        int iM2761 = C0619.m2761("۬ۨ") ^ i5;
        int i7 = ((iM2761 ^ i6) * 30165) ^ (-1148373756);
        int i8 = iM2761 ^ 353117791;
        String strM4058 = null;
        boolean zM12930 = false;
        AbstractC22044 abstractC22044M7807 = null;
        AbstractC22044 abstractC22044M7808 = null;
        while (true) {
            i4 = ((((i4 ^ i6) * 2275) >> 31) & i7) ^ i8;
            switch (i4) {
                case -2120394982:
                case -1750773990:
                    zM12930 = C3998.m12930(abstractC22044M7807);
                    iM3169 = C0773.m3169("ۖۛ") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-24473)) ^ 1568825248;
                    i = -429552859;
                    i8 = iM3169 ^ i;
                    break;
                case -2074575184:
                case 609696776:
                    C17202.m40373(C4238.m13530(f67041, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 5, i3));
                    break;
                case -1730916671:
                case -1244367292:
                    C3099.m10095();
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ۛۤ") + i6) * (-57);
                        i7 = ((iM3169 ^ i5) * 2783) ^ 462629675;
                        i = -1242191854;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-28515)) ^ 277214419;
                        i = 931513120;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -1682319875:
                case -857542998:
                    C2878.m9491();
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-28515)) ^ 277214419;
                        i = 931513120;
                    } else {
                        iM3169 = (C0773.m3169("ܺܶ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM3169 ^ i6) * (-19179)) ^ (-404168871);
                        i = -1400523515;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -1396600904:
                case -292611866:
                    int i9 = s + 1;
                    if (i2 - (i9 * i9) > 0) {
                        iM3169 = (C0773.m3169("۬۬") ^ i6) * (-29);
                        i7 = ((iM3169 ^ i5) * (-273)) ^ (-658221984);
                        i = -1123479937;
                    } else {
                        iM3169 = C0619.m2761("ۜᩴ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 26023) ^ 1615905297;
                        i = -712143644;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -1343914225:
                case -87295005:
                    i3 = 34046;
                    iM3169 = (C0619.m2761("ۙۚ") ^ i5) * (-29);
                    i7 = ((iM3169 ^ i6) * 10275) ^ 638065897;
                    i = -1399774148;
                    i8 = iM3169 ^ i;
                    break;
                case -1135651755:
                case -920401409:
                    if (zM12930) {
                        iM3169 = C0773.m3169("᩻ܽ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-5101)) ^ (-1828607855);
                        i = 1299725594;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۤ֨")) * (-53);
                        i7 = ((iM3169 ^ i6) * (-28421)) ^ 1239811415;
                        i = 347059153;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -1095837443:
                case -45814749:
                    s = f67041[101];
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۚۧ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32183)) ^ (-1698891372);
                        i = -574637239;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۛۚ")) * 101;
                        i7 = ((iM3169 ^ i6) * 22259) ^ (-433893596);
                        i = 1414445289;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -1040117197:
                case -621543043:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܺܶ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM3169 ^ i6) * (-19179)) ^ (-404168871);
                        i = -1400523515;
                    } else {
                        iM3169 = C0619.m2761("᩷ۜ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-23583)) ^ (-1438716168);
                        i = -1846838361;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -877840808:
                case 266109526:
                    i2 = (s * 2) + 1;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("᩵ܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * 15777) ^ 733534715;
                        i = 2044336067;
                    } else {
                        iM3169 = (i5 - C0773.m3169("۬᩹")) * 123;
                        i7 = ((iM3169 ^ i6) * 21195) ^ (-982242128);
                        i = 1454479277;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -805061165:
                case 415479267:
                    C1826.m6301();
                    C3734.m12152();
                    break;
                case -800827171:
                case -624963492:
                    C3448.m11245(new C14248(this, abstractC22044M7808, abstractC22044M7807, abstractC22044M7806, strM4058, z, z2, list, c9651, z3));
                    break;
                case -643719752:
                case -314037774:
                    if (C3779.f12953 > 0) {
                        iM3169 = (C0619.m2761("ۛۤ") + i6) * (-57);
                        i7 = ((iM3169 ^ i5) * 2783) ^ 462629675;
                        i = -1242191854;
                    } else {
                        iM3169 = (C0773.m3169("᩵ܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * 15777) ^ 733534715;
                        i = 2044336067;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -508079721:
                case 1211888480:
                    abstractC22044M7808 = C2310.m7806(abstractC22044M7807, C1321.m4861(f67041, 109, 8, i3));
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("ۛۤ") + i6) * (-57);
                        i7 = ((iM3169 ^ i5) * 2783) ^ 462629675;
                        i = -1242191854;
                    } else {
                        iM3169 = C0773.m3169("ۘ۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11835) ^ (-379614124);
                        i = 1811894559;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -436887259:
                case 1648204071:
                    try {
                        C3734.m12147(abstractC22044M7807);
                        iM3169 = (i5 - C0619.m2761("ۤ֨")) * (-53);
                        i7 = ((iM3169 ^ i6) * (-28421)) ^ 1239811415;
                        i = 347059153;
                    } catch (IOException unused) {
                        iM3169 = (i5 - C0773.m3169("֡᩶")) * (-31);
                        i7 = ((iM3169 ^ i6) * 8387) ^ (-629520560);
                        i = -1543460881;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -283947527:
                case 1775205034:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("᩵ܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * 15777) ^ 733534715;
                        i = 2044336067;
                    } else {
                        iM3169 = C0619.m2761("ۤܿ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-31949)) ^ 1223182758;
                        i = -555081702;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -257264230:
                case 604275723:
                    strM4058 = C1080.m4058(AbstractC3624.m11756(this.f67042));
                    this.f67050 = null;
                    abstractC22044 = C6382.f21562;
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("᩵ܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * 15777) ^ 733534715;
                        i = 2044336067;
                    } else {
                        iM3169 = (C0773.m3169("֫ۙ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM3169 ^ i6) * 17225) ^ (-476457884);
                        i = -1771089796;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case -126054579:
                case 402854530:
                    i3 = 51966;
                    iM3169 = (C0619.m2761("ۙۚ") ^ i5) * (-29);
                    i7 = ((iM3169 ^ i6) * 10275) ^ 638065897;
                    i = -1399774148;
                    i8 = iM3169 ^ i;
                    break;
                case 72395469:
                case 100028983:
                    C0773.m3161();
                    iM3169 = C0773.m3169("ۚ᩶") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-28515)) ^ 277214419;
                    i = 931513120;
                    i8 = iM3169 ^ i;
                    break;
                case 166504259:
                case 829255417:
                    C2419.m8176(abstractC22044M7807);
                    C3492.m11478(abstractC22044M7806);
                    iM3169 = (C0773.m3169("ۧۜ") + i5) * 91;
                    i7 = ((iM3169 ^ i6) * 21321) ^ (-1379835979);
                    i = -1376951849;
                    i8 = iM3169 ^ i;
                    break;
                case 286394015:
                case 936414992:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۚۧ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32183)) ^ (-1698891372);
                        i = -574637239;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۢ᩻")) * (-67);
                        i7 = ((iM3169 ^ i5) * 31197) ^ 206944916;
                        i = -425503233;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case 339436367:
                case 1181196369:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-28515)) ^ 277214419;
                        i = 931513120;
                    } else {
                        iM3169 = C0619.m2761("۟᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * 19565) ^ 145419215;
                        i = 1011296037;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case 572058687:
                case 1051646394:
                    abstractC22044M7807 = C2310.m7806(abstractC22044, AbstractC0641.m2820(f67041, IShizukuService.Stub.TRANSACTION_attachUserService, 7, i3));
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۚۧ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32183)) ^ (-1698891372);
                        i = -574637239;
                    } else {
                        iM3169 = C0773.m3169("ܳ۫") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-12901)) ^ 903160782;
                        i = -823054448;
                    }
                    i8 = iM3169 ^ i;
                    break;
                case 1762012622:
                case 1877047223:
                    abstractC22044M7806 = C2310.m7806(abstractC22044M7807, C4282.m13650(f67041, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i3));
                    iM3169 = (C0619.m2761("ۡ۫") + i6) * (-51);
                    i7 = ((iM3169 ^ i5) * 15125) ^ (-860703875);
                    i = 57055855;
                    i8 = iM3169 ^ i;
                    break;
                default:
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("֡۟") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-2909)) ^ (-383974844);
                        i = -1068146504;
                    } else {
                        iM3169 = (C0773.m3169("ܺܶ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM3169 ^ i6) * (-19179)) ^ (-404168871);
                        i = -1400523515;
                    }
                    i8 = iM3169 ^ i;
                    break;
            }
            return;
        }
    }
}
