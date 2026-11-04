package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: RAQH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5002 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0884 f17368 = new C0884(1000);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f17369;

    static {
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("encoding");
        f17369 = abstractC22044M49876;
        if (abstractC22044M49876.mo2934()) {
            try {
                C20348 c20348M46740 = C20348.m46740(abstractC22044M49876.m49865());
                int iM46749 = c20348M46740.m46749();
                for (int i = 0; i < iM46749; i++) {
                    f17368.m3589(c20348M46740.m46758(), c20348M46740.m46758());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15230(String str, String str2) {
        C0884 c0884 = f17368;
        c0884.m3589(str, str2);
        C6178 c6178 = new C6178();
        LinkedHashMap linkedHashMapM3590 = c0884.m3590();
        c6178.mo17812(linkedHashMapM3590.size());
        for (Map.Entry entry : linkedHashMapM3590.entrySet()) {
            c6178.m17800((String) entry.getKey());
            c6178.m17800((String) entry.getValue());
        }
        AbstractC22044 abstractC22044 = f17369;
        synchronized (abstractC22044) {
            try {
                abstractC22044.m49849(c6178.m17792());
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15228(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        MessageDigest messageDigestM36174 = C15022.m36174();
        messageDigestM36174.update(bArr, 0, i);
        return (String) f17368.m3588(C15022.m36182(messageDigestM36174.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15229(String str, int i, byte[] bArr) {
        if (i != 0) {
            MessageDigest messageDigestM36174 = C15022.m36174();
            messageDigestM36174.update(bArr, 0, i);
            m15230(C15022.m36182(messageDigestM36174.digest()), str);
        }
    }
}
