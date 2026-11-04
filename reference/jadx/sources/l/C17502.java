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

/* JADX INFO: renamed from: l.ܽۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes4.dex */
public class C17502 extends View {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56861 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EdgeEffect f56862;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public OverScroller f56863;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public PointF f56864;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f56865;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f56866;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C5570 f56867;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f56868;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C24179 f56869;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f56870;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f56871;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f56872;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final float f56873;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final RectF f56874;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56875;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f56876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f56877;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f56878;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10232 f56879;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f56880;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f56881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f56882;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C1505 f56883;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C10232 f56884;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56885;

    public C17502(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17502(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56878 = 0.5f;
        this.f56864 = new PointF();
        this.f56874 = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f56873 = C14035.f44475 * 48.0f;
        C10232 c10232 = new C10232(0);
        this.f56884 = c10232;
        c10232.setTextAlign(Paint.Align.LEFT);
        c10232.setTypeface(Typeface.DEFAULT);
        float f = C14035.f44479 * 18.0f;
        c10232.setTextSize(f);
        C10232 c10233 = new C10232(0);
        this.f56879 = c10233;
        c10233.setTextAlign(Paint.Align.CENTER);
        c10233.setTextSize(f);
        this.f56865 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f56880 = new EdgeEffect(context);
        this.f56871 = new EdgeEffect(context);
        this.f56872 = new EdgeEffect(context);
        this.f56862 = new EdgeEffect(context);
        OverScroller overScroller = new OverScroller(context);
        this.f56863 = overScroller;
        overScroller.forceFinished(true);
        this.f56869 = new C24179(context, new C24962(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41045(int i) {
        C5570 c5570 = this.f56867;
        if (c5570 != null) {
            c5570.f19353 = ((C19740) c5570.f19354.get(i)).f63550;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41037(int i) {
        C5570 c5570 = this.f56867;
        if (c5570 != null) {
            return ((C19740) c5570.f19354.get(i)).m45504();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41039(C1505 c1505) {
        this.f56883 = c1505;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5570 c5570 = this.f56867;
        if (c5570 != null) {
            Iterator it = c5570.f19354.iterator();
            while (it.hasNext()) {
                ((C19740) it.next()).m45491();
            }
            c5570.f19351 = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5570 c5570 = this.f56867;
        C24179 c24179 = this.f56869;
        if (c5570 == null) {
            c24179.m54155(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                m41030();
                return true;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            int iM41034 = 0;
            if (actionMasked2 == 0) {
                OverScroller overScroller = this.f56863;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
                this.f56881 = 0;
                this.f56885 = false;
            } else if (actionMasked2 == 1) {
                m41030();
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                    m41030();
                } else if (actionMasked2 == 5) {
                    this.f56881++;
                    if (!this.f56885) {
                        this.f56876 = m41016(motionEvent);
                        this.f56866 = this.f56878;
                        this.f56885 = true;
                        this.f56875 = false;
                        this.f56877 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f56882 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked2 == 6) {
                    this.f56881--;
                    return true;
                }
            } else if (this.f56881 == 1 && this.f56885) {
                float fM41016 = m41016(motionEvent);
                if (!this.f56875) {
                    if (Math.abs(fM41016 - this.f56876) > this.f56865) {
                        this.f56875 = true;
                        c24179.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                }
                float scrollX = this.f56877 + getScrollX();
                float scrollY = this.f56882 + getScrollY();
                PointF pointF = this.f56864;
                pointF.set(scrollX, scrollY);
                float f = pointF.x;
                float f2 = this.f56878;
                float f3 = this.f56873;
                pointF.x = (f / f2) - f3;
                pointF.y = (pointF.y / f2) - f3;
                float f4 = (this.f56866 * fM41016) / this.f56876;
                this.f56878 = f4;
                if (f4 > 1.0f) {
                    this.f56878 = 1.0f;
                } else if (f4 < 0.05f) {
                    this.f56878 = 0.05f;
                }
                m41020(pointF);
                int i = (int) (pointF.x - this.f56877);
                if (i < 0) {
                    i = 0;
                } else {
                    int iM41024 = m41024();
                    if (i > iM41024) {
                        i = iM41024;
                    }
                }
                int i2 = (int) (pointF.y - this.f56882);
                if (i2 >= 0 && i2 <= (iM41034 = m41034())) {
                    iM41034 = i2;
                }
                scrollTo(i, iM41034);
                invalidate();
                return true;
            }
            if (!this.f56885) {
                c24179.m54155(motionEvent);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m41030() {
        EdgeEffect edgeEffect = this.f56880;
        edgeEffect.onRelease();
        boolean zIsFinished = edgeEffect.isFinished();
        EdgeEffect edgeEffect2 = this.f56871;
        edgeEffect2.onRelease();
        boolean zIsFinished2 = zIsFinished | edgeEffect2.isFinished();
        EdgeEffect edgeEffect3 = this.f56872;
        edgeEffect3.onRelease();
        boolean zIsFinished3 = zIsFinished2 | edgeEffect3.isFinished();
        EdgeEffect edgeEffect4 = this.f56862;
        edgeEffect4.onRelease();
        if (zIsFinished3 || edgeEffect4.isFinished()) {
            int i = C22666.f73603;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m41016(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41040(C5570 c5570) {
        this.f56867 = c5570;
        if (c5570 == null) {
            this.f56870 = 0;
            this.f56868 = 0;
            scrollTo(0, 0);
        } else {
            this.f56868 = c5570.f19356;
            this.f56870 = c5570.f19352;
            m41043(m41036(), false, false);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41041(C6178 c6178) {
        c6178.writeInt(getScrollX());
        c6178.writeInt(getScrollY());
        c6178.m17781(this.f56878);
        if (this.f56867 == null) {
            c6178.writeByte(0);
            return;
        }
        c6178.m17789(true);
        C5570 c5570 = this.f56867;
        LinkedHashSet<C4824> linkedHashSet = c5570.f19355;
        c6178.writeInt(1986488099);
        c6178.writeInt(c5570.f19356);
        c6178.writeInt(c5570.f19352);
        c6178.writeInt(c5570.f19353);
        ArrayList arrayList = c5570.f19354;
        c6178.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19740) it.next()).m45496(c6178);
        }
        c6178.writeInt(linkedHashSet.size());
        for (C4824 c4824 : linkedHashSet) {
            c6178.writeInt(c4824.f16876.f63550);
            c6178.writeInt(c4824.f16871.f63550);
            c6178.writeInt(c4824.f16874);
            if (c4824.f16872 != null && c4824.f16879 != null) {
                c6178.writeByte(1);
                c6178.m17800(c4824.f16872);
                c6178.m17800(c4824.f16879);
            } else {
                c6178.writeByte(0);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41042(C20348 c20348) {
        final int i = c20348.readInt();
        final int i2 = c20348.readInt();
        this.f56878 = c20348.m46747();
        if (c20348.m46753()) {
            C5570 c5570 = new C5570(c20348);
            this.f56867 = c5570;
            this.f56868 = c5570.f19356;
            this.f56870 = c5570.f19352;
        } else {
            this.f56867 = null;
        }
        post(new Runnable() { // from class: l.֫ۢᩴ
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = C17502.f56861;
                C17502 c17502 = this.f6223;
                c17502.scrollTo(i, i2);
                c17502.invalidate();
            }
        });
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f56863;
        if (overScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            if (currY != scrollY) {
                if (scrollY > 0 && currY <= 0) {
                    this.f56871.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM41034 = m41034();
                    if (scrollY < iM41034 && currY >= iM41034) {
                        this.f56862.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            if (currX != scrollX) {
                if (scrollX > 0 && currX <= 0) {
                    this.f56880.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM41024 = m41024();
                    if (scrollX < iM41024 && currX >= iM41024) {
                        this.f56872.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            scrollTo(currX, currY);
            int i = C22666.f73603;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m41024() {
        return (int) Math.max(0.0f, ((((this.f56873 * 2.0f) + this.f56868) * this.f56878) - getWidth()) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m41034() {
        return (int) Math.max(0.0f, ((((this.f56873 * 2.0f) + this.f56870) * this.f56878) - getHeight()) + 0.5f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41017(C17502 c17502, int i) {
        if (i < 0) {
            return 0;
        }
        int iM41024 = c17502.m41024();
        return i > iM41024 ? iM41024 : i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m41031(C17502 c17502, int i) {
        if (i < 0) {
            return 0;
        }
        int iM41034 = c17502.m41034();
        return i > iM41034 ? iM41034 : i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = C14035.f44475;
        canvas.drawColor(C3296.m10871(-15527149, -460552));
        C5570 c5570 = this.f56867;
        if (c5570 != null) {
            LinkedHashSet<C4824> linkedHashSet = c5570.f19355;
            float scrollX = getScrollX();
            RectF rectF = this.f56874;
            rectF.left = scrollX;
            rectF.top = getScrollY();
            rectF.right = rectF.left + getWidth();
            float height = rectF.top + getHeight();
            float f2 = this.f56878;
            float f3 = rectF.left / f2;
            float f4 = this.f56873;
            rectF.left = f3 - f4;
            rectF.top = (rectF.top / f2) - f4;
            rectF.right = (rectF.right / f2) - f4;
            rectF.bottom = (height / f2) - f4;
            int iSave = canvas.save();
            float f5 = f4 * f2;
            canvas.translate(f5, f5);
            int i = c5570.f19353;
            C10232 c10232 = this.f56884;
            if (i != -1) {
                for (C4824 c4824 : linkedHashSet) {
                    int i2 = c4824.f16877.f19353;
                    if (i2 != c4824.f16876.f63550 && i2 != c4824.f16871.f63550) {
                        c4824.m14858(canvas, c10232, rectF, f2);
                    }
                }
                for (C4824 c4825 : linkedHashSet) {
                    int i3 = c4825.f16877.f19353;
                    if (i3 == c4825.f16876.f63550 || i3 == c4825.f16871.f63550) {
                        c4825.m14858(canvas, c10232, rectF, f2);
                    }
                }
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((C4824) it.next()).m14858(canvas, c10232, rectF, f2);
                }
            }
            int iM10871 = C3296.m10871(-7829368, -5197648);
            C10232 c10233 = this.f56879;
            c10233.setColor(iM10871);
            Iterator it2 = c5570.f19354.iterator();
            while (it2.hasNext()) {
                ((C19740) it2.next()).m45494(canvas, c10232, c10233, rectF, f2);
            }
            canvas.restoreToCount(iSave);
            m41019(canvas);
            return;
        }
        m41019(canvas);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41019(Canvas canvas) {
        boolean zDraw;
        EdgeEffect edgeEffect = this.f56880;
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
        EdgeEffect edgeEffect2 = this.f56871;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int iSave2 = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            edgeEffect2.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        float f = this.f56873;
        EdgeEffect edgeEffect3 = this.f56872;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            canvas.rotate(90.0f);
            canvas.translate(getScrollY(), -Math.max(((f * 2.0f) + this.f56868) * this.f56878, getWidth()));
            edgeEffect3.setSize(getHeight(), width);
            zDraw |= edgeEffect3.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect4 = this.f56862;
        if (edgeEffect4 != null && !edgeEffect4.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate((-getWidth()) - getScrollX(), -Math.max(((f * 2.0f) + this.f56870) * this.f56878, getHeight()));
            edgeEffect4.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave4);
        }
        if (zDraw) {
            int i = C22666.f73603;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41036() {
        C5570 c5570 = this.f56867;
        if (c5570 == null) {
            return 0;
        }
        return ((C19740) c5570.f19354.get(0)).m45504();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41044() {
        C19740 c19740;
        C5570 c5570 = this.f56867;
        if (c5570 == null) {
            return 0;
        }
        ArrayList arrayList = c5570.f19354;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
            c19740 = (C19740) arrayList.get(size);
        } while (c19740.f63557.isEmpty());
        return c19740.m45498().f70921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41043(int i, boolean z, boolean z2) {
        C5570 c5570 = this.f56867;
        int iM41034 = 0;
        if (c5570 != null) {
            for (C19740 c19740 : c5570.f19354) {
                if (!c19740.f63557.isEmpty() && i <= c19740.m45498().f70921) {
                    float fM45501 = c19740.m45501();
                    float fM45500 = c19740.m45500();
                    float fM45502 = c19740.m45502();
                    float fM45492 = c19740.m45492();
                    float f = this.f56873 / 2.0f;
                    float width = getWidth() / this.f56878;
                    float height = getHeight() / this.f56878;
                    PointF pointF = new PointF();
                    if (fM45502 + f + f < width) {
                        pointF.x = fM45501 - ((width - fM45502) / 2.0f);
                    } else {
                        pointF.x = fM45501 - f;
                    }
                    if (!z2 && fM45492 + f + f < height) {
                        pointF.y = fM45500 - ((height - fM45492) / 2.0f);
                    } else {
                        pointF.y = fM45500 - f;
                    }
                    if (z2) {
                        Paint paint = new Paint(1);
                        paint.setTypeface(Typeface.DEFAULT);
                        paint.setTextSize(C14035.f44479 * 18.0f);
                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                        float f2 = fontMetrics.descent - fontMetrics.ascent;
                        Iterator it = c19740.f63557.iterator();
                        while (it.hasNext() && ((C21978) it.next()).f70921 != i) {
                            pointF.y += f2;
                        }
                    }
                    m41020(pointF);
                    int i2 = (int) pointF.x;
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int iM41024 = m41024();
                        if (i2 > iM41024) {
                            i2 = iM41024;
                        }
                    }
                    int i3 = (int) pointF.y;
                    if (i3 >= 0 && i3 <= (iM41034 = m41034())) {
                        iM41034 = i3;
                    }
                    scrollTo(i2, iM41034);
                    if (z) {
                        c5570.f19353 = c19740.f63550;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM41024;
        if (z) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iM41034 = 0;
            if (scrollX < 0) {
                iM41024 = 0;
            } else {
                iM41024 = m41024();
                if (scrollX <= iM41024) {
                    iM41024 = scrollX;
                }
            }
            if (scrollY >= 0 && scrollY <= (iM41034 = m41034())) {
                iM41034 = scrollY;
            }
            if (scrollX == iM41024 && scrollY == iM41034) {
                return;
            }
            scrollTo(iM41024, iM41034);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41033(C17502 c17502, PointF pointF) {
        float f = pointF.x;
        float f2 = c17502.f56878;
        float f3 = c17502.f56873;
        pointF.x = (f / f2) - f3;
        pointF.y = (pointF.y / f2) - f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m41020(PointF pointF) {
        float f = pointF.x;
        float f2 = this.f56873;
        float f3 = this.f56878;
        pointF.x = (f + f2) * f3;
        pointF.y = (pointF.y + f2) * f3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41038(OutputStream outputStream) {
        float f;
        C10232 c10232;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i = this.f56868;
        int i2 = this.f56870;
        int i3 = (int) (((((((long) i) * ((long) i2)) * 2) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / 2);
        if (i3 <= 250) {
            f = 0.5f;
        } else {
            f = i3 <= 500 ? 0.4f : 0.3f;
        }
        float f2 = this.f56873;
        float f3 = 2.0f * f2;
        C5570 c5570 = this.f56867;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (((i + f3) * f) + 0.5f), (int) (((f3 + i2) * f) + 0.5f), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f4 = C14035.f44475;
        canvas.drawColor(C3296.m10871(-15527149, -460552));
        if (c5570 != null) {
            float f5 = f2 * f;
            canvas.translate(f5, f5);
            float f6 = this.f56868;
            float f7 = this.f56870;
            RectF rectF = this.f56874;
            rectF.set(0.0f, 0.0f, f6, f7);
            Iterator it = c5570.f19355.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c10232 = this.f56884;
                if (!zHasNext) {
                    break;
                } else {
                    ((C4824) it.next()).m14858(canvas, c10232, rectF, f);
                }
            }
            int iM10871 = C3296.m10871(-7829368, -5197648);
            C10232 c10233 = this.f56879;
            c10233.setColor(iM10871);
            Iterator it2 = c5570.f19354.iterator();
            while (it2.hasNext()) {
                ((C19740) it2.next()).m45494(canvas, c10232, c10233, rectF, f);
            }
        }
        bitmapCreateBitmap.compress(compressFormat, 80, outputStream);
        bitmapCreateBitmap.recycle();
    }
}
