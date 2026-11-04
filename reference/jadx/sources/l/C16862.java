package l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܺ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes5.dex */
public final class C16862 extends AbstractC11641 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17608 f54406;

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final void mo29249(int i) {
    }

    public C16862(C17608 c17608) {
        this.f54406 = c17608;
    }

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final int mo29247() {
        return this.f54406.f73998.size();
    }

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final void mo29250(int i, float f, int i2) {
        C17608 c17608 = this.f54406;
        float fM51491 = (c17608.m51491() * 2) + c17608.m51492();
        ViewParent parent = ((ImageView) c17608.f73998.get(i)).getParent();
        C15243.m36587((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = (fM51491 * f) + ((ViewGroup) parent).getLeft();
        C4089 c4089 = c17608.f57141;
        if (c4089 != null) {
            c4089.m13166(left);
        }
    }
}
