package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plus.R;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes5.dex */
public class C21028 extends C15760 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20323 f68479;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68480;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Runnable f68482;

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public C21028(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C21028(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68482 = new RunnableC7623(this);
        this.f68481 = getThreshold();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
            i = (i2 >= 600 || (i2 >= 640 && i3 >= 480)) ? 192 : DHParameters.DEFAULT_MINIMUM_LENGTH;
        } else {
            i = 256;
        }
        setMinWidth((int) TypedValue.applyDimension(1, i, displayMetrics));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47400(C20323 c20323) {
        this.f68479 = c20323;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        super.setThreshold(i);
        this.f68481 = i;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f68479.hasFocus() && getVisibility() == 0) {
            this.f68480 = true;
            Context context = getContext();
            C19618 c19618 = C20323.f65804;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    C8329.m21750(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                        return;
                    }
                    return;
                }
                C20323.f65804.m44713(this);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f68479.m45866();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f68481 <= 0 || super.enoughToFilter();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f68479.clearFocus();
                    m47401(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // l.C15760, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f68480) {
            Runnable runnable = this.f68482;
            removeCallbacks(runnable);
            post(runnable);
        }
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47399() {
        if (this.f68480) {
            ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
            this.f68480 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47401(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        Runnable runnable = this.f68482;
        if (!z) {
            this.f68480 = false;
            removeCallbacks(runnable);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.f68480 = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.f68480 = true;
        }
    }
}
