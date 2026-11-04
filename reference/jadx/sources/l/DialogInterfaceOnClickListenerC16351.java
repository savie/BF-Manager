package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC16351 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53089;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53090;

    public /* synthetic */ DialogInterfaceOnClickListenerC16351(int i, Object obj) {
        this.f53089 = i;
        this.f53090 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f53089;
        Object obj = this.f53090;
        switch (i2) {
            case 0:
                ((C8893) obj).m23795((C24778) null, (DialogInterfaceC8327) null);
                break;
            case 1:
                int i3 = AbstractActivityC10144.f32485;
                ((AbstractActivityC10144) obj).finish();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            case 3:
                ActivityC0848.m3388((ActivityC0848) obj);
                break;
            default:
                C13511 c13511 = new C13511((Main) obj, R.string.MT_Protector);
                c13511.m33192();
                C5261.f18540.execute(new RunnableC8501(0, c13511));
                break;
        }
    }
}
