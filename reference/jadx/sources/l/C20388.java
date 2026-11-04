package l;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8SC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20388 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LoudnessCodecController f65366;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f65368 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12669 f65367 = InterfaceC3234.f10538;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46794(int i) {
        LoudnessCodecController loudnessCodecController = this.f65366;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f65366 = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, C18466.m43012(), new C23372(this));
        this.f65366 = loudnessCodecControllerCreate;
        Iterator it = this.f65368.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46795(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f65366;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C20782.m47568(this.f65368.add(mediaCodec));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46796(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f65368.remove(mediaCodec) || (loudnessCodecController = this.f65366) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46793() {
        this.f65368.clear();
        LoudnessCodecController loudnessCodecController = this.f65366;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
