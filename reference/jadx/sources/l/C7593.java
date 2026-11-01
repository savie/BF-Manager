package l;

/* JADX INFO: renamed from: l.۟ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7593 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16060 f25140;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17131 f25141;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7593(ViewOnClickListenerC16060 viewOnClickListenerC16060, AbstractActivityC12483 abstractActivityC12483, AbstractC17131 abstractC17131) {
        super(abstractActivityC12483, -1);
        this.f25140 = viewOnClickListenerC16060;
        this.f25141 = abstractC17131;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        ActivityC20293 activityC20293 = this.f25140.f51955;
        AbstractC17131 abstractC17131 = this.f25141;
        String strMo1460 = abstractC17131.mo1460();
        String strTrim = m40352().trim();
        if (strTrim.isEmpty() || strTrim.equals(strMo1460)) {
            m40364();
            return;
        }
        String strSubstring = abstractC17131.mo1453().substring(strMo1460.length());
        String strMo1450 = abstractC17131.mo1450(strTrim);
        if (strMo1450 != null) {
            m40347(strMo1450);
            return;
        }
        C21094.m47530();
        C23186.m51173();
        m40364();
        activityC20293.f65754 = strTrim + strSubstring;
        ActivityC20293.m45803(activityC20293);
    }
}
