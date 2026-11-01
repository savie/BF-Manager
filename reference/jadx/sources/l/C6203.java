package l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۛܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes3.dex */
public final class C6203 extends C12025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f21087 = new WeakHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11143 f21088;

    public C6203(C11143 c11143) {
        this.f21088 = c11143;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m17207(View view) {
        C12025 c12025M14007 = C5031.m14007(view);
        if (c12025M14007 == null || c12025M14007 == this) {
            return;
        }
        this.f21087.put(view, c12025M14007);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12025 m17208(View view) {
        return (C12025) this.f21087.remove(view);
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C22006 c22006) {
        C11143 c11143 = this.f21088;
        if (!c11143.shouldIgnore() && c11143.mRecyclerView.getLayoutManager() != null) {
            c11143.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c22006);
            C12025 c12025 = (C12025) this.f21087.get(view);
            if (c12025 != null) {
                c12025.onInitializeAccessibilityNodeInfo(view, c22006);
                return;
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c22006);
                return;
            }
        }
        super.onInitializeAccessibilityNodeInfo(view, c22006);
    }

    @Override // l.C12025
    public final boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        C11143 c11143 = this.f21088;
        if (!c11143.shouldIgnore() && c11143.mRecyclerView.getLayoutManager() != null) {
            C12025 c12025 = (C12025) this.f21087.get(view);
            if (c12025 != null) {
                if (c12025.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return c11143.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    @Override // l.C12025
    public final void sendAccessibilityEvent(View view, int i) {
        C12025 c12025 = (C12025) this.f21087.get(view);
        if (c12025 != null) {
            c12025.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // l.C12025
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C12025 c12025 = (C12025) this.f21087.get(view);
        if (c12025 != null) {
            c12025.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // l.C12025
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C12025 c12025 = (C12025) this.f21087.get(view);
        if (c12025 != null) {
            return c12025.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C12025
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C12025 c12025 = (C12025) this.f21087.get(view);
        if (c12025 != null) {
            c12025.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // l.C12025
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C12025 c12025 = (C12025) this.f21087.get(view);
        if (c12025 != null) {
            c12025.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // l.C12025
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C12025 c12025 = (C12025) this.f21087.get(viewGroup);
        if (c12025 != null) {
            return c12025.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // l.C12025
    public final C3660 getAccessibilityNodeProvider(View view) {
        C12025 c12025 = (C12025) this.f21087.get(view);
        if (c12025 != null) {
            return c12025.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }
}
