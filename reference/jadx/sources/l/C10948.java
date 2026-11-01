package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.DateKeyListener;
import android.text.method.DateTimeKeyListener;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.TimeKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۧۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes4.dex */
public class C10948 extends C6111 {

    /* JADX INFO: renamed from: ۟ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37220 = 0;

    /* JADX INFO: renamed from: ۘۚ, reason: not valid java name and contains not printable characters */
    public int f37221;

    /* JADX INFO: renamed from: ۜۚ, reason: not valid java name and contains not printable characters */
    public int f37222;

    /* JADX INFO: renamed from: ۠ۚ, reason: not valid java name and contains not printable characters */
    public final Rect f37223;

    /* JADX INFO: renamed from: ۡۚ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnPreDrawListener f37224;

    /* JADX INFO: renamed from: ۤۚ, reason: not valid java name and contains not printable characters */
    public boolean f37225;

    /* JADX INFO: renamed from: ۬ۚ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f37226;

    /* JADX INFO: renamed from: ܶۚ, reason: not valid java name and contains not printable characters */
    public int f37227;

    /* JADX INFO: renamed from: ᩳۚ, reason: not valid java name and contains not printable characters */
    public int f37228;

    /* JADX INFO: renamed from: ᩴۚ, reason: not valid java name and contains not printable characters */
    public int f37229;

    /* JADX INFO: renamed from: ᩵ۚ, reason: not valid java name and contains not printable characters */
    public boolean f37230;

    /* JADX INFO: renamed from: ᩸ۚ, reason: not valid java name and contains not printable characters */
    public final Rect f37231;

    /* JADX INFO: renamed from: ᩺ۚ, reason: not valid java name and contains not printable characters */
    public NumberKeyListener f37232;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ܺۨ */
    public final boolean mo17013() {
        return true;
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩳۨ */
    public final boolean mo17027() {
        return false;
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩷ܰ */
    public final boolean mo17048() {
        return false;
    }

    public C10948(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37227 = -1;
        this.f37231 = new Rect();
        this.f37223 = new Rect();
        this.f37224 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.ܿۧۖ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10948.m27467(this.f55058);
                return true;
            }
        };
        this.f37222 = 524289;
        this.f37221 = -1;
        this.f37232 = null;
        this.f37226 = C11092.f37657;
        m27466(attributeSet);
    }

