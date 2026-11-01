package l;

/* JADX INFO: renamed from: l.᩶ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20295 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4647 f65767;

    public RunnableC20295(C4647 c4647) {
        this.f65767 = c4647;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4647 c4647 = this.f65767;
        if (c4647.f16421 == null || !c4647.m12826()) {
            return;
        }
        AbstractC12554 abstractC12554 = c4647.f16421;
        if (abstractC12554 != null) {
            c4647.m12822(abstractC12554);
        }
        c4647.f16432.removeCallbacks(c4647.f16420);
        C17492 c17492 = c4647.f16432;
        int i = C5031.f17539;
        c17492.postOnAnimation(this);
    }
}
