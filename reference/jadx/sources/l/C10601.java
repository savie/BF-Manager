package l;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10601 extends C6128 implements PluginEditText {
    @Override // l.C6128, bin.mt.plugin.api.ui.PluginView
    @Deprecated
    public final void setOnClickListener(PluginView.OnClickListener onClickListener) {
    }

    @Override // l.C6128, bin.mt.plugin.api.ui.PluginView
    @Deprecated
    public final void setOnLongClickListener(PluginView.OnLongClickListener onLongClickListener) {
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final Editable getText() {
        return ((C23255) this.f20900).m54021();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int length() {
        return ((C23255) this.f20900).m54099();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27050(CharSequence charSequence) {
        ((C23255) this.f20900).mo52335(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final CharSequence getHint() {
        return ((C23255) this.f20900).m53958();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27049(String str) {
        ((C23255) this.f20900).m52337(str);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final float getTextSize() {
        return ((C23255) this.f20900).m54034();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getTextColor() {
        return ((C23255) this.f20900).m53954();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final Typeface getTypeface() {
        Object tag = ((C23255) this.f20900).getTag(R.id.MT_Protector);
        return tag instanceof Typeface ? (Typeface) tag : Typeface.DEFAULT;
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTypeface(Typeface typeface) {
        ((C23255) this.f20900).setTag(R.id.MT_Protector, typeface);
        if (typeface == null) {
            ((C23255) this.f20900).m53997(255);
        } else {
            ((C23255) this.f20900).m53997(2);
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
        return ((C23255) this.f20900).mo52320();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getMinLines() {
        return ((C23255) this.f20900).m52342();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getMaxLines() {
        return ((C23255) this.f20900).m52309();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getInputType() {
        return ((C23255) this.f20900).mo52297();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getSelectionStart() {
        return ((C23255) this.f20900).m53968();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getSelectionEnd() {
        return ((C23255) this.f20900).m53882();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isReadOnly() {
        return ((C23255) this.f20900).m54083();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isBoxStyle() {
        return ((C23255) this.f20900).m52298();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isLineStyle() {
        return ((C23255) this.f20900).m52323();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (C22415.m50557()) {
            C17359.requireNonNull(pluginEditTextWatcher);
            ((C23255) this.f20900).m53899(new C21790(this, pluginEditTextWatcher));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean requestFocusAndShowIME() {
        if (C22415.m50557()) {
            if (!((C23255) this.f20900).isFocusable() || !((C23255) this.f20900).isEnabled() || ((C23255) this.f20900).m54083() || ((C23255) this.f20900).getVisibility() != 0) {
                return false;
            }
            if (((C23255) this.f20900).isAttachedToWindow() && ((C23255) this.f20900).isLaidOut()) {
                C21576.m49076(this.f20900);
                return true;
            }
            C21576.m49090(this.f20900);
            return true;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void selectAll() {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52289();
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void selectEnd() {
        if (C22415.m50557()) {
            View view = this.f20900;
            ((C23255) view).mo52339(((C23255) view).m54099());
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setBracketHighlightEnable(boolean z) {
        if (!C22415.m50557()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (z) {
            ((C23255) this.f20900).m52332();
        } else {
            ((C23255) this.f20900).m52294();
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHint(CharSequence charSequence) {
        if (!C22415.m50557()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (charSequence == null) {
            ((C23255) this.f20900).m52337((String) null);
        } else {
            ((C23255) this.f20900).m52337(m17691(charSequence).toString());
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHintTextColor(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52321(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHintTextColor(Integer num) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52300(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputMultiline() {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52326(131073);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputNumber() {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52326(2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputType(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52326(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setLines(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52286(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMaxLength(int i) {
        if (!C22415.m50557()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (i > 0) {
            ((C23255) this.f20900).m52304(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            ((C23255) this.f20900).m52304(new InputFilter[0]);
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMaxLines(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52310(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMinLines(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52328(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setReadOnly(boolean z) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m54107(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSelection(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).mo52339(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSelection(int i, int i2) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).mo52316(i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSingleLine(boolean z) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52296(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSoftWrap(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).mo52291(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSyntaxHighlight(String str) {
        if (!C22415.m50557()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        ((C23255) this.f20900).m53903(str, true);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setText(CharSequence charSequence) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).mo52335(m17691(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextColor(int i) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52290(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextColor(Integer num) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m52336(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextSize(float f) {
        if (C22415.m50557()) {
            ((C23255) this.f20900).m53981(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
