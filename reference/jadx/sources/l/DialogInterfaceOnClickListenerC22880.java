package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22880 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74418;

    public /* synthetic */ DialogInterfaceOnClickListenerC22880(int i, Object obj) {
        this.f74417 = i;
        this.f74418 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f74417) {
            case 0:
                ActivityC11632.m29000((ActivityC11632) this.f74418);
                break;
            default:
                ((C20409) this.f74418).m46132(-1, false, true);
                break;
        }
    }
}
