package l;

import com.alipay.sdk.m.n.c;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۛۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5953 extends EnumC1719 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final int f20255 = 24;

    public /* synthetic */ C5953() {
        this("InBody", 6);
    }

    public C5953(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        switch (C15832.f51245[abstractC21516.f69910.ordinal()]) {
            case 1:
                c5247.m14471((C22222) abstractC21516);
                return true;
            case 2:
                c5247.m14466(this);
                return false;
            case 3:
                return m16231(abstractC21516, c5247);
            case 4:
                return m16232(abstractC21516, c5247);
            case 5:
                C5288 c5288 = (C5288) abstractC21516;
                if (c5288.m14653().equals(EnumC1719.f6819)) {
                    c5247.m14466(this);
                    return false;
                }
                if (c5247.m14458() && EnumC1719.m5736(c5288)) {
                    c5247.m14481();
                    c5247.m14467(c5288);
                    return true;
                }
                c5247.m14481();
                c5247.m14467(c5288);
                c5247.m14472(false);
                return true;
            case 6:
                if (c5247.m14500() <= 0) {
                    return true;
                }
                EnumC1719 enumC1719 = EnumC1719.f6806;
                c5247.f63277 = abstractC21516;
                return enumC1719.mo1923(abstractC21516, c5247);
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:402:0x0642  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m16231(AbstractC21516 abstractC21516, C5247 c5247) {
        C0617 c0617M14453;
        C6262 c6262M14478;
        C15436 c15436;
        abstractC21516.getClass();
        C6699 c6699 = (C6699) abstractC21516;
        String str = c6699.f74529;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1644953643:
                if (str.equals("frameset")) {
                    b = 0;
                }
                break;
            case -1377687758:
                if (str.equals("button")) {
                    b = 1;
                }
                break;
            case -1191214428:
                if (str.equals("iframe")) {
                    b = 2;
                }
                break;
            case -1134665583:
                if (str.equals("keygen")) {
                    b = 3;
                }
                break;
            case -1010136971:
                if (str.equals("option")) {
                    b = 4;
                }
                break;
            case -1003243718:
                if (str.equals("textarea")) {
                    b = 5;
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    b = 6;
                }
                break;
            case -891985998:
                if (str.equals("strike")) {
                    b = 7;
                }
                break;
            case -891980137:
                if (str.equals("strong")) {
                    b = 8;
                }
                break;
            case -80773204:
                if (str.equals("optgroup")) {
                    b = 9;
                }
                break;
            case 97:
                if (str.equals(am.av)) {
                    b = 10;
                }
                break;
            case 98:
                if (str.equals("b")) {
                    b = 11;
                }
                break;
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                if (str.equals(am.aC)) {
                    b = 12;
                }
                break;
            case 115:
                if (str.equals(am.aB)) {
                    b = cb.k;
                }
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                if (str.equals(am.aH)) {
                    b = cb.f77931l;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    b = 15;
                }
                break;
            case 3200:
                if (str.equals("dd")) {
                    b = 16;
                }
                break;
            case 3216:
                if (str.equals("dt")) {
                    b = 17;
                }
                break;
            case 3240:
                if (str.equals("em")) {
                    b = 18;
                }
                break;
            case 3273:
                if (str.equals("h1")) {
                    b = 19;
                }
                break;
            case 3274:
                if (str.equals("h2")) {
                    b = 20;
                }
                break;
            case 3275:
                if (str.equals("h3")) {
                    b = 21;
                }
                break;
            case 3276:
                if (str.equals("h4")) {
                    b = 22;
                }
                break;
            case 3277:
                if (str.equals("h5")) {
                    b = 23;
                }
                break;
            case 3278:
                if (str.equals("h6")) {
                    b = 24;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    b = 25;
                }
                break;
            case 3453:
                if (str.equals("li")) {
                    b = 26;
                }
                break;
            case 3646:
                if (str.equals("rp")) {
                    b = 27;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 3712:
                if (str.equals("tt")) {
                    b = 29;
                }
                break;
            case 97536:
                if (str.equals("big")) {
                    b = 30;
                }
                break;
            case 104387:
                if (str.equals("img")) {
                    b = bo.j;
                }
                break;
            case 111267:
                if (str.equals("pre")) {
                    b = UTF8.S_CS3;
                }
                break;
            case 114276:
                if (str.equals("svg")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                }
                break;
            case 117511:
                if (str.equals("wbr")) {
                    b = 34;
                }
                break;
            case 118811:
                if (str.equals("xmp")) {
                    b = 35;
                }
                break;
            case 3002509:
                if (str.equals("area")) {
                    b = 36;
                }
                break;
            case 3029410:
                if (str.equals("body")) {
                    b = 37;
                }
                break;
            case 3059181:
                if (str.equals("code")) {
                    b = 38;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b = 39;
                }
                break;
            case 3148996:
                if (str.equals(c.c)) {
                    b = 40;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    b = 41;
                }
                break;
            case 3344136:
                if (str.equals("math")) {
                    b = 42;
                }
                break;
            case 3386833:
                if (str.equals("nobr")) {
                    b = 43;
                }
                break;
            case 3536714:
                if (str.equals("span")) {
                    b = 44;
                }
                break;
            case 96620249:
                if (str.equals("embed")) {
                    b = 45;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    b = 46;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    b = 47;
                }
                break;
            case 109548807:
                if (str.equals("small")) {
                    b = UTF8.S_P3A;
                }
                break;
            case 110115790:
                if (str.equals("table")) {
                    b = 49;
                }
                break;
            case 181975684:
                if (str.equals("listing")) {
                    b = 50;
                }
                break;
            case 1973234167:
                if (str.equals("plaintext")) {
                    b = 51;
                }
                break;
            case 2091304424:
                if (str.equals("isindex")) {
                    b = 52;
                }
                break;
            case 2115613112:
                if (str.equals("noembed")) {
                    b = 53;
                }
                break;
        }
        String[] strArr = C14421.f47295;
        String[] strArr2 = C5247.f18184;
        switch (b) {
            case 0:
                c5247.m14466(this);
                ArrayList arrayList = c5247.f63271;
                if (arrayList.size() == 1) {
                    return false;
                }
                if ((arrayList.size() > 2 && !((C0617) arrayList.get(1)).m2833().equals("body")) || !c5247.m14458()) {
                    return false;
                }
                C0617 c0617 = (C0617) arrayList.get(1);
                if (c0617.mo2849() != null) {
                    c0617.m35268();
                }
                while (arrayList.size() > 1) {
                    C19028.m43762(arrayList, 1);
                }
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6803);
                return true;
            case 1:
                if (c5247.m14490("button")) {
                    c5247.m14466(this);
                    c5247.m44841("button");
                    c5247.mo14473((AbstractC21516) c6699);
                    return true;
                }
                c5247.m14481();
                c5247.m14462(c6699);
                c5247.m14472(false);
                return true;
            case 2:
                c5247.m14472(false);
                EnumC1719.m5732(c6699, c5247);
                return true;
            case 3:
            case 15:
            case 31:
            case 34:
            case 36:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                c5247.m14481();
                c5247.m14491(c6699);
                c5247.m14472(false);
                return true;
            case 4:
            case 9:
                if (c5247.m44838("option")) {
                    c5247.m44841("option");
                }
                c5247.m14481();
                c5247.m14462(c6699);
                return true;
            case 5:
                c5247.m14462(c6699);
                if (c6699.f74531) {
                    return true;
                }
                c5247.f63280.m21353(EnumC8422.f29218);
                c5247.m14503();
                c5247.m14472(false);
                c5247.m14486(EnumC1719.f6814);
                return true;
            case 6:
                c5247.m14481();
                c5247.m14462(c6699);
                c5247.m14472(false);
                if (!c6699.f74531) {
                    EnumC1719 enumC1719M14451 = c5247.m14451();
                    if (enumC1719M14451.equals(EnumC1719.f6798) || enumC1719M14451.equals(EnumC1719.f6799) || enumC1719M14451.equals(EnumC1719.f6811) || enumC1719M14451.equals(EnumC1719.f6800) || enumC1719M14451.equals(EnumC1719.f6807)) {
                        c5247.m14486(EnumC1719.f6820);
                        return true;
                    }
                    c5247.m14486(EnumC1719.f6804);
                    return true;
                }
                return true;
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 29:
            case 30:
            case 38:
            case 39:
            case 48:
                c5247.m14481();
                c5247.m14489(c5247.m14462(c6699));
                return true;
            case 10:
                if (c5247.m14509(am.av) != null) {
                    c5247.m14466(this);
                    c5247.m44841(am.av);
                    C0617 c0617M14454 = c5247.m14453(am.av);
                    if (c0617M14454 != null) {
                        c5247.m14457(c0617M14454);
                        c5247.m14479(c0617M14454);
                    }
                }
                c5247.m14481();
                c5247.m14489(c5247.m14462(c6699));
                return true;
            case 16:
            case 17:
                c5247.m14472(false);
                ArrayList arrayList2 = c5247.f63271;
                int size = arrayList2.size();
                int i = size - 1;
                int i2 = i >= 24 ? size - 25 : 0;
                while (i >= i2) {
                    C0617 c0618 = (C0617) arrayList2.get(i);
                    if (C4145.m11787(c0618.m2833(), C14421.f47277)) {
                        c5247.m44841(c0618.m2833());
                    } else if (!C4145.m11787(c0618.m2833(), strArr2) || C4145.m11787(c0618.m2833(), strArr)) {
                        i--;
                    }
                    if (c5247.m14490(am.ax)) {
                        c5247.m44841(am.ax);
                    }
                    c5247.m14462(c6699);
                    return true;
                }
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14462(c6699);
                return true;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                if (C4145.m11787(c5247.m44834().m2833(), C14421.f47262)) {
                    c5247.m14466(this);
                    c5247.m14483();
                }
                c5247.m14462(c6699);
                return true;
            case 25:
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14491(c6699);
                c5247.m14472(false);
                return true;
            case 26:
                c5247.m14472(false);
                ArrayList arrayList3 = c5247.f63271;
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 > 0) {
                        C0617 c0619 = (C0617) arrayList3.get(size2);
                        if (c0619.m2833().equals("li")) {
                            c5247.m44841("li");
                        } else if (!C4145.m11787(c0619.m2833(), strArr2) || C4145.m11787(c0619.m2833(), strArr)) {
                        }
                    }
                }
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14462(c6699);
                return true;
            case 27:
            case 28:
                if (c5247.m14480("ruby")) {
                    c5247.m14495(false);
                    if (!c5247.m44838("ruby")) {
                        c5247.m14466(this);
                        int size3 = c5247.f63271.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0 && !((C0617) c5247.f63271.get(size3)).m2833().equals("ruby")) {
                                c5247.f63271.remove(size3);
                            }
                        }
                    }
                    c5247.m14462(c6699);
                    return true;
                }
                return true;
            case 32:
            case 50:
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14462(c6699);
                c5247.f63279.m7391("\n");
                c5247.m14472(false);
                return true;
            case 33:
                c5247.m14481();
                c5247.m14462(c6699);
                return true;
            case 35:
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14481();
                c5247.m14472(false);
                EnumC1719.m5732(c6699, c5247);
                return true;
            case 37:
                c5247.m14466(this);
                ArrayList arrayList4 = c5247.f63271;
                if (arrayList4.size() == 1) {
                    return false;
                }
                if ((arrayList4.size() > 2 && !((C0617) arrayList4.get(1)).m2833().equals("body")) || c5247.m14508("template")) {
                    return false;
                }
                c5247.m14472(false);
                if (c6699.m50749() && (c0617M14453 = c5247.m14453("body")) != null) {
                    for (C6968 c6968 : c6699.f74528) {
                        if (!c0617M14453.mo28140(c6968.getKey())) {
                            c0617M14453.mo2839().m36937(c6968);
                        }
                    }
                }
                return true;
            case 40:
                if (c5247.m14478() != null && !c5247.m14508("template")) {
                    c5247.m14466(this);
                    return false;
                }
                if (c5247.m14490(am.ax)) {
                    c5247.m14488();
                }
                c5247.m14468(c6699, true, true);
                return true;
            case 41:
                c5247.m14466(this);
                if (c5247.m14508("template")) {
                    return false;
                }
                if (c5247.f63271.size() > 0) {
                    C0617 c06110 = (C0617) c5247.f63271.get(0);
                    if (c6699.m50749()) {
                        for (C6968 c6969 : c6699.f74528) {
                            if (!c06110.mo28140(c6969.getKey())) {
                                c06110.mo2839().m36937(c6969);
                            }
                        }
                    }
                }
                return true;
            case 42:
                c5247.m14481();
                c5247.m14462(c6699);
                return true;
            case 43:
                c5247.m14481();
                if (c5247.m14480("nobr")) {
                    c5247.m14466(this);
                    c5247.m44841("nobr");
                    c5247.m14481();
                }
                c5247.m14489(c5247.m14462(c6699));
                return true;
            case 44:
                c5247.m14481();
                c5247.m14462(c6699);
                return true;
            case 46:
                if (c5247.m14453("svg") == null) {
                    c6699.m50744("img");
                    return c5247.mo14473((AbstractC21516) c6699);
                }
                c5247.m14462(c6699);
                return true;
            case 47:
                c5247.m14481();
                if (!c5247.m14491(c6699).mo28144("type").equalsIgnoreCase("hidden")) {
                    c5247.m14472(false);
                    return true;
                }
                return true;
            case 49:
                if (c5247.f63275.m26642() != EnumC9086.quirks && c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14462(c6699);
                c5247.m14472(false);
                c5247.m14486(EnumC1719.f6798);
                return true;
            case 51:
                if (c5247.m14490(am.ax)) {
                    c5247.m44841(am.ax);
                }
                c5247.m14462(c6699);
                c5247.f63280.m21353(EnumC8422.f29226);
                return true;
            case 52:
                c5247.m14466(this);
                if (c5247.m14478() != null) {
                    return false;
                }
                c5247.m44833(c.c);
                C15436 c15437 = c6699.f74528;
                if (c15437 != null && c15437.m36941("action") && (c6262M14478 = c5247.m14478()) != null && (c15436 = c6699.f74528) != null && c15436.m36941("action")) {
                    c6262M14478.mo2839().put("action", c6699.f74528.get("action"));
                }
                c5247.m44833("hr");
                c5247.m44833(AnnotatedPrivateKey.LABEL);
                C15436 c15438 = c6699.f74528;
                String str2 = (c15438 == null || !c15438.m36941("prompt")) ? "This is a searchable index. Enter search keywords: " : c6699.f74528.get("prompt");
                C5288 c5288 = new C5288();
                c5288.m14654(str2);
                c5247.mo14473((AbstractC21516) c5288);
                C15436 c15439 = new C15436();
                if (c6699.m50749()) {
                    for (C6968 c69610 : c6699.f74528) {
                        if (!C4145.m11787(c69610.getKey(), C14421.f47270)) {
                            c15439.m36937(c69610);
                        }
                    }
                }
                c15439.put("name", "isindex");
                c5247.m44839(c15439);
                c5247.m44841(AnnotatedPrivateKey.LABEL);
                c5247.m44833("hr");
                c5247.m44841(c.c);
                return true;
            case 53:
                EnumC1719.m5732(c6699, c5247);
                return true;
            default:
                if (!C11639.m29047(str)) {
                    c5247.m14462(c6699);
                    return true;
                }
                if (C4145.m11787(str, C14421.f47293)) {
                    if (c5247.m14490(am.ax)) {
                        c5247.m44841(am.ax);
                    }
                    c5247.m14462(c6699);
                    return true;
                }
                if (C4145.m11787(str, C14421.f47288)) {
                    EnumC1719 enumC1719 = EnumC1719.f6812;
                    c5247.f63277 = abstractC21516;
                    return enumC1719.mo1923(abstractC21516, c5247);
                }
                if (C4145.m11787(str, C14421.f47280)) {
                    c5247.m14481();
                    c5247.m14462(c6699);
                    c5247.m14507();
                    c5247.m14472(false);
                    return true;
                }
                if (C4145.m11787(str, C14421.f47284)) {
                    c5247.m14491(c6699);
                    return true;
                }
                if (C4145.m11787(str, C14421.f47265)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14481();
                c5247.m14462(c6699);
                return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m16232(AbstractC21516 abstractC21516, C5247 c5247) {
        abstractC21516.getClass();
        C3876 c3876 = (C3876) abstractC21516;
        String str = c3876.f74529;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1321546630:
                if (str.equals("template")) {
                    b = 0;
                }
                break;
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                if (str.equals(am.ax)) {
                    b = 1;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    b = 2;
                }
                break;
            case 3200:
                if (str.equals("dd")) {
                    b = 3;
                }
                break;
            case 3216:
                if (str.equals("dt")) {
                    b = 4;
                }
                break;
            case 3273:
                if (str.equals("h1")) {
                    b = 5;
                }
                break;
            case 3274:
                if (str.equals("h2")) {
                    b = 6;
                }
                break;
            case 3275:
                if (str.equals("h3")) {
                    b = 7;
                }
                break;
            case 3276:
                if (str.equals("h4")) {
                    b = 8;
                }
                break;
            case 3277:
                if (str.equals("h5")) {
                    b = 9;
                }
                break;
            case 3278:
                if (str.equals("h6")) {
                    b = 10;
                }
                break;
            case 3453:
                if (str.equals("li")) {
                    b = 11;
                }
                break;
            case 3029410:
                if (str.equals("body")) {
                    b = 12;
                }
                break;
            case 3148996:
                if (str.equals(c.c)) {
                    b = cb.k;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    b = cb.f77931l;
                }
                break;
            case 3536714:
                if (str.equals("span")) {
                    b = 15;
                }
                break;
            case 1869063452:
                if (str.equals("sarcasm")) {
                    b = 16;
                }
                break;
        }
        switch (b) {
            case 0:
                c5247.m14470(abstractC21516, EnumC1719.f6812);
                return true;
            case 1:
                if (!c5247.m14490(str)) {
                    c5247.m14466(this);
                    c5247.m44833(str);
                    return c5247.mo14473(c3876);
                }
                c5247.m14476(str);
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                }
                c5247.m14501(str);
                return true;
            case 2:
                c5247.m14466(this);
                c5247.m44833("br");
                return false;
            case 3:
            case 4:
                if (!c5247.m14480(str)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14476(str);
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                }
                c5247.m14501(str);
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                String[] strArr = C14421.f47262;
                if (!c5247.m14474(strArr)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14476(str);
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                }
                for (int size = c5247.f63271.size() - 1; size >= 0; size--) {
                    C0617 c0617 = (C0617) c5247.f63271.get(size);
                    c5247.f63271.remove(size);
                    if (C4145.m11787(c0617.m2833(), strArr)) {
                        return true;
                    }
                }
                return true;
            case 11:
                if (!c5247.m14459(str)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14476(str);
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                }
                c5247.m14501(str);
                return true;
            case 12:
                if (!c5247.m14480("body")) {
                    c5247.m14466(this);
                    return false;
                }
                m16233(abstractC21516, c5247);
                c5247.m14486(EnumC1719.f6816);
                return true;
            case 13:
                if (c5247.m14508("template")) {
                    if (!c5247.m14480(str)) {
                        c5247.m14466(this);
                        return false;
                    }
                    c5247.m14495(false);
                    if (!c5247.m44838(str)) {
                        c5247.m14466(this);
                    }
                    c5247.m14501(str);
                    return true;
                }
                C6262 c6262M14478 = c5247.m14478();
                c5247.m14505();
                if (c6262M14478 == null || !c5247.m14480(str)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14495(false);
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                }
                c5247.m14479(c6262M14478);
                return true;
            case 14:
                if (c5247.m44841("body")) {
                    return c5247.mo14473(c3876);
                }
                return true;
            case 15:
            case 16:
                return m16233(abstractC21516, c5247);
            default:
                if (C4145.m11787(str, C14421.f47268)) {
                    return m16230(abstractC21516, c5247);
                }
                if (C4145.m11787(str, C14421.f47294)) {
                    if (!c5247.m14480(str)) {
                        c5247.m14466(this);
                        return false;
                    }
                    c5247.m14495(false);
                    if (!c5247.m44838(str)) {
                        c5247.m14466(this);
                    }
                    c5247.m14501(str);
                    return true;
                }
                if (!C4145.m11787(str, C14421.f47280)) {
                    return m16233(abstractC21516, c5247);
                }
                if (!c5247.m14480("name")) {
                    if (!c5247.m14480(str)) {
                        c5247.m14466(this);
                        return false;
                    }
                    c5247.m14495(false);
                    if (!c5247.m44838(str)) {
                        c5247.m14466(this);
                    }
                    c5247.m14501(str);
                    c5247.m14455();
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m16233(AbstractC21516 abstractC21516, C5247 c5247) {
        abstractC21516.getClass();
        String str = ((C3876) abstractC21516).f74529;
        ArrayList arrayList = c5247.f63271;
        if (c5247.m14453(str) == null) {
            c5247.m14466(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0617 c0617 = (C0617) arrayList.get(size);
            if (!c0617.m2833().equals(str)) {
                if (C4145.m11787(c0617.m2833(), C5247.f18184)) {
                    c5247.m14466(this);
                    return false;
                }
            } else {
                c5247.m14476(str);
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                }
                c5247.m14501(str);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m16230(AbstractC21516 abstractC21516, C5247 c5247) {
        boolean z;
        C0617 c0617;
        abstractC21516.getClass();
        String str = ((C3876) abstractC21516).f74529;
        ArrayList arrayList = c5247.f63271;
        boolean z2 = false;
        int i = 0;
        while (i < 8) {
            C0617 c0617M14509 = c5247.m14509(str);
            if (c0617M14509 == null) {
                return m16233(abstractC21516, c5247);
            }
            if (!c5247.m14511(c0617M14509)) {
                c5247.m14466(this);
                c5247.m14457(c0617M14509);
                return true;
            }
            if (!c5247.m14480(c0617M14509.m2833())) {
                c5247.m14466(this);
                return z2;
            }
            if (c5247.m44834() != c0617M14509) {
                c5247.m14466(this);
            }
            int size = arrayList.size();
            int i2 = 1;
            boolean z3 = false;
            int iM14452 = -1;
            C0617 c0618 = null;
            while (true) {
                if (i2 >= size || i2 >= 64) {
                    z = true;
                    c0617 = null;
                    break;
                }
                c0617 = (C0617) arrayList.get(i2);
                if (c0617 == c0617M14509) {
                    c0618 = (C0617) arrayList.get(i2 - 1);
                    iM14452 = c5247.m14452(c0617);
                    z3 = true;
                } else if (z3) {
                    z = true;
                    if (C4145.m11787(c0617.m2833(), C5247.f18184)) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            }
            if (c0617 != null) {
                C0617 c0617M14461 = c0617;
                C0617 c0619 = c0617M14461;
                for (int i3 = 0; i3 < 3; i3++) {
                    if (c5247.m14511(c0617M14461)) {
                        c0617M14461 = c5247.m14461(c0617M14461);
                    }
                    if (c5247.m14456(c0617M14461)) {
                        if (c0617M14461 == c0617M14509) {
                            break;
                        }
                        C0617 c06110 = new C0617(c5247.m44835(c0617M14461.mo2863(), C4582.f16235), c5247.f63272, null);
                        c5247.m14465(c0617M14461, c06110);
                        ArrayList arrayList2 = c5247.f63271;
                        int iLastIndexOf = arrayList2.lastIndexOf(c0617M14461);
                        C5557.m15344(iLastIndexOf != -1);
                        arrayList2.set(iLastIndexOf, c06110);
                        if (c0619 == c0617) {
                            iM14452 = c5247.m14452(c06110) + 1;
                        }
                        if (c0619.mo2849() != null) {
                            c0619.m35268();
                        }
                        c06110.m2855(c0619);
                        c0617M14461 = c06110;
                        c0619 = c0617M14461;
                    } else {
                        c5247.m14479(c0617M14461);
                    }
                }
                if (c0618 != null) {
                    if (C4145.m11787(c0618.m2833(), C14421.f47260)) {
                        if (c0619.mo2849() != null) {
                            c0619.m35268();
                        }
                        c5247.m14469(c0619);
                    } else {
                        if (c0619.mo2849() != null) {
                            c0619.m35268();
                        }
                        c0618.m2855(c0619);
                    }
                }
                C0617 c06111 = new C0617(c0617M14509.m2860(), c5247.f63272, null);
                c06111.mo2839().m36938(c0617M14509.mo2839());
                c06111.m2840(-1, c0617.m35264());
                c0617.m2855(c06111);
                c5247.m14457(c0617M14509);
                c5247.m14464(c06111, iM14452);
                c5247.m14479(c0617M14509);
                int iLastIndexOf2 = c5247.f63271.lastIndexOf(c0617);
                C5557.m15344(iLastIndexOf2 != -1);
                c5247.f63271.add(iLastIndexOf2 + 1, c06111);
                i++;
                z2 = false;
            } else {
                c5247.m14501(c0617M14509.m2833());
                c5247.m14457(c0617M14509);
                return z;
            }
        }
        return true;
    }
}
