package l;

/* JADX INFO: renamed from: l.۫ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7T2 */
/* JADX INFO: loaded from: classes4.dex */
public class C13312 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f42484;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f42485;

    public C13312(String str) {
        this.f42485 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m32875() {
        return this.f42485;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32874() {
        if (this.f42484 == null) {
            String str = this.f42485;
            String lowerCase = str.toLowerCase();
            this.f42484 = lowerCase;
            if (lowerCase.length() != str.length()) {
                char[] charArray = str.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
                this.f42484 = new String(charArray);
            }
        }
        return this.f42484;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13312) {
            return this.f42485.equals(((C13312) obj).f42485);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42485.hashCode();
    }

    public final String toString() {
        return this.f42485;
    }
}
