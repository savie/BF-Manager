package l;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: l.ۤܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J21G */
/* JADX INFO: loaded from: classes4.dex */
public class C10997 implements InterfaceC22186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AudioAttributes f34743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34744 = -1;

    public final int hashCode() {
        return this.f34743.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10997) {
            return this.f34743.equals(((C10997) obj).f34743);
        }
        return false;
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f34743;
    }
}
