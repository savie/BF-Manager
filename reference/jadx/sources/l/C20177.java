package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩶۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20177 implements InterfaceC4001 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f65491;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f65492;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13175 f65493;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17354 f65494;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f65495;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22347 f65496;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f65497;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11392 f65498;

    public C20177(boolean z, C22347 c22347, DialogInterfaceC19356 dialogInterfaceC19356, InterfaceC17354 interfaceC17354, InterfaceC13175 interfaceC13175, C11392 c11392, C14558 c14558, TextView textView) {
        this.f65497 = z;
        this.f65496 = c22347;
        this.f65495 = dialogInterfaceC19356;
        this.f65494 = interfaceC17354;
        this.f65493 = interfaceC13175;
        this.f65498 = c11392;
        this.f65491 = c14558;
        this.f65492 = textView;
    }

    @Override // l.InterfaceC4001
    public final void onSuccess() {
        boolean z = this.f65497;
        InterfaceC17354 interfaceC17354 = this.f65494;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f65495;
        if (z) {
            if (!this.f65496.m49555(dialogInterfaceC19356)) {
                return;
            }
            if (!dialogInterfaceC19356.m44375()) {
                interfaceC17354.onCanceled();
                return;
            }
        }
        this.f65493.mo6719(this.f65498);
        dialogInterfaceC19356.dismiss();
        interfaceC17354.mo6536(this.f65491, false);
    }

    @Override // l.InterfaceC4001
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11496(Exception exc) {
        boolean z = this.f65497;
        InterfaceC17354 interfaceC17354 = this.f65494;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f65495;
        if (z) {
            if (!this.f65496.m49555(dialogInterfaceC19356)) {
                return true;
            }
            if (!dialogInterfaceC19356.m44375()) {
                interfaceC17354.onCanceled();
                return true;
            }
        }
        if (exc instanceof C15721) {
            C23053.m50998(this.f65492, (C15721) exc);
            dialogInterfaceC19356.m44373().setEnabled(false);
            return true;
        }
        return interfaceC17354.mo6537(exc);
    }

    @Override // l.InterfaceC4001
    public final void onCanceled() {
        this.f65495.dismiss();
        this.f65494.onCanceled();
    }
}
