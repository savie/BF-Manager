package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩻᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC25372 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81916;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81917;

    public /* synthetic */ DialogInterfaceOnClickListenerC25372(int i, Object obj) {
        this.f81916 = i;
        this.f81917 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f81916) {
            case 0:
                ViewOnClickListenerC19404.m44873((ViewOnClickListenerC19404) this.f81917);
                break;
            default:
                ((int[]) this.f81917)[0] = i;
                break;
        }
    }
}
