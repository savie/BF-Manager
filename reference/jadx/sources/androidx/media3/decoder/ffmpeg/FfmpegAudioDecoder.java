package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import l.AbstractC0509;
import l.AbstractC12505;
import l.C14622;
import l.C16033;
import l.C17983;
import l.C2023;
import l.C2460;
import l.C3331;
import l.C7565;
import l.C7648;
import l.InterfaceC20266;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegAudioDecoder extends AbstractC12505 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3331 f2;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f3;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f4;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f5;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile int f7;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f8;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f9;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f10;

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7565 mo13(C16033 c16033, AbstractC0509 abstractC0509, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC0509;
        if (z) {
            long jFfmpegReset = ffmpegReset(this.f10, this.f4);
            this.f10 = jFfmpegReset;
            if (jFfmpegReset == 0) {
                return new C14622("Error resetting (see logcat).");
            }
            C3331 c3331 = this.f2;
            if (c3331 != null) {
                c3331.m9900();
            }
        }
        ByteBuffer byteBufferM9899 = c16033.f51912;
        String str = C17983.f57504;
        long jM9898 = c16033.f51910;
        C3331 c3332 = this.f2;
        if (c3332 != null) {
            byteBufferM9899 = c3332.m9899(jM9898, byteBufferM9899);
            jM9898 = this.f2.m9898(c16033.f51910);
        }
        ByteBuffer byteBuffer = byteBufferM9899;
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM6 = simpleDecoderOutputBuffer.m6(this.f6, jM9898);
        if (this.f2 != null && iLimit == 0) {
            simpleDecoderOutputBuffer.f2203 = true;
            return null;
        }
        int iFfmpegDecode = ffmpegDecode(this.f10, byteBuffer, iLimit, simpleDecoderOutputBuffer, byteBufferM6, this.f6);
        if (iFfmpegDecode == -2) {
            return new C14622("Error decoding (see logcat).");
        }
        if (iFfmpegDecode == -1) {
            simpleDecoderOutputBuffer.f2203 = true;
            return null;
        }
        if (iFfmpegDecode == 0) {
            simpleDecoderOutputBuffer.f2203 = true;
            return null;
        }
        if (!this.f5) {
            this.f7 = ffmpegGetChannelCount(this.f10);
            this.f9 = ffmpegGetSampleRate(this.f10);
            if (this.f9 == 0 && "alac".equals(this.f3)) {
                this.f4.getClass();
                C2460 c2460 = new C2460(this.f4);
                c2460.m7510(this.f4.length - 4);
                this.f9 = c2460.m7531();
            }
            this.f5 = true;
        }
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.f0;
        byteBuffer2.getClass();
        byteBuffer2.position(0);
        byteBuffer2.limit(iFfmpegDecode);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public FfmpegAudioDecoder(int i, C7648 c7648, boolean z) throws C14622 {
        byte[] bArr;
        byte[] bArrArray;
        super(new C16033[16], new SimpleDecoderOutputBuffer[16]);
        if (!FfmpegLibrary.m20()) {
            throw new C14622("Failed to load decoder native libraries.");
        }
        String str = c7648.f25265;
        str.getClass();
        String strM19 = FfmpegLibrary.m19(c7648);
        strM19.getClass();
        this.f3 = strM19;
        List list = c7648.f25268;
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
        C3331 c3331 = null;
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
        this.f4 = bArr;
        String str2 = c7648.f25262;
        if ("audio/mpeg".equals(str) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2) || "application/mp4".equals(str2))) {
            c3331 = new C3331(FfmpegLibrary.m18());
        }
        this.f2 = c3331;
        this.f8 = z ? 4 : 2;
        this.f6 = z ? 131070 : 65535;
        long jFfmpegInitialize = ffmpegInitialize(strM19, bArr, z, c7648.f25260, c7648.f25249);
        this.f10 = jFfmpegInitialize;
        if (jFfmpegInitialize == 0) {
            throw new C14622("Initialization failed.");
        }
        m31059(i);
    }

    @Override // l.InterfaceC10388
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.m21() + "-" + this.f3;
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16033 mo11() {
        return new C16033(2, FfmpegLibrary.m18());
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC0509 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC20266() { // from class: l.ۧܺۙ
            @Override // l.InterfaceC20266
            /* JADX INFO: renamed from: ۙ */
            public final void mo13561(AbstractC0509 abstractC0509) {
                this.f37677.m31060((AbstractC0509) ((SimpleDecoderOutputBuffer) abstractC0509));
            }
        });
    }

    @Override // l.AbstractC12505
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7565 mo12(Throwable th) {
        return new C14622("Unexpected decode error", th);
    }

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.f6 = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f0;
        byteBuffer.getClass();
        C2023.m6507(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        simpleDecoderOutputBuffer.f0 = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // l.AbstractC12505, l.InterfaceC10388
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14() {
        super.mo14();
        ffmpegRelease(this.f10);
        this.f10 = 0L;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m17() {
        return this.f7;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m16() {
        return this.f9;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m10() {
        return this.f8;
    }
}
