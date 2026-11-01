package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginFrameLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ܽۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NH */
/* JADX INFO: loaded from: classes5.dex */
public final class C16385 extends AbstractC14974 implements PluginFrameLayoutBuilder {
    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C8893(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        return new FrameLayout(context);
    }

    @Override // l.AbstractC14974, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f48883;
    }

    @Override // l.AbstractC14974, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.mo42471accept(this.f48882);
        return this;
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
