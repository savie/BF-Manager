package l;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۢۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9836 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18412 f31657;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31658;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f31659;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Handler f31660;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AudioManager.OnAudioFocusChangeListener f31661;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25612(C13345 c13345, Handler handler) {
        handler.getClass();
        this.f31661 = c13345;
        this.f31660 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25613(C18412 c18412) {
        c18412.getClass();
        this.f31657 = c18412;
    }

    public C9836(int i) {
        this.f31657 = C18412.f59977;
        this.f31658 = i;
    }

    public C9836(C2379 c2379) {
        this.f31658 = c2379.m8083();
        this.f31661 = c2379.m8082();
        this.f31660 = c2379.m8085();
        this.f31657 = c2379.m8084();
        this.f31659 = c2379.m8081();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25614(boolean z) {
        this.f31659 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2379 m25611() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f31661;
        if (onAudioFocusChangeListener != null) {
            Handler handler = this.f31660;
            handler.getClass();
            return new C2379(this.f31658, onAudioFocusChangeListener, handler, this.f31657, this.f31659);
        }
        throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
    }
}
