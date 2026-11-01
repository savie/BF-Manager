package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3852 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f14386;

    public /* synthetic */ DialogInterfaceOnClickListenerC3852(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f14385 = i;
        this.f14386 = abstractActivityC12483;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f14385) {
            case 0:
                ((ViewOnClickListenerC8793) this.f14386).m22879(true);
                break;
            default:
                ActivityC5677.m15607((ActivityC5677) this.f14386);
                break;
        }
    }
}
