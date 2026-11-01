package l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8XQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21728 f21704;

    public C6393(AbstractC21728 abstractC21728) {
        this.f21704 = abstractC21728;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20235 m17541(Map map) {
        C16002 c16002M17540;
        C16002 c16002M17541;
        String str = (String) map.get("style");
        if (!TextUtils.isEmpty(str)) {
            c16002M17540 = null;
            c16002M17541 = null;
            for (C18200 c18200 : this.f21704.mo36817(str)) {
                String strM42316 = c18200.m42316();
                if ("width".equals(strM42316)) {
                    c16002M17540 = m17540(c18200.m42318());
                } else if ("height".equals(strM42316)) {
                    c16002M17541 = m17540(c18200.m42318());
                }
                if (c16002M17540 != null && c16002M17541 != null) {
                    break;
                }
            }
        } else {
            c16002M17540 = null;
            c16002M17541 = null;
        }
        if (c16002M17540 != null && c16002M17541 != null) {
            return new C20235(c16002M17540, c16002M17541);
        }
        if (c16002M17540 == null) {
            c16002M17540 = m17540((String) map.get("width"));
        }
        if (c16002M17541 == null) {
            c16002M17541 = m17540((String) map.get("height"));
        }
        if (c16002M17540 == null && c16002M17541 == null) {
            return null;
        }
        return new C20235(c16002M17540, c16002M17541);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16002 m17540(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = length - 1;
            int i2 = i;
            while (i2 > -1) {
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i2 + 1;
                    try {
                        return new C16002(i2 == i ? null : str.substring(i3, length), Float.parseFloat(str.substring(0, i3)));
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
