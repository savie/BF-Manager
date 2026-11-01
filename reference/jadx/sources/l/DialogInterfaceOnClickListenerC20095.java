package l;

import android.content.DialogInterface;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩶ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC20095 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f65274;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f65275;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f65276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f65277;

    static {
        ApplicationC6132.m17119(150);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public native void onClick(DialogInterface dialogInterface, int i);

    public DialogInterfaceOnClickListenerC20095(Spinner spinner, C21422 c21422, C12562 c12562, C12562 c12563) {
        this.f65276 = spinner;
        this.f65274 = c21422;
        this.f65275 = c12562;
        this.f65277 = c12563;
    }
}
