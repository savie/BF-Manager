package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.DateKeyListener;
import android.text.method.DateTimeKeyListener;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.TimeKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes.dex */
public class C23255 extends C24132 {

    /* JADX INFO: renamed from: ۙܳ, reason: not valid java name and contains not printable characters */
    public static final C12895 f75337 = new C12895(-1, -1);

    /* JADX INFO: renamed from: ۬ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75338 = 0;

    /* JADX INFO: renamed from: ֡ᩴ, reason: not valid java name and contains not printable characters */
    public int f75339;

    /* JADX INFO: renamed from: ֨ᩴ, reason: not valid java name and contains not printable characters */
    public final Rect f75340;

    /* JADX INFO: renamed from: ۖᩴ, reason: not valid java name and contains not printable characters */
    public boolean f75341;

    /* JADX INFO: renamed from: ۗᩴ, reason: not valid java name and contains not printable characters */
    public int f75342;

    /* JADX INFO: renamed from: ۘᩴ, reason: not valid java name and contains not printable characters */
    public final Rect f75343;

    /* JADX INFO: renamed from: ۛᩴ, reason: not valid java name and contains not printable characters */
    public NumberKeyListener f75344;

    /* JADX INFO: renamed from: ۜᩴ, reason: not valid java name and contains not printable characters */
    public boolean f75345;

    /* JADX INFO: renamed from: ۟ᩴ, reason: not valid java name and contains not printable characters */
    public int f75346;

    /* JADX INFO: renamed from: ۠ᩴ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnPreDrawListener f75347;

    /* JADX INFO: renamed from: ۡᩴ, reason: not valid java name and contains not printable characters */
    public boolean f75348;

    /* JADX INFO: renamed from: ۢᩴ, reason: not valid java name and contains not printable characters */
    public boolean f75349;

    /* JADX INFO: renamed from: ۨᩴ, reason: not valid java name and contains not printable characters */
    public int f75350;

    /* JADX INFO: renamed from: ܰᩴ, reason: not valid java name and contains not printable characters */
    public int f75351;

    /* JADX INFO: renamed from: ܶᩴ, reason: not valid java name and contains not printable characters */
    public final Runnable f75352;

    /* JADX INFO: renamed from: ܺᩴ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f75353;

    /* JADX INFO: renamed from: ܽᩴ, reason: not valid java name and contains not printable characters */
    public int f75354;

    /* JADX INFO: renamed from: ܿᩴ, reason: not valid java name and contains not printable characters */
    public int f75355;

    /* JADX INFO: renamed from: ᩳᩴ, reason: not valid java name and contains not printable characters */
    public long f75356;

    /* JADX INFO: renamed from: ᩵ᩴ, reason: not valid java name and contains not printable characters */
    public Runnable f75357;

    /* JADX INFO: renamed from: ᩶ᩴ, reason: not valid java name and contains not printable characters */
    public int f75358;

    /* JADX INFO: renamed from: ᩹ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f75359;

    /* JADX INFO: renamed from: ᩺ᩴ, reason: not valid java name and contains not printable characters */
    public int f75360;

