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

/* JADX INFO: renamed from: l.ۢۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes3.dex */
public class C10045 extends ViewGroup {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f32191;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC5167 f32192;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f32193;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f32194;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f32195;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f32196;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12283 f32197;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f32198;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f32199;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f32200;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final Rect f32201;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f32202;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32203;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f32204;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f32205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C25302 f32206;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public View f32207;

    static {
        f32191 = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25942() {
        this.f32199 = 3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25945() {
        return this.f32199;
    }

    public C10045(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10045(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32202 = 1.0f;
        this.f32194 = new CopyOnWriteArrayList();
        this.f32204 = true;
        this.f32201 = new Rect();
        this.f32198 = new ArrayList();
        C6318 c6318 = new C6318(this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C22666.m51098(this, new C24218(this));
        setImportantForAccessibility(1);
        C25302 c25302M56520 = C25302.m56520(this, 0.5f, new C14520(this));
        this.f32206 = c25302M56520;
        c25302M56520.m56534(f * 400.0f);
        int i2 = C19337.f62455;
        InterfaceC1438.f5044.getClass();
        C12283 c12283 = new C12283(C10386.m26697(context), C7508.m20561(context));
        this.f32197 = c12283;
        c12283.m30672(c6318);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25938(InterfaceC18250 interfaceC18250) {
        this.f32194.add(interfaceC18250);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25946(View view) {
        Iterator it = this.f32194.iterator();
        while (it.hasNext()) {
            ((InterfaceC18250) it.next()).mo30885(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25937(View view) {
        Iterator it = this.f32194.iterator();
        while (it.hasNext()) {
            ((InterfaceC18250) it.next()).mo30884(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25947(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zM25940 = m25940();
        int width = zM25940 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM25940 ? getPaddingLeft() : getWidth() - getPaddingRight();
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
                childAt.setVisibility((Math.max(zM25940 ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM25940 ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM25940 = zM25940;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            C18996 c18996 = new C18996(view.getContext());
            c18996.addView(view);
            super.addView(c18996, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C18996) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f32204 = true;
        if (this.f32197 != null) {
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
                this.f32197.m30671(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32204 = true;
        C12283 c12283 = this.f32197;
        if (c12283 != null) {
            c12283.m30670();
        }
        ArrayList arrayList = this.f32198;
        if (arrayList.size() > 0) {
            ((RunnableC4080) arrayList.get(0)).getClass();
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
        this.f32207 = null;
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
            C21234 c21234 = (C21234) childAt.getLayoutParams();
            int i12 = childCount;
            if (childAt.getVisibility() == 8) {
                c21234.f67759 = r7;
            } else {
                float f3 = c21234.f67760;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) c21234).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c21234).leftMargin + ((ViewGroup.MarginLayoutParams) c21234).rightMargin), (int) r7);
                        i7 = ((ViewGroup.MarginLayoutParams) c21234).width;
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
                        childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c21234).height));
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
                            c21234.f67761 = z;
                            boolean z3 = z2 | z;
                            if (z) {
                                this.f32207 = childAt;
                            }
                            z2 = z3;
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c21234).leftMargin + ((ViewGroup.MarginLayoutParams) c21234).rightMargin), (int) r7);
                    i7 = ((ViewGroup.MarginLayoutParams) c21234).width;
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
                    childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c21234).height));
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
                        c21234.f67761 = z;
                        boolean z4 = z2 | z;
                        if (z) {
                            this.f32207 = childAt;
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
                    C21234 c21235 = (C21234) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) c21235).width != 0 || c21235.f67760 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) c21235).leftMargin + ((ViewGroup.MarginLayoutParams) c21235).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (c21235.f67760 > 0.0f) {
                        iMax = ((int) ((c21235.f67760 * Math.max(0, i10)) / f2)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMakeMeasureSpec = 0;
                        iMax = measuredWidth3;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    f = f2;
                    C21234 c21236 = (C21234) childAt2.getLayoutParams();
                    i5 = i10;
                    if (((ViewGroup.MarginLayoutParams) c21236).width == 0 && c21236.f67760 > 0.0f) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) c21236).height);
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
        InterfaceC5167 interfaceC5167 = this.f32192;
        if (interfaceC5167 == null || !interfaceC5167.mo15588() || this.f32192.mo20861().left == 0 || this.f32192.mo20861().top != 0) {
            arrayList = null;
        } else {
            InterfaceC5167 interfaceC5168 = this.f32192;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i16 = iArr[0];
            Rect rect = new Rect(i16, iArr[1], getWidth() + i16, getWidth() + iArr[1]);
            Rect rect2 = new Rect(interfaceC5168.mo20861());
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
                    C21234 c21237 = (C21234) childAt3.getLayoutParams();
                    int i18 = ((ViewGroup.MarginLayoutParams) c21237).leftMargin + ((ViewGroup.MarginLayoutParams) c21237).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                        if (i17 == 0) {
                            c21237.f67761 = true;
                            this.f32207 = childAt3;
                            z2 = true;
                        }
                    } else {
                        boolean z5 = childAt3 instanceof C18996;
                        if (z5) {
                            i6 = 0;
                            View childAt4 = ((C18996) childAt3).getChildAt(0);
                            int i19 = C22666.f73603;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i6 = 0;
                            int i20 = C22666.f73603;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z5 ? ((C18996) childAt3).getChildAt(i6).getMinimumWidth() : childAt3.getMinimumWidth())) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                                if (i17 == 0) {
                                    c21237.f67761 = true;
                                    this.f32207 = childAt3;
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
        this.f32203 = z2;
        C25302 c25302 = this.f32206;
        if (c25302.m56531() == 0 || z2) {
            return;
        }
        c25302.m56533();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean zM25940 = m25940();
        int i8 = i3 - i;
        int paddingRight = zM25940 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM25940 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f32204) {
            this.f32202 = (this.f32203 && this.f32196) ? 0.0f : 1.0f;
        }
        int i9 = paddingRight;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C21234 c21234 = (C21234) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c21234.f67761) {
                    int i11 = i8 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i11) - i9) - (((ViewGroup.MarginLayoutParams) c21234).leftMargin + ((ViewGroup.MarginLayoutParams) c21234).rightMargin);
                    this.f32195 = iMin;
                    int i12 = zM25940 ? ((ViewGroup.MarginLayoutParams) c21234).rightMargin : ((ViewGroup.MarginLayoutParams) c21234).leftMargin;
                    c21234.f67759 = (measuredWidth / 2) + ((i9 + i12) + iMin) > i11;
                    float f = iMin;
                    int i13 = (int) (this.f32202 * f);
                    i5 = i12 + i13 + i9;
                    this.f32202 = i13 / f;
                } else {
                    i5 = paddingRight;
                }
                if (zM25940) {
                    i6 = i8 - i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i6 = i5 + measuredWidth;
                    i7 = i5;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                InterfaceC5167 interfaceC5167 = this.f32192;
                paddingRight = Math.abs((interfaceC5167 != null && interfaceC5167.mo15587() == C6901.f22879 && this.f32192.mo15588()) ? this.f32192.mo20861().width() : 0) + childAt.getWidth() + paddingRight;
                i9 = i5;
            }
        }
        if (this.f32204) {
            m25947(this.f32207);
        }
        this.f32204 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f32204 = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f32203) {
            return;
        }
        this.f32196 = view == this.f32207;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f32203;
        C25302 c25302 = this.f32206;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c25302.getClass();
            this.f32196 = C25302.m56529(childAt, x, y);
        }
        if (!this.f32203 || (this.f32193 && actionMasked != 0)) {
            c25302.m56545();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c25302.m56545();
            return false;
        }
        if (actionMasked == 0) {
            this.f32193 = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f32205 = x2;
            this.f32200 = y2;
            c25302.getClass();
            if (C25302.m56529(this.f32207, (int) x2, (int) y2) && m25941(this.f32207)) {
                z = true;
            }
            return !c25302.m56549(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.f32205);
            float fAbs2 = Math.abs(y3 - this.f32200);
            if (fAbs > c25302.m56539() && fAbs2 > fAbs) {
                c25302.m56545();
                this.f32193 = true;
                return false;
            }
        }
        z = false;
        if (c25302.m56549(motionEvent)) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32203) {
            return super.onTouchEvent(motionEvent);
        }
        C25302 c25302 = this.f32206;
        c25302.m56537(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f32205 = x;
            this.f32200 = y;
            return true;
        }
        if (actionMasked == 1 && m25941(this.f32207)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f32205;
            float f2 = y2 - this.f32200;
            int iM56539 = c25302.m56539();
            if ((f2 * f2) + (f * f) < iM56539 * iM56539 && C25302.m56529(this.f32207, (int) x2, (int) y2)) {
                m25934();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25934() {
        if (!this.f32203) {
            this.f32196 = false;
        }
        if (!this.f32204 && !m25939(1.0f)) {
            return false;
        }
        this.f32196 = false;
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m25943() {
        if (!this.f32203) {
            this.f32196 = true;
        }
        if (this.f32204 || m25939(0.0f)) {
            this.f32196 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25935() {
        m25934();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m25948() {
        return !this.f32203 || this.f32202 == 0.0f;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m25944() {
        return this.f32203;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25936(int i) {
        if (this.f32207 == null) {
            this.f32202 = 0.0f;
            return;
        }
        boolean zM25940 = m25940();
        C21234 c21234 = (C21234) this.f32207.getLayoutParams();
        int width = this.f32207.getWidth();
        if (zM25940) {
            i = (getWidth() - i) - width;
        }
        this.f32202 = (i - ((zM25940 ? getPaddingRight() : getPaddingLeft()) + (zM25940 ? ((ViewGroup.MarginLayoutParams) c21234).rightMargin : ((ViewGroup.MarginLayoutParams) c21234).leftMargin))) / this.f32195;
        View view = this.f32207;
        Iterator it = this.f32194.iterator();
        while (it.hasNext()) {
            ((InterfaceC18250) it.next()).mo30883(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C3977 c3977M51078;
        C3977 c3977M51079;
        boolean zM25940 = m25940() ^ m25948();
        boolean z = f32191;
        C13275 c13275M12826 = null;
        C25302 c25302 = this.f32206;
        if (zM25940) {
            c25302.m56540(1);
            if (z && (c3977M51079 = C22666.m51078(this)) != null) {
                c13275M12826 = c3977M51079.m12826();
            }
            if (c13275M12826 != null) {
                c25302.m56546(Math.max(c25302.m56543(), c13275M12826.f42407));
            }
        } else {
            c25302.m56540(2);
            if (z && (c3977M51078 = C22666.m51078(this)) != null) {
                c13275M12826 = c3977M51078.m12826();
            }
            if (c13275M12826 != null) {
                c25302.m56546(Math.max(c25302.m56543(), c13275M12826.f42406));
            }
        }
        C21234 c21234 = (C21234) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f32203 && !c21234.f67761 && this.f32207 != null) {
            Rect rect = this.f32201;
            canvas.getClipBounds(rect);
            if (m25940()) {
                rect.left = Math.max(rect.left, this.f32207.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f32207.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25939(float f) {
        int paddingLeft;
        if (this.f32203) {
            boolean zM25940 = m25940();
            C21234 c21234 = (C21234) this.f32207.getLayoutParams();
            if (zM25940) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c21234).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.f32195) + paddingRight) + this.f32207.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.f32195) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c21234).leftMargin);
            }
            View view = this.f32207;
            if (this.f32206.m56538(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                int i2 = C22666.f73603;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C25302 c25302 = this.f32206;
        if (c25302.m56550()) {
            if (!this.f32203) {
                c25302.m56533();
            } else {
                int i = C22666.f73603;
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        m25940();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m25941(View view) {
        if (view == null) {
            return false;
        }
        return this.f32203 && ((C21234) view.getLayoutParams()).f67759 && this.f32202 > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21234();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C21234 c21234;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            c21234 = new C21234(layoutParams);
        } else {
            c21234 = new C21234((ViewGroup.MarginLayoutParams) layoutParams);
        }
        c21234.f67760 = 0.0f;
        return c21234;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C21234) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21234(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C7809 c7809 = new C7809(super.onSaveInstanceState());
        c7809.f26016 = this.f32203 ? m25948() : this.f32196;
        c7809.f26017 = this.f32199;
        return c7809;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7809)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7809 c7809 = (C7809) parcelable;
        super.onRestoreInstanceState(c7809.getSuperState());
        if (!c7809.f26016) {
            m25934();
        } else {
            m25943();
        }
        this.f32196 = c7809.f26016;
        this.f32199 = c7809.f26017;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m25940() {
        int i = C22666.f73603;
        return getLayoutDirection() == 1;
    }
}
