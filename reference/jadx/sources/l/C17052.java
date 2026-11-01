package l;

/* JADX INFO: renamed from: l.ܿۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAP1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17052 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public CharSequence f54455;

    public C17052(CharSequence charSequence) {
        this.f54455 = charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39831() {
        int i = this.f54454;
        CharSequence charSequence = this.f54455;
        if (i >= charSequence.length()) {
            return null;
        }
        char cCharAt = charSequence.charAt(this.f54454);
        if (cCharAt == 'L') {
            StringBuilder sb = new StringBuilder();
            int i2 = this.f54454;
            this.f54454 = i2 + 1;
            sb.append(charSequence.charAt(i2));
            while (this.f54454 < charSequence.length()) {
                int i3 = this.f54454;
                this.f54454 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                sb.append(cCharAt2);
                if (cCharAt2 == ';') {
                    break;
                }
            }
            return sb.toString();
        }
        if (cCharAt != '[') {
            this.f54454++;
            return String.valueOf(cCharAt);
        }
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.f54454;
        this.f54454 = i4 + 1;
        sb2.append(charSequence.charAt(i4));
        while (this.f54454 < charSequence.length()) {
            char cCharAt3 = charSequence.charAt(this.f54454);
            if (cCharAt3 == '[') {
                this.f54454++;
                sb2.append(cCharAt3);
            } else {
                sb2.append(m39831());
                break;
            }
        }
        return sb2.toString();
    }
}
