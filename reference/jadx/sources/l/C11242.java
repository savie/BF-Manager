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

/* JADX INFO: renamed from: l.ۧ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11242 extends EnumC15717 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final int f35504 = 24;

    public /* synthetic */ C11242() {
        this("InBody", 6);
    }

    public C11242(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        switch (C22431.f72630[abstractC0802.f2843.ordinal()]) {
            case 1:
                c4310.m13752((C14225) abstractC0802);
                return true;
            case 2:
                c4310.m13755(this);
                return false;
            case 3:
                return m28469(abstractC0802, c4310);
            case 4:
                return m28468(abstractC0802, c4310);
            case 5:
                C3785 c3785 = (C3785) abstractC0802;
                if (c3785.m12293().equals(EnumC15717.f51068)) {
                    c4310.m13755(this);
                    return false;
                }
                if (c4310.m13741() && EnumC15717.m37586(c3785)) {
                    c4310.m13799();
                    c4310.m13750(c3785);
                    return true;
                }
                c4310.m13799();
                c4310.m13750(c3785);
                c4310.m13757(false);
                return true;
            case 6:
                if (c4310.m13739() <= 0) {
                    return true;
                }
                EnumC15717 enumC15717 = EnumC15717.f51062;
                c4310.f24102 = abstractC0802;
                return enumC15717.mo2666(abstractC0802, c4310);
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:402:0x0642  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m28469(AbstractC0802 abstractC0802, C4310 c4310) {
        C15496 c15496M13772;
        C11767 c11767M13767;
        C10363 c10363;
        abstractC0802.getClass();
        C7514 c7514 = (C7514) abstractC0802;
        String str = c7514.f60787;
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
                    b = cb.f82047l;
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
        String[] strArr = C17209.f56102;
        String[] strArr2 = C4310.f15615;
        switch (b) {
            case 0:
                c4310.m13755(this);
                ArrayList arrayList = c4310.f24093;
                if (arrayList.size() == 1) {
                    return false;
                }
                if ((arrayList.size() > 2 && !((C15496) arrayList.get(1)).m37100().equals("body")) || !c4310.m13741()) {
                    return false;
                }
                C15496 c15496 = (C15496) arrayList.get(1);
                if (c15496.mo37068() != null) {
                    c15496.m41532();
                }
                while (arrayList.size() > 1) {
                    C2764.m9138(arrayList, 1);
                }
                c4310.m13746(c7514);
                c4310.m13765(EnumC15717.f51054);
                return true;
            case 1:
                if (c4310.m13762("button")) {
                    c4310.m13755(this);
                    c4310.m20066("button");
                    c4310.mo13758((AbstractC0802) c7514);
                    return true;
                }
                c4310.m13799();
                c4310.m13746(c7514);
                c4310.m13757(false);
                return true;
            case 2:
                c4310.m13757(false);
                EnumC15717.m37583(c7514, c4310);
                return true;
            case 3:
            case 15:
            case 31:
            case 34:
            case 36:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                c4310.m13799();
                c4310.m13790(c7514);
                c4310.m13757(false);
                return true;
            case 4:
            case 9:
                if (c4310.m20063("option")) {
                    c4310.m20066("option");
                }
                c4310.m13799();
                c4310.m13746(c7514);
                return true;
            case 5:
                c4310.m13746(c7514);
                if (c7514.f60788) {
                    return true;
                }
                c4310.f24104.m22269(EnumC8806.f28710);
                c4310.m13798();
                c4310.m13757(false);
                c4310.m13765(EnumC15717.f51067);
                return true;
            case 6:
                c4310.m13799();
                c4310.m13746(c7514);
                c4310.m13757(false);
                if (!c7514.f60788) {
                    EnumC15717 enumC15717M13784 = c4310.m13784();
                    if (enumC15717M13784.equals(EnumC15717.f51063) || enumC15717M13784.equals(EnumC15717.f51058) || enumC15717M13784.equals(EnumC15717.f51055) || enumC15717M13784.equals(EnumC15717.f51074) || enumC15717M13784.equals(EnumC15717.f51056)) {
                        c4310.m13765(EnumC15717.f51066);
                        return true;
                    }
                    c4310.m13765(EnumC15717.f51071);
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
                c4310.m13799();
                c4310.m13761(c4310.m13746(c7514));
                return true;
            case 10:
                if (c4310.m13775(am.av) != null) {
                    c4310.m13755(this);
                    c4310.m20066(am.av);
                    C15496 c15496M13773 = c4310.m13772(am.av);
                    if (c15496M13773 != null) {
                        c4310.m13740(c15496M13773);
                        c4310.m13768(c15496M13773);
                    }
                }
                c4310.m13799();
                c4310.m13761(c4310.m13746(c7514));
                return true;
            case 16:
            case 17:
                c4310.m13757(false);
                ArrayList arrayList2 = c4310.f24093;
                int size = arrayList2.size();
                int i = size - 1;
                int i2 = i >= 24 ? size - 25 : 0;
                while (i >= i2) {
                    C15496 c15497 = (C15496) arrayList2.get(i);
                    if (C0669.m2903(c15497.m37100(), C17209.f56080)) {
                        c4310.m20066(c15497.m37100());
                    } else if (!C0669.m2903(c15497.m37100(), strArr2) || C0669.m2903(c15497.m37100(), strArr)) {
                        i--;
                    }
                    if (c4310.m13762(am.ax)) {
                        c4310.m20066(am.ax);
                    }
                    c4310.m13746(c7514);
                    return true;
                }
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13746(c7514);
                return true;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                if (C0669.m2903(c4310.m20060().m37100(), C17209.f56098)) {
                    c4310.m13755(this);
                    c4310.m13770();
                }
                c4310.m13746(c7514);
                return true;
            case 25:
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13790(c7514);
                c4310.m13757(false);
                return true;
            case 26:
                c4310.m13757(false);
                ArrayList arrayList3 = c4310.f24093;
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 > 0) {
                        C15496 c15498 = (C15496) arrayList3.get(size2);
                        if (c15498.m37100().equals("li")) {
                            c4310.m20066("li");
                        } else if (!C0669.m2903(c15498.m37100(), strArr2) || C0669.m2903(c15498.m37100(), strArr)) {
                        }
                    }
                }
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13746(c7514);
                return true;
            case 27:
            case 28:
                if (c4310.m13769("ruby")) {
                    c4310.m13794(false);
                    if (!c4310.m20063("ruby")) {
                        c4310.m13755(this);
                        int size3 = c4310.f24093.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0 && !((C15496) c4310.f24093.get(size3)).m37100().equals("ruby")) {
                                c4310.f24093.remove(size3);
                            }
                        }
                    }
                    c4310.m13746(c7514);
                    return true;
                }
                return true;
            case 32:
            case 50:
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13746(c7514);
                c4310.f24099.m54687("\n");
                c4310.m13757(false);
                return true;
            case 33:
                c4310.m13799();
                c4310.m13746(c7514);
                return true;
            case 35:
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13799();
                c4310.m13757(false);
                EnumC15717.m37583(c7514, c4310);
                return true;
            case 37:
                c4310.m13755(this);
                ArrayList arrayList4 = c4310.f24093;
                if (arrayList4.size() == 1) {
                    return false;
                }
                if ((arrayList4.size() > 2 && !((C15496) arrayList4.get(1)).m37100().equals("body")) || c4310.m13783("template")) {
                    return false;
                }
                c4310.m13757(false);
                if (c7514.m43492() && (c15496M13772 = c4310.m13772("body")) != null) {
                    for (C8127 c8127 : c7514.f60782) {
                        if (!c15496M13772.mo41539(c8127.getKey())) {
                            c15496M13772.mo37069().m26653(c8127);
                        }
                    }
                }
                return true;
            case 40:
                if (c4310.m13767() != null && !c4310.m13783("template")) {
                    c4310.m13755(this);
                    return false;
                }
                if (c4310.m13762(am.ax)) {
                    c4310.m13760();
                }
                c4310.m13751(c7514, true, true);
                return true;
            case 41:
                c4310.m13755(this);
                if (c4310.m13783("template")) {
                    return false;
                }
                if (c4310.f24093.size() > 0) {
                    C15496 c15499 = (C15496) c4310.f24093.get(0);
                    if (c7514.m43492()) {
                        for (C8127 c8128 : c7514.f60782) {
                            if (!c15499.mo41539(c8128.getKey())) {
                                c15499.mo37069().m26653(c8128);
                            }
                        }
                    }
                }
                return true;
            case 42:
                c4310.m13799();
                c4310.m13746(c7514);
                return true;
            case 43:
                c4310.m13799();
                if (c4310.m13769("nobr")) {
                    c4310.m13755(this);
                    c4310.m20066("nobr");
                    c4310.m13799();
                }
                c4310.m13761(c4310.m13746(c7514));
                return true;
            case 44:
                c4310.m13799();
                c4310.m13746(c7514);
                return true;
            case 46:
                if (c4310.m13772("svg") == null) {
                    c7514.m43497("img");
                    return c4310.mo13758((AbstractC0802) c7514);
                }
                c4310.m13746(c7514);
                return true;
            case 47:
                c4310.m13799();
                if (!c4310.m13790(c7514).mo41538("type").equalsIgnoreCase("hidden")) {
                    c4310.m13757(false);
                    return true;
                }
                return true;
            case 49:
                if (c4310.f24096.m15293() != EnumC14092.quirks && c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13746(c7514);
                c4310.m13757(false);
                c4310.m13765(EnumC15717.f51063);
                return true;
            case 51:
                if (c4310.m13762(am.ax)) {
                    c4310.m20066(am.ax);
                }
                c4310.m13746(c7514);
                c4310.f24104.m22269(EnumC8806.f28712);
                return true;
            case 52:
                c4310.m13755(this);
                if (c4310.m13767() != null) {
                    return false;
                }
                c4310.m20067(c.c);
                C10363 c10364 = c7514.f60782;
                if (c10364 != null && c10364.m26656("action") && (c11767M13767 = c4310.m13767()) != null && (c10363 = c7514.f60782) != null && c10363.m26656("action")) {
                    c11767M13767.mo37069().put("action", c7514.f60782.get("action"));
                }
                c4310.m20067("hr");
                c4310.m20067(AnnotatedPrivateKey.LABEL);
                C10363 c10365 = c7514.f60782;
                String str2 = (c10365 == null || !c10365.m26656("prompt")) ? "This is a searchable index. Enter search keywords: " : c7514.f60782.get("prompt");
                C3785 c3785 = new C3785();
                c3785.m12294(str2);
                c4310.mo13758((AbstractC0802) c3785);
                C10363 c10366 = new C10363();
                if (c7514.m43492()) {
                    for (C8127 c8129 : c7514.f60782) {
                        if (!C0669.m2903(c8129.getKey(), C17209.f56082)) {
                            c10366.m26653(c8129);
                        }
                    }
                }
                c10366.put("name", "isindex");
                c4310.m20064(c10366);
                c4310.m20066(AnnotatedPrivateKey.LABEL);
                c4310.m20067("hr");
                c4310.m20066(c.c);
                return true;
            case 53:
                EnumC15717.m37583(c7514, c4310);
                return true;
            default:
                if (!C6023.m17488(str)) {
                    c4310.m13746(c7514);
                    return true;
                }
                if (C0669.m2903(str, C17209.f56090)) {
                    if (c4310.m13762(am.ax)) {
                        c4310.m20066(am.ax);
                    }
                    c4310.m13746(c7514);
                    return true;
                }
                if (C0669.m2903(str, C17209.f56088)) {
                    EnumC15717 enumC15717 = EnumC15717.f51073;
                    c4310.f24102 = abstractC0802;
                    return enumC15717.mo2666(abstractC0802, c4310);
                }
                if (C0669.m2903(str, C17209.f56073)) {
                    c4310.m13799();
                    c4310.m13746(c7514);
                    c4310.m13782();
                    c4310.m13757(false);
                    return true;
                }
                if (C0669.m2903(str, C17209.f56089)) {
                    c4310.m13790(c7514);
                    return true;
                }
                if (C0669.m2903(str, C17209.f56067)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13799();
                c4310.m13746(c7514);
                return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m28468(AbstractC0802 abstractC0802, C4310 c4310) {
        abstractC0802.getClass();
        C0056 c0056 = (C0056) abstractC0802;
        String str = c0056.f60787;
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
                    b = cb.f82047l;
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
                c4310.m13749(abstractC0802, EnumC15717.f51073);
                return true;
            case 1:
                if (!c4310.m13762(str)) {
                    c4310.m13755(this);
                    c4310.m20067(str);
                    return c4310.mo13758(c0056);
                }
                c4310.m13786(str);
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                }
                c4310.m13778(str);
                return true;
            case 2:
                c4310.m13755(this);
                c4310.m20067("br");
                return false;
            case 3:
            case 4:
                if (!c4310.m13769(str)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13786(str);
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                }
                c4310.m13778(str);
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                String[] strArr = C17209.f56098;
                if (!c4310.m13759(strArr)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13786(str);
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                }
                for (int size = c4310.f24093.size() - 1; size >= 0; size--) {
                    C15496 c15496 = (C15496) c4310.f24093.get(size);
                    c4310.f24093.remove(size);
                    if (C0669.m2903(c15496.m37100(), strArr)) {
                        return true;
                    }
                }
                return true;
            case 11:
                if (!c4310.m13742(str)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13786(str);
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                }
                c4310.m13778(str);
                return true;
            case 12:
                if (!c4310.m13769("body")) {
                    c4310.m13755(this);
                    return false;
                }
                m28471(abstractC0802, c4310);
                c4310.m13765(EnumC15717.f51050);
                return true;
            case 13:
                if (c4310.m13783("template")) {
                    if (!c4310.m13769(str)) {
                        c4310.m13755(this);
                        return false;
                    }
                    c4310.m13794(false);
                    if (!c4310.m20063(str)) {
                        c4310.m13755(this);
                    }
                    c4310.m13778(str);
                    return true;
                }
                C11767 c11767M13767 = c4310.m13767();
                c4310.m13789();
                if (c11767M13767 == null || !c4310.m13769(str)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13794(false);
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                }
                c4310.m13768(c11767M13767);
                return true;
            case 14:
                if (c4310.m20066("body")) {
                    return c4310.mo13758(c0056);
                }
                return true;
            case 15:
            case 16:
                return m28471(abstractC0802, c4310);
            default:
                if (C0669.m2903(str, C17209.f56093)) {
                    return m28470(abstractC0802, c4310);
                }
                if (C0669.m2903(str, C17209.f56087)) {
                    if (!c4310.m13769(str)) {
                        c4310.m13755(this);
                        return false;
                    }
                    c4310.m13794(false);
                    if (!c4310.m20063(str)) {
                        c4310.m13755(this);
                    }
                    c4310.m13778(str);
                    return true;
                }
                if (!C0669.m2903(str, C17209.f56073)) {
                    return m28471(abstractC0802, c4310);
                }
                if (!c4310.m13769("name")) {
                    if (!c4310.m13769(str)) {
                        c4310.m13755(this);
                        return false;
                    }
                    c4310.m13794(false);
                    if (!c4310.m20063(str)) {
                        c4310.m13755(this);
                    }
                    c4310.m13778(str);
                    c4310.m13796();
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m28471(AbstractC0802 abstractC0802, C4310 c4310) {
        abstractC0802.getClass();
        String str = ((C0056) abstractC0802).f60787;
        ArrayList arrayList = c4310.f24093;
        if (c4310.m13772(str) == null) {
            c4310.m13755(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C15496 c15496 = (C15496) arrayList.get(size);
            if (!c15496.m37100().equals(str)) {
                if (C0669.m2903(c15496.m37100(), C4310.f15615)) {
                    c4310.m13755(this);
                    return false;
                }
            } else {
                c4310.m13786(str);
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                }
                c4310.m13778(str);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m28470(AbstractC0802 abstractC0802, C4310 c4310) {
        boolean z;
        C15496 c15496;
        abstractC0802.getClass();
        String str = ((C0056) abstractC0802).f60787;
        ArrayList arrayList = c4310.f24093;
        boolean z2 = false;
        int i = 0;
        while (i < 8) {
            C15496 c15496M13775 = c4310.m13775(str);
            if (c15496M13775 == null) {
                return m28471(abstractC0802, c4310);
            }
            if (!c4310.m13777(c15496M13775)) {
                c4310.m13755(this);
                c4310.m13740(c15496M13775);
                return true;
            }
            if (!c4310.m13769(c15496M13775.m37100())) {
                c4310.m13755(this);
                return z2;
            }
            if (c4310.m20060() != c15496M13775) {
                c4310.m13755(this);
            }
            int size = arrayList.size();
            int i2 = 1;
            boolean z3 = false;
            int iM13771 = -1;
            C15496 c15497 = null;
            while (true) {
                if (i2 >= size || i2 >= 64) {
                    z = true;
                    c15496 = null;
                    break;
                }
                c15496 = (C15496) arrayList.get(i2);
                if (c15496 == c15496M13775) {
                    c15497 = (C15496) arrayList.get(i2 - 1);
                    iM13771 = c4310.m13771(c15496);
                    z3 = true;
                } else if (z3) {
                    z = true;
                    if (C0669.m2903(c15496.m37100(), C4310.f15615)) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            }
            if (c15496 != null) {
                C15496 c15496M13747 = c15496;
                C15496 c15498 = c15496M13747;
                for (int i3 = 0; i3 < 3; i3++) {
                    if (c4310.m13777(c15496M13747)) {
                        c15496M13747 = c4310.m13747(c15496M13747);
                    }
                    if (c4310.m13797(c15496M13747)) {
                        if (c15496M13747 == c15496M13775) {
                            break;
                        }
                        C15496 c15499 = new C15496(c4310.m20059(c15496M13747.mo5151(), C20193.f64826), c4310.f24094, null);
                        c4310.m13754(c15496M13747, c15499);
                        ArrayList arrayList2 = c4310.f24093;
                        int iLastIndexOf = arrayList2.lastIndexOf(c15496M13747);
                        C14838.m35757(iLastIndexOf != -1);
                        arrayList2.set(iLastIndexOf, c15499);
                        if (c15498 == c15496) {
                            iM13771 = c4310.m13771(c15499) + 1;
                        }
                        if (c15498.mo37068() != null) {
                            c15498.m41532();
                        }
                        c15499.m37084(c15498);
                        c15496M13747 = c15499;
                        c15498 = c15496M13747;
                    } else {
                        c4310.m13768(c15496M13747);
                    }
                }
                if (c15497 != null) {
                    if (C0669.m2903(c15497.m37100(), C17209.f56084)) {
                        if (c15498.mo37068() != null) {
                            c15498.m41532();
                        }
                        c4310.m13756(c15498);
                    } else {
                        if (c15498.mo37068() != null) {
                            c15498.m41532();
                        }
                        c15497.m37084(c15498);
                    }
                }
                C15496 c154910 = new C15496(c15496M13775.m37077(), c4310.f24094, null);
                c154910.mo37069().m26654(c15496M13775.mo37069());
                c154910.m37071(-1, c15496.m41534());
                c15496.m37084(c154910);
                c4310.m13740(c15496M13775);
                c4310.m13753(c154910, iM13771);
                c4310.m13768(c15496M13775);
                int iLastIndexOf2 = c4310.f24093.lastIndexOf(c15496);
                C14838.m35757(iLastIndexOf2 != -1);
                c4310.f24093.add(iLastIndexOf2 + 1, c154910);
                i++;
                z2 = false;
            } else {
                c4310.m13778(c15496M13775.m37100());
                c4310.m13740(c15496M13775);
                return z;
            }
        }
        return true;
    }
}
