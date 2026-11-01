package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6692 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22563;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22564;

    public /* synthetic */ DialogInterfaceOnClickListenerC6692(int i, Object obj) {
        this.f22563 = i;
        this.f22564 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f22563) {
            case 0:
                C20409 c20409 = (C20409) this.f22564;
                c20409.m13350(false);
                c20409.f66125.m17057(true);
                c20409.m13342(true);
                break;
            default:
                ((ActivityC11632) this.f22564).m29024(false);
                break;
        }
    }
}
