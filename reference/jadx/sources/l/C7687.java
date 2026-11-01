package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۟᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7687 extends AbstractDialogInterfaceOnClickListenerC12272 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f25461;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13810 f25462;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25463;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0630 f25464;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7687(C0630 c0630, C11545 c11545, String str, boolean z, String str2, C13810 c13810, C21422 c21422, String str3) {
        super(c11545, str, z, str2);
        this.f25464 = c0630;
        this.f25462 = c13810;
        this.f25461 = c21422;
        this.f25463 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            boolean zM33623 = this.f25462.m33623();
            final C21422 c21422 = this.f25461;
            if (zM33623) {
                C11005.m27761(new InterfaceC17354() { // from class: l.ۤ᩶֨
                    @Override // l.InterfaceC17354
                    public final /* synthetic */ void onCanceled() {
                    }

                    @Override // l.InterfaceC17354
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo6536(C14558 c14558, boolean z) {
                        C7687 c7687 = this.f36003;
                        C0630.m2918(c7687.f25464, c21422, c7687.m30502(), c14558, z);
                    }

                    @Override // l.InterfaceC17354
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ boolean mo6537(Exception exc) {
                        return false;
                    }
                }, c21422.m47980(), this.f25463);
            } else {
                C0630.m2918(this.f25464, c21422, m30502(), null, false);
            }
        }
    }
}
