package l;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ۚۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6J6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5355 extends C23148 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f18791;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5355(C1626 c1626, Context context) {
        super(context);
        this.f18791 = c1626;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1626 c1626 = this.f18791;
        boolean z = false;
        boolean z2 = c1626.f5597 == 1 || c1626.f5594;
        accessibilityNodeInfo.setCheckable(z2);
        if (z2 && isSelected()) {
            z = true;
        }
        accessibilityNodeInfo.setChecked(z);
    }
}
