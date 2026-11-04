package l;

import android.R;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plugin.api.preference.PluginPreference;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7113 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡᩵᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f23439 = {6142, 8090, 3006, -4540, 7360, 9264, 2193, -14478, 23127, 23128, 23122, 23108, 23129, 23135, 23122, 23064, 23135, 23128, 23106, 23123, 23128, 23106, 23064, 23127, 23125, 23106, 23135, 23129, 23128, 23064, 23136, 23167, 23155, 23137, 5267, 1468, 1415, 1422, 1437, 1418, 1419, 1487, 1439, 1437, 1418, 1417, 1418, 1437, 1418, 1409, 1420, 1418, 1487, 1412, 1418, 1430, 1493, 1487};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10667 f23440;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f23441;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC14921 f23442;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1255 f23443;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f23444;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m19453(ViewOnClickListenerC7113 viewOnClickListenerC7113, C18365 c18365, AbstractC14921 abstractC14921, String str) {
        int i = 1811222561;
        int i2 = C2354.f7599;
        int i3 = C3734.f12817;
        int iM3169 = C0773.m3169("᩵ۛ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 11617) ^ (-1671861955);
        int i5 = -1639387255;
        while (true) {
            i = ((((i ^ i2) * (-21351)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1973619977:
                case -364639551:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("֫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19837)) ^ 737166291;
                        i5 = -1575131235;
                    } else {
                        iM3169 = (C0619.m2761("ܶۘ") + i3) * 21;
                        i4 = ((iM3169 ^ i2) * (-31695)) ^ 214544029;
                        i5 = 1465332599;
                    }
                    break;
                case -1670703529:
                case 847108244:
                    if (!C0862.m3503()) {
                        iM3169 = (C0619.m2761("ܺۘ") + i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-27819)) ^ (-2051009876);
                        i5 = -840850357;
                    } else {
                        iM3169 = (C0619.m2761("ۢܺ") + i2) * (-55);
                        i4 = ((iM3169 ^ i3) * (-32351)) ^ (-1889647891);
                        i5 = -1544861836;
                    }
                    break;
                case -1508343936:
                case 1489357340:
                    C2288.m7767();
                    C23916.m53419();
                    iM3169 = (C0773.m3169("ۚ۫") ^ i3) * 81;
                    i4 = ((iM3169 ^ i2) * 12751) ^ 1905878302;
                    i5 = 1819471174;
                    break;
                case -1487415483:
                case 678491873:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ܺۘ") + i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-27819)) ^ (-2051009876);
                        i5 = -840850357;
                    } else {
                        iM3169 = C0619.m2761("ܿۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 18929) ^ 878171153;
                        i5 = -1231061494;
                    }
                    break;
                case -1274768580:
                case -341853237:
                    viewOnClickListenerC7113.m19454(c18365, abstractC14921, str);
                    break;
                case -1137729792:
                case -1085302319:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ۚ۫") ^ i3) * 81;
                        i4 = ((iM3169 ^ i2) * 12751) ^ 1905878302;
                        i5 = 1819471174;
                    } else {
                        iM3169 = C0619.m2761("۬᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25331) ^ (-798417986);
                        i5 = 1128142071;
                    }
                    break;
                case -1083084872:
                case 1180959534:
                    C2023.m6964();
                    C3492.m11488();
                    break;
                case -783187682:
                case 1444596432:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ۢܺ") + i2) * (-55);
                        i4 = ((iM3169 ^ i3) * (-32351)) ^ (-1889647891);
                        i5 = -1544861836;
                    } else {
                        iM3169 = C0619.m2761("ܽۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24683)) ^ (-1384443531);
                        i5 = 692041348;
                    }
                    break;
                case -701617341:
                case 410655953:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ۧ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23287) ^ 1457418812;
                        i5 = -1705808262;
                    } else {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24609)) ^ (-1820687954);
                        i5 = 610771010;
                    }
                    break;
                case -482040892:
                case 190519862:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ۢܺ") + i2) * (-55);
                        i4 = ((iM3169 ^ i3) * (-32351)) ^ (-1889647891);
                        i5 = -1544861836;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26129)) ^ (-835366493);
                        i5 = -1896261222;
                    }
                    break;
                case -200237665:
                case 171162419:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("֫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19837)) ^ 737166291;
                        i5 = -1575131235;
                    } else {
                        iM3169 = (C0619.m2761("ۢܺ") + i2) * (-55);
                        i4 = ((iM3169 ^ i3) * (-32351)) ^ (-1889647891);
                        i5 = -1544861836;
                    }
                    break;
                case 1920235:
                case 596596680:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ۚ۫") ^ i3) * 81;
                        i4 = ((iM3169 ^ i2) * 12751) ^ 1905878302;
                        i5 = 1819471174;
                    } else {
                        iM3169 = C0773.m3169("ۖۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29625)) ^ (-728696449);
                        i5 = 2049235351;
                    }
                    break;
                case 71569136:
                case 698466843:
                    if (C13473.f42873 == 0) {
                        iM3169 = (C0619.m2761("ۢܺ") + i2) * (-55);
                        i4 = ((iM3169 ^ i3) * (-32351)) ^ (-1889647891);
                        i5 = -1544861836;
                    } else {
                        iM3169 = (C0773.m3169("ۚ۫") ^ i3) * 81;
                        i4 = ((iM3169 ^ i2) * 12751) ^ 1905878302;
                        i5 = 1819471174;
                    }
                    break;
                case 407173474:
                case 846140248:
                    if (C17202.m40372()) {
                        iM3169 = (C0773.m3169("۫ۚ") ^ i2) * 17;
                        i4 = ((iM3169 ^ i3) * (-22655)) ^ 629893816;
                        i5 = -1066080225;
                    } else {
                        iM3169 = C0619.m2761("֫ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19837)) ^ 737166291;
                        i5 = -1575131235;
                    }
                    break;
                case 513384473:
                case 1026017436:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۧ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23287) ^ 1457418812;
                        i5 = -1705808262;
                    } else {
                        iM3169 = (C0619.m2761("ۜۤ") ^ i3) * (-43);
                        i4 = ((iM3169 ^ i2) * (-29031)) ^ (-844396439);
                        i5 = -566458844;
                    }
                    break;
                default:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۚ۫") ^ i3) * 81;
                        i4 = ((iM3169 ^ i2) * 12751) ^ 1905878302;
                        i5 = 1819471174;
                    } else {
                        iM3169 = C0773.m3169("ۢܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13523)) ^ (-1798082402);
                        i5 = -2010895249;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 48041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19455(l.AbstractC14921 r56) {
        /*
            Method dump skipped, instruction units count: 4804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7113.m19455(l.ܰ᩺֫):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC7113(ActivityC10667 activityC10667, View view) {
        super(view);
        View viewM11246 = null;
        TextView textView = null;
        View viewM11247 = null;
        int i = 0;
        String strM2820 = null;
        int iM2761 = 0;
        short[] sArr = null;
        int i2 = 0;
        int i3 = 777728291;
        int i4 = C3690.f12684;
        int i5 = C3734.f12817;
        short s = f23439[0];
        int i6 = s + 3843;
        int i7 = (s * s) + 14768649;
        int i8 = (i7 + i7) - (i6 * i6) >= 0 ? 29008 : 8132;
        this.f23440 = activityC10667;
        int iM2762 = C0619.m2761("ۢۖ") ^ i5;
        int i9 = ((iM2762 ^ i4) * (-11123)) ^ 901138156;
        int i10 = -1458448051;
        while (true) {
            i3 = ((((i3 ^ i4) * (-16113)) >> 31) & i9) ^ (iM2762 ^ i10);
            switch (i3) {
                case -2135833895:
                case -1112009846:
                    iM2761 = C0619.m2761(strM2820);
                    if (C1080.f3865 >= 0) {
                        iM2762 = (C0773.m3169("ۚ۠") ^ i4) * 9;
                        i9 = ((iM2762 ^ i5) * (-10909)) ^ 1702240211;
                        i10 = 176338822;
                    } else {
                        iM2762 = (C0619.m2761("ܺ۟") + i5) * (-115);
                        i9 = ((iM2762 ^ i4) * (-4783)) ^ (-1316951720);
                        i10 = -43760626;
                    }
                    break;
                case -2128366850:
                case 1096910982:
                    this.f23441 = textView;
                    if (C0862.f3233 != 0) {
                        iM2762 = C0619.m2761("ۛᩳ") ^ i5;
                        i9 = ((iM2762 ^ i4) * 22811) ^ (-1981317045);
                        i10 = -2037677174;
                    } else {
                        iM2762 = (C0619.m2761("ۡۡ") + i5) * (-25);
                        i9 = ((iM2762 ^ i4) * (-8323)) ^ (-2084706586);
                        i10 = 135917528;
                    }
                    break;
                case -1870663515:
                case 1006750656:
                    viewM11246 = C3448.m11246(view, R.id.title);
                    if (AbstractC3624.f12429 <= 0) {
                        iM2762 = (C0773.m3169("ۚ۠") ^ i4) * 9;
                        i9 = ((iM2762 ^ i5) * (-10909)) ^ 1702240211;
                        i10 = 176338822;
                    } else {
                        iM2762 = (C0773.m3169("ᩴۘ") + i5) * 67;
                        i9 = ((iM2762 ^ i4) * (-1363)) ^ 1768092497;
                        i10 = -534078663;
                    }
                    break;
                case -1813237779:
                case -1730964811:
                    i2 = 1;
                    if (C1826.f6190 <= 0) {
                        iM2762 = (C0619.m2761("۟ۜ") ^ i5) * 37;
                        i9 = ((iM2762 ^ i4) * 29887) ^ (-1564714528);
                        i10 = 1824032255;
                    } else {
                        iM2762 = C0773.m3169("ܳۡ") ^ i5;
                        i9 = ((iM2762 ^ i4) * 17721) ^ 1822334321;
                        i10 = 36228041;
                    }
                    break;
                case -1757879426:
                case 1787821520:
                    strM2820 = AbstractC0641.m2820(sArr, i2, 3, i8);
                    if (AbstractC3624.f12429 <= 0) {
                        iM2762 = (C0619.m2761("۟ۜ") ^ i5) * 37;
                        i9 = ((iM2762 ^ i4) * 29887) ^ (-1564714528);
                        i10 = 1824032255;
                    } else {
                        iM2762 = C0773.m3169("֡ܰ") ^ i4;
                        i9 = ((iM2762 ^ i5) * (-24145)) ^ 279641593;
                        i10 = -2092177595;
                    }
                    break;
                case -1211919109:
                case 328967115:
                    if (C2287.f7432 < 0) {
                        iM2762 = (C0773.m3169("ۚ۠") ^ i4) * 9;
                        i9 = ((iM2762 ^ i5) * (-10909)) ^ 1702240211;
                        i10 = 176338822;
                    } else {
                        iM2762 = (C0773.m3169("ܺ᩹") ^ i5) * (-13);
                        i9 = ((iM2762 ^ i4) * (-11835)) ^ 2100810123;
                        i10 = 14286172;
                    }
                    break;
                case -1194750464:
                case -118000759:
                    C2966.m9664();
                    iM2762 = (C0773.m3169("ܺ᩹") ^ i5) * (-13);
                    i9 = ((iM2762 ^ i4) * (-11835)) ^ 2100810123;
                    i10 = 14286172;
                    break;
                case -947534482:
                case 1007869136:
                    RunnableC1848.m6360();
                    if (C11235.f35427 >= 0) {
                        iM2762 = (i4 - C0619.m2761("ܳۙ")) * (-47);
                        i9 = ((iM2762 ^ i5) * 30591) ^ 2098326580;
                        i10 = -917982086;
                    } else {
                        iM2762 = (C0773.m3169("ܺ᩹") ^ i5) * (-13);
                        i9 = ((iM2762 ^ i4) * (-11835)) ^ 2100810123;
                        i10 = 14286172;
                    }
                    break;
                case -468443346:
                case 1729841940:
                    textView = (TextView) viewM11246;
                    if (C1783.f6087 <= 0) {
                        iM2762 = (i4 - C0619.m2761("ܳۙ")) * (-47);
                        i9 = ((iM2762 ^ i5) * 30591) ^ 2098326580;
                        i10 = -917982086;
                    } else {
                        iM2762 = C0619.m2761("ܽۜ") ^ i4;
                        i9 = ((iM2762 ^ i5) * (-9839)) ^ 1989237310;
                        i10 = -1076882271;
                    }
                    break;
                case -403991925:
                case 1828094855:
                    C3998.m12920();
                    if (AbstractC3624.f12429 > 0) {
                        iM2762 = C0619.m2761("ۛᩳ") ^ i5;
                        i9 = ((iM2762 ^ i4) * 22811) ^ (-1981317045);
                        i10 = -2037677174;
                    } else {
                        iM2762 = (i4 - C0619.m2761("ܳۙ")) * (-47);
                        i9 = ((iM2762 ^ i5) * 30591) ^ 2098326580;
                        i10 = -917982086;
                    }
                    break;
                case -194040312:
                case 262336022:
                    i = 2124768216 ^ iM2761;
                    if (C0487.f2131 <= 0) {
                        iM2762 = C0619.m2761("ۛᩳ") ^ i5;
                        i9 = ((iM2762 ^ i4) * 22811) ^ (-1981317045);
                        i10 = -2037677174;
                    } else {
                        iM2762 = (C0619.m2761("ܰ۠") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM2762 ^ i5) * 24181) ^ (-975562816);
                        i10 = 948654632;
                    }
                    break;
                case -112527405:
                case 1620325733:
                    sArr = f23439;
                    if (C2354.m7983()) {
                        iM2762 = (i4 - C0773.m3169("۟᩹")) * (-53);
                        i9 = ((iM2762 ^ i5) * (-6811)) ^ 387402559;
                        i10 = 1862703575;
                    } else {
                        iM2762 = (C0773.m3169("ۚ۠") ^ i4) * 9;
                        i9 = ((iM2762 ^ i5) * (-10909)) ^ 1702240211;
                        i10 = 176338822;
                    }
                    break;
                case -101899080:
                case 232131525:
                    this.f23443 = (C1255) C2834.m9333(view, i);
                    C2375.m8070(view, this);
                    return;
                case 1712623487:
                case 1861528750:
                    C0269.m1775();
                    C2310.m7813();
                    throw new RuntimeException();
                case 1858095746:
                case 2036317975:
                    viewM11247 = C3448.m11246(view, R.id.summary);
                    if (C2023.f6737) {
                        iM2762 = (C0773.m3169("ܺ᩹") ^ i5) * (-13);
                        i9 = ((iM2762 ^ i4) * (-11835)) ^ 2100810123;
                        i10 = 14286172;
                    } else {
                        iM2762 = (C0773.m3169("֫֡") + i4) * 45;
                        i9 = ((iM2762 ^ i5) * (-19679)) ^ 1007536811;
                        i10 = -1004153657;
                    }
                    break;
                default:
                    this.f23444 = (TextView) viewM11247;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2762 = (C0773.m3169("ۚ۠") ^ i4) * 9;
                        i9 = ((iM2762 ^ i5) * (-10909)) ^ 1702240211;
                        i10 = 176338822;
                    } else {
                        iM2762 = (C0619.m2761("۫ۗ") + i5) * 59;
                        i9 = ((iM2762 ^ i4) * (-32293)) ^ (-1910387445);
                        i10 = 998674498;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19452(ViewOnClickListenerC7113 viewOnClickListenerC7113, List list, String str, C21635 c21635, C18365 c18365, DialogInterface dialogInterface, int i) {
        C18651 c18651 = null;
        String str2 = null;
        CharSequence charSequence = null;
        int i2 = -1809826680;
        int i3 = C2375.f7641;
        int i4 = C2966.f9654;
        int iM3169 = C0773.m3169("ܳۛ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 24895) ^ 1328512143;
        int i6 = 360833041;
        while (true) {
            i2 = ((((i2 ^ i4) * 14369) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2000135760:
                case 871879122:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("ۧ᩹") + i3) * 99;
                        i5 = ((iM3169 ^ i4) * 8027) ^ (-809877414);
                        i6 = -870620751;
                    } else {
                        iM3169 = (C0773.m3169("۫֫") ^ i4) * 73;
                        i5 = ((iM3169 ^ i3) * (-19773)) ^ (-487170343);
                        i6 = -1123850163;
                    }
                    break;
                case -1855019577:
                case 431874416:
                    C13473.m33144();
                    iM3169 = C0773.m3169("ܶ᩵") ^ i4;
                    i5 = ((iM3169 ^ i3) * 31301) ^ (-319986564);
                    i6 = -2140243774;
                    break;
                case -1671856190:
                case -791287096:
                    charSequence = c21635.f48740;
                    iM3169 = (C0773.m3169("᩻۟") + i3) * (-105);
                    i5 = ((iM3169 ^ i4) * (-1723)) ^ 1379256811;
                    i6 = 613484455;
                    break;
                case -1540364432:
                case -28568870:
                    if (C3779.m12264()) {
                        iM3169 = (C0773.m3169("ۜܽ") + i3) * (-123);
                        i5 = ((iM3169 ^ i4) * 22185) ^ 2116040651;
                        i6 = -346893040;
                    } else {
                        iM3169 = C0619.m2761("ۢۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26337) ^ 337354388;
                        i6 = -67668136;
                    }
                    break;
                case -1454937425:
                case -1064886635:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * 31301) ^ (-319986564);
                        i6 = -2140243774;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩸ܶ")) * 45;
                        i5 = ((iM3169 ^ i3) * 15627) ^ (-922184760);
                        i6 = 2005444230;
                    }
                    break;
                case -1338574891:
                case 642594447:
                    break;
                case -1247111819:
                case 1707931517:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۢۡ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26337) ^ 337354388;
                        i6 = -67668136;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۨܺ")) * 75;
                        i5 = ((iM3169 ^ i3) * (-2709)) ^ (-1617061295);
                        i6 = -429797115;
                    }
                    break;
                case -1157686245:
                case 493962494:
                    C1564.m5509();
                    C1783.m6232();
                    break;
                case -1071235534:
                case -1063257195:
                    if (C3779.m12264()) {
                        iM3169 = C0619.m2761("ܰۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-19145)) ^ (-2139693027);
                        i6 = -1160527966;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩹") + i3) * 99;
                        i5 = ((iM3169 ^ i4) * 8027) ^ (-809877414);
                        i6 = -870620751;
                    }
                    break;
                case -1019852767:
                case 1633653344:
                    if (C0950.m3785() != 0) {
                        iM3169 = (C0619.m2761("ۡ֨") ^ i4) * (-47);
                        i5 = ((iM3169 ^ i3) * (-4733)) ^ (-305106716);
                        i6 = 2065494932;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i4) * 8355) ^ 1250023309;
                        i6 = 799333272;
                    }
                    break;
                case -547140384:
                case 667721670:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("ۧ᩹") + i3) * 99;
                        i5 = ((iM3169 ^ i4) * 8027) ^ (-809877414);
                        i6 = -870620751;
                    } else {
                        iM3169 = (C0773.m3169("᩸ۢ") ^ i4) * 35;
                        i5 = ((iM3169 ^ i3) * (-3805)) ^ (-1005345939);
                        i6 = 603979581;
                    }
                    break;
                case -478957611:
                case 1726508708:
                    C2287.m7745();
                    if (!C2354.m7983()) {
                        iM3169 = (C0619.m2761("ۡ֨") ^ i4) * (-47);
                        i5 = ((iM3169 ^ i3) * (-4733)) ^ (-305106716);
                        i6 = 2065494932;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩹") + i3) * 99;
                        i5 = ((iM3169 ^ i4) * 8027) ^ (-809877414);
                        i6 = -870620751;
                    }
                    break;
                case -376642457:
                case 470615847:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * 31301) ^ (-319986564);
                        i6 = -2140243774;
                    } else {
                        iM3169 = (i3 - C0773.m3169("۫ۜ")) * (-33);
                        i5 = ((iM3169 ^ i4) * (-28071)) ^ (-246558519);
                        i6 = 1262781608;
                    }
                    break;
                case -294664162:
                case 1155904441:
                    dialogInterface.dismiss();
                    c18651 = (C18651) C1542.m5473(list, i);
                    str2 = c18651.f60655;
                    if (C18450.m42987(str, str2)) {
                        iM3169 = C0619.m2761("᩸ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-1517)) ^ 1553403163;
                        i6 = -991209267;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ᩴۤ")) * 73;
                        i5 = ((iM3169 ^ i3) * (-10125)) ^ 1923661571;
                        i6 = -638153107;
                    }
                    break;
                case 241840941:
                case 1493773862:
                    if (C1343.m4943()) {
                        iM3169 = (C0773.m3169("ۨۛ") + i3) * 63;
                        i5 = ((iM3169 ^ i4) * 16081) ^ 619983165;
                        i6 = 41678593;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * 31301) ^ (-319986564);
                        i6 = -2140243774;
                    }
                    break;
                case 349509702:
                case 1647746451:
                    viewOnClickListenerC7113.f23440.f33851.edit().putString(c21635.f48737, str2).apply();
                    CharSequence charSequence2 = c18651.f60653;
                    if (charSequence2 == null) {
                        iM3169 = (C0619.m2761("ۤ᩶") ^ i4) * 51;
                        i5 = ((iM3169 ^ i3) * 4645) ^ (-1890166136);
                        i6 = -1646112149;
                    } else {
                        charSequence = charSequence2;
                        iM3169 = (C0773.m3169("᩻۟") + i3) * (-105);
                        i5 = ((iM3169 ^ i4) * (-1723)) ^ 1379256811;
                        i6 = 613484455;
                    }
                    break;
                case 737186140:
                case 2113978031:
                    C2354.m7978(viewOnClickListenerC7113.f23444, charSequence);
                    viewOnClickListenerC7113.m19454(c18365, viewOnClickListenerC7113.f23442, str2);
                    iM3169 = C0619.m2761("᩸ۙ") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-1517)) ^ 1553403163;
                    i6 = -991209267;
                    break;
                case 819638467:
                case 1549122544:
                    C3448.m11248();
                    if (C1343.f4799 == 0) {
                        iM3169 = (C0773.m3169("ۜᩳ") ^ i3) * (-9);
                        i5 = ((iM3169 ^ i4) * 5623) ^ (-1706637664);
                        i6 = -40875950;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * 31301) ^ (-319986564);
                        i6 = -2140243774;
                    }
                    break;
                case 854671849:
                case 1893534198:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ۜᩳ") ^ i3) * (-9);
                        i5 = ((iM3169 ^ i4) * 5623) ^ (-1706637664);
                        i6 = -40875950;
                    } else {
                        iM3169 = C0773.m3169("۠ۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-25519)) ^ (-1940819964);
                        i6 = -1049306374;
                    }
                    break;
                default:
                    C1080.m4050();
                    if (C3099.f10023 > 0) {
                        iM3169 = (C0619.m2761("ۡ֨") ^ i4) * (-47);
                        i5 = ((iM3169 ^ i3) * (-4733)) ^ (-305106716);
                        i6 = 2065494932;
                    } else {
                        iM3169 = (C0773.m3169("ۜᩳ") ^ i3) * (-9);
                        i5 = ((iM3169 ^ i4) * 5623) ^ (-1706637664);
                        i6 = -40875950;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 72061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r61) {
        /*
            Method dump skipped, instruction units count: 7206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7113.onClick(android.view.View):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19454(C18365 c18365, AbstractC14921 abstractC14921, Object obj) {
        ActivityC10667 activityC10667 = null;
        Object obj2 = null;
        Throwable th = null;
        int i = -199273193;
        int i2 = C1783.f6087;
        int i3 = C2375.f7641;
        int iM3169 = C0773.m3169("᩶ۛ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-20571)) ^ (-1717459204);
        int i5 = -12243467;
        while (true) {
            i = ((((i ^ i2) * 23311) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2132140491:
                case -192770751:
                    activityC10667.f33852.log(th);
                    RunnableC3055.m9930(activityC10667, th, null);
                    iM3169 = (i3 - C0619.m2761("ܶܽ")) * 27;
                    i4 = ((iM3169 ^ i2) * 9571) ^ 869785287;
                    i5 = -529018098;
                    break;
                case -2031589945:
                case -1952939351:
                    if (C3998.m12920()) {
                        iM3169 = C0619.m2761("۫᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30467) ^ 1223132780;
                        i5 = -2128964446;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֫᩺")) * 17;
                        i4 = ((iM3169 ^ i3) * 29723) ^ 577286147;
                        i5 = 1708606149;
                    }
                    break;
                case -2025277730:
                case 549613077:
                    obj2 = abstractC14921.f48741;
                    iM3169 = C0773.m3169("۫ۚ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-23019)) ^ 277050820;
                    i5 = -1981661964;
                    break;
                case -2001019150:
                case -8956213:
                    AbstractC3624.m11755();
                    if (!C17202.m40372()) {
                        iM3169 = (C0619.m2761("᩻ܶ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-885)) ^ 1870937913;
                        i5 = -371269388;
                    } else {
                        iM3169 = (C0773.m3169("ۛᩳ") + i2) * (-101);
                        i4 = ((iM3169 ^ i3) * (-17453)) ^ (-695246752);
                        i5 = 608680032;
                    }
                    break;
                case -1775153732:
                case 34990894:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۛ᩸") + i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 19343) ^ 2139857306;
                        i5 = 270719027;
                    } else {
                        iM3169 = (C0773.m3169("᩸ܺ") ^ i2) * 17;
                        i4 = ((iM3169 ^ i3) * 2501) ^ (-1779271386);
                        i5 = 709778491;
                    }
                    break;
                case -1773386510:
                case 2140301979:
                    C3448.m11248();
                    C4282.m13644();
                    iM3169 = (i3 - C0773.m3169("ܶ֨")) * 73;
                    i4 = ((iM3169 ^ i2) * 24889) ^ (-1232708941);
                    i5 = -1747573291;
                    break;
                case -1665904006:
                case 1280659075:
                    if (!C0619.m2763()) {
                        iM3169 = (i3 - C0773.m3169("ܶ֨")) * 73;
                        i4 = ((iM3169 ^ i2) * 24889) ^ (-1232708941);
                        i5 = -1747573291;
                    } else {
                        iM3169 = (C0619.m2761("᩻ܶ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-885)) ^ 1870937913;
                        i5 = -371269388;
                    }
                    break;
                case -1647118689:
                case -1290370360:
                    break;
                case -1553840431:
                case 1127541999:
                    if (C3077.f9998) {
                        iM3169 = (i2 - C0773.m3169("ۡ۬")) * (-117);
                        i4 = ((iM3169 ^ i3) * (-19767)) ^ 1282072790;
                        i5 = -263713771;
                    } else {
                        iM3169 = (C0773.m3169("ܿ᩵") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27047) ^ (-180661988);
                        i5 = 1360684131;
                    }
                    break;
                case -1386781313:
                case 2067568602:
                    try {
                        abstractC14921.f48741 = new C4702(activityC10667, abstractC14921);
                        iM3169 = (C0619.m2761("ۨۙ") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * 18903) ^ 13384946;
                        i5 = -224470999;
                    } catch (Throwable th2) {
                        th = th2;
                        iM3169 = C0619.m2761("ۧܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24817) ^ 1925578547;
                        i5 = -1095353969;
                    }
                    break;
                case -1366066985:
                case 297614737:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("ۛᩳ") + i2) * (-101);
                        i4 = ((iM3169 ^ i3) * (-17453)) ^ (-695246752);
                        i5 = 608680032;
                    } else {
                        iM3169 = (C0619.m2761("᩸᩵") ^ i3) * (-119);
                        i4 = ((iM3169 ^ i2) * (-14903)) ^ (-1335238160);
                        i5 = 988684568;
                    }
                    break;
                case -1262703747:
                case -39332526:
                    C2310.m7813();
                    if (!C3077.f9998) {
                        iM3169 = (i2 - C0619.m2761("֫᩺")) * 17;
                        i4 = ((iM3169 ^ i3) * 29723) ^ 577286147;
                        i5 = 1708606149;
                    } else {
                        iM3169 = (C0619.m2761("᩻ܶ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-885)) ^ 1870937913;
                        i5 = -371269388;
                    }
                    break;
                case -991895830:
                case -111783016:
                    C3690.m11987();
                    C3734.m12152();
                    break;
                case -950698924:
                case 1145139375:
                    C2966.m9664();
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0619.m2761("ۖۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3071) ^ (-847001185);
                        i5 = 406255254;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶ֨")) * 73;
                        i4 = ((iM3169 ^ i2) * 24889) ^ (-1232708941);
                        i5 = -1747573291;
                    }
                    break;
                case -941479601:
                case 1296102504:
                    activityC10667 = this.f23440;
                    if (activityC10667.f33854.f40641 != null) {
                        iM3169 = (C0773.m3169("᩷ܿ") + i2) * 15;
                        i4 = ((iM3169 ^ i3) * 10005) ^ 557676828;
                        i5 = 2038487639;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܶܽ")) * 27;
                        i4 = ((iM3169 ^ i2) * 9571) ^ 869785287;
                        i5 = -529018098;
                    }
                    break;
                case -795082758:
                case 1600615596:
                    activityC10667.f33854.f40641.onChange(c18365, (PluginPreference.PreferenceItem) abstractC14921.f48741, obj);
                    iM3169 = C0773.m3169("᩻ۗ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 3415) ^ 577338596;
                    i5 = 1961576650;
                    break;
                case -628295105:
                case 1194165239:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("ۛ᩸") + i2) * (-117);
                        i4 = ((iM3169 ^ i3) * 19343) ^ 2139857306;
                        i5 = 270719027;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20877)) ^ 1766220646;
                        i5 = 203996859;
                    }
                    break;
                case -432521684:
                case -299116870:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (C0619.m2761("᩻ܶ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-885)) ^ 1870937913;
                        i5 = -371269388;
                    } else {
                        iM3169 = C0619.m2761("ܳ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8657) ^ (-1235471333);
                        i5 = 586546374;
                    }
                    break;
                case -171642831:
                case 903572850:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0619.m2761("ۖۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3071) ^ (-847001185);
                        i5 = 406255254;
                    } else {
                        iM3169 = C0619.m2761("ۨۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18863) ^ (-437882452);
                        i5 = -2025024996;
                    }
                    break;
                case -46369342:
                case 873344966:
                    if (obj2 == null) {
                        iM3169 = C0619.m2761("ܺ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-403)) ^ 603878293;
                        i5 = 266533340;
                    } else {
                        iM3169 = (C0619.m2761("ۨۙ") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * 18903) ^ 13384946;
                        i5 = -224470999;
                    }
                    break;
                case 96239810:
                case 891893408:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ܿ᩵") ^ i3) * (-71);
                        i4 = ((iM3169 ^ i2) * 27047) ^ (-180661988);
                        i5 = 1360684131;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶ֨")) * 73;
                        i4 = ((iM3169 ^ i2) * 24889) ^ (-1232708941);
                        i5 = -1747573291;
                    }
                    break;
                case 628083852:
                case 1375880625:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("ۤ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30587) ^ 1339257819;
                        i5 = -1067266281;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֫᩺")) * 17;
                        i4 = ((iM3169 ^ i3) * 29723) ^ 577286147;
                        i5 = 1708606149;
                    }
                    break;
                case 1054612096:
                case 1547146289:
                    break;
                case 1176475944:
                case 1208165456:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۤ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30587) ^ 1339257819;
                        i5 = -1067266281;
                    } else {
                        iM3169 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29675) ^ 1386374403;
                        i5 = -632475218;
                    }
                    break;
                case 1412676212:
                case 1757508392:
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("᩻ܶ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * (-885)) ^ 1870937913;
                        i5 = -371269388;
                    } else {
                        iM3169 = (C0773.m3169("ۢ᩷") ^ i3) * 3;
                        i4 = ((iM3169 ^ i2) * (-9761)) ^ (-892542202);
                        i5 = -2078832325;
                    }
                    break;
                default:
                    if (C1519.m5403()) {
                        iM3169 = C0619.m2761("ܽᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8839)) ^ 1573575334;
                        i5 = -675534721;
                    } else {
                        iM3169 = C0619.m2761("ۖۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3071) ^ (-847001185);
                        i5 = 406255254;
                    }
                    break;
            }
            return;
        }
    }
}
