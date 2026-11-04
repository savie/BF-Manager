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

/* JADX INFO: renamed from: l.ᩴ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S593 */
/* JADX INFO: loaded from: classes5.dex */
public class C19462 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f62865;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f62866;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final RectF f62867;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f62868;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final RectF f62869;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Paint f62870;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f62871;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f62872;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f62873;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float f62874;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f62875;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f62876;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f62877;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Paint f62878;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f62879;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f62880;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f62881;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f62882;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f62883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62884;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f62885;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Paint f62886;

    public C19462(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19462(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62866 = 100;
        this.f62884 = 0;
        this.f62885 = "%";
        this.f62868 = "";
        int iRgb = Color.rgb(66, 145, 241);
        int iRgb2 = Color.rgb(66, 145, 241);
        int iArgb = Color.argb(180, 194, 194, 194);
        this.f62867 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f62869 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f62882 = true;
        this.f62881 = true;
        this.f62875 = true;
        float f = (getResources().getDisplayMetrics().density * 1.5f) + 0.5f;
        float f2 = (getResources().getDisplayMetrics().density * 1.0f) + 0.5f;
        float f3 = getResources().getDisplayMetrics().scaledDensity * 10.0f;
        float f4 = (getResources().getDisplayMetrics().density * 3.0f) + 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3676.f12648);
        this.f62873 = typedArrayObtainStyledAttributes.getColor(3, iRgb2);
        this.f62880 = typedArrayObtainStyledAttributes.getColor(9, iArgb);
        this.f62876 = typedArrayObtainStyledAttributes.getColor(4, iRgb);
        this.f62883 = typedArrayObtainStyledAttributes.getDimension(6, f3);
        this.f62871 = typedArrayObtainStyledAttributes.getDimension(2, f);
        this.f62877 = typedArrayObtainStyledAttributes.getDimension(8, f2);
        this.f62874 = typedArrayObtainStyledAttributes.getDimension(5, f4);
        if (typedArrayObtainStyledAttributes.getInt(7, 0) != 0) {
            this.f62875 = false;
        }
        m45006(typedArrayObtainStyledAttributes.getInt(0, 0));
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        if (i2 > 0) {
            this.f62866 = i2;
            invalidate();
        }
        typedArrayObtainStyledAttributes.recycle();
        m45005();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return (int) this.f62883;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max((int) this.f62883, Math.max((int) this.f62871, (int) this.f62877));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m45004(i, true), m45004(i2, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m45004(int i, boolean z) {
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
            suggestedMinimumHeight = (int) this.f62883;
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
        boolean z = this.f62875;
        RectF rectF = this.f62869;
        RectF rectF2 = this.f62867;
        if (z) {
            this.f62879 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf((this.f62884 * 100) / this.f62866));
            String str = this.f62868 + this.f62879 + this.f62885;
            this.f62879 = str;
            float fMeasureText = this.f62886.measureText(str);
            int i = this.f62884;
            float f = this.f62874;
            if (i == 0) {
                this.f62881 = false;
                this.f62872 = getPaddingLeft();
            } else {
                this.f62881 = true;
                rectF.left = getPaddingLeft();
                rectF.top = (getHeight() / 2.0f) - (this.f62871 / 2.0f);
                rectF.right = (((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f62866 * 1.0f)) * this.f62884) - f) + getPaddingLeft();
                rectF.bottom = (this.f62871 / 2.0f) + (getHeight() / 2.0f);
                this.f62872 = rectF.right + f;
            }
            this.f62865 = (int) ((getHeight() / 2.0f) - ((this.f62886.ascent() + this.f62886.descent()) / 2.0f));
            if (this.f62872 + fMeasureText >= getWidth() - getPaddingRight()) {
                float width = (getWidth() - getPaddingRight()) - fMeasureText;
                this.f62872 = width;
                rectF.right = width - f;
            }
            float f2 = this.f62872 + fMeasureText + f;
            if (f2 >= getWidth() - getPaddingRight()) {
                this.f62882 = false;
            } else {
                this.f62882 = true;
                rectF2.left = f2;
                rectF2.right = getWidth() - getPaddingRight();
                rectF2.top = ((-this.f62877) / 2.0f) + (getHeight() / 2.0f);
                rectF2.bottom = (this.f62877 / 2.0f) + (getHeight() / 2.0f);
            }
        } else {
            rectF.left = getPaddingLeft();
            rectF.top = (getHeight() / 2.0f) - (this.f62871 / 2.0f);
            rectF.right = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (this.f62866 * 1.0f)) * this.f62884) + getPaddingLeft();
            rectF.bottom = (this.f62871 / 2.0f) + (getHeight() / 2.0f);
            rectF2.left = rectF.right;
            rectF2.right = getWidth() - getPaddingRight();
            rectF2.top = ((-this.f62877) / 2.0f) + (getHeight() / 2.0f);
            rectF2.bottom = (this.f62877 / 2.0f) + (getHeight() / 2.0f);
        }
        if (this.f62881) {
            canvas.drawRect(rectF, this.f62878);
        }
        if (this.f62882) {
            canvas.drawRect(rectF2, this.f62870);
        }
        if (this.f62875) {
            canvas.drawText(this.f62879, this.f62872, this.f62865, this.f62886);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45005() {
        Paint paint = new Paint(1);
        this.f62878 = paint;
        paint.setColor(this.f62873);
        Paint paint2 = new Paint(1);
        this.f62870 = paint2;
        paint2.setColor(this.f62880);
        Paint paint3 = new Paint(1);
        this.f62886 = paint3;
        paint3.setColor(this.f62876);
        this.f62886.setTextSize(this.f62883);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45006(int i) {
        if (i > this.f62866 || i < 0) {
            return;
        }
        this.f62884 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45009(int i) {
        this.f62876 = i;
        this.f62886.setColor(i);
        invalidate();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45008(int i) {
        this.f62873 = i;
        this.f62878.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", this.f62876);
        bundle.putFloat("text_size", this.f62883);
        bundle.putFloat("reached_bar_height", this.f62871);
        bundle.putFloat("unreached_bar_height", this.f62877);
        bundle.putInt("reached_bar_color", this.f62873);
        bundle.putInt("unreached_bar_color", this.f62880);
        bundle.putInt("max", this.f62866);
        bundle.putInt("progress", this.f62884);
        bundle.putString("suffix", this.f62885);
        bundle.putString("prefix", this.f62868);
        bundle.putBoolean("text_visibility", this.f62875);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f62876 = bundle.getInt("text_color");
            this.f62883 = bundle.getFloat("text_size");
            this.f62871 = bundle.getFloat("reached_bar_height");
            this.f62877 = bundle.getFloat("unreached_bar_height");
            this.f62873 = bundle.getInt("reached_bar_color");
            this.f62880 = bundle.getInt("unreached_bar_color");
            m45005();
            int i = bundle.getInt("max");
            if (i > 0) {
                this.f62866 = i;
                invalidate();
            }
            m45006(bundle.getInt("progress"));
            String string = bundle.getString("prefix");
            if (string == null) {
                this.f62868 = "";
            } else {
                this.f62868 = string;
            }
            String string2 = bundle.getString("suffix");
            if (string2 == null) {
                this.f62885 = "";
            } else {
                this.f62885 = string2;
            }
            m45007(bundle.getBoolean("text_visibility") ? EnumC22446.Visible : EnumC22446.Invisible);
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45007(EnumC22446 enumC22446) {
        this.f62875 = enumC22446 == EnumC22446.Visible;
        invalidate();
    }
}
