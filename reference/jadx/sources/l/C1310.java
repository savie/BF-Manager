package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FITB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1310 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f4712;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f4713;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15655 f4714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f4715;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f4716;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC11706 f4717;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19165 f4718;

    public C1310(ContextThemeWrapper contextThemeWrapper, C15655 c15655, RunnableC11706 runnableC11706) {
        super(contextThemeWrapper);
        this.f4712 = new Paint(1);
        this.f4716 = new int[2];
        this.f4715 = Collections.EMPTY_LIST;
        this.f4713 = -1;
        this.f4714 = c15655;
        this.f4717 = runnableC11706;
        int size = c15655.f50877.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            C20131 c20131 = (C20131) c15655.f50877.get(i);
            int i2 = c20131.f64696;
            Map map = c20131.f64695;
            iArr[i] = i2;
            strArr[i] = (String) map.get("bounds");
            zArr[i] = "true".equals(map.get("visible-to-user"));
        }
        this.f4718 = new C19165(iArr, strArr, zArr);
        setContentDescription(getResources().getString(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m4786() {
        return this.f4713;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4782() {
        return this.f4715.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m4784() {
        return this.f4715.indexOf(Integer.valueOf(this.f4713));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m4785() {
        return C4681.unmodifiableList(this.f4715);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4783(int i) {
        if (i < 0 || i >= this.f4714.f50877.size()) {
            i = -1;
        }
        this.f4713 = i;
        invalidate();
        this.f4717.run();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C19165 c19165;
        super.onDraw(canvas);
        getLocationOnScreen(this.f4716);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f4712;
        paint.setStyle(style);
        paint.setStrokeWidth(1 * getResources().getDisplayMetrics().density);
        paint.setColor(-2006398474);
        int i = 0;
        while (true) {
            c19165 = this.f4718;
            C7978[] c7978Arr = c19165.f62010;
            if (i >= c7978Arr.length) {
                break;
            }
            if (i != this.f4713 && c19165.f62013[i]) {
                m4781(canvas, c7978Arr[i]);
            }
            i++;
        }
        if (this.f4713 >= 0) {
            paint.setColor(-18341);
            paint.setStrokeWidth(2 * getResources().getDisplayMetrics().density);
            m4781(canvas, c19165.f62010[this.f4713]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4781(Canvas canvas, C7978 c7978) {
        int i;
        int i2;
        int i3;
        int i4;
        if (c7978 == null || (i = c7978.f26516) <= (i2 = c7978.f26517) || (i3 = c7978.f26515) <= (i4 = c7978.f26518)) {
            return;
        }
        int[] iArr = this.f4716;
        int i5 = iArr[0];
        float f = ((long) i2) - ((long) i5);
        int i6 = iArr[1];
        canvas.drawRect(f, ((long) i4) - ((long) i6), ((long) i) - ((long) i5), ((long) i3) - ((long) i6), this.f4712);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7978 c7978;
        int i;
        int i2;
        int i3;
        int i4;
        if (motionEvent.getActionMasked() == 1) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            final C19165 c19165 = this.f4718;
            c19165.getClass();
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (true) {
                C7978[] c7978Arr = c19165.f62010;
                if (i5 >= c7978Arr.length) {
                    break;
                }
                if (c19165.f62013[i5] && (c7978 = c7978Arr[i5]) != null && (i = c7978.f26517) < (i2 = c7978.f26516) && (i3 = c7978.f26518) < (i4 = c7978.f26515) && rawX >= i && rawX < i2 && rawY >= i3 && rawY < i4) {
                    arrayList.add(Integer.valueOf(i5));
                }
                i5++;
            }
            Collections.sort(arrayList, new Comparator() { // from class: l.֡ܶܳ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Integer num = (Integer) obj;
                    Integer num2 = (Integer) obj2;
                    C19165 c19166 = c19165;
                    C7978[] c7978Arr2 = c19166.f62010;
                    int[] iArr = c19166.f62012;
                    int iCompare = Integer.compare(iArr[num2.intValue()], iArr[num.intValue()]);
                    if (iCompare == 0) {
                        C7978 c7979 = c7978Arr2[num.intValue()];
                        double d = (((double) c7979.f26515) - ((double) c7979.f26518)) * (((double) c7979.f26516) - ((double) c7979.f26517));
                        C7978 c79710 = c7978Arr2[num2.intValue()];
                        iCompare = Double.compare(d, (((double) c79710.f26515) - ((double) c79710.f26518)) * (((double) c79710.f26516) - ((double) c79710.f26517)));
                    }
                    return iCompare == 0 ? Integer.compare(num2.intValue(), num.intValue()) : iCompare;
                }
            });
            this.f4715 = arrayList;
            m4783(arrayList.isEmpty() ? -1 : ((Integer) this.f4715.get(0)).intValue());
            super.performClick();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
