package l;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.᩹᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J634 */
/* JADX INFO: loaded from: classes.dex */
public final class C22516 extends C12025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1348 f73485;

    public C22516(C1348 c1348) {
        this.f73485 = c1348;
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        C1348 c1348 = this.f73485;
        c1348.f5678.onInitializeAccessibilityNodeInfo(view, c22006);
        int childAdapterPosition = c1348.f5679.getChildAdapterPosition(view);
        AbstractC0414 adapter = c1348.f5679.getAdapter();
        if (adapter instanceof C23803) {
            ((C23803) adapter).m52448(childAdapterPosition);
        }
    }

    @Override // l.C12025
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f73485.f5678.performAccessibilityAction(view, i, bundle);
    }
}
