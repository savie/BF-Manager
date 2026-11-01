package l;

import android.media.session.MediaSession;
import android.os.RemoteCallbackList;

/* JADX INFO: renamed from: l.ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public class C5819 implements InterfaceC12170 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16094 f19772;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22316 f19774;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16403 f19775;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13581 f19776;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final BinderC17108 f19777;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final MediaSession f19778;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C8205 f19780;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f19773 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RemoteCallbackList f19779 = new RemoteCallbackList();

    public C5819(ServiceC17701 serviceC17701) {
        MediaSession mediaSessionMo5405 = mo5405(serviceC17701);
        this.f19778 = mediaSessionMo5405;
        BinderC17108 binderC17108 = new BinderC17108(this);
        this.f19777 = binderC17108;
        this.f19774 = new C22316(mediaSessionMo5405.getSessionToken(), binderC17108);
        mediaSessionMo5405.setFlags(3);
    }

    /* JADX INFO: renamed from: ۙ */
    public MediaSession mo5405(ServiceC17701 serviceC17701) {
        return new MediaSession(serviceC17701, "MusicService");
    }

    @Override // l.InterfaceC12170
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8205 mo16001() {
        return this.f19780;
    }

    @Override // l.InterfaceC12170
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16003(C16094 c16094) {
        synchronized (this.f19773) {
            this.f19772 = c16094;
        }
    }

    @Override // l.InterfaceC12170
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16094 mo16004() {
        C16094 c16094;
        synchronized (this.f19773) {
            c16094 = this.f19772;
        }
        return c16094;
    }

    @Override // l.InterfaceC12170
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16403 mo16002() {
        AbstractC16403 abstractC16403;
        synchronized (this.f19773) {
            abstractC16403 = this.f19775;
        }
        return abstractC16403;
    }
}
