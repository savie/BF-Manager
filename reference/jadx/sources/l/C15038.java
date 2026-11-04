package l;

/* JADX INFO: renamed from: l.ܳۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final class C15038 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f49091;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15038(AbstractActivityC17204 abstractActivityC17204, C1255 c1255) {
        super(abstractActivityC17204, -1);
        this.f49091 = c1255;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        C1255 c1255 = this.f49091;
        c1255.setTag(strTrim);
        c1255.setChecked(!strTrim.isEmpty());
        m22951();
    }
}
