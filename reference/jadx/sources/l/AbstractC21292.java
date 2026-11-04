package l;

/* JADX INFO: renamed from: l.᩶ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f67896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC21292 f67895 = new C4138(true);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC21292 f67894 = new C14578(false);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo13267(CharSequence charSequence, CharSequence charSequence2, int i);

    public AbstractC21292(boolean z) {
        this.f67896 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48532(CharSequence charSequence, String str) {
        if (str == null || charSequence == null) {
            return str == charSequence;
        }
        int length = charSequence.length();
        if (length > str.length()) {
            return false;
        }
        return C3392.m11107(str.length() - length, length, str, charSequence, this.f67896);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48531(String str, String str2, String str3) {
        if (C24276.m54286((CharSequence) str) || C24276.m54286((CharSequence) str2) || str3 == null) {
            return str;
        }
        if (this.f67896) {
            str2 = str2.toLowerCase();
        }
        int i = 0;
        int iMo13267 = mo13267(str, str2, 0);
        if (iMo13267 == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iMo13267 != -1) {
            sb.append((CharSequence) str, i, iMo13267);
            sb.append(str3);
            i = iMo13267 + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iMo13267 = mo13267(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m48533(CharSequence charSequence, String str) {
        if (str != null && charSequence != null) {
            int length = charSequence.length();
            if (length <= str.length()) {
                return C3392.m11107(0, length, str, charSequence, this.f67896);
            }
        } else if (str == charSequence) {
            return true;
        }
        return false;
    }
}
