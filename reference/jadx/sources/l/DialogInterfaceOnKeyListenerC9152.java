package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5PE */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnKeyListenerC9152 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC12772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC12551 f29728;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18103 f29729;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9898 f29730;

    @Override // l.InterfaceC12772
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6418(C9898 c9898) {
        return false;
    }

    public DialogInterfaceOnKeyListenerC9152(SubMenuC12026 subMenuC12026) {
        this.f29730 = subMenuC12026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24286() {
        C9898 c9898 = this.f29730;
        C20756 c20756 = new C20756(c9898.getContext());
        C18103 c18103 = new C18103(c20756.getContext(), R.layout.MT_Protector);
        this.f29729 = c18103;
        c18103.setCallback(this);
        c9898.addMenuPresenter(this.f29729);
        c20756.setAdapter(this.f29729.m42222(), this);
        View headerView = c9898.getHeaderView();
        if (headerView != null) {
            c20756.setCustomTitle(headerView);
        } else {
            c20756.setIcon(c9898.getHeaderIcon()).setTitle(c9898.getHeaderTitle());
        }
        c20756.setOnKeyListener(this);
        DialogInterfaceC12551 dialogInterfaceC12551Create = c20756.create();
        this.f29728 = dialogInterfaceC12551Create;
        dialogInterfaceC12551Create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f29728.getWindow().getAttributes();
        attributes.type = b.d;
        attributes.flags |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f29728.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C9898 c9898 = this.f29730;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f29728.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f29728.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c9898.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c9898.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f29729.onCloseMenu(this.f29730, true);
    }

    @Override // l.InterfaceC12772
    public final void onCloseMenu(C9898 c9898, boolean z) {
        DialogInterfaceC12551 dialogInterfaceC12551;
        if ((z || c9898 == this.f29730) && (dialogInterfaceC12551 = this.f29728) != null) {
            dialogInterfaceC12551.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f29730.performItemAction((C8407) ((C21087) this.f29729.m42222()).getItem(i), 0);
    }
}
