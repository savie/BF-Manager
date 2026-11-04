package l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes.dex */
public final class C23576 extends AbstractC11641 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20592 f76144;

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final void mo29249(int i) {
    }

    public C23576(C20592 c20592) {
        this.f76144 = c20592;
    }

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final int mo29247() {
        return this.f76144.f73998.size();
    }

    @Override // l.AbstractC11641
    /* JADX INFO: renamed from: ۙ */
    public final void mo29250(int i, float f, int i2) {
        float fM51492;
        C20592 c20592 = this.f76144;
        ArrayList arrayList = c20592.f73998;
        ViewParent parent = ((ImageView) arrayList.get(i)).getParent();
        C15243.m36587((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = ((ViewGroup) parent).getLeft();
        if (i2 != -1) {
            i = i2;
        }
        ViewParent parent2 = ((ImageView) arrayList.get(i)).getParent();
        C15243.m36587((Object) parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        float left2 = ((ViewGroup) parent2).getLeft();
        if (0.0f <= f && f <= 0.1f) {
            fM51492 = c20592.m51492();
        } else if (0.1f <= f && f <= 0.9f) {
            fM51492 = (left2 - left) + c20592.m51492();
        } else {
            left = left2;
            fM51492 = c20592.m51492();
        }
        C4089 c4089 = c20592.f65926;
        if (c4089 != null) {
            c4089.m13166(left);
        }
        C4089 c40810 = c20592.f65922;
        if (c40810 != null) {
            c40810.m13166(fM51492);
        }
    }
}
