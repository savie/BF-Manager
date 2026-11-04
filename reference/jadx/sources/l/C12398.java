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

/* JADX INFO: renamed from: l.ۨܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12398 extends AbstractC21349 implements PluginBaseViewBuilder, PluginRootLayoutBuilder {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Context f39890;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18365 f39891;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC2398 f39892;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f39893 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f39894;

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

    public C12398(C18365 c18365, Context context, boolean z, int i) {
        this.f39891 = c18365;
        this.f39890 = context;
        if (z) {
            this.f39892 = new C25079(this, c18365.getStyle());
        } else {
            this.f39892 = new C17619(this, c18365.getStyle(), i);
        }
        C9109 c9109 = this.f39892.f7709;
        c9109.f29588 = this;
        m48573(c9109);
        this.f39892.size(-1, -2);
        c18365.getStyle().dispatch(c18365, this);
        this.f39894 = c18365.isStrictIdModeEnabled() ? new HashSet() : null;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightWrapContent() {
        height(-2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginUIBuilder unifyWidth(String[] strArr) {
        m30870unifyWidth(strArr);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightMatchParent() {
        height(-1);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder sizeDp(float f, float f2) {
        size(C6907.m19160(f), C6907.m19160(f2));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder widthDp(float f) {
        width(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder heightDp(float f) {
        height(C6907.m19160(f));
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m30869() {
        return this.f39894;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f, float f2, float f3, float f4) {
        padding(C6907.m19160(f), C6907.m19160(f2), C6907.m19160(f3), C6907.m19160(f4));
        return this;
    }

    @Override // l.AbstractC21349, bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f39891;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingDp(float f) {
        padding(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginView build() {
        if (!this.f39893.compareAndSet(false, true)) {
            throw new UnsupportedOperationException("Method 'build()' can only be called once");
        }
        C20298 c20298Mo3672 = this.f39892.mo3672((PluginUI) this.f39891, (PluginViewGroup) null, this.f39890);
        c20298Mo3672.m46637();
        return c20298Mo3672;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeftDp(float f) {
        paddingLeft(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTopDp(float f) {
        paddingTop(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder id(String str) {
        this.f39892.id(str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRightDp(float f) {
        paddingRight(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottomDp(float f) {
        paddingBottom(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String getId() {
        return this.f39892.getId();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontalDp(float f) {
        paddingHorizontal(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final String requireId() {
        return this.f39892.requireId();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVerticalDp(float f) {
        paddingVertical(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder tag(Object obj) {
        this.f39892.tag(obj);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f, float f2, float f3, float f4) {
        margin(C6907.m19160(f), C6907.m19160(f2), C6907.m19160(f3), C6907.m19160(f4));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final Object getTag() {
        return this.f39892.getTag();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginDp(float f) {
        margin(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder size(int i, int i2) {
        this.f39892.size(i, i2);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeftDp(float f) {
        marginLeft(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTopDp(float f) {
        marginTop(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder width(int i) {
        this.f39892.width(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRightDp(float f) {
        marginRight(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder height(int i) {
        this.f39892.height(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottomDp(float f) {
        marginBottom(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutWeight(float f) {
        this.f39892.layoutWeight(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontalDp(float f) {
        marginHorizontal(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder layoutGravity(int i) {
        this.f39892.layoutGravity(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVerticalDp(float f) {
        marginVertical(C6907.m19160(f));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i, int i2, int i3, int i4) {
        this.f39892.padding(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder padding(int i) {
        this.f39892.padding(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingLeft(int i) {
        this.f39892.paddingLeft(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingTop(int i) {
        this.f39892.paddingTop(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingRight(int i) {
        this.f39892.paddingRight(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingBottom(int i) {
        this.f39892.paddingBottom(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingHorizontal(int i) {
        this.f39892.paddingHorizontal(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder paddingVertical(int i) {
        this.f39892.paddingVertical(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i, int i2, int i3, int i4) {
        this.f39892.margin(i, i2, i3, i4);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder margin(int i) {
        this.f39892.margin(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginLeft(int i) {
        this.f39892.marginLeft(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginTop(int i) {
        this.f39892.marginTop(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginRight(int i) {
        this.f39892.marginRight(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginBottom(int i) {
        this.f39892.marginBottom(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginHorizontal(int i) {
        this.f39892.marginHorizontal(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder marginVertical(int i) {
        this.f39892.marginVertical(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder background(Drawable drawable) {
        this.f39892.background(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder backgroundColor(int i) {
        this.f39892.backgroundColor(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        this.f39892.onClick(onClickListener);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        this.f39892.onLongClick(onLongClickListener);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder enable(boolean z) {
        this.f39892.enable(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder alpha(float f) {
        this.f39892.alpha(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder requestFocus() {
        this.f39892.requestFocus();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder visible() {
        this.f39892.visible();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder invisible() {
        this.f39892.invisible();
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder gone() {
        this.f39892.gone();
        return this;
    }

    /* JADX INFO: renamed from: unifyWidth, reason: collision with other method in class */
    public final void m30870unifyWidth(String... strArr) {
        C9109 c9109 = this.f39892.f7709;
        if (c9109.f29589 == null) {
            c9109.f29589 = new ArrayList(1);
        }
        c9109.f29589.add(strArr);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final boolean isHorizontalLayout() {
        PluginUIBuilder pluginUIBuilder = this.f39892;
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
        PluginUIBuilder pluginUIBuilder = this.f39892;
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
        AbstractC2398 abstractC2398 = this.f39892;
        if (abstractC2398 instanceof PluginFrameLayout) {
            return true;
        }
        if (abstractC2398 instanceof PluginLinearLayoutBuilder) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder
    public final PluginRootLayoutBuilder gravity(int i) {
        PluginUIBuilder pluginUIBuilder = this.f39892;
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
