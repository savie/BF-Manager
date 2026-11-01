package l;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14437 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LoudnessCodecController f47322;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f47324 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0219 f47323 = InterfaceC23609.f76493;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34716(int i) {
        LoudnessCodecController loudnessCodecController = this.f47322;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f47322 = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, C5978.m16274(), new C10909(this));
        this.f47322 = loudnessCodecControllerCreate;
        Iterator it = this.f47324.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34717(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f47322;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C2023.m6510(this.f47324.add(mediaCodec));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34718(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f47324.remove(mediaCodec) || (loudnessCodecController = this.f47322) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34715() {
        this.f47324.clear();
        LoudnessCodecController loudnessCodecController = this.f47322;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
