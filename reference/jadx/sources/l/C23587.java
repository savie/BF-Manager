package l;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.᩹ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 97PO */
/* JADX INFO: loaded from: classes2.dex */
public final class C23587 extends AbstractC0907 implements PluginProgressBarBuilder {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f76588;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public PluginProgressBar.Style f76589;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f76590;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f76591;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76592;

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final void mo3674(C6128 c6128) {
        C12839 c12839 = (C12839) c6128;
        super.mo3674(c12839);
        if (this.f76589 == PluginProgressBar.Style.HORIZONTAL) {
            c12839.setMaxProgress(this.f76592);
            c12839.setProgress(this.f76588);
            c12839.setSecondaryProgress(this.f76591);
            c12839.setIndeterminate(this.f76590);
        }
    }

    public C23587(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f76588 = 0;
        this.f76591 = 0;
        this.f76592 = 100;
        this.f76590 = false;
        this.f76589 = PluginProgressBar.Style.HORIZONTAL;
        this.f3396.width = -1;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder style(PluginProgressBar.Style style) {
        this.f76589 = style;
        PluginProgressBar.Style style2 = PluginProgressBar.Style.HORIZONTAL;
        LinearLayout.LayoutParams layoutParams = this.f3396;
        if (style == style2) {
            if (layoutParams.width == -2) {
                layoutParams.width = -1;
                return this;
            }
        } else if (layoutParams.width == -1) {
            layoutParams.width = -2;
        }
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder progress(int i) {
        this.f76588 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder secondaryProgress(int i) {
        this.f76591 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder maxProgress(int i) {
        this.f76592 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder indeterminate(boolean z) {
        this.f76590 = z;
        return this;
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C12839(pluginUI, pluginViewGroup, this.f76589);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        int i;
        int i2 = C16127.f52409[this.f76589.ordinal()];
        if (i2 == 1) {
            i = R.attr.progressBarStyleHorizontal;
        } else if (i2 == 2) {
            i = R.attr.progressBarStyle;
        } else if (i2 == 3) {
            i = R.attr.progressBarStyleSmall;
        } else {
            if (i2 != 4) {
                throw new IncompatibleClassChangeError();
            }
            i = R.attr.progressBarStyleLarge;
        }
        return new ProgressBar(context, null, i);
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f3401;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f3402 = obj;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f3402;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f3396.width = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f3396.height = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f3396.weight = f;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f3396.gravity = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f3397.set(i, i2, i3, i4);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f3397.set(i, i, i, i);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f3397.left = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f3397.top = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f3397.right = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f3397.bottom = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f3396.leftMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f3396.topMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f3396.rightMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f3396.bottomMargin = i;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f3398 = drawable;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f3406 = onClickListener;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f3400 = onLongClickListener;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f3404 = Boolean.valueOf(z);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f3405 = Float.valueOf(f);
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f3407 = true;
        return this;
    }
}
