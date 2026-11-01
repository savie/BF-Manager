package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46JS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14726 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35258(String str) {
        if (!str.isEmpty() && !m35256(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        ApplicationC0716.f2992.edit().putString("ais", str).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35256(String str) {
        if (!str.isEmpty() && str.length() < 255) {
            boolean z = true;
            boolean z2 = false;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '.') {
                    if (z) {
                        return false;
                    }
                    z = true;
                    z2 = true;
                } else {
                    if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (z || (cCharAt != '_' && (cCharAt < '0' || cCharAt > '9'))))) {
                        return false;
                    }
                    z = false;
                }
            }
            if (!z && (z2 || str.equals("android"))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m35257(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (!m35256(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        return "-i " + C6696.m18085(str) + " ";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35255(InterfaceC10890 interfaceC10890, String str, String str2) throws C4987 {
        if (str2.isEmpty()) {
            return;
        }
        StringBuilder sbM30914 = C12441.m30914("pm list packages --user ", str, " ");
        sbM30914.append(C6696.m18085(str2));
        C5950 c5950Mo2028 = interfaceC10890.mo2028(sbM30914.toString(), true);
        if (c5950Mo2028.m16221()) {
            throw new C4987(c5950Mo2028.f20238);
        }
        for (String str3 : c5950Mo2028.f20239) {
            if (str3.trim().equals("package:".concat(str2))) {
                return;
            }
        }
        throw new C4987(C16737.m39264(R.string.MT_Protector, str2));
    }
}
