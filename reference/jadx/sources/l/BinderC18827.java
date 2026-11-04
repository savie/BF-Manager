package l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC18827 extends AbstractBinderC24795 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f61185;

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ܿ */
    public final void mo40703() {
    }

    public BinderC18827(C9876 c9876) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f61185 = new AtomicReference(c9876);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43686() {
        this.f61185.set(null);
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40688(String str, Bundle bundle, C23060 c23060) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28673(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo28672(InterfaceC1674 interfaceC1674) {
        C9876 c9876 = (C9876) this.f61185.get();
        if (c9876 == null) {
            return;
        }
        c9876.f31782.register(interfaceC1674, new C5734("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c9876.f31783) {
        }
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40713(InterfaceC1674 interfaceC1674) {
        C9876 c9876 = (C9876) this.f61185.get();
        if (c9876 == null) {
            return;
        }
        c9876.f31782.unregister(interfaceC1674);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c9876.f31783) {
        }
    }

    @Override // l.InterfaceC17335
    public final String getPackageName() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ܺ */
    public final Bundle mo40702() {
        ((C9876) this.f61185.get()).getClass();
        return null;
    }

    @Override // l.InterfaceC17335
    public final String getTag() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ֫ */
    public final PendingIntent mo40679() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۫ */
    public final long mo40699() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۟ */
    public final C2177 mo40695() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40684(int i, int i2) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40710(int i, int i2) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40708() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۤ */
    public final void mo40697(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩴ */
    public final void mo40705(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40686(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩴ */
    public final void mo40704() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40712(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩸ */
    public final void mo40716(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40711(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40685(long j) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    public final void pause() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    public final void stop() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    public final void next() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    public final void previous() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩶ */
    public final void mo40707() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ܳ */
    public final void mo40701() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    public final void seekTo(long j) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40691(C19573 c19573) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40692(C19573 c19573, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40682(float f) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40693(boolean z) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40683(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۤ */
    public final void mo40696(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40687(Bundle bundle, String str) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ܰ */
    public final C21811 mo40700() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩸ */
    public final C3668 mo40715() {
        long j;
        C9876 c9876 = (C9876) this.f61185.get();
        if (c9876 == null) {
            return null;
        }
        C3668 c3668 = c9876.f31780;
        C21811 c21811 = c9876.f31781;
        if (c3668 == null) {
            return c3668;
        }
        long j2 = c3668.f12604;
        long jM49469 = -1;
        if (j2 == -1) {
            return c3668;
        }
        int i = c3668.f12605;
        if (i != 3 && i != 4 && i != 5) {
            return c3668;
        }
        long j3 = c3668.f12606;
        if (j3 <= 0) {
            return c3668;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((long) (c3668.f12609 * (jElapsedRealtime - j3))) + j2;
        if (c21811 != null && c21811.m49467()) {
            jM49469 = c21811.m49469();
        }
        if (jM49469 < 0 || j4 <= jM49469) {
            j = j4 < 0 ? 0L : j4;
        } else {
            j = jM49469;
        }
        C17838 c17838 = new C17838(c3668);
        c17838.m41692(c3668.f12605, j, c3668.f12609, jElapsedRealtime);
        return c17838.m41691();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40714(C6762 c6762) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40690(C6762 c6762, int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۙ */
    public final void mo40689(C6762 c6762) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩷ */
    public final void mo40709(int i) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۘ */
    public final CharSequence mo40681() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩵ */
    public final Bundle mo40706() {
        throw new AssertionError();
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۧ */
    public final void mo40698() {
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۗ */
    public final void mo40680() {
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ۚ */
    public final int mo40694() {
        return ((C9876) this.f61185.get()) != null ? 0 : -1;
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩹ */
    public final int mo40717() {
        return ((C9876) this.f61185.get()) != null ? 0 : -1;
    }

    @Override // l.InterfaceC17335
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo40718() {
        throw new AssertionError();
    }
}
