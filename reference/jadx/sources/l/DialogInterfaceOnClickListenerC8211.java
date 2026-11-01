package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۠ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8211 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28592;

    public /* synthetic */ DialogInterfaceOnClickListenerC8211(int i, Object obj) {
        this.f28591 = i;
        this.f28592 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f28591) {
            case 0:
                C18377 c18377 = (C18377) this.f28592;
                c18377.m42645(3);
                c18377.m42656();
                break;
            case 1:
                AbstractViewOnClickListenerC8744.m22685((AbstractViewOnClickListenerC8744) this.f28592, i);
                break;
            default:
                ((Runnable) this.f28592).run();
                break;
        }
    }
}
