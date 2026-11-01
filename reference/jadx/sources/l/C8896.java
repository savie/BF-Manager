package l;

import bin.mt.plus.R;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8896 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7484 f30525;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8896(ViewOnClickListenerC7484 viewOnClickListenerC7484, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, R.string.MT_Protector);
        this.f30525 = viewOnClickListenerC7484;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        ViewOnClickListenerC7484 viewOnClickListenerC7484 = this.f30525;
        C20890 c20890 = viewOnClickListenerC7484.f24930;
        if (viewOnClickListenerC7484.f24931.m36516(strM40352)) {
            c20890.f67873 = true;
        } else {
            c20890.m46995();
        }
        c20890.m46996();
        c20890.f67870.notifyDataSetChanged();
        m40364();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21386() {
        ViewOnClickListenerC7484 viewOnClickListenerC7484 = this.f30525;
        String strM36515 = viewOnClickListenerC7484.f24931.m36515();
        C20890 c20890 = viewOnClickListenerC7484.f24930;
        ActivityC5677 activityC5677 = (ActivityC5677) c20890.requireActivity();
        C1777 c1777 = new C1777(activityC5677);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(C16737.m39264(R.string.MT_Protector, 0));
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        C23672.m52121(c20890.f67871, strM36515, "/", 0L, 4, true, true, false, true, (InterfaceC16966) new C10307(viewOnClickListenerC7484, c1777, activityC5677), (Predicate) null);
    }
}
