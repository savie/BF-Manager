package l;

/* JADX INFO: renamed from: l.᩵ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20401 extends AbstractC21147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6976 f65392;

    public C20401(C6976 c6976) {
        this.f65392 = c6976;
    }

    @Override // l.AbstractC21147
    public final void onPageSelected(int i) {
        C6976 c6976 = this.f65392;
        if (c6976.f23027 != i) {
            c6976.f23027 = i;
            c6976.f23024.m43893();
        }
    }

    @Override // l.AbstractC21147
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f65392.m19284();
        }
    }
}
