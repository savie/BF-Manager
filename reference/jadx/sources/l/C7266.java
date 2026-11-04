package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C7266 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable f23932;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f23933;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Rect f23934;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f23935;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f23936;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f23937;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C10232 f23938;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f23939;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f23940;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public SeekBar f23941;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f23942;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23943;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f23944;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23945;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f23946;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public SeekBar f23947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6521 f23948;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f23949;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f23950;

    public C7266(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23949 = 0.0f;
        this.f23950 = 0.0f;
        this.f23948 = new C6521();
        this.f23938 = new C10232();
        this.f23934 = new Rect();
        m19902(context);
    }

    public C7266(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23949 = 0.0f;
        this.f23950 = 0.0f;
        this.f23948 = new C6521();
        this.f23938 = new C10232();
        this.f23934 = new Rect();
        m19902(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19902(Context context) {
        this.f23935 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f23937 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        Paint.Style style = Paint.Style.FILL;
        C10232 c10232 = this.f23938;
        c10232.setStyle(style);
        c10232.setAntiAlias(false);
        c10232.setFilterBitmap(false);
        if (isInEditMode()) {
            m19905(context.getResources().getDrawable(R.drawable.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19906(SeekBar seekBar, SeekBar seekBar2) {
        this.f23941 = seekBar;
        this.f23947 = seekBar2;
        seekBar.setOnSeekBarChangeListener(new C2791(this));
        seekBar2.setOnSeekBarChangeListener(new C8757(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19905(Drawable drawable) {
        this.f23932 = drawable;
        drawable.getPadding(this.f23934);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int i2 = height / 2;
        int i3 = this.f23943;
        C10232 c10232 = this.f23938;
        int i4 = 2;
        if (i3 != 0) {
            if (i3 == 1) {
                canvas.drawColor(-16777216);
            } else if (i3 == 2) {
                canvas.drawColor(-1);
            } else if (i3 == 3) {
                canvas.drawColor(-7829368);
            }
            canvas2 = canvas;
        } else {
            int i5 = this.f23937;
            int i6 = width / i5;
            int i7 = height / i5;
            int[] iArr = this.f23948.f21933;
            Canvas canvas3 = canvas;
            int i8 = 0;
            while (i8 <= i6) {
                int i9 = 0;
                while (i9 <= i7) {
                    c10232.setColor(iArr[(i8 + i9) % i4]);
                    int i10 = i8 * i5;
                    int i11 = i9 * i5;
                    canvas.drawRect(i10, i11, i10 + i5, i11 + i5, c10232);
                    i9++;
                    i4 = 2;
                    canvas3 = canvas;
                    i8 = i8;
                    iArr = iArr;
                }
                i8++;
                i4 = 2;
            }
            canvas2 = canvas3;
        }
        Drawable drawable = this.f23932;
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(Math.min(1.0f, width / intrinsicWidth), Math.min(1.0f, height / intrinsicHeight));
        int i12 = (int) (intrinsicWidth * fMin);
        int i13 = (int) (intrinsicHeight * fMin);
        int i14 = (int) (((width - i12) * this.f23949) + i12);
        int i15 = (int) (((height - i13) * this.f23950) + i13);
        int i16 = i - (i14 / 2);
        int i17 = i2 - (i15 / 2);
        int i18 = i14 + i16;
        int i19 = i15 + i17;
        drawable.setBounds(i16, i17, i18, i19);
        drawable.draw(canvas2);
        if (this.f23945) {
            c10232.setColor(-1333755649);
            Rect rect = this.f23934;
            canvas2.drawRect(i16 + (rect.left * fMin), i17 + (rect.top * fMin), i18 - (rect.right * fMin), i19 - (rect.bottom * fMin), c10232);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19904(float f) {
        this.f23949 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19908(float f) {
        this.f23950 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19907(boolean z) {
        this.f23945 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19903() {
        this.f23943 = (this.f23943 + 1) % 4;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int width;
        int height;
        SeekBar seekBar;
        SeekBar seekBar2;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked == 0) {
            this.f23936 = 0;
            this.f23944 = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f23936++;
                        if (!this.f23944) {
                            this.f23946 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.f23933 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            this.f23940 = this.f23949;
                            this.f23939 = this.f23950;
                            this.f23944 = true;
                            this.f23942 = false;
                            return true;
                        }
                    } else if (actionMasked == 6) {
                        this.f23936--;
                        return true;
                    }
                }
            } else if (this.f23936 == 1 && this.f23944) {
                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                if (this.f23942) {
                    width = (int) ((((fAbs - this.f23946) / getWidth()) + this.f23940) * 100.0f);
                    height = (int) ((((fAbs2 - this.f23933) / getHeight()) + this.f23939) * 100.0f);
                    if (width > 100) {
                        width = 100;
                    } else if (width < 0) {
                        width = 0;
                    }
                    if (height > 100) {
                        i = 100;
                    } else if (height >= 0) {
                        i = height;
                    }
                    this.f23949 = width / 100.0f;
                    this.f23950 = i / 100.0f;
                    seekBar = this.f23941;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f23947;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                } else if (Math.abs(fAbs - this.f23946) > this.f23935 || Math.abs(fAbs2 - this.f23933) > this.f23935) {
                    this.f23942 = true;
                    width = (int) ((((fAbs - this.f23946) / getWidth()) + this.f23940) * 100.0f);
                    height = (int) ((((fAbs2 - this.f23933) / getHeight()) + this.f23939) * 100.0f);
                    if (width > 100) {
                        width = 100;
                    } else if (width < 0) {
                        width = 0;
                    }
                    if (height > 100) {
                        i = 100;
                    } else if (height >= 0) {
                        i = height;
                    }
                    this.f23949 = width / 100.0f;
                    this.f23950 = i / 100.0f;
                    seekBar = this.f23941;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f23947;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                }
            }
            return true;
        }
        this.f23944 = false;
        return true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putFloat("xScale", this.f23949);
        bundle.putFloat("yScale", this.f23950);
        bundle.putBoolean("drawContentRegion", this.f23945);
        bundle.putInt("backgroundMode", this.f23943);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getBundle("super"));
            this.f23949 = bundle.getFloat("xScale");
            this.f23950 = bundle.getFloat("yScale");
            this.f23945 = bundle.getBoolean("drawContentRegion");
            this.f23943 = bundle.getInt("backgroundMode");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
