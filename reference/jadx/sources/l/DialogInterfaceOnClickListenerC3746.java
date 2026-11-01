package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3746 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13579;

    public /* synthetic */ DialogInterfaceOnClickListenerC3746(int i, Object obj) {
        this.f13578 = i;
        this.f13579 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f13578) {
            case 0:
                ActivityC5677.m15626((ActivityC5677) this.f13579);
                break;
            case 1:
                ((ActivityC11632) this.f13579).m29024(true);
                break;
            case 2:
                C17901.m41536((C17901) this.f13579);
                break;
            default:
                C23814.m52483((C23814) this.f13579, i);
                break;
        }
    }
}
