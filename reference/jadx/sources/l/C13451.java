package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: l.۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A4VT */
/* JADX INFO: loaded from: classes4.dex */
public class C13451 extends MultiAutoCompleteTextView implements InterfaceC18831 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f42827 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5248 f42828;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10971 f42829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0378 f42830;

    public C13451(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13451(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        C9457.m24831(getContext(), this);
        C5204 c5204M15649 = C5204.m15649(getContext(), attributeSet, f42827, i, 0);
        if (c5204M15649.m15655(0)) {
            setDropDownBackgroundDrawable(c5204M15649.m15669(0));
        }
        c5204M15649.m15664();
        C0378 c0378 = new C0378(this);
        this.f42830 = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.f42829 = c10971;
        c10971.m27810(attributeSet, i);
        c10971.m27803();
        C5248 c5248 = new C5248(this);
        this.f42828 = c5248;
        c5248.m15809(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM15807 = c5248.m15807(keyListener);
        if (keyListenerM15807 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM15807);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0385.m2186(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.f42830;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.f42830;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0378 c0378 = this.f42830;
        if (c0378 != null) {
            c0378.m2174();
        }
        C10971 c10971 = this.f42829;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10971 c10971 = this.f42829;
        if (c10971 != null) {
            c10971.m27807(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C11213.m28257(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f42828.m15808(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f42828.m15807(keyListener));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.f42829;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.f42829;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // l.InterfaceC18831
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10971 c10971 = this.f42829;
        c10971.m27808(colorStateList);
        c10971.m27803();
    }

    @Override // l.InterfaceC18831
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10971 c10971 = this.f42829;
        c10971.m27809(mode);
        c10971.m27803();
    }
}
