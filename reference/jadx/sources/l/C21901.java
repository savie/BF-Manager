package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: renamed from: l.᩸᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S593 */
/* JADX INFO: loaded from: classes4.dex */
public class C21901 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f71041;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f71042;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f71043;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Paint f71044;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Paint f71045;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final RectF f71046;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final RectF f71047;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f71048;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f71049;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f71050;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f71051;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f71052;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f71053;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public Paint f71054;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f71055;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f71056;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f71057;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f71058;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f71059;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71060;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f71061;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f71062;

    public C21901(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21901(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71051 = 100;
        this.f71060 = 0;
        this.f71055 = "%";
        this.f71056 = "";
        int iRgb = Color.rgb(66, 145, 241);
        int iRgb2 = Color.rgb(66, 145, 241);
        int iArgb = Color.argb(180, 194, 194, 194);
        this.f71046 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f71047 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f71059 = true;
        this.f71041 = true;
        this.f71049 = true;
        float f = (getResources().getDisplayMetrics().density * 1.5f) + 0.5f;
        float f2 = (getResources().getDisplayMetrics().density * 1.0f) + 0.5f;
        float f3 = getResources().getDisplayMetrics().scaledDensity * 10.0f;
        float f4 = (getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8270.f28748);
        this.f71043 = typedArrayObtainStyledAttributes.getColor(3, iRgb2);
        this.f71061 = typedArrayObtainStyledAttributes.getColor(9, iArgb);
        this.f71052 = typedArrayObtainStyledAttributes.getColor(4, iRgb);
        this.f71048 = typedArrayObtainStyledAttributes.getDimension(6, f3);
        this.f71050 = typedArrayObtainStyledAttributes.getDimension(2, f);
        this.f71042 = typedArrayObtainStyledAttributes.getDimension(8, f2);
        this.f71062 = typedArrayObtainStyledAttributes.getDimension(5, f4);
        if (typedArrayObtainStyledAttributes.getInt(7, 0) != 0) {
            this.f71049 = false;
        }
        m48699(typedArrayObtainStyledAttributes.getInt(0, 0));
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        if (i2 > 0) {
            this.f71051 = i2;
            invalidate();
        }
        typedArrayObtainStyledAttributes.recycle();
        m48698();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return (int) this.f71048;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max((int) this.f71048, Math.max((int) this.f71050, (int) this.f71042));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m48697(i, true), m48697(i2, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48697(int i, boolean z) {
        int paddingTop;
        int paddingBottom;
        int suggestedMinimumHeight;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (z) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i2 = paddingBottom + paddingTop;
        if (mode == 1073741824) {
            return size;
        }
        if (z) {
            suggestedMinimumHeight = (int) this.f71048;
        } else {
            suggestedMinimumHeight = getSuggestedMinimumHeight();
        }
        int i3 = suggestedMinimumHeight + i2;
        if (mode != Integer.MIN_VALUE) {
            return i3;
        }
        if (z) {
            return Math.max(i3, size);
        }
        return Math.min(i3, size);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.f71049;
        RectF rectF = this.f71047;
        RectF rectF2 = this.f71046;
        if (z) {
            this.f71057 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf((this.f71060 * 100) / this.f71051));
            String str = this.f71056 + this.f71057 + this.f71055;
            this.f71057 = str;
            float fMeasureText = this.f71044.measureText(str);
            int i = this.f71060;
            float f = this.f71062;
            if (i == 0) {
                this.f71041 = false;
                this.f71053 = getPaddingLeft();
            } else {
                this.f71041 = true;
                rectF.left = getPaddingLeft();
                rectF.top = (getHeight() / 2.0f) - (this.f71050 / 2.0f);
                rectF.right = (((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f71051 * 1.0f)) * this.f71060) - f) + getPaddingLeft();
                rectF.bottom = (this.f71050 / 2.0f) + (getHeight() / 2.0f);
                this.f71053 = rectF.right + f;
            }
            this.f71058 = (int) ((getHeight() / 2.0f) - ((this.f71044.ascent() + this.f71044.descent()) / 2.0f));
            if (this.f71053 + fMeasureText >= getWidth() - getPaddingRight()) {
                float width = (getWidth() - getPaddingRight()) - fMeasureText;
                this.f71053 = width;
                rectF.right = width - f;
            }
            float f2 = this.f71053 + fMeasureText + f;
            if (f2 >= getWidth() - getPaddingRight()) {
                this.f71059 = false;
            } else {
                this.f71059 = true;
                rectF2.left = f2;
                rectF2.right = getWidth() - getPaddingRight();
                rectF2.top = ((-this.f71042) / 2.0f) + (getHeight() / 2.0f);
                rectF2.bottom = (this.f71042 / 2.0f) + (getHeight() / 2.0f);
            }
        } else {
            rectF.left = getPaddingLeft();
            rectF.top = (getHeight() / 2.0f) - (this.f71050 / 2.0f);
            rectF.right = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f71051 * 1.0f)) * this.f71060) + getPaddingLeft();
            rectF.bottom = (this.f71050 / 2.0f) + (getHeight() / 2.0f);
            rectF2.left = rectF.right;
            rectF2.right = getWidth() - getPaddingRight();
            rectF2.top = ((-this.f71042) / 2.0f) + (getHeight() / 2.0f);
            rectF2.bottom = (this.f71042 / 2.0f) + (getHeight() / 2.0f);
        }
        if (this.f71041) {
            canvas.drawRect(rectF, this.f71045);
        }
        if (this.f71059) {
            canvas.drawRect(rectF2, this.f71054);
        }
        if (this.f71049) {
            canvas.drawText(this.f71057, this.f71053, this.f71058, this.f71044);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48698() {
        Paint paint = new Paint(1);
        this.f71045 = paint;
        paint.setColor(this.f71043);
        Paint paint2 = new Paint(1);
        this.f71054 = paint2;
        paint2.setColor(this.f71061);
        Paint paint3 = new Paint(1);
        this.f71044 = paint3;
        paint3.setColor(this.f71052);
        this.f71044.setTextSize(this.f71048);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48699(int i) {
        if (i > this.f71051 || i < 0) {
            return;
        }
        this.f71060 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48702(int i) {
        this.f71052 = i;
        this.f71044.setColor(i);
        invalidate();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48701(int i) {
        this.f71043 = i;
        this.f71045.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", this.f71052);
        bundle.putFloat("text_size", this.f71048);
        bundle.putFloat("reached_bar_height", this.f71050);
        bundle.putFloat("unreached_bar_height", this.f71042);
        bundle.putInt("reached_bar_color", this.f71043);
        bundle.putInt("unreached_bar_color", this.f71061);
        bundle.putInt("max", this.f71051);
        bundle.putInt("progress", this.f71060);
        bundle.putString("suffix", this.f71055);
        bundle.putString("prefix", this.f71056);
        bundle.putBoolean("text_visibility", this.f71049);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f71052 = bundle.getInt("text_color");
            this.f71048 = bundle.getFloat("text_size");
            this.f71050 = bundle.getFloat("reached_bar_height");
            this.f71042 = bundle.getFloat("unreached_bar_height");
            this.f71043 = bundle.getInt("reached_bar_color");
            this.f71061 = bundle.getInt("unreached_bar_color");
            m48698();
            int i = bundle.getInt("max");
            if (i > 0) {
                this.f71051 = i;
                invalidate();
            }
            m48699(bundle.getInt("progress"));
            String string = bundle.getString("prefix");
            if (string == null) {
                this.f71056 = "";
            } else {
                this.f71056 = string;
            }
            String string2 = bundle.getString("suffix");
            if (string2 == null) {
                this.f71055 = "";
            } else {
                this.f71055 = string2;
            }
            m48700(bundle.getBoolean("text_visibility") ? EnumC15552.Visible : EnumC15552.Invisible);
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48700(EnumC15552 enumC15552) {
        this.f71049 = enumC15552 == EnumC15552.Visible;
        invalidate();
    }
}
