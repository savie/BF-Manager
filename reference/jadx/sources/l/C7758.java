package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۟۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7758 extends AbstractDialogInterfaceOnClickListenerC9777 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25539;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15102 f25540;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f25541;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2537 f25542;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7758(C2537 c2537, C8614 c8614, String str, boolean z, String str2, C15102 c15102, C12915 c12915, String str3) {
        super(c8614, str, z, str2);
        this.f25542 = c2537;
        this.f25540 = c15102;
        this.f25541 = c12915;
        this.f25539 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            boolean zM36369 = this.f25540.m36369();
            final C12915 c12915 = this.f25541;
            if (zM36369) {
                C0938.m3749(new InterfaceC18837() { // from class: l.֡۠۫
                    @Override // l.InterfaceC18837
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ void mo1268() {
                    }

                    @Override // l.InterfaceC18837
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo1269(C9651 c9651, boolean z) {
                        C7758 c7758 = this.f1628;
                        C2537.m8463(c7758.f25542, c12915, c7758.m25493(), c9651, z);
                    }

                    @Override // l.InterfaceC18837
                    /* JADX INFO: renamed from: ۙ */
                    public final /* synthetic */ boolean mo1270(Exception exc) {
                        return false;
                    }
                }, c12915.m31979(), this.f25539);
            } else {
                C2537.m8463(this.f25542, c12915, m25493(), null, false);
            }
        }
    }
}
