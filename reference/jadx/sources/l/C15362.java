package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.ܳ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes5.dex */
public final class C15362 implements InterfaceC19838 {
    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32600(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo32602() {
        return false;
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ */
    public final int mo32598() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ */
    public final MediaCodecInfo mo32599(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32601(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
