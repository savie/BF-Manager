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

/* JADX INFO: renamed from: l.ᩴ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18770 implements PluginDialog {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile C5364 f60850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14538 f60851;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2355 f60852;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C5364 f60853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f60854;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C5364 f60855;

    public C18770(C2355 c2355) {
        this.f60852 = c2355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43332(DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f60854 = dialogInterfaceC19356;
        C23250.m51309(dialogInterfaceC19356);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginUI getPluginUI() {
        return this.f60852;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void show() {
        this.f60854.m44362();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void dismiss() {
        this.f60854.dismiss();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void cancel() {
        this.f60854.cancel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PluginViewGroup m43330(Button button) {
        if (this.f60851 == null) {
            C14538 c14538 = new C14538(this.f60852, null);
            c14538.f12078 = (ViewGroup) button.getParent();
            this.f60851 = c14538;
        }
        return this.f60851;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getPositiveButton() {
        if (this.f60855 != null) {
            return this.f60855;
        }
        Button buttonM44373 = this.f60854.m44373();
        if (buttonM44373 == null) {
            return null;
        }
        synchronized (this.f60854) {
            if (this.f60855 != null) {
                return this.f60855;
            }
            C5364 c5364 = new C5364(this.f60852, m43330(buttonM44373), PluginButton.Style.DEFAULT);
            c5364.f12078 = buttonM44373;
            this.f60855 = c5364;
            return c5364;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getNegativeButton() {
        if (this.f60853 != null) {
            return this.f60853;
        }
        Button buttonM44374 = this.f60854.m44374();
        if (buttonM44374 == null) {
            return null;
        }
        synchronized (this.f60854) {
            if (this.f60853 != null) {
                return this.f60853;
            }
            C5364 c5364 = new C5364(this.f60852, m43330(buttonM44374), PluginButton.Style.DEFAULT);
            c5364.f12078 = buttonM44374;
            this.f60853 = c5364;
            return c5364;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getNeutralButton() {
        if (this.f60850 != null) {
            return this.f60850;
        }
        Button buttonM44361 = this.f60854.m44361();
        if (buttonM44361 == null) {
            return null;
        }
        synchronized (this.f60854) {
            if (this.f60850 != null) {
                return this.f60850;
            }
            C5364 c5364 = new C5364(this.f60852, m43330(buttonM44361), PluginButton.Style.DEFAULT);
            c5364.f12078 = buttonM44361;
            this.f60850 = c5364;
            return c5364;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setPositiveButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f60854.m44365(-1, m43331(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC8619(1, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setNegativeButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f60854.m44365(-2, m43331(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.ۘ۬ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18770 c18770 = this.f14696;
                c18770.getClass();
                onClickListener.onClick(c18770, i);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f60854.m44365(-3, m43331(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC18064(0, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final boolean isShowing() {
        return this.f60854.m44375();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setView(PluginView pluginView) {
        this.f60854.m44370((ViewGroup) m43329(pluginView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ScrollView m43329(PluginView pluginView) {
        View view = ((C3247) pluginView).f12078;
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.addView(view);
        return scrollView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m43331(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C3184.m9601(1, str) == '}' && (stringNullable = this.f60852.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setTitle(CharSequence charSequence) {
        this.f60854.m44377(m43331(charSequence));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setMessage(CharSequence charSequence) {
        this.f60854.m44371(m43331(charSequence));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setCancelable(boolean z) {
        this.f60854.m44372(z);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f60854.m44366(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.ۜ۬ۘ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C18770 c18770 = this.f22876;
                c18770.getClass();
                onCancelListener.onCancel(c18770);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f60854.m44367(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.ܶ۬ۘ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C18770 c18770 = this.f49707;
                c18770.getClass();
                onDismissListener.onDismiss(c18770);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f60854.m44369(onShowListener == null ? null : new DialogInterface.OnShowListener() { // from class: l.᩸۬ۘ
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C18770 c18770 = this.f70055;
                c18770.getClass();
                onShowListener.onShow(c18770);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f60854.m44368(onKeyListener == null ? null : new DialogInterface.OnKeyListener() { // from class: l.᩺۬ۘ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C18770 c18770 = this.f74756;
                c18770.getClass();
                return onKeyListener.onKey(c18770, i, keyEvent);
            }
        });
    }
}
