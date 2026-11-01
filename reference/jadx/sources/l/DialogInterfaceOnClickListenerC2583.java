package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۖܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2583 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10158;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10159;

    public /* synthetic */ DialogInterfaceOnClickListenerC2583(int i, Object obj) {
        this.f10158 = i;
        this.f10159 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10158) {
            case 0:
                ((ActivityC5677) this.f10159).m15682();
                break;
            case 1:
                ((RunnableC16006) this.f10159).run();
                break;
            default:
                ((Runnable) this.f10159).run();
                break;
        }
    }
}
