package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes3.dex */
public class C6129 extends C6606 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f20919;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC17418 f20920;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20921;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f20922;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f20923;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C16713 f20924;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f20925;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f20926;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final Rect f20927;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20928;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f20929;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C6528 f20930;

    public C6129(Context context, boolean z) {
        super(context, null, R.attr.MT_Protector);
        this.f20927 = new Rect();
        this.f20929 = 0;
        this.f20926 = 0;
        this.f20919 = 0;
        this.f20925 = 0;
        this.f20928 = z;
        setCacheColorHint(0);
        setFastScrollEnabled(true);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f20928 && this.f20922) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f20928 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f20928 || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f20928 || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C16713 c16713 = drawable != null ? new C16713(drawable) : null;
        this.f20924 = c16713;
        super.setSelector(c16713);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f20929 = rect.left;
        this.f20926 = rect.top;
        this.f20919 = rect.right;
        this.f20925 = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f20920 != null) {
            return;
        }
        super.drawableStateChanged();
        C16713 c16713 = this.f20924;
        if (c16713 != null) {
            c16713.m39189(true);
        }
        Drawable selector = getSelector();
        if (selector != null && this.f20921 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // l.C6606, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20923 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC17418 runnableC17418 = this.f20920;
        if (runnableC17418 != null) {
            C6129 c6129 = runnableC17418.f55423;
            c6129.f20920 = null;
            c6129.removeCallbacks(runnableC17418);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo17109(int i, int i2) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            if (i5 > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, iMakeMeasureSpec);
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f20920 == null) {
            RunnableC17418 runnableC17418 = new RunnableC17418(this);
            this.f20920 = runnableC17418;
            post(runnableC17418);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C20241.m45754()) {
                        C20241.m45753(this, iPointToPosition, childAt);
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f20921 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
            return zOnHoverEvent;
        }
        setSelection(-1);
        return zOnHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f20920 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m17111(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM30981;
        View childAt;
        View childAt2;
        C6528 c6528;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || z2) {
                    this.f20921 = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f20923 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.f20930 == null) {
                        this.f20930 = new C6528(this);
                    }
                    this.f20930.m8781(true);
                    this.f20930.onTouch(this, motionEvent);
                    return z;
                }
                c6528 = this.f20930;
                if (c6528 != null) {
                    c6528.m8781(false);
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f20921 = true;
                int i2 = Build.VERSION.SDK_INT;
                C16008.m37988(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f20923;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f20923 = iPointToPosition;
                C16008.m37988(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f20927;
                rect.set(left, top, right, bottom);
                rect.left -= this.f20929;
                rect.top -= this.f20926;
                rect.right += this.f20919;
                rect.bottom += this.f20925;
                if (i2 >= 33) {
                    zM30981 = C0484.m2359(this);
                } else {
                    zM30981 = C12480.m30981(this);
                }
                if (childAt3.isEnabled() != zM30981) {
                    boolean z4 = !zM30981;
                    if (i2 >= 33) {
                        C0484.m2358(this, z4);
                    } else {
                        C12480.m30980(this, z4);
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    C7603.m20127(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    C7603.m20127(selector2, f, f2);
                }
                C16713 c16713 = this.f20924;
                if (c16713 != null) {
                    c16713.m39189(false);
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f20921 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f20923 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f20921 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f20923 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f20930 == null) {
                this.f20930 = new C6528(this);
            }
            this.f20930.m8781(true);
            this.f20930.onTouch(this, motionEvent);
            return z;
        }
        c6528 = this.f20930;
        if (c6528 != null) {
            c6528.m8781(false);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17110(boolean z) {
        this.f20922 = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f20927;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
