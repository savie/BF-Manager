package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܰ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C14622 implements InterfaceC18837 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7911 f46062;

    public C14622(AbstractC7911 abstractC7911) {
        this.f46062 = abstractC7911;
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268() {
        this.f46062.mo21451();
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1270(Exception exc) {
        this.f46062.f26276.m23233().m40401(exc, new DialogInterface.OnDismissListener() { // from class: l.ۘ۬۫
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14180.f46062.mo21451();
            }
        });
        return true;
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final void mo1269(C9651 c9651, boolean z) {
        new C0453(this.f46062, c9651, z).m8197();
    }
}
