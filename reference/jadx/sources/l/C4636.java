package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۙۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4636 implements PluginDialog {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20298 f16416;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C19397 f16417;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C19397 f16418;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18365 f16419;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f16420;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C19397 f16421;

    public C4636(C18365 c18365) {
        this.f16419 = c18365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14464(DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f16420 = dialogInterfaceC8327;
        C5416.m16144(dialogInterfaceC8327);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginUI getPluginUI() {
        return this.f16419;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void show() {
        this.f16420.m22432();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void dismiss() {
        this.f16420.dismiss();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void cancel() {
        this.f16420.cancel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PluginViewGroup m14462(Button button) {
        if (this.f16416 == null) {
            C20298 c20298 = new C20298(this.f16419, null);
            c20298.f20900 = (ViewGroup) button.getParent();
            this.f16416 = c20298;
        }
        return this.f16416;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getPositiveButton() {
        if (this.f16418 != null) {
            return this.f16418;
        }
        Button buttonM22436 = this.f16420.m22436();
        if (buttonM22436 == null) {
            return null;
        }
        synchronized (this.f16420) {
            if (this.f16418 != null) {
                return this.f16418;
            }
            C19397 c19397 = new C19397(this.f16419, m14462(buttonM22436), PluginButton.Style.DEFAULT);
            c19397.f20900 = buttonM22436;
            this.f16418 = c19397;
            return c19397;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getNegativeButton() {
        if (this.f16417 != null) {
            return this.f16417;
        }
        Button buttonM22433 = this.f16420.m22433();
        if (buttonM22433 == null) {
            return null;
        }
        synchronized (this.f16420) {
            if (this.f16417 != null) {
                return this.f16417;
            }
            C19397 c19397 = new C19397(this.f16419, m14462(buttonM22433), PluginButton.Style.DEFAULT);
            c19397.f20900 = buttonM22433;
            this.f16417 = c19397;
            return c19397;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getNeutralButton() {
        if (this.f16421 != null) {
            return this.f16421;
        }
        Button buttonM22440 = this.f16420.m22440();
        if (buttonM22440 == null) {
            return null;
        }
        synchronized (this.f16420) {
            if (this.f16421 != null) {
                return this.f16421;
            }
            C19397 c19397 = new C19397(this.f16419, m14462(buttonM22440), PluginButton.Style.DEFAULT);
            c19397.f20900 = buttonM22440;
            this.f16421 = c19397;
            return c19397;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setPositiveButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f16420.m22424(-1, m14463(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC10618(1, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setNegativeButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f16420.m22424(-2, m14463(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC7410(1, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f16420.m22424(-3, m14463(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC22398(1, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final boolean isShowing() {
        return this.f16420.m22434();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setView(PluginView pluginView) {
        this.f16420.m22429((ViewGroup) m14461(pluginView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ScrollView m14461(PluginView pluginView) {
        View view = ((C6128) pluginView).f20900;
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.addView(view);
        return scrollView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m14463(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C22313.m50373(1, str) == '}' && (stringNullable = this.f16419.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setTitle(CharSequence charSequence) {
        this.f16420.m22439(m14463(charSequence));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setMessage(CharSequence charSequence) {
        this.f16420.m22430(m14463(charSequence));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setCancelable(boolean z) {
        this.f16420.m22431(z);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f16420.m22425(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.ۖ᩺֫
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C4636 c4636 = this.f9719;
                c4636.getClass();
                onCancelListener.onCancel(c4636);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f16420.m22426(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.ۜ᩺֫
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C4636 c4636 = this.f24597;
                c4636.getClass();
                onDismissListener.onDismiss(c4636);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f16420.m22428(onShowListener == null ? null : new DialogInterface.OnShowListener() { // from class: l.۬᩺֫
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C4636 c4636 = this.f44824;
                c4636.getClass();
                onShowListener.onShow(c4636);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f16420.m22427(onKeyListener == null ? null : new DialogInterface.OnKeyListener() { // from class: l.۠᩺֫
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C4636 c4636 = this.f29209;
                c4636.getClass();
                return onKeyListener.onKey(c4636, i, keyEvent);
            }
        });
    }
}
