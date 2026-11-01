package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.۬۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes3.dex */
public class C13108 extends View {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43649 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4916 f43650;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43651;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f43652;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C4916 f43653;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f43654;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public PointF f43655;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f43656;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f43657;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f43658;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final RectF f43659;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f43660;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public OverScroller f43661;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final float f43662;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10614 f43663;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C11697 f43664;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C13484 f43665;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f43666;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f43667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f43668;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f43669;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f43670;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f43671;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43672;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EdgeEffect f43673;

    public C13108(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C13108(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43671 = 0.5f;
        this.f43655 = new PointF();
        this.f43659 = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f43662 = C11116.f37735 * 48.0f;
        C4916 c4916 = new C4916(0);
        this.f43653 = c4916;
        c4916.setTextAlign(Paint.Align.LEFT);
        c4916.setTypeface(Typeface.DEFAULT);
        float f = C11116.f37734 * 18.0f;
        c4916.setTextSize(f);
        C4916 c4917 = new C4916(0);
        this.f43650 = c4917;
        c4917.setTextAlign(Paint.Align.CENTER);
        c4917.setTextSize(f);
        this.f43666 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f43669 = new EdgeEffect(context);
        this.f43673 = new EdgeEffect(context);
        this.f43658 = new EdgeEffect(context);
        this.f43668 = new EdgeEffect(context);
        OverScroller overScroller = new OverScroller(context);
        this.f43661 = overScroller;
        overScroller.forceFinished(true);
        this.f43663 = new C10614(context, new C22280(this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32419(int i) {
        C11697 c11697 = this.f43664;
        if (c11697 != null) {
            c11697.f39324 = ((C3353) c11697.f39321.get(i)).f12423;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32411(int i) {
        C11697 c11697 = this.f43664;
        if (c11697 != null) {
            return ((C3353) c11697.f39321.get(i)).m9996();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32415(C13484 c13484) {
        this.f43665 = c13484;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11697 c11697 = this.f43664;
        if (c11697 != null) {
            Iterator it = c11697.f39321.iterator();
            while (it.hasNext()) {
                ((C3353) it.next()).m9997();
            }
            c11697.f39320 = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C11697 c11697 = this.f43664;
        C10614 c10614 = this.f43663;
        if (c11697 == null) {
            c10614.m26793(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                m32401();
                return true;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            int iM32390 = 0;
            if (actionMasked2 == 0) {
                OverScroller overScroller = this.f43661;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
                this.f43657 = 0;
                this.f43672 = false;
            } else if (actionMasked2 == 1) {
                m32401();
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                    m32401();
                } else if (actionMasked2 == 5) {
                    this.f43657++;
                    if (!this.f43672) {
                        this.f43654 = m32393(motionEvent);
                        this.f43656 = this.f43671;
                        this.f43672 = true;
                        this.f43651 = false;
                        this.f43667 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f43670 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked2 == 6) {
                    this.f43657--;
                    return true;
                }
            } else if (this.f43657 == 1 && this.f43672) {
                float fM32393 = m32393(motionEvent);
                if (!this.f43651) {
                    if (Math.abs(fM32393 - this.f43654) > this.f43666) {
                        this.f43651 = true;
                        c10614.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                }
                float scrollX = this.f43667 + getScrollX();
                float scrollY = this.f43670 + getScrollY();
                PointF pointF = this.f43655;
                pointF.set(scrollX, scrollY);
                float f = pointF.x;
                float f2 = this.f43671;
                float f3 = this.f43662;
                pointF.x = (f / f2) - f3;
                pointF.y = (pointF.y / f2) - f3;
                float f4 = (this.f43656 * fM32393) / this.f43654;
                this.f43671 = f4;
                if (f4 > 1.0f) {
                    this.f43671 = 1.0f;
                } else if (f4 < 0.05f) {
                    this.f43671 = 0.05f;
                }
                m32397(pointF);
                int i = (int) (pointF.x - this.f43667);
                if (i < 0) {
                    i = 0;
                } else {
                    int iM32403 = m32403();
                    if (i > iM32403) {
                        i = iM32403;
                    }
                }
                int i2 = (int) (pointF.y - this.f43670);
                if (i2 >= 0 && i2 <= (iM32390 = m32390())) {
                    iM32390 = i2;
                }
                scrollTo(i, iM32390);
                invalidate();
                return true;
            }
            if (!this.f43672) {
                c10614.m26793(motionEvent);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m32401() {
        EdgeEffect edgeEffect = this.f43669;
        edgeEffect.onRelease();
        boolean zIsFinished = edgeEffect.isFinished();
        EdgeEffect edgeEffect2 = this.f43673;
        edgeEffect2.onRelease();
        boolean zIsFinished2 = zIsFinished | edgeEffect2.isFinished();
        EdgeEffect edgeEffect3 = this.f43658;
        edgeEffect3.onRelease();
        boolean zIsFinished3 = zIsFinished2 | edgeEffect3.isFinished();
        EdgeEffect edgeEffect4 = this.f43668;
        edgeEffect4.onRelease();
        if (zIsFinished3 || edgeEffect4.isFinished()) {
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m32393(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32414(C11697 c11697) {
        this.f43664 = c11697;
        if (c11697 == null) {
            this.f43652 = 0;
            this.f43660 = 0;
            scrollTo(0, 0);
        } else {
            this.f43660 = c11697.f39319;
            this.f43652 = c11697.f39322;
            m32417(m32410(), false, false);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32413(C11018 c11018) {
        c11018.writeInt(getScrollX());
        c11018.writeInt(getScrollY());
        c11018.m27778(this.f43671);
        if (this.f43664 == null) {
            c11018.writeByte(0);
            return;
        }
        c11018.m27784(true);
        C11697 c11697 = this.f43664;
        LinkedHashSet<C23816> linkedHashSet = c11697.f39323;
        c11018.writeInt(1986488099);
        c11018.writeInt(c11697.f39319);
        c11018.writeInt(c11697.f39322);
        c11018.writeInt(c11697.f39324);
        ArrayList arrayList = c11697.f39321;
        c11018.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3353) it.next()).m10002(c11018);
        }
        c11018.writeInt(linkedHashSet.size());
        for (C23816 c23816 : linkedHashSet) {
            c11018.writeInt(c23816.f77017.f12423);
            c11018.writeInt(c23816.f77011.f12423);
            c11018.writeInt(c23816.f77013);
            if (c23816.f77015 != null && c23816.f77009 != null) {
                c11018.writeByte(1);
                c11018.m27786(c23816.f77015);
                c11018.m27786(c23816.f77009);
            } else {
                c11018.writeByte(0);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32416(C17367 c17367) {
        final int i = c17367.readInt();
        final int i2 = c17367.readInt();
        this.f43671 = c17367.m40450();
        if (c17367.m40461()) {
            C11697 c11697 = new C11697(c17367);
            this.f43664 = c11697;
            this.f43660 = c11697.f39319;
            this.f43652 = c11697.f39322;
        } else {
            this.f43664 = null;
        }
        post(new Runnable() { // from class: l.ۖ۫ۚ
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = C13108.f43649;
                C13108 c13108 = this.f10025;
                c13108.scrollTo(i, i2);
                c13108.invalidate();
            }
        });
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f43661;
        if (overScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            if (currY != scrollY) {
                if (scrollY > 0 && currY <= 0) {
                    this.f43673.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM32390 = m32390();
                    if (scrollY < iM32390 && currY >= iM32390) {
                        this.f43668.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            if (currX != scrollX) {
                if (scrollX > 0 && currX <= 0) {
                    this.f43669.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM32403 = m32403();
                    if (scrollX < iM32403 && currX >= iM32403) {
                        this.f43658.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            scrollTo(currX, currY);
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int m32403() {
        return (int) Math.max(0.0f, ((((this.f43662 * 2.0f) + this.f43660) * this.f43671) - getWidth()) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int m32390() {
        return (int) Math.max(0.0f, ((((this.f43662 * 2.0f) + this.f43652) * this.f43671) - getHeight()) + 0.5f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m32394(C13108 c13108, int i) {
        if (i < 0) {
            return 0;
        }
        int iM32403 = c13108.m32403();
        return i > iM32403 ? iM32403 : i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m32406(C13108 c13108, int i) {
        if (i < 0) {
            return 0;
        }
        int iM32390 = c13108.m32390();
        return i > iM32390 ? iM32390 : i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = C11116.f37735;
        canvas.drawColor(C20368.m45983(-15527149, -460552));
        C11697 c11697 = this.f43664;
        if (c11697 != null) {
            LinkedHashSet<C23816> linkedHashSet = c11697.f39323;
            float scrollX = getScrollX();
            RectF rectF = this.f43659;
            rectF.left = scrollX;
            rectF.top = getScrollY();
            rectF.right = rectF.left + getWidth();
            float height = rectF.top + getHeight();
            float f2 = this.f43671;
            float f3 = rectF.left / f2;
            float f4 = this.f43662;
            rectF.left = f3 - f4;
            rectF.top = (rectF.top / f2) - f4;
            rectF.right = (rectF.right / f2) - f4;
            rectF.bottom = (height / f2) - f4;
            int iSave = canvas.save();
            float f5 = f4 * f2;
            canvas.translate(f5, f5);
            int i = c11697.f39324;
            C4916 c4916 = this.f43653;
            if (i != -1) {
                for (C23816 c23816 : linkedHashSet) {
                    int i2 = c23816.f77012.f39324;
                    if (i2 != c23816.f77017.f12423 && i2 != c23816.f77011.f12423) {
                        c23816.m52495(canvas, c4916, rectF, f2);
                    }
                }
                for (C23816 c23817 : linkedHashSet) {
                    int i3 = c23817.f77012.f39324;
                    if (i3 == c23817.f77017.f12423 || i3 == c23817.f77011.f12423) {
                        c23817.m52495(canvas, c4916, rectF, f2);
                    }
                }
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((C23816) it.next()).m52495(canvas, c4916, rectF, f2);
                }
            }
            int iM45983 = C20368.m45983(-7829368, -5197648);
            C4916 c4917 = this.f43650;
            c4917.setColor(iM45983);
            Iterator it2 = c11697.f39321.iterator();
            while (it2.hasNext()) {
                ((C3353) it2.next()).m10000(canvas, c4916, c4917, rectF, f2);
            }
            canvas.restoreToCount(iSave);
            m32396(canvas);
            return;
        }
        m32396(canvas);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32396(Canvas canvas) {
        boolean zDraw;
        EdgeEffect edgeEffect = this.f43669;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) - getScrollY(), 0.0f);
            edgeEffect.setSize(getHeight(), getWidth());
            zDraw = edgeEffect.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f43673;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int iSave2 = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            edgeEffect2.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        float f = this.f43662;
        EdgeEffect edgeEffect3 = this.f43658;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            canvas.rotate(90.0f);
            canvas.translate(getScrollY(), -Math.max(((f * 2.0f) + this.f43660) * this.f43671, getWidth()));
            edgeEffect3.setSize(getHeight(), width);
            zDraw |= edgeEffect3.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect4 = this.f43668;
        if (edgeEffect4 != null && !edgeEffect4.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate((-getWidth()) - getScrollX(), -Math.max(((f * 2.0f) + this.f43652) * this.f43671, getHeight()));
            edgeEffect4.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave4);
        }
        if (zDraw) {
            int i = C5031.f17539;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32410() {
        C11697 c11697 = this.f43664;
        if (c11697 == null) {
            return 0;
        }
        return ((C3353) c11697.f39321.get(0)).m9996();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m32418() {
        C3353 c3353;
        C11697 c11697 = this.f43664;
        if (c11697 == null) {
            return 0;
        }
        ArrayList arrayList = c11697.f39321;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
            c3353 = (C3353) arrayList.get(size);
        } while (c3353.f12405.isEmpty());
        return c3353.m10006().f47888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32417(int i, boolean z, boolean z2) {
        C11697 c11697 = this.f43664;
        int iM32390 = 0;
        if (c11697 != null) {
            for (C3353 c3353 : c11697.f39321) {
                if (!c3353.f12405.isEmpty() && i <= c3353.m10006().f47888) {
                    float fM10008 = c3353.m10008();
                    float fM9995 = c3353.m9995();
                    float fM10004 = c3353.m10004();
                    float fM9998 = c3353.m9998();
                    float f = this.f43662 / 2.0f;
                    float width = getWidth() / this.f43671;
                    float height = getHeight() / this.f43671;
                    PointF pointF = new PointF();
                    if (fM10004 + f + f < width) {
                        pointF.x = fM10008 - ((width - fM10004) / 2.0f);
                    } else {
                        pointF.x = fM10008 - f;
                    }
                    if (!z2 && fM9998 + f + f < height) {
                        pointF.y = fM9995 - ((height - fM9998) / 2.0f);
                    } else {
                        pointF.y = fM9995 - f;
                    }
                    if (z2) {
                        Paint paint = new Paint(1);
                        paint.setTypeface(Typeface.DEFAULT);
                        paint.setTextSize(C11116.f37734 * 18.0f);
                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                        float f2 = fontMetrics.descent - fontMetrics.ascent;
                        Iterator it = c3353.f12405.iterator();
                        while (it.hasNext() && ((C14644) it.next()).f47888 != i) {
                            pointF.y += f2;
                        }
                    }
                    m32397(pointF);
                    int i2 = (int) pointF.x;
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int iM32403 = m32403();
                        if (i2 > iM32403) {
                            i2 = iM32403;
                        }
                    }
                    int i3 = (int) pointF.y;
                    if (i3 >= 0 && i3 <= (iM32390 = m32390())) {
                        iM32390 = i3;
                    }
                    scrollTo(i2, iM32390);
                    if (z) {
                        c11697.f39324 = c3353.f12423;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM32403;
        if (z) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iM32390 = 0;
            if (scrollX < 0) {
                iM32403 = 0;
            } else {
                iM32403 = m32403();
                if (scrollX <= iM32403) {
                    iM32403 = scrollX;
                }
            }
            if (scrollY >= 0 && scrollY <= (iM32390 = m32390())) {
                iM32390 = scrollY;
            }
            if (scrollX == iM32403 && scrollY == iM32390) {
                return;
            }
            scrollTo(iM32403, iM32390);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32408(C13108 c13108, PointF pointF) {
        float f = pointF.x;
        float f2 = c13108.f43671;
        float f3 = c13108.f43662;
        pointF.x = (f / f2) - f3;
        pointF.y = (pointF.y / f2) - f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m32397(PointF pointF) {
        float f = pointF.x;
        float f2 = this.f43662;
        float f3 = this.f43671;
        pointF.x = (f + f2) * f3;
        pointF.y = (pointF.y + f2) * f3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32412(OutputStream outputStream) {
        float f;
        C4916 c4916;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i = this.f43660;
        int i2 = this.f43652;
        int i3 = (int) (((((((long) i) * ((long) i2)) * 2) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / 2);
        if (i3 <= 250) {
            f = 0.5f;
        } else {
            f = i3 <= 500 ? 0.4f : 0.3f;
        }
        float f2 = this.f43662;
        float f3 = 2.0f * f2;
        C11697 c11697 = this.f43664;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (((i + f3) * f) + 0.5f), (int) (((f3 + i2) * f) + 0.5f), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f4 = C11116.f37735;
        canvas.drawColor(C20368.m45983(-15527149, -460552));
        if (c11697 != null) {
            float f5 = f2 * f;
            canvas.translate(f5, f5);
            float f6 = this.f43660;
            float f7 = this.f43652;
            RectF rectF = this.f43659;
            rectF.set(0.0f, 0.0f, f6, f7);
            Iterator it = c11697.f39323.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c4916 = this.f43653;
                if (!zHasNext) {
                    break;
                } else {
                    ((C23816) it.next()).m52495(canvas, c4916, rectF, f);
                }
            }
            int iM45983 = C20368.m45983(-7829368, -5197648);
            C4916 c4917 = this.f43650;
            c4917.setColor(iM45983);
            Iterator it2 = c11697.f39321.iterator();
            while (it2.hasNext()) {
                ((C3353) it2.next()).m10000(canvas, c4916, c4917, rectF, f);
            }
        }
        bitmapCreateBitmap.compress(compressFormat, 80, outputStream);
        bitmapCreateBitmap.recycle();
    }
}
