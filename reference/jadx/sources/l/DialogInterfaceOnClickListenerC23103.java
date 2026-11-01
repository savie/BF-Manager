package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23103 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75055;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75056;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75057;

    public /* synthetic */ DialogInterfaceOnClickListenerC23103(int i, Object obj, Object obj2) {
        this.f75056 = i;
        this.f75057 = obj;
        this.f75055 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f75056) {
            case 0:
                ((C19575) this.f75057).f21343.notifyItemChanged(((C8286) this.f75055).getBindingAdapterPosition());
                break;
            default:
                C14063.m34019((C14063) this.f75057, (String) this.f75055);
                break;
        }
    }
}
