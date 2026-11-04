package l;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: JIRB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13045 extends C15688 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Drawable[] f41744;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f41745;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12628 f41746;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f41747;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f41748;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Rect f41749;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final PopupWindow f41750;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] f41751;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f41752;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f41753;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f41754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f41755;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f41756;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f41757;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f41758;

    public C13045(C12628 c12628, int i) {
        super(c12628.getContext());
        this.f41747 = -1;
        this.f41744 = new Drawable[3];
        this.f41754 = new RectF();
        this.f41758 = new Rect();
        this.f41751 = new int[2];
        Rect rect = new Rect();
        this.f41749 = rect;
        this.f41756 = Collections.singletonList(rect);
        this.f41746 = c12628;
        m32473(i);
        setScaleType(ImageView.ScaleType.FIT_XY);
        int i2 = C3296.f10738;
        this.f41753 = i2;
        setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        PopupWindow popupWindow = new PopupWindow(this);
        this.f41750 = popupWindow;
        popupWindow.setAnimationStyle(0);
        popupWindow.setClippingEnabled(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        C20323.m46664(popupWindow, 1999);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32473(int i) {
        int i2;
        if (this.f41747 == i) {
            return;
        }
        this.f41747 = i;
        Drawable[] drawableArr = this.f41744;
        Drawable drawableMutate = drawableArr[i];
        if (drawableMutate == null) {
            if (i == 1) {
                i2 = R.drawable.MT_Protector;
            } else {
                i2 = i == 2 ? R.drawable.MT_Protector : R.drawable.MT_Protector;
            }
            drawableMutate = C9217.m24392(getResources(), i2, null).mutate();
            drawableMutate.setAlpha(i == 0 ? 230 : 210);
            drawableArr[i] = drawableMutate;
        }
        setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32476(RectF rectF, boolean z, int i) {
        if (z) {
            this.f41754.set(rectF);
            m32473(i);
        }
        this.f41757 = this.f41746.f40509.m17187();
        this.f41748 = z || this.f41755;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m32479() {
        return this.f41748;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m32480() {
        return this.f41755;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m32481() {
        return this.f41747;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m32478() {
        float f;
        boolean z = this.f41748;
        C12628 c12628 = this.f41746;
        boolean z2 = z && c12628.m31375();
        if (!z2) {
            this.f41748 = false;
        } else if (this.f41757 != c12628.f40509.m17187()) {
            return;
        }
        RectF rectF = this.f41754;
        float f2 = rectF.top;
        if (z2 && !this.f41755) {
            float f3 = rectF.left;
            float fWidth = rectF.width();
            int i = this.f41747;
            if (i == 1) {
                f = 0.75f;
            } else {
                f = i == 2 ? 0.25f : 0.5f;
            }
            float f4 = (fWidth * f) + f3;
            float f5 = (c12628.f40497.f18046 * 1.5f) + 1.0f;
            Rect rect = this.f41758;
            z2 = c12628.getLocalVisibleRect(rect) && f4 >= ((float) rect.left) - f5 && f4 <= ((float) rect.right) + f5 && f2 >= ((float) Math.max(rect.top, c12628.f40530.m36667())) && f2 <= ((float) (rect.bottom + 1));
        }
        if (!z2) {
            m32475();
            return;
        }
        int i2 = this.f41753;
        int i3 = C3296.f10738;
        if (i2 != i3) {
            this.f41753 = i3;
            setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        int[] iArr = this.f41751;
        c12628.getLocationInWindow(iArr);
        int i4 = iArr[0];
        int i5 = (int) rectF.left;
        int i6 = i4 + i5;
        int i7 = iArr[1] + ((int) f2);
        int iMax = Math.max(1, ((int) rectF.right) - i5);
        int iMax2 = Math.max(1, ((int) rectF.bottom) - ((int) rectF.top));
        PopupWindow popupWindow = this.f41750;
        if (popupWindow.isShowing()) {
            popupWindow.update(i6, i7, iMax, iMax2);
            return;
        }
        popupWindow.setWidth(iMax);
        popupWindow.setHeight(iMax2);
        popupWindow.showAtLocation(c12628, 51, i6, i7);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32477() {
        this.f41748 = false;
        m32475();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m32475() {
        if (this.f41755) {
            this.f41755 = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, this.f41752, this.f41745, 0);
            try {
                m32474(motionEventObtain);
                motionEventObtain.recycle();
            } catch (Throwable th) {
                motionEventObtain.recycle();
                throw th;
            }
        }
        PopupWindow popupWindow = this.f41750;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r5.f41755 == false) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            l.ۨ᩷ܳ r1 = r5.f41746
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L18
            boolean r4 = r5.f41748
            if (r4 == 0) goto L1c
            boolean r4 = r1.m31375()
            if (r4 != 0) goto L15
            goto L1c
        L15:
            r5.f41755 = r2
            goto L1d
        L18:
            boolean r4 = r5.f41755
            if (r4 != 0) goto L1d
        L1c:
            return r3
        L1d:
            float r4 = r6.getRawX()
            r5.f41752 = r4
            float r4 = r6.getRawY()
            r5.f41745 = r4
            r4 = 3
            if (r0 == r2) goto L2e
            if (r0 != r4) goto L30
        L2e:
            r5.f41755 = r3
        L30:
            boolean r6 = r5.m32474(r6)
            if (r6 != 0) goto L38
            r5.f41755 = r3
        L38:
            if (r0 == r2) goto L3e
            if (r0 != r4) goto L3d
            goto L3e
        L3d:
            return r6
        L3e:
            r1.invalidate()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13045.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32474(MotionEvent motionEvent) {
        C12628 c12628 = this.f41746;
        int[] iArr = this.f41751;
        c12628.getLocationOnScreen(iArr);
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(motionEvent.getRawX() - iArr[0], motionEvent.getRawY() - iArr[1]);
        try {
            return c12628.m31368(motionEventObtain, this.f41747);
        } finally {
            motionEventObtain.recycle();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f41749.set(0, 0, getWidth(), getHeight());
            setSystemGestureExclusionRects(this.f41756);
        }
    }
}
