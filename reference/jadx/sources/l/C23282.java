package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginTextView;

/* JADX INFO: renamed from: l.᩹ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 57OH */
/* JADX INFO: loaded from: classes.dex */
public class C23282 extends C6128 implements PluginTextView {
    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final CharSequence getText() {
        return ((TextView) this.f20900).getText();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52401(CharSequence charSequence) {
        ((TextView) this.f20900).setText(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final float getTextSize() {
        return C6907.m19162(((TextView) this.f20900).getTextSize());
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final ColorStateList getTextColors() {
        return ((TextView) this.f20900).getTextColors();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getCurrentTextColor() {
        return ((TextView) this.f20900).getCurrentTextColor();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final Typeface getTypeface() {
        return ((TextView) this.f20900).getTypeface();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getGravity() {
        return ((TextView) this.f20900).getGravity();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getMinLines() {
        return ((TextView) this.f20900).getMinLines();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final int getMaxLines() {
        return ((TextView) this.f20900).getMaxLines();
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final boolean isAllCaps() {
        TransformationMethod transformationMethodM2767 = C0623.m2767(((TextView) this.f20900).getTransformationMethod());
        if (transformationMethodM2767 instanceof C0422) {
            return true;
        }
        for (Class<?> superclass = transformationMethodM2767 == null ? null : transformationMethodM2767.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if ("android.text.method.AllCapsTransformationMethod".equals(superclass.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void append(CharSequence charSequence) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).append(charSequence);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void append(CharSequence charSequence, int i, int i2) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).append(charSequence, i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setAllCaps(boolean z) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setAllCaps(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setEllipsize(truncateAt);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setGravity(int i) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setGravity(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setLineSpacing(float f, float f2) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setLineSpacing(f, f2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setLines(int i) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setMaxLines(int i) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setMaxLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setMinLines(int i) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setMinLines(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setSingleLine(boolean z) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setSingleLine(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setText(CharSequence charSequence) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setText(m17691(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(int i) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setTextColor(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(int i, int i2) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2}));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextColor(ColorStateList colorStateList) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setTextColor(colorStateList);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTextSize(float f) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setTextSize(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTypeface(Typeface typeface) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setTypeface(typeface);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginTextView
    public final void setTypeface(Typeface typeface, int i) {
        if (C22415.m50557()) {
            ((TextView) this.f20900).setTypeface(typeface, i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
