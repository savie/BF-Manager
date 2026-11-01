package l;

/* JADX INFO: renamed from: l.ۡۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29824;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence f29825;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f29826 = new StringBuilder();

    public C8648(int i, CharSequence charSequence) {
        this.f29825 = charSequence;
        this.f29824 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22450() {
        CharSequence charSequence;
        char cCharAt;
        while (true) {
            int i = this.f29824;
            charSequence = this.f29825;
            if (i < 0 || !((cCharAt = charSequence.charAt(i)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r')) {
                break;
            }
            this.f29824--;
        }
        StringBuilder sb = this.f29826;
        sb.setLength(0);
        while (true) {
            int i2 = this.f29824;
            if (i2 >= 0) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == ' ' || cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r') {
                    break;
                }
                sb.append(cCharAt2);
                this.f29824--;
            } else {
                return sb.reverse().toString();
            }
        }
        return sb.reverse().toString();
    }
}
