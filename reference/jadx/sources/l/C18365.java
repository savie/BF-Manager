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

/* JADX INFO: renamed from: l.ܿܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18365 implements PluginUI {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f59848;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PluginContext f59850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public PluginUI.Style f59851 = PluginUI.DEFAULT_STYLE;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59849 = true;

    public C18365(PluginContext pluginContext, AbstractActivityC17204 abstractActivityC17204) {
        this.f59850 = pluginContext;
        this.f59848 = abstractActivityC17204;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void cancelToast() {
        this.f59850.cancelToast();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginContext getContext() {
        return this.f59850;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToast(CharSequence charSequence) {
        this.f59850.showToast(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToast(CharSequence charSequence, Object... objArr) {
        this.f59850.showToast(charSequence, objArr);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToastL(CharSequence charSequence) {
        this.f59850.showToastL(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToastL(CharSequence charSequence, Object... objArr) {
        this.f59850.showToastL(charSequence, objArr);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI disableStrictIdMode() {
        this.f59849 = false;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI setStrictIdModeEnabled(boolean z) {
        this.f59849 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final boolean isStrictIdModeEnabled() {
        return this.f59849;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildHorizontalLayout() {
        return new C12398(this, this.f59848, false, 0);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildVerticalLayout() {
        return new C12398(this, this.f59848, false, 1);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildFrameLayout() {
        return new C12398(this, this.f59848, true, 0);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginDialog.Builder buildDialog() {
        return new C5687(this, this.f59848);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginPopupMenu createPopupMenu(PluginView pluginView) {
        return new C1212(this.f59850, this.f59848, pluginView);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showMessage(CharSequence charSequence, CharSequence charSequence2) {
        C5687 c5687 = (C5687) buildDialog();
        c5687.setTitle(charSequence);
        c5687.setMessage(charSequence2);
        c5687.setPositiveButton(C21576.m49088(R.string.MT_Protector), null);
        c5687.show();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showErrorMessage(Throwable th) {
        this.f59848.m40401(th, (DialogInterface.OnDismissListener) null);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showPreference(Class cls) {
        Class cls2 = C12684.f40635;
        AbstractActivityC17204 abstractActivityC17204 = this.f59848;
        Intent intent = new Intent(abstractActivityC17204, (Class<?>) cls2);
        intent.putExtra("pluginId", this.f59850.getPluginId());
        if (cls != null) {
            intent.putExtra("pluginPreference", cls.getName());
        }
        abstractActivityC17204.startActivity(intent);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final boolean isDarkTheme() {
        return C3296.m10878();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorPrimary() {
        return C3296.f10750;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorAccent() {
        return C3296.f10738;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorDivider() {
        return C3296.f10757;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorError() {
        return C3296.f10774;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorWarning() {
        return C3296.f10760;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorText() {
        return C3296.f10758;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorTextSecondary() {
        return C3296.f10741;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final ColorStateList colorTextStateList() {
        return C3296.f10751;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final ColorStateList colorTextSecondaryStateList() {
        return C3296.f10779;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dialogPaddingHorizontal() {
        return C6907.m19160(24.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dialogPaddingVertical() {
        return C6907.m19160(18.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final Drawable selectableItemBackground() {
        return C17423.m40908(this.f59848);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final Drawable selectableItemBackgroundBorderless() {
        return C17423.m40913(this.f59848);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dp2px(float f) {
        return C6907.m19160(f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int sp2px(float f) {
        return C6907.m19161(f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI.Style getStyle() {
        return this.f59851;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI defaultStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f59851);
            }
        }
        C17359.requireNonNull(style, "Style cannot be null");
        this.f59851 = style;
        return this;
    }
}
