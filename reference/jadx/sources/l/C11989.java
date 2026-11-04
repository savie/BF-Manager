package l;

/* JADX INFO: renamed from: l.ۨ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11989 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23924 f38627;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14806 f38628;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11989(ViewOnClickListenerC23924 viewOnClickListenerC23924, AbstractActivityC17204 abstractActivityC17204, AbstractC14806 abstractC14806) {
        super(abstractActivityC17204, -1);
        this.f38627 = viewOnClickListenerC23924;
        this.f38628 = abstractC14806;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        ActivityC3786 activityC3786 = this.f38627.f77453;
        AbstractC14806 abstractC14806 = this.f38628;
        String strMo18532 = abstractC14806.mo18532();
        String strTrim = m22914().trim();
        if (strTrim.isEmpty() || strTrim.equals(strMo18532)) {
            m22951();
            return;
        }
        String strSubstring = abstractC14806.mo18531().substring(strMo18532.length());
        String strMo18529 = abstractC14806.mo18529(strTrim);
        if (strMo18529 != null) {
            m22925(strMo18529);
            return;
        }
        C6331.m18055();
        C22961.m51805();
        m22951();
        activityC3786.f12972 = strTrim + strSubstring;
        ActivityC3786.m12309(activityC3786);
    }
}
