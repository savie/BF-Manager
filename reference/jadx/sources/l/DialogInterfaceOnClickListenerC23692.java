package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23692 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15712 f76821;

    public /* synthetic */ DialogInterfaceOnClickListenerC23692(InterfaceC15712 interfaceC15712, int i) {
        this.f76820 = i;
        this.f76821 = interfaceC15712;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f76820) {
            case 0:
                ((ActivityC4300) this.f76821).f15588 = i;
                break;
            case 1:
                C13356.m32936(this.f76821, C13356.f42589.f55540);
                break;
            default:
                ActivityC10841.m27565((ActivityC10841) this.f76821);
                break;
        }
    }
}
