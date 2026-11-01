package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l.AbstractC23026;
import l.AbstractC23790;
import l.AbstractC3000;
import l.AbstractC6483;
import l.C0443;
import l.C15265;
import l.C17910;
import l.C18616;
import l.C22697;
import l.C2271;
import l.C2746;
import l.C4449;
import l.C5031;
import l.C8033;
import l.C8479;
import l.C9494;
import l.C9679;
import l.InterfaceC8601;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior extends AbstractC23790 implements Sheet {
    public static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = C17910.f56845;
    public static final int DEF_STYLE_RES = C18616.f59655;
    public static final float HIDE_FRICTION = 0.1f;
    public static final float HIDE_THRESHOLD = 0.5f;
    public static final int NO_MAX_SIZE = -1;
    public static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public ColorStateList backgroundTint;
    public final Set callbacks;
    public int childWidth;
    public int coplanarSiblingViewId;
    public WeakReference coplanarSiblingViewRef;
    public final AbstractC23026 dragCallback;
    public boolean draggable;
    public float elevation;
    public float hideFriction;
    public boolean ignoreEvents;
    public int initialX;
    public int innerMargin;
    public int lastStableState;
    public MaterialShapeDrawable materialShapeDrawable;
    public float maximumVelocity;
    public int parentInnerEdge;
    public int parentWidth;
    public ShapeAppearanceModel shapeAppearanceModel;
    public SheetDelegate sheetDelegate;
    public MaterialSideContainerBackHelper sideContainerBackHelper;
    public int state;
    public final StateSettlingTracker stateSettlingTracker;
    public VelocityTracker velocityTracker;
    public C15265 viewDragHelper;
    public WeakReference viewRef;

    public float getHideThreshold() {
        return 0.5f;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new AbstractC23026() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // l.AbstractC23026
            public boolean tryCaptureView(View view, int i) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }

            @Override // l.AbstractC23026
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i);
            }

            @Override // l.AbstractC23026
            public void onViewDragStateChanged(int i) {
                if (i == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // l.AbstractC23026
            public void onViewReleased(View view, float f, float f2) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f, f2);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // l.AbstractC23026
            public int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            @Override // l.AbstractC23026
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return C4449.m12402(i, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // l.AbstractC23026
            public int getViewHorizontalDragRange(View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }
        };
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new AbstractC23026() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // l.AbstractC23026
            public boolean tryCaptureView(View view, int i) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }

            @Override // l.AbstractC23026
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i);
            }

            @Override // l.AbstractC23026
            public void onViewDragStateChanged(int i) {
                if (i == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // l.AbstractC23026
            public void onViewReleased(View view, float f, float f2) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f, f2);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // l.AbstractC23026
            public int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            @Override // l.AbstractC23026
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return C4449.m12402(i, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // l.AbstractC23026
            public int getViewHorizontalDragRange(View view) {
                return SideSheetBehavior.this.childWidth + SideSheetBehavior.this.getInnerMargin();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8033.f26504);
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f27303)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C8033.f27303);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f28047)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        if (typedArrayObtainStyledAttributes.hasValue(C8033.f26825)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(C8033.f26825, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C8033.f26718, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(C8033.f26611, true));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void setSheetEdge(View view, int i) {
        setSheetEdge(Gravity.getAbsoluteGravity(((C9679) view.getLayoutParams()).f32632, i) == 3 ? 1 : 0);
    }

    private void setSheetEdge(int i) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i) {
            if (i == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(C2271.m6966(i, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
            }
            this.sheetDelegate = new LeftSheetDelegate(this);
            if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                return;
            }
            ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
            builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
            updateMaterialShapeDrawable(builder2.build());
        }
    }

    private int getGravityFromSheetEdge() {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        return (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) ? 5 : 3;
    }

    private boolean hasRightMargin() {
        C9679 viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0;
    }

    private boolean hasLeftMargin() {
        C9679 viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0;
    }

    private C9679 getViewLayoutParams() {
        View view;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof C9679)) {
            return null;
        }
        return (C9679) view.getLayoutParams();
    }

    private void updateMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public void expand() {
        setState(3);
    }

    public void hide() {
        setState(5);
    }

    @Override // l.AbstractC23790
    public Parcelable onSaveInstanceState(C2746 c2746, View view) {
        return new SavedState(super.onSaveInstanceState(c2746, view), this);
    }

    @Override // l.AbstractC23790
    public void onRestoreInstanceState(C2746 c2746, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(c2746, view, savedState.getSuperState());
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.state = i;
        this.lastStableState = i;
    }

    @Override // l.AbstractC23790
    public void onAttachedToLayoutParams(C9679 c9679) {
        super.onAttachedToLayoutParams(c9679);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // l.AbstractC23790
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // l.AbstractC23790
    public boolean onMeasureChild(C2746 c2746, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, c2746.getPaddingRight() + c2746.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), getChildMeasureSpec(i3, c2746.getPaddingBottom() + c2746.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // l.AbstractC23790
    public boolean onLayoutChild(C2746 c2746, View view, int i) {
        int i2 = C5031.f17539;
        if (c2746.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference(view);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(view);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable == null) {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    C5031.m13984(view, colorStateList);
                }
            } else {
                view.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float fM14006 = this.elevation;
                if (fM14006 == -1.0f) {
                    fM14006 = C5031.m14006(view);
                }
                materialShapeDrawable2.setElevation(fM14006);
            }
            updateSheetVisibility(view);
            updateAccessibilityActions();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            ensureAccessibilityPaneTitleIsSet(view);
        }
        setSheetEdge(view, i);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C15265.m36542(c2746, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(view);
        c2746.onLayoutChild(view, i);
        this.parentWidth = c2746.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(c2746);
        this.childWidth = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.calculateInnerMargin(marginLayoutParams) : 0;
        C5031.m14009(calculateCurrentOffset(outerEdge, view), view);
        maybeAssignCoplanarSiblingViewBasedId(c2746);
        for (SheetCallback sheetCallback : this.callbacks) {
            if (sheetCallback instanceof SideSheetCallback) {
                ((SideSheetCallback) sheetCallback).onLayout(view);
            }
        }
        return true;
    }

    private void updateSheetVisibility(View view) {
        int i = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (C5031.m13972(view) == null) {
            C5031.m13986(view, (CharSequence) view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(C2746 c2746) {
        int i;
        View viewFindViewById;
        if (this.coplanarSiblingViewRef != null || (i = this.coplanarSiblingViewId) == -1 || (viewFindViewById = c2746.findViewById(i)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference(viewFindViewById);
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    private int calculateCurrentOffset(int i, View view) {
        int i2 = this.state;
        if (i2 == 1 || i2 == 2) {
            return i - this.sheetDelegate.getOuterEdge(view);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalStateException("Unexpected value: " + this.state);
    }

    @Override // l.AbstractC23790
    public boolean onInterceptTouchEvent(C2746 c2746, View view, MotionEvent motionEvent) {
        C15265 c15265;
        if (!shouldInterceptTouchEvent(view)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        } else {
            this.initialX = (int) motionEvent.getX();
        }
        return (this.ignoreEvents || (c15265 = this.viewDragHelper) == null || !c15265.m36569(motionEvent)) ? false : true;
    }

    private boolean shouldInterceptTouchEvent(View view) {
        return (view.isShown() || C5031.m13972(view) != null) && this.draggable;
    }

    @Override // l.AbstractC23790
    public boolean onTouchEvent(C2746 c2746, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.m36559(motionEvent);
        }
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.m36558(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
        }
        return !this.ignoreEvents;
    }

    private boolean isDraggedFarEnough(MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.m36564());
    }

    private float calculateDragDistance(float f, float f2) {
        return Math.abs(f - f2);
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(C22697.m50267(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            runAfterLayout((View) this.viewRef.get(), new Runnable() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setState$0(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i) {
        View view = (View) this.viewRef.get();
        if (view != null) {
            startSettling(view, i, false);
        }
    }

    private void runAfterLayout(View view, Runnable runnable) {
        if (isLayingOut(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean isLayingOut(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested()) {
            return false;
        }
        int i = C5031.f17539;
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    public void setStateInternal(int i) {
        View view;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 3 || i == 5) {
            this.lastStableState = i;
        }
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(view);
        Iterator it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).onStateChanged(view, i);
        }
        updateAccessibilityActions();
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    public boolean shouldHide(View view, float f) {
        return this.sheetDelegate.shouldHide(view, f);
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        if (isSettling(view, i, z)) {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i);
        } else {
            setStateInternal(i);
        }
    }

    private boolean isSettling(View view, int i, boolean z) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i);
        C15265 viewDragHelper = getViewDragHelper();
        if (viewDragHelper == null) {
            return false;
        }
        if (z) {
            return viewDragHelper.m36567(outerEdgeOffsetForState, view.getTop());
        }
        return viewDragHelper.m36560(view, outerEdgeOffsetForState, view.getTop());
    }

    public int getOuterEdgeOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalArgumentException(C8479.m22141(i, "Invalid state to get outer edge offset: "));
    }

    public C15265 getViewDragHelper() {
        return this.viewDragHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(View view, float f, float f2) {
        if (isExpandingOutwards(f)) {
            return 3;
        }
        if (shouldHide(view, f)) {
            return (this.sheetDelegate.isSwipeSignificant(f, f2) || this.sheetDelegate.isReleasedCloseToInnerEdge(view)) ? 5 : 3;
        }
        if (f != 0.0f && SheetUtils.isSwipeMostlyHorizontal(f, f2)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.getHiddenOffset()) ? 3 : 5;
    }

    private boolean isExpandingOutwards(float f) {
        return this.sheetDelegate.isExpandingOutwards(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(View view, int i) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i);
        Iterator it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).onSlide(view, fCalculateSlideOffset);
        }
    }

    public void setCoplanarSiblingViewId(int i) {
        this.coplanarSiblingViewId = i;
        clearCoplanarSiblingView();
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i != -1) {
                int i2 = C5031.f17539;
                if (view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
    }

    public void setCoplanarSiblingView(View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference(view);
        WeakReference weakReference = this.viewRef;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            int i = C5031.f17539;
            if (view2.isLaidOut()) {
                view2.requestLayout();
            }
        }
    }

    public View getCoplanarSiblingView() {
        WeakReference weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private void clearCoplanarSiblingView() {
        WeakReference weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(C0443 c0443) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(c0443);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C0443 c0443) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(c0443, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((view.getScaleX() * this.childWidth) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        C0443 c0443OnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (c0443OnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(c0443OnHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.setStateInternal(5);
                    if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        }
    }

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public class StateSettlingTracker {
        public final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        public boolean isContinueSettlingRunnablePosted;
        public int targetState;

        public StateSettlingTracker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper == null || !SideSheetBehavior.this.viewDragHelper.m36552()) {
                if (SideSheetBehavior.this.state == 2) {
                    SideSheetBehavior.this.setStateInternal(this.targetState);
                    return;
                }
                return;
            }
            continueSettlingToState(this.targetState);
        }

        public void continueSettlingToState(int i) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            View view = (View) SideSheetBehavior.this.viewRef.get();
            Runnable runnable = this.continueSettlingRunnable;
            int i2 = C5031.f17539;
            view.postOnAnimation(runnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public class SavedState extends AbstractC3000 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.state = sideSheetBehavior.state;
        }

        @Override // l.AbstractC3000, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    public static SideSheetBehavior from(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C9679)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC23790 abstractC23790M24630 = ((C9679) layoutParams).m24630();
        if (!(abstractC23790M24630 instanceof SideSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior) abstractC23790M24630;
    }

    private void updateAccessibilityActions() {
        View view;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        C5031.m13973(262144, view);
        C5031.m13973(1048576, view);
        if (this.state != 5) {
            replaceAccessibilityActionForState(view, C9494.f32118, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(view, C9494.f32115, 3);
        }
    }

    private void replaceAccessibilityActionForState(View view, C9494 c9494, int i) {
        C5031.m13988(view, c9494, null, createAccessibilityViewCommandForState(i));
    }

    private InterfaceC8601 createAccessibilityViewCommandForState(final int i) {
        return new InterfaceC8601() { // from class: com.google.android.material.sidesheet.SideSheetBehavior$$ExternalSyntheticLambda1
            @Override // l.InterfaceC8601
            public final boolean perform(View view, AbstractC6483 abstractC6483) {
                return this.f$0.lambda$createAccessibilityViewCommandForState$2(i, view, abstractC6483);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i, View view, AbstractC6483 abstractC6483) {
        setState(i);
        return true;
    }
}
