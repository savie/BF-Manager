package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.۟ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7193 implements InterfaceC10016 {
    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19129(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19131() {
        return false;
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo19127() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodecInfo mo19128(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // l.InterfaceC10016
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19130(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
