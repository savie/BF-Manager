package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes4.dex */
public final class C16102 extends ReplacementSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC17594 f52158;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4170 f52160;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f52161;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f52162;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f52165;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52166;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f52167;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f52168;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Rect f52159 = new Rect();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Paint f52164 = new Paint(1);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextPaint f52163 = new TextPaint();

    public C16102(C4170 c4170, ArrayList arrayList, boolean z, boolean z2) {
        this.f52160 = c4170;
        this.f52165 = arrayList;
        this.f52161 = new ArrayList(arrayList.size());
        this.f52168 = z;
        this.f52167 = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f52161;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.f52166 = i3;
            int i4 = -((this.f52160.f14153 * 2) + i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.f52162;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        InterfaceC17594 interfaceC17594;
        float f2 = f;
        int iM40212 = AbstractC17076.m40212(canvas, charSequence);
        int i6 = this.f52162;
        boolean z2 = this.f52168;
        ArrayList arrayList = this.f52161;
        C4170 c4170 = this.f52160;
        if (i6 != iM40212) {
            this.f52162 = iM40212;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.f52163;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            List list = this.f52165;
            int iM38260 = m38260(list.size()) - (c4170.f14153 * 2);
            arrayList.clear();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                m38256(i7, iM38260, (C16848) list.get(i7));
            }
        }
        int i8 = c4170.f14153;
        int size2 = arrayList.size();
        int iM38261 = m38260(size2);
        int i9 = iM38261 - (this.f52162 / size2);
        Paint paint2 = this.f52164;
        if (z2) {
            paint2.setColor(c4170.f14155);
            paint2.setStyle(Paint.Style.FILL);
            i8 = i8;
        } else if (this.f52167) {
            int iM13638 = c4170.f14154;
            if (iM13638 == 0) {
                iM13638 = AbstractC4279.m13638(paint2.getColor(), 22);
            }
            paint2.setColor(iM13638);
            paint2.setStyle(Paint.Style.FILL);
        } else {
            i8 = i8;
            paint2.setColor(c4170.f14157);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.f52159;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.f52162, i5 - i3);
                canvas.translate(f2, i3);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        paint2.set(paint);
        int iM13639 = c4170.f14152;
        if (iM13639 == 0) {
            iM13639 = AbstractC4279.m13638(paint2.getColor(), 75);
        }
        paint2.setColor(iM13639);
        paint2.setStyle(Paint.Style.FILL);
        int strokeWidth = c4170.f14156;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        boolean z4 = strokeWidth > 0;
        int i10 = i5 - i3;
        int i11 = (i10 - this.f52166) / 4;
        if (z4) {
            C6408[] c6408Arr = (C6408[]) ((Spanned) charSequence).getSpans(i, i2, C6408.class);
            if (c6408Arr == null || c6408Arr.length <= 0) {
                z = false;
            } else {
                C6408 c6408 = c6408Arr[0];
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(c6408) == i) {
                    rect.set((int) f2, i3, this.f52162, i3 + strokeWidth);
                    canvas.drawRect(rect, paint2);
                    z = true;
                } else {
                    z = false;
                }
            }
            rect.set((int) f2, i5 - strokeWidth, this.f52162, i5);
            canvas.drawRect(rect, paint2);
        } else {
            z = false;
        }
        int i12 = z ? strokeWidth : 0;
        int i13 = i10 - strokeWidth;
        int i14 = 0;
        int height = 0;
        while (i14 < size2) {
            Layout layout = (Layout) arrayList.get(i14);
            int iSave2 = canvas.save();
            try {
                canvas.translate((i14 * iM38261) + f2, i3);
                if (z4) {
                    rect.set(0, i12, strokeWidth, i13);
                    canvas.drawRect(rect, paint2);
                    if (i14 == size2 - 1) {
                        rect.set((iM38261 - strokeWidth) - i9, i12, iM38261 - i9, i13);
                        canvas.drawRect(rect, paint2);
                    }
                }
                int i15 = i8;
                int i16 = i12;
                canvas.translate(i15, i15 + i11);
                layout.draw(canvas);
                if (layout.getHeight() > height) {
                    height = layout.getHeight();
                }
                canvas.restoreToCount(iSave2);
                i14++;
                i12 = i16;
                i8 = i15;
                f2 = f;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        }
        if (this.f52166 == height || (interfaceC17594 = this.f52158) == null) {
            return;
        }
        C20578 c20578 = (C20578) interfaceC17594;
        TextView textView = c20578.f65905;
        Runnable runnable = c20578.f65904;
        textView.removeCallbacks(runnable);
        textView.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m38256(int i, int i2, C16848 c16848) {
        Layout.Alignment alignment;
        RunnableC1933 runnableC1933 = new RunnableC1933(this, i, i2, c16848);
        Spannable spannable = (Spannable) c16848.f54322;
        int i3 = c16848.f54321;
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i3 == 2) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout staticLayout = new StaticLayout(spannable, this.f52163, i2, alignment, 1.0f, 0.0f, false);
        C10200.m26320(spannable, staticLayout);
        C9740[] c9740Arr = (C9740[]) spannable.getSpans(0, spannable.length(), C9740.class);
        if (c9740Arr != null && c9740Arr.length > 0) {
            for (C9740 c9740 : c9740Arr) {
                C12724 c12724M25369 = c9740.m25369();
                if (c12724M25369.getCallback() == null) {
                    c12724M25369.m31536(new C11627(runnableC1933));
                }
            }
        }
        this.f52161.add(i, staticLayout);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Layout m38262(int i) {
        ArrayList arrayList = this.f52161;
        int size = arrayList.size();
        int iM38260 = i / m38260(size);
        if (iM38260 >= size) {
            return null;
        }
        return (Layout) arrayList.get(iM38260);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38259() {
        return m38260(this.f52161.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38260(int i) {
        return (int) (((this.f52162 * 1.0f) / i) + 0.5f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38261(InterfaceC17594 interfaceC17594) {
        this.f52158 = interfaceC17594;
    }
}
