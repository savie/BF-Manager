package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes.dex */
public final class C23810 implements InterfaceC20581 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8147 f77130;

    public C23810(C8147 c8147) {
        this.f77130 = c8147;
    }

    @Override // l.InterfaceC20581
    public final boolean perform(View view, AbstractC1936 abstractC1936) {
        if (!C8147.m22030(view)) {
            return false;
        }
        C8147 c8147 = this.f77130;
        if (c8147.m22034(view) == 2) {
            return false;
        }
        c8147.m22039(view, true);
        return true;
    }
}
