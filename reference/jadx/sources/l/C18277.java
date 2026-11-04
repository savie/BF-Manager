package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: l.ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 168V */
/* JADX INFO: loaded from: classes5.dex */
public class C18277 extends AutoCompleteTextView implements InterfaceC18831 {
    public static final int[] TINT_ATTRS = {R.attr.popupBackground};
    public final C5248 mAppCompatEmojiEditTextHelper;
    public final C0378 mBackgroundTintHelper;
    public final C10971 mTextHelper;

    public C18277(Context context) {
        this(context, null);
    }

    public C18277(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18277(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        C9457.m24831(getContext(), this);
        C5204 c5204M15649 = C5204.m15649(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (c5204M15649.m15655(0)) {
            setDropDownBackgroundDrawable(c5204M15649.m15669(0));
        }
        c5204M15649.m15664();
        C0378 c0378 = new C0378(this);
        this.mBackgroundTintHelper = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.mTextHelper = c10971;
        c10971.m27810(attributeSet, i);
        c10971.m27803();
        C5248 c5248 = new C5248(this);
        this.mAppCompatEmojiEditTextHelper = c5248;
        c5248.m15809(attributeSet, i);
        initEmojiKeyListener(c5248);
    }

    public void initEmojiKeyListener(C5248 c5248) {
        KeyListener keyListener = getKeyListener();
        c5248.getClass();
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
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0385.m2186(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2181(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            return c0378.m2180();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2177(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            return c0378.m2179();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2174();
        }
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27807(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C11213.m28257(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.mAppCompatEmojiEditTextHelper.m15808(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18085.m42117(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18085.m42116(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m15807(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m15810(z);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m15811();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10971 c10971 = this.mTextHelper;
        if (c10971 != null) {
            c10971.m27803();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m27814();
    }

    @Override // l.InterfaceC18831
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m27808(colorStateList);
        this.mTextHelper.m27803();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m27802();
    }

    @Override // l.InterfaceC18831
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m27809(mode);
        this.mTextHelper.m27803();
    }
}
