package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.۫᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7IM */
/* JADX INFO: loaded from: classes3.dex */
public class C12606 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f42110;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float f42111;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f42112;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23895 f42113;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42114;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MotionEvent f42115;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f42116;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11612 f42117;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f42118;

    public C12606(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12606(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42116 = new int[2];
        this.f42111 = ViewConfiguration.get(context).getScaledTouchSlop();
        setFocusable(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31379(C23895 c23895, InterfaceC11612 interfaceC11612, View view) {
        this.f42113 = c23895;
        this.f42117 = interfaceC11612;
        this.f42110 = view;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[PHI: r0
      0x0073: PHI (r0v18 android.view.MotionEvent) = (r0v17 android.view.MotionEvent), (r0v21 android.view.MotionEvent) binds: [B:33:0x0071, B:30:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C23895 c23895;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MotionEvent motionEvent3 = this.f42115;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                this.f42115 = null;
            }
            this.f42114 = 0;
            InterfaceC11612 interfaceC11612 = this.f42117;
            if ((interfaceC11612 != null && interfaceC11612.mo9107(motionEvent.getRawX(), motionEvent.getRawY())) || (c23895 = this.f42113) == null || c23895.getVisibility() != 0) {
                return false;
            }
            this.f42112 = motionEvent.getRawX();
            this.f42118 = motionEvent.getRawY();
            this.f42115 = MotionEvent.obtain(motionEvent);
            m31378(this.f42110, motionEvent);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.f42114;
                if (i == 1 || i == 2) {
                    return m31377(motionEvent);
                }
                float fAbs = Math.abs(motionEvent.getRawX() - this.f42112);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.f42118);
                if (Math.max(fAbs, fAbs2) <= this.f42111) {
                    return true;
                }
                if (fAbs2 > fAbs) {
                    this.f42114 = 1;
                    View view = this.f42110;
                    if (view != null && view.getVisibility() == 0) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                        m31378(this.f42110, motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    MotionEvent motionEvent4 = this.f42115;
                    if (motionEvent4 != null) {
                        m31378(this.f42113, motionEvent4);
                        motionEvent2 = this.f42115;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f42115 = null;
                        }
                    }
                } else {
                    this.f42114 = 2;
                    motionEvent2 = this.f42115;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                        this.f42115 = null;
                    }
                }
                return m31377(motionEvent);
            }
            if (actionMasked != 3) {
                return m31377(motionEvent);
            }
        }
        if (this.f42114 == 0) {
            this.f42114 = 2;
        }
        boolean zM31377 = m31377(motionEvent);
        MotionEvent motionEvent5 = this.f42115;
        if (motionEvent5 != null) {
            motionEvent5.recycle();
            this.f42115 = null;
        }
        this.f42114 = 0;
        return zM31377;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31377(MotionEvent motionEvent) {
        int i = this.f42114;
        if (i == 1) {
            return m31378(this.f42113, motionEvent);
        }
        if (i == 2) {
            return m31378(this.f42110, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31378(View view, MotionEvent motionEvent) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr = this.f42116;
        view.getLocationOnScreen(iArr);
        motionEventObtain.offsetLocation((motionEvent.getRawX() - iArr[0]) - motionEvent.getX(), (motionEvent.getRawY() - iArr[1]) - motionEvent.getY());
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zDispatchTouchEvent;
    }
}
