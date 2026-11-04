package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15432 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5738 f50277;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15432(ViewOnClickListenerC5738 viewOnClickListenerC5738, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, R.string.MT_Protector);
        this.f50277 = viewOnClickListenerC5738;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        ViewOnClickListenerC5738 viewOnClickListenerC5738 = this.f50277;
        C2009 c2009 = viewOnClickListenerC5738.f19755;
        if (viewOnClickListenerC5738.f19754.m34071(strM22914)) {
            c2009.f6690 = true;
        } else {
            c2009.m6893();
        }
        c2009.m6891();
        c2009.f6689.notifyDataSetChanged();
        m22951();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܽ */
    public final void mo22946() {
        ViewOnClickListenerC5738 viewOnClickListenerC5738 = this.f50277;
        String strM34070 = viewOnClickListenerC5738.f19754.m34070();
        C2009 c2009 = viewOnClickListenerC5738.f19755;
        ActivityC0848 activityC0848 = (ActivityC0848) c2009.requireActivity();
        C10745 c10745 = new C10745(activityC0848);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(C21576.m49059(R.string.MT_Protector, 0));
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        C13217.m32751(c2009.f6692, strM34070, "/", 0, 2, true, true, false, true, new C13195(viewOnClickListenerC5738, c10745, activityC0848), null);
    }
}
