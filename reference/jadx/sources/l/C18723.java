package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳ֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XB5K */
/* JADX INFO: loaded from: classes5.dex */
public final class C18723 implements InterfaceC21931 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43537(int i) {
        if (i < 8192) {
            return i == 169 || i == 174;
        }
        return i == 8252 || i == 8265 || i == 8482 || i == 8505 || (i >= 8596 && i <= 8601) || i == 8617 || i == 8618 || i == 8986 || i == 8987 || i == 9000 || i == 9096 || i == 9167 || ((i >= 9193 && i <= 9203) || ((i >= 9208 && i <= 9210) || i == 9410 || i == 9642 || i == 9643 || i == 9654 || i == 9664 || ((i >= 9723 && i <= 9726) || ((i >= 9728 && i <= 9733) || ((i >= 9735 && i <= 9746) || ((i >= 9748 && i <= 9861) || ((i >= 9872 && i <= 9989) || ((i >= 9992 && i <= 10002) || i == 10004 || i == 10006 || i == 10013 || i == 10017 || i == 10024 || i == 10035 || i == 10036 || i == 10052 || i == 10055 || i == 10060 || i == 10062 || ((i >= 10067 && i <= 10069) || i == 10071 || ((i >= 10083 && i <= 10087) || ((i >= 10133 && i <= 10135) || i == 10145 || i == 10160 || i == 10175 || i == 10548 || i == 10549 || ((i >= 11013 && i <= 11015) || i == 11035 || i == 11036 || i == 11088 || i == 11093 || i == 12336 || i == 12349 || i == 12951 || i == 12953 || ((i >= 126976 && i <= 127231) || ((i >= 127245 && i <= 127247) || i == 127279 || ((i >= 127340 && i <= 127345) || i == 127358 || i == 127359 || i == 127374 || ((i >= 127377 && i <= 127386) || ((i >= 127405 && i <= 127461) || ((i >= 127489 && i <= 127503) || i == 127514 || i == 127535 || ((i >= 127538 && i <= 127546) || ((i >= 127548 && i <= 127551) || ((i >= 127561 && i <= 127994) || ((i >= 128000 && i <= 128317) || ((i >= 128326 && i <= 128591) || ((i >= 128640 && i <= 128767) || ((i >= 128884 && i <= 128895) || ((i >= 128981 && i <= 129023) || ((i >= 129036 && i <= 129039) || ((i >= 129096 && i <= 129103) || ((i >= 129114 && i <= 129119) || ((i >= 129160 && i <= 129167) || ((i >= 129198 && i <= 129279) || ((i >= 129292 && i <= 129338) || ((i >= 129340 && i <= 129349) || ((i >= 129351 && i <= 129791) || (i >= 130048 && i <= 131069)))))))))))))))))))))))))))))))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21931
    /* JADX INFO: renamed from: ۙ */
    public Object mo6294(float f, Float f2, Float f3) {
        int iIntValue = ((Integer) f2).intValue();
        return Integer.valueOf((int) ((f * (((Integer) f3).intValue() - iIntValue)) + iIntValue));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43536(InterfaceC9772 interfaceC9772, AbstractC17734 abstractC17734) {
        int i = 0;
        AbstractC17734 abstractC17734M41527 = abstractC17734;
        while (abstractC17734M41527 != null) {
            AbstractC17734 abstractC17734M41536 = abstractC17734M41527.m41536();
            int iMo9543 = abstractC17734M41536 != null ? abstractC17734M41536.mo9543() : 0;
            AbstractC17734 abstractC17734M41541 = abstractC17734M41527.m41541();
            interfaceC9772.mo25484(abstractC17734M41527, i);
            if (abstractC17734M41536 != null && !abstractC17734M41527.m41531()) {
                if (iMo9543 == abstractC17734M41536.mo9543()) {
                    abstractC17734M41527 = abstractC17734M41536.m41527(abstractC17734M41527.m41540());
                } else if (abstractC17734M41541 == null) {
                    i--;
                    abstractC17734M41527 = abstractC17734M41536;
                } else {
                    abstractC17734M41527 = abstractC17734M41541;
                }
            }
            if (abstractC17734M41527.mo9543() > 0) {
                abstractC17734M41527 = abstractC17734M41527.m41527(0);
                i++;
            } else {
                while (abstractC17734M41527.m41541() == null && i > 0) {
                    interfaceC9772.mo25483(abstractC17734M41527, i);
                    abstractC17734M41527 = abstractC17734M41527.m41536();
                    i--;
                }
                interfaceC9772.mo25483(abstractC17734M41527, i);
                if (abstractC17734M41527 == abstractC17734) {
                    return;
                } else {
                    abstractC17734M41527 = abstractC17734M41527.m41541();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m43530() {
        return C10186.m26304(JSON.array(), "OUT_OF_MEMORY", "Not enough memory to complete this operation.", "fatal");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m43535(String str, boolean z) {
        if (str != null) {
            try {
                String strM2304 = C0470.m2304(str, MotionUtils.EASING_TYPE_PATH);
                C20015.m46048().m51885().m24268(strM2304);
                if (C14584.m35193(strM2304, new String[0]).mo2934()) {
                    return C10186.m26298(JSON.array().add(C2729.m9064(JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM2304).add("temporary", z), "mt_apk_workspace_open", "retry", "Recreate workspace from source APK")), "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
                }
            } catch (C10186 unused) {
            }
        }
        return C10186.m26304(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m43539(String str, String str2) {
        return m43531(C22121.m50076("workspaceId", str, "editSessionId", str2).add("view", "resource_table").add("typeName", "*").add("variant", "*").add("limit", 200), "RESOURCE_NOT_FOUND", "Resource not found.", "mt_apk_resource_list", "Verify resource table entries in workspace");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C10186 m43541(String str, String str2, String str3) {
        String strM13906 = C4375.m13906("axml", str3, (String) null, (String) null, (String) null, (String) null);
        return C10186.m26302("NOT_TEXT_ENTRY", "Not a text entry. This ZIP entry appears to be Android Binary XML (AXML). Use the suggested axml:<entry> locator.", "fatal", JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", C4375.m13906("axml", str3, (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read this ZIP entry as decoded AXML")), JSON.object().add("suggestedLocator", strM13906));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10186 m43538(String str, String str2, String str3) {
        return C10186.m26298(JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", C4375.m13906("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "retry", "Read this ZIP entry as hex bytes")), "NOT_TEXT_ENTRY", "Not a text entry. Use mt_apk_read_bytes to inspect raw bytes.", "fatal");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m43532(String str, String str2) {
        return m43531(C22121.m50076("workspaceId", str, "editSessionId", str2).add("prefix", "").add("limit", 200), "CLASS_NOT_FOUND", "Class not found", "mt_apk_dex_list_classes", "Verify dex classes in workspace");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m43540(String str, String str2, String str3) {
        return m43534("METHOD_NOT_FOUND", "Method not found", "Verify class outline for method signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m43533(String str, String str2, String str3) {
        return m43534("FIELD_NOT_FOUND", "Field not found", "Verify class outline for field signatures", str, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m43534(String str, String str2, String str3, String str4, String str5, String str6) {
        return m43531(C22121.m50076("workspaceId", str4, "editSessionId", str5).add("locator", C4375.m13906("dex_class", (String) null, str6, (String) null, (String) null, (String) null)).add("limit", 200), str, str2, "mt_apk_dex_read_class_outline", str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m43531(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        return C10186.m26298(JSON.array().add(C2729.m9064(jSONObject, str3, "verify_workspace", str4)), str, str2, "fatal");
    }
}
