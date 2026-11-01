package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1AT */
/* JADX INFO: loaded from: classes2.dex */
public class C6295 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f21305;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21306;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Paint f21307;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f21308;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Paint f21309;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Rect f21310;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f21311;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21312;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Paint f21313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21314;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f21315;

    public C6295(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21309 = new Paint();
        this.f21313 = new Paint();
        this.f21307 = new Paint();
        this.f21314 = true;
        this.f21305 = true;
        this.f21308 = null;
        this.f21310 = new Rect();
        this.f21311 = Color.argb(255, 0, 0, 0);
        this.f21306 = Color.argb(255, 200, 200, 200);
        this.f21315 = Color.argb(255, 50, 50, 50);
        this.f21312 = 4;
        m17373(context, attributeSet);
    }

    public C6295(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21309 = new Paint();
        this.f21313 = new Paint();
        this.f21307 = new Paint();
        this.f21314 = true;
        this.f21305 = true;
        this.f21308 = null;
        this.f21310 = new Rect();
        this.f21311 = Color.argb(255, 0, 0, 0);
        this.f21306 = Color.argb(255, 200, 200, 200);
        this.f21315 = Color.argb(255, 50, 50, 50);
        this.f21312 = 4;
        m17373(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17373(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51899);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f21308 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f21314 = typedArrayObtainStyledAttributes.getBoolean(index, this.f21314);
                } else if (index == 0) {
                    this.f21311 = typedArrayObtainStyledAttributes.getColor(index, this.f21311);
                } else if (index == 2) {
                    this.f21315 = typedArrayObtainStyledAttributes.getColor(index, this.f21315);
                } else if (index == 3) {
                    this.f21306 = typedArrayObtainStyledAttributes.getColor(index, this.f21306);
                } else if (index == 5) {
                    this.f21305 = typedArrayObtainStyledAttributes.getBoolean(index, this.f21305);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f21308 == null) {
            try {
                this.f21308 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.f21311;
        Paint paint = this.f21309;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.f21306;
        Paint paint2 = this.f21313;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.f21307.setColor(this.f21315);
        this.f21312 = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f21312);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f21314) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f21309);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f21309);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f21309);
            canvas.drawLine(f, 0.0f, f, f2, this.f21309);
            canvas.drawLine(f, f2, 0.0f, f2, this.f21309);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f21309);
        }
        String str = this.f21308;
        if (str == null || !this.f21305) {
            return;
        }
        int length = str.length();
        Paint paint = this.f21313;
        Rect rect = this.f21310;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.f21312;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(rect, this.f21307);
        canvas.drawText(this.f21308, fWidth, fHeight, paint);
    }
}
