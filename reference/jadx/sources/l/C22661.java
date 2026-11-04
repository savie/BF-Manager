package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22661 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f73581;

    public C22661(C25227 c25227) {
        this.f73581 = c25227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51056(int i) {
        C25227 c25227 = this.f73581;
        View childAt = c25227.getChildAt(i);
        if (childAt != null) {
            c25227.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c25227.removeViewAt(i);
    }
}
