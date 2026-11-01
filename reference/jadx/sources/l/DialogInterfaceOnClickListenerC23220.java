package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23220 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f75338;

    public /* synthetic */ DialogInterfaceOnClickListenerC23220(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f75337 = i;
        this.f75338 = abstractActivityC12483;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f75337;
        AbstractActivityC12483 abstractActivityC12483 = this.f75338;
        switch (i2) {
            case 0:
                boolean z = ActivityC3588.f13200;
                ((ActivityC3588) abstractActivityC12483).finish();
                break;
            default:
                ActivityC5760.m15868((ActivityC5760) abstractActivityC12483);
                break;
        }
    }
}
