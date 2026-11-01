package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10106 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34505;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34506;

    public /* synthetic */ DialogInterfaceOnClickListenerC10106(int i, Object obj) {
        this.f34505 = i;
        this.f34506 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f34505) {
            case 0:
                ActivityC10957.m27553((ActivityC10957) this.f34506);
                break;
            default:
                ((boolean[]) this.f34506)[0] = true;
                break;
        }
    }
}
