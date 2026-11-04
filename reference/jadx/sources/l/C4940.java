package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1AT */
/* JADX INFO: loaded from: classes2.dex */
public class C4940 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f17222;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f17223;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Rect f17224;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Paint f17225;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f17226;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f17227;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Paint f17228;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17229;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f17230;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Paint f17231;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f17232;

    public C4940(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17225 = new Paint();
        this.f17231 = new Paint();
        this.f17228 = new Paint();
        this.f17232 = true;
        this.f17230 = true;
        this.f17223 = null;
        this.f17224 = new Rect();
        this.f17229 = Color.argb(255, 0, 0, 0);
        this.f17226 = Color.argb(255, 200, 200, 200);
        this.f17227 = Color.argb(255, 50, 50, 50);
        this.f17222 = 4;
        m15147(context, attributeSet);
    }

    public C4940(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17225 = new Paint();
        this.f17231 = new Paint();
        this.f17228 = new Paint();
        this.f17232 = true;
        this.f17230 = true;
        this.f17223 = null;
        this.f17224 = new Rect();
        this.f17229 = Color.argb(255, 0, 0, 0);
        this.f17226 = Color.argb(255, 200, 200, 200);
        this.f17227 = Color.argb(255, 50, 50, 50);
        this.f17222 = 4;
        m15147(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15147(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4434);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f17223 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f17232 = typedArrayObtainStyledAttributes.getBoolean(index, this.f17232);
                } else if (index == 0) {
                    this.f17229 = typedArrayObtainStyledAttributes.getColor(index, this.f17229);
                } else if (index == 2) {
                    this.f17227 = typedArrayObtainStyledAttributes.getColor(index, this.f17227);
                } else if (index == 3) {
                    this.f17226 = typedArrayObtainStyledAttributes.getColor(index, this.f17226);
                } else if (index == 5) {
                    this.f17230 = typedArrayObtainStyledAttributes.getBoolean(index, this.f17230);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f17223 == null) {
            try {
                this.f17223 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.f17229;
        Paint paint = this.f17225;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.f17226;
        Paint paint2 = this.f17231;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.f17228.setColor(this.f17227);
        this.f17222 = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f17222);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f17232) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f17225);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f17225);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f17225);
            canvas.drawLine(f, 0.0f, f, f2, this.f17225);
            canvas.drawLine(f, f2, 0.0f, f2, this.f17225);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f17225);
        }
        String str = this.f17223;
        if (str == null || !this.f17230) {
            return;
        }
        int length = str.length();
        Paint paint = this.f17231;
        Rect rect = this.f17224;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.f17222;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(rect, this.f17228);
        canvas.drawText(this.f17223, fWidth, fHeight, paint);
    }
}
