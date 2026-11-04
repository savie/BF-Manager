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

/* JADX INFO: renamed from: l.ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes4.dex */
public class C16872 extends ViewGroup {
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    public static final boolean MEASURE = false;
    public static final String TAG = "ConstraintLayout";
    public static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray mChildrenByIds;
    public ArrayList mConstraintHelpers;
    public C23586 mConstraintLayoutSpec;
    public C4194 mConstraintSet;
    public int mConstraintSetId;
    public AbstractC18364 mConstraintsChangedListener;
    public HashMap mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C1497 mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C25078 mMeasurer;
    public C17904 mMetrics;
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

    public C16872(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1497();
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
        this.mMeasurer = new C25078(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m39826(null, 0, 0);
    }

    public C16872(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1497();
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
        this.mMeasurer = new C25078(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m39826(attributeSet, 0, 0);
    }

    public C16872(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1497();
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
        this.mMeasurer = new C25078(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m39826(attributeSet, i, 0);
    }

    @TargetApi(21)
    public C16872(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1497();
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
        this.mMeasurer = new C25078(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m39826(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39826(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m26811(this);
        this.mLayoutWidget.m5335(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4439, i, i2);
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
                        C4194 c4194 = new C4194();
                        this.mConstraintSet = c4194;
                        c4194.m13388(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m5350(this.mOptimizationLevel);
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C23586(getContext(), this, i);
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
        C10445 viewWidget = getViewWidget(view);
        if ((view instanceof C7923) && !(viewWidget instanceof C7463)) {
            C11651 c11651 = (C11651) view.getLayoutParams();
            C7463 c7463 = new C7463();
            c11651.f37714 = c7463;
            c11651.f37694 = true;
            c7463.m20503(c11651.f37697);
        }
        if (view instanceof AbstractC13143) {
            AbstractC13143 abstractC13143 = (AbstractC13143) view;
            abstractC13143.m32674();
            ((C11651) view.getLayoutParams()).f37713 = true;
            if (!this.mConstraintHelpers.contains(abstractC13143)) {
                this.mConstraintHelpers.add(abstractC13143);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C10445 viewWidget = getViewWidget(view);
        this.mLayoutWidget.f33652.remove(viewWidget);
        viewWidget.mo5339();
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m39830() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            m39827();
        }
        return z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m39827() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C10445 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo5339();
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
                    m39825(childAt.getId()).m26812(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C21348)) {
                    C21348 c21348 = (C21348) childAt2;
                    if (c21348.f68002 == null) {
                        c21348.f68002 = new C4194();
                    }
                    c21348.f68002.m13393(c21348);
                    this.mConstraintSet = c21348.f68002;
                }
            }
        }
        C4194 c4194 = this.mConstraintSet;
        if (c4194 != null) {
            c4194.m13402(this);
        }
        this.mLayoutWidget.f33652.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC13143) this.mConstraintHelpers.get(i4)).m32678(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C19110) {
                ((C19110) childAt3).m44231(this);
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
            C10445 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C11651 c11651 = (C11651) childAt5.getLayoutParams();
                C1497 c1497 = this.mLayoutWidget;
                c1497.f33652.add(viewWidget2);
                C10445 c10445 = viewWidget2.f33252;
                if (c10445 != null) {
                    ((C10600) c10445).f33652.remove(viewWidget2);
                    viewWidget2.mo5339();
                }
                viewWidget2.f33252 = c1497;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, c11651, this.mTempMapIdToWidget);
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
    public void applyConstraintsFromLayoutParams(boolean z, View view, C10445 c10445, C11651 c11651, SparseArray sparseArray) {
        float f;
        C10445 c10446;
        boolean z2;
        boolean z3;
        C10445 c10447;
        int i;
        int i2;
        C10445 c10448;
        int i3;
        int i4;
        C10445 c10449;
        int i5;
        float f2;
        ?? r2;
        float f3;
        View view2;
        C10445 c104410;
        C10445 c104411;
        C10445 c104412;
        C10445 c104413;
        int i6;
        c11651.m29333();
        c10445.m26869(view.getVisibility());
        if (c11651.f37698) {
            c10445.m26832();
            c10445.m26869(8);
        }
        c10445.m26811(view);
        if (view instanceof AbstractC13143) {
            ((AbstractC13143) view).mo27673(c10445, this.mLayoutWidget.m5345());
        }
        if (c11651.f37694) {
            C7463 c7463 = (C7463) c10445;
            int i7 = c11651.f37733;
            int i8 = c11651.f37735;
            float f4 = c11651.f37731;
            if (f4 != -1.0f) {
                c7463.m20500(f4);
                return;
            } else if (i7 != -1) {
                c7463.m20506(i7);
                return;
            } else {
                if (i8 != -1) {
                    c7463.m20494(i8);
                    return;
                }
                return;
            }
        }
        int i9 = c11651.f37700;
        int i10 = c11651.f37743;
        int i11 = c11651.f37722;
        int i12 = c11651.f37708;
        int i13 = c11651.f37720;
        int i14 = c11651.f37755;
        float f5 = c11651.f37751;
        int i15 = c11651.f37740;
        if (i15 != -1) {
            C10445 c104414 = (C10445) sparseArray.get(i15);
            if (c104414 != null) {
                c10445.m26815(c104414, c11651.f37748, c11651.f37728);
            }
            f3 = 0.0f;
            r2 = 1;
        } else {
            if (i9 != -1) {
                C10445 c104415 = (C10445) sparseArray.get(i9);
                if (c104415 != null) {
                    EnumC18650 enumC18650 = EnumC18650.LEFT;
                    f = 0.0f;
                    c10445.m26819(enumC18650, c104415, enumC18650, ((ViewGroup.MarginLayoutParams) c11651).leftMargin, i13);
                } else {
                    z2 = true;
                    f = 0.0f;
                }
                if (i11 != -1) {
                    c104413 = (C10445) sparseArray.get(i11);
                    if (c104413 != null) {
                        z3 = z2;
                        c10445.m26819(EnumC18650.RIGHT, c104413, EnumC18650.LEFT, ((ViewGroup.MarginLayoutParams) c11651).rightMargin, i14);
                    } else {
                        z3 = z2;
                    }
                } else {
                    z3 = z2;
                    if (i12 != -1 && (c10447 = (C10445) sparseArray.get(i12)) != null) {
                        EnumC18650 enumC18651 = EnumC18650.RIGHT;
                        c10445.m26819(enumC18651, c10447, enumC18651, ((ViewGroup.MarginLayoutParams) c11651).rightMargin, i14);
                    }
                }
                i = c11651.f37693;
                if (i != -1) {
                    c104412 = (C10445) sparseArray.get(i);
                    if (c104412 != null) {
                        EnumC18650 enumC18652 = EnumC18650.TOP;
                        c10445.m26819(enumC18652, c104412, enumC18652, ((ViewGroup.MarginLayoutParams) c11651).topMargin, c11651.f37701);
                    }
                } else {
                    i2 = c11651.f37737;
                    if (i2 != -1 && (c10448 = (C10445) sparseArray.get(i2)) != null) {
                        c10445.m26819(EnumC18650.TOP, c10448, EnumC18650.BOTTOM, ((ViewGroup.MarginLayoutParams) c11651).topMargin, c11651.f37701);
                    }
                }
                i3 = c11651.f37717;
                if (i3 != -1) {
                    c104411 = (C10445) sparseArray.get(i3);
                    if (c104411 != null) {
                        c10445.m26819(EnumC18650.BOTTOM, c104411, EnumC18650.TOP, ((ViewGroup.MarginLayoutParams) c11651).bottomMargin, c11651.f37699);
                    }
                } else {
                    i4 = c11651.f37746;
                    if (i4 != -1 && (c10449 = (C10445) sparseArray.get(i4)) != null) {
                        EnumC18650 enumC18653 = EnumC18650.BOTTOM;
                        c10445.m26819(enumC18653, c10449, enumC18653, ((ViewGroup.MarginLayoutParams) c11651).bottomMargin, c11651.f37699);
                    }
                }
                i5 = c11651.f37703;
                if (i5 != -1) {
                    view2 = (View) this.mChildrenByIds.get(i5);
                    c104410 = (C10445) sparseArray.get(c11651.f37703);
                    if (c104410 != null && view2 != null && (view2.getLayoutParams() instanceof C11651)) {
                        C11651 c11652 = (C11651) view2.getLayoutParams();
                        c11651.f37706 = z3;
                        c11652.f37706 = z3;
                        EnumC18650 enumC18654 = EnumC18650.BASELINE;
                        c10445.mo20495(enumC18654).m3106(c104410.mo20495(enumC18654), 0, -1, z3);
                        c10445.m26821(z3);
                        c11652.f37714.m26821(z3);
                        c10445.mo20495(EnumC18650.TOP).m3109();
                        c10445.mo20495(EnumC18650.BOTTOM).m3109();
                    }
                }
                if (f5 >= f) {
                    c10445.m26808(f5);
                }
                f2 = c11651.f37711;
                if (f2 >= f) {
                    c10445.m26859(f2);
                }
                r2 = z3;
                f3 = f;
            } else {
                f = 0.0f;
                if (i10 != -1 && (c10446 = (C10445) sparseArray.get(i10)) != null) {
                    c10445.m26819(EnumC18650.LEFT, c10446, EnumC18650.RIGHT, ((ViewGroup.MarginLayoutParams) c11651).leftMargin, i13);
                }
            }
            z2 = true;
            if (i11 != -1) {
                c104413 = (C10445) sparseArray.get(i11);
                if (c104413 != null) {
                    z3 = z2;
                    c10445.m26819(EnumC18650.RIGHT, c104413, EnumC18650.LEFT, ((ViewGroup.MarginLayoutParams) c11651).rightMargin, i14);
                } else {
                    z3 = z2;
                }
            } else {
                z3 = z2;
                if (i12 != -1) {
                    EnumC18650 enumC18655 = EnumC18650.RIGHT;
                    c10445.m26819(enumC18655, c10447, enumC18655, ((ViewGroup.MarginLayoutParams) c11651).rightMargin, i14);
                }
            }
            i = c11651.f37693;
            if (i != -1) {
                c104412 = (C10445) sparseArray.get(i);
                if (c104412 != null) {
                    EnumC18650 enumC18656 = EnumC18650.TOP;
                    c10445.m26819(enumC18656, c104412, enumC18656, ((ViewGroup.MarginLayoutParams) c11651).topMargin, c11651.f37701);
                }
            } else {
                i2 = c11651.f37737;
                if (i2 != -1) {
                    c10445.m26819(EnumC18650.TOP, c10448, EnumC18650.BOTTOM, ((ViewGroup.MarginLayoutParams) c11651).topMargin, c11651.f37701);
                }
            }
            i3 = c11651.f37717;
            if (i3 != -1) {
                c104411 = (C10445) sparseArray.get(i3);
                if (c104411 != null) {
                    c10445.m26819(EnumC18650.BOTTOM, c104411, EnumC18650.TOP, ((ViewGroup.MarginLayoutParams) c11651).bottomMargin, c11651.f37699);
                }
            } else {
                i4 = c11651.f37746;
                if (i4 != -1) {
                    EnumC18650 enumC18657 = EnumC18650.BOTTOM;
                    c10445.m26819(enumC18657, c10449, enumC18657, ((ViewGroup.MarginLayoutParams) c11651).bottomMargin, c11651.f37699);
                }
            }
            i5 = c11651.f37703;
            if (i5 != -1) {
                view2 = (View) this.mChildrenByIds.get(i5);
                c104410 = (C10445) sparseArray.get(c11651.f37703);
                if (c104410 != null) {
                    C11651 c11653 = (C11651) view2.getLayoutParams();
                    c11651.f37706 = z3;
                    c11653.f37706 = z3;
                    EnumC18650 enumC18658 = EnumC18650.BASELINE;
                    c10445.mo20495(enumC18658).m3106(c104410.mo20495(enumC18658), 0, -1, z3);
                    c10445.m26821(z3);
                    c11653.f37714.m26821(z3);
                    c10445.mo20495(EnumC18650.TOP).m3109();
                    c10445.mo20495(EnumC18650.BOTTOM).m3109();
                }
            }
            if (f5 >= f) {
                c10445.m26808(f5);
            }
            f2 = c11651.f37711;
            if (f2 >= f) {
                c10445.m26859(f2);
            }
            r2 = z3;
            f3 = f;
        }
        if (z && ((i6 = c11651.f37732) != -1 || c11651.f37734 != -1)) {
            c10445.m26866(i6, c11651.f37734);
        }
        if (!c11651.f37738) {
            if (((ViewGroup.MarginLayoutParams) c11651).width == -1) {
                if (c11651.f37705) {
                    c10445.m26820(EnumC19396.MATCH_CONSTRAINT);
                } else {
                    c10445.m26820(EnumC19396.MATCH_PARENT);
                }
                c10445.mo20495(EnumC18650.LEFT).f2748 = ((ViewGroup.MarginLayoutParams) c11651).leftMargin;
                c10445.mo20495(EnumC18650.RIGHT).f2748 = ((ViewGroup.MarginLayoutParams) c11651).rightMargin;
            } else {
                c10445.m26820(EnumC19396.MATCH_CONSTRAINT);
                c10445.m26805(0);
            }
        } else {
            c10445.m26820(EnumC19396.FIXED);
            c10445.m26805(((ViewGroup.MarginLayoutParams) c11651).width);
            if (((ViewGroup.MarginLayoutParams) c11651).width == -2) {
                c10445.m26820(EnumC19396.WRAP_CONTENT);
            }
        }
        if (!c11651.f37716) {
            if (((ViewGroup.MarginLayoutParams) c11651).height == -1) {
                if (c11651.f37723) {
                    c10445.m26862(EnumC19396.MATCH_CONSTRAINT);
                } else {
                    c10445.m26862(EnumC19396.MATCH_PARENT);
                }
                c10445.mo20495(EnumC18650.TOP).f2748 = ((ViewGroup.MarginLayoutParams) c11651).topMargin;
                c10445.mo20495(EnumC18650.BOTTOM).f2748 = ((ViewGroup.MarginLayoutParams) c11651).bottomMargin;
            } else {
                c10445.m26862(EnumC19396.MATCH_CONSTRAINT);
                c10445.m26824(0);
            }
        } else {
            c10445.m26862(EnumC19396.FIXED);
            c10445.m26824(((ViewGroup.MarginLayoutParams) c11651).height);
            if (((ViewGroup.MarginLayoutParams) c11651).height == -2) {
                c10445.m26862(EnumC19396.WRAP_CONTENT);
            }
        }
        c10445.m26861(c11651.f37719);
        float f6 = c11651.f37715;
        float[] fArr = c10445.f33224;
        fArr[0] = f6;
        fArr[r2] = c11651.f37695;
        c10445.m26803(c11651.f37710);
        c10445.m26844(c11651.f37739);
        int i16 = c11651.f37704;
        int i17 = c11651.f37741;
        int i18 = c11651.f37718;
        float f7 = c11651.f37724;
        c10445.f33206 = i16;
        c10445.f33215 = i17;
        if (i18 == Integer.MAX_VALUE) {
            i18 = 0;
        }
        c10445.f33201 = i18;
        c10445.f33238 = f7;
        if (f7 > f3 && f7 < 1.0f && i16 == 0) {
            c10445.f33206 = 2;
        }
        int i19 = c11651.f37725;
        int i20 = c11651.f37749;
        int i21 = c11651.f37747;
        float f8 = c11651.f37729;
        c10445.f33209 = i19;
        c10445.f33244 = i20;
        c10445.f33222 = i21 != Integer.MAX_VALUE ? i21 : 0;
        c10445.f33246 = f8;
        if (f8 <= f3 || f8 >= 1.0f || i19 != 0) {
            return;
        }
        c10445.f33209 = 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C10445 m39825(int i) {
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
        return ((C11651) viewFindViewById.getLayoutParams()).f37714;
    }

    public final C10445 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C11651) view.getLayoutParams()).f37714;
    }

    public void fillMetrics(C17904 c17904) {
        this.mLayoutWidget.m5342();
    }

    public void resolveSystem(C1497 c1497, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int iM39823 = m39823();
        C25078 c25078 = this.mMeasurer;
        c25078.f81102 = iMax;
        c25078.f81105 = iMax2;
        c25078.f81101 = iM39823;
        c25078.f81103 = i4;
        c25078.f81100 = i2;
        c25078.f81104 = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                iMax3 = iMax4;
            }
        } else {
            iMax3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - iM39823;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c1497, mode, i5, mode2, i6);
        c1497.m5332(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C25078 c25078 = this.mMeasurer;
        int i5 = c25078.f81103;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c25078.f81101, i, 0);
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
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m26806(), this.mLayoutWidget.m26823(), this.mLayoutWidget.m5346(), this.mLayoutWidget.m5351());
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m26823()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m26806(), this.mLayoutWidget.m26823(), this.mLayoutWidget.m5346(), this.mLayoutWidget.m5351());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m5349(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m39830()) {
                this.mLayoutWidget.m5344();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m26806(), this.mLayoutWidget.m26823(), this.mLayoutWidget.m5346(), this.mLayoutWidget.m5351());
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m39823() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[PHI: r2
      0x0053: PHI (r2v4 l.ᩳ᩺) = (r2v3 l.ᩳ᩺), (r2v0 l.ᩳ᩺) binds: [B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(C1497 c1497, int i, int i2, int i3, int i4) {
        EnumC19396 enumC19396;
        C25078 c25078 = this.mMeasurer;
        int i5 = c25078.f81103;
        int i6 = c25078.f81101;
        EnumC19396 enumC19397 = EnumC19396.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC19396 = EnumC19396.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC19396 = EnumC19396.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            enumC19396 = enumC19397;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC19396 = enumC19397;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC19397 = EnumC19396.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 == 0) {
            enumC19397 = EnumC19396.WRAP_CONTENT;
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
        if (i2 != c1497.m26806() || i4 != c1497.m26823()) {
            c1497.f5222.m28656();
        }
        c1497.m26855(0);
        c1497.m26836(0);
        c1497.m26872(this.mMaxWidth - i6);
        c1497.m26834(this.mMaxHeight - i5);
        c1497.m26848(0);
        c1497.m26846(0);
        c1497.m26820(enumC19396);
        c1497.m26805(i2);
        c1497.m26862(enumC19397);
        c1497.m26824(i4);
        c1497.m26848(this.mMinWidth - i6);
        c1497.m26846(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C23586 c23586 = this.mConstraintLayoutSpec;
        if (c23586 != null) {
            c23586.m52832(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewM44230;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C11651 c11651 = (C11651) childAt.getLayoutParams();
            C10445 c10445 = c11651.f37714;
            if ((childAt.getVisibility() != 8 || c11651.f37694 || c11651.f37713 || zIsInEditMode) && !c11651.f37698) {
                int iM26840 = c10445.m26840();
                int iM26856 = c10445.m26856();
                int iM26806 = c10445.m26806() + iM26840;
                int iM26823 = c10445.m26823() + iM26856;
                childAt.layout(iM26840, iM26856, iM26806, iM26823);
                if ((childAt instanceof C19110) && (viewM44230 = ((C19110) childAt).m44230()) != null) {
                    viewM44230.setVisibility(0);
                    viewM44230.layout(iM26840, iM26856, iM26806, iM26823);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC13143) this.mConstraintHelpers.get(i6)).mo2278();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m5350(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m5331();
    }

    @Override // android.view.ViewGroup
    public C11651 generateLayoutParams(AttributeSet attributeSet) {
        return new C11651(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C11651 generateDefaultLayoutParams() {
        return new C11651(-2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C11651(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C11651;
    }

    public void setConstraintSet(C4194 c4194) {
        this.mConstraintSet = c4194;
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
                ((AbstractC13143) this.mConstraintHelpers.get(i)).mo32675(this);
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

    public void setOnConstraintsChanged(AbstractC18364 abstractC18364) {
        C23586 c23586 = this.mConstraintLayoutSpec;
        if (c23586 != null) {
            c23586.getClass();
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C23586(getContext(), this, i);
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
        m39829();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        m39829();
        super.forceLayout();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m39829() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
