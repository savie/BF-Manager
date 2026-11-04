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

/* JADX INFO: renamed from: l.ۜܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7198 extends FrameLayout {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23752 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f23753;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f23754;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23755;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final VelocityTracker f23756;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f23757;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f23758;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f23759;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f23760;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16247 f23761;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f23762;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC18779 f23763;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Integer f23764;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f23765;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f23766;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C15243.m36590(view, "child");
        C15243.m36590(layoutParams, "params");
        if (view.getId() == R.id.MT_Protector) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            view.setVisibility(this.f23760 == 0.0f ? 4 : 0);
        } else if (view.getId() == R.id.MT_Protector) {
            view.setVisibility(this.f23760 == 0.0f ? 4 : 0);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C15243.m36590(motionEvent, "ev");
        if (!this.f23754) {
            this.f23765 = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23757 = motionEvent.getX();
            this.f23762 = motionEvent.getY();
            this.f23758 = true;
            this.f23765 = false;
        } else if (action == 2 && this.f23758) {
            float fAbs = Math.abs(motionEvent.getX() - this.f23757);
            float y = motionEvent.getY() - this.f23762;
            if (y > this.f23759 && y > fAbs) {
                if (!C8689.m23381(this, motionEvent.getX(), motionEvent.getY())) {
                    this.f23765 = true;
                    return true;
                }
                this.f23758 = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C15243.m36590(motionEvent, "ev");
        if (!this.f23765) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = this.f23756;
        if (action != 1) {
            if (action == 2) {
                View viewM19771 = m19771();
                if (viewM19771 == null) {
                    return super.onTouchEvent(motionEvent);
                }
                ViewGroup.LayoutParams layoutParams = viewM19771.getLayoutParams();
                C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float measuredHeight = viewM19771.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                m19785(1 - (Math.min(Math.max((motionEvent.getY() - this.f23762) * 1.5f, 0.0f), measuredHeight) / measuredHeight));
                velocityTracker.addMovement(motionEvent);
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        this.f23765 = false;
        velocityTracker.computeCurrentVelocity(1000);
        float yVelocity = velocityTracker.getYVelocity();
        if (yVelocity <= -1000.0f) {
            m19779();
            return true;
        }
        if (yVelocity >= 1000.0f) {
            m19780();
            return true;
        }
        if (this.f23760 > 0.4f) {
            m19779();
            return true;
        }
        m19780();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19776(C5159 c5159) {
        C15243.m36590(c5159, MessageHandler.Properties.Listener);
        this.f23755.remove(c5159);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19777(InterfaceC13909 interfaceC13909) {
        C15243.m36590(interfaceC13909, MessageHandler.Properties.Listener);
        this.f23755.add(interfaceC13909);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C15243.m36590(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        m19785(bundle.getFloat("slideOffset"));
        super.onRestoreInstanceState(bundle.getParcelable("original"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7198(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C15243.m36590(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7198(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C15243.m36590(context, d.R);
        this.f23755 = new ArrayList();
        this.f23763 = new RunnableC18779(2, this);
        this.f23753 = 0.5f;
        this.f23759 = ViewConfiguration.get(context).getScaledTouchSlop();
        setOnClickListener(new View.OnClickListener() { // from class: l.ۖܰ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C7198.f23752;
                this.f9081.m19780();
            }
        });
        m19785(0.0f);
        this.f23754 = false;
        this.f23756 = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19772(C7198 c7198) {
        if (c7198.f23764 != null || c7198.f23766) {
            c7198.f23764 = null;
            c7198.f23766 = false;
            c7198.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19778(C16247 c16247) {
        this.f23761 = c16247;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3071 m19783() {
        return this.f23761;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m19782() {
        return this.f23760;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19785(float f) {
        int i;
        View childAt;
        this.f23760 = f;
        int i2 = 0;
        if (f == 1.0f) {
            this.f23754 = true;
        } else if (f == 0.0f) {
            this.f23754 = false;
        }
        Iterator it = this.f23755.iterator();
        while (it.hasNext()) {
            ((InterfaceC13909) it.next()).mo15578(f);
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
        View viewM19771 = m19771();
        if (viewM19771 != null) {
            if (viewM19771.getVisibility() != i) {
                viewM19771.setVisibility(i);
                C16247 c16247 = this.f23761;
                if (c16247 != null) {
                    c16247.invoke(Boolean.valueOf(i == 0));
                }
            }
            ViewGroup.LayoutParams layoutParams = viewM19771.getLayoutParams();
            C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM19771.setTranslationY((1 - this.f23760) * (viewM19771.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m19786() {
        return this.f23753;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19774(float f) {
        this.f23753 = f;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m19781() {
        return this.f23760 == 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final View m19771() {
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
        View viewM19771 = m19771();
        if (viewM19771 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewM19771.getLayoutParams();
        C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        if (measuredHeight <= 0) {
            measuredHeight = 0;
        }
        int iMin = (int) (measuredHeight * this.f23753);
        Integer num = this.f23764;
        if (num != null) {
            int iIntValue = num.intValue();
            if (this.f23766 && measuredHeight >= iIntValue && Math.abs(iMin - iIntValue) <= 1) {
                removeCallbacks(this.f23763);
                this.f23764 = null;
                this.f23766 = false;
            } else {
                iMin = Math.min(iIntValue, measuredHeight);
            }
        }
        viewM19771.measure(View.MeasureSpec.makeMeasureSpec(viewM19771.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19775(int i) {
        int iMax = Math.max(0, i);
        Integer num = this.f23764;
        if (num == null || num.intValue() != iMax || this.f23766) {
            removeCallbacks(this.f23763);
            this.f23764 = Integer.valueOf(iMax);
            this.f23766 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19784() {
        if (this.f23764 != null) {
            RunnableC18779 runnableC18779 = this.f23763;
            removeCallbacks(runnableC18779);
            postDelayed(runnableC18779, 400L);
        }
        if (this.f23764 == null || this.f23766) {
            return;
        }
        this.f23766 = true;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19773() {
        if (this.f23764 != null || this.f23766) {
            removeCallbacks(this.f23763);
            this.f23764 = null;
            this.f23766 = false;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f23763);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View viewM19771 = m19771();
        if (viewM19771 != null) {
            ViewGroup.LayoutParams layoutParams = viewM19771.getLayoutParams();
            C15243.m36587((Object) layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            viewM19771.setTranslationY((1 - this.f23760) * (viewM19771.getMeasuredHeight() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m19779() {
        float f = this.f23760;
        if (f == 1.0f) {
            return;
        }
        C11488 c11488 = new C11488();
        c11488.mo28874(f, 1.0f);
        c11488.m28871(new DecelerateInterpolator());
        c11488.mo28882((long) ((1.0f - this.f23760) * 250));
        c11488.m28872(new InterfaceC1794() { // from class: l.֨ܰ᩻
            @Override // l.InterfaceC1794
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo4470(C11488 c11489) {
                int i = C7198.f23752;
                Object objM28881 = c11489.m28881();
                C15243.m36587(objM28881, "null cannot be cast to non-null type kotlin.Float");
                this.f4484.m19785(((Float) objM28881).floatValue());
            }
        });
        c11488.m28879();
        this.f23754 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m19780() {
        float f = this.f23760;
        if (f == 0.0f) {
            return;
        }
        float[] fArr = {f, 0.0f};
        C11488 c11488 = new C11488();
        c11488.mo28874(fArr);
        c11488.mo28882((long) (200 * this.f23760));
        c11488.m28872(new InterfaceC1794() { // from class: l.ۡܰ᩻
            @Override // l.InterfaceC1794
            /* JADX INFO: renamed from: ۙ */
            public final void mo4470(C11488 c11489) {
                int i = C7198.f23752;
                Object objM28881 = c11489.m28881();
                C15243.m36587(objM28881, "null cannot be cast to non-null type kotlin.Float");
                this.f30609.m19785(((Float) objM28881).floatValue());
            }
        });
        c11488.m28879();
        this.f23754 = false;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putFloat("slideOffset", this.f23760);
        bundle.putParcelable("original", super.onSaveInstanceState());
        return bundle;
    }
}
