package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.᩷ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20599 implements InterfaceC10016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67115;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public MediaCodecInfo[] f67116;

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19131() {
        return true;
    }

    public C20599(boolean z, boolean z2, boolean z3) {
        this.f67115 = (z || z2 || z3) ? 1 : 0;
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19130(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19129(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ */
    public final int mo19127() {
        if (this.f67116 == null) {
            this.f67116 = new MediaCodecList(this.f67115).getCodecInfos();
        }
        return this.f67116.length;
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ */
    public final MediaCodecInfo mo19128(int i) {
        if (this.f67116 == null) {
            this.f67116 = new MediaCodecList(this.f67115).getCodecInfos();
        }
        return this.f67116[i];
    }
}
