package l;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.Primes;

/* JADX INFO: renamed from: l.ܽ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L61J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC17204 extends ActivityC7405 implements InterfaceC15712 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56033 = 0;

    /* JADX INFO: renamed from: ۟ۖۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f56034;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static WeakReference f56035;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final C17930 f56036;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public volatile Runnable f56037;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public View f56038;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f56039;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC16611 f56040;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C3347 f56041;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public Intent f56042;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f56043;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56044;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C18893 f56045;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public C16390 f56046;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public volatile C6865 f56047;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f56048;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f56049;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C3347 f56050;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56051;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final Set f56052;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56053;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19020 f56054;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56055;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native View m40395(int i);

    /* JADX INFO: renamed from: ᩶ */
    public abstract String mo122();

    /* JADX INFO: renamed from: ᩻ */
    public /* synthetic */ boolean mo129() {
        return false;
    }

    @Override // l.ActivityC3409, android.app.Activity
    public void onPause() {
        String strMo122 = null;
        int i = -1816578414;
        int i2 = C3033.f9831;
        int i3 = C2375.f7641;
        int iM3169 = (i3 - C0773.m3169("᩹ۢ")) * 65;
        int i4 = ((iM3169 ^ i2) * (-17749)) ^ (-187130788);
        int i5 = -2125386006;
        while (true) {
            i = ((((i ^ i2) * 11655) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1973864235:
                case 246964387:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("ܽܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-8639)) ^ (-1833977648);
                        i5 = -1457960979;
                    } else {
                        iM3169 = C0619.m2761("ۘ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2377)) ^ 510744065;
                        i5 = 679207961;
                    }
                    break;
                case -1968324814:
                case 1501704036:
                    if (this.f56039) {
                        iM3169 = C0619.m2761("ܶᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27869) ^ (-850628967);
                        i5 = -1548816230;
                    } else {
                        iM3169 = C0619.m2761("ۜ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6505)) ^ (-486815004);
                        i5 = 666763517;
                    }
                    break;
                case -1413498373:
                case 1231760058:
                    MobclickAgent.onPageEnd(strMo122);
                    MobclickAgent.onPause(this);
                    iM3169 = C0619.m2761("ۜ֨") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-6505)) ^ (-486815004);
                    i5 = 666763517;
                    break;
                case -1316200931:
                case 231330857:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("ۨ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18957)) ^ (-1821943216);
                        i5 = 1786486946;
                    } else {
                        iM3169 = C0773.m3169("᩺ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4299)) ^ (-533605246);
                        i5 = -546569062;
                    }
                    break;
                case -1216721821:
                case -541289453:
                    C2878.m9491();
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21375) ^ (-697314914);
                        i5 = -1694826615;
                    } else {
                        iM3169 = C0619.m2761("ۘ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2377)) ^ 510744065;
                        i5 = 679207961;
                    }
                    break;
                case -976472048:
                case 1965418223:
                    C2878.m9491();
                    C3077.m10041();
                    iM3169 = C0619.m2761("ۘ֨") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-2377)) ^ 510744065;
                    i5 = 679207961;
                    break;
                case -933037797:
                case 97890614:
                    break;
                case -822238467:
                case 1047293295:
                    if (C1783.m6232()) {
                        iM3169 = C0773.m3169("ۤۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2087) ^ (-1526566987);
                        i5 = 1028383227;
                    } else {
                        iM3169 = C0619.m2761("ۨ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18957)) ^ (-1821943216);
                        i5 = 1786486946;
                    }
                    break;
                case -742123983:
                case -680485602:
                    strMo122 = mo122();
                    int i6 = C2278.f7424;
                    if (C16514.m39144()) {
                        iM3169 = C0619.m2761("ۜ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6505)) ^ (-486815004);
                        i5 = 666763517;
                    } else {
                        iM3169 = (C0619.m2761("ۧ۟") + i2) * (-61);
                        i4 = ((iM3169 ^ i3) * 423) ^ (-139544680);
                        i5 = 1944672509;
                    }
                    break;
                case -700736990:
                case -224741754:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("᩹ܳ") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-29995)) ^ (-469024772);
                        i5 = -1737874982;
                    } else {
                        iM3169 = C0773.m3169("ᩳܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2057) ^ (-1880874139);
                        i5 = 1253163578;
                    }
                    break;
                case -662291260:
                case 1187349466:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ۘ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2377)) ^ 510744065;
                        i5 = 679207961;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩺") + i2) * (-47);
                        i4 = ((iM3169 ^ i3) * 1515) ^ (-1164911605);
                        i5 = 542913814;
                    }
                    break;
                case -190547564:
                case 1554360752:
                    C4238.m13540();
                    break;
                case -175437398:
                case 514180169:
                    C2485.m8357();
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = C0619.m2761("ܳᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14315) ^ (-1589749546);
                        i5 = -1012653637;
                    } else {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21375) ^ (-697314914);
                        i5 = -1694826615;
                    }
                    break;
                case 693734187:
                case 1618140586:
                    C0773.m3161();
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۨ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18957)) ^ (-1821943216);
                        i5 = 1786486946;
                    } else {
                        iM3169 = C0619.m2761("ܳᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 14315) ^ (-1589749546);
                        i5 = -1012653637;
                    }
                    break;
                case 719370778:
                case 1797192536:
                    super.onPause();
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ۘ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2377)) ^ 510744065;
                        i5 = 679207961;
                    } else {
                        iM3169 = (C0773.m3169("ۖ۟") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * 23469) ^ 142033188;
                        i5 = -1846791259;
                    }
                    break;
                case 746520829:
                case 817044638:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("᩹ܳ") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-29995)) ^ (-469024772);
                        i5 = -1737874982;
                    } else {
                        iM3169 = (C0773.m3169("ۤܽ") ^ i3) * 55;
                        i4 = ((iM3169 ^ i2) * (-31943)) ^ 97069996;
                        i5 = 1111733508;
                    }
                    break;
                case 877096634:
                case 1693683732:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21375) ^ (-697314914);
                        i5 = -1694826615;
                    } else {
                        iM3169 = C0773.m3169("ۡܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29877) ^ (-527929572);
                        i5 = -670621425;
                    }
                    break;
                case 937156298:
                case 1725229626:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0773.m3169("᩹ܳ") ^ i2) * (-63);
                        i4 = ((iM3169 ^ i3) * (-29995)) ^ (-469024772);
                        i5 = -1737874982;
                    } else {
                        iM3169 = C0619.m2761("ܿ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2251) ^ 1092469733;
                        i5 = 2031593424;
                    }
                    break;
                default:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ᩳ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21375) ^ (-697314914);
                        i5 = -1694826615;
                    } else {
                        iM3169 = (C0619.m2761("᩷֨") + i3) * (-11);
                        i4 = ((iM3169 ^ i2) * (-21109)) ^ 1397334598;
                        i5 = -1631604730;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40402(Throwable th, boolean z) {
        DialogInterface.OnDismissListener onDismissListener = null;
        int i = 229720331;
        int i2 = AbstractC0641.f2496;
        int i3 = C3779.f12953;
        int iM3169 = C0773.m3169("᩹ۛ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-4087)) ^ 1907939600;
        int i5 = 1401233497;
        while (true) {
            i = ((((i ^ i2) * 16711) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2005632630:
                case 2143380024:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ۨ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23025)) ^ 1776993707;
                        i5 = -819964995;
                    } else {
                        iM3169 = (C0773.m3169("᩸ᩳ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * 9955) ^ (-1050303474);
                        i5 = -988183982;
                    }
                    break;
                case -1969313083:
                case 592238011:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۗ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12951) ^ (-606502215);
                        i5 = -2050214772;
                    } else {
                        iM3169 = (C0773.m3169("ۢܰ") + i3) * (-123);
                        i4 = ((iM3169 ^ i2) * (-15903)) ^ 1793668530;
                        i5 = -1475424524;
                    }
                    break;
                case -1937572774:
                case -486205478:
                    C2288.m7767();
                    break;
                case -1745841271:
                case -1345612342:
                    RunnableC1848.m6360();
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i3) * 99;
                        i4 = ((iM3169 ^ i2) * 9647) ^ (-1959279827);
                        i5 = -158806700;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗ᩷")) * 99;
                        i4 = ((iM3169 ^ i2) * 10077) ^ (-1898972464);
                        i5 = -1727219656;
                    }
                    break;
                case -1523043448:
                case 671209884:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (i3 - C0773.m3169("ۗ᩷")) * 99;
                        i4 = ((iM3169 ^ i2) * 10077) ^ (-1898972464);
                        i5 = -1727219656;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۟ᩳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i3) * 11957) ^ 886642768;
                        i5 = 671915968;
                    }
                    break;
                case -1472555687:
                case -62331885:
                    if (C3779.m12264()) {
                        iM3169 = (C0619.m2761("ܶ᩻") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * 23043) ^ 1433037599;
                        i5 = 736858103;
                    } else {
                        iM3169 = C0773.m3169("۠᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9473) ^ (-246257377);
                        i5 = -1100471001;
                    }
                    break;
                case -1418861536:
                case -786991116:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("۠᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9473) ^ (-246257377);
                        i5 = -1100471001;
                    } else {
                        iM3169 = (C0619.m2761("۫ۘ") + i2) * (-17);
                        i4 = ((iM3169 ^ i3) * (-25203)) ^ (-1275395319);
                        i5 = 239815404;
                    }
                    break;
                case -1409922192:
                case -1299306287:
                    onDismissListener = null;
                    iM3169 = (i2 - C0773.m3169("᩻۫")) * (-79);
                    i4 = ((iM3169 ^ i3) * 6263) ^ 326367020;
                    i5 = 1256895576;
                    break;
                case -1371171113:
                case -523566796:
                    C2419.m8174();
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۗ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12951) ^ (-606502215);
                        i5 = -2050214772;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۗ᩷")) * 99;
                        i4 = ((iM3169 ^ i2) * 10077) ^ (-1898972464);
                        i5 = -1727219656;
                    }
                    break;
                case -1268259441:
                case 253327572:
                    AbstractC3624.m11755();
                    iM3169 = (i3 - C0773.m3169("ۗ᩷")) * 99;
                    i4 = ((iM3169 ^ i2) * 10077) ^ (-1898972464);
                    i5 = -1727219656;
                    break;
                case -973813109:
                case 2048803565:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (i3 - C0773.m3169("ۗ᩷")) * 99;
                        i4 = ((iM3169 ^ i2) * 10077) ^ (-1898972464);
                        i5 = -1727219656;
                    } else {
                        iM3169 = C0619.m2761("ܺ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1921)) ^ (-1720383171);
                        i5 = 895493317;
                    }
                    break;
                case -931361059:
                case 1344912961:
                    onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.᩸֡֫
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            int i6 = 1819652747;
                            int i7 = C2419.f7754;
                            int i8 = C23916.f77426;
                            int iM2761 = C0619.m2761("۟ܿ") ^ i8;
                            int i9 = ((iM2761 ^ i7) * 5717) ^ (-2141777818);
                            int i10 = 1692555140;
                            while (true) {
                                i6 = ((((i6 ^ i7) * 27387) >> 31) & i9) ^ (iM2761 ^ i10);
                                switch (i6) {
                                    case -2135605608:
                                    case -1492548202:
                                        if (C0619.m2763()) {
                                            iM2761 = (i8 - C0773.m3169("۟ۤ")) * 93;
                                            i9 = ((iM2761 ^ i7) * 23457) ^ 1974038736;
                                            i10 = 1462896675;
                                        } else {
                                            iM2761 = (C0773.m3169("᩻ۡ") + i7) * (-71);
                                            i9 = ((iM2761 ^ i8) * 1917) ^ 1541949964;
                                            i10 = -1476918150;
                                        }
                                        break;
                                    case -2112111958:
                                    case -268225144:
                                        int i11 = AbstractActivityC17204.f56033;
                                        if (C13473.m33144()) {
                                            iM2761 = (i8 - C0619.m2761("۟۟")) * (-109);
                                            i9 = ((iM2761 ^ i7) * (-20695)) ^ 1625536877;
                                            i10 = -265972564;
                                        } else {
                                            iM2761 = (i8 - C0773.m3169("۟ۤ")) * 93;
                                            i9 = ((iM2761 ^ i7) * 23457) ^ 1974038736;
                                            i10 = 1462896675;
                                        }
                                        break;
                                    case -1817311989:
                                    case 498504494:
                                        C4238.m13537(this.f72619);
                                        break;
                                    case -1816111022:
                                    case -120524990:
                                        if (RunnableC1848.f6235) {
                                            iM2761 = (C0619.m2761("۠۠") + i8) * 31;
                                            i9 = ((iM2761 ^ i7) * 2519) ^ (-1124278986);
                                            i10 = -137740380;
                                        } else {
                                            iM2761 = C0773.m3169("۬֫") ^ i8;
                                            i9 = ((iM2761 ^ i7) * 30267) ^ 2036874023;
                                            i10 = -1379225720;
                                        }
                                        break;
                                    case -1781636068:
                                    case 1547372387:
                                        if (C2023.m6964() <= 0) {
                                            iM2761 = (i8 - C0773.m3169("۟ۤ")) * 93;
                                            i9 = ((iM2761 ^ i7) * 23457) ^ 1974038736;
                                            i10 = 1462896675;
                                        } else {
                                            iM2761 = C0619.m2761("۫ۡ") ^ i7;
                                            i9 = ((iM2761 ^ i8) * (-25451)) ^ (-67226145);
                                            i10 = -1332828260;
                                        }
                                        break;
                                    case -1758912479:
                                    case 1785937687:
                                        if (RunnableC3646.f12471) {
                                            iM2761 = (C0619.m2761("۠۠") + i8) * 31;
                                            i9 = ((iM2761 ^ i7) * 2519) ^ (-1124278986);
                                            i10 = -137740380;
                                        } else {
                                            iM2761 = (i8 - C0773.m3169("ۛ᩶")) * 29;
                                            i9 = ((iM2761 ^ i7) * 20637) ^ 770171736;
                                            i10 = 203817928;
                                        }
                                        break;
                                    case -1484560825:
                                    case 1091871246:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM2761 = C0619.m2761("ܿۤ") ^ i8;
                                            i9 = ((iM2761 ^ i7) * (-27505)) ^ 1961610125;
                                            i10 = -700667538;
                                        } else {
                                            iM2761 = (i7 - C0773.m3169("ۜ۬")) * (-91);
                                            i9 = ((iM2761 ^ i8) * (-32447)) ^ (-114026621);
                                            i10 = 564917783;
                                        }
                                        break;
                                    case -1215060752:
                                    case 586238952:
                                        if (C2419.f7754 >= 0) {
                                            iM2761 = (C0619.m2761("۠۠") + i8) * 31;
                                            i9 = ((iM2761 ^ i7) * 2519) ^ (-1124278986);
                                            i10 = -137740380;
                                        } else {
                                            iM2761 = C0619.m2761("᩸ۛ") ^ i7;
                                            i9 = ((iM2761 ^ i8) * 2167) ^ (-428377849);
                                            i10 = 146916465;
                                        }
                                        break;
                                    case -1033981811:
                                    case 955890496:
                                        if (C2354.f7599 >= 0) {
                                            iM2761 = (C0619.m2761("۠۠") + i8) * 31;
                                            i9 = ((iM2761 ^ i7) * 2519) ^ (-1124278986);
                                            i10 = -137740380;
                                        } else {
                                            iM2761 = C0619.m2761("۟ۙ") ^ i7;
                                            i9 = ((iM2761 ^ i8) * (-28065)) ^ (-431686806);
                                            i10 = 1890055442;
                                        }
                                        break;
                                    case -762169447:
                                    case 863466350:
                                        if (AbstractC0116.f1064 > 0) {
                                            iM2761 = C0619.m2761("ܿۤ") ^ i8;
                                            i9 = ((iM2761 ^ i7) * (-27505)) ^ 1961610125;
                                            i10 = -700667538;
                                        } else {
                                            iM2761 = (i7 - C0773.m3169("ܳܳ")) * 9;
                                            i9 = ((iM2761 ^ i8) * 6017) ^ (-115527685);
                                            i10 = -1570521318;
                                        }
                                        break;
                                    case -697566066:
                                    case 1111815640:
                                        C3998.m12920();
                                        if (C2288.f7433 <= 0) {
                                            iM2761 = C0619.m2761("ܿۤ") ^ i8;
                                            i9 = ((iM2761 ^ i7) * (-27505)) ^ 1961610125;
                                            i10 = -700667538;
                                        } else {
                                            iM2761 = C0773.m3169("ۖ᩸") ^ i7;
                                            i9 = ((iM2761 ^ i8) * 22989) ^ (-1299091980);
                                            i10 = 1682209389;
                                        }
                                        break;
                                    case -676387656:
                                    case 1577179218:
                                        if (C0950.f3488 >= 0) {
                                            iM2761 = (i8 - C0773.m3169("۟ۤ")) * 93;
                                            i9 = ((iM2761 ^ i7) * 23457) ^ 1974038736;
                                            i10 = 1462896675;
                                        } else {
                                            iM2761 = (C0773.m3169("ۨܰ") + i8) * (-67);
                                            i9 = ((iM2761 ^ i7) * 11569) ^ (-1415534637);
                                            i10 = -897830267;
                                        }
                                        break;
                                    case -332180091:
                                    case -24295785:
                                        C3492.m11488();
                                        AbstractC0641.m2813();
                                        iM2761 = C0619.m2761("ܿۤ") ^ i8;
                                        i9 = ((iM2761 ^ i7) * (-27505)) ^ 1961610125;
                                        i10 = -700667538;
                                        break;
                                    case 1367217410:
                                    case 1545057845:
                                        if (C1564.m5509() <= 0) {
                                            iM2761 = (i8 - C0773.m3169("۟ۤ")) * 93;
                                            i9 = ((iM2761 ^ i7) * 23457) ^ 1974038736;
                                            i10 = 1462896675;
                                        } else {
                                            iM2761 = (C0773.m3169("ܶ᩵") + i8) * 79;
                                            i9 = ((iM2761 ^ i7) * (-23323)) ^ (-1600556787);
                                            i10 = 243448595;
                                        }
                                        break;
                                    case 1649030519:
                                    case 1850608480:
                                        if (C0269.f1558 <= 0) {
                                            iM2761 = (C0619.m2761("۠۠") + i8) * 31;
                                            i9 = ((iM2761 ^ i7) * 2519) ^ (-1124278986);
                                            i10 = -137740380;
                                        } else {
                                            iM2761 = C0619.m2761("ܿۤ") ^ i8;
                                            i9 = ((iM2761 ^ i7) * (-27505)) ^ 1961610125;
                                            i10 = -700667538;
                                        }
                                        break;
                                    default:
                                        C1321.m4852();
                                        C23916.m53419();
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM3169 = (i2 - C0773.m3169("᩻۫")) * (-79);
                    i4 = ((iM3169 ^ i3) * 6263) ^ 326367020;
                    i5 = 1256895576;
                    break;
                case -913763779:
                case 44344847:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ۨ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23025)) ^ 1776993707;
                        i5 = -819964995;
                    } else {
                        iM3169 = (C0773.m3169("֡ۤ") + i3) * (-15);
                        i4 = ((iM3169 ^ i2) * (-2211)) ^ (-1550058129);
                        i5 = -1222836869;
                    }
                    break;
                case -304783014:
                case 1677499354:
                    AbstractC0641.m2814(this, th, onDismissListener);
                    break;
                case 471198714:
                case 486049679:
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i3) * 99;
                        i4 = ((iM3169 ^ i2) * 9647) ^ (-1959279827);
                        i5 = -158806700;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܺۛ")) * (-31);
                        i4 = ((iM3169 ^ i3) * 4513) ^ (-1131445453);
                        i5 = -1794703495;
                    }
                    break;
                case 655677554:
                case 1944018226:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ۗ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12951) ^ (-606502215);
                        i5 = -2050214772;
                    } else {
                        iM3169 = C0773.m3169("ۨۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23679)) ^ 511822202;
                        i5 = 586144863;
                    }
                    break;
                case 946987206:
                case 1876025950:
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("۠ܺ") ^ i3) * (-61);
                        i4 = ((iM3169 ^ i2) * 26493) ^ 1557319072;
                        i5 = -1674141823;
                    } else {
                        iM3169 = C0619.m2761("ۨ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23025)) ^ 1776993707;
                        i5 = -819964995;
                    }
                    break;
                case 1173691212:
                case 1432078926:
                    C0269.m1775();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0773.m3169("۠᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9473) ^ (-246257377);
                        i5 = -1100471001;
                    } else {
                        iM3169 = (C0773.m3169("ܺۤ") + i3) * 99;
                        i4 = ((iM3169 ^ i2) * 9647) ^ (-1959279827);
                        i5 = -158806700;
                    }
                    break;
                default:
                    if (z) {
                        iM3169 = (C0773.m3169("ᩳۘ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * 19459) ^ (-750089703);
                        i5 = -344675424;
                    } else {
                        iM3169 = C0773.m3169("᩸ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23903)) ^ (-1397588131);
                        i5 = -2106775042;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40397(int i, String str, boolean z) {
        int i2 = -1116395203;
        int i3 = C2702.f8586;
        int i4 = C3492.f12043;
        int iM3169 = C0773.m3169("ۛ᩷") ^ i4;
        int i5 = ((iM3169 ^ i3) * (-5441)) ^ (-71246316);
        int i6 = 941572399;
        while (true) {
            i2 = ((((i2 ^ i3) * 7625) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -1951373052:
                case 437651028:
                    C1343.m4943();
                    C17202.m40372();
                    break;
                case -1914315133:
                case 1274969514:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13579) ^ (-2051961481);
                        i6 = -1740255635;
                    } else {
                        iM3169 = C0773.m3169("ܶۧ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 23039) ^ 495258237;
                        i6 = -2003339998;
                    }
                    break;
                case -1688137830:
                case -847327461:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ܽ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 20525) ^ (-470885271);
                        i6 = 1614935642;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۖ֨")) * 59;
                        i5 = ((iM3169 ^ i3) * (-15719)) ^ (-1914217980);
                        i6 = 2063240531;
                    }
                    break;
                case -1634711449:
                case 2101013061:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i3 - C0619.m2761("᩹ۗ")) * (-31);
                        i5 = ((iM3169 ^ i4) * (-27169)) ^ 2015191134;
                        i6 = 1542529262;
                    } else {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13579) ^ (-2051961481);
                        i6 = -1740255635;
                    }
                    break;
                case -1563732077:
                case -1043581236:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("᩸᩶") + i4) * (-35);
                        i5 = ((iM3169 ^ i3) * (-7053)) ^ (-1207173289);
                        i6 = -633042004;
                    } else {
                        iM3169 = (C0619.m2761("ۤۢ") ^ i3) * (-79);
                        i5 = ((iM3169 ^ i4) * (-31985)) ^ 2000586045;
                        i6 = -901604799;
                    }
                    break;
                case -1264051660:
                case -108966143:
                    C2023.m6964();
                    if (!C2966.m9664()) {
                        iM3169 = C0773.m3169("ܽ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 20525) ^ (-470885271);
                        i6 = 1614935642;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩶") + i4) * (-35);
                        i5 = ((iM3169 ^ i3) * (-7053)) ^ (-1207173289);
                        i6 = -633042004;
                    }
                    break;
                case -1085504795:
                case 2116282159:
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("ᩴ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 25785) ^ (-1445129007);
                        i6 = 1592605173;
                    } else {
                        iM3169 = (C0773.m3169("ۧ֡") + i4) * 91;
                        i5 = ((iM3169 ^ i3) * 23309) ^ (-944490724);
                        i6 = -1403006715;
                    }
                    break;
                case -637903661:
                case -480677634:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۧ֡") + i4) * 91;
                        i5 = ((iM3169 ^ i3) * 23309) ^ (-944490724);
                        i6 = -1403006715;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩵ܰ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i4) * 11591) ^ (-718013511);
                        i6 = 1313773478;
                    }
                    break;
                case -444737834:
                case -93903761:
                    runOnUiThread(new RunnableC8779(this, C1783.m6246(this, i), str, z));
                    break;
                case -371972551:
                case 736703258:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("᩸᩶") + i4) * (-35);
                        i5 = ((iM3169 ^ i3) * (-7053)) ^ (-1207173289);
                        i6 = -633042004;
                    } else {
                        iM3169 = (C0773.m3169("ۗ۠") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM3169 ^ i3) * (-9673)) ^ 1074649112;
                        i6 = -1882416409;
                    }
                    break;
                case 160762974:
                case 674229048:
                    C2375.m8065();
                    if (!C2288.m7767()) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13579) ^ (-2051961481);
                        i6 = -1740255635;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩶") + i4) * (-35);
                        i5 = ((iM3169 ^ i3) * (-7053)) ^ (-1207173289);
                        i6 = -633042004;
                    }
                    break;
                case 377524431:
                case 1801546885:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 13579) ^ (-2051961481);
                        i6 = -1740255635;
                    } else {
                        iM3169 = (C0773.m3169("ܽۛ") ^ i4) * (-67);
                        i5 = ((iM3169 ^ i3) * 30805) ^ 1446720955;
                        i6 = 1029180192;
                    }
                    break;
                case 997220669:
                case 1112089921:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ܽ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 20525) ^ (-470885271);
                        i6 = 1614935642;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۡۚ")) * 53;
                        i5 = ((iM3169 ^ i4) * (-24901)) ^ (-176372453);
                        i6 = -1254746859;
                    }
                    break;
                case 1351482267:
                case 1874400611:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0773.m3169("ܽ᩻") ^ i3;
                        i5 = ((iM3169 ^ i4) * 20525) ^ (-470885271);
                        i6 = 1614935642;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܳ᩵")) * 9;
                        i5 = ((iM3169 ^ i3) * (-19391)) ^ 983741663;
                        i6 = -1999446686;
                    }
                    break;
                case 1627849872:
                case 1937116839:
                    C2288.m7767();
                    iM3169 = C0619.m2761("᩺ۚ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 13579) ^ (-2051961481);
                    i6 = -1740255635;
                    break;
                default:
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("᩵֫") + i3) * (-51);
                        i5 = ((iM3169 ^ i4) * 27159) ^ 1690638202;
                        i6 = 864557177;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩹ۗ")) * (-31);
                        i5 = ((iM3169 ^ i4) * (-27169)) ^ 2015191134;
                        i6 = 1542529262;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x024d  */
    /* JADX WARN: Code duplicated, block: B:67:0x027f  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ae  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (l.C20932.f66974 > 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m40405(final l.C8147 r34, final android.view.View r35, final android.view.View r36, final android.view.View r37, final android.view.View r38, final android.view.View r39, final android.view.View r40, final android.view.View r41, final android.view.View r42) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC17204.m40405(l.۟᩷ۙ, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View):void");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo109(Intent intent) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo123(Intent intent) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40404(C8147 c8147, View view, View view2, View view3, View view4, View view5) {
        int i = 820156792;
        int i2 = C1542.f5343;
        int i3 = C1146.f4234;
        int iM2761 = (C0619.m2761("ۗᩳ") + i3) * (-113);
        int i4 = ((iM2761 ^ i2) * (-21195)) ^ (-732911213);
        int i5 = -885745721;
        while (true) {
            i = ((((i ^ i2) * 16615) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2127479152:
                case 252302754:
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ۖ֡") + i3) * (-37);
                        i4 = ((iM2761 ^ i2) * (-28505)) ^ 838233775;
                        i5 = -1815806459;
                    } else {
                        iM2761 = C0773.m3169("᩶ܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23537)) ^ (-170535686);
                        i5 = 1532380195;
                    }
                    break;
                case -2048811964:
                case 67414489:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۖ֡") + i3) * (-37);
                        i4 = ((iM2761 ^ i2) * (-28505)) ^ 838233775;
                        i5 = -1815806459;
                    } else {
                        iM2761 = C0773.m3169("۬ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1745) ^ (-454500865);
                        i5 = 723152483;
                    }
                    break;
                case -1851989590:
                case 1692387692:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("ܶۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27987)) ^ (-174506451);
                        i5 = -156061910;
                    } else {
                        iM2761 = (C0619.m2761("ܰܰ") ^ i3) * (-73);
                        i4 = ((iM2761 ^ i2) * (-1191)) ^ 516825261;
                        i5 = -1606773875;
                    }
                    break;
                case -1758190163:
                case 816819455:
                    C3998.m12920();
                    break;
                case -1717132279:
                case 1532790708:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ۘۡ") + i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-20851)) ^ 1493881999;
                        i5 = 2108339882;
                    } else {
                        iM2761 = C0773.m3169("᩷֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15767) ^ 460893414;
                        i5 = -1009295962;
                    }
                    break;
                case -1018750473:
                case -667760114:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ۖ֡") + i3) * (-37);
                        i4 = ((iM2761 ^ i2) * (-28505)) ^ 838233775;
                        i5 = -1815806459;
                    } else {
                        iM2761 = (C0773.m3169("ܽۙ") ^ i3) * (-63);
                        i4 = ((iM2761 ^ i2) * 3429) ^ (-701660200);
                        i5 = 1962297237;
                    }
                    break;
                case -882770583:
                case -419615189:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0619.m2761("֡ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27709)) ^ 1704552189;
                        i5 = 279525544;
                    } else {
                        iM2761 = C0773.m3169("ۨۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16165)) ^ (-1993156346);
                        i5 = 826850400;
                    }
                    break;
                case -785339483:
                case 909111312:
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("ۖ֡") + i3) * (-37);
                        i4 = ((iM2761 ^ i2) * (-28505)) ^ 838233775;
                        i5 = -1815806459;
                    } else {
                        iM2761 = (C0619.m2761("۠᩺") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * (-10487)) ^ (-497680530);
                        i5 = 470289158;
                    }
                    break;
                case -309262694:
                case -165296912:
                    C2375.m8065();
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("֡ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27709)) ^ 1704552189;
                        i5 = 279525544;
                    } else {
                        iM2761 = C0619.m2761("ܶۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27987)) ^ (-174506451);
                        i5 = -156061910;
                    }
                    break;
                case -307924614:
                case 1940732341:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۘۡ") + i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-20851)) ^ 1493881999;
                        i5 = 2108339882;
                    } else {
                        iM2761 = C0773.m3169("ۛۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30979) ^ 2138932002;
                        i5 = -1856777915;
                    }
                    break;
                case 305446795:
                case 1324676999:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ۘۡ") + i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-20851)) ^ 1493881999;
                        i5 = 2108339882;
                    } else {
                        iM2761 = C0773.m3169("ۙۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-24495)) ^ 925748352;
                        i5 = -1266864904;
                    }
                    break;
                case 916255843:
                case 2025590259:
                    C4238.m13540();
                    C2834.m9344();
                    iM2761 = C0619.m2761("᩻ܺ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-15699)) ^ 33502287;
                    i5 = 659441584;
                    break;
                case 1187714886:
                case 1653598763:
                    C1542.m5459();
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩻ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15699)) ^ 33502287;
                        i5 = 659441584;
                    } else {
                        iM2761 = (C0773.m3169("ۘۡ") + i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-20851)) ^ 1493881999;
                        i5 = 2108339882;
                    }
                    break;
                case 1319789767:
                case 1506299362:
                    C4238.m13540();
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("ܶۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27987)) ^ (-174506451);
                        i5 = -156061910;
                    } else {
                        iM2761 = (C0773.m3169("ۘۡ") + i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-20851)) ^ 1493881999;
                        i5 = 2108339882;
                    }
                    break;
                case 1652257669:
                case 1760914270:
                    m40405(c8147, view, view2, view3, view4, null, null, view5, null);
                    break;
                default:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۘۡ") + i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-20851)) ^ 1493881999;
                        i5 = 2108339882;
                    } else {
                        iM2761 = (C0773.m3169("᩹ܳ") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * 15023) ^ 752068877;
                        i5 = 150787558;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40398(int i, boolean z) {
        String str;
        short[] sArr;
        short s;
        int iM2761;
        int i2;
        int i3;
        int iM2762;
        int i4;
        int i5;
        int iM2763;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM3169;
        String strM9486 = null;
        short[] sArr2 = null;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        short s3 = 0;
        int i12 = 0;
        short[] sArr3 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1488991407;
        int i16 = C1826.f6190;
        int i17 = C2288.f7433;
        int iM2764 = (C0619.m2761("ۡۡ") ^ i17) * 97;
        int i18 = ((iM2764 ^ i16) * (-10487)) ^ (-928197964);
        int i19 = iM2764 ^ (-1564541519);
        while (true) {
            i15 = ((((i15 ^ i16) * 8463) >> 31) & i18) ^ i19;
            switch (i15) {
                case -2056165174:
                case 77928819:
                    sArr3 = f56034;
                    i14 = 3;
                    if (RunnableC1848.f6235) {
                        str = strM9486;
                        s = s2;
                        i13 = 151;
                        iM2762 = C0773.m3169("᩵۠") ^ i16;
                        i4 = ((iM2762 ^ i17) * (-14729)) ^ 870878305;
                        i5 = -27557894;
                        i19 = iM2762 ^ i5;
                        i18 = i4;
                        s2 = s;
                        strM9486 = str;
                    } else {
                        int iM31610 = (C0773.m3169("۟ۜ") + i16) * (-21);
                        i18 = ((iM31610 ^ i17) * (-27713)) ^ (-1902220600);
                        i19 = iM31610 ^ 2136915430;
                        i13 = 151;
                    }
                    break;
                case -1856419274:
                case -358065193:
                    str = strM9486;
                    sArr = sArr2;
                    s = s2;
                    if (C0862.f3233 != 0) {
                        iM2761 = (i17 - C0773.m3169("ۢܽ")) * 93;
                        i2 = ((iM2761 ^ i16) * 32529) ^ 2038241345;
                        i3 = -438146966;
                    } else {
                        iM2761 = C0619.m2761("᩺۠") ^ i16;
                        i2 = ((iM2761 ^ i17) * (-5583)) ^ (-1149539802);
                        i3 = -1112877474;
                    }
                    i19 = iM2761 ^ i3;
                    i18 = i2;
                    s2 = s;
                    strM9486 = str;
                    sArr2 = sArr;
                    break;
                case -1765847828:
                case -1514589833:
                    RunnableC3646.m11813();
                    if (C0950.f3488 < 0) {
                        str = strM9486;
                        s = s2;
                        iM2762 = C0773.m3169("᩵۠") ^ i16;
                        i4 = ((iM2762 ^ i17) * (-14729)) ^ 870878305;
                        i5 = -27557894;
                        i19 = iM2762 ^ i5;
                        i18 = i4;
                        s2 = s;
                        strM9486 = str;
                    }
                    str = strM9486;
                    s = s2;
                    iM2762 = (C0619.m2761("ܿ۟") + i17) * (-29);
                    i4 = ((iM2762 ^ i16) * 17919) ^ 161177937;
                    i5 = -1691897503;
                    i19 = iM2762 ^ i5;
                    i18 = i4;
                    s2 = s;
                    strM9486 = str;
                    break;
                case -1698859242:
                case -475928016:
                    if (!C3099.m10095()) {
                        str = strM9486;
                        sArr = sArr2;
                        s = s2;
                        iM2761 = (i17 - C0773.m3169("ۢܽ")) * 93;
                        i2 = ((iM2761 ^ i16) * 32529) ^ 2038241345;
                        i3 = -438146966;
                        i19 = iM2761 ^ i3;
                        i18 = i2;
                        s2 = s;
                        strM9486 = str;
                        sArr2 = sArr;
                    } else {
                        str = strM9486;
                        s = s2;
                        iM2762 = (C0619.m2761("ܿ۟") + i17) * (-29);
                        i4 = ((iM2762 ^ i16) * 17919) ^ 161177937;
                        i5 = -1691897503;
                        i19 = iM2762 ^ i5;
                        i18 = i4;
                        s2 = s;
                        strM9486 = str;
                    }
                    break;
                case -1685167089:
                case -997410480:
                    i12 = 62108;
                    iM2763 = C0619.m2761("ۤ۠") ^ i17;
                    str = strM9486;
                    i6 = ((iM2763 ^ i16) * 31837) ^ (-136862121);
                    i7 = -417098773;
                    i18 = i6;
                    i19 = iM2763 ^ i7;
                    strM9486 = str;
                    break;
                case -1579542318:
                case -472926228:
                    str = strM9486;
                    sArr = sArr2;
                    s = s2;
                    if (C1783.f6087 > 0) {
                        iM2761 = C0773.m3169("ۢۘ") ^ i16;
                        i2 = ((iM2761 ^ i17) * (-6285)) ^ 785571149;
                        i3 = -1612987077;
                        i19 = iM2761 ^ i3;
                        i18 = i2;
                        s2 = s;
                        strM9486 = str;
                        sArr2 = sArr;
                    }
                    s2 = s;
                    iM3169 = (C0773.m3169("ۨ֨") ^ i17) * (-3);
                    i9 = ((iM3169 ^ i16) * 15909) ^ 2032675717;
                    i8 = 1956123397;
                    i19 = iM3169 ^ i8;
                    i18 = i9;
                    strM9486 = str;
                    sArr2 = sArr;
                    break;
                case -1371068315:
                case -649273825:
                    str = strM9486;
                    s = s2;
                    sArr2 = f56034;
                    if (C0773.m3161() != 0) {
                        iM2762 = C0773.m3169("᩵۠") ^ i16;
                        i4 = ((iM2762 ^ i17) * (-14729)) ^ 870878305;
                        i5 = -27557894;
                    } else {
                        iM2762 = (i17 - C0773.m3169("ۛۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2762 ^ i16) * 16133) ^ 461912239;
                        i5 = 492415840;
                    }
                    i19 = iM2762 ^ i5;
                    i18 = i4;
                    s2 = s;
                    strM9486 = str;
                    break;
                case -1183205427:
                case -964818678:
                    strM9486 = C2878.m9486(sArr3, i13, i14, i12);
                    if (C3998.f13671 == 0) {
                        iM2763 = (C0619.m2761("۟۠") + i16) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        str = strM9486;
                        i6 = ((iM2763 ^ i17) * 4663) ^ 1659822788;
                        i7 = -492793395;
                        i18 = i6;
                        i19 = iM2763 ^ i7;
                        strM9486 = str;
                    } else {
                        sArr = sArr2;
                        s = s2;
                        int iM31611 = (i16 - C0773.m3169("ۘܿ")) * (-7);
                        i19 = iM31611 ^ (-1417750420);
                        i18 = ((iM31611 ^ i17) * (-14979)) ^ (-1817403790);
                        s2 = s;
                        sArr2 = sArr;
                    }
                    break;
                case -1064797129:
                case 1202774422:
                    C1826.m6301();
                    str = strM9486;
                    sArr = sArr2;
                    s = s2;
                    iM2761 = (i17 - C0773.m3169("ۢܽ")) * 93;
                    i2 = ((iM2761 ^ i16) * 32529) ^ 2038241345;
                    i3 = -438146966;
                    i19 = iM2761 ^ i3;
                    i18 = i2;
                    s2 = s;
                    strM9486 = str;
                    sArr2 = sArr;
                    break;
                case -1005216445:
                case -79811862:
                    str = strM9486;
                    sArr = sArr2;
                    s = s2;
                    if (C1321.f4751 < 0) {
                        iM2761 = (C0619.m2761("ܽۧ") ^ i17) * (-15);
                        i2 = ((iM2761 ^ i16) * 31775) ^ (-1800788246);
                        i3 = 256457538;
                        i19 = iM2761 ^ i3;
                        i18 = i2;
                        s2 = s;
                        strM9486 = str;
                        sArr2 = sArr;
                    } else {
                        sArr2 = sArr;
                        iM2762 = C0773.m3169("᩵۠") ^ i16;
                        i4 = ((iM2762 ^ i17) * (-14729)) ^ 870878305;
                        i5 = -27557894;
                        i19 = iM2762 ^ i5;
                        i18 = i4;
                        s2 = s;
                        strM9486 = str;
                    }
                    break;
                case -789369826:
                case 773611331:
                    str = strM9486;
                    int i20 = s2 + s3;
                    if (i11 - (i20 * i20) < 0) {
                        iM2762 = (i16 - C0773.m3169("ܶܺ")) * (-55);
                        s = s2;
                        i4 = ((iM2762 ^ i17) * 20849) ^ (-1999048123);
                        i5 = -1499111299;
                    } else {
                        s = s2;
                        iM2762 = C0619.m2761("ܳۢ") ^ i17;
                        i4 = ((iM2762 ^ i16) * (-2063)) ^ (-2069773766);
                        i5 = -1495369726;
                    }
                    i19 = iM2762 ^ i5;
                    i18 = i4;
                    s2 = s;
                    strM9486 = str;
                    break;
                case -489265156:
                case 102270337:
                    str = strM9486;
                    s = s2;
                    int i21 = 37920964 + i10;
                    i11 = i21 + i21;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2762 = (C0619.m2761("ܿ۟") + i17) * (-29);
                        i4 = ((iM2762 ^ i16) * 17919) ^ 161177937;
                        i5 = -1691897503;
                    } else {
                        iM2762 = (i16 - C0619.m2761("ܿ֡")) * 23;
                        i4 = ((iM2762 ^ i17) * (-26577)) ^ (-1312110201);
                        i5 = -139833651;
                    }
                    i19 = iM2762 ^ i5;
                    i18 = i4;
                    s2 = s;
                    strM9486 = str;
                    break;
                case -416762082:
                case 1863144075:
                    str = strM9486;
                    s = s2;
                    s3 = 6158;
                    if (C2375.f7641 > 0) {
                        iM2762 = (i17 - C0619.m2761("ܰۗ")) * (-123);
                        i4 = ((iM2762 ^ i16) * (-5871)) ^ 1886758564;
                        i5 = -320261427;
                        i19 = iM2762 ^ i5;
                        i18 = i4;
                        s2 = s;
                        strM9486 = str;
                    } else {
                        sArr = sArr2;
                        s2 = s;
                        iM3169 = (C0773.m3169("ۨ֨") ^ i17) * (-3);
                        i9 = ((iM3169 ^ i16) * 15909) ^ 2032675717;
                        i8 = 1956123397;
                        i19 = iM3169 ^ i8;
                        i18 = i9;
                        strM9486 = str;
                        sArr2 = sArr;
                    }
                    break;
                case -226615344:
                case 1944922828:
                    str = strM9486;
                    s2 = sArr2[150];
                    i10 = s2 * s2;
                    if (C2354.f7599 >= 0) {
                        sArr = sArr2;
                        iM3169 = (C0773.m3169("ۨ֨") ^ i17) * (-3);
                        i9 = ((iM3169 ^ i16) * 15909) ^ 2032675717;
                        i8 = 1956123397;
                    } else {
                        iM3169 = (C0773.m3169("ۡ۟") + i16) * (-81);
                        sArr = sArr2;
                        i9 = ((iM3169 ^ i17) * (-1601)) ^ 685852471;
                        i8 = 355232746;
                    }
                    i19 = iM3169 ^ i8;
                    i18 = i9;
                    strM9486 = str;
                    sArr2 = sArr;
                    break;
                case -195687162:
                case 53034885:
                    i12 = 35991;
                    iM2763 = C0619.m2761("ۤ۠") ^ i17;
                    str = strM9486;
                    i6 = ((iM2763 ^ i16) * 31837) ^ (-136862121);
                    i7 = -417098773;
                    i18 = i6;
                    i19 = iM2763 ^ i7;
                    strM9486 = str;
                    break;
                case 31907900:
                case 1382694928:
                    C0773.m3161();
                    C3099.m10095();
                    break;
                case 836549071:
                case 846169573:
                    str = strM9486;
                    sArr = sArr2;
                    s = s2;
                    if (C3734.m12152() < 0) {
                        iM2761 = C0619.m2761("۫᩶") ^ i17;
                        i2 = ((iM2761 ^ i16) * 209) ^ 131102656;
                        i3 = -217342592;
                        i19 = iM2761 ^ i3;
                        i18 = i2;
                        s2 = s;
                        strM9486 = str;
                        sArr2 = sArr;
                    } else {
                        strM9486 = str;
                        int iM31612 = (i16 - C0773.m3169("ۘܿ")) * (-7);
                        i19 = iM31612 ^ (-1417750420);
                        i18 = ((iM31612 ^ i17) * (-14979)) ^ (-1817403790);
                        s2 = s;
                        sArr2 = sArr;
                    }
                    break;
                case 1581427394:
                case 1798071941:
                    m40396(C0619.m2761(strM9486) ^ 2097293371, i, z);
                    break;
                default:
                    C3448.m11248();
                    if (!C0862.m3503()) {
                        sArr = sArr2;
                        s = s2;
                        int iM31613 = (i16 - C0773.m3169("ۘܿ")) * (-7);
                        i19 = iM31613 ^ (-1417750420);
                        i18 = ((iM31613 ^ i17) * (-14979)) ^ (-1817403790);
                        s2 = s;
                        sArr2 = sArr;
                    } else {
                        str = strM9486;
                        s = s2;
                        iM2762 = (C0619.m2761("ܿ۟") + i17) * (-29);
                        i4 = ((iM2762 ^ i16) * 17919) ^ 161177937;
                        i5 = -1691897503;
                        i19 = iM2762 ^ i5;
                        i18 = i4;
                        s2 = s;
                        strM9486 = str;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x018f A[PHI: r0
      0x018f: PHI (r0v6 boolean) = (r0v5 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:57:0x018d, B:13:0x003f, B:10:0x0039, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public AbstractActivityC17204() {
        int iM3169;
        int i;
        boolean z = false;
        boolean z2 = false;
        int i2 = 1212297840;
        int i3 = C1564.f5401;
        int i4 = C3448.f11240;
        int iM2761 = C0619.m2761("ۨ֡") ^ i3;
        int i5 = ((iM2761 ^ i4) * 24009) ^ (-1803080016);
        int i6 = -66174352;
        while (true) {
            int i7 = iM2761 ^ i6;
            WeakHashMap weakHashMap = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-29755)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2123107972:
                    case 954465226:
                        if (C1564.f5401 <= 0) {
                            iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 3141) ^ (-1968629811);
                            i = -1108749868;
                        } else {
                            iM3169 = (i4 - C0773.m3169("۬᩻")) * (-77);
                            i5 = ((iM3169 ^ i3) * 9069) ^ (-1464023866);
                            i = 840029924;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2040749720:
                    case -1438605306:
                        this.f56040 = null;
                        this.f56053 = z2;
                        return;
                    case -2036762502:
                    case 901410758:
                        z = true;
                        this.f56044 = true;
                        if (C1542.f5343 <= 0) {
                            iM3169 = (i4 - C0773.m3169("۬᩻")) * (-77);
                            i5 = ((iM3169 ^ i3) * 9069) ^ (-1464023866);
                            i = 840029924;
                        } else {
                            iM3169 = C0773.m3169("ۘܺ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-8957)) ^ 1290734876;
                            i = 1094601364;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1552408823:
                    case 1686691689:
                        if (C1826.m6301() >= 0) {
                            iM3169 = C0619.m2761("ۗۜ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 7261) ^ (-833512684);
                            i = 982422043;
                        } else {
                            iM3169 = C0619.m2761("֨۬") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-26005)) ^ 832544736;
                            i = 377579189;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1237189940:
                    case 229935411:
                        if (C3099.f10023 > 0) {
                            weakHashMap = new WeakHashMap();
                            if (C1146.f4234 < 0) {
                                iM3169 = (i4 - C0619.m2761("᩻ᩴ")) * 21;
                                i5 = ((iM3169 ^ i3) * (-27705)) ^ 1153206837;
                                i = 1728896962;
                                i7 = iM3169 ^ i;
                            }
                        }
                        break;
                    case -1202623241:
                    case -484702217:
                        if (C2419.m8174() >= 0) {
                            iM3169 = C0619.m2761("᩶ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 5651) ^ 1420272343;
                            i = -68736031;
                        } else {
                            iM3169 = C0773.m3169("ܳ᩷") ^ i3;
                            i5 = ((iM3169 ^ i4) * 4407) ^ (-315600648);
                            i = -858332453;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1147443080:
                    case 260217324:
                        this.f56039 = z;
                        z2 = false;
                        if (C1321.f4751 < 0) {
                            iM3169 = C0773.m3169("۠ܶ") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-14447)) ^ (-1983726750);
                            i = 655700971;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -1146573821:
                    case -948106279:
                        C3099.m10095();
                        throw new RuntimeException();
                    case -857490823:
                    case 1813393730:
                        if (C3492.f12043 <= 0) {
                            iM3169 = C0619.m2761("᩶ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 5651) ^ 1420272343;
                            i = -68736031;
                        } else {
                            iM3169 = (C0773.m3169("ܳۤ") + i4) * 37;
                            i5 = ((iM3169 ^ i3) * 14691) ^ (-1167822272);
                            i = 1909818244;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -557758525:
                    case 1877008179:
                        C2966.m9664();
                        if (C2375.f7641 > 0) {
                            iM3169 = (i4 - C0773.m3169("۬᩻")) * (-77);
                            i5 = ((iM3169 ^ i3) * 9069) ^ (-1464023866);
                            i = 840029924;
                        } else {
                            iM3169 = C0619.m2761("ۗۜ") ^ i4;
                            i5 = ((iM3169 ^ i3) * 7261) ^ (-833512684);
                            i = 982422043;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 269161841:
                    case 1198878105:
                        C2310.m7813();
                        C1542.m5459();
                        iM3169 = C0773.m3169("᩻ۙ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 3141) ^ (-1968629811);
                        i = -1108749868;
                        i7 = iM3169 ^ i;
                        break;
                    case 389819656:
                    case 1791633555:
                        this.f56052 = Collections.newSetFromMap(weakHashMap);
                        if (C1146.f4234 < 0) {
                            iM3169 = C0773.m3169("۠ۛ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-21129)) ^ (-1415020746);
                            i = 1406275365;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case 998191932:
                    case 1000960069:
                        if (AbstractC0116.f1064 <= 0) {
                            iM3169 = C0619.m2761("᩶ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 5651) ^ 1420272343;
                            i = -68736031;
                        } else {
                            iM3169 = (C0619.m2761("ۙܶ") ^ i4) * 75;
                            i5 = ((iM3169 ^ i3) * 8411) ^ 1982679006;
                            i = 1762243136;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1568804366:
                    case 1904213663:
                        this.f56048 = z2;
                        if (AbstractC0116.f1064 > 0) {
                            iM3169 = C0619.m2761("ۘ۟") ^ i4;
                            i5 = ((iM3169 ^ i3) * 12323) ^ (-510413544);
                            i = 1107937191;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    default:
                        C3492.m11488();
                        if (C3492.f12043 > 0) {
                            iM3169 = (i4 - C0773.m3169("۬᩻")) * (-77);
                            i5 = ((iM3169 ^ i3) * 9069) ^ (-1464023866);
                            i = 840029924;
                        } else {
                            iM3169 = C0619.m2761("᩶ۤ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 5651) ^ 1420272343;
                            i = -68736031;
                        }
                        i7 = iM3169 ^ i;
                        break;
                }
            }
            iM2761 = C0619.m2761("᩻ܶ") ^ i3;
            i5 = ((iM2761 ^ i4) * 28693) ^ 1472106198;
            i6 = -1537893781;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03d6 A[PHI: r26
      0x03d6: PHI (r26v15 short[]) = (r26v14 short[]), (r26v16 short[]) binds: [B:100:0x03bc, B:95:0x0399] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x04c9 A[PHI: r16 r17 r18 r20 r26
      0x04c9: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:122:0x04c7, B:118:0x04a5, B:114:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x04c9: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char) binds: [B:122:0x04c7, B:118:0x04a5, B:114:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x04c9: PHI (r18v3 short) = (r18v2 short), (r18v2 short), (r18v4 short) binds: [B:122:0x04c7, B:118:0x04a5, B:114:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x04c9: PHI (r20v3 short) = (r20v2 short), (r20v2 short), (r20v4 short) binds: [B:122:0x04c7, B:118:0x04a5, B:114:0x0486] A[DONT_GENERATE, DONT_INLINE]
      0x04c9: PHI (r26v9 short[]) = (r26v7 short[]), (r26v8 short[]), (r26v10 short[]) binds: [B:122:0x04c7, B:118:0x04a5, B:114:0x0486] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0121 A[PHI: r6 r7
      0x0121: PHI (r6v4 l.ܽۧ) = (r6v3 l.ܽۧ), (r6v1 l.ܽۧ), (r6v1 l.ܽۧ), (r6v1 l.ܽۧ), (r6v1 l.ܽۧ) binds: [B:40:0x011f, B:30:0x00de, B:26:0x00bc, B:22:0x00b0, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:40:0x011f, B:30:0x00de, B:26:0x00bc, B:22:0x00b0, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ca A[PHI: r2 r12 r15
      0x01ca: PHI (r2v5 int) = (r2v3 int), (r2v2 int) binds: [B:56:0x01c8, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r12v5 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:56:0x01c8, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r15v5 int) = (r15v3 int), (r15v2 int) binds: [B:56:0x01c8, B:7:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a6 A[PHI: r3 r9 r13 r28
      0x02a6: PHI (r3v3 int) = (r3v2 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int) binds: [B:73:0x02a4, B:52:0x01a5, B:32:0x00e2, B:30:0x00de, B:18:0x0091, B:14:0x0084, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r9v3 java.lang.String) = 
      (r9v1 java.lang.String)
      (r9v2 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
      (r9v1 java.lang.String)
     binds: [B:73:0x02a4, B:52:0x01a5, B:32:0x00e2, B:30:0x00de, B:18:0x0091, B:14:0x0084, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:73:0x02a4, B:52:0x01a5, B:32:0x00e2, B:30:0x00de, B:18:0x0091, B:14:0x0084, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x02a6: PHI (r28v42 short[]) = (r28v31 short[]), (r28v3 short[]), (r28v3 short[]), (r28v3 short[]), (r28v3 short[]), (r28v3 short[]), (r28v3 short[]) binds: [B:73:0x02a4, B:52:0x01a5, B:32:0x00e2, B:30:0x00de, B:18:0x0091, B:14:0x0084, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.ActivityC4348, l.ActivityC8866, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int iM2761;
        int i;
        int i2;
        int i3;
        int iM2762;
        int i4;
        int iM2763;
        int i5;
        int iM3792 = 0;
        int iM13651 = 0;
        View viewM4949 = null;
        C17531 c17531 = null;
        int iM4938 = 0;
        View viewM13654 = null;
        String strM33137 = null;
        int i6 = 1536649022;
        int i7 = C3448.f11240;
        int i8 = C2966.f9654;
        int iM3169 = (i8 - C0773.m3169("ᩳۧ")) * 99;
        int i9 = ((iM3169 ^ i7) * (-25237)) ^ 548749880;
        int i10 = iM3169 ^ (-25599906);
        ViewOnClickListenerC16611 viewOnClickListenerC16611 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        int i16 = 0;
        short s2 = 0;
        short s3 = 0;
        boolean z = false;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-959)) >> 31));
            switch (i6) {
                case -2098528699:
                case -1453343631:
                    sArr2 = sArr2;
                    if (iM3792 == (C0773.m3169(strM33137) ^ 2124843178)) {
                        iM2761 = (C0619.m2761("ۗܰ") ^ i8) * (-31);
                        i = ((iM2761 ^ i7) * 7985) ^ 1527503750;
                        i2 = -1736306157;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۜ") ^ i7) * (-7);
                        i = ((iM2761 ^ i8) * (-19767)) ^ 1405353457;
                        i2 = -512205567;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1974102544:
                case 1811819729:
                    C3998.m12920();
                    if (AbstractC3624.f12429 > 0) {
                        iM2762 = C0619.m2761("۟ܶ") ^ i7;
                        i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                        i4 = 2047974139;
                    } else {
                        iM2762 = C0619.m2761("۬᩻") ^ i7;
                        i = ((iM2762 ^ i8) * (-6051)) ^ (-359058921);
                        i4 = 2038725940;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -1945730748:
                case -320795077:
                    i12 = 60413;
                    iM2761 = (C0773.m3169("ۗᩴ") + i7) * (-63);
                    i = ((iM2761 ^ i8) * (-16021)) ^ 1199587840;
                    i2 = -1576918856;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1894350226:
                case -81616832:
                    iM13651 = C4282.m13651(this.f56046) - (z ? 1 : 0);
                    iM2761 = (i7 - C0619.m2761("᩹᩸")) * (-9);
                    i = ((iM2761 ^ i8) * 25919) ^ 435314856;
                    i2 = -288857031;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1881011636:
                case -1060757740:
                    c17531 = (C17531) viewM4949;
                    iM4938 = C1343.m4938(c17531) - (z ? 1 : 0);
                    if (C20932.f66974 <= 0) {
                        iM2762 = (C0773.m3169("ܽܽ") ^ i8) * 37;
                        i = ((iM2762 ^ i7) * (-24079)) ^ (-1519123482);
                        i4 = 2085021031;
                    } else {
                        iM2762 = (C0619.m2761("ܽ۫") ^ i8) * 29;
                        i = ((iM2762 ^ i7) * 2299) ^ (-2118209929);
                        i4 = 524299184;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -1848823651:
                case -118383608:
                    C0619.m2763();
                    if (C4238.f15451 >= 0) {
                        sArr2 = sArr2;
                        iM2761 = C0619.m2761("ᩴۚ") ^ i8;
                        i = ((iM2761 ^ i7) * 9017) ^ (-1258542087);
                        i2 = -1113162829;
                        i3 = iM2761 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    }
                    iM2762 = (C0773.m3169("ܽܽ") ^ i8) * 37;
                    i = ((iM2762 ^ i7) * (-24079)) ^ (-1519123482);
                    i4 = 2085021031;
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -1839662486:
                case 986433389:
                    C3099.m10095();
                    RunnableC3646.m11813();
                    return false;
                case -1829123133:
                case 1150162840:
                    return z;
                case -1695181169:
                case -155892951:
                    C3033.m9845();
                    if (C2354.f7599 >= 0) {
                        sArr2 = sArr2;
                        iM2761 = C0619.m2761("ۨ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-15901)) ^ 1488870231;
                        i2 = 390761668;
                        i3 = iM2761 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    }
                    iM2762 = C0619.m2761("۟ܶ") ^ i7;
                    i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                    i4 = 2047974139;
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -1618525754:
                case 1959278374:
                    C11235.m28309();
                    if (C3099.m10095()) {
                        iM2762 = (C0619.m2761("ۙۛ") + i8) * q.h;
                        i = ((iM2762 ^ i7) * 20431) ^ 1845313157;
                        i4 = -80612215;
                    } else {
                        iM2762 = (C0773.m3169("ܽܽ") ^ i8) * 37;
                        i = ((iM2762 ^ i7) * (-24079)) ^ (-1519123482);
                        i4 = 2085021031;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -1271969604:
                case 1826763327:
                    sArr2 = sArr2;
                    if (keyEvent.getKeyCode() == 82) {
                        iM2761 = (i8 - C0619.m2761("᩸᩶")) * (-59);
                        i = ((iM2761 ^ i7) * 1327) ^ (-2036383570);
                        i2 = 48115354;
                    } else {
                        iM2761 = (C0773.m3169("۬ܳ") + i7) * (-105);
                        i = ((iM2761 ^ i8) * (-5207)) ^ (-705227889);
                        i2 = 1599183374;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1239587794:
                case 994984568:
                    if (iM13651 >= 0) {
                        iM2762 = (C0773.m3169("᩵ۘ") + i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2762 ^ i8) * 20783) ^ 111259772;
                        i4 = -1910191190;
                        i10 = iM2762 ^ i4;
                        i9 = i;
                    }
                    sArr2 = sArr2;
                    iM2761 = C0619.m2761("᩻᩹") ^ i7;
                    i = ((iM2761 ^ i8) * 21357) ^ (-1648814185);
                    i2 = -835519008;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1228457242:
                case 360335596:
                    sArr2 = sArr2;
                    c = 5;
                    if (C2878.f9462) {
                        iM2761 = (i7 - C0619.m2761("ܽۤ")) * (-107);
                        i = ((iM2761 ^ i8) * 22985) ^ 490934312;
                        i2 = -1656297875;
                    } else {
                        iM2761 = (C0619.m2761("ᩳۡ") + i7) * 91;
                        i = ((iM2761 ^ i8) * (-4367)) ^ (-2066991743);
                        i2 = -1983578617;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -1014251493:
                case -741948855:
                    viewM13654 = C4282.m13654(c17531, iM4938);
                    if (viewM13654 instanceof ViewOnClickListenerC16611) {
                        iM2762 = C0773.m3169("۟֫") ^ i7;
                        i = ((iM2762 ^ i8) * 10963) ^ 543641911;
                        i4 = -986798592;
                        i10 = iM2762 ^ i4;
                        i9 = i;
                    }
                    sArr2 = sArr2;
                    iM2761 = C0619.m2761("᩻᩹") ^ i7;
                    i = ((iM2761 ^ i8) * 21357) ^ (-1648814185);
                    i2 = -835519008;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -928084477:
                case 674800700:
                    sArr2 = sArr2;
                    if (keyEvent.getAction() == 1) {
                        int iM31610 = C0773.m3169("ۘ֫") ^ i8;
                        i = ((iM31610 ^ i7) * (-1917)) ^ (-1480546597);
                        i3 = iM31610 ^ (-1658409317);
                        sArr2 = sArr2;
                        z = true;
                    } else {
                        z = true;
                        iM2761 = (C0619.m2761("᩵ۜ") ^ i7) * (-7);
                        i = ((iM2761 ^ i8) * (-19767)) ^ 1405353457;
                        i2 = -512205567;
                        i3 = iM2761 ^ i2;
                        sArr2 = sArr2;
                    }
                    i10 = i3;
                    i9 = i;
                    break;
                case -919003864:
                case -255232361:
                    C1826.m6301();
                    iM2762 = C0619.m2761("۟ܶ") ^ i7;
                    i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                    i4 = 2047974139;
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -781852729:
                case 2033866827:
                    sArr2 = sArr2;
                    if (i16 - (s2 * s3) >= 0) {
                        iM2761 = C0619.m2761("ᩴ֡") ^ i7;
                        i = ((iM2761 ^ i8) * (-5083)) ^ (-1301314157);
                        i2 = 2051094594;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۢ") + i8) * 75;
                        i = ((iM2761 ^ i7) * (-14959)) ^ 251467575;
                        i2 = -442466987;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -674557881:
                case 2004521466:
                    strM33137 = C13473.m33137(sArr3, i15, i11, i12);
                    if (C13473.m33144()) {
                        iM2762 = C0619.m2761("ۘ۫") ^ i8;
                        i = ((iM2762 ^ i7) * (-25353)) ^ 1955980782;
                        i4 = 876651169;
                    } else {
                        iM2762 = C0619.m2761("۟ܶ") ^ i7;
                        i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                        i4 = 2047974139;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -532190826:
                case 761774090:
                    this.f56040 = (ViewOnClickListenerC16611) viewM13654;
                    sArr2 = sArr2;
                    iM2761 = C0619.m2761("᩻᩹") ^ i7;
                    i = ((iM2761 ^ i8) * 21357) ^ (-1648814185);
                    i2 = -835519008;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -432590011:
                case 763452674:
                    return super.dispatchKeyEvent(keyEvent);
                case -239625870:
                case 3781259:
                    sArr2 = sArr2;
                    if (this.f56040 == null) {
                        iM2761 = C0619.m2761("۟ۛ") ^ i7;
                        i = ((iM2761 ^ i8) * (-11137)) ^ 641126377;
                        i2 = 1734337812;
                    } else {
                        iM2761 = C0619.m2761("᩻᩹") ^ i7;
                        i = ((iM2761 ^ i8) * 21357) ^ (-1648814185);
                        i2 = -835519008;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -204624069:
                case 2006827739:
                    sArr2 = sArr2;
                    if (this.f56048) {
                        iM2761 = (i8 - C0773.m3169("۟ۡ")) * 51;
                        i = ((iM2761 ^ i7) * Primes.SMALL_FACTOR_LIMIT) ^ (-1747211284);
                        i2 = 566928876;
                    } else {
                        iM2761 = (C0773.m3169("۬ܳ") + i7) * (-105);
                        i = ((iM2761 ^ i8) * (-5207)) ^ (-705227889);
                        i2 = 1599183374;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -85471790:
                case 1014028851:
                    sArr2 = sArr2;
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ᩴۚ") ^ i8;
                        i = ((iM2761 ^ i7) * 9017) ^ (-1258542087);
                        i2 = -1113162829;
                    } else {
                        iM2761 = C0619.m2761("ܽۧ") ^ i8;
                        i = ((iM2761 ^ i7) * 30215) ^ (-837468078);
                        i2 = 1674780019;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case -30010396:
                case 1138719576:
                    if (RunnableC1848.f6235) {
                        sArr2 = sArr2;
                        iM2761 = (C0773.m3169("᩺ۜ") ^ i7) * 11;
                        i = ((iM2761 ^ i8) * 24349) ^ (-2045943371);
                        i2 = 1640389539;
                        i3 = iM2761 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    }
                    iM2762 = C0619.m2761("۟ܶ") ^ i7;
                    i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                    i4 = 2047974139;
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case -20168710:
                case 312378081:
                    sArr2 = sArr2;
                    sArr = f56034;
                    if (C1783.m6232()) {
                        iM2761 = C0619.m2761("ۧ᩶") ^ i7;
                        i = ((iM2761 ^ i8) * 31243) ^ (-340011676);
                        i2 = 1586394671;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ܽۤ")) * (-107);
                        i = ((iM2761 ^ i8) * 22985) ^ 490934312;
                        i2 = -1656297875;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case 242846323:
                case 1639525801:
                    ViewOnClickListenerC16611 viewOnClickListenerC16612 = this.f56040;
                    viewOnClickListenerC16612.onClick(viewOnClickListenerC16612);
                    sArr2 = sArr2;
                    iM2761 = (C0619.m2761("᩵ۜ") ^ i7) * (-7);
                    i = ((iM2761 ^ i8) * (-19767)) ^ 1405353457;
                    i2 = -512205567;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case 251605391:
                case 1745182007:
                    sArr2 = sArr2;
                    i14 = 3;
                    if (C2288.m7767()) {
                        iM2761 = (C0773.m3169("᩺ۜ") ^ i7) * 11;
                        i = ((iM2761 ^ i8) * 24349) ^ (-2045943371);
                        i2 = 1640389539;
                    } else {
                        iM2761 = (C0619.m2761("᩶۫") ^ i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i7) * (-31427)) ^ 1419311076;
                        i2 = 1272914804;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case 446629947:
                case 1021196469:
                    sArr2 = sArr2;
                    s2 = sArr[c];
                    s = 7491;
                    if (C2834.m9344() >= 0) {
                        iM2761 = (i7 - C0619.m2761("ܽۤ")) * (-107);
                        i = ((iM2761 ^ i8) * 22985) ^ 490934312;
                        i2 = -1656297875;
                    } else {
                        iM2761 = C0773.m3169("ۧۙ") ^ i8;
                        i = ((iM2761 ^ i7) * (-12161)) ^ (-678097662);
                        i2 = -52183437;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case 549094550:
                case 1550868036:
                    C2287.m7745();
                    if (RunnableC1848.f6235) {
                        iM2762 = (C0773.m3169("ܽܽ") ^ i8) * 37;
                        i = ((iM2762 ^ i7) * (-24079)) ^ (-1519123482);
                        i4 = 2085021031;
                    } else {
                        iM2762 = (i7 - C0773.m3169("۬᩶")) * (-113);
                        i = ((iM2762 ^ i8) * (-25279)) ^ (-212374366);
                        i4 = 1484405630;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case 645402136:
                case 773595536:
                    sArr2 = sArr2;
                    ViewOnClickListenerC16611 viewOnClickListenerC16613 = this.f56040;
                    if (viewOnClickListenerC16613 == null) {
                        viewOnClickListenerC16611 = viewOnClickListenerC16613;
                        iM2761 = (C0619.m2761("᩵ۜ") ^ i7) * (-7);
                        i = ((iM2761 ^ i8) * (-19767)) ^ 1405353457;
                        i2 = -512205567;
                        i3 = iM2761 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    } else {
                        iM2763 = C0619.m2761("ۡۧ") ^ i8;
                        viewOnClickListenerC16611 = viewOnClickListenerC16613;
                        i9 = ((iM2763 ^ i7) * (-11787)) ^ 613897066;
                        i5 = -1217547166;
                        int i17 = iM2763 ^ i5;
                        sArr2 = sArr2;
                        i10 = i17;
                    }
                    break;
                case 712158599:
                case 1836131058:
                    iM3792 = C0950.m3792(viewOnClickListenerC16611);
                    sArr2 = f56034;
                    i13 = 6;
                    if (C1826.f6190 <= 0) {
                        iM2762 = C0619.m2761("۟ܶ") ^ i7;
                        i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                        i4 = 2047974139;
                    } else {
                        iM2762 = (i7 - C0619.m2761("ᩳ֨")) * (-41);
                        i = ((iM2762 ^ i8) * 19857) ^ (-112731780);
                        i4 = -1035324472;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case 799284058:
                case 1134591327:
                    C20932.m47848();
                    if (C2375.m8065() > 0) {
                        iM2762 = C0619.m2761("۟ܶ") ^ i7;
                        i = ((iM2762 ^ i8) * 25491) ^ 1245485329;
                        i4 = 2047974139;
                    } else {
                        iM2762 = (C0773.m3169("ܽܽ") ^ i8) * 37;
                        i = ((iM2762 ^ i7) * (-24079)) ^ (-1519123482);
                        i4 = 2085021031;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case 882440567:
                case 1586699931:
                    sArr3 = f56034;
                    i15 = 9;
                    i11 = 3;
                    if (C1564.m5509() <= 0) {
                        iM2762 = (C0619.m2761("ۙۛ") + i8) * q.h;
                        i = ((iM2762 ^ i7) * 20431) ^ 1845313157;
                        i4 = -80612215;
                    } else {
                        iM2762 = C0773.m3169("᩵ܶ") ^ i8;
                        i = ((iM2762 ^ i7) * 25755) ^ (-119993903);
                        i4 = -362385576;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case 993767826:
                case 1135084342:
                    short[] sArr4 = sArr2;
                    if (iM3792 == (C0773.m3169(C3690.m11996(sArr4, i13, i14, i12)) ^ 2120664910)) {
                        sArr2 = sArr4;
                        iM2761 = (C0619.m2761("ۗܰ") ^ i8) * (-31);
                        i = ((iM2761 ^ i7) * 7985) ^ 1527503750;
                        i2 = -1736306157;
                        i3 = iM2761 ^ i2;
                        sArr2 = sArr2;
                        i10 = i3;
                        i9 = i;
                    } else {
                        iM2763 = C0619.m2761("᩷ۛ") ^ i7;
                        sArr2 = sArr4;
                        i9 = ((iM2763 ^ i8) * 10555) ^ (-667524745);
                        i5 = -1227253383;
                        int i18 = iM2763 ^ i5;
                        sArr2 = sArr2;
                        i10 = i18;
                    }
                    break;
                case 1082150825:
                case 1643947874:
                    sArr2 = sArr2;
                    int i19 = s2 + s;
                    i16 = i19 * i19;
                    s3 = 29964;
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ܽۢ") ^ i8;
                        i = ((iM2761 ^ i7) * (-877)) ^ (-1373910036);
                        i2 = 1283128641;
                    } else {
                        iM2761 = C0619.m2761("ۨ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-15901)) ^ 1488870231;
                        i2 = 390761668;
                    }
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                case 1111868747:
                case 1349089289:
                    viewM4949 = C1343.m4949(this.f56046, iM13651);
                    if (viewM4949 instanceof C17531) {
                        iM2762 = (i7 - C0619.m2761("ۨۧ")) * 3;
                        i = ((iM2762 ^ i8) * 7785) ^ (-779704194);
                        i4 = 2015134177;
                    } else {
                        iM2762 = C0773.m3169("֫ۚ") ^ i8;
                        i = ((iM2762 ^ i7) * 5037) ^ (-1300308309);
                        i4 = -134405460;
                    }
                    i10 = iM2762 ^ i4;
                    i9 = i;
                    break;
                case 1703170153:
                case 1793216992:
                    iM13651--;
                    iM2761 = (i7 - C0619.m2761("᩹᩸")) * (-9);
                    i = ((iM2761 ^ i8) * 25919) ^ 435314856;
                    i2 = -288857031;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
                default:
                    i12 = 15810;
                    iM2761 = (C0773.m3169("ۗᩴ") + i7) * (-63);
                    i = ((iM2761 ^ i8) * (-16021)) ^ 1199587840;
                    i2 = -1576918856;
                    i3 = iM2761 ^ i2;
                    sArr2 = sArr2;
                    i10 = i3;
                    i9 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4 A[PHI: r9
      0x01c4: PHI (r9v5 android.view.View) = (r9v2 android.view.View), (r9v3 android.view.View), (r9v2 android.view.View) binds: [B:159:0x01c4, B:52:0x01c2, B:24:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0200 A[PHI: r12
      0x0200: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:56:0x01fe, B:21:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x028d A[PHI: r1 r5 r11 r15
      0x028d: PHI (r1v80 int) = (r1v2 int), (r1v71 int), (r1v2 int), (r1v2 int) binds: [B:67:0x028b, B:44:0x0166, B:30:0x0107, B:13:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:67:0x028b, B:44:0x0166, B:30:0x0107, B:13:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r11v4 java.lang.String) = (r11v2 java.lang.String), (r11v3 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:67:0x028b, B:44:0x0166, B:30:0x0107, B:13:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:67:0x028b, B:44:0x0166, B:30:0x0107, B:13:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m40413() {
        int iM3169;
        int i;
        int i2;
        ArrayList arrayList;
        int iM2761;
        int i3;
        int i4;
        ArrayList arrayListM53408;
        int i5;
        int i6;
        int iM31610;
        int i7;
        int i8;
        short[] sArr;
        View view;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        int i12 = C1542.f5343;
        int i13 = AbstractC0116.f1064;
        int iM2762 = C0619.m2761("۟ۛ") ^ i12;
        int i14 = ((iM2762 ^ i13) * (-31403)) ^ 1832498163;
        View decorView = null;
        View viewM11246 = null;
        String name = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = iM2762 ^ 1012628292;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        char c = 0;
        short s = 0;
        int iM9336 = 0;
        int i25 = 0;
        int i26 = 0;
        ArrayList arrayList3 = null;
        int i27 = -802779419;
        int i28 = 0;
        String name2 = null;
        short[] sArr5 = null;
        int iM2763 = 0;
        View view2 = null;
        while (true) {
            i27 = i15 ^ (i14 & (((i27 ^ i13) * 30673) >> 31));
            switch (i27) {
                case -2129946130:
                case -1841360354:
                    C3099.m10095();
                    return false;
                case -2002670409:
                case 251803924:
                    C3998.m12920();
                    iM3169 = C0773.m3169("᩶᩻") ^ i13;
                    i = ((iM3169 ^ i12) * 4899) ^ (-945317777);
                    i2 = -2062144873;
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1885175753:
                case -1196701714:
                    C0773.m3161();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0773.m3169("᩶᩻") ^ i13;
                        i = ((iM3169 ^ i12) * 4899) ^ (-945317777);
                        i2 = -2062144873;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۙ") ^ i12) * 15;
                        i = ((iM3169 ^ i13) * 30983) ^ (-1264608983);
                        i2 = 1917270149;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1875119723:
                case -874581187:
                    i16 = i16;
                    i17 = i17;
                    i25 = i25;
                    i5 = i28;
                    sArr3 = sArr3;
                    arrayListM53408 = C23907.m53408();
                    decorView = C2702.m8884(this).getDecorView();
                    iM9336 = C2834.m9336(arrayListM53408);
                    iM31610 = (C0773.m3169("ۨܳ") ^ i12) * (-105);
                    i7 = ((iM31610 ^ i13) * (-30171)) ^ (-76695668);
                    i8 = 855644670;
                    i11 = iM31610 ^ i8;
                    i28 = i5;
                    int i29 = i17;
                    arrayList3 = arrayListM53408;
                    i14 = i7;
                    sArr3 = sArr3;
                    i25 = i25;
                    i17 = i29;
                    int i30 = i16;
                    i15 = i11;
                    i16 = i30;
                    break;
                case -1830887330:
                case 57912640:
                    if (C2310.f7472 < 0) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList4 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList4;
                        iM2761 = (i13 - C0619.m2761("ܺۘ")) * 81;
                        i3 = ((iM2761 ^ i12) * 31899) ^ (-676064961);
                        i4 = -181470256;
                        int i31 = iM2761 ^ i4;
                        i28 = i28;
                        i6 = i16;
                        i15 = i31;
                        i14 = i3;
                        i16 = i6;
                        short[] sArr6 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr6;
                    }
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList5 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList5;
                    iM2761 = C0773.m3169("᩸ۜ") ^ i12;
                    i3 = ((iM2761 ^ i13) * 17505) ^ (-1975394914);
                    i4 = 1459400400;
                    int i32 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i32;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr7 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr7;
                    break;
                case -1760146045:
                case 2095567134:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList6 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList6;
                    i22 = s + 1;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("ۢ֡") + i13) * 87;
                        i3 = ((iM2761 ^ i12) * (-3371)) ^ 1119261051;
                        i4 = 876168708;
                    } else {
                        iM2761 = (C0773.m3169("ۛܶ") ^ i13) * 61;
                        i3 = ((iM2761 ^ i12) * (-3129)) ^ (-1405042935);
                        i4 = 508221874;
                    }
                    int i33 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i33;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr8 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr8;
                    break;
                case -1715023392:
                case 156080525:
                    i16 = i16;
                    arrayListM53408 = arrayList3;
                    i5 = i28;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    if (C1542.m5473(arrayListM53408, i25) != decorView) {
                        iM9336 = i25;
                        decorView = decorView;
                        iM31610 = (C0773.m3169("ۨܳ") ^ i12) * (-105);
                        i7 = ((iM31610 ^ i13) * (-30171)) ^ (-76695668);
                        i8 = 855644670;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i210 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i210;
                        int i34 = i16;
                        i15 = i11;
                        i16 = i34;
                    } else {
                        int iM2764 = C0619.m2761("ܳ֨") ^ i13;
                        arrayList = arrayListM53408;
                        i14 = ((iM2764 ^ i12) * 12989) ^ (-735826821);
                        i28 = i5;
                        i6 = i16;
                        i15 = iM2764 ^ (-297768429);
                        i16 = i6;
                        short[] sArr9 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr9;
                    }
                    break;
                case -1712510823:
                case 1851576993:
                    iM2763 = C0619.m2761(C2310.m7803(sArr3, i17, i18, i20));
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("᩵ۙ") ^ i12) * 15;
                        i = ((iM3169 ^ i13) * 30983) ^ (-1264608983);
                        i2 = 1917270149;
                    } else {
                        iM3169 = C0773.m3169("֡᩺") ^ i13;
                        i = ((iM3169 ^ i12) * (-21127)) ^ (-1220971342);
                        i2 = -1133910590;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1697829438:
                case 1254004971:
                    if (!C3492.m11490(name, C3492.m11486(sArr4, i16, 41, i20))) {
                        arrayListM53408 = arrayList3;
                        i5 = i28;
                        i17 = i17;
                        i26 = i5;
                        i25 = i25;
                        iM31610 = (C0773.m3169("ۚۡ") ^ i12) * (-11);
                        sArr3 = sArr3;
                        i7 = ((iM31610 ^ i13) * 23913) ^ 168861;
                        i8 = -1542412578;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i211 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i211;
                        int i35 = i16;
                        i15 = i11;
                        i16 = i35;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩺") ^ i12;
                        i = ((iM3169 ^ i13) * (-8937)) ^ (-1827925326);
                        i2 = -530290242;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1459271827:
                case 1184531494:
                    return m40387((ViewGroup) view2, i19);
                case -1387800715:
                case 1434253926:
                    arrayListM53408 = arrayList3;
                    i5 = i28;
                    view2 = (View) C1542.m5473(arrayListM53408, i5);
                    if (view2.getVisibility() == 0) {
                        int iM31611 = (i12 - C0773.m3169("ۤ᩶")) * (-75);
                        int i36 = i16;
                        int i37 = ((iM31611 ^ i13) * (-23523)) ^ 2023163618;
                        int i38 = iM31611 ^ 866997714;
                        i28 = i5;
                        arrayList3 = arrayListM53408;
                        i14 = i37;
                        i16 = i36;
                        i15 = i38;
                    } else {
                        i17 = i17;
                        i26 = i5;
                        i25 = i25;
                        iM31610 = (C0773.m3169("ۚۡ") ^ i12) * (-11);
                        sArr3 = sArr3;
                        i7 = ((iM31610 ^ i13) * 23913) ^ 168861;
                        i8 = -1542412578;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i212 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i212;
                        int i39 = i16;
                        i15 = i11;
                        i16 = i39;
                    }
                    break;
                case -1346342012:
                case -1281988627:
                    i19 = 10;
                    if (viewM11246 instanceof C21261) {
                        iM3169 = C0619.m2761("ۚ᩷") ^ i13;
                        i = ((iM3169 ^ i12) * (-21559)) ^ 1552178624;
                        i2 = -398593657;
                    } else {
                        iM3169 = (i12 - C0773.m3169("ۜۘ")) * 29;
                        i = ((iM3169 ^ i13) * (-413)) ^ (-1061631656);
                        i2 = 1503854712;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1290904144:
                case 246434164:
                    if (C0619.m2766(view2) <= 0) {
                        arrayListM53408 = arrayList3;
                        i5 = i28;
                        i17 = i17;
                        i26 = i5;
                        i25 = i25;
                        iM31610 = (C0773.m3169("ۚۡ") ^ i12) * (-11);
                        sArr3 = sArr3;
                        i7 = ((iM31610 ^ i13) * 23913) ^ 168861;
                        i8 = -1542412578;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i213 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i213;
                        int i310 = i16;
                        i15 = i11;
                        i16 = i310;
                    } else {
                        iM3169 = C0773.m3169("ۖۖ") ^ i13;
                        i = ((iM3169 ^ i12) * (-23071)) ^ (-1689890978);
                        i2 = 1399745120;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1229350252:
                case 1783278189:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList7 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList7;
                    if ((i24 + 1) - i23 <= 0) {
                        iM2761 = C0619.m2761("ۙܰ") ^ i13;
                        i3 = ((iM2761 ^ i12) * (-25373)) ^ (-1789187173);
                        i4 = 569615700;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩹") ^ i12) * 93;
                        i3 = ((iM2761 ^ i13) * 16107) ^ (-1366709104);
                        i4 = 325180771;
                    }
                    int i311 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i311;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr10 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr10;
                    break;
                case -1200107385:
                case 732387220:
                    viewM11246 = C3448.m11246(view2, 2129428351 ^ iM2763);
                    if (C0619.m2763()) {
                        iM3169 = (C0773.m3169("ᩴۘ") ^ i13) * 45;
                        i = ((iM3169 ^ i12) * 15519) ^ (-1882554427);
                        i2 = 124269407;
                    } else {
                        iM3169 = (i12 - C0619.m2761("۬ۗ")) * 85;
                        i = ((iM3169 ^ i13) * 25683) ^ (-193029214);
                        i2 = -219465327;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -1154524714:
                case -1098269691:
                    arrayList = arrayList3;
                    i20 = 41720;
                    iM2761 = C0619.m2761("֡ۨ") ^ i13;
                    i3 = ((iM2761 ^ i12) * 22887) ^ (-553060151);
                    i4 = -1809467058;
                    int i312 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i312;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr11 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr11;
                    break;
                case -1101776601:
                case 1949441230:
                    if (C1519.f5300 < 0) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList8 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList8;
                        iM2761 = C0773.m3169("᩸ۜ") ^ i12;
                        i3 = ((iM2761 ^ i13) * 17505) ^ (-1975394914);
                        i4 = 1459400400;
                        int i313 = iM2761 ^ i4;
                        i28 = i28;
                        i6 = i16;
                        i15 = i313;
                        i14 = i3;
                        i16 = i6;
                        short[] sArr12 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr12;
                    } else {
                        iM3169 = C0773.m3169("᩶᩻") ^ i13;
                        i = ((iM3169 ^ i12) * 4899) ^ (-945317777);
                        i2 = -2062144873;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1077773728:
                case -319129305:
                    sArr3 = f56034;
                    i17 = 432;
                    i18 = 3;
                    if (!C0862.m3503()) {
                        i16 = i16;
                        i25 = i25;
                        i28 = i28;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList3;
                        i17 = 432;
                        iM2761 = (C0773.m3169("ۢ֡") + i13) * 87;
                        i3 = ((iM2761 ^ i12) * (-3371)) ^ 1119261051;
                        i4 = 876168708;
                        int i314 = iM2761 ^ i4;
                        i28 = i28;
                        i6 = i16;
                        i15 = i314;
                        i14 = i3;
                        i16 = i6;
                        short[] sArr13 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr13;
                    } else {
                        iM3169 = (C0619.m2761("۫ᩳ") + i12) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i13) * (-14673)) ^ (-1391097152);
                        i2 = -2137552467;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1056548868:
                case -472001011:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList9 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList9;
                    s = sArr5[c];
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("᩶ۘ") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-6001)) ^ (-255906131);
                        i4 = 1735628165;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩶") + i13) * (-97);
                        i3 = ((iM2761 ^ i12) * 27985) ^ (-1234812414);
                        i4 = 333890013;
                    }
                    int i315 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i315;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr14 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr14;
                    break;
                case -1004030917:
                case -237374658:
                    name2 = C3734.m12155(view2).getName();
                    sArr2 = f56034;
                    if (!C1519.m5403()) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList10 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList10;
                        iM2761 = C0773.m3169("᩶ۘ") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-6001)) ^ (-255906131);
                        i4 = 1735628165;
                        int i316 = iM2761 ^ i4;
                        i28 = i28;
                        i6 = i16;
                        i15 = i316;
                        i14 = i3;
                        i16 = i6;
                        short[] sArr15 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr15;
                    } else {
                        iM3169 = (C0773.m3169("᩵۫") ^ i13) * 13;
                        i = ((iM3169 ^ i12) * 21401) ^ (-1320605189);
                        i2 = 1955534683;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case -735385281:
                case -150402142:
                    i16 = i16;
                    sArr = sArr3;
                    view = decorView;
                    arrayList2 = arrayList3;
                    int i40 = i28;
                    i17 = i17;
                    i9 = iM9336 - 1;
                    if (i9 >= 0) {
                        int iM2765 = (C0619.m2761("ۨۡ") ^ i12) * 21;
                        i10 = ((iM2765 ^ i13) * (-26059)) ^ (-1966832988);
                        i11 = iM2765 ^ 230343924;
                        i28 = i40;
                    } else {
                        i28 = i40;
                        int iM31612 = (C0773.m3169("۬ۤ") ^ i13) * (-75);
                        i10 = ((iM31612 ^ i12) * 24345) ^ 30580230;
                        i11 = iM31612 ^ (-1735156176);
                    }
                    short[] sArr16 = sArr;
                    i25 = i9;
                    i14 = i10;
                    i17 = i17;
                    arrayList3 = arrayList2;
                    decorView = view;
                    sArr3 = sArr16;
                    int i317 = i16;
                    i15 = i11;
                    i16 = i317;
                    break;
                case -670500238:
                case 530470296:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("᩶᩻") ^ i13;
                        i = ((iM3169 ^ i12) * 4899) ^ (-945317777);
                        i2 = -2062144873;
                    } else {
                        iM3169 = (C0773.m3169("ܳ۬") + i12) * (-95);
                        i = ((iM3169 ^ i13) * 11065) ^ (-258827790);
                        i2 = 1288036562;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -669062822:
                case 1405089956:
                    return false;
                case -661395117:
                case -333192474:
                    return m40387((C21261) viewM11246, i19);
                case -546870052:
                case 1091305977:
                    i21 = 423;
                    if (C1080.m4050()) {
                        iM3169 = C0619.m2761("᩹ܶ") ^ i12;
                        i = ((iM3169 ^ i13) * (-20051)) ^ 1868575101;
                        i2 = 2123816979;
                    } else {
                        iM3169 = (C0773.m3169("ܳ۬") + i12) * (-95);
                        i = ((iM3169 ^ i13) * 11065) ^ (-258827790);
                        i2 = 1288036562;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -382613816:
                case 1049333725:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("᩶᩻") ^ i13;
                        i = ((iM3169 ^ i12) * 4899) ^ (-945317777);
                        i2 = -2062144873;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۘ") ^ i13) * 45;
                        i = ((iM3169 ^ i12) * 15519) ^ (-1882554427);
                        i2 = 124269407;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case -362908806:
                case 296271600:
                    i16 = i16;
                    arrayListM53408 = arrayList3;
                    i5 = i28;
                    i17 = i17;
                    i25 = i25;
                    if (i25 != C3448.m11247(arrayListM53408) - 1) {
                        i26 = i25;
                        iM31610 = (C0773.m3169("ۚۡ") ^ i12) * (-11);
                        sArr3 = sArr3;
                        i7 = ((iM31610 ^ i13) * 23913) ^ 168861;
                        i8 = -1542412578;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i214 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i214;
                        int i318 = i16;
                        i15 = i11;
                        i16 = i318;
                    } else {
                        sArr = sArr3;
                        i28 = i5;
                        view = decorView;
                        arrayList2 = arrayListM53408;
                        i9 = i25;
                        int iM31613 = (C0773.m3169("۬ۤ") ^ i13) * (-75);
                        i10 = ((iM31613 ^ i12) * 24345) ^ 30580230;
                        i11 = iM31613 ^ (-1735156176);
                        short[] sArr17 = sArr;
                        i25 = i9;
                        i14 = i10;
                        i17 = i17;
                        arrayList3 = arrayList2;
                        decorView = view;
                        sArr3 = sArr17;
                        int i319 = i16;
                        i15 = i11;
                        i16 = i319;
                    }
                    break;
                case -255387129:
                case 1391190409:
                    if (C3734.f12817 < 0) {
                        i16 = i16;
                        i28 = i28;
                        ArrayList arrayList11 = arrayList3;
                        i17 = i17;
                        i25 = i25;
                        sArr3 = sArr3;
                        decorView = decorView;
                        arrayList = arrayList11;
                        iM2761 = C0773.m3169("᩶ۘ") ^ i12;
                        i3 = ((iM2761 ^ i13) * (-6001)) ^ (-255906131);
                        i4 = 1735628165;
                        int i3110 = iM2761 ^ i4;
                        i28 = i28;
                        i6 = i16;
                        i15 = i3110;
                        i14 = i3;
                        i16 = i6;
                        short[] sArr18 = sArr3;
                        i25 = i25;
                        i17 = i17;
                        arrayList3 = arrayList;
                        decorView = decorView;
                        sArr3 = sArr18;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۘ") ^ i13) * 45;
                        i = ((iM3169 ^ i12) * 15519) ^ (-1882554427);
                        i2 = 124269407;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case 375056264:
                case 1523105204:
                    name = C17202.m40369(view2).getName();
                    sArr4 = f56034;
                    i16 = 435;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ܳ۬") + i12) * (-95);
                        i = ((iM3169 ^ i13) * 11065) ^ (-258827790);
                        i2 = 1288036562;
                    } else {
                        iM3169 = (i13 - C0773.m3169("ۢۙ")) * (-81);
                        i = ((iM3169 ^ i12) * (-26509)) ^ 1212717132;
                        i2 = -120980480;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 636322719:
                case 1921067729:
                    arrayList = arrayList3;
                    i20 = 13315;
                    iM2761 = C0619.m2761("֡ۨ") ^ i13;
                    i3 = ((iM2761 ^ i12) * 22887) ^ (-553060151);
                    i4 = -1809467058;
                    int i3111 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i3111;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr19 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr19;
                    break;
                case 772894347:
                case 2030652744:
                    C0773.m3161();
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0773.m3169("ܳ۬") + i12) * (-95);
                        i = ((iM3169 ^ i13) * 11065) ^ (-258827790);
                        i2 = 1288036562;
                    } else {
                        iM3169 = C0619.m2761("᩻۟") ^ i13;
                        i = ((iM3169 ^ i12) * 3039) ^ 1122128434;
                        i2 = -1765595610;
                    }
                    i15 = iM3169 ^ i2;
                    i14 = i;
                    break;
                case 938744802:
                case 1313494422:
                    if (!C2966.m9659(name2, C3033.m9847(sArr2, i21, 9, i20))) {
                        arrayListM53408 = arrayList3;
                        i5 = i28;
                        i17 = i17;
                        i26 = i5;
                        i25 = i25;
                        iM31610 = (C0773.m3169("ۚۡ") ^ i12) * (-11);
                        sArr3 = sArr3;
                        i7 = ((iM31610 ^ i13) * 23913) ^ 168861;
                        i8 = -1542412578;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i215 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i215;
                        int i3112 = i16;
                        i15 = i11;
                        i16 = i3112;
                    } else {
                        iM3169 = (C0619.m2761("᩸᩵") ^ i13) * 79;
                        i = ((iM3169 ^ i12) * (-17155)) ^ 1192829136;
                        i2 = -1445976024;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case 1466977564:
                case 1778835218:
                    if (C2878.m9482(view2) <= 0) {
                        arrayListM53408 = arrayList3;
                        i5 = i28;
                        i17 = i17;
                        i26 = i5;
                        i25 = i25;
                        iM31610 = (C0773.m3169("ۚۡ") ^ i12) * (-11);
                        sArr3 = sArr3;
                        i7 = ((iM31610 ^ i13) * 23913) ^ 168861;
                        i8 = -1542412578;
                        i11 = iM31610 ^ i8;
                        i28 = i5;
                        int i216 = i17;
                        arrayList3 = arrayListM53408;
                        i14 = i7;
                        sArr3 = sArr3;
                        i25 = i25;
                        i17 = i216;
                        int i3113 = i16;
                        i15 = i11;
                        i16 = i3113;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ᩺") + i12) * 51;
                        i = ((iM3169 ^ i13) * (-10961)) ^ (-755987202);
                        i2 = 1527141234;
                        i15 = iM3169 ^ i2;
                        i14 = i;
                    }
                    break;
                case 1607671931:
                case 1966760116:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList12 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList12;
                    sArr5 = f56034;
                    c = 422;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("᩸ۜ") ^ i12;
                        i3 = ((iM2761 ^ i13) * 17505) ^ (-1975394914);
                        i4 = 1459400400;
                    } else {
                        iM2761 = (C0619.m2761("۫ܽ") + i12) * (-119);
                        i3 = ((iM2761 ^ i13) * (-875)) ^ (-1677730901);
                        i4 = 16075715;
                    }
                    int i3114 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i3114;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr110 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr110;
                    break;
                case 1716177143:
                case 2093184185:
                    i16 = i16;
                    ArrayList arrayList13 = arrayList3;
                    int i41 = i26 + 1;
                    if (i41 < C2834.m9336(arrayList13)) {
                        int iM31614 = C0773.m3169("ᩳ۬") ^ i13;
                        i28 = i41;
                        arrayList3 = arrayList13;
                        i14 = ((iM31614 ^ i12) * 26149) ^ 1710165662;
                        i16 = i16;
                        i15 = iM31614 ^ (-1453715440);
                    } else {
                        i28 = i41;
                        i17 = i17;
                        View view3 = decorView;
                        arrayList2 = arrayList13;
                        i9 = i25;
                        sArr = sArr3;
                        view = view3;
                        int iM31615 = (C0773.m3169("۬ۤ") ^ i13) * (-75);
                        i10 = ((iM31615 ^ i12) * 24345) ^ 30580230;
                        i11 = iM31615 ^ (-1735156176);
                        short[] sArr111 = sArr;
                        i25 = i9;
                        i14 = i10;
                        i17 = i17;
                        arrayList3 = arrayList2;
                        decorView = view;
                        sArr3 = sArr111;
                        int i3115 = i16;
                        i15 = i11;
                        i16 = i3115;
                    }
                    break;
                default:
                    i16 = i16;
                    i28 = i28;
                    ArrayList arrayList14 = arrayList3;
                    i17 = i17;
                    i25 = i25;
                    sArr3 = sArr3;
                    decorView = decorView;
                    arrayList = arrayList14;
                    i23 = i22 * i22;
                    i24 = s * 2;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i13 - C0619.m2761("ܺۘ")) * 81;
                        i3 = ((iM2761 ^ i12) * 31899) ^ (-676064961);
                        i4 = -181470256;
                    } else {
                        iM2761 = C0619.m2761("᩹ۧ") ^ i12;
                        i3 = ((iM2761 ^ i13) * 27171) ^ 781087459;
                        i4 = -2399946;
                    }
                    int i3116 = iM2761 ^ i4;
                    i28 = i28;
                    i6 = i16;
                    i15 = i3116;
                    i14 = i3;
                    i16 = i6;
                    short[] sArr112 = sArr3;
                    i25 = i25;
                    i17 = i17;
                    arrayList3 = arrayList;
                    decorView = decorView;
                    sArr3 = sArr112;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40419(View view) {
        AbstractC8585 abstractC8585M10091 = null;
        EnumC2619 enumC2619Mo23076 = null;
        int i = 671091063;
        int i2 = AbstractC0116.f1064;
        int i3 = C20932.f66974;
        int iM3169 = C0773.m3169("ᩳ᩻") ^ i3;
        int i4 = ((iM3169 ^ i2) * 3343) ^ (-22448349);
        int i5 = -975849791;
        while (true) {
            i = ((((i ^ i2) * (-20951)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1898398569:
                case -1492727238:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19399) ^ (-1734834319);
                        i5 = -923417219;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۚ᩸")) * (-51);
                        i4 = ((iM3169 ^ i3) * (-11169)) ^ (-679701555);
                        i5 = 91649830;
                    }
                    break;
                case -1782063842:
                case 283203972:
                    if (view instanceof C24943) {
                        iM3169 = (i2 - C0773.m3169("۠ۘ")) * 57;
                        i4 = ((iM3169 ^ i3) * (-1895)) ^ 652843064;
                        i5 = -1223867224;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۬") ^ i3) * (-91);
                        i4 = ((iM3169 ^ i2) * 21805) ^ 1333919802;
                        i5 = -1349050502;
                    }
                    break;
                case -1474291726:
                case -255488923:
                    f56035 = new WeakReference(view);
                    iM3169 = C0773.m3169("᩺ۡ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-19891)) ^ 1374234045;
                    i5 = 1322001340;
                    break;
                case -1401859712:
                case 1726170207:
                    Class clsM40369 = C17202.m40369(view);
                    if (C3690.f12684 > 0) {
                        throw new IllegalArgumentException(C2023.m6952(clsM40369));
                    }
                    iM3169 = C0619.m2761("ۖܶ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 27383) ^ (-1023339861);
                    i5 = -70327124;
                    break;
                case -1194605436:
                case -3096016:
                    C23916.m53419();
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ۘۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6757) ^ (-1666064378);
                        i5 = 1854735980;
                    } else {
                        iM3169 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19567)) ^ (-1934013963);
                        i5 = 1281107484;
                    }
                    break;
                case -955392247:
                case 2060216230:
                    C3033.m9845();
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = C0619.m2761("ۖܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27383) ^ (-1023339861);
                        i5 = -70327124;
                    } else {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19399) ^ (-1734834319);
                        i5 = -923417219;
                    }
                    break;
                case -856955682:
                case 1681014053:
                    C0773.m3161();
                    C2354.m7983();
                    iM3169 = C0773.m3169("ᩳۤ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-19567)) ^ (-1934013963);
                    i5 = 1281107484;
                    break;
                case -630158887:
                case 1356041488:
                    if (enumC2619Mo23076.m8762(EnumC2619.STARTED)) {
                        iM3169 = (i2 - C0619.m2761("᩶֡")) * (-61);
                        i4 = ((iM3169 ^ i3) * (-29039)) ^ 1714221441;
                        i5 = -173548714;
                    } else {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19891)) ^ 1374234045;
                        i5 = 1322001340;
                    }
                    break;
                case -283496404:
                case 1882853808:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19567)) ^ (-1934013963);
                        i5 = 1281107484;
                    } else {
                        iM3169 = C0619.m2761("۬᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27251) ^ 329428188;
                        i5 = 975659582;
                    }
                    break;
                case -269951248:
                case 729120480:
                    if (C1826.m6301() >= 0) {
                        iM3169 = C0619.m2761("᩸ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6331)) ^ (-1909369903);
                        i5 = 1342411900;
                    } else {
                        iM3169 = (C0619.m2761("ۚۧ") + i2) * (-71);
                        i4 = ((iM3169 ^ i3) * 25145) ^ (-1910961781);
                        i5 = -2016303149;
                    }
                    break;
                case 814406627:
                case 1177858079:
                    if (C1343.m4943()) {
                        iM3169 = (i3 - C0773.m3169("ۢۛ")) * 127;
                        i4 = ((iM3169 ^ i2) * (-13139)) ^ (-1963766538);
                        i5 = 138412493;
                    } else {
                        iM3169 = C0619.m2761("ۘۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6757) ^ (-1666064378);
                        i5 = 1854735980;
                    }
                    break;
                case 862599289:
                case 1196404199:
                    if (view instanceof C24132) {
                        iM3169 = (i2 - C0773.m3169("۠ۘ")) * 57;
                        i4 = ((iM3169 ^ i3) * (-1895)) ^ 652843064;
                        i5 = -1223867224;
                    } else {
                        iM3169 = (C0619.m2761("ۨۢ") ^ i3) * 69;
                        i4 = ((iM3169 ^ i2) * (-20913)) ^ (-234658765);
                        i5 = 482761509;
                    }
                    break;
                case 946257469:
                case 1559980370:
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("ۘۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6757) ^ (-1666064378);
                        i5 = 1854735980;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12873) ^ (-234141932);
                        i5 = 1828227083;
                    }
                    break;
                case 1029847954:
                case 1145115671:
                    C3448.m11248();
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19399) ^ (-1734834319);
                        i5 = -923417219;
                    } else {
                        iM3169 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19567)) ^ (-1934013963);
                        i5 = 1281107484;
                    }
                    break;
                case 1043951243:
                case 1618068423:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19399) ^ (-1734834319);
                        i5 = -923417219;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * 541) ^ (-787795177);
                        i5 = 1178240142;
                    }
                    break;
                case 1217112021:
                case 1720964168:
                    RunnableC1848.m6360();
                    return;
                case 1255269799:
                case 2035646876:
                    return;
                case 1315208681:
                case 1828102837:
                    if (C4282.m13644()) {
                        iM3169 = (C0619.m2761("᩹ۜ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM3169 ^ i2) * (-5085)) ^ (-2028563535);
                        i5 = 1795783455;
                    } else {
                        iM3169 = C0619.m2761("ۖܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27383) ^ (-1023339861);
                        i5 = -70327124;
                    }
                    break;
                case 1648511417:
                case 2113579178:
                    enumC2619Mo23076 = abstractC8585M10091.mo23076();
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0619.m2761("᩸ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6331)) ^ (-1909369903);
                        i5 = 1342411900;
                    } else {
                        iM3169 = (C0619.m2761("ۚ᩷") ^ i3) * 109;
                        i4 = ((iM3169 ^ i2) * 6491) ^ (-671725723);
                        i5 = -493036895;
                    }
                    break;
                default:
                    this.f56038 = view;
                    abstractC8585M10091 = C3099.m10091(this);
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("ᩳۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19567)) ^ (-1934013963);
                        i5 = 1281107484;
                    } else {
                        iM3169 = C0773.m3169("۟᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 31131) ^ 493520339;
                        i5 = 2045033071;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m40414() {
        AbstractC8585 abstractC8585M4858 = null;
        EnumC2619 enumC2619Mo23076 = null;
        ?? r2 = 0;
        WeakReference weakReference = null;
        int i = -1825590811;
        int i2 = AbstractC3624.f12429;
        int i3 = C2419.f7754;
        int iM2761 = (C0619.m2761("᩷ۙ") ^ i2) * (-65);
        int i4 = ((iM2761 ^ i3) * (-17985)) ^ 190340638;
        int i5 = -398996949;
        while (true) {
            int i6 = iM2761 ^ i5;
            r2 = r2;
            while (true) {
                i = ((((i ^ i3) * 29283) >> 31) & i4) ^ i6;
                switch (i) {
                    case -1981087872:
                    case 1165487321:
                        if (C11235.m28309() == 0) {
                            iM2761 = (C0619.m2761("ۢۜ") + i3) * 67;
                            i4 = ((iM2761 ^ i2) * (-16431)) ^ (-2005936362);
                            i5 = 275362902;
                        } else {
                            iM2761 = C0619.m2761("ܳۢ") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-2721)) ^ (-1465267468);
                            i5 = -1967725207;
                        }
                        break;
                    case -1785385434:
                    case 1542602261:
                        C1519.m5403();
                        C3099.m10095();
                        break;
                    case -1638806007:
                    case -1050990420:
                        C1783.m6232();
                        if (RunnableC0334.f1808 <= 0) {
                            iM2761 = C0773.m3169("ۢܳ") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-16155)) ^ (-670048208);
                            i5 = -1238129534;
                        } else {
                            iM2761 = (C0619.m2761("ܺᩳ") ^ i3) * 101;
                            i4 = ((iM2761 ^ i2) * (-27987)) ^ (-1711173035);
                            i5 = 1944544014;
                        }
                        break;
                    case -1554009750:
                    case -1476854246:
                        if (C1564.f5401 > 0) {
                            iM2761 = (C0773.m3169("۫۟") ^ i2) * (-87);
                            i4 = ((iM2761 ^ i3) * 14315) ^ 70098531;
                            i5 = 733607248;
                        } else {
                            iM2761 = C0773.m3169("ۢܳ") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-16155)) ^ (-670048208);
                            i5 = -1238129534;
                        }
                        break;
                    case -1527921199:
                    case -1221130571:
                        C1343.m4943();
                        if (C0487.m2356() >= 0) {
                            iM2761 = C0619.m2761("ۡᩳ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-5925)) ^ (-1476455735);
                            i5 = 1826890601;
                        } else {
                            iM2761 = (C0619.m2761("ܶۤ") ^ i2) * (-77);
                            i4 = ((iM2761 ^ i3) * 19373) ^ (-41918563);
                            i5 = 1921719225;
                        }
                        break;
                    case -1502326383:
                    case 429442334:
                        if (C4238.f15451 < 0) {
                            iM2761 = C0773.m3169("ۗ᩵") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-28055)) ^ (-328611256);
                            i5 = -1746896555;
                        } else {
                            iM2761 = (C0619.m2761("ܶۤ") ^ i2) * (-77);
                            i4 = ((iM2761 ^ i3) * 19373) ^ (-41918563);
                            i5 = 1921719225;
                        }
                        break;
                    case -1487373922:
                    case -460124847:
                        C2878.m9491();
                        iM2761 = (C0619.m2761("ܶۤ") ^ i2) * (-77);
                        i4 = ((iM2761 ^ i3) * 19373) ^ (-41918563);
                        i5 = 1921719225;
                        break;
                    case -1382957395:
                    case -549719949:
                        enumC2619Mo23076 = abstractC8585M4858.mo23076();
                        if (!RunnableC1848.f6235) {
                            iM2761 = C0773.m3169("᩹ۧ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-27153)) ^ 1672244844;
                            i5 = 1841675005;
                        } else {
                            iM2761 = C0619.m2761("ܳۢ") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-2721)) ^ (-1465267468);
                            i5 = -1967725207;
                        }
                        break;
                    case -996122912:
                    case 438864017:
                        if (C2485.f7950 == 0) {
                            iM2761 = (i3 - C0773.m3169("۠ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i4 = ((iM2761 ^ i2) * 21961) ^ 172087979;
                            i5 = -204202838;
                        } else {
                            iM2761 = C0619.m2761("ۡᩳ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-5925)) ^ (-1476455735);
                            i5 = 1826890601;
                        }
                        break;
                    case -768078551:
                    case -510411668:
                        if (C3998.f13671 == 0) {
                            iM2761 = (C0773.m3169("᩺᩹") ^ i3) * 67;
                            i4 = ((iM2761 ^ i2) * 18521) ^ (-1774170515);
                            i5 = -1858166634;
                        } else {
                            iM2761 = (C0619.m2761("ܶۤ") ^ i2) * (-77);
                            i4 = ((iM2761 ^ i3) * 19373) ^ (-41918563);
                            i5 = 1921719225;
                        }
                        break;
                    case -671814713:
                    case -441368327:
                        if (!enumC2619Mo23076.m8762(EnumC2619.STARTED)) {
                            r2 = 0;
                            iM2761 = (i2 - C0619.m2761("᩻ۙ")) * (-123);
                            i4 = ((iM2761 ^ i3) * 30405) ^ 2009885301;
                            i5 = 1844114102;
                        }
                        int iM2762 = C0619.m2761("۫ܰ") ^ i3;
                        i4 = ((iM2762 ^ i2) * 18591) ^ 796320723;
                        i6 = iM2762 ^ 349863313;
                        r2 = 0;
                        break;
                        break;
                    case -586061926:
                    case 888600587:
                        f56035 = r2;
                        iM2761 = (i2 - C0619.m2761("᩻ۙ")) * (-123);
                        i4 = ((iM2761 ^ i3) * 30405) ^ 2009885301;
                        i5 = 1844114102;
                        break;
                    case -344762230:
                    case -6162959:
                        this.f56038 = r2;
                        break;
                    case -35761191:
                    case 1324317468:
                        C1564.m5509();
                        if (!RunnableC1848.f6235) {
                            iM2761 = C0619.m2761("ۡᩳ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-5925)) ^ (-1476455735);
                            i5 = 1826890601;
                            break;
                        }
                        iM2761 = (C0619.m2761("ܺᩳ") ^ i3) * 101;
                        i4 = ((iM2761 ^ i2) * (-27987)) ^ (-1711173035);
                        i5 = 1944544014;
                        break;
                    case -5798521:
                    case 530011809:
                        if (C0773.f2792 > 0) {
                            iM2761 = C0773.m3169("֨۟") ^ i2;
                            i4 = ((iM2761 ^ i3) * 18121) ^ (-1143902799);
                            i5 = -1797886578;
                        } else {
                            iM2761 = (C0619.m2761("ܺᩳ") ^ i3) * 101;
                            i4 = ((iM2761 ^ i2) * (-27987)) ^ (-1711173035);
                            i5 = 1944544014;
                        }
                        break;
                    case 185613841:
                    case 1242237443:
                        if (C2288.f7433 > 0) {
                            iM2761 = (C0773.m3169("᩵֫") + i2) * 23;
                            i4 = ((iM2761 ^ i3) * 6029) ^ 1197209019;
                            i5 = -1745957447;
                        } else {
                            iM2761 = (C0619.m2761("ܶۤ") ^ i2) * (-77);
                            i4 = ((iM2761 ^ i3) * 19373) ^ (-41918563);
                            i5 = 1921719225;
                        }
                        break;
                    case 666892745:
                    case 722602601:
                        if (!C2023.f6737) {
                            iM2761 = C0773.m3169("۠ܿ") ^ i2;
                            i4 = ((iM2761 ^ i3) * EnumC5810.f19979) ^ (-1874729848);
                            i5 = -1890735755;
                        } else {
                            iM2761 = C0619.m2761("ۡᩳ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-5925)) ^ (-1476455735);
                            i5 = 1826890601;
                        }
                        break;
                    case 1039798859:
                    case 1175251610:
                        if (weakReference.get() != this.f56038) {
                            iM2761 = (i2 - C0619.m2761("᩻ۙ")) * (-123);
                            i4 = ((iM2761 ^ i3) * 30405) ^ 2009885301;
                            i5 = 1844114102;
                            break;
                        }
                        iM2761 = C0773.m3169("᩺᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12685) ^ (-841839332);
                        i5 = -1761672431;
                        break;
                    case 1354368851:
                    case 1796920259:
                        abstractC8585M4858 = C1321.m4858(this);
                        if (C1542.f5343 > 0) {
                            iM2761 = C0773.m3169("ܽۨ") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-28841)) ^ 1244865272;
                            i5 = -1434554131;
                        } else {
                            iM2761 = C0619.m2761("ܳۢ") ^ i2;
                            i4 = ((iM2761 ^ i3) * (-2721)) ^ (-1465267468);
                            i5 = -1967725207;
                        }
                        break;
                    default:
                        weakReference = f56035;
                        if (weakReference == null) {
                            iM2761 = (i2 - C0619.m2761("᩻ۙ")) * (-123);
                            i4 = ((iM2761 ^ i3) * 30405) ^ 2009885301;
                            i5 = 1844114102;
                            break;
                        }
                        iM2761 = C0773.m3169("᩶ܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10475)) ^ 317925829;
                        i5 = -830992236;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m40392() {
        return this.f56051;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo110(C2813 c2813) {
        short[] sArr;
        int iM3169;
        int i;
        int iM31610;
        int i2;
        int iM31611;
        int i3;
        int i4;
        int i5;
        int iM2761;
        int i6;
        C2813 c2814 = c2813;
        int i7 = C11235.f35427;
        int i8 = C2702.f8586;
        int iM2762 = (i7 - C0619.m2761("᩷ۗ")) * 101;
        int i9 = ((iM2762 ^ i8) * (-20057)) ^ 1584469324;
        DialogInterfaceOnClickListenerC10689 dialogInterfaceOnClickListenerC10689 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i10 = iM2762 ^ (-198216679);
        int iM31612 = 0;
        int iM2763 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        int i16 = 0;
        int i17 = -1279407686;
        int i18 = 0;
        DialogInterfaceOnClickListenerC21878 dialogInterfaceOnClickListenerC21878 = null;
        C2361 c2361M3794 = null;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i8) * (-25337)) >> 31));
            switch (i17) {
                case -2082191493:
                case -1106738418:
                    sArr3 = sArr3;
                    i18 = i18;
                    int i19 = (s * s) + 122744241;
                    if ((i16 * i16) - (i19 + i19) > 0) {
                        iM3169 = C0619.m2761("᩶᩹") ^ i8;
                        i9 = ((iM3169 ^ i7) * 28155) ^ (-2014020196);
                        i = -1394321327;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۜ") ^ i7) * (-43);
                        i9 = ((iM3169 ^ i8) * 2173) ^ (-620336543);
                        i = -174505357;
                    }
                    int i20 = iM3169 ^ i;
                    i18 = i18;
                    sArr3 = sArr3;
                    i10 = i20;
                    c2814 = c2813;
                    break;
                case -1966601125:
                case 1096960219:
                    C13473.m33136(c2361M3794, 2116090588 ^ iM31612);
                    sArr4 = f56034;
                    i12 = 291;
                    if (C11235.f35427 < 0) {
                        iM31611 = (C0773.m3169("۫ۖ") ^ i7) * (-75);
                        i3 = ((iM31611 ^ i8) * 11793) ^ (-2102158700);
                        i4 = -992212876;
                        i10 = iM31611 ^ i4;
                        c2814 = c2813;
                        i9 = i3;
                    } else {
                        iM31610 = C0619.m2761("ܿۧ") ^ i7;
                        i9 = ((iM31610 ^ i8) * 27657) ^ (-267182496);
                        i2 = -1689891206;
                        i10 = iM31610 ^ i2;
                        c2814 = c2813;
                    }
                    break;
                case -1858525223:
                case 98085885:
                    sArr3 = sArr3;
                    i18 = i18;
                    sArr2 = f56034;
                    c = 287;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i8 - C0619.m2761("۟ۡ")) * (-35);
                        i9 = ((iM3169 ^ i7) * (-27057)) ^ (-2056392439);
                        i = -1440269221;
                    } else {
                        iM3169 = C0619.m2761("ܶ۠") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-26921)) ^ (-1163727558);
                        i = 1123650112;
                    }
                    int i21 = iM3169 ^ i;
                    i18 = i18;
                    sArr3 = sArr3;
                    i10 = i21;
                    c2814 = c2813;
                    break;
                case -1582642038:
                case -1102436262:
                    i14 = 25868;
                    iM3169 = (C0619.m2761("᩷᩻") + i7) * 51;
                    i9 = ((iM3169 ^ i8) * 9069) ^ (-89115420);
                    i = -1934625263;
                    int i22 = iM3169 ^ i;
                    i18 = i18;
                    sArr3 = sArr3;
                    i10 = i22;
                    c2814 = c2813;
                    break;
                case -1546375541:
                case 1473914976:
                    C1564.m5509();
                    if (C0487.f2131 > 0) {
                        iM31610 = C0619.m2761("ܿۧ") ^ i7;
                        i9 = ((iM31610 ^ i8) * 27657) ^ (-267182496);
                        i2 = -1689891206;
                        i10 = iM31610 ^ i2;
                        c2814 = c2813;
                    } else {
                        sArr = sArr3;
                        i18 = i18;
                        int iM2764 = C0619.m2761("᩸ۜ") ^ i7;
                        short[] sArr7 = sArr;
                        i9 = ((iM2764 ^ i8) * 12769) ^ (-1197602494);
                        i18 = i18;
                        c2814 = c2813;
                        i10 = iM2764 ^ 2122399657;
                        sArr3 = sArr7;
                    }
                    break;
                case -1428502997:
                case -586143186:
                    mo3459();
                    break;
                case -1294770839:
                case 1769708826:
                    RunnableC3055.m9933();
                    sArr = sArr3;
                    i18 = i18;
                    int iM2765 = C0619.m2761("᩸ۜ") ^ i7;
                    short[] sArr8 = sArr;
                    i9 = ((iM2765 ^ i8) * 12769) ^ (-1197602494);
                    i18 = i18;
                    c2814 = c2813;
                    i10 = iM2765 ^ 2122399657;
                    sArr3 = sArr8;
                    break;
                case -952895465:
                case 494500468:
                    if (C2375.f7641 <= 0) {
                        iM31611 = (C0619.m2761("ۧۨ") + i8) * (-43);
                        i3 = ((iM31611 ^ i7) * (-31165)) ^ (-71083276);
                        i4 = -2098998847;
                        i10 = iM31611 ^ i4;
                        c2814 = c2813;
                        i9 = i3;
                    } else {
                        sArr = sArr3;
                        i18 = i18;
                        int iM2766 = C0619.m2761("᩸ۜ") ^ i7;
                        short[] sArr9 = sArr;
                        i9 = ((iM2766 ^ i8) * 12769) ^ (-1197602494);
                        i18 = i18;
                        c2814 = c2813;
                        i10 = iM2766 ^ 2122399657;
                        sArr3 = sArr9;
                    }
                    break;
                case -855039908:
                case 1012742394:
                    sArr = sArr3;
                    i18 = i18;
                    iM31612 = C0773.m3169(C3998.m12925(sArr, i18, i15, i14));
                    if (C0487.f2131 > 0) {
                        sArr3 = sArr;
                        iM3169 = (C0773.m3169("᩶۠") ^ i8) * 63;
                        i9 = ((iM3169 ^ i7) * (-11437)) ^ 825424922;
                        i = 1505838257;
                        int i23 = iM3169 ^ i;
                        i18 = i18;
                        sArr3 = sArr3;
                        i10 = i23;
                        c2814 = c2813;
                    } else {
                        int iM2767 = C0619.m2761("᩸ۜ") ^ i7;
                        short[] sArr10 = sArr;
                        i9 = ((iM2767 ^ i8) * 12769) ^ (-1197602494);
                        i18 = i18;
                        c2814 = c2813;
                        i10 = iM2767 ^ 2122399657;
                        sArr3 = sArr10;
                    }
                    break;
                case -820574407:
                case 2056973017:
                    sArr3 = sArr3;
                    i18 = i18;
                    if (c2813.m9285()) {
                        iM3169 = (C0619.m2761("᩶۟") + i8) * 67;
                        i9 = ((iM3169 ^ i7) * 12079) ^ 1148179918;
                        i = -1548961603;
                    } else {
                        iM3169 = C0773.m3169("ᩴۚ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 16361) ^ 794816699;
                        i = -491316367;
                    }
                    int i24 = iM3169 ^ i;
                    i18 = i18;
                    sArr3 = sArr3;
                    i10 = i24;
                    c2814 = c2813;
                    break;
                case -593186196:
                case 134727808:
                    RunnableC1848.m6359(c2361M3794, iM2763 ^ i11, dialogInterfaceOnClickListenerC10689);
                    C11235.m28306(c2361M3794, false);
                    C3099.m10090(c2361M3794);
                    break;
                case -460721874:
                case 202242971:
                    i14 = 34836;
                    iM3169 = (C0619.m2761("᩷᩻") + i7) * 51;
                    i9 = ((iM3169 ^ i8) * 9069) ^ (-89115420);
                    i = -1934625263;
                    int i25 = iM3169 ^ i;
                    i18 = i18;
                    sArr3 = sArr3;
                    i10 = i25;
                    c2814 = c2813;
                    break;
                case -329238631:
                case -240817961:
                    C4282.m13644();
                    break;
                case 25100136:
                case 416428911:
                    C3492.m11487(c2361M3794, C0619.m2761(C0773.m3166(sArr5, i13, 3, i14)) ^ 2130363757, dialogInterfaceOnClickListenerC21878);
                    if (C3492.f12043 > 0) {
                        iM2761 = C0619.m2761("֨᩸") ^ i7;
                        i3 = ((iM2761 ^ i8) * 13505) ^ 1572778183;
                        i6 = -112902999;
                        i10 = iM2761 ^ i6;
                        i9 = i3;
                    } else {
                        int iM2768 = (C0619.m2761("ۧܺ") ^ i7) * 77;
                        i5 = ((iM2768 ^ i8) * 4867) ^ 1878441142;
                        i10 = iM2768 ^ (-378385172);
                        i9 = i5;
                        c2814 = c2813;
                    }
                    break;
                case 161782438:
                case 757975718:
                    if (C4238.f15451 >= 0) {
                        sArr3 = sArr3;
                        i18 = i18;
                        iM3169 = (i8 - C0619.m2761("۟ۡ")) * (-35);
                        i9 = ((iM3169 ^ i7) * (-27057)) ^ (-2056392439);
                        i = -1440269221;
                        int i26 = iM3169 ^ i;
                        i18 = i18;
                        sArr3 = sArr3;
                        i10 = i26;
                        c2814 = c2813;
                    } else {
                        sArr = sArr3;
                        i18 = i18;
                        int iM2769 = C0619.m2761("᩸ۜ") ^ i7;
                        short[] sArr11 = sArr;
                        i9 = ((iM2769 ^ i8) * 12769) ^ (-1197602494);
                        i18 = i18;
                        c2814 = c2813;
                        i10 = iM2769 ^ 2122399657;
                        sArr3 = sArr11;
                    }
                    break;
                case 167422031:
                case 1964519374:
                    iM2763 = C0619.m2761(C11235.m28300(sArr6, 297, 3, i14));
                    i11 = 2119393598;
                    if (C2485.f7950 == 0) {
                        iM2761 = (C0619.m2761("۬᩵") ^ i8) * 35;
                        i3 = ((iM2761 ^ i7) * 32029) ^ (-148110221);
                        i6 = -284503489;
                        i10 = iM2761 ^ i6;
                        i9 = i3;
                    }
                    iM31611 = (C0619.m2761("ۧۨ") + i8) * (-43);
                    i3 = ((iM31611 ^ i7) * (-31165)) ^ (-71083276);
                    i4 = -2098998847;
                    i10 = iM31611 ^ i4;
                    c2814 = c2813;
                    i9 = i3;
                    break;
                case 260575698:
                case 1806157357:
                    dialogInterfaceOnClickListenerC10689 = new DialogInterfaceOnClickListenerC10689(1, c2814);
                    sArr6 = f56034;
                    if (C1343.f4799 == 0) {
                        iM2761 = C0619.m2761("ۗ᩸") ^ i8;
                        i3 = ((iM2761 ^ i7) * 209) ^ 278472760;
                        i6 = 1031153395;
                        i10 = iM2761 ^ i6;
                        i9 = i3;
                    } else {
                        sArr = sArr3;
                        i18 = i18;
                        int iM27610 = C0619.m2761("᩸ۜ") ^ i7;
                        short[] sArr12 = sArr;
                        i9 = ((iM27610 ^ i8) * 12769) ^ (-1197602494);
                        i18 = i18;
                        c2814 = c2813;
                        i10 = iM27610 ^ 2122399657;
                        sArr3 = sArr12;
                    }
                    break;
                case 861418655:
                case 1139383500:
                    C3099.m10082(c2361M3794, C0773.m3169(C1343.m4939(sArr4, i12, 3, i14)) ^ 2124333580);
                    if (C3077.f9998) {
                        iM31611 = (C0619.m2761("۠ܿ") + i8) * 75;
                        i3 = ((iM31611 ^ i7) * (-18283)) ^ 235638040;
                        i4 = 1472638993;
                    } else {
                        iM31611 = (C0619.m2761("ۧۨ") + i8) * (-43);
                        i3 = ((iM31611 ^ i7) * (-31165)) ^ (-71083276);
                        i4 = -2098998847;
                    }
                    i10 = iM31611 ^ i4;
                    c2814 = c2813;
                    i9 = i3;
                    break;
                case 951749065:
                case 1450416466:
                    c2361M3794 = C0950.m3794(this);
                    sArr3 = f56034;
                    i18 = 288;
                    i15 = 3;
                    if (C0773.f2792 <= 0) {
                        iM31610 = C0619.m2761("ܿۧ") ^ i7;
                        i9 = ((iM31610 ^ i8) * 27657) ^ (-267182496);
                        i2 = -1689891206;
                    } else {
                        iM31610 = (C0773.m3169("ܿ᩵") + i7) * (-75);
                        i9 = ((iM31610 ^ i8) * 28911) ^ (-944779404);
                        i2 = -886284792;
                    }
                    i10 = iM31610 ^ i2;
                    c2814 = c2813;
                    break;
                case 1410320609:
                case 1870185464:
                    dialogInterfaceOnClickListenerC21878 = new DialogInterfaceOnClickListenerC21878(this, c2814);
                    sArr5 = f56034;
                    i13 = 294;
                    if (C2419.f7754 < 0) {
                        iM31611 = (C0619.m2761("۬ܽ") ^ i7) * (-11);
                        i3 = ((iM31611 ^ i8) * (-30387)) ^ (-277156426);
                        i4 = -1460800730;
                        i10 = iM31611 ^ i4;
                        c2814 = c2813;
                        i9 = i3;
                    } else {
                        int iM27611 = (C0619.m2761("ۧܺ") ^ i7) * 77;
                        i5 = ((iM27611 ^ i8) * 4867) ^ 1878441142;
                        i10 = iM27611 ^ (-378385172);
                        i9 = i5;
                        c2814 = c2813;
                    }
                    break;
                default:
                    short[] sArr13 = sArr3;
                    int i27 = i18;
                    short s2 = sArr2[c];
                    int i28 = s2 + 11079;
                    if (!C2878.f9462) {
                        int iM31613 = C0773.m3169("ܿۢ") ^ i8;
                        i5 = ((iM31613 ^ i7) * (-13001)) ^ 940342920;
                        i18 = i27;
                        sArr3 = sArr13;
                        i10 = iM31613 ^ (-880130236);
                        s = s2;
                        i16 = i28;
                        i9 = i5;
                        c2814 = c2813;
                    } else {
                        s = s2;
                        i16 = i28;
                        i18 = i27;
                        sArr3 = sArr13;
                        iM31610 = C0619.m2761("ܿۧ") ^ i7;
                        i9 = ((iM31610 ^ i8) * 27657) ^ (-267182496);
                        i2 = -1689891206;
                        i10 = iM31610 ^ i2;
                        c2814 = c2813;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = false;
        boolean z2 = false;
        C3347 c3347M30693 = null;
        C3347 c3347M30694 = null;
        C17930 c17930 = null;
        Display defaultDisplay = null;
        Point point = null;
        int i = 1281326261;
        int i2 = C2288.f7433;
        int i3 = C0950.f3488;
        int iM2761 = C0619.m2761("ᩳ᩵") ^ i2;
        int i4 = ((iM2761 ^ i3) * 20753) ^ (-865508731);
        int i5 = 1121088651;
        while (true) {
            i = ((((i ^ i3) * (-10485)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2085340285:
                case 585745096:
                    if (C6907.f22903) {
                        iM2761 = C0773.m3169("۬ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11351)) ^ 1101825272;
                        i5 = 32237546;
                    } else {
                        iM2761 = C0773.m3169("ۨۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14493)) ^ 1594534188;
                        i5 = -1611138621;
                    }
                    break;
                case -2032780790:
                case 1723135148:
                    z2 = true;
                    iM2761 = C0773.m3169("ۙ֨") ^ i3;
                    i4 = ((iM2761 ^ i2) * 15173) ^ (-1616630994);
                    i5 = -1876111208;
                    break;
                case -1927748497:
                case -902434137:
                    C2930.m9577(this);
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-15595)) ^ (-866389347);
                        i5 = -1106222510;
                    } else {
                        iM2761 = C0773.m3169("ۢ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-25219)) ^ 2005094966;
                        i5 = -1640304992;
                    }
                    break;
                case -1761237650:
                case 1673076068:
                    c3347M30693 = C12296.m30693(this, new C7288(this));
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-15595)) ^ (-866389347);
                        i5 = -1106222510;
                    } else {
                        iM2761 = C0619.m2761("ۤۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7937) ^ 341230709;
                        i5 = -2075007661;
                    }
                    break;
                case -1367301765:
                case 326807309:
                    this.f56041 = c3347M30693;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1711) ^ (-1414322397);
                        i5 = 1145214395;
                    } else {
                        iM2761 = C0619.m2761("ۗܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17763)) ^ 938166404;
                        i5 = 1592243245;
                    }
                    break;
                case -1307139877:
                case -365870199:
                    C17202.m40372();
                    if (C1146.f4234 < 0) {
                        iM2761 = C0773.m3169("ܿ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22949)) ^ 1120425201;
                        i5 = -1686715644;
                    } else {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1711) ^ (-1414322397);
                        i5 = 1145214395;
                    }
                    break;
                case -1287289392:
                case 148681503:
                    defaultDisplay = getWindowManager().getDefaultDisplay();
                    point = C6907.f22902;
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("ᩳۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16295)) ^ 1633426918;
                        i5 = -1935467195;
                    } else {
                        iM2761 = C0773.m3169("ܿ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22949)) ^ 1120425201;
                        i5 = -1686715644;
                    }
                    break;
                case -1161628197:
                case 1716370976:
                    C4238.m13537(this);
                    iM2761 = (C0619.m2761("ܺܶ") + i2) * (-5);
                    i4 = ((iM2761 ^ i3) * (-869)) ^ 756111231;
                    i5 = 1941446330;
                    break;
                case -1139898901:
                case 2143217994:
                    defaultDisplay.getRealSize(C6907.f22901);
                    C6907.f22903 = z;
                    iM2761 = C0773.m3169("۬ܿ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-11351)) ^ 1101825272;
                    i5 = 32237546;
                    break;
                case -1064625255:
                case 271932954:
                    if (C13473.m33144()) {
                        C0269.m1789(c17930, this, new InterfaceC16438() { // from class: l.ᩴ֡֫
                            @Override // l.InterfaceC16438
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1486(Object obj) {
                                C2813 c2813 = null;
                                int i6 = 2017336186;
                                int i7 = C3734.f12817;
                                int i8 = AbstractC0641.f2496;
                                int iM3169 = C0773.m3169("ܺܿ") ^ i8;
                                int i9 = ((iM3169 ^ i7) * (-27435)) ^ (-2131109309);
                                int i10 = 961622563;
                                while (true) {
                                    i6 = ((((i6 ^ i7) * 4665) >> 31) & i9) ^ (iM3169 ^ i10);
                                    switch (i6) {
                                        case -1856524325:
                                        case 606503610:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM3169 = C0773.m3169("ۖܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 11761) ^ 847656026;
                                                i10 = 104834178;
                                            } else {
                                                iM3169 = C0773.m3169("ۜܶ") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 22783) ^ (-113141163);
                                                i10 = -1517351139;
                                            }
                                            break;
                                        case -1825591002:
                                        case 30763914:
                                            C0619.m2763();
                                            C3492.m11488();
                                            break;
                                        case -1797613393:
                                        case -462607845:
                                            if (c2813.m9288()) {
                                                iM3169 = C0619.m2761("ܿ۠") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 25647) ^ 1255492042;
                                                i10 = 563343503;
                                            } else {
                                                iM3169 = (C0773.m3169("ۧ᩶") + i8) * (-43);
                                                i9 = ((iM3169 ^ i7) * 8315) ^ 267947854;
                                                i10 = 66880555;
                                            }
                                            break;
                                        case -1498324574:
                                        case 1720490068:
                                            C13473.m33144();
                                            C3033.m9845();
                                            iM3169 = C0773.m3169("ۖܳ") ^ i7;
                                            i9 = ((iM3169 ^ i8) * 11761) ^ 847656026;
                                            i10 = 104834178;
                                            break;
                                        case -1421442308:
                                        case -224437728:
                                            this.f62814.mo110(c2813);
                                            iM3169 = (C0773.m3169("ۧ᩶") + i8) * (-43);
                                            i9 = ((iM3169 ^ i7) * 8315) ^ 267947854;
                                            i10 = 66880555;
                                            break;
                                        case -1374951010:
                                        case -362827756:
                                            break;
                                        case -1283178348:
                                        case 928126321:
                                            if (C3099.f10023 <= 0) {
                                                iM3169 = C0773.m3169("ۚܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-569)) ^ 1749284767;
                                                i10 = -149997141;
                                            } else {
                                                iM3169 = C0619.m2761("ᩴۗ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-4571)) ^ 297754665;
                                                i10 = 71588737;
                                            }
                                            break;
                                        case -1254185424:
                                        case 1904203807:
                                            if (C0773.f2792 <= 0) {
                                                iM3169 = C0773.m3169("ۚܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-569)) ^ 1749284767;
                                                i10 = -149997141;
                                            } else {
                                                iM3169 = (i7 - C0773.m3169("᩸ᩳ")) * (-13);
                                                i9 = ((iM3169 ^ i8) * 24495) ^ 1901621750;
                                                i10 = 1404642227;
                                            }
                                            break;
                                        case -1021296463:
                                        case 2076587248:
                                            if (C3690.f12684 <= 0) {
                                                iM3169 = (C0773.m3169("ۘᩴ") ^ i7) * 93;
                                                i9 = ((iM3169 ^ i8) * 12115) ^ (-1450941802);
                                                i10 = 652542883;
                                            } else {
                                                iM3169 = (C0619.m2761("᩻ۙ") + i7) * 95;
                                                i9 = ((iM3169 ^ i8) * (-19385)) ^ (-634858950);
                                                i10 = 1512176847;
                                            }
                                            break;
                                        case -851012803:
                                        case 4107986:
                                            C1343.m4943();
                                            if (RunnableC3055.f9898 < 0) {
                                                iM3169 = C0773.m3169("ۚܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-569)) ^ 1749284767;
                                                i10 = -149997141;
                                            } else {
                                                iM3169 = C0773.m3169("ۖܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 11761) ^ 847656026;
                                                i10 = 104834178;
                                            }
                                            break;
                                        case -690813497:
                                        case 1038721257:
                                            if (C0862.f3233 != 0) {
                                                iM3169 = (C0619.m2761("᩷ۤ") + i8) * 123;
                                                i9 = ((iM3169 ^ i7) * 12363) ^ 1658444993;
                                                i10 = -54558533;
                                            } else {
                                                iM3169 = (i8 - C0619.m2761("ۨ᩸")) * (-127);
                                                i9 = ((iM3169 ^ i7) * (-11859)) ^ 1265537549;
                                                i10 = 1076002035;
                                            }
                                            break;
                                        case -562916346:
                                        case 1065508021:
                                            if (C2023.m6964() <= 0) {
                                                iM3169 = C0773.m3169("ۚܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-569)) ^ 1749284767;
                                                i10 = -149997141;
                                            } else {
                                                iM3169 = (C0773.m3169("۟᩺") ^ i8) * 13;
                                                i9 = ((iM3169 ^ i7) * 21465) ^ (-1749279187);
                                                i10 = -805865404;
                                            }
                                            break;
                                        case -232681427:
                                        case 1237430607:
                                            if (C2878.m9491() <= 0) {
                                                iM3169 = (C0619.m2761("᩷ۤ") + i8) * 123;
                                                i9 = ((iM3169 ^ i7) * 12363) ^ 1658444993;
                                                i10 = -54558533;
                                            } else {
                                                iM3169 = C0773.m3169("۠֫") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-12493)) ^ 1736410163;
                                                i10 = 1264746612;
                                            }
                                            break;
                                        case 139337446:
                                        case 306509153:
                                            if (C1519.f5300 >= 0) {
                                                iM3169 = (C0619.m2761("᩷ۤ") + i8) * 123;
                                                i9 = ((iM3169 ^ i7) * 12363) ^ 1658444993;
                                                i10 = -54558533;
                                            } else {
                                                iM3169 = C0773.m3169("ۘ᩻") ^ i7;
                                                i9 = ((iM3169 ^ i8) * (-19825)) ^ (-20760720);
                                                i10 = -1656277898;
                                            }
                                            break;
                                        case 139924588:
                                        case 1956106116:
                                            if (C3690.f12684 <= 0) {
                                                iM3169 = C0773.m3169("۠ۢ") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 2599) ^ 1314754537;
                                                i10 = -329657948;
                                            } else {
                                                iM3169 = (i8 - C0619.m2761("ܳۤ")) * 49;
                                                i9 = ((iM3169 ^ i7) * (-25)) ^ (-2070391369);
                                                i10 = 663424033;
                                            }
                                            break;
                                        case 580618851:
                                        case 1621330065:
                                            c2813 = (C2813) obj;
                                            int i11 = AbstractActivityC17204.f56033;
                                            if (c2813 != null) {
                                                iM3169 = C0773.m3169("֫ۢ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 15625) ^ 924154376;
                                                i10 = 1904038453;
                                            } else {
                                                iM3169 = (C0773.m3169("ۧ᩶") + i8) * (-43);
                                                i9 = ((iM3169 ^ i7) * 8315) ^ 267947854;
                                                i10 = 66880555;
                                            }
                                            break;
                                        case 794444085:
                                        case 1610035983:
                                            if (RunnableC0334.f1808 <= 0) {
                                                iM3169 = (C0773.m3169("ۘᩴ") ^ i7) * 93;
                                                i9 = ((iM3169 ^ i8) * 12115) ^ (-1450941802);
                                                i10 = 652542883;
                                            } else {
                                                iM3169 = C0773.m3169("֨֫") ^ i8;
                                                i9 = ((iM3169 ^ i7) * (-13179)) ^ (-158463478);
                                                i10 = 2029301980;
                                            }
                                            break;
                                        case 1646210187:
                                        case 1750627882:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM3169 = C0773.m3169("۠ۢ") ^ i8;
                                                i9 = ((iM3169 ^ i7) * 2599) ^ 1314754537;
                                                i10 = -329657948;
                                            } else {
                                                iM3169 = C0773.m3169("ۖܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 11761) ^ 847656026;
                                                i10 = 104834178;
                                            }
                                            break;
                                        default:
                                            if (!C3690.m11987()) {
                                                iM3169 = (C0773.m3169("ۘᩴ") ^ i7) * 93;
                                                i9 = ((iM3169 ^ i8) * 12115) ^ (-1450941802);
                                                i10 = 652542883;
                                            } else {
                                                iM3169 = C0773.m3169("ۖܳ") ^ i7;
                                                i9 = ((iM3169 ^ i8) * 11761) ^ 847656026;
                                                i10 = 104834178;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        if (C21576.m49054()) {
                            iM2761 = (i3 - C0619.m2761("᩶ۡ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i4 = ((iM2761 ^ i2) * (-7759)) ^ (-689009303);
                            i5 = 817725620;
                        } else {
                            iM2761 = (C0619.m2761("ܺܶ") + i2) * (-5);
                            i4 = ((iM2761 ^ i3) * (-869)) ^ 756111231;
                            i5 = 1941446330;
                        }
                    } else {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1711) ^ (-1414322397);
                        i5 = 1145214395;
                    }
                    break;
                case -934258680:
                case -210264507:
                    setTheme(C7207.m19791());
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("ۖۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13467)) ^ (-730943381);
                        i5 = 821541061;
                    } else {
                        iM2761 = C0619.m2761("۟ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12573) ^ 1258951234;
                        i5 = 1562296168;
                    }
                    break;
                case -858583456:
                case -586823632:
                    this.f56050 = c3347M30694;
                    super.onCreate(bundle);
                    c17930 = f56036;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۖۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13467)) ^ (-730943381);
                        i5 = 821541061;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۗ᩷")) * 77;
                        i4 = ((iM2761 ^ i3) * 24463) ^ 273853432;
                        i5 = 1390739936;
                    }
                    break;
                case -830882642:
                case 462139818:
                    defaultDisplay.getSize(point);
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܿ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22949)) ^ 1120425201;
                        i5 = -1686715644;
                    } else {
                        iM2761 = (C0619.m2761("ۢۘ") ^ i2) * (-49);
                        i4 = ((iM2761 ^ i3) * 25813) ^ (-1558523332);
                        i5 = -1844222610;
                    }
                    break;
                case -748036457:
                case -565100917:
                    C0950.m3785();
                    iM2761 = (C0773.m3169("ᩴ᩸") ^ i2) * (-121);
                    i4 = ((iM2761 ^ i3) * (-15595)) ^ (-866389347);
                    i5 = -1106222510;
                    break;
                case -728031868:
                case 1690886644:
                    C23522.m52719();
                    z = true;
                    if (bundle != null) {
                        iM2761 = C0773.m3169("ᩳ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32143)) ^ 836700688;
                        i5 = -460893392;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۫ܽ")) * 31;
                        i4 = ((iM2761 ^ i3) * 25997) ^ (-667511212);
                        i5 = -703962495;
                    }
                    break;
                case -687551502:
                case 207467176:
                    if (C4238.f15451 < 0) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1711) ^ (-1414322397);
                        i5 = 1145214395;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩸") ^ i2) * (-121);
                        i4 = ((iM2761 ^ i3) * (-15595)) ^ (-866389347);
                        i5 = -1106222510;
                    }
                    break;
                case -617247630:
                case 545463732:
                    if (C23916.m53419() != 0) {
                        iM2761 = C0773.m3169("ܿ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22949)) ^ 1120425201;
                        i5 = -1686715644;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۛ") ^ i3) * (-33);
                        i4 = ((iM2761 ^ i2) * 17701) ^ (-286770649);
                        i5 = 1465561106;
                    }
                    break;
                case -60287552:
                case 1827585514:
                    this.f56055 = C3296.m10878();
                    iM2761 = C0773.m3169("֨۬") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-15097)) ^ 1895301688;
                    i5 = -1245519200;
                    break;
                case 456238515:
                case 1742252473:
                    break;
                case 829789477:
                case 836602164:
                    z2 = false;
                    iM2761 = C0773.m3169("ۙ֨") ^ i3;
                    i4 = ((iM2761 ^ i2) * 15173) ^ (-1616630994);
                    i5 = -1876111208;
                    break;
                case 860973318:
                case 1386562910:
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("ۨۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1711) ^ (-1414322397);
                        i5 = 1145214395;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩸") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1263) ^ 1240297864;
                        i5 = -2006742173;
                    }
                    break;
                case 966040125:
                case 1691450591:
                    C3779.m12264();
                    C2419.m8174();
                    break;
                case 1018513459:
                case 1395815453:
                    c3347M30694 = C12296.m30693(this, new C19241(this));
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۖۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-13467)) ^ (-730943381);
                        i5 = 821541061;
                    } else {
                        iM2761 = (C0619.m2761("۫ۘ") ^ i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 16519) ^ (-1375981822);
                        i5 = -935307789;
                    }
                    break;
                default:
                    this.f56051 = z2;
                    if (this.f56044) {
                        iM2761 = C0773.m3169("ܺۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17375) ^ (-1380430873);
                        i5 = -1859821569;
                    } else {
                        iM2761 = C0773.m3169("֨۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15097)) ^ 1895301688;
                        i5 = -1245519200;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C6820.m18997(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40399(Runnable runnable) {
        this.f56037 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40387(ViewGroup viewGroup, int i) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        View viewM4949 = null;
        int i5 = -1479835214;
        int i6 = C1826.f6190;
        int i7 = C0487.f2131;
        int iM3169 = C0773.m3169("ۧ᩹") ^ i7;
        int i8 = ((iM3169 ^ i6) * 1893) ^ 1232285197;
        int i9 = -825896582;
        while (true) {
            i5 = ((((i5 ^ i6) * 26981) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -2050915324:
                case 569947588:
                    if (C2878.m9482(viewM4949) > 0) {
                        iM3169 = (i6 - C0619.m2761("ᩳ۬")) * 41;
                        i8 = ((iM3169 ^ i7) * (-11569)) ^ 2120654310;
                        i9 = -1617265398;
                    } else {
                        iM3169 = C0619.m2761("֨᩵") ^ i6;
                        i8 = ((iM3169 ^ i7) * 24465) ^ (-599378017);
                        i9 = 1502268028;
                    }
                    break;
                case -2050901627:
                case 863205929:
                    C3448.m11248();
                    iM3169 = (C0619.m2761("ܶ֡") + i6) * 63;
                    i8 = ((iM3169 ^ i7) * 18657) ^ (-1378946858);
                    i9 = 896451041;
                    break;
                case -1961321552:
                case 258593812:
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0619.m2761("ۘۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 21827) ^ 1503392802;
                        i9 = -675582738;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ᩹") + i7) * 71;
                        i8 = ((iM3169 ^ i6) * (-12075)) ^ 133586777;
                        i9 = 2108152655;
                    }
                    break;
                case -1822890648:
                case -1213555148:
                    if (viewM4949 instanceof ViewGroup) {
                        iM3169 = C0773.m3169("۠۬") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-7465)) ^ 644603662;
                        i9 = 664042043;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ۜܳ")) * (-105);
                        i8 = ((iM3169 ^ i7) * 10817) ^ (-1211205537);
                        i9 = 1610219158;
                    }
                    break;
                case -1686799969:
                case -1214906283:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ۚ۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8659)) ^ 1010322285;
                        i9 = -1804214449;
                    } else {
                        iM3169 = C0619.m2761("ܰۘ") ^ i6;
                        i8 = ((iM3169 ^ i7) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 883974413;
                        i9 = -268612097;
                    }
                    break;
                case -1644825885:
                case 241584997:
                    C3734.m12152();
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۘۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 21827) ^ 1503392802;
                        i9 = -675582738;
                    } else {
                        iM3169 = (C0619.m2761("ܶ֡") + i6) * 63;
                        i8 = ((iM3169 ^ i7) * 18657) ^ (-1378946858);
                        i9 = 896451041;
                    }
                    break;
                case -1409651974:
                case 138990933:
                    if (C0773.m3158(viewM4949) > 0) {
                        iM3169 = C0773.m3169("᩵᩺") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-22103)) ^ 1312415402;
                        i9 = -1833726535;
                    } else {
                        iM3169 = C0619.m2761("֨᩵") ^ i6;
                        i8 = ((iM3169 ^ i7) * 24465) ^ (-599378017);
                        i9 = 1502268028;
                    }
                    break;
                case -1333570508:
                case 820371759:
                    if (m40387((ViewGroup) viewM4949, i3)) {
                        iM3169 = C0619.m2761("ۘ᩷") ^ i7;
                        i8 = ((iM3169 ^ i6) * 24649) ^ (-1604324855);
                        i9 = 1788725595;
                    } else {
                        iM3169 = C0619.m2761("֨᩵") ^ i6;
                        i8 = ((iM3169 ^ i7) * 24465) ^ (-599378017);
                        i9 = 1502268028;
                    }
                    break;
                case -1060441863:
                case 117817099:
                    C2419.m8174();
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("᩸᩺") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-12137)) ^ 237925964;
                        i9 = -671138024;
                    } else {
                        iM3169 = C0619.m2761("ۚ۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8659)) ^ 1010322285;
                        i9 = -1804214449;
                    }
                    break;
                case -1057980751:
                case 855695071:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("᩺ۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-17053)) ^ (-1357918390);
                        i9 = 604047020;
                    } else {
                        iM3169 = (i6 - C0619.m2761("֨ܽ")) * (-99);
                        i8 = ((iM3169 ^ i7) * 30129) ^ (-581618787);
                        i9 = 350317406;
                    }
                    break;
                case -1045553178:
                case 1551710161:
                    return viewM4949.getGlobalVisibleRect(new Rect());
                case -843815008:
                case 886213569:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۘۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 21827) ^ 1503392802;
                        i9 = -675582738;
                    } else {
                        iM3169 = (C0619.m2761("᩶ᩴ") + i6) * (-35);
                        i8 = ((iM3169 ^ i7) * 22195) ^ 1238226105;
                        i9 = 1016752672;
                    }
                    break;
                case -785081354:
                case -765772916:
                    if (i4 < C1343.m4938(viewGroup)) {
                        iM3169 = C0619.m2761("ۙ֨") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-13219)) ^ (-1351032271);
                        i9 = 1233649408;
                    } else {
                        iM3169 = (C0619.m2761("᩶۬") ^ i7) * (-87);
                        i8 = ((iM3169 ^ i6) * 25761) ^ 2031789266;
                        i9 = -743421610;
                    }
                    break;
                case -771082621:
                case -609778424:
                    return z;
                case -642488816:
                case 973041340:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۘۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 21827) ^ 1503392802;
                        i9 = -675582738;
                    } else {
                        iM3169 = (C0619.m2761("᩵۫") + i7) * 15;
                        i8 = ((iM3169 ^ i6) * (-13013)) ^ 1043573133;
                        i9 = -995698387;
                    }
                    break;
                case -506533233:
                case 1301387759:
                    C2354.m7983();
                    return false;
                case -437564147:
                case 1547224647:
                    i3 = i + i2;
                    z = false;
                    if (i3 <= 0) {
                        iM3169 = (C0619.m2761("᩶۬") ^ i7) * (-87);
                        i8 = ((iM3169 ^ i6) * 25761) ^ 2031789266;
                        i9 = -743421610;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩺") ^ i6;
                        i8 = ((iM3169 ^ i7) * 31409) ^ (-1671798373);
                        i9 = 2068942992;
                    }
                    break;
                case -406329725:
                case 145508689:
                    if (C2288.m7767()) {
                        iM3169 = C0619.m2761("᩸᩺") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-12137)) ^ 237925964;
                        i9 = -671138024;
                    } else {
                        iM3169 = (i7 - C0773.m3169("֡᩶")) * (-77);
                        i8 = ((iM3169 ^ i6) * 17289) ^ 2069500368;
                        i9 = -894914011;
                    }
                    break;
                case -280829420:
                case 605811003:
                    if (C4282.m13644()) {
                        iM3169 = (C0619.m2761("֨᩹") ^ i7) * 47;
                        i8 = ((iM3169 ^ i6) * 25909) ^ (-838802079);
                        i9 = 2030812454;
                    } else {
                        iM3169 = (C0619.m2761("ܶ֡") + i6) * 63;
                        i8 = ((iM3169 ^ i7) * 18657) ^ (-1378946858);
                        i9 = 896451041;
                    }
                    break;
                case -258983942:
                case 1566940158:
                    if (C3734.f12817 < 0) {
                        iM3169 = C0773.m3169("᩺ۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-17053)) ^ (-1357918390);
                        i9 = 604047020;
                    } else {
                        iM3169 = (C0619.m2761("ܶ֡") + i6) * 63;
                        i8 = ((iM3169 ^ i7) * 18657) ^ (-1378946858);
                        i9 = 896451041;
                    }
                    break;
                case -165097407:
                case -51206716:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("ۘۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 21827) ^ 1503392802;
                        i9 = -675582738;
                    } else {
                        iM3169 = C0619.m2761("᩻᩷") ^ i6;
                        i8 = ((iM3169 ^ i7) * 8373) ^ (-931372241);
                        i9 = 1671687029;
                    }
                    break;
                case 122001358:
                case 1851293406:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("᩸᩺") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-12137)) ^ 237925964;
                        i9 = -671138024;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩵") ^ i7;
                        i8 = ((iM3169 ^ i6) * 13913) ^ 1960677098;
                        i9 = -679356558;
                    }
                    break;
                case 532147697:
                case 2122357699:
                    i4 = 0;
                    iM3169 = C0773.m3169("ۤᩳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-17609)) ^ (-830701590);
                    i9 = -968545055;
                    break;
                case 761402632:
                case 1270966761:
                    viewM4949 = C1343.m4949(viewGroup, i4);
                    if (viewM4949.getVisibility() == 0) {
                        iM3169 = (C0773.m3169("᩷ܿ") + i7) * 49;
                        i8 = ((iM3169 ^ i6) * 6649) ^ (-1031913920);
                        i9 = 1963316117;
                    } else {
                        iM3169 = C0619.m2761("֨᩵") ^ i6;
                        i8 = ((iM3169 ^ i7) * 24465) ^ (-599378017);
                        i9 = 1502268028;
                    }
                    break;
                case 941385218:
                case 964869468:
                    i2 = -1;
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("ۧۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * 6773) ^ 2140161453;
                        i9 = -1971033829;
                    } else {
                        iM3169 = C0773.m3169("ۨۗ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-14115)) ^ (-79552870);
                        i9 = -2129747451;
                    }
                    break;
                case 1030697046:
                case 1214099611:
                    i4++;
                    iM3169 = C0773.m3169("ۤᩳ") ^ i7;
                    i8 = ((iM3169 ^ i6) * (-17609)) ^ (-830701590);
                    i9 = -968545055;
                    break;
                case 1928828853:
                case 2112643292:
                    return true;
                default:
                    if (C2375.m8065() > 0) {
                        iM3169 = C0619.m2761("ۚ۬") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8659)) ^ 1010322285;
                        i9 = -1804214449;
                    } else {
                        iM3169 = C0773.m3169("᩺ۗ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-17053)) ^ (-1357918390);
                        i9 = 604047020;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40396(int i, int i2, boolean z) {
        int i3 = 548246640;
        int i4 = C1080.f3865;
        int i5 = C2702.f8586;
        int iM2761 = C0619.m2761("֡ۤ") ^ i5;
        int i6 = ((iM2761 ^ i4) * (-11153)) ^ (-1919895988);
        int i7 = -391451849;
        while (true) {
            i3 = ((((i3 ^ i4) * 29727) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2143264992:
                case -2014230875:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (i5 - C0619.m2761("ۘۧ")) * 17;
                        i6 = ((iM2761 ^ i4) * (-31683)) ^ (-872459819);
                        i7 = 1538377777;
                    } else {
                        iM2761 = C0773.m3169("᩶ۜ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-9173)) ^ (-1049590224);
                        i7 = -2022087709;
                    }
                    break;
                case -2106373079:
                case -195229498:
                    C2878.m9491();
                    RunnableC3646.m11813();
                    iM2761 = C0773.m3169("᩶ܰ") ^ i5;
                    i6 = ((iM2761 ^ i4) * 5703) ^ (-1979123400);
                    i7 = 1596504530;
                    break;
                case -1955140574:
                case 50056313:
                    if (!C17202.f56030) {
                        iM2761 = (C0773.m3169("ۡ֡") ^ i5) * (-5);
                        i6 = ((iM2761 ^ i4) * 25745) ^ 1609624899;
                        i7 = -657611972;
                    } else {
                        iM2761 = C0773.m3169("᩶ܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 5703) ^ (-1979123400);
                        i7 = 1596504530;
                    }
                    break;
                case -1795219636:
                case 1910700568:
                    if (!C2878.f9462) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩸֨")) * 99;
                        i6 = ((iM2761 ^ i5) * (-28307)) ^ 1320623083;
                        i7 = 1428641537;
                    }
                    break;
                case -1703929172:
                case -220938872:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = (C0773.m3169("ܳܶ") ^ i4) * 41;
                        i6 = ((iM2761 ^ i5) * (-30487)) ^ (-2000352054);
                        i7 = 562756130;
                    }
                    break;
                case -1692247620:
                case 49855585:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("ۡ֡") ^ i5) * (-5);
                        i6 = ((iM2761 ^ i4) * 25745) ^ 1609624899;
                        i7 = -657611972;
                    } else {
                        iM2761 = C0773.m3169("ᩳۧ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 25699) ^ (-1593703843);
                        i7 = 1849645581;
                    }
                    break;
                case -1597720088:
                case 1922322557:
                    if (C2878.f9462) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = (C0773.m3169("ۚۨ") ^ i4) * 55;
                        i6 = ((iM2761 ^ i5) * 19083) ^ 1509452738;
                        i7 = -383354545;
                    }
                    break;
                case -1414325772:
                case 58407633:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = C0619.m2761("֫ܰ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-30947)) ^ (-604557432);
                        i7 = 1553442472;
                    }
                    break;
                case -820723847:
                case 488374383:
                    m40397(i, C1783.m6246(this, i2), z);
                    break;
                case -660310088:
                case 642942821:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۙܰ")) * (-47);
                        i6 = ((iM2761 ^ i5) * 17803) ^ 1772353400;
                        i7 = 1165446939;
                    }
                    break;
                case -569607892:
                case 1629189028:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (i5 - C0619.m2761("ۘۧ")) * 17;
                        i6 = ((iM2761 ^ i4) * (-31683)) ^ (-872459819);
                        i7 = 1538377777;
                    } else {
                        iM2761 = (C0773.m3169("ۜ᩶") + i5) * 71;
                        i6 = ((iM2761 ^ i4) * 18171) ^ (-829380445);
                        i7 = 343912331;
                    }
                    break;
                case -47638182:
                case 518208381:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = (C0619.m2761("۬ܳ") + i4) * (-95);
                        i6 = ((iM2761 ^ i5) * (-15003)) ^ (-1389272297);
                        i7 = -173539157;
                    }
                    break;
                case 231001926:
                case 1928459875:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("ۧۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 19447) ^ (-590826249);
                        i7 = -644004239;
                    } else {
                        iM2761 = (i5 - C0619.m2761("֫ۜ")) * (-39);
                        i6 = ((iM2761 ^ i4) * (-32563)) ^ 2059953979;
                        i7 = 98713595;
                    }
                    break;
                case 390423828:
                case 1532943086:
                    C2419.m8174();
                    break;
                case 473806039:
                case 1293250056:
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (i4 - C0773.m3169("᩸֨")) * 99;
                        i6 = ((iM2761 ^ i5) * (-28307)) ^ 1320623083;
                        i7 = 1428641537;
                    } else {
                        iM2761 = C0773.m3169("᩶ܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 5703) ^ (-1979123400);
                        i7 = 1596504530;
                    }
                    break;
                default:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i4 - C0773.m3169("᩸֨")) * 99;
                        i6 = ((iM2761 ^ i5) * (-28307)) ^ 1320623083;
                        i7 = 1428641537;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۖ") ^ i5) * (-53);
                        i6 = ((iM2761 ^ i4) * 2973) ^ 118884114;
                        i7 = 210076493;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC3409, l.ActivityC5577, android.app.Activity, l.InterfaceC24530
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 1357115891;
        int i3 = C0269.f1558;
        int i4 = C20932.f66974;
        int iM3169 = (C0773.m3169("ᩴܶ") ^ i4) * (-117);
        int i5 = ((iM3169 ^ i3) * 7433) ^ 774011603;
        int i6 = -1838017316;
        while (true) {
            i2 = ((((i2 ^ i3) * 1727) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2146462211:
                case 1208380944:
                    C14751.m35435(this, true);
                    break;
                case -1986716475:
                case 1857183717:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۗ᩵")) * (-9);
                        i5 = ((iM3169 ^ i3) * (-17567)) ^ 1356808505;
                        i6 = 289175479;
                    } else {
                        iM3169 = C0619.m2761("۫ۚ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 20251) ^ 65668319;
                        i6 = 995292288;
                    }
                    break;
                case -1708007704:
                case -1270567468:
                    C2375.m8065();
                    if (C20932.m47848() == 0) {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-4923)) ^ (-314301500);
                        i6 = -2060951911;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۢ") ^ i4) * (-37);
                        i5 = ((iM3169 ^ i3) * 11407) ^ (-155005315);
                        i6 = 313264457;
                    }
                    break;
                case -1590280374:
                case -1388037868:
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i3) * (-55);
                        i5 = ((iM3169 ^ i4) * 23749) ^ (-364154815);
                        i6 = -1745505926;
                    } else {
                        iM3169 = C0619.m2761("۟ܺ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-3545)) ^ (-178474799);
                        i6 = 1822962639;
                    }
                    break;
                case -1562117874:
                case -945597507:
                    if (C2354.m7983()) {
                        iM3169 = C0619.m2761("۟ۢ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 735) ^ (-2093986302);
                        i6 = -1720220489;
                    } else {
                        iM3169 = (C0773.m3169("ܺۖ") + i3) * (-55);
                        i5 = ((iM3169 ^ i4) * 23749) ^ (-364154815);
                        i6 = -1745505926;
                    }
                    break;
                case -1508374119:
                case 462181413:
                    if (C2023.m6964() <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۗ᩵")) * (-9);
                        i5 = ((iM3169 ^ i3) * (-17567)) ^ 1356808505;
                        i6 = 289175479;
                    } else {
                        iM3169 = C0619.m2761("᩹ۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26997) ^ 60656344;
                        i6 = -1554321470;
                    }
                    break;
                case -1435662311:
                case -889053692:
                    C13473.m33144();
                    iM3169 = (C0773.m3169("᩺ۢ") ^ i4) * (-37);
                    i5 = ((iM3169 ^ i3) * 11407) ^ (-155005315);
                    i6 = 313264457;
                    break;
                case -1370846315:
                case 1253829239:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-4923)) ^ (-314301500);
                        i6 = -2060951911;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۛ") ^ i4) * 119;
                        i5 = ((iM3169 ^ i3) * (-899)) ^ (-1415109160);
                        i6 = -1646407321;
                    }
                    break;
                case -1188367802:
                case 1079380329:
                    if (C0862.f3233 != 0) {
                        iM3169 = (i4 - C0619.m2761("ۗ᩵")) * (-9);
                        i5 = ((iM3169 ^ i3) * (-17567)) ^ 1356808505;
                        i6 = 289175479;
                    } else {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-4923)) ^ (-314301500);
                        i6 = -2060951911;
                    }
                    break;
                case -581053642:
                case 777621227:
                    C0487.m2356();
                    C23916.m53419();
                    break;
                case -507447279:
                case 1633664911:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                case -145618649:
                case 1180968817:
                    if (i == 23680) {
                        iM3169 = C0773.m3169("᩺ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21925) ^ (-98196081);
                        i6 = -1430231336;
                    } else {
                        iM3169 = (C0619.m2761("᩻᩸") ^ i3) * (-117);
                        i5 = ((iM3169 ^ i4) * 9261) ^ (-172646647);
                        i6 = 72032601;
                    }
                    break;
                case -58228015:
                case 1162244256:
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i3) * (-55);
                        i5 = ((iM3169 ^ i4) * 23749) ^ (-364154815);
                        i6 = -1745505926;
                    } else {
                        iM3169 = C0619.m2761("ۛ֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * 1201) ^ 436577637;
                        i6 = 1711122501;
                    }
                    break;
                case 336900560:
                case 1084163448:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ۤۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-3715)) ^ (-1207575654);
                        i6 = -1694308017;
                    } else {
                        iM3169 = C0773.m3169("ᩴܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 26235) ^ 213694936;
                        i6 = -2010379584;
                    }
                    break;
                case 766658641:
                case 1877549686:
                    C2288.m7767();
                    if (!C1343.m4943()) {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-4923)) ^ (-314301500);
                        i6 = -2060951911;
                    } else {
                        iM3169 = C0773.m3169("ۤۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-3715)) ^ (-1207575654);
                        i6 = -1694308017;
                    }
                    break;
                case 899320320:
                case 2071437264:
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0619.m2761("᩵ᩴ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-4923)) ^ (-314301500);
                        i6 = -2060951911;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۘ") + i4) * 55;
                        i5 = ((iM3169 ^ i3) * (-30083)) ^ 417194722;
                        i6 = 2081001164;
                    }
                    break;
                case 1100274889:
                case 1320764973:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ۗ᩵")) * (-9);
                        i5 = ((iM3169 ^ i3) * (-17567)) ^ 1356808505;
                        i6 = 289175479;
                    } else {
                        iM3169 = (C0773.m3169("۠ᩳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM3169 ^ i4) * 7927) ^ 1840410253;
                        i6 = 2022370315;
                    }
                    break;
                default:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ܺۖ") + i3) * (-55);
                        i5 = ((iM3169 ^ i4) * 23749) ^ (-364154815);
                        i6 = -1745505926;
                    } else {
                        iM3169 = C0773.m3169("֡۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * 7605) ^ (-1421237814);
                        i6 = -2113792939;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40386(AbstractActivityC17204 abstractActivityC17204, int i) {
        AbstractC22044 abstractC22044 = null;
        ArrayList arrayList = null;
        ?? r2 = 0;
        int i2 = 1651675427;
        int i3 = C2419.f7754;
        int i4 = C1080.f3865;
        int iM2761 = (C0619.m2761("۠֡") + i3) * (-31);
        int i5 = ((iM2761 ^ i4) * (-29043)) ^ 1907126069;
        int i6 = 1066238876;
        while (true) {
            i2 = ((((i2 ^ i4) * 6679) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2147056613:
                case -1897462309:
                    if (RunnableC1848.m6360()) {
                        iM2761 = C0619.m2761("ۙ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32475)) ^ 325482206;
                        i6 = 428495766;
                    } else {
                        iM2761 = C0773.m3169("᩺ۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 17647) ^ 1354601503;
                        i6 = 256531907;
                    }
                    break;
                case -2069736613:
                case -459173664:
                    C2878.m9491();
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("ܰۡ") + i3) * (-119);
                        i5 = ((iM2761 ^ i4) * (-31243)) ^ (-1017131139);
                        i6 = -1940426490;
                    } else {
                        iM2761 = C0773.m3169("֨ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26669)) ^ (-1990290761);
                        i6 = -460915452;
                    }
                    break;
                case -2046010542:
                case -787678291:
                    break;
                case -2025936920:
                case 1406150138:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ܰܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8991)) ^ (-617239981);
                        i6 = 1101116934;
                    } else {
                        iM2761 = C0619.m2761("ܶۡ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17837) ^ (-100642847);
                        i6 = 704041339;
                    }
                    break;
                case -2019925722:
                case -1024660541:
                    C1564.m5509();
                    C2288.m7767();
                    iM2761 = C0773.m3169("֨ۤ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-26669)) ^ (-1990290761);
                    i6 = -460915452;
                    break;
                case -1782453633:
                case 1827769010:
                    RunnableC1848.m6360();
                    AbstractC3624.m11755();
                    break;
                case -1744447537:
                case -121969304:
                    abstractC22044 = abstractActivityC17204.f56043;
                    arrayList = abstractActivityC17204.f56049;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("֨ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26669)) ^ (-1990290761);
                        i6 = -460915452;
                    } else {
                        iM2761 = (C0773.m3169("ۜܺ") ^ i3) * 33;
                        i5 = ((iM2761 ^ i4) * (-7361)) ^ (-294584735);
                        i6 = -149072532;
                    }
                    break;
                case -1669225667:
                case -908684918:
                    if (C2287.f7432 < 0) {
                        iM2761 = C0619.m2761("ۙ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32475)) ^ 325482206;
                        i6 = 428495766;
                    } else {
                        iM2761 = C0773.m3169("֨ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26669)) ^ (-1990290761);
                        i6 = -460915452;
                    }
                    break;
                case -1576768372:
                case -470864309:
                    if (C0862.m3503()) {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-15863)) ^ (-170362657);
                        i6 = -1977999804;
                    } else {
                        iM2761 = C0773.m3169("᩵ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30111)) ^ (-1097563286);
                        i6 = 1069874459;
                    }
                    break;
                case -1573694475:
                case 372481190:
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("ܰۡ") + i3) * (-119);
                        i5 = ((iM2761 ^ i4) * (-31243)) ^ (-1017131139);
                        i6 = -1940426490;
                    } else {
                        iM2761 = C0773.m3169("᩶۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * 11215) ^ (-677076047);
                        i6 = -1981506111;
                    }
                    break;
                case -903038444:
                case 1384247296:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ۙ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32475)) ^ 325482206;
                        i6 = 428495766;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩵ܰ")) * (-25);
                        i5 = ((iM2761 ^ i4) * 10071) ^ (-2069002382);
                        i6 = -127359837;
                    }
                    break;
                case -700121538:
                case -401454819:
                    C8224.m22124(abstractActivityC17204, abstractC22044, arrayList);
                    iM2761 = (i3 - C0773.m3169("ۜ۠")) * (-127);
                    i5 = ((iM2761 ^ i4) * (-14091)) ^ (-125064135);
                    i6 = -888162220;
                    break;
                case -556728820:
                case -225418760:
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("᩶۬") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-12711)) ^ (-1881846169);
                        i6 = -1639487974;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32475)) ^ 325482206;
                        i6 = 428495766;
                    }
                    break;
                case -81121500:
                case 141608768:
                    abstractActivityC17204.f56043 = r2;
                    abstractActivityC17204.f56049 = r2;
                    if (abstractC22044 != null) {
                        iM2761 = (C0773.m3169("᩶᩸") + i4) * (-67);
                        i5 = ((iM2761 ^ i3) * 21995) ^ 1702154619;
                        i6 = 1159551676;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۜ۠")) * (-127);
                        i5 = ((iM2761 ^ i4) * (-14091)) ^ (-125064135);
                        i6 = -888162220;
                    }
                    break;
                case 40710266:
                case 1206657827:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("֨ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26669)) ^ (-1990290761);
                        i6 = -460915452;
                    } else {
                        iM2761 = C0773.m3169("۫֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-11861)) ^ 1095932860;
                        i6 = 1533021925;
                    }
                    break;
                case 62730901:
                case 1532790879:
                    if (C2023.m6964() > 0) {
                        iM2761 = C0619.m2761("ܰܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8991)) ^ (-617239981);
                        i6 = 1101116934;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩶") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32475)) ^ 325482206;
                        i6 = 428495766;
                    }
                    break;
                case 1425424842:
                case 2022072687:
                    if (i == -1) {
                        iM2761 = (i4 - C0619.m2761("ۨܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM2761 ^ i3) * (-18867)) ^ 1565702439;
                        i6 = -666542750;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۜ۠")) * (-127);
                        i5 = ((iM2761 ^ i4) * (-14091)) ^ (-125064135);
                        i6 = -888162220;
                    }
                    break;
                case 1615278520:
                case 2133352221:
                    r2 = 0;
                    r2 = 0;
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("ۢۤ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 5833) ^ 1179800644;
                        i6 = 541894030;
                    } else {
                        iM2761 = C0773.m3169("᩵ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-30111)) ^ (-1097563286);
                        i6 = 1069874459;
                    }
                    break;
                default:
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ᩴۤ") + i4) * 25;
                        i5 = ((iM2761 ^ i3) * 3919) ^ 1383804617;
                        i6 = -1902112685;
                    } else {
                        iM2761 = C0773.m3169("֨ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26669)) ^ (-1990290761);
                        i6 = -460915452;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC3409, android.app.Activity
    public void onResume() {
        String strMo122 = null;
        Runnable runnable = null;
        Runnable runnable2 = null;
        int i = 136419770;
        int i2 = C3734.f12817;
        int i3 = C1783.f6087;
        int iM2761 = (C0619.m2761("֫᩸") + i3) * (-91);
        int i4 = ((iM2761 ^ i2) * (-15807)) ^ 1872610642;
        int i5 = 1171615990;
        while (true) {
            i = ((((i ^ i2) * (-16743)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2070757310:
                case -589255950:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("֡ᩳ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 28899) ^ 409264922;
                        i5 = -433398648;
                    } else {
                        iM2761 = C0619.m2761("ۖ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16489)) ^ 531437378;
                        i5 = 839923184;
                    }
                    break;
                case -1974566930:
                case -772660491:
                    C23391.m52570(this);
                    if (this.f56037 != null) {
                        iM2761 = C0773.m3169("ܶۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30151) ^ (-1012612160);
                        i5 = -1504877806;
                    } else {
                        iM2761 = (C0619.m2761("֡᩺") ^ i2) * (-107);
                        i4 = ((iM2761 ^ i3) * 24405) ^ (-23070649);
                        i5 = -783907850;
                    }
                    break;
                case -1928075968:
                case -1750456062:
                    this.f56037 = runnable2;
                    C2023.m6957(runnable);
                    iM2761 = (C0619.m2761("֡᩺") ^ i2) * (-107);
                    i4 = ((iM2761 ^ i3) * 24405) ^ (-23070649);
                    i5 = -783907850;
                    break;
                case -1531048100:
                case 1541352417:
                    C0950.m3785();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("֨ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29211)) ^ (-755904161);
                        i5 = -297568699;
                    } else {
                        iM2761 = C0619.m2761("᩹ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4281)) ^ (-629818774);
                        i5 = 1061000884;
                    }
                    break;
                case -1493163326:
                case -486919140:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("֨ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29211)) ^ (-755904161);
                        i5 = -297568699;
                    } else {
                        iM2761 = C0773.m3169("ۗۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12095) ^ (-1886094386);
                        i5 = -1323344937;
                    }
                    break;
                case -1182085624:
                case 978197965:
                    break;
                case -1092936891:
                case -426627304:
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0619.m2761("ܽ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21873)) ^ 1990207099;
                        i5 = 1189544174;
                    } else {
                        iM2761 = C0773.m3169("۟ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1739)) ^ (-1078976031);
                        i5 = 155902908;
                    }
                    break;
                case -1088717825:
                case 1100565046:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("֡ᩳ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 28899) ^ 409264922;
                        i5 = -433398648;
                    } else {
                        iM2761 = C0619.m2761("ۚܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7693)) ^ (-1679002573);
                        i5 = 2134091112;
                    }
                    break;
                case -898672192:
                case 889657096:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܳᩴ")) * (-27);
                        i4 = ((iM2761 ^ i2) * 20077) ^ 1822527500;
                        i5 = 1651074599;
                    } else {
                        iM2761 = (C0773.m3169("ۨ۟") ^ i2) * 47;
                        i4 = ((iM2761 ^ i3) * 12217) ^ (-1520468403);
                        i5 = 620824644;
                    }
                    break;
                case -835108308:
                case 448279633:
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("ۚۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 17945) ^ (-1677016446);
                        i5 = 1240514310;
                    } else {
                        iM2761 = C0619.m2761("᩹ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4281)) ^ (-629818774);
                        i5 = 1061000884;
                    }
                    break;
                case -828559092:
                case 2069040747:
                    C3033.m9845();
                    C2287.m7745();
                    iM2761 = C0619.m2761("᩹ܽ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-4281)) ^ (-629818774);
                    i5 = 1061000884;
                    break;
                case -806655020:
                case 1132351913:
                    if (this.f56039) {
                        iM2761 = C0619.m2761("᩹ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8205)) ^ 1860662067;
                        i5 = -1554876739;
                    } else {
                        iM2761 = (C0619.m2761("ܿۨ") + i2) * (-39);
                        i4 = ((iM2761 ^ i3) * 19767) ^ (-871919673);
                        i5 = -1681975033;
                    }
                    break;
                case -771452197:
                case -738776996:
                    C4282.m13644();
                    if (!C0619.f2439) {
                        iM2761 = (C0619.m2761("֡ᩳ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 28899) ^ 409264922;
                        i5 = -433398648;
                    } else {
                        iM2761 = C0619.m2761("֨ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29211)) ^ (-755904161);
                        i5 = -297568699;
                    }
                    break;
                case -624752775:
                case 1602695325:
                    super.onResume();
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("֡ᩳ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 28899) ^ 409264922;
                        i5 = -433398648;
                    } else {
                        iM2761 = C0773.m3169("۟֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13861) ^ 643254076;
                        i5 = -2079461000;
                    }
                    break;
                case -374102626:
                case -81008437:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("᩹ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4281)) ^ (-629818774);
                        i5 = 1061000884;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۖ֨")) * (-15);
                        i4 = ((iM2761 ^ i3) * 28035) ^ 433888906;
                        i5 = -83109560;
                    }
                    break;
                case -354787975:
                case 1582277277:
                    MobclickAgent.onPageStart(strMo122);
                    MobclickAgent.onResume(this);
                    iM2761 = (C0619.m2761("ܿۨ") + i2) * (-39);
                    i4 = ((iM2761 ^ i3) * 19767) ^ (-871919673);
                    i5 = -1681975033;
                    break;
                case -303405407:
                case 1963639974:
                    C3077.m10041();
                    break;
                case -167660814:
                case 861752265:
                    runnable = this.f56037;
                    runnable2 = null;
                    if (C0269.m1775() <= 0) {
                        iM2761 = (i3 - C0619.m2761("ܳᩴ")) * (-27);
                        i4 = ((iM2761 ^ i2) * 20077) ^ 1822527500;
                        i5 = 1651074599;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩹") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * 14909) ^ 565487704;
                        i5 = -1308761125;
                    }
                    break;
                case -155320161:
                case 1661722806:
                    if (C21576.m49054()) {
                        iM2761 = (C0773.m3169("ܶ᩺") ^ i2) * 119;
                        i4 = ((iM2761 ^ i3) * (-32479)) ^ (-351245877);
                        i5 = 977412611;
                    } else {
                        iM2761 = C0619.m2761("᩸᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29669) ^ 258724351;
                        i5 = -205657853;
                    }
                    break;
                case -67693346:
                case 1892327896:
                    C4238.m13537(this);
                    iM2761 = C0619.m2761("᩸᩵") ^ i3;
                    i4 = ((iM2761 ^ i2) * 29669) ^ 258724351;
                    i5 = -205657853;
                    break;
                case 201707218:
                case 1325023534:
                    C1321.m4852();
                    if (!RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("֡ᩳ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 28899) ^ 409264922;
                        i5 = -433398648;
                    } else {
                        iM2761 = C0619.m2761("ܽ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21873)) ^ 1990207099;
                        i5 = 1189544174;
                    }
                    break;
                case 476313055:
                case 2029147158:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("᩹ܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4281)) ^ (-629818774);
                        i5 = 1061000884;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܶ۠")) * 29;
                        i4 = ((iM2761 ^ i2) * (-25277)) ^ 313767730;
                        i5 = -2126001724;
                    }
                    break;
                default:
                    strMo122 = mo122();
                    int i6 = C2278.f7424;
                    if (C16514.m39144()) {
                        iM2761 = (C0619.m2761("ܿۨ") + i2) * (-39);
                        i4 = ((iM2761 ^ i3) * 19767) ^ (-871919673);
                        i5 = -1681975033;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩸᩸")) * 35;
                        i4 = ((iM2761 ^ i3) * (-5689)) ^ (-1842917617);
                        i5 = 1050137814;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x03df A[PHI: r7 r15 r17 r22 r24 r25
      0x03df: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:92:0x03dd, B:64:0x026d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:92:0x03dd, B:64:0x026d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:92:0x03dd, B:64:0x026d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r22v31 java.lang.String) = (r22v10 java.lang.String), (r22v17 java.lang.String), (r22v32 java.lang.String) binds: [B:92:0x03dd, B:64:0x026d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r24v25 java.lang.Object) = (r24v8 java.lang.Object), (r24v15 java.lang.Object), (r24v26 java.lang.Object) binds: [B:92:0x03dd, B:64:0x026d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03df: PHI (r25v22 int) = (r25v5 int), (r25v12 int), (r25v23 int) binds: [B:92:0x03dd, B:64:0x026d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC15712
    /* JADX INFO: renamed from: ۙ */
    public final void mo37500(String str) {
        int iM2761;
        int i;
        int i2;
        int i3;
        int iM2762;
        int i4;
        int i5;
        int i6 = C0487.f2131;
        int i7 = C2375.f7641;
        int iM3169 = (i6 - C0773.m3169("᩻֨")) * 15;
        int i8 = ((iM3169 ^ i7) * 22299) ^ (-1544229652);
        String strM13650 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM3169 ^ 2094259330;
        String strM47853 = null;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 219816245;
        int i16 = 0;
        Object obj = null;
        int i17 = 0;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i7) * 32475) >> 31));
            switch (i15) {
                case -2125139779:
                case -1003704718:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    strM13650 = C4282.m13650(sArr3, 200, 8, i13);
                    i17 = 268435456;
                    iM2761 = C0619.m2761("ܿ֨") ^ i7;
                    i = ((iM2761 ^ i6) * (-10151)) ^ (-596547325);
                    i2 = 1327224843;
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str2 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str2;
                    break;
                case -2096736588:
                case -1877044310:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    sArr = f56034;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ܶᩳ") + i6) * 81;
                        i = ((iM2761 ^ i7) * 22725) ^ (-1854182218);
                        i2 = 886743795;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ܿۚ")) * 25;
                        i = ((iM2761 ^ i7) * 27227) ^ 1097558303;
                        i2 = 926260602;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str3 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str3;
                    break;
                case -2044142118:
                case 1759954249:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    s = sArr[c];
                    i14 = s * s;
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0619.m2761("ᩳۢ") ^ i7) * (-125);
                        i = ((iM2761 ^ i6) * 3195) ^ (-1573797338);
                        i2 = -1640293382;
                        i3 = iM2761 ^ i2;
                        obj = obj;
                        i12 = i12;
                        String str4 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str4;
                    } else {
                        strM47853 = strM47853;
                        i12 = i12;
                        int iM2763 = C0619.m2761("ܿ᩵") ^ i6;
                        i9 = iM2763 ^ 1995639281;
                        i8 = ((iM2763 ^ i7) * (-10005)) ^ 630619589;
                        obj = obj;
                    }
                    break;
                case -2037548419:
                case 1412226749:
                    i13 = 25009;
                    iM2761 = C0773.m3169("᩺ۙ") ^ i7;
                    i = ((iM2761 ^ i6) * (-29949)) ^ (-600699333);
                    i2 = 1510192999;
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str5 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str5;
                    break;
                case -1989198076:
                case 233817208:
                    strM47853 = strM47853;
                    obj = obj;
                    int i18 = i14 + i16;
                    i12 = i18 + i18;
                    if (C1826.f6190 > 0) {
                        int iM2764 = (C0619.m2761("ۨ۠") ^ i7) * 19;
                        i = ((iM2764 ^ i6) * (-16377)) ^ 732046922;
                        i3 = iM2764 ^ (-520006917);
                        obj = obj;
                        String str6 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str6;
                    } else {
                        strM47853 = strM47853;
                        int iM2765 = C0619.m2761("ܿ᩵") ^ i6;
                        i9 = iM2765 ^ 1995639281;
                        i8 = ((iM2765 ^ i7) * (-10005)) ^ 630619589;
                        obj = obj;
                    }
                    break;
                case -1816126529:
                case 109791432:
                    C0773.m3161();
                    if (C20932.f66974 <= 0) {
                        iM2762 = C0773.m3169("᩹ۘ") ^ i7;
                        i4 = ((iM2762 ^ i6) * 28607) ^ (-640627203);
                        i5 = -1036530264;
                    } else {
                        iM2762 = (C0619.m2761("ܽ᩶") ^ i6) * (-33);
                        i4 = ((iM2762 ^ i7) * (-28217)) ^ (-1379860666);
                        i5 = -1537777162;
                    }
                    i9 = iM2762 ^ i5;
                    i8 = i4;
                    break;
                case -1668675073:
                case 597778599:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("ۤ۫") ^ i7;
                        i = ((iM2761 ^ i6) * (-21081)) ^ (-1598676893);
                        i2 = 1375481612;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩺") ^ i7) * (-41);
                        i = ((iM2761 ^ i6) * 17103) ^ 593894198;
                        i2 = -666845718;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str7 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str7;
                    break;
                case -1607468592:
                case 1002809915:
                    try {
                        Intent intent = new Intent(strM47853);
                        strM47853 = strM47853;
                        obj = obj;
                        try {
                            i12 = i12;
                            try {
                                intent.setComponent(new ComponentName(C3779.m12266(f56034, 208, 20, i13), C1321.m4861(f56034, 228, 53, i13)));
                                StringBuilder sb = new StringBuilder(strM13650);
                                C1783.m6234(sb, str);
                                intent.setData(Uri.parse(C2023.m6952(sb)));
                                AbstractC0116.m1232(intent, i17);
                                RunnableC1848.m6363(this, intent);
                                iM2761 = (C0773.m3169("ۛۛ") ^ i7) * 101;
                                i = ((iM2761 ^ i6) * (-4419)) ^ (-256778499);
                                i2 = 757162741;
                            } catch (Throwable unused) {
                                iM2761 = (C0619.m2761("ۛ۫") + i7) * 3;
                                i = ((iM2761 ^ i6) * 6841) ^ (-1376764830);
                                i2 = 1452871989;
                            }
                        } catch (Throwable unused2) {
                            i12 = i12;
                            iM2761 = (C0619.m2761("ۛ۫") + i7) * 3;
                            i = ((iM2761 ^ i6) * 6841) ^ (-1376764830);
                            i2 = 1452871989;
                            i3 = iM2761 ^ i2;
                            obj = obj;
                            i12 = i12;
                            String str8 = strM47853;
                            i9 = i3;
                            i8 = i;
                            strM47853 = str8;
                            break;
                        }
                    } catch (Throwable unused3) {
                        strM47853 = strM47853;
                        obj = obj;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str9 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str9;
                    break;
                case -1558071606:
                case 915691048:
                case 1522538148:
                case 1696255888:
                    break;
                case -1328127482:
                case -1265508452:
                    if (AbstractC0641.f2496 >= 0) {
                        obj = obj;
                        int iM2766 = C0619.m2761("ܿ᩵") ^ i6;
                        i9 = iM2766 ^ 1995639281;
                        i8 = ((iM2766 ^ i7) * (-10005)) ^ 630619589;
                        obj = obj;
                    } else {
                        iM2762 = (C0619.m2761("ܽ᩶") ^ i6) * (-33);
                        i4 = ((iM2762 ^ i7) * (-28217)) ^ (-1379860666);
                        i5 = -1537777162;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -1226153298:
                case 966565681:
                    RunnableC0334.m2063();
                    break;
                case -1063286117:
                case 623011826:
                    C1519.m5403();
                    if (C3779.f12953 <= 0) {
                        strM47853 = strM47853;
                        obj = obj;
                        i12 = i12;
                        iM2761 = (C0773.m3169("۠ۤ") ^ i6) * 21;
                        i = ((iM2761 ^ i7) * (-30987)) ^ 1057304452;
                        i2 = -914107524;
                        i3 = iM2761 ^ i2;
                        obj = obj;
                        i12 = i12;
                        String str10 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str10;
                    } else {
                        iM2762 = C0773.m3169("᩹ۘ") ^ i7;
                        i4 = ((iM2762 ^ i6) * 28607) ^ (-640627203);
                        i5 = -1036530264;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                    }
                    break;
                case -888239196:
                case 106562885:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    int i19 = s + s2;
                    if (i12 - (i19 * i19) < 0) {
                        iM2761 = (C0619.m2761("ۡۙ") + i6) * (-113);
                        i = ((iM2761 ^ i7) * (-15989)) ^ (-476798717);
                        i2 = -223172243;
                    } else {
                        iM2761 = C0619.m2761("۠᩸") ^ i7;
                        i = ((iM2761 ^ i6) * 4911) ^ (-424640226);
                        i2 = 749858682;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str11 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str11;
                    break;
                case -697912768:
                case 786307201:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    sArr2 = f56034;
                    i10 = 155;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("ۙᩳ") ^ i7;
                        i = ((iM2761 ^ i6) * (-22383)) ^ (-1380609412);
                        i2 = 1918185995;
                    } else {
                        iM2761 = (C0773.m3169("ۚۖ") + i6) * 47;
                        i = ((iM2761 ^ i7) * 26675) ^ (-343513252);
                        i2 = 1131910912;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str12 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str12;
                    break;
                case -567046745:
                case 1862101939:
                    C13473.m33144();
                    if (C0862.f3233 != 0) {
                        strM47853 = strM47853;
                        obj = obj;
                        i12 = i12;
                        iM2761 = (C0773.m3169("ܶᩳ") + i6) * 81;
                        i = ((iM2761 ^ i7) * 22725) ^ (-1854182218);
                        i2 = 886743795;
                        i3 = iM2761 ^ i2;
                        obj = obj;
                        i12 = i12;
                        String str13 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str13;
                    }
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    iM2761 = C0619.m2761("ۙᩳ") ^ i7;
                    i = ((iM2761 ^ i6) * (-22383)) ^ (-1380609412);
                    i2 = 1918185995;
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str14 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str14;
                    break;
                case -542358515:
                case 634546736:
                    C3448.m11248();
                    if (C3734.m12152() < 0) {
                        iM2762 = (C0619.m2761("ۧۛ") ^ i7) * (-105);
                        i4 = ((iM2762 ^ i6) * (-14489)) ^ 940571455;
                        i5 = -1538920809;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                    } else {
                        obj = obj;
                        int iM2767 = C0619.m2761("ܿ᩵") ^ i6;
                        i9 = iM2767 ^ 1995639281;
                        i8 = ((iM2767 ^ i7) * (-10005)) ^ 630619589;
                        obj = obj;
                    }
                    break;
                case -261244622:
                case 1483707547:
                    i13 = 62785;
                    iM2761 = C0773.m3169("᩺ۙ") ^ i7;
                    i = ((iM2761 ^ i6) * (-29949)) ^ (-600699333);
                    i2 = 1510192999;
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str15 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str15;
                    break;
                case -182691601:
                case 1300116328:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    s2 = 19304;
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = (C0619.m2761("ܰܳ") + i7) * 65;
                        i = ((iM2761 ^ i6) * 18979) ^ 778840504;
                        i2 = -1035767089;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ᩴܺ")) * 93;
                        i = ((iM2761 ^ i7) * (-7213)) ^ 2119155432;
                        i2 = -2069869041;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str16 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str16;
                    break;
                case 134700686:
                case 292202791:
                    try {
                        Intent intent2 = new Intent(strM47853);
                        StringBuilder sb2 = new StringBuilder(strM13650);
                        C1783.m6234(sb2, str);
                        intent2.setData(Uri.parse(C1080.m4058(sb2)));
                        AbstractC0116.m1232(intent2, i17);
                        C3033.m9858(this, intent2);
                        iM2762 = C0619.m2761("᩸᩻") ^ i6;
                        i4 = ((iM2762 ^ i7) * 8727) ^ 662464916;
                        i5 = 1919469451;
                    } catch (Throwable th) {
                        obj = th;
                        iM2762 = (C0773.m3169("᩺֨") + i6) * 13;
                        i4 = ((iM2762 ^ i7) * 9797) ^ 278091634;
                        i5 = 1721074852;
                    }
                    i9 = iM2762 ^ i5;
                    i8 = i4;
                    break;
                case 204447636:
                case 2127350575:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    c = 154;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("ۙᩳ") ^ i7;
                        i = ((iM2761 ^ i6) * (-22383)) ^ (-1380609412);
                        i2 = 1918185995;
                    } else {
                        iM2761 = (C0773.m3169("ۙۜ") + i6) * (-85);
                        i = ((iM2761 ^ i7) * (-2845)) ^ 180168867;
                        i2 = -1322090573;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str17 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str17;
                    break;
                case 243522156:
                case 784103967:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    i11 = 45;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("۠ۤ") ^ i6) * 21;
                        i = ((iM2761 ^ i7) * (-30987)) ^ 1057304452;
                        i2 = -914107524;
                    } else {
                        iM2761 = C0773.m3169("ܽ֡") ^ i7;
                        i = ((iM2761 ^ i6) * (-32135)) ^ 1493643647;
                        i2 = -284921317;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str18 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str18;
                    break;
                case 363446700:
                case 1610364246:
                    C3734.m12152();
                    if (C1343.f4799 == 0) {
                        strM47853 = strM47853;
                        obj = obj;
                        i12 = i12;
                        iM2761 = C0619.m2761("ۙᩳ") ^ i7;
                        i = ((iM2761 ^ i6) * (-22383)) ^ (-1380609412);
                        i2 = 1918185995;
                        i3 = iM2761 ^ i2;
                        obj = obj;
                        i12 = i12;
                        String str19 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str19;
                    } else {
                        iM2762 = C0773.m3169("᩹ۘ") ^ i7;
                        i4 = ((iM2762 ^ i6) * 28607) ^ (-640627203);
                        i5 = -1036530264;
                        i9 = iM2762 ^ i5;
                        i8 = i4;
                    }
                    break;
                case 458911008:
                case 1912253144:
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    i16 = 372644416;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (C0773.m3169("۬ۘ") ^ i6) * (-57);
                        i = ((iM2761 ^ i7) * 10743) ^ 252301811;
                        i2 = -1214889792;
                    } else {
                        iM2761 = (C0773.m3169("۟᩸") ^ i6) * (-93);
                        i = ((iM2761 ^ i7) * 145) ^ 1061114406;
                        i2 = -220533817;
                    }
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str110 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str110;
                    break;
                case 895513573:
                case 1577184233:
                    C3099.m10095();
                    iM2762 = C0773.m3169("᩹ۘ") ^ i7;
                    i4 = ((iM2762 ^ i6) * 28607) ^ (-640627203);
                    i5 = -1036530264;
                    i9 = iM2762 ^ i5;
                    i8 = i4;
                    break;
                case 1451169642:
                case 1573355083:
                    RunnableC3055.m9930(this, obj, null);
                    iM2762 = C0619.m2761("᩸᩻") ^ i6;
                    i4 = ((iM2762 ^ i7) * 8727) ^ 662464916;
                    i5 = 1919469451;
                    i9 = iM2762 ^ i5;
                    i8 = i4;
                    break;
                case 1635956223:
                case 1734558983:
                    if (C2966.f9654 >= 0) {
                        strM47853 = strM47853;
                        obj = obj;
                        i12 = i12;
                        iM2761 = (C0619.m2761("ܰܳ") + i7) * 65;
                        i = ((iM2761 ^ i6) * 18979) ^ 778840504;
                        i2 = -1035767089;
                        i3 = iM2761 ^ i2;
                        obj = obj;
                        i12 = i12;
                        String str111 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str111;
                    }
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    iM2761 = C0619.m2761("ۙᩳ") ^ i7;
                    i = ((iM2761 ^ i6) * (-22383)) ^ (-1380609412);
                    i2 = 1918185995;
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str112 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str112;
                    break;
                case 1770564124:
                case 1881332972:
                    if (C2288.m7767()) {
                        strM47853 = strM47853;
                        obj = obj;
                        i12 = i12;
                        iM2761 = C0619.m2761("ۤ۫") ^ i7;
                        i = ((iM2761 ^ i6) * (-21081)) ^ (-1598676893);
                        i2 = 1375481612;
                        i3 = iM2761 ^ i2;
                        obj = obj;
                        i12 = i12;
                        String str113 = strM47853;
                        i9 = i3;
                        i8 = i;
                        strM47853 = str113;
                    }
                    strM47853 = strM47853;
                    obj = obj;
                    i12 = i12;
                    iM2761 = C0619.m2761("ۙᩳ") ^ i7;
                    i = ((iM2761 ^ i6) * (-22383)) ^ (-1380609412);
                    i2 = 1918185995;
                    i3 = iM2761 ^ i2;
                    obj = obj;
                    i12 = i12;
                    String str114 = strM47853;
                    i9 = i3;
                    i8 = i;
                    strM47853 = str114;
                    break;
                default:
                    obj = obj;
                    i12 = i12;
                    strM47853 = C20932.m47853(sArr2, i10, i11, i13);
                    sArr3 = f56034;
                    if (AbstractC0641.m2813() <= 0) {
                        i12 = i12;
                        int iM2768 = C0619.m2761("ܿ᩵") ^ i6;
                        i9 = iM2768 ^ 1995639281;
                        i8 = ((iM2768 ^ i7) * (-10005)) ^ 630619589;
                        obj = obj;
                    } else {
                        int iM2769 = C0619.m2761("ۙۧ") ^ i6;
                        i9 = iM2769 ^ (-1775932277);
                        i8 = ((iM2769 ^ i7) * 12351) ^ 484017598;
                        obj = obj;
                        i12 = i12;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC3409, l.ActivityC5577, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 86209812;
        int i4 = C2966.f9654;
        int i5 = C1826.f6190;
        int iM3169 = C0773.m3169("᩶ۜ") ^ i5;
        int i6 = ((iM3169 ^ i4) * (-20317)) ^ (-345482913);
        int i7 = 1040957618;
        while (true) {
            i3 = ((((i3 ^ i4) * 29473) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1950581968:
                case 777627982:
                    if (i == 11101) {
                        iM3169 = (C0619.m2761("ᩳ۟") ^ i5) * 93;
                        i6 = ((iM3169 ^ i4) * 10375) ^ 626161609;
                        i7 = -1018987483;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۨܰ")) * 71;
                        i6 = ((iM3169 ^ i5) * (-8301)) ^ (-1703129529);
                        i7 = -1074819977;
                    }
                    break;
                case -1843101325:
                case 484492071:
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = (C0773.m3169("۠᩶") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM3169 ^ i5) * 1687) ^ 1569457422;
                        i7 = -811493937;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ᩴ᩷")) * 93;
                        i6 = ((iM3169 ^ i4) * (-30487)) ^ (-796523759);
                        i7 = 766258788;
                    }
                    break;
                case -1798203002:
                case -908378326:
                    C2419.m8174();
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("᩹۬") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-29969)) ^ 2132469147;
                        i7 = -1930599157;
                    } else {
                        iM3169 = (C0773.m3169("۠ۜ") + i5) * (-35);
                        i6 = ((iM3169 ^ i4) * 29207) ^ (-267679579);
                        i7 = 47737485;
                    }
                    break;
                case -1728468545:
                case 940379287:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("۠᩶") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM3169 ^ i5) * 1687) ^ 1569457422;
                        i7 = -811493937;
                    } else {
                        iM3169 = C0619.m2761("۠ۡ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 24115) ^ (-1087566551);
                        i7 = -1245849460;
                    }
                    break;
                case -1468434070:
                case 1525532787:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0619.m2761("ܺۜ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 3097) ^ 381482588;
                        i7 = 1713358643;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ۧܺ")) * 37;
                        i6 = ((iM3169 ^ i4) * (-5759)) ^ 121734862;
                        i7 = -2120087426;
                    }
                    break;
                case -1355671014:
                case -122759986:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ܺۜ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 3097) ^ 381482588;
                        i7 = 1713358643;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩹ܳ")) * (-83);
                        i6 = ((iM3169 ^ i4) * (-5131)) ^ (-706556203);
                        i7 = 1516229071;
                    }
                    break;
                case -526153624:
                case 153664314:
                    C2878.m9491();
                    RunnableC0334.m2063();
                    iM3169 = C0619.m2761("ܺۜ") ^ i5;
                    i6 = ((iM3169 ^ i4) * 3097) ^ 381482588;
                    i7 = 1713358643;
                    break;
                case -457834903:
                case 1955180617:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("᩹۬") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-29969)) ^ 2132469147;
                        i7 = -1930599157;
                    } else {
                        iM3169 = C0619.m2761("᩻ۛ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 32175) ^ (-91814173);
                        i7 = 1365187885;
                    }
                    break;
                case -395765901:
                case 911456634:
                    C2419.m8174();
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 29617) ^ (-1466381890);
                        i7 = 2109537059;
                    } else {
                        iM3169 = C0619.m2761("ܺۜ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 3097) ^ 381482588;
                        i7 = 1713358643;
                    }
                    break;
                case 49943094:
                case 913444668:
                    C1826.m6301();
                    C0269.m1775();
                    break;
                case 251132067:
                case 746452586:
                    super.onActivityResult(i, i2, intent);
                    break;
                case 282650585:
                case 735142028:
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("۠᩶") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM3169 ^ i5) * 1687) ^ 1569457422;
                        i7 = -811493937;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۡ") + i4) * (-23);
                        i6 = ((iM3169 ^ i5) * 29859) ^ 1292796290;
                        i7 = -46521102;
                    }
                    break;
                case 283329030:
                case 1011026241:
                    if (C2485.m8357() <= 0) {
                        iM3169 = C0619.m2761("᩹۬") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-29969)) ^ 2132469147;
                        i7 = -1930599157;
                    } else {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-10893)) ^ 2001406110;
                        i7 = -1227991774;
                    }
                    break;
                case 301046619:
                case 1435487513:
                    if (C3033.f9831 < 0) {
                        iM3169 = (C0773.m3169("۠ۜ") + i5) * (-35);
                        i6 = ((iM3169 ^ i4) * 29207) ^ (-267679579);
                        i7 = 47737485;
                    } else {
                        iM3169 = C0619.m2761("ܺۜ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 3097) ^ 381482588;
                        i7 = 1713358643;
                    }
                    break;
                case 343015733:
                case 901321994:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("۠ۜ") + i5) * (-35);
                        i6 = ((iM3169 ^ i4) * 29207) ^ (-267679579);
                        i7 = 47737485;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۡ᩸")) * 65;
                        i6 = ((iM3169 ^ i5) * 3215) ^ 1281955949;
                        i7 = 2083385523;
                    }
                    break;
                case 346194042:
                case 1412060915:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("֨ܰ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 29617) ^ (-1466381890);
                        i7 = 2109537059;
                    } else {
                        iM3169 = (C0619.m2761("ۢۛ") + i4) * 89;
                        i6 = ((iM3169 ^ i5) * 6031) ^ 2038878357;
                        i7 = -724442923;
                    }
                    break;
                case 1691494586:
                case 1717917943:
                    C10069.m26030(i, i2, intent, this.f56054);
                    this.f56054 = null;
                    break;
                default:
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0619.m2761("᩹۬") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-29969)) ^ 2132469147;
                        i7 = -1930599157;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۗ᩷")) * (-17);
                        i6 = ((iM3169 ^ i4) * (-10199)) ^ 1749651630;
                        i7 = -1267093273;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public void onStart() {
        int i = 2295923;
        int i2 = C2288.f7433;
        int i3 = C1783.f6087;
        int iM2761 = C0619.m2761("ۗܶ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 5649) ^ (-1878500577);
        int i5 = 1933114540;
        while (true) {
            i = ((((i ^ i3) * (-6837)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2084896351:
                case -24344608:
                    if (C1564.f5401 > 0) {
                        iM2761 = C0773.m3169("ۨ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14041)) ^ 1243428175;
                        i5 = 2014728006;
                    } else {
                        iM2761 = C0619.m2761("᩷֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15307) ^ (-1887386885);
                        i5 = 625073328;
                    }
                    break;
                case -1996702934:
                case -650998969:
                    RunnableC0334.m2063();
                    C2702.m8876();
                    iM2761 = C0619.m2761("᩷֫") ^ i3;
                    i4 = ((iM2761 ^ i2) * 15307) ^ (-1887386885);
                    i5 = 625073328;
                    break;
                case -1968319012:
                case 1870040914:
                    C2878.m9491();
                    C0619.m2763();
                    break;
                case -1077262933:
                case 747663666:
                    if (!C3690.m11987()) {
                        iM2761 = C0619.m2761("ۜۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30631)) ^ (-2004347698);
                        i5 = -1262996070;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14041)) ^ 1243428175;
                        i5 = 2014728006;
                    }
                    break;
                case -63980376:
                case 1401907098:
                    View view = this.f56038;
                    if (C1783.m6232() && AbstractC0116.f1064 > 0) {
                        if (!RunnableC1848.f6235) {
                            if (C2354.m7983() && C3099.f10023 > 0) {
                                if (C2485.f7950 == 0) {
                                    if (C2419.f7754 < 0 && C1321.f4751 < 0) {
                                        if (C11235.f35427 < 0) {
                                            if (C13473.f42873 == 0) {
                                                f56035 = new WeakReference(view);
                                                iM2761 = (C0619.m2761("۫᩹") + i3) * (-91);
                                                i4 = ((iM2761 ^ i2) * 15535) ^ 2005205298;
                                                i5 = 1525498413;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            iM2761 = C0619.m2761("ۜۨ") ^ i3;
                            i4 = ((iM2761 ^ i2) * (-30631)) ^ (-2004347698);
                            i5 = -1262996070;
                            break;
                        }
                        iM2761 = (C0773.m3169("ۖۚ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-15207)) ^ 349590222;
                        i5 = 1437364395;
                        break;
                    }
                    iM2761 = C0773.m3169("ۨ᩵") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-14041)) ^ 1243428175;
                    i5 = 2014728006;
                    break;
                case -20382459:
                case 292159694:
                    if (this.f56038 != null) {
                        iM2761 = C0619.m2761("ۤۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-18991)) ^ 1092127515;
                        i5 = 836607157;
                    } else {
                        iM2761 = (C0619.m2761("۫᩹") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 15535) ^ 2005205298;
                        i5 = 1525498413;
                    }
                    break;
                case 440703126:
                case 1150640147:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("᩷֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15307) ^ (-1887386885);
                        i5 = 625073328;
                    } else {
                        iM2761 = C0619.m2761("ۙۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4425)) ^ (-81825150);
                        i5 = -1151305928;
                    }
                    break;
                default:
                    super.onStart();
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public void onStop() {
        WeakReference weakReference = null;
        int i = -337476557;
        int i2 = RunnableC0334.f1808;
        int i3 = C1542.f5343;
        int iM2761 = C0619.m2761("᩺֨") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-4089)) ^ (-490252021);
        int i5 = -975729160;
        while (true) {
            i = ((((i ^ i3) * (-10365)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1955700855:
                case -261404327:
                    if (C1542.m5459() >= 0) {
                        iM2761 = (C0773.m3169("᩵۠") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 10291) ^ 241740464;
                        i5 = -352065554;
                    } else {
                        iM2761 = (C0619.m2761("ܳۗ") + i3) * 85;
                        i4 = ((iM2761 ^ i2) * 13657) ^ (-1118698843);
                        i5 = 170092826;
                    }
                    break;
                case -1848855740:
                case 1772105628:
                    if (weakReference.get() == this.f56038) {
                        iM2761 = (i3 - C0773.m3169("ۗۙ")) * (-7);
                        i4 = ((iM2761 ^ i2) * 26163) ^ 1969915236;
                        i5 = -1361953174;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۖ֫")) * (-87);
                        i4 = ((iM2761 ^ i2) * 7881) ^ (-17824930);
                        i5 = 2146586016;
                    }
                    break;
                case -1819191965:
                case 1876307317:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("᩺ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15753)) ^ (-1065196932);
                        i5 = -1685814463;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19839)) ^ (-1016215400);
                        i5 = -1456996950;
                    }
                    break;
                case -1788336668:
                case 1325411441:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (i2 - C0773.m3169("᩸֡")) * 75;
                        i4 = ((iM2761 ^ i3) * (-13581)) ^ (-1076715812);
                        i5 = -778325545;
                    } else {
                        iM2761 = C0773.m3169("ۖۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15553)) ^ 46862119;
                        i5 = -1465210385;
                    }
                    break;
                case -1784009935:
                case 1877208847:
                    super.onStop();
                    break;
                case -1763308391:
                case -629270275:
                    if (!C17202.f56030) {
                        iM2761 = (i2 - C0773.m3169("᩸֡")) * 75;
                        i4 = ((iM2761 ^ i3) * (-13581)) ^ (-1076715812);
                        i5 = -778325545;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19839)) ^ (-1016215400);
                        i5 = -1456996950;
                    }
                    break;
                case -1659531797:
                case 27402004:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i2 - C0619.m2761("᩺᩷")) * (-69);
                        i4 = ((iM2761 ^ i3) * (-24535)) ^ (-1965203790);
                        i5 = 807460275;
                    } else {
                        iM2761 = C0619.m2761("ۢ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17993)) ^ (-1298377589);
                        i5 = 2001163394;
                    }
                    break;
                case -1573805625:
                case -575432733:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i2 - C0619.m2761("᩺᩷")) * (-69);
                        i4 = ((iM2761 ^ i3) * (-24535)) ^ (-1965203790);
                        i5 = 807460275;
                    } else {
                        iM2761 = (C0773.m3169("ܽ᩹") ^ i3) * 23;
                        i4 = ((iM2761 ^ i2) * 18783) ^ 1497530271;
                        i5 = -709125349;
                    }
                    break;
                case -1372043729:
                case -305311235:
                    C4238.m13540();
                    iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-19839)) ^ (-1016215400);
                    i5 = -1456996950;
                    break;
                case -1274777579:
                case -371989059:
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = (C0773.m3169("᩵۠") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 10291) ^ 241740464;
                        i5 = -352065554;
                    } else {
                        iM2761 = C0773.m3169("ܶ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19839)) ^ (-1016215400);
                        i5 = -1456996950;
                    }
                    break;
                case -1176326594:
                case 1206313825:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i2 - C0619.m2761("᩺᩷")) * (-69);
                        i4 = ((iM2761 ^ i3) * (-24535)) ^ (-1965203790);
                        i5 = 807460275;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩷ۜ")) * 19;
                        i4 = ((iM2761 ^ i2) * 881) ^ 69177823;
                        i5 = 1023668564;
                    }
                    break;
                case -1047527159:
                case 2131428015:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("᩵۠") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 10291) ^ 241740464;
                        i5 = -352065554;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩹")) * 127;
                        i4 = ((iM2761 ^ i3) * (-6287)) ^ 998546398;
                        i5 = 178967921;
                    }
                    break;
                case -957983290:
                case 684917573:
                    if (C3077.f9998) {
                        iM2761 = (i3 - C0773.m3169("ۡۖ")) * (-47);
                        i4 = ((iM2761 ^ i2) * 20213) ^ (-531741919);
                        i5 = -1388527460;
                    } else {
                        iM2761 = (C0773.m3169("᩵۠") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 10291) ^ 241740464;
                        i5 = -352065554;
                    }
                    break;
                case -532232317:
                case 795356413:
                    C1564.m5509();
                    C3690.m11987();
                    break;
                case -19757398:
                case 1042696339:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i2 - C0773.m3169("᩸֡")) * 75;
                        i4 = ((iM2761 ^ i3) * (-13581)) ^ (-1076715812);
                        i5 = -778325545;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܽᩳ")) * (-79);
                        i4 = ((iM2761 ^ i3) * (-9461)) ^ 116449204;
                        i5 = 1121895788;
                    }
                    break;
                case 705355611:
                case 717246674:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("᩺ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15753)) ^ (-1065196932);
                        i5 = -1685814463;
                    } else {
                        iM2761 = C0773.m3169("ۘܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1061)) ^ (-961948675);
                        i5 = 1253320450;
                    }
                    break;
                case 895339093:
                case 1107808395:
                    if (this.f56038 != null) {
                        iM2761 = C0773.m3169("ۗۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23971) ^ (-609025359);
                        i5 = -1937649172;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۖ֫")) * (-87);
                        i4 = ((iM2761 ^ i2) * 7881) ^ (-17824930);
                        i5 = 2146586016;
                    }
                    break;
                case 1351320720:
                case 2079176059:
                    f56035 = null;
                    iM2761 = (i3 - C0619.m2761("ۖ֫")) * (-87);
                    i4 = ((iM2761 ^ i2) * 7881) ^ (-17824930);
                    i5 = 2146586016;
                    break;
                case 1474446570:
                case 2137210280:
                    if (C2878.f9462) {
                        iM2761 = (i2 - C0619.m2761("᩺᩷")) * (-69);
                        i4 = ((iM2761 ^ i3) * (-24535)) ^ (-1965203790);
                        i5 = 807460275;
                    } else {
                        iM2761 = C0773.m3169("ᩳܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6167)) ^ (-241281477);
                        i5 = 1918510729;
                    }
                    break;
                default:
                    weakReference = f56035;
                    if (weakReference != null) {
                        iM2761 = C0773.m3169("ܺۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27427)) ^ 827825121;
                        i5 = 1545549757;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۖ֫")) * (-87);
                        i4 = ((iM2761 ^ i2) * 7881) ^ (-17824930);
                        i5 = 2146586016;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40401(final Throwable th, final DialogInterface.OnDismissListener onDismissListener) {
        AbstractC8585 abstractC8585M10091 = null;
        int i = -640081835;
        int i2 = C3448.f11240;
        int i3 = RunnableC0334.f1808;
        int iM3169 = C0773.m3169("ۨ۟") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-381)) ^ (-626433802);
        int i5 = 1125081442;
        while (true) {
            i = ((((i ^ i3) * (-21587)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2107128682:
                case 1385738000:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۧܶ")) * 73;
                        i4 = ((iM3169 ^ i2) * 20979) ^ (-1892447427);
                        i5 = -1396248587;
                    } else {
                        iM3169 = C0773.m3169("ܳܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23619)) ^ (-17198526);
                        i5 = -1261388539;
                    }
                    break;
                case -1786218713:
                case 1432381484:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۜܶ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * (-13503)) ^ (-501945270);
                        i5 = 671876526;
                    } else {
                        iM3169 = (C0619.m2761("᩺۫") ^ i2) * (-101);
                        i4 = ((iM3169 ^ i3) * 27727) ^ (-1331667840);
                        i5 = -194927979;
                    }
                    break;
                case -1786025049:
                case 553481647:
                    final C20168 c20168 = (C20168) abstractC8585M10091;
                    runOnUiThread(new Runnable(this) { // from class: l.ܳ֡֫

                        /* JADX INFO: renamed from: ᩹ᩳۧ, reason: not valid java name and contains not printable characters */
                        private static final short[] f48879 = {8685, -4066, 11182, 5664, 28945, 28954, 28955, 28935, 28932, 28951, 28954, 28987, 29044, 28967, 28964, 28981, 28983, 28977, 29044, 28984, 28977, 28978, 28960, 29044, 28987, 28986, 29044, 28976, 28977, 28962, 28989, 28983, 28977, 3902, 2540, 10761, 11098, -6119, -3130, 8800, 3363, -2845, 28945, 28957, 28935, 28944, 28957, 28934, 28986, 28987, 28960, 29044, 28978, 28987, 28961, 28986, 28976, -1233, 3566, 846, 28986, 28987, 28960, 29044, 28977, 28972, 28989, 28967, 28960, -734, -6712, 2691, -850, 10359, 2917, 10157, -2161, -337, 28946, 28989, 28984, 28977, 29044, 28986, 28987, 28960, 29044, 28978, 28987, 28961, 28986, 28976, 29038, 29022, 5512, 15913, 5402};

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ AbstractActivityC17204 f48881;

                        {
                            int i6 = -1989102138;
                            int i7 = C1146.f4234;
                            int i8 = C3099.f10023;
                            int iM31610 = (i8 - C0773.m3169("ۨ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            int i9 = ((iM31610 ^ i7) * 27427) ^ (-844442073);
                            int i10 = 763696894;
                            while (true) {
                                i6 = ((((i6 ^ i7) * (-14713)) >> 31) & i9) ^ (iM31610 ^ i10);
                                switch (i6) {
                                    case -2016053191:
                                    case 1503292066:
                                        C1519.m5403();
                                        if (C3033.f9831 < 0) {
                                            iM31610 = (i7 - C0619.m2761("ۘ֡")) * 75;
                                            i9 = ((iM31610 ^ i8) * 28413) ^ 1747028582;
                                            i10 = -1021157293;
                                        } else {
                                            iM31610 = (i8 - C0773.m3169("ܶܶ")) * 49;
                                            i9 = ((iM31610 ^ i7) * (-9673)) ^ 2141008688;
                                            i10 = -1932849489;
                                        }
                                        break;
                                    case -1809298485:
                                    case 1444712726:
                                        if (C4238.f15451 >= 0) {
                                            iM31610 = (i8 - C0773.m3169("ܶܶ")) * 49;
                                            i9 = ((iM31610 ^ i7) * (-9673)) ^ 2141008688;
                                            i10 = -1932849489;
                                        } else {
                                            iM31610 = C0619.m2761("᩺۠") ^ i7;
                                            i9 = ((iM31610 ^ i8) * 18005) ^ (-412165344);
                                            i10 = 136623936;
                                        }
                                        break;
                                    case -1773339039:
                                    case 665872474:
                                        if (C1826.f6190 <= 0) {
                                            iM31610 = (i8 - C0773.m3169("ܶܶ")) * 49;
                                            i9 = ((iM31610 ^ i7) * (-9673)) ^ 2141008688;
                                            i10 = -1932849489;
                                        } else {
                                            iM31610 = C0773.m3169("ܰ۬") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-27261)) ^ 856503127;
                                            i10 = -362092943;
                                        }
                                        break;
                                    case -1722712345:
                                    case 1886182624:
                                        if (C13473.f42873 != 0) {
                                            iM31610 = (i8 - C0773.m3169("ܶܶ")) * 49;
                                            i9 = ((iM31610 ^ i7) * (-9673)) ^ 2141008688;
                                            i10 = -1932849489;
                                        } else {
                                            iM31610 = C0619.m2761("ۨ᩹") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-4007)) ^ 1717619174;
                                            i10 = -1712804169;
                                        }
                                        break;
                                    case -1632418977:
                                    case 1385856864:
                                        if (C4282.f15546 <= 0) {
                                            iM31610 = (i8 - C0773.m3169("ܶܶ")) * 49;
                                            i9 = ((iM31610 ^ i7) * (-9673)) ^ 2141008688;
                                            i10 = -1932849489;
                                        } else {
                                            iM31610 = C0619.m2761("ۚ᩵") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-23235)) ^ (-1370261972);
                                            i10 = -2057956958;
                                        }
                                        break;
                                    case -1557184175:
                                    case -595593682:
                                        C2966.m9664();
                                        if (!C4282.m13644()) {
                                            iM31610 = (C0773.m3169("ۜۘ") ^ i8) * (-15);
                                            i9 = ((iM31610 ^ i7) * (-30983)) ^ 1108865795;
                                            i10 = -1968543496;
                                        } else {
                                            iM31610 = C0619.m2761("ۨ᩹") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-4007)) ^ 1717619174;
                                            i10 = -1712804169;
                                        }
                                        break;
                                    case -1462107602:
                                    case 1129122104:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM31610 = (C0773.m3169("ۜۘ") ^ i8) * (-15);
                                            i9 = ((iM31610 ^ i7) * (-30983)) ^ 1108865795;
                                            i10 = -1968543496;
                                        } else {
                                            iM31610 = C0773.m3169("ۜᩴ") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-2291)) ^ 1748393468;
                                            i10 = 2091106916;
                                        }
                                        break;
                                    case -1201745180:
                                    case 1848650638:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31610 = (C0773.m3169("ۜۘ") ^ i8) * (-15);
                                            i9 = ((iM31610 ^ i7) * (-30983)) ^ 1108865795;
                                            i10 = -1968543496;
                                        } else {
                                            iM31610 = (i8 - C0619.m2761("᩶֨")) * (-15);
                                            i9 = ((iM31610 ^ i7) * 32539) ^ 1423920388;
                                            i10 = -1877033364;
                                        }
                                        break;
                                    case -858098818:
                                    case -530156434:
                                        if (C1146.m4231()) {
                                            iM31610 = C0773.m3169("ᩴ᩷") ^ i8;
                                            i9 = ((iM31610 ^ i7) * (-7267)) ^ (-347435568);
                                            i10 = 1109581274;
                                        } else {
                                            iM31610 = C0619.m2761("ۧۗ") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-3669)) ^ (-139672733);
                                            i10 = 1812362492;
                                        }
                                        break;
                                    case -792618704:
                                    case 1511218639:
                                        if (C0487.f2131 <= 0) {
                                            iM31610 = C0619.m2761("ۨ᩹") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-4007)) ^ 1717619174;
                                            i10 = -1712804169;
                                        } else {
                                            iM31610 = C0619.m2761("᩵۠") ^ i8;
                                            i9 = ((iM31610 ^ i7) * (-18177)) ^ 532646734;
                                            i10 = -958233902;
                                        }
                                        break;
                                    case 102933038:
                                    case 226124372:
                                        if (C1146.f4234 >= 0) {
                                            iM31610 = C0619.m2761("ۨ᩹") ^ i7;
                                            i9 = ((iM31610 ^ i8) * (-4007)) ^ 1717619174;
                                            i10 = -1712804169;
                                        } else {
                                            iM31610 = (C0773.m3169("ܿ֨") ^ i8) * (-61);
                                            i9 = ((iM31610 ^ i7) * (-20075)) ^ 1923631622;
                                            i10 = -1569475653;
                                        }
                                        break;
                                    case 443771359:
                                    case 1336762180:
                                        return;
                                    case 697368612:
                                    case 1312760463:
                                        C3690.m11987();
                                        throw new RuntimeException();
                                    case 892313979:
                                    case 1973167348:
                                        if (C20932.f66974 <= 0) {
                                            iM31610 = (i7 - C0619.m2761("ۘ֡")) * 75;
                                            i9 = ((iM31610 ^ i8) * 28413) ^ 1747028582;
                                            i10 = -1021157293;
                                        } else {
                                            iM31610 = C0773.m3169("ۢ᩸") ^ i7;
                                            i9 = ((iM31610 ^ i8) * 27359) ^ 566120468;
                                            i10 = -1235545094;
                                        }
                                        break;
                                    case 1785554821:
                                    case 1803470409:
                                        C3448.m11248();
                                        iM31610 = C0619.m2761("ۨ᩹") ^ i7;
                                        i9 = ((iM31610 ^ i8) * (-4007)) ^ 1717619174;
                                        i10 = -1712804169;
                                        break;
                                    default:
                                        this.f48881 = this;
                                        if (C1519.m5403()) {
                                            iM31610 = (C0619.m2761("۠ۡ") ^ i8) * (-41);
                                            i9 = ((iM31610 ^ i7) * 6911) ^ 1276473510;
                                            i10 = 1285237248;
                                        } else {
                                            iM31610 = (i7 - C0619.m2761("ۘ֡")) * 75;
                                            i9 = ((iM31610 ^ i8) * 28413) ^ 1747028582;
                                            i10 = -1021157293;
                                        }
                                        break;
                                }
                            }
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35621. Try increasing type updates limit count.
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 3562
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC14966.run():void");
                        }
                    });
                    break;
                case -1773454374:
                case -12158635:
                    C0773.m3161();
                    iM3169 = (C0619.m2761("᩺۟") + i2) * (-113);
                    i4 = ((iM3169 ^ i3) * 15621) ^ (-1213807465);
                    i5 = -1901172413;
                    break;
                case -1421475533:
                case -702902497:
                    if (RunnableC1848.f6235) {
                        iM3169 = (i3 - C0773.m3169("ۛܶ")) * 69;
                        i4 = ((iM3169 ^ i2) * 4171) ^ 2001182517;
                        i5 = 301742770;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֫ܿ")) * (-41);
                        i4 = ((iM3169 ^ i3) * (-19233)) ^ (-1612197220);
                        i5 = -230304236;
                    }
                    break;
                case -1366903226:
                case 865299754:
                    abstractC8585M10091 = C3099.m10091(this);
                    if (abstractC8585M10091.mo23076() == EnumC2619.DESTROYED) {
                        iM3169 = C0619.m2761("᩶ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9413) ^ 340498850;
                        i5 = 2006770225;
                    } else {
                        iM3169 = C0773.m3169("ۘۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-19117)) ^ 42684723;
                        i5 = -927722983;
                    }
                    break;
                case -1359408776:
                case -890746:
                    if (C1080.m4050()) {
                        iM3169 = (i3 - C0773.m3169("ᩴۧ")) * (-33);
                        i4 = ((iM3169 ^ i2) * 27971) ^ 1545173041;
                        i5 = -1477654427;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۛܶ")) * 69;
                        i4 = ((iM3169 ^ i2) * 4171) ^ 2001182517;
                        i5 = 301742770;
                    }
                    break;
                case -1253701439:
                case 1812545142:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0619.m2761("ۚ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1999)) ^ (-1989926184);
                        i5 = -1621403536;
                    } else {
                        iM3169 = (C0773.m3169("ۤܺ") + i3) * 41;
                        i4 = ((iM3169 ^ i2) * 28169) ^ 1172356418;
                        i5 = -1890202565;
                    }
                    break;
                case -990957085:
                case -123203674:
                    C1783.m6232();
                    C2023.m6964();
                    break;
                case -417432112:
                case 1553590212:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۜܶ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * (-13503)) ^ (-501945270);
                        i5 = 671876526;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۙۖ")) * 35;
                        i4 = ((iM3169 ^ i2) * (-16383)) ^ 83461788;
                        i5 = 1790086268;
                    }
                    break;
                case -309044188:
                case 742915948:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (i3 - C0773.m3169("ۛܶ")) * 69;
                        i4 = ((iM3169 ^ i2) * 4171) ^ 2001182517;
                        i5 = 301742770;
                    } else {
                        iM3169 = (i2 - C0773.m3169("֨᩹")) * (-99);
                        i4 = ((iM3169 ^ i3) * (-18469)) ^ (-1348056047);
                        i5 = -1102946170;
                    }
                    break;
                case -43558646:
                case 254714731:
                    C1146.m4231();
                    if (!RunnableC1848.f6235) {
                        iM3169 = (i3 - C0773.m3169("ۛܶ")) * 69;
                        i4 = ((iM3169 ^ i2) * 4171) ^ 2001182517;
                        i5 = 301742770;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۧܶ")) * 73;
                        i4 = ((iM3169 ^ i2) * 20979) ^ (-1892447427);
                        i5 = -1396248587;
                    }
                    break;
                case 77539153:
                case 1109403614:
                    break;
                case 183633463:
                case 347529558:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ۚ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1999)) ^ (-1989926184);
                        i5 = -1621403536;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۠᩸")) * 53;
                        i4 = ((iM3169 ^ i3) * (-21553)) ^ (-1165366111);
                        i5 = 1166728438;
                    }
                    break;
                case 1040957546:
                case 1229534425:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ۜܶ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * (-13503)) ^ (-501945270);
                        i5 = 671876526;
                    } else {
                        iM3169 = C0773.m3169("ۡᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16213)) ^ (-1551092059);
                        i5 = 2003937088;
                    }
                    break;
                case 1120843325:
                case 2030952913:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۛܶ")) * 69;
                        i4 = ((iM3169 ^ i2) * 4171) ^ 2001182517;
                        i5 = 301742770;
                    } else {
                        iM3169 = C0773.m3169("ۧۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 19483) ^ 1643314720;
                        i5 = -668238278;
                    }
                    break;
                case 1836601046:
                case 1860837685:
                    C2354.m7983();
                    if (!RunnableC0334.m2063()) {
                        iM3169 = (C0619.m2761("᩺۟") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 15621) ^ (-1213807465);
                        i5 = -1901172413;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-1999)) ^ (-1989926184);
                        i5 = -1621403536;
                    }
                    break;
                default:
                    C11235.m28309();
                    if (C3779.f12953 > 0) {
                        iM3169 = (i3 - C0773.m3169("ۧܶ")) * 73;
                        i4 = ((iM3169 ^ i2) * 20979) ^ (-1892447427);
                        i5 = -1396248587;
                    } else {
                        iM3169 = (C0619.m2761("᩺۟") + i2) * (-113);
                        i4 = ((iM3169 ^ i3) * 15621) ^ (-1213807465);
                        i5 = -1901172413;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40408(InterfaceC19020 interfaceC19020) {
        this.f56054 = interfaceC19020;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014a A[PHI: r3 r4 r5
      0x014a: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:40:0x0148, B:28:0x00cb, B:16:0x0074, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:40:0x0148, B:28:0x00cb, B:16:0x0074, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:40:0x0148, B:28:0x00cb, B:16:0x0074, B:14:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0183 A[PHI: r14 r15
      0x0183: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:44:0x0181, B:14:0x0070, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:44:0x0181, B:14:0x0070, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0276 A[PHI: r1 r8 r13 r17 r18
      0x0276: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:67:0x0274, B:63:0x0257, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:67:0x0274, B:63:0x0257, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:67:0x0274, B:63:0x0257, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:67:0x0274, B:63:0x0257, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:67:0x0274, B:63:0x0257, B:48:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a9 A[PHI: r6 r7 r9 r16
      0x02a9: PHI (r6v5 short[]) = (r6v2 short[]), (r6v3 short[]), (r6v2 short[]) binds: [B:71:0x02a7, B:32:0x00ec, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:71:0x02a7, B:32:0x00ec, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r9v5 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:71:0x02a7, B:32:0x00ec, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02a7, B:32:0x00ec, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02d9 A[PHI: r11 r23
      0x02d9: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:75:0x02d7, B:59:0x0235, B:11:0x0067, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:75:0x02d7, B:59:0x0235, B:11:0x0067, B:8:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m40418(int i) {
        int iM3169;
        int i2;
        int i3;
        int i4 = C2419.f7754;
        int i5 = C2834.f9334;
        int iM2761 = C0619.m2761("ۗ۟") ^ i5;
        int i6 = ((iM2761 ^ i4) * (-30567)) ^ (-182578398);
        View view = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2761 ^ 145268802;
        int i8 = 0;
        int iM31610 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 1904754418;
        int i16 = 0;
        String strM2049 = null;
        int i17 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 8665) >> 31));
            switch (i15) {
                case -2143928652:
                case -1370782559:
                    strM2049 = RunnableC0334.m2049(sArr3, i9, i10, i11);
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0773.m3169("֨ۡ") + i4) * 7;
                        i2 = ((iM3169 ^ i5) * (-4555)) ^ 457850960;
                        i3 = 2077553227;
                    } else {
                        iM3169 = C0773.m3169("᩷ۤ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 11903) ^ 963275637;
                        i3 = -744714123;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1928098683:
                case -602739016:
                    iM31610 = C0773.m3169(C1564.m5510(sArr2, i12, i13, i11));
                    i17 = 2129589780;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("֨ۡ") + i4) * 7;
                        i2 = ((iM3169 ^ i5) * (-4555)) ^ 457850960;
                        i3 = 2077553227;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩻") ^ i5) * 9;
                        i2 = ((iM3169 ^ i4) * 31241) ^ 362537568;
                        i3 = -335189917;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1824491068:
                case -1397177900:
                    i12 = 477;
                    i13 = 3;
                    if (C1080.m4050()) {
                        iM3169 = C0619.m2761("ۧ᩺") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-26655)) ^ 683423028;
                        i3 = 90488188;
                    } else {
                        iM3169 = (C0773.m3169("ۤۙ") + i5) * (-17);
                        i2 = ((iM3169 ^ i4) * 29175) ^ 1335974349;
                        i3 = -59153115;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1810668730:
                case 1686121994:
                    i11 = 61460;
                    iM3169 = C0773.m3169("ۢۚ") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-23775)) ^ 1299673034;
                    i3 = -1844813635;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1800870713:
                case -1063275490:
                    C2485.m8357();
                    return null;
                case -1759359343:
                case -829521771:
                    i16 = i14 + 11276164;
                    s2 = 6716;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-315)) ^ (-1773510826);
                        i3 = -666482755;
                    } else {
                        iM3169 = C0619.m2761("᩶ܺ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-22931)) ^ (-1347875898);
                        i3 = -1262920185;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1716806603:
                case 1244899329:
                    s = sArr[c];
                    i14 = s * s;
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0773.m3169("᩷᩻") ^ i4;
                        i2 = ((iM3169 ^ i5) * 2153) ^ 1301500732;
                        i3 = 1782754621;
                    } else {
                        iM3169 = C0773.m3169("۠ۢ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-19213)) ^ (-539794036);
                        i3 = -664066237;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1663688984:
                case 2115775476:
                    if (i8 == (C0773.m3169(strM2049) ^ 2122364242)) {
                        iM3169 = (i5 - C0773.m3169("᩻᩺")) * 51;
                        i2 = ((iM3169 ^ i4) * 147) ^ (-2018858409);
                        i3 = -1568047352;
                    } else {
                        iM3169 = (C0619.m2761("֫ۡ") ^ i4) * 101;
                        i2 = ((iM3169 ^ i5) * (-15969)) ^ 1435894621;
                        i3 = -732751466;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -1282855574:
                case 1988428174:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("ۤۙ") + i5) * (-17);
                        i2 = ((iM3169 ^ i4) * 29175) ^ 1335974349;
                        i3 = -59153115;
                    } else {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-315)) ^ (-1773510826);
                        i3 = -666482755;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -962213195:
                case 512561191:
                    sArr3 = f56034;
                    i9 = 480;
                    i10 = 3;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("᩹ۙ") + i5) * 99;
                        i2 = ((iM3169 ^ i4) * 11615) ^ 1009329058;
                        i3 = 424180890;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩸۠")) * 123;
                        i2 = ((iM3169 ^ i5) * (-14649)) ^ (-1335621825);
                        i3 = 264916194;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -856253647:
                case 630628794:
                    view = null;
                    if (i8 == (iM31610 ^ i17)) {
                        iM3169 = C0619.m2761("ܿ֨") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-19141)) ^ 860296886;
                        i3 = -1870519793;
                    } else {
                        iM3169 = (C0773.m3169("ۙᩴ") + i4) * (-77);
                        i2 = ((iM3169 ^ i5) * (-14139)) ^ (-1405636743);
                        i3 = 890712458;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -582809259:
                case 2078047293:
                    i8 = i & (-65536);
                    sArr2 = f56034;
                    if (C1783.m6232()) {
                        iM3169 = C0773.m3169("ۖܶ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-24323)) ^ 1490883458;
                        i3 = -603384012;
                    } else {
                        iM3169 = C0773.m3169("᩷᩻") ^ i4;
                        i2 = ((iM3169 ^ i5) * 2153) ^ 1301500732;
                        i3 = 1782754621;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -540315242:
                case 2049736257:
                    setContentView(i);
                    return view;
                case -499768749:
                case 240547457:
                    C2485.m8357();
                    if (C3734.f12817 < 0) {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-315)) ^ (-1773510826);
                        i3 = -666482755;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۙ") + i5) * 99;
                        i2 = ((iM3169 ^ i4) * 11615) ^ 1009329058;
                        i3 = 424180890;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -352154922:
                case 1195925324:
                    sArr = f56034;
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۚ۬") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-24961)) ^ (-775734555);
                        i3 = -620664088;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۙ") + i5) * 99;
                        i2 = ((iM3169 ^ i4) * 11615) ^ 1009329058;
                        i3 = 424180890;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -67907501:
                case 324808211:
                    if (i16 - (s * s2) >= 0) {
                        iM3169 = C0619.m2761("᩶ۘ") ^ i4;
                        i2 = ((iM3169 ^ i5) * 27811) ^ 1224963108;
                        i3 = 476551662;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩸ܽ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM3169 ^ i5) * 12735) ^ 1446269573;
                        i3 = -700761536;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case -54707669:
                case 491260203:
                    i11 = 55423;
                    iM3169 = C0773.m3169("ۢۚ") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-23775)) ^ 1299673034;
                    i3 = -1844813635;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 7152698:
                case 1205981050:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("᩻ᩴ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-315)) ^ (-1773510826);
                        i3 = -666482755;
                    } else {
                        iM3169 = (C0773.m3169("ۚܿ") ^ i5) * 91;
                        i2 = ((iM3169 ^ i4) * 23401) ^ 895515007;
                        i3 = 1750211803;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 298906999:
                case 1345505646:
                    C2834.m9344();
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("֨ۡ") + i4) * 7;
                        i2 = ((iM3169 ^ i5) * (-4555)) ^ 457850960;
                        i3 = 2077553227;
                    } else {
                        iM3169 = (C0773.m3169("ۤۙ") + i5) * (-17);
                        i2 = ((iM3169 ^ i4) * 29175) ^ 1335974349;
                        i3 = -59153115;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 625481620:
                case 1081420878:
                    C0487.m2356();
                    C3779.m12264();
                    iM3169 = (C0773.m3169("֨ۡ") + i4) * 7;
                    i2 = ((iM3169 ^ i5) * (-4555)) ^ 457850960;
                    i3 = 2077553227;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 1400270896:
                case 1537379885:
                    c = 476;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("᩷᩻") ^ i4;
                        i2 = ((iM3169 ^ i5) * 2153) ^ 1301500732;
                        i3 = 1782754621;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩹ۢ")) * (-25);
                        i2 = ((iM3169 ^ i5) * 24637) ^ (-545411793);
                        i3 = -424853018;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    break;
                case 1415687671:
                case 1770985355:
                    super.setTitle(i);
                    return view;
                default:
                    return findViewById(i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x024c A[PHI: r4 r6
      0x024c: PHI (r4v4 android.net.Uri) = (r4v3 android.net.Uri), (r4v2 android.net.Uri), (r4v2 android.net.Uri) binds: [B:65:0x024a, B:10:0x0060, B:135:0x024c] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r6v4 l.ۢ֫ܺ) = (r6v3 l.ۢ֫ܺ), (r6v2 l.ۢ֫ܺ), (r6v2 l.ۢ֫ܺ) binds: [B:65:0x024a, B:10:0x0060, B:135:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0320 A[PHI: r3
      0x0320: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:81:0x0307, B:73:0x02b5, B:25:0x008f, B:136:0x0320] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0392 A[PHI: r13 r23
      0x0392: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:92:0x0390, B:54:0x01c2, B:10:0x0060, B:7:0x0058, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r23v3 short) = (r23v2 short), (r23v1 short), (r23v1 short), (r23v1 short), (r23v1 short) binds: [B:92:0x0390, B:54:0x01c2, B:10:0x0060, B:7:0x0058, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03c7 A[PHI: r17 r22
      0x03c7: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:96:0x03c5, B:7:0x0058, B:137:0x03c7] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r22v5 char) = (r22v4 char), (r22v3 char), (r22v3 char) binds: [B:96:0x03c5, B:7:0x0058, B:137:0x03c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m40410() {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        AbstractActivityC17204 abstractActivityC17204 = this;
        int i5 = RunnableC0334.f1808;
        int i6 = C1783.f6087;
        int iM2762 = (C0619.m2761("ۧ᩸") ^ i6) * (-21);
        int i7 = ((iM2762 ^ i5) * (-2797)) ^ (-980435106);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM2762 ^ (-877359569);
        int i9 = 0;
        Intent intent = null;
        short s = 0;
        int i10 = 0;
        int i11 = 1510424053;
        char c = 0;
        short s2 = 0;
        ActivityNotFoundException activityNotFoundException = null;
        ComponentName componentName = null;
        ComponentName componentNameM7302 = null;
        InterfaceC9801 interfaceC9801 = null;
        Uri uri = null;
        String strM3780 = null;
        InterfaceC9801 interfaceC9802 = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * (-3849)) >> 31));
            switch (i11) {
                case -2094646214:
                case 786498551:
                    break;
                case -1850731357:
                case 595238384:
                    AbstractC3624.m11767(intent, 2);
                    sArr3 = f56034;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("᩵ܺ") ^ i6;
                        i3 = ((iM2761 ^ i5) * 14325) ^ (-1507652304);
                        i4 = -478401283;
                    } else {
                        iM2761 = C0619.m2761("۠۟") ^ i5;
                        i3 = ((iM2761 ^ i6) * (-8565)) ^ 683228316;
                        i4 = -953918908;
                    }
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    break;
                case -1846117633:
                case 937123778:
                    i10 = 20477;
                    iM3169 = C0619.m2761("ܰ۠") ^ i5;
                    i = ((iM3169 ^ i6) * 32625) ^ (-489866298);
                    i2 = 2134075333;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -1655492283:
                case -154915861:
                    if (getPackageManager().canRequestPackageInstalls()) {
                        iM3169 = C0773.m3169("ۧܳ") ^ i6;
                        i = ((iM3169 ^ i5) * 17483) ^ (-35172197);
                        i2 = -1437721846;
                    } else {
                        iM3169 = C0619.m2761("᩸ۡ") ^ i5;
                        i = ((iM3169 ^ i6) * 1093) ^ 1672695254;
                        i2 = 1232932804;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -1644874204:
                case 2093075042:
                    C2375.m8061(C3492.m11489(ApplicationC17729.f58258).remove(strM3780));
                    break;
                case -1454670226:
                case 1706871634:
                    C4282.m13644();
                    break;
                case -1425133970:
                case -558863890:
                    C3077.m10041();
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM3169 ^ i6) * 13269) ^ (-1830761276);
                        i2 = -1635038892;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        abstractActivityC17204 = this;
                    } else {
                        iM2761 = C0619.m2761("᩵ܺ") ^ i6;
                        i3 = ((iM2761 ^ i5) * 14325) ^ (-1507652304);
                        i4 = -478401283;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1422627534:
                case -426796762:
                    C3077.m10041();
                    C2288.m7767();
                    iM2761 = C0619.m2761("᩵ܺ") ^ i6;
                    i3 = ((iM2761 ^ i5) * 14325) ^ (-1507652304);
                    i4 = -478401283;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    break;
                case -1402246621:
                case 1445741666:
                    try {
                        RunnableC1848.m6363(abstractActivityC17204, intent);
                        iM3169 = (C0619.m2761("ۡ֡") ^ i6) * (-95);
                        i = ((iM3169 ^ i5) * (-6007)) ^ (-1881758641);
                        i2 = 241043665;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        abstractActivityC17204 = this;
                    } catch (ActivityNotFoundException e) {
                        int iM2763 = (C0619.m2761("ۚۖ") + i5) * 31;
                        i3 = ((iM2763 ^ i6) * (-22785)) ^ (-507079759);
                        i8 = iM2763 ^ 1106203195;
                        activityNotFoundException = e;
                        i7 = i3;
                    }
                    break;
                case -1387998423:
                case 809421340:
                    AbstractC0116.m1243();
                    if (!C2702.m8876()) {
                        iM3169 = C0619.m2761("۠۫") ^ i5;
                        i = ((iM3169 ^ i6) * (-10217)) ^ (-998394114);
                        i2 = -351319254;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        abstractActivityC17204 = this;
                    } else {
                        iM2761 = C0619.m2761("᩵ܺ") ^ i6;
                        i3 = ((iM2761 ^ i5) * 14325) ^ (-1507652304);
                        i4 = -478401283;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1338995552:
                case -194855289:
                    C2375.m8061(C3492.m11489(interfaceC9801).remove(strM3780));
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("۬᩹") ^ i6;
                        i = ((iM3169 ^ i5) * 30037) ^ (-1820022159);
                        i2 = -412070958;
                    } else {
                        iM3169 = (C0619.m2761("ܳ֫") + i6) * (-25);
                        i = ((iM3169 ^ i5) * 30207) ^ 2125022389;
                        i2 = -1968625291;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -1212031644:
                case 1107004440:
                    if (C0950.f3488 >= 0) {
                        int iM2764 = (i6 - C0619.m2761("ۡ᩶")) * (-35);
                        i = ((iM2764 ^ i5) * (-7299)) ^ 1639816363;
                        i8 = iM2764 ^ (-932533941);
                        intent = null;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۬") + i5) * (-93);
                        i = ((iM3169 ^ i6) * (-12677)) ^ (-1534050979);
                        i2 = -1566398961;
                        i8 = iM3169 ^ i2;
                    }
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -1011534482:
                case -704061310:
                    RunnableC3055.m9930(abstractActivityC17204, activityNotFoundException, componentName);
                    iM3169 = (C0619.m2761("ۡ֡") ^ i6) * (-95);
                    i = ((iM3169 ^ i5) * (-6007)) ^ (-1881758641);
                    i2 = 241043665;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -931224542:
                case 1790614549:
                    intent.setComponent(componentName);
                    iM2761 = (C0773.m3169("ۤۨ") + i6) * (-115);
                    i3 = ((iM2761 ^ i5) * 18359) ^ 1833402522;
                    i4 = -63106224;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    break;
                case -847363567:
                case -723969964:
                    s2 = sArr[c];
                    s = 13360;
                    if (C0773.f2792 <= 0) {
                        int iM2765 = (i6 - C0619.m2761("ۡ᩶")) * (-35);
                        i = ((iM2765 ^ i5) * (-7299)) ^ 1639816363;
                        i8 = iM2765 ^ (-932533941);
                        intent = null;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩵") ^ i5;
                        i = ((iM3169 ^ i6) * 30625) ^ 28071992;
                        i2 = -832292688;
                        i8 = iM3169 ^ i2;
                    }
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -776772744:
                case 1960749583:
                    i10 = 20110;
                    iM3169 = C0619.m2761("ܰ۠") ^ i5;
                    i = ((iM3169 ^ i6) * 32625) ^ (-489866298);
                    i2 = 2134075333;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -769736187:
                case 1250720954:
                    if (Build.VERSION.SDK_INT >= 26) {
                        iM3169 = (C0773.m3169("ܺᩴ") ^ i5) * 7;
                        i = ((iM3169 ^ i6) * 14853) ^ (-1970869161);
                        i2 = 2013175730;
                    } else {
                        iM3169 = (C0619.m2761("ۡ֡") ^ i6) * (-95);
                        i = ((iM3169 ^ i5) * (-6007)) ^ (-1881758641);
                        i2 = 241043665;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -672314485:
                case 1763081981:
                    AbstractC3624.m11767(intent, 268435456);
                    AbstractC3624.m11767(intent, 1);
                    if (C20932.f66974 > 0) {
                        iM2761 = C0773.m3169("ܰۙ") ^ i6;
                        i3 = ((iM2761 ^ i5) * (-27261)) ^ 1236526819;
                        i4 = 1766724015;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                    } else {
                        int iM2766 = (i6 - C0619.m2761("ۡ᩶")) * (-35);
                        i = ((iM2766 ^ i5) * (-7299)) ^ 1639816363;
                        i8 = iM2766 ^ (-932533941);
                        intent = null;
                        i7 = i;
                        abstractActivityC17204 = this;
                    }
                    break;
                case -632359269:
                case 1282450896:
                    if (C2354.m7983()) {
                        iM3169 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM3169 ^ i6) * 13269) ^ (-1830761276);
                        i2 = -1635038892;
                        i8 = iM3169 ^ i2;
                    } else {
                        int iM2767 = (i6 - C0619.m2761("ۡ᩶")) * (-35);
                        i = ((iM2767 ^ i5) * (-7299)) ^ 1639816363;
                        i8 = iM2767 ^ (-932533941);
                        intent = null;
                    }
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -528830512:
                case 1088534380:
                    uri = Uri.parse(C2702.m8877(ApplicationC17729.f58258, strM3780, ""));
                    interfaceC9801 = ApplicationC17729.f58258;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("۟֨") ^ i5;
                        i = ((iM3169 ^ i6) * 13269) ^ (-1830761276);
                        i2 = -1635038892;
                    } else {
                        iM3169 = (i5 - C0619.m2761("֡᩸")) * (-67);
                        i = ((iM3169 ^ i6) * 10867) ^ (-739685139);
                        i2 = 1589929176;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -504812815:
                case 1247962263:
                    short[] sArr4 = f56034;
                    if (C1321.f4751 >= 0) {
                        int iM2768 = (i6 - C0619.m2761("ۡ᩶")) * (-35);
                        i = ((iM2768 ^ i5) * (-7299)) ^ 1639816363;
                        i8 = iM2768 ^ (-932533941);
                        intent = null;
                    } else {
                        intent = new Intent(C1826.m6310(sArr4, 357, 26, i10));
                        if (C3734.f12817 >= 0) {
                            iM3169 = C0773.m3169("ᩳ᩵") ^ i6;
                            i = ((iM3169 ^ i5) * (-3143)) ^ (-1058987329);
                            i2 = -34145552;
                        } else {
                            iM3169 = (C0773.m3169("ܽۤ") + i5) * (-101);
                            i = ((iM3169 ^ i6) * (-22709)) ^ 1186113914;
                            i2 = -1544337489;
                        }
                        i8 = iM3169 ^ i2;
                    }
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -224690316:
                case 441589866:
                    intent.setDataAndType(uri, C3734.m12149(sArr3, 383, 39, i10));
                    if (AbstractC3624.m11755() == 0) {
                        iM2761 = (i6 - C0619.m2761("֫֨")) * 29;
                        i3 = ((iM2761 ^ i5) * (-20819)) ^ 361186002;
                        i4 = 1525497341;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۬") + i5) * (-93);
                        i = ((iM3169 ^ i6) * (-12677)) ^ (-1534050979);
                        i2 = -1566398961;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        abstractActivityC17204 = this;
                    }
                    break;
                case -154274237:
                case 1356516103:
                    strM3780 = C0950.m3780(sArr2, i9, 4, i10);
                    if (interfaceC9802.contains(strM3780)) {
                        iM3169 = C0619.m2761("᩻ܿ") ^ i5;
                        i = ((iM3169 ^ i6) * (-6901)) ^ 2068074897;
                        i2 = -1015486208;
                    } else {
                        iM3169 = (C0619.m2761("ۡ֡") ^ i6) * (-95);
                        i = ((iM3169 ^ i5) * (-6007)) ^ (-1881758641);
                        i2 = 241043665;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case -107508994:
                case -69519630:
                    int i12 = s2 + s;
                    if ((i12 * i12) - (53440 * s2) < 0) {
                        iM3169 = C0619.m2761("ܽۨ") ^ i5;
                        i = ((iM3169 ^ i6) * (-19199)) ^ 16237317;
                        i2 = 1096921995;
                    } else {
                        iM3169 = C0619.m2761("ۡ᩻") ^ i6;
                        i = ((iM3169 ^ i5) * 30393) ^ (-746889834);
                        i2 = -607978317;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case 235572087:
                case 312270934:
                    if (C1542.f5343 > 0) {
                        iM3169 = C0619.m2761("۬᩹") ^ i6;
                        i = ((iM3169 ^ i5) * 30037) ^ (-1820022159);
                        i2 = -412070958;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                        abstractActivityC17204 = this;
                    } else {
                        iM2761 = C0619.m2761("᩵ܺ") ^ i6;
                        i3 = ((iM2761 ^ i5) * 14325) ^ (-1507652304);
                        i4 = -478401283;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 264748865:
                case 2039274511:
                    interfaceC9802 = ApplicationC17729.f58258;
                    sArr2 = f56034;
                    i9 = 353;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("۠۫") ^ i5;
                        i = ((iM3169 ^ i6) * (-10217)) ^ (-998394114);
                        i2 = -351319254;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ܶ᩷")) * 87;
                        i = ((iM3169 ^ i5) * 30093) ^ 793030232;
                        i2 = -1044973056;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case 567090010:
                case 1936604530:
                    try {
                        intent.setComponent(componentNameM7302);
                        C3033.m9858(abstractActivityC17204, intent);
                        iM2761 = (i6 - C0619.m2761("᩺֡")) * 91;
                        i3 = ((iM2761 ^ i5) * (-5797)) ^ (-122377741);
                        i4 = -597828625;
                    } catch (ActivityNotFoundException unused) {
                        iM2761 = (C0619.m2761("᩷ܳ") ^ i5) * 61;
                        i3 = ((iM2761 ^ i6) * (-28951)) ^ (-1611745362);
                        i4 = -1488873262;
                    }
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    break;
                case 572254658:
                case 2033365274:
                    sArr = f56034;
                    c = 352;
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ܿ۬") + i5) * (-93);
                        i = ((iM3169 ^ i6) * (-12677)) ^ (-1534050979);
                        i2 = -1566398961;
                    } else {
                        iM3169 = C0773.m3169("ܶܽ") ^ i6;
                        i = ((iM3169 ^ i5) * (-14641)) ^ (-1874134489);
                        i2 = -1628596379;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    abstractActivityC17204 = this;
                    break;
                case 1026967720:
                case 1368000872:
                    componentNameM7302 = C2119.m7302(getPackageManager());
                    componentName = null;
                    if (componentNameM7302 != null) {
                        iM2761 = (C0773.m3169("ܿ۠") ^ i6) * (-17);
                        i3 = ((iM2761 ^ i5) * (-21209)) ^ 1608010930;
                        i4 = 1642903403;
                    } else {
                        iM2761 = (C0773.m3169("ۤۨ") + i6) * (-115);
                        i3 = ((iM2761 ^ i5) * 18359) ^ 1833402522;
                        i4 = -63106224;
                    }
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C16390 m40411() {
        return this.f56046;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[PHI: r4 r5 r14
      0x00c0: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:29:0x00be, B:21:0x007d, B:15:0x0061, B:13:0x005e, B:10:0x0057, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:29:0x00be, B:21:0x007d, B:15:0x0061, B:13:0x005e, B:10:0x0057, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:29:0x00be, B:21:0x007d, B:15:0x0061, B:13:0x005e, B:10:0x0057, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a2 A[PHI: r2 r11 r13
      0x01a2: PHI (r2v4 l.ܶ᩹) = (r2v2 l.ܶ᩹), (r2v2 l.ܶ᩹), (r2v6 l.ܶ᩹) binds: [B:48:0x01a0, B:7:0x0052, B:75:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r11v5 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:48:0x01a0, B:7:0x0052, B:75:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v6 short[]) binds: [B:48:0x01a0, B:7:0x0052, B:75:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024b A[PHI: r7 r10
      0x024b: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:64:0x0249, B:60:0x022c, B:52:0x01d8, B:13:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:64:0x0249, B:60:0x022c, B:52:0x01d8, B:13:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x027a A[PHI: r3 r19
      0x027a: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:68:0x0278, B:25:0x009f, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:68:0x0278, B:25:0x009f, B:10:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40393() {
        int iM2761;
        int i;
        int i2;
        int i3 = C2354.f7599;
        int i4 = C1519.f5300;
        int iM3169 = C0773.m3169("᩶ۡ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-24907)) ^ 1281558549;
        String strM8881 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-1377020972);
        int iM31610 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1073766698;
        C16390 c16390 = null;
        AbstractC2944 abstractC2944M13853 = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 17257) >> 31));
            switch (i11) {
                case -1778107054:
                case 1590893177:
                    s3 = 264;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (i3 - C0773.m3169("ܽ֫")) * (-111);
                        i = ((iM2761 ^ i4) * 23977) ^ 1069703342;
                        i2 = 800622758;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩷") + i4) * 81;
                        i = ((iM2761 ^ i3) * 17075) ^ 1311881496;
                        i2 = 432593729;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1778073635:
                case 203604932:
                    s = sArr[c];
                    s2 = 66;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0773.m3169("ܶܺ") ^ i4) * (-85);
                        i = ((iM2761 ^ i3) * (-24519)) ^ (-529877148);
                        i2 = -638039026;
                    } else {
                        iM2761 = C0773.m3169("᩻ܳ") ^ i4;
                        i = ((iM2761 ^ i3) * 12747) ^ 1686120406;
                        i2 = -353922602;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1633177998:
                case 318386855:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("᩵᩹") + i4) * 5;
                        i = ((iM2761 ^ i3) * 11587) ^ (-1111692838);
                        i2 = 16653813;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽ֫")) * (-111);
                        i = ((iM2761 ^ i4) * 23977) ^ 1069703342;
                        i2 = 800622758;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1373142863:
                case 503467072:
                    c16390 = this.f56046;
                    sArr2 = f56034;
                    if (C2966.m9664()) {
                        int iM31611 = C0773.m3169("ۗۖ") ^ i3;
                        i5 = ((iM31611 ^ i4) * (-1461)) ^ 677102283;
                        i6 = iM31611 ^ (-2081801494);
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽ֫")) * (-111);
                        i = ((iM2761 ^ i4) * 23977) ^ 1069703342;
                        i2 = 800622758;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1365250915:
                case 1226732193:
                    if ((s * s3) - i8 > 0) {
                        iM2761 = (C0619.m2761("᩵ܶ") + i4) * 31;
                        i = ((iM2761 ^ i3) * 31533) ^ (-1704838671);
                        i2 = -690964750;
                    } else {
                        iM2761 = (C0773.m3169("۠ۨ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2761 ^ i4) * (-16245)) ^ (-1519900364);
                        i2 = -1013899818;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1233568806:
                case 213602391:
                    C3734.m12152();
                    iM2761 = (C0773.m3169("᩵᩹") + i4) * 5;
                    i = ((iM2761 ^ i3) * 11587) ^ (-1111692838);
                    i2 = 16653813;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1231835581:
                case 1275540954:
                    if (C3077.m10041()) {
                        iM2761 = (C0773.m3169("᩵᩹") + i4) * 5;
                        i = ((iM2761 ^ i3) * 11587) ^ (-1111692838);
                        i2 = 16653813;
                    } else {
                        iM2761 = C0619.m2761("۠ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-21541)) ^ 459818126;
                        i2 = -1663335023;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1215399921:
                case 1225200132:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("᩵᩹") + i4) * 5;
                        i = ((iM2761 ^ i3) * 11587) ^ (-1111692838);
                        i2 = 16653813;
                    } else {
                        iM2761 = (C0773.m3169("ۨۢ") ^ i4) * 63;
                        i = ((iM2761 ^ i3) * (-20975)) ^ (-652600062);
                        i2 = -1232647624;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1209600674:
                case 1321028406:
                    c = 138;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("۠ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-21541)) ^ 459818126;
                        i2 = -1663335023;
                    } else {
                        iM2761 = (C0619.m2761("ۛۤ") ^ i3) * (-13);
                        i = ((iM2761 ^ i4) * (-6175)) ^ 1353265405;
                        i2 = -1489532257;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1112332850:
                case 1748195942:
                    c16390.setNavigationIcon(iM31610 ^ i7);
                    break;
                case -1072335337:
                case 1452261094:
                    abstractC2944M13853 = m13853();
                    if (abstractC2944M13853 != null) {
                        iM2761 = (C0773.m3169("֨ۚ") ^ i3) * (-25);
                        i = ((iM2761 ^ i4) * 16667) ^ 325046804;
                        i2 = 494178338;
                    } else {
                        iM2761 = C0773.m3169("ᩳ᩷") ^ i4;
                        i = ((iM2761 ^ i3) * 7005) ^ 1404830030;
                        i2 = -1048604133;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -966320494:
                case 481353811:
                    i9 = 64824;
                    iM2761 = C0619.m2761("᩺᩹") ^ i3;
                    i = ((iM2761 ^ i4) * (-17543)) ^ (-857779487);
                    i2 = -957548471;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -745634119:
                case 2143658089:
                    if (C1321.m4852()) {
                        iM2761 = C0773.m3169("᩺ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * (-10525)) ^ (-1276031240);
                        i2 = 1755012862;
                    } else {
                        iM2761 = C0619.m2761("۠ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-21541)) ^ 459818126;
                        i2 = -1663335023;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -714805762:
                case -424957769:
                    i9 = 53505;
                    iM2761 = C0619.m2761("᩺᩹") ^ i3;
                    i = ((iM2761 ^ i4) * (-17543)) ^ (-857779487);
                    i2 = -957548471;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -430885330:
                case 1032806767:
                    sArr = f56034;
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۨۢ") ^ i4) * 63;
                        i = ((iM2761 ^ i3) * (-20975)) ^ (-652600062);
                        i2 = -1232647624;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩶ۘ")) * (-15);
                        i = ((iM2761 ^ i4) * 24321) ^ 1561788513;
                        i2 = 1493262647;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 119496957:
                case 1568098202:
                    C1519.m5403();
                    C3099.m10095();
                    break;
                case 327870885:
                case 1134037694:
                    i10 = 139;
                    if (C1343.m4943()) {
                        iM2761 = C0773.m3169("ۧۙ") ^ i4;
                        i = ((iM2761 ^ i3) * (-28389)) ^ 695909771;
                        i2 = -1084292160;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩹") + i4) * 5;
                        i = ((iM2761 ^ i3) * 11587) ^ (-1111692838);
                        i2 = 16653813;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 899300849:
                case 941651258:
                    int i12 = s + s2;
                    i8 = i12 * i12;
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("۠ܶ") ^ i3;
                        i = ((iM2761 ^ i4) * (-21541)) ^ 459818126;
                        i2 = -1663335023;
                    } else {
                        iM2761 = (C0619.m2761("᩹۬") + i3) * 9;
                        i = ((iM2761 ^ i4) * (-19661)) ^ (-1179434521);
                        i2 = 1303278658;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1357652773:
                case 2002298855:
                    iM31610 = C0773.m3169(strM8881);
                    i7 = 2126832215;
                    if (C0862.m3503()) {
                        iM2761 = (C0619.m2761("᩵۬") ^ i4) * 5;
                        i = ((iM2761 ^ i3) * (-29213)) ^ 1731092384;
                        i2 = 893849006;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩹") + i4) * 5;
                        i = ((iM2761 ^ i3) * 11587) ^ (-1111692838);
                        i2 = 16653813;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1612795693:
                case 1900794761:
                    strM8881 = C2702.m8881(sArr2, i10, 3, i9);
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۨۢ") ^ i4) * 63;
                        i = ((iM2761 ^ i3) * (-20975)) ^ (-652600062);
                        i2 = -1232647624;
                    } else {
                        iM2761 = C0619.m2761("ۙۙ") ^ i3;
                        i = ((iM2761 ^ i4) * (-19303)) ^ 1793578933;
                        i2 = -415730345;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    abstractC2944M13853.mo9633(true);
                    iM2761 = C0773.m3169("ᩳ᩷") ^ i4;
                    i = ((iM2761 ^ i3) * 7005) ^ 1404830030;
                    i2 = -1048604133;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x04bf A[PHI: r1 r2 r5 r6 r12 r13 r23 r24 r25
      0x04bf: PHI (r1v16 int) = (r1v5 int), (r1v7 int), (r1v19 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r2v17 int) = (r2v6 int), (r2v8 int), (r2v20 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r5v16 int) = (r5v5 int), (r5v7 int), (r5v19 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r6v16 l.ۘۜ) = (r6v5 l.ۘۜ), (r6v7 l.ۘۜ), (r6v19 l.ۘۜ) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r12v18 int) = (r12v7 int), (r12v9 int), (r12v21 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r13v18 int) = (r13v7 int), (r13v9 int), (r13v21 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r23v15 int) = (r23v4 int), (r23v6 int), (r23v18 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r24v15 int) = (r24v4 int), (r24v6 int), (r24v18 int) binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x04bf: PHI (r25v13 android.view.ViewGroup$MarginLayoutParams) = 
      (r25v2 android.view.ViewGroup$MarginLayoutParams)
      (r25v4 android.view.ViewGroup$MarginLayoutParams)
      (r25v16 android.view.ViewGroup$MarginLayoutParams)
     binds: [B:88:0x04bd, B:80:0x044d, B:9:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0500 A[PHI: r1 r2 r5 r6 r12 r13 r23 r24 r25
      0x0500: PHI (r1v12 int) = (r1v4 int), (r1v8 int), (r1v9 int), (r1v10 int), (r1v13 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r2v13 int) = (r2v5 int), (r2v9 int), (r2v10 int), (r2v11 int), (r2v14 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r5v12 int) = (r5v4 int), (r5v8 int), (r5v9 int), (r5v10 int), (r5v13 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r6v12 l.ۘۜ) = (r6v4 l.ۘۜ), (r6v8 l.ۘۜ), (r6v9 l.ۘۜ), (r6v10 l.ۘۜ), (r6v13 l.ۘۜ) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r12v14 int) = (r12v6 int), (r12v10 int), (r12v11 int), (r12v12 int), (r12v15 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r13v14 int) = (r13v6 int), (r13v10 int), (r13v11 int), (r13v12 int), (r13v15 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r23v11 int) = (r23v3 int), (r23v7 int), (r23v8 int), (r23v9 int), (r23v12 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r24v11 int) = (r24v3 int), (r24v7 int), (r24v8 int), (r24v9 int), (r24v12 int) binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r25v9 android.view.ViewGroup$MarginLayoutParams) = 
      (r25v1 android.view.ViewGroup$MarginLayoutParams)
      (r25v5 android.view.ViewGroup$MarginLayoutParams)
      (r25v6 android.view.ViewGroup$MarginLayoutParams)
      (r25v7 android.view.ViewGroup$MarginLayoutParams)
      (r25v10 android.view.ViewGroup$MarginLayoutParams)
     binds: [B:92:0x04fe, B:76:0x041d, B:72:0x03ed, B:68:0x03bf, B:16:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        if (l.RunnableC1848.f6235 != false) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C3977 m40383(l.AbstractActivityC17204 r29, android.view.View r30, int[] r31, android.view.View r32, int[] r33, l.C8147 r34, android.view.View r35, android.view.View r36, int[] r37, int[] r38, android.view.View r39, android.view.View r40, int[] r41, int[] r42, android.view.View r43, int[] r44, android.view.View r45, int r46, l.C3977 r47) {
        /*
            Method dump skipped, instruction units count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC17204.m40383(l.ܽ֡֫, android.view.View, int[], android.view.View, int[], l.۟᩷ۙ, android.view.View, android.view.View, int[], int[], android.view.View, android.view.View, int[], int[], android.view.View, int[], android.view.View, int, l.ۘۜ):l.ۘۜ");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m40394() {
        this.f56039 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40415() {
        this.f56048 = true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Exception e = null;
        int i = 232587297;
        int i2 = C3033.f9831;
        int i3 = C3690.f12684;
        int iM2761 = C0619.m2761("۫ۡ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 30787) ^ (-96454576);
        int i5 = -752285572;
        while (true) {
            i = ((((i ^ i3) * 31621) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2093033036:
                case -665199613:
                    AbstractC0641.m2814(this, e, null);
                    break;
                case -2003364673:
                case -1562430878:
                    C2288.m7767();
                    break;
                case -1748925314:
                case -475423821:
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0619.m2761("֫᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18641) ^ 903720448;
                        i5 = 1590945036;
                    } else {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29685) ^ 1167345746;
                        i5 = -984801910;
                    }
                    break;
                case -1434031288:
                case -899579308:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ܺۤ") ^ i2) * 35;
                        i4 = ((iM2761 ^ i3) * (-1075)) ^ (-728490907);
                        i5 = -2078453510;
                    } else {
                        iM2761 = (C0619.m2761("ۖۡ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM2761 ^ i3) * (-28875)) ^ 1451187668;
                        i5 = 517238809;
                    }
                    break;
                case -1272153663:
                case -263843070:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29685) ^ 1167345746;
                        i5 = -984801910;
                    } else {
                        iM2761 = C0773.m3169("᩹ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17861)) ^ (-977526902);
                        i5 = -1045185029;
                    }
                    break;
                case -404387068:
                case 1022752384:
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("ۜ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 7741) ^ 376278516;
                        i5 = 1016105340;
                    } else {
                        iM2761 = C0619.m2761("֫᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18641) ^ 903720448;
                        i5 = 1590945036;
                    }
                    break;
                case -264445405:
                case 2128334750:
                    try {
                        super.onRestoreInstanceState(bundle);
                        iM2761 = (C0619.m2761("ܽᩳ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * 1147) ^ (-1760445315);
                        i5 = -127280717;
                    } catch (Exception e2) {
                        e = e2;
                        iM2761 = (i2 - C0619.m2761("᩻᩶")) * 3;
                        i4 = ((iM2761 ^ i3) * 17805) ^ (-163913186);
                        i5 = 399745262;
                    }
                    break;
                case -71388322:
                case 825817242:
                    C0773.m3161();
                    iM2761 = C0773.m3169("ܶۢ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 3895) ^ (-1816977545);
                    i5 = 1733022073;
                    break;
                case -12335132:
                case 776926937:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ܶۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3895) ^ (-1816977545);
                        i5 = 1733022073;
                    } else {
                        iM2761 = C0619.m2761("۫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19071) ^ 1361004501;
                        i5 = -2013931467;
                    }
                    break;
                case 40052487:
                case 2130567742:
                    if (C2966.m9664()) {
                        iM2761 = (i2 - C0619.m2761("᩺᩺")) * (-83);
                        i4 = ((iM2761 ^ i3) * 16867) ^ 882641167;
                        i5 = 1330508098;
                    } else {
                        iM2761 = (C0773.m3169("ܺۤ") ^ i2) * 35;
                        i4 = ((iM2761 ^ i3) * (-1075)) ^ (-728490907);
                        i5 = -2078453510;
                    }
                    break;
                case 100553609:
                case 1704913417:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("֫᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18641) ^ 903720448;
                        i5 = 1590945036;
                    } else {
                        iM2761 = (C0619.m2761("ۡܺ") ^ i2) * 27;
                        i4 = ((iM2761 ^ i3) * (-23393)) ^ 1352193212;
                        i5 = -1140266941;
                    }
                    break;
                case 172663329:
                case 503719074:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ܿۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9459)) ^ (-1249970982);
                        i5 = 209018720;
                    } else {
                        iM2761 = C0619.m2761("ܳ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 14491) ^ 1823495677;
                        i5 = 990770404;
                    }
                    break;
                case 281401321:
                case 1946079456:
                    if (C0862.m3503()) {
                        iM2761 = (i3 - C0773.m3169("ۚۤ")) * (-67);
                        i4 = ((iM2761 ^ i2) * (-22761)) ^ 245155642;
                        i5 = -1726962147;
                    } else {
                        iM2761 = (C0773.m3169("ܺۤ") ^ i2) * 35;
                        i4 = ((iM2761 ^ i3) * (-1075)) ^ (-728490907);
                        i5 = -2078453510;
                    }
                    break;
                case 375235967:
                case 1328785210:
                    if (C1080.f3865 < 0) {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29685) ^ 1167345746;
                        i5 = -984801910;
                    } else {
                        iM2761 = C0773.m3169("ܶۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3895) ^ (-1816977545);
                        i5 = 1733022073;
                    }
                    break;
                case 530574883:
                case 1729830741:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("ܿۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9459)) ^ (-1249970982);
                        i5 = 209018720;
                    } else {
                        iM2761 = C0773.m3169("ۚۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2525)) ^ (-593422051);
                        i5 = 633174719;
                    }
                    break;
                case 698229781:
                case 805586860:
                    break;
                case 1612738114:
                case 2056569446:
                    C2288.m7767();
                    if (!C2966.m9664()) {
                        iM2761 = C0773.m3169("ۡ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 29685) ^ 1167345746;
                        i5 = -984801910;
                    } else {
                        iM2761 = (C0773.m3169("ܺۤ") ^ i2) * 35;
                        i4 = ((iM2761 ^ i3) * (-1075)) ^ (-728490907);
                        i5 = -2078453510;
                    }
                    break;
                default:
                    if (AbstractC3624.m11755() != 0) {
                        iM2761 = C0773.m3169("ܿۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-9459)) ^ (-1249970982);
                        i5 = 209018720;
                    } else {
                        iM2761 = C0619.m2761("۟ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3979)) ^ 299512565;
                        i5 = -825263967;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ae A[PHI: r5 r6 r8 r15 r17
      0x01ae: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:61:0x01ac, B:53:0x0167, B:42:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:61:0x01ac, B:53:0x0167, B:42:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:61:0x01ac, B:53:0x0167, B:42:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r15v4 android.content.Intent) = (r15v3 android.content.Intent), (r15v3 android.content.Intent), (r15v5 android.content.Intent) binds: [B:61:0x01ac, B:53:0x0167, B:42:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r17v9 'th' java.lang.Object) = (r17v2 'th' java.lang.Object), (r17v4 'th' java.lang.Object), (r17v10 'th' java.lang.Object) binds: [B:61:0x01ac, B:53:0x0167, B:42:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0212 A[PHI: r3 r7 r17
      0x0212: PHI (r3v5 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:69:0x0210, B:57:0x0189, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:69:0x0210, B:57:0x0189, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0212: PHI (r17v18 'th' java.lang.Object) = (r17v0 'th' java.lang.Object), (r17v3 'th' java.lang.Object), (r17v19 'th' java.lang.Object) binds: [B:69:0x0210, B:57:0x0189, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40420(String str) {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int iM3169;
        int i3;
        Object th = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        short s3 = 0;
        int i5 = 0;
        int i6 = -762631610;
        int i7 = C2966.f9654;
        int i8 = C1826.f6190;
        int iM2763 = C0619.m2761("۟ۢ") ^ i7;
        int i9 = ((iM2763 ^ i8) * 6061) ^ 944412445;
        int i10 = iM2763 ^ (-767045616);
        while (true) {
            Intent intent = null;
            while (true) {
                i6 = ((((i6 ^ i8) * 29493) >> 31) & i9) ^ i10;
                switch (i6) {
                    case -2075613213:
                    case 1047304550:
                        i5 = 41999;
                        iM2761 = C0773.m3169("ۨۜ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-12203)) ^ 1970747765;
                        i = 1427332440;
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case -2008545648:
                    case -1964583119:
                        th = th;
                        c = 483;
                        if (C0862.f3233 == 0) {
                            iM2761 = C0773.m3169("ۨۘ") ^ i8;
                            i9 = ((iM2761 ^ i7) * (-979)) ^ 1818466946;
                            i = -1344907461;
                            i10 = iM2761 ^ i;
                            th = th;
                        } else {
                            iM2762 = (C0619.m2761("ۘܿ") + i7) * 53;
                            i9 = ((iM2762 ^ i8) * (-17743)) ^ 1752391015;
                            i2 = -420979156;
                            i10 = iM2762 ^ i2;
                            th = th;
                        }
                        break;
                    case -1891658844:
                    case -354933972:
                        th = th;
                        if (i4 - (s * s3) >= 0) {
                            iM2761 = (C0619.m2761("ܶ۬") + i7) * 71;
                            i9 = ((iM2761 ^ i8) * 1853) ^ (-991873983);
                            i = 1901334068;
                        } else {
                            iM2761 = C0773.m3169("᩶֫") ^ i8;
                            i9 = ((iM2761 ^ i7) * (-17013)) ^ (-479977986);
                            i = -525423119;
                        }
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case -1798027184:
                    case 4085866:
                        AbstractC0116.m1232(intent, 268435456);
                        iM3169 = C0773.m3169("᩵ܶ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 16187) ^ (-1475661076);
                        i3 = 1178388226;
                        i10 = iM3169 ^ i3;
                        break;
                    case -1695122661:
                    case 2004619949:
                        if (C3998.f13671 != 0) {
                            th = th;
                            iM2761 = (C0619.m2761("ۢ֡") + i7) * 15;
                            i9 = ((iM2761 ^ i8) * 14143) ^ 1859968907;
                            i = 1004500485;
                            i10 = iM2761 ^ i;
                            th = th;
                        } else {
                            iM3169 = C0773.m3169("֫᩷") ^ i7;
                            i9 = ((iM3169 ^ i8) * (-11901)) ^ 229865970;
                            i3 = 1091335253;
                            i10 = iM3169 ^ i3;
                        }
                        break;
                    case -1664633713:
                    case 584765316:
                        try {
                            RunnableC1848.m6363(this, intent);
                            iM3169 = C0619.m2761("ᩴᩳ") ^ i7;
                            i9 = ((iM3169 ^ i8) * (-30961)) ^ (-315629406);
                            i3 = -645681823;
                        } catch (Throwable th2) {
                            th = th2;
                            iM3169 = C0773.m3169("۫᩻") ^ i8;
                            i9 = ((iM3169 ^ i7) * (-29419)) ^ (-830426692);
                            i3 = -710381660;
                        }
                        i10 = iM3169 ^ i3;
                        break;
                    case -1652497160:
                    case -1275210808:
                        th = th;
                        sArr = f56034;
                        if (C2485.f7950 != 0) {
                            iM2761 = (C0619.m2761("ۢ֡") + i7) * 15;
                            i9 = ((iM2761 ^ i8) * 14143) ^ 1859968907;
                            i = 1004500485;
                        } else {
                            iM2761 = C0619.m2761("ۧۢ") ^ i8;
                            i9 = ((iM2761 ^ i7) * 20017) ^ 324353390;
                            i = -324146772;
                        }
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case -1519236598:
                    case -938720145:
                        Uri uri = Uri.parse(str);
                        if (!RunnableC0334.m2063()) {
                            short[] sArr2 = f56034;
                            if (C2288.f7433 <= 0 || C2023.f6737) {
                                th = th;
                                iM2762 = C0619.m2761("֫ܶ") ^ i8;
                                i9 = ((iM2762 ^ i7) * 21939) ^ 202007051;
                                i2 = -32244201;
                                i10 = iM2762 ^ i2;
                                th = th;
                            } else {
                                th = th;
                                intent = new Intent(C0773.m3166(sArr2, 484, 26, i5), uri);
                                if (C1542.f5343 <= 0) {
                                    iM2761 = C0619.m2761("֨ܶ") ^ i8;
                                    i9 = ((iM2761 ^ i7) * 12587) ^ 878496739;
                                    i = -1442682443;
                                } else {
                                    iM2761 = C0773.m3169("ۡۖ") ^ i8;
                                    i9 = ((iM2761 ^ i7) * (-14875)) ^ 1642357487;
                                    i = -265181278;
                                }
                                i10 = iM2761 ^ i;
                                th = th;
                            }
                        } else {
                            th = th;
                            iM2762 = (C0619.m2761("ۘܿ") + i7) * 53;
                            i9 = ((iM2762 ^ i8) * (-17743)) ^ 1752391015;
                            i2 = -420979156;
                            i10 = iM2762 ^ i2;
                            th = th;
                        }
                        break;
                    case -1356982806:
                    case -885802964:
                        th = th;
                        s = sArr[c];
                        s2 = 18073;
                        if (C2702.f8586 <= 0) {
                            iM2761 = C0619.m2761("֨ܶ") ^ i8;
                            i9 = ((iM2761 ^ i7) * 12587) ^ 878496739;
                            i = -1442682443;
                        } else {
                            iM2761 = C0773.m3169("۠ۛ") ^ i7;
                            i9 = ((iM2761 ^ i8) * 23293) ^ (-1891492526);
                            i = 1131460206;
                        }
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case -1320309581:
                    case 1337740907:
                        AbstractC0641.m2814(this, th, null);
                        break;
                    case -1079720848:
                    case 1695161323:
                        th = th;
                        s3 = 72292;
                        if (C13473.m33144()) {
                            iM2761 = (C0773.m3169("ܿۗ") + i8) * 17;
                            i9 = ((iM2761 ^ i7) * 7561) ^ (-1567528348);
                            i = 1014514411;
                        } else {
                            iM2761 = C0619.m2761("֨ܶ") ^ i8;
                            i9 = ((iM2761 ^ i7) * 12587) ^ 878496739;
                            i = -1442682443;
                        }
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case -823661348:
                    case 433209777:
                        C1826.m6301();
                        if (C2310.f7472 >= 0) {
                            th = th;
                            iM2762 = (C0619.m2761("ۘܿ") + i7) * 53;
                            i9 = ((iM2762 ^ i8) * (-17743)) ^ 1752391015;
                            i2 = -420979156;
                            i10 = iM2762 ^ i2;
                            th = th;
                        }
                        iM3169 = C0773.m3169("֫᩷") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-11901)) ^ 229865970;
                        i3 = 1091335253;
                        i10 = iM3169 ^ i3;
                        break;
                    case -602702918:
                    case 732381776:
                        C4282.m13644();
                        AbstractC3624.m11755();
                        break;
                    case -563107754:
                    case 1366429287:
                        th = th;
                        int i11 = s + s2;
                        i4 = i11 * i11;
                        if (C3779.f12953 <= 0) {
                            iM2761 = (C0619.m2761("ۢ֡") + i7) * 15;
                            i9 = ((iM2761 ^ i8) * 14143) ^ 1859968907;
                            i = 1004500485;
                        } else {
                            iM2761 = (C0773.m3169("֫ܰ") ^ i7) * (-13);
                            i9 = ((iM2761 ^ i8) * 31187) ^ 11652468;
                            i = -1161567390;
                        }
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case -446968325:
                    case -180967374:
                        i5 = 15406;
                        iM2761 = C0773.m3169("ۨۜ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-12203)) ^ 1970747765;
                        i = 1427332440;
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case 255204699:
                    case 1005803095:
                        C3448.m11248();
                        iM3169 = C0773.m3169("֫᩷") ^ i7;
                        i9 = ((iM3169 ^ i8) * (-11901)) ^ 229865970;
                        i3 = 1091335253;
                        i10 = iM3169 ^ i3;
                        break;
                    case 526341180:
                    case 1630077854:
                        C1080.m4050();
                        if (C4282.f15546 <= 0) {
                            th = th;
                            iM2762 = C0619.m2761("֫ܶ") ^ i8;
                            i9 = ((iM2762 ^ i7) * 21939) ^ 202007051;
                            i2 = -32244201;
                            i10 = iM2762 ^ i2;
                            th = th;
                        }
                        th = th;
                        iM2761 = (C0619.m2761("ۢ֡") + i7) * 15;
                        i9 = ((iM2761 ^ i8) * 14143) ^ 1859968907;
                        i = 1004500485;
                        i10 = iM2761 ^ i;
                        th = th;
                        break;
                    case 885918762:
                    case 1151280861:
                        break;
                    default:
                        th = th;
                        if (C1826.f6190 > 0) {
                            iM2761 = (C0773.m3169("ܽ۫") + i7) * (-31);
                            i9 = ((iM2761 ^ i8) * (-24235)) ^ 647298430;
                            i = 1257691449;
                            i10 = iM2761 ^ i;
                            th = th;
                        } else {
                            iM2762 = C0619.m2761("֫ܶ") ^ i8;
                            i9 = ((iM2762 ^ i7) * 21939) ^ 202007051;
                            i2 = -32244201;
                            i10 = iM2762 ^ i2;
                            th = th;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40407(C16390 c16390) {
        AbstractC1365 abstractC1365M13854 = null;
        int contentInsetStartWithNavigation = 0;
        int i = 0;
        int i2 = 919475882;
        int i3 = C2354.f7599;
        int i4 = C2702.f8586;
        int iM2761 = C0619.m2761("ۘܽ") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-18551)) ^ 879477198;
        int i6 = -615113543;
        while (true) {
            i2 = ((((i2 ^ i4) * 17445) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2144253713:
                case -1627443384:
                    C2354.m7983();
                    C2310.m7813();
                    break;
                case -1944911771:
                case -1604574592:
                    C2485.m8357();
                    iM2761 = (i4 - C0773.m3169("۠ۛ")) * (-17);
                    i5 = ((iM2761 ^ i3) * 23373) ^ (-1521173292);
                    i6 = -1333759808;
                    break;
                case -1820055127:
                case 1506408178:
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("۬ۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 14815) ^ 277178843;
                        i6 = -384592461;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۚۗ")) * (-43);
                        i5 = ((iM2761 ^ i4) * (-15321)) ^ 603980448;
                        i6 = 1616845455;
                    }
                    break;
                case -1294445337:
                case -847675169:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۗ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22131)) ^ (-1533726428);
                        i6 = -161799665;
                    } else {
                        iM2761 = C0773.m3169("ܳۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-8411)) ^ (-983967404);
                        i6 = -64623581;
                    }
                    break;
                case -1103814822:
                case 826553343:
                    C2375.m8065();
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۚۗ")) * (-43);
                        i5 = ((iM2761 ^ i4) * (-15321)) ^ 603980448;
                        i6 = 1616845455;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۠ۛ")) * (-17);
                        i5 = ((iM2761 ^ i3) * 23373) ^ (-1521173292);
                        i6 = -1333759808;
                    }
                    break;
                case -1008371241:
                case 1816462260:
                    abstractC1365M13854 = m13854();
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28929)) ^ 676421679;
                        i6 = 1906820945;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۖ") ^ i4) * 7;
                        i5 = ((iM2761 ^ i3) * (-27697)) ^ 867980320;
                        i6 = -1737866543;
                    }
                    break;
                case -822801868:
                case 382942335:
                    if (C0269.m1775() <= 0) {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6577)) ^ 159105016;
                        i6 = -1713453694;
                    } else {
                        iM2761 = (C0773.m3169("ۤۙ") + i3) * 87;
                        i5 = ((iM2761 ^ i4) * 7569) ^ 1918670884;
                        i6 = 1227349313;
                    }
                    break;
                case -737330051:
                case 1667975423:
                    abstractC1365M13854.mo5033(c16390);
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6577)) ^ 159105016;
                        i6 = -1713453694;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܽۧ")) * 127;
                        i5 = ((iM2761 ^ i3) * (-14799)) ^ 1091244055;
                        i6 = -1290588491;
                    }
                    break;
                case -507041283:
                case 1013428002:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ۗ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22131)) ^ (-1533726428);
                        i6 = -161799665;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۠ۛ")) * (-17);
                        i5 = ((iM2761 ^ i3) * 23373) ^ (-1521173292);
                        i6 = -1333759808;
                    }
                    break;
                case -315245421:
                case 1261882956:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28929)) ^ 676421679;
                        i6 = 1906820945;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۘ") ^ i4) * 47;
                        i5 = ((iM2761 ^ i3) * (-11221)) ^ (-640803478);
                        i6 = 1526246924;
                    }
                    break;
                case -236890423:
                case -39137623:
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28929)) ^ 676421679;
                        i6 = 1906820945;
                    } else {
                        iM2761 = C0773.m3169("ܳ᩻") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22255)) ^ (-2061263861);
                        i6 = 1827786716;
                    }
                    break;
                case 163457566:
                case 1061475334:
                    C2354.m7983();
                    if (!C0862.m3503()) {
                        iM2761 = (i3 - C0619.m2761("ۚۗ")) * (-43);
                        i5 = ((iM2761 ^ i4) * (-15321)) ^ 603980448;
                        i6 = 1616845455;
                    } else {
                        iM2761 = C0619.m2761("ܽۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28929)) ^ 676421679;
                        i6 = 1906820945;
                    }
                    break;
                case 876089772:
                case 2037596499:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ܽۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28929)) ^ 676421679;
                        i6 = 1906820945;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܽۡ")) * (-7);
                        i5 = ((iM2761 ^ i3) * (-7035)) ^ (-478911064);
                        i6 = -111726063;
                    }
                    break;
                case 1568740923:
                case 1907399826:
                    contentInsetStartWithNavigation = c16390.getContentInsetStartWithNavigation();
                    i = 3;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ܳ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6577)) ^ 159105016;
                        i6 = -1713453694;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۫᩵")) * (-113);
                        i5 = ((iM2761 ^ i4) * 15173) ^ 81848941;
                        i6 = 1004798226;
                    }
                    break;
                case 1789752667:
                case 2111971240:
                    c16390.setContentInsetStartWithNavigation(contentInsetStartWithNavigation / i);
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ۗ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22131)) ^ (-1533726428);
                        i6 = -161799665;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۢ") + i3) * (-51);
                        i5 = ((iM2761 ^ i4) * 879) ^ 115539006;
                        i6 = -247408071;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC15712
    /* JADX INFO: renamed from: ۙ */
    public final void mo37501(Throwable th) {
        RunnableC3055.m9930(this, th, null);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m40412() {
        Window windowM7763 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 1335722748;
        int i5 = C1080.f3865;
        int i6 = C3690.f12684;
        int iM2761 = C0619.m2761("᩹ۛ") ^ i6;
        int i7 = ((iM2761 ^ i5) * 9993) ^ 551945754;
        int i8 = 1061867934;
        while (true) {
            i4 = ((((i4 ^ i5) * 28671) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2092966675:
                case 609477980:
                    C3690.m11987();
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                        i8 = -500332084;
                    } else {
                        iM2761 = (C0773.m3169("ۨ᩶") ^ i6) * (-41);
                        i7 = ((iM2761 ^ i5) * (-25747)) ^ (-515868661);
                        i8 = 491638420;
                    }
                    break;
                case -2055305836:
                case 1442506620:
                    C1826.m6301();
                    iM2761 = C0773.m3169("۟۟") ^ i5;
                    i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                    i8 = -500332084;
                    break;
                case -1987193807:
                case 1689185513:
                    break;
                case -1976825270:
                case -946241811:
                    windowM7763.setNavigationBarDividerColor(z ? 1 : 0);
                    iM2761 = (C0619.m2761("ۜ᩶") ^ i6) * 97;
                    i7 = ((iM2761 ^ i5) * 22887) ^ (-1195599485);
                    i8 = -1788562623;
                    break;
                case -1921715952:
                case -891524989:
                    i = 201326592;
                    if (C3492.m11488()) {
                        iM2761 = C0773.m3169("᩻ᩴ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-25847)) ^ 721350559;
                        i8 = 999028028;
                    } else {
                        iM2761 = C0619.m2761("ܺܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-4123)) ^ (-850893643);
                        i8 = -1110672719;
                    }
                    break;
                case -1726853659:
                case -982088973:
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        iM2761 = C0619.m2761("ۡۜ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 24849) ^ 1285571428;
                        i8 = 486536222;
                    } else {
                        iM2761 = (C0619.m2761("ۜ᩶") ^ i6) * 97;
                        i7 = ((iM2761 ^ i5) * 22887) ^ (-1195599485);
                        i8 = -1788562623;
                    }
                    break;
                case -1694005346:
                case 487863383:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩺۫") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-3851)) ^ (-2056216475);
                        i8 = 1795857837;
                    } else {
                        iM2761 = (C0773.m3169("֫ܺ") ^ i5) * (-15);
                        i7 = ((iM2761 ^ i6) * 27467) ^ (-2132115815);
                        i8 = -1195371501;
                    }
                    break;
                case -1673999484:
                case 1611299392:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                        i8 = -500332084;
                    } else {
                        iM2761 = C0773.m3169("۠᩹") ^ i5;
                        i7 = ((iM2761 ^ i6) * 18213) ^ 261721255;
                        i8 = -987360983;
                    }
                    break;
                case -1362215207:
                case 558223007:
                    windowM7763.setBackgroundDrawableResource(i2);
                    z = false;
                    z = false;
                    if (C4282.m13644()) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 28347) ^ 1582506345;
                        i8 = 1545014297;
                    } else {
                        iM2761 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                        i8 = -500332084;
                    }
                    break;
                case -1141231770:
                case 961217732:
                    C1146.m4231();
                    C3099.m10095();
                    break;
                case -744374468:
                case 29010812:
                    windowM7763 = C2288.m7763(this);
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ܺܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-4123)) ^ (-850893643);
                        i8 = -1110672719;
                    } else {
                        iM2761 = C0619.m2761("ܳܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-28095)) ^ (-1645216868);
                        i8 = 1914692374;
                    }
                    break;
                case -713351882:
                case 847935894:
                    if (!C17202.f56030) {
                        iM2761 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                        i8 = -500332084;
                    } else {
                        iM2761 = C0619.m2761("᩺۫") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-3851)) ^ (-2056216475);
                        i8 = 1795857837;
                    }
                    break;
                case -677333622:
                case 507553880:
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("᩺۫") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-3851)) ^ (-2056216475);
                        i8 = 1795857837;
                    } else {
                        iM2761 = (C0773.m3169("᩹᩺") ^ i6) * (-57);
                        i7 = ((iM2761 ^ i5) * (-15577)) ^ 1967552890;
                        i8 = 911260420;
                    }
                    break;
                case -521212787:
                case 187607371:
                    windowM7763.addFlags(i);
                    i2 = R.color.transparent;
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0619.m2761("ܺܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-4123)) ^ (-850893643);
                        i8 = -1110672719;
                    } else {
                        iM2761 = (C0773.m3169("֨ܺ") ^ i6) * 127;
                        i7 = ((iM2761 ^ i5) * (-6217)) ^ 666939180;
                        i8 = -1782169641;
                    }
                    break;
                case -139112842:
                case 1624901183:
                    if (C1783.f6087 > 0) {
                        iM2761 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                        i8 = -500332084;
                    } else {
                        iM2761 = (C0773.m3169("ܰܰ") + i5) * 69;
                        i7 = ((iM2761 ^ i6) * (-12479)) ^ 473094472;
                        i8 = -139954242;
                    }
                    break;
                case 203621474:
                case 1290552342:
                    if (C2485.f7950 != 0) {
                        iM2761 = C0619.m2761("ܺܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-4123)) ^ (-850893643);
                        i8 = -1110672719;
                    } else {
                        iM2761 = C0619.m2761("ᩳ᩸") ^ i5;
                        i7 = ((iM2761 ^ i6) * 31937) ^ (-921921344);
                        i8 = -1748843087;
                    }
                    break;
                case 889674132:
                case 1862583809:
                    windowM7763.setNavigationBarContrastEnforced(z);
                    iM2761 = (C0773.m3169("ۚ᩸") + i6) * 45;
                    i7 = ((iM2761 ^ i5) * 25509) ^ 1916073950;
                    i8 = -1721651497;
                    break;
                case 1018652892:
                case 1659173063:
                    windowM7763.setNavigationBarColor(z ? 1 : 0);
                    if (C2702.m8876()) {
                        iM2761 = C0619.m2761("ۤۘ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-22913)) ^ 1744655634;
                        i8 = 504367215;
                    } else {
                        iM2761 = C0619.m2761("ܺܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-4123)) ^ (-850893643);
                        i8 = -1110672719;
                    }
                    break;
                case 1286069564:
                case 1816384081:
                    if (C1343.m4943()) {
                        iM2761 = (C0773.m3169("᩵ܰ") + i6) * 45;
                        i7 = ((iM2761 ^ i5) * (-13169)) ^ (-1942197392);
                        i8 = 206035080;
                    } else {
                        iM2761 = C0773.m3169("۟۟") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-27049)) ^ 2113162490;
                        i8 = -500332084;
                    }
                    break;
                default:
                    if (i3 >= 29) {
                        iM2761 = C0773.m3169("ۖۢ") ^ i5;
                        i7 = ((iM2761 ^ i6) * 32277) ^ (-900542207);
                        i8 = -295578192;
                    } else {
                        iM2761 = (C0773.m3169("ۚ᩸") + i6) * 45;
                        i7 = ((iM2761 ^ i5) * 25509) ^ 1916073950;
                        i8 = -1721651497;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC7405, l.ActivityC4348, l.ActivityC5577, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = false;
        boolean z2 = false;
        Throwable th = null;
        boolean z3 = false;
        boolean zM10878 = false;
        int i = 1120499452;
        int i2 = C3690.f12684;
        int i3 = C1542.f5343;
        int iM3169 = (C0773.m3169("ۤۘ") + i2) * 47;
        int i4 = ((iM3169 ^ i3) * (-6407)) ^ (-238456100);
        int i5 = -741520096;
        while (true) {
            i = ((((i ^ i3) * (-12087)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2076425163:
                case 1424901611:
                    this.f56053 = true;
                    z = false;
                    iM3169 = C0773.m3169("ۤ֨") ^ i2;
                    i4 = ((iM3169 ^ i3) * 14103) ^ (-927433764);
                    i5 = -2104356369;
                    break;
                case -2075237499:
                case -1334909013:
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i3) * (-117);
                        i4 = ((iM3169 ^ i2) * 22787) ^ (-980283019);
                        i5 = 763098174;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26795) ^ 245515700;
                        i5 = 216599022;
                    }
                    break;
                case -2056260074:
                case -1024361079:
                    this.f56053 = z;
                    throw th;
                case -1865687032:
                case 1025741185:
                    if (C2878.m9491() > 0) {
                        iM3169 = (i2 - C0773.m3169("۫᩶")) * (-119);
                        i4 = ((iM3169 ^ i3) * 7133) ^ 1976221050;
                        i5 = 169168436;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26795) ^ 245515700;
                        i5 = 216599022;
                    }
                    break;
                case -1512775087:
                case 150418506:
                    if (z3 != zM10878) {
                        iM3169 = (C0773.m3169("᩶ۗ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * 1289) ^ 622788625;
                        i5 = -924609788;
                    } else {
                        iM3169 = C0619.m2761("ۜܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16575) ^ 1568275143;
                        i5 = 299952092;
                    }
                    break;
                case -1413803180:
                case 471882846:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i2 - C0773.m3169("۫᩶")) * (-119);
                        i4 = ((iM3169 ^ i3) * 7133) ^ 1976221050;
                        i5 = 169168436;
                    } else {
                        iM3169 = (C0619.m2761("ܰܳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-12807)) ^ 1581545601;
                        i5 = -1935954657;
                    }
                    break;
                case -1257653105:
                case 875677191:
                    if (C2287.m7745() <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩶") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 9581) ^ 440316679;
                        i5 = 486706030;
                    } else {
                        iM3169 = C0619.m2761("֨ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19043)) ^ (-906888186);
                        i5 = -489003704;
                    }
                    break;
                case -1141503781:
                case 1361275103:
                    if (C3448.m11248() != 0) {
                        iM3169 = (C0773.m3169("ۤ᩶") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 9581) ^ 440316679;
                        i5 = 486706030;
                    } else {
                        iM3169 = C0773.m3169("᩵ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16817)) ^ (-106604949);
                        i5 = -983592968;
                    }
                    break;
                case -1134457909:
                case 1537490607:
                    super.onConfigurationChanged(configuration);
                    z2 = this.f56044;
                    iM3169 = (C0619.m2761("ۖ֡") + i3) * 31;
                    i4 = ((iM3169 ^ i2) * 15831) ^ (-1877397892);
                    i5 = 152135264;
                    break;
                case -1094872501:
                case 789806438:
                    this.f56053 = z;
                    return;
                case -973987326:
                case -695769106:
                    if (this.f56053) {
                        iM3169 = C0773.m3169("ۨۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26173) ^ (-2138331317);
                        i5 = 1479121419;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤۛ")) * 115;
                        i4 = ((iM3169 ^ i2) * 21775) ^ 1262502687;
                        i5 = 1924796026;
                    }
                    break;
                case -918310022:
                case -337511607:
                    if (z2) {
                        iM3169 = (C0619.m2761("ۢܶ") + i3) * (-57);
                        i4 = ((iM3169 ^ i2) * (-4203)) ^ 987885454;
                        i5 = -1347410517;
                    } else {
                        iM3169 = C0619.m2761("ۜܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16575) ^ 1568275143;
                        i5 = 299952092;
                    }
                    break;
                case -907281979:
                case 112934123:
                    z3 = this.f56055;
                    zM10878 = C3296.m10878();
                    iM3169 = C0619.m2761("᩻ۖ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 29919) ^ (-1651892430);
                    i5 = -1692100470;
                    break;
                case -844450103:
                case 978633870:
                    C2485.m8357();
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0619.m2761("ۗ᩶") ^ i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 24317) ^ (-1160512131);
                        i5 = -213248760;
                    } else {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i3) * (-117);
                        i4 = ((iM3169 ^ i2) * 22787) ^ (-980283019);
                        i5 = 763098174;
                    }
                    break;
                case -687874854:
                case 1225633056:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i2 - C0773.m3169("۫᩶")) * (-119);
                        i4 = ((iM3169 ^ i3) * 7133) ^ 1976221050;
                        i5 = 169168436;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩷") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 26059) ^ 608448305;
                        i5 = -2064435388;
                    }
                    break;
                case -455971376:
                case 1562129612:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26795) ^ 245515700;
                        i5 = 216599022;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩷᩸")) * (-99);
                        i4 = ((iM3169 ^ i3) * (-7379)) ^ (-81555404);
                        i5 = -814636887;
                    }
                    break;
                case -362777699:
                case 1894277182:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("᩺᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-7435)) ^ (-1348814021);
                        i5 = 1932938210;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫۫")) * 25;
                        i4 = ((iM3169 ^ i2) * (-29135)) ^ 1060604896;
                        i5 = -276050770;
                    }
                    break;
                case -306449203:
                case 1791110473:
                    try {
                        mo113();
                        iM3169 = C0619.m2761("ۜܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16575) ^ 1568275143;
                        i5 = 299952092;
                    } catch (Throwable th2) {
                        th = th2;
                        iM3169 = C0773.m3169("ۡ֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19565)) ^ (-454639698);
                        i5 = -871437091;
                    }
                    break;
                case -306308695:
                case 1527693087:
                    C0269.m1775();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0773.m3169("ۤ᩶") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 9581) ^ 440316679;
                        i5 = 486706030;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۫᩶")) * (-119);
                        i4 = ((iM3169 ^ i3) * 7133) ^ 1976221050;
                        i5 = 169168436;
                    }
                    break;
                case -72354401:
                case 1375438033:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i2 - C0773.m3169("۫᩶")) * (-119);
                        i4 = ((iM3169 ^ i3) * 7133) ^ 1976221050;
                        i5 = 169168436;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܳ֫")) * 11;
                        i4 = ((iM3169 ^ i3) * (-29677)) ^ (-1747865921);
                        i5 = -998139418;
                    }
                    break;
                case 292202906:
                case 1919944848:
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("ۤ᩶") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 9581) ^ 440316679;
                        i5 = 486706030;
                    } else {
                        iM3169 = (C0619.m2761("֫᩷") + i2) * 51;
                        i4 = ((iM3169 ^ i3) * (-25295)) ^ (-471217114);
                        i5 = -452502717;
                    }
                    break;
                case 694931536:
                case 1725564824:
                    super.onConfigurationChanged(configuration);
                    return;
                case 840607579:
                case 1728506588:
                    C17202.m40372();
                    return;
                case 1007174089:
                case 1872304039:
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("ۛۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25907) ^ 243809208;
                        i5 = 2102451575;
                    } else {
                        iM3169 = (C0619.m2761("֡ܰ") ^ i3) * (-117);
                        i4 = ((iM3169 ^ i2) * 22787) ^ (-980283019);
                        i5 = 763098174;
                    }
                    break;
                case 1403470109:
                case 1715771466:
                    if (RunnableC1848.m6360()) {
                        iM3169 = (C0619.m2761("ۗ᩶") ^ i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 24317) ^ (-1160512131);
                        i5 = -213248760;
                    } else {
                        iM3169 = C0619.m2761("ۡܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29425) ^ (-581715142);
                        i5 = 990975168;
                    }
                    break;
                default:
                    C3998.m12920();
                    C1146.m4231();
                    iM3169 = C0773.m3169("ۢ᩷") ^ i2;
                    i4 = ((iM3169 ^ i3) * 26795) ^ 245515700;
                    i5 = 216599022;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x034a A[PHI: r5 r6 r12 r13 r14 r15 r17 r21 r22 r23 r24
      0x034a: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r21v19 java.lang.String) = (r21v8 java.lang.String), (r21v15 java.lang.String), (r21v20 java.lang.String) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r23v18 java.lang.String) = (r23v8 java.lang.String), (r23v15 java.lang.String), (r23v19 java.lang.String) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r24v17 int) = (r24v8 int), (r24v15 int), (r24v18 int) binds: [B:71:0x0348, B:45:0x0201, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0386 A[PHI: r10 r16 r21 r23 r24
      0x0386: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:75:0x0384, B:62:0x02d6, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:75:0x0384, B:62:0x02d6, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r21v35 java.lang.String) = (r21v7 java.lang.String), (r21v9 java.lang.String), (r21v36 java.lang.String) binds: [B:75:0x0384, B:62:0x02d6, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r23v27 java.lang.String) = (r23v7 java.lang.String), (r23v9 java.lang.String), (r23v28 java.lang.String) binds: [B:75:0x0384, B:62:0x02d6, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0386: PHI (r24v29 int) = (r24v7 int), (r24v9 int), (r24v30 int) binds: [B:75:0x0384, B:62:0x02d6, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40400(String str, boolean z) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        String strM8166;
        String strM9853;
        int i5;
        int i6 = RunnableC3055.f9898;
        int i7 = C3779.f12953;
        int iM2762 = (C0619.m2761("᩹ۘ") ^ i7) * 25;
        int i8 = ((iM2762 ^ i6) * 18823) ^ 638672171;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM2762 ^ (-2079877393);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = 481342108;
        short s2 = 0;
        String str2 = null;
        String str3 = null;
        int iM9671 = 0;
        while (true) {
            i18 = i9 ^ (i8 & (((i18 ^ i6) * (-32333)) >> 31));
            switch (i18) {
                case -1999603374:
                case 1332723626:
                    strM9853 = RunnableC1848.m6365(AbstractC0116.m1237(str, 0, iM9671));
                    str3 = strM9853;
                    int iM2763 = C0619.m2761("ۚۚ") ^ i7;
                    iM9671 = iM9671;
                    i = ((iM2763 ^ i6) * (-26055)) ^ 1241974752;
                    i5 = iM2763 ^ (-1206990259);
                    str2 = str2;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -1943208549:
                case -706798877:
                    AbstractC0116.m1243();
                    if (!C3077.f9998) {
                        str3 = str3;
                        str2 = str2;
                        iM2761 = (i6 - C0773.m3169("ܿ᩻")) * (-15);
                        i3 = ((iM2761 ^ i7) * 20881) ^ (-1370352903);
                        i4 = -2075773741;
                        str2 = str2;
                        i9 = iM2761 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    } else {
                        iM9671 = iM9671;
                        str3 = str3;
                        str2 = str2;
                        iM3169 = (C0619.m2761("᩷ۡ") ^ i7) * (-13);
                        i = ((iM3169 ^ i6) * 31499) ^ (-1477229605);
                        i2 = 1144761690;
                        i5 = iM3169 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM9671 = iM9671;
                    }
                    break;
                case -1932612001:
                case 777803215:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    int i19 = i13 + i14;
                    if ((i19 + i19) - i12 < 0) {
                        iM3169 = (C0619.m2761("۫۠") ^ i7) * 37;
                        i = ((iM3169 ^ i6) * (-30795)) ^ (-232307200);
                        i2 = -1045259985;
                    } else {
                        iM3169 = C0619.m2761("֫ܿ") ^ i6;
                        i = ((iM3169 ^ i7) * 25011) ^ (-1915666607);
                        i2 = 1390364427;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -1852422085:
                case 451844409:
                    str2 = str2;
                    if (C3077.m10045(str3) <= 0) {
                        str3 = str3;
                        iM9671 = iM9671;
                        iM3169 = (C0773.m3169("᩻۟") ^ i7) * 19;
                        i = ((iM3169 ^ i6) * 28483) ^ (-1694402164);
                        i2 = 1729651435;
                        i5 = iM3169 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM9671 = iM9671;
                    } else {
                        iM2761 = (C0619.m2761("۠ᩴ") ^ i6) * (-103);
                        str3 = str3;
                        i3 = ((iM2761 ^ i7) * (-713)) ^ 207359835;
                        i4 = 957196838;
                        str2 = str2;
                        i9 = iM2761 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    }
                    break;
                case -1809117234:
                case 221066470:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    if (!C17202.f56030) {
                        strM8166 = str2;
                        int iM31610 = (C0773.m3169("֨۬") ^ i6) * (-111);
                        i9 = iM31610 ^ (-1470077149);
                        str2 = strM8166;
                        i8 = ((iM31610 ^ i7) * 2133) ^ 1943343830;
                        str3 = str3;
                        iM9671 = iM9671;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ۙܽ")) * 75;
                        i = ((iM3169 ^ i6) * 2219) ^ 1164700406;
                        i2 = -196515891;
                        i5 = iM3169 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM9671 = iM9671;
                    }
                    break;
                case -1728852476:
                case -373488035:
                    strM9853 = C3033.m9853(str);
                    str3 = strM9853;
                    int iM2764 = C0619.m2761("ۚۚ") ^ i7;
                    iM9671 = iM9671;
                    i = ((iM2764 ^ i6) * (-26055)) ^ 1241974752;
                    i5 = iM2764 ^ (-1206990259);
                    str2 = str2;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -1647761152:
                case 1940982261:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    int i20 = s + s2;
                    i12 = i20 * i20;
                    i13 = s * s;
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0773.m3169("ᩴ֨") ^ i6) * 37;
                        i = ((iM3169 ^ i7) * (-25329)) ^ 881530211;
                        i2 = -1123843572;
                        i5 = iM3169 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM9671 = iM9671;
                    } else {
                        iM9671 = iM9671;
                        iM2761 = (i6 - C0773.m3169("ܿ᩻")) * (-15);
                        i3 = ((iM2761 ^ i7) * 20881) ^ (-1370352903);
                        i4 = -2075773741;
                        str2 = str2;
                        i9 = iM2761 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    }
                    break;
                case -1578415474:
                case 15893361:
                    strM8166 = C2419.m8166(sArr3, i10, i11, i15);
                    if (C3448.m11248() != 0) {
                        iM9671 = iM9671;
                        str3 = str3;
                        int iM31611 = (C0773.m3169("֨۬") ^ i6) * (-111);
                        i9 = iM31611 ^ (-1470077149);
                        str2 = strM8166;
                        i8 = ((iM31611 ^ i7) * 2133) ^ 1943343830;
                        str3 = str3;
                        iM9671 = iM9671;
                    } else {
                        int iM2765 = (i6 - C0619.m2761("᩹ܽ")) * 45;
                        i8 = ((iM2765 ^ i7) * 20393) ^ 815379421;
                        i9 = iM2765 ^ 1071794085;
                        str2 = strM8166;
                    }
                    break;
                case -1491053842:
                case -990938331:
                    C2287.m7745();
                    C2966.m9664();
                    break;
                case -1195178373:
                case -140687400:
                    i15 = 53986;
                    iM3169 = C0773.m3169("۠ۗ") ^ i6;
                    i = ((iM3169 ^ i7) * 683) ^ (-1796401452);
                    i2 = -2088648086;
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -1185691417:
                case -1028015264:
                    i15 = 10659;
                    iM3169 = C0773.m3169("۠ۗ") ^ i6;
                    i = ((iM3169 ^ i7) * 683) ^ (-1796401452);
                    i2 = -2088648086;
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -1143626391:
                case 1589883182:
                    if (C1542.f5343 <= 0) {
                        iM9671 = iM9671;
                        str3 = str3;
                        strM8166 = str2;
                        int iM31612 = (C0773.m3169("֨۬") ^ i6) * (-111);
                        i9 = iM31612 ^ (-1470077149);
                        str2 = strM8166;
                        i8 = ((iM31612 ^ i7) * 2133) ^ 1943343830;
                        str3 = str3;
                        iM9671 = iM9671;
                    } else {
                        str3 = str3;
                        str2 = str2;
                        iM2761 = (i6 - C0773.m3169("ܿ᩻")) * (-15);
                        i3 = ((iM2761 ^ i7) * 20881) ^ (-1370352903);
                        i4 = -2075773741;
                        str2 = str2;
                        i9 = iM2761 ^ i4;
                        i8 = i3;
                        str3 = str3;
                    }
                    break;
                case -870710981:
                case -453249924:
                    C0619.m2763();
                    if (!C17202.f56030) {
                        iM9671 = iM9671;
                        str3 = str3;
                        str2 = str2;
                        iM3169 = C0773.m3169("᩹۫") ^ i7;
                        i = ((iM3169 ^ i6) * (-6575)) ^ 290227502;
                        i2 = 714065551;
                        i5 = iM3169 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM9671 = iM9671;
                    }
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    iM3169 = (C0619.m2761("᩷ۡ") ^ i7) * (-13);
                    i = ((iM3169 ^ i6) * 31499) ^ (-1477229605);
                    i2 = 1144761690;
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -804381369:
                case -138413130:
                    str2 = str2;
                    sArr3 = f56034;
                    i11 = 3;
                    if (C0269.f1558 <= 0) {
                        iM9671 = iM9671;
                        str3 = str3;
                        i10 = 284;
                        iM3169 = (i7 - C0619.m2761("ۘۧ")) * (-99);
                        i = ((iM3169 ^ i6) * 11577) ^ 526876912;
                        i2 = 1371509634;
                        i5 = iM3169 ^ i2;
                        str2 = str2;
                        str3 = str3;
                        i9 = i5;
                        i8 = i;
                        iM9671 = iM9671;
                    } else {
                        int iM2766 = C0619.m2761("ۖۛ") ^ i7;
                        str2 = str2;
                        i9 = iM2766 ^ (-2005677699);
                        i8 = ((iM2766 ^ i6) * (-31773)) ^ 277668730;
                        i10 = 284;
                    }
                    break;
                case -618089237:
                case 1308612139:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0619.m2761("᩷ۡ") ^ i7) * (-13);
                        i = ((iM3169 ^ i6) * 31499) ^ (-1477229605);
                        i2 = 1144761690;
                    } else {
                        iM3169 = (C0619.m2761("ۖ᩺") ^ i6) * 5;
                        i = ((iM3169 ^ i7) * 17757) ^ 873473046;
                        i2 = -930978727;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -401772795:
                case 1805340412:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    i14 = 274564900;
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("᩹۫") ^ i7;
                        i = ((iM3169 ^ i6) * (-6575)) ^ 290227502;
                        i2 = 714065551;
                    } else {
                        iM3169 = C0773.m3169("ۢۘ") ^ i7;
                        i = ((iM3169 ^ i6) * 703) ^ 1243907052;
                        i2 = 130339023;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -139887029:
                case 1408456452:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    s = sArr[281];
                    s2 = 16570;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (i7 - C0619.m2761("ۘۧ")) * (-99);
                        i = ((iM3169 ^ i6) * 11577) ^ 526876912;
                        i2 = 1371509634;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩻") ^ i6;
                        i = ((iM3169 ^ i7) * 30345) ^ 2030189317;
                        i2 = -1716711245;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -83950575:
                case 1510925625:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    sArr = f56034;
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("᩹۫") ^ i7;
                        i = ((iM3169 ^ i6) * (-6575)) ^ 290227502;
                        i2 = 714065551;
                    } else {
                        iM3169 = C0773.m3169("۬ܿ") ^ i7;
                        i = ((iM3169 ^ i6) * (-19715)) ^ 2061783442;
                        i2 = -567149906;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case -47277504:
                case 254121040:
                    str3 = str3;
                    str2 = str2;
                    iM9671 = C2966.m9671(str) - 2;
                    if (RunnableC3646.f12471) {
                        iM2761 = (i6 - C0773.m3169("ܿ᩻")) * (-15);
                        i3 = ((iM2761 ^ i7) * 20881) ^ (-1370352903);
                        i4 = -2075773741;
                    } else {
                        iM2761 = C0619.m2761("ܰ۫") ^ i6;
                        i3 = ((iM2761 ^ i7) * 7719) ^ (-1907508569);
                        i4 = 1657564013;
                    }
                    str2 = str2;
                    i9 = iM2761 ^ i4;
                    i8 = i3;
                    str3 = str3;
                    break;
                case 51684395:
                case 177786405:
                    C23916.m53419();
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    iM3169 = (C0619.m2761("᩷ۡ") ^ i7) * (-13);
                    i = ((iM3169 ^ i6) * 31499) ^ (-1477229605);
                    i2 = 1144761690;
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case 426228869:
                case 912967134:
                    str2 = str2;
                    m40397(C0619.m2761(str2) ^ 2124258074, str3, z);
                    iM9671 = iM9671;
                    str3 = str3;
                    iM3169 = (C0773.m3169("᩻۟") ^ i7) * 19;
                    i = ((iM3169 ^ i6) * 28483) ^ (-1694402164);
                    i2 = 1729651435;
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case 636787215:
                case 803741310:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    sArr2 = f56034;
                    i16 = 282;
                    i17 = 2;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (i7 - C0619.m2761("ۘۧ")) * (-99);
                        i = ((iM3169 ^ i6) * 11577) ^ 526876912;
                        i2 = 1371509634;
                    } else {
                        iM3169 = C0773.m3169("ۖۤ") ^ i6;
                        i = ((iM3169 ^ i7) * (-16033)) ^ (-245626172);
                        i2 = 985355169;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case 1595156442:
                case 1771957785:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    if (str != null) {
                        iM3169 = (i7 - C0619.m2761("᩹ۜ")) * (-11);
                        i = ((iM3169 ^ i6) * 29841) ^ 8853642;
                        i2 = 325264192;
                    } else {
                        iM3169 = (C0773.m3169("᩻۟") ^ i7) * 19;
                        i = ((iM3169 ^ i6) * 28483) ^ (-1694402164);
                        i2 = 1729651435;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
                case 1726359367:
                case 1905276189:
                    break;
                default:
                    iM9671 = iM9671;
                    str3 = str3;
                    str2 = str2;
                    if (C2966.m9659(str, C11235.m28300(sArr2, i16, i17, i15))) {
                        iM3169 = C0619.m2761("ۛۘ") ^ i6;
                        i = ((iM3169 ^ i7) * 16385) ^ 319503359;
                        i2 = 389199513;
                    } else {
                        iM3169 = C0619.m2761("᩹ۤ") ^ i7;
                        i = ((iM3169 ^ i6) * (-26399)) ^ (-1262209216);
                        i2 = -1318540103;
                    }
                    i5 = iM3169 ^ i2;
                    str2 = str2;
                    str3 = str3;
                    i9 = i5;
                    i8 = i;
                    iM9671 = iM9671;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int[] m40389(View view) {
        int paddingLeft = 0;
        int paddingTop = 0;
        int paddingRight = 0;
        int i = 204861426;
        int i2 = C1321.f4751;
        int i3 = C1826.f6190;
        int iM2761 = C0619.m2761("۟ۛ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 23711) ^ 463134208;
        int i5 = -1725751966;
        while (true) {
            i = ((((i ^ i2) * (-27935)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2133358340:
                case 57751537:
                    return null;
                case -2109337784:
                case -315731631:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("֨ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22345) ^ 273737070;
                        i5 = -1977599127;
                    } else {
                        iM2761 = (C0773.m3169("ۡۧ") ^ i2) * 53;
                        i4 = ((iM2761 ^ i3) * 12091) ^ 27462997;
                        i5 = -496444369;
                    }
                    break;
                case -2063277905:
                case 878012567:
                    paddingRight = view.getPaddingRight();
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("ܽᩴ") + i2) * (-31);
                        i4 = ((iM2761 ^ i3) * 31889) ^ (-1303359201);
                        i5 = 1331432167;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֡۠")) * 5;
                        i4 = ((iM2761 ^ i3) * 29447) ^ 1817113482;
                        i5 = 1421685545;
                    }
                    break;
                case -1939796808:
                case -1127704453:
                    if (C0862.f3233 != 0) {
                        iM2761 = (i2 - C0773.m3169("֨ۧ")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-16463)) ^ (-598752794);
                        i5 = -1273452000;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۫") + i3) * 65;
                        i4 = ((iM2761 ^ i2) * (-8025)) ^ 1359031216;
                        i5 = -537708431;
                    }
                    break;
                case -1879828894:
                case 68081328:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("֨ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22345) ^ 273737070;
                        i5 = -1977599127;
                    } else {
                        iM2761 = C0773.m3169("᩷ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9477) ^ 1137811706;
                        i5 = -785313767;
                    }
                    break;
                case -1677550859:
                case -622837201:
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 25645) ^ (-927108817);
                        i5 = -1164427215;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֨ۧ")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-16463)) ^ (-598752794);
                        i5 = -1273452000;
                    }
                    break;
                case -1626313106:
                case 1286158457:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۘ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7401)) ^ 641297553;
                        i5 = 919890318;
                    } else {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 25645) ^ (-927108817);
                        i5 = -1164427215;
                    }
                    break;
                case -1402449968:
                case -620426126:
                    paddingLeft = view.getPaddingLeft();
                    paddingTop = view.getPaddingTop();
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۢۘ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 10971) ^ 1086566008;
                        i5 = 758296757;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩺ܿ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * (-24995)) ^ (-1700284881);
                        i5 = -1196125066;
                    }
                    break;
                case -1244194626:
                case -676611320:
                    if (C1343.m4943()) {
                        iM2761 = (C0773.m3169("ۖ᩶") ^ i2) * 67;
                        i4 = ((iM2761 ^ i3) * (-2213)) ^ 254611633;
                        i5 = 622609002;
                    } else {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 25645) ^ (-927108817);
                        i5 = -1164427215;
                    }
                    break;
                case -982120574:
                case 1569721712:
                    RunnableC3646.m11813();
                    C2288.m7767();
                    return null;
                case -843792069:
                case 1418792393:
                    if (!C3779.m12264()) {
                        iM2761 = C0619.m2761("֨ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22345) ^ 273737070;
                        i5 = -1977599127;
                    } else {
                        iM2761 = (C0619.m2761("ۢۘ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 10971) ^ 1086566008;
                        i5 = 758296757;
                    }
                    break;
                case -217568815:
                case 1701626766:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 25645) ^ (-927108817);
                        i5 = -1164427215;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6759) ^ (-1646183566);
                        i5 = -425471378;
                    }
                    break;
                case -37292711:
                case 771521433:
                    if (view == null) {
                        iM2761 = C0773.m3169("ۢۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19025)) ^ (-973826840);
                        i5 = 1737807905;
                    } else {
                        iM2761 = C0619.m2761("ۖܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16567) ^ 572346817;
                        i5 = -1075780420;
                    }
                    break;
                case 287254722:
                case 340124069:
                    return new int[]{paddingLeft, paddingTop, paddingRight, view.getPaddingBottom()};
                case 342611788:
                case 1100670281:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ܶܳ") ^ i3) * 57;
                        i4 = ((iM2761 ^ i2) * 25645) ^ (-927108817);
                        i5 = -1164427215;
                    } else {
                        iM2761 = (C0773.m3169("ۨۨ") ^ i2) * (-83);
                        i4 = ((iM2761 ^ i3) * (-7061)) ^ 611014903;
                        i5 = 264182734;
                    }
                    break;
                case 750277166:
                case 862159072:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i2 - C0773.m3169("֨ۧ")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-16463)) ^ (-598752794);
                        i5 = -1273452000;
                    } else {
                        iM2761 = (C0619.m2761("ۢۘ") ^ i3) * (-75);
                        i4 = ((iM2761 ^ i2) * 10971) ^ 1086566008;
                        i5 = 758296757;
                    }
                    break;
                case 1005778376:
                case 1378989259:
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i2 - C0773.m3169("֨ۧ")) * (-37);
                        i4 = ((iM2761 ^ i3) * (-16463)) ^ (-598752794);
                        i5 = -1273452000;
                    } else {
                        iM2761 = C0619.m2761("ܿᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 28045) ^ (-793029168);
                        i5 = -1832039176;
                    }
                    break;
                default:
                    C3448.m11248();
                    C0269.m1775();
                    iM2761 = (C0619.m2761("ۢۘ") ^ i3) * (-75);
                    i4 = ((iM2761 ^ i2) * 10971) ^ 1086566008;
                    i5 = 758296757;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03fe A[PHI: r23 r27 r29 r30
      0x03fe: PHI (r23v6 int) = (r23v4 int), (r23v2 int), (r23v2 int) binds: [B:103:0x03fc, B:93:0x0366, B:84:0x0323] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r27v22 java.lang.String) = (r27v17 java.lang.String), (r27v20 java.lang.String), (r27v23 java.lang.String) binds: [B:103:0x03fc, B:93:0x0366, B:84:0x0323] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r29v13 int) = (r29v9 int), (r29v11 int), (r29v14 int) binds: [B:103:0x03fc, B:93:0x0366, B:84:0x0323] A[DONT_GENERATE, DONT_INLINE]
      0x03fe: PHI (r30v14 android.net.Uri) = (r30v10 android.net.Uri), (r30v12 android.net.Uri), (r30v15 android.net.Uri) binds: [B:103:0x03fc, B:93:0x0366, B:84:0x0323] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f6 A[PHI: r8 r10 r12 r13
      0x01f6: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:57:0x01f4, B:39:0x012e, B:27:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r10v4 java.io.File) = (r10v2 java.io.File), (r10v3 java.io.File), (r10v2 java.io.File) binds: [B:57:0x01f4, B:39:0x012e, B:27:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:57:0x01f4, B:39:0x012e, B:27:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:57:0x01f4, B:39:0x012e, B:27:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        if (l.C2834.f9334 > 0) goto L7;
     */
    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context, l.InterfaceC15712
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startActivity(android.content.Intent r34) {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC17204.startActivity(android.content.Intent):void");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0276 A[PHI: r3 r5 r6 r7
      0x0276: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:77:0x0274, B:69:0x0226, B:65:0x0204, B:42:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r5v5 short) = (r5v2 short), (r5v4 short), (r5v2 short), (r5v2 short) binds: [B:77:0x0274, B:69:0x0226, B:65:0x0204, B:42:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:77:0x0274, B:69:0x0226, B:65:0x0204, B:42:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x0276: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:77:0x0274, B:69:0x0226, B:65:0x0204, B:42:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40409(AbstractC22044 abstractC22044, List list) {
        int iM3169;
        int i;
        int i2;
        ArrayList arrayList = null;
        String strM4058 = null;
        short[] sArr = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -2140437754;
        int i7 = C1080.f3865;
        int i8 = RunnableC0334.f1808;
        int iM2761 = (C0619.m2761("ܺۜ") + i7) * (-5);
        int i9 = ((iM2761 ^ i8) * (-6709)) ^ (-1412784078);
        int i10 = -384191959;
        while (true) {
            int i11 = iM2761 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * (-9631)) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2027464339:
                    case 1980479115:
                        C2287.m7745();
                        C2023.m6964();
                        iM2761 = C0773.m3169("ܺ᩹") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-6351)) ^ 1922765777;
                        i10 = 651671790;
                    case -1911398735:
                    case -38136490:
                        Uri uri = Uri.parse(strM4058);
                        short[] sArr2 = f56034;
                        if (C2966.f9654 < 0) {
                            if (C0269.m1775() > 0) {
                                this.f56050.m10999(new Intent(C0950.m3780(sArr2, 309, 43, i5), uri));
                                return false;
                            }
                            iM3169 = (C0619.m2761("۠ۢ") + i8) * (-5);
                            i = ((iM3169 ^ i7) * 16775) ^ 454254201;
                            i2 = -911686560;
                            i11 = iM3169 ^ i2;
                            i9 = i;
                        } else {
                            iM2761 = C0773.m3169("᩵ۜ") ^ i8;
                            i9 = ((iM2761 ^ i7) * 2869) ^ 650000966;
                            i10 = -1298424667;
                        }
                        break;
                    case -1870029038:
                    case 1351132870:
                        s = sArr[300];
                        if (AbstractC3624.f12429 <= 0) {
                            iM3169 = (C0773.m3169("᩸֫") ^ i7) * (-117);
                            i = ((iM3169 ^ i8) * (-1305)) ^ 1441341957;
                            i2 = -996418415;
                        } else {
                            iM3169 = (C0619.m2761("ۡ۫") ^ i7) * 101;
                            i = ((iM3169 ^ i8) * (-31747)) ^ (-1484348802);
                            i2 = -2030006566;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case -1760105639:
                    case -1258467127:
                        if (i3 - (50951044 + i4) > 0) {
                            iM3169 = C0773.m3169("᩸ۤ") ^ i8;
                            i = ((iM3169 ^ i7) * 30997) ^ (-1102302465);
                            i2 = 1791239928;
                        } else {
                            iM3169 = (C0773.m3169("ᩴ֫") ^ i7) * (-65);
                            i = ((iM3169 ^ i8) * (-14801)) ^ (-1334309066);
                            i2 = 1787983632;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case -1421171657:
                    case 2118050680:
                        RunnableC3055.m9933();
                        if (!C1146.m4231()) {
                            iM2761 = C0773.m3169("ܺ᩹") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-6351)) ^ 1922765777;
                            i10 = 651671790;
                        }
                        iM2761 = C0773.m3169("۬ۗ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 29321) ^ (-1271274442);
                        i10 = -992094011;
                        break;
                    case -1347674384:
                    case 1867515335:
                        sArr = f56034;
                        if (C0862.f3233 != 0) {
                            iM3169 = (C0619.m2761("۠ۢ") + i8) * (-5);
                            i = ((iM3169 ^ i7) * 16775) ^ 454254201;
                            i2 = -911686560;
                        } else {
                            iM3169 = (C0619.m2761("۬ۙ") + i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i = ((iM3169 ^ i8) * 13167) ^ 162938562;
                            i2 = 1208452759;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case -1043137360:
                    case 863523402:
                        arrayList = new ArrayList(list);
                        iM2761 = (i8 - C0773.m3169("ۚ֡")) * 37;
                        i9 = ((iM2761 ^ i7) * 15093) ^ (-1495442690);
                        i10 = 517650134;
                        break;
                    case -802743408:
                    case 1807719767:
                        arrayList = null;
                        iM2761 = (i8 - C0773.m3169("ۚ֡")) * 37;
                        i9 = ((iM2761 ^ i7) * 15093) ^ (-1495442690);
                        i10 = 517650134;
                        break;
                        break;
                    case -629479874:
                    case 964166336:
                        this.f56049 = arrayList;
                        short[] sArr3 = f56034;
                        if (C3099.f10023 > 0) {
                            if (RunnableC3055.f9898 < 0) {
                                String strM40377 = C17202.m40377(sArr3, 301, 8, i5);
                                if (C2310.f7472 < 0) {
                                    StringBuilder sb = new StringBuilder(strM40377);
                                    C3779.m12258(sb, getPackageName());
                                    strM4058 = C1080.m4058(sb);
                                    if (C2702.m8876()) {
                                        iM2761 = C0773.m3169("֡ۧ") ^ i7;
                                        i9 = ((iM2761 ^ i8) * (-933)) ^ (-250598916);
                                        i10 = 652015320;
                                    }
                                }
                                iM3169 = (C0773.m3169("᩸֫") ^ i7) * (-117);
                                i = ((iM3169 ^ i8) * (-1305)) ^ 1441341957;
                                i2 = -996418415;
                                i11 = iM3169 ^ i2;
                                i9 = i;
                            } else {
                                iM2761 = C0773.m3169("۬ۗ") ^ i7;
                                i9 = ((iM2761 ^ i8) * 29321) ^ (-1271274442);
                                i10 = -992094011;
                            }
                        }
                        iM3169 = (C0619.m2761("۠ۢ") + i8) * (-5);
                        i = ((iM3169 ^ i7) * 16775) ^ 454254201;
                        i2 = -911686560;
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case -240898704:
                    case -38726535:
                        C1826.m6301();
                        return false;
                    case -208781025:
                    case 141832272:
                        i3 = s * 14276;
                        i4 = s * s;
                        if (C17202.f56030) {
                            iM3169 = (C0773.m3169("۬ۛ") + i8) * (-27);
                            i = ((iM3169 ^ i7) * 9301) ^ (-273514266);
                            i2 = -1010946513;
                        } else {
                            iM3169 = (C0773.m3169("᩸֫") ^ i7) * (-117);
                            i = ((iM3169 ^ i8) * (-1305)) ^ 1441341957;
                            i2 = -996418415;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case -13232221:
                    case 571533811:
                        this.f56043 = abstractC22044;
                        if (list == null) {
                            iM3169 = (C0619.m2761("ۚܳ") + i7) * 115;
                            i = ((iM3169 ^ i8) * (-17437)) ^ (-1793697037);
                            i2 = 1602008163;
                        } else {
                            iM3169 = (C0773.m3169("֡ۛ") ^ i8) * (-65);
                            i = ((iM3169 ^ i7) * 611) ^ 201675411;
                            i2 = -1681968229;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case 45674087:
                    case 982744459:
                        C2878.m9491();
                        if (!C13473.m33144()) {
                            iM2761 = C0773.m3169("ܺ᩹") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-6351)) ^ 1922765777;
                            i10 = 651671790;
                            break;
                        }
                        iM2761 = C0773.m3169("᩵ۜ") ^ i8;
                        i9 = ((iM2761 ^ i7) * 2869) ^ 650000966;
                        i10 = -1298424667;
                        break;
                    case 51981020:
                    case 532370246:
                        C1343.m4943();
                        if (!C0619.f2439) {
                            iM2761 = C0773.m3169("ܺ᩹") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-6351)) ^ 1922765777;
                            i10 = 651671790;
                        }
                        iM3169 = (C0619.m2761("۠ۢ") + i8) * (-5);
                        i = ((iM3169 ^ i7) * 16775) ^ 454254201;
                        i2 = -911686560;
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case 85619314:
                    case 509442432:
                        return true;
                    case 112744835:
                    case 1601758043:
                        i5 = 13071;
                        iM3169 = C0773.m3169("᩶֨") ^ i8;
                        i = ((iM3169 ^ i7) * (-6025)) ^ (-1659607376);
                        i2 = 1358402061;
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case 289643550:
                    case 1608677671:
                        if (C1519.f5300 >= 0) {
                            iM3169 = (C0773.m3169("᩸֫") ^ i7) * (-117);
                            i = ((iM3169 ^ i8) * (-1305)) ^ 1441341957;
                            i2 = -996418415;
                        } else {
                            iM3169 = (i8 - C0773.m3169("ܽۢ")) * 25;
                            i = ((iM3169 ^ i7) * (-17685)) ^ (-1473944783);
                            i2 = 1358514621;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case 564973553:
                    case 2114041525:
                        i5 = 64947;
                        iM3169 = C0773.m3169("᩶֨") ^ i8;
                        i = ((iM3169 ^ i7) * (-6025)) ^ (-1659607376);
                        i2 = 1358402061;
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    case 1699435824:
                    case 1907548547:
                        if (Build.VERSION.SDK_INT >= 26) {
                            iM3169 = C0773.m3169("ۜܿ") ^ i7;
                            i = ((iM3169 ^ i8) * (-15189)) ^ (-1999264655);
                            i2 = -1010828214;
                        } else {
                            iM3169 = (i7 - C0773.m3169("۠ܺ")) * (-47);
                            i = ((iM3169 ^ i8) * 19743) ^ 425886733;
                            i2 = -1119613540;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                    default:
                        if (getPackageManager().canRequestPackageInstalls()) {
                            iM3169 = (i7 - C0773.m3169("۠ܺ")) * (-47);
                            i = ((iM3169 ^ i8) * 19743) ^ 425886733;
                            i2 = -1119613540;
                        } else {
                            iM3169 = (C0773.m3169("ᩴ᩹") ^ i8) * (-85);
                            i = ((iM3169 ^ i7) * 29437) ^ 1601647422;
                            i2 = -680566579;
                        }
                        i11 = iM3169 ^ i2;
                        i9 = i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static String m40388() {
        WeakReference weakReference = null;
        View view = null;
        C24132 c24132M55666 = null;
        int i = -1790401378;
        int i2 = C1542.f5343;
        int i3 = RunnableC3055.f9898;
        int iM2761 = C0619.m2761("ۛۚ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-20955)) ^ 1722297425;
        int i5 = 793409135;
        while (true) {
            i = ((((i ^ i3) * (-11431)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1876198030:
                case 1884103382:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("ܺۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7601)) ^ 28975061;
                        i5 = 1827976264;
                    } else {
                        iM2761 = (C0619.m2761("ۧܽ") + i3) * (-23);
                        i4 = ((iM2761 ^ i2) * 30343) ^ 613164629;
                        i5 = 49536669;
                    }
                    break;
                case -1855757179:
                case 630559366:
                    C2310.m7813();
                    if (C4282.f15546 > 0) {
                        iM2761 = (i3 - C0619.m2761("᩺֨")) * 3;
                        i4 = ((iM2761 ^ i2) * 18941) ^ 1214912394;
                        i5 = 1486753511;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۙ") ^ i2) * (-45);
                        i4 = ((iM2761 ^ i3) * (-28501)) ^ (-1456019835);
                        i5 = -411361623;
                    }
                    break;
                case -1653474034:
                case 441437936:
                    view = (View) weakReference.get();
                    if (view != null) {
                        iM2761 = (C0619.m2761("᩹ܰ") ^ i3) * (-35);
                        i4 = ((iM2761 ^ i2) * (-29975)) ^ (-644035515);
                        i5 = -1349373795;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܽ᩶")) * 63;
                        i4 = ((iM2761 ^ i2) * 12501) ^ 1849725516;
                        i5 = 2125638923;
                    }
                    break;
                case -1541702306:
                case 1403161080:
                    c24132M55666 = ((C24943) view).m55666();
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("ۚ۬") ^ i3) * 31;
                        i4 = ((iM2761 ^ i2) * (-29555)) ^ (-386861804);
                        i5 = -510375032;
                    } else {
                        iM2761 = C0773.m3169("ܺܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27793) ^ 1311117701;
                        i5 = -649438617;
                    }
                    break;
                case -1443164206:
                case 650435113:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ۚ۬") ^ i3) * 31;
                        i4 = ((iM2761 ^ i2) * (-29555)) ^ (-386861804);
                        i5 = -510375032;
                    } else {
                        iM2761 = C0773.m3169("֫ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23099)) ^ 1800819208;
                        i5 = -973109153;
                    }
                    break;
                case -1432505016:
                case -173916713:
                    if (C0950.m3785() != 0) {
                        iM2761 = (i3 - C0619.m2761("᩺֨")) * 3;
                        i4 = ((iM2761 ^ i2) * 18941) ^ 1214912394;
                        i5 = 1486753511;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩸ۧ")) * (-51);
                        i4 = ((iM2761 ^ i3) * (-18329)) ^ (-900883703);
                        i5 = -1128127715;
                    }
                    break;
                case -1362868134:
                case 1703610183:
                    C0619.m2763();
                    return null;
                case -1241240200:
                case -1191369118:
                    C0862.m3503();
                    if (!RunnableC0334.m2063()) {
                        iM2761 = (C0773.m3169("᩺᩻") + i3) * (-33);
                        i4 = ((iM2761 ^ i2) * (-3501)) ^ (-1260726712);
                        i5 = -1268914212;
                    } else {
                        iM2761 = C0773.m3169("ܺۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7601)) ^ 28975061;
                        i5 = 1827976264;
                    }
                    break;
                case -1220031591:
                case -422364763:
                    if (C2485.f7950 == 0) {
                        iM2761 = (C0773.m3169("᩷ۙ") ^ i2) * (-45);
                        i4 = ((iM2761 ^ i3) * (-28501)) ^ (-1456019835);
                        i5 = -411361623;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩻") + i3) * (-33);
                        i4 = ((iM2761 ^ i2) * (-3501)) ^ (-1260726712);
                        i5 = -1268914212;
                    }
                    break;
                case -1098124225:
                case -497974498:
                    return null;
                case -910629620:
                case -149375317:
                    return ((C24132) view).m53879();
                case -548294886:
                case -422641618:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("᩷ۙ") ^ i2) * (-45);
                        i4 = ((iM2761 ^ i3) * (-28501)) ^ (-1456019835);
                        i5 = -411361623;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰܰ")) * (-55);
                        i4 = ((iM2761 ^ i2) * (-1967)) ^ (-1667352487);
                        i5 = -1142544524;
                    }
                    break;
                case -507650519:
                case -291903232:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0773.m3169("᩷ۙ") ^ i2) * (-45);
                        i4 = ((iM2761 ^ i3) * (-28501)) ^ (-1456019835);
                        i5 = -411361623;
                    } else {
                        iM2761 = (C0773.m3169("֫ܳ") ^ i3) * 91;
                        i4 = ((iM2761 ^ i2) * 11655) ^ (-26195065);
                        i5 = 703313104;
                    }
                    break;
                case -296450943:
                case 136190928:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("ۚ۬") ^ i3) * 31;
                        i4 = ((iM2761 ^ i2) * (-29555)) ^ (-386861804);
                        i5 = -510375032;
                    } else {
                        iM2761 = C0773.m3169("۟ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10703) ^ (-762376137);
                        i5 = -526773214;
                    }
                    break;
                case -18689277:
                case 928876860:
                    C1080.m4050();
                    iM2761 = (C0773.m3169("᩺᩻") + i3) * (-33);
                    i4 = ((iM2761 ^ i2) * (-3501)) ^ (-1260726712);
                    i5 = -1268914212;
                    break;
                case 270661478:
                case 1339707526:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0619.m2761("ۚ۬") ^ i3) * 31;
                        i4 = ((iM2761 ^ i2) * (-29555)) ^ (-386861804);
                        i5 = -510375032;
                    } else {
                        iM2761 = C0773.m3169("ۧ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7621) ^ 481683993;
                        i5 = -1476856332;
                    }
                    break;
                case 299955636:
                case 1752394443:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("᩺᩻") + i3) * (-33);
                        i4 = ((iM2761 ^ i2) * (-3501)) ^ (-1260726712);
                        i5 = -1268914212;
                    } else {
                        iM2761 = C0619.m2761("᩷᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24613) ^ 928688328;
                        i5 = -1775033902;
                    }
                    break;
                case 668784255:
                case 2032291344:
                    if (view instanceof C24943) {
                        iM2761 = C0619.m2761("ۙ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20495) ^ 529513629;
                        i5 = 449029993;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܽ᩶")) * 63;
                        i4 = ((iM2761 ^ i2) * 12501) ^ 1849725516;
                        i5 = 2125638923;
                    }
                    break;
                case 803457357:
                case 1981215219:
                    return c24132M55666.m53870();
                case 1271881982:
                case 1714122012:
                    weakReference = f56035;
                    if (weakReference != null) {
                        iM2761 = C0619.m2761("۬ᩴ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23515)) ^ (-353237282);
                        i5 = -737096662;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܽ᩶")) * 63;
                        i4 = ((iM2761 ^ i2) * 12501) ^ 1849725516;
                        i5 = 2125638923;
                    }
                    break;
                case 1379213370:
                case 1870287100:
                    if (view instanceof C24132) {
                        iM2761 = C0773.m3169("᩻ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21119)) ^ (-1170620620);
                        i5 = 598157619;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۛ") ^ i2) * (-95);
                        i4 = ((iM2761 ^ i3) * (-4223)) ^ (-558128702);
                        i5 = -1117349447;
                    }
                    break;
                default:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (C0773.m3169("᩷ۙ") ^ i2) * (-45);
                        i4 = ((iM2761 ^ i3) * (-28501)) ^ (-1456019835);
                        i5 = -411361623;
                    } else {
                        iM2761 = C0773.m3169("ۚۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15413) ^ 58671417;
                        i5 = -96609313;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public void mo113() {
        C6544.m18428();
        C9501.m24882();
        recreate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40384(Intent intent, boolean z) {
        int iM3169;
        int i;
        C2813 c2813 = null;
        C17930 c17930 = null;
        int i2 = -415799665;
        int i3 = RunnableC3055.f9898;
        int i4 = C1146.f4234;
        int iM2761 = (i4 - C0619.m2761("ۢۨ")) * (-127);
        int i5 = ((iM2761 ^ i3) * (-7729)) ^ 1615487021;
        int i6 = 778617702;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * (-22871)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1918845840:
                    case 1781535086:
                        if (C3734.m12152() < 0) {
                            iM2761 = (i4 - C0773.m3169("ܺۖ")) * (-81);
                            i5 = ((iM2761 ^ i3) * (-4159)) ^ 768641672;
                            i6 = 2145660971;
                        } else {
                            iM2761 = C0619.m2761("ۙܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 4955) ^ (-1953716915);
                            i6 = 1154347211;
                        }
                        break;
                    case -1630339095:
                    case 2020247139:
                        if (C3448.f11240 < 0) {
                            iM2761 = C0773.m3169("ۙۢ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-13217)) ^ 859563893;
                            i6 = -1810722248;
                        } else {
                            iM2761 = C0773.m3169("ۗۙ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-11953)) ^ (-357134697);
                            i6 = 345318693;
                        }
                        break;
                    case -1614589505:
                    case 1516200154:
                        if (C0269.m1775() > 0) {
                            iM2761 = C0619.m2761("۬֡") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-10319)) ^ (-1963202846);
                            i6 = -1480645025;
                        } else {
                            iM2761 = C0619.m2761("ۙܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 4955) ^ (-1953716915);
                            i6 = 1154347211;
                        }
                        break;
                    case -1556017753:
                    case 1443265745:
                        if (C1783.f6087 > 0) {
                            iM2761 = C0619.m2761("۫ۗ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27793) ^ (-497089831);
                            i6 = -1165433169;
                        } else {
                            iM2761 = C0619.m2761("ۗۤ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 10639) ^ 1651281536;
                            i6 = -1972109166;
                        }
                        break;
                    case -1527995963:
                    case 189075598:
                        C2310.m7813();
                        if (C4238.f15451 < 0) {
                            iM2761 = C0619.m2761("ۙܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 4955) ^ (-1953716915);
                            i6 = 1154347211;
                            break;
                        }
                        iM2761 = C0619.m2761("᩻ۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-23885)) ^ 535394878;
                        i6 = -27307627;
                    case -1400224295:
                    case 1465086676:
                        if (C2485.f7950 == 0) {
                            iM2761 = C0773.m3169("۠᩷") ^ i4;
                            i5 = ((iM2761 ^ i3) * 27295) ^ 712902113;
                            i6 = 1961389113;
                        } else {
                            iM2761 = C0619.m2761("ۗۤ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 10639) ^ 1651281536;
                            i6 = -1972109166;
                        }
                        break;
                    case -1300786988:
                    case 1351928935:
                        c2813 = new C2813(intent);
                        if (!z) {
                            iM2761 = C0773.m3169("ᩴ۫") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-14311)) ^ 888682930;
                            i6 = -2064099640;
                        } else {
                            iM2761 = C0619.m2761("ᩴۘ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 20259) ^ 383955096;
                            i6 = -686109272;
                        }
                        break;
                    case -1292539733:
                    case -1049668566:
                        if (C1542.f5343 > 0) {
                            iM2761 = C0619.m2761("۬۟") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-23981)) ^ (-362653583);
                            i6 = 1037647617;
                        } else {
                            iM2761 = (C0773.m3169("۠ۢ") ^ i3) * (-91);
                            i5 = ((iM2761 ^ i4) * (-18397)) ^ 1741260675;
                            i6 = -1344657878;
                        }
                        break;
                    case -1138542402:
                    case 1617440251:
                        C0619.m2763();
                        if (C2310.f7472 >= 0) {
                            iM2761 = C0773.m3169("ۗۙ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-11953)) ^ (-357134697);
                            i6 = 345318693;
                            break;
                        }
                        iM2761 = C0619.m2761("᩻ۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-23885)) ^ 535394878;
                        i6 = -27307627;
                        break;
                    case -1111101085:
                    case 1747362164:
                        C3779.m12264();
                        AbstractC0116.m1243();
                        iM2761 = C0619.m2761("᩻ۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-23885)) ^ 535394878;
                        i6 = -27307627;
                        break;
                    case -997073492:
                    case -49916222:
                        if (C11235.f35427 < 0) {
                            iM2761 = (C0773.m3169("ۤ۫") + i3) * 49;
                            i5 = ((iM2761 ^ i4) * (-16289)) ^ 1032984420;
                            i6 = 592744023;
                        } else {
                            iM2761 = C0619.m2761("᩻ۗ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-23885)) ^ 535394878;
                            i6 = -27307627;
                        }
                        break;
                    case -987415168:
                    case 929805812:
                        c17930.mo40353(c2813);
                        break;
                    case -579733687:
                    case 398894184:
                        if (!C17202.f56030) {
                            iM2761 = (C0773.m3169("۠ۢ") ^ i3) * (-91);
                            i5 = ((iM2761 ^ i4) * (-18397)) ^ 1741260675;
                            i6 = -1344657878;
                            break;
                        }
                        iM2761 = C0773.m3169("ܳܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-12309)) ^ 1879964605;
                        i6 = 1959718414;
                        break;
                    case -573916005:
                    case 1311061035:
                        C3779.m12264();
                        AbstractC3624.m11755();
                        break;
                    case -527037584:
                    case -177298971:
                        c17930.mo40348(c2813);
                        break;
                    case -418712937:
                    case 610998035:
                        if (C1146.f4234 < 0) {
                            iM2761 = C0619.m2761("۬ۨ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 2161) ^ (-374782633);
                            i6 = 1184263969;
                        } else {
                            iM2761 = C0619.m2761("ۙܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 4955) ^ (-1953716915);
                            i6 = 1154347211;
                        }
                        break;
                    case -343208337:
                    case -320792500:
                        if (C3033.m9845() > 0) {
                            iM2761 = (C0619.m2761("۫۠") ^ i3) * (-91);
                            i5 = ((iM2761 ^ i4) * 15239) ^ (-1568997376);
                            i6 = 1963568926;
                        } else {
                            iM2761 = C0619.m2761("ۙܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 4955) ^ (-1953716915);
                            i6 = 1154347211;
                        }
                        break;
                    case 677827638:
                    case 1023738056:
                        boolean zM50557 = C22415.m50557();
                        C17930 c17931 = f56036;
                        if (zM50557) {
                            iM3169 = (C0619.m2761("ܺᩳ") ^ i4) * 73;
                            i5 = ((iM3169 ^ i3) * (-27323)) ^ 35312583;
                            i = 1707365095;
                        } else {
                            iM3169 = (i3 - C0773.m3169("ܺ۬")) * 51;
                            i5 = ((iM3169 ^ i4) * 18403) ^ (-1499603927);
                            i = 1459219699;
                        }
                        i7 = iM3169 ^ i;
                        c17930 = c17931;
                        break;
                    case 880947773:
                    case 1673110918:
                        c2813.m9286();
                        iM2761 = C0619.m2761("ᩴۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 20259) ^ 383955096;
                        i6 = -686109272;
                        break;
                    default:
                        C1146.m4231();
                        if (AbstractC0116.m1243() != 0) {
                            iM2761 = (C0773.m3169("۠ۢ") ^ i3) * (-91);
                            i5 = ((iM2761 ^ i4) * (-18397)) ^ 1741260675;
                            i6 = -1344657878;
                            break;
                        }
                        iM2761 = C0619.m2761("᩻ۗ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-23885)) ^ 535394878;
                        i6 = -27307627;
                        break;
                }
                return;
            }
        }
    }

    @Override // l.InterfaceC15712
    public final C2361 buildDialog() {
        int i = DialogInterfaceC8327.f27315;
        return new C2361(this);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6865 m40391() {
        if (this.f56047 == null) {
            synchronized (this) {
                if (this.f56047 == null) {
                    this.f56047 = new C6865(this);
                }
            }
        }
        return this.f56047;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0265 A[PHI: r4 r10 r11 r12
      0x0265: PHI (r4v3 l.ᩳ֫ܺ) = (r4v2 l.ᩳ֫ܺ), (r4v2 l.ᩳ֫ܺ), (r4v4 l.ᩳ֫ܺ) binds: [B:64:0x0263, B:60:0x0240, B:32:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:64:0x0263, B:60:0x0240, B:32:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:64:0x0263, B:60:0x0240, B:32:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:64:0x0263, B:60:0x0240, B:32:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02df A[PHI: r13 r16 r21
      0x02df: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:76:0x02dd, B:72:0x02bd, B:56:0x021e, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:76:0x02dd, B:72:0x02bd, B:56:0x021e, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x02df: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:76:0x02dd, B:72:0x02bd, B:56:0x021e, B:11:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0311 A[PHI: r2 r8 r9 r15
      0x0311: PHI (r2v6 l.ۢ֫ܺ) = (r2v2 l.ۢ֫ܺ), (r2v2 l.ۢ֫ܺ), (r2v3 l.ۢ֫ܺ), (r2v2 l.ۢ֫ܺ) binds: [B:80:0x030f, B:68:0x029d, B:45:0x019c, B:10:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r8v6 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:80:0x030f, B:68:0x029d, B:45:0x019c, B:10:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r9v6 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:80:0x030f, B:68:0x029d, B:45:0x019c, B:10:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r15v6 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:80:0x030f, B:68:0x029d, B:45:0x019c, B:10:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40390(AbstractActivityC17204 abstractActivityC17204, int i) {
        int iM2761;
        int i2;
        int iM3169;
        int i3;
        int i4;
        AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
        int i5 = AbstractC0641.f2496;
        int i6 = AbstractC0116.f1064;
        int iM31610 = (C0773.m3169("ܺۡ") + i6) * 101;
        int i7 = ((iM31610 ^ i5) * (-11141)) ^ (-974976328);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM31610 ^ (-514988021);
        int i9 = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 886737966;
        char c = 0;
        Intent intent = null;
        InterfaceC18752 interfaceC18752M11489 = null;
        String strM9486 = null;
        InterfaceC9801 interfaceC9801 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i5) * 9443) >> 31));
            switch (i15) {
                case -2114284581:
                case 1059237001:
                    i10 = s + s2;
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("᩻ۘ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-31771)) ^ 2057147601;
                        i2 = -1034024795;
                    } else {
                        iM2761 = (C0773.m3169("۫ᩴ") + i6) * (-75);
                        i7 = ((iM2761 ^ i5) * (-3931)) ^ 393452697;
                        i2 = 569136213;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -2070637969:
                case -292994158:
                    interfaceC18752M11489 = C3492.m11489(ApplicationC17729.f58258);
                    if (!C2878.f9462) {
                        iM3169 = C0773.m3169("ۗ᩺") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-30591)) ^ 76642858;
                        i4 = -1404234473;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    } else {
                        iM2761 = C0773.m3169("᩻ۘ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-31771)) ^ 2057147601;
                        i2 = -1034024795;
                        i8 = iM2761 ^ i2;
                        abstractActivityC17205 = abstractActivityC17204;
                    }
                    break;
                case -1978861835:
                case -271999459:
                    i14 = 59806;
                    iM2761 = (C0619.m2761("ۗۗ") + i6) * (-11);
                    i7 = ((iM2761 ^ i5) * 20325) ^ (-1494400468);
                    i2 = 209831132;
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1916275497:
                case -1098890181:
                    C2023.m6964();
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (C0773.m3169("᩻ᩳ") ^ i6) * 47;
                        i7 = ((iM2761 ^ i5) * 28557) ^ 767053149;
                        i2 = -354625100;
                        i8 = iM2761 ^ i2;
                        abstractActivityC17205 = abstractActivityC17204;
                    } else {
                        iM3169 = C0773.m3169("۬ۚ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 9227) ^ 321127506;
                        i4 = 1442127936;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1627677846:
                case 1764905912:
                    super.startActivity(intent);
                    iM2761 = (C0773.m3169("۫᩺") ^ i5) * 77;
                    i7 = ((iM2761 ^ i6) * (-14235)) ^ (-646984875);
                    i2 = 392036712;
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1470953944:
                case 563915087:
                    C11235.m28308(interfaceC18752M11489.remove(strM9486));
                    iM2761 = C0773.m3169("ۗᩴ") ^ i5;
                    i7 = ((iM2761 ^ i6) * (-2687)) ^ (-1954372338);
                    i2 = 959718155;
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1431198297:
                case 1075667623:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۧ᩷") ^ i6) * 25;
                        i7 = ((iM2761 ^ i5) * (-30355)) ^ 217568042;
                        i2 = -349656005;
                        i8 = iM2761 ^ i2;
                        abstractActivityC17205 = abstractActivityC17204;
                    } else {
                        iM3169 = C0773.m3169("۬ۚ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 9227) ^ 321127506;
                        i4 = 1442127936;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1417239681:
                case 1348808073:
                    i13 = 226576;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-1957)) ^ (-1906073783);
                        i2 = 543484720;
                    } else {
                        iM2761 = C0619.m2761("ۙ֡") ^ i5;
                        i7 = ((iM2761 ^ i6) * 16321) ^ 1659133777;
                        i2 = -821742958;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1277077372:
                case 229217081:
                    if (i == -1) {
                        int iM31611 = (i6 - C0773.m3169("᩵᩻")) * (-97);
                        i8 = iM31611 ^ (-1225906259);
                        i7 = ((iM31611 ^ i5) * 1219) ^ (-141548491);
                    } else {
                        iM2761 = (C0773.m3169("۫᩺") ^ i5) * 77;
                        i7 = ((iM2761 ^ i6) * (-14235)) ^ (-646984875);
                        i2 = 392036712;
                        i8 = iM2761 ^ i2;
                    }
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1250234573:
                case 1104731204:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ܰܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 26367) ^ 2065420719;
                        i2 = 2146816896;
                    } else {
                        iM2761 = (C0619.m2761("ۧ᩷") ^ i6) * 25;
                        i7 = ((iM2761 ^ i5) * (-30355)) ^ 217568042;
                        i2 = -349656005;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -1058514250:
                case 820436369:
                    c = 0;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-1957)) ^ (-1906073783);
                        i2 = 543484720;
                    } else {
                        iM2761 = (C0619.m2761("ۤܰ") ^ i5) * 59;
                        i7 = ((iM2761 ^ i6) * 12501) ^ 1245203541;
                        i2 = 179514040;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -974907574:
                case -568298096:
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f56034;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۧ᩷") ^ i6) * 25;
                        i7 = ((iM2761 ^ i5) * (-30355)) ^ 217568042;
                        i2 = -349656005;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩸") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-3301)) ^ (-915184858);
                        i2 = -516361209;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -968634716:
                case 1424698154:
                    RunnableC0334.m2063();
                    if (C3099.f10023 > 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-1957)) ^ (-1906073783);
                        i2 = 543484720;
                        i8 = iM2761 ^ i2;
                        abstractActivityC17205 = abstractActivityC17204;
                    }
                    iM2761 = (C0619.m2761("ۧ᩷") ^ i6) * 25;
                    i7 = ((iM2761 ^ i5) * (-30355)) ^ 217568042;
                    i2 = -349656005;
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -950851997:
                case 732892776:
                    RunnableC3646.m11813();
                    C0773.m3161();
                    iM3169 = C0773.m3169("۬ۚ") ^ i5;
                    i3 = ((iM3169 ^ i6) * 9227) ^ 321127506;
                    i4 = 1442127936;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -949186809:
                case -527060678:
                    intent = abstractActivityC17205.f56042;
                    abstractActivityC17205.f56042 = null;
                    if (intent == null) {
                        iM2761 = (C0773.m3169("۫᩺") ^ i5) * 77;
                        i7 = ((iM2761 ^ i6) * (-14235)) ^ (-646984875);
                        i2 = 392036712;
                        i8 = iM2761 ^ i2;
                        abstractActivityC17205 = abstractActivityC17204;
                    } else {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-19339)) ^ 1064987594;
                        i4 = 338507118;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -915017385:
                case -450541761:
                    i9 = 1;
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0773.m3169("᩻ᩳ") ^ i6) * 47;
                        i7 = ((iM2761 ^ i5) * 28557) ^ 767053149;
                        i2 = -354625100;
                    } else {
                        iM2761 = (C0773.m3169("ۘۤ") ^ i5) * (-9);
                        i7 = ((iM2761 ^ i6) * (-4243)) ^ 892667847;
                        i2 = 1744062962;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -713987887:
                case 1429270141:
                    break;
                case -551524132:
                case 71116014:
                    C3448.m11248();
                    C2419.m8174();
                    break;
                case -347520516:
                case 2085083074:
                    i11 = i10 * i10;
                    i12 = s * s;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩻ۘ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-31771)) ^ 2057147601;
                        i2 = -1034024795;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۛ᩸")) * (-95);
                        i7 = ((iM2761 ^ i6) * 30463) ^ 1350309537;
                        i2 = 728966812;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -277026305:
                case 1171291784:
                    int i16 = i12 + i13;
                    if ((i16 + i16) - i11 < 0) {
                        iM2761 = (i5 - C0619.m2761("֫ܰ")) * 123;
                        i7 = ((iM2761 ^ i6) * 27635) ^ (-1809172559);
                        i2 = 1045159370;
                    } else {
                        iM2761 = (i6 - C0619.m2761("۠۫")) * (-107);
                        i7 = ((iM2761 ^ i5) * (-25137)) ^ 2059190558;
                        i2 = 1964496991;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case -174797838:
                case 73383689:
                    s = sArr[c];
                    s2 = 476;
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("ᩳܶ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-27137)) ^ (-1066093119);
                        i2 = -2048436924;
                    } else {
                        iM2761 = (C0619.m2761("ۧ᩷") ^ i6) * 25;
                        i7 = ((iM2761 ^ i5) * (-30355)) ^ 217568042;
                        i2 = -349656005;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case 83351293:
                case 846213978:
                    i14 = 56992;
                    iM2761 = (C0619.m2761("ۗۗ") + i6) * (-11);
                    i7 = ((iM2761 ^ i5) * 20325) ^ (-1494400468);
                    i2 = 209831132;
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                case 1468231725:
                case 2079049786:
                    sArr = f56034;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۛ۠") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-1957)) ^ (-1906073783);
                        i2 = 543484720;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۙ") ^ i5) * (-63);
                        i7 = ((iM2761 ^ i6) * 23715) ^ 463684230;
                        i2 = 365081569;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
                default:
                    strM9486 = C2878.m9486(sArr2, i9, 4, i14);
                    if (interfaceC9801.contains(strM9486)) {
                        iM2761 = (i6 - C0773.m3169("ۤܶ")) * (-99);
                        i7 = ((iM2761 ^ i5) * 30429) ^ 297681229;
                        i2 = -322054163;
                    } else {
                        iM2761 = C0773.m3169("ۗᩴ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-2687)) ^ (-1954372338);
                        i2 = 959718155;
                    }
                    i8 = iM2761 ^ i2;
                    abstractActivityC17205 = abstractActivityC17204;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40406(DialogInterfaceC8327 dialogInterfaceC8327) {
        synchronized (this.f56052) {
            AbstractC0116.m1230(this.f56052, dialogInterfaceC8327);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m40416() {
        int i;
        synchronized (this.f56052) {
            Iterator itM9936 = RunnableC3055.m9936(this.f56052);
            i = 0;
            while (C1826.m6317(itM9936)) {
                if (C3690.m11997((DialogInterfaceC8327) C0950.m3796(itM9936))) {
                    i++;
                }
            }
        }
        return i;
    }

    static {
        ApplicationC23172.m52091(127);
        f56034 = new short[]{3728, -8503, -8511, -8497, -8493, 4786, 25018, -20243, -20393, 19915, 17006, -18969, 6388, 4672, 4689, 4689, 4685, 4680, 4674, 4672, 4693, 4680, 4686, 4687, 4622, 4695, 4687, 4677, 4623, 4672, 4687, 4677, 4691, 4686, 4680, 4677, 4623, 4689, 4672, 4674, 4682, 4672, 4678, 4676, 4620, 4672, 4691, 4674, 4681, 4680, 4695, 4676, 4734, 4680, 4687, 4690, 4693, 4672, 4685, 4685, 4734, 4672, 4689, 4682, 4734, 4679, 4691, 4686, 4684, 4734, 4684, 4693, 4734, 4672, 4690, 4628, 4677, 4629, 4627, 4689, 4672, 4674, 4682, 4672, 4678, 4676, 4635, 4672, 4687, 4677, 4691, 4686, 4680, 4677, 4623, 4690, 4676, 4693, 4693, 4680, 4687, 4678, 4690, 4623, 4716, 4704, 4719, 4704, 4710, 4708, 4734, 4724, 4719, 4714, 4719, 4718, 4726, 4719, 4734, 4704, 4721, 4721, 4734, 4722, 4718, 4724, 4723, 4706, 4708, 4722, 4679, 4680, 4685, 4676, 4680, 4672, 4686, 4690, 8075, -23376, 19451, -31948, 8405, 24670, -18414, 27008, -7213, -7220, -7211, -7222, 7091, 31741, -27792, 26858, 5082, -2784, -2769, -2779, -2765, -2770, -2776, -2779, -2705, -2766, -2780, -2763, -2763, -2776, -2769, -2778, -2766, -2705, -2816, -2799, -2799, -2803, -2808, -2814, -2816, -2795, -2808, -2802, -2801, -2786, -2811, -2812, -2795, -2816, -2808, -2803, -2798, -2786, -2798, -2812, -2795, -2795, -2808, -2801, -2810, -2798, -2767, -2784, -2782, -2774, -2784, -2778, -2780, -2693, -2782, -2770, -2772, -2705, -2784, -2769, -2779, -2765, -2770, -2776, -2779, -2705, -2766, -2780, -2763, -2763, -2776, -2769, -2778, -2766, -2782, -2770, -2772, -2705, -2784, -2769, -2779, -2765, -2770, -2776, -2779, -2705, -2766, -2780, -2763, -2763, -2776, -2769, -2778, -2766, -2705, -2784, -2767, -2767, -2771, -2776, -2782, -2784, -2763, -2776, -2770, -2769, -2766, -2705, -2808, -2769, -2766, -2763, -2784, -2771, -2771, -2780, -2779, -2816, -2767, -2767, -2811, -2780, -2763, -2784, -2776, -2771, -2766, 630, -11544, -11544, -18505, 19230, 23699, 4739, 11076, 3377, 7905, 941, 15994, 2172, 6322, -7419, -5821, 14091, 3672, 4576, 4629, -573, -558, -560, -552, -558, -556, -554, -631, -558, -547, -553, -575, -548, -550, -553, -611, -576, -554, -569, -569, -550, -547, -556, -576, -611, -514, -526, -515, -526, -524, -522, -532, -538, -515, -520, -515, -516, -540, -515, -532, -526, -541, -541, -532, -544, -516, -538, -543, -528, -522, -544, 3788, 20372, 20380, 20370, 20366, 20380, 20371, 20377, 20367, 20370, 20372, 20377, 20435, 20372, 20371, 20361, 20376, 20371, 20361, 20435, 20380, 20382, 20361, 20372, 20370, 20371, 20435, 20395, 20404, 20408, 20394, 20380, 20365, 20365, 20369, 20372, 20382, 20380, 20361, 20372, 20370, 20371, 20434, 20363, 20371, 20377, 20435, 20380, 20371, 20377, 20367, 20370, 20372, 20377, 20435, 20365, 20380, 20382, 20374, 20380, 20378, 20376, 20432, 20380, 20367, 20382, 20373, 20372, 20363, 20376, 9732, 13383, 13414, 13408, 13420, 13425, 13397, 13418, 13414, 13428, 18585, -23917, -19064, 13410, 13421, 13415, 13425, 13420, 13418, 13415, 13357, 13428, 13418, 13415, 13412, 13414, 13431, 13357, 13395, 13420, 13427, 13430, 13427, 13396, 13418, 13421, 13415, 13420, 13428, 13351, 13395, 13420, 13427, 13430, 13427, 13383, 13414, 13408, 13420, 13425, 13397, 13418, 13414, 13428, 7329, -29213, -22222, -16809, -27078, 27364, -20608, 1101, 15439, 15424, 15434, 15452, 15425, 15431, 15434, 15360, 15431, 15424, 15450, 15435, 15424, 15450, 15360, 15439, 15437, 15450, 15431, 15425, 15424, 15360, 15480, 15463, 15467, 15481};
        f56036 = new C17930();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40403(C8147 c8147) {
        int i = 0;
        Resources.Theme theme = null;
        int iM7979 = 0;
        int i2 = 0;
        int iM79710 = 0;
        Window windowM8884 = null;
        int i3 = 648730610;
        int i4 = C1321.f4751;
        int i5 = C2287.f7432;
        int iM2761 = C0619.m2761("ᩳᩴ") ^ i4;
        int i6 = ((iM2761 ^ i5) * (-18811)) ^ (-158185199);
        int i7 = 400347948;
        while (true) {
            i3 = ((((i3 ^ i5) * (-29845)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2117291874:
                case 296802998:
                    C0862.m3503();
                    if (C20932.f66974 > 0) {
                        iM2761 = (i4 - C0773.m3169("֡ܰ")) * 57;
                        i6 = ((iM2761 ^ i5) * (-7647)) ^ 1147777919;
                        i7 = 1779639050;
                    } else {
                        iM2761 = C0619.m2761("۠۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11105) ^ (-299942532);
                        i7 = -1673397189;
                    }
                    break;
                case -2072494541:
                case 983529208:
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0773.m3169("ۢۗ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 19701) ^ (-659274260);
                        i7 = -1229980786;
                    } else {
                        iM2761 = (C0619.m2761("۟ۘ") + i5) * (-41);
                        i6 = ((iM2761 ^ i4) * 4009) ^ (-367090647);
                        i7 = 253798303;
                    }
                    break;
                case -2009303262:
                case 1235278342:
                    windowM8884.setNavigationBarColor(0);
                    break;
                case -1358548325:
                case 1902421226:
                    C0619.m2763();
                    C2288.m7767();
                    break;
                case -1320730058:
                case -843227656:
                    if (C17202.f56030) {
                        iM2761 = C0619.m2761("ᩴۚ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 31129) ^ 159882622;
                        i7 = 1838539662;
                    } else {
                        iM2761 = (C0619.m2761("ۜۙ") ^ i5) * (-105);
                        i6 = ((iM2761 ^ i4) * 19333) ^ 396624514;
                        i7 = 118499206;
                    }
                    break;
                case -1294511079:
                case -888273389:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i4 - C0773.m3169("֡ܰ")) * 57;
                        i6 = ((iM2761 ^ i5) * (-7647)) ^ 1147777919;
                        i7 = 1779639050;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۗᩴ")) * 19;
                        i6 = ((iM2761 ^ i4) * 24387) ^ 279804099;
                        i7 = -1178439981;
                    }
                    break;
                case -1039326714:
                case 400005575:
                    iM7979 = C2354.m7979(theme, i);
                    i2 = R.attr.colorBackground;
                    if (C13473.f42873 != 0) {
                        iM2761 = (i4 - C0773.m3169("֡ܰ")) * 57;
                        i6 = ((iM2761 ^ i5) * (-7647)) ^ 1147777919;
                        i7 = 1779639050;
                    } else {
                        iM2761 = C0773.m3169("ܰۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-27289)) ^ (-383080624);
                        i7 = 1950470734;
                    }
                    break;
                case -895999719:
                case 84701645:
                    C3077.m10046(c8147, iM79710);
                    C2702.m8884(this).setNavigationBarColor(iM7979);
                    break;
                case -831526276:
                case 506408585:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = (C0619.m2761("֨᩻") + i5) * 33;
                        i6 = ((iM2761 ^ i4) * 17107) ^ (-1785182195);
                        i7 = 48878530;
                    } else {
                        iM2761 = C0773.m3169("ۨۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-31557)) ^ 611833919;
                        i7 = -1677232787;
                    }
                    break;
                case -757471086:
                case 1108673905:
                    iM79710 = C2354.m7979(getTheme(), i2);
                    if (iM7979 == iM79710) {
                        iM2761 = C0773.m3169("᩸ۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-7943)) ^ (-1013063463);
                        i7 = -355993512;
                    } else {
                        iM2761 = C0773.m3169("ۤ֡") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-18319)) ^ 1852355595;
                        i7 = -2061814535;
                    }
                    break;
                case -737083287:
                case 946694583:
                    if (C1343.m4943()) {
                        iM2761 = (C0619.m2761("ۖ᩸") + i4) * 3;
                        i6 = ((iM2761 ^ i5) * (-15919)) ^ 1339019542;
                        i7 = -787708864;
                    } else {
                        iM2761 = C0773.m3169("ۢۗ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 19701) ^ (-659274260);
                        i7 = -1229980786;
                    }
                    break;
                case -539330241:
                case 583134679:
                    if (C1080.m4050()) {
                        iM2761 = (C0773.m3169("ܿܺ") + i5) * 127;
                        i6 = ((iM2761 ^ i4) * 31709) ^ 1748473886;
                        i7 = -1845149035;
                    } else {
                        iM2761 = C0619.m2761("۠۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11105) ^ (-299942532);
                        i7 = -1673397189;
                    }
                    break;
                case -437520481:
                case -103488882:
                    theme = getTheme();
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۢۗ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 19701) ^ (-659274260);
                        i7 = -1229980786;
                    } else {
                        iM2761 = (i5 - C0619.m2761("᩻ۢ")) * 57;
                        i6 = ((iM2761 ^ i4) * (-24663)) ^ 569198960;
                        i7 = -1822525067;
                    }
                    break;
                case 497321477:
                case 1932844369:
                    i = R.attr.navigationBarColor;
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("ۜۙ") ^ i5) * (-105);
                        i6 = ((iM2761 ^ i4) * 19333) ^ 396624514;
                        i7 = 118499206;
                    } else {
                        iM2761 = C0619.m2761("ܿ֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * 10455) ^ (-923156580);
                        i7 = 1131663021;
                    }
                    break;
                case 918075826:
                case 1680762029:
                    C17202.m40372();
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("֨᩻") + i5) * 33;
                        i6 = ((iM2761 ^ i4) * 17107) ^ (-1785182195);
                        i7 = 48878530;
                    } else {
                        iM2761 = (C0619.m2761("ۜۙ") ^ i5) * (-105);
                        i6 = ((iM2761 ^ i4) * 19333) ^ 396624514;
                        i7 = 118499206;
                    }
                    break;
                case 987365195:
                case 1864056814:
                    C2354.m7983();
                    C3448.m11248();
                    iM2761 = (C0619.m2761("ۜۙ") ^ i5) * (-105);
                    i6 = ((iM2761 ^ i4) * 19333) ^ 396624514;
                    i7 = 118499206;
                    break;
                case 1281105020:
                case 1620887904:
                    C2966.m9662(c8147, iM7979);
                    windowM8884 = C2702.m8884(this);
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("۠۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11105) ^ (-299942532);
                        i7 = -1673397189;
                    } else {
                        iM2761 = C0773.m3169("᩵۠") ^ i5;
                        i6 = ((iM2761 ^ i4) * 23217) ^ (-877421939);
                        i7 = 136892960;
                    }
                    break;
                default:
                    C3690.m11987();
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("۠۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * 11105) ^ (-299942532);
                        i7 = -1673397189;
                    } else {
                        iM2761 = (C0619.m2761("ۜۙ") ^ i5) * (-105);
                        i6 = ((iM2761 ^ i4) * 19333) ^ 396624514;
                        i7 = 118499206;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C13275 mo108(C3977 c3977) {
        return c3977.m12817(7);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x023e A[PHI: r14 r18 r19 r20 r21
      0x023e: PHI (r14v4 char) = (r14v1 char), (r14v2 char), (r14v1 char), (r14v1 char), (r14v1 char) binds: [B:55:0x0223, B:31:0x00fa, B:28:0x00d3, B:26:0x00b8, B:59:0x023c] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r18v44 int) = (r18v17 int), (r18v28 int), (r18v29 int), (r18v31 int), (r18v46 int) binds: [B:55:0x0223, B:31:0x00fa, B:28:0x00d3, B:26:0x00b8, B:59:0x023c] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r19v3 int) = (r19v1 int), (r19v1 int), (r19v1 int), (r19v1 int), (r19v5 int) binds: [B:55:0x0223, B:31:0x00fa, B:28:0x00d3, B:26:0x00b8, B:59:0x023c] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r20v38 char) = (r20v13 char), (r20v24 char), (r20v25 char), (r20v26 char), (r20v40 char) binds: [B:55:0x0223, B:31:0x00fa, B:28:0x00d3, B:26:0x00b8, B:59:0x023c] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r21v36 char) = (r21v11 char), (r21v22 char), (r21v23 char), (r21v24 char), (r21v37 char) binds: [B:55:0x0223, B:31:0x00fa, B:28:0x00d3, B:26:0x00b8, B:59:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x031c A[PHI: r18 r20 r21
      0x031c: PHI (r18v15 int) = (r18v10 int), (r18v12 int), (r18v16 int) binds: [B:82:0x031a, B:74:0x02d7, B:62:0x025b] A[DONT_GENERATE, DONT_INLINE]
      0x031c: PHI (r20v11 char) = (r20v6 char), (r20v8 char), (r20v12 char) binds: [B:82:0x031a, B:74:0x02d7, B:62:0x025b] A[DONT_GENERATE, DONT_INLINE]
      0x031c: PHI (r21v9 char) = (r21v4 char), (r21v6 char), (r21v10 char) binds: [B:82:0x031a, B:74:0x02d7, B:62:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x038a A[PHI: r18 r20 r21
      0x038a: PHI (r18v36 int) = (r18v8 int), (r18v11 int), (r18v37 int) binds: [B:90:0x0388, B:78:0x02f9, B:15:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r20v31 char) = (r20v4 char), (r20v7 char), (r20v32 char) binds: [B:90:0x0388, B:78:0x02f9, B:15:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x038a: PHI (r21v29 char) = (r21v2 char), (r21v5 char), (r21v30 char) binds: [B:90:0x0388, B:78:0x02f9, B:15:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x03f3 A[PHI: r18 r20 r21
      0x03f3: PHI (r18v39 int) = (r18v6 int), (r18v14 int), (r18v40 int) binds: [B:98:0x03f1, B:66:0x027e, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x03f3: PHI (r20v34 char) = (r20v2 char), (r20v10 char), (r20v35 char) binds: [B:98:0x03f1, B:66:0x027e, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x03f3: PHI (r21v32 char) = (r21v0 char), (r21v8 char), (r21v33 char) binds: [B:98:0x03f1, B:66:0x027e, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (l.C1343.f4799 == 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m40385(android.view.View r23, android.view.View r24, int[] r25, int[] r26, l.C13275 r27, int r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC17204.m40385(android.view.View, android.view.View, int[], int[], l.۫ᩳ, int, boolean):void");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18893 m40417() {
        C18893 c18893;
        C18893 c18894 = null;
        int i = -978751220;
        int i2 = C4282.f15546;
        int i3 = C0773.f2792;
        int iM2761 = (C0619.m2761("ۖ۫") ^ i3) * (-37);
        int i4 = ((iM2761 ^ i2) * 22899) ^ (-658794290);
        int i5 = 902961669;
        while (true) {
            i = ((((i ^ i2) * (-363)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1924721637:
                case 1804031345:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("ۜۛ") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * 5651) ^ (-1200680461);
                        i5 = 1953994130;
                    } else {
                        iM2761 = C0619.m2761("֫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28707)) ^ 1240587407;
                        i5 = -58192137;
                    }
                    break;
                case -1410176609:
                case 520285268:
                    RunnableC3646.m11813();
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0619.m2761("֫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28707)) ^ 1240587407;
                        i5 = -58192137;
                    } else {
                        iM2761 = (C0773.m3169("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i2) * 10605) ^ 1570277002;
                        i5 = 521221660;
                    }
                    break;
                case -1231351859:
                case 364146672:
                    return c18894;
                case -839467976:
                case -306194891:
                    Window windowM8884 = C2702.m8884(this);
                    if (!C0619.f2439) {
                        if (!C2878.f9462) {
                            if (C2702.f8586 <= 0) {
                                iM2761 = C0619.m2761("֡۠") ^ i3;
                                i4 = ((iM2761 ^ i2) * 25591) ^ 1279731662;
                                i5 = -647191447;
                            } else {
                                if (C1564.f5401 > 0) {
                                    if (C2287.f7432 >= 0) {
                                        iM2761 = (C0773.m3169("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                        i4 = ((iM2761 ^ i2) * 10605) ^ 1570277002;
                                        i5 = 521221660;
                                    } else if (C2288.f7433 > 0 && C3998.f13671 == 0) {
                                        if (C2375.f7641 > 0) {
                                            if (C1519.f5300 < 0) {
                                                Window windowM7763 = C2288.m7763(this);
                                                if (C0862.f3233 == 0) {
                                                    c18893 = new C18893(windowM8884, windowM7763.getDecorView());
                                                    this.f56045 = c18893;
                                                    c18894 = c18893;
                                                    iM2761 = C0773.m3169("ܽۡ") ^ i2;
                                                    i4 = ((iM2761 ^ i3) * 22881) ^ 1320211909;
                                                    i5 = -1841801316;
                                                }
                                            }
                                        }
                                    }
                                }
                                iM2761 = C0773.m3169("᩸᩶") ^ i3;
                                i4 = ((iM2761 ^ i2) * (-9727)) ^ (-350290904);
                                i5 = 421159718;
                            }
                            break;
                        }
                        iM2761 = (C0773.m3169("ۜۛ") + i2) * (-5);
                        i4 = ((iM2761 ^ i3) * 5651) ^ (-1200680461);
                        i5 = 1953994130;
                        break;
                    }
                    iM2761 = C0619.m2761("֫ᩳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-28707)) ^ 1240587407;
                    i5 = -58192137;
                    break;
                case -668238902:
                case -294861951:
                    C1146.m4231();
                    C2288.m7767();
                    iM2761 = (C0773.m3169("ۖᩴ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM2761 ^ i2) * 10605) ^ 1570277002;
                    i5 = 521221660;
                    break;
                case -274444237:
                case 20137421:
                    C2966.m9664();
                    C2966.m9664();
                    return null;
                case 1019178638:
                case 1198336786:
                    if (C1080.f3865 < 0) {
                        iM2761 = C0619.m2761("֡۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25591) ^ 1279731662;
                        i5 = -647191447;
                    } else {
                        iM2761 = C0619.m2761("֫ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28707)) ^ 1240587407;
                        i5 = -58192137;
                    }
                    break;
                default:
                    c18893 = this.f56045;
                    if (c18893 == null) {
                        iM2761 = (C0773.m3169("ۨܳ") + i3) * (-23);
                        i4 = ((iM2761 ^ i2) * 3763) ^ 1944591550;
                        i5 = 1578144033;
                    } else {
                        c18894 = c18893;
                        iM2761 = C0773.m3169("ܽۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 22881) ^ 1320211909;
                        i5 = -1841801316;
                    }
                    break;
            }
        }
    }
}
