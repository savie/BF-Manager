package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2863 f40002;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f40003;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13192 f40004;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20871 f40005;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f40006;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23131 f40007;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1304 f40008;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10671 f40009;

    public C12446(C1304 c1304, C10671 c10671, String str, C13192 c13192, HashSet hashSet, C20871 c20871) {
        this.f40008 = c1304;
        this.f40002 = c1304.f4689;
        this.f40009 = c10671;
        this.f40006 = str;
        this.f40004 = c13192;
        this.f40003 = hashSet;
        this.f40005 = c20871;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30915(InterfaceC2731 interfaceC2731, InterfaceC8697 interfaceC8697) {
        String str;
        String str2;
        String str3;
        C0514 c0514M30913;
        String strM26337 = C10208.m26337(interfaceC2731);
        boolean zM21747 = C7972.m21747(interfaceC8697);
        C0514 c0514M30914 = null;
        HashSet hashSet = this.f40003;
        C1304 c1304 = this.f40008;
        String str4 = this.f40006;
        if (zM21747) {
            C3497 c3497M21721 = C7972.m21721(c1304, interfaceC8697.getValue(0), null, null, strM26337, 0, 0, hashSet, null, null);
            String str5 = c3497M21721.f12061;
            String str6 = c3497M21721.f12068;
            if (!"resource_table_file_path".equals(str4)) {
                C0514 c0514M30915 = "file_path".equals(str6) ? m30913(str5, "file_path", null) : null;
                if (c0514M30915 == null && c3497M21721.f12051) {
                    c0514M30915 = m30913(str5, "styledText", null);
                }
                c0514M30914 = c0514M30915;
                if (c0514M30914 == null) {
                    c0514M30914 = m30913(str5, b.d, null);
                }
            } else if ("file_path".equals(str6)) {
                c0514M30914 = m30913(str5, "file_path", null);
            }
            return m30914(c3497M21721, c0514M30914);
        }
        ArrayList arrayList = new ArrayList();
        int iMo18154 = interfaceC8697.mo18154();
        C3497 c3497 = c3497;
        String str7 = "file_path";
        String str8 = "resource_table_file_path";
        String str9 = str4;
        String str10 = "styledText";
        String str11 = b.d;
        C3497 c3498 = new C3497(null, null, strM26337, "item_list", false, false, null, null, null, null, null, arrayList, false, iMo18154, null);
        for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
            C2795 c2795M21743 = C7972.m21743(this.f40002, interfaceC2731, interfaceC5650.mo16637());
            C3497 c3497M21722 = C7972.m21721(c1304, interfaceC5650, c2795M21743.f9199, c2795M21743.f9200, strM26337, 0, 0, hashSet, null, null);
            String str12 = c3497M21722.f12061;
            String str13 = c3497M21722.f12068;
            String str14 = str8;
            String str15 = str9;
            if (!str14.equals(str15)) {
                str = str7;
                C0514 c0514M30916 = str.equals(str13) ? m30913(str12, str, c3497M21722) : null;
                if (c0514M30916 == null && c3497M21722.f12051) {
                    str2 = str10;
                    c0514M30916 = m30913(str12, str2, c3497M21722);
                } else {
                    str2 = str10;
                }
                if (c0514M30916 == null) {
                    str3 = str11;
                    c0514M30913 = m30913(str12, str3, c3497M21722);
                } else {
                    str3 = str11;
                    c0514M30913 = c0514M30916;
                }
            } else {
                str = str7;
                c0514M30913 = str.equals(str13) ? m30913(str12, str, c3497M21722) : null;
                str2 = str10;
                str3 = str11;
            }
            if (m30914(c3497, c0514M30913)) {
                return true;
            }
            c3497 = c3497;
            str9 = str15;
            str8 = str14;
            str7 = str;
            str10 = str2;
            str11 = str3;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0514 m30913(String str, String str2, C3497 c3497) {
        C3717 c3717M47696;
        if (str == null || str.isEmpty() || (c3717M47696 = this.f40005.m47696(str, "resource_table_value")) == null) {
            return null;
        }
        return new C0514(str, c3717M47696, str2, c3497);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30914(C3497 c3497, C0514 c0514) {
        String strReplace;
        C3717 c3717;
        int i;
        if (c0514 == null) {
            return false;
        }
        String str = c0514.f2202;
        C3717 c3718 = c0514.f2203;
        int i2 = c3718.f12778;
        String str2 = c0514.f2204;
        C10671 c10671 = this.f40009;
        if (!c10671.f33864 || (i = c10671.f33872) <= 0 || i2 < 0) {
            strReplace = null;
        } else {
            int iMin = Math.min(i, 300);
            strReplace = C1173.m4316(C1173.m4324(i2, -Math.max(0, iMin / 3), str2), str2.length(), iMin, str2).replace('\n', ' ');
        }
        C20651 c20651M47264 = C20651.m47264(c3497, c0514.f2201, str, strReplace);
        if (c10671.f33865) {
            c3718.m12102();
            c3717 = c3718;
        } else {
            c3717 = null;
        }
        this.f40007 = new C23131("resource", this.f40006, str, c3717, null, this.f40004, c20651M47264, null, null, null);
        return true;
    }
}
