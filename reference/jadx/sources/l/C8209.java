package l;

import android.view.View;

/* JADX INFO: renamed from: l.۠ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8209 implements InterfaceC8601 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17381 f28587;

    public C8209(C17381 c17381) {
        this.f28587 = c17381;
    }

    @Override // l.InterfaceC8601
    public final boolean perform(View view, AbstractC6483 abstractC6483) {
        if (!C17381.m40472(view)) {
            return false;
        }
        C17381 c17381 = this.f28587;
        if (c17381.m40474(view) == 2) {
            return false;
        }
        c17381.m40479(view, true);
        return true;
    }
}
