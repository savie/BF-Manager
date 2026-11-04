package l;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ܽۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17491 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f56844;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AudioTrack f56845;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f56846;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f56847;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f56848;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AudioTimestamp f56849 = new AudioTimestamp();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f56850;

    public C17491(AudioTrack audioTrack) {
        this.f56845 = audioTrack;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m40998() {
        AudioTrack audioTrack = this.f56845;
        AudioTimestamp audioTimestamp = this.f56849;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j = audioTimestamp.framePosition;
            long j2 = this.f56847;
            if (j2 > j) {
                if (this.f56850) {
                    this.f56844 += j2;
                    this.f56850 = false;
                } else {
                    this.f56846++;
                }
            }
            this.f56847 = j;
            this.f56848 = j + this.f56844 + (this.f56846 << 32);
        }
        return timestamp;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m40996() {
        return this.f56849.nanoTime / 1000;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m40997() {
        return this.f56848;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40995() {
        this.f56850 = true;
    }
}
