package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ۘۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7P7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3683 extends AbstractC6506 implements PluginBaseTextViewBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextUtils.TruncateAt f13449;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f13450;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Float f13451;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Integer f13452;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Boolean f13453;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Integer f13454;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Typeface f13455;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Boolean f13456;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Float f13457;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f13458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Float f13459;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ColorStateList f13460;

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public void mo1252(C11010 c11010) {
        super.mo1252((C3247) c11010);
        CharSequence charSequence = this.f13450;
        if (charSequence != null) {
            c11010.m27766(charSequence);
        }
        Float f = this.f13459;
        if (f != null) {
            c11010.setTextSize(f.floatValue());
        }
        ColorStateList colorStateList = this.f13460;
        if (colorStateList != null) {
            c11010.setTextColor(colorStateList);
        }
        Integer num = this.f13454;
        if (num != null) {
            c11010.setGravity(num.intValue());
        }
        Typeface typeface = this.f13455;
        if (typeface != null) {
            c11010.setTypeface(typeface);
        }
        Float f2 = this.f13457;
        if (f2 != null && this.f13451 != null) {
            c11010.setLineSpacing(f2.floatValue(), this.f13451.floatValue());
        }
        Boolean bool = this.f13453;
        if (bool != null) {
            c11010.setSingleLine(bool.booleanValue());
        }
        Integer num2 = this.f13458;
        if (num2 != null) {
            c11010.setMaxLines(num2.intValue());
        }
        Integer num3 = this.f13452;
        if (num3 != null) {
            c11010.setMinLines(num3.intValue());
        }
        TextUtils.TruncateAt truncateAt = this.f13449;
        if (truncateAt != null) {
            c11010.setEllipsize(truncateAt);
        }
        Boolean bool2 = this.f13456;
        if (bool2 != null) {
            c11010.setAllCaps(bool2.booleanValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder text(CharSequence charSequence) {
        this.f13450 = m17705(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textSize(float f) {
        this.f13459 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i) {
        this.f13460 = ColorStateList.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(int i, int i2) {
        this.f13460 = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{i, i2});
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textColor(ColorStateList colorStateList) {
        this.f13460 = colorStateList;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f13455 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f13455 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f13455 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f13455 = Typeface.DEFAULT;
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
        this.f13455 = typeface;
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
        this.f13455 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder textGravity(int i) {
        this.f13454 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lineSpacing(float f, float f2) {
        this.f13457 = Float.valueOf(f);
        this.f13451 = Float.valueOf(f2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder singleLine() {
        this.f13453 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f13458 = numValueOf;
        this.f13452 = numValueOf;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder maxLines(int i) {
        this.f13458 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder minLines(int i) {
        this.f13452 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder ellipsize(TextUtils.TruncateAt truncateAt) {
        this.f13449 = truncateAt;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseTextViewBuilder
    public final PluginUIBuilder allCaps(boolean z) {
        this.f13456 = Boolean.valueOf(z);
        return this;
    }
}
