package l;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܶ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15431 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f50286;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2708 f50287;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f50288;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f50289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f50290;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f50291;

    public C15431(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C2708 c2708, boolean z) {
        this.f50289 = i;
        this.f50290 = handler;
        this.f50287 = c2708;
        this.f50291 = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.f50288 = new C23192(onAudioFocusChangeListener, handler);
        } else {
            this.f50288 = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f50286 = new AudioFocusRequest.Builder(i).setAudioAttributes(c2708.m8258().f39861).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f50286 = null;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m36906() {
        return this.f50289;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2708 m36908() {
        return this.f50287;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m36903() {
        return this.f50291;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener m36909() {
        return this.f50288;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Handler m36904() {
        return this.f50290;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4140 m36905() {
        return new C4140(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15431)) {
            return false;
        }
        C15431 c15431 = (C15431) obj;
        return this.f50289 == c15431.f50289 && this.f50291 == c15431.f50291 && C13638.equals(this.f50288, c15431.f50288) && C13638.equals(this.f50290, c15431.f50290) && C13638.equals(this.f50287, c15431.f50287);
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f50289), this.f50288, this.f50290, this.f50287, Boolean.valueOf(this.f50291));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AudioFocusRequest m36907() {
        Object obj = this.f50286;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
