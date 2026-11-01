package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19953 extends AbstractDialogInterfaceOnClickListenerC12272 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f63903;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13810 f63904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63905;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5841 f63906;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19953(C5841 c5841, C11545 c11545, String str, boolean z, String str2, C13810 c13810, C21422 c21422, String str3) {
        super(c11545, str, z, str2);
        this.f63906 = c5841;
        this.f63904 = c13810;
        this.f63903 = c21422;
        this.f63905 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            final int iM30498 = m30498();
            final int iM30502 = m30502();
            boolean zM33623 = this.f63904.m33623();
            final C21422 c21422 = this.f63903;
            if (zM33623) {
                C11005.m27761(new InterfaceC17354() { // from class: l.ܺۚ֨
                    @Override // l.InterfaceC17354
                    public final /* synthetic */ void onCanceled() {
                    }

                    @Override // l.InterfaceC17354
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ boolean mo6537(Exception exc) {
                        return false;
                    }

                    @Override // l.InterfaceC17354
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo6536(C14558 c14558, boolean z) {
                        C5841.m16055(this.f51014.f63906, c21422, iM30498, iM30502, c14558, z);
                    }
                }, c21422.m47980(), this.f63905);
            } else {
                C5841.m16055(this.f63906, c21422, iM30498, iM30502, null, false);
            }
        }
    }
}
