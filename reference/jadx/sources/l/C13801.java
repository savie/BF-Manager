package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UO */
/* JADX INFO: loaded from: classes4.dex */
public class C13801 extends EditText implements InterfaceC15031, InterfaceC18831 {
    public final C5248 mAppCompatEmojiEditTextHelper;
    public final C0378 mBackgroundTintHelper;
    public final C0186 mDefaultOnReceiveContentListener;
    public C7090 mSuperCaller;
    public final C9721 mTextClassifierHelper;
    public final C10971 mTextHelper;

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && C22666.m51104(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C12990 c12990 = new C12990(primaryClip, 1);
                c12990.m32398(i == 16908322 ? 0 : 1);
                C22666.m51084(this, c12990.m32397());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zM41839 = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C22666.m51104(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM41839 = C17926.m41839(dragEvent, this, activity);
            }
        }
        if (zM41839) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C13801(Context context) {
        this(context, null);
    }

    public C13801(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13801(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        C9457.m24831(getContext(), this);
        C0378 c0378 = new C0378(this);
        this.mBackgroundTintHelper = c0378;
        c0378.m2178(attributeSet, i);
        C10971 c10971 = new C10971(this);
        this.mTextHelper = c10971;
        c10971.m27810(attributeSet, i);
        c10971.m27803();
        this.mTextClassifierHelper = new C9721(this);
        this.mDefaultOnReceiveContentListener = new C0186();
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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
        String[] strArrM51104;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            C4173.m13340(editorInfo, getText());
        }
        C11213.m28257(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM51104 = C22666.m51104(this)) != null) {
            C4173.m13342(editorInfo, strArrM51104);
            inputConnectionOnCreateInputConnection = C18343.m42791(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
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

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7090 m33713() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C7090(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C9721 c9721;
        if (Build.VERSION.SDK_INT >= 28 || (c9721 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c9721.m25308(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C9721 c9721;
        if (Build.VERSION.SDK_INT >= 28 || (c9721 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return c9721.m25307();
    }

    @Override // l.InterfaceC15031
    public C23433 onReceiveContent(C23433 c23433) {
        return this.mDefaultOnReceiveContentListener.mo1540(this, c23433);
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
