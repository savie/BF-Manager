package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20264 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23994 f65069;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f65070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20264(C23994 c23994, AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044) {
        super(abstractActivityC17204, -1);
        this.f65069 = c23994;
        this.f65070 = abstractC22044;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        AbstractC22044 abstractC22044 = this.f65070;
        String name = abstractC22044.getName();
        String strM22914 = m22914();
        if (name.equals(strM22914)) {
            m22951();
            return;
        }
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49856().m49876(strM22914);
        boolean zEqualsIgnoreCase = name.equalsIgnoreCase(strM22914);
        C23994 c23994 = this.f65069;
        if (!zEqualsIgnoreCase) {
            if (abstractC22044M49876.mo2934()) {
                m22952(R.string.MT_Protector);
                return;
            }
            abstractC22044.mo4301(abstractC22044M49876);
            c23994.m53552();
            m22951();
            return;
        }
        AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(".tmp");
        abstractC22044.mo4301(abstractC22044M49862);
        abstractC22044M49862.mo4301(abstractC22044M49876);
        c23994.m53552();
        m22951();
    }
}
