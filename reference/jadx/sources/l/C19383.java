package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩵ۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes4.dex */
public class C19383 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f62472;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f62473;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62474;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f62475;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f62476;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f62477;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f62478;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f62479;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f62480;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f62481;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final Rect f62482;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62483;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62484;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f62485;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f62486;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f62487;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f62488;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f62489;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f62490;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f62491;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f62492;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62493;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62494;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f62495;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Runnable f62496;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f62497;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f62498;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f62499;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f62500;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public Scroller f62501;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62502;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C3859 f62503;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f62504;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f62505;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C17971 f62506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC14217 f62507;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f62508;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public Parcelable f62509;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f62510;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21499 f62511;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f62512;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f62513;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f62514;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f62469 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final Comparator f62471 = new C2448();

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f62470 = new InterpolatorC5271();

    public C19383(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62483 = new ArrayList();
        this.f62503 = new C3859();
        this.f62482 = new Rect();
        this.f62499 = -1;
        this.f62509 = null;
        this.f62477 = -3.4028235E38f;
        this.f62510 = Float.MAX_VALUE;
        this.f62486 = 1;
        this.f62498 = -1;
        this.f62487 = true;
        this.f62496 = new RunnableC22205(this);
        this.f62473 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f62501 = new Scroller(context2, f62470);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f62490 = viewConfiguration.getScaledPagingTouchSlop();
        this.f62485 = (int) (400.0f * f);
        this.f62505 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f62504 = new EdgeEffect(context2);
        this.f62508 = new EdgeEffect(context2);
        this.f62479 = (int) (25.0f * f);
        this.f62502 = (int) (2.0f * f);
        this.f62513 = (int) (f * 16.0f);
        C5031.m13990(this, new C22911(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C5031.m13989(this, new C1037(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f62496);
        Scroller scroller = this.f62501;
        if (scroller != null && !scroller.isFinished()) {
            this.f62501.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m44434(int i) {
        if (this.f62473 == i) {
            return;
        }
        this.f62473 = i;
        ArrayList arrayList = this.f62488;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC21499 interfaceC21499 = (InterfaceC21499) this.f62488.get(i2);
                if (interfaceC21499 != null) {
                    interfaceC21499.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC21499 interfaceC214910 = this.f62511;
        if (interfaceC214910 != null) {
            interfaceC214910.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44420(AbstractC14217 abstractC14217) {
        ArrayList arrayList;
        AbstractC14217 abstractC14218 = this.f62507;
        if (abstractC14218 != null) {
            abstractC14218.m34324(null);
            this.f62507.mo34321(this);
            int i = 0;
            while (true) {
                arrayList = this.f62483;
                if (i >= arrayList.size()) {
                    break;
                }
                C3859 c3859 = (C3859) arrayList.get(i);
                this.f62507.mo4243(this, c3859.f14417, c3859.f14415);
                i++;
            }
            this.f62507.mo34318();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C6682) getChildAt(i2).getLayoutParams()).f22550) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f62481 = 0;
            scrollTo(0, 0);
        }
        AbstractC14217 abstractC14219 = this.f62507;
        this.f62507 = abstractC14217;
        this.f62475 = 0;
        if (abstractC14217 != null) {
            if (this.f62506 == null) {
                this.f62506 = new C17971(this);
            }
            this.f62507.m34324(this.f62506);
            this.f62484 = false;
            boolean z = this.f62487;
            this.f62487 = true;
            this.f62475 = this.f62507.mo4245();
            if (this.f62499 >= 0) {
                this.f62507.getClass();
                m44419(this.f62499, 0, false, true);
                this.f62499 = -1;
                this.f62509 = null;
            } else if (!z) {
                m44424();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f62472;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f62472.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC15150) this.f62472.get(i3)).onAdapterChanged(this, abstractC14219, abstractC14217);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC14217 m44430() {
        return this.f62507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44421(InterfaceC15150 interfaceC15150) {
        if (this.f62472 == null) {
            this.f62472 = new ArrayList();
        }
        this.f62472.add(interfaceC15150);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44431(InterfaceC15150 interfaceC15150) {
        ArrayList arrayList = this.f62472;
        if (arrayList != null) {
            arrayList.remove(interfaceC15150);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m44401() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44413(int i) {
        this.f62484 = false;
        m44419(i, 0, !this.f62487, false);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44425(int i) {
        this.f62484 = false;
        m44419(i, 0, true, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m44426() {
        return this.f62481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44419(int i, int i2, boolean z, boolean z2) {
        AbstractC14217 abstractC14217 = this.f62507;
        if (abstractC14217 == null || abstractC14217.mo4245() <= 0) {
            m44412(false);
            return;
        }
        ArrayList arrayList = this.f62483;
        if (!z2 && this.f62481 == i && arrayList.size() != 0) {
            m44412(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f62507.mo4245()) {
            i = this.f62507.mo4245() - 1;
        }
        int i3 = this.f62486;
        int i4 = this.f62481;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C3859) arrayList.get(i5)).f14414 = true;
            }
        }
        boolean z3 = this.f62481 != i;
        if (this.f62487) {
            this.f62481 = i;
            if (z3) {
                m44402(i);
            }
            requestLayout();
            return;
        }
        m44427(i);
        m44411(i, i2, z, z3);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m44411(int i, int i2, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        C3859 c3859M44429 = m44429(i);
        if (c3859M44429 != null) {
            iMax = (int) (Math.max(this.f62477, Math.min(c3859M44429.f14418, this.f62510)) * m44401());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                m44402(i);
            }
            m44406(false);
            scrollTo(iMax, 0);
            m44410(iMax);
            return;
        }
        if (getChildCount() == 0) {
            m44412(false);
        } else {
            Scroller scroller = this.f62501;
            if (scroller != null && !scroller.isFinished()) {
                scrollX = this.f62494 ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                m44412(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m44406(false);
                m44424();
                m44434(0);
            } else {
                m44412(true);
                m44434(2);
                int iM44401 = m44401();
                int i6 = iM44401 / 2;
                float f = iM44401;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f62507.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f62494 = false;
                this.f62501.startScroll(i3, scrollY, i4, i5, iMin);
                int i7 = C5031.f17539;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m44402(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44422(InterfaceC21499 interfaceC21499) {
        if (this.f62488 == null) {
            this.f62488 = new ArrayList();
        }
        this.f62488.add(interfaceC21499);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44432(InterfaceC21499 interfaceC21499) {
        ArrayList arrayList = this.f62488;
        if (arrayList != null) {
            arrayList.remove(interfaceC21499);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44428(InterfaceC21499 interfaceC21499) {
        this.f62511 = interfaceC21499;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m44433() {
        if (3 != this.f62486) {
            this.f62486 = 3;
            m44424();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3859 m44415(int i, int i2) {
        C3859 c3859 = new C3859();
        c3859.f14417 = i;
        c3859.f14415 = this.f62507.mo4242(this, i);
        this.f62507.getClass();
        c3859.f14416 = 1.0f;
        ArrayList arrayList = this.f62483;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(c3859);
            return c3859;
        }
        arrayList.add(i2, c3859);
        return c3859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44417() {
        int iMo4245 = this.f62507.mo4245();
        this.f62475 = iMo4245;
        ArrayList arrayList = this.f62483;
        boolean z = arrayList.size() < (this.f62486 * 2) + 1 && arrayList.size() < iMo4245;
        int i = this.f62481;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C3859 c3859 = (C3859) arrayList.get(i2);
            AbstractC14217 abstractC14217 = this.f62507;
            Object obj = c3859.f14415;
            abstractC14217.getClass();
        }
        Collections.sort(arrayList, f62471);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C6682 c6682 = (C6682) getChildAt(i3).getLayoutParams();
                if (!c6682.f22550) {
                    c6682.f22547 = 0.0f;
                }
            }
            m44419(i, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m44424() {
        m44427(this.f62481);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e9 A[PHI: r6 r9 r15
      0x00e9: PHI (r6v20 int) = (r6v19 int), (r6v8 int), (r6v23 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r9v6 int) = (r9v1 int), (r9v5 int), (r9v9 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v2 float) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0170 A[PHI: r4 r13
      0x0170: PHI (r4v11 float) = (r4v9 float), (r4v10 float), (r4v8 float) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v37 int) = (r13v35 int), (r13v36 int), (r13v34 int) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44427(int i) {
        C3859 c3859M44429;
        String hexString;
        ArrayList arrayList;
        C3859 c3859M44415;
        float f;
        C3859 c3859M44416;
        C3859 c3859M44417;
        float paddingLeft;
        int i2;
        int i3;
        C3859 c3859;
        C3859 c38510;
        C3859 c38511;
        int i4 = this.f62481;
        if (i4 != i) {
            c3859M44429 = m44429(i4);
            this.f62481 = i;
        } else {
            c3859M44429 = null;
        }
        if (this.f62507 == null || this.f62484 || getWindowToken() == null) {
            return;
        }
        this.f62507.mo34321(this);
        int i5 = this.f62486;
        int i6 = 0;
        int iMax = Math.max(0, this.f62481 - i5);
        int iMo4245 = this.f62507.mo4245();
        int iMin = Math.min(iMo4245 - 1, this.f62481 + i5);
        if (iMo4245 != this.f62475) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            C23821.m52500(sb, this.f62475, ", found: ", iMo4245, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.f62507.getClass());
            throw new IllegalStateException(sb.toString());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.f62483;
            if (i7 < arrayList.size()) {
                c3859M44415 = (C3859) arrayList.get(i7);
                int i8 = c3859M44415.f14417;
                int i9 = this.f62481;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            c3859M44415 = null;
            break;
        }
        if (c3859M44415 == null && iMo4245 > 0) {
            c3859M44415 = m44415(this.f62481, i7);
        }
        if (c3859M44415 != null) {
            int i10 = i7 - 1;
            C3859 c38512 = i10 >= 0 ? (C3859) arrayList.get(i10) : null;
            int iM44401 = m44401();
            if (iM44401 <= 0) {
                f = 0.0f;
                paddingLeft = 0.0f;
            } else {
                paddingLeft = (getPaddingLeft() / iM44401) + (2.0f - c3859M44415.f14416);
                f = 0.0f;
            }
            float f2 = 0.0f;
            for (int i11 = this.f62481 - 1; i11 >= 0; i11--) {
                if (f2 < paddingLeft || i11 >= iMax) {
                    if (c38512 == null || i11 != c38512.f14417) {
                        f2 += m44415(i11, i10 + 1).f14416;
                        i7++;
                        if (i10 >= 0) {
                            c38511 = (C3859) arrayList.get(i10);
                        } else {
                            c38511 = null;
                        }
                    } else {
                        f2 += c38512.f14416;
                        i10--;
                        if (i10 >= 0) {
                            c38511 = (C3859) arrayList.get(i10);
                        } else {
                            c38511 = null;
                        }
                    }
                    c38512 = c38511;
                } else {
                    if (c38512 == null) {
                        break;
                    }
                    if (i11 == c38512.f14417 && !c38512.f14414) {
                        arrayList.remove(i10);
                        this.f62507.mo4243(this, i11, c38512.f14415);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            c38511 = (C3859) arrayList.get(i10);
                        } else {
                            c38511 = null;
                        }
                        c38512 = c38511;
                    }
                }
            }
            float f3 = c3859M44415.f14416;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                C3859 c38513 = i12 < arrayList.size() ? (C3859) arrayList.get(i12) : null;
                float paddingRight = iM44401 <= 0 ? 0.0f : 2.0f + (getPaddingRight() / iM44401);
                int i13 = i12;
                for (int i14 = this.f62481 + 1; i14 < iMo4245; i14++) {
                    if (f3 >= paddingRight && i14 > iMin) {
                        if (c38513 == null) {
                            break;
                        }
                        if (i14 == c38513.f14417 && !c38513.f14414) {
                            arrayList.remove(i13);
                            this.f62507.mo4243(this, i14, c38513.f14415);
                            if (i13 < arrayList.size()) {
                                c38513 = (C3859) arrayList.get(i13);
                            } else {
                                c38513 = null;
                            }
                        }
                    } else if (c38513 == null || i14 != c38513.f14417) {
                        C3859 c3859M44418 = m44415(i14, i13);
                        i13++;
                        f3 += c3859M44418.f14416;
                        if (i13 < arrayList.size()) {
                            c38513 = (C3859) arrayList.get(i13);
                        } else {
                            c38513 = null;
                        }
                    } else {
                        f3 += c38513.f14416;
                        i13++;
                        if (i13 < arrayList.size()) {
                            c38513 = (C3859) arrayList.get(i13);
                        } else {
                            c38513 = null;
                        }
                    }
                }
            }
            int iMo4246 = this.f62507.mo4245();
            int iM44402 = m44401();
            i6 = 0;
            float f4 = iM44402 > 0 ? 0 / iM44402 : 0.0f;
            if (c3859M44429 != null) {
                int i15 = c3859M44429.f14417;
                int i16 = c3859M44415.f14417;
                if (i15 < i16) {
                    float f5 = c3859M44429.f14418 + c3859M44429.f14416 + f4;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= c3859M44415.f14417 && i18 < arrayList.size()) {
                        Object obj = arrayList.get(i18);
                        while (true) {
                            c38510 = (C3859) obj;
                            if (i17 <= c38510.f14417 || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            obj = arrayList.get(i18);
                        }
                        while (i17 < c38510.f14417) {
                            this.f62507.getClass();
                            f5 += 1.0f + f4;
                            i17++;
                        }
                        c38510.f14418 = f5;
                        f5 += c38510.f14416 + f4;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f6 = c3859M44429.f14418;
                    while (true) {
                        i15--;
                        if (i15 < c3859M44415.f14417 || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            c3859 = (C3859) obj2;
                            if (i15 >= c3859.f14417 || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i15 > c3859.f14417) {
                            this.f62507.getClass();
                            f6 -= 1.0f + f4;
                            i15--;
                        }
                        f6 -= c3859.f14416 + f4;
                        c3859.f14418 = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = c3859M44415.f14418;
            int i19 = c3859M44415.f14417;
            int i20 = i19 - 1;
            this.f62477 = i19 == 0 ? f7 : -3.4028235E38f;
            int i21 = iMo4246 - 1;
            this.f62510 = i19 == i21 ? (c3859M44415.f14416 + f7) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                C3859 c38514 = (C3859) arrayList.get(i22);
                while (true) {
                    i3 = c38514.f14417;
                    if (i20 <= i3) {
                        break;
                    }
                    i20--;
                    this.f62507.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= c38514.f14416 + f4;
                c38514.f14418 = f7;
                if (i3 == 0) {
                    this.f62477 = f7;
                }
                i22--;
                i20--;
            }
            float f8 = c3859M44415.f14418 + c3859M44415.f14416 + f4;
            int i23 = c3859M44415.f14417;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                C3859 c38515 = (C3859) arrayList.get(i12);
                while (true) {
                    i2 = c38515.f14417;
                    if (i23 >= i2) {
                        break;
                    }
                    i23++;
                    this.f62507.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i21) {
                    this.f62510 = (c38515.f14416 + f8) - 1.0f;
                }
                c38515.f14418 = f8;
                f8 += c38515.f14416 + f4;
                i12++;
            }
            this.f62507.mo34320(c3859M44415.f14415);
        } else {
            f = 0.0f;
        }
        this.f62507.mo34318();
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            C6682 c6682 = (C6682) childAt.getLayoutParams();
            c6682.getClass();
            if (!c6682.f22550 && c6682.f22547 == f && (c3859M44417 = m44416(childAt)) != null) {
                c6682.f22547 = c3859M44417.f14416;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c3859M44416 = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c3859M44416 = m44416(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c3859M44416 = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (c3859M44416 == null || c3859M44416.f14417 != this.f62481) {
                while (i6 < getChildCount()) {
                    View childAt2 = getChildAt(i6);
                    C3859 c3859M44419 = m44416(childAt2);
                    if (c3859M44419 != null && c3859M44419.f14417 == this.f62481 && childAt2.requestFocus(2)) {
                        return;
                    } else {
                        i6++;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C8094 c8094 = new C8094(super.onSaveInstanceState());
        c8094.f28355 = this.f62481;
        if (this.f62507 != null) {
            c8094.f28356 = null;
        }
        return c8094;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8094)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8094 c8094 = (C8094) parcelable;
        super.onRestoreInstanceState(c8094.getSuperState());
        if (this.f62507 != null) {
            m44419(c8094.f28355, 0, false, true);
        } else {
            this.f62499 = c8094.f28355;
            this.f62509 = c8094.f28356;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C6682();
        }
        C6682 c6682 = (C6682) layoutParams;
        boolean z = c6682.f22550 | (view.getClass().getAnnotation(InterfaceC13033.class) != null);
        c6682.f22550 = z;
        if (!this.f62491) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c6682.f22549 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f62491) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3859 m44416(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f62483;
            if (i >= arrayList.size()) {
                return null;
            }
            C3859 c3859 = (C3859) arrayList.get(i);
            if (this.f62507.mo4244(view, c3859.f14415)) {
                return c3859;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3859 m44429(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f62483;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C3859 c3859 = (C3859) arrayList.get(i2);
            if (c3859.f14417 == i) {
                return c3859;
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f62487 = true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af A[SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C6682 c6682;
        C6682 c6683;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f62495 = Math.min(measuredWidth / 10, this.f62513);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c6683 = (C6682) childAt.getLayoutParams()) != null && c6683.f22550) {
                int i8 = c6683.f22548;
                int i9 = i8 & 7;
                int i10 = i8 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                    i4 = ((ViewGroup.LayoutParams) c6683).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c6683).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = ((ViewGroup.LayoutParams) c6683).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c6683).height;
                if (i5 != -2) {
                    i5 = measuredHeight;
                    i7 = i3;
                } else if (i5 == -1) {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f62492 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f62491 = true;
        m44424();
        this.f62491 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c6682 = (C6682) childAt2.getLayoutParams()) == null || !c6682.f22550)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c6682.f22547), 1073741824), this.f62492);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.f62483.isEmpty()) {
                if (!this.f62501.isFinished()) {
                    this.f62501.setFinalX(this.f62481 * m44401());
                    return;
                } else {
                    scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                    return;
                }
            }
            C3859 c3859M44429 = m44429(this.f62481);
            int iMin = (int) ((c3859M44429 != null ? Math.min(c3859M44429.f14418, this.f62510) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m44406(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C3859 c3859M44416;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C6682 c6682 = (C6682) childAt.getLayoutParams();
                if (c6682.f22550) {
                    int i9 = c6682.f22548;
                    int i10 = i9 & 7;
                    int i11 = i9 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 == 1) {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C6682 c6683 = (C6682) childAt2.getLayoutParams();
                if (!c6683.f22550 && (c3859M44416 = m44416(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c3859M44416.f14418 * f)) + paddingLeft;
                    if (c6683.f22549) {
                        c6683.f22549 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c6683.f22547), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f62489 = i7;
        if (this.f62487) {
            z2 = false;
            m44411(this.f62481, 0, false, false);
        } else {
            z2 = false;
        }
        this.f62487 = z2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f62494 = true;
        Scroller scroller = this.f62501;
        if (!scroller.isFinished() && scroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m44410(currX)) {
                    scroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            int i = C5031.f17539;
            postInvalidateOnAnimation();
            return;
        }
        m44406(true);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m44410(int i) {
        if (this.f62483.size() == 0) {
            if (!this.f62487) {
                this.f62500 = false;
                m44418(0, 0.0f, 0);
                if (!this.f62500) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C3859 c3859M44409 = m44409();
        float fM44401 = m44401();
        int i2 = c3859M44409.f14417;
        float f = ((i / fM44401) - c3859M44409.f14418) / (c3859M44409.f14416 + (0 / fM44401));
        this.f62500 = false;
        m44418(i2, f, (int) (fM44401 * f));
        if (this.f62500) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44418(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f62489 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C6682 c6682 = (C6682) childAt.getLayoutParams();
                if (c6682.f22550) {
                    int i4 = c6682.f22548 & 7;
                    if (i4 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        ArrayList arrayList = this.f62488;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC21499 interfaceC21499 = (InterfaceC21499) this.f62488.get(i6);
                if (interfaceC21499 != null) {
                    interfaceC21499.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC21499 interfaceC214910 = this.f62511;
        if (interfaceC214910 != null) {
            interfaceC214910.onPageScrolled(i, f, i2);
        }
        this.f62500 = true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m44402(int i) {
        ArrayList arrayList = this.f62488;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC21499 interfaceC21499 = (InterfaceC21499) this.f62488.get(i2);
                if (interfaceC21499 != null) {
                    interfaceC21499.onPageSelected(i);
                }
            }
        }
        InterfaceC21499 interfaceC214910 = this.f62511;
        if (interfaceC214910 != null) {
            interfaceC214910.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44406(boolean z) {
        boolean z2 = this.f62473 == 2;
        if (z2) {
            m44412(false);
            Scroller scroller = this.f62501;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m44410(currX);
                    }
                }
            }
        }
        this.f62484 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f62483;
            if (i >= arrayList.size()) {
                break;
            }
            C3859 c3859 = (C3859) arrayList.get(i);
            if (c3859.f14414) {
                c3859.f14414 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.f62496;
            if (z) {
                int i2 = C5031.f17539;
                postOnAnimation(runnable);
            } else {
                ((RunnableC22205) runnable).run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m44403();
            return false;
        }
        if (action != 0) {
            if (this.f62474) {
                return true;
            }
            if (this.f62478) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f62476 = x;
            this.f62512 = x;
            float y = motionEvent.getY();
            this.f62480 = y;
            this.f62497 = y;
            this.f62498 = motionEvent.getPointerId(0);
            this.f62478 = false;
            this.f62494 = true;
            Scroller scroller = this.f62501;
            scroller.computeScrollOffset();
            if (this.f62473 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f62502) {
                scroller.abortAnimation();
                this.f62484 = false;
                m44424();
                this.f62474 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m44434(1);
            } else {
                m44406(false);
                this.f62474 = false;
            }
        } else if (action == 2) {
            int i = this.f62498;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f62512;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f62480);
                if (f != 0.0f) {
                    float f2 = this.f62512;
                    if ((f2 >= this.f62495 || f <= 0.0f) && ((f2 <= getWidth() - this.f62495 || f >= 0.0f) && m44408((int) f, (int) x2, (int) y2, this, false))) {
                        this.f62512 = x2;
                        this.f62497 = y2;
                        this.f62478 = true;
                        return false;
                    }
                }
                int i2 = this.f62490;
                float f3 = i2;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f62474 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m44434(1);
                    float f4 = this.f62476;
                    float f5 = i2;
                    this.f62512 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f62497 = y2;
                    m44412(true);
                } else if (fAbs2 > f3) {
                    this.f62478 = true;
                }
                if (this.f62474 && m44407(x2)) {
                    int i3 = C5031.f17539;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m44405(motionEvent);
        }
        if (this.f62514 == null) {
            this.f62514 = VelocityTracker.obtain();
        }
        this.f62514.addMovement(motionEvent);
        return this.f62474;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC14217 abstractC14217;
        boolean zM44403 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC14217 = this.f62507) == null || abstractC14217.mo4245() == 0) {
            return false;
        }
        if (this.f62514 == null) {
            this.f62514 = VelocityTracker.obtain();
        }
        this.f62514.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f62501.abortAnimation();
            this.f62484 = false;
            m44424();
            float x = motionEvent.getX();
            this.f62476 = x;
            this.f62512 = x;
            float y = motionEvent.getY();
            this.f62480 = y;
            this.f62497 = y;
            this.f62498 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f62512 = motionEvent.getX(actionIndex);
                        this.f62498 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m44405(motionEvent);
                        this.f62512 = motionEvent.getX(motionEvent.findPointerIndex(this.f62498));
                    }
                } else if (this.f62474) {
                    m44411(this.f62481, 0, true, false);
                    zM44403 = m44403();
                }
            } else if (!this.f62474) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f62498);
                if (iFindPointerIndex == -1) {
                    zM44403 = m44403();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f62512);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f62497);
                    int i = this.f62490;
                    if (fAbs > i && fAbs > fAbs2) {
                        this.f62474 = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f62476;
                        this.f62512 = x2 - f > 0.0f ? f + i : f - i;
                        this.f62497 = y2;
                        m44434(1);
                        m44412(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f62474) {
                        zM44403 = m44407(motionEvent.getX(motionEvent.findPointerIndex(this.f62498)));
                    }
                }
            } else if (this.f62474) {
                zM44403 = m44407(motionEvent.getX(motionEvent.findPointerIndex(this.f62498)));
            }
        } else if (this.f62474) {
            VelocityTracker velocityTracker = this.f62514;
            velocityTracker.computeCurrentVelocity(1000, this.f62505);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f62498);
            this.f62484 = true;
            int iM44401 = m44401();
            int scrollX = getScrollX();
            C3859 c3859M44409 = m44409();
            float f2 = iM44401;
            int iMax = c3859M44409.f14417;
            float f3 = ((scrollX / f2) - c3859M44409.f14418) / (c3859M44409.f14416 + (0 / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f62498)) - this.f62476)) <= this.f62479 || Math.abs(xVelocity) <= this.f62485) {
                iMax += (int) (f3 + (iMax >= this.f62481 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f62483;
            if (arrayList.size() > 0) {
                iMax = Math.max(((C3859) arrayList.get(0)).f14417, Math.min(iMax, ((C3859) C19084.m43861(arrayList, 1)).f14417));
            }
            m44419(iMax, xVelocity, true, true);
            zM44403 = m44403();
        }
        if (zM44403) {
            int i2 = C5031.f17539;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m44403() {
        this.f62498 = -1;
        this.f62474 = false;
        this.f62478 = false;
        VelocityTracker velocityTracker = this.f62514;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f62514 = null;
        }
        this.f62504.onRelease();
        this.f62508.onRelease();
        return this.f62504.isFinished() || this.f62508.isFinished();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44407(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f62512 - f;
        this.f62512 = f;
        float scrollX = getScrollX() + f2;
        float fM44401 = m44401();
        float f3 = this.f62477 * fM44401;
        float f4 = this.f62510 * fM44401;
        ArrayList arrayList = this.f62483;
        boolean z3 = false;
        C3859 c3859 = (C3859) arrayList.get(0);
        C3859 c38510 = (C3859) C19084.m43861(arrayList, 1);
        if (c3859.f14417 != 0) {
            f3 = c3859.f14418 * fM44401;
            z = false;
        } else {
            z = true;
        }
        if (c38510.f14417 != this.f62507.mo4245() - 1) {
            f4 = c38510.f14418 * fM44401;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f62504.onPull(Math.abs(f3 - scrollX) / fM44401);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f62508.onPull(Math.abs(scrollX - f4) / fM44401);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f62512 = (scrollX - i) + this.f62512;
        scrollTo(i, getScrollY());
        m44410(i);
        return z3;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C3859 m44409() {
        C3859 c3859;
        int i;
        int iM44401 = m44401();
        float f = 0.0f;
        float scrollX = iM44401 > 0 ? getScrollX() / iM44401 : 0.0f;
        float f2 = iM44401 > 0 ? 0 / iM44401 : 0.0f;
        int i2 = -1;
        C3859 c38510 = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.f62483;
            if (i3 >= arrayList.size()) {
                break;
            }
            C3859 c38511 = (C3859) arrayList.get(i3);
            if (z || c38511.f14417 == (i = i2 + 1)) {
                c3859 = c38511;
            } else {
                float f4 = f + f3 + f2;
                c3859 = this.f62503;
                c3859.f14418 = f4;
                c3859.f14417 = i;
                this.f62507.getClass();
                c3859.f14416 = 1.0f;
                i3--;
            }
            f = c3859.f14418;
            float f5 = c3859.f14416 + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i3 == arrayList.size() - 1) {
                return c3859;
            }
            i2 = c3859.f14417;
            i3++;
            z = false;
            C3859 c38512 = c3859;
            f3 = c3859.f14416;
            c38510 = c38512;
        }
        return c38510;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC14217 abstractC14217;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f62508;
        EdgeEffect edgeEffect2 = this.f62504;
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC14217 = this.f62507) != null && abstractC14217.mo4245() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f62477 * width);
                edgeEffect2.setSize(height, width);
                boolean zDraw2 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
                zDraw = zDraw2;
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f62510 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44405(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f62498) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f62512 = motionEvent.getX(i);
            this.f62498 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f62514;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m44412(boolean z) {
        if (this.f62493 != z) {
            this.f62493 = z;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f62507 == null) {
            return false;
        }
        int iM44401 = m44401();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) iM44401) * this.f62477));
        }
        return i > 0 && scrollX < ((int) (((float) iM44401) * this.f62510));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44408(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !m44408(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM44423;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM44423 = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zM44423 = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zM44423 = m44423(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM44423 = m44423(1);
                        } else {
                            zM44423 = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zM44423 = m44414();
                    } else {
                        zM44423 = m44423(66);
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    zM44423 = m44423(17);
                } else {
                    int i = this.f62481;
                    if (i > 0) {
                        m44425(i - 1);
                        zM44423 = true;
                    } else {
                        zM44423 = false;
                    }
                }
            }
            if (!zM44423) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[PHI: r0
      0x0088: PHI (r0v5 int) = (r0v3 int), (r0v11 int) binds: [B:44:0x0086, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44423(int i) {
        int i2;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean z = true;
        boolean zM44414 = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f62482;
            if (i == 17) {
                int i3 = m44404(rect, viewFindNextFocus).left;
                int i4 = m44404(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    i2 = this.f62481;
                    if (i2 > 0) {
                        m44425(i2 - 1);
                    } else {
                        z = false;
                    }
                    zM44414 = z;
                }
            } else if (i == 66) {
                int i5 = m44404(rect, viewFindNextFocus).left;
                int i6 = m44404(rect, viewFindFocus).left;
                if (viewFindFocus != null && i5 <= i6) {
                    zRequestFocus = m44414();
                } else {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
            zM44414 = zRequestFocus;
        } else if (i == 17 || i == 1) {
            i2 = this.f62481;
            if (i2 > 0) {
                m44425(i2 - 1);
            } else {
                z = false;
            }
            zM44414 = z;
        } else if (i == 66 || i == 2) {
            zM44414 = m44414();
        }
        if (zM44414) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM44414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Rect m44404(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m44414() {
        AbstractC14217 abstractC14217 = this.f62507;
        if (abstractC14217 == null || this.f62481 >= abstractC14217.mo4245() - 1) {
            return false;
        }
        m44425(this.f62481 + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C3859 c3859M44416;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c3859M44416 = m44416(childAt)) != null && c3859M44416.f14417 == this.f62481) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        C3859 c3859M44416;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c3859M44416 = m44416(childAt)) != null && c3859M44416.f14417 == this.f62481) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C3859 c3859M44416;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c3859M44416 = m44416(childAt)) != null && c3859M44416.f14417 == this.f62481 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3859 c3859M44416;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c3859M44416 = m44416(childAt)) != null && c3859M44416.f14417 == this.f62481 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C6682();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6682();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C6682) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6682(getContext(), attributeSet);
    }
}
