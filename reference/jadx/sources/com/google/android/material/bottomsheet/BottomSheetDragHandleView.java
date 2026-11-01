package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import l.AbstractC23790;
import l.AbstractC6483;
import l.C12025;
import l.C16621;
import l.C17910;
import l.C18616;
import l.C2387;
import l.C2830;
import l.C5031;
import l.C9494;
import l.C9679;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDragHandleView extends C2830 implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final int DEF_STYLE_RES = C18616.f59747;
    public final AccessibilityManager accessibilityManager;
    public boolean accessibilityServiceEnabled;
    public BottomSheetBehavior bottomSheetBehavior;
    public final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    public final String clickFeedback;
    public final String clickToCollapseActionLabel;
    public boolean clickToExpand;
    public final String clickToExpandActionLabel;
    public boolean interactable;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2387.f8815);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.clickToExpandActionLabel = getResources().getString(C17910.f56825);
        this.clickToCollapseActionLabel = getResources().getString(C17910.f56889);
        this.clickFeedback = getResources().getString(C17910.f56791);
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) {
                BottomSheetDragHandleView.this.onBottomSheetStateChanged(i2);
            }
        };
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        updateInteractableState();
        C5031.m13990(this, new C12025() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // l.C12025
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                }
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.accessibilityServiceEnabled = z;
        updateInteractableState();
    }

    private void setBottomSheetBehavior(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        updateInteractableState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i) {
        if (i == 4) {
            this.clickToExpand = true;
        } else if (i == 3) {
            this.clickToExpand = false;
        }
        C5031.m13988(this, C9494.f32123, this.clickToExpand ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel, new C16621(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, AbstractC6483 abstractC6483) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    private void updateInteractableState() {
        this.interactable = this.accessibilityServiceEnabled && this.bottomSheetBehavior != null;
        int i = this.bottomSheetBehavior == null ? 2 : 1;
        int i2 = C5031.f17539;
        setImportantForAccessibility(i);
        setClickable(this.interactable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        boolean z = false;
        if (!this.interactable) {
            return false;
        }
        announceAccessibilityEvent(this.clickFeedback);
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i = 6;
        if (state != 4) {
            if (state == 3) {
                if (!z) {
                }
            } else if (this.clickToExpand) {
                i = 3;
            }
            i = 4;
        } else if (!z) {
            i = 3;
        }
        this.bottomSheetBehavior.setState(i);
        return true;
    }

    private void announceAccessibilityEvent(String str) {
        if (this.accessibilityManager == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        this.accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    private BottomSheetBehavior findParentBottomSheetBehavior() {
        View parentView = this;
        while (true) {
            parentView = getParentView(parentView);
            if (parentView == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = parentView.getLayoutParams();
            if (layoutParams instanceof C9679) {
                AbstractC23790 abstractC23790M24630 = ((C9679) layoutParams).m24630();
                if (abstractC23790M24630 instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) abstractC23790M24630;
                }
            }
        }
    }

    public static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
