package l;

import java.text.ParsePosition;

/* JADX INFO: renamed from: l.᩵ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C19593 {
    public String a;
    public String b;
    public final char c;
    public C19593 d;
    public C19593 e;

    public boolean b(char c, char c2) {
        return c == c2;
    }

    public C19593(String str, String str2, C19593 c19593) {
        this.a = str;
        this.b = str2;
        this.d = c19593;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        C19593 c19593 = this.d;
        if (c19593 != null && length2 != length) {
            while (!b(c19593.c, charSequence.charAt(length2))) {
                c19593 = c19593.e;
                if (c19593 == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = c19593.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    public C19593 d(String str, String str2, C19593 c19593) {
        return new C19593(str, str2, c19593);
    }

    public boolean e(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }

    public final boolean a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && b(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i == this.a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (C19593 c19593 = this.d; c19593 != null; c19593 = c19593.e) {
                    if (b(c19593.c, strSubstring.charAt(0))) {
                        return c19593.a(strSubstring, str2);
                    }
                }
                C19593 c19593D = d(strSubstring, str2, null);
                c19593D.e = this.d;
                this.d = c19593D;
                return true;
            }
            this.b = str2;
            return true;
        }
        C19593 c19593D2 = d(this.a.substring(i), this.b, this.d);
        this.a = str.substring(0, i);
        this.d = c19593D2;
        if (i < str.length()) {
            this.d.e = d(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        this.b = str2;
        return true;
    }
}
