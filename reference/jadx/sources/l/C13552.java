package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ܰۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13552 extends C13115 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21312 f44724;

    @Override // l.AbstractC5498
    public final boolean requestChildRectangleOnScreen(C17492 c17492, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13552(C21312 c21312, Context context) {
        super(context);
        this.f44724 = c21312;
    }

    @Override // l.AbstractC5498
    public final boolean performAccessibilityAction(C21726 c21726, C16082 c16082, int i, Bundle bundle) {
        this.f44724.f69351.getClass();
        return super.performAccessibilityAction(c21726, c16082, i, bundle);
    }

    @Override // l.AbstractC5498
    public final void onInitializeAccessibilityNodeInfo(C21726 c21726, C16082 c16082, C22006 c22006) {
        super.onInitializeAccessibilityNodeInfo(c21726, c16082, c22006);
        this.f44724.f69351.getClass();
    }

    @Override // l.AbstractC5498
    public final void onInitializeAccessibilityNodeInfoForItem(C21726 c21726, C16082 c16082, View view, C22006 c22006) {
        C21312 c21312 = this.f44724.f69351.f3495;
        c22006.m48846(C2249.m6904(c21312.m47796() == 1 ? c21312.f69353.getPosition(view) : 0, 1, c21312.m47796() == 0 ? c21312.f69353.getPosition(view) : 0, 1, false, false));
    }

    @Override // l.C13115
    public final void calculateExtraLayoutSpace(C16082 c16082, int[] iArr) {
        int height;
        int paddingBottom;
        C21312 c21312 = this.f44724;
        int iM47801 = c21312.m47801();
        if (iM47801 != -1) {
            C17492 c17492 = c21312.f69345;
            if (c21312.m47796() == 0) {
                height = c17492.getWidth() - c17492.getPaddingLeft();
                paddingBottom = c17492.getPaddingRight();
            } else {
                height = c17492.getHeight() - c17492.getPaddingTop();
                paddingBottom = c17492.getPaddingBottom();
            }
            int i = (height - paddingBottom) * iM47801;
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        super.calculateExtraLayoutSpace(c16082, iArr);
    }
}
