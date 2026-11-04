package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9192 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30003;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30004;

    public /* synthetic */ DialogInterfaceOnClickListenerC9192(int i, Object obj) {
        this.f30003 = i;
        this.f30004 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f30003) {
            case 0:
                C7941 c7941 = (C7941) this.f30004;
                c7941.m19945(false);
                c7941.f26387.m54016(true);
                c7941.m19932(true);
                break;
            default:
                ((ActivityC18143) this.f30004).m42298(false);
                break;
        }
    }
}
