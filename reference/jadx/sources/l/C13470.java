package l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U8XQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7899 f42871;

    public C13470(AbstractC7899 abstractC7899) {
        this.f42871 = abstractC7899;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22179 m33132(Map map) {
        C5025 c5025M33131;
        C5025 c5025M33132;
        String str = (String) map.get("style");
        if (!TextUtils.isEmpty(str)) {
            c5025M33131 = null;
            c5025M33132 = null;
            for (C19086 c19086 : this.f42871.mo2255(str)) {
                String strM44197 = c19086.m44197();
                if ("width".equals(strM44197)) {
                    c5025M33131 = m33131(c19086.m44199());
                } else if ("height".equals(strM44197)) {
                    c5025M33132 = m33131(c19086.m44199());
                }
                if (c5025M33131 != null && c5025M33132 != null) {
                    break;
                }
            }
        } else {
            c5025M33131 = null;
            c5025M33132 = null;
        }
        if (c5025M33131 != null && c5025M33132 != null) {
            return new C22179(c5025M33131, c5025M33132);
        }
        if (c5025M33131 == null) {
            c5025M33131 = m33131((String) map.get("width"));
        }
        if (c5025M33132 == null) {
            c5025M33132 = m33131((String) map.get("height"));
        }
        if (c5025M33131 == null && c5025M33132 == null) {
            return null;
        }
        return new C22179(c5025M33131, c5025M33132);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5025 m33131(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = length - 1;
            int i2 = i;
            while (i2 > -1) {
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i2 + 1;
                    try {
                        return new C5025(i2 == i ? null : str.substring(i3, length), Float.parseFloat(str.substring(0, i3)));
                    } catch (NumberFormatException unused) {
                        break;
                    }
                }
                i2--;
            }
        }
        return null;
    }
}
