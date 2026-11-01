package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۬ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC13249 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44010;

    public /* synthetic */ DialogInterfaceOnClickListenerC13249(int i, Object obj) {
        this.f44009 = i;
        this.f44010 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f44009) {
            case 0:
                ((C12543) this.f44010).m31190((C18593) null, (DialogInterfaceC19356) null);
                break;
            case 1:
                C11322.m28379((C11322) this.f44010);
                break;
            default:
                ActivityC11220.m28174((ActivityC11220) this.f44010);
                break;
        }
    }
}
