package l;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.᩹ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes.dex */
public final class C22046 extends FrameLayout {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71450 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Integer f71451;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f71452;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f71453;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final VelocityTracker f71454;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21068 f71455;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f71456;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f71457;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f71458;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71459;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC19991 f71460;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f71461;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f71462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71463;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f71464;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C13465.m32966(view, "child");
        C13465.m32966(layoutParams, "params");
        if (view.getId() == R.id.MT_Protector) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            view.setVisibility(this.f71464 == 0.0f ? 4 : 0);
        } else if (view.getId() == R.id.MT_Protector) {
            view.setVisibility(this.f71464 == 0.0f ? 4 : 0);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C13465.m32966(motionEvent, "ev");
        if (!this.f71457) {
            this.f71462 = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f71456 = motionEvent.getX();
            this.f71453 = motionEvent.getY();
            this.f71458 = true;
            this.f71462 = false;
        } else if (action == 2 && this.f71458) {
            float fAbs = Math.abs(motionEvent.getX() - this.f71456);
            float y = motionEvent.getY() - this.f71453;
            if (y > this.f71452 && y > fAbs) {
                if (!C5112.m14258(this, motionEvent.getX(), motionEvent.getY())) {
                    this.f71462 = true;
                    return true;
                }
                this.f71458 = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C13465.m32966(motionEvent, "ev");
        if (!this.f71462) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = this.f71454;
        if (action != 1) {
            if (action == 2) {
                View viewM48977 = m48977();
                if (viewM48977 == null) {
                    return super.onTouchEvent(motionEvent);
                }
                ViewGroup.LayoutParams layoutParams = viewM48977.getLayoutParams();
                C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float measuredHeight = viewM48977.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                m48991(1 - (Math.min(Math.max((motionEvent.getY() - this.f71453) * 1.5f, 0.0f), measuredHeight) / measuredHeight));
                velocityTracker.addMovement(motionEvent);
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.f71462 = false;
        velocityTracker.computeCurrentVelocity(1000);
        float yVelocity = velocityTracker.getYVelocity();
        if (yVelocity <= -1000.0f) {
            m48989();
            return true;
        }
        if (yVelocity >= 1000.0f) {
            m48988();
            return true;
        }
        if (this.f71464 > 0.4f) {
            m48989();
            return true;
        }
        m48988();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48984(InterfaceC0878 interfaceC0878) {
        C13465.m32966(interfaceC0878, MessageHandler.Properties.Listener);
        this.f71459.add(interfaceC0878);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48985(C12874 c12874) {
        C13465.m32966(c12874, MessageHandler.Properties.Listener);
        this.f71459.remove(c12874);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C13465.m32966(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        m48991(bundle.getFloat("slideOffset"));
        super.onRestoreInstanceState(bundle.getParcelable("original"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22046(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13465.m32966(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22046(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13465.m32966(context, d.R);
        this.f71459 = new ArrayList();
        this.f71460 = new RunnableC19991(4, this);
        this.f71461 = 0.5f;
        this.f71452 = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new ViewOnClickListenerC18832(this, 4));
        m48991(0.0f);
        this.f71457 = false;
        this.f71454 = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48978(C22046 c22046) {
        if (c22046.f71451 != null || c22046.f71463) {
            c22046.f71451 = null;
            c22046.f71463 = false;
            c22046.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48986(C21068 c21068) {
        this.f71455 = c21068;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15456 m48987() {
        return this.f71455;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m48992() {
        return this.f71464;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48991(float f) {
        int i;
        View childAt;
        this.f71464 = f;
        int i2 = 0;
        if (f == 1.0f) {
            this.f71457 = true;
        } else if (f == 0.0f) {
            this.f71457 = false;
        }
        Iterator it = this.f71459.iterator();
        while (it.hasNext()) {
            ((InterfaceC0878) it.next()).mo3550(f);
        }
        if (f == 0.0f) {
            if (isClickable()) {
                setClickable(false);
            }
            setBackgroundColor(0);
            i = 4;
        } else {
            if (!isClickable()) {
                setClickable(true);
            }
            setBackgroundColor(Color.argb((int) (f * IShizukuService.Stub.TRANSACTION_attachUserService), 0, 0, 0));
            i = 0;
        }
        View viewM48977 = m48977();
        if (viewM48977 != null) {
            if (viewM48977.getVisibility() != i) {
                viewM48977.setVisibility(i);
                C21068 c21068 = this.f71455;
                if (c21068 != null) {
                    c21068.invoke(Boolean.valueOf(i == 0));
                }
            }
            ViewGroup.LayoutParams layoutParams = viewM48977.getLayoutParams();
            C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM48977.setTranslationY((1 - this.f71464) * (viewM48977.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
        }
        int childCount = getChildCount();
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if (childAt.getId() == R.id.MT_Protector) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt == null || childAt.getVisibility() == i) {
            return;
        }
        childAt.setVisibility(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m48980() {
        return this.f71461;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48982(float f) {
        this.f71461 = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m48979() {
        return this.f71464 == 0.0f;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private final View m48977() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.MT_Protector) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View viewM48977 = m48977();
        if (viewM48977 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewM48977.getLayoutParams();
        C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        if (measuredHeight <= 0) {
            measuredHeight = 0;
        }
        int iMin = (int) (measuredHeight * this.f71461);
        Integer num = this.f71451;
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.f71463 && measuredHeight >= iIntValue && Math.abs(iMin - iIntValue) <= 1) {
                removeCallbacks(this.f71460);
                this.f71451 = null;
                this.f71463 = false;
            } else {
                iMin = Math.min(iIntValue, measuredHeight);
            }
        }
        viewM48977.measure(View.MeasureSpec.makeMeasureSpec(viewM48977.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48983(int i) {
        int iMax = Math.max(0, i);
        Integer num = this.f71451;
        if (num == null || num.intValue() != iMax || this.f71463) {
            removeCallbacks(this.f71460);
            this.f71451 = Integer.valueOf(iMax);
            this.f71463 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48990() {
        if (this.f71451 != null) {
            RunnableC19991 runnableC19991 = this.f71460;
            removeCallbacks(runnableC19991);
            postDelayed(runnableC19991, 400L);
        }
        if (this.f71451 == null || this.f71463) {
            return;
        }
        this.f71463 = true;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48981() {
        if (this.f71451 != null || this.f71463) {
            removeCallbacks(this.f71460);
            this.f71451 = null;
            this.f71463 = false;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f71460);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View viewM48977 = m48977();
        if (viewM48977 != null) {
            ViewGroup.LayoutParams layoutParams = viewM48977.getLayoutParams();
            C13465.m32963((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM48977.setTranslationY((1 - this.f71464) * (viewM48977.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m48989() {
        float f = this.f71464;
        if (f == 1.0f) {
            return;
        }
        C14736 c14736 = new C14736();
        c14736.mo15352(f, 1.0f);
        c14736.m35310(new DecelerateInterpolator());
        c14736.mo15353((long) ((1.0f - this.f71464) * 250));
        c14736.m35312(new InterfaceC23908() { // from class: l.ۨۘ᩺
            @Override // l.InterfaceC23908
            /* JADX INFO: renamed from: ۙ */
            public final void mo6994(C14736 c14737) {
                int i = C22046.f71450;
                Object objM35316 = c14737.m35316();
                C13465.m32963(objM35316, "null cannot be cast to non-null type kotlin.Float");
                this.f38595.m48991(((Float) objM35316).floatValue());
            }
        });
        c14736.m35318();
        this.f71457 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48988() {
        float f = this.f71464;
        if (f == 0.0f) {
            return;
        }
        float[] fArr = {f, 0.0f};
        C14736 c14736 = new C14736();
        c14736.mo15352(fArr);
        c14736.mo15353((long) (200 * this.f71464));
        c14736.m35312(new InterfaceC23908() { // from class: l.ۖۘ᩺
            @Override // l.InterfaceC23908
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo6994(C14736 c14737) {
                int i = C22046.f71450;
                Object objM35316 = c14737.m35316();
                C13465.m32963(objM35316, "null cannot be cast to non-null type kotlin.Float");
                this.f8163.m48991(((Float) objM35316).floatValue());
            }
        });
        c14736.m35318();
        this.f71457 = false;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putFloat("slideOffset", this.f71464);
        bundle.putParcelable("original", super.onSaveInstanceState());
        return bundle;
    }
}
