package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ᩴ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: QAWL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18415 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m42699(String str) {
        C13465.m32966(str, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
        if (!str.startsWith("#")) {
            throw new IllegalArgumentException("Invalid color value ".concat(str).toString());
        }
        int length = str.length();
        if (length == 4) {
            String strSubstring = str.substring(1);
            C13465.m32967(strSubstring, "substring(...)");
            int iM22292 = C8538.m22292(strSubstring);
            return ((iM22292 & 15) * 17) | (((iM22292 >> 8) & 15) * 1114112) | (((iM22292 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 5) {
            String strSubstring2 = str.substring(1);
            C13465.m32967(strSubstring2, "substring(...)");
            int iM22293 = C8538.m22292(strSubstring2);
            return ((iM22293 & 15) * 17) | (((iM22293 >> 12) & 15) * 285212672) | (((iM22293 >> 8) & 15) * 1114112) | (((iM22293 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 7) {
            String strSubstring3 = str.substring(1);
            C13465.m32967(strSubstring3, "substring(...)");
            return C8538.m22292(strSubstring3) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        String strSubstring4 = str.substring(1);
        C13465.m32967(strSubstring4, "substring(...)");
        return C8538.m22292(strSubstring4);
    }
}
