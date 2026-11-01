package l;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public class C7811 implements InterfaceC9928 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C19806 f25705;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaBrowser f25707;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22316 f25708;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Context f25709;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Messenger f25711;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Bundle f25712;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HandlerC22628 f25706 = new HandlerC22628(this);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21445 f25710 = new C21445();

    @Override // l.InterfaceC9928
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20504() {
    }

    @Override // l.InterfaceC9928
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo20508() {
    }

    public C7811(Context context, ComponentName componentName, C21216 c21216) {
        this.f25709 = context;
        Bundle bundle = new Bundle();
        this.f25712 = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c21216.f69119 = this;
        this.f25707 = new MediaBrowser(context, componentName, c21216.f69118, bundle);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22316 m20507() {
        if (this.f25708 == null) {
            this.f25708 = C22316.m49480(this.f25707.getSessionToken(), null);
        }
        return this.f25708;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20503() {
        MediaBrowser mediaBrowser = this.f25707;
        try {
            Bundle extras = mediaBrowser.getExtras();
            if (extras == null) {
                return;
            }
            extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                this.f25705 = new C19806(binder, this.f25712);
                HandlerC22628 handlerC22628 = this.f25706;
                Messenger messenger = new Messenger(handlerC22628);
                this.f25711 = messenger;
                handlerC22628.m50158(messenger);
                try {
                    this.f25705.m45030(this.f25709, this.f25711);
                } catch (RemoteException unused) {
                }
            }
            InterfaceC21341 interfaceC21341M50413 = AbstractBinderC22753.m50413(extras.getBinder("extra_session_binder"));
            if (interfaceC21341M50413 != null) {
                this.f25708 = C22316.m49480(mediaBrowser.getSessionToken(), interfaceC21341M50413);
            }
        } catch (IllegalStateException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m20506() {
        this.f25705 = null;
        this.f25711 = null;
        this.f25708 = null;
        this.f25706.m50158(null);
    }

    @Override // l.InterfaceC9928
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20505(Messenger messenger, String str, Bundle bundle) {
        if (this.f25711 != messenger) {
            return;
        }
        C0049 c0049 = (C0049) this.f25710.getOrDefault(str, null);
        if (c0049 == null) {
            int i = C5694.f19421;
        } else {
            c0049.m930(bundle);
        }
    }
}
