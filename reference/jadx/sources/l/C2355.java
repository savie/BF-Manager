package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plugin.api.ui.menu.PluginPopupMenu;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2355 implements PluginUI {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f8306;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PluginContext f8308;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public PluginUI.Style f8305 = PluginUI.DEFAULT_STYLE;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f8307 = true;

    public C2355(PluginContext pluginContext, AbstractActivityC12483 abstractActivityC12483) {
        this.f8308 = pluginContext;
        this.f8306 = abstractActivityC12483;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void cancelToast() {
        this.f8308.cancelToast();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginContext getContext() {
        return this.f8308;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToast(CharSequence charSequence) {
        this.f8308.showToast(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToast(CharSequence charSequence, Object... objArr) {
        this.f8308.showToast(charSequence, objArr);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToastL(CharSequence charSequence) {
        this.f8308.showToastL(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToastL(CharSequence charSequence, Object... objArr) {
        this.f8308.showToastL(charSequence, objArr);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI disableStrictIdMode() {
        this.f8307 = false;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI setStrictIdModeEnabled(boolean z) {
        this.f8307 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final boolean isStrictIdModeEnabled() {
        return this.f8307;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildHorizontalLayout() {
        return new C1567(this, this.f8306, false, 0);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildVerticalLayout() {
        return new C1567(this, this.f8306, false, 1);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildFrameLayout() {
        return new C1567(this, this.f8306, true, 0);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginDialog.Builder buildDialog() {
        return new C15680(this, this.f8306);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginPopupMenu createPopupMenu(PluginView pluginView) {
        return new C6589(this.f8308, this.f8306, pluginView);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showMessage(CharSequence charSequence, CharSequence charSequence2) {
        C15680 c15680 = (C15680) buildDialog();
        c15680.setTitle(charSequence);
        c15680.setMessage(charSequence2);
        c15680.setPositiveButton(C16737.m39288(R.string.MT_Protector), null);
        c15680.show();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showErrorMessage(Throwable th) {
        this.f8306.m31002(th, (DialogInterface.OnDismissListener) null);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showPreference(Class cls) {
        Class cls2 = C23359.f75670;
        AbstractActivityC12483 abstractActivityC12483 = this.f8306;
        Intent intent = new Intent(abstractActivityC12483, (Class<?>) cls2);
        intent.putExtra("pluginId", this.f8308.getPluginId());
        if (cls != null) {
            intent.putExtra("pluginPreference", cls.getName());
        }
        abstractActivityC12483.startActivity(intent);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final boolean isDarkTheme() {
        return C20368.m45991();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorPrimary() {
        return C20368.f65975;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorAccent() {
        return C20368.f65970;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorDivider() {
        return C20368.f66006;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorError() {
        return C20368.f65966;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorWarning() {
        return C20368.f65998;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorText() {
        return C20368.f66007;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorTextSecondary() {
        return C20368.f65988;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final ColorStateList colorTextStateList() {
        return C20368.f65976;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final ColorStateList colorTextSecondaryStateList() {
        return C20368.f66009;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dialogPaddingHorizontal() {
        return C13932.m33769(24.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dialogPaddingVertical() {
        return C13932.m33769(18.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final Drawable selectableItemBackground() {
        return C0674.m3024(this.f8306);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final Drawable selectableItemBackgroundBorderless() {
        return C0674.m3029(this.f8306);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dp2px(float f) {
        return C13932.m33769(f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int sp2px(float f) {
        return C13932.m33770(f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI.Style getStyle() {
        return this.f8305;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI defaultStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f8305);
            }
        }
        C13638.requireNonNull(style, "Style cannot be null");
        this.f8305 = style;
        return this;
    }
}
