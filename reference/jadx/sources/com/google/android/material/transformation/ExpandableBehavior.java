package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;
import l.AbstractC23790;
import l.C2746;
import l.C5031;
import l.C9679;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC23790 {
    public static final int STATE_COLLAPSED = 2;
    public static final int STATE_EXPANDED = 1;
    public static final int STATE_UNINITIALIZED = 0;
    public int currentState;

    @Override // l.AbstractC23790
    public abstract boolean layoutDependsOn(C2746 c2746, View view, View view2);

    public abstract boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }

    @Override // l.AbstractC23790
    public boolean onLayoutChild(C2746 c2746, final View view, int i) {
        final ExpandableWidget expandableWidgetFindExpandableWidget;
        int i2 = C5031.f17539;
        if (view.isLaidOut() || (expandableWidgetFindExpandableWidget = findExpandableWidget(c2746, view)) == null || !didStateChange(expandableWidgetFindExpandableWidget.isExpanded())) {
            return false;
        }
        final int i3 = expandableWidgetFindExpandableWidget.isExpanded() ? 1 : 2;
        this.currentState = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.currentState == i3) {
                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                    ExpandableWidget expandableWidget = expandableWidgetFindExpandableWidget;
                    expandableBehavior.onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), false);
                }
                return false;
            }
        });
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC23790
    public boolean onDependentViewChanged(C2746 c2746, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!didStateChange(expandableWidget.isExpanded())) {
            return false;
        }
        this.currentState = expandableWidget.isExpanded() ? 1 : 2;
        return onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidget findExpandableWidget(C2746 c2746, View view) {
        List dependencies = c2746.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) dependencies.get(i);
            if (layoutDependsOn(c2746, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    private boolean didStateChange(boolean z) {
        if (!z) {
            return this.currentState == 1;
        }
        int i = this.currentState;
        return i == 0 || i == 2;
    }

    public static ExpandableBehavior from(View view, Class cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C9679)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC23790 abstractC23790M24630 = ((C9679) layoutParams).m24630();
        if (!(abstractC23790M24630 instanceof ExpandableBehavior)) {
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        return (ExpandableBehavior) cls.cast(abstractC23790M24630);
    }
}
