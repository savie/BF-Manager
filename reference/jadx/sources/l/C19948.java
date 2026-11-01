package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.᩶ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4D5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19948 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f63897;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC22013 f63898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f63899;

    public C19948(EnumC22013 enumC22013, int i, String str) {
        this.f63898 = enumC22013;
        this.f63897 = i;
        this.f63899 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19948 m45245(String str) throws ProtocolException {
        EnumC22013 enumC22013;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC22013 = EnumC22013.HTTP_1_0;
            } else if (iCharAt == 1) {
                enumC22013 = EnumC22013.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            enumC22013 = EnumC22013.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C19948(enumC22013, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63898 == EnumC22013.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f63897);
        String str = this.f63899;
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        return sb.toString();
    }
}
