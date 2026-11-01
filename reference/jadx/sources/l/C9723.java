package l;

/* JADX INFO: renamed from: l.ۢܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes3.dex */
public final class C9723 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4452 f32729;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f32730;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9723(C4452 c4452, AbstractActivityC12483 abstractActivityC12483, boolean z) {
        super(abstractActivityC12483, -1);
        this.f32729 = c4452;
        this.f32730 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        if (m40352().isEmpty()) {
            m40364();
        } else {
            new C1960(this).m10243();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩸ */
    public final void mo24190() {
        if (this.f32730) {
            this.f32729.f15849.m44362();
        }
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            return;
        }
        ApplicationC0716.f2992.edit().putString("dex_backup_name", strM40352).apply();
    }
}
