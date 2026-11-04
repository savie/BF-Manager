package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11269 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f35566;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractActivityC17204 abstractActivityC17204 = this.f35566;
        C12015 c12015 = new C12015(abstractActivityC17204, R.string.MT_Protector);
        c12015.m22932(C3296.f10738);
        c12015.m22923(new C3066(c12015));
        c12015.m22945(R.string.MT_Protector);
        String string = ApplicationC17729.f58258.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
        c12015.m22924((CharSequence) (string.trim().isEmpty() ? "yyyy-MM-dd_HH-mm-ss" : string));
        c12015.m22929(R.string.MT_Protector);
        c12015.m22938().setPadding(0, C6907.m19160(6.0f), 0, 0);
        c12015.m22959();
        c12015.m22955(true);
        DialogInterfaceC8327 dialogInterfaceC8327M22956 = c12015.m22956();
        C5416.m16144(dialogInterfaceC8327M22956);
        C21576.m49062(1000L, new RunnableC20220(c12015, dialogInterfaceC8327M22956));
        dialogInterfaceC8327M22956.m22440().setOnClickListener(new ViewOnClickListenerC0305(abstractActivityC17204, 1));
    }
}
