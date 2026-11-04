package l;

/* JADX INFO: renamed from: l.֫᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2229 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7315;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CharSequence f7316;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f7317 = new StringBuilder();

    public C2229(int i, CharSequence charSequence) {
        this.f7316 = charSequence;
        this.f7315 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7619() {
        CharSequence charSequence;
        char cCharAt;
        while (true) {
            int i = this.f7315;
            charSequence = this.f7316;
            if (i < 0 || !((cCharAt = charSequence.charAt(i)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r')) {
                break;
            }
            this.f7315--;
        }
        StringBuilder sb = this.f7317;
        sb.setLength(0);
        while (true) {
            int i2 = this.f7315;
            if (i2 >= 0) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == ' ' || cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r') {
                    break;
                }
                sb.append(cCharAt2);
                this.f7315--;
            } else {
                return sb.reverse().toString();
            }
        }
        return sb.reverse().toString();
    }
}
