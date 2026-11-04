package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2556 extends AbstractViewOnClickListenerC22702 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11309 f8209;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14806 f8210;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2556(InterfaceC11309 interfaceC11309, AbstractC14806 abstractC14806, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f8210 = abstractC14806;
        this.f8209 = interfaceC11309;
    }

    @Override // l.AbstractViewOnClickListenerC22702
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo8572() {
        String strM51185 = m51185();
        AbstractC14806 abstractC14806 = this.f8210;
        abstractC14806.m35654(strM51185);
        boolean zIsEmpty = m51185().isEmpty();
        InterfaceC11309 interfaceC11309 = this.f8209;
        if (!zIsEmpty) {
            try {
                abstractC14806.mo18530();
                interfaceC11309.onSuccess();
            } catch (Throwable unused) {
                C22673.m51152(R.string.MT_Protector);
                m51184();
                return;
            }
        } else {
            interfaceC11309.mo28581();
        }
        m51180();
    }

    @Override // l.AbstractViewOnClickListenerC22702
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo8571() {
        this.f8209.mo28581();
    }
}
