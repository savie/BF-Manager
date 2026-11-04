package l;

import com.alipay.sdk.m.p.a;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2073 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f6898 = {',', ';'};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f6899 = new HashMap();

    static {
        new C7381();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m7151(String str) {
        return EnumC5802.extended.m16927(str) != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7150(String str) {
        return EnumC5802.base.m16927(str) != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7146(String str, int[] iArr) {
        String str2 = (String) f6899.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM16927 = EnumC5802.extended.m16927(str);
        if (iM16927 == -1) {
            return 0;
        }
        iArr[0] = iM16927;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7147(Appendable appendable, String str, C7381 c7381, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        char c;
        EnumC5802 enumC5802M20284 = c7381.m20284();
        CharsetEncoder charsetEncoderM20276 = c7381.m20276();
        EnumC13259 enumC13259 = c7381.f24297;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!C0669.m2901(iCodePointAt)) {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                    if (iCodePointAt < 65536) {
                        c = (char) iCodePointAt;
                        if (c != '\t') {
                            appendable.append(c);
                        } else {
                            appendable.append(c);
                        }
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderM20276.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            m7148(appendable, enumC5802M20284, iCodePointAt);
                        }
                    }
                } else if ((!z3 || z6) && !z7) {
                    if (z4) {
                        z5 = true;
                    } else {
                        appendable.append(' ');
                        z7 = true;
                    }
                }
            } else if (iCodePointAt < 65536) {
                c = (char) iCodePointAt;
                if (c != '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ') {
                                    m7148(appendable, enumC5802M20284, iCodePointAt);
                                } else {
                                    int iOrdinal = enumC13259.ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal != 1) {
                                            zCanEncode = charsetEncoderM20276.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (!zCanEncode) {
                                        m7148(appendable, enumC5802M20284, iCodePointAt);
                                    } else {
                                        appendable.append(c);
                                    }
                                }
                            } else if (enumC5802M20284 != EnumC5802.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || enumC5802M20284 == EnumC5802.xhtml || c7381.m20275() == EnumC8872.xml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderM20276.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m7148(appendable, enumC5802M20284, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7148(Appendable appendable, EnumC5802 enumC5802, int i) throws IOException {
        String strM16928 = enumC5802.m16928(i);
        if (!"".equals(strM16928)) {
            appendable.append('&').append(strM16928).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7149(EnumC5802 enumC5802, String str, int i) {
        int i2;
        enumC5802.f19937 = new String[i];
        enumC5802.f19938 = new int[i];
        enumC5802.f19936 = new int[i];
        enumC5802.f19935 = new String[i];
        C24448 c24448 = new C24448(new StringReader(str), str.length());
        int i3 = 0;
        while (!c24448.m54677()) {
            try {
                String strM54662 = c24448.m54662(a.h);
                c24448.m54665();
                int i4 = Integer.parseInt(c24448.m54664(f6898), 36);
                char cM54678 = c24448.m54678();
                c24448.m54665();
                if (cM54678 == ',') {
                    i2 = Integer.parseInt(c24448.m54662(';'), 36);
                    c24448.m54665();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c24448.m54662('&'), 36);
                c24448.m54665();
                enumC5802.f19937[i3] = strM54662;
                enumC5802.f19938[i3] = i4;
                enumC5802.f19936[i5] = i4;
                enumC5802.f19935[i5] = strM54662;
                if (i2 != -1) {
                    f6899.put(strM54662, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                c24448.m54684();
                throw th;
            }
        }
        if (!(i3 == i)) {
            throw new C21552("Unexpected count of entities loaded");
        }
        c24448.m54684();
    }
}
