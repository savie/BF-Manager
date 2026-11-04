package l;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.۟ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J634 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7940 extends C22687 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19127 f26372;

    public C7940(C19127 c19127) {
        this.f26372 = c19127;
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(View view, C19835 c19835) {
        C19127 c19127 = this.f26372;
        c19127.f61900.onInitializeAccessibilityNodeInfo(view, c19835);
        int childAdapterPosition = c19127.f61901.getChildAdapterPosition(view);
        AbstractC12964 adapter = c19127.f61901.getAdapter();
        if (adapter instanceof C3465) {
            ((C3465) adapter).m11420(childAdapterPosition);
        }
    }

    @Override // l.C22687
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f26372.f61900.performAccessibilityAction(view, i, bundle);
    }
}
