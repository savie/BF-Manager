package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.۫۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13125 implements InterfaceC19838 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41930;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public MediaCodecInfo[] f41931;

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo32602() {
        return true;
    }

    public C13125(boolean z, boolean z2, boolean z3) {
        this.f41930 = (z || z2 || z3) ? 1 : 0;
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32601(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32600(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo32598() {
        if (this.f41931 == null) {
            this.f41931 = new MediaCodecList(this.f41930).getCodecInfos();
        }
        return this.f41931.length;
    }

    @Override // l.InterfaceC19838
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodecInfo mo32599(int i) {
        if (this.f41931 == null) {
            this.f41931 = new MediaCodecList(this.f41930).getCodecInfos();
        }
        return this.f41931[i];
    }
}
