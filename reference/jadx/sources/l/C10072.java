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

/* JADX INFO: renamed from: l.ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4U7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10072 extends CheckedTextView implements InterfaceC18831 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10971 f32297;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22402 f32298;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1124 f32299;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0378 f32300;

    public C10072(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10072(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        C9457.m24831(getContext(), this);
        C10971 c10971 = new C10971(this);
        this.f32297 = c10971;
        c10971.m27810(attributeSet, i);
        c10971.m27803();
        C0378 c0378 = new C0378(this);
        this.f32300 = c0378;
        c0378.m2178(attributeSet, i);
        C1124 c1124 = new C1124(this);
        this.f32299 = c1124;
        c1124.m4168(attributeSet, i);
        if (this.f32298 == null) {
            this.f32298 = new C22402(this);
        }
        this.f32298.m50477(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1124 c1124 = this.f32299;
        if (c1124 != null) {
            c1124.m4169();
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0385.m2186(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.f32300;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.f32300;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10971 c10971 = this.f32297;
        if (c10971 != null) {
            c10971.m27807(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C10971 c10971 = this.f32297;
        if (c10971 != null) {
            c10971.m27803();
        }
        C0378 c0378 = this.f32300;
        if (c0378 != null) {
            c0378.m2174();
        }
        C1124 c1124 = this.f32299;
        if (c1124 != null) {
            c1124.m4167();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C11213.m28257(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18085.m42117(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18085.m42116(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.f32298 == null) {
            this.f32298 = new C22402(this);
        }
        this.f32298.m50478(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.f32297;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.f32297;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // l.InterfaceC18831
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10971 c10971 = this.f32297;
        c10971.m27808(colorStateList);
        c10971.m27803();
    }

    @Override // l.InterfaceC18831
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10971 c10971 = this.f32297;
        c10971.m27809(mode);
        c10971.m27803();
    }
}
