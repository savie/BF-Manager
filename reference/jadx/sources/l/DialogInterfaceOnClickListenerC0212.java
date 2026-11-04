package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֡ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0212 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1415;

    public /* synthetic */ DialogInterfaceOnClickListenerC0212(int i, Object obj) {
        this.f1414 = i;
        this.f1415 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f1414) {
            case 0:
                ActivityC0848.m3394((ActivityC0848) this.f1415);
                break;
            case 1:
                ((int[]) this.f1415)[0] = i;
                break;
            case 2:
                AbstractViewOnClickListenerC23950.m53477((AbstractViewOnClickListenerC23950) this.f1415, i);
                break;
            default:
                Runnable runnable = (Runnable) this.f1415;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
