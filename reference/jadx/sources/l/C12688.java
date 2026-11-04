package l;

/* JADX INFO: renamed from: l.ۨ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I770 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12688 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31482(InterfaceC8631 interfaceC8631, String str) {
        String name = interfaceC8631.getName();
        int iIndexOf = str.indexOf(40);
        if (iIndexOf != name.length() || !str.startsWith(name)) {
            return false;
        }
        int length = iIndexOf + 1;
        for (CharSequence charSequence : interfaceC8631.mo6805()) {
            if (!m31481(str, charSequence, length)) {
                return false;
            }
            length += charSequence.length();
        }
        if (length >= str.length() || str.charAt(length) != ')') {
            return false;
        }
        int i = length + 1;
        String strMo6802 = interfaceC8631.mo6802();
        return m31481(str, strMo6802, i) && strMo6802.length() + i == str.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31481(String str, CharSequence charSequence, int i) {
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
