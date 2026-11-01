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

/* JADX INFO: renamed from: l.ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A4VT */
/* JADX INFO: loaded from: classes3.dex */
public class C5653 extends MultiAutoCompleteTextView implements InterfaceC5823 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f19314 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4717 f19315;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9410 f19316;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19993 f19317;

    public C5653(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5653(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        C17500.m40762(getContext(), this);
        C1977 c1977M6353 = C1977.m6353(getContext(), attributeSet, f19314, i, 0);
        if (c1977M6353.m6383(0)) {
            setDropDownBackgroundDrawable(c1977M6353.m6370(0));
        }
        c1977M6353.m6379();
        C19993 c19993 = new C19993(this);
        this.f19317 = c19993;
        c19993.m45278(attributeSet, i);
        C4717 c4717 = new C4717(this);
        this.f19315 = c4717;
        c4717.m13067(attributeSet, i);
        c4717.m13060();
        C9410 c9410 = new C9410(this);
        this.f19316 = c9410;
        c9410.m24157(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM24155 = c9410.m24155(keyListener);
        if (keyListenerM24155 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM24155);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C15945.m37904(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.f19317;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.f19317;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C19993 c19993 = this.f19317;
        if (c19993 != null) {
            c19993.m45274();
        }
        C4717 c4717 = this.f19315;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4717 c4717 = this.f19315;
        if (c4717 != null) {
            c4717.m13064(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C4947.m13738(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f19316.m24156(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f19316.m24155(keyListener));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.f19315;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.f19315;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // l.InterfaceC5823
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C4717 c4717 = this.f19315;
        c4717.m13065(colorStateList);
        c4717.m13060();
    }

    @Override // l.InterfaceC5823
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C4717 c4717 = this.f19315;
        c4717.m13066(mode);
        c4717.m13060();
    }
}
