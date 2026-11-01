package l;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۘ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4140 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AudioManager.OnAudioFocusChangeListener f15143;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2708 f15144;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f15145;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15146;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Handler f15147;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11773(C2708 c2708) {
        c2708.getClass();
        this.f15144 = c2708;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11774(C21095 c21095, Handler handler) {
        handler.getClass();
        this.f15143 = c21095;
        this.f15147 = handler;
    }

    public C4140(int i) {
        this.f15144 = C2708.f10419;
        this.f15146 = i;
    }

    public C4140(C15431 c15431) {
        this.f15146 = c15431.m36906();
        this.f15143 = c15431.m36909();
        this.f15147 = c15431.m36904();
        this.f15144 = c15431.m36908();
        this.f15145 = c15431.m36903();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11775(boolean z) {
        this.f15145 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15431 m11772() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f15143;
        if (onAudioFocusChangeListener != null) {
            Handler handler = this.f15147;
            handler.getClass();
            return new C15431(this.f15146, onAudioFocusChangeListener, handler, this.f15144, this.f15145);
        }
        throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
    }
}
