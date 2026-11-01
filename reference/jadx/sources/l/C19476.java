package l;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19476 extends C3247 implements PluginEditText {
    @Override // l.C3247, bin.mt.plugin.api.ui.PluginView
    @Deprecated
    public final void setOnClickListener(PluginView.OnClickListener onClickListener) {
    }

    @Override // l.C3247, bin.mt.plugin.api.ui.PluginView
    @Deprecated
    public final void setOnLongClickListener(PluginView.OnLongClickListener onLongClickListener) {
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final Editable getText() {
        return ((C10948) this.f12078).m17000();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int length() {
        return ((C10948) this.f12078).m16842();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44538(CharSequence charSequence) {
        ((C10948) this.f12078).mo16989(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final CharSequence getHint() {
        return ((C10948) this.f12078).m17032();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44537(String str) {
        ((C10948) this.f12078).m16962(str);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final float getTextSize() {
        return ((C10948) this.f12078).m16980();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getTextColor() {
        return ((C10948) this.f12078).m16832();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final Typeface getTypeface() {
        Object tag = ((C10948) this.f12078).getTag(R.id.MT_Protector);
        return tag instanceof Typeface ? (Typeface) tag : Typeface.DEFAULT;
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTypeface(Typeface typeface) {
        ((C10948) this.f12078).setTag(R.id.MT_Protector, typeface);
        if (typeface == null) {
            ((C10948) this.f12078).m16936(255);
        } else {
            ((C10948) this.f12078).m16936(2);
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTypeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        setTypeface(typeface);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isSingleLine() {
        return ((C10948) this.f12078).mo16903();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getMinLines() {
        return ((C10948) this.f12078).m27475();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getMaxLines() {
        return ((C10948) this.f12078).m27471();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getInputType() {
        return ((C10948) this.f12078).mo17038();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getSelectionStart() {
        return ((C10948) this.f12078).m16916();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getSelectionEnd() {
        return ((C10948) this.f12078).m17020();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isReadOnly() {
        return ((C10948) this.f12078).m17004();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isBoxStyle() {
        return ((C10948) this.f12078).m27487();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isLineStyle() {
        return ((C10948) this.f12078).m27480();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (C13890.m33728()) {
            C13638.requireNonNull(pluginEditTextWatcher);
            ((C10948) this.f12078).m16853(new C8187(this, pluginEditTextWatcher));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean requestFocusAndShowIME() {
        if (C13890.m33728()) {
            if (!((C10948) this.f12078).isFocusable() || !((C10948) this.f12078).isEnabled() || ((C10948) this.f12078).m17004() || ((C10948) this.f12078).getVisibility() != 0) {
                return false;
            }
            if (((C10948) this.f12078).isAttachedToWindow() && ((C10948) this.f12078).isLaidOut()) {
                C16737.m39284(this.f12078);
                return true;
            }
            C16737.m39290(this.f12078);
            return true;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void selectAll() {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27486();
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void selectEnd() {
        if (C13890.m33728()) {
            View view = this.f12078;
            ((C10948) view).mo17029(((C10948) view).m16842());
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setBracketHighlightEnable(boolean z) {
        if (!C13890.m33728()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (z) {
            ((C10948) this.f12078).m27478();
        } else {
            ((C10948) this.f12078).m27470();
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHint(CharSequence charSequence) {
        if (!C13890.m33728()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (charSequence == null) {
            ((C10948) this.f12078).m16962((String) null);
        } else {
            ((C10948) this.f12078).m16962(m9722(charSequence).toString());
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHintTextColor(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27485(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHintTextColor(Integer num) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27472(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputMultiline() {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27484(131073);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputNumber() {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27484(2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputType(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27484(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setLines(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27469(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMaxLength(int i) {
        if (!C13890.m33728()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (i > 0) {
            ((C10948) this.f12078).m27473(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            ((C10948) this.f12078).m27473(new InputFilter[0]);
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMaxLines(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27482(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMinLines(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27477(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setReadOnly(boolean z) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m17065(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSelection(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).mo17029(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSelection(int i, int i2) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).mo16839(i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSingleLine(boolean z) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27476(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSoftWrap(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m16930(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSyntaxHighlight(String str) {
        if (!C13890.m33728()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        ((C10948) this.f12078).m16857(str, true);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setText(CharSequence charSequence) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).mo16989(m9722(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextColor(int i) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27474(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextColor(Integer num) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m27479(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextSize(float f) {
        if (C13890.m33728()) {
            ((C10948) this.f12078).m16960(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
