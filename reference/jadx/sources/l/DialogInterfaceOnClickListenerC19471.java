package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩵۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19471 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62684;

    public /* synthetic */ DialogInterfaceOnClickListenerC19471(int i, Object obj) {
        this.f62683 = i;
        this.f62684 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f62683) {
            case 0:
                ((InterfaceC17354) this.f62684).onCanceled();
                break;
            case 1:
                ViewOnClickListenerC4514.m12600((ViewOnClickListenerC4514) this.f62684);
                break;
            default:
                ((C11718) this.f62684).f39371 = i;
                break;
        }
    }
}
