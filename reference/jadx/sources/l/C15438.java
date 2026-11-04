package l;

/* JADX INFO: renamed from: l.ܳܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15438 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50284;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f50285;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f50286;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f50287;

    public C15438(int i, int i2, int i3, boolean z) {
        this.f50285 = i;
        this.f50286 = i2;
        this.f50284 = i3;
        this.f50287 = z;
    }

    public C15438() {
        this(0, 0, 0, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15438 m36959(int i) {
        return new C15438(this.f50285, this.f50286, i, this.f50287);
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10380("lastIndent", this.f50285);
        c3179M46714.m10380("indent", this.f50286);
        c3179M46714.m10380("column", this.f50284);
        c3179M46714.m10381("mustBreak", this.f50287);
        return c3179M46714.toString();
    }
}
