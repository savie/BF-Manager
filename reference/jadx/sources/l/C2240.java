package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2240 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13614 f8033;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1139 f8034;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22577 f8035;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C0870 f8036;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17327 f8037;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f8038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18738 f8039;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f8040;

    public C2240(C18738 c18738, C1139 c1139, String str, C17327 c17327, HashSet hashSet, C13614 c13614) {
        this.f8039 = c18738;
        this.f8035 = c18738.f60792;
        this.f8034 = c1139;
        this.f8040 = str;
        this.f8037 = c17327;
        this.f8038 = hashSet;
        this.f8033 = c13614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6883(InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609) {
        String str;
        String str2;
        String str3;
        C6474 c6474M6881;
        String strM47741 = C21291.m47741(interfaceC12783);
        boolean zM50270 = C22703.m50270(interfaceC3609);
        C6474 c6474M6882 = null;
        HashSet hashSet = this.f8038;
        C18738 c18738 = this.f8039;
        String str4 = this.f8040;
        if (zM50270) {
            C13531 c13531M50284 = C22703.m50284(c18738, interfaceC3609.getValue(0), null, null, strM47741, 0, 0, hashSet, null, null);
            String str5 = c13531M50284.f44683;
            String str6 = c13531M50284.f44684;
            if (!"resource_table_file_path".equals(str4)) {
                C6474 c6474M6883 = "file_path".equals(str6) ? m6881(str5, "file_path", null) : null;
                if (c6474M6883 == null && c13531M50284.f44672) {
                    c6474M6883 = m6881(str5, "styledText", null);
                }
                c6474M6882 = c6474M6883;
                if (c6474M6882 == null) {
                    c6474M6882 = m6881(str5, b.d, null);
                }
            } else if ("file_path".equals(str6)) {
                c6474M6882 = m6881(str5, "file_path", null);
            }
            return m6882(c13531M50284, c6474M6882);
        }
        ArrayList arrayList = new ArrayList();
        int iMo7647 = interfaceC3609.mo7647();
        C13531 c13531 = c13531;
        String str7 = "file_path";
        String str8 = "resource_table_file_path";
        String str9 = str4;
        String str10 = "styledText";
        String str11 = b.d;
        C13531 c13532 = new C13531(null, null, strM47741, "item_list", false, false, null, null, null, null, null, arrayList, false, iMo7647, null);
        for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
            C19444 c19444M50308 = C22703.m50308(this.f8035, interfaceC12783, interfaceC9961.mo25193());
            C13531 c13531M50285 = C22703.m50284(c18738, interfaceC9961, c19444M50308.f62608, c19444M50308.f62609, strM47741, 0, 0, hashSet, null, null);
            String str12 = c13531M50285.f44683;
            String str13 = c13531M50285.f44684;
            String str14 = str8;
            String str15 = str9;
            if (!str14.equals(str15)) {
                str = str7;
                C6474 c6474M6884 = str.equals(str13) ? m6881(str12, str, c13531M50285) : null;
                if (c6474M6884 == null && c13531M50285.f44672) {
                    str2 = str10;
                    c6474M6884 = m6881(str12, str2, c13531M50285);
                } else {
                    str2 = str10;
                }
                if (c6474M6884 == null) {
                    str3 = str11;
                    c6474M6881 = m6881(str12, str3, c13531M50285);
                } else {
                    str3 = str11;
                    c6474M6881 = c6474M6884;
                }
            } else {
                str = str7;
                c6474M6881 = str.equals(str13) ? m6881(str12, str, c13531M50285) : null;
                str2 = str10;
                str3 = str11;
            }
            if (m6882(c13531, c6474M6881)) {
                return true;
            }
            c13531 = c13531;
            str9 = str15;
            str8 = str14;
            str7 = str;
            str10 = str2;
            str11 = str3;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6474 m6881(String str, String str2, C13531 c13531) {
        C4440 c4440M33293;
        if (str == null || str.isEmpty() || (c4440M33293 = this.f8033.m33293(str, "resource_table_value")) == null) {
            return null;
        }
        return new C6474(str, c4440M33293, str2, c13531);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m6882(C13531 c13531, C6474 c6474) {
        String strReplace;
        C4440 c4440;
        int i;
        if (c6474 == null) {
            return false;
        }
        String str = c6474.f21850;
        C4440 c4441 = c6474.f21851;
        int i2 = c4441.f15806;
        String str2 = c6474.f21848;
        C1139 c1139 = this.f8034;
        if (!c1139.f5117 || (i = c1139.f5129) <= 0 || i2 < 0) {
            strReplace = null;
        } else {
            int iMin = Math.min(i, 300);
            strReplace = C7521.m20035(C7521.m20043(i2, -Math.max(0, iMin / 3), str2), str2.length(), iMin, str2).replace('\n', ' ');
        }
        C11414 c11414M28519 = C11414.m28519(c13531, c6474.f21849, str, strReplace);
        if (c1139.f5131) {
            c4441.m12388();
            c4440 = c4441;
        } else {
            c4440 = null;
        }
        this.f8036 = new C0870("resource", this.f8040, str, c4440, null, this.f8037, c11414M28519, null, null, null);
        return true;
    }
}
