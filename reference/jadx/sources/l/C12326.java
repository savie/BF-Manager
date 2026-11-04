package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۨۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C12326 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C12326 f39602 = new C12326(new C6129());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39603 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC9110 f39604;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30745(int i) {
        if (i == 12) {
            return "\\f";
        }
        if (i == 13) {
            return "\\r";
        }
        if (i == 34) {
            return "\\\"";
        }
        if (i == 39) {
            return "'";
        }
        if (i == 92) {
            return "\\\\";
        }
        switch (i) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12326 m30748() {
        return f39602;
    }

    public C12326(C6129 c6129) {
        this.f39604 = c6129.m17696();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30751(String str) {
        boolean z;
        int type;
        if (str.length() == 0) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            String strM30745 = m30745(iCodePointAt);
            if (strM30745 != null) {
                sb.append(strM30745);
            } else {
                if (iCodePointAt < 32) {
                    z = true;
                } else if (iCodePointAt < 127) {
                    z = false;
                } else {
                    Pattern pattern = C13534.f43004;
                    z = !(!Character.isISOControl(iCodePointAt) && (!Character.isWhitespace(iCodePointAt) ? (type = Character.getType(iCodePointAt)) == 0 || type == 15 || type == 16 || type == 18 || type == 19 : iCodePointAt != 32));
                }
                if (z) {
                    sb.append("\\u");
                    sb.append(String.format("%04x", Integer.valueOf(iCodePointAt)));
                } else {
                    sb.appendCodePoint(iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30747(boolean z, char c) {
        if (c == '\'') {
            return "'\\''";
        }
        String strM30745 = m30745((int) c);
        if (strM30745 != null) {
            return "'" + strM30745 + '\'';
        }
        Pattern pattern = C13534.f43004;
        if (' ' > c || c > '~') {
            String string = Integer.toString(c);
            return z ? C25272.m56409("(char) ", string) : string;
        }
        return "'" + c + '\'';
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m30749(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ' || cCharAt == '$') {
                sb.append('_');
            } else if (cCharAt != '*') {
                if (cCharAt == ',') {
                    sb.append('_');
                } else if (cCharAt == '[') {
                    sb.append('A');
                } else if (cCharAt != ']') {
                    if (cCharAt == '.' || cCharAt == '/' || cCharAt == ';' || cCharAt == '<') {
                        sb.append('_');
                    } else if (cCharAt != '>' && cCharAt != '?') {
                        sb.append(cCharAt);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0055, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m30746(long j, int i, boolean z) {
        String string;
        boolean z2;
        String str;
        String str2;
        if (this.f39604.m24264()) {
            String hexString = Long.toHexString(j);
            if (j < 0) {
                int length = hexString.length();
                str = "0x" + hexString.substring(length - (i * 2), length);
                z2 = true;
            } else {
                string = C25272.m56409("0x", hexString);
            }
            if (i == 8 && (j == Long.MIN_VALUE || Math.abs(j) >= 2147483647L)) {
                z2 = true;
            }
            if (z2) {
                return str;
            }
            if (i == 8) {
                return str + 'L';
            }
            StringBuilder sb = new StringBuilder();
            if (i != 1) {
                str2 = "(byte) ";
            } else if (i != 2) {
                str2 = "(short) ";
            } else if (i != 4) {
                str2 = "(int) ";
            } else {
                if (i == 8) {
                    throw new C8597(C13645.m33382(i, "Unexpected number type length: "));
                }
                str2 = "(long) ";
            }
            return C8947.m23910(sb, str2, str);
        }
        string = Long.toString(j);
        String str3 = string;
        z2 = z;
        str = str3;
        if (i == 8) {
            z2 = true;
        }
        if (z2) {
            return str;
        }
        if (i == 8) {
            return str + 'L';
        }
        StringBuilder sb2 = new StringBuilder();
        if (i != 1) {
            str2 = "(byte) ";
        } else if (i != 2) {
            str2 = "(short) ";
        } else if (i != 4) {
            str2 = "(int) ";
        } else {
            if (i == 8) {
                throw new C8597(C13645.m33382(i, "Unexpected number type length: "));
            }
            str2 = "(long) ";
        }
        return C8947.m23910(sb2, str2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30750(long j, boolean z) {
        return m30746(j, 1, z);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m30754(long j, boolean z) {
        if (this.f39604 == EnumC9110.AUTO) {
            short s = (short) j;
            if (s == Short.MIN_VALUE) {
                return "Short.MIN_VALUE";
            }
            if (s == Short.MAX_VALUE) {
                return "Short.MAX_VALUE";
            }
        }
        return m30746(j, 2, z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m30753(long j, boolean z) {
        if (this.f39604 == EnumC9110.AUTO) {
            int i = (int) j;
            if (i == Integer.MIN_VALUE) {
                return "Integer.MIN_VALUE";
            }
            if (i == Integer.MAX_VALUE) {
                return "Integer.MAX_VALUE";
            }
        }
        return m30746(j, 4, z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m30752(long j, boolean z) {
        if (this.f39604 == EnumC9110.AUTO) {
            if (j == C25227.FOREVER_NS) {
                return "Long.MAX_VALUE";
            }
            if (j == Long.MIN_VALUE) {
                return "Long.MIN_VALUE";
            }
        }
        return m30746(j, 8, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30743(double d) {
        if (Double.isNaN(d)) {
            return "Double.NaN";
        }
        if (d == Double.NEGATIVE_INFINITY) {
            return "Double.NEGATIVE_INFINITY";
        }
        if (d == Double.POSITIVE_INFINITY) {
            return "Double.POSITIVE_INFINITY";
        }
        if (d == Double.MIN_VALUE) {
            return "Double.MIN_VALUE";
        }
        if (d == Double.MAX_VALUE) {
            return "Double.MAX_VALUE";
        }
        if (d == Double.MIN_NORMAL) {
            return "Double.MIN_NORMAL";
        }
        return Double.toString(d) + 'd';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30744(float f) {
        if (Float.isNaN(f)) {
            return "Float.NaN";
        }
        if (f == Float.NEGATIVE_INFINITY) {
            return "Float.NEGATIVE_INFINITY";
        }
        if (f == Float.POSITIVE_INFINITY) {
            return "Float.POSITIVE_INFINITY";
        }
        if (f == Float.MIN_VALUE) {
            return "Float.MIN_VALUE";
        }
        if (f == Float.MAX_VALUE) {
            return "Float.MAX_VALUE";
        }
        if (f == Float.MIN_NORMAL) {
            return "Float.MIN_NORMAL";
        }
        return Float.toString(f) + 'f';
    }
}
