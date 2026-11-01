package l;

/* JADX INFO: renamed from: l.ܳ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14825 extends AbstractC6909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f48449 = "//";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10578 f48450;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9886 f48451;

    public C14825(C9886 c9886, C10578 c10578) {
        this.f48451 = c9886;
        this.f48450 = c10578;
    }

    @Override // l.AbstractC6909
    public final void onScrolled(C17492 c17492, int i, int i2) {
        String strM25020 = this.f48451.m25020();
        if (C13638.equals(this.f48449, strM25020)) {
            return;
        }
        this.f48449 = strM25020;
        this.f48450.n(strM25020);
    }
}
