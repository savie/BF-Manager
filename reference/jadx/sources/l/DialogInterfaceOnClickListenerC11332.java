package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۧۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11332 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35704;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f35705;

    public /* synthetic */ DialogInterfaceOnClickListenerC11332(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f35704 = i;
        this.f35705 = abstractActivityC17204;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f35704;
        AbstractActivityC17204 abstractActivityC17204 = this.f35705;
        switch (i2) {
            case 0:
                ((ActivityC0848) abstractActivityC17204).finish();
                break;
            case 1:
                AbstractActivityC10144.m26238((AbstractActivityC10144) abstractActivityC17204);
                break;
            default:
                int i3 = ActivityC11563.f36350;
                ((ActivityC11563) abstractActivityC17204).finish();
                break;
        }
    }
}
