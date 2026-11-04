package l;

/* JADX INFO: renamed from: l.ۜܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C7281 extends AbstractFutureC13992 {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Runnable f23982;

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ᩸ */
    public final /* bridge */ /* synthetic */ Object mo4842() {
        return null;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19921(Throwable th) throws Throwable {
        C14738 c14738 = C10263.f32775;
        throw th;
    }

    public C7281(Runnable runnable) {
        this.f23982 = runnable;
    }

    @Override // l.AbstractFutureC13992
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo4841() {
        this.f23982.run();
        return true;
    }
}
