package l;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩷ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20786 implements InterfaceC13544 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f67595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12320 f67596;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14437 f67597;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f67598;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11427 f67599;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67600 = 0;

    public C20786(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC11427 interfaceC11427, C14437 c14437) {
        this.f67598 = mediaCodec;
        this.f67596 = new C12320(handlerThread);
        this.f67599 = interfaceC11427;
        this.f67597 = c14437;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46775(C20786 c20786, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C14437 c14437;
        C12320 c12320 = c20786.f67596;
        MediaCodec mediaCodec = c20786.f67598;
        c12320.m30586(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        c20786.f67599.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c14437 = c20786.f67597) != null) {
            c14437.m34717(mediaCodec);
        }
        c20786.f67600 = 1;
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30196(int i, int i2, int i3, long j) {
        this.f67599.mo1969(i, i2, i3, j);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30198(int i, C8977 c8977, long j, int i2) {
        this.f67599.mo1970(i, c8977, j, i2);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۨ */
    public final void mo30204(int i) {
        this.f67598.releaseOutputBuffer(i, false);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30197(int i, long j) {
        this.f67598.releaseOutputBuffer(i, j);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۖ */
    public final int mo30191() {
        this.f67599.mo1968();
        return this.f67596.m30584();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final int mo30193(MediaCodec.BufferInfo bufferInfo) {
        this.f67599.mo1968();
        return this.f67596.m30585(bufferInfo);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ܰ */
    public final MediaFormat mo30205() {
        return this.f67596.m30588();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ܰ */
    public final ByteBuffer mo30206(int i) {
        return this.f67598.getInputBuffer(i);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۖ */
    public final ByteBuffer mo30192(int i) {
        return this.f67598.getOutputBuffer(i);
    }

    @Override // l.InterfaceC13544
    public final void flush() {
        this.f67599.flush();
        MediaCodec mediaCodec = this.f67598;
        mediaCodec.flush();
        this.f67596.m30589();
        mediaCodec.start();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30194() {
        C14437 c14437 = this.f67597;
        MediaCodec mediaCodec = this.f67598;
        try {
            if (this.f67600 == 1) {
                this.f67599.shutdown();
                this.f67596.m30583();
            }
            this.f67600 = 2;
            if (this.f67595) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && c14437 != null) {
                    c14437.m34718(mediaCodec);
                }
                mediaCodec.release();
                this.f67595 = true;
            }
        } catch (Throwable th) {
            if (!this.f67595) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && c14437 != null) {
                        c14437.m34718(mediaCodec);
                    }
                    mediaCodec.release();
                    this.f67595 = true;
                }
            }
            throw th;
        }
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30201(final InterfaceC4370 interfaceC4370, Handler handler) {
        this.f67598.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.᩵ۢۙ
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC4370.mo6814(j);
            }
        }, handler);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo30202(InterfaceC3146 interfaceC3146) {
        this.f67596.m30587(interfaceC3146);
        return true;
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30200(Surface surface) {
        this.f67598.setOutputSurface(surface);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۨ */
    public final void mo30203() {
        this.f67598.detachOutputSurface();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30199(Bundle bundle) {
        this.f67599.mo1971(bundle);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ */
    public final void mo30195(int i) {
        this.f67598.setVideoScalingMode(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m46776(int i) {
        return m46774(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m46777(int i) {
        return m46774(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46774(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
