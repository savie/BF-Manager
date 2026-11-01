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

/* JADX INFO: renamed from: l.ۧۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10741 extends AbstractC6506 implements PluginProgressBarBuilder {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f36619;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public PluginProgressBar.Style f36620;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f36621;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f36622;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f36623;

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(C3247 c3247) {
        C20887 c20887 = (C20887) c3247;
        super.mo1252(c20887);
        if (this.f36620 == PluginProgressBar.Style.HORIZONTAL) {
            c20887.setMaxProgress(this.f36622);
            c20887.setProgress(this.f36619);
            c20887.setSecondaryProgress(this.f36623);
            c20887.setIndeterminate(this.f36621);
        }
    }

    public C10741(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f36619 = 0;
        this.f36623 = 0;
        this.f36622 = 100;
        this.f36621 = false;
        this.f36620 = PluginProgressBar.Style.HORIZONTAL;
        this.f21922.width = -1;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder style(PluginProgressBar.Style style) {
        this.f36620 = style;
        PluginProgressBar.Style style2 = PluginProgressBar.Style.HORIZONTAL;
        LinearLayout.LayoutParams layoutParams = this.f21922;
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
        this.f36619 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder secondaryProgress(int i) {
        this.f36623 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder maxProgress(int i) {
        this.f36622 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder
    public final PluginProgressBarBuilder indeterminate(boolean z) {
        this.f36621 = z;
        return this;
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C20887(pluginUI, pluginViewGroup, this.f36620);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        int i;
        int i2 = C5801.f19685[this.f36620.ordinal()];
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

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f21930;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f21928 = obj;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f21928;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f21922.width = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f21922.height = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f21922.weight = f;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f21922.gravity = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f21926.set(i, i2, i3, i4);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f21926.set(i, i, i, i);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f21926.left = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f21926.top = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f21926.right = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f21926.bottom = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f21922.leftMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f21922.topMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f21922.rightMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f21922.bottomMargin = i;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f21925 = drawable;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f21921 = onClickListener;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f21920 = onLongClickListener;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f21923 = Boolean.valueOf(z);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f21927 = Float.valueOf(f);
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f21931 = true;
        return this;
    }
}
