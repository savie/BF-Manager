package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes.dex */
public final class C25060 implements InterfaceC6218 {
    @Override // l.InterfaceC6218
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14420 mo17850(C12183 c12183) {
        MediaCodec mediaCodecM55885 = null;
        try {
            mediaCodecM55885 = m55885(c12183);
            Trace.beginSection("configureCodec");
            Surface surface = c12183.f39167;
            mediaCodecM55885.configure(c12183.f39168, surface, c12183.f39169, (surface == null && c12183.f39165.f1532 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM55885.start();
            Trace.endSection();
            return new C16854(mediaCodecM55885, c12183.f39170);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM55885 != null) {
                mediaCodecM55885.release();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static MediaCodec m55885(C12183 c12183) throws IOException {
        String str = c12183.f39165.f1533;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }
}
