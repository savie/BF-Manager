package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.alipay.sdk.m.t0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S5PE */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC6067 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC5092 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15946 f20569;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC7957 f20570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12418 f20571;

    @Override // l.InterfaceC5092
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3701(C12418 c12418) {
        return false;
    }

    public DialogInterfaceOnKeyListenerC6067(SubMenuC7915 subMenuC7915) {
        this.f20571 = subMenuC7915;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16466() {
        C12418 c12418 = this.f20571;
        C18540 c18540 = new C18540(c12418.getContext());
        C15946 c15946 = new C15946(c18540.getContext());
        this.f20569 = c15946;
        c15946.setCallback(this);
        c12418.addMenuPresenter(this.f20569);
        c18540.setAdapter(this.f20569.m37907(), this);
        View headerView = c12418.getHeaderView();
        if (headerView != null) {
            c18540.setCustomTitle(headerView);
        } else {
            c18540.setIcon(c12418.getHeaderIcon()).setTitle(c12418.getHeaderTitle());
        }
        c18540.setOnKeyListener(this);
        DialogInterfaceC7957 dialogInterfaceC7957Create = c18540.create();
        this.f20570 = dialogInterfaceC7957Create;
        dialogInterfaceC7957Create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f20570.getWindow().getAttributes();
        attributes.type = b.d;
        attributes.flags |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f20570.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C12418 c12418 = this.f20571;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f20570.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f20570.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c12418.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c12418.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f20569.onCloseMenu(this.f20571, true);
    }

    @Override // l.InterfaceC5092
    public final void onCloseMenu(C12418 c12418, boolean z) {
        DialogInterfaceC7957 dialogInterfaceC7957;
        if ((z || c12418 == this.f20571) && (dialogInterfaceC7957 = this.f20570) != null) {
            dialogInterfaceC7957.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20571.performItemAction((C23707) ((C20884) this.f20569.m37907()).getItem(i), 0);
    }
}
