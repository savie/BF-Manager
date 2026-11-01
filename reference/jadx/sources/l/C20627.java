package l;

/* JADX INFO: renamed from: l.᩷ۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I770 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20627 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46497(InterfaceC18528 interfaceC18528, String str) {
        String name = interfaceC18528.getName();
        int iIndexOf = str.indexOf(40);
        if (iIndexOf != name.length() || !str.startsWith(name)) {
            return false;
        }
        int length = iIndexOf + 1;
        for (CharSequence charSequence : interfaceC18528.mo9699()) {
            if (!m46496(str, charSequence, length)) {
                return false;
            }
            length += charSequence.length();
        }
        if (length >= str.length() || str.charAt(length) != ')') {
            return false;
        }
        int i = length + 1;
        String strMo9698 = interfaceC18528.mo9698();
        return m46496(str, strMo9698, i) && strMo9698.length() + i == str.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46496(String str, CharSequence charSequence, int i) {
        if (i < 0 || charSequence.length() + i > str.length()) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (str.charAt(i + i2) != charSequence.charAt(i2)) {
                return false;
            }
        }
        return true;
    }
}
