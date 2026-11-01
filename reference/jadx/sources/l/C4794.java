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

/* JADX INFO: renamed from: l.ۙܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4794 extends ReplacementSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16849;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16850;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16853;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13262 f16854;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f16855;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC3238 f16856;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f16857;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f16858;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Rect f16852 = new Rect();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Paint f16851 = new Paint(1);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextPaint f16859 = new TextPaint();

    public C4794(C13262 c13262, ArrayList arrayList, boolean z, boolean z2) {
        this.f16854 = c13262;
        this.f16855 = arrayList;
        this.f16853 = new ArrayList(arrayList.size());
        this.f16858 = z;
        this.f16857 = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f16853;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.f16849 = i3;
            int i4 = -((this.f16854.f44041 * 2) + i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.f16850;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        InterfaceC3238 interfaceC3238;
        float f2 = f;
        int iM27238 = AbstractC10872.m27238(canvas, charSequence);
        int i6 = this.f16850;
        boolean z2 = this.f16858;
        ArrayList arrayList = this.f16853;
        C13262 c13262 = this.f16854;
        if (i6 != iM27238) {
            this.f16850 = iM27238;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.f16859;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            List list = this.f16855;
            int iM13316 = m13316(list.size()) - (c13262.f44041 * 2);
            arrayList.clear();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                m13312(i7, iM13316, (C9590) list.get(i7));
            }
        }
        int i8 = c13262.f44041;
        int size2 = arrayList.size();
        int iM13317 = m13316(size2);
        int i9 = iM13317 - (this.f16850 / size2);
        Paint paint2 = this.f16851;
        if (z2) {
            paint2.setColor(c13262.f44040);
            paint2.setStyle(Paint.Style.FILL);
            i8 = i8;
        } else if (this.f16857) {
            int iM31802 = c13262.f44043;
            if (iM31802 == 0) {
                iM31802 = AbstractC12807.m31802(paint2.getColor(), 22);
            }
            paint2.setColor(iM31802);
            paint2.setStyle(Paint.Style.FILL);
        } else {
            i8 = i8;
            paint2.setColor(c13262.f44038);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.f16852;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.f16850, i5 - i3);
                canvas.translate(f2, i3);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        paint2.set(paint);
        int iM31803 = c13262.f44039;
        if (iM31803 == 0) {
            iM31803 = AbstractC12807.m31802(paint2.getColor(), 75);
        }
        paint2.setColor(iM31803);
        paint2.setStyle(Paint.Style.FILL);
        int strokeWidth = c13262.f44042;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        boolean z4 = strokeWidth > 0;
        int i10 = i5 - i3;
        int i11 = (i10 - this.f16849) / 4;
        if (z4) {
            C22434[] c22434Arr = (C22434[]) ((Spanned) charSequence).getSpans(i, i2, C22434.class);
            if (c22434Arr == null || c22434Arr.length <= 0) {
                z = false;
            } else {
                C22434 c22434 = c22434Arr[0];
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(c22434) == i) {
                    rect.set((int) f2, i3, this.f16850, i3 + strokeWidth);
                    canvas.drawRect(rect, paint2);
                    z = true;
                } else {
                    z = false;
                }
            }
            rect.set((int) f2, i5 - strokeWidth, this.f16850, i5);
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
                canvas.translate((i14 * iM13317) + f2, i3);
                if (z4) {
                    rect.set(0, i12, strokeWidth, i13);
                    canvas.drawRect(rect, paint2);
                    if (i14 == size2 - 1) {
                        rect.set((iM13317 - strokeWidth) - i9, i12, iM13317 - i9, i13);
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
        if (this.f16849 == height || (interfaceC3238 = this.f16856) == null) {
            return;
        }
        C2677 c2677 = (C2677) interfaceC3238;
        TextView textView = c2677.f10348;
        Runnable runnable = c2677.f10347;
        textView.removeCallbacks(runnable);
        textView.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m13312(int i, int i2, C9590 c9590) {
        Layout.Alignment alignment;
        RunnableC23701 runnableC23701 = new RunnableC23701(this, i, i2, c9590);
        Spannable spannable = (Spannable) c9590.f32330;
        int i3 = c9590.f32329;
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i3 == 2) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout staticLayout = new StaticLayout(spannable, this.f16859, i2, alignment, 1.0f, 0.0f, false);
        C18761.m43320(spannable, staticLayout);
        C19529[] c19529Arr = (C19529[]) spannable.getSpans(0, spannable.length(), C19529.class);
        if (c19529Arr != null && c19529Arr.length > 0) {
            for (C19529 c19529 : c19529Arr) {
                C5417 c5417M44610 = c19529.m44610();
                if (c5417M44610.getCallback() == null) {
                    c5417M44610.m14992(new C14529(runnableC23701));
                }
            }
        }
        this.f16853.add(i, staticLayout);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Layout m13318(int i) {
        ArrayList arrayList = this.f16853;
        int size = arrayList.size();
        int iM13316 = i / m13316(size);
        if (iM13316 >= size) {
            return null;
        }
        return (Layout) arrayList.get(iM13316);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13315() {
        return m13316(this.f16853.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13316(int i) {
        return (int) (((this.f16850 * 1.0f) / i) + 0.5f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13317(InterfaceC3238 interfaceC3238) {
        this.f16856 = interfaceC3238;
    }
}
