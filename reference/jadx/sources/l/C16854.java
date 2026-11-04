package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܺ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes5.dex */
public final class C16854 implements InterfaceC14420 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f54337;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20388 f54338;

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo32289(InterfaceC24118 interfaceC24118) {
        return false;
    }

    public C16854(MediaCodec mediaCodec, C20388 c20388) {
        this.f54337 = mediaCodec;
        this.f54338 = c20388;
        if (Build.VERSION.SDK_INT < 35 || c20388 == null) {
            return;
        }
        c20388.m46795(mediaCodec);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩸ */
    public final int mo32294() {
        return this.f54337.dequeueInputBuffer(0L);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final int mo32280(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f54337.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩷ */
    public final MediaFormat mo32292() {
        return this.f54337.getOutputFormat();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩷ */
    public final ByteBuffer mo32293(int i) {
        return this.f54337.getInputBuffer(i);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ᩸ */
    public final ByteBuffer mo32295(int i) {
        return this.f54337.getOutputBuffer(i);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32283(int i, int i2, int i3, long j) {
        this.f54337.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32285(int i, C22844 c22844, long j, int i2) {
        this.f54337.queueSecureInputBuffer(i, 0, c22844.m51561(), j, i2);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۤ */
    public final void mo32291(int i) {
        this.f54337.releaseOutputBuffer(i, false);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32284(int i, long j) {
        this.f54337.releaseOutputBuffer(i, j);
    }

    @Override // l.InterfaceC14420
    public final void flush() {
        this.f54337.flush();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32281() {
        C20388 c20388 = this.f54338;
        MediaCodec mediaCodec = this.f54337;
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
        }
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32288(final InterfaceC3980 interfaceC3980, Handler handler) {
        this.f54337.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.ۧ۬ۙ
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC3980.mo12835(j);
            }
        }, handler);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32287(Surface surface) {
        this.f54337.setOutputSurface(surface);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۤ */
    public final void mo32290() {
        this.f54337.detachOutputSurface();
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32286(Bundle bundle) {
        this.f54337.setParameters(bundle);
    }

    @Override // l.InterfaceC14420
    /* JADX INFO: renamed from: ۙ */
    public final void mo32282(int i) {
        this.f54337.setVideoScalingMode(i);
    }
}
