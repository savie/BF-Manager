package l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ܽᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes5.dex */
public class C17767 extends C22687 {
    public final C17021 mItemDelegate;
    public final C25227 mRecyclerView;

    public C17767(C25227 c25227) {
        this.mRecyclerView = c25227;
        C22687 itemDelegate = getItemDelegate();
        if (itemDelegate != null && (itemDelegate instanceof C17021)) {
            this.mItemDelegate = (C17021) itemDelegate;
        } else {
            this.mItemDelegate = new C17021(this);
        }
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    @Override // l.C22687
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    @Override // l.C22687
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C19835 c19835) {
        super.onInitializeAccessibilityNodeInfo(view, c19835);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c19835);
    }

    @Override // l.C22687
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof C25227) || shouldIgnore()) {
            return;
        }
        C25227 c25227 = (C25227) view;
        if (c25227.getLayoutManager() != null) {
            c25227.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public C22687 getItemDelegate() {
        return this.mItemDelegate;
    }
}
