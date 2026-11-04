package l;

import android.media.session.MediaSession;
import android.os.RemoteCallbackList;

/* JADX INFO: renamed from: l.ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public class C9876 implements InterfaceC7640 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15600 f31775;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0182 f31776;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final MediaSession f31777;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BinderC18827 f31778;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5734 f31779;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3668 f31780;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21811 f31781;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f31783 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RemoteCallbackList f31782 = new RemoteCallbackList();

    public C9876(ServiceC4415 serviceC4415) {
        MediaSession mediaSessionMo22552 = mo22552(serviceC4415);
        this.f31777 = mediaSessionMo22552;
        BinderC18827 binderC18827 = new BinderC18827(this);
        this.f31778 = binderC18827;
        this.f31775 = new C15600(mediaSessionMo22552.getSessionToken(), binderC18827);
        mediaSessionMo22552.setFlags(3);
    }

    /* JADX INFO: renamed from: ۙ */
    public MediaSession mo22552(ServiceC4415 serviceC4415) {
        return new MediaSession(serviceC4415, "MusicService");
    }

    @Override // l.InterfaceC7640
    /* JADX INFO: renamed from: ᩸ */
    public final C3668 mo20860() {
        return this.f31780;
    }

    @Override // l.InterfaceC7640
    /* JADX INFO: renamed from: ۙ */
    public void mo20858(C5734 c5734) {
        synchronized (this.f31783) {
            this.f31779 = c5734;
        }
    }

    @Override // l.InterfaceC7640
    /* JADX INFO: renamed from: ᩷ */
    public C5734 mo20859() {
        C5734 c5734;
        synchronized (this.f31783) {
            c5734 = this.f31779;
        }
        return c5734;
    }

    @Override // l.InterfaceC7640
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC0182 mo20857() {
        AbstractC0182 abstractC0182;
        synchronized (this.f31783) {
            abstractC0182 = this.f31776;
        }
        return abstractC0182;
    }
}
