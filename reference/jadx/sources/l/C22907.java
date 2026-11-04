package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22907 extends AbstractC13628 {

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74396 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74397;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f74398;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f74399;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f74400;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f74401;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f74402;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f74403;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f74404;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public float f74405;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C14197 f74406;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public float f74407;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final float f74408;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public float f74409;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f74410;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public float f74411;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C5007 f74412;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f74413;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f74414;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public float f74415;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Paint f74416;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public float f74417;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Matrix f74418;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public float f74419;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f74420;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public final RectF f74421;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final float f74422;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final OverScroller f74423;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f74424;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14197 f74425;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f74426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8408 f74427;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f74428;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC1107 f74429;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Paint f74430;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74431;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C22161 f74432;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC7486 f74433;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public float f74434;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f74435;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f74436;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6917 f74437;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f74438;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f74439;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public float f74440;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f74441;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final RectF f74442;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C15756 f74443;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C5600 f74444;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f74445;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public float f74446;

    public C22907(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74444 = new C5600(getResources().getDisplayMetrics().density);
        this.f74431 = new ArrayList(3);
        this.f74416 = new Paint(3);
        Paint paint = new Paint(1);
        this.f74430 = paint;
        Paint paint2 = new Paint(1);
        this.f74424 = paint2;
        this.f74429 = new RunnableC1107(1, this);
        this.f74404 = new Matrix();
        this.f74438 = new Matrix();
        this.f74418 = new Matrix();
        this.f74421 = new RectF();
        this.f74442 = new RectF();
        this.f74425 = new C14197();
        this.f74406 = new C14197();
        this.f74402 = -1;
        this.f74399 = -16777216;
        this.f74433 = EnumC7486.NONE;
        this.f74422 = getResources().getDisplayMetrics().density * 16.0f;
        this.f74423 = new OverScroller(context);
        this.f74443 = new C15756(this);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = getResources().getDisplayMetrics().density;
        this.f74408 = 14.5f * f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.MT_Protector});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            paint2.setColor(color);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f * 3.0f);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            setFocusable(true);
            setClickable(true);
            setImportantForAccessibility(1);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final void mo1642(InterfaceC8408 interfaceC8408, int i) {
        if (interfaceC8408.getCount() < 0 || (interfaceC8408.getCount() > 0 && (i < 0 || i >= interfaceC8408.getCount()))) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo1649();
        this.f74414 = false;
        this.f74446 = 0.0f;
        m51643(0.0f);
        this.f74427 = interfaceC8408;
        if (interfaceC8408.getCount() == 0) {
            i = -1;
        }
        this.f74402 = i;
        if (i >= 0) {
            interfaceC8408.onPageSelected(i);
        }
        m51640();
        m51642();
        invalidate();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final void mo1641(InterfaceC6917 interfaceC6917) {
        this.f74437 = interfaceC6917;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1650() {
        return this.f74402;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ܳ */
    public final Bundle mo1648() {
        C5007 c5007M51639 = m51639(this.f74402);
        if (c5007M51639 == null) {
            return null;
        }
        C24399 c24399 = c5007M51639.f17379;
        if (!m51636(c5007M51639, c5007M51639.f17383)) {
            return null;
        }
        C22161 c22161 = this.f74432;
        if (c22161 != null && c22161.f71376 == c5007M51639 && c22161.f71378 == c5007M51639.f17383) {
            C10972 c10972 = c22161.f71377;
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putInt("width", c10972.f34669);
            bundle.putInt("height", c10972.f34668);
            bundle.putInt("orientation", c10972.f34667);
            C6499 c6499 = c10972.f34666;
            bundle.putDouble("relativeScale", c6499.f21828);
            bundle.putDouble("centerX", c6499.f21825);
            bundle.putDouble("centerY", c6499.f21829);
            bundle.putFloat("rotation", c6499.f21827);
            return bundle;
        }
        if (c5007M51639.f17376 == null || !c24399.m54573()) {
            return null;
        }
        int i = c5007M51639.f17372;
        int i2 = c5007M51639.f17374;
        int iMo2501 = c5007M51639.f17376.mo2501();
        C6499 c6499M54567 = c24399.m54567();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 1);
        bundle2.putInt("width", i);
        bundle2.putInt("height", i2);
        bundle2.putInt("orientation", iMo2501);
        bundle2.putDouble("relativeScale", c6499M54567.f21828);
        bundle2.putDouble("centerX", c6499M54567.f21825);
        bundle2.putDouble("centerY", c6499M54567.f21829);
        bundle2.putFloat("rotation", c6499M54567.f21827);
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1645(Bundle bundle) {
        C10972 c10972 = null;
        this.f74432 = null;
        C5007 c5007M51639 = m51639(this.f74402);
        if (bundle != null) {
            try {
                if (bundle.getInt("version") == 1) {
                    int i = bundle.getInt("width");
                    int i2 = bundle.getInt("height");
                    int i3 = bundle.getInt("orientation");
                    if (i <= 0 || i2 <= 0 || i3 < 1 || i3 > 8) {
                        c10972 = null;
                    } else {
                        C6499 c6499 = new C6499(C18969.m44063(i, i2, i3), C18969.m44064(i, i2, i3), bundle.getDouble("relativeScale", Double.NaN), bundle.getDouble("centerX", Double.NaN), bundle.getDouble("centerY", Double.NaN), bundle.getFloat("rotation", Float.NaN));
                        if (c6499.m18351()) {
                            c10972 = new C10972(i, i2, i3, c6499);
                        } else {
                            c10972 = null;
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        if (c5007M51639 == null || !m51636(c5007M51639, c5007M51639.f17383) || c10972 == null) {
            return false;
        }
        InterfaceC4854 interfaceC4854 = c5007M51639.f17376;
        if (interfaceC4854 != null && (c10972.f34669 != c5007M51639.f17372 || c10972.f34668 != c5007M51639.f17374 || c10972.f34667 != interfaceC4854.mo2501())) {
            return false;
        }
        this.f74432 = new C22161(c5007M51639, c10972);
        m51641();
        return true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m51641() {
        C22161 c22161 = this.f74432;
        if (c22161 == null) {
            return;
        }
        C10972 c10972 = c22161.f71377;
        C5007 c5007M51639 = m51639(this.f74402);
        if (c5007M51639 != null) {
            C24399 c24399 = c5007M51639.f17379;
            if (c22161.f71376 == c5007M51639) {
                long j = c22161.f71378;
                if (j == c5007M51639.f17383 && m51636(c5007M51639, j)) {
                    InterfaceC4854 interfaceC4854 = c5007M51639.f17376;
                    if (interfaceC4854 == null) {
                        return;
                    }
                    if (c10972.f34669 != c5007M51639.f17372 || c10972.f34668 != c5007M51639.f17374 || c10972.f34667 != interfaceC4854.mo2501()) {
                        this.f74432 = null;
                        return;
                    } else {
                        if (c24399.m54573()) {
                            this.f74432 = null;
                            mo1639();
                            c24399.m54552(c10972.f34666);
                            invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.f74432 = null;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۤ */
    public final void mo1646(int i) {
        this.f74399 = i;
        invalidate();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1644(int i, long j, InterfaceC4854 interfaceC4854) {
        if (interfaceC4854 == null) {
            throw new IllegalArgumentException("Missing gallery renderer");
        }
        int width = interfaceC4854.getWidth();
        int height = interfaceC4854.getHeight();
        int iMo2501 = interfaceC4854.mo2501();
        if (width <= 0 || height <= 0 || iMo2501 < 1 || iMo2501 > 8) {
            interfaceC4854.close();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C5007 c5007M51639 = m51639(i);
        if (!m51636(c5007M51639, j)) {
            interfaceC4854.close();
            return false;
        }
        int iM44063 = C18969.m44063(width, height, iMo2501);
        int iM44064 = C18969.m44064(width, height, iMo2501);
        C24399 c24399 = c5007M51639.f17379;
        float[] fArr = c5007M51639.f17380;
        if (c24399.m54554() != iM44063 || c24399.m54559() != iM44064) {
            if (i == this.f74402 && c24399.m54573()) {
                mo1639();
            } else if (i == this.f74402) {
                this.f74443.m37690();
            }
            c24399.m54551(iM44063, iM44064);
        }
        InterfaceC4854 interfaceC4855 = c5007M51639.f17376;
        c5007M51639.f17376 = interfaceC4854;
        c5007M51639.f17373 = false;
        removeCallbacks(this.f74429);
        c5007M51639.f17372 = width;
        c5007M51639.f17374 = height;
        C18969.m44062(width, height, iMo2501, fArr);
        c5007M51639.f17378.setValues(fArr);
        if (interfaceC4855 != null && interfaceC4855 != interfaceC4854) {
            interfaceC4855.close();
        }
        m51641();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51636(C5007 c5007, long j) {
        InterfaceC8408 interfaceC8408;
        if (c5007 == null) {
            return false;
        }
        int i = c5007.f17377;
        return c5007.f17383 == j && (interfaceC8408 = this.f74427) != null && i < interfaceC8408.getCount() && this.f74427.getItemId(i) == c5007.f17375;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1651(int i) {
        C5007 c5007M51639 = m51639(i);
        if (c5007M51639 == null || !m51636(c5007M51639, c5007M51639.f17383)) {
            return false;
        }
        C22161 c22161 = this.f74432;
        if (c22161 != null && c22161.f71376 == c5007M51639) {
            this.f74432 = null;
        }
        long j = c5007M51639.f17383;
        InterfaceC4854 interfaceC4854 = c5007M51639.f17376;
        long j2 = this.f74401 + 1;
        this.f74401 = j2;
        c5007M51639.f17383 = j2;
        c5007M51639.f17376 = null;
        c5007M51639.f17373 = false;
        c5007M51639.f17382 = SystemClock.uptimeMillis();
        this.f74427.mo22604(i, j);
        if (interfaceC4854 != null) {
            interfaceC4854.close();
        }
        this.f74427.mo22605(this, i, c5007M51639.f17383);
        invalidate();
        return true;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final void mo1640(int i, int i2, long j) {
        C5007 c5007M51639 = m51639(i);
        if (c5007M51639 == null || c5007M51639.f17383 != j) {
            return;
        }
        c5007M51639.f17373 = true;
        c5007M51639.f17381 = i2;
        removeCallbacks(this.f74429);
        invalidate();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final void mo1639() {
        m51660();
        this.f74443.m37686();
        if (!this.f74414) {
            this.f74446 = 0.0f;
            m51643(0.0f);
            C24399 c24399M51654 = m51654();
            if (c24399M51654 != null) {
                c24399M51654.m54546();
            }
        }
        invalidate();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1649() {
        removeCallbacks(this.f74429);
        this.f74432 = null;
        mo1639();
        InterfaceC8408 interfaceC8408 = this.f74427;
        this.f74427 = null;
        this.f74402 = -1;
        ArrayList arrayList = this.f74431;
        ArrayList<C5007> arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        for (C5007 c5007 : arrayList2) {
            InterfaceC4854 interfaceC4854 = c5007.f17376;
            c5007.f17376 = null;
            if (interfaceC8408 != null) {
                interfaceC8408.mo22604(c5007.f17377, c5007.f17383);
            }
            if (interfaceC4854 != null) {
                interfaceC4854.close();
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m51640() {
        if (this.f74427 == null || this.f74402 < 0) {
            return;
        }
        ArrayList arrayList = this.f74431;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5007 c5007 = (C5007) arrayList.get(size);
            if (Math.abs(c5007.f17377 - this.f74402) > 1) {
                arrayList.remove(size);
                InterfaceC8408 interfaceC8408 = this.f74427;
                InterfaceC4854 interfaceC4854 = c5007.f17376;
                c5007.f17376 = null;
                if (interfaceC8408 != null) {
                    interfaceC8408.mo22604(c5007.f17377, c5007.f17383);
                }
                if (interfaceC4854 != null) {
                    interfaceC4854.close();
                }
            }
        }
        m51637(this.f74402);
        m51637(this.f74402 - 1);
        m51637(this.f74402 + 1);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m51637(int i) {
        InterfaceC8408 interfaceC8408 = this.f74427;
        if (interfaceC8408 == null || i < 0 || i >= interfaceC8408.getCount() || m51639(i) != null) {
            return;
        }
        long itemId = this.f74427.getItemId(i);
        long j = this.f74401 + 1;
        this.f74401 = j;
        C5007 c5007 = new C5007(itemId, i, j);
        c5007.f17379.m54570(getWidth(), getHeight());
        this.f74431.add(c5007);
        this.f74427.mo22605(this, i, c5007.f17383);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C5007 m51639(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f74431;
            if (i2 >= arrayList.size()) {
                return null;
            }
            if (((C5007) arrayList.get(i2)).f17377 == i) {
                return (C5007) arrayList.get(i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24399 m51654() {
        C5007 c5007M51639 = m51639(this.f74402);
        if (c5007M51639 == null) {
            return null;
        }
        return c5007M51639.f17379;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m51646() {
        return this.f74446;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m51650() {
        return this.f74410;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m51651(float f) {
        return 1.0f - (m51645(f) * 0.25f);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private float m51645(float f) {
        return Math.min(1.0f, f / Math.max(1.0f, getHeight() * 0.65f));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m51659(int i) {
        InterfaceC8408 interfaceC8408 = this.f74427;
        if (interfaceC8408 == null) {
            return false;
        }
        int i2 = this.f74402;
        return i2 + i >= 0 && i2 + i < interfaceC8408.getCount();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51656(float f) {
        float fM52132 = this.f74446 + f;
        int i = fM52132 < 0.0f ? 1 : -1;
        float width = getWidth() + this.f74422;
        while (Math.abs(fM52132) >= width && m51659(i)) {
            fM52132 += i * width;
            m51631(this.f74402 + i);
            InterfaceC6917 interfaceC6917 = this.f74437;
            if (interfaceC6917 != null) {
                interfaceC6917.mo19203(this.f74402);
            }
        }
        if (!m51659(i) && Math.signum(f) == Math.signum(fM52132)) {
            float f2 = this.f74446;
            fM52132 = ((fM52132 - f2) * C23216.m52132(Math.abs(f2), getWidth())) + f2;
        }
        this.f74446 = Math.max(-width, Math.min(width, fM52132));
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m51631(int i) {
        InterfaceC8408 interfaceC8408;
        boolean z = this.f74402 != i;
        if (z) {
            this.f74432 = null;
            C24399 c24399M51654 = m51654();
            if (c24399M51654 != null) {
                c24399M51654.m54560();
            }
        }
        this.f74402 = i;
        this.f74446 = 0.0f;
        if (z && (interfaceC8408 = this.f74427) != null) {
            interfaceC8408.onPageSelected(i);
        }
        m51640();
        m51642();
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51653() {
        this.f74446 = 0.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m51643(float f) {
        this.f74410 = f;
        InterfaceC6917 interfaceC6917 = this.f74437;
        if (interfaceC6917 != null) {
            interfaceC6917.mo19202(m51645(f));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51647(float f) {
        m51643(Math.max(0.0f, Math.min(getHeight(), this.f74410 + f)));
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51657(float f, float f2) {
        super.performClick();
        if (m51638(this.f74402)) {
            if (this.f74444.m16582(f, f2, getWidth() / 2.0f, getHeight() / 2.0f)) {
                InterfaceC6917 interfaceC6917 = this.f74437;
                if (interfaceC6917 != null) {
                    interfaceC6917.mo19204(this.f74402);
                    return;
                }
                return;
            }
        }
        InterfaceC6917 interfaceC6918 = this.f74437;
        if (interfaceC6918 != null) {
            interfaceC6918.mo19201();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m51638(int i) {
        InterfaceC8408 interfaceC8408 = this.f74427;
        return interfaceC8408 != null && i >= 0 && interfaceC8408.mo22606(i);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f74414) {
            return false;
        }
        super.performClick();
        if (this.f74437 == null) {
            return true;
        }
        if (m51638(this.f74402)) {
            this.f74437.mo19204(this.f74402);
            return true;
        }
        this.f74437.mo19201();
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51642() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.MT_Protector));
        if (this.f74427 == null) {
            str = "";
        } else {
            str = " " + (this.f74402 + 1) + "/" + this.f74427.getCount();
        }
        sb.append(str);
        setContentDescription(sb.toString());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        mo1639();
        Iterator it = this.f74431.iterator();
        while (it.hasNext()) {
            ((C5007) it.next()).f17379.m54570(i, i2);
        }
        m51641();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo1639();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f74429);
        mo1639();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f74402 < 0 || this.f74414) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f74432 = null;
        }
        C15756 c15756 = this.f74443;
        boolean zM37691 = c15756.m37691();
        c15756.m37687(motionEvent);
        if (zM37691 != c15756.m37691()) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList<C5007> arrayList;
        float f;
        float f2;
        RunnableC1107 runnableC1107 = this.f74429;
        removeCallbacks(runnableC1107);
        if (this.f74414) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float fM51645 = 1.0f - m51645(this.f74410);
        int iRound = Math.round(Color.alpha(this.f74399) * fM51645);
        int iSave = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawColor((iRound << 24) | (this.f74399 & 16777215));
        float f3 = this.f74410;
        boolean z = f3 > 0.0f;
        float fM51651 = z ? m51651(f3) : 1.0f;
        long jMin = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            arrayList = this.f74431;
            int size = arrayList.size();
            f = this.f74422;
            if (i >= size) {
                break;
            }
            C5007 c5007 = (C5007) arrayList.get(i);
            int i2 = c5007.f17377;
            C24399 c24399 = c5007.f17379;
            int i3 = this.f74402;
            boolean z2 = i2 == i3;
            float width = ((getWidth() + f) * (i2 - i3)) + this.f74446;
            boolean zIntersect = (!z || z2) && width < ((float) getWidth()) && ((float) getWidth()) + width > 0.0f;
            float width2 = getWidth();
            RunnableC1107 runnableC1108 = runnableC1107;
            float height = getHeight();
            int i4 = iSave;
            RectF rectF = this.f74421;
            float f4 = fM51645;
            rectF.set(0.0f, 0.0f, width2, height);
            if (zIntersect && !z) {
                zIntersect = rectF.intersect(width, 0.0f, getWidth() + width, getHeight());
            }
            if (c5007.f17376 != null && c24399.m54573()) {
                Matrix matrix = this.f74404;
                matrix.reset();
                if (z) {
                    matrix.setTranslate(0.0f, this.f74410);
                    matrix.preScale(fM51651, fM51651, getWidth() * 0.5f, getHeight() * 0.5f);
                }
                matrix.preTranslate(c24399.m54544() + width, c24399.m54566());
                matrix.preRotate(c24399.m54562());
                matrix.preScale(c24399.m54572(), c24399.m54572());
                matrix.preConcat(c5007.f17378);
                RectF rectF2 = this.f74442;
                rectF2.setEmpty();
                if (zIntersect) {
                    Matrix matrix2 = this.f74438;
                    if (matrix.invert(matrix2)) {
                        matrix2.mapRect(rectF2, rectF);
                    }
                }
                c5007.f17376.mo2503(rectF2, c24399.m54572() * fM51651, z2);
                if (zIntersect) {
                    int iSave2 = canvas.save();
                    if (!z) {
                        canvas.clipRect(width, 0.0f, getWidth() + width, getHeight());
                    }
                    canvas.concat(matrix);
                    c5007.f17376.mo2502(canvas, this.f74416);
                    canvas.restoreToCount(iSave2);
                }
            } else {
                if (zIntersect && !m51638(c5007.f17377)) {
                    int iSave3 = canvas.save();
                    if (z) {
                        f2 = 0.0f;
                        canvas.translate(0.0f, this.f74410);
                        canvas.scale(fM51651, fM51651, getWidth() * 0.5f, getHeight() * 0.5f);
                    } else {
                        f2 = 0.0f;
                    }
                    canvas.translate(width, f2);
                    if (!z) {
                        canvas.clipRect(0, 0, getWidth(), getHeight());
                    }
                    Paint paint = this.f74430;
                    paint.setColor(-3355444);
                    if (c5007.f17373) {
                        canvas.drawText(getResources().getString(c5007.f17381), getWidth() / 2.0f, getHeight() / 2.0f, paint);
                    } else {
                        long j = (jUptimeMillis - c5007.f17382) - 200;
                        if (j < 0) {
                            jMin = Math.min(jMin, -j);
                        } else {
                            float width3 = getWidth() / 2.0f;
                            float height2 = getHeight() / 2.0f;
                            int iRound2 = Math.round(Math.min(1.0f, j / 120.0f) * 255.0f * f4);
                            Paint paint2 = this.f74424;
                            paint2.setAlpha(iRound2);
                            float f5 = this.f74408;
                            canvas.drawArc(width3 - f5, height2 - f5, width3 + f5, height2 + f5, (((j % 900) * 360.0f) / 900.0f) - 90.0f, 240.0f, false, paint2);
                            jMin = 0;
                        }
                        canvas.restoreToCount(iSave3);
                    }
                    canvas.restoreToCount(iSave3);
                }
                i++;
                fM51651 = fM51651;
                runnableC1107 = runnableC1108;
                iSave = i4;
                fM51645 = f4;
                jUptimeMillis = jUptimeMillis;
            }
            jUptimeMillis = jUptimeMillis;
            i = i;
            fM51651 = fM51651;
            i++;
            fM51651 = fM51651;
            runnableC1107 = runnableC1108;
            iSave = i4;
            fM51645 = f4;
            jUptimeMillis = jUptimeMillis;
        }
        float f6 = fM51651;
        RunnableC1107 runnableC1109 = runnableC1107;
        int i5 = iSave;
        for (C5007 c5008 : arrayList) {
            if (!this.f74443.m37691()) {
                int i6 = c5008.f17377;
                if (m51638(i6) && (!z || i6 == this.f74402)) {
                    float width4 = ((getWidth() + f) * (i6 - this.f74402)) + this.f74446;
                    if (width4 < getWidth() && getWidth() + width4 > 0.0f) {
                        int iSave4 = canvas.save();
                        if (z) {
                            canvas.translate(0.0f, this.f74410);
                            canvas.scale(f6, f6, getWidth() / 2.0f, getHeight() / 2.0f);
                        }
                        canvas.clipRect(width4, 0.0f, getWidth() + width4, getHeight());
                        this.f74444.m16581(canvas, (getWidth() / 2.0f) + width4, getHeight() / 2.0f);
                        canvas.restoreToCount(iSave4);
                    }
                }
            }
        }
        canvas.restoreToCount(i5);
        if (jMin != C25227.FOREVER_NS && isAttachedToWindow() && getWindowVisibility() == 0 && isShown()) {
            if (jMin == 0) {
                postOnAnimation(runnableC1109);
            } else {
                postDelayed(runnableC1109, jMin);
            }
        }
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo1647() {
        return this.f74433 != EnumC7486.NONE;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1652() {
        return this.f74443.m37689();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ */
    public final float mo33374(RectF rectF) {
        float fM54562;
        float fMax;
        float f;
        float f2;
        C5007 c5007 = this.f74412;
        if (c5007 == null) {
            return 0.0f;
        }
        EnumC7486 enumC7486 = this.f74433;
        if (enumC7486 == EnumC7486.ZOOM && this.f74439) {
            f = this.f74411;
            f2 = this.f74426;
            fMax = this.f74407;
            fM54562 = this.f74415;
        } else {
            if (enumC7486 != EnumC7486.FLING) {
                return 0.0f;
            }
            C24399 c24399 = c5007.f17379;
            float fM54572 = c24399.m54572();
            fM54562 = c24399.m54562();
            float fM54563 = c24399.m54563();
            float fM54543 = c24399.m54543();
            OverScroller overScroller = this.f74423;
            float fMax2 = Math.max(fM54563, Math.min(fM54543, overScroller.getFinalX()));
            fMax = Math.max(c24399.m54564(), Math.min(c24399.m54557(), overScroller.getFinalY()));
            f = fM54572;
            f2 = fMax2;
        }
        Matrix matrix = this.f74418;
        matrix.setTranslate(f2, fMax);
        matrix.preRotate(fM54562);
        matrix.preScale(f, f);
        matrix.preConcat(this.f74412.f17378);
        Matrix matrix2 = this.f74438;
        if (!matrix.invert(matrix2)) {
            return 0.0f;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        matrix2.mapRect(rectF);
        return f;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m51660() {
        this.f74433 = EnumC7486.NONE;
        this.f74412 = null;
        this.f74423.forceFinished(true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m51655(int i) {
        if (!m51659(i)) {
            i = 0;
        }
        if (i != 0) {
            this.f74432 = null;
        }
        this.f74403 = this.f74402 + i;
        m51635(EnumC7486.PAGE, (getWidth() + this.f74422) * (-i), 0.0f, 280);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51658(boolean z) {
        m51635(z ? EnumC7486.DISMISS : EnumC7486.RESTORE, 0.0f, z ? getHeight() : 0.0f, 220);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51649(boolean z) {
        m51635(z ? EnumC7486.TO_SCALE : EnumC7486.RESTORE, 0.0f, 0.0f, z ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 220);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51652(float f, float f2) {
        C24399 c24399M51654 = m51654();
        if (c24399M51654 == null || !c24399M51654.m54573()) {
            return;
        }
        float fM54572 = c24399M51654.m54572();
        float fM54544 = c24399M51654.m54544();
        float fM54566 = c24399M51654.m54566();
        float fM54561 = c24399M51654.m54561();
        if (fM54561 != c24399M51654.m54565()) {
            c24399M51654.m54547(fM54561, f, f2, f, f2);
        } else {
            c24399M51654.m54545();
        }
        float fM54573 = c24399M51654.m54572();
        float fM54545 = c24399M51654.m54544();
        float fM54567 = c24399M51654.m54566();
        c24399M51654.m54550(fM54572, fM54544, fM54566, false);
        m51635(EnumC7486.ZOOM, 0.0f, 0.0f, 300);
        this.f74411 = fM54573;
        this.f74426 = fM54545;
        this.f74407 = fM54567;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51648(float f, float f2) {
        C24399 c24399M51654 = m51654();
        if (c24399M51654 == null || !c24399M51654.m54573()) {
            m51649(false);
            return;
        }
        if (c24399M51654.m54562() != c24399M51654.m54571()) {
            m51649(false);
            return;
        }
        float fM54572 = c24399M51654.m54572();
        float fM54544 = c24399M51654.m54544();
        float fM54566 = c24399M51654.m54566();
        c24399M51654.m54569();
        boolean z = Math.abs(fM54572 - c24399M51654.m54572()) > 1.0E-4f;
        float fM54545 = c24399M51654.m54544();
        float fM54567 = c24399M51654.m54566();
        c24399M51654.m54550(fM54572, fM54544, fM54566, false);
        if (z) {
            m51649(false);
            return;
        }
        m51660();
        float f3 = fM54544 - fM54545;
        this.f74441 = f3;
        this.f74420 = fM54566 - fM54567;
        float f4 = 0.0f;
        float f5 = (Math.abs(f3) > 0.1f || c24399M51654.m54563() == c24399M51654.m54543()) ? 0.0f : f;
        if (Math.abs(this.f74420) <= 0.1f && c24399M51654.m54564() != c24399M51654.m54557()) {
            f4 = f2;
        }
        this.f74433 = EnumC7486.FLING;
        this.f74435 = SystemClock.uptimeMillis();
        this.f74425.m34488(Math.round(fM54545), f5, this.f74435);
        this.f74406.m34488(Math.round(fM54567), f4, this.f74435);
        this.f74412 = m51639(this.f74402);
        this.f74443.m37692();
        this.f74423.fling(Math.round(fM54545), Math.round(fM54567), Math.round(f5), Math.round(f4), Math.round(c24399M51654.m54563()), Math.round(c24399M51654.m54543()), Math.round(c24399M51654.m54564()), Math.round(c24399M51654.m54557()), m51634(f5, getWidth()), m51634(f4, getHeight()));
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m51634(float f, int i) {
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(Math.min(getResources().getDisplayMetrics().density * 24.0f, i * 0.04f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51635(EnumC7486 enumC7486, float f, float f2, int i) {
        m51660();
        this.f74433 = enumC7486;
        C5007 c5007M51639 = m51639(this.f74402);
        this.f74412 = c5007M51639;
        this.f74439 = c5007M51639 != null && c5007M51639.f17379.m54573();
        this.f74435 = SystemClock.uptimeMillis();
        this.f74397 = i;
        this.f74428 = this.f74446;
        this.f74417 = f;
        this.f74405 = this.f74410;
        this.f74400 = f2;
        if (this.f74439) {
            C24399 c24399 = this.f74412.f17379;
            this.f74434 = c24399.m54572();
            this.f74398 = c24399.m54544();
            this.f74413 = c24399.m54566();
            float fM54562 = c24399.m54562();
            this.f74440 = fM54562;
            float fM54571 = (enumC7486 == EnumC7486.TO_SCALE || enumC7486 == EnumC7486.ZOOM) ? fM54562 : c24399.m54571();
            this.f74415 = fM54571;
            c24399.m54548(this.f74434, fM54571, getWidth() * 0.5f, getHeight() * 0.5f, getWidth() * 0.5f, getHeight() * 0.5f, true);
            this.f74411 = c24399.m54572();
            this.f74426 = c24399.m54544();
            this.f74407 = c24399.m54566();
            float f3 = this.f74440;
            if (f3 != this.f74415) {
                double radians = Math.toRadians(f3);
                double radians2 = Math.toRadians(this.f74415);
                this.f74409 = this.f74398 + m51633(c24399, this.f74434, radians);
                this.f74445 = this.f74413 + m51644(c24399, this.f74434, radians);
                this.f74436 = this.f74426 + m51633(c24399, this.f74411, radians2);
                this.f74419 = this.f74407 + m51644(c24399, this.f74411, radians2);
            }
            c24399.m54549(this.f74434, this.f74440, this.f74398, this.f74413, false);
        }
        this.f74443.m37692();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f;
        float f2;
        InterfaceC6917 interfaceC6917;
        C5007 c5007;
        EnumC7486 enumC7486 = this.f74433;
        EnumC7486 enumC7487 = EnumC7486.NONE;
        if (enumC7486 == enumC7487) {
            return;
        }
        if (this.f74412 != m51639(this.f74402)) {
            mo1639();
            return;
        }
        EnumC7486 enumC7488 = this.f74433;
        EnumC7486 enumC7489 = EnumC7486.FLING;
        C15756 c15756 = this.f74443;
        if (enumC7488 == enumC7489) {
            OverScroller overScroller = this.f74423;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            float fMax = (this.f74441 == 0.0f && this.f74420 == 0.0f) ? 0.0f : Math.max(0.0f, 1.0f - ((SystemClock.uptimeMillis() - this.f74435) / 220.0f));
            C5007 c5008 = this.f74412;
            if (c5008 != null) {
                C24399 c24399 = c5008.f17379;
                long jUptimeMillis = SystemClock.uptimeMillis();
                float f3 = getResources().getDisplayMetrics().density;
                float f4 = fMax * fMax * fMax;
                c24399.m54550(c24399.m54572(), (this.f74441 * f4) + this.f74425.m34487(overScroller.getCurrX(), overScroller.getFinalX(), c24399.m54563(), c24399.m54543(), f3, jUptimeMillis), (this.f74420 * f4) + this.f74406.m34487(overScroller.getCurrY(), overScroller.getFinalY(), c24399.m54564(), c24399.m54557(), f3, jUptimeMillis), !zComputeScrollOffset && fMax == 0.0f);
            }
            if (zComputeScrollOffset || fMax > 0.0f) {
                postInvalidateOnAnimation();
                return;
            }
            this.f74433 = enumC7487;
            this.f74412 = null;
            c15756.m37688(false);
            return;
        }
        float fMin = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f74435) / this.f74397);
        float f5 = 1.0f - fMin;
        EnumC7486 enumC74810 = this.f74433;
        if (enumC74810 == EnumC7486.ZOOM) {
            f = (3.0f - (2.0f * fMin)) * fMin * fMin;
        } else {
            f = enumC74810 == EnumC7486.PAGE ? 1.0f - (f5 * f5) : 1.0f - ((f5 * f5) * f5);
        }
        this.f74446 = m51632(this.f74428, this.f74417, f);
        m51643(m51632(this.f74405, this.f74400, f));
        if (this.f74439 && (c5007 = this.f74412) != null && c5007.f17379.m54573()) {
            C24399 c243910 = this.f74412.f17379;
            float fM51632 = m51632(this.f74434, this.f74411, f);
            float f6 = this.f74440;
            float f7 = this.f74415;
            if (f6 != f7) {
                float fM51633 = m51632(f6, f7, f);
                double radians = Math.toRadians(fM51633);
                f2 = 1.0f;
                c243910.m54549(fM51632, fM51633, m51632(this.f74409, this.f74436, f) - m51633(c243910, fM51632, radians), m51632(this.f74445, this.f74419, f) - m51644(c243910, fM51632, radians), false);
            } else {
                f2 = 1.0f;
                c243910.m54550(fM51632, m51632(this.f74398, this.f74426, f), m51632(this.f74413, this.f74407, f), false);
            }
        } else {
            f2 = 1.0f;
        }
        invalidate();
        if (fMin < f2) {
            postInvalidateOnAnimation();
            return;
        }
        EnumC7486 enumC74811 = this.f74433;
        this.f74433 = enumC7487;
        this.f74412 = null;
        if (enumC74811 == EnumC7486.PAGE) {
            boolean zM51631 = m51631(this.f74403);
            c15756.m37688(false);
            if (!zM51631 || (interfaceC6917 = this.f74437) == null) {
                return;
            }
            interfaceC6917.mo19203(this.f74402);
            return;
        }
        c15756.m37688(enumC74811 == EnumC7486.TO_SCALE);
        if (enumC74811 == EnumC7486.DISMISS) {
            this.f74414 = true;
            InterfaceC6917 interfaceC6918 = this.f74437;
            if (interfaceC6918 != null) {
                interfaceC6918.onDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m51632(float f, float f2, float f3) {
        return C19967.m45884(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m51633(C24399 c24399, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c24399.m54554())) - (Math.sin(d) * ((double) c24399.m54559()))) * ((double) f) * 0.5d);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static float m51644(C24399 c24399, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c24399.m54559())) + (Math.sin(d) * ((double) c24399.m54554()))) * ((double) f) * 0.5d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(m51659(1) || m51659(-1));
        if (m51638(this.f74402)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (m51659(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (m51659(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2 = 0;
        if (this.f74414) {
            return false;
        }
        if (i == 4096) {
            i2 = 1;
        } else if (i == 8192) {
            i2 = -1;
        }
        if (i2 != 0 && m51659(i2)) {
            mo1639();
            m51655(i2);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        if (i == 22) {
            i2 = 1;
        } else {
            i2 = i == 21 ? -1 : 0;
        }
        if (i2 != 0 && m51659(i2)) {
            mo1639();
            m51655(i2);
            return true;
        }
        if (i == 81 || i == 70 || i == 69) {
            mo1639();
            m51652(getWidth() / 2.0f, getHeight() / 2.0f);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
