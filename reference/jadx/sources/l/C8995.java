package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8995 implements InterfaceC17354 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16051 f30768;

    public C8995(AbstractC16051 abstractC16051) {
        this.f30768 = abstractC16051;
    }

    @Override // l.InterfaceC17354
    public final void onCanceled() {
        this.f30768.mo17179();
    }

    @Override // l.InterfaceC17354
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6537(Exception exc) {
        this.f30768.f51937.m28824().m31002(exc, new DialogInterface.OnDismissListener() { // from class: l.᩵ܽ֨
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f62896.f30768.mo17179();
            }
        });
        return true;
    }

    @Override // l.InterfaceC17354
    /* JADX INFO: renamed from: ۙ */
    public final void mo6536(C14558 c14558, boolean z) {
        new C20989(this.f30768, c14558, z).m10243();
    }
}
