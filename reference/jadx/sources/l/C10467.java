package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public class C10467 extends Spinner {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"ResourceType"})
    public static final int[] f33311 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC19418 f33312;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Rect f33313;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Context f33314;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public SpinnerAdapter f33315;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0378 f33316;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC5028 f33317;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f33318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33319;

    public C10467(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    public C10467(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM15667;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f33313 = new Rect();
        C9457.m24831(getContext(), this);
        int[] iArr = C10401.f33076;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        this.f33316 = new C0378(this);
        int iM15660 = c5204M15649.m15660(4, 0);
        if (iM15660 != 0) {
            this.f33314 = new C9370(context, iM15660);
        } else {
            this.f33314 = context;
        }
        int i2 = -1;
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33311, i, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    DialogInterfaceOnClickListenerC6740 dialogInterfaceOnClickListenerC6740 = new DialogInterfaceOnClickListenerC6740(this);
                    this.f33312 = dialogInterfaceOnClickListenerC6740;
                    dialogInterfaceOnClickListenerC6740.mo18836(c5204M15649.m15661(2));
                } else if (i2 == 1) {
                    C18672 c18672 = new C18672(this, this.f33314, attributeSet, i);
                    C5204 c5204M156410 = C5204.m15649(this.f33314, attributeSet, iArr, i, 0);
                    this.f33319 = c5204M156410.m15662(3, -2);
                    c18672.setBackgroundDrawable(c5204M156410.m15669(1));
                    c18672.mo18836(c5204M15649.m15661(2));
                    c5204M156410.m15664();
                    this.f33312 = c18672;
                    this.f33317 = new C3756(this, this, c18672);
                }
                charSequenceArrM15667 = c5204M15649.m15667();
                if (charSequenceArrM15667 != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM15667);
                    arrayAdapter.setDropDownViewResource(bin.mt.plus.R.layout.MT_Protector);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c5204M15649.m15664();
                this.f33318 = true;
                spinnerAdapter = this.f33315;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f33315 = null;
                }
                this.f33316.m2178(attributeSet, i);
            } catch (Throwable th) {
                th = th;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC6740 dialogInterfaceOnClickListenerC6741 = new DialogInterfaceOnClickListenerC6740(this);
            this.f33312 = dialogInterfaceOnClickListenerC6741;
            dialogInterfaceOnClickListenerC6741.mo18836(c5204M15649.m15661(2));
        } else if (i2 == 1) {
            C18672 c18673 = new C18672(this, this.f33314, attributeSet, i);
            C5204 c5204M156411 = C5204.m15649(this.f33314, attributeSet, iArr, i, 0);
            this.f33319 = c5204M156411.m15662(3, -2);
            c18673.setBackgroundDrawable(c5204M156411.m15669(1));
            c18673.mo18836(c5204M15649.m15661(2));
            c5204M156411.m15664();
            this.f33312 = c18673;
            this.f33317 = new C3756(this, this, c18673);
        }
        charSequenceArrM15667 = c5204M15649.m15667();
        if (charSequenceArrM15667 != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM15667);
            arrayAdapter2.setDropDownViewResource(bin.mt.plus.R.layout.MT_Protector);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c5204M15649.m15664();
        this.f33318 = true;
        spinnerAdapter = this.f33315;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f33315 = null;
        }
        this.f33316.m2178(attributeSet, i);
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f33314;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0385.m2186(this.f33314, i));
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            interfaceC19418.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            return interfaceC19418.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            interfaceC19418.mo18840(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            return interfaceC19418.mo18837();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            interfaceC19418.mo18838(i);
            interfaceC19418.mo18833(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            return interfaceC19418.mo18832();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f33312 != null) {
            this.f33319 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.f33312 != null) {
            return this.f33319;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f33318) {
            this.f33315 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            Context context = this.f33314;
            if (context == null) {
                context = getContext();
            }
            interfaceC19418.mo18835(new C24640(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 == null || !interfaceC19418.isShowing()) {
            return;
        }
        interfaceC19418.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5028 abstractViewOnTouchListenerC5028 = this.f33317;
        if (abstractViewOnTouchListenerC5028 == null || !abstractViewOnTouchListenerC5028.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f33312 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m26890(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            if (interfaceC19418.isShowing()) {
                return true;
            }
            m26892();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC19418 interfaceC19418 = this.f33312;
        if (interfaceC19418 != null) {
            interfaceC19418.mo18836(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC19418 interfaceC19418 = this.f33312;
        return interfaceC19418 != null ? interfaceC19418.mo18839() : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.f33316;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.f33316;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0378 c0378 = this.f33316;
        if (c0378 != null) {
            c0378.m2174();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26890(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = 0;
        View view = null;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f33313;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19418 m26891() {
        return this.f33312;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26892() {
        this.f33312.mo18834(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C8231 c8231 = new C8231(super.onSaveInstanceState());
        InterfaceC19418 interfaceC19418 = this.f33312;
        c8231.f27092 = interfaceC19418 != null && interfaceC19418.isShowing();
        return c8231;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C8231 c8231 = (C8231) parcelable;
        super.onRestoreInstanceState(c8231.getSuperState());
        if (!c8231.f27092 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20910(this));
    }
}
