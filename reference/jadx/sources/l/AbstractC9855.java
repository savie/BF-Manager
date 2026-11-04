package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ۢۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7P7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9855 extends AbstractC0907 implements PluginBaseTextViewBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Typeface f31714;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Float f31715;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ColorStateList f31716;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Boolean f31717;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Integer f31718;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Integer f31719;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Boolean f31720;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextUtils.TruncateAt f31721;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f31722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Float f31723;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Float f31724;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public CharSequence f31725;

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public void mo3674(C23282 c23282) {
        super.mo3674((C6128) c23282);
        CharSequence charSequence = this.f31725;
        if (charSequence != null) {
            c23282.m52401(charSequence);
        }
        Float f = this.f31723;
        if (f != null) {
            c23282.setTextSize(f.floatValue());
        }
        ColorStateList colorStateList = this.f31716;
        if (colorStateList != null) {
            c23282.setTextColor(colorStateList);
        }
        Integer num = this.f31719;
        if (num != null) {
            c23282.setGravity(num.intValue());
        }
        Typeface typeface = this.f31714;
        if (typeface != null) {
            c23282.setTypeface(typeface);
        }
        Float f2 = this.f31724;
        if (f2 != null && this.f31715 != null) {
            c23282.setLineSpacing(f2.floatValue(), this.f31715.floatValue());
        }
        Boolean bool = this.f31717;
        if (bool != null) {
            c23282.setSingleLine(bool.booleanValue());
        }
        Integer num2 = this.f31722;
        if (num2 != null) {
            c23282.setMaxLines(num2.intValue());
        }
        Integer num3 = this.f31718;
        if (num3 != null) {
            c23282.setMinLines(num3.intValue());
        }
        TextUtils.TruncateAt truncateAt = this.f31721;
        if (truncateAt != null) {
            c23282.setEllipsize(truncateAt);
        }
        Boolean bool2 = this.f31720;
        if (bool2 != null) {
            c23282.setAllCaps(bool2.booleanValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder text(CharSequence charSequence) {
        this.f31725 = m3671(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textSize(float f) {
        this.f31723 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i) {
        this.f31716 = ColorStateList.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i, int i2) {
        this.f31716 = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2});
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(ColorStateList colorStateList) {
        this.f31716 = colorStateList;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f31714 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f31714 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f31714 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f31714 = Typeface.DEFAULT;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder bold() {
        textStyle(true, false);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder italic() {
        textStyle(false, true);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder typeface(Typeface typeface) {
        this.f31714 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder typeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        this.f31714 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textGravity(int i) {
        this.f31719 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lineSpacing(float f, float f2) {
        this.f31724 = Float.valueOf(f);
        this.f31715 = Float.valueOf(f2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder singleLine() {
        this.f31717 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f31722 = numValueOf;
        this.f31718 = numValueOf;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder maxLines(int i) {
        this.f31722 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder minLines(int i) {
        this.f31718 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder ellipsize(TextUtils.TruncateAt truncateAt) {
        this.f31721 = truncateAt;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder allCaps(boolean z) {
        this.f31720 = Boolean.valueOf(z);
        return this;
    }
}
