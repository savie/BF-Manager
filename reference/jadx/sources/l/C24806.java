package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: DIQO */
/* JADX INFO: loaded from: classes.dex */
public final class C24806 extends LinearLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f80256;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC11379 f80257;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f80258;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f80259;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f80260;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f80261;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public View f80262;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f80263;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15854 f80264;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f80265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f80266;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f80267;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f80268;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f80269;

    public C24806(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80260 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f80268 = Math.max(ViewConfiguration.get(context).getScaledMinimumFlingVelocity(), getResources().getDisplayMetrics().density * 500.0f);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f80264 = (C15854) findViewById(R.id.MT_Protector);
        this.f80262 = findViewById(R.id.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55320(InterfaceC11379 interfaceC11379) {
        this.f80257 = interfaceC11379;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            m55316();
            this.f80266 = false;
            this.f80261 = false;
            if (this.f80257 != null && (m55318(this.f80262, motionEvent) || m55318(this.f80264, motionEvent))) {
                z = true;
            }
            this.f80265 = z;
            if (z) {
                this.f80269 = motionEvent.getRawX();
                this.f80267 = motionEvent.getRawY();
                this.f80263 = this.f80264.m37813();
                this.f80259 = VelocityTracker.obtain();
                m55317(motionEvent);
            }
        } else if (actionMasked == 1) {
            this.f80265 = false;
            m55316();
        } else if (actionMasked != 2) {
            if (actionMasked == 3 || actionMasked == 5) {
                this.f80265 = false;
                m55316();
            }
        } else if (this.f80265) {
            m55317(motionEvent);
            if (m55319(motionEvent)) {
                return true;
            }
        }
        return this.f80261;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m55319(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY() - this.f80267;
        float rawX = motionEvent.getRawX() - this.f80269;
        if (Math.max(Math.abs(rawX), Math.abs(rawY)) <= this.f80260) {
            return false;
        }
        if (Math.abs(rawX) >= Math.abs(rawY) || ((rawY < 0.0f && !this.f80257.mo28705()) || (rawY > 0.0f && this.f80264.m37809() == 0.0f))) {
            this.f80265 = false;
            m55316();
            return false;
        }
        this.f80261 = true;
        this.f80258 = this.f80264.m37809();
        this.f80256 = this.f80264.m37810(getWidth());
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f80264.m37811(this.f80258 - (rawY / this.f80256));
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f80265 && !this.f80261) {
            return super.onTouchEvent(motionEvent);
        }
        m55317(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f80261 && this.f80265) {
                    m55319(motionEvent);
                }
                if (this.f80261 && !this.f80266) {
                    this.f80264.m37811(this.f80258 - ((motionEvent.getRawY() - this.f80267) / this.f80256));
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    if (!this.f80261) {
                        this.f80265 = false;
                        return true;
                    }
                    this.f80266 = true;
                    this.f80264.m37812(this.f80263, true);
                    return true;
                }
            }
            return true;
        }
        if (this.f80261 && !this.f80266) {
            this.f80259.computeCurrentVelocity(1000);
            float yVelocity = this.f80259.getYVelocity();
            if (motionEvent.getActionMasked() == 3) {
                z = this.f80263;
            } else {
                z = Math.abs(yVelocity) < this.f80268 ? this.f80264.m37809() >= 0.5f : yVelocity < 0.0f;
            }
            if (z && !this.f80257.mo28705()) {
                z = false;
            }
            this.f80264.m37812(z, true);
            if (motionEvent.getActionMasked() == 1) {
                this.f80257.mo28704(z);
            }
        }
        this.f80261 = false;
        this.f80265 = false;
        m55316();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55318(View view, MotionEvent motionEvent) {
        return view.getVisibility() == 0 && motionEvent.getX() >= ((float) view.getLeft()) && motionEvent.getX() < ((float) view.getRight()) && motionEvent.getY() >= ((float) view.getTop()) && motionEvent.getY() < ((float) view.getBottom());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55317(MotionEvent motionEvent) {
        if (this.f80259 == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
        this.f80259.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55316() {
        VelocityTracker velocityTracker = this.f80259;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f80259 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f80261 = false;
        this.f80265 = false;
        m55316();
        super.onDetachedFromWindow();
    }
}
