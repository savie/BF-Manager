package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginImageViewBuilder;

/* JADX INFO: renamed from: l.ܺܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7IN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16873 extends AbstractC0907 implements PluginImageViewBuilder {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f55186;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Matrix f55187;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Bitmap f55188;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Integer f55189;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ColorStateList f55190;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ColorFilter f55191;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f55192;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Boolean f55193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f55194;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Integer f55195;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Drawable f55196;

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final void mo3674(C6128 c6128) {
        C19552 c19552 = (C19552) c6128;
        super.mo3674(c19552);
        Drawable drawable = this.f55196;
        if (drawable != null) {
            c19552.setImage(drawable);
        } else {
            Bitmap bitmap = this.f55188;
            if (bitmap != null) {
                c19552.setImage(bitmap);
            }
        }
        ColorStateList colorStateList = this.f55190;
        if (colorStateList != null) {
            c19552.setImageTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f55194;
        if (mode != null) {
            c19552.setImageTintMode(mode);
        }
        ImageView.ScaleType scaleType = this.f55192;
        if (scaleType != null) {
            c19552.setScaleType(scaleType);
        }
        Matrix matrix = this.f55187;
        if (matrix != null) {
            c19552.setImageMatrix(matrix);
        }
        Boolean bool = this.f55193;
        if (bool != null) {
            c19552.setCropToPadding(bool.booleanValue());
        }
        ColorFilter colorFilter = this.f55191;
        if (colorFilter != null) {
            c19552.setColorFilter(colorFilter);
        } else {
            Integer num = this.f55195;
            if (num != null && this.f55186 != null) {
                c19552.setColorFilter(num.intValue(), this.f55186);
            } else if (num != null) {
                c19552.setColorFilter(num.intValue());
            }
        }
        Integer num2 = this.f55189;
        if (num2 != null) {
            c19552.setImageAlpha(num2.intValue());
        }
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C19552(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new C15688(context);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Drawable drawable) {
        this.f55196 = drawable;
        this.f55188 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Bitmap bitmap) {
        this.f55188 = bitmap;
        this.f55196 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintList(ColorStateList colorStateList) {
        this.f55190 = colorStateList;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintMode(PorterDuff.Mode mode) {
        this.f55194 = mode;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder scaleType(ImageView.ScaleType scaleType) {
        this.f55192 = scaleType;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageMatrix(Matrix matrix) {
        this.f55187 = matrix;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder cropToPadding(boolean z) {
        this.f55193 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i, PorterDuff.Mode mode) {
        this.f55195 = Integer.valueOf(i);
        this.f55186 = mode;
        this.f55191 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i) {
        this.f55195 = Integer.valueOf(i);
        this.f55186 = null;
        this.f55191 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(ColorFilter colorFilter) {
        this.f55191 = colorFilter;
        this.f55195 = null;
        this.f55186 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageAlpha(int i) {
        this.f55189 = Integer.valueOf(i);
        return this;
    }
}