    /* JADX INFO: renamed from: ᩻ᩴ, reason: not valid java name and contains not printable characters */
    public int f75361;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m52280(int i) {
        int i2 = i & 15;
        int i3 = i & 4080;
        if (i2 != 2 || i3 != 16) {
            if (i2 != 1) {
                return false;
            }
            if (i3 != 128 && i3 != 224 && i3 != 144) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo52311() {
        return false;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۡۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo52313() {
        return true;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ܰۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo52322() {
        return false;
    }

    public C23255(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75359 = true;
        this.f75348 = true;
        this.f75339 = -1;
        this.f75352 = new Runnable() { // from class: l.ۧۖ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C23255.m52285(this.f35675);
            }
        };
        this.f75360 = -1;
        this.f75343 = new Rect();
        this.f75340 = new Rect();
        this.f75347 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.᩻ۖ᩸
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C23255.m52279(this.f80128);
                return true;
            }
        };
        this.f75350 = 524289;
        this.f75342 = -1;
        this.f75344 = null;
        this.f75353 = C5068.f17657;
        m52278(attributeSet);
    }

    public C23255(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75359 = true;
        this.f75348 = true;
        this.f75339 = -1;
        this.f75352 = new Runnable() { // from class: l.ۧۖ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C23255.m52285(this.f35675);
            }
        };
        this.f75360 = -1;
        this.f75343 = new Rect();
        this.f75340 = new Rect();
        this.f75347 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.᩻ۖ᩸
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C23255.m52279(this.f80128);
                return true;
            }
        };
        this.f75350 = 524289;
        this.f75342 = -1;
        this.f75344 = null;
        this.f75353 = C5068.f17657;
        m52278(attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putInt("mt.gravity", this.f75354);
        if (m52280(this.f75350)) {
            return bundle;
        }
        C6178 c6178 = new C6178();
        m53910(c6178, false);
        bundle.putByteArray("mt.memory.editor", c6178.m17799());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("mt.gravity") || C5921.m17233(bundle, "mt.memory.editor")) {
                super.onRestoreInstanceState(bundle.getParcelable("parent"));
                this.f75354 = bundle.getInt("mt.gravity", this.f75354);
                byte[] bArrM17234 = C5921.m17233(bundle, "mt.memory.editor") ? C5921.m17234(bundle, "mt.memory.editor") : null;
                if (!m52280(this.f75350) && bArrM17234 != null) {
                    mo52303(C20348.m46740(bArrM17234));
                }
                m52281();
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۤ */
    public void mo40460() {
        super.mo40460();
        C14540 c14540 = this.f78066;
        c14540.f45799 = 0;
        c14540.f45757 = 0;
        if (!isInEditMode() && C3296.m10878()) {
            c14540.f45743 = -1433892728;
        }
        int i = c14540.f45778;
        c14540.f45778 = (i & 16777215) | (((int) (Color.alpha(i) * 0.5f)) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    /* JADX WARN: Code duplicated, block: B:8:0x004f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52278(AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        String string;
        m54029();
        setSaveEnabled(true);
        m54101();
        m54052(false);
        C14540 c14540 = this.f78066;
        c14540.m16206();
        c14540.f45769 = false;
        c14540.f45799 = 0;
        c14540.f45757 = 0;
        c14540.f45800 = 0;
        c14540.f45809 = 0;
        c14540.f45761 = false;
        c14540.f45745 = false;
        c14540.f45784 = false;
        c14540.f45760 = false;
        c14540.f45793 = c14540.f45746;
        c14540.f45789 = 0;
        c14540.f45765 /= 2.0f;
        c14540.f45813 = true;
        c14540.f45802 = false;
        c14540.f45750 = false;
        c14540.f45749 = true;
        if (isInEditMode()) {
            z = true;
        } else {
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
            if (C21576.f68932.getBoolean("edit_show_ascii_control", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        c14540.m16207(z);
        if (isInEditMode()) {
            z2 = true;
        } else {
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC3444.f11224;
            if (C21576.f68932.getBoolean("edit_show_unicode_special", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c14540.m16223(z2);
        if (!isInEditMode() && C3296.m10878()) {
            c14540.f45743 = -1433892728;
        }
        int i3 = c14540.f45778;
        c14540.f45778 = (i3 & 16777215) | (((int) (Color.alpha(i3) * 0.5f)) << 24);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3676.f12649);
        int i4 = typedArrayObtainStyledAttributes.getInt(5, -1);
        int i5 = typedArrayObtainStyledAttributes.getInt(4, -1);
        int i6 = typedArrayObtainStyledAttributes.getInt(6, -1);
        int i7 = i4 == -1 ? i5 : i4;
        int i8 = i6 == -1 ? i4 : i6;
        if (i7 == -1) {
            i7 = Integer.MAX_VALUE;
        }
        if (i8 == -1) {
            i8 = 0;
        }
        this.f75351 = i7;
        this.f75358 = i8;
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            m52296(typedArrayObtainStyledAttributes.getBoolean(7, true));
        } else {
            m52296(i4 <= 1 && i6 <= 1 && i5 <= 1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(11, false)) {
            mo52291(1);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            m54071(dimension);
        } else {
            m53981(18.0f);
        }
        m52337(typedArrayObtainStyledAttributes.getString(3));
        super.mo52335((CharSequence) typedArrayObtainStyledAttributes.getString(2));
        if (!isInEditMode() && (string = typedArrayObtainStyledAttributes.getString(12)) != null && !string.isEmpty()) {
            m53903(string, true);
        }
        m52314(typedArrayObtainStyledAttributes.getInt(13, 0));
        int i9 = typedArrayObtainStyledAttributes.getInt(10, -1);
        if (i9 != -1) {
            m52326(i9);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(9);
        int i10 = typedArrayObtainStyledAttributes.getInt(8, -1);
        if (string2 != null || i10 >= 0) {
            ArrayList arrayList = new ArrayList(2);
            if (string2 != null) {
                arrayList.add(DigitsKeyListener.getInstance(string2));
            }
            if (i10 >= 0) {
                arrayList.add(new InputFilter.LengthFilter(i10));
            }
            m52304((InputFilter[]) arrayList.toArray(new InputFilter[0]));
            mo52335((CharSequence) m54021().toString());
        }
        this.f75354 = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11218();
    }

    @Override // l.C24132, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m53955();
        if (this.f75348) {
            m54022();
        }
    }

    /* JADX INFO: renamed from: ۟᩸, reason: not valid java name and contains not printable characters */
    public final void m52312() {
        this.f75348 = false;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩵ۤ, reason: not valid java name and contains not printable characters */
    public final void mo52331() {
        this.f78073 = 0L;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩴ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo52330() {
        return (this.f78073 == 0 && m53968() == m53882()) ? false : true;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩸᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo52338() {
        return m54099() > 1000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52279(C23255 c23255) {
        Rect rect = c23255.f75343;
        Rect rect2 = c23255.f75340;
        if (!c23255.mo52338()) {
            c23255.m52284(false);
            return;
        }
        if (!c23255.isShown() || !c23255.getLocalVisibleRect(rect2)) {
            rect2.setEmpty();
        }
        if (rect.equals(rect2)) {
            return;
        }
        rect.set(rect2);
        if (rect2.isEmpty()) {
            return;
        }
        c23255.invalidate();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m52284(boolean z) {
        if (this.f75345 == z) {
            return;
        }
        this.f75345 = z;
        this.f75343.setEmpty();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f75347;
        if (z) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // l.C24132, android.view.View
    public final void onDetachedFromWindow() {
        m52282(true);
        m52284(false);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ۘ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m52298() {
        Drawable background = getBackground();
        return (background instanceof C15795) && ((C15795) background).f51392 == 1;
    }

    /* JADX INFO: renamed from: ܰ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m52323() {
        Drawable background = getBackground();
        return (background instanceof C15795) && ((C15795) background).f51392 == 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m52314(int i) {
        if (i == 2) {
            super.setBackground(null);
            setPadding(0, 0, 0, 0);
            return;
        }
        Drawable background = getBackground();
        if ((background instanceof C15795) && ((C15795) background).f51392 == i) {
            return;
        }
        super.setBackground(m52277(getContext(), i));
    }

    public C23255(Context context) {
        super(context, null);
        this.f75359 = true;
        this.f75348 = true;
        this.f75339 = -1;
        this.f75352 = new Runnable() { // from class: l.ۧۖ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C23255.m52285(this.f35675);
            }
        };
        this.f75360 = -1;
        this.f75343 = new Rect();
        this.f75340 = new Rect();
        this.f75347 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.᩻ۖ᩸
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C23255.m52279(this.f80128);
                return true;
            }
        };
        this.f75350 = 524289;
        this.f75342 = -1;
        this.f75344 = null;
        this.f75353 = C5068.f17657;
        m52278((AttributeSet) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m52277(Context context, int i) {
        if (i == 2) {
            return null;
        }
        return new C15795(context, i);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m52307(boolean z) {
        if (this.f75359 == z) {
            return;
        }
        this.f75359 = z;
        requestLayout();
        invalidate();
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo52288() {
        return this.f75359;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52302(RunnableC4609 runnableC4609) {
        this.f75357 = runnableC4609;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        boolean z2 = isEnabled() != z;
        super.setEnabled(z);
        if (z2) {
            C14540 c14540 = this.f78066;
            if (c14540 != null) {
                c14540.m35088();
            }
            invalidate();
            Runnable runnable = this.f75357;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۗ᩸, reason: not valid java name and contains not printable characters */
    public final void m52294() {
        this.f78066.f45751 = false;
        this.f78029.m40507();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩵᩸, reason: not valid java name and contains not printable characters */
    public final void m52332() {
        this.f78066.f45751 = true;
        this.f78029.m40507();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f75360 = -1;
        } else {
            if (mode != Integer.MIN_VALUE) {
                size = Integer.MAX_VALUE;
            }
            int iM54038 = this.f75358;
            if (iM54038 != this.f75351) {
                this.f78022.mo25236((defaultSize - getPaddingLeft()) - getPaddingRight());
                iM54038 = m54038();
                this.f75360 = iM54038;
                int i3 = this.f75351;
                if (iM54038 > i3 || iM54038 < (i3 = this.f75358)) {
                    iM54038 = i3;
                }
            } else {
                this.f75360 = -1;
            }
            if (iM54038 <= 0) {
                iM54038 = 1;
            }
            int iMax = Math.max(((int) ((this.f78066.m16189() * iM54038) + getPaddingTop() + getPaddingBottom())) + 1, getSuggestedMinimumHeight());
            if (iMax <= size) {
                size = iMax;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo52315(int i) {
        int i2;
        int i3;
        if (getLayoutParams().height != -2 || (i2 = this.f75358) == (i3 = this.f75351)) {
            return;
        }
        int i4 = this.f75360;
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

    @Override // l.C24132
    /* JADX INFO: renamed from: ۛۤ, reason: not valid java name and contains not printable characters */
    public final void mo52308() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return;
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m52326(int i) {
        if (m52280(i)) {
            i &= -131073;
        }
        int i2 = this.f75350;
        if (i2 != i) {
            boolean z = m52280(i2) || m52280(i);
            m52282(false);
            this.f75350 = i;
            this.f75349 = m52280(i) && (i & 15) == 1 && (i & 4080) == 144;
            NumberKeyListener dialerKeyListener = null;
            this.f78066.m16200(m52283() ? f75337 : null);
            if (m52280(this.f75350)) {
                super.mo52291(0);
            }
            boolean z2 = m52280(this.f75350) || (131087 & i) != 131073;
            if (this.f75341 != z2) {
                this.f75341 = z2;
                super.m54023();
                m52281();
            }
            int i3 = i & 15;
            if (i3 == 2) {
                dialerKeyListener = DigitsKeyListener.getInstance((i & 4096) != 0, (i & 8192) != 0);
            } else if (i3 == 4) {
                int i4 = i & 4080;
                if (i4 != 16) {
                    dialerKeyListener = i4 != 32 ? DateTimeKeyListener.getInstance() : TimeKeyListener.getInstance();
                } else {
                    dialerKeyListener = DateKeyListener.getInstance();
                }
            } else if (i3 == 3) {
                dialerKeyListener = DialerKeyListener.getInstance();
            }
            if (this.f75344 != dialerKeyListener) {
                this.f75344 = dialerKeyListener;
                m52304(this.f75353);
            }
            if (z) {
                m52276();
                m53881();
            }
            if (isAttachedToWindow() && hasFocus()) {
                m53962();
            }
            Runnable runnable = this.f75357;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ᩸, reason: not valid java name and contains not printable characters */
    private boolean m52283() {
        return m52280(this.f75350) && !this.f75349;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void mo52291(int i) {
        if (m52280(this.f75350)) {
            i = 0;
        }
        super.mo52291(i);
        m52281();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m52296(boolean z) {
        if (m52280(this.f75350)) {
            z = true;
        }
        if (this.f75341 != z) {
            this.f75341 = z;
            super.m54023();
            m52281();
            int i = this.f75350;
            if ((i & 15) == 1) {
                if (z) {
                    this.f75350 = (-131073) & i;
                } else {
                    this.f75350 = 131072 | i;
                }
            }
            if (isAttachedToWindow() && hasFocus()) {
                m53962();
            }
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo52303(C20348 c20348) {
        if (m52280(this.f75350)) {
            return;
        }
        super.mo52303(c20348);
        m52304(this.f75353);
    }

    /* JADX INFO: renamed from: ܿ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m52327() {
        return m52280(this.f75350) && this.f75349;
    }

    /* JADX INFO: renamed from: ᩶᩸, reason: not valid java name and contains not printable characters */
    public final boolean m52334() {
        return m52280(this.f75350);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m52340(boolean z) {
        if (!m52280(this.f75350) || this.f75349 == z) {
            return;
        }
        m52282(false);
        this.f75349 = z;
        this.f78066.m16200(m52283() ? f75337 : null);
        m52276();
        m53881();
        Runnable runnable = this.f75357;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֨᩸, reason: not valid java name and contains not printable characters */
    private void m52276() {
        AbstractC13753 abstractC13753 = this.f78022;
        if (abstractC13753 == null) {
            return;
        }
        abstractC13753.mo25235();
        this.f78022.m33633();
        m53969();
        scrollTo(m53948(getScrollX()), m53873(m54026()));
        m53931(false);
        m54041();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m52282(boolean z) {
        C12895 c12895M16226;
        if (this.f75356 == 0) {
            return;
        }
        Runnable runnable = this.f75352;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f75356 = 0L;
        C14540 c14540 = this.f78066;
        if (c14540 == null || (c12895M16226 = c14540.m16226()) == null) {
            return;
        }
        C12895 c12895 = f75337;
        if (c12895M16226.equals(c12895)) {
            return;
        }
        c14540.m16200(c12895);
        if (z) {
            m52276();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52285(C23255 c23255) {
        if (c23255.f75356 == 0 || SystemClock.uptimeMillis() < c23255.f75356) {
            return;
        }
        c23255.m52282(true);
    }

    @Override // l.C24132, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f75356 != 0 && SystemClock.uptimeMillis() >= this.f75356) {
            m52282(true);
        }
        m52284(isAttachedToWindow() && mo52338());
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52336(Integer num) {
        C14540 c14540 = this.f78066;
        c14540.f45815 = num;
        c14540.m35088();
        invalidate();
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo52319() {
        if (m52283()) {
            int i = this.f75346;
            this.f75346 = i + 1;
            if (i == 0) {
                m52282(true);
                this.f75339 = -1;
                this.f75355 = 0;
            }
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void mo52306() {
        int iM6074;
        int i = this.f75346;
        if (i != 0) {
            int i2 = i - 1;
            this.f75346 = i2;
            if (i2 == 0 && m52283() && hasFocus() && hasWindowFocus() && isShown() && this.f75339 >= 0 && this.f75355 != 0) {
                InterfaceC19106 interfaceC19106M54021 = m54021();
                int i3 = this.f75339 + this.f75355;
                if (i3 <= interfaceC19106M54021.length() && (iM6074 = C1709.m6074(i3, interfaceC19106M54021)) <= this.f75339 && C1709.m6073(iM6074, interfaceC19106M54021.length(), interfaceC19106M54021) == i3) {
                    for (int i4 = iM6074; i4 < i3; i4++) {
                        if (Character.isISOControl(interfaceC19106M54021.charAt(i4))) {
                            return;
                        }
                    }
                    if (m53968() == i3 && m53882() == i3) {
                        this.f78066.m16200(new C12895(iM6074, i3));
                        this.f75356 = SystemClock.uptimeMillis() + 1500;
                        postDelayed(this.f75352, 1500L);
                        m52276();
                    }
                }
            }
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public final void mo52293() {
        m52282(false);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo52329(int i, int i2) {
        if (this.f75346 > 0) {
            this.f75339 = i;
            this.f75355 = i2;
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo52299(int i, int i2) {
        if (this.f75346 == 0) {
            m52282(true);
        }
        super.mo52299(i, i2);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ܺ᩸, reason: not valid java name and contains not printable characters */
    public final void mo52325() {
        m52282(true);
        super.mo52325();
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ֡ۤ, reason: not valid java name and contains not printable characters */
    public final void mo52287() {
        m52282(true);
        super.mo52287();
    }

    @Override // l.C24132, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent == null) {
            keyEvent = new KeyEvent(0, i);
        }
        if (m52283() && (i == 278 || i == 277 || (keyEvent.isCtrlPressed() && (i == 31 || i == 52)))) {
            return true;
        }
        if (!keyEvent.isCtrlPressed() && !keyEvent.isAltPressed() && keyEvent.getUnicodeChar() != 0) {
            z = true;
        }
        if (z) {
            mo52319();
        }
        try {
            return super.onKeyDown(i, keyEvent);
        } finally {
            if (z) {
                mo52306();
            }
        }
    }

    @Override // l.C24132, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            m52282(true);
        }
        super.onFocusChanged(z, i, rect);
        Runnable runnable = this.f75357;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.C24132, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            m52282(true);
        }
        super.onWindowFocusChanged(z);
    }

    @Override // l.C24132, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (i != 0) {
            m52282(true);
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // l.C24132, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        if (i != 0) {
            m52282(true);
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // l.C24132, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setPassword(m52280(this.f75350));
    }

    @Override // l.C24132, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setPassword(m52280(this.f75350));
    }

    @Override // l.C24132, android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!m52283()) {
            super.onPopulateAccessibilityEvent(accessibilityEvent);
            return;
        }
        if (m54099() != 0) {
            int iMin = Math.min(m54099(), 10000);
            StringBuilder sb = new StringBuilder(iMin);
            for (int i = 0; i < iMin; i++) {
                sb.append((char) 8226);
            }
            accessibilityEvent.getText().add(sb.toString());
            return;
        }
        if (this.f78022.f43673 != null) {
            accessibilityEvent.getText().add(this.f78022.f43673);
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo52301(ArrayList arrayList) {
        super.mo52301(arrayList);
        if (m52283()) {
            C1170.removeIf(arrayList, new C16541(0));
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo52343(int i) {
        if (!m52283() || i == 17039373 || i == R.string.MT_Protector || i == 17039371 || i == R.string.MT_Protector) {
            super.mo52343(i);
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo52324(int i) {
        if (m52283() && (i == 16908321 || i == 16908320)) {
            return;
        }
        super.mo52324(i);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo52305(CharSequence charSequence) {
        return !m52283() && super.mo52305(charSequence);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int mo52297() {
        return this.f75350;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m52333(int i) {
        if (i != -1) {
            i |= 33554432;
        }
        this.f75342 = i;
        if (isAttachedToWindow() && hasFocus()) {
            m53962();
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int mo52341() {
        int i = this.f75342;
        if (i != -1) {
            return i;
        }
        if (this.f75341) {
            return focusSearch(130) != null ? 33554437 : 33554438;
        }
        return 33554433;
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo52320() {
        return this.f75341;
    }

    /* JADX INFO: renamed from: ۨ᩸, reason: not valid java name and contains not printable characters */
    public final int m52318() {
        if (this.f75341 && m54009() == 0) {
            return this.f75354;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ᩸, reason: not valid java name and contains not printable characters */
    private void m52281() {
        if (this.f78022 == null || this.f75354 == 0) {
            return;
        }
        m53969();
        scrollTo(m53948(getScrollX()), m53873(m54026()));
        if (m53882() >= 0) {
            m53931(false);
        }
        m54041();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m52286(int i) {
        this.f75358 = i;
        this.f75351 = i;
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩺᩸, reason: not valid java name and contains not printable characters */
    public final int m52342() {
        return this.f75358;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52328(int i) {
        this.f75358 = i;
        if (i > this.f75351) {
            this.f75351 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۛ᩸, reason: not valid java name and contains not printable characters */
    public final int m52309() {
        return this.f75351;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m52310(int i) {
        this.f75351 = i;
        if (i < this.f75358) {
            this.f75358 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo52335(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        InterfaceC19106 interfaceC19106M54021 = m54021();
        interfaceC19106M54021.replace(0, interfaceC19106M54021.length(), charSequence);
        mo52339(0);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m52290(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C14540 c14540 = this.f78066;
        c14540.f45815 = numValueOf;
        c14540.m35088();
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52321(int i) {
        this.f78066.m35084(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52300(Integer num) {
        this.f78066.m35084(num);
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m52295(int i) {
        if (this.f75361 == i) {
            return;
        }
        this.f75361 = i;
        setPadding(getPaddingLeft(), getPaddingTop() - m54043(), getPaddingRight(), i);
        invalidate();
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final float mo52317() {
        if (getWidth() <= 0 || this.f78022.mo25232() <= getWidth() * 2.0f) {
            return 0.0f;
        }
        return super.mo52317();
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int mo52292() {
        int i = this.f75361;
        Drawable background = getBackground();
        return i + (background instanceof C15795 ? ((C15795) background).f51384 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52304(InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new IllegalArgumentException();
        }
        this.f75353 = inputFilterArr;
        NumberKeyListener numberKeyListener = this.f75344;
        if (numberKeyListener == null) {
            m54021().setFilters(inputFilterArr);
            return;
        }
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
        inputFilterArr2[0] = numberKeyListener;
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 1, inputFilterArr.length);
        m54021().setFilters(inputFilterArr2);
    }

    /* JADX INFO: renamed from: ֡᩸, reason: not valid java name and contains not printable characters */
    public final void m52289() {
        mo52316(0, m54099());
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo52339(int i) {
        super.mo52339(i);
        m53935(i, false);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo52316(int i, int i2) {
        super.mo52316(i, i2);
        m54077(false);
    }

    @Override // l.C24132
    /* JADX INFO: renamed from: ۠᩷ */
    public boolean mo40459() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11212();
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getPaddingTop() + ((int) (this.f78066.m16203() + this.f78022.m33644(false)));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52337(String str) {
        if (C17359.equals(this.f78022.f43673, str)) {
            return;
        }
        this.f78022.mo25223(str);
        invalidate();
        requestLayout();
        Runnable runnable = this.f75357;
        if (runnable != null) {
            runnable.run();
        }
    }
}
