package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21303 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC18481 f69310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21303(ViewOnClickListenerC18481 viewOnClickListenerC18481, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, R.string.MT_Protector);
        this.f69310 = viewOnClickListenerC18481;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        ViewOnClickListenerC18481 viewOnClickListenerC18481 = this.f69310;
        C7898 c7898 = viewOnClickListenerC18481.f58897;
        if (viewOnClickListenerC18481.f58898.m3453(strM40352)) {
            c7898.f25961 = true;
        } else {
            c7898.m20902();
        }
        c7898.m20904();
        c7898.f25967.notifyDataSetChanged();
        m40364();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21386() {
        ViewOnClickListenerC18481 viewOnClickListenerC18481 = this.f69310;
        String strM3452 = viewOnClickListenerC18481.f58898.m3452();
        C7898 c7898 = viewOnClickListenerC18481.f58897;
        ActivityC5677 activityC5677 = (ActivityC5677) c7898.requireActivity();
        C1777 c1777 = new C1777(activityC5677);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(C16737.m39264(R.string.MT_Protector, 0));
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        C14913.m35658(c7898.f25970, strM3452, "/", 0, 2, true, true, false, true, new C17775(viewOnClickListenerC18481, c1777, activityC5677), null);
    }
}
