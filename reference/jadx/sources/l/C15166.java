package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: renamed from: l.ܳۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes5.dex */
public final class C15166 implements InterfaceC6218 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22626 f49458;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19642 f49459;

    public C15166(C22626 c22626, C19642 c19642) {
        this.f49458 = c22626;
        this.f49459 = c19642;
    }

    @Override // l.InterfaceC6218
    /* JADX INFO: renamed from: ۙ */
    public final C12929 mo17850(C12183 c12183) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c12183.f39165.f1533;
        C12929 c12929 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C12929 c129210 = new C12929(mediaCodecCreateByCodecName, (HandlerThread) this.f49458.get(), new C11437(mediaCodecCreateByCodecName, (HandlerThread) this.f49459.get()), c12183.f39170);
                try {
                    Trace.endSection();
                    Surface surface = c12183.f39167;
                    C12929.m32277(c129210, c12183.f39168, surface, c12183.f39169, (surface == null && c12183.f39165.f1532 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return c129210;
                } catch (Exception e) {
                    e = e;
                    c12929 = c129210;
                    if (c12929 != null) {
                        c12929.mo32281();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }
}
