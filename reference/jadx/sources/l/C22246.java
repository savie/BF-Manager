package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.᩹ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes.dex */
public class C22246 extends ViewGroup {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static boolean f72717;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f72718;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f72719;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f72720;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f72721;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f72722;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f72723;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f72724;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Rect f72725;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23513 f72726;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public View f72727;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f72728;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f72729;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC22327 f72730;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f72731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15265 f72732;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f72733;

    static {
        f72717 = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m49384() {
        this.f72733 = 3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m49395() {
        return this.f72733;
    }

    public C22246(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C22246(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72720 = 1.0f;
        this.f72728 = new CopyOnWriteArrayList();
        this.f72718 = true;
        this.f72725 = new Rect();
        this.f72719 = new ArrayList();
        C14341 c14341 = new C14341(this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C5031.m13990(this, new C1639(this));
        setImportantForAccessibility(1);
        C15265 c15265M36541 = C15265.m36541(this, 0.5f, new C3050(this));
        this.f72732 = c15265M36541;
        c15265M36541.m36556(f * 400.0f);
        int i2 = C1865.f7088;
        InterfaceC3276.f12146.getClass();
        C23513 c23513 = new C23513(C9628.m24531(context), C10405.m26302(context));
        this.f72726 = c23513;
        c23513.m51777(c14341);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49390(InterfaceC13780 interfaceC13780) {
        this.f72728.add(interfaceC13780);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49396(View view) {
        Iterator it = this.f72728.iterator();
        while (it.hasNext()) {
            ((InterfaceC13780) it.next()).mo6264(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49389(View view) {
        Iterator it = this.f72728.iterator();
        while (it.hasNext()) {
            ((InterfaceC13780) it.next()).mo6263(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m49385(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zM49393 = m49393();
        int width = zM49393 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM49393 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zM49393 ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM49393 ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM49393 = zM49393;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            C5312 c5312 = new C5312(view.getContext());
            c5312.addView(view);
            super.addView(c5312, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C5312) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f72718 = true;
        if (this.f72726 != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                this.f72726.m51776(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f72718 = true;
        C23513 c23513 = this.f72726;
        if (c23513 != null) {
            c23513.m51775();
        }
        ArrayList arrayList = this.f72719;
        if (arrayList.size() > 0) {
            ((RunnableC9402) arrayList.get(0)).getClass();
            throw null;
        }
        arrayList.clear();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0304  */
    /* JADX WARN: Code duplicated, block: B:142:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[PHI: r12
      0x007e: PHI (r12v24 float) = (r12v1 float), (r12v25 float) binds: [B:15:0x0075, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int i4;
        int iMakeMeasureSpec;
        int iMax;
        float f;
        int i5;
        int iMakeMeasureSpec2;
        ArrayList arrayList;
        int i6;
        int minimumWidth;
        int iMax2;
        int i7;
        int iMakeMeasureSpec3;
        int measuredHeight;
        boolean z;
        int i8;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r7 = 0;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        } else if (mode2 != 1073741824) {
            iMin = 0;
            paddingTop = 0;
        } else {
            iMin = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f72727 = null;
        int i9 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        int i10 = iMax3;
        while (true) {
            i3 = 8;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            int i11 = size;
            C4606 c4606 = (C4606) childAt.getLayoutParams();
            int i12 = childCount;
            if (childAt.getVisibility() == 8) {
                c4606.f16309 = r7;
            } else {
                float f3 = c4606.f16310;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) c4606).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c4606).leftMargin + ((ViewGroup.MarginLayoutParams) c4606).rightMargin), (int) r7);
                        i7 = ((ViewGroup.MarginLayoutParams) c4606).width;
                        if (i7 == -2) {
                            if (mode == 0) {
                                i8 = mode;
                            } else {
                                i8 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                        } else if (i7 == -1) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c4606).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i10 -= measuredWidth;
                        if (i9 != 0) {
                            if (i10 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c4606.f16311 = z;
                            boolean z3 = z2 | z;
                            if (z) {
                                this.f72727 = childAt;
                            }
                            z2 = z3;
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c4606).leftMargin + ((ViewGroup.MarginLayoutParams) c4606).rightMargin), (int) r7);
                    i7 = ((ViewGroup.MarginLayoutParams) c4606).width;
                    if (i7 == -2) {
                        if (mode == 0) {
                            i8 = mode;
                        } else {
                            i8 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                    } else if (i7 == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c4606).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i10 -= measuredWidth2;
                    if (i9 != 0) {
                        if (i10 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c4606.f16311 = z;
                        boolean z4 = z2 | z;
                        if (z) {
                            this.f72727 = childAt;
                        }
                        z2 = z4;
                    }
                }
            }
            i9++;
            r7 = 0;
            childCount = i12;
            size = i11;
        }
        int i13 = size;
        int i14 = childCount;
        if (z2 || f2 > 0.0f) {
            int i15 = 0;
            i4 = i14;
            while (i15 < i4) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() == i3) {
                    f = f2;
                    i5 = i10;
                } else {
                    C4606 c4607 = (C4606) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) c4607).width != 0 || c4607.f16310 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) c4607).leftMargin + ((ViewGroup.MarginLayoutParams) c4607).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (c4607.f16310 > 0.0f) {
                        iMax = ((int) ((c4607.f16310 * Math.max(0, i10)) / f2)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMakeMeasureSpec = 0;
                        iMax = measuredWidth3;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    f = f2;
                    C4606 c4608 = (C4606) childAt2.getLayoutParams();
                    i5 = i10;
                    if (((ViewGroup.MarginLayoutParams) c4608).width == 0 && c4608.f16310 > 0.0f) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) c4608).height);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                    }
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i15++;
                i3 = 8;
                i10 = i5;
                f2 = f;
            }
        } else {
            i4 = i14;
        }
        InterfaceC22327 interfaceC22327 = this.f72730;
        if (interfaceC22327 == null || !interfaceC22327.mo32528() || this.f72730.mo32526().left == 0 || this.f72730.mo32526().top != 0) {
            arrayList = null;
        } else {
            InterfaceC22327 interfaceC22328 = this.f72730;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i16 = iArr[0];
            Rect rect = new Rect(i16, iArr[1], getWidth() + i16, getWidth() + iArr[1]);
            Rect rect2 = new Rect(interfaceC22328.mo32526());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z2) {
            for (int i17 = 0; i17 < i4; i17++) {
                View childAt3 = getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i17);
                    C4606 c4609 = (C4606) childAt3.getLayoutParams();
                    int i18 = ((ViewGroup.MarginLayoutParams) c4609).leftMargin + ((ViewGroup.MarginLayoutParams) c4609).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                        if (i17 == 0) {
                            c4609.f16311 = true;
                            this.f72727 = childAt3;
                            z2 = true;
                        }
                    } else {
                        boolean z5 = childAt3 instanceof C5312;
                        if (z5) {
                            i6 = 0;
                            View childAt4 = ((C5312) childAt3).getChildAt(0);
                            int i19 = C5031.f17539;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i6 = 0;
                            int i20 = C5031.f17539;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z5 ? ((C5312) childAt3).getChildAt(i6).getMinimumWidth() : childAt3.getMinimumWidth())) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                                if (i17 == 0) {
                                    c4609.f16311 = true;
                                    this.f72727 = childAt3;
                                    z2 = true;
                                }
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                }
            }
        }
        setMeasuredDimension(i13, getPaddingBottom() + getPaddingTop() + iMin);
        this.f72729 = z2;
        C15265 c15265 = this.f72732;
        if (c15265.m36553() == 0 || z2) {
            return;
        }
        c15265.m36555();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean zM49393 = m49393();
        int i8 = i3 - i;
        int paddingRight = zM49393 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM49393 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f72718) {
            this.f72720 = (this.f72729 && this.f72723) ? 0.0f : 1.0f;
        }
        int i9 = paddingRight;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C4606 c4606 = (C4606) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c4606.f16311) {
                    int i11 = i8 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i11) - i9) - (((ViewGroup.MarginLayoutParams) c4606).leftMargin + ((ViewGroup.MarginLayoutParams) c4606).rightMargin);
                    this.f72721 = iMin;
                    int i12 = zM49393 ? ((ViewGroup.MarginLayoutParams) c4606).rightMargin : ((ViewGroup.MarginLayoutParams) c4606).leftMargin;
                    c4606.f16309 = (measuredWidth / 2) + ((i9 + i12) + iMin) > i11;
                    float f = iMin;
                    int i13 = (int) (this.f72720 * f);
                    i5 = i12 + i13 + i9;
                    this.f72720 = i13 / f;
                } else {
                    i5 = paddingRight;
                }
                if (zM49393) {
                    i6 = i8 - i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i6 = i5 + measuredWidth;
                    i7 = i5;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                InterfaceC22327 interfaceC22327 = this.f72730;
                paddingRight = Math.abs((interfaceC22327 != null && interfaceC22327.mo32527() == C2570.f10128 && this.f72730.mo32528()) ? this.f72730.mo32526().width() : 0) + childAt.getWidth() + paddingRight;
                i9 = i5;
            }
        }
        if (this.f72718) {
            m49385(this.f72727);
        }
        this.f72718 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f72718 = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f72729) {
            return;
        }
        this.f72723 = view == this.f72727;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f72729;
        C15265 c15265 = this.f72732;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c15265.getClass();
            this.f72723 = C15265.m36550(childAt, x, y);
        }
        if (!this.f72729 || (this.f72724 && actionMasked != 0)) {
            c15265.m36565();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c15265.m36565();
            return false;
        }
        if (actionMasked == 0) {
            this.f72724 = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f72731 = x2;
            this.f72722 = y2;
            c15265.getClass();
            if (C15265.m36550(this.f72727, (int) x2, (int) y2) && m49394(this.f72727)) {
                z = true;
            }
            return !c15265.m36569(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.f72731);
            float fAbs2 = Math.abs(y3 - this.f72722);
            if (fAbs > c15265.m36564() && fAbs2 > fAbs) {
                c15265.m36565();
                this.f72724 = true;
                return false;
            }
        }
        z = false;
        if (c15265.m36569(motionEvent)) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f72729) {
            return super.onTouchEvent(motionEvent);
        }
        C15265 c15265 = this.f72732;
        c15265.m36559(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f72731 = x;
            this.f72722 = y;
            return true;
        }
        if (actionMasked == 1 && m49394(this.f72727)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f72731;
            float f2 = y2 - this.f72722;
            int iM36564 = c15265.m36564();
            if ((f2 * f2) + (f * f) < iM36564 * iM36564 && C15265.m36550(this.f72727, (int) x2, (int) y2)) {
                m49383();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49383() {
        if (!this.f72729) {
            this.f72723 = false;
        }
        if (!this.f72718 && !m49391(1.0f)) {
            return false;
        }
        this.f72723 = false;
        return true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m49397() {
        if (!this.f72729) {
            this.f72723 = true;
        }
        if (this.f72718 || m49391(0.0f)) {
            this.f72723 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49387() {
        m49383();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m49386() {
        return !this.f72729 || this.f72720 == 0.0f;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m49392() {
        return this.f72729;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49388(int i) {
        if (this.f72727 == null) {
            this.f72720 = 0.0f;
            return;
        }
        boolean zM49393 = m49393();
        C4606 c4606 = (C4606) this.f72727.getLayoutParams();
        int width = this.f72727.getWidth();
        if (zM49393) {
            i = (getWidth() - i) - width;
        }
        this.f72720 = (i - ((zM49393 ? getPaddingRight() : getPaddingLeft()) + (zM49393 ? ((ViewGroup.MarginLayoutParams) c4606).rightMargin : ((ViewGroup.MarginLayoutParams) c4606).leftMargin))) / this.f72721;
        View view = this.f72727;
        Iterator it = this.f72728.iterator();
        while (it.hasNext()) {
            ((InterfaceC13780) it.next()).mo6262(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C15844 c15844M13974;
        C15844 c15844M13975;
        boolean zM49393 = m49393() ^ m49386();
        boolean z = f72717;
        C13954 c13954M37689 = null;
        C15265 c15265 = this.f72732;
        if (zM49393) {
            c15265.m36562(1);
            if (z && (c15844M13975 = C5031.m13974(this)) != null) {
                c13954M37689 = c15844M13975.m37689();
            }
            if (c13954M37689 != null) {
                c15265.m36566(Math.max(c15265.m36570(), c13954M37689.f45915));
            }
        } else {
            c15265.m36562(2);
            if (z && (c15844M13974 = C5031.m13974(this)) != null) {
                c13954M37689 = c15844M13974.m37689();
            }
            if (c13954M37689 != null) {
                c15265.m36566(Math.max(c15265.m36570(), c13954M37689.f45914));
            }
        }
        C4606 c4606 = (C4606) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f72729 && !c4606.f16311 && this.f72727 != null) {
            Rect rect = this.f72725;
            canvas.getClipBounds(rect);
            if (m49393()) {
                rect.left = Math.max(rect.left, this.f72727.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f72727.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49391(float f) {
        int paddingLeft;
        if (this.f72729) {
            boolean zM49393 = m49393();
            C4606 c4606 = (C4606) this.f72727.getLayoutParams();
            if (zM49393) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c4606).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.f72721) + paddingRight) + this.f72727.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.f72721) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4606).leftMargin);
            }
            View view = this.f72727;
            if (this.f72732.m36560(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                int i2 = C5031.f17539;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C15265 c15265 = this.f72732;
        if (c15265.m36552()) {
            if (!this.f72729) {
                c15265.m36555();
            } else {
                int i = C5031.f17539;
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        m49393();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m49394(View view) {
        if (view == null) {
            return false;
        }
        return this.f72729 && ((C4606) view.getLayoutParams()).f16309 && this.f72720 > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4606();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4606 c4606;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            c4606 = new C4606(layoutParams);
        } else {
            c4606 = new C4606((ViewGroup.MarginLayoutParams) layoutParams);
        }
        c4606.f16310 = 0.0f;
        return c4606;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4606) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4606(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2489 c2489 = new C2489(super.onSaveInstanceState());
        c2489.f9890 = this.f72729 ? m49386() : this.f72723;
        c2489.f9891 = this.f72733;
        return c2489;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2489)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2489 c2489 = (C2489) parcelable;
        super.onRestoreInstanceState(c2489.getSuperState());
        if (!c2489.f9890) {
            m49383();
        } else {
            m49397();
        }
        this.f72723 = c2489.f9890;
        this.f72733 = c2489.f9891;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m49393() {
        int i = C5031.f17539;
        return getLayoutDirection() == 1;
    }
}
