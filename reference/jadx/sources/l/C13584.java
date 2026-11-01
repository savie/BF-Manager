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

/* JADX INFO: renamed from: l.ܰۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C13584 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f44787;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4916 f44788;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f44789;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f44790;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f44791;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public SeekBar f44792;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f44793;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f44794;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f44795;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public SeekBar f44796;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f44797;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f44798;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Rect f44799;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44800;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Drawable f44801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f44802;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0144 f44803;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44804;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f44805;

    public C13584(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44798 = 0.0f;
        this.f44789 = 0.0f;
        this.f44803 = new C0144();
        this.f44788 = new C4916();
        this.f44799 = new Rect();
        m33202(context);
    }

    public C13584(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44798 = 0.0f;
        this.f44789 = 0.0f;
        this.f44803 = new C0144();
        this.f44788 = new C4916();
        this.f44799 = new Rect();
        m33202(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33202(Context context) {
        this.f44791 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f44797 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        Paint.Style style = Paint.Style.FILL;
        C4916 c4916 = this.f44788;
        c4916.setStyle(style);
        c4916.setAntiAlias(false);
        c4916.setFilterBitmap(false);
        if (isInEditMode()) {
            m33205(context.getResources().getDrawable(R.drawable.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33206(SeekBar seekBar, SeekBar seekBar2) {
        this.f44796 = seekBar;
        this.f44792 = seekBar2;
        seekBar.setOnSeekBarChangeListener(new C2966(this));
        seekBar2.setOnSeekBarChangeListener(new C4410(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33205(Drawable drawable) {
        this.f44801 = drawable;
        drawable.getPadding(this.f44799);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int i2 = height / 2;
        int i3 = this.f44800;
        C4916 c4916 = this.f44788;
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
            int i5 = this.f44797;
            int i6 = width / i5;
            int i7 = height / i5;
            int[] iArr = this.f44803.f1194;
            Canvas canvas3 = canvas;
            int i8 = 0;
            while (i8 <= i6) {
                int i9 = 0;
                while (i9 <= i7) {
                    c4916.setColor(iArr[(i8 + i9) % i4]);
                    int i10 = i8 * i5;
                    int i11 = i9 * i5;
                    canvas.drawRect(i10, i11, i10 + i5, i11 + i5, c4916);
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
        Drawable drawable = this.f44801;
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(Math.min(1.0f, width / intrinsicWidth), Math.min(1.0f, height / intrinsicHeight));
        int i12 = (int) (intrinsicWidth * fMin);
        int i13 = (int) (intrinsicHeight * fMin);
        int i14 = (int) (((width - i12) * this.f44798) + i12);
        int i15 = (int) (((height - i13) * this.f44789) + i13);
        int i16 = i - (i14 / 2);
        int i17 = i2 - (i15 / 2);
        int i18 = i14 + i16;
        int i19 = i15 + i17;
        drawable.setBounds(i16, i17, i18, i19);
        drawable.draw(canvas2);
        if (this.f44787) {
            c4916.setColor(-1333755649);
            Rect rect = this.f44799;
            canvas2.drawRect(i16 + (rect.left * fMin), i17 + (rect.top * fMin), i18 - (rect.right * fMin), i19 - (rect.bottom * fMin), c4916);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33204(float f) {
        this.f44798 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33208(float f) {
        this.f44789 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33207(boolean z) {
        this.f44787 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33203() {
        this.f44800 = (this.f44800 + 1) % 4;
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
            this.f44794 = 0;
            this.f44804 = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f44794++;
                        if (!this.f44804) {
                            this.f44802 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.f44795 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            this.f44793 = this.f44798;
                            this.f44805 = this.f44789;
                            this.f44804 = true;
                            this.f44790 = false;
                            return true;
                        }
                    } else if (actionMasked == 6) {
                        this.f44794--;
                        return true;
                    }
                }
            } else if (this.f44794 == 1 && this.f44804) {
                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                if (this.f44790) {
                    width = (int) ((((fAbs - this.f44802) / getWidth()) + this.f44793) * 100.0f);
                    height = (int) ((((fAbs2 - this.f44795) / getHeight()) + this.f44805) * 100.0f);
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
                    this.f44798 = width / 100.0f;
                    this.f44789 = i / 100.0f;
                    seekBar = this.f44796;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f44792;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                } else if (Math.abs(fAbs - this.f44802) > this.f44791 || Math.abs(fAbs2 - this.f44795) > this.f44791) {
                    this.f44790 = true;
                    width = (int) ((((fAbs - this.f44802) / getWidth()) + this.f44793) * 100.0f);
                    height = (int) ((((fAbs2 - this.f44795) / getHeight()) + this.f44805) * 100.0f);
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
                    this.f44798 = width / 100.0f;
                    this.f44789 = i / 100.0f;
                    seekBar = this.f44796;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f44792;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                }
            }
            return true;
        }
        this.f44804 = false;
        return true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putFloat("xScale", this.f44798);
        bundle.putFloat("yScale", this.f44789);
        bundle.putBoolean("drawContentRegion", this.f44787);
        bundle.putInt("backgroundMode", this.f44800);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getBundle("super"));
            this.f44798 = bundle.getFloat("xScale");
            this.f44789 = bundle.getFloat("yScale");
            this.f44787 = bundle.getBoolean("drawContentRegion");
            this.f44800 = bundle.getInt("backgroundMode");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
