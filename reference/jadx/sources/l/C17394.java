package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46JS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17394 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40856() {
        return ApplicationC17729.f58258.getString("ais", "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40860(String str) {
        if (!str.isEmpty() && !m40858(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        ApplicationC17729.f58258.edit().putString("ais", str).apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40858(String str) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m40859(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (!m40858(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        return "-i " + C7756.m21098(str) + " ";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40855(InterfaceC24911 interfaceC24911) throws IOException {
        C11484 c11484Mo6263 = interfaceC24911.mo6263("am get-current-user", true);
        String strTrim = c11484Mo6263.m28854().trim();
        if (!c11484Mo6263.m28855()) {
            try {
                int i = Integer.parseInt(strTrim);
                if (i >= 0) {
                    return i;
                }
            } catch (NumberFormatException unused) {
            }
        }
        throw new IOException(C25272.m56409("Unable to resolve current installation user: ", strTrim));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40857(InterfaceC24911 interfaceC24911, String str, String str2) throws C4866 {
        if (str2.isEmpty()) {
            return;
        }
        StringBuilder sbM51387 = C22783.m51387("pm list packages --user ", str, " ");
        sbM51387.append(C7756.m21098(str2));
        C11484 c11484Mo6263 = interfaceC24911.mo6263(sbM51387.toString(), true);
        if (c11484Mo6263.m28855()) {
            throw new C4866(c11484Mo6263.f36124);
        }
        for (String str3 : c11484Mo6263.f36125) {
            if (str3.trim().equals("package:".concat(str2))) {
                return;
            }
        }
        throw new C4866(C21576.m49059(R.string.MT_Protector, str2));
    }
}
