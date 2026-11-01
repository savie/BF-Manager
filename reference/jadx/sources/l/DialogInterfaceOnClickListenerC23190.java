package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23190 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75255;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75256;

    public /* synthetic */ DialogInterfaceOnClickListenerC23190(int i, Object obj) {
        this.f75255 = i;
        this.f75256 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f75255) {
            case 0:
                AbstractActivityC10490.m26613((AbstractActivityC10490) this.f75256);
                break;
            default:
                ((int[]) this.f75256)[0] = i;
                break;
        }
    }
}
