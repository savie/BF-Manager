package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ܰۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14433 extends C0067 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6976 f45439;

    @Override // l.AbstractC21169
    public final boolean requestChildRectangleOnScreen(C25227 c25227, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14433(C6976 c6976, Context context) {
        super(context);
        this.f45439 = c6976;
    }

    @Override // l.AbstractC21169
    public final boolean performAccessibilityAction(C2523 c2523, C15529 c15529, int i, Bundle bundle) {
        this.f45439.f23024.getClass();
        return super.performAccessibilityAction(c2523, c15529, i, bundle);
    }

    @Override // l.C0067, l.AbstractC21169
    public final void onInitializeAccessibilityNodeInfo(C2523 c2523, C15529 c15529, C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(c2523, c15529, c19835);
        this.f45439.f23024.getClass();
    }

    @Override // l.AbstractC21169
    public final void onInitializeAccessibilityNodeInfoForItem(C2523 c2523, C15529 c15529, View view, C19835 c19835) {
        C6976 c6976 = this.f45439.f23024.f61358;
        c19835.m45642(C10884.m27635(c6976.m19290() == 1 ? c6976.f23026.getPosition(view) : 0, 1, c6976.m19290() == 0 ? c6976.f23026.getPosition(view) : 0, 1, false, false));
    }

    @Override // l.C0067
    public final void calculateExtraLayoutSpace(C15529 c15529, int[] iArr) {
        int height;
        int paddingBottom;
        C6976 c6976 = this.f45439;
        int iM19283 = c6976.m19283();
        if (iM19283 != -1) {
            C25227 c25227 = c6976.f23017;
            if (c6976.m19290() == 0) {
                height = c25227.getWidth() - c25227.getPaddingLeft();
                paddingBottom = c25227.getPaddingRight();
            } else {
                height = c25227.getHeight() - c25227.getPaddingTop();
                paddingBottom = c25227.getPaddingBottom();
            }
            int i = (height - paddingBottom) * iM19283;
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        super.calculateExtraLayoutSpace(c15529, iArr);
    }
}
