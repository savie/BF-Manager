package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۧۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10804 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36781;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17421 f36782;

    public /* synthetic */ DialogInterfaceOnClickListenerC10804(InterfaceC17421 interfaceC17421, int i) {
        this.f36781 = i;
        this.f36782 = interfaceC17421;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36781) {
            case 0:
                ActivityC5677.m15605((ActivityC5677) this.f36782);
                break;
            default:
                C4183.m11829(this.f36782, C4183.f15234.f58037);
                break;
        }
    }
}
