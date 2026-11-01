package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4U7 */
/* JADX INFO: loaded from: classes4.dex */
public class C12232 extends CheckedTextView implements InterfaceC5823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17170 f40867;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3058 f40868;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4717 f40869;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19993 f40870;

    public C12232(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12232(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        C17500.m40762(getContext(), this);
        C4717 c4717 = new C4717(this);
        this.f40869 = c4717;
        c4717.m13067(attributeSet, i);
        c4717.m13060();
        C19993 c19993 = new C19993(this);
        this.f40870 = c19993;
        c19993.m45278(attributeSet, i);
        C17170 c17170 = new C17170(this);
        this.f40867 = c17170;
        c17170.m40097(attributeSet, i);
        if (this.f40868 == null) {
            this.f40868 = new C3058(this);
        }
        this.f40868.m9165(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C17170 c17170 = this.f40867;
        if (c17170 != null) {
            c17170.m40098();
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C15945.m37904(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.f40870;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.f40870;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4717 c4717 = this.f40869;
        if (c4717 != null) {
            c4717.m13064(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4717 c4717 = this.f40869;
        if (c4717 != null) {
            c4717.m13060();
        }
        C19993 c19993 = this.f40870;
        if (c19993 != null) {
            c19993.m45274();
        }
        C17170 c17170 = this.f40867;
        if (c17170 != null) {
            c17170.m40096();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C4947.m13738(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C16407.m38619(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C16407.m38618(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f40868 == null) {
            this.f40868 = new C3058(this);
        }
        this.f40868.m9166(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.f40869;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.f40869;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // l.InterfaceC5823
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C4717 c4717 = this.f40869;
        c4717.m13065(colorStateList);
        c4717.m13060();
    }

    @Override // l.InterfaceC5823
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C4717 c4717 = this.f40869;
        c4717.m13066(mode);
        c4717.m13060();
    }
}
