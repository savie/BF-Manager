package l;

/* JADX INFO: renamed from: l.᩺ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAP1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24275 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f78586;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f78587;

    public C24275(CharSequence charSequence) {
        this.f78587 = charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54278() {
        int i = this.f78586;
        CharSequence charSequence = this.f78587;
        if (i >= charSequence.length()) {
            return null;
        }
        char cCharAt = charSequence.charAt(this.f78586);
        if (cCharAt == 'L') {
            StringBuilder sb = new StringBuilder();
            int i2 = this.f78586;
            this.f78586 = i2 + 1;
            sb.append(charSequence.charAt(i2));
            while (this.f78586 < charSequence.length()) {
                int i3 = this.f78586;
                this.f78586 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                sb.append(cCharAt2);
                if (cCharAt2 == ';') {
                    break;
                }
            }
            return sb.toString();
        }
        if (cCharAt != '[') {
            this.f78586++;
            return String.valueOf(cCharAt);
        }
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.f78586;
        this.f78586 = i4 + 1;
        sb2.append(charSequence.charAt(i4));
        while (this.f78586 < charSequence.length()) {
            char cCharAt3 = charSequence.charAt(this.f78586);
            if (cCharAt3 == '[') {
                this.f78586++;
                sb2.append(cCharAt3);
            } else {
                sb2.append(m54278());
                break;
            }
        }
        return sb2.toString();
    }
}
