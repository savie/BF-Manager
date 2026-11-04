package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩸᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23081 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74865;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74866;

    public /* synthetic */ DialogInterfaceOnClickListenerC23081(int i, Object obj) {
        this.f74865 = i;
        this.f74866 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f74865) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18643((ViewOnLayoutChangeListenerC6673) this.f74866);
                break;
            default:
                ((boolean[]) this.f74866)[0] = true;
                break;
        }
    }
}
