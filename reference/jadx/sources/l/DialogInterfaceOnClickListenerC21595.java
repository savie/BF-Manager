package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21595 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68993;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f68994;

    public /* synthetic */ DialogInterfaceOnClickListenerC21595(int[] iArr, int i) {
        this.f68993 = i;
        this.f68994 = iArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f68993) {
            case 0:
                this.f68994[0] = i;
                break;
            default:
                this.f68994[0] = i;
                break;
        }
    }
}
