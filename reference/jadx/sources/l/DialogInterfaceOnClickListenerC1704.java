package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֫ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1704 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5843;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5844;

    public /* synthetic */ DialogInterfaceOnClickListenerC1704(int i, Object obj) {
        this.f5843 = i;
        this.f5844 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5843) {
            case 0:
                ActivityC0848 activityC0848 = (ActivityC0848) this.f5844;
                new C1176(activityC0848, new C12362(activityC0848.f3191)).m4347();
                break;
            default:
                ((RunnableC11364) this.f5844).run();
                break;
        }
    }
}
