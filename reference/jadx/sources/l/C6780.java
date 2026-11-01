package l;

/* JADX INFO: renamed from: l.ۜ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6780 extends AbstractFutureC23009 {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f22885;

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ Object mo4167() {
        return null;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18384(Throwable th) throws Throwable {
        C9253 c9253 = C5369.f18550;
        throw th;
    }

    public C6780(Runnable runnable) {
        this.f22885 = runnable;
    }

    @Override // l.AbstractFutureC23009
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4168() {
        this.f22885.run();
        return true;
    }
}
