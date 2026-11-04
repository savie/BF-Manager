package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.֨۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public final class C1053 implements InterfaceC22491 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Rect f3780 = new Rect();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15179 f3781;

    public C1053(C15179 c15179) {
        this.f3781 = c15179;
    }

    @Override // l.InterfaceC22491
    public final C3977 onApplyWindowInsets(View view, C3977 c3977) {
        C3977 c3977M51118 = C22666.m51118(view, c3977);
        if (c3977M51118.m12828()) {
            return c3977M51118;
        }
        int iM12822 = c3977M51118.m12822();
        Rect rect = this.f3780;
        rect.left = iM12822;
        rect.top = c3977M51118.m12824();
        rect.right = c3977M51118.m12814();
        rect.bottom = c3977M51118.m12825();
        C15179 c15179 = this.f3781;
        int childCount = c15179.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3977 c3977M51083 = C22666.m51083(c15179.getChildAt(i), c3977M51118);
            rect.left = Math.min(c3977M51083.m12822(), rect.left);
            rect.top = Math.min(c3977M51083.m12824(), rect.top);
            rect.right = Math.min(c3977M51083.m12814(), rect.right);
            rect.bottom = Math.min(c3977M51083.m12825(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C15163 c15163 = new C15163(c3977M51118);
        c15163.m36480(C13275.m32819(i2, i3, i4, i5));
        return c15163.m36477();
    }
}
