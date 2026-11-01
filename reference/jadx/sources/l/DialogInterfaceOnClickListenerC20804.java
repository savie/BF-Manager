package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷ۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20804 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f67634;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f67636;

    public /* synthetic */ DialogInterfaceOnClickListenerC20804(C20409 c20409, ActivityC11632 activityC11632, int i) {
        this.f67635 = i;
        this.f67636 = c20409;
        this.f67634 = activityC11632;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f67635) {
            case 0:
                this.f67636.m46103(this.f67634);
                break;
            default:
                this.f67636.m46103(this.f67634);
                break;
        }
    }
}
