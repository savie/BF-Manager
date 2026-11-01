package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes2.dex */
public class C5444 extends ViewGroup {
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    public static final boolean MEASURE = false;
    public static final String TAG = "ConstraintLayout";
    public static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray mChildrenByIds;
    public ArrayList mConstraintHelpers;
    public C13206 mConstraintLayoutSpec;
    public C18144 mConstraintSet;
    public int mConstraintSetId;
    public AbstractC19556 mConstraintsChangedListener;
    public HashMap mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C15781 mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C2621 mMeasurer;
    public C22130 mMetrics;
    public int mMinHeight;
    public int mMinWidth;
    public int mOnMeasureHeightMeasureSpec;
    public int mOnMeasureWidthMeasureSpec;
    public int mOptimizationLevel;
    public SparseArray mTempMapIdToWidget;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public C5444(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C15781();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C2621(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m15064(null, 0, 0);
    }

    public C5444(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C15781();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C2621(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m15064(attributeSet, 0, 0);
    }

    public C5444(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C15781();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C2621(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m15064(attributeSet, i, 0);
    }

    @TargetApi(21)
    public C5444(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C15781();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C2621(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m15064(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15064(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m46588(this);
        this.mLayoutWidget.m37527(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51890, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 90) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C18144 c18144 = new C18144();
                        this.mConstraintSet = c18144;
                        c18144.m42243(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m37531(this.mOptimizationLevel);
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C13206(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C20719 viewWidget = getViewWidget(view);
        if ((view instanceof C10384) && !(viewWidget instanceof C12253)) {
            C11795 c11795 = (C11795) view.getLayoutParams();
            C12253 c12253 = new C12253();
            c11795.f39661 = c12253;
            c11795.f39625 = true;
            c12253.m30470(c11795.f39607);
        }
        if (view instanceof AbstractC3472) {
            AbstractC3472 abstractC3472 = (AbstractC3472) view;
            abstractC3472.m10202();
            ((C11795) view.getLayoutParams()).f39660 = true;
            if (!this.mConstraintHelpers.contains(abstractC3472)) {
                this.mConstraintHelpers.add(abstractC3472);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C20719 viewWidget = getViewWidget(view);
        this.mLayoutWidget.f76249.remove(viewWidget);
        viewWidget.mo37523();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m15060() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            m15065();
        }
        return z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m15065() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C20719 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo37523();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m15063(childAt.getId()).m46589(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C8267)) {
                    C8267 c8267 = (C8267) childAt2;
                    if (c8267.f28740 == null) {
                        c8267.f28740 = new C18144();
                    }
                    c8267.f28740.m42247(c8267);
                    this.mConstraintSet = c8267.f28740;
                }
            }
        }
        C18144 c18144 = this.mConstraintSet;
        if (c18144 != null) {
            c18144.m42256(this);
        }
        this.mLayoutWidget.f76249.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC3472) this.mConstraintHelpers.get(i4)).m10195(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C7561) {
                ((C7561) childAt3).m20081(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C20719 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C11795 c11795 = (C11795) childAt5.getLayoutParams();
                C15781 c15781 = this.mLayoutWidget;
                c15781.f76249.add(viewWidget2);
                C20719 c20719 = viewWidget2.f67433;
                if (c20719 != null) {
                    ((C23542) c20719).f76249.remove(viewWidget2);
                    viewWidget2.mo37523();
                }
                viewWidget2.f67433 = c15781;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, c11795, this.mTempMapIdToWidget);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void applyConstraintsFromLayoutParams(boolean z, View view, C20719 c20719, C11795 c11795, SparseArray sparseArray) {
        float f;
        C20719 c207110;
        boolean z2;
        boolean z3;
        C20719 c207111;
        int i;
        int i2;
        C20719 c207112;
        int i3;
        int i4;
        C20719 c207113;
        int i5;
        float f2;
        ?? r2;
        float f3;
        View view2;
        C20719 c207114;
        C20719 c207115;
        C20719 c207116;
        C20719 c207117;
        int i6;
        c11795.m29478();
        c20719.m46636(view.getVisibility());
        if (c11795.f39635) {
            c20719.m46617();
            c20719.m46636(8);
        }
        c20719.m46588(view);
        if (view instanceof AbstractC3472) {
            ((AbstractC3472) view).mo8331(c20719, this.mLayoutWidget.m37538());
        }
        if (c11795.f39625) {
            C12253 c12253 = (C12253) c20719;
            int i7 = c11795.f39637;
            int i8 = c11795.f39655;
            float f4 = c11795.f39645;
            if (f4 != -1.0f) {
                c12253.m30466(f4);
                return;
            } else if (i7 != -1) {
                c12253.m30464(i7);
                return;
            } else {
                if (i8 != -1) {
                    c12253.m30471(i8);
                    return;
                }
                return;
            }
        }
        int i9 = c11795.f39619;
        int i10 = c11795.f39649;
        int i11 = c11795.f39621;
        int i12 = c11795.f39624;
        int i13 = c11795.f39615;
        int i14 = c11795.f39659;
        float f5 = c11795.f39647;
        int i15 = c11795.f39610;
        if (i15 != -1) {
            C20719 c207118 = (C20719) sparseArray.get(i15);
            if (c207118 != null) {
                c20719.m46597(c207118, c11795.f39603, c11795.f39656);
            }
            f3 = 0.0f;
            r2 = 1;
        } else {
            if (i9 != -1) {
                C20719 c207119 = (C20719) sparseArray.get(i9);
                if (c207119 != null) {
                    EnumC19308 enumC19308 = EnumC19308.LEFT;
                    f = 0.0f;
                    c20719.m46596(enumC19308, c207119, enumC19308, ((ViewGroup.MarginLayoutParams) c11795).leftMargin, i13);
                } else {
                    z2 = true;
                    f = 0.0f;
                }
                if (i11 != -1) {
                    c207117 = (C20719) sparseArray.get(i11);
                    if (c207117 != null) {
                        z3 = z2;
                        c20719.m46596(EnumC19308.RIGHT, c207117, EnumC19308.LEFT, ((ViewGroup.MarginLayoutParams) c11795).rightMargin, i14);
                    } else {
                        z3 = z2;
                    }
                } else {
                    z3 = z2;
                    if (i12 != -1 && (c207111 = (C20719) sparseArray.get(i12)) != null) {
                        EnumC19308 enumC19309 = EnumC19308.RIGHT;
                        c20719.m46596(enumC19309, c207111, enumC19309, ((ViewGroup.MarginLayoutParams) c11795).rightMargin, i14);
                    }
                }
                i = c11795.f39641;
                if (i != -1) {
                    c207116 = (C20719) sparseArray.get(i);
                    if (c207116 != null) {
                        EnumC19308 enumC193010 = EnumC19308.TOP;
                        c20719.m46596(enumC193010, c207116, enumC193010, ((ViewGroup.MarginLayoutParams) c11795).topMargin, c11795.f39652);
                    }
                } else {
                    i2 = c11795.f39599;
                    if (i2 != -1 && (c207112 = (C20719) sparseArray.get(i2)) != null) {
                        c20719.m46596(EnumC19308.TOP, c207112, EnumC19308.BOTTOM, ((ViewGroup.MarginLayoutParams) c11795).topMargin, c11795.f39652);
                    }
                }
                i3 = c11795.f39627;
                if (i3 != -1) {
                    c207115 = (C20719) sparseArray.get(i3);
                    if (c207115 != null) {
                        c20719.m46596(EnumC19308.BOTTOM, c207115, EnumC19308.TOP, ((ViewGroup.MarginLayoutParams) c11795).bottomMargin, c11795.f39618);
                    }
                } else {
                    i4 = c11795.f39633;
                    if (i4 != -1 && (c207113 = (C20719) sparseArray.get(i4)) != null) {
                        EnumC19308 enumC193011 = EnumC19308.BOTTOM;
                        c20719.m46596(enumC193011, c207113, enumC193011, ((ViewGroup.MarginLayoutParams) c11795).bottomMargin, c11795.f39618);
                    }
                }
                i5 = c11795.f39608;
                if (i5 != -1) {
                    view2 = (View) this.mChildrenByIds.get(i5);
                    c207114 = (C20719) sparseArray.get(c11795.f39608);
                    if (c207114 != null && view2 != null && (view2.getLayoutParams() instanceof C11795)) {
                        C11795 c11796 = (C11795) view2.getLayoutParams();
                        c11795.f39632 = z3;
                        c11796.f39632 = z3;
                        EnumC19308 enumC193012 = EnumC19308.BASELINE;
                        c20719.mo30461(enumC193012).m22574(c207114.mo30461(enumC193012), 0, -1, z3);
                        c20719.m46598(z3);
                        c11796.f39661.m46598(z3);
                        c20719.mo30461(EnumC19308.TOP).m22576();
                        c20719.mo30461(EnumC19308.BOTTOM).m22576();
                    }
                }
                if (f5 >= f) {
                    c20719.m46585(f5);
                }
                f2 = c11795.f39630;
                if (f2 >= f) {
                    c20719.m46623(f2);
                }
                r2 = z3;
                f3 = f;
            } else {
                f = 0.0f;
                if (i10 != -1 && (c207110 = (C20719) sparseArray.get(i10)) != null) {
                    c20719.m46596(EnumC19308.LEFT, c207110, EnumC19308.RIGHT, ((ViewGroup.MarginLayoutParams) c11795).leftMargin, i13);
                }
            }
            z2 = true;
            if (i11 != -1) {
                c207117 = (C20719) sparseArray.get(i11);
                if (c207117 != null) {
                    z3 = z2;
                    c20719.m46596(EnumC19308.RIGHT, c207117, EnumC19308.LEFT, ((ViewGroup.MarginLayoutParams) c11795).rightMargin, i14);
                } else {
                    z3 = z2;
                }
            } else {
                z3 = z2;
                if (i12 != -1) {
                    EnumC19308 enumC193013 = EnumC19308.RIGHT;
                    c20719.m46596(enumC193013, c207111, enumC193013, ((ViewGroup.MarginLayoutParams) c11795).rightMargin, i14);
                }
            }
            i = c11795.f39641;
            if (i != -1) {
                c207116 = (C20719) sparseArray.get(i);
                if (c207116 != null) {
                    EnumC19308 enumC193014 = EnumC19308.TOP;
                    c20719.m46596(enumC193014, c207116, enumC193014, ((ViewGroup.MarginLayoutParams) c11795).topMargin, c11795.f39652);
                }
            } else {
                i2 = c11795.f39599;
                if (i2 != -1) {
                    c20719.m46596(EnumC19308.TOP, c207112, EnumC19308.BOTTOM, ((ViewGroup.MarginLayoutParams) c11795).topMargin, c11795.f39652);
                }
            }
            i3 = c11795.f39627;
            if (i3 != -1) {
                c207115 = (C20719) sparseArray.get(i3);
                if (c207115 != null) {
                    c20719.m46596(EnumC19308.BOTTOM, c207115, EnumC19308.TOP, ((ViewGroup.MarginLayoutParams) c11795).bottomMargin, c11795.f39618);
                }
            } else {
                i4 = c11795.f39633;
                if (i4 != -1) {
                    EnumC19308 enumC193015 = EnumC19308.BOTTOM;
                    c20719.m46596(enumC193015, c207113, enumC193015, ((ViewGroup.MarginLayoutParams) c11795).bottomMargin, c11795.f39618);
                }
            }
            i5 = c11795.f39608;
            if (i5 != -1) {
                view2 = (View) this.mChildrenByIds.get(i5);
                c207114 = (C20719) sparseArray.get(c11795.f39608);
                if (c207114 != null) {
                    C11795 c11797 = (C11795) view2.getLayoutParams();
                    c11795.f39632 = z3;
                    c11797.f39632 = z3;
                    EnumC19308 enumC193016 = EnumC19308.BASELINE;
                    c20719.mo30461(enumC193016).m22574(c207114.mo30461(enumC193016), 0, -1, z3);
                    c20719.m46598(z3);
                    c11797.f39661.m46598(z3);
                    c20719.mo30461(EnumC19308.TOP).m22576();
                    c20719.mo30461(EnumC19308.BOTTOM).m22576();
                }
            }
            if (f5 >= f) {
                c20719.m46585(f5);
            }
            f2 = c11795.f39630;
            if (f2 >= f) {
                c20719.m46623(f2);
            }
            r2 = z3;
            f3 = f;
        }
        if (z && ((i6 = c11795.f39636) != -1 || c11795.f39654 != -1)) {
            c20719.m46579(i6, c11795.f39654);
        }
        if (!c11795.f39642) {
            if (((ViewGroup.MarginLayoutParams) c11795).width == -1) {
                if (c11795.f39631) {
                    c20719.m46591(EnumC7313.MATCH_CONSTRAINT);
                } else {
                    c20719.m46591(EnumC7313.MATCH_PARENT);
                }
                c20719.mo30461(EnumC19308.LEFT).f29979 = ((ViewGroup.MarginLayoutParams) c11795).leftMargin;
                c20719.mo30461(EnumC19308.RIGHT).f29979 = ((ViewGroup.MarginLayoutParams) c11795).rightMargin;
            } else {
                c20719.m46591(EnumC7313.MATCH_CONSTRAINT);
                c20719.m46608(0);
            }
        } else {
            c20719.m46591(EnumC7313.FIXED);
            c20719.m46608(((ViewGroup.MarginLayoutParams) c11795).width);
            if (((ViewGroup.MarginLayoutParams) c11795).width == -2) {
                c20719.m46591(EnumC7313.WRAP_CONTENT);
            }
        }
        if (!c11795.f39613) {
            if (((ViewGroup.MarginLayoutParams) c11795).height == -1) {
                if (c11795.f39600) {
                    c20719.m46626(EnumC7313.MATCH_CONSTRAINT);
                } else {
                    c20719.m46626(EnumC7313.MATCH_PARENT);
                }
                c20719.mo30461(EnumC19308.TOP).f29979 = ((ViewGroup.MarginLayoutParams) c11795).topMargin;
                c20719.mo30461(EnumC19308.BOTTOM).f29979 = ((ViewGroup.MarginLayoutParams) c11795).bottomMargin;
            } else {
                c20719.m46626(EnumC7313.MATCH_CONSTRAINT);
                c20719.m46620(0);
            }
        } else {
            c20719.m46626(EnumC7313.FIXED);
            c20719.m46620(((ViewGroup.MarginLayoutParams) c11795).height);
            if (((ViewGroup.MarginLayoutParams) c11795).height == -2) {
                c20719.m46626(EnumC7313.WRAP_CONTENT);
            }
        }
        c20719.m46625(c11795.f39614);
        float f6 = c11795.f39612;
        float[] fArr = c20719.f67413;
        fArr[0] = f6;
        fArr[r2] = c11795.f39626;
        c20719.m46583(c11795.f39629);
        c20719.m46634(c11795.f39643);
        int i16 = c11795.f39609;
        int i17 = c11795.f39611;
        int i18 = c11795.f39628;
        float f7 = c11795.f39601;
        c20719.f67395 = i16;
        c20719.f67401 = i17;
        if (i18 == Integer.MAX_VALUE) {
            i18 = 0;
        }
        c20719.f67382 = i18;
        c20719.f67384 = f7;
        if (f7 > f3 && f7 < 1.0f && i16 == 0) {
            c20719.f67395 = 2;
        }
        int i19 = c11795.f39605;
        int i20 = c11795.f39604;
        int i21 = c11795.f39634;
        float f8 = c11795.f39657;
        c20719.f67375 = i19;
        c20719.f67407 = i20;
        c20719.f67378 = i21 != Integer.MAX_VALUE ? i21 : 0;
        c20719.f67377 = f8;
        if (f8 <= f3 || f8 >= 1.0f || i19 != 0) {
            return;
        }
        c20719.f67375 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C20719 m15063(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = (View) this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C11795) viewFindViewById.getLayoutParams()).f39661;
    }

    public final C20719 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C11795) view.getLayoutParams()).f39661;
    }

    public void fillMetrics(C22130 c22130) {
        this.mLayoutWidget.m37522();
    }

    public void resolveSystem(C15781 c15781, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int iM15061 = m15061();
        C2621 c2621 = this.mMeasurer;
        c2621.f10245 = iMax;
        c2621.f10239 = iMax2;
        c2621.f10238 = iM15061;
        c2621.f10241 = i4;
        c2621.f10242 = i2;
        c2621.f10244 = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                iMax3 = iMax4;
            }
        } else {
            iMax3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - iM15061;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c15781, mode, i5, mode2, i6);
        c15781.m37525(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C2621 c2621 = this.mMeasurer;
        int i5 = c2621.f10241;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c2621.f10238, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m46640(), this.mLayoutWidget.m46619(), this.mLayoutWidget.m37540(), this.mLayoutWidget.m37542());
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m46619()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m46640(), this.mLayoutWidget.m46619(), this.mLayoutWidget.m37540(), this.mLayoutWidget.m37542());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m37537(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m15060()) {
                this.mLayoutWidget.m37539();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m46640(), this.mLayoutWidget.m46619(), this.mLayoutWidget.m37540(), this.mLayoutWidget.m37542());
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15061() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[PHI: r2
      0x0053: PHI (r2v4 l.۟۟) = (r2v3 l.۟۟), (r2v0 l.۟۟) binds: [B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(C15781 c15781, int i, int i2, int i3, int i4) {
        EnumC7313 enumC7313;
        C2621 c2621 = this.mMeasurer;
        int i5 = c2621.f10241;
        int i6 = c2621.f10238;
        EnumC7313 enumC7314 = EnumC7313.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC7313 = EnumC7313.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC7313 = EnumC7313.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            enumC7313 = enumC7314;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC7313 = enumC7314;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC7314 = EnumC7313.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 == 0) {
            enumC7314 = EnumC7313.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            } else {
                i4 = 0;
            }
        } else if (i3 != 1073741824) {
            i4 = 0;
        } else {
            i4 = Math.min(this.mMaxHeight - i5, i4);
        }
        if (i2 != c15781.m46640() || i4 != c15781.m46619()) {
            c15781.f51116.m29738();
        }
        c15781.m46638(0);
        c15781.m46610(0);
        c15781.m46646(this.mMaxWidth - i6);
        c15781.m46605(this.mMaxHeight - i5);
        c15781.m46642(0);
        c15781.m46629(0);
        c15781.m46591(enumC7313);
        c15781.m46608(i2);
        c15781.m46626(enumC7314);
        c15781.m46620(i4);
        c15781.m46642(this.mMinWidth - i6);
        c15781.m46629(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C13206 c13206 = this.mConstraintLayoutSpec;
        if (c13206 != null) {
            c13206.m32676(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewM20080;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C11795 c11795 = (C11795) childAt.getLayoutParams();
            C20719 c20719 = c11795.f39661;
            if ((childAt.getVisibility() != 8 || c11795.f39625 || c11795.f39660 || zIsInEditMode) && !c11795.f39635) {
                int iM46630 = c20719.m46630();
                int iM46639 = c20719.m46639();
                int iM46640 = c20719.m46640() + iM46630;
                int iM46619 = c20719.m46619() + iM46639;
                childAt.layout(iM46630, iM46639, iM46640, iM46619);
                if ((childAt instanceof C7561) && (viewM20080 = ((C7561) childAt).m20080()) != null) {
                    viewM20080.setVisibility(0);
                    viewM20080.layout(iM46630, iM46639, iM46640, iM46619);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC3472) this.mConstraintHelpers.get(i6)).mo10204();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m37531(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m37524();
    }

    @Override // android.view.ViewGroup
    public C11795 generateLayoutParams(AttributeSet attributeSet) {
        return new C11795(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C11795 generateDefaultLayoutParams() {
        return new C11795(-2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C11795(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C11795;
    }

    public void setConstraintSet(C18144 c18144) {
        this.mConstraintSet = c18144;
    }

    public View getViewById(int i) {
        return (View) this.mChildrenByIds.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC3472) this.mConstraintHelpers.get(i)).mo10203(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(AbstractC19556 abstractC19556) {
        C13206 c13206 = this.mConstraintLayoutSpec;
        if (c13206 != null) {
            c13206.getClass();
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C13206(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m15067();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        m15067();
        super.forceLayout();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15067() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
