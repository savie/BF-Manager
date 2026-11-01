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

/* JADX INFO: renamed from: l.۟ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7387 extends AbstractC17679 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24511 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC18676 f24512;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public float f24513;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f24514;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24515;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public float f24516;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C22348 f24517;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8093 f24518;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public float f24519;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f24520;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C8093 f24521;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public float f24522;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12741 f24523;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Matrix f24524;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public float f24525;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final float f24526;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f24527;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f24528;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final OverScroller f24529;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f24530;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public float f24531;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f24532;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24533;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f24534;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f24535;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public final RectF f24536;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C19382 f24537;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f24538;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final float f24539;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f24540;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final RectF f24541;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24542;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f24543;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24544;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0103 f24545;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f24546;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24547;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public float f24548;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f24549;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public float f24550;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final Paint f24551;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C9649 f24552;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f24553;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24554;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public float f24555;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f24556;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C8799 f24557;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC20410 f24558;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f24559;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f24560;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public float f24561;

    public C7387(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24552 = new C9649(getResources().getDisplayMetrics().density);
        this.f24544 = new ArrayList(3);
        this.f24560 = new Paint(3);
        Paint paint = new Paint(1);
        this.f24551 = paint;
        Paint paint2 = new Paint(1);
        this.f24514 = paint2;
        this.f24558 = new RunnableC20410(3, this);
        this.f24528 = new Matrix();
        this.f24553 = new Matrix();
        this.f24524 = new Matrix();
        this.f24536 = new RectF();
        this.f24541 = new RectF();
        this.f24518 = new C8093();
        this.f24521 = new C8093();
        this.f24542 = -1;
        this.f24533 = -16777216;
        this.f24512 = EnumC18676.NONE;
        this.f24526 = getResources().getDisplayMetrics().density * 16.0f;
        this.f24529 = new OverScroller(context);
        this.f24517 = new C22348(this);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = getResources().getDisplayMetrics().density;
        this.f24539 = 14.5f * f;
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

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19695(C0103 c0103, int i) {
        if (c0103.m1122() < 0 || (c0103.m1122() > 0 && (i < 0 || i >= c0103.m1122()))) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo19700();
        this.f24515 = false;
        this.f24559 = 0.0f;
        m19679(0.0f);
        this.f24545 = c0103;
        if (c0103.m1122() == 0) {
            i = -1;
        }
        this.f24542 = i;
        if (i >= 0) {
            c0103.m1121(i);
        }
        m19683();
        m19684();
        invalidate();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19696(InterfaceC12741 interfaceC12741) {
        this.f24523 = interfaceC12741;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo19708() {
        return this.f24542;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Bundle mo19713() {
        C19382 c19382M19685 = m19685(this.f24542);
        if (c19382M19685 == null) {
            return null;
        }
        C14444 c14444 = c19382M19685.f62466;
        if (!m19678(c19382M19685, c19382M19685.f62468)) {
            return null;
        }
        C8799 c8799 = this.f24557;
        if (c8799 != null && c8799.f30276 == c19382M19685 && c8799.f30278 == c19382M19685.f62468) {
            C10210 c10210 = c8799.f30277;
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putInt("width", c10210.f34868);
            bundle.putInt("height", c10210.f34871);
            bundle.putInt("orientation", c10210.f34870);
            C23616 c23616 = c10210.f34869;
            bundle.putDouble("relativeScale", c23616.f76521);
            bundle.putDouble("centerX", c23616.f76520);
            bundle.putDouble("centerY", c23616.f76523);
            bundle.putFloat("rotation", c23616.f76524);
            return bundle;
        }
        if (c19382M19685.f62462 == null || !c14444.m34827()) {
            return null;
        }
        int i = c19382M19685.f62459;
        int i2 = c19382M19685.f62464;
        int i3 = ((C20565) c19382M19685.f62462).f67004.f68246;
        C23616 c23616M34841 = c14444.m34841();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 1);
        bundle2.putInt("width", i);
        bundle2.putInt("height", i2);
        bundle2.putInt("orientation", i3);
        bundle2.putDouble("relativeScale", c23616M34841.f76521);
        bundle2.putDouble("centerX", c23616M34841.f76520);
        bundle2.putDouble("centerY", c23616M34841.f76523);
        bundle2.putFloat("rotation", c23616M34841.f76524);
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19699(Bundle bundle) {
        C10210 c10210 = null;
        this.f24557 = null;
        C19382 c19382M19685 = m19685(this.f24542);
        if (bundle != null) {
            try {
                if (bundle.getInt("version") == 1) {
                    int i = bundle.getInt("width");
                    int i2 = bundle.getInt("height");
                    int i3 = bundle.getInt("orientation");
                    if (i <= 0 || i2 <= 0 || i3 < 1 || i3 > 8) {
                        c10210 = null;
                    } else {
                        C23616 c23616 = new C23616(C0418.m2183(i, i2, i3), C0418.m2184(i, i2, i3), bundle.getDouble("relativeScale", Double.NaN), bundle.getDouble("centerX", Double.NaN), bundle.getDouble("centerY", Double.NaN), bundle.getFloat("rotation", Float.NaN));
                        if (c23616.m52087()) {
                            c10210 = new C10210(i, i2, i3, c23616);
                        } else {
                            c10210 = null;
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        if (c19382M19685 == null || !m19678(c19382M19685, c19382M19685.f62468) || c10210 == null) {
            return false;
        }
        if (c19382M19685.f62462 != null && !c10210.m25996(c19382M19685)) {
            return false;
        }
        this.f24557 = new C8799(c19382M19685, c10210);
        m19682();
        return true;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m19682() {
        C8799 c8799 = this.f24557;
        if (c8799 == null) {
            return;
        }
        C10210 c10210 = c8799.f30277;
        C19382 c19382M19685 = m19685(this.f24542);
        if (c19382M19685 != null) {
            C14444 c14444 = c19382M19685.f62466;
            if (c8799.f30276 == c19382M19685) {
                long j = c8799.f30278;
                if (j == c19382M19685.f62468 && m19678(c19382M19685, j)) {
                    if (c19382M19685.f62462 == null) {
                        return;
                    }
                    if (!c10210.m25996(c19382M19685)) {
                        this.f24557 = null;
                        return;
                    } else {
                        if (c14444.m34827()) {
                            this.f24557 = null;
                            mo19691();
                            c14444.m34823(c10210.f34869);
                            invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.f24557 = null;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo19705(int i) {
        this.f24533 = i;
        invalidate();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19698(int i, long j, InterfaceC12471 interfaceC12471) {
        if (interfaceC12471 == null) {
            throw new IllegalArgumentException("Missing gallery renderer");
        }
        C20565 c20565 = (C20565) interfaceC12471;
        C20937 c20937 = c20565.f67004;
        int i2 = c20937.f68250;
        int i3 = c20937.f68251;
        int i4 = c20937.f68246;
        if (i2 <= 0 || i3 <= 0 || i4 < 1 || i4 > 8) {
            c20565.m46411();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C19382 c19382M19685 = m19685(i);
        if (!m19678(c19382M19685, j)) {
            c20565.m46411();
            return false;
        }
        int iM2183 = C0418.m2183(i2, i3, i4);
        int iM2184 = C0418.m2184(i2, i3, i4);
        C14444 c14444 = c19382M19685.f62466;
        float[] fArr = c19382M19685.f62461;
        if (c14444.m34832() != iM2183 || c14444.m34814() != iM2184) {
            if (i == this.f24542 && c14444.m34827()) {
                mo19691();
            } else if (i == this.f24542) {
                this.f24517.m49575();
            }
            c14444.m34822(iM2183, iM2184);
        }
        InterfaceC12471 interfaceC12472 = c19382M19685.f62462;
        c19382M19685.f62462 = interfaceC12471;
        c19382M19685.f62460 = false;
        removeCallbacks(this.f24558);
        c19382M19685.f62459 = i2;
        c19382M19685.f62464 = i3;
        C0418.m2180(i2, i3, i4, fArr);
        c19382M19685.f62467.setValues(fArr);
        if (interfaceC12472 != null && interfaceC12472 != interfaceC12471) {
            ((C20565) interfaceC12472).m46411();
        }
        m19682();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19678(C19382 c19382, long j) {
        C0103 c0103;
        if (c19382 == null) {
            return false;
        }
        int i = c19382.f62457;
        if (c19382.f62468 != j || (c0103 = this.f24545) == null || i >= c0103.m1122()) {
            return false;
        }
        this.f24545.getClass();
        return ((long) i) + 1 == c19382.f62463;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19712(int i) {
        C19382 c19382M19685 = m19685(i);
        if (c19382M19685 == null || !m19678(c19382M19685, c19382M19685.f62468)) {
            return false;
        }
        C8799 c8799 = this.f24557;
        if (c8799 != null && c8799.f30276 == c19382M19685) {
            this.f24557 = null;
        }
        long j = c19382M19685.f62468;
        InterfaceC12471 interfaceC12471 = c19382M19685.f62462;
        long j2 = this.f24520 + 1;
        this.f24520 = j2;
        c19382M19685.f62468 = j2;
        c19382M19685.f62462 = null;
        c19382M19685.f62460 = false;
        c19382M19685.f62458 = SystemClock.uptimeMillis();
        this.f24545.m1124(i, j);
        if (interfaceC12471 != null) {
            ((C20565) interfaceC12471).m46411();
        }
        this.f24545.m1130(i, c19382M19685.f62468);
        invalidate();
        return true;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19694(int i, int i2, long j) {
        C19382 c19382M19685 = m19685(i);
        if (c19382M19685 == null || c19382M19685.f62468 != j) {
            return;
        }
        c19382M19685.f62460 = true;
        c19382M19685.f62465 = i2;
        removeCallbacks(this.f24558);
        invalidate();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19691() {
        m19714();
        this.f24517.m49572();
        if (!this.f24515) {
            this.f24559 = 0.0f;
            m19679(0.0f);
            C14444 c14444M19686 = m19686();
            if (c14444M19686 != null) {
                c14444M19686.m34817();
            }
        }
        invalidate();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo19700() {
        removeCallbacks(this.f24558);
        this.f24557 = null;
        mo19691();
        C0103 c0103 = this.f24545;
        this.f24545 = null;
        this.f24542 = -1;
        ArrayList arrayList = this.f24544;
        ArrayList<C19382> arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        for (C19382 c19382 : arrayList2) {
            InterfaceC12471 interfaceC12471 = c19382.f62462;
            c19382.f62462 = null;
            if (c0103 != null) {
                c0103.m1124(c19382.f62457, c19382.f62468);
            }
            if (interfaceC12471 != null) {
                ((C20565) interfaceC12471).m46411();
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m19683() {
        if (this.f24545 == null || this.f24542 < 0) {
            return;
        }
        ArrayList arrayList = this.f24544;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C19382 c19382 = (C19382) arrayList.get(size);
            if (Math.abs(c19382.f62457 - this.f24542) > 1) {
                arrayList.remove(size);
                C0103 c0103 = this.f24545;
                InterfaceC12471 interfaceC12471 = c19382.f62462;
                c19382.f62462 = null;
                if (c0103 != null) {
                    c0103.m1124(c19382.f62457, c19382.f62468);
                }
                if (interfaceC12471 != null) {
                    ((C20565) interfaceC12471).m46411();
                }
            }
        }
        m19680(this.f24542);
        m19680(this.f24542 - 1);
        m19680(this.f24542 + 1);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m19680(int i) {
        C0103 c0103 = this.f24545;
        if (c0103 == null || i < 0 || i >= c0103.m1122() || m19685(i) != null) {
            return;
        }
        this.f24545.getClass();
        long j = this.f24520 + 1;
        this.f24520 = j;
        C19382 c19382 = new C19382(((long) i) + 1, i, j);
        c19382.f62466.m34835(getWidth(), getHeight());
        this.f24544.add(c19382);
        this.f24545.m1130(i, c19382.f62468);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C19382 m19685(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f24544;
            if (i2 >= arrayList.size()) {
                return null;
            }
            if (((C19382) arrayList.get(i2)).f62457 == i) {
                return (C19382) arrayList.get(i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14444 m19686() {
        C19382 c19382M19685 = m19685(this.f24542);
        if (c19382M19685 == null) {
            return null;
        }
        return c19382M19685.f62466;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m19689() {
        return this.f24559;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float m19707() {
        return this.f24530;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m19703(float f) {
        return 1.0f - (m19672(f) * 0.25f);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private float m19672(float f) {
        return Math.min(1.0f, f / Math.max(1.0f, getHeight() * 0.65f));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m19688(int i) {
        int i2;
        C0103 c0103 = this.f24545;
        return c0103 != null && (i2 = this.f24542 + i) >= 0 && i2 < c0103.m1122();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19709(float f) {
        float fM4318 = this.f24559 + f;
        int i = fM4318 < 0.0f ? 1 : -1;
        float width = getWidth() + this.f24526;
        while (Math.abs(fM4318) >= width && m19688(i)) {
            fM4318 += i * width;
            m19673(this.f24542 + i);
            InterfaceC12741 interfaceC12741 = this.f24523;
            if (interfaceC12741 != null) {
                interfaceC12741.mo18821(this.f24542);
            }
        }
        if (!m19688(i) && Math.signum(f) == Math.signum(fM4318)) {
            float f2 = this.f24559;
            fM4318 = ((fM4318 - f2) * C1180.m4318(Math.abs(f2), getWidth())) + f2;
        }
        this.f24559 = Math.max(-width, Math.min(width, fM4318));
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m19673(int i) {
        C0103 c0103;
        boolean z = this.f24542 != i;
        if (z) {
            this.f24557 = null;
            C14444 c14444M19686 = m19686();
            if (c14444M19686 != null) {
                c14444M19686.m34837();
            }
        }
        this.f24542 = i;
        this.f24559 = 0.0f;
        if (z && (c0103 = this.f24545) != null) {
            c0103.m1121(i);
        }
        m19683();
        m19684();
        return z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m19702() {
        this.f24559 = 0.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m19679(float f) {
        this.f24530 = f;
        InterfaceC12741 interfaceC12741 = this.f24523;
        if (interfaceC12741 != null) {
            interfaceC12741.mo18820(m19672(f));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19692(float f) {
        m19679(Math.max(0.0f, Math.min(getHeight(), this.f24530 + f)));
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19710(float f, float f2) {
        super.performClick();
        if (m19671(this.f24542)) {
            if (this.f24552.m24545(f, f2, getWidth() / 2.0f, getHeight() / 2.0f)) {
                InterfaceC12741 interfaceC12741 = this.f24523;
                if (interfaceC12741 != null) {
                    interfaceC12741.mo18822(this.f24542);
                    return;
                }
                return;
            }
        }
        InterfaceC12741 interfaceC12742 = this.f24523;
        if (interfaceC12742 != null) {
            interfaceC12742.mo18819();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m19671(int i) {
        C0103 c0103 = this.f24545;
        return c0103 != null && i >= 0 && c0103.m1129(i);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f24515) {
            return false;
        }
        super.performClick();
        if (this.f24523 == null) {
            return true;
        }
        if (m19671(this.f24542)) {
            this.f24523.mo18822(this.f24542);
            return true;
        }
        this.f24523.mo18819();
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m19684() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.MT_Protector));
        if (this.f24545 == null) {
            str = "";
        } else {
            str = " " + (this.f24542 + 1) + "/" + this.f24545.m1122();
        }
        sb.append(str);
        setContentDescription(sb.toString());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        mo19691();
        Iterator it = this.f24544.iterator();
        while (it.hasNext()) {
            ((C19382) it.next()).f62466.m34835(i, i2);
        }
        m19682();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo19691();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f24558);
        mo19691();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24542 < 0 || this.f24515) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f24557 = null;
        }
        C22348 c22348 = this.f24517;
        boolean zM49577 = c22348.m49577();
        c22348.m49573(motionEvent);
        if (zM49577 != c22348.m49577()) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList<C19382> arrayList;
        float f;
        float f2;
        RunnableC20410 runnableC20410 = this.f24558;
        removeCallbacks(runnableC20410);
        if (this.f24515) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float fM19672 = 1.0f - m19672(this.f24530);
        int iRound = Math.round(Color.alpha(this.f24533) * fM19672);
        int iSave = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawColor((iRound << 24) | (this.f24533 & 16777215));
        float f3 = this.f24530;
        boolean z = f3 > 0.0f;
        float fM19703 = z ? m19703(f3) : 1.0f;
        long jMin = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            arrayList = this.f24544;
            int size = arrayList.size();
            f = this.f24526;
            if (i >= size) {
                break;
            }
            C19382 c19382 = (C19382) arrayList.get(i);
            int i2 = c19382.f62457;
            C14444 c14444 = c19382.f62466;
            int i3 = this.f24542;
            boolean z2 = i2 == i3;
            float width = ((getWidth() + f) * (i2 - i3)) + this.f24559;
            boolean zIntersect = (!z || z2) && width < ((float) getWidth()) && ((float) getWidth()) + width > 0.0f;
            float width2 = getWidth();
            RunnableC20410 runnableC20411 = runnableC20410;
            float height = getHeight();
            int i4 = iSave;
            RectF rectF = this.f24536;
            float f4 = fM19672;
            rectF.set(0.0f, 0.0f, width2, height);
            if (zIntersect && !z) {
                zIntersect = rectF.intersect(width, 0.0f, getWidth() + width, getHeight());
            }
            if (c19382.f62462 != null && c14444.m34827()) {
                Matrix matrix = this.f24528;
                matrix.reset();
                if (z) {
                    matrix.setTranslate(0.0f, this.f24530);
                    matrix.preScale(fM19703, fM19703, getWidth() * 0.5f, getHeight() * 0.5f);
                }
                matrix.preTranslate(c14444.m34828() + width, c14444.m34840());
                matrix.preRotate(c14444.m34838());
                matrix.preScale(c14444.m34839(), c14444.m34839());
                matrix.preConcat(c19382.f62467);
                RectF rectF2 = this.f24541;
                rectF2.setEmpty();
                if (zIntersect) {
                    Matrix matrix2 = this.f24553;
                    if (matrix.invert(matrix2)) {
                        matrix2.mapRect(rectF2, rectF);
                    }
                }
                ((C20565) c19382.f62462).m46408(rectF2, c14444.m34839() * fM19703, z2);
                if (zIntersect) {
                    int iSave2 = canvas.save();
                    if (!z) {
                        canvas.clipRect(width, 0.0f, getWidth() + width, getHeight());
                    }
                    canvas.concat(matrix);
                    ((C20565) c19382.f62462).m46407(canvas, this.f24560);
                    canvas.restoreToCount(iSave2);
                }
            } else {
                if (zIntersect && !m19671(c19382.f62457)) {
                    int iSave3 = canvas.save();
                    if (z) {
                        f2 = 0.0f;
                        canvas.translate(0.0f, this.f24530);
                        canvas.scale(fM19703, fM19703, getWidth() * 0.5f, getHeight() * 0.5f);
                    } else {
                        f2 = 0.0f;
                    }
                    canvas.translate(width, f2);
                    if (!z) {
                        canvas.clipRect(0, 0, getWidth(), getHeight());
                    }
                    Paint paint = this.f24551;
                    paint.setColor(-3355444);
                    if (c19382.f62460) {
                        canvas.drawText(getResources().getString(c19382.f62465), getWidth() / 2.0f, getHeight() / 2.0f, paint);
                    } else {
                        long j = (jUptimeMillis - c19382.f62458) - 200;
                        if (j < 0) {
                            jMin = Math.min(jMin, -j);
                        } else {
                            float width3 = getWidth() / 2.0f;
                            float height2 = getHeight() / 2.0f;
                            int iRound2 = Math.round(Math.min(1.0f, j / 120.0f) * 255.0f * f4);
                            Paint paint2 = this.f24514;
                            paint2.setAlpha(iRound2);
                            float f5 = this.f24539;
                            canvas.drawArc(width3 - f5, height2 - f5, width3 + f5, height2 + f5, (((j % 900) * 360.0f) / 900.0f) - 90.0f, 240.0f, false, paint2);
                            jMin = 0;
                        }
                        canvas.restoreToCount(iSave3);
                    }
                    canvas.restoreToCount(iSave3);
                }
                i++;
                fM19703 = fM19703;
                runnableC20410 = runnableC20411;
                iSave = i4;
                fM19672 = f4;
                jUptimeMillis = jUptimeMillis;
            }
            jUptimeMillis = jUptimeMillis;
            i = i;
            fM19703 = fM19703;
            i++;
            fM19703 = fM19703;
            runnableC20410 = runnableC20411;
            iSave = i4;
            fM19672 = f4;
            jUptimeMillis = jUptimeMillis;
        }
        float f6 = fM19703;
        RunnableC20410 runnableC20412 = runnableC20410;
        int i5 = iSave;
        for (C19382 c19383 : arrayList) {
            if (!this.f24517.m49577()) {
                int i6 = c19383.f62457;
                if (m19671(i6) && (!z || i6 == this.f24542)) {
                    float width4 = ((getWidth() + f) * (i6 - this.f24542)) + this.f24559;
                    if (width4 < getWidth() && getWidth() + width4 > 0.0f) {
                        int iSave4 = canvas.save();
                        if (z) {
                            canvas.translate(0.0f, this.f24530);
                            canvas.scale(f6, f6, getWidth() / 2.0f, getHeight() / 2.0f);
                        }
                        canvas.clipRect(width4, 0.0f, getWidth() + width4, getHeight());
                        this.f24552.m24544(canvas, (getWidth() / 2.0f) + width4, getHeight() / 2.0f);
                        canvas.restoreToCount(iSave4);
                    }
                }
            }
        }
        canvas.restoreToCount(i5);
        if (jMin != C17492.FOREVER_NS && isAttachedToWindow() && getWindowVisibility() == 0 && isShown()) {
            if (jMin == 0) {
                postOnAnimation(runnableC20412);
            } else {
                postDelayed(runnableC20412, jMin);
            }
        }
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo19706() {
        return this.f24512 != EnumC18676.NONE;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo19687() {
        return this.f24517.m49576();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float mo19690(RectF rectF) {
        float fM34838;
        float fMax;
        float f;
        float f2;
        C19382 c19382 = this.f24537;
        if (c19382 == null) {
            return 0.0f;
        }
        EnumC18676 enumC18676 = this.f24512;
        if (enumC18676 == EnumC18676.ZOOM && this.f24554) {
            f = this.f24531;
            f2 = this.f24519;
            fMax = this.f24522;
            fM34838 = this.f24516;
        } else {
            if (enumC18676 != EnumC18676.FLING) {
                return 0.0f;
            }
            C14444 c14444 = c19382.f62466;
            float fM34839 = c14444.m34839();
            fM34838 = c14444.m34838();
            float fM34836 = c14444.m34836();
            float fM34816 = c14444.m34816();
            OverScroller overScroller = this.f24529;
            float fMax2 = Math.max(fM34836, Math.min(fM34816, overScroller.getFinalX()));
            fMax = Math.max(c14444.m34843(), Math.min(c14444.m34826(), overScroller.getFinalY()));
            f = fM34839;
            f2 = fMax2;
        }
        Matrix matrix = this.f24524;
        matrix.setTranslate(f2, fMax);
        matrix.preRotate(fM34838);
        matrix.preScale(f, f);
        matrix.preConcat(this.f24537.f62467);
        Matrix matrix2 = this.f24553;
        if (!matrix.invert(matrix2)) {
            return 0.0f;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        matrix2.mapRect(rectF);
        return f;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m19714() {
        this.f24512 = EnumC18676.NONE;
        this.f24537 = null;
        this.f24529.forceFinished(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m19701(int i) {
        if (!m19688(i)) {
            i = 0;
        }
        if (i != 0) {
            this.f24557 = null;
        }
        this.f24543 = this.f24542 + i;
        m19677(EnumC18676.PAGE, (getWidth() + this.f24526) * (-i), 0.0f, 280);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19711(boolean z) {
        m19677(z ? EnumC18676.DISMISS : EnumC18676.RESTORE, 0.0f, z ? getHeight() : 0.0f, 220);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19697(boolean z) {
        m19677(z ? EnumC18676.TO_SCALE : EnumC18676.RESTORE, 0.0f, 0.0f, z ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 220);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19704(float f, float f2) {
        C14444 c14444M19686 = m19686();
        if (c14444M19686 == null || !c14444M19686.m34827()) {
            return;
        }
        float fM34839 = c14444M19686.m34839();
        float fM34828 = c14444M19686.m34828();
        float fM34840 = c14444M19686.m34840();
        float fM34844 = c14444M19686.m34844();
        if (fM34844 != c14444M19686.m34825()) {
            c14444M19686.m34818(fM34844, f, f2, f, f2);
        } else {
            c14444M19686.m34842();
        }
        float fM348310 = c14444M19686.m34839();
        float fM34829 = c14444M19686.m34828();
        float fM34841 = c14444M19686.m34840();
        c14444M19686.m34821(fM34839, fM34828, fM34840, false);
        m19677(EnumC18676.ZOOM, 0.0f, 0.0f, 300);
        this.f24531 = fM348310;
        this.f24519 = fM34829;
        this.f24522 = fM34841;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19693(float f, float f2) {
        C14444 c14444M19686 = m19686();
        if (c14444M19686 == null || !c14444M19686.m34827()) {
            m19697(false);
            return;
        }
        if (c14444M19686.m34838() != c14444M19686.m34815()) {
            m19697(false);
            return;
        }
        float fM34839 = c14444M19686.m34839();
        float fM34828 = c14444M19686.m34828();
        float fM34840 = c14444M19686.m34840();
        c14444M19686.m34834();
        boolean z = Math.abs(fM34839 - c14444M19686.m34839()) > 1.0E-4f;
        float fM34829 = c14444M19686.m34828();
        float fM34841 = c14444M19686.m34840();
        c14444M19686.m34821(fM34839, fM34828, fM34840, false);
        if (z) {
            m19697(false);
            return;
        }
        m19714();
        float f3 = fM34828 - fM34829;
        this.f24540 = f3;
        this.f24535 = fM34840 - fM34841;
        float f4 = 0.0f;
        float f5 = (Math.abs(f3) > 0.1f || c14444M19686.m34836() == c14444M19686.m34816()) ? 0.0f : f;
        if (Math.abs(this.f24535) <= 0.1f && c14444M19686.m34843() != c14444M19686.m34826()) {
            f4 = f2;
        }
        this.f24512 = EnumC18676.FLING;
        this.f24549 = SystemClock.uptimeMillis();
        this.f24518.m21303(Math.round(fM34829), f5, this.f24549);
        this.f24521.m21303(Math.round(fM34841), f4, this.f24549);
        this.f24537 = m19685(this.f24542);
        this.f24517.m49571();
        this.f24529.fling(Math.round(fM34829), Math.round(fM34841), Math.round(f5), Math.round(f4), Math.round(c14444M19686.m34836()), Math.round(c14444M19686.m34816()), Math.round(c14444M19686.m34843()), Math.round(c14444M19686.m34826()), m19676(f5, getWidth()), m19676(f4, getHeight()));
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m19676(float f, int i) {
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(Math.min(getResources().getDisplayMetrics().density * 24.0f, i * 0.04f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19677(EnumC18676 enumC18676, float f, float f2, int i) {
        m19714();
        this.f24512 = enumC18676;
        C19382 c19382M19685 = m19685(this.f24542);
        this.f24537 = c19382M19685;
        this.f24554 = c19382M19685 != null && c19382M19685.f62466.m34827();
        this.f24549 = SystemClock.uptimeMillis();
        this.f24547 = i;
        this.f24546 = this.f24559;
        this.f24561 = f;
        this.f24556 = this.f24530;
        this.f24534 = f2;
        if (this.f24554) {
            C14444 c14444 = this.f24537.f62466;
            this.f24513 = c14444.m34839();
            this.f24548 = c14444.m34828();
            this.f24538 = c14444.m34840();
            float fM34838 = c14444.m34838();
            this.f24555 = fM34838;
            float fM34815 = (enumC18676 == EnumC18676.TO_SCALE || enumC18676 == EnumC18676.ZOOM) ? fM34838 : c14444.m34815();
            this.f24516 = fM34815;
            c14444.m34819(this.f24513, fM34815, getWidth() * 0.5f, getHeight() * 0.5f, getWidth() * 0.5f, getHeight() * 0.5f, true);
            this.f24531 = c14444.m34839();
            this.f24519 = c14444.m34828();
            this.f24522 = c14444.m34840();
            float f3 = this.f24555;
            if (f3 != this.f24516) {
                double radians = Math.toRadians(f3);
                double radians2 = Math.toRadians(this.f24516);
                this.f24532 = this.f24548 + m19675(c14444, this.f24513, radians);
                this.f24527 = this.f24538 + m19681(c14444, this.f24513, radians);
                this.f24550 = this.f24519 + m19675(c14444, this.f24531, radians2);
                this.f24525 = this.f24522 + m19681(c14444, this.f24531, radians2);
            }
            c14444.m34820(this.f24513, this.f24555, this.f24548, this.f24538, false);
        }
        this.f24517.m49571();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f;
        float f2;
        InterfaceC12741 interfaceC12741;
        C19382 c19382;
        EnumC18676 enumC18676 = this.f24512;
        EnumC18676 enumC18677 = EnumC18676.NONE;
        if (enumC18676 == enumC18677) {
            return;
        }
        if (this.f24537 != m19685(this.f24542)) {
            mo19691();
            return;
        }
        EnumC18676 enumC18678 = this.f24512;
        EnumC18676 enumC18679 = EnumC18676.FLING;
        C22348 c22348 = this.f24517;
        if (enumC18678 == enumC18679) {
            OverScroller overScroller = this.f24529;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            float fMax = (this.f24540 == 0.0f && this.f24535 == 0.0f) ? 0.0f : Math.max(0.0f, 1.0f - ((SystemClock.uptimeMillis() - this.f24549) / 220.0f));
            C19382 c19383 = this.f24537;
            if (c19383 != null) {
                C14444 c14444 = c19383.f62466;
                long jUptimeMillis = SystemClock.uptimeMillis();
                float f3 = getResources().getDisplayMetrics().density;
                float f4 = fMax * fMax * fMax;
                c14444.m34821(c14444.m34839(), (this.f24540 * f4) + this.f24518.m21302(overScroller.getCurrX(), overScroller.getFinalX(), c14444.m34836(), c14444.m34816(), f3, jUptimeMillis), (this.f24535 * f4) + this.f24521.m21302(overScroller.getCurrY(), overScroller.getFinalY(), c14444.m34843(), c14444.m34826(), f3, jUptimeMillis), !zComputeScrollOffset && fMax == 0.0f);
            }
            if (zComputeScrollOffset || fMax > 0.0f) {
                postInvalidateOnAnimation();
                return;
            }
            this.f24512 = enumC18677;
            this.f24537 = null;
            c22348.m49574(false);
            return;
        }
        float fMin = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f24549) / this.f24547);
        float f5 = 1.0f - fMin;
        EnumC18676 enumC186710 = this.f24512;
        if (enumC186710 == EnumC18676.ZOOM) {
            f = (3.0f - (2.0f * fMin)) * fMin * fMin;
        } else {
            f = enumC186710 == EnumC18676.PAGE ? 1.0f - (f5 * f5) : 1.0f - ((f5 * f5) * f5);
        }
        this.f24559 = m19674(this.f24546, this.f24561, f);
        m19679(m19674(this.f24556, this.f24534, f));
        if (this.f24554 && (c19382 = this.f24537) != null && c19382.f62466.m34827()) {
            C14444 c14445 = this.f24537.f62466;
            float fM19674 = m19674(this.f24513, this.f24531, f);
            float f6 = this.f24555;
            float f7 = this.f24516;
            if (f6 != f7) {
                float fM19675 = m19674(f6, f7, f);
                double radians = Math.toRadians(fM19675);
                f2 = 1.0f;
                c14445.m34820(fM19674, fM19675, m19674(this.f24532, this.f24550, f) - m19675(c14445, fM19674, radians), m19674(this.f24527, this.f24525, f) - m19681(c14445, fM19674, radians), false);
            } else {
                f2 = 1.0f;
                c14445.m34821(fM19674, m19674(this.f24548, this.f24519, f), m19674(this.f24538, this.f24522, f), false);
            }
        } else {
            f2 = 1.0f;
        }
        invalidate();
        if (fMin < f2) {
            postInvalidateOnAnimation();
            return;
        }
        EnumC18676 enumC186711 = this.f24512;
        this.f24512 = enumC18677;
        this.f24537 = null;
        if (enumC186711 == EnumC18676.PAGE) {
            boolean zM19673 = m19673(this.f24543);
            c22348.m49574(false);
            if (!zM19673 || (interfaceC12741 = this.f24523) == null) {
                return;
            }
            interfaceC12741.mo18821(this.f24542);
            return;
        }
        c22348.m49574(enumC186711 == EnumC18676.TO_SCALE);
        if (enumC186711 == EnumC18676.DISMISS) {
            this.f24515 = true;
            InterfaceC12741 interfaceC12742 = this.f24523;
            if (interfaceC12742 != null) {
                interfaceC12742.onDismiss();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m19674(float f, float f2, float f3) {
        return C0280.m1792(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m19675(C14444 c14444, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c14444.m34832())) - (Math.sin(d) * ((double) c14444.m34814()))) * ((double) f) * 0.5d);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static float m19681(C14444 c14444, float f, double d) {
        return (float) (((Math.cos(d) * ((double) c14444.m34814())) + (Math.sin(d) * ((double) c14444.m34832()))) * ((double) f) * 0.5d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(m19688(1) || m19688(-1));
        if (m19671(this.f24542)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (m19688(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (m19688(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2 = 0;
        if (this.f24515) {
            return false;
        }
        if (i == 4096) {
            i2 = 1;
        } else if (i == 8192) {
            i2 = -1;
        }
        if (i2 != 0 && m19688(i2)) {
            mo19691();
            m19701(i2);
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
        if (i2 != 0 && m19688(i2)) {
            mo19691();
            m19701(i2);
            return true;
        }
        if (i == 81 || i == 70 || i == 69) {
            mo19691();
            m19704(getWidth() / 2.0f, getHeight() / 2.0f);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
