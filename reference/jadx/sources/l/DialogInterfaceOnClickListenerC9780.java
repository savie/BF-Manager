package l;

import android.content.DialogInterface;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: l.ۢᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC9780 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4134[] f33481 = C23186.m51191();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f33482;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f33483;

    public DialogInterfaceOnClickListenerC9780(int i) {
        int i2 = 0;
        while (true) {
            C4134[] c4134Arr = this.f33481;
            if (i2 >= c4134Arr.length) {
                i2 = -1;
                break;
            }
            C4134 c4134 = c4134Arr[i2];
            if (c4134.m11762() == i) {
                c4134.setSpan(new ForegroundColorSpan(C20368.f65963), 0, c4134.length(), 33);
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new RuntimeException();
        }
        this.f33483 = i2;
        this.f33482 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f33482 = i;
    }
}
