package l;

/* JADX INFO: renamed from: l.ᩳ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes5.dex */
public final class C19075 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1176 f61766;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f61767;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19075(C1176 c1176, AbstractActivityC17204 abstractActivityC17204, boolean z) {
        super(abstractActivityC17204, -1);
        this.f61766 = c1176;
        this.f61767 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        if (m22914().isEmpty()) {
            m22951();
        } else {
            new C7888(this).m8197();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܺ */
    public final void mo22944() {
        if (this.f61767) {
            this.f61766.f4307.m22432();
        }
        String strM22914 = m22914();
        if (strM22914.isEmpty()) {
            return;
        }
        ApplicationC17729.f58258.edit().putString("dex_backup_name", strM22914).apply();
    }
}
