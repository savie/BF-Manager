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
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UO */
/* JADX INFO: loaded from: classes2.dex */
public class C1647 extends EditText implements InterfaceC5403, InterfaceC5823 {
    public final C9410 mAppCompatEmojiEditTextHelper;
    public final C19993 mBackgroundTintHelper;
    public final C12174 mDefaultOnReceiveContentListener;
    public C14349 mSuperCaller;
    public final C6358 mTextClassifierHelper;
    public final C4717 mTextHelper;

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && C5031.m13998(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C22608 c22608 = new C22608(primaryClip, 1);
                c22608.m50117(i == 16908322 ? 0 : 1);
                C5031.m13979(this, c22608.m50116());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zM51381 = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C5031.m13998(this) != null) {
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
                zM51381 = C23293.m51381(dragEvent, (TextView) this, activity);
            }
        }
        if (zM51381) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C1647(Context context) {
        this(context, null);
    }

    public C1647(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        C17500.m40762(getContext(), this);
        C19993 c19993 = new C19993(this);
        this.mBackgroundTintHelper = c19993;
        c19993.m45278(attributeSet, i);
        C4717 c4717 = new C4717(this);
        this.mTextHelper = c4717;
        c4717.m13067(attributeSet, i);
        c4717.m13060();
        this.mTextClassifierHelper = new C6358(this);
        this.mDefaultOnReceiveContentListener = new C12174();
        C9410 c9410 = new C9410(this);
        this.mAppCompatEmojiEditTextHelper = c9410;
        c9410.m24157(attributeSet, i);
        initEmojiKeyListener(c9410);
    }

    public void initEmojiKeyListener(C9410 c9410) {
        KeyListener keyListener = getKeyListener();
        c9410.getClass();
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
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45281(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            return c19993.m45280();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45277(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            return c19993.m45279();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45274();
        }
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13064(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM13998;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            C0133.m1207(editorInfo, getText());
        }
        C4947.m13738(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM13998 = C5031.m13998(this)) != null) {
            C0133.m1209(editorInfo, strArrM13998);
            inputConnectionOnCreateInputConnection = C17067.m39851(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.m24156(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C16407.m38619(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C16407.m38618(super.getCustomSelectionActionModeCallback());
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
    private C14349 m5542() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C14349(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C6358 c6358;
        if (Build.VERSION.SDK_INT >= 28 || (c6358 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c6358.m17467(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C6358 c6358;
        if (Build.VERSION.SDK_INT >= 28 || (c6358 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return c6358.m17466();
    }

    @Override // l.InterfaceC5403
    public C18374 onReceiveContent(C18374 c18374) {
        return this.mDefaultOnReceiveContentListener.mo8037(this, c18374);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m24155(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m24158(z);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m24159();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C4717 c4717 = this.mTextHelper;
        if (c4717 != null) {
            c4717.m13060();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m13074();
    }

    @Override // l.InterfaceC5823
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m13065(colorStateList);
        this.mTextHelper.m13060();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m13059();
    }

    @Override // l.InterfaceC5823
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m13066(mode);
        this.mTextHelper.m13060();
    }
}
