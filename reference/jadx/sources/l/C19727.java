package l;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: l.᩵᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J21G */
/* JADX INFO: loaded from: classes5.dex */
public class C19727 implements InterfaceC8438 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AudioAttributes f63305;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f63306 = -1;

    public final int hashCode() {
        return this.f63305.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19727) {
            return this.f63305.equals(((C19727) obj).f63305);
        }
        return false;
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f63305;
    }
}
