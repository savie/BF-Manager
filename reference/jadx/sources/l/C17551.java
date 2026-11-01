package l;

import com.alipay.sdk.m.p.a;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f55776 = {',', ';'};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f55777 = new HashMap();

    static {
        new C19669();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m40826(String str) {
        return EnumC12613.extended.m31395(str) != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40825(String str) {
        return EnumC12613.base.m31395(str) != -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40821(String str, int[] iArr) {
        String str2 = (String) f55777.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM31395 = EnumC12613.extended.m31395(str);
        if (iM31395 == -1) {
            return 0;
        }
        iArr[0] = iM31395;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40822(Appendable appendable, String str, C19669 c19669, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        char c;
        EnumC12613 enumC12613M44798 = c19669.m44798();
        CharsetEncoder charsetEncoderM44794 = c19669.m44794();
        EnumC16846 enumC16846 = c19669.f63133;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!C4145.m11785(iCodePointAt)) {
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
                        if (charsetEncoderM44794.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            m40823(appendable, enumC12613M44798, iCodePointAt);
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
                                    m40823(appendable, enumC12613M44798, iCodePointAt);
                                } else {
                                    int iOrdinal = enumC16846.ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal != 1) {
                                            zCanEncode = charsetEncoderM44794.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (!zCanEncode) {
                                        m40823(appendable, enumC12613M44798, iCodePointAt);
                                    } else {
                                        appendable.append(c);
                                    }
                                }
                            } else if (enumC12613M44798 != EnumC12613.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || enumC12613M44798 == EnumC12613.xhtml || c19669.m44793() == EnumC8380.xml) {
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
                if (charsetEncoderM44794.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m40823(appendable, enumC12613M44798, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40823(Appendable appendable, EnumC12613 enumC12613, int i) throws IOException {
        String strM31396 = enumC12613.m31396(i);
        if (!"".equals(strM31396)) {
            appendable.append('&').append(strM31396).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40824(EnumC12613 enumC12613, String str, int i) {
        int i2;
        enumC12613.f42132 = new String[i];
        enumC12613.f42135 = new int[i];
        enumC12613.f42133 = new int[i];
        enumC12613.f42134 = new String[i];
        C2424 c2424 = new C2424(new StringReader(str), str.length());
        int i3 = 0;
        while (!c2424.m7394()) {
            try {
                String strM7371 = c2424.m7371(a.h);
                c2424.m7374();
                int i4 = Integer.parseInt(c2424.m7373(f55776), 36);
                char cM7392 = c2424.m7392();
                c2424.m7374();
                if (cM7392 == ',') {
                    i2 = Integer.parseInt(c2424.m7371(';'), 36);
                    c2424.m7374();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c2424.m7371('&'), 36);
                c2424.m7374();
                enumC12613.f42132[i3] = strM7371;
                enumC12613.f42135[i3] = i4;
                enumC12613.f42133[i5] = i4;
                enumC12613.f42134[i5] = strM7371;
                if (i2 != -1) {
                    f55777.put(strM7371, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                c2424.m7388();
                throw th;
            }
        }
        if (!(i3 == i)) {
            throw new C22491("Unexpected count of entities loaded");
        }
        c2424.m7388();
    }
}
