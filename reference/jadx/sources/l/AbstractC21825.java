package l;

/* JADX INFO: renamed from: l.᩷ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21825 implements InterfaceC6163 {
    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC21825 mo23311();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo4420(char c);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC21825 m49482() {
        return C4671.f16490;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC21825 m49479(char c) {
        return new C10150(c);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC21825 m49478() {
        return new C9404(' ');
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC21825 m49481() {
        return new C1202("\n\r".charAt(0), "\n\r".charAt(1));
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo23312(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo4420(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸ */
    public boolean mo23313(CharSequence charSequence) {
        return mo33825(charSequence) == -1;
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo33825(CharSequence charSequence) {
        return mo33824(0, charSequence);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo33824(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C12128.m30311(i, length);
        while (i < length) {
            if (mo4420(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo23310(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo4420(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m49480(char c) {
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
