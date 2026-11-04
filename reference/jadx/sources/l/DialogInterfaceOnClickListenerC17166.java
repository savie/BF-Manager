package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܺ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC17166 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55964;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55965;

    public /* synthetic */ DialogInterfaceOnClickListenerC17166(int i, Object obj) {
        this.f55964 = i;
        this.f55965 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f55964) {
            case 0:
                ViewOnClickListenerC19404.m44874((ViewOnClickListenerC19404) this.f55965, i);
                break;
            case 1:
                C19518.m45040(((C14492) this.f55965).f45607.f33580);
                break;
            default:
                C24253.m54265((C24253) this.f55965);
                break;
        }
    }
}
