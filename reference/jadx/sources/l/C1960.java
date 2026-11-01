package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C1960 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9723 f7373;

    public C1960(C9723 c9723) {
        this.f7373 = c9723;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f7373.f32729.f15848);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        C9723 c9723 = this.f7373;
        interfaceC17314Edit.putString("dex_backup_name", c9723.m40352()).apply();
        C4452 c4452 = c9723.f32729;
        c4452.f15846.m2563(c9723.m40352());
        c4452.f15847 = c4452.f15846.m2562();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C9723 c9723 = this.f7373;
        c9723.m40364();
        C4452 c4452 = c9723.f32729;
        c4452.f15850.notifyDataSetChanged();
        c4452.f15849.m44362();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f7373.f32729.f15848.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
