package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܳ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15621 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50746;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50747;

    public /* synthetic */ DialogInterfaceOnClickListenerC15621(int i, Object obj) {
        this.f50746 = i;
        this.f50747 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f50746;
        Object obj = this.f50747;
        switch (i2) {
            case 0:
                int i3 = ViewOnLayoutChangeListenerC6673.f22246;
                ((ViewOnLayoutChangeListenerC6673) obj).finish();
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj;
                int i4 = 0;
                for (int i5 = 0; i5 < 3; i5++) {
                    if (zArr[i5]) {
                        i4 |= 1 << i5;
                    }
                }
                C4422.m14044(i4);
                break;
            default:
                ((C16332) obj).m38794();
                break;
        }
    }
}
