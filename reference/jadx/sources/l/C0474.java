package l;

/* JADX INFO: renamed from: l.֡ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0907 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0474 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2092 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f2093 = new StringBuilder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2307(CharSequence charSequence) {
        int i = this.f2092;
        StringBuilder sb = this.f2093;
        if (i != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        this.f2092++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m2306() {
        return this.f2093.toString();
    }
}
