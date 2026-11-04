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

/* JADX INFO: renamed from: l.۫ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12929 implements InterfaceC14420 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16658 f41408;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f41409;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41410 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20388 f41411;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21134 f41412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41413;

    public C12929(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC21134 interfaceC21134, C20388 c20388) {
        this.f41409 = mediaCodec;
        this.f41408 = new C16658(handlerThread);
        this.f41412 = interfaceC21134;
        this.f41411 = c20388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32277(C12929 c12929, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C20388 c20388;
        C16658 c16658 = c12929.f41408;
        MediaCodec mediaCodec = c12929.f41409;
        c16658.m39368(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        c12929.f41412.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c20388 = c12929.f41411) != null) {
            c20388.m46795(mediaCodec);
        }
        c12929.f41410 = 1;
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32283(int i, int i2, int i3, long j) {
        this.f41412.mo28796(i, i2, i3, j);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32285(int i, C22844 c22844, long j, int i2) {
        this.f41412.mo28797(i, c22844, j, i2);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo32291(int i) {
        this.f41409.releaseOutputBuffer(i, false);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32284(int i, long j) {
        this.f41409.releaseOutputBuffer(i, j);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo32294() {
        this.f41412.mo28795();
        return this.f41408.m39366();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo32280(MediaCodec.BufferInfo bufferInfo) {
        this.f41412.mo28795();
        return this.f41408.m39367(bufferInfo);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaFormat mo32292() {
        return this.f41408.m39370();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo32293(int i) {
        return this.f41409.getInputBuffer(i);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo32295(int i) {
        return this.f41409.getOutputBuffer(i);
    }

    @Override // l.InterfaceC14420
    public final void flush() {
        this.f41412.flush();
        MediaCodec mediaCodec = this.f41409;
        mediaCodec.flush();
        this.f41408.m39371();
        mediaCodec.start();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32281() {
        C20388 c20388 = this.f41411;
        MediaCodec mediaCodec = this.f41409;
        try {
            if (this.f41410 == 1) {
                this.f41412.shutdown();
                this.f41408.m39372();
            }
            this.f41410 = 2;
            if (this.f41413) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && c20388 != null) {
                    c20388.m46796(mediaCodec);
                }
                mediaCodec.release();
                this.f41413 = true;
            }
        } catch (Throwable th) {
            if (!this.f41413) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && c20388 != null) {
                        c20388.m46796(mediaCodec);
                    }
                    mediaCodec.release();
                    this.f41413 = true;
                }
            }
            throw th;
        }
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32288(final InterfaceC3980 interfaceC3980, Handler handler) {
        this.f41409.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.ۤۜۙ
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC3980.mo12835(j);
            }
        }, handler);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32289(InterfaceC24118 interfaceC24118) {
        this.f41408.m39369(interfaceC24118);
        return true;
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32287(Surface surface) {
        this.f41409.setOutputSurface(surface);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo32290() {
        this.f41409.detachOutputSurface();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32286(Bundle bundle) {
        this.f41412.mo28798(bundle);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32282(int i) {
        this.f41409.setVideoScalingMode(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m32279(int i) {
        return m32276(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m32278(int i) {
        return m32276(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32276(int i, String str) {
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
