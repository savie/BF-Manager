package l;

import android.content.DialogInterface;
import android.widget.RadioButton;

/* JADX INFO: renamed from: l.ᩳۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18826 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61182;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61184;

    public /* synthetic */ DialogInterfaceOnClickListenerC18826(int i, Object obj, Object obj2) {
        this.f61182 = i;
        this.f61184 = obj;
        this.f61183 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f61182) {
            case 0:
                C2418.m8162((C2418) this.f61184, (AbstractActivityC17204) this.f61183);
                break;
            default:
                AbstractDialogInterfaceOnClickListenerC2437.m8218((AbstractDialogInterfaceOnClickListenerC2437) this.f61184, (RadioButton[]) this.f61183);
                break;
        }
    }
}
