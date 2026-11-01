package l;

/* JADX INFO: renamed from: l.۠ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7T2 */
/* JADX INFO: loaded from: classes3.dex */
public class C8148 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f28497;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f28498;

    public C8148(String str) {
        this.f28498 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m21459() {
        return this.f28498;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m21458() {
        if (this.f28497 == null) {
            String str = this.f28498;
            String lowerCase = str.toLowerCase();
            this.f28497 = lowerCase;
            if (lowerCase.length() != str.length()) {
                char[] charArray = str.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
                this.f28497 = new String(charArray);
            }
        }
        return this.f28497;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8148) {
            return this.f28498.equals(((C8148) obj).f28498);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28498.hashCode();
    }

    public final String toString() {
        return this.f28498;
    }
}
