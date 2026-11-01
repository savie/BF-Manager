package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩸ۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21394 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69567;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f69568;

    public /* synthetic */ DialogInterfaceOnClickListenerC21394(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f69567 = i;
        this.f69568 = abstractActivityC12483;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f69567) {
            case 0:
                ActivityC10957.m27635((ActivityC10957) this.f69568);
                break;
            default:
                AbstractActivityC5788.m15927((AbstractActivityC5788) this.f69568);
                break;
        }
    }
}
