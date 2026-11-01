package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16366 implements InterfaceC9498 {
    @Override // l.InterfaceC9498
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13544 mo16259(C1735 c1735) {
        MediaCodec mediaCodecM38561 = null;
        try {
            mediaCodecM38561 = m38561(c1735);
            Trace.beginSection("configureCodec");
            Surface surface = c1735.f6855;
            mediaCodecM38561.configure(c1735.f6852, surface, c1735.f6854, (surface == null && c1735.f6851.f17680 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM38561.start();
            Trace.endSection();
            return new C12133(mediaCodecM38561, c1735.f6850);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM38561 != null) {
                mediaCodecM38561.release();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static MediaCodec m38561(C1735 c1735) throws IOException {
        String str = c1735.f6851.f17691;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }
}
