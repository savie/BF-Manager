package l;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩴܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes5.dex */
public class C19987 extends ListView {

    /* JADX INFO: renamed from: ᩴ᩻ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f64216 = {9698, -23282, -23294, -23296, -23229, -23282, -23284, -23296, -23288, -23295, -23229, -23265, -23272, -23293, -23271, -23292, -23296, -23288, -23229, -23261, -23284, -23271, -23292, -23269, -23288, -23256, -23293, -23286, -23292, -23293, -23288, -23296, -23271, -23275, -23229, -23261, -23284, -23271, -23292, -23269, -23288, -23254, -23272, -23284, -23265, -23287};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f64217;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f64218;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f64219;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f64220;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C23073 f64221;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f64222;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f64223;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f64224;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f64225;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f64226;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f64227;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC11036 f64228;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f64229;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public AbsListView.OnScrollListener f64230;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f64231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View.OnTouchListener f64232;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemLongClickListener f64233;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f64234;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f64235;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f64236;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f64237;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8147 f64238;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f64239;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DataSetObserver f64240;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64241;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64242;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64243;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f64244;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m45945(C19987 c19987) {
        long j = 0;
        boolean z = false;
        long j2 = 0;
        int i = 885309112;
        int i2 = AbstractC0641.f2496;
        int i3 = C1826.f6190;
        int iM3169 = C0773.m3169("ۨ᩺") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-16607)) ^ (-1305484543);
        int i5 = -985655595;
        while (true) {
            i = ((((i ^ i3) * 19069) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1812434733:
                case 1335194549:
                    j = c19987.f64237;
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ۘ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20127)) ^ 1153313064;
                        i5 = 1838092443;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۟") ^ i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-27315)) ^ 495200057;
                        i5 = -588905303;
                    }
                    break;
                case -1755936771:
                case -536816743:
                    z = true;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ۘ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20127)) ^ 1153313064;
                        i5 = 1838092443;
                    } else {
                        iM3169 = (C0619.m2761("᩹ܺ") ^ i3) * 71;
                        i4 = ((iM3169 ^ i2) * (-23363)) ^ 52542517;
                        i5 = 203501075;
                    }
                    break;
                case -1368301682:
                case -1022632304:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۙܽ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6683)) ^ (-1829218035);
                        i5 = 618602763;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۘۘ")) * (-15);
                        i4 = ((iM3169 ^ i3) * 10365) ^ 97119621;
                        i5 = 1256164399;
                    }
                    break;
                case -1323034099:
                case -568079919:
                    if (C4238.m13538() > j) {
                        iM3169 = (C0773.m3169("ۖ᩺") ^ i2) * 83;
                        i4 = ((iM3169 ^ i3) * (-31871)) ^ 1340146004;
                        i5 = -1264938742;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۫ۘ")) * (-35);
                        i4 = ((iM3169 ^ i2) * 4393) ^ (-939286935);
                        i5 = 574302613;
                    }
                    break;
                case -1298081266:
                case 385024359:
                    return false;
                case -1295501452:
                case -135456839:
                    j2 = 0;
                    if (j == 0) {
                        iM3169 = (C0619.m2761("ܿۢ") + i2) * (-49);
                        i4 = ((iM3169 ^ i3) * (-29415)) ^ 705058873;
                        i5 = 1796964795;
                    } else {
                        iM3169 = (C0773.m3169("۫ܰ") ^ i3) * (-53);
                        i4 = ((iM3169 ^ i2) * 26263) ^ 2012120160;
                        i5 = -1035573881;
                    }
                    break;
                case -1213366104:
                case 1315639865:
                    c19987.f64237 = j2;
                    return z;
                case -1178040317:
                case 219467891:
                    AbstractC0116.m1243();
                    C3099.m10095();
                    iM3169 = (i2 - C0619.m2761("ۙܽ")) * (-125);
                    i4 = ((iM3169 ^ i3) * (-6683)) ^ (-1829218035);
                    i5 = 618602763;
                    break;
                case -1163044500:
                case 1707558196:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۨ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27039) ^ 1011982195;
                        i5 = -1576039518;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳ֡")) * (-105);
                        i4 = ((iM3169 ^ i2) * 30735) ^ 1707338227;
                        i5 = 663946940;
                    }
                    break;
                case -1110191193:
                case 925247544:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۙܽ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6683)) ^ (-1829218035);
                        i5 = 618602763;
                    } else {
                        iM3169 = C0619.m2761("۬ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19871)) ^ 1785615398;
                        i5 = 1611268203;
                    }
                    break;
                case -957724470:
                case 959521823:
                    AbstractC0641.m2813();
                    if (C1826.f6190 > 0) {
                        iM3169 = (i3 - C0773.m3169("ܳ֡")) * (-105);
                        i4 = ((iM3169 ^ i2) * 30735) ^ 1707338227;
                        i5 = 663946940;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۙܽ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6683)) ^ (-1829218035);
                        i5 = 618602763;
                    }
                    break;
                case -588566865:
                case 1841319049:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (i2 - C0773.m3169("ܿۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-22279)) ^ 1092087565;
                        i5 = 572933870;
                    } else {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17615)) ^ 65759457;
                        i5 = -650761845;
                    }
                    break;
                case -413507971:
                case -366446284:
                    C3690.m11987();
                    if (!C2878.f9462) {
                        iM3169 = (i2 - C0619.m2761("ۙܽ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6683)) ^ (-1829218035);
                        i5 = 618602763;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܿۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-22279)) ^ 1092087565;
                        i5 = 572933870;
                    }
                    break;
                case -241944149:
                case 1369974915:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ܿۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-22279)) ^ 1092087565;
                        i5 = 572933870;
                    } else {
                        iM3169 = (C0773.m3169("֡ۘ") ^ i3) * (-99);
                        i4 = ((iM3169 ^ i2) * (-17125)) ^ (-947402697);
                        i5 = -647129181;
                    }
                    break;
                case 82832966:
                case 337725215:
                    if (C3077.m10041()) {
                        iM3169 = (i2 - C0773.m3169("ܿۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * (-22279)) ^ 1092087565;
                        i5 = 572933870;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨ۘ")) * 69;
                        i4 = ((iM3169 ^ i3) * (-10133)) ^ (-869624495);
                        i5 = -1469345318;
                    }
                    break;
                case 132807968:
                case 1564453381:
                    return z;
                case 234698834:
                case 575766099:
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("᩷ۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16431) ^ (-1340307468);
                        i5 = -53632821;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳ֡")) * (-105);
                        i4 = ((iM3169 ^ i2) * 30735) ^ 1707338227;
                        i5 = 663946940;
                    }
                    break;
                case 427251669:
                case 474033754:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۨ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27039) ^ 1011982195;
                        i5 = -1576039518;
                    } else {
                        iM3169 = C0773.m3169("ۖۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4831) ^ 1161717652;
                        i5 = 2067887752;
                    }
                    break;
                case 1691129398:
                case 1981484649:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۙܽ")) * (-125);
                        i4 = ((iM3169 ^ i3) * (-6683)) ^ (-1829218035);
                        i5 = 618602763;
                    } else {
                        iM3169 = C0619.m2761("۠ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28501)) ^ 1262296740;
                        i5 = -418040088;
                    }
                    break;
                default:
                    AbstractC0116.m1243();
                    return false;
            }
        }
    }

    static {
        boolean z = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = -895223459;
        int i5 = C1321.f4751;
        int i6 = C2354.f7599;
        int iM3169 = C0773.m3169("֡᩵") ^ i6;
        int i7 = ((iM3169 ^ i5) * 26665) ^ (-1051800284);
        int i8 = -1300318579;
        while (true) {
            i4 = ((((i4 ^ i5) * (-1009)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1631130087:
                case 2020874663:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("᩶᩷") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * 657) ^ (-339890418);
                        i8 = -413529606;
                    } else {
                        iM3169 = C0619.m2761("۠۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * 757) ^ 2047333000;
                        i8 = 1505432566;
                    }
                    break;
                case -1481624485:
                case 525721420:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0773.m3169("᩷֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-18507)) ^ 1652123138;
                        i8 = -190671232;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ᩷") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((iM3169 ^ i5) * (-25143)) ^ 698943611;
                        i8 = 1802389421;
                    }
                    break;
                case -1458660514:
                case -205906047:
                    C3077.m10041();
                    C20932.m47848();
                    throw new RuntimeException();
                case -1361211473:
                case 917138799:
                    if (C4238.m13540() > 0) {
                        iM3169 = C0773.m3169("᩷֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-18507)) ^ 1652123138;
                        i8 = -190671232;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۢۖ")) * (-85);
                        i7 = ((iM3169 ^ i5) * 671) ^ (-1653148316);
                        i8 = 792562035;
                    }
                    break;
                case -1211471315:
                case 1406228582:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("᩶᩷") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * 657) ^ (-339890418);
                        i8 = -413529606;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11945) ^ (-314715996);
                        i8 = 1592066103;
                    }
                    break;
                case -1172286024:
                case -1046933630:
                    i = s + 4899;
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ۖۡ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 14507) ^ (-365048993);
                        i8 = 1365845812;
                    } else {
                        iM3169 = C0619.m2761("ۧۘ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 14727) ^ (-114737838);
                        i8 = -1171412904;
                    }
                    break;
                case -799542661:
                case -551109764:
                    return;
                case -608583773:
                case -525480305:
                    s = sArr[c];
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("᩷֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-18507)) ^ 1652123138;
                        i8 = -190671232;
                    } else {
                        iM3169 = C0773.m3169("᩹᩻") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-27617)) ^ (-131102355);
                        i8 = 1375357232;
                    }
                    break;
                case -601309599:
                case 2131899201:
                    try {
                        Class.forName(RunnableC3055.m9937(f64216, 31, 15, i3));
                        C17719.f58226 = z;
                        break;
                    } catch (Exception unused) {
                    }
                    iM3169 = C0773.m3169("᩸ܽ") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-15005)) ^ 1018320845;
                    i8 = 1329957161;
                    break;
                case -511411810:
                case 357532462:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۢۖ")) * (-85);
                        i7 = ((iM3169 ^ i5) * 671) ^ (-1653148316);
                        i8 = 792562035;
                    } else {
                        iM3169 = C0773.m3169("ۘۚ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-795)) ^ (-213309830);
                        i8 = -1892348450;
                    }
                    break;
                case -462784870:
                case 909607154:
                    i3 = 42349;
                    iM3169 = C0619.m2761("ܰۚ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 23237) ^ 219062791;
                    i8 = -59022255;
                    break;
                case -462418211:
                case 709721369:
                    i2 = i * i;
                    s2 = 19596;
                    if (C2966.m9664()) {
                        iM3169 = (C0773.m3169("ۡܶ") + i5) * (-119);
                        i7 = ((iM3169 ^ i6) * 5237) ^ 1006651666;
                        i8 = -1367890446;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25043) ^ (-1819758328);
                        i8 = -264512859;
                    }
                    break;
                case -409210693:
                case -135191932:
                    C3492.m11488();
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = C0773.m3169("᩷֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-18507)) ^ 1652123138;
                        i8 = -190671232;
                    } else {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 27709) ^ 935737693;
                        i8 = 245762301;
                    }
                    break;
                case -381556799:
                case 292522499:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0619.m2761("۠۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * 757) ^ 2047333000;
                        i8 = 1505432566;
                    } else {
                        iM3169 = (C0619.m2761("᩹۬") ^ i6) * (-93);
                        i7 = ((iM3169 ^ i5) * (-22131)) ^ (-281261448);
                        i8 = -1805339355;
                    }
                    break;
                case -300850839:
                case 1813743723:
                    z = true;
                    iM3169 = C0773.m3169("ܽܺ") ^ i5;
                    i7 = ((iM3169 ^ i6) * 9297) ^ 239780157;
                    i8 = -1850816533;
                    break;
                case -244949125:
                case -126013286:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("ۚ۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-20745)) ^ (-834190540);
                        i8 = 1428298684;
                    } else {
                        iM3169 = C0619.m2761("ۗܿ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 727) ^ 561694921;
                        i8 = 1177930428;
                    }
                    break;
                case -14479231:
                case 240975642:
                    if (!C17202.m40372()) {
                        iM3169 = (i6 - C0773.m3169("ۢۖ")) * (-85);
                        i7 = ((iM3169 ^ i5) * 671) ^ (-1653148316);
                        i8 = 792562035;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩷") ^ i6;
                        i7 = ((iM3169 ^ i5) * 25043) ^ (-1819758328);
                        i8 = -264512859;
                    }
                    break;
                case 61920306:
                case 1062762759:
                    C1321.m4852();
                    C1321.m4852();
                    iM3169 = C0619.m2761("ۚ۠") ^ i5;
                    i7 = ((iM3169 ^ i6) * (-20745)) ^ (-834190540);
                    i8 = 1428298684;
                    break;
                case 490842465:
                case 1534251317:
                    i3 = 23631;
                    iM3169 = C0619.m2761("ܰۚ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 23237) ^ 219062791;
                    i8 = -59022255;
                    break;
                case 529686988:
                case 1862527710:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("᩷֨") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-18507)) ^ 1652123138;
                        i8 = -190671232;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۨܺ")) * 17;
                        i7 = ((iM3169 ^ i6) * 16259) ^ (-1537750965);
                        i8 = 89630615;
                    }
                    break;
                case 553518722:
                case 2128271344:
                    if ((s * s2) - i2 <= 0) {
                        iM3169 = C0619.m2761("ۖܰ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 14363) ^ (-580139517);
                        i8 = -1867545453;
                    } else {
                        iM3169 = C0773.m3169("ۨ֡") ^ i6;
                        i7 = ((iM3169 ^ i5) * 27217) ^ 1546867366;
                        i8 = -888012004;
                    }
                    break;
                case 572422121:
                case 2057949242:
                    sArr = f64216;
                    c = 0;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("᩶᩷") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * 657) ^ (-339890418);
                        i8 = -413529606;
                    } else {
                        iM3169 = (i5 - C0619.m2761("۟ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM3169 ^ i6) * (-14027)) ^ 1899897531;
                        i8 = 373750310;
                    }
                    break;
                case 926351117:
                case 1912602726:
                    try {
                        Class.forName(C20932.m47853(f64216, 1, 30, i3));
                        C17719.f58226 = z;
                        break;
                    } catch (Exception unused2) {
                    }
                    iM3169 = (C0773.m3169("ۨۨ") + i5) * 25;
                    i7 = ((iM3169 ^ i6) * (-11281)) ^ 479972381;
                    i8 = 974216002;
                    break;
                case 969627434:
                case 1379496938:
                    C20932.m47848();
                    if (C2354.f7599 < 0) {
                        iM3169 = C0619.m2761("۠۬") ^ i5;
                        i7 = ((iM3169 ^ i6) * 757) ^ 2047333000;
                        i8 = 1505432566;
                    } else {
                        iM3169 = C0619.m2761("ۚ۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-20745)) ^ (-834190540);
                        i8 = 1428298684;
                    }
                    break;
                default:
                    C2966.m9664();
                    if (!C0619.f2439) {
                        iM3169 = (i6 - C0773.m3169("ۢۖ")) * (-85);
                        i7 = ((iM3169 ^ i5) * 671) ^ (-1653148316);
                        i8 = 792562035;
                    } else {
                        iM3169 = C0619.m2761("ۚ۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-20745)) ^ (-834190540);
                        i8 = 1428298684;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m45944(MotionEvent motionEvent) {
        int actionMasked = 0;
        int i = -131175233;
        int i2 = RunnableC3055.f9898;
        int i3 = C4282.f15546;
        int iM3169 = (C0773.m3169("ۙܶ") ^ i3) * 9;
        int i4 = ((iM3169 ^ i2) * (-8853)) ^ (-2031614831);
        int i5 = -278256260;
        while (true) {
            i = ((((i ^ i2) * (-19257)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1831195773:
                case -794649139:
                    if (C2702.m8876()) {
                        iM3169 = C0619.m2761("۫᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7747) ^ (-1818169271);
                        i5 = -291073111;
                    } else {
                        iM3169 = C0773.m3169("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31003)) ^ (-524242646);
                        i5 = -652132442;
                    }
                    break;
                case -1801961390:
                case 978437404:
                    if (actionMasked != 1) {
                        iM3169 = C0619.m2761("֨ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28441) ^ 1994647338;
                        i5 = 1554684478;
                    } else {
                        iM3169 = (C0773.m3169("᩷۟") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * 20477) ^ (-1128478384);
                        i5 = -1352012727;
                    }
                    break;
                case -1754902310:
                case -675711471:
                    C3690.m11987();
                    C2287.m7745();
                    iM3169 = C0773.m3169("۫ᩳ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-2715)) ^ (-938234041);
                    i5 = -800940649;
                    break;
                case -1617725677:
                case -857951633:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("ۛ᩹") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * 27543) ^ (-1571857002);
                        i5 = -949262349;
                    } else {
                        iM3169 = (C0773.m3169("ۙۘ") + i2) * (-107);
                        i4 = ((iM3169 ^ i3) * 30261) ^ (-371220523);
                        i5 = 341139376;
                    }
                    break;
                case -1496014124:
                case 263354401:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ۛ᩹") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * 27543) ^ (-1571857002);
                        i5 = -949262349;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-5309)) ^ 1911198228;
                        i5 = 2076095424;
                    }
                    break;
                case -1382731031:
                case 1977826470:
                    if (C2287.m7745() > 0) {
                        iM3169 = (i2 - C0619.m2761("᩸֨")) * 91;
                        i4 = ((iM3169 ^ i3) * 315) ^ 1158536856;
                        i5 = -526435635;
                    } else {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2715)) ^ (-938234041);
                        i5 = -800940649;
                    }
                    break;
                case -1333975183:
                case -1229530231:
                    if (actionMasked == 3) {
                        iM3169 = (C0773.m3169("᩷۟") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * 20477) ^ (-1128478384);
                        i5 = -1352012727;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֨֨")) * 21;
                        i4 = ((iM3169 ^ i2) * (-8177)) ^ 479754745;
                        i5 = 504120242;
                    }
                    break;
                case -1170120817:
                case 1238950466:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("۬ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7775)) ^ 1655043107;
                        i5 = 858320499;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۤ") ^ i2) * (-105);
                        i4 = ((iM3169 ^ i3) * 5289) ^ 2037202309;
                        i5 = 1781474757;
                    }
                    break;
                case -905585588:
                case -898780314:
                    if (C3998.m12920()) {
                        iM3169 = (C0619.m2761("֫۬") + i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-5551)) ^ 803122979;
                        i5 = 667419026;
                    } else {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2715)) ^ (-938234041);
                        i5 = -800940649;
                    }
                    break;
                case -802682576:
                case 115818254:
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        iM3169 = (C0773.m3169("ܿ᩹") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * 20489) ^ (-1362977167);
                        i5 = -1877726962;
                    } else {
                        iM3169 = (C0773.m3169("᩷۟") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * 20477) ^ (-1128478384);
                        i5 = -1352012727;
                    }
                    break;
                case -789742559:
                case 1841044664:
                    if (C4282.m13644()) {
                        iM3169 = (i3 - C0619.m2761("ۛ۟")) * (-23);
                        i4 = ((iM3169 ^ i2) * (-8455)) ^ (-1486184503);
                        i5 = 718208010;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩸֨")) * 91;
                        i4 = ((iM3169 ^ i3) * 315) ^ 1158536856;
                        i5 = -526435635;
                    }
                    break;
                case -650843905:
                case 1955278565:
                    C2878.m9491();
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("֫ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31003)) ^ (-524242646);
                        i5 = -652132442;
                    } else {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2715)) ^ (-938234041);
                        i5 = -800940649;
                    }
                    break;
                case -361913752:
                case 836610671:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("ۛ᩹") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * 27543) ^ (-1571857002);
                        i5 = -949262349;
                    } else {
                        iM3169 = C0773.m3169("۬ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28705)) ^ (-1019486653);
                        i5 = 173160520;
                    }
                    break;
                case -186527126:
                case 1749346704:
                    C1826.m6301();
                    break;
                case -41798083:
                case 1877019820:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("ۛ᩹") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * 27543) ^ (-1571857002);
                        i5 = -949262349;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩸֨")) * 91;
                        i4 = ((iM3169 ^ i3) * 315) ^ 1158536856;
                        i5 = -526435635;
                    }
                    break;
                case 525570059:
                case 1739363937:
                    break;
                case 787569206:
                case 1786433203:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2715)) ^ (-938234041);
                        i5 = -800940649;
                    } else {
                        iM3169 = C0773.m3169("᩵ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11691) ^ (-877953776);
                        i5 = 1348375309;
                    }
                    break;
                case 1282591162:
                case 1595799255:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("۫ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2715)) ^ (-938234041);
                        i5 = -800940649;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩹۟")) * 51;
                        i4 = ((iM3169 ^ i3) * 11113) ^ 87788350;
                        i5 = -828608734;
                    }
                    break;
                case 1596763233:
                case 1897235378:
                    this.f64239 = false;
                    break;
                default:
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0773.m3169("۬ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7775)) ^ 1655043107;
                        i5 = 858320499;
                    } else {
                        iM3169 = C0619.m2761("ۖ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21079)) ^ (-1229104742);
                        i5 = -319090401;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public final void setSelection(int i) {
        int i2 = 467270195;
        int i3 = C1564.f5401;
        int i4 = RunnableC3055.f9898;
        int iM2761 = (i4 - C0619.m2761("ۚۧ")) * 5;
        int i5 = ((iM2761 ^ i3) * 1659) ^ (-664722357);
        int i6 = 481005351;
        while (true) {
            i2 = ((((i2 ^ i3) * (-9587)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1911661215:
                case 1641529396:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("᩵ᩳ") ^ i4) * (-59);
                        i5 = ((iM2761 ^ i3) * 17383) ^ (-1510696002);
                        i6 = 341512084;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۟") ^ i3) * (-83);
                        i5 = ((iM2761 ^ i4) * (-22979)) ^ 1561631470;
                        i6 = 1180832618;
                    }
                    break;
                case -1910046156:
                case 2147407519:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("᩸ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20613)) ^ 1375825391;
                        i6 = -588110654;
                    } else {
                        iM2761 = C0619.m2761("۬֨") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-19355)) ^ 667042897;
                        i6 = -2135691172;
                    }
                    break;
                case -1769283111:
                case -351078281:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩺ۛ")) * 61;
                        i5 = ((iM2761 ^ i4) * (-1247)) ^ 518512409;
                        i6 = 331918547;
                    } else {
                        iM2761 = C0619.m2761("ۖ֨") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6559) ^ (-122687943);
                        i6 = -833762073;
                    }
                    break;
                case -1629934714:
                case 1529655106:
                    this.f64223 = false;
                    break;
                case -1503199717:
                case -1351299749:
                    C3033.m9845();
                    if (C2310.f7472 < 0) {
                        iM2761 = (C0619.m2761("᩵ᩳ") ^ i4) * (-59);
                        i5 = ((iM2761 ^ i3) * 17383) ^ (-1510696002);
                        i6 = 341512084;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ۛ")) * 61;
                        i5 = ((iM2761 ^ i4) * (-1247)) ^ 518512409;
                        i6 = 331918547;
                    }
                    break;
                case -1293739853:
                case 609346289:
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("֡ۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32089)) ^ 2138558197;
                        i6 = -1949596953;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ۛ")) * 61;
                        i5 = ((iM2761 ^ i4) * (-1247)) ^ 518512409;
                        i6 = 331918547;
                    }
                    break;
                case -957844786:
                case -697951987:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("᩵ᩳ") ^ i4) * (-59);
                        i5 = ((iM2761 ^ i3) * 17383) ^ (-1510696002);
                        i6 = 341512084;
                    } else {
                        iM2761 = C0773.m3169("ۙۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-7883)) ^ (-2105297555);
                        i6 = -1853504796;
                    }
                    break;
                case -396556739:
                case 690229751:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩸ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20613)) ^ 1375825391;
                        i6 = -588110654;
                    } else {
                        iM2761 = (C0773.m3169("֨ۨ") + i4) * (-75);
                        i5 = ((iM2761 ^ i3) * 7765) ^ (-456196141);
                        i6 = 1128557628;
                    }
                    break;
                case -319567736:
                case 705330088:
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ܶۙ") ^ i4) * (-85);
                        i5 = ((iM2761 ^ i3) * 4479) ^ (-1920165843);
                        i6 = 1119709478;
                    } else {
                        iM2761 = C0619.m2761("֨ۛ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-8919)) ^ 2334892;
                        i6 = -942943300;
                    }
                    break;
                case -132397716:
                case 124431543:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("᩸ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20613)) ^ 1375825391;
                        i6 = -588110654;
                    } else {
                        iM2761 = (C0619.m2761("ܺܶ") ^ i3) * 85;
                        i5 = ((iM2761 ^ i4) * (-22727)) ^ 482741261;
                        i6 = -1660863348;
                    }
                    break;
                case 101934955:
                case 1009914436:
                    C3099.m10095();
                    iM2761 = (i3 - C0773.m3169("᩺ۛ")) * 61;
                    i5 = ((iM2761 ^ i4) * (-1247)) ^ 518512409;
                    i6 = 331918547;
                    break;
                case 456797589:
                case 674017158:
                    C1783.m6232();
                    if (!C1321.m4852()) {
                        iM2761 = (C0773.m3169("ܶۙ") ^ i4) * (-85);
                        i5 = ((iM2761 ^ i3) * 4479) ^ (-1920165843);
                        i6 = 1119709478;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ۛ")) * 61;
                        i5 = ((iM2761 ^ i4) * (-1247)) ^ 518512409;
                        i6 = 331918547;
                    }
                    break;
                case 518740118:
                case 599388063:
                    C2375.m8065();
                    if (C2834.f9334 > 0) {
                        iM2761 = (C0773.m3169("ܶۙ") ^ i4) * (-85);
                        i5 = ((iM2761 ^ i3) * 4479) ^ (-1920165843);
                        i6 = 1119709478;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩸᩶")) * 99;
                        i5 = ((iM2761 ^ i4) * 24217) ^ (-58958448);
                        i6 = 1331172473;
                    }
                    break;
                case 579347971:
                case 769102347:
                    super.setSelection(i);
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0773.m3169("᩸ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20613)) ^ 1375825391;
                        i6 = -588110654;
                    } else {
                        iM2761 = C0619.m2761("۠ܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-29449)) ^ (-623677457);
                        i6 = 565940907;
                    }
                    break;
                case 648232601:
                case 1092876302:
                    C2834.m9344();
                    break;
                default:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("᩸ۢ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-20613)) ^ 1375825391;
                        i6 = -588110654;
                    } else {
                        iM2761 = C0619.m2761("۠ۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 8517) ^ (-365945523);
                        i6 = -1132507268;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m45939() {
        long jM3789 = 0;
        long j = 0;
        long j2 = 0;
        int i = 702107160;
        int i2 = C1783.f6087;
        int i3 = C2834.f9334;
        int iM3169 = (i2 - C0773.m3169("᩵᩹")) * (-119);
        int i4 = ((iM3169 ^ i3) * 9601) ^ (-36200046);
        int i5 = 83044799;
        while (true) {
            i = ((((i ^ i3) * 1781) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2015402659:
                case -965867267:
                    if (this.f64223) {
                        iM3169 = C0619.m2761("ᩳۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24467)) ^ 1092171303;
                        i5 = -964607073;
                    } else {
                        iM3169 = C0619.m2761("ۨ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27661)) ^ 1997364295;
                        i5 = 638497618;
                    }
                    break;
                case -2007975117:
                case -1581096760:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("۠ܿ") ^ i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-5043)) ^ 1177618649;
                        i5 = -2049473817;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩷᩷")) * 123;
                        i4 = ((iM3169 ^ i2) * (-18461)) ^ 1983855417;
                        i5 = 1762890767;
                    }
                    break;
                case -1983132517:
                case 146763702:
                    jM3789 = C0950.m3789();
                    j = this.f64231;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ۜۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27623)) ^ (-1046009101);
                        i5 = 1076450646;
                    } else {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10331)) ^ (-1456418735);
                        i5 = -576341871;
                    }
                    break;
                case -1869198836:
                case -617271366:
                    C0862.m3503();
                    iM3169 = C0619.m2761("ۜۖ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-27623)) ^ (-1046009101);
                    i5 = 1076450646;
                    break;
                case -1792351977:
                case 1008990775:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("۠ܿ") ^ i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-5043)) ^ 1177618649;
                        i5 = -2049473817;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܶ᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i2) * 26457) ^ 1672542847;
                        i5 = 446597310;
                    }
                    break;
                case -1751979300:
                case 152115644:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ۜۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27623)) ^ (-1046009101);
                        i5 = 1076450646;
                    } else {
                        iM3169 = C0619.m2761("۬᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23091)) ^ 2051466514;
                        i5 = -1704135045;
                    }
                    break;
                case -1639215168:
                case 1646481655:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8415)) ^ (-620261059);
                        i5 = -1803781017;
                    } else {
                        iM3169 = (C0773.m3169("ܶۜ") + i3) * 101;
                        i4 = ((iM3169 ^ i2) * (-23711)) ^ (-2101351197);
                        i5 = 629978018;
                    }
                    break;
                case -1289273101:
                case 1111688568:
                    j2 = jM3789 - j;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ܿۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24953)) ^ (-1505108985);
                        i5 = 2029574519;
                    } else {
                        iM3169 = C0773.m3169("ܽ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8315)) ^ (-1945460109);
                        i5 = 1430098607;
                    }
                    break;
                case -1209657782:
                case 154136916:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8415)) ^ (-620261059);
                        i5 = -1803781017;
                    } else {
                        iM3169 = C0619.m2761("ۜۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27623)) ^ (-1046009101);
                        i5 = 1076450646;
                    }
                    break;
                case -1171010059:
                case 1617296404:
                    return true;
                case -1154021950:
                case -1131337192:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("۠ܿ") ^ i2) * (-5);
                        i4 = ((iM3169 ^ i3) * (-5043)) ^ 1177618649;
                        i5 = -2049473817;
                    } else {
                        iM3169 = C0619.m2761("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8415)) ^ (-620261059);
                        i5 = -1803781017;
                    }
                    break;
                case -1080443880:
                case 1940391598:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ܰܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8415)) ^ (-620261059);
                        i5 = -1803781017;
                    } else {
                        iM3169 = C0619.m2761("ܺܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1511)) ^ 1756506966;
                        i5 = 218781675;
                    }
                    break;
                case -718949726:
                case 1229860371:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۙۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12283) ^ 1380360969;
                        i5 = -156919615;
                    } else {
                        iM3169 = (C0773.m3169("᩵۫") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * 22245) ^ (-1837476868);
                        i5 = 2118422379;
                    }
                    break;
                case -417591553:
                case 1815742375:
                    return false;
                case 81655539:
                case 257965052:
                    C4282.m13644();
                    return false;
                case 520690711:
                case 644139884:
                    if (j2 < 500) {
                        iM3169 = C0619.m2761("ۢܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5079)) ^ (-962535250);
                        i5 = 709970291;
                    } else {
                        iM3169 = C0619.m2761("ۨ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27661)) ^ 1997364295;
                        i5 = 638497618;
                    }
                    break;
                case 1669385143:
                case 1843598060:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ܿۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24953)) ^ (-1505108985);
                        i5 = 2029574519;
                    } else {
                        iM3169 = (C0773.m3169("ۨܿ") + i2) * (-67);
                        i4 = ((iM3169 ^ i3) * (-14791)) ^ (-1610393350);
                        i5 = 902575633;
                    }
                    break;
                case 1883032404:
                case 2143347039:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۙۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12283) ^ 1380360969;
                        i5 = -156919615;
                    } else {
                        iM3169 = (C0619.m2761("ܺۙ") ^ i2) * 35;
                        i4 = ((iM3169 ^ i3) * (-25349)) ^ (-1493270465);
                        i5 = 1451725877;
                    }
                    break;
                default:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۙۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12283) ^ 1380360969;
                        i5 = -156919615;
                    } else {
                        iM3169 = C0619.m2761("ۜۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27623)) ^ (-1046009101);
                        i5 = 1076450646;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45936(C19987 c19987, AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = -1963161421;
        int i3 = C2310.f7472;
        int i4 = C2287.f7432;
        int iM3169 = (i3 - C0773.m3169("᩵ۜ")) * (-83);
        int i5 = ((iM3169 ^ i4) * 22103) ^ (-299122849);
        int i6 = 591075606;
        while (true) {
            i2 = ((((i2 ^ i4) * 22347) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2034180328:
                case -999483868:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ۗ֡") + i4) * (-123);
                        i5 = ((iM3169 ^ i3) * (-28729)) ^ (-487310563);
                        i6 = 571952523;
                    } else {
                        iM3169 = (C0619.m2761("۫ۖ") ^ i4) * (-91);
                        i5 = ((iM3169 ^ i3) * 31195) ^ 896802488;
                        i6 = -689193920;
                    }
                    break;
                case -2003715579:
                case -512094972:
                    if (z3) {
                        iM3169 = (C0619.m2761("ܳ᩹") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM3169 ^ i3) * (-6855)) ^ 805328921;
                        i6 = -684061550;
                    } else {
                        iM3169 = C0773.m3169("᩹ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 30359) ^ 1868618770;
                        i6 = -1043650408;
                    }
                    break;
                case -1886019217:
                case 622639662:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("᩸᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * 15741) ^ (-1114272070);
                        i6 = 1527680238;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۬") ^ i3) * (-107);
                        i5 = ((iM3169 ^ i4) * (-3197)) ^ 869994025;
                        i6 = 1819439709;
                    }
                    break;
                case -1838186462:
                case -110850924:
                    C1542.m5459();
                    if (C2375.f7641 > 0) {
                        iM3169 = (C0619.m2761("ۗ֡") + i4) * (-123);
                        i5 = ((iM3169 ^ i3) * (-28729)) ^ (-487310563);
                        i6 = 571952523;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩹") + i3) * 115;
                        i5 = ((iM3169 ^ i4) * 10815) ^ (-728400043);
                        i6 = 1754461171;
                    }
                    break;
                case -1588548662:
                case 1792005875:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0619.m2761("᩸᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * 15741) ^ (-1114272070);
                        i6 = 1527680238;
                    } else {
                        iM3169 = C0773.m3169("᩺ܽ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-26885)) ^ 1310909534;
                        i6 = -1476891043;
                    }
                    break;
                case -1398278305:
                case 1349832338:
                    C1542.m5459();
                    C2354.m7983();
                    return false;
                case -1377211268:
                case -1047227514:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("֨۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28091)) ^ (-2087452153);
                        i6 = -1851884180;
                    } else {
                        iM3169 = (C0773.m3169("֨᩻") + i4) * (-121);
                        i5 = ((iM3169 ^ i3) * (-29863)) ^ (-1410198013);
                        i6 = -2085562178;
                    }
                    break;
                case -1303767316:
                case -138006086:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("ۗ᩹") + i3) * 115;
                        i5 = ((iM3169 ^ i4) * 10815) ^ (-728400043);
                        i6 = 1754461171;
                    } else {
                        iM3169 = C0773.m3169("֫ۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 31073) ^ 1575618861;
                        i6 = -29976036;
                    }
                    break;
                case -1172786763:
                case 2101632923:
                    if (onItemLongClickListener.onItemLongClick(adapterView, view, i, j)) {
                        iM3169 = (C0619.m2761("ۢܰ") + i4) * (-115);
                        i5 = ((iM3169 ^ i3) * 3351) ^ (-869181489);
                        i6 = -1848221496;
                    } else {
                        iM3169 = (C0773.m3169("֨ܽ") ^ i4) * 73;
                        i5 = ((iM3169 ^ i3) * 10333) ^ 1981649466;
                        i6 = -1425558086;
                    }
                    break;
                case -1036143005:
                case 1445540212:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("֨۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28091)) ^ (-2087452153);
                        i6 = -1851884180;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩹") + i3) * 115;
                        i5 = ((iM3169 ^ i4) * 10815) ^ (-728400043);
                        i6 = 1754461171;
                    }
                    break;
                case -916834833:
                case 1346476825:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ۗ᩹") + i3) * 115;
                        i5 = ((iM3169 ^ i4) * 10815) ^ (-728400043);
                        i6 = 1754461171;
                    } else {
                        iM3169 = C0773.m3169("֨۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * 3627) ^ (-1031709327);
                        i6 = 1148861978;
                    }
                    break;
                case -791245742:
                case 294212957:
                    C1343.m4943();
                    C17202.m40372();
                    iM3169 = (C0773.m3169("ۗ᩹") + i3) * 115;
                    i5 = ((iM3169 ^ i4) * 10815) ^ (-728400043);
                    i6 = 1754461171;
                    break;
                case -599080532:
                case 988636637:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۗ֫")) * 21;
                        i5 = ((iM3169 ^ i4) * (-1705)) ^ 964768566;
                        i6 = 6722219;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i4;
                        i5 = ((iM3169 ^ i3) * 29505) ^ (-365121059);
                        i6 = 260113834;
                    }
                    break;
                case -570541853:
                case 402266177:
                    return z3;
                case -455700765:
                case 400473618:
                    z3 = true;
                    iM3169 = (C0773.m3169("ۚܳ") + i3) * (-87);
                    i5 = ((iM3169 ^ i4) * (-961)) ^ (-1979211788);
                    i6 = -708211002;
                    break;
                case -39900275:
                case 765272518:
                    z3 = false;
                    iM3169 = (C0773.m3169("ۚܳ") + i3) * (-87);
                    i5 = ((iM3169 ^ i4) * (-961)) ^ (-1979211788);
                    i6 = -708211002;
                    break;
                case 347114773:
                case 1479275647:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0619.m2761("᩸᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * 15741) ^ (-1114272070);
                        i6 = 1527680238;
                    } else {
                        iM3169 = C0773.m3169("᩻᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-24341)) ^ (-1710791332);
                        i6 = -457915950;
                    }
                    break;
                case 671360984:
                case 1141922648:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("֨۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28091)) ^ (-2087452153);
                        i6 = -1851884180;
                    } else {
                        iM3169 = C0619.m2761("᩹᩷") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-1621)) ^ (-1654909845);
                        i6 = -321117798;
                    }
                    break;
                case 1113278354:
                case 1569966195:
                    c19987.f64239 = z2;
                    c19987.f64222 = z;
                    iM3169 = C0773.m3169("᩹ۙ") ^ i3;
                    i5 = ((iM3169 ^ i4) * 30359) ^ 1868618770;
                    i6 = -1043650408;
                    break;
                case 1243618104:
                case 1909020935:
                    onItemLongClickListener = c19987.f64233;
                    z = false;
                    z2 = true;
                    if (onItemLongClickListener != null) {
                        iM3169 = (C0619.m2761("ۧܿ") + i3) * (-25);
                        i5 = ((iM3169 ^ i4) * (-18031)) ^ 100097168;
                        i6 = 1749227084;
                    } else {
                        iM3169 = (C0773.m3169("֨ܽ") ^ i4) * 73;
                        i5 = ((iM3169 ^ i3) * 10333) ^ 1981649466;
                        i6 = -1425558086;
                    }
                    break;
                case 1688211585:
                case 2101416691:
                    if (C1080.m4050()) {
                        iM3169 = (C0619.m2761("ۚᩴ") + i3) * (-87);
                        i5 = ((iM3169 ^ i4) * (-10017)) ^ (-1104234008);
                        i6 = -34157244;
                    } else {
                        iM3169 = C0619.m2761("֨۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-28091)) ^ (-2087452153);
                        i6 = -1851884180;
                    }
                    break;
                default:
                    C2878.m9491();
                    if (C1783.f6087 > 0) {
                        iM3169 = (i3 - C0773.m3169("ۗ֫")) * 21;
                        i5 = ((iM3169 ^ i4) * (-1705)) ^ 964768566;
                        i6 = 6722219;
                    } else {
                        iM3169 = (C0619.m2761("ۗ֡") + i4) * (-123);
                        i5 = ((iM3169 ^ i3) * (-28729)) ^ (-487310563);
                        i6 = 571952523;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19987(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = 1066724247;
        int i2 = C2966.f9654;
        int i3 = C0773.f2792;
        int iM3169 = (C0773.m3169("֫᩹") ^ i3) * (-81);
        int i4 = ((iM3169 ^ i2) * 7153) ^ (-850989916);
        int i5 = -231189074;
        while (true) {
            i = (iM3169 ^ i5) ^ (i4 & (((i ^ i2) * (-23231)) >> 31));
            switch (i) {
                case -1544657133:
                case 119757930:
                    if (!C3492.m11488()) {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9597) ^ 615792193;
                        i5 = -1168539774;
                    } else {
                        iM3169 = C0773.m3169("ۡᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4249) ^ (-872974619);
                        i5 = 952748257;
                    }
                    break;
                case -1512643952:
                case 1465489261:
                    C3779.m12264();
                    C1542.m5459();
                    iM3169 = C0619.m2761("᩹ۧ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 31195) ^ (-757016877);
                    i5 = -2121272106;
                    break;
                case -1382035543:
                case 1240585959:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("۟ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10883)) ^ (-84202572);
                        i5 = -194746784;
                    } else {
                        iM3169 = C0619.m2761("᩶᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29863) ^ (-239579034);
                        i5 = 1286534739;
                    }
                    break;
                case -1260437588:
                case -776831662:
                    return;
                case -1214691282:
                case -216877071:
                    C23916.m53419();
                    throw new RuntimeException();
                case -926663540:
                case 1011315156:
                    C4238.m13540();
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = C0773.m3169("ۡᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4249) ^ (-872974619);
                        i5 = 952748257;
                    } else {
                        iM3169 = C0619.m2761("᩹ۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31195) ^ (-757016877);
                        i5 = -2121272106;
                    }
                    break;
                default:
                    if (C2485.f7950 == 0) {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9597) ^ 615792193;
                        i5 = -1168539774;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܿܿ")) * 5;
                        i4 = ((iM3169 ^ i3) * (-25927)) ^ 1191512943;
                        i5 = -1301007748;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m45935(C19987 c19987, View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator itM4942 = null;
        int i = -1085187167;
        int i2 = C0773.f2792;
        int i3 = C3779.f12953;
        int iM3169 = C0773.m3169("ۛᩴ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 18409) ^ (-1437168237);
        int i5 = -1117545168;
        while (true) {
            i = ((((i ^ i3) * (-15227)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2033403045:
                case -665150872:
                    if (C2375.m8065() > 0) {
                        iM3169 = (i3 - C0619.m2761("ۧۗ")) * (-3);
                        i4 = ((iM3169 ^ i2) * (-6081)) ^ 691176743;
                        i5 = 1084015377;
                    } else {
                        iM3169 = C0619.m2761("֫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5645)) ^ 121916966;
                        i5 = -793457034;
                    }
                    break;
                case -1925461590:
                case 1816634875:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ܽ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2641) ^ (-619326604);
                        i5 = 1533874735;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۧۗ")) * (-3);
                        i4 = ((iM3169 ^ i2) * (-6081)) ^ 691176743;
                        i5 = 1084015377;
                    }
                    break;
                case -1884272698:
                case -986145405:
                    return false;
                case -1845675700:
                case 753376267:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("֫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5645)) ^ 121916966;
                        i5 = -793457034;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22311) ^ 485914563;
                        i5 = 1024294642;
                    }
                    break;
                case -1823178654:
                case 454255819:
                    itM4942 = C1343.m4942(c19987.f64234);
                    iM3169 = C0773.m3169("᩻ᩳ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 17377) ^ (-1705813104);
                    i5 = -2140571778;
                    break;
                case -1574305717:
                case 1791044636:
                    C2375.m8065();
                    return false;
                case -1349265857:
                case 216344200:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("֫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5645)) ^ 121916966;
                        i5 = -793457034;
                    } else {
                        iM3169 = C0619.m2761("᩹ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-131)) ^ (-1043449660);
                        i5 = 1850706616;
                    }
                    break;
                case -1342922725:
                case -1332031894:
                    onTouchListener.onTouch(view, motionEvent);
                    iM3169 = (i3 - C0773.m3169("ܰۜ")) * (-93);
                    i4 = ((iM3169 ^ i2) * 2971) ^ (-324711516);
                    i5 = 1890551484;
                    break;
                case -1186482126:
                case -905976960:
                    if (((View.OnTouchListener) C0950.m3796(itM4942)).onTouch(view, motionEvent)) {
                        iM3169 = C0619.m2761("᩻ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19605) ^ (-1581122262);
                        i5 = -523832196;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17377) ^ (-1705813104);
                        i5 = -2140571778;
                    }
                    break;
                case -1182165711:
                case -447389970:
                    if (C3998.m12920()) {
                        iM3169 = (C0773.m3169("ۜ᩹") ^ i3) * 75;
                        i4 = ((iM3169 ^ i2) * 351) ^ 2144177193;
                        i5 = -1830844041;
                    } else {
                        iM3169 = C0619.m2761("ܽ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2641) ^ (-619326604);
                        i5 = 1533874735;
                    }
                    break;
                case -1117595666:
                case 1906180119:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۧۗ")) * (-3);
                        i4 = ((iM3169 ^ i2) * (-6081)) ^ 691176743;
                        i5 = 1084015377;
                    } else {
                        iM3169 = C0619.m2761("ۡۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3761)) ^ 516659187;
                        i5 = -279050566;
                    }
                    break;
                case -1071121023:
                case 1920061186:
                    onTouchListener = c19987.f64232;
                    if (onTouchListener != null) {
                        iM3169 = C0619.m2761("᩹ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6173)) ^ 715014603;
                        i5 = -1039692510;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰۜ")) * (-93);
                        i4 = ((iM3169 ^ i2) * 2971) ^ (-324711516);
                        i5 = 1890551484;
                    }
                    break;
                case -1017422038:
                case 1527303650:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("ܽ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2641) ^ (-619326604);
                        i5 = 1533874735;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۤ") ^ i2) * (-111);
                        i4 = ((iM3169 ^ i3) * (-17759)) ^ 440608864;
                        i5 = -195449256;
                    }
                    break;
                case -1012577825:
                case 1393374113:
                    C1146.m4231();
                    C3033.m9845();
                    iM3169 = C0619.m2761("֫۟") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-5645)) ^ 121916966;
                    i5 = -793457034;
                    break;
                case -916614802:
                case 374455699:
                    return true;
                case -805500064:
                case -653030619:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i3) * (-5);
                        i4 = ((iM3169 ^ i2) * (-6473)) ^ (-2101784866);
                        i5 = -1228285559;
                    } else {
                        iM3169 = (C0619.m2761("ۡܿ") ^ i3) * 23;
                        i4 = ((iM3169 ^ i2) * 31455) ^ (-829378840);
                        i5 = -603953309;
                    }
                    break;
                case -502276819:
                case 703827397:
                    if (C3448.f11240 < 0) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i3) * (-5);
                        i4 = ((iM3169 ^ i2) * (-6473)) ^ (-2101784866);
                        i5 = -1228285559;
                    } else {
                        iM3169 = C0619.m2761("֫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5645)) ^ 121916966;
                        i5 = -793457034;
                    }
                    break;
                case -408772612:
                case 1622384155:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ۧۧ") ^ i3) * (-5);
                        i4 = ((iM3169 ^ i2) * (-6473)) ^ (-2101784866);
                        i5 = -1228285559;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩻ۡ")) * 51;
                        i4 = ((iM3169 ^ i3) * 18291) ^ (-398293643);
                        i5 = -1880757029;
                    }
                    break;
                case -366815707:
                case 1205116053:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۧۗ")) * (-3);
                        i4 = ((iM3169 ^ i2) * (-6081)) ^ 691176743;
                        i5 = 1084015377;
                    } else {
                        iM3169 = (C0773.m3169("۬֨") ^ i2) * 7;
                        i4 = ((iM3169 ^ i3) * 13495) ^ (-907929548);
                        i5 = 246488088;
                    }
                    break;
                case -218873713:
                case 56847096:
                    if (C3998.m12923(itM4942)) {
                        iM3169 = (C0773.m3169("ܺ᩵") ^ i2) * 11;
                        i4 = ((iM3169 ^ i3) * 24535) ^ 1073420770;
                        i5 = 1434986292;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23061)) ^ 1763421124;
                        i5 = -325047703;
                    }
                    break;
                case 345360580:
                case 639777854:
                    if (C3690.m11987()) {
                        iM3169 = C0773.m3169("֫֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15371)) ^ 1790425434;
                        i5 = -5962653;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֨֨")) * (-93);
                        i4 = ((iM3169 ^ i3) * (-9687)) ^ 859036982;
                        i5 = 786310297;
                    }
                    break;
                default:
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("᩵ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10659) ^ 1727391296;
                        i5 = 629032124;
                    } else {
                        iM3169 = C0619.m2761("֫۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5645)) ^ 121916966;
                        i5 = -793457034;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m45949() {
        int i = -792588430;
        int i2 = RunnableC3055.f9898;
        int i3 = C0487.f2131;
        int iM2761 = (i2 - C0619.m2761("۫᩷")) * 15;
        int i4 = ((iM2761 ^ i3) * (-24599)) ^ 1351156273;
        int i5 = 1155548675;
        while (true) {
            i = ((((i ^ i3) * 15157) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2120037028:
                case 373923124:
                    C3734.m12152();
                    iM2761 = (C0619.m2761("᩷ۚ") + i3) * 19;
                    i4 = ((iM2761 ^ i2) * (-20009)) ^ (-1368115749);
                    i5 = -482623038;
                    break;
                case -2111220402:
                case 937931190:
                    return false;
                case -2045543850:
                case 449973809:
                    if (m45939()) {
                        iM2761 = (C0619.m2761("ۛۧ") + i2) * (-81);
                        i4 = ((iM2761 ^ i3) * 19985) ^ (-338347079);
                        i5 = 1089303616;
                    } else {
                        iM2761 = C0619.m2761("ۢۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4601)) ^ (-472490728);
                        i5 = -1732860485;
                    }
                    break;
                case -1989475541:
                case 1587440899:
                    C13473.m33144();
                    return false;
                case -1986422626:
                case 833709336:
                    if (!C2288.m7767()) {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۚ") + i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20009)) ^ (-1368115749);
                        i5 = -482623038;
                    }
                    break;
                case -1928086485:
                case 446900791:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ܽܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20431) ^ (-1465463255);
                        i5 = 35819725;
                    } else {
                        iM2761 = C0773.m3169("ۢۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24213) ^ 253243856;
                        i5 = 1398071208;
                    }
                    break;
                case -1885814961:
                case -1386317328:
                    C0269.m1775();
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩹ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10199)) ^ (-388310801);
                        i5 = 1669747911;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    }
                    break;
                case -1533765168:
                case -218263175:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("᩷ۚ") + i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20009)) ^ (-1368115749);
                        i5 = -482623038;
                    } else {
                        iM2761 = (C0773.m3169("֨ۗ") + i3) * (-103);
                        i4 = ((iM2761 ^ i2) * 17001) ^ 467873234;
                        i5 = 788479567;
                    }
                    break;
                case -1440600784:
                case -1297677103:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    } else {
                        iM2761 = (C0619.m2761("۠ܰ") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 189) ^ (-889152030);
                        i5 = 84213819;
                    }
                    break;
                case -1401080240:
                case 248629345:
                    return true;
                case -1389562223:
                case -1076091360:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("᩷ۚ") + i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20009)) ^ (-1368115749);
                        i5 = -482623038;
                    } else {
                        iM2761 = (C0619.m2761("ۖۡ") ^ i2) * (-47);
                        i4 = ((iM2761 ^ i3) * 23617) ^ 529453371;
                        i5 = -1983901100;
                    }
                    break;
                case -1186401174:
                case 418947928:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۘۧ")) * 71;
                        i4 = ((iM2761 ^ i2) * (-12111)) ^ (-450550438);
                        i5 = 1558610887;
                    }
                    break;
                case -701485423:
                case 631319055:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    } else {
                        iM2761 = C0619.m2761("ۘۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6553) ^ 799832312;
                        i5 = -74362885;
                    }
                    break;
                case -626141999:
                case -80612058:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ܽܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20431) ^ (-1465463255);
                        i5 = 35819725;
                    } else {
                        iM2761 = C0619.m2761("ۜ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11557)) ^ (-1080400414);
                        i5 = 1812944465;
                    }
                    break;
                case -590645832:
                case 40705641:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    } else {
                        iM2761 = (C0619.m2761("ۖ᩶") ^ i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 22269) ^ 1999584091;
                        i5 = 299368521;
                    }
                    break;
                case -424997169:
                case -320810014:
                    if (C2878.f9462) {
                        iM2761 = (i3 - C0619.m2761("ۤ۟")) * (-103);
                        i4 = ((iM2761 ^ i2) * (-30873)) ^ 1147691775;
                        i5 = -2020833311;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩹") + i2) * 43;
                        i4 = ((iM2761 ^ i3) * (-28777)) ^ 1055523158;
                        i5 = -1583975496;
                    }
                    break;
                case -213637909:
                case 1028829610:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("᩷ۚ") + i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20009)) ^ (-1368115749);
                        i5 = -482623038;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۨᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-29111)) ^ (-516570526);
                        i5 = 1641415135;
                    }
                    break;
                case 347273294:
                case 357773382:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0619.m2761("᩷ۚ") + i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20009)) ^ (-1368115749);
                        i5 = -482623038;
                    } else {
                        iM2761 = C0619.m2761("ᩴۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 31079) ^ 338645857;
                        i5 = 1703375397;
                    }
                    break;
                default:
                    if (this.f64243) {
                        iM2761 = (C0619.m2761("ۛۧ") + i2) * (-81);
                        i4 = ((iM2761 ^ i3) * 19985) ^ (-338347079);
                        i5 = 1089303616;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 537) ^ 799161072;
                        i5 = 1748323614;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m45950() {
        return this.f64243;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19987(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        long j = 0;
        boolean z = false;
        C22225 c22225 = null;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1751362232;
        int i3 = C3099.f10023;
        int i4 = C11235.f35427;
        int iM2761 = (C0619.m2761("᩻ۡ") ^ i3) * 29;
        int i5 = ((iM2761 ^ i4) * 8177) ^ 1197364203;
        int i6 = -1138817947;
        while (true) {
            i2 = (iM2761 ^ i6) ^ (i5 & (((i2 ^ i4) * 14189) >> 31));
            switch (i2) {
                case -2089435307:
                case 2126738121:
                    setSelector(new C22971(this));
                    iM2761 = C0619.m2761("۬ۧ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 31879) ^ 1808799653;
                    i6 = 935893568;
                    break;
                case -2037915097:
                case -1006342795:
                    this.f64242 = z2;
                    iM2761 = (C0773.m3169("ܰۨ") ^ i3) * (-81);
                    i5 = ((iM2761 ^ i4) * 32533) ^ 1398264932;
                    i6 = -236922543;
                    break;
                case -1904847334:
                case -1117921243:
                    j = 0;
                    this.f64219 = 0L;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-21157)) ^ 1264122665;
                        i6 = 1613371134;
                    } else {
                        this.f64221 = new C23073(3);
                        if (C3077.f9998) {
                            iM2761 = (C0619.m2761("ۚ᩺") ^ i4) * (-73);
                            i5 = ((iM2761 ^ i3) * (-26541)) ^ (-1886584202);
                            i6 = -1000908494;
                        } else {
                            iM2761 = (C0619.m2761("ۧۨ") + i4) * (-13);
                            i5 = ((iM2761 ^ i3) * 20339) ^ 573733529;
                            i6 = 1745372872;
                        }
                    }
                    break;
                case -1867171416:
                case -1855438993:
                    this.f64226 = f3;
                    this.f64244 = ViewConfiguration.get(context).getScaledTouchSlop();
                    return;
                case -1836590168:
                case 582481509:
                    super.setOnScrollListener(new C5071(this));
                    if (super.isFastScrollEnabled()) {
                        iM2761 = C0773.m3169("֨᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22803)) ^ (-2039247022);
                        i6 = 1457952755;
                    } else {
                        iM2761 = (C0773.m3169("ܰۨ") ^ i3) * (-81);
                        i5 = ((iM2761 ^ i4) * 32533) ^ 1398264932;
                        i6 = -236922543;
                    }
                    break;
                case -1787956166:
                case 503141430:
                    this.f64235 = z2 ? 1 : 0;
                    setHorizontalScrollBarEnabled(z);
                    setVerticalScrollBarEnabled(z);
                    if (Build.VERSION.SDK_INT >= 26) {
                        iM2761 = C0773.m3169("ۙ۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * 6125) ^ 2031651021;
                        i6 = -1322641873;
                    } else {
                        iM2761 = (C0773.m3169("ܶ᩹") + i3) * (-79);
                        i5 = ((iM2761 ^ i4) * (-28031)) ^ (-1582205280);
                        i6 = 747655697;
                    }
                    break;
                case -1552055239:
                case -1784781:
                    super.setFastScrollEnabled(z);
                    if (isInEditMode()) {
                        iM2761 = C0619.m2761("۬ۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 31879) ^ 1808799653;
                        i6 = 935893568;
                    } else {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-761)) ^ (-2014364058);
                        i6 = 647063083;
                    }
                    break;
                case -1427918189:
                case -1282774455:
                    if (C1564.f5401 > 0) {
                        iM2761 = C0773.m3169("ۖ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29521) ^ (-195014228);
                        i6 = -507599847;
                    } else {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-21157)) ^ 1264122665;
                        i6 = 1613371134;
                    }
                    break;
                case -1322471797:
                case 244976467:
                    this.f64225 = 964130679;
                    f2 = 8.0f;
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0619.m2761("ۧۨ") + i4) * (-13);
                        i5 = ((iM2761 ^ i3) * 20339) ^ 573733529;
                        i6 = 1745372872;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩻") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-29123)) ^ 1536546630;
                        i6 = -1489501585;
                    }
                    break;
                case -1272571085:
                case 903536536:
                    this.f64220 = f * f2;
                    f3 = f * 48.0f;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i3 - C0619.m2761("۠᩷")) * (-85);
                        i5 = ((iM2761 ^ i4) * 4819) ^ 1696356217;
                        i6 = 102886454;
                    } else {
                        iM2761 = (C0773.m3169("ܶ۬") ^ i3) * 69;
                        i5 = ((iM2761 ^ i4) * (-21619)) ^ 35666515;
                        i6 = 1598682079;
                    }
                    break;
                case -1176872842:
                case -652632418:
                    this.f64228 = new HandlerC11036(this);
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0619.m2761("ۚۜ") + i3) * (-19);
                        i5 = ((iM2761 ^ i4) * 11697) ^ 1709068771;
                        i6 = -1828181889;
                    } else {
                        iM2761 = C0619.m2761("۫ܿ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 15579) ^ (-1445708691);
                        i6 = 220345933;
                    }
                    break;
                case -1116352845:
                case 1935428999:
                    AbstractC3624.m11755();
                    iM2761 = C0773.m3169("᩵ܿ") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-21157)) ^ 1264122665;
                    i6 = 1613371134;
                    break;
                case -495948921:
                case 1637345109:
                    if (C2485.m8357() <= 0) {
                        iM2761 = (i3 - C0619.m2761("۠᩷")) * (-85);
                        i5 = ((iM2761 ^ i4) * 4819) ^ 1696356217;
                        i6 = 102886454;
                    } else {
                        iM2761 = C0773.m3169("ۖ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29521) ^ (-195014228);
                        i6 = -507599847;
                    }
                    break;
                case -489747881:
                case 396540168:
                    if (C1826.f6190 > 0) {
                        iM2761 = (C0619.m2761("ۧۨ") + i4) * (-13);
                        i5 = ((iM2761 ^ i3) * 20339) ^ 573733529;
                        i6 = 1745372872;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۠᩷")) * (-85);
                        i5 = ((iM2761 ^ i4) * 4819) ^ 1696356217;
                        i6 = 102886454;
                    }
                    break;
                case -221569344:
                case 265714305:
                    C2419.m8174();
                    throw new RuntimeException();
                case 151790530:
                case 1189238452:
                    this.f64237 = j;
                    c22225 = new C22225(this);
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۚۜ") + i3) * (-19);
                        i5 = ((iM2761 ^ i4) * 11697) ^ 1709068771;
                        i6 = -1828181889;
                    } else {
                        iM2761 = C0773.m3169("ۡۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-24215)) ^ (-1169699408);
                        i6 = 941085611;
                    }
                    break;
                case 270582111:
                case 1615197493:
                    this.f64240 = c22225;
                    z2 = true;
                    z2 = true;
                    if (C4282.m13644()) {
                        iM2761 = C0619.m2761("ۨۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-20045)) ^ (-368695267);
                        i6 = -1893745765;
                    } else {
                        iM2761 = (C0619.m2761("ۚۜ") + i3) * (-19);
                        i5 = ((iM2761 ^ i4) * 11697) ^ 1709068771;
                        i6 = -1828181889;
                    }
                    break;
                case 600374856:
                case 744736712:
                    setDefaultFocusHighlightEnabled(z);
                    iM2761 = (C0773.m3169("ܶ᩹") + i3) * (-79);
                    i5 = ((iM2761 ^ i4) * (-28031)) ^ (-1582205280);
                    i6 = 747655697;
                    break;
                case 680946439:
                case 1872412093:
                    f = context.getResources().getDisplayMetrics().density;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i3 - C0619.m2761("۠᩷")) * (-85);
                        i5 = ((iM2761 ^ i4) * 4819) ^ 1696356217;
                        i6 = 102886454;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩶ۢ")) * (-53);
                        i5 = ((iM2761 ^ i3) * 28789) ^ (-655119363);
                        i6 = -810143249;
                    }
                    break;
                case 1130258684:
                case 1482731095:
                    this.f64218 = -579373193;
                    if (C2310.m7813() <= 0) {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-21157)) ^ 1264122665;
                        i6 = 1613371134;
                    } else {
                        iM2761 = C0619.m2761("᩻۫") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-10997)) ^ (-1012681266);
                        i6 = 1456196101;
                    }
                    break;
                default:
                    z = false;
                    this.f64223 = false;
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ۚۜ") + i3) * (-19);
                        i5 = ((iM2761 ^ i4) * 11697) ^ 1709068771;
                        i6 = -1828181889;
                    } else {
                        iM2761 = C0773.m3169("᩷ᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 3347) ^ 1723910524;
                        i6 = -737989828;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = null;
        DataSetObserver dataSetObserver = null;
        int i = -1384276189;
        int i2 = C1146.f4234;
        int i3 = C3690.f12684;
        int iM2761 = C0619.m2761("ᩳ᩺") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-20443)) ^ 1739341655;
        int i5 = -562677499;
        while (true) {
            i = ((((i ^ i3) * (-6987)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2037816073:
                case -260111638:
                    C1826.m6301();
                    break;
                case -2037481913:
                case -1909745977:
                    if (C3998.f13671 == 0) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8655) ^ 2143808208;
                        i5 = 1196470849;
                    } else {
                        iM2761 = C0619.m2761("᩵۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16045)) ^ 7820197;
                        i5 = -1200021859;
                    }
                    break;
                case -1962313524:
                case 1660461279:
                    break;
                case -1917740007:
                case 1425147710:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ܿۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11725)) ^ 1015239159;
                        i5 = -125474228;
                    } else {
                        iM2761 = C0619.m2761("ۨۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14323)) ^ (-1154938932);
                        i5 = 1979010666;
                    }
                    break;
                case -1759406134:
                case 1324828247:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11237)) ^ 1337850233;
                        i5 = 807036861;
                    } else {
                        iM2761 = C0619.m2761("᩸᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17483)) ^ 472409825;
                        i5 = 2090423771;
                    }
                    break;
                case -1677534699:
                case 612503425:
                    super.setAdapter(listAdapter);
                    if (listAdapter != null) {
                        iM2761 = C0619.m2761("֨ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15207) ^ (-2002393081);
                        i5 = -1519687262;
                    } else {
                        iM2761 = (C0773.m3169("ۧܽ") ^ i3) * 109;
                        i4 = ((iM2761 ^ i2) * 10199) ^ 362189079;
                        i5 = 1185998930;
                    }
                    break;
                case -1592794963:
                case -148302269:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ܿۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11725)) ^ 1015239159;
                        i5 = -125474228;
                    } else {
                        iM2761 = C0619.m2761("᩵۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16045)) ^ 7820197;
                        i5 = -1200021859;
                    }
                    break;
                case -1496962126:
                case 1047651605:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("᩶᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16759)) ^ (-388708951);
                        i5 = -1199672860;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺۟")) * (-29);
                        i4 = ((iM2761 ^ i2) * (-28895)) ^ 949524170;
                        i5 = -1079229427;
                    }
                    break;
                case -1241951195:
                case 1633885660:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8655) ^ 2143808208;
                        i5 = 1196470849;
                    } else {
                        iM2761 = (C0619.m2761("۬ܳ") ^ i2) * (-87);
                        i4 = ((iM2761 ^ i3) * 22751) ^ (-1537480808);
                        i5 = -4453857;
                    }
                    break;
                case -1188613234:
                case 1846290784:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("᩵۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16045)) ^ 7820197;
                        i5 = -1200021859;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ۠") + i2) * 3;
                        i4 = ((iM2761 ^ i3) * (-15527)) ^ 1603072561;
                        i5 = 1021606843;
                    }
                    break;
                case -1034765376:
                case 1409830436:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8655) ^ 2143808208;
                        i5 = 1196470849;
                    } else {
                        iM2761 = C0773.m3169("ܰܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7577) ^ (-1728043101);
                        i5 = -832860749;
                    }
                    break;
                case -984356743:
                case -116903406:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("᩶᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16759)) ^ (-388708951);
                        i5 = -1199672860;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۠") ^ i3) * (-53);
                        i4 = ((iM2761 ^ i2) * (-14109)) ^ 719726077;
                        i5 = 1622180328;
                    }
                    break;
                case -857520857:
                case 349996170:
                    adapter = getAdapter();
                    dataSetObserver = this.f64240;
                    if (adapter != null) {
                        iM2761 = (C0619.m2761("᩶ᩴ") + i3) * 17;
                        i4 = ((iM2761 ^ i2) * (-10219)) ^ (-2145037593);
                        i5 = 667725950;
                    } else {
                        iM2761 = C0773.m3169("۟ۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19179) ^ 1321087411;
                        i5 = 746282944;
                    }
                    break;
                case -748196759:
                case 353534352:
                    listAdapter.registerDataSetObserver(dataSetObserver);
                    iM2761 = (C0773.m3169("ۧܽ") ^ i3) * 109;
                    i4 = ((iM2761 ^ i2) * 10199) ^ 362189079;
                    i5 = 1185998930;
                    break;
                case 79265122:
                case 764522966:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("᩶᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16759)) ^ (-388708951);
                        i5 = -1199672860;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩶ۙ")) * (-5);
                        i4 = ((iM2761 ^ i2) * (-23441)) ^ (-9923132);
                        i5 = 1224637654;
                    }
                    break;
                case 141411632:
                case 2116171195:
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11237)) ^ 1337850233;
                        i5 = 807036861;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۤ᩶")) * (-83);
                        i4 = ((iM2761 ^ i2) * 23107) ^ (-930979653);
                        i5 = -1457633629;
                    }
                    break;
                case 160637312:
                case 1629084875:
                    adapter.unregisterDataSetObserver(dataSetObserver);
                    iM2761 = C0773.m3169("۟ۖ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 19179) ^ 1321087411;
                    i5 = 746282944;
                    break;
                case 309187296:
                case 1258738675:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11237)) ^ 1337850233;
                        i5 = 807036861;
                    } else {
                        iM2761 = C0619.m2761("᩸֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7393) ^ (-792437291);
                        i5 = 1915281393;
                    }
                    break;
                case 426085183:
                case 1224528690:
                    C11235.m28309();
                    iM2761 = C0619.m2761("᩵۟") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-16045)) ^ 7820197;
                    i5 = -1200021859;
                    break;
                default:
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0773.m3169("᩶᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16759)) ^ (-388708951);
                        i5 = -1199672860;
                    } else {
                        iM2761 = C0619.m2761("᩵۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16045)) ^ 7820197;
                        i5 = -1200021859;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45946() {
        int iM4938 = 0;
        int i = 0;
        int iM8883 = 0;
        int iM5514 = 0;
        int i2 = 1616391419;
        int i3 = C3448.f11240;
        int i4 = C23916.f77426;
        int iM3169 = (i3 - C0773.m3169("ۨ᩷")) * 19;
        int i5 = ((iM3169 ^ i4) * 19889) ^ 270237086;
        int i6 = -1645087366;
        while (true) {
            i2 = ((((i2 ^ i4) * (-6469)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2128972317:
                case -1127146409:
                    if (C0862.m3503()) {
                        iM3169 = C0619.m2761("ۡܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-23949)) ^ (-1908051613);
                        i6 = 200809147;
                    } else {
                        iM3169 = C0773.m3169("۟ܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27777) ^ (-1031505013);
                        i6 = 1776612355;
                    }
                    break;
                case -2010221154:
                case -604586373:
                    this.f64235 = iM8883;
                    iM3169 = C0773.m3169("ܳ᩻") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-4991)) ^ 96374196;
                    i6 = 644923594;
                    break;
                case -1874919928:
                case 1532799360:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("۫۟") + i4) * 47;
                        i5 = ((iM3169 ^ i3) * 22929) ^ 1166714671;
                        i6 = 483056335;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶܰ")) * (-67);
                        i5 = ((iM3169 ^ i4) * 1695) ^ 862856120;
                        i6 = 1458038175;
                    }
                    break;
                case -1807067098:
                case -1593780403:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("۟ܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27777) ^ (-1031505013);
                        i6 = 1776612355;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܽܰ")) * 31;
                        i5 = ((iM3169 ^ i4) * 1139) ^ (-18101245);
                        i6 = 1195584473;
                    }
                    break;
                case -1600728881:
                case -1164732318:
                    iM4938 = C1343.m4938(this);
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ܿ۫") ^ i3) * (-75);
                        i5 = ((iM3169 ^ i4) * 26801) ^ (-938242417);
                        i6 = 1724387988;
                    } else {
                        iM3169 = C0619.m2761("֡ۙ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 15023) ^ (-1257687227);
                        i6 = 1420259357;
                    }
                    break;
                case -1485309353:
                case -1231181203:
                    i = 1;
                    if (iM4938 >= 1) {
                        iM3169 = C0773.m3169("֫ۢ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5953) ^ 976429950;
                        i6 = 243299142;
                    } else {
                        iM8883 = iM4938;
                        iM3169 = (C0773.m3169("᩶֡") + i3) * (-49);
                        i5 = ((iM3169 ^ i4) * 5125) ^ (-1753837878);
                        i6 = 1640474232;
                    }
                    break;
                case -1434626786:
                case 905921467:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0773.m3169("۟ܰ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27777) ^ (-1031505013);
                        i6 = 1776612355;
                    } else {
                        iM3169 = (C0773.m3169("ۙۜ") ^ i4) * (-71);
                        i5 = ((iM3169 ^ i3) * (-9239)) ^ (-2023566633);
                        i6 = 738156590;
                    }
                    break;
                case -1104446249:
                case 1897111608:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ۨ۬") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-7061)) ^ (-1530454988);
                        i6 = 1639917330;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۫") ^ i3) * (-75);
                        i5 = ((iM3169 ^ i4) * 26801) ^ (-938242417);
                        i6 = 1724387988;
                    }
                    break;
                case -1063233383:
                case 1540905539:
                    iM8883 = C2702.m8883(iM4938, C2878.m9482(this) / iM5514);
                    iM3169 = (C0773.m3169("᩶֡") + i3) * (-49);
                    i5 = ((iM3169 ^ i4) * 5125) ^ (-1753837878);
                    i6 = 1640474232;
                    break;
                case -992188968:
                case 479423220:
                    return this.f64235;
                case -987860642:
                case 878941767:
                    iM5514 = C1564.m5514(C4282.m13654(this, 0));
                    if (iM5514 > i) {
                        iM3169 = (i4 - C0619.m2761("ۛ᩶")) * (-13);
                        i5 = ((iM3169 ^ i3) * 11579) ^ 462364871;
                        i6 = 1498988130;
                    } else {
                        iM8883 = iM4938;
                        iM3169 = (C0773.m3169("᩶֡") + i3) * (-49);
                        i5 = ((iM3169 ^ i4) * 5125) ^ (-1753837878);
                        i6 = 1640474232;
                    }
                    break;
                case -751951815:
                case 540156998:
                    if (!C3779.m12264()) {
                        iM3169 = (i3 - C0619.m2761("ܽܰ")) * 31;
                        i5 = ((iM3169 ^ i4) * 1139) ^ (-18101245);
                        i6 = 1195584473;
                    } else {
                        iM3169 = (C0773.m3169("ۘܶ") + i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-769)) ^ 598650477;
                        i6 = 1071097926;
                    }
                    break;
                case -671843686:
                case 2145444679:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ܿ۫") ^ i3) * (-75);
                        i5 = ((iM3169 ^ i4) * 26801) ^ (-938242417);
                        i6 = 1724387988;
                    } else {
                        iM3169 = C0619.m2761("᩹۬") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-28513)) ^ (-1684434681);
                        i6 = 1591160152;
                    }
                    break;
                case -474908049:
                case 1314308522:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ۘܶ") + i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-769)) ^ 598650477;
                        i6 = 1071097926;
                    } else {
                        iM3169 = C0773.m3169("᩻֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10575) ^ (-90454587);
                        i6 = 1449261815;
                    }
                    break;
                case -446517568:
                case -394041273:
                    if (iM8883 > this.f64235) {
                        iM3169 = C0773.m3169("֫ۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 23161) ^ 634524073;
                        i6 = 868201537;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-4991)) ^ 96374196;
                        i6 = 644923594;
                    }
                    break;
                case -364958102:
                case 618888257:
                    C0619.m2763();
                    C1146.m4231();
                    return 0;
                case 373416694:
                case 1737680532:
                    C1343.m4943();
                    C0862.m3503();
                    iM3169 = (C0773.m3169("ۘܶ") + i3) * (-117);
                    i5 = ((iM3169 ^ i4) * (-769)) ^ 598650477;
                    i6 = 1071097926;
                    break;
                case 1101200526:
                case 1849988819:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۘܶ") + i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-769)) ^ 598650477;
                        i6 = 1071097926;
                    } else {
                        iM3169 = C0619.m2761("ۧ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 15933) ^ (-187847129);
                        i6 = 1110716962;
                    }
                    break;
                case 1392999332:
                case 1691033518:
                    if (C4282.f15546 > 0) {
                        iM3169 = (C0773.m3169("۫۟") + i4) * 47;
                        i5 = ((iM3169 ^ i3) * 22929) ^ 1166714671;
                        i6 = 483056335;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܽܰ")) * 31;
                        i5 = ((iM3169 ^ i4) * 1139) ^ (-18101245);
                        i6 = 1195584473;
                    }
                    break;
                case 1620758669:
                case 1645733539:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ۘܶ") + i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-769)) ^ 598650477;
                        i6 = 1071097926;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۬᩸")) * (-71);
                        i5 = ((iM3169 ^ i3) * 29257) ^ 996019674;
                        i6 = -2082501748;
                    }
                    break;
                default:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܽܰ")) * 31;
                        i5 = ((iM3169 ^ i4) * 1139) ^ (-18101245);
                        i6 = 1195584473;
                    } else {
                        iM3169 = C0773.m3169("᩷᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * 5633) ^ (-830131185);
                        i6 = -317429778;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m45938(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator itM13647 = null;
        int i = 1956283614;
        int i2 = C2288.f7433;
        int i3 = C3448.f11240;
        int iM3169 = (i2 - C0773.m3169("᩷ۤ")) * (-119);
        int i4 = ((iM3169 ^ i3) * (-22193)) ^ (-489604438);
        int i5 = 1172621442;
        while (true) {
            i = ((((i ^ i3) * 13573) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2082671282:
                case -2071165994:
                    if (isEnabled()) {
                        iM3169 = (C0773.m3169("ᩳ֨") + i2) * (-103);
                        i4 = ((iM3169 ^ i3) * 30483) ^ 220702251;
                        i5 = -1694201350;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۘ") + i3) * 127;
                        i4 = ((iM3169 ^ i2) * 6225) ^ 1454033511;
                        i5 = -508966459;
                    }
                    break;
                case -2005612769:
                case -544812130:
                    return false;
                case -1901135067:
                case 236924195:
                    if (C3998.m12923(itM13647)) {
                        iM3169 = (C0619.m2761("ۧ֡") + i3) * 49;
                        i4 = ((iM3169 ^ i2) * (-12139)) ^ (-431116502);
                        i5 = 1871496911;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۘ") + i3) * 127;
                        i4 = ((iM3169 ^ i2) * 6225) ^ 1454033511;
                        i5 = -508966459;
                    }
                    break;
                case -1710545511:
                case -1048569543:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (C0773.m3169("ᩳܽ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * 8029) ^ (-755445986);
                        i5 = -805850076;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۢ") + i2) * 21;
                        i4 = ((iM3169 ^ i3) * (-9923)) ^ (-1203317431);
                        i5 = 826480295;
                    }
                    break;
                case -1438230432:
                case 331668438:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۘ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7379) ^ (-320127796);
                        i5 = -1312183875;
                    } else {
                        iM3169 = C0773.m3169("᩵ۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-10493)) ^ 1951049424;
                        i5 = -635146414;
                    }
                    break;
                case -1409012628:
                case 1727335101:
                    onTouchListener = this.f64232;
                    if (onTouchListener != null) {
                        iM3169 = (C0619.m2761("ܽ֨") ^ i3) * 23;
                        i4 = ((iM3169 ^ i2) * 5825) ^ (-814402743);
                        i5 = 1814626132;
                    } else {
                        iM3169 = C0773.m3169("᩷ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4437) ^ 1912525090;
                        i5 = -832253268;
                    }
                    break;
                case -1296049441:
                case 1125084864:
                    onTouchListener.onTouch(this, motionEvent);
                    iM3169 = C0773.m3169("᩷ۘ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 4437) ^ 1912525090;
                    i5 = -832253268;
                    break;
                case -1200262371:
                case 1622885494:
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23433)) ^ (-513553458);
                        i5 = 401330487;
                    } else {
                        iM3169 = C0773.m3169("ᩳۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18153)) ^ (-1754396275);
                        i5 = -1934507692;
                    }
                    break;
                case -1188548832:
                case 1671634056:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۜ۟")) * 23;
                        i4 = ((iM3169 ^ i2) * (-18093)) ^ (-688439176);
                        i5 = -655275496;
                    } else {
                        iM3169 = (C0773.m3169("᩸֨") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * (-21821)) ^ 1117124221;
                        i5 = -725947233;
                    }
                    break;
                case -889831757:
                case 1848631190:
                    if (C3779.m12264()) {
                        iM3169 = (i2 - C0619.m2761("ܶ᩷")) * 83;
                        i4 = ((iM3169 ^ i3) * (-21537)) ^ 2135301364;
                        i5 = -249270750;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܽ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * 8029) ^ (-755445986);
                        i5 = -805850076;
                    }
                    break;
                case -849435692:
                case 541198798:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23433)) ^ (-513553458);
                        i5 = 401330487;
                    } else {
                        iM3169 = C0773.m3169("֡ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13759)) ^ 1383375962;
                        i5 = 1824885449;
                    }
                    break;
                case -744791999:
                case -368587357:
                    C1146.m4231();
                    iM3169 = (i3 - C0773.m3169("ۜ۟")) * 23;
                    i4 = ((iM3169 ^ i2) * (-18093)) ^ (-688439176);
                    i5 = -655275496;
                    break;
                case -376275955:
                case 1775042094:
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0773.m3169("ۘ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7379) ^ (-320127796);
                        i5 = -1312183875;
                    } else {
                        iM3169 = C0619.m2761("ۧ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6515)) ^ (-392123209);
                        i5 = 209527658;
                    }
                    break;
                case -190744744:
                case 280892223:
                    if (this.f64234 == null) {
                        iM3169 = (C0773.m3169("᩹ۘ") + i3) * 127;
                        i4 = ((iM3169 ^ i2) * 6225) ^ 1454033511;
                        i5 = -508966459;
                    } else {
                        iM3169 = C0619.m2761("֫ۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4493) ^ 336264810;
                        i5 = -833176147;
                    }
                    break;
                case -171145198:
                case 146050066:
                    if (C2966.m9664()) {
                        iM3169 = C0619.m2761("᩷ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2803) ^ (-785609472);
                        i5 = 1365420229;
                    } else {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23433)) ^ (-513553458);
                        i5 = 401330487;
                    }
                    break;
                case -163497368:
                case 1773011703:
                    C3033.m9845();
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۘ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7379) ^ (-320127796);
                        i5 = -1312183875;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۜ۟")) * 23;
                        i4 = ((iM3169 ^ i2) * (-18093)) ^ (-688439176);
                        i5 = -655275496;
                    }
                    break;
                case -6114998:
                case 2078274916:
                    if (C2023.m6964() > 0) {
                        iM3169 = C0619.m2761("۟ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6069)) ^ (-1535141425);
                        i5 = -221587712;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۜ۟")) * 23;
                        i4 = ((iM3169 ^ i2) * (-18093)) ^ (-688439176);
                        i5 = -655275496;
                    }
                    break;
                case 108884029:
                case 1901950381:
                    C1080.m4050();
                    C2878.m9491();
                    return false;
                case 292936438:
                case 2081572684:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0619.m2761("۟ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6069)) ^ (-1535141425);
                        i5 = -221587712;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۘܿ")) * (-61);
                        i4 = ((iM3169 ^ i2) * (-23505)) ^ (-441395776);
                        i5 = 1017738852;
                    }
                    break;
                case 432792207:
                case 1076040260:
                    if (((View.OnTouchListener) C0950.m3796(itM13647)).onTouch(this, motionEvent)) {
                        iM3169 = (i2 - C0619.m2761("ۖܶ")) * (-91);
                        i4 = ((iM3169 ^ i3) * (-18889)) ^ 1520495099;
                        i5 = 815908234;
                    } else {
                        iM3169 = C0773.m3169("ܽۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24779) ^ 1378305995;
                        i5 = -319014076;
                    }
                    break;
                case 444838013:
                case 1493491922:
                    C2287.m7745();
                    if (!C3077.m10041()) {
                        iM3169 = C0773.m3169("ۘ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7379) ^ (-320127796);
                        i5 = -1312183875;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܽ") + i2) * 85;
                        i4 = ((iM3169 ^ i3) * 8029) ^ (-755445986);
                        i5 = -805850076;
                    }
                    break;
                case 640570699:
                case 722023339:
                    itM13647 = C4282.m13647(this.f64234);
                    iM3169 = C0773.m3169("ܽۙ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 24779) ^ 1378305995;
                    i5 = -319014076;
                    break;
                case 1626052316:
                case 1694189365:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23433)) ^ (-513553458);
                        i5 = 401330487;
                    } else {
                        iM3169 = C0619.m2761("ۢۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23575) ^ (-1239460422);
                        i5 = -2121949508;
                    }
                    break;
                default:
                    return true;
            }
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 574380849;
        int i6 = C2966.f9654;
        int i7 = RunnableC0334.f1808;
        int iM2761 = C0619.m2761("֫۠") ^ i7;
        int i8 = ((iM2761 ^ i6) * 2289) ^ (-2145093519);
        int i9 = -284139698;
        while (true) {
            i5 = ((((i5 ^ i6) * (-26165)) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2104825616:
                case 1177230721:
                    super.onLayout(z, i, i2, i3, i4);
                    if (z) {
                        iM2761 = C0773.m3169("ۘۤ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-1371)) ^ 114280108;
                        i9 = 163465606;
                    } else {
                        iM2761 = (C0773.m3169("ۖۘ") ^ i6) * 81;
                        i8 = ((iM2761 ^ i7) * (-891)) ^ (-541076874);
                        i9 = 176908972;
                    }
                    break;
                case -1911827264:
                case 169718015:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ᩳܶ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12785) ^ 575344674;
                        i9 = -860167617;
                    } else {
                        iM2761 = C0619.m2761("ۜۗ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-22837)) ^ (-980586387);
                        i9 = 909183204;
                    }
                    break;
                case -1726383508:
                case -626059500:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-31495)) ^ 1675687174;
                        i9 = -390237772;
                    } else {
                        iM2761 = C0773.m3169("ۙۗ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-32107)) ^ 1655956831;
                        i9 = -342226491;
                    }
                    break;
                case -1443943369:
                case -616579490:
                    if (!C2354.m7983()) {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-31495)) ^ 1675687174;
                        i9 = -390237772;
                    } else {
                        iM2761 = C0619.m2761("ᩴۨ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-2037)) ^ 921154098;
                        i9 = 1817814368;
                    }
                    break;
                case -1423042980:
                case 1175146092:
                    if (C1343.m4943()) {
                        iM2761 = C0773.m3169("ۚۜ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 26817) ^ (-1938333393);
                        i9 = -2274015;
                    } else {
                        iM2761 = C0619.m2761("ᩴۨ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-2037)) ^ 921154098;
                        i9 = 1817814368;
                    }
                    break;
                case -1353168209:
                case 1623150670:
                    if (C17202.f56030) {
                        iM2761 = (i6 - C0773.m3169("ܳܺ")) * (-55);
                        i8 = ((iM2761 ^ i7) * 12445) ^ 1838660470;
                        i9 = -1126896692;
                    } else {
                        iM2761 = C0619.m2761("ᩳܶ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12785) ^ 575344674;
                        i9 = -860167617;
                    }
                    break;
                case -1135368707:
                case -1002817379:
                    break;
                case -1036774480:
                case -517708:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ᩴۨ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-2037)) ^ 921154098;
                        i9 = 1817814368;
                    } else {
                        iM2761 = (C0619.m2761("֨֡") + i6) * 91;
                        i8 = ((iM2761 ^ i7) * 4021) ^ (-1248036312);
                        i9 = 1417704468;
                    }
                    break;
                case -899520340:
                case 981320525:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ۛܶ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-15961)) ^ 460659720;
                        i9 = -293561558;
                    } else {
                        iM2761 = C0619.m2761("֫ܽ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 32377) ^ 874104684;
                        i9 = 1327249838;
                    }
                    break;
                case -792802583:
                case 1006726213:
                    this.f64235 = 1;
                    iM2761 = (C0773.m3169("ۖۘ") ^ i6) * 81;
                    i8 = ((iM2761 ^ i7) * (-891)) ^ (-541076874);
                    i9 = 176908972;
                    break;
                case -567989228:
                case 1271875377:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ۢۙ") ^ i6) * 61;
                        i8 = ((iM2761 ^ i7) * 23219) ^ 2086500280;
                        i9 = 1325603640;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۙ") + i6) * 101;
                        i8 = ((iM2761 ^ i7) * 22005) ^ 845572348;
                        i9 = -396976288;
                    }
                    break;
                case -142829583:
                case 2057531795:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("ۢۙ") ^ i6) * 61;
                        i8 = ((iM2761 ^ i7) * 23219) ^ 2086500280;
                        i9 = 1325603640;
                    } else {
                        iM2761 = C0773.m3169("۟۠") ^ i6;
                        i8 = ((iM2761 ^ i7) * 17973) ^ (-1047367951);
                        i9 = -1068744203;
                    }
                    break;
                case -117037101:
                case 791747790:
                    C23916.m53419();
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("ۢۙ") ^ i6) * 61;
                        i8 = ((iM2761 ^ i7) * 23219) ^ 2086500280;
                        i9 = 1325603640;
                    } else {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-31495)) ^ 1675687174;
                        i9 = -390237772;
                    }
                    break;
                case 69803069:
                case 1973522227:
                    C3033.m9845();
                    C0487.m2356();
                    iM2761 = C0619.m2761("ᩴۨ") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-2037)) ^ 921154098;
                    i9 = 1817814368;
                    break;
                case 379131082:
                case 761634463:
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("᩹ۘ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 9409) ^ 859801783;
                        i9 = -901456892;
                    } else {
                        iM2761 = C0619.m2761("ᩳܶ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12785) ^ 575344674;
                        i9 = -860167617;
                    }
                    break;
                case 1240696513:
                case 1508204891:
                    RunnableC0334.m2063();
                    break;
                case 1565745111:
                case 2047766071:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ᩳܶ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12785) ^ 575344674;
                        i9 = -860167617;
                    } else {
                        iM2761 = C0619.m2761("᩷ۡ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 24923) ^ 2062320643;
                        i9 = 1426298315;
                    }
                    break;
                default:
                    C2419.m8174();
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("ۛܶ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-15961)) ^ 460659720;
                        i9 = -293561558;
                    } else {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-31495)) ^ 1675687174;
                        i9 = -390237772;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m45937(C19987 c19987) {
        long jM13538 = 0;
        long j = 0;
        int i = 150379137;
        int i2 = C11235.f35427;
        int i3 = C1321.f4751;
        int iM3169 = C0773.m3169("ۚ᩶") ^ i2;
        int i4 = ((iM3169 ^ i3) * 12781) ^ (-764211005);
        int i5 = -1373213828;
        while (true) {
            i = ((((i ^ i3) * (-23519)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2132420271:
                case -1767325472:
                    C2878.m9491();
                    C2878.m9491();
                    iM3169 = C0619.m2761("ۢܳ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                    i5 = 190972228;
                    break;
                case -2059794633:
                case 140899803:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0773.m3169("᩵᩵") ^ i3) * (-45);
                        i4 = ((iM3169 ^ i2) * (-12115)) ^ 1963670524;
                        i5 = -1568685533;
                    } else {
                        iM3169 = (C0619.m2761("۠ۨ") + i2) * (-37);
                        i4 = ((iM3169 ^ i3) * (-8581)) ^ (-1739427976);
                        i5 = 2104412363;
                    }
                    break;
                case -1728001424:
                case 959502642:
                    if (C2966.f9654 < 0) {
                        iM3169 = (C0773.m3169("᩵᩵") ^ i3) * (-45);
                        i4 = ((iM3169 ^ i2) * (-12115)) ^ 1963670524;
                        i5 = -1568685533;
                    } else {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    }
                    break;
                case -1725952654:
                case -1203761281:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    } else {
                        iM3169 = C0773.m3169("ۡܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24297) ^ 1889872844;
                        i5 = 1774779861;
                    }
                    break;
                case -1461628810:
                case 879269283:
                    c19987.f64237 = jM13538 + j;
                    break;
                case -1410209531:
                case 2091916197:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ᩳᩴ") ^ i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-4355)) ^ (-307373621);
                        i5 = -397725016;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 24787) ^ 34972792;
                        i5 = -865567852;
                    }
                    break;
                case -1376124242:
                case 1757071662:
                    AbstractC0641.m2813();
                    break;
                case -1049569716:
                case -665481309:
                    j = 500;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۘ᩻") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i2) * (-7143)) ^ (-826136376);
                        i5 = -871022530;
                    } else {
                        iM3169 = C0773.m3169("᩹۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14405)) ^ (-1351230867);
                        i5 = 973101221;
                    }
                    break;
                case -796833379:
                case -54272974:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0619.m2761("ᩳᩴ") ^ i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-4355)) ^ (-307373621);
                        i5 = -397725016;
                    } else {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    }
                    break;
                case -81128722:
                case 727864162:
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("᩻ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15383)) ^ (-820327605);
                        i5 = -2094266827;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܶ᩺")) * (-73);
                        i4 = ((iM3169 ^ i3) * 6003) ^ (-2073704930);
                        i5 = -519736318;
                    }
                    break;
                case 20093888:
                case 1019524852:
                    jM13538 = C4238.m13538();
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ᩳᩴ") ^ i2) * 53;
                        i4 = ((iM3169 ^ i3) * (-4355)) ^ (-307373621);
                        i5 = -397725016;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۨ۫")) * (-125);
                        i4 = ((iM3169 ^ i2) * (-27147)) ^ 480078872;
                        i5 = -863164093;
                    }
                    break;
                case 349740706:
                case 472319919:
                    C3099.m10095();
                    if (C2878.m9491() <= 0) {
                        iM3169 = (i2 - C0619.m2761("ܶ᩺")) * (-73);
                        i4 = ((iM3169 ^ i3) * 6003) ^ (-2073704930);
                        i5 = -519736318;
                    } else {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    }
                    break;
                case 527889247:
                case 1800135211:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("᩵᩵") ^ i3) * (-45);
                        i4 = ((iM3169 ^ i2) * (-12115)) ^ 1963670524;
                        i5 = -1568685533;
                    } else {
                        iM3169 = C0773.m3169("ۘܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31671) ^ (-348053913);
                        i5 = -296553553;
                    }
                    break;
                case 632808071:
                case 1356766106:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    } else {
                        iM3169 = C0773.m3169("ۡܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30613) ^ 1320371681;
                        i5 = 2127400097;
                    }
                    break;
                case 1770597250:
                case 1794132621:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    } else {
                        iM3169 = C0773.m3169("ܺ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28995)) ^ (-1435413103);
                        i5 = 1997571110;
                    }
                    break;
                default:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23679) ^ 929217986;
                        i5 = 190972228;
                    } else {
                        iM3169 = (C0773.m3169("۬ۚ") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * (-1185)) ^ (-1188806037);
                        i5 = -1002784838;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[PHI: r5
      0x00f9: PHI (r5v65 float) = (r5v58 float), (r5v2 float), (r5v2 float) binds: [B:38:0x00f7, B:9:0x005b, B:152:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0191 A[PHI: r13 r14
      0x0191: PHI (r13v4 float) = (r13v3 float), (r13v2 float), (r13v2 float) binds: [B:50:0x018f, B:34:0x00d5, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:50:0x018f, B:34:0x00d5, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x022b A[PHI: r7 r8 r10 r11 r12
      0x022b: PHI (r7v4 float) = (r7v3 float), (r7v2 float), (r7v2 float) binds: [B:66:0x0229, B:58:0x01ea, B:54:0x01c7] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r8v4 float) = (r8v3 float), (r8v2 float), (r8v2 float) binds: [B:66:0x0229, B:58:0x01ea, B:54:0x01c7] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float) binds: [B:66:0x0229, B:58:0x01ea, B:54:0x01c7] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r11v3 float) = (r11v2 float), (r11v2 float), (r11v4 float) binds: [B:66:0x0229, B:58:0x01ea, B:54:0x01c7] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r12v3 float) = (r12v2 float), (r12v2 float), (r12v4 float) binds: [B:66:0x0229, B:58:0x01ea, B:54:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (l.C1826.m6301() >= 0) goto L13;
     */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19987.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        int i = 207264716;
        int i2 = C2354.f7599;
        int i3 = C3033.f9831;
        int iM3169 = (C0773.m3169("ܽۧ") + i2) * 123;
        int i4 = ((iM3169 ^ i3) * (-27583)) ^ 1010700048;
        int i5 = 12653253;
        while (true) {
            i = ((((i ^ i3) * (-16289)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2076166087:
                case 1614044242:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24943)) ^ 1363286272;
                        i5 = 784865306;
                    } else {
                        iM3169 = C0619.m2761("ܳۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26271)) ^ (-1548161737);
                        i5 = 1119937188;
                    }
                    break;
                case -2032402530:
                case -312384496:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("ۘ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2103) ^ (-314794341);
                        i5 = -1985493871;
                    } else {
                        iM3169 = (C0619.m2761("ۧ۟") + i3) * (-105);
                        i4 = ((iM3169 ^ i2) * 4793) ^ (-1647697113);
                        i5 = -445506391;
                    }
                    break;
                case -1944627286:
                case 455861240:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24943)) ^ 1363286272;
                        i5 = 784865306;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ᩵") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * 2277) ^ 283348237;
                        i5 = 696698185;
                    }
                    break;
                case -1932294418:
                case 2066273799:
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ܳۗ") ^ i2) * (-107);
                        i4 = ((iM3169 ^ i3) * 21927) ^ (-506606864);
                        i5 = -1777561897;
                    } else {
                        iM3169 = (C0773.m3169("ۡۜ") + i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-30467)) ^ 1709528063;
                        i5 = -1442892145;
                    }
                    break;
                case -1765898368:
                case 11521521:
                    break;
                case -1592003066:
                case 1780401034:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("ۘ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2103) ^ (-314794341);
                        i5 = -1985493871;
                    } else {
                        iM3169 = C0773.m3169("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10035) ^ (-1113550437);
                        i5 = -680615471;
                    }
                    break;
                case -1509295994:
                case -1466154636:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24943)) ^ 1363286272;
                        i5 = 784865306;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܶ֡")) * 97;
                        i4 = ((iM3169 ^ i2) * (-31021)) ^ 1531954954;
                        i5 = 174551291;
                    }
                    break;
                case -973737212:
                case 798053990:
                    C2966.m9664();
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24943)) ^ 1363286272;
                        i5 = 784865306;
                    } else {
                        iM3169 = C0619.m2761("ܺ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11307) ^ (-159671546);
                        i5 = -2031233566;
                    }
                    break;
                case -964015718:
                case 1192129630:
                    try {
                        super.layoutChildren();
                        break;
                    } catch (Throwable unused) {
                    }
                    iM3169 = (i2 - C0773.m3169("ᩳ۠")) * 37;
                    i4 = ((iM3169 ^ i3) * 20533) ^ (-636753160);
                    i5 = 1272407471;
                    break;
                case -951553001:
                case -821256044:
                    C2878.m9491();
                    if (C11235.f35427 < 0) {
                        iM3169 = (C0773.m3169("ۡۜ") + i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-30467)) ^ 1709528063;
                        i5 = -1442892145;
                    } else {
                        iM3169 = C0619.m2761("ܺ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11307) ^ (-159671546);
                        i5 = -2031233566;
                    }
                    break;
                case -764407940:
                case 1719353064:
                    C1783.m6232();
                    if (C1080.f3865 < 0) {
                        iM3169 = (C0773.m3169("᩹ᩳ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-20983)) ^ (-585552493);
                        i5 = -236914770;
                    } else {
                        iM3169 = (C0773.m3169("ۡۜ") + i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-30467)) ^ 1709528063;
                        i5 = -1442892145;
                    }
                    break;
                case -761262790:
                case 24679353:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24943)) ^ 1363286272;
                        i5 = 784865306;
                    } else {
                        iM3169 = C0619.m2761("ܺۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11829)) ^ 1780328768;
                        i5 = 1321677682;
                    }
                    break;
                case -394928412:
                case 60812595:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ܺ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 11307) ^ (-159671546);
                        i5 = -2031233566;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩹") ^ i3) * 99;
                        i4 = ((iM3169 ^ i2) * 24183) ^ (-600828067);
                        i5 = -1554812872;
                    }
                    break;
                case -39408223:
                case 829903859:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ۘ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26137) ^ (-1588489981);
                        i5 = 912859061;
                    } else {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24943)) ^ 1363286272;
                        i5 = 784865306;
                    }
                    break;
                case 228939135:
                case 1582475899:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0773.m3169("᩹ᩳ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-20983)) ^ (-585552493);
                        i5 = -236914770;
                    } else {
                        iM3169 = C0773.m3169("᩺ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15609)) ^ 1657896388;
                        i5 = -1958160792;
                    }
                    break;
                case 1764823225:
                case 2023997862:
                    C3734.m12152();
                    break;
                default:
                    RunnableC3055.m9933();
                    C20932.m47848();
                    iM3169 = C0619.m2761("ܺ۫") ^ i3;
                    i4 = ((iM3169 ^ i2) * 11307) ^ (-159671546);
                    i5 = -2031233566;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45951() {
        this.f64225 = 0;
    }

    @Override // android.widget.AbsListView
    public final boolean isFastScrollEnabled() {
        return this.f64242;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45948(C8147 c8147) {
        int i = -583404426;
        int i2 = C1080.f3865;
        int i3 = C2310.f7472;
        int iM3169 = C0773.m3169("֫᩹") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-1849)) ^ 310162049;
        int i5 = 1470253124;
        while (true) {
            i = ((((i ^ i3) * 1923) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2014565515:
                case 1761797740:
                    C2310.m7813();
                    if (C0773.f2792 > 0) {
                        iM3169 = (C0773.m3169("֨ۤ") + i3) * 11;
                        i4 = ((iM3169 ^ i2) * 31973) ^ (-353785248);
                        i5 = -1858747404;
                    } else {
                        iM3169 = (C0619.m2761("ۨۧ") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * 14665) ^ 1971111250;
                        i5 = 239539881;
                    }
                    break;
                case -1933257598:
                case 649888410:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0773.m3169("֨ۤ") + i3) * 11;
                        i4 = ((iM3169 ^ i2) * 31973) ^ (-353785248);
                        i5 = -1858747404;
                    } else {
                        iM3169 = C0619.m2761("᩸᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17247) ^ 99691194;
                        i5 = -328779276;
                    }
                    break;
                case -1636186197:
                case -1461374313:
                    C1783.m6232();
                    C3690.m11987();
                    iM3169 = (C0619.m2761("ۨۧ") + i3) * 5;
                    i4 = ((iM3169 ^ i2) * 14665) ^ 1971111250;
                    i5 = 239539881;
                    break;
                case -1595261416:
                case -1524919661:
                    C2966.m9664();
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ۗܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25411)) ^ (-1427166941);
                        i5 = -2015564623;
                    } else {
                        iM3169 = (C0619.m2761("ۨۧ") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * 14665) ^ 1971111250;
                        i5 = 239539881;
                    }
                    break;
                case -1587015414:
                case -1307741039:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (C0773.m3169("ۨۙ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * (-5269)) ^ (-1110191483);
                        i5 = -1572445704;
                    } else {
                        iM3169 = C0773.m3169("ۨ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-4709)) ^ (-332133558);
                        i5 = -531696903;
                    }
                    break;
                case -1501304669:
                case 1360572326:
                    this.f64238 = c8147;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۨۙ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * (-5269)) ^ (-1110191483);
                        i5 = -1572445704;
                    } else {
                        iM3169 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23611) ^ (-1443432516);
                        i5 = -1347345412;
                    }
                    break;
                case -1415493230:
                case 2038436619:
                    this.f64227 = 8388613;
                    break;
                case -182134155:
                case 1766625242:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ۨۙ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * (-5269)) ^ (-1110191483);
                        i5 = -1572445704;
                    } else {
                        iM3169 = C0773.m3169("ܿ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11875) ^ 1928209779;
                        i5 = 2047779243;
                    }
                    break;
                case 170209621:
                case 360261688:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ۨۙ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * (-5269)) ^ (-1110191483);
                        i5 = -1572445704;
                    } else {
                        iM3169 = (C0619.m2761("ۤۚ") ^ i2) * (-123);
                        i4 = ((iM3169 ^ i3) * 15741) ^ 1321039254;
                        i5 = -995898960;
                    }
                    break;
                case 383382049:
                case 914105688:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۨۙ") + i2) * (-43);
                        i4 = ((iM3169 ^ i3) * (-5269)) ^ (-1110191483);
                        i5 = -1572445704;
                    } else {
                        iM3169 = C0619.m2761("᩸ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31469)) ^ 1113584440;
                        i5 = -2141944591;
                    }
                    break;
                case 549035793:
                case 1200957331:
                    C3492.m11488();
                    C3033.m9845();
                    break;
                case 550367684:
                case 1666899858:
                    if (C3998.m12920()) {
                        iM3169 = C0619.m2761("ܳۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-9315)) ^ 1908252846;
                        i5 = 588658472;
                    } else {
                        iM3169 = C0773.m3169("ۗܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25411)) ^ (-1427166941);
                        i5 = -2015564623;
                    }
                    break;
                case 618942611:
                case 1555718426:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ۛ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2811) ^ 1773150769;
                        i5 = 1159678821;
                    } else {
                        iM3169 = (C0619.m2761("ۨۧ") + i3) * 5;
                        i4 = ((iM3169 ^ i2) * 14665) ^ 1971111250;
                        i5 = 239539881;
                    }
                    break;
                case 1046347882:
                case 1529978085:
                    if (C2966.m9664()) {
                        iM3169 = C0619.m2761("ܶܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28101) ^ 2098699141;
                        i5 = -1664754977;
                    } else {
                        iM3169 = C0773.m3169("ۗܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25411)) ^ (-1427166941);
                        i5 = -2015564623;
                    }
                    break;
                case 1257715516:
                case 1647784654:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("֨ۤ") + i3) * 11;
                        i4 = ((iM3169 ^ i2) * 31973) ^ (-353785248);
                        i5 = -1858747404;
                    } else {
                        iM3169 = C0619.m2761("ۙۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10881) ^ (-1963854478);
                        i5 = -836786690;
                    }
                    break;
                default:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۛ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2811) ^ 1773150769;
                        i5 = 1159678821;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩸۬")) * 109;
                        i4 = ((iM3169 ^ i2) * 23625) ^ 1328977319;
                        i5 = 1387551507;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView
    public final void setFastScrollEnabled(boolean z) {
        this.f64242 = z;
    }

    @Override // android.widget.AdapterView
    public final void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        int i = -583360255;
        int i2 = C2702.f8586;
        int i3 = C2419.f7754;
        int iM2761 = C0619.m2761("֨᩺") ^ i3;
        int i4 = ((iM2761 ^ i2) * 2895) ^ (-2108279984);
        int i5 = -363571078;
        while (true) {
            i = ((((i ^ i2) * 5757) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2059751378:
                case 1646481442:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26385) ^ (-731470187);
                        i5 = -1738440847;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻ܺ")) * 79;
                        i4 = ((iM2761 ^ i2) * (-21263)) ^ 743499254;
                        i5 = -2085803872;
                    }
                    break;
                case -1746913930:
                case -877748342:
                    if (C2288.m7767()) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26385) ^ (-731470187);
                        i5 = -1738440847;
                    } else {
                        iM2761 = (C0773.m3169("᩷֡") ^ i3) * (-91);
                        i4 = ((iM2761 ^ i2) * (-32397)) ^ (-829486159);
                        i5 = 296337288;
                    }
                    break;
                case -1739062107:
                case 584774778:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۨ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2481)) ^ 300322836;
                        i5 = -1998807867;
                    } else {
                        iM2761 = (C0619.m2761("ۡ᩺") + i2) * 45;
                        i4 = ((iM2761 ^ i3) * 19865) ^ 1765787069;
                        i5 = -614284383;
                    }
                    break;
                case -1473716915:
                case 1875060232:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۗ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18131)) ^ 1237773167;
                        i5 = 1231973586;
                    } else {
                        iM2761 = C0619.m2761("᩻ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16173) ^ (-850071135);
                        i5 = 1756545887;
                    }
                    break;
                case -1100587804:
                case 1480263124:
                    if (C17202.f56030) {
                        iM2761 = (C0619.m2761("֫ۚ") + i3) * 13;
                        i4 = ((iM2761 ^ i2) * 25065) ^ 1141568735;
                        i5 = -1746184513;
                    } else {
                        iM2761 = C0773.m3169("ۗ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18131)) ^ 1237773167;
                        i5 = 1231973586;
                    }
                    break;
                case -1022047921:
                case 219473565:
                    C1542.m5459();
                    iM2761 = C0619.m2761("᩵᩸") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-29067)) ^ 140913696;
                    i5 = -1653625716;
                    break;
                case -944694545:
                case 16798106:
                    C0619.m2763();
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0773.m3169("ۨ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2481)) ^ 300322836;
                        i5 = -1998807867;
                    } else {
                        iM2761 = C0619.m2761("᩵᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29067)) ^ 140913696;
                        i5 = -1653625716;
                    }
                    break;
                case -804305993:
                case 852132654:
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0619.m2761("ܽ᩷") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 17465) ^ 2094836062;
                        i5 = -469910999;
                    } else {
                        iM2761 = C0619.m2761("᩵᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29067)) ^ 140913696;
                        i5 = -1653625716;
                    }
                    break;
                case -669708308:
                case 1176654390:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("᩻ܳ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-27015)) ^ (-1182735529);
                        i5 = 401133745;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2481)) ^ 300322836;
                        i5 = -1998807867;
                    }
                    break;
                case -224877605:
                case 1910952325:
                    super.setOnItemLongClickListener(null);
                    break;
                case -192484132:
                case 1172110989:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۗ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18131)) ^ 1237773167;
                        i5 = 1231973586;
                    } else {
                        iM2761 = C0773.m3169("᩷ܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29821) ^ (-25188999);
                        i5 = 1138386335;
                    }
                    break;
                case 11251165:
                case 1423698261:
                    C3077.m10041();
                    if (!C1783.m6232()) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26385) ^ (-731470187);
                        i5 = -1738440847;
                    } else {
                        iM2761 = (C0619.m2761("ܽ᩷") + i2) * 57;
                        i4 = ((iM2761 ^ i3) * 17465) ^ 2094836062;
                        i5 = -469910999;
                    }
                    break;
                case 275292541:
                case 970679299:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26385) ^ (-731470187);
                        i5 = -1738440847;
                    } else {
                        iM2761 = (C0619.m2761("ۙۗ") + i2) * (-97);
                        i4 = ((iM2761 ^ i3) * 4095) ^ (-1763014450);
                        i5 = 1437738122;
                    }
                    break;
                case 335707548:
                case 354100133:
                    C2702.m8876();
                    C3998.m12920();
                    break;
                case 361940142:
                case 1623858224:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("ۨ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-2481)) ^ 300322836;
                        i5 = -1998807867;
                    } else {
                        iM2761 = C0619.m2761("ۤۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16667)) ^ 218387089;
                        i5 = -1314096644;
                    }
                    break;
                case 1039154542:
                case 1358483657:
                    super.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ۜ᩶᩻
                        @Override // android.widget.AdapterView.OnItemLongClickListener
                        public final boolean onItemLongClick(AdapterView adapterView, View view, int i6, long j) {
                            return C19987.m45936(this.f24377, adapterView, view, i6, j);
                        }
                    });
                    break;
                case 1888211588:
                case 2046119930:
                    this.f64233 = onItemLongClickListener;
                    if (onItemLongClickListener == null) {
                        iM2761 = (C0619.m2761("᩵ܽ") + i3) * 81;
                        i4 = ((iM2761 ^ i2) * (-19731)) ^ (-347137080);
                        i5 = -596464823;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۟ܳ")) * (-43);
                        i4 = ((iM2761 ^ i3) * (-23341)) ^ (-1114145503);
                        i5 = -2055421727;
                    }
                    break;
                default:
                    if (C3690.m11987()) {
                        iM2761 = C0619.m2761("ۜۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26385) ^ (-731470187);
                        i5 = -1738440847;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۢ᩻")) * 93;
                        i4 = ((iM2761 ^ i3) * 21477) ^ 1847344225;
                        i5 = -241872493;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x081c A[PHI: r3 r5 r9 r11 r12 r13 r14 r16 r23 r37 r39 r40
      0x081c: PHI (r3v30 int) = (r3v23 int), (r3v24 int), (r3v31 int) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r5v4 float) = (r5v3 float), (r5v2 float), (r5v2 float) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r9v51 int) = (r9v44 int), (r9v45 int), (r9v52 int) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r11v40 int) = (r11v33 int), (r11v34 int), (r11v41 int) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r12v37 int) = (r12v28 int), (r12v29 int), (r12v38 int) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r13v32 boolean) = (r13v20 boolean), (r13v21 boolean), (r13v34 boolean) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r14v23 float) = (r14v13 float), (r14v14 float), (r14v24 float) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r16v22 int) = (r16v13 int), (r16v14 int), (r16v23 int) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r23v4 float) = (r23v3 float), (r23v2 float), (r23v2 float) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r37v28 int) = (r37v20 int), (r37v21 int), (r37v29 int) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r39v24 float) = (r39v17 float), (r39v18 float), (r39v25 float) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]
      0x081c: PHI (r40v20 l.᩸᩷ܺ) = (r40v13 l.᩸᩷ܺ), (r40v14 l.᩸᩷ܺ), (r40v21 l.᩸᩷ܺ) binds: [B:152:0x0805, B:144:0x07a2, B:121:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
    
        if (l.C1542.m5459() >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012e, code lost:
    
        r40 = r3;
        r39 = r9;
        r3 = r12;
        r9 = r13;
        r1 = r14;
        r42 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0152, code lost:
    
        if (l.C2375.f7641 > 0) goto L18;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r45) {
        /*
            Method dump skipped, instruction units count: 2552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19987.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iM2761;
        int i;
        int actionMasked = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        float x = 0.0f;
        float y = 0.0f;
        boolean zOnTouchEvent = false;
        int i3 = -710549813;
        int i4 = AbstractC0116.f1064;
        int i5 = C0950.f3488;
        int iM2762 = C0619.m2761("ܰܳ") ^ i4;
        int i6 = ((iM2762 ^ i5) * (-13)) ^ 2111808626;
        int i7 = 2002125816;
        while (true) {
            int i8 = iM2762 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 22383) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2094610919:
                    case -1389601333:
                        if (actionMasked != i2) {
                            iM2762 = C0773.m3169("۠ۢ") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-17779)) ^ 1309603668;
                            i7 = 8978948;
                            break;
                        }
                        iM2762 = (i4 - C0619.m2761("ۚ֨")) * (-27);
                        i6 = ((iM2762 ^ i5) * 29901) ^ 1128836956;
                        i7 = 1115359314;
                        break;
                    case -2079640243:
                    case -566038243:
                        if (!m45938(motionEvent)) {
                            iM2762 = (C0619.m2761("ۚܽ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((iM2762 ^ i5) * (-13275)) ^ (-362044684);
                            i7 = 1436308477;
                            break;
                        }
                        iM2762 = C0773.m3169("۠ۢ") ^ i5;
                        i6 = ((iM2762 ^ i4) * (-17779)) ^ 1309603668;
                        i7 = 8978948;
                        break;
                        break;
                    case -2020433646:
                    case 135722953:
                        this.f64229 = z2;
                        m45932(motionEvent);
                        return z2;
                    case -1987833224:
                    case -921952850:
                        if (actionMasked == z2) {
                            iM2762 = C0619.m2761("۫۫") ^ i4;
                            i6 = ((iM2762 ^ i5) * 6983) ^ (-1096901505);
                            i7 = -341474211;
                            break;
                        }
                        iM2762 = C0773.m3169("᩹ܽ") ^ i5;
                        i6 = ((iM2762 ^ i4) * 21929) ^ 36364881;
                        i7 = -679695083;
                        break;
                    case -1974561756:
                    case -1280824134:
                        C1542.m5459();
                        C1321.m4852();
                        return false;
                    case -1961446236:
                    case 1894378688:
                        x = motionEvent.getX();
                        y = motionEvent.getY();
                        if (C1783.f6087 > 0) {
                            iM2762 = C0773.m3169("ᩳ֨") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-12133)) ^ (-1088854817);
                            i7 = -1252700564;
                            break;
                        }
                        iM2762 = (C0619.m2761("ᩴۘ") ^ i4) * (-63);
                        i6 = ((iM2762 ^ i5) * (-25883)) ^ 960686682;
                        i7 = 1994745212;
                        break;
                    case -1819085287:
                    case 533368052:
                        if (this.f64229) {
                            iM2761 = (C0773.m3169("᩶ۖ") ^ i4) * 59;
                            i6 = ((iM2761 ^ i5) * 9469) ^ (-1914163568);
                            i = -2135174712;
                        } else {
                            iM2761 = (C0619.m2761("ۚ᩷") ^ i4) * (-25);
                            i6 = ((iM2761 ^ i5) * (-23049)) ^ (-937882588);
                            i = 968467763;
                        }
                        i8 = iM2761 ^ i;
                        i2 = 3;
                        break;
                    case -1810436417:
                    case -1060615867:
                        z = false;
                        z2 = true;
                        if (actionMasked != 0) {
                            iM2762 = C0773.m3169("ۤ᩹") ^ i5;
                            i6 = ((iM2762 ^ i4) * 14473) ^ 233646272;
                            i7 = 79269920;
                            break;
                        }
                        iM2762 = C0619.m2761("۫ۖ") ^ i5;
                        i6 = ((iM2762 ^ i4) * 27681) ^ 700254168;
                        i7 = 158447696;
                        break;
                    case -1753290080:
                    case -440944470:
                        C2966.m9664();
                        if (!RunnableC1848.f6235) {
                            iM2762 = (i5 - C0619.m2761("ܶۢ")) * q.h;
                            i6 = ((iM2762 ^ i4) * (-20827)) ^ 1087269030;
                            i7 = -742902896;
                            break;
                        }
                        iM2762 = C0773.m3169("ܽۗ") ^ i5;
                        i6 = ((iM2762 ^ i4) * (-4449)) ^ 46893601;
                        i7 = 765292873;
                        break;
                    case -1750972374:
                    case -1110929388:
                        return z2;
                    case -1638206665:
                    case 351732436:
                        m45944(motionEvent);
                        this.f64229 = z;
                        if (!m45940()) {
                            iM2762 = C0619.m2761("ܳۧ") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-23175)) ^ (-1959992282);
                            i7 = -179119508;
                            break;
                        }
                        iM2762 = C0773.m3169("ۜۖ") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-10177)) ^ 762225138;
                        i7 = 1962396166;
                        break;
                    case -1599488332:
                    case -123120531:
                        if (!this.f64239) {
                            iM2762 = C0619.m2761("ܳۧ") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-23175)) ^ (-1959992282);
                            i7 = -179119508;
                            break;
                            break;
                        }
                        iM2762 = (C0773.m3169("֫ۗ") + i5) * 69;
                        i6 = ((iM2762 ^ i4) * 4245) ^ (-247534814);
                        i7 = 930398176;
                        break;
                    case -1594054489:
                    case 1065188182:
                        if (actionMasked == z2) {
                            iM2762 = (i4 - C0619.m2761("ۚ֨")) * (-27);
                            i6 = ((iM2762 ^ i5) * 29901) ^ 1128836956;
                            i7 = 1115359314;
                            break;
                            break;
                        }
                        iM2762 = (C0773.m3169("᩻᩷") + i5) * (-25);
                        i6 = ((iM2762 ^ i4) * 5231) ^ (-1996295570);
                        i7 = -1085451359;
                        break;
                    case -1393111811:
                    case -987202519:
                        if (!RunnableC1848.f6235) {
                            iM2762 = C0773.m3169("ܺ֨") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-23761)) ^ (-155837512);
                            i7 = -1720540570;
                            break;
                        }
                        iM2762 = C0619.m2761("ܰۜ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 25797) ^ 305370457;
                        i7 = 1131362670;
                        break;
                    case -1262939366:
                    case 477094736:
                        if (C20932.f66974 > 0) {
                            iM2762 = (C0619.m2761("֨᩻") + i4) * (-127);
                            i6 = ((iM2762 ^ i5) * 8177) ^ (-532124902);
                            i7 = -167697894;
                            break;
                        }
                        iM2762 = C0773.m3169("ܽۨ") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-27221)) ^ (-642307666);
                        i7 = -995919256;
                        break;
                    case -1241694153:
                    case -666066238:
                        if (C0487.f2131 > 0) {
                            iM2762 = (C0773.m3169("ۛܰ") ^ i5) * (-79);
                            i6 = ((iM2762 ^ i4) * (-26317)) ^ 1575589022;
                            i7 = -1135125961;
                            break;
                        }
                        iM2762 = C0619.m2761("ܰۜ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 25797) ^ 305370457;
                        i7 = 1131362670;
                        break;
                        break;
                    case -1162477473:
                    case 304341992:
                        RunnableC1848.m6360();
                        iM2762 = (C0619.m2761("ᩴۘ") ^ i4) * (-63);
                        i6 = ((iM2762 ^ i5) * (-25883)) ^ 960686682;
                        i7 = 1994745212;
                        break;
                        break;
                    case -1061330785:
                    case -336608136:
                        if (C1826.m6301() < 0) {
                            iM2762 = C0773.m3169("ܽۗ") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-4449)) ^ 46893601;
                            i7 = 765292873;
                            break;
                            break;
                        }
                        iM2762 = (C0619.m2761("ᩴۘ") ^ i4) * (-63);
                        i6 = ((iM2762 ^ i5) * (-25883)) ^ 960686682;
                        i7 = 1994745212;
                        break;
                        break;
                    case -1037473792:
                    case 889367053:
                        this.f64229 = z;
                        return zOnTouchEvent;
                    case -971515140:
                    case 37560853:
                        C23916.m53419();
                        if (!C2878.f9462) {
                            iM2762 = (C0619.m2761("᩸۫") + i5) * 67;
                            i6 = ((iM2762 ^ i4) * (-20125)) ^ (-1776507468);
                            i7 = -2138926032;
                            break;
                        }
                        iM2762 = (C0619.m2761("ᩴۘ") ^ i4) * (-63);
                        i6 = ((iM2762 ^ i5) * (-25883)) ^ 960686682;
                        i7 = 1994745212;
                        break;
                        break;
                    case -930047223:
                    case -613885362:
                        zOnTouchEvent = onTouchEvent(motionEvent);
                        if (actionMasked == z2) {
                            iM2762 = (C0773.m3169("ܿܽ") ^ i5) * (-83);
                            i6 = ((iM2762 ^ i4) * 22125) ^ (-1093372941);
                            i7 = -907500409;
                            break;
                        }
                        iM2762 = (C0773.m3169("ܳۛ") + i4) * (-119);
                        i6 = ((iM2762 ^ i5) * (-11035)) ^ 1876694440;
                        i7 = 974226726;
                        break;
                    case -870839217:
                    case 450264241:
                        if (C0773.m3161() == 0) {
                            iM2762 = C0773.m3169("ۗܽ") ^ i4;
                            i6 = ((iM2762 ^ i5) * (-26297)) ^ 1410077615;
                            i7 = -1310497075;
                            break;
                        }
                        iM2762 = C0619.m2761("ܰۜ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 25797) ^ 305370457;
                        i7 = 1131362670;
                        break;
                        break;
                    case -760662796:
                    case 366314282:
                        this.f64229 = z;
                        return z2;
                    case -579284388:
                    case 629288777:
                        return zOnTouchEvent;
                    case -436971522:
                    case -116779217:
                        actionMasked = motionEvent.getActionMasked();
                        if (C1564.m5509() > 0) {
                            iM2762 = (C0619.m2761("᩸᩵") ^ i4) * (-105);
                            i6 = ((iM2762 ^ i5) * (-22159)) ^ (-725994831);
                            i7 = -607677208;
                            break;
                        }
                        iM2762 = C0619.m2761("ܰۜ") ^ i4;
                        i6 = ((iM2762 ^ i5) * 25797) ^ 305370457;
                        i7 = 1131362670;
                        break;
                        break;
                    case -272915327:
                    case 789853294:
                        m45944(motionEvent);
                        return z2;
                    case -239251202:
                    case 400307170:
                        if (!C1343.m4943()) {
                            iM2762 = (i5 - C0619.m2761("۟ۢ")) * (-25);
                            i6 = ((iM2762 ^ i4) * 20481) ^ (-839168406);
                            i7 = 1447859965;
                            break;
                        }
                        iM2762 = C0773.m3169("᩵ܺ") ^ i5;
                        i6 = ((iM2762 ^ i4) * (-24883)) ^ 1924959601;
                        i7 = -560766241;
                        break;
                    case -46379598:
                    case 836944263:
                        if (C2966.f9654 < 0) {
                            iM2762 = (i5 - C0773.m3169("᩵۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM2762 ^ i4) * 27121) ^ 1628626915;
                            i7 = 1331102258;
                            break;
                        }
                        iM2762 = (i5 - C0619.m2761("۟ۢ")) * (-25);
                        i6 = ((iM2762 ^ i4) * 20481) ^ (-839168406);
                        i7 = 1447859965;
                        break;
                        break;
                    case -4704981:
                    case 1788827682:
                        C3448.m11248();
                        if (C1564.f5401 <= 0) {
                            iM2762 = (C0773.m3169("ۡ᩷") + i4) * 59;
                            i6 = ((iM2762 ^ i5) * (-27961)) ^ (-1209514783);
                            i7 = -20340254;
                            break;
                        }
                        iM2762 = (C0619.m2761("ᩴۘ") ^ i4) * (-63);
                        i6 = ((iM2762 ^ i5) * (-25883)) ^ 960686682;
                        i7 = 1994745212;
                        break;
                        break;
                    case 227678372:
                    case 1689195299:
                        C1542.m5459();
                        if (!C3492.m11488()) {
                            iM2762 = C0773.m3169("ܽۨ") ^ i4;
                            i6 = ((iM2762 ^ i5) * (-27221)) ^ (-642307666);
                            i7 = -995919256;
                            break;
                            break;
                        }
                        iM2762 = C0773.m3169("ܽۗ") ^ i5;
                        i6 = ((iM2762 ^ i4) * (-4449)) ^ 46893601;
                        i7 = 765292873;
                        break;
                        break;
                    case 240767460:
                    case 1791450430:
                        if (C2702.f8586 > 0) {
                            iM2762 = (i4 - C0773.m3169("᩷ۢ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM2762 ^ i5) * (-7499)) ^ 694233379;
                            i7 = -92692204;
                            break;
                        }
                        iM2762 = C0773.m3169("᩶ۧ") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-31133)) ^ 2036147785;
                        i7 = -1822217171;
                        break;
                    case 297945261:
                    case 821251546:
                        if (C23916.m53419() == 0) {
                            iM2762 = (i5 - C0619.m2761("۟ۢ")) * (-25);
                            i6 = ((iM2762 ^ i4) * 20481) ^ (-839168406);
                            i7 = 1447859965;
                            break;
                            break;
                        }
                        iM2762 = (C0619.m2761("ᩴۘ") ^ i4) * (-63);
                        i6 = ((iM2762 ^ i5) * (-25883)) ^ 960686682;
                        i7 = 1994745212;
                        break;
                        break;
                    case 578675157:
                    case 1877359629:
                        if (!this.f64221.m51988(x, y)) {
                            iM2762 = C0619.m2761("ܳۧ") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-23175)) ^ (-1959992282);
                            i7 = -179119508;
                            break;
                            break;
                        }
                        iM2762 = (i5 - C0619.m2761("ܺۛ")) * 19;
                        i6 = ((iM2762 ^ i4) * 14239) ^ (-1525292125);
                        i7 = -429263988;
                        break;
                    case 746997974:
                    case 1237045142:
                        if (!C1783.m6232()) {
                            iM2762 = (i5 - C0619.m2761("۟ۢ")) * (-25);
                            i6 = ((iM2762 ^ i4) * 20481) ^ (-839168406);
                            i7 = 1447859965;
                            break;
                            break;
                        }
                        iM2762 = (C0773.m3169("ۙ֫") ^ i4) * 55;
                        i6 = ((iM2762 ^ i5) * (-18549)) ^ (-82375409);
                        i7 = -744813243;
                        break;
                    case 792500930:
                    case 1892307074:
                        if (actionMasked != i2) {
                            iM2762 = (C0619.m2761("ܺۨ") ^ i5) * (-117);
                            i6 = ((iM2762 ^ i4) * (-12649)) ^ (-1274560237);
                            i7 = -861448161;
                            break;
                        }
                        iM2762 = (C0773.m3169("ܿܽ") ^ i5) * (-83);
                        i6 = ((iM2762 ^ i4) * 22125) ^ (-1093372941);
                        i7 = -907500409;
                        break;
                        break;
                    case 1079247069:
                    case 1978614296:
                        if (actionMasked != i2) {
                            iM2762 = C0773.m3169("۠ۢ") ^ i5;
                            i6 = ((iM2762 ^ i4) * (-17779)) ^ 1309603668;
                            i7 = 8978948;
                            break;
                            break;
                        }
                        iM2762 = C0619.m2761("۫۫") ^ i4;
                        i6 = ((iM2762 ^ i5) * 6983) ^ (-1096901505);
                        i7 = -341474211;
                        break;
                        break;
                    case 1198596478:
                    case 1720143883:
                        C2287.m7745();
                        if (C0269.f1558 <= 0) {
                            iM2762 = C0773.m3169("᩶ۧ") ^ i4;
                            i6 = ((iM2762 ^ i5) * (-31133)) ^ 2036147785;
                            i7 = -1822217171;
                            break;
                            break;
                        }
                        iM2762 = C0773.m3169("ܽۗ") ^ i5;
                        i6 = ((iM2762 ^ i4) * (-4449)) ^ 46893601;
                        i7 = 765292873;
                        break;
                        break;
                    case 1649719574:
                    case 1652140628:
                        return super.dispatchTouchEvent(motionEvent);
                    case 1919358012:
                    case 1924597460:
                        if (!m45938(motionEvent)) {
                            iM2762 = C0619.m2761("֫ܽ") ^ i4;
                            i6 = ((iM2762 ^ i5) * (-15703)) ^ 822683893;
                            i7 = -863055801;
                            break;
                        }
                        iM2762 = C0619.m2761("۟ۖ") ^ i4;
                        i6 = ((iM2762 ^ i5) * (-27947)) ^ (-160630046);
                        i7 = -1528656180;
                        break;
                    default:
                        if (!RunnableC3646.f12471) {
                            iM2762 = (C0773.m3169("ۜ֨") + i4) * 51;
                            i6 = ((iM2762 ^ i5) * (-22491)) ^ (-1397664232);
                            i7 = -981190022;
                            break;
                        }
                        iM2762 = (i5 - C0619.m2761("۟ۢ")) * (-25);
                        i6 = ((iM2762 ^ i4) * 20481) ^ (-839168406);
                        i7 = 1447859965;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45932(MotionEvent motionEvent) {
        float x = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C8147 c8147 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = -1710916030;
        int i2 = C2288.f7433;
        int i3 = C3734.f12817;
        int iM2761 = (C0619.m2761("۬᩶") + i2) * (-57);
        int i4 = ((iM2761 ^ i3) * (-8197)) ^ 1575349227;
        int i5 = -837560866;
        while (true) {
            i = ((((i ^ i3) * 31975) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1952823610:
                case 600324823:
                    m45943(motionEvent);
                    z = false;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20821) ^ (-1810012495);
                        i5 = 347711490;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܰۤ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * 6851) ^ 256147760;
                        i5 = -1899705442;
                    }
                    break;
                case -1849803016:
                case 1051947927:
                    c8147.m22038(z2 ? 1 : 0, this.f64227);
                    iM2761 = (C0773.m3169("۬᩺") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM2761 ^ i2) * 6263) ^ 813921606;
                    i5 = 1604608294;
                    break;
                case -1805725582:
                case -1419745036:
                    if (!C2878.f9462) {
                        iM2761 = C0619.m2761("ۡۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10513)) ^ 1598930018;
                        i5 = 619804092;
                    } else {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20821) ^ (-1810012495);
                        i5 = 347711490;
                    }
                    break;
                case -1719203046:
                case 1589881794:
                    this.f64236 = f - f2;
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20821) ^ (-1810012495);
                        i5 = 347711490;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۖ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 12691) ^ (-284653085);
                        i5 = -270260861;
                    }
                    break;
                case -1704686178:
                case 1277517174:
                    getParent().requestDisallowInterceptTouchEvent(z2);
                    iM2761 = (i3 - C0619.m2761("ۡۗ")) * 77;
                    i4 = ((iM2761 ^ i2) * 17937) ^ 1866643979;
                    i5 = -133464476;
                    break;
                case -1672902354:
                case -427641273:
                    this.f64224 = motionEvent.getY();
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("۬᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3619)) ^ (-367890991);
                        i5 = -260967962;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۠ܿ")) * (-27);
                        i4 = ((iM2761 ^ i2) * (-6605)) ^ (-1594906756);
                        i5 = -859097532;
                    }
                    break;
                case -1601958101:
                case -941265305:
                    this.f64219 = C0950.m3789();
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0773.m3169("۬᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3619)) ^ (-367890991);
                        i5 = -260967962;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15123) ^ 1576107544;
                        i5 = -1283049720;
                    }
                    break;
                case -1505288335:
                case 2081309481:
                    f = this.f64221.f74853;
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20821) ^ (-1810012495);
                        i5 = 347711490;
                    } else {
                        iM2761 = C0619.m2761("۫ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20671)) ^ 727033506;
                        i5 = 1129080917;
                    }
                    break;
                case -1310628066:
                case 391661677:
                    C2310.m7813();
                    C4282.m13644();
                    break;
                case -546575090:
                case 555651669:
                    f2 = this.f64224;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۧᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17601)) ^ 928834353;
                        i5 = 1047549472;
                    } else {
                        iM2761 = C0619.m2761("۫ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 13753) ^ (-1528264497);
                        i5 = -69864980;
                    }
                    break;
                case -424759532:
                case 1992596693:
                    this.f64217 = x;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i2 - C0619.m2761("᩶۬")) * (-23);
                        i4 = ((iM2761 ^ i3) * 14833) ^ (-980394827);
                        i5 = 1388960376;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۜ") + i2) * (-99);
                        i4 = ((iM2761 ^ i3) * 3879) ^ (-179331384);
                        i5 = 1689420384;
                    }
                    break;
                case -354077417:
                case 647370414:
                    C0773.m3171(this);
                    if (getParent() != null) {
                        iM2761 = (C0619.m2761("۫ܽ") ^ i2) * 15;
                        i4 = ((iM2761 ^ i3) * 31361) ^ 1724143184;
                        i5 = -1896224393;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۡۗ")) * 77;
                        i4 = ((iM2761 ^ i2) * 17937) ^ 1866643979;
                        i5 = -133464476;
                    }
                    break;
                case 33161874:
                case 767591779:
                    break;
                case 241112938:
                case 1994962323:
                    C3099.m10095();
                    if (C0487.f2131 > 0) {
                        iM2761 = (i2 - C0619.m2761("᩶۬")) * (-23);
                        i4 = ((iM2761 ^ i3) * 14833) ^ (-980394827);
                        i5 = 1388960376;
                    } else {
                        iM2761 = C0619.m2761("ۡۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10513)) ^ 1598930018;
                        i5 = 619804092;
                    }
                    break;
                case 468320798:
                case 1700908630:
                    RunnableC3055.m9933();
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = C0619.m2761("ۧᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17601)) ^ 928834353;
                        i5 = 1047549472;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩶۬")) * (-23);
                        i4 = ((iM2761 ^ i3) * 14833) ^ (-980394827);
                        i5 = 1388960376;
                    }
                    break;
                case 648505426:
                case 1954477817:
                    x = motionEvent.getX();
                    if (C2702.m8876()) {
                        iM2761 = (C0773.m3169("ᩴ۠") + i3) * (-123);
                        i4 = ((iM2761 ^ i2) * (-4363)) ^ (-349657099);
                        i5 = 698073452;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩶۬")) * (-23);
                        i4 = ((iM2761 ^ i3) * 14833) ^ (-980394827);
                        i5 = 1388960376;
                    }
                    break;
                case 769439923:
                case 1676999404:
                    z2 = true;
                    z2 = true;
                    this.f64243 = true;
                    c8147 = this.f64238;
                    if (c8147 != null) {
                        iM2761 = C0773.m3169("֨᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8067) ^ 665864397;
                        i5 = -202583945;
                    } else {
                        iM2761 = (C0773.m3169("۬᩺") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * 6263) ^ 813921606;
                        i5 = 1604608294;
                    }
                    break;
                case 916027423:
                case 1642580387:
                    this.f64222 = z;
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20821) ^ (-1810012495);
                        i5 = 347711490;
                    } else {
                        iM2761 = C0773.m3169("֡ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24909) ^ (-842633264);
                        i5 = -152796678;
                    }
                    break;
                case 1337014484:
                case 2015433223:
                    C0950.m3785();
                    iM2761 = C0619.m2761("ۡۜ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-10513)) ^ 1598930018;
                    i5 = 619804092;
                    break;
                default:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("۬᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3619)) ^ (-367890991);
                        i5 = -260967962;
                    } else {
                        iM2761 = C0773.m3169("۫ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29443)) ^ 241344951;
                        i5 = 371985420;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m45940() {
        C23073 c23073 = null;
        float f = 0.0f;
        int count = 0;
        int iM13651 = 0;
        float f2 = 0.0f;
        int iM45946 = 0;
        float f3 = 0.0f;
        int i = 1991314456;
        int i2 = C1542.f5343;
        int i3 = C3734.f12817;
        int iM3169 = C0773.m3169("᩶ᩳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 16015) ^ 1949838433;
        int i5 = -1574021249;
        while (true) {
            i = ((((i ^ i2) * 5267) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1990377925:
                case -1040068210:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۨۚ")) * (-19);
                        i4 = ((iM3169 ^ i3) * (-28905)) ^ 123711243;
                        i5 = -477599394;
                    } else {
                        iM3169 = (C0773.m3169("᩹᩶") + i3) * 43;
                        i4 = ((iM3169 ^ i2) * (-26547)) ^ (-132300413);
                        i5 = 1948180610;
                    }
                    break;
                case -1952226404:
                case 77732299:
                    if (C2287.f7432 < 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29491)) ^ (-704182933);
                        i5 = -1476522037;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֡ۙ")) * 63;
                        i4 = ((iM3169 ^ i2) * (-19469)) ^ (-1589798591);
                        i5 = 871532076;
                    }
                    break;
                case -1939964606:
                case 926799739:
                    if (this.f64242) {
                        iM3169 = (C0773.m3169("۠ܽ") ^ i3) * (-17);
                        i4 = ((iM3169 ^ i2) * 8723) ^ (-255954602);
                        i5 = -454851383;
                    } else {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    }
                    break;
                case -1874593366:
                case 1903429266:
                    if (this.f64243) {
                        iM3169 = (C0619.m2761("۫᩵") ^ i2) * 53;
                        i4 = ((iM3169 ^ i3) * 22757) ^ 566945986;
                        i5 = -1512848563;
                    } else {
                        iM3169 = (C0773.m3169("ۙۚ") + i3) * (-89);
                        i4 = ((iM3169 ^ i2) * 18855) ^ 1034868896;
                        i5 = -1760941978;
                    }
                    break;
                case -1660634893:
                case 565102619:
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2065) ^ (-615553412);
                        i5 = -1733239481;
                    } else {
                        iM3169 = (C0619.m2761("ۘۗ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 1463) ^ 1282201418;
                        i5 = 244097505;
                    }
                    break;
                case -1460714494:
                case 2074115288:
                    if (C11235.m28309() == 0) {
                        iM3169 = C0619.m2761("ۧ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 319) ^ (-924475205);
                        i5 = 1459784185;
                    } else {
                        iM3169 = (C0619.m2761("ۘۗ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 1463) ^ 1282201418;
                        i5 = 244097505;
                    }
                    break;
                case -1427822268:
                case 110173535:
                    return false;
                case -1267671053:
                case 391415179:
                    if (f2 / f3 <= 3.5f) {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    } else {
                        iM3169 = (C0619.m2761("۫᩵") ^ i2) * 53;
                        i4 = ((iM3169 ^ i3) * 22757) ^ 566945986;
                        i5 = -1512848563;
                    }
                    break;
                case -1143874736:
                case -210322426:
                    f2 = count;
                    iM45946 = m45946();
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ᩴ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * 16099) ^ 1017675813;
                        i5 = -375062335;
                    } else {
                        iM3169 = C0773.m3169("ܰۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 28429) ^ 1213175172;
                        i5 = 1911945179;
                    }
                    break;
                case -837757347:
                case 1138845380:
                    if (!this.f64222) {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    } else {
                        iM3169 = C0619.m2761("֡ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26143) ^ 1154521147;
                        i5 = -1400243439;
                    }
                    break;
                case -824216719:
                case 223646063:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29491)) ^ (-704182933);
                        i5 = -1476522037;
                    } else {
                        iM3169 = (C0619.m2761("ܿۧ") + i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-27389)) ^ 918876639;
                        i5 = -416381181;
                    }
                    break;
                case -774756764:
                case 1071587106:
                    C20932.m47848();
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0619.m2761("ۘۗ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * 1463) ^ 1282201418;
                        i5 = 244097505;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۨۚ")) * (-19);
                        i4 = ((iM3169 ^ i3) * (-28905)) ^ 123711243;
                        i5 = -477599394;
                    }
                    break;
                case -460298830:
                case 1361842828:
                    if (this.f64243) {
                        iM3169 = C0619.m2761("֡ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26143) ^ 1154521147;
                        i5 = -1400243439;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۫") ^ i3) * (-95);
                        i4 = ((iM3169 ^ i2) * (-24433)) ^ (-753108733);
                        i5 = 1628906423;
                    }
                    break;
                case -458035278:
                case 1119427192:
                    if (count - iM13651 > 0) {
                        iM3169 = C0773.m3169("᩷ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17309)) ^ 188676481;
                        i5 = -462949491;
                    } else {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    }
                    break;
                case -429470954:
                case 949277254:
                    f3 = iM45946;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * 16099) ^ 1017675813;
                        i5 = -375062335;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤ᩹")) * 63;
                        i4 = ((iM3169 ^ i2) * 25405) ^ (-1545759032);
                        i5 = -1179430953;
                    }
                    break;
                case -427526822:
                case 1045545346:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۧ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * 319) ^ (-924475205);
                        i5 = 1459784185;
                    } else {
                        iM3169 = C0619.m2761("ᩳ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 20089) ^ (-292329735);
                        i5 = -307880566;
                    }
                    break;
                case -291703731:
                case -3152299:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (i3 - C0773.m3169("֡ۙ")) * 63;
                        i4 = ((iM3169 ^ i2) * (-19469)) ^ (-1589798591);
                        i5 = 871532076;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۨۚ")) * (-19);
                        i4 = ((iM3169 ^ i3) * (-28905)) ^ 123711243;
                        i5 = -477599394;
                    }
                    break;
                case -147347807:
                case 814046286:
                    if (c23073.f74850 > c23073.f74853) {
                        iM3169 = (i3 - C0619.m2761("᩺ۧ")) * 73;
                        i4 = ((iM3169 ^ i2) * (-5589)) ^ 428749661;
                        i5 = -1895258072;
                    } else {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    }
                    break;
                case -49464811:
                case 70320275:
                    c23073 = this.f64221;
                    f = c23073.f74855;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29491)) ^ (-704182933);
                        i5 = -1476522037;
                    } else {
                        iM3169 = (C0773.m3169("ۤᩳ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i3) * 12763) ^ (-910332485);
                        i5 = -612656707;
                    }
                    break;
                case 234208538:
                case 1850166252:
                    C1080.m4050();
                    return false;
                case 265700932:
                case 1669018073:
                    count = getCount();
                    iM13651 = C4282.m13651(this);
                    if (iM13651 > 0) {
                        iM3169 = (i2 - C0773.m3169("۠ۚ")) * (-95);
                        i4 = ((iM3169 ^ i3) * 13293) ^ 207858213;
                        i5 = -2018358518;
                    } else {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    }
                    break;
                case 350809014:
                case 1456113599:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2065) ^ (-615553412);
                        i5 = -1733239481;
                    } else {
                        iM3169 = C0773.m3169("ۘܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 14423) ^ 318232206;
                        i5 = -2017564616;
                    }
                    break;
                case 465553792:
                case 573785199:
                    if (f > c23073.f74854) {
                        iM3169 = (i2 - C0773.m3169("᩸ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i3) * (-2823)) ^ (-2142909517);
                        i5 = 658582987;
                    } else {
                        iM3169 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ (-1838122174);
                        i5 = -477884694;
                    }
                    break;
                case 509852090:
                case 1686806663:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("᩵ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2065) ^ (-615553412);
                        i5 = -1733239481;
                    } else {
                        iM3169 = C0773.m3169("ۜۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5363) ^ (-1414292296);
                        i5 = 515077797;
                    }
                    break;
                case 529973378:
                case 1807113311:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ᩴ᩸") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * 16099) ^ 1017675813;
                        i5 = -375062335;
                    } else {
                        iM3169 = C0773.m3169("᩻֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2603) ^ 1058345272;
                        i5 = -2114248823;
                    }
                    break;
                case 966393179:
                case 2073743162:
                    return true;
                case 1019958303:
                case 1313317689:
                    C2834.m9344();
                    C1542.m5459();
                    iM3169 = (i2 - C0619.m2761("ۨۚ")) * (-19);
                    i4 = ((iM3169 ^ i3) * (-28905)) ^ 123711243;
                    i5 = -477599394;
                    break;
                case 1584582453:
                case 2122310256:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i3 - C0773.m3169("֡ۙ")) * 63;
                        i4 = ((iM3169 ^ i2) * (-19469)) ^ (-1589798591);
                        i5 = 871532076;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۗۙ")) * (-79);
                        i4 = ((iM3169 ^ i3) * (-1829)) ^ (-2032359140);
                        i5 = 816800373;
                    }
                    break;
                case 1759999863:
                case 2025188011:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29491)) ^ (-704182933);
                        i5 = -1476522037;
                    } else {
                        iM3169 = C0773.m3169("ۜܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9989) ^ (-1673880406);
                        i5 = 1800560535;
                    }
                    break;
                default:
                    if (this.f64241) {
                        iM3169 = C0619.m2761("֡ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26143) ^ 1154521147;
                        i5 = -1400243439;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۗ") ^ i2) * 119;
                        i4 = ((iM3169 ^ i3) * (-31987)) ^ (-1156088693);
                        i5 = -107836862;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45943(MotionEvent motionEvent) {
        boolean z = false;
        int iM13651 = 0;
        int i = 0;
        MotionEvent motionEventObtain = null;
        int actionIndex = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 2064587792;
        int i6 = C3690.f12684;
        int i7 = C3779.f12953;
        int iM2761 = C0619.m2761("ܺۢ") ^ i6;
        int i8 = ((iM2761 ^ i7) * (-26959)) ^ 623608345;
        int i9 = 671743993;
        while (true) {
            i5 = ((((i5 ^ i7) * 25331) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2053580151:
                case -841208830:
                    if (i < iM13651) {
                        iM2761 = C0773.m3169("᩶۟") ^ i7;
                        i8 = ((iM2761 ^ i6) * 6371) ^ 2101790202;
                        i9 = -578666320;
                    } else {
                        iM2761 = (C0619.m2761("ۢ᩶") ^ i7) * (-61);
                        i8 = ((iM2761 ^ i6) * 14105) ^ 887323862;
                        i9 = 565323766;
                    }
                    break;
                case -1999616917:
                case -555136824:
                    i++;
                    iM2761 = (C0773.m3169("ۧܿ") + i7) * (-63);
                    i8 = ((iM2761 ^ i6) * 28315) ^ 1158087793;
                    i9 = 244823788;
                    break;
                case -1994131960:
                case -630693779:
                    motionEventObtain.setAction(i3 | i4);
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ۨ֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12317) ^ (-1861250397);
                        i9 = 845453095;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩸") + i6) * 57;
                        i8 = ((iM2761 ^ i7) * (-1467)) ^ (-188723531);
                        i9 = 2145220883;
                    }
                    break;
                case -1717297604:
                case 376119645:
                    z = false;
                    if (C3448.m11248() != 0) {
                        iM2761 = (C0773.m3169("ۤۜ") ^ i7) * (-117);
                        i8 = ((iM2761 ^ i6) * (-7211)) ^ 1424803621;
                        i9 = 1693644925;
                    } else {
                        iM2761 = C0773.m3169("ܰۨ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 4647) ^ 1107626076;
                        i9 = -909854094;
                    }
                    break;
                case -1715868889:
                case 979301440:
                    C3779.m12264();
                    if (!RunnableC1848.m6360()) {
                        iM2761 = C0619.m2761("ۨ֫") ^ i7;
                        i8 = ((iM2761 ^ i6) * 12317) ^ (-1861250397);
                        i9 = 845453095;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 8525) ^ (-1672055456);
                        i9 = 10034592;
                    }
                    break;
                case -1669562956:
                case -147382614:
                    setPressed(z);
                    iM13651 = C4282.m13651(this);
                    i = 0;
                    iM2761 = (C0773.m3169("ۧܿ") + i7) * (-63);
                    i8 = ((iM2761 ^ i6) * 28315) ^ 1158087793;
                    i9 = 244823788;
                    break;
                case -1613741361:
                case 1956254555:
                    cancelLongPress();
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ۤۜ") ^ i7) * (-117);
                        i8 = ((iM2761 ^ i6) * (-7211)) ^ 1424803621;
                        i9 = 1693644925;
                    } else {
                        iM2761 = (i6 - C0619.m2761("᩸᩺")) * 65;
                        i8 = ((iM2761 ^ i7) * (-6935)) ^ 565705801;
                        i9 = 1665701858;
                    }
                    break;
                case -1484268533:
                case 431655797:
                    C0773.m3161();
                    if (C3779.f12953 > 0) {
                        iM2761 = (i7 - C0773.m3169("֡᩵")) * 65;
                        i8 = ((iM2761 ^ i6) * 24741) ^ 600940666;
                        i9 = 973621634;
                    } else {
                        iM2761 = (C0773.m3169("ۤۜ") ^ i7) * (-117);
                        i8 = ((iM2761 ^ i6) * (-7211)) ^ 1424803621;
                        i9 = 1693644925;
                    }
                    break;
                case -1250694848:
                case 1467245648:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۤۜ") ^ i7) * (-117);
                        i8 = ((iM2761 ^ i6) * (-7211)) ^ 1424803621;
                        i9 = 1693644925;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 8525) ^ (-1672055456);
                        i9 = 10034592;
                    }
                    break;
                case -1056456661:
                case 825426942:
                    i2 = 8;
                    if (C2288.m7767()) {
                        iM2761 = C0619.m2761("ۘ᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 8525) ^ (-1672055456);
                        i9 = 10034592;
                    } else {
                        iM2761 = (C0619.m2761("۬ܳ") ^ i7) * (-15);
                        i8 = ((iM2761 ^ i6) * 961) ^ 1810073714;
                        i9 = 1736365804;
                    }
                    break;
                case -812377307:
                case 182833792:
                    if (RunnableC3646.f12471) {
                        iM2761 = (i7 - C0773.m3169("֡᩵")) * 65;
                        i8 = ((iM2761 ^ i6) * 24741) ^ 600940666;
                        i9 = 973621634;
                    } else {
                        iM2761 = (C0619.m2761("ۡۙ") + i7) * 47;
                        i8 = ((iM2761 ^ i6) * (-8249)) ^ (-2119549622);
                        i9 = -675620343;
                    }
                    break;
                case -698858800:
                case 925780944:
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionIndex = motionEvent.getActionIndex();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۤۜ") ^ i7) * (-117);
                        i8 = ((iM2761 ^ i6) * (-7211)) ^ 1424803621;
                        i9 = 1693644925;
                    } else {
                        iM2761 = C0773.m3169("֡ܽ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 10835) ^ (-1304099573);
                        i9 = 264304418;
                    }
                    break;
                case -696740401:
                case 735475565:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("ۘ᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 8525) ^ (-1672055456);
                        i9 = 10034592;
                    } else {
                        iM2761 = (C0773.m3169("ۡ֫") ^ i6) * (-39);
                        i8 = ((iM2761 ^ i7) * (-30773)) ^ 2058672225;
                        i9 = -1485351201;
                    }
                    break;
                case -199679313:
                case 234129096:
                    C4282.m13654(this, i).setPressed(z);
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i7 - C0773.m3169("֡᩵")) * 65;
                        i8 = ((iM2761 ^ i6) * 24741) ^ 600940666;
                        i9 = 973621634;
                    } else {
                        iM2761 = C0619.m2761("۬۫") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-1495)) ^ 1872400690;
                        i9 = -1239164812;
                    }
                    break;
                case -143727859:
                case 525677374:
                    i3 = actionIndex << i2;
                    i4 = 3;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("ܳ۫") ^ i6) * 19;
                        i8 = ((iM2761 ^ i7) * 32351) ^ (-1319717604);
                        i9 = -1246763363;
                    } else {
                        iM2761 = (C0619.m2761("ۤ֨") ^ i6) * 123;
                        i8 = ((iM2761 ^ i7) * 23817) ^ 47434287;
                        i9 = -1238828732;
                    }
                    break;
                case 385505393:
                case 1239527222:
                    if (C3998.m12920()) {
                        iM2761 = (C0773.m3169("ᩳۡ") ^ i7) * (-57);
                        i8 = ((iM2761 ^ i6) * 18737) ^ 1047504522;
                        i9 = 1780361223;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩻") ^ i6;
                        i8 = ((iM2761 ^ i7) * 8525) ^ (-1672055456);
                        i9 = 10034592;
                    }
                    break;
                case 469505490:
                case 1360171152:
                    C3998.m12920();
                    break;
                case 1047179875:
                case 1416764338:
                    C1321.m4852();
                    iM2761 = C0619.m2761("ۨ֫") ^ i7;
                    i8 = ((iM2761 ^ i6) * 12317) ^ (-1861250397);
                    i9 = 845453095;
                    break;
                default:
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        boolean zShowContextMenuForChild = false;
        int i = -228336692;
        int i2 = C3448.f11240;
        int i3 = C1519.f5300;
        int iM2761 = (C0619.m2761("֡ۧ") + i3) * 109;
        int i4 = ((iM2761 ^ i2) * 20017) ^ (-2019056341);
        int i5 = 1992627705;
        while (true) {
            i = ((((i ^ i2) * 21635) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2102145199:
                case -262401251:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12623) ^ 902172136;
                        i5 = 1736992399;
                    } else {
                        iM2761 = C0773.m3169("ܽ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11783)) ^ 302863137;
                        i5 = 1361697119;
                    }
                    break;
                case -1967168216:
                case -1052816872:
                    if (C1826.m6301() >= 0) {
                        iM2761 = (i2 - C0619.m2761("ۤܶ")) * (-57);
                        i4 = ((iM2761 ^ i3) * (-6805)) ^ (-991866018);
                        i5 = -1996198413;
                    } else {
                        iM2761 = C0773.m3169("᩹ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30379)) ^ 1549181360;
                        i5 = 319806049;
                    }
                    break;
                case -1533462054:
                case 187190452:
                    zShowContextMenuForChild = super.showContextMenuForChild(view, f, f2);
                    if (zShowContextMenuForChild) {
                        iM2761 = C0773.m3169("ۖ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3265)) ^ 743747845;
                        i5 = 548397252;
                    } else {
                        iM2761 = C0619.m2761("ᩴᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-20139)) ^ 648511345;
                        i5 = 463388061;
                    }
                    break;
                case -1358409672:
                case 570163813:
                    if (C3077.m10041()) {
                        iM2761 = C0619.m2761("۟ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29149)) ^ (-1601938467);
                        i5 = -1743502890;
                    } else {
                        iM2761 = C0773.m3169("ܺ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22417)) ^ (-1721031505);
                        i5 = -1504909786;
                    }
                    break;
                case -1348480582:
                case 173008717:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31303)) ^ 97906003;
                        i5 = 408854973;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܿ֨")) * (-109);
                        i4 = ((iM2761 ^ i2) * 11207) ^ (-910673326);
                        i5 = 1944558488;
                    }
                    break;
                case -1336053119:
                case -385919955:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31303)) ^ 97906003;
                        i5 = 408854973;
                    } else {
                        iM2761 = C0773.m3169("ۜ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12341)) ^ (-1646250846);
                        i5 = 1195456282;
                    }
                    break;
                case -1184857097:
                case -595623159:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("᩶ۧ") ^ i3) * (-111);
                        i4 = ((iM2761 ^ i2) * (-8007)) ^ (-1239332360);
                        i5 = 2023831814;
                    } else {
                        iM2761 = C0619.m2761("᩷ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14003) ^ (-824829276);
                        i5 = 931331923;
                    }
                    break;
                case -1172047530:
                case -79340104:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12623) ^ 902172136;
                        i5 = 1736992399;
                    } else {
                        iM2761 = (C0619.m2761("᩻ܳ") ^ i3) * (-109);
                        i4 = ((iM2761 ^ i2) * (-21201)) ^ (-878872703);
                        i5 = 656515192;
                    }
                    break;
                case -991730723:
                case -878984974:
                    return zShowContextMenuForChild;
                case -953975075:
                case 2048748440:
                    C2485.m8357();
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12623) ^ 902172136;
                        i5 = 1736992399;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۧ") ^ i3) * (-111);
                        i4 = ((iM2761 ^ i2) * (-8007)) ^ (-1239332360);
                        i5 = 2023831814;
                    }
                    break;
                case -924405245:
                case 627073038:
                    this.f64239 = true;
                    this.f64222 = false;
                    iM2761 = C0619.m2761("ᩴᩳ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-20139)) ^ 648511345;
                    i5 = 463388061;
                    break;
                case -826129345:
                case 1404698864:
                    AbstractC0116.m1243();
                    C3690.m11987();
                    return false;
                case -813216386:
                case 1103456584:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31303)) ^ 97906003;
                        i5 = 408854973;
                    } else {
                        iM2761 = C0773.m3169("ۙܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15621) ^ (-805586095);
                        i5 = 1205253739;
                    }
                    break;
                case 922529444:
                case 1609937592:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("۟ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29149)) ^ (-1601938467);
                        i5 = -1743502890;
                    } else {
                        iM2761 = C0619.m2761("ۧᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28557) ^ (-384675500);
                        i5 = 1438713210;
                    }
                    break;
                case 1140324376:
                case 1612967400:
                    C20932.m47848();
                    C0862.m3503();
                    iM2761 = (i2 - C0619.m2761("ۤܶ")) * (-57);
                    i4 = ((iM2761 ^ i3) * (-6805)) ^ (-991866018);
                    i5 = -1996198413;
                    break;
                case 1197791141:
                case 1198131764:
                    if (!C3077.f9998) {
                        iM2761 = (i2 - C0619.m2761("ۤܶ")) * (-57);
                        i4 = ((iM2761 ^ i3) * (-6805)) ^ (-991866018);
                        i5 = -1996198413;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۧ") ^ i3) * (-111);
                        i4 = ((iM2761 ^ i2) * (-8007)) ^ (-1239332360);
                        i5 = 2023831814;
                    }
                    break;
                case 1308991741:
                case 1748584590:
                    if (C3492.m11488()) {
                        iM2761 = (i3 - C0619.m2761("᩷ᩴ")) * (-27);
                        i4 = ((iM2761 ^ i2) * 12595) ^ 1463174226;
                        i5 = 801469410;
                    } else {
                        iM2761 = C0619.m2761("᩵ۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12623) ^ 902172136;
                        i5 = 1736992399;
                    }
                    break;
                default:
                    if (C1343.f4799 == 0) {
                        iM2761 = C0619.m2761("۟ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29149)) ^ (-1601938467);
                        i5 = -1743502890;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۤܶ")) * (-57);
                        i4 = ((iM2761 ^ i3) * (-6805)) ^ (-991866018);
                        i5 = -1996198413;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        boolean zShowContextMenuForChild = false;
        int i = 1263797515;
        int i2 = C2287.f7432;
        int i3 = C3033.f9831;
        int iM2761 = C0619.m2761("ܰۢ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 31053) ^ (-749944022);
        int i5 = -1474074250;
        while (true) {
            i = ((((i ^ i3) * (-17267)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2131802905:
                case -2019865176:
                    this.f64222 = false;
                    iM2761 = (C0773.m3169("ܺۨ") + i2) * 33;
                    i4 = ((iM2761 ^ i3) * 28435) ^ (-1258413511);
                    i5 = 1999374448;
                    break;
                case -1939139239:
                case 346491758:
                    zShowContextMenuForChild = super.showContextMenuForChild(view);
                    if (zShowContextMenuForChild) {
                        iM2761 = (i2 - C0619.m2761("ᩴۙ")) * 5;
                        i4 = ((iM2761 ^ i3) * 31281) ^ 736650471;
                        i5 = -278991498;
                    } else {
                        iM2761 = (C0773.m3169("ܺۨ") + i2) * 33;
                        i4 = ((iM2761 ^ i3) * 28435) ^ (-1258413511);
                        i5 = 1999374448;
                    }
                    break;
                case -1860608257:
                case 1391043641:
                    if (C2834.m9344() >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۖ᩺")) * 63;
                        i4 = ((iM2761 ^ i2) * 9597) ^ 459711540;
                        i5 = 1948761055;
                    }
                    break;
                case -1845735608:
                case 1570393816:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ۡᩳ") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * 19943) ^ (-777153209);
                        i5 = -428873982;
                    } else {
                        iM2761 = (C0773.m3169("ۧܶ") ^ i3) * 13;
                        i4 = ((iM2761 ^ i2) * (-12417)) ^ (-293387808);
                        i5 = -1149897760;
                    }
                    break;
                case -1790107871:
                case 794818553:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    } else {
                        iM2761 = (C0619.m2761("ۡۛ") + i2) * (-51);
                        i4 = ((iM2761 ^ i3) * (-24743)) ^ (-767451653);
                        i5 = 1799130031;
                    }
                    break;
                case -1459274853:
                case 1866138306:
                    this.f64239 = true;
                    if (C0487.m2356() >= 0) {
                        iM2761 = (i3 - C0619.m2761("᩺ܿ")) * (-41);
                        i4 = ((iM2761 ^ i2) * (-8897)) ^ 978867904;
                        i5 = -2146781086;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܰۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i2) * (-4565)) ^ 1609576338;
                        i5 = 1482494134;
                    }
                    break;
                case -1260741521:
                case -284004715:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۖ᩺")) * 63;
                        i4 = ((iM2761 ^ i2) * 9597) ^ 459711540;
                        i5 = 1948761055;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩺") + i2) * (-105);
                        i4 = ((iM2761 ^ i3) * (-10097)) ^ (-1936777751);
                        i5 = -468581739;
                    }
                    break;
                case -1227907538:
                case -575766874:
                    C2878.m9491();
                    if (C3492.f12043 > 0) {
                        iM2761 = (i3 - C0619.m2761("ۖ᩺")) * 63;
                        i4 = ((iM2761 ^ i2) * 9597) ^ 459711540;
                        i5 = 1948761055;
                    } else {
                        iM2761 = C0773.m3169("ᩴ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-465)) ^ 589637946;
                        i5 = -1917816371;
                    }
                    break;
                case -986376082:
                case 456906714:
                    if (C2023.f6737) {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    } else {
                        iM2761 = C0619.m2761("ۤۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13555) ^ 908336838;
                        i5 = 13537608;
                    }
                    break;
                case -578825243:
                case 228892995:
                    C0950.m3785();
                    iM2761 = (i3 - C0619.m2761("ۖ᩺")) * 63;
                    i4 = ((iM2761 ^ i2) * 9597) ^ 459711540;
                    i5 = 1948761055;
                    break;
                case -476342313:
                case 373841649:
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0773.m3169("ۡᩳ") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * 19943) ^ (-777153209);
                        i5 = -428873982;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    }
                    break;
                case -415452623:
                case 631739042:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۖ᩺")) * 63;
                        i4 = ((iM2761 ^ i2) * 9597) ^ 459711540;
                        i5 = 1948761055;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28963)) ^ (-1354779583);
                        i5 = -604755951;
                    }
                    break;
                case -200987737:
                case 295581145:
                    return zShowContextMenuForChild;
                case -82113479:
                case 1129432349:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۡᩳ") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * 19943) ^ (-777153209);
                        i5 = -428873982;
                    } else {
                        iM2761 = (C0773.m3169("֡ܽ") + i3) * 45;
                        i4 = ((iM2761 ^ i2) * (-18931)) ^ (-1573387761);
                        i5 = -320393600;
                    }
                    break;
                case 136517674:
                case 1541623055:
                    if (C2023.f6737) {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩶۫")) * 37;
                        i4 = ((iM2761 ^ i2) * (-14029)) ^ 853352599;
                        i5 = -1090612345;
                    }
                    break;
                case 270737576:
                case 1666337398:
                    if (C1826.m6301() >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    } else {
                        iM2761 = C0619.m2761("ۗۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21373) ^ 1247171128;
                        i5 = 148917119;
                    }
                    break;
                case 1616048694:
                case 1926604773:
                    C3690.m11987();
                    C2966.m9664();
                    return false;
                default:
                    if (C3099.m10095()) {
                        iM2761 = (i3 - C0773.m3169("ۨ᩶")) * 123;
                        i4 = ((iM2761 ^ i2) * 10391) ^ 1183228211;
                        i5 = -2002907046;
                    } else {
                        iM2761 = C0773.m3169("ܳ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23507)) ^ 571328715;
                        i5 = -1018780996;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r35) {
        /*
            Method dump skipped, instruction units count: 2554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19987.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45947(View.OnTouchListener onTouchListener) {
        ArrayList arrayList = null;
        int i = -1261196990;
        int i2 = C2287.f7432;
        int i3 = C1321.f4751;
        int iM3169 = C0773.m3169("ۛܺ") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-17661)) ^ 1139317735;
        int i5 = 929929599;
        while (true) {
            i = ((((i ^ i3) * 1543) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1965461219:
                case -710016325:
                    super.setOnTouchListener(new View.OnTouchListener() { // from class: l.۬᩶᩻
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return C19987.m45935(this.f44621, view, motionEvent);
                        }
                    });
                    iM3169 = C0619.m2761("᩻᩸") ^ i2;
                    i4 = ((iM3169 ^ i3) * 23867) ^ (-451506488);
                    i5 = 1272313723;
                    break;
                case -1774773082:
                case 919790430:
                    if (this.f64234 == null) {
                        iM3169 = (C0619.m2761("ۚۚ") + i3) * 67;
                        i4 = ((iM3169 ^ i2) * (-8931)) ^ 1727881019;
                        i5 = 1009832935;
                    } else {
                        iM3169 = C0619.m2761("᩻᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23867) ^ (-451506488);
                        i5 = 1272313723;
                    }
                    break;
                case -1736995303:
                case 1647055409:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ܺۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21905) ^ 1933737036;
                        i5 = -2117138411;
                    } else {
                        iM3169 = (C0619.m2761("ܳ֫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * (-5349)) ^ 302761460;
                        i5 = 1257932670;
                    }
                    break;
                case -1536506551:
                case 1920701457:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("᩵ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3651) ^ 1059942098;
                        i5 = 409152284;
                    } else {
                        iM3169 = C0773.m3169("᩹᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19483)) ^ (-99098247);
                        i5 = -1874234566;
                    }
                    break;
                case -1524586723:
                case 612225165:
                    C1826.m6301();
                    C3099.m10095();
                    break;
                case -1509225194:
                case 718743093:
                    arrayList = new ArrayList();
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0619.m2761("ܳ֫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * (-5349)) ^ 302761460;
                        i5 = 1257932670;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۨ۟")) * (-115);
                        i4 = ((iM3169 ^ i2) * (-30077)) ^ (-532281994);
                        i5 = 1741497684;
                    }
                    break;
                case -1242821315:
                case 1217432781:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("᩵ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3651) ^ 1059942098;
                        i5 = 409152284;
                    } else {
                        iM3169 = C0619.m2761("᩵ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7625)) ^ 114847167;
                        i5 = 1504883936;
                    }
                    break;
                case -1216684855:
                case 1248315465:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0773.m3169("᩹ۡ") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-32289)) ^ 1691149323;
                        i5 = -413105811;
                    } else {
                        iM3169 = (C0773.m3169("۬֫") ^ i3) * 97;
                        i4 = ((iM3169 ^ i2) * 6077) ^ (-891257238);
                        i5 = 639445811;
                    }
                    break;
                case -876534225:
                case -306577614:
                    RunnableC0334.m2054(this.f64234, onTouchListener);
                    break;
                case -848632815:
                case 455021561:
                    RunnableC0334.m2063();
                    C3734.m12152();
                    iM3169 = (C0619.m2761("۠᩶") + i3) * (-77);
                    i4 = ((iM3169 ^ i2) * 21151) ^ 1004964806;
                    i5 = 1184633086;
                    break;
                case -758664524:
                case 1923646326:
                    if (C17202.m40372()) {
                        iM3169 = C0619.m2761("ۖۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31395)) ^ 103435952;
                        i5 = -768019450;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۡ") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-32289)) ^ 1691149323;
                        i5 = -413105811;
                    }
                    break;
                case -678364127:
                case 1316748256:
                    this.f64234 = arrayList;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("᩹ۡ") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * (-32289)) ^ 1691149323;
                        i5 = -413105811;
                    } else {
                        iM3169 = (C0619.m2761("ܶۚ") + i2) * 93;
                        i4 = ((iM3169 ^ i3) * (-30785)) ^ 107176248;
                        i5 = 1564875042;
                    }
                    break;
                case -569248112:
                case 660025728:
                    C1146.m4231();
                    if (!C3077.m10041()) {
                        iM3169 = (C0619.m2761("ܳ֫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * (-5349)) ^ 302761460;
                        i5 = 1257932670;
                    } else {
                        iM3169 = (C0619.m2761("۠᩶") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 21151) ^ 1004964806;
                        i5 = 1184633086;
                    }
                    break;
                case -417409695:
                case -199294735:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ܳ֫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * (-5349)) ^ 302761460;
                        i5 = 1257932670;
                    } else {
                        iM3169 = C0773.m3169("ۤ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8077) ^ 11059009;
                        i5 = -735017168;
                    }
                    break;
                case -14069624:
                case 673698272:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0619.m2761("۠᩶") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 21151) ^ 1004964806;
                        i5 = 1184633086;
                    } else {
                        iM3169 = C0619.m2761("۬ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19051)) ^ 1306621892;
                        i5 = 1728681502;
                    }
                    break;
                case 964958199:
                case 1871377860:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ᩴ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-28455)) ^ (-1732508800);
                        i5 = -930849722;
                    } else {
                        iM3169 = (C0619.m2761("۠᩶") + i3) * (-77);
                        i4 = ((iM3169 ^ i2) * 21151) ^ 1004964806;
                        i5 = 1184633086;
                    }
                    break;
                case 1378857181:
                case 1449154381:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ܳ֫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * (-5349)) ^ 302761460;
                        i5 = 1257932670;
                    } else {
                        iM3169 = (C0619.m2761("۟۟") + i2) * (-9);
                        i4 = ((iM3169 ^ i3) * (-16153)) ^ 1270755380;
                        i5 = -615943290;
                    }
                    break;
                default:
                    if (!C1321.m4852()) {
                        iM3169 = C0773.m3169("᩵ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3651) ^ 1059942098;
                        i5 = 409152284;
                    } else {
                        iM3169 = C0773.m3169("ܺۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21905) ^ 1933737036;
                        i5 = -2117138411;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AbsListView
    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f64230 = onScrollListener;
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f64232 = onTouchListener;
    }
}
