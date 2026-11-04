package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15388 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5694 f50179;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15388(ViewOnClickListenerC5694 viewOnClickListenerC5694, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, R.string.MT_Protector);
        this.f50179 = viewOnClickListenerC5694;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        ViewOnClickListenerC5694 viewOnClickListenerC5694 = this.f50179;
        C1965 c1965 = viewOnClickListenerC5694.f19665;
        if (viewOnClickListenerC5694.f19664.m33318(strM22914)) {
            c1965.f6598 = true;
        } else {
            c1965.m6774();
        }
        c1965.m6772();
        c1965.f6595.notifyDataSetChanged();
        m22951();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܽ */
    public final void mo22946() {
        ViewOnClickListenerC5694 viewOnClickListenerC5694 = this.f50179;
        String strM33317 = viewOnClickListenerC5694.f19664.m33317();
        C1965 c1965 = viewOnClickListenerC5694.f19665;
        ActivityC0848 activityC0848 = (ActivityC0848) c1965.requireActivity();
        C10745 c10745 = new C10745(activityC0848);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(C21576.m49059(R.string.MT_Protector, 0));
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        C14818.m35679(c1965.f6588, strM33317, "/", 0L, 4, true, true, false, true, new C13151(viewOnClickListenerC5694, c10745, activityC0848), null);
    }
}
