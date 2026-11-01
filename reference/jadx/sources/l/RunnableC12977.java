package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12977 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f43286;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractActivityC12483 abstractActivityC12483 = this.f43286;
        C8038 c8038 = new C8038(abstractActivityC12483, R.string.MT_Protector);
        c8038.m40345(new C17915(c8038));
        c8038.m40376(R.string.MT_Protector);
        String string = ApplicationC0716.f2992.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
        c8038.m40346((CharSequence) (string.trim().isEmpty() ? "yyyy-MM-dd_HH-mm-ss" : string));
        c8038.m40363(R.string.MT_Protector);
        c8038.m40362().setPadding(0, C13932.m33769(6.0f), 0, 0);
        c8038.m40355();
        c8038.m40368(true);
        DialogInterfaceC19356 dialogInterfaceC19356M40335 = c8038.m40335();
        C23250.m51309(dialogInterfaceC19356M40335);
        C16737.m39267(1000L, new RunnableC18621(c8038, dialogInterfaceC19356M40335));
        dialogInterfaceC19356M40335.m44361().setOnClickListener(new ViewOnClickListenerC22999(abstractActivityC12483, 1));
    }
}
