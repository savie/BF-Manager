package l;

/* JADX INFO: renamed from: l.ۜۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6496 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f21906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21907;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f21908;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f21909;

    public C6496(int i, int i2, int i3, boolean z) {
        this.f21908 = i;
        this.f21909 = i2;
        this.f21907 = i3;
        this.f21906 = z;
    }

    public C6496() {
        this(0, 0, 0, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6496 m17699(int i) {
        return new C6496(this.f21908, this.f21909, i, this.f21906);
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51285("lastIndent", this.f21908);
        c23244M37072.m51285("indent", this.f21909);
        c23244M37072.m51285("column", this.f21907);
        c23244M37072.m51286("mustBreak", this.f21906);
        return c23244M37072.toString();
    }
}
