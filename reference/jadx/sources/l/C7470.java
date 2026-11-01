package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f24878;

    public C7470(C17492 c17492) {
        this.f24878 = c17492;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19959(int i) {
        C17492 c17492 = this.f24878;
        View childAt = c17492.getChildAt(i);
        if (childAt != null) {
            c17492.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c17492.removeViewAt(i);
    }
}
