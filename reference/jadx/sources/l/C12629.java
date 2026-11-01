package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۫᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98JC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12629 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f42197;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42198;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f42199;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42200;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42201;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f42202;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42203;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f42204;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42205;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f42206;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42207;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f42208;

    public final String toString() {
        int i = this.f42200;
        int i2 = this.f42205;
        int i3 = this.f42197;
        int i4 = this.f42199;
        int i5 = this.f42204;
        int i6 = this.f42202;
        int i7 = this.f42203;
        int i8 = this.f42198;
        int i9 = this.f42207;
        int i10 = this.f42201;
        long j = this.f42208;
        int i11 = this.f42206;
        String str = C17983.f57504;
        Locale locale = Locale.US;
        StringBuilder sbM2791 = C0589.m2791("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", "\n queuedInputBuffers=", i2);
        C23821.m52500(sbM2791, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        C23821.m52500(sbM2791, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        C23821.m52500(sbM2791, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        C23821.m52500(sbM2791, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbM2791.append(j);
        sbM2791.append("\n videoFrameProcessingOffsetCount=");
        sbM2791.append(i11);
        sbM2791.append("\n}");
        return sbM2791.toString();
    }
}
