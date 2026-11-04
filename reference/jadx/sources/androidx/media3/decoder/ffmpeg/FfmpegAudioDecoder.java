package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import l.AbstractC11655;
import l.AbstractC16876;
import l.C15384;
import l.C15648;
import l.C20606;
import l.C20782;
import l.C21287;
import l.C24336;
import l.C5690;
import l.C7116;
import l.InterfaceC1961;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioDecoder extends AbstractC16876 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f2;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f3;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f4;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f5;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f7;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f8;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f9;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C24336 f10;

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15384 mo11(C5690 c5690, AbstractC11655 abstractC11655, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC11655;
        if (z) {
            long jFfmpegReset = ffmpegReset(this.f3, this.f5);
            this.f3 = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new C20606("Error resetting (see logcat).");
            }
            C24336 c24336 = this.f10;
            if (c24336 != null) {
                c24336.m54382();
            }
        }
        ByteBuffer byteBufferM54381 = c5690.f19651;
        String str = C7116.f23455;
        long jM54380 = c5690.f19652;
        C24336 c24337 = this.f10;
        if (c24337 != null) {
            byteBufferM54381 = c24337.m54381(jM54380, byteBufferM54381);
            jM54380 = this.f10.m54380(c5690.f19652);
        }
        ByteBuffer byteBuffer = byteBufferM54381;
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM6 = simpleDecoderOutputBuffer.m6(this.f6, jM54380);
        if (this.f10 != null && iLimit == 0) {
            simpleDecoderOutputBuffer.f37779 = true;
            return null;
        }
        int iFfmpegDecode = ffmpegDecode(this.f3, byteBuffer, iLimit, simpleDecoderOutputBuffer, byteBufferM6, this.f6);
        if (iFfmpegDecode == -2) {
            return new C20606("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.f37779 = true;
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.f37779 = true;
            return null;
        }
        if (!this.f4) {
            this.f9 = ffmpegGetChannelCount(this.f3);
            this.f8 = ffmpegGetSampleRate(this.f3);
            if (this.f8 == 0 && "alac".equals(this.f2)) {
                this.f5.getClass();
                C21287 c21287 = new C21287(this.f5);
                c21287.m48510(this.f5.length - 4);
                this.f8 = c21287.m48512();
            }
            this.f4 = true;
        }
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        byteBuffer2.position(0);
        byteBuffer2.limit(iFfmpegDecode);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public FfmpegAudioDecoder(int i, C15648 c15648, boolean z) throws C20606 {
        byte[] bArr;
        byte[] bArrArray;
        super(new C5690[16], new SimpleDecoderOutputBuffer[16]);
        if (!FfmpegLibrary.m21()) {
            throw new C20606("Failed to load decoder native libraries.");
        }
        String str = c15648.f50848;
        str.getClass();
        String strM19 = FfmpegLibrary.m19(c15648);
        strM19.getClass();
        this.f2 = strM19;
        List list = c15648.f50835;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    b = 0;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b = 1;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    b = 2;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b = 3;
                }
                break;
        }
        C24336 c24336 = null;
        switch (b) {
            case 0:
                byte[] bArr2 = (byte[]) list.get(0);
                byte[] bArr3 = (byte[]) list.get(1);
                bArr = new byte[bArr2.length + bArr3.length + 6];
                bArr[0] = (byte) (bArr2.length >> 8);
                bArr[1] = (byte) (bArr2.length & 255);
                System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
                bArr[bArr2.length + 2] = 0;
                bArr[bArr2.length + 3] = 0;
                bArr[bArr2.length + 4] = (byte) (bArr3.length >> 8);
                bArr[bArr2.length + 5] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr, bArr2.length + 6, bArr3.length);
                break;
            case 1:
            case 3:
                bArrArray = (byte[]) list.get(0);
                bArr = bArrArray;
                break;
            case 2:
                byte[] bArr4 = (byte[]) list.get(0);
                int length = bArr4.length + 12;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                byteBufferAllocate.putInt(length);
                byteBufferAllocate.putInt(1634492771);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.put(bArr4, 0, bArr4.length);
                bArrArray = byteBufferAllocate.array();
                bArr = bArrArray;
                break;
            default:
                bArr = null;
                break;
        }
        this.f5 = bArr;
        String str2 = c15648.f50820;
        if ("audio/mpeg".equals(str) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2) || "application/mp4".equals(str2))) {
            c24336 = new C24336(FfmpegLibrary.m18());
        }
        this.f10 = c24336;
        this.f7 = z ? 4 : 2;
        this.f6 = z ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(strM19, bArr, z, c15648.f50829, c15648.f50843);
        this.f3 = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new C20606("Initialization failed.");
        }
        m39833(i);
    }

    @Override // l.InterfaceC19860
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.m22() + "-" + this.f2;
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5690 mo17() {
        return new C5690(2, FfmpegLibrary.m18());
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC11655 mo16() {
        return new SimpleDecoderOutputBuffer(new InterfaceC1961() { // from class: l.᩹ܰۙ
            @Override // l.InterfaceC1961
            /* JADX INFO: renamed from: ۙ */
            public final void mo6746(AbstractC11655 abstractC11655) {
                this.f76595.m39836((AbstractC11655) ((SimpleDecoderOutputBuffer) abstractC11655));
            }
        });
    }

    @Override // l.AbstractC16876
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15384 mo10(Throwable th) {
        return new C20606("Unexpected decode error", th);
    }

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.f6 = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f0;
        byteBuffer.getClass();
        C20782.m47565(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        simpleDecoderOutputBuffer.f0 = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // l.AbstractC16876, l.InterfaceC19860
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12() {
        super.mo12();
        ffmpegRelease(this.f3);
        this.f3 = 0L;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m15() {
        return this.f9;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m13() {
        return this.f8;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m14() {
        return this.f7;
    }
}
