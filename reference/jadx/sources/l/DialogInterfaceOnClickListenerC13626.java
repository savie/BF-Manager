package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۬ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13626 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f43277;

    public /* synthetic */ DialogInterfaceOnClickListenerC13626(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f43276 = i;
        this.f43277 = abstractActivityC17204;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f43276) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18645((ViewOnLayoutChangeListenerC6673) this.f43277, dialogInterface, i);
                break;
            case 1:
                ActivityC0848.m3404((ActivityC0848) this.f43277);
                break;
            default:
                ((ActivityC0848) this.f43277).m3426();
                break;
        }
    }
}
