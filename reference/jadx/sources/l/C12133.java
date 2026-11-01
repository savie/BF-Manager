package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12133 implements InterfaceC13544 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f40627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14437 f40628;

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo30202(InterfaceC3146 interfaceC3146) {
        return false;
    }

    public C12133(MediaCodec mediaCodec, C14437 c14437) {
        this.f40627 = mediaCodec;
        this.f40628 = c14437;
        if (Build.VERSION.SDK_INT < 35 || c14437 == null) {
            return;
        }
        c14437.m34717(mediaCodec);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo30191() {
        return this.f40627.dequeueInputBuffer(0L);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo30193(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f40627.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaFormat mo30205() {
        return this.f40627.getOutputFormat();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo30206(int i) {
        return this.f40627.getInputBuffer(i);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo30192(int i) {
        return this.f40627.getOutputBuffer(i);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30196(int i, int i2, int i3, long j) {
        this.f40627.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30198(int i, C8977 c8977, long j, int i2) {
        this.f40627.queueSecureInputBuffer(i, 0, c8977.m23287(), j, i2);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo30204(int i) {
        this.f40627.releaseOutputBuffer(i, false);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30197(int i, long j) {
        this.f40627.releaseOutputBuffer(i, j);
    }

    @Override // l.InterfaceC13544
    public final void flush() {
        this.f40627.flush();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30194() {
        C14437 c14437 = this.f40628;
        MediaCodec mediaCodec = this.f40627;
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
        }
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30201(final InterfaceC4370 interfaceC4370, Handler handler) {
        this.f40627.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.֡ۗۙ
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC4370.mo6814(j);
            }
        }, handler);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30200(Surface surface) {
        this.f40627.setOutputSurface(surface);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo30203() {
        this.f40627.detachOutputSurface();
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30199(Bundle bundle) {
        this.f40627.setParameters(bundle);
    }

    @Override // l.InterfaceC13544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30195(int i) {
        this.f40627.setVideoScalingMode(i);
    }
}
