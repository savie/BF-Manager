package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C24029 extends AbstractViewOnClickListenerC14664 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4001 f77848;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17131 f77849;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24029(InterfaceC4001 interfaceC4001, AbstractC17131 abstractC17131, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f77849 = abstractC17131;
        this.f77848 = interfaceC4001;
    }

    @Override // l.AbstractViewOnClickListenerC14664
    /* JADX INFO: renamed from: ۚ */
    public final void mo35196() {
        String strM35199 = m35199();
        AbstractC17131 abstractC17131 = this.f77849;
        abstractC17131.m40012(strM35199);
        boolean zIsEmpty = m35199().isEmpty();
        InterfaceC4001 interfaceC4001 = this.f77848;
        if (!zIsEmpty) {
            try {
                abstractC17131.mo1451();
                interfaceC4001.onSuccess();
            } catch (Throwable unused) {
                C15829.m37611(R.string.MT_Protector);
                m35201();
                return;
            }
        } else {
            interfaceC4001.onCanceled();
        }
        m35194();
    }

    @Override // l.AbstractViewOnClickListenerC14664
    /* JADX INFO: renamed from: ۨ */
    public final void mo35197() {
        this.f77848.onCanceled();
    }
}
