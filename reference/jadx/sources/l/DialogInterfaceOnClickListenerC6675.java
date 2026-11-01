package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6675 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f22534;

    public /* synthetic */ DialogInterfaceOnClickListenerC6675(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f22533 = i;
        this.f22534 = abstractActivityC12483;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f22533;
        AbstractActivityC12483 abstractActivityC12483 = this.f22534;
        switch (i2) {
            case 0:
                int i3 = ViewOnClickListenerC8793.f30222;
                ((ViewOnClickListenerC8793) abstractActivityC12483).finish();
                break;
            case 1:
                ((ActivityC5677) abstractActivityC12483).finish();
                break;
            default:
                ViewOnLayoutChangeListenerC3333.m9905((ViewOnLayoutChangeListenerC3333) abstractActivityC12483, dialogInterface, i);
                break;
        }
    }
}
