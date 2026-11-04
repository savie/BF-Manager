package l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܺᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes5.dex */
public final class C17021 extends C22687 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f55594 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17767 f55595;

    public C17021(C17767 c17767) {
        this.f55595 = c17767;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40119(View view) {
        C22687 c22687M51119 = C22666.m51119(view);
        if (c22687M51119 == null || c22687M51119 == this) {
            return;
        }
        this.f55594.put(view, c22687M51119);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22687 m40120(View view) {
        return (C22687) this.f55594.remove(view);
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C19835 c19835) {
        C17767 c17767 = this.f55595;
        if (!c17767.shouldIgnore() && c17767.mRecyclerView.getLayoutManager() != null) {
            c17767.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c19835);
            C22687 c22687 = (C22687) this.f55594.get(view);
            if (c22687 != null) {
                c22687.onInitializeAccessibilityNodeInfo(view, c19835);
                return;
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c19835);
                return;
            }
        }
        super.onInitializeAccessibilityNodeInfo(view, c19835);
    }

    @Override // l.C22687
    public final boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        C17767 c17767 = this.f55595;
        if (!c17767.shouldIgnore() && c17767.mRecyclerView.getLayoutManager() != null) {
            C22687 c22687 = (C22687) this.f55594.get(view);
            if (c22687 != null) {
                if (c22687.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return c17767.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    @Override // l.C22687
    public final void sendAccessibilityEvent(View view, int i) {
        C22687 c22687 = (C22687) this.f55594.get(view);
        if (c22687 != null) {
            c22687.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // l.C22687
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C22687 c22687 = (C22687) this.f55594.get(view);
        if (c22687 != null) {
            c22687.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // l.C22687
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C22687 c22687 = (C22687) this.f55594.get(view);
        if (c22687 != null) {
            return c22687.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C22687
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C22687 c22687 = (C22687) this.f55594.get(view);
        if (c22687 != null) {
            c22687.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // l.C22687
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C22687 c22687 = (C22687) this.f55594.get(view);
        if (c22687 != null) {
            c22687.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // l.C22687
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C22687 c22687 = (C22687) this.f55594.get(viewGroup);
        if (c22687 != null) {
            return c22687.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // l.C22687
    public final C5665 getAccessibilityNodeProvider(View view) {
        C22687 c22687 = (C22687) this.f55594.get(view);
        if (c22687 != null) {
            return c22687.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }
}
