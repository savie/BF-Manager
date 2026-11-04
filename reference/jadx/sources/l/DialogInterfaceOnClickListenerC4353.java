package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4353 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15727;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15728;

    public /* synthetic */ DialogInterfaceOnClickListenerC4353(int i, Object obj) {
        this.f15727 = i;
        this.f15728 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f15727) {
            case 0:
                ActivityC9572.m24997((ActivityC9572) this.f15728);
                break;
            case 1:
                ActivityC20779.m47545((ActivityC20779) this.f15728);
                break;
            default:
                C16332.m38772((C16332) this.f15728);
                break;
        }
    }
}
