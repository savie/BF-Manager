package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginTextView;

/* JADX INFO: renamed from: l.ۧ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57OH */
/* JADX INFO: loaded from: classes4.dex */
public class C11010 extends C3247 implements PluginTextView {
    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final CharSequence getText() {
        return ((TextView) this.f12078).getText();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27766(CharSequence charSequence) {
        ((TextView) this.f12078).setText(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final float getTextSize() {
        return C13932.m33771(((TextView) this.f12078).getTextSize());
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final ColorStateList getTextColors() {
        return ((TextView) this.f12078).getTextColors();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getCurrentTextColor() {
        return ((TextView) this.f12078).getCurrentTextColor();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final Typeface getTypeface() {
        return ((TextView) this.f12078).getTypeface();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getGravity() {
        return ((TextView) this.f12078).getGravity();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getMinLines() {
        return ((TextView) this.f12078).getMinLines();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getMaxLines() {
        return ((TextView) this.f12078).getMaxLines();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final boolean isAllCaps() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((TextView) this.f12078).isAllCaps();
        }
        return ((TextView) this.f12078).getTransformationMethod() instanceof C19828;
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void append(CharSequence charSequence) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).append(charSequence);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void append(CharSequence charSequence, int i, int i2) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).append(charSequence, i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setAllCaps(boolean z) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setAllCaps(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setEllipsize(truncateAt);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setGravity(int i) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setGravity(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setLineSpacing(float f, float f2) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setLineSpacing(f, f2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setLines(int i) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setMaxLines(int i) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setMaxLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setMinLines(int i) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setMinLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setSingleLine(boolean z) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setSingleLine(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setText(CharSequence charSequence) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setText(m9722(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(int i) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setTextColor(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(int i, int i2) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2}));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(ColorStateList colorStateList) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setTextColor(colorStateList);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextSize(float f) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setTextSize(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTypeface(Typeface typeface) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setTypeface(typeface);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTypeface(Typeface typeface, int i) {
        if (C13890.m33728()) {
            ((TextView) this.f12078).setTypeface(typeface, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
