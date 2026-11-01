package l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۧܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes4.dex */
public class C11143 extends C12025 {
    public final C6203 mItemDelegate;
    public final C17492 mRecyclerView;

    public C11143(C17492 c17492) {
        this.mRecyclerView = c17492;
        C12025 itemDelegate = getItemDelegate();
        if (itemDelegate != null && (itemDelegate instanceof C6203)) {
            this.mItemDelegate = (C6203) itemDelegate;
        } else {
            this.mItemDelegate = new C6203(this);
        }
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    @Override // l.C12025
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    @Override // l.C12025
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C22006 c22006) {
        super.onInitializeAccessibilityNodeInfo(view, c22006);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c22006);
    }

    @Override // l.C12025
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof C17492) || shouldIgnore()) {
            return;
        }
        C17492 c17492 = (C17492) view;
        if (c17492.getLayoutManager() != null) {
            c17492.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public C12025 getItemDelegate() {
        return this.mItemDelegate;
    }
}
