package l;

/* JADX INFO: renamed from: l.ۚܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5413 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f18692;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5413(AbstractActivityC12483 abstractActivityC12483, C12562 c12562) {
        super(abstractActivityC12483, -1);
        this.f18692 = c12562;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        C12562 c12562 = this.f18692;
        c12562.setTag(strTrim);
        c12562.setChecked(!strTrim.isEmpty());
        m40364();
    }
}
