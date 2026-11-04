package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩵ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20656 extends AbstractDialogInterfaceOnClickListenerC9777 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f66242;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15102 f66243;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f66244;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14688 f66245;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20656(C14688 c14688, C8614 c8614, String str, boolean z, String str2, C15102 c15102, C12915 c12915, String str3) {
        super(c8614, str, z, str2);
        this.f66245 = c14688;
        this.f66243 = c15102;
        this.f66244 = c12915;
        this.f66242 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            final int iM25490 = m25490();
            final int iM25493 = m25493();
            boolean zM36369 = this.f66243.m36369();
            final C12915 c12915 = this.f66244;
            if (zM36369) {
                C0938.m3749(new InterfaceC18837() { // from class: l.ۗܶ۫
                    @Override // l.InterfaceC18837
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ void mo1268() {
                    }

                    @Override // l.InterfaceC18837
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ boolean mo1270(Exception exc) {
                        return false;
                    }

                    @Override // l.InterfaceC18837
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo1269(C9651 c9651, boolean z) {
                        C14688.m35337(this.f12076.f66245, c12915, iM25490, iM25493, c9651, z);
                    }
                }, c12915.m31979(), this.f66242);
            } else {
                C14688.m35337(this.f66245, c12915, iM25490, iM25493, null, false);
            }
        }
    }
}
