package l;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: l.۫ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12216 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f40830;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f40831;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f40832;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f40833;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AudioTrack f40834;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AudioTimestamp f40835 = new AudioTimestamp();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f40836;

    public C12216(AudioTrack audioTrack) {
        this.f40834 = audioTrack;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m30322() {
        AudioTrack audioTrack = this.f40834;
        AudioTimestamp audioTimestamp = this.f40835;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j = audioTimestamp.framePosition;
            long j2 = this.f40836;
            if (j2 > j) {
                if (this.f40831) {
                    this.f40832 += j2;
                    this.f40831 = false;
                } else {
                    this.f40830++;
                }
            }
            this.f40836 = j;
            this.f40833 = j + this.f40832 + (this.f40830 << 32);
        }
        return timestamp;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m30324() {
        return this.f40835.nanoTime / 1000;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m30325() {
        return this.f40833;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30323() {
        this.f40831 = true;
    }
}
