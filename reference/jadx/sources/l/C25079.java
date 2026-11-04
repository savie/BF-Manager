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

/* JADX INFO: renamed from: l.᩻ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V7NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C25079 extends AbstractC2398 implements PluginFrameLayoutBuilder {
    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C22536(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new FrameLayout(context);
    }

    @Override // l.AbstractC2398, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUI.Style getChildrenStyle() {
        return this.f7710;
    }

    @Override // l.AbstractC2398, bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public final PluginUIBuilder children(Consumer consumer) {
        consumer.accept(this.f7709);
        return this;
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
