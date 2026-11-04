package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۛ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6267 extends AbstractDialogInterfaceOnClickListenerC9777 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f21280;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f21281;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21282;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18199 f21283;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15102 f21284;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6267(C18199 c18199, C8614 c8614, String str, boolean z, String str2, C12915 c12915, C15102 c15102, String str3, AbstractC22044 abstractC22044) {
        super(c8614, str, z, str2);
        this.f21283 = c18199;
        this.f21281 = c12915;
        this.f21284 = c15102;
        this.f21282 = str3;
        this.f21280 = abstractC22044;
        if (c12915.m31981() == 1) {
            m25492(c12915.m31989().getName());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final C12915 c12915 = this.f21281;
        final String strM25495 = c12915.m31981() == 1 ? m25495() : "";
        if (i == -1) {
            final int iM25490 = m25490();
            final int iM25493 = m25493();
            final boolean zM25494 = m25494();
            boolean zM36369 = this.f21284.m36369();
            final AbstractC22044 abstractC22044 = this.f21280;
            if (zM36369) {
                C0938.m3749(new InterfaceC18837() { // from class: l.ۨ۠۫
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
                        C18199.m42353(this.f39371.f21283, c12915, abstractC22044, iM25490, iM25493, zM25494, strM25495, c9651, z);
                    }
                }, c12915.m31979(), this.f21282);
            } else {
                C18199.m42353(this.f21283, c12915, abstractC22044, iM25490, iM25493, zM25494, strM25495, null, false);
            }
        }
    }
}
