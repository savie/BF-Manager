package l;

/* JADX INFO: renamed from: l.ۛ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6024 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23924 f20604;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f20605;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6024(ViewOnClickListenerC23924 viewOnClickListenerC23924, AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044) {
        super(abstractActivityC17204, -1);
        this.f20604 = viewOnClickListenerC23924;
        this.f20605 = abstractC22044;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC3786 activityC3786 = this.f20604.f77453;
        AbstractC22044 abstractC22044 = this.f20605;
        String strM49874 = abstractC22044.m49874();
        String strTrim = m22914().trim();
        if (strTrim.isEmpty() || strTrim.equals(strM49874)) {
            m22951();
            return;
        }
        StringBuilder sbM27333 = C10732.m27333(strTrim);
        sbM27333.append(abstractC22044.m49864());
        AbstractC22044 abstractC22044M49868 = abstractC22044.m49868(sbM27333.toString());
        String strM35188 = C14584.m35188(abstractC22044, abstractC22044M49868);
        if (strM35188 != null) {
            m22925(strM35188);
            return;
        }
        C6331.m18055();
        C22961.m51805();
        m22951();
        activityC3786.f12970 = abstractC22044M49868.getName();
        ActivityC3786.m12309(activityC3786);
    }
}
