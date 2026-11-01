package l;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩺ۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes.dex */
public final class C22911 extends C12025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19383 f74480;

    public C22911(C19383 c19383) {
        this.f74480 = c19383;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // l.C12025
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC14217 abstractC14217;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(C19383.class.getName());
        C19383 c19383 = this.f74480;
        AbstractC14217 abstractC14218 = c19383.f62507;
        if (abstractC14218 != null) {
            z = abstractC14218.mo4245() > 1;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() != 4096 || (abstractC14217 = c19383.f62507) == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC14217.mo4245());
        accessibilityEvent.setFromIndex(c19383.f62481);
        accessibilityEvent.setToIndex(c19383.f62481);
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityNodeInfo(View view, C22006 c22006) {
        super.onInitializeAccessibilityNodeInfo(view, c22006);
        c22006.m48844((CharSequence) C19383.class.getName());
        C19383 c19383 = this.f74480;
        AbstractC14217 abstractC14217 = c19383.f62507;
        c22006.m48878(abstractC14217 != null && abstractC14217.mo4245() > 1);
        if (c19383.canScrollHorizontally(1)) {
            c22006.m48838(4096);
        }
        if (c19383.canScrollHorizontally(-1)) {
            c22006.m48838(8192);
        }
    }

    @Override // l.C12025
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C19383 c19383 = this.f74480;
        if (i == 4096) {
            if (!c19383.canScrollHorizontally(1)) {
                return false;
            }
            c19383.m44413(c19383.f62481 + 1);
            return true;
        }
        if (i != 8192 || !c19383.canScrollHorizontally(-1)) {
            return false;
        }
        c19383.m44413(c19383.f62481 - 1);
        return true;
    }
}
