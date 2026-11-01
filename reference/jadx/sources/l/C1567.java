package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.ui.PluginFrameLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginFrameLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֫ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1567 extends AbstractC11529 implements PluginBaseViewBuilder, PluginRootLayoutBuilder {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f6305;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC14974 f6306;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f6307;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f6308 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2355 f6309;

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthWrapContent() {
        width(-2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthMatchParent() {
        width(-1);
        return this;
    }

    public C1567(C2355 c2355, Context context, boolean z, int i) {
        this.f6309 = c2355;
        this.f6307 = context;
        if (z) {
            this.f6306 = new C16385(this, c2355.getStyle());
        } else {
            this.f6306 = new C17090(this, c2355.getStyle(), i);
        }
        C22735 c22735 = this.f6306.f48882;
        c22735.f74064 = this;
        m28701(c22735);
        this.f6306.size(-1, -2);
        c2355.getStyle().dispatch(c2355, this);
        this.f6305 = c2355.isStrictIdModeEnabled() ? new HashSet() : null;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        height(-2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginUIBuilder unifyWidth(String[] strArr) {
        m5358unifyWidth(strArr);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        height(-1);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C13932.m33769(f), C13932.m33769(f2));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        width(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        height(C13932.m33769(f));
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m5357() {
        return this.f6305;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        padding(C13932.m33769(f), C13932.m33769(f2), C13932.m33769(f3), C13932.m33769(f4));
        return this;
    }

    @Override // l.AbstractC11529, bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f6309;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        padding(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginView build() {
        if (!this.f6308.compareAndSet(false, true)) {
            throw new UnsupportedOperationException("Method 'build()' can only be called once");
        }
        C14538 c14538Mo17707 = this.f6306.mo17707((PluginUI) this.f6309, (PluginViewGroup) null, this.f6307);
        c14538Mo17707.m34973();
        return c14538Mo17707;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        paddingLeft(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        paddingTop(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder id(String str) {
        this.f6306.id(str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        paddingRight(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        paddingBottom(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f6306.getId();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String requireId() {
        return this.f6306.requireId();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f6306.tag(obj);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C13932.m33769(f), C13932.m33769(f2), C13932.m33769(f3), C13932.m33769(f4));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f6306.getTag();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder size(int i, int i2) {
        this.f6306.size(i, i2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        marginLeft(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        marginTop(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f6306.width(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        marginRight(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f6306.height(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        marginBottom(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f6306.layoutWeight(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f6306.layoutGravity(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C13932.m33769(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f6306.padding(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f6306.padding(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f6306.paddingLeft(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f6306.paddingTop(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f6306.paddingRight(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f6306.paddingBottom(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontal(int i) {
        this.f6306.paddingHorizontal(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVertical(int i) {
        this.f6306.paddingVertical(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        this.f6306.margin(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i) {
        this.f6306.margin(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f6306.marginLeft(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f6306.marginTop(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f6306.marginRight(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f6306.marginBottom(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontal(int i) {
        this.f6306.marginHorizontal(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVertical(int i) {
        this.f6306.marginVertical(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f6306.background(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder backgroundColor(int i) {
        this.f6306.backgroundColor(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f6306.onClick(onClickListener);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f6306.onLongClick(onLongClickListener);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f6306.enable(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f6306.alpha(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f6306.requestFocus();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder visible() {
        this.f6306.visible();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder invisible() {
        this.f6306.invisible();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder gone() {
        this.f6306.gone();
        return this;
    }

    /* JADX INFO: renamed from: unifyWidth, reason: collision with other method in class */
    public final void m5358unifyWidth(String... strArr) {
        C22735 c22735 = this.f6306.f48882;
        if (c22735.f74065 == null) {
            c22735.f74065 = new ArrayList(1);
        }
        c22735.f74065.add(strArr);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isHorizontalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f6306;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            return ((PluginLinearLayoutBuilder) pluginUIBuilder).isHorizontal();
        }
        if (pluginUIBuilder instanceof PluginFrameLayout) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isVerticalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f6306;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            return ((PluginLinearLayoutBuilder) pluginUIBuilder).isVertical();
        }
        if (pluginUIBuilder instanceof PluginFrameLayout) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isFrameLayout() {
        AbstractC14974 abstractC14974 = this.f6306;
        if (abstractC14974 instanceof PluginFrameLayout) {
            return true;
        }
        if (abstractC14974 instanceof PluginLinearLayoutBuilder) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final PluginRootLayoutBuilder gravity(int i) {
        PluginUIBuilder pluginUIBuilder = this.f6306;
        if (pluginUIBuilder instanceof PluginLinearLayoutBuilder) {
            ((PluginLinearLayoutBuilder) pluginUIBuilder).gravity(i);
            return this;
        }
        if (pluginUIBuilder instanceof PluginFrameLayoutBuilder) {
            throw new RuntimeException("PluginRootLayoutBuilder using FrameLayout does not support gravity method");
        }
        throw new RuntimeException();
    }
}
