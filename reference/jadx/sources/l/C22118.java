package l;

import java.text.ParsePosition;

/* JADX INFO: renamed from: l.᩷ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C22118 {
    public String a;
    public String b;
    public final char c;
    public C22118 d;
    public C22118 e;

    public boolean b(char c, char c2) {
        return c == c2;
    }

    public C22118(String str, String str2, C22118 c22118) {
        this.a = str;
        this.b = str2;
        this.d = c22118;
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
        C22118 c22118 = this.d;
        if (c22118 != null && length2 != length) {
            while (!b(c22118.c, charSequence.charAt(length2))) {
                c22118 = c22118.e;
                if (c22118 == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = c22118.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    public C22118 d(String str, String str2, C22118 c22118) {
        return new C22118(str, str2, c22118);
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
                for (C22118 c22118 = this.d; c22118 != null; c22118 = c22118.e) {
                    if (b(c22118.c, strSubstring.charAt(0))) {
                        return c22118.a(strSubstring, str2);
                    }
                }
                C22118 c22118D = d(strSubstring, str2, null);
                c22118D.e = this.d;
                this.d = c22118D;
                return true;
            }
            this.b = str2;
            return true;
        }
        C22118 c22118D2 = d(this.a.substring(i), this.b, this.d);
        this.a = str.substring(0, i);
        this.d = c22118D2;
        if (i < str.length()) {
            this.d.e = d(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        this.b = str2;
        return true;
    }
}
