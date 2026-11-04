package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ܽ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QAWL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17873 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m41727(String str) {
        C15243.m36590(str, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
        if (!str.startsWith("#")) {
            throw new IllegalArgumentException("Invalid color value ".concat(str).toString());
        }
        int length = str.length();
        if (length == 4) {
            String strSubstring = str.substring(1);
            C15243.m36591(strSubstring, "substring(...)");
            int iM12023 = C3703.m12023(strSubstring);
            return ((iM12023 & 15) * 17) | (((iM12023 >> 8) & 15) * 1114112) | (((iM12023 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 5) {
            String strSubstring2 = str.substring(1);
            C15243.m36591(strSubstring2, "substring(...)");
            int iM12024 = C3703.m12023(strSubstring2);
            return ((iM12024 & 15) * 17) | (((iM12024 >> 12) & 15) * 285212672) | (((iM12024 >> 8) & 15) * 1114112) | (((iM12024 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 7) {
            String strSubstring3 = str.substring(1);
            C15243.m36591(strSubstring3, "substring(...)");
            return C3703.m12023(strSubstring3) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        String strSubstring4 = str.substring(1);
        C15243.m36591(strSubstring4, "substring(...)");
        return C3703.m12023(strSubstring4);
    }
}
