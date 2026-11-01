package l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC17108 extends AbstractBinderC22753 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f54575;

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void mo39928() {
    }

    public BinderC17108(C5819 c5819) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f54575 = new AtomicReference(c5819);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39963() {
        this.f54575.set(null);
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39939(String str, Bundle bundle, C2559 c2559) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17729(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ */
    public final void mo17728(InterfaceC3701 interfaceC3701) {
        C5819 c5819 = (C5819) this.f54575.get();
        if (c5819 == null) {
            return;
        }
        c5819.f19779.register(interfaceC3701, new C16094("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c5819.f19773) {
        }
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39959(InterfaceC3701 interfaceC3701) {
        C5819 c5819 = (C5819) this.f54575.get();
        if (c5819 == null) {
            return;
        }
        c5819.f19779.unregister(interfaceC3701);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c5819.f19773) {
        }
    }

    @Override // l.InterfaceC21341
    public final String getPackageName() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Bundle mo39961() {
        ((C5819) this.f54575.get()).getClass();
        return null;
    }

    @Override // l.InterfaceC21341
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final PendingIntent mo39932() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long mo39929() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3970 mo39952() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39935(int i, int i2) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39956(int i, int i2) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39954() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo39951(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo39946(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39937(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo39945() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39958(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo39931(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39957(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39936(long j) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    public final void pause() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    public final void stop() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    public final void next() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    public final void previous() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void mo39966() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo39968() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    public final void seekTo(long j) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39940(C5113 c5113) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39941(C5113 c5113, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39933(float f) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39944(boolean z) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39934(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo39950(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39938(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13581 mo39962() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8205 mo39930() {
        long j;
        C5819 c5819 = (C5819) this.f54575.get();
        if (c5819 == null) {
            return null;
        }
        C8205 c8205 = c5819.f19780;
        C13581 c13581 = c5819.f19776;
        if (c8205 == null) {
            return c8205;
        }
        long j2 = c8205.f28569;
        long jM33201 = -1;
        if (j2 == -1) {
            return c8205;
        }
        int i = c8205.f28571;
        if (i != 3 && i != 4 && i != 5) {
            return c8205;
        }
        long j3 = c8205.f28568;
        if (j3 <= 0) {
            return c8205;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((long) (c8205.f28576 * (jElapsedRealtime - j3))) + j2;
        if (c13581 != null && c13581.m33199()) {
            jM33201 = c13581.m33201();
        }
        if (jM33201 < 0 || j4 <= jM33201) {
            j = j4 < 0 ? 0L : j4;
        } else {
            j = jM33201;
        }
        C21610 c21610 = new C21610(c8205);
        c21610.m48322(c8205.f28571, j, c8205.f28576, jElapsedRealtime);
        return c21610.m48321();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39960(C9223 c9223) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39943(C9223 c9223, int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo39942(C9223 c9223) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo39955(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence mo39967() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Bundle mo39965() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo39947() {
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void mo39949() {
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo39953() {
        return ((C5819) this.f54575.get()) != null ? 0 : -1;
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo39964() {
        return ((C5819) this.f54575.get()) != null ? 0 : -1;
    }

    @Override // l.InterfaceC21341
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo39948() {
        throw new AssertionError();
    }
}