    public C10948(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37227 = -1;
        this.f37231 = new Rect();
        this.f37223 = new Rect();
        this.f37224 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.ܿۧۖ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10948.m27467(this.f55058);
                return true;
            }
        };
        this.f37222 = 524289;
        this.f37221 = -1;
        this.f37232 = null;
        this.f37226 = C11092.f37657;
        m27466(attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        C11018 c11018 = new C11018();
        m16870(c11018, false);
        bundle.putByteArray("mt.memory.editor", c11018.m27798());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (C8603.m22380(bundle, "mt.memory.editor")) {
                super.onRestoreInstanceState(bundle.getParcelable("parent"));
                byte[] bArrM22381 = C8603.m22381(bundle, "mt.memory.editor");
                if (bArrM22381 != null) {
                    mo16878(C17367.m40441(bArrM22381));
                    return;
                }
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ۙ */
    public final void mo16878(C17367 c17367) {
        super.mo16878(c17367);
        m27473(this.f37226);
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ۨ */
    public void mo16959() {
        super.mo16959();
        C1590 c1590 = this.f20794;
        c1590.f6403 = 0;
        c1590.f6436 = 0;
        if (!isInEditMode() && C20368.m45991()) {
            c1590.f6431 = -1433892728;
        }
        int i = c1590.f6394;
        c1590.f6394 = (i & 16777215) | (((int) (Color.alpha(i) * 0.5f)) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:8:0x004c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27466(AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        String string;
        m16911();
        setSaveEnabled(true);
        m17059();
        m16907(false);
        C1590 c1590 = this.f20794;
        c1590.f6388 = false;
        c1590.f6403 = 0;
        c1590.f6436 = 0;
        c1590.f6404 = 0;
        c1590.f6412 = 0;
        c1590.f6429 = false;
        c1590.f6423 = false;
        c1590.f6391 = false;
        c1590.f6428 = false;
        c1590.f6439 = c1590.f6370;
        c1590.f6416 = 0;
        c1590.f6369 /= 2.0f;
        c1590.f6395 = true;
        c1590.f6426 = false;
        c1590.f6402 = false;
        c1590.f6401 = true;
        if (isInEditMode()) {
            z = true;
        } else {
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
            if (C16737.f53615.getBoolean("edit_show_ascii_control", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        c1590.m17869(z);
        if (isInEditMode()) {
            z2 = true;
        } else {
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC15618.f50785;
            if (C16737.f53615.getBoolean("edit_show_unicode_special", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c1590.m17853(z2);
        if (!isInEditMode() && C20368.m45991()) {
            c1590.f6431 = -1433892728;
        }
        int i3 = c1590.f6394;
        c1590.f6394 = (i3 & 16777215) | (((int) (Color.alpha(i3) * 0.5f)) << 24);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8270.f28749);
        int i4 = typedArrayObtainStyledAttributes.getInt(4, -1);
        int i5 = typedArrayObtainStyledAttributes.getInt(3, -1);
        int i6 = typedArrayObtainStyledAttributes.getInt(5, -1);
        int i7 = i4 == -1 ? i5 : i4;
        int i8 = i6 == -1 ? i4 : i6;
        if (i7 == -1) {
            i7 = Integer.MAX_VALUE;
        }
        if (i8 == -1) {
            i8 = 0;
        }
        this.f37228 = i7;
        this.f37229 = i8;
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            m27476(typedArrayObtainStyledAttributes.getBoolean(6, true));
        } else {
            m27476(i4 <= 1 && i6 <= 1 && i5 <= 1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            m16930(1);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            m16985(dimension);
        } else {
            m16960(18.0f);
        }
        m16962(typedArrayObtainStyledAttributes.getString(2));
        super.mo16989((CharSequence) typedArrayObtainStyledAttributes.getString(1));
        if (!isInEditMode() && (string = typedArrayObtainStyledAttributes.getString(9)) != null && !string.isEmpty()) {
            m16857(string, true);
        }
        m27483(typedArrayObtainStyledAttributes.getInt(10, 0));
        int i9 = typedArrayObtainStyledAttributes.getInt(7, -1);
        if (i9 != -1) {
            m27484(i9);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37287();
    }

    @Override // l.C6111, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m16944();
        m17003();
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩻ۨ */
    public final boolean mo17071() {
        return m16842() > 1000;
    }

    @Override // l.C6111, android.view.View
    public final void onDraw(Canvas canvas) {
        m27468(isAttachedToWindow() && mo17071());
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27467(C10948 c10948) {
        Rect rect = c10948.f37231;
        Rect rect2 = c10948.f37223;
        if (!c10948.mo17071()) {
            c10948.m27468(false);
            return;
        }
        if (!c10948.isShown() || !c10948.getLocalVisibleRect(rect2)) {
            rect2.setEmpty();
        }
        if (rect.equals(rect2)) {
            return;
        }
        rect.set(rect2);
        if (rect2.isEmpty()) {
            return;
        }
        c10948.invalidate();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m27468(boolean z) {
        if (this.f37225 == z) {
            return;
        }
        this.f37225 = z;
        this.f37231.setEmpty();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f37224;
        if (z) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // l.C6111, android.view.View
    public final void onDetachedFromWindow() {
        m27468(false);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ᩺ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m27487() {
        Drawable background = getBackground();
        return (background instanceof C6008) && ((C6008) background).f20419 == 1;
    }

    /* JADX INFO: renamed from: ܶۖ, reason: not valid java name and contains not printable characters */
    public final boolean m27480() {
        Drawable background = getBackground();
        return (background instanceof C6008) && ((C6008) background).f20419 == 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27483(int i) {
        Drawable background = getBackground();
        if ((background instanceof C6008) && ((C6008) background).f20419 == i) {
            return;
        }
        super.setBackground(new C6008(getContext(), i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m27465(Context context, int i) {
        return new C6008(context, i);
    }

    /* JADX INFO: renamed from: ֨ۖ, reason: not valid java name and contains not printable characters */
    public final void m27470() {
        this.f20794.f6424 = false;
        this.f20710.m3673();
        invalidate();
    }

    /* JADX INFO: renamed from: ۬ۖ, reason: not valid java name and contains not printable characters */
    public final void m27478() {
        this.f20794.f6424 = true;
        this.f20710.m3673();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f37227 = -1;
        } else {
            if (mode != Integer.MIN_VALUE) {
                size = Integer.MAX_VALUE;
            }
            int iM16923 = this.f37229;
            if (iM16923 != this.f37228) {
                this.f20764.mo14805((defaultSize - getPaddingLeft()) - getPaddingRight());
                iM16923 = m16923();
                this.f37227 = iM16923;
                int i3 = this.f37228;
                if (iM16923 > i3 || iM16923 < (i3 = this.f37229)) {
                    iM16923 = i3;
                }
            } else {
                this.f37227 = -1;
            }
            if (iM16923 <= 0) {
                iM16923 = 1;
            }
            int iM17870 = ((int) ((this.f20794.m17870() * iM16923) + getPaddingTop() + getPaddingBottom())) + 1;
            if (iM17870 <= size) {
                size = iM17870;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ۜ */
    public final void mo16920(int i) {
        int i2;
        int i3;
        if (getLayoutParams().height != -2 || (i2 = this.f37229) == (i3 = this.f37228)) {
            return;
        }
        int i4 = this.f37227;
        if (i4 != -1) {
            if (i4 <= i2 && i <= i2) {
                return;
            }
            if (i3 > 0 && i4 >= i3 && i >= i3) {
                return;
            }
        }
        requestLayout();
    }

    public C10948(Context context) {
        super(context, null);
        this.f37227 = -1;
        this.f37231 = new Rect();
        this.f37223 = new Rect();
        this.f37224 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.ܿۧۖ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10948.m27467(this.f55058);
                return true;
            }
        };
        this.f37222 = 524289;
        this.f37221 = -1;
        this.f37232 = null;
        this.f37226 = C11092.f37657;
        m27466((AttributeSet) null);
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩺ۨ */
    public final void mo17067() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return;
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m27484(int i) {
        NumberKeyListener dialerKeyListener;
        if (this.f37222 != i) {
            this.f37222 = i;
            boolean z = !((131087 & i) == 131073);
            if (this.f37230 != z) {
                this.f37230 = z;
                m17049();
            }
            int i2 = i & 15;
            if (i2 == 2) {
                dialerKeyListener = DigitsKeyListener.getInstance((i & 4096) != 0, (i & 8192) != 0);
            } else if (i2 == 4) {
                int i3 = i & 4080;
                if (i3 == 16) {
                    dialerKeyListener = DateKeyListener.getInstance();
                } else if (i3 == 32) {
                    dialerKeyListener = TimeKeyListener.getInstance();
                } else {
                    dialerKeyListener = DateTimeKeyListener.getInstance();
                }
            } else {
                dialerKeyListener = i2 == 3 ? DialerKeyListener.getInstance() : null;
            }
            if (this.f37232 != dialerKeyListener) {
                this.f37232 = dialerKeyListener;
                m27473(this.f37226);
            }
            if (isAttachedToWindow() && hasFocus()) {
                m17017();
            }
        }
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩵ۙ */
    public final int mo17038() {
        return this.f37222;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m27481(int i) {
        if (i != -1) {
            i |= 33554432;
        }
        this.f37221 = i;
        if (isAttachedToWindow() && hasFocus()) {
            m17017();
        }
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ۠ۙ */
    public final int mo16933() {
        int i = this.f37221;
        if (i != -1) {
            return i;
        }
        if (this.f37230) {
            return focusSearch(130) != null ? 33554437 : 33554438;
        }
        return 33554433;
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ۙۨ */
    public final boolean mo16903() {
        return this.f37230;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27476(boolean z) {
        if (this.f37230 != z) {
            this.f37230 = z;
            m17049();
            int i = this.f37222;
            if ((i & 15) == 1) {
                if (z) {
                    this.f37222 = (-131073) & i;
                } else {
                    this.f37222 = 131072 | i;
                }
            }
            if (isAttachedToWindow() && hasFocus()) {
                m17017();
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m27469(int i) {
        this.f37229 = i;
        this.f37228 = i;
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۜۖ, reason: not valid java name and contains not printable characters */
    public final int m27475() {
        return this.f37229;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m27477(int i) {
        this.f37229 = i;
        if (i > this.f37228) {
            this.f37228 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۘۖ, reason: not valid java name and contains not printable characters */
    public final int m27471() {
        return this.f37228;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27482(int i) {
        this.f37228 = i;
        if (i < this.f37229) {
            this.f37229 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ܰ */
    public final void mo16989(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        InterfaceC2916 interfaceC2916M17000 = m17000();
        interfaceC2916M17000.replace(0, interfaceC2916M17000.length(), charSequence);
        mo17029(0);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m27474(int i) {
        this.f20794.m5430(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27479(Integer num) {
        this.f20794.m5430(num);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27485(int i) {
        this.f20794.m5425(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27472(Integer num) {
        this.f20794.m5425(num);
        invalidate();
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo17052() {
        Drawable background = getBackground();
        if (background instanceof C6008) {
            return ((C6008) background).f20411;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27473(InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new IllegalArgumentException();
        }
        this.f37226 = inputFilterArr;
        NumberKeyListener numberKeyListener = this.f37232;
        if (numberKeyListener == null) {
            m17000().setFilters(inputFilterArr);
            return;
        }
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
        inputFilterArr2[0] = numberKeyListener;
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 1, inputFilterArr.length);
        m17000().setFilters(inputFilterArr2);
    }

    /* JADX INFO: renamed from: ᩸ۖ, reason: not valid java name and contains not printable characters */
    public final void m27486() {
        mo16839(0, m16842());
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ᩴ */
    public final void mo17029(int i) {
        super.mo17029(i);
        m16890(i, false);
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ۘ */
    public final void mo16839(int i, int i2) {
        super.mo16839(i, i2);
        m16992(false);
    }

    @Override // l.C6111
    /* JADX INFO: renamed from: ܿܰ */
    public boolean mo17022() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC15618.m37284();
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getPaddingTop() + ((int) this.f20794.m17851());
    }
}
