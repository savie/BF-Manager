package l;

/* JADX INFO: renamed from: l.᩹ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes.dex */
public final class C23616 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f76643;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6462 f76644;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f76645;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1079 f76646;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23616(C6462 c6462, AbstractActivityC17204 abstractActivityC17204, C1079 c1079, AbstractActivityC17204 abstractActivityC17205, DialogInterfaceC8327 dialogInterfaceC8327) {
        super(abstractActivityC17204, -1);
        this.f76644 = c6462;
        this.f76646 = c1079;
        this.f76645 = abstractActivityC17205;
        this.f76643 = dialogInterfaceC8327;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (strTrim.equals(this.f76646.m4041())) {
            m22951();
        } else {
            new C16156(this, strTrim).m8197();
        }
    }
}
