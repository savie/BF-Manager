package l;

/* JADX INFO: renamed from: l.ܳ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14384 implements InterfaceC19010 {
    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC14384 mo27209();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo1772(char c);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC14384 m34616() {
        return C23556.f76284;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC14384 m34618(char c) {
        return new C20028(c);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC14384 m34617() {
        return new C16500(' ');
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC14384 m34620() {
        return new C0271("\n\r".charAt(0), "\n\r".charAt(1));
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo27210(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo1772(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo27206(CharSequence charSequence) {
        return mo27211(charSequence) == -1;
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo27211(CharSequence charSequence) {
        return mo27207(0, charSequence);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo27207(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C18304.m42519(i, length);
        while (i < length) {
            if (mo1772(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo27208(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo1772(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m34619(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
