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

/* JADX INFO: renamed from: l.۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public class C12709 extends Spinner {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    @SuppressLint({"ResourceType"})
    public static final int[] f42385 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC9658 f42386;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public SpinnerAdapter f42387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Rect f42388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Context f42389;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19993 f42390;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC16942 f42391;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f42392;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42393;

    public C12709(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    public C12709(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM6386;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f42388 = new Rect();
        C17500.m40762(getContext(), this);
        int[] iArr = C12108.f40511;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        this.f42390 = new C19993(this);
        int iM6387 = c1977M6353.m6387(4, 0);
        if (iM6387 != 0) {
            this.f42389 = new C5716(context, iM6387);
        } else {
            this.f42389 = context;
        }
        int i2 = -1;
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f42385, i, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    DialogInterfaceOnClickListenerC19765 dialogInterfaceOnClickListenerC19765 = new DialogInterfaceOnClickListenerC19765(this);
                    this.f42391 = dialogInterfaceOnClickListenerC19765;
                    dialogInterfaceOnClickListenerC19765.mo38351(c1977M6353.m6388(2));
                } else if (i2 == 1) {
                    C16237 c16237 = new C16237(this, this.f42389, attributeSet, i);
                    C1977 c1977M6354 = C1977.m6353(this.f42389, attributeSet, iArr, i, 0);
                    this.f42393 = c1977M6354.m6377(3, -2);
                    c16237.setBackgroundDrawable(c1977M6354.m6370(1));
                    c16237.mo38351(c1977M6353.m6388(2));
                    c1977M6354.m6379();
                    this.f42391 = c16237;
                    this.f42386 = new C18353(this, this, c16237);
                }
                charSequenceArrM6386 = c1977M6353.m6386();
                if (charSequenceArrM6386 != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM6386);
                    arrayAdapter.setDropDownViewResource(bin.mt.plus.R.layout.MT_Protector);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c1977M6353.m6379();
                this.f42392 = true;
                spinnerAdapter = this.f42387;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f42387 = null;
                }
                this.f42390.m45278(attributeSet, i);
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
            DialogInterfaceOnClickListenerC19765 dialogInterfaceOnClickListenerC19766 = new DialogInterfaceOnClickListenerC19765(this);
            this.f42391 = dialogInterfaceOnClickListenerC19766;
            dialogInterfaceOnClickListenerC19766.mo38351(c1977M6353.m6388(2));
        } else if (i2 == 1) {
            C16237 c16238 = new C16237(this, this.f42389, attributeSet, i);
            C1977 c1977M6355 = C1977.m6353(this.f42389, attributeSet, iArr, i, 0);
            this.f42393 = c1977M6355.m6377(3, -2);
            c16238.setBackgroundDrawable(c1977M6355.m6370(1));
            c16238.mo38351(c1977M6353.m6388(2));
            c1977M6355.m6379();
            this.f42391 = c16238;
            this.f42386 = new C18353(this, this, c16238);
        }
        charSequenceArrM6386 = c1977M6353.m6386();
        if (charSequenceArrM6386 != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM6386);
            arrayAdapter2.setDropDownViewResource(bin.mt.plus.R.layout.MT_Protector);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c1977M6353.m6379();
        this.f42392 = true;
        spinnerAdapter = this.f42387;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f42387 = null;
        }
        this.f42390.m45278(attributeSet, i);
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f42389;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C15945.m37904(this.f42389, i));
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            interfaceC16942.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            return interfaceC16942.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            interfaceC16942.mo39657(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            return interfaceC16942.mo39656();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            interfaceC16942.mo38352(i);
            interfaceC16942.mo39655(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            return interfaceC16942.mo39654();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f42391 != null) {
            this.f42393 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.f42391 != null) {
            return this.f42393;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f42392) {
            this.f42387 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            Context context = this.f42389;
            if (context == null) {
                context = getContext();
            }
            interfaceC16942.mo18833(new C9182(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 == null || !interfaceC16942.isShowing()) {
            return;
        }
        interfaceC16942.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC9658 abstractViewOnTouchListenerC9658 = this.f42386;
        if (abstractViewOnTouchListenerC9658 == null || !abstractViewOnTouchListenerC9658.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f42391 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m31553(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            if (interfaceC16942.isShowing()) {
                return true;
            }
            m31555();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC16942 interfaceC16942 = this.f42391;
        if (interfaceC16942 != null) {
            interfaceC16942.mo38351(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC16942 interfaceC16942 = this.f42391;
        return interfaceC16942 != null ? interfaceC16942.mo38353() : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.f42390;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.f42390;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C19993 c19993 = this.f42390;
        if (c19993 != null) {
            c19993.m45274();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31553(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        Rect rect = this.f42388;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16942 m31554() {
        return this.f42391;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31555() {
        this.f42391.mo38350(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0713 c0713 = new C0713(super.onSaveInstanceState());
        InterfaceC16942 interfaceC16942 = this.f42391;
        c0713.f2985 = interfaceC16942 != null && interfaceC16942.isShowing();
        return c0713;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0713 c0713 = (C0713) parcelable;
        super.onRestoreInstanceState(c0713.getSuperState());
        if (!c0713.f2985 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC19059(this));
    }
}
