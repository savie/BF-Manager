package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۟ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7670 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25262;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25263;

    public /* synthetic */ DialogInterfaceOnClickListenerC7670(int i, Object obj) {
        this.f25262 = i;
        this.f25263 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f25262) {
            case 0:
                ActivityC0848.m3351((ActivityC0848) this.f25263);
                break;
            default:
                ((Runnable) this.f25263).run();
                break;
        }
    }
}
