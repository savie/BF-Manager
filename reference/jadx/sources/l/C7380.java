package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: renamed from: l.۟ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7380 implements InterfaceC9498 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8792 f24480;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10203 f24481;

    public C7380(C8792 c8792, C10203 c10203) {
        this.f24480 = c8792;
        this.f24481 = c10203;
    }

    @Override // l.InterfaceC9498
    /* JADX INFO: renamed from: ۙ */
    public final C20786 mo16259(C1735 c1735) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c1735.f6851.f17691;
        C20786 c20786 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C20786 c20787 = new C20786(mediaCodecCreateByCodecName, (HandlerThread) this.f24480.get(), new C0324(mediaCodecCreateByCodecName, (HandlerThread) this.f24481.get()), c1735.f6850);
                try {
                    Trace.endSection();
                    Surface surface = c1735.f6855;
                    C20786.m46775(c20787, c1735.f6852, surface, c1735.f6854, (surface == null && c1735.f6851.f17680 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return c20787;
                } catch (Exception e) {
                    e = e;
                    c20786 = c20787;
                    if (c20786 != null) {
                        c20786.mo30194();
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
