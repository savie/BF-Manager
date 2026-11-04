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
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes4.dex */
public class C15179 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f49505;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public Scroller f49506;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f49507;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f49508;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49509;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Runnable f49510;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f49511;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public Parcelable f49512;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f49513;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f49514;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f49515;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f49516;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f49517;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49518;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f49519;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f49520;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f49521;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f49522;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final Rect f49523;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f49524;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49525;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f49526;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49527;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f49528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49529;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f49530;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4739 f49531;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f49532;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f49533;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f49534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f49535;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f49536;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49537;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C2544 f49538;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f49539;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C21893 f49540;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC6274 f49541;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f49542;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f49543;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f49544;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f49545;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f49546;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public float f49547;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f49504 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final Comparator f49502 = new C7765();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f49503 = new InterpolatorC18952();

    public C15179(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49525 = new ArrayList();
        this.f49538 = new C2544();
        this.f49523 = new Rect();
        this.f49530 = -1;
        this.f49512 = null;
        this.f49528 = -3.4028235E38f;
        this.f49534 = Float.MAX_VALUE;
        this.f49526 = 1;
        this.f49529 = -1;
        this.f49516 = true;
        this.f49510 = new RunnableC10001(this);
        this.f49536 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f49506 = new Scroller(context2, f49503);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f49508 = viewConfiguration.getScaledPagingTouchSlop();
        this.f49511 = (int) (400.0f * f);
        this.f49545 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f49532 = new EdgeEffect(context2);
        this.f49542 = new EdgeEffect(context2);
        this.f49513 = (int) (25.0f * f);
        this.f49537 = (int) (2.0f * f);
        this.f49520 = (int) (f * 16.0f);
        C22666.m51098(this, new C7019(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C22666.m51097(this, new C1053(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f49510);
        Scroller scroller = this.f49506;
        if (scroller != null && !scroller.isFinished()) {
            this.f49506.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36520(int i) {
        if (this.f49536 == i) {
            return;
        }
        this.f49536 = i;
        ArrayList arrayList = this.f49515;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4739 interfaceC4739 = (InterfaceC4739) this.f49515.get(i2);
                if (interfaceC4739 != null) {
                    interfaceC4739.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC4739 interfaceC47310 = this.f49531;
        if (interfaceC47310 != null) {
            interfaceC47310.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36514(AbstractC6274 abstractC6274) {
        ArrayList arrayList;
        AbstractC6274 abstractC6275 = this.f49541;
        if (abstractC6275 != null) {
            abstractC6275.m17948(null);
            this.f49541.mo17945(this);
            int i = 0;
            while (true) {
                arrayList = this.f49525;
                if (i >= arrayList.size()) {
                    break;
                }
                C2544 c2544 = (C2544) arrayList.get(i);
                this.f49541.mo2998(this, c2544.f8126, c2544.f8125);
                i++;
            }
            this.f49541.mo17942();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C8510) getChildAt(i2).getLayoutParams()).f27816) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f49522 = 0;
            scrollTo(0, 0);
        }
        AbstractC6274 abstractC6276 = this.f49541;
        this.f49541 = abstractC6274;
        this.f49519 = 0;
        if (abstractC6274 != null) {
            if (this.f49540 == null) {
                this.f49540 = new C21893(this);
            }
            this.f49541.m17948(this.f49540);
            this.f49546 = false;
            boolean z = this.f49516;
            this.f49516 = true;
            this.f49519 = this.f49541.mo3000();
            if (this.f49530 >= 0) {
                this.f49541.getClass();
                m36511(this.f49530, 0, false, true);
                this.f49530 = -1;
                this.f49512 = null;
            } else if (!z) {
                m36521();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f49535;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f49535.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC13730) this.f49535.get(i3)).onAdapterChanged(this, abstractC6276, abstractC6274);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC6274 m36524() {
        return this.f49541;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36515(InterfaceC13730 interfaceC13730) {
        if (this.f49535 == null) {
            this.f49535 = new ArrayList();
        }
        this.f49535.add(interfaceC13730);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36526(InterfaceC13730 interfaceC13730) {
        ArrayList arrayList = this.f49535;
        if (arrayList != null) {
            arrayList.remove(interfaceC13730);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m36504() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36527(int i) {
        this.f49546 = false;
        m36511(i, 0, !this.f49516, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36512(int i, boolean z) {
        this.f49546 = false;
        m36511(i, 0, z, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36517() {
        return this.f49522;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36511(int i, int i2, boolean z, boolean z2) {
        AbstractC6274 abstractC6274 = this.f49541;
        if (abstractC6274 == null || abstractC6274.mo3000() <= 0) {
            m36506(false);
            return;
        }
        ArrayList arrayList = this.f49525;
        if (!z2 && this.f49522 == i && arrayList.size() != 0) {
            m36506(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f49541.mo3000()) {
            i = this.f49541.mo3000() - 1;
        }
        int i3 = this.f49526;
        int i4 = this.f49522;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C2544) arrayList.get(i5)).f8129 = true;
            }
        }
        boolean z3 = this.f49522 != i;
        if (this.f49516) {
            this.f49522 = i;
            if (z3) {
                m36503(i);
            }
            requestLayout();
            return;
        }
        m36518(i);
        m36505(i, i2, z, z3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m36505(int i, int i2, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        C2544 c2544M36523 = m36523(i);
        if (c2544M36523 != null) {
            iMax = (int) (Math.max(this.f49528, Math.min(c2544M36523.f8128, this.f49534)) * m36504());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                m36503(i);
            }
            m36497(false);
            scrollTo(iMax, 0);
            m36501(iMax);
            return;
        }
        if (getChildCount() == 0) {
            m36506(false);
        } else {
            Scroller scroller = this.f49506;
            if (scroller != null && !scroller.isFinished()) {
                scrollX = this.f49514 ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                m36506(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m36497(false);
                m36521();
                m36520(0);
            } else {
                m36506(true);
                m36520(2);
                int iM36504 = m36504();
                int i6 = iM36504 / 2;
                float f = iM36504;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f49541.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f49514 = false;
                this.f49506.startScroll(i3, scrollY, i4, i5, iMin);
                int i7 = C22666.f73603;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m36503(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36513(InterfaceC4739 interfaceC4739) {
        if (this.f49515 == null) {
            this.f49515 = new ArrayList();
        }
        this.f49515.add(interfaceC4739);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36525(InterfaceC4739 interfaceC4739) {
        ArrayList arrayList = this.f49515;
        if (arrayList != null) {
            arrayList.remove(interfaceC4739);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36519(InterfaceC4739 interfaceC4739) {
        this.f49531 = interfaceC4739;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36522(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.f49526) {
            this.f49526 = i;
            m36521();
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
    public final C2544 m36507(int i, int i2) {
        C2544 c2544 = new C2544();
        c2544.f8126 = i;
        c2544.f8125 = this.f49541.mo2997(this, i);
        this.f49541.getClass();
        c2544.f8127 = 1.0f;
        ArrayList arrayList = this.f49525;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(c2544);
            return c2544;
        }
        arrayList.add(i2, c2544);
        return c2544;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36509() {
        int iMo3000 = this.f49541.mo3000();
        this.f49519 = iMo3000;
        ArrayList arrayList = this.f49525;
        boolean z = arrayList.size() < (this.f49526 * 2) + 1 && arrayList.size() < iMo3000;
        int i = this.f49522;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C2544 c2544 = (C2544) arrayList.get(i2);
            AbstractC6274 abstractC6274 = this.f49541;
            Object obj = c2544.f8125;
            abstractC6274.getClass();
        }
        Collections.sort(arrayList, f49502);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C8510 c8510 = (C8510) getChildAt(i3).getLayoutParams();
                if (!c8510.f27816) {
                    c8510.f27817 = 0.0f;
                }
            }
            m36511(i, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m36521() {
        m36518(this.f49522);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e9 A[PHI: r6 r9 r15
      0x00e9: PHI (r6v19 int) = (r6v18 int), (r6v7 int), (r6v22 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r9v6 int) = (r9v1 int), (r9v5 int), (r9v9 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v2 float) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0170 A[PHI: r4 r13
      0x0170: PHI (r4v13 float) = (r4v11 float), (r4v12 float), (r4v10 float) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v37 int) = (r13v35 int), (r13v36 int), (r13v34 int) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36518(int i) {
        C2544 c2544M36523;
        String hexString;
        ArrayList arrayList;
        C2544 c2544M36507;
        float f;
        C2544 c2544M36508;
        C2544 c2544M36509;
        float paddingLeft;
        int i2;
        int i3;
        C2544 c2544;
        C2544 c2545;
        C2544 c2546;
        int i4 = this.f49522;
        if (i4 != i) {
            c2544M36523 = m36523(i4);
            this.f49522 = i;
        } else {
            c2544M36523 = null;
        }
        if (this.f49541 == null || this.f49546 || getWindowToken() == null) {
            return;
        }
        this.f49541.mo17945(this);
        int i5 = this.f49526;
        int i6 = 0;
        int iMax = Math.max(0, this.f49522 - i5);
        int iMo3000 = this.f49541.mo3000();
        int iMin = Math.min(iMo3000 - 1, this.f49522 + i5);
        if (iMo3000 != this.f49519) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f49519 + ", found: " + iMo3000 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f49541.getClass());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.f49525;
            if (i7 < arrayList.size()) {
                c2544M36507 = (C2544) arrayList.get(i7);
                int i8 = c2544M36507.f8126;
                int i9 = this.f49522;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            c2544M36507 = null;
            break;
        }
        if (c2544M36507 == null && iMo3000 > 0) {
            c2544M36507 = m36507(this.f49522, i7);
        }
        if (c2544M36507 != null) {
            int i10 = i7 - 1;
            C2544 c2547 = i10 >= 0 ? (C2544) arrayList.get(i10) : null;
            int iM36504 = m36504();
            if (iM36504 <= 0) {
                f = 0.0f;
                paddingLeft = 0.0f;
            } else {
                paddingLeft = (getPaddingLeft() / iM36504) + (2.0f - c2544M36507.f8127);
                f = 0.0f;
            }
            float f2 = 0.0f;
            for (int i11 = this.f49522 - 1; i11 >= 0; i11--) {
                if (f2 >= paddingLeft && i11 < iMax) {
                    if (c2547 == null) {
                        break;
                    }
                    if (i11 == c2547.f8126 && !c2547.f8129) {
                        arrayList.remove(i10);
                        this.f49541.mo2998(this, i11, c2547.f8125);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            c2546 = (C2544) arrayList.get(i10);
                        } else {
                            c2546 = null;
                        }
                        c2547 = c2546;
                    }
                } else {
                    if (c2547 != null && i11 == c2547.f8126) {
                        f2 += c2547.f8127;
                        i10--;
                        if (i10 >= 0) {
                            c2546 = (C2544) arrayList.get(i10);
                        } else {
                            c2546 = null;
                        }
                    } else {
                        f2 += m36507(i11, i10 + 1).f8127;
                        i7++;
                        if (i10 >= 0) {
                            c2546 = (C2544) arrayList.get(i10);
                        } else {
                            c2546 = null;
                        }
                    }
                    c2547 = c2546;
                }
            }
            float f3 = c2544M36507.f8127;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                C2544 c2548 = i12 < arrayList.size() ? (C2544) arrayList.get(i12) : null;
                float paddingRight = iM36504 <= 0 ? 0.0f : 2.0f + (getPaddingRight() / iM36504);
                int i13 = i12;
                for (int i14 = this.f49522 + 1; i14 < iMo3000; i14++) {
                    if (f3 >= paddingRight && i14 > iMin) {
                        if (c2548 == null) {
                            break;
                        }
                        if (i14 == c2548.f8126 && !c2548.f8129) {
                            arrayList.remove(i13);
                            this.f49541.mo2998(this, i14, c2548.f8125);
                            if (i13 < arrayList.size()) {
                                c2548 = (C2544) arrayList.get(i13);
                            } else {
                                c2548 = null;
                            }
                        }
                    } else if (c2548 != null && i14 == c2548.f8126) {
                        f3 += c2548.f8127;
                        i13++;
                        if (i13 < arrayList.size()) {
                            c2548 = (C2544) arrayList.get(i13);
                        } else {
                            c2548 = null;
                        }
                    } else {
                        C2544 c2544M365010 = m36507(i14, i13);
                        i13++;
                        f3 += c2544M365010.f8127;
                        if (i13 < arrayList.size()) {
                            c2548 = (C2544) arrayList.get(i13);
                        } else {
                            c2548 = null;
                        }
                    }
                }
            }
            int iMo3001 = this.f49541.mo3000();
            int iM36505 = m36504();
            i6 = 0;
            float f4 = iM36505 > 0 ? 0 / iM36505 : 0.0f;
            if (c2544M36523 != null) {
                int i15 = c2544M36523.f8126;
                int i16 = c2544M36507.f8126;
                if (i15 < i16) {
                    float f5 = c2544M36523.f8128 + c2544M36523.f8127 + f4;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= c2544M36507.f8126 && i18 < arrayList.size()) {
                        Object obj = arrayList.get(i18);
                        while (true) {
                            c2545 = (C2544) obj;
                            if (i17 <= c2545.f8126 || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            obj = arrayList.get(i18);
                        }
                        while (i17 < c2545.f8126) {
                            this.f49541.getClass();
                            f5 += 1.0f + f4;
                            i17++;
                        }
                        c2545.f8128 = f5;
                        f5 += c2545.f8127 + f4;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f6 = c2544M36523.f8128;
                    while (true) {
                        i15--;
                        if (i15 < c2544M36507.f8126 || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            c2544 = (C2544) obj2;
                            if (i15 >= c2544.f8126 || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i15 > c2544.f8126) {
                            this.f49541.getClass();
                            f6 -= 1.0f + f4;
                            i15--;
                        }
                        f6 -= c2544.f8127 + f4;
                        c2544.f8128 = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = c2544M36507.f8128;
            int i19 = c2544M36507.f8126;
            int i20 = i19 - 1;
            this.f49528 = i19 == 0 ? f7 : -3.4028235E38f;
            int i21 = iMo3001 - 1;
            this.f49534 = i19 == i21 ? (c2544M36507.f8127 + f7) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                C2544 c2549 = (C2544) arrayList.get(i22);
                while (true) {
                    i3 = c2549.f8126;
                    if (i20 <= i3) {
                        break;
                    }
                    i20--;
                    this.f49541.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= c2549.f8127 + f4;
                c2549.f8128 = f7;
                if (i3 == 0) {
                    this.f49528 = f7;
                }
                i22--;
                i20--;
            }
            float f8 = c2544M36507.f8128 + c2544M36507.f8127 + f4;
            int i23 = c2544M36507.f8126;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                C2544 c25410 = (C2544) arrayList.get(i12);
                while (true) {
                    i2 = c25410.f8126;
                    if (i23 >= i2) {
                        break;
                    }
                    i23++;
                    this.f49541.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i21) {
                    this.f49534 = (c25410.f8127 + f8) - 1.0f;
                }
                c25410.f8128 = f8;
                f8 += c25410.f8127 + f4;
                i12++;
            }
            this.f49541.mo17944(c2544M36507.f8125);
        } else {
            f = 0.0f;
        }
        this.f49541.mo17942();
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            C8510 c8510 = (C8510) childAt.getLayoutParams();
            c8510.getClass();
            if (!c8510.f27816 && c8510.f27817 == f && (c2544M36509 = m36508(childAt)) != null) {
                c8510.f27817 = c2544M36509.f8127;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c2544M36508 = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent != this) {
                    if (parent == null || !(parent instanceof View)) {
                        c2544M36508 = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                } else {
                    c2544M36508 = m36508(viewFindFocus);
                    break;
                }
            }
            if (c2544M36508 == null || c2544M36508.f8126 != this.f49522) {
                while (i6 < getChildCount()) {
                    View childAt2 = getChildAt(i6);
                    C2544 c2544M365011 = m36508(childAt2);
                    if (c2544M365011 != null && c2544M365011.f8126 == this.f49522 && childAt2.requestFocus(2)) {
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
        C22639 c22639 = new C22639(super.onSaveInstanceState());
        c22639.f73541 = this.f49522;
        if (this.f49541 != null) {
            c22639.f73540 = null;
        }
        return c22639;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C22639)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22639 c22639 = (C22639) parcelable;
        super.onRestoreInstanceState(c22639.getSuperState());
        if (this.f49541 != null) {
            m36511(c22639.f73541, 0, false, true);
        } else {
            this.f49530 = c22639.f73541;
            this.f49512 = c22639.f73540;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C8510();
        }
        C8510 c8510 = (C8510) layoutParams;
        boolean z = c8510.f27816 | (view.getClass().getAnnotation(InterfaceC9255.class) != null);
        c8510.f27816 = z;
        if (!this.f49524) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c8510.f27815 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f49524) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2544 m36508(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f49525;
            if (i >= arrayList.size()) {
                return null;
            }
            C2544 c2544 = (C2544) arrayList.get(i);
            if (this.f49541.mo2999(view, c2544.f8125)) {
                return c2544;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2544 m36523(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f49525;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C2544 c2544 = (C2544) arrayList.get(i2);
            if (c2544.f8126 == i) {
                return c2544;
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49516 = true;
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
        C8510 c8510;
        C8510 c8511;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f49543 = Math.min(measuredWidth / 10, this.f49520);
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
            if (childAt.getVisibility() != 8 && (c8511 = (C8510) childAt.getLayoutParams()) != null && c8511.f27816) {
                int i8 = c8511.f27814;
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
                    i4 = ((ViewGroup.LayoutParams) c8511).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c8511).height;
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
                i4 = ((ViewGroup.LayoutParams) c8511).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c8511).height;
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
        this.f49517 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f49524 = true;
        m36521();
        this.f49524 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c8510 = (C8510) childAt2.getLayoutParams()) == null || !c8510.f27816)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c8510.f27817), 1073741824), this.f49517);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.f49525.isEmpty()) {
                if (!this.f49506.isFinished()) {
                    this.f49506.setFinalX(this.f49522 * m36504());
                    return;
                } else {
                    scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                    return;
                }
            }
            C2544 c2544M36523 = m36523(this.f49522);
            int iMin = (int) ((c2544M36523 != null ? Math.min(c2544M36523.f8128, this.f49534) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m36497(false);
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
        C2544 c2544M36508;
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
                C8510 c8510 = (C8510) childAt.getLayoutParams();
                if (c8510.f27816) {
                    int i9 = c8510.f27814;
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
                C8510 c8511 = (C8510) childAt2.getLayoutParams();
                if (!c8511.f27816 && (c2544M36508 = m36508(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c2544M36508.f8128 * f)) + paddingLeft;
                    if (c8511.f27815) {
                        c8511.f27815 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c8511.f27817), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f49507 = i7;
        if (this.f49516) {
            z2 = false;
            m36505(this.f49522, 0, false, false);
        } else {
            z2 = false;
        }
        this.f49516 = z2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f49514 = true;
        Scroller scroller = this.f49506;
        if (!scroller.isFinished() && scroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m36501(currX)) {
                    scroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            int i = C22666.f73603;
            postInvalidateOnAnimation();
            return;
        }
        m36497(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m36501(int i) {
        if (this.f49525.size() == 0) {
            if (!this.f49516) {
                this.f49505 = false;
                m36510(0, 0.0f, 0);
                if (!this.f49505) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C2544 c2544M36502 = m36502();
        float fM36504 = m36504();
        int i2 = c2544M36502.f8126;
        float f = ((i / fM36504) - c2544M36502.f8128) / (c2544M36502.f8127 + (0 / fM36504));
        this.f49505 = false;
        m36510(i2, f, (int) (fM36504 * f));
        if (this.f49505) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36510(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f49507 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C8510 c8510 = (C8510) childAt.getLayoutParams();
                if (c8510.f27816) {
                    int i4 = c8510.f27814 & 7;
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
        ArrayList arrayList = this.f49515;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC4739 interfaceC4739 = (InterfaceC4739) this.f49515.get(i6);
                if (interfaceC4739 != null) {
                    interfaceC4739.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC4739 interfaceC47310 = this.f49531;
        if (interfaceC47310 != null) {
            interfaceC47310.onPageScrolled(i, f, i2);
        }
        this.f49505 = true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m36503(int i) {
        ArrayList arrayList = this.f49515;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4739 interfaceC4739 = (InterfaceC4739) this.f49515.get(i2);
                if (interfaceC4739 != null) {
                    interfaceC4739.onPageSelected(i);
                }
            }
        }
        InterfaceC4739 interfaceC47310 = this.f49531;
        if (interfaceC47310 != null) {
            interfaceC47310.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36497(boolean z) {
        boolean z2 = this.f49536 == 2;
        if (z2) {
            m36506(false);
            Scroller scroller = this.f49506;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m36501(currX);
                    }
                }
            }
        }
        this.f49546 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f49525;
            if (i >= arrayList.size()) {
                break;
            }
            C2544 c2544 = (C2544) arrayList.get(i);
            if (c2544.f8129) {
                c2544.f8129 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.f49510;
            if (z) {
                int i2 = C22666.f73603;
                postOnAnimation(runnable);
            } else {
                ((RunnableC10001) runnable).run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m36500();
            return false;
        }
        if (action != 0) {
            if (this.f49527) {
                return true;
            }
            if (this.f49509) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f49544 = x;
            this.f49547 = x;
            float y = motionEvent.getY();
            this.f49539 = y;
            this.f49533 = y;
            this.f49529 = motionEvent.getPointerId(0);
            this.f49509 = false;
            this.f49514 = true;
            Scroller scroller = this.f49506;
            scroller.computeScrollOffset();
            if (this.f49536 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f49537) {
                scroller.abortAnimation();
                this.f49546 = false;
                m36521();
                this.f49527 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m36520(1);
            } else {
                m36497(false);
                this.f49527 = false;
            }
        } else if (action == 2) {
            int i = this.f49529;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f49547;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f49539);
                if (f != 0.0f) {
                    float f2 = this.f49547;
                    if ((f2 >= this.f49543 || f <= 0.0f) && ((f2 <= getWidth() - this.f49543 || f >= 0.0f) && m36499((int) f, (int) x2, (int) y2, this, false))) {
                        this.f49547 = x2;
                        this.f49533 = y2;
                        this.f49509 = true;
                        return false;
                    }
                }
                int i2 = this.f49508;
                float f3 = i2;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f49527 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m36520(1);
                    float f4 = this.f49544;
                    float f5 = i2;
                    this.f49547 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f49533 = y2;
                    m36506(true);
                } else if (fAbs2 > f3) {
                    this.f49509 = true;
                }
                if (this.f49527 && m36498(x2)) {
                    int i3 = C22666.f73603;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m36496(motionEvent);
        }
        if (this.f49521 == null) {
            this.f49521 = VelocityTracker.obtain();
        }
        this.f49521.addMovement(motionEvent);
        return this.f49527;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC6274 abstractC6274;
        boolean zM36500 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC6274 = this.f49541) == null || abstractC6274.mo3000() == 0) {
            return false;
        }
        if (this.f49521 == null) {
            this.f49521 = VelocityTracker.obtain();
        }
        this.f49521.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f49506.abortAnimation();
            this.f49546 = false;
            m36521();
            float x = motionEvent.getX();
            this.f49544 = x;
            this.f49547 = x;
            float y = motionEvent.getY();
            this.f49539 = y;
            this.f49533 = y;
            this.f49529 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f49547 = motionEvent.getX(actionIndex);
                        this.f49529 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m36496(motionEvent);
                        this.f49547 = motionEvent.getX(motionEvent.findPointerIndex(this.f49529));
                    }
                } else if (this.f49527) {
                    m36505(this.f49522, 0, true, false);
                    zM36500 = m36500();
                }
            } else if (!this.f49527) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f49529);
                if (iFindPointerIndex == -1) {
                    zM36500 = m36500();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f49547);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f49533);
                    int i = this.f49508;
                    if (fAbs > i && fAbs > fAbs2) {
                        this.f49527 = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f49544;
                        this.f49547 = x2 - f > 0.0f ? f + i : f - i;
                        this.f49533 = y2;
                        m36520(1);
                        m36506(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f49527) {
                        zM36500 = m36498(motionEvent.getX(motionEvent.findPointerIndex(this.f49529)));
                    }
                }
            } else if (this.f49527) {
                zM36500 = m36498(motionEvent.getX(motionEvent.findPointerIndex(this.f49529)));
            }
        } else if (this.f49527) {
            VelocityTracker velocityTracker = this.f49521;
            velocityTracker.computeCurrentVelocity(1000, this.f49545);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f49529);
            this.f49546 = true;
            int iM36504 = m36504();
            int scrollX = getScrollX();
            C2544 c2544M36502 = m36502();
            float f2 = iM36504;
            int iMax = c2544M36502.f8126;
            float f3 = ((scrollX / f2) - c2544M36502.f8128) / (c2544M36502.f8127 + (0 / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f49529)) - this.f49544)) <= this.f49513 || Math.abs(xVelocity) <= this.f49511) {
                iMax += (int) (f3 + (iMax >= this.f49522 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f49525;
            if (arrayList.size() > 0) {
                iMax = Math.max(((C2544) arrayList.get(0)).f8126, Math.min(iMax, ((C2544) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f8126));
            }
            m36511(iMax, xVelocity, true, true);
            zM36500 = m36500();
        }
        if (zM36500) {
            int i2 = C22666.f73603;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m36500() {
        this.f49529 = -1;
        this.f49527 = false;
        this.f49509 = false;
        VelocityTracker velocityTracker = this.f49521;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49521 = null;
        }
        this.f49532.onRelease();
        this.f49542.onRelease();
        return this.f49532.isFinished() || this.f49542.isFinished();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m36498(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f49547 - f;
        this.f49547 = f;
        float scrollX = getScrollX() + f2;
        float fM36504 = m36504();
        float f3 = this.f49528 * fM36504;
        float f4 = this.f49534 * fM36504;
        ArrayList arrayList = this.f49525;
        boolean z3 = false;
        C2544 c2544 = (C2544) arrayList.get(0);
        C2544 c2545 = (C2544) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        if (c2544.f8126 != 0) {
            f3 = c2544.f8128 * fM36504;
            z = false;
        } else {
            z = true;
        }
        if (c2545.f8126 != this.f49541.mo3000() - 1) {
            f4 = c2545.f8128 * fM36504;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f49532.onPull(Math.abs(f3 - scrollX) / fM36504);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f49542.onPull(Math.abs(scrollX - f4) / fM36504);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f49547 = (scrollX - i) + this.f49547;
        scrollTo(i, getScrollY());
        m36501(i);
        return z3;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C2544 m36502() {
        C2544 c2544;
        int i;
        int iM36504 = m36504();
        float f = 0.0f;
        float scrollX = iM36504 > 0 ? getScrollX() / iM36504 : 0.0f;
        float f2 = iM36504 > 0 ? 0 / iM36504 : 0.0f;
        int i2 = -1;
        C2544 c2545 = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.f49525;
            if (i3 >= arrayList.size()) {
                break;
            }
            C2544 c2546 = (C2544) arrayList.get(i3);
            if (z || c2546.f8126 == (i = i2 + 1)) {
                c2544 = c2546;
            } else {
                float f4 = f + f3 + f2;
                c2544 = this.f49538;
                c2544.f8128 = f4;
                c2544.f8126 = i;
                this.f49541.getClass();
                c2544.f8127 = 1.0f;
                i3--;
            }
            f = c2544.f8128;
            float f5 = c2544.f8127 + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i3 == arrayList.size() - 1) {
                return c2544;
            }
            i2 = c2544.f8126;
            i3++;
            z = false;
            C2544 c2547 = c2544;
            f3 = c2544.f8127;
            c2545 = c2547;
        }
        return c2545;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC6274 abstractC6274;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f49542;
        EdgeEffect edgeEffect2 = this.f49532;
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC6274 = this.f49541) != null && abstractC6274.mo3000() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f49528 * width);
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
                canvas.translate(-getPaddingTop(), (-(this.f49534 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            int i = C22666.f73603;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36496(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f49529) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f49547 = motionEvent.getX(i);
            this.f49529 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f49521;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m36506(boolean z) {
        if (this.f49518 != z) {
            this.f49518 = z;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f49541 == null) {
            return false;
        }
        int iM36504 = m36504();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) iM36504) * this.f49528));
        }
        return i > 0 && scrollX < ((int) (((float) iM36504) * this.f49534));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36499(int i, int i2, int i3, View view, boolean z) {
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
            if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !m36499(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM36516;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM36516 = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zM36516 = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zM36516 = m36516(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM36516 = m36516(1);
                        } else {
                            zM36516 = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zM36516 = m36528();
                    } else {
                        zM36516 = m36516(66);
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    zM36516 = m36516(17);
                } else {
                    int i = this.f49522;
                    if (i > 0) {
                        m36512(i - 1, true);
                        zM36516 = true;
                    } else {
                        zM36516 = false;
                    }
                }
            }
            if (!zM36516) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[PHI: r0
      0x0088: PHI (r0v5 int) = (r0v3 int), (r0v11 int) binds: [B:44:0x0086, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36516(int i) {
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
        boolean zM36528 = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f49523;
            if (i == 17) {
                int i3 = m36495(rect, viewFindNextFocus).left;
                int i4 = m36495(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    i2 = this.f49522;
                    if (i2 > 0) {
                        m36512(i2 - 1, true);
                    } else {
                        z = false;
                    }
                    zM36528 = z;
                }
            } else if (i == 66) {
                int i5 = m36495(rect, viewFindNextFocus).left;
                int i6 = m36495(rect, viewFindFocus).left;
                if (viewFindFocus != null && i5 <= i6) {
                    zRequestFocus = m36528();
                } else {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
            zM36528 = zRequestFocus;
        } else if (i == 17 || i == 1) {
            i2 = this.f49522;
            if (i2 > 0) {
                m36512(i2 - 1, true);
            } else {
                z = false;
            }
            zM36528 = z;
        } else if (i == 66 || i == 2) {
            zM36528 = m36528();
        }
        if (zM36528) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM36528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Rect m36495(Rect rect, View view) {
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m36528() {
        AbstractC6274 abstractC6274 = this.f49541;
        if (abstractC6274 == null || this.f49522 >= abstractC6274.mo3000() - 1) {
            return false;
        }
        m36512(this.f49522 + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C2544 c2544M36508;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c2544M36508 = m36508(childAt)) != null && c2544M36508.f8126 == this.f49522) {
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
        C2544 c2544M36508;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c2544M36508 = m36508(childAt)) != null && c2544M36508.f8126 == this.f49522) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C2544 c2544M36508;
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
            if (childAt.getVisibility() == 0 && (c2544M36508 = m36508(childAt)) != null && c2544M36508.f8126 == this.f49522 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C2544 c2544M36508;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c2544M36508 = m36508(childAt)) != null && c2544M36508.f8126 == this.f49522 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8510();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8510();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C8510) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8510(getContext(), attributeSet);
    }
}
