package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩳ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18270 extends AbstractDialogInterfaceOnClickListenerC12272 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58292;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13810 f58293;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f58294;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f58295;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9099 f58296;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18270(C9099 c9099, C11545 c11545, String str, boolean z, String str2, C21422 c21422, C13810 c13810, String str3, AbstractC20745 abstractC20745) {
        super(c11545, str, z, str2);
        this.f58296 = c9099;
        this.f58294 = c21422;
        this.f58293 = c13810;
        this.f58292 = str3;
        this.f58295 = abstractC20745;
        if (c21422.m47975() == 1) {
            m30500(c21422.m47981().getName());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final C21422 c21422 = this.f58294;
        final String strM30503 = c21422.m47975() == 1 ? m30503() : "";
        if (i == -1) {
            final int iM30498 = m30498();
            final int iM30502 = m30502();
            final boolean zM30501 = m30501();
            boolean zM33623 = this.f58293.m33623();
            final AbstractC20745 abstractC20745 = this.f58295;
            if (zM33623) {
                C11005.m27761(new InterfaceC17354() { // from class: l.᩸᩶֨
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
                        C9099.m23440(this.f70591.f58296, c21422, abstractC20745, iM30498, iM30502, zM30501, strM30503, c14558, z);
                    }
                }, c21422.m47980(), this.f58292);
            } else {
                C9099.m23440(this.f58296, c21422, abstractC20745, iM30498, iM30502, zM30501, strM30503, null, false);
            }
        }
    }
}
