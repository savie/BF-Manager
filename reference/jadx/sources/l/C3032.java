package l;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public class C3032 implements InterfaceC6016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaBrowser f9823;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Context f9825;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20932 f9826;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle f9827;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15600 f9828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Messenger f9829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HandlerC24662 f9830 = new HandlerC24662(this);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14307 f9824 = new C14307();

    @Override // l.InterfaceC6016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9839() {
    }

    @Override // l.InterfaceC6016
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo9843() {
    }

    public C3032(Context context, ComponentName componentName, C17202 c17202) {
        this.f9825 = context;
        Bundle bundle = new Bundle();
        this.f9827 = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c17202.f56032 = this;
        this.f9823 = new MediaBrowser(context, componentName, c17202.f56031, bundle);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15600 m9841() {
        if (this.f9828 == null) {
            this.f9828 = C15600.m37329(this.f9823.getSessionToken(), null);
        }
        return this.f9828;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9844() {
        MediaBrowser mediaBrowser = this.f9823;
        try {
            Bundle extras = mediaBrowser.getExtras();
            if (extras == null) {
                return;
            }
            extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                this.f9826 = new C20932(binder, this.f9827);
                HandlerC24662 handlerC24662 = this.f9830;
                Messenger messenger = new Messenger(handlerC24662);
                this.f9829 = messenger;
                handlerC24662.m55015(messenger);
                try {
                    this.f9826.m47861(this.f9825, this.f9829);
                } catch (RemoteException unused) {
                }
            }
            InterfaceC17335 interfaceC17335M55315 = AbstractBinderC24795.m55315(extras.getBinder("extra_session_binder"));
            if (interfaceC17335M55315 != null) {
                this.f9828 = C15600.m37329(mediaBrowser.getSessionToken(), interfaceC17335M55315);
            }
        } catch (IllegalStateException unused2) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9842() {
        this.f9826 = null;
        this.f9829 = null;
        this.f9828 = null;
        this.f9830.m55015(null);
    }

    @Override // l.InterfaceC6016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9840(Messenger messenger, String str, Bundle bundle) {
        if (this.f9829 != messenger) {
            return;
        }
        C17948 c17948 = (C17948) this.f9824.get(str);
        if (c17948 == null) {
            int i = C9743.f31425;
        } else {
            c17948.m41886(bundle);
        }
    }
}
