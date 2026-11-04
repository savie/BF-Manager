package l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩴ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19503 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62952;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62953;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62954;

    public /* synthetic */ DialogInterfaceOnClickListenerC19503(int i, Object obj, Object obj2) {
        this.f62952 = i;
        this.f62954 = obj;
        this.f62953 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f62952) {
            case 0:
                ActivityC2350.m7931((ActivityC2350) this.f62954, (MenuItem) this.f62953);
                break;
            default:
                C21532 c21532 = (C21532) this.f62954;
                RunnableC21863 runnableC21863 = (RunnableC21863) this.f62953;
                c21532.f68796 = true;
                runnableC21863.run();
                break;
        }
    }
}
