package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩴ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20097 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64583;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f64584;

    public /* synthetic */ DialogInterfaceOnClickListenerC20097(int i, Object obj) {
        this.f64583 = i;
        this.f64584 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f64583) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18657((ViewOnLayoutChangeListenerC6673) this.f64584);
                break;
            case 1:
                ((Runnable) this.f64584).run();
                break;
            default:
                ActivityC0848.m3392((ActivityC0848) this.f64584);
                break;
        }
    }
}
