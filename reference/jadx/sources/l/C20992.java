package l;

/* JADX INFO: renamed from: l.᩷ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20992 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17340 f68354;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f68355;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f68356;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f68357;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f68358;

    public C20992(C17340 c17340) {
        this.f68354 = c17340;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47155(int i) {
        this.f68358 |= i > 0;
        this.f68357 += i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47156(C17340 c17340) {
        this.f68358 |= this.f68354 != c17340;
        this.f68354 = c17340;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47157(int i) {
        if (this.f68356 && this.f68355 != 5) {
            C2023.m6507(i == 5);
            return;
        }
        this.f68358 = true;
        this.f68356 = true;
        this.f68355 = i;
    }
}
