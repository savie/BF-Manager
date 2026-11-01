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

/* JADX INFO: renamed from: l.۫ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7IN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12152 extends AbstractC6506 implements PluginImageViewBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f40660;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Drawable f40661;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f40662;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Integer f40663;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Bitmap f40664;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ColorStateList f40665;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ColorFilter f40666;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Integer f40667;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Boolean f40668;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f40669;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Matrix f40670;

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(C3247 c3247) {
        C10304 c10304 = (C10304) c3247;
        super.mo1252(c10304);
        Drawable drawable = this.f40661;
        if (drawable != null) {
            c10304.setImage(drawable);
        } else {
            Bitmap bitmap = this.f40664;
            if (bitmap != null) {
                c10304.setImage(bitmap);
            }
        }
        ColorStateList colorStateList = this.f40665;
        if (colorStateList != null) {
            c10304.setImageTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f40669;
        if (mode != null) {
            c10304.setImageTintMode(mode);
        }
        ImageView.ScaleType scaleType = this.f40660;
        if (scaleType != null) {
            c10304.setScaleType(scaleType);
        }
        Matrix matrix = this.f40670;
        if (matrix != null) {
            c10304.setImageMatrix(matrix);
        }
        Boolean bool = this.f40668;
        if (bool != null) {
            c10304.setCropToPadding(bool.booleanValue());
        }
        ColorFilter colorFilter = this.f40666;
        if (colorFilter != null) {
            c10304.setColorFilter(colorFilter);
        } else {
            Integer num = this.f40667;
            if (num != null && this.f40662 != null) {
                c10304.setColorFilter(num.intValue(), this.f40662);
            } else if (num != null) {
                c10304.setColorFilter(num.intValue());
            }
        }
        Integer num2 = this.f40663;
        if (num2 != null) {
            c10304.setImageAlpha(num2.intValue());
        }
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C10304(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        return new C2830(context);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Drawable drawable) {
        this.f40661 = drawable;
        this.f40664 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder image(Bitmap bitmap) {
        this.f40664 = bitmap;
        this.f40661 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintList(ColorStateList colorStateList) {
        this.f40665 = colorStateList;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageTintMode(PorterDuff.Mode mode) {
        this.f40669 = mode;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder scaleType(ImageView.ScaleType scaleType) {
        this.f40660 = scaleType;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageMatrix(Matrix matrix) {
        this.f40670 = matrix;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder cropToPadding(boolean z) {
        this.f40668 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i, PorterDuff.Mode mode) {
        this.f40667 = Integer.valueOf(i);
        this.f40662 = mode;
        this.f40666 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(int i) {
        this.f40667 = Integer.valueOf(i);
        this.f40662 = null;
        this.f40666 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder colorFilter(ColorFilter colorFilter) {
        this.f40666 = colorFilter;
        this.f40667 = null;
        this.f40662 = null;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginImageViewBuilder
    public final PluginImageViewBuilder imageAlpha(int i) {
        this.f40663 = Integer.valueOf(i);
        return this;
    }
}
