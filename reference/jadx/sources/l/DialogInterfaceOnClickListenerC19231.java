package l;

import android.content.DialogInterface;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: l.ᩳܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC19231 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62188;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22215[] f62189 = C22961.m51803();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f62190;

    public DialogInterfaceOnClickListenerC19231(int i) {
        int i2 = 0;
        while (true) {
            C22215[] c22215Arr = this.f62189;
            if (i2 >= c22215Arr.length) {
                i2 = -1;
                break;
            }
            C22215 c22215 = c22215Arr[i2];
            if (c22215.m50239() == i) {
                c22215.setSpan(new ForegroundColorSpan(C3296.f10754), 0, c22215.length(), 33);
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new RuntimeException();
        }
        this.f62190 = i2;
        this.f62188 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f62188 = i;
    }
}
