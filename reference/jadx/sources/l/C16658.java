package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܺۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16658 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public IllegalStateException f53809;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public MediaCodec.CryptoException f53811;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Handler f53812;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public MediaFormat f53814;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC24118 f53815;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f53816;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public MediaFormat f53817;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HandlerThread f53819;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f53820;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public MediaCodec.CodecException f53821;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f53807 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0138 f53808 = new C0138();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0138 f53818 = new C0138();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f53810 = new ArrayDeque();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f53813 = new ArrayDeque();

    public C16658(HandlerThread handlerThread) {
        this.f53819 = handlerThread;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39368(MediaCodec mediaCodec) {
        C20782.m47568(this.f53812 == null);
        HandlerThread handlerThread = this.f53819;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f53812 = handler;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39372() {
        synchronized (this.f53807) {
            this.f53820 = true;
            this.f53819.quit();
            m39365();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39366() {
        synchronized (this.f53807) {
            IllegalStateException illegalStateException = this.f53809;
            if (illegalStateException != null) {
                this.f53809 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f53821;
            if (codecException != null) {
                this.f53821 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f53811;
            if (cryptoException != null) {
                this.f53811 = null;
                throw cryptoException;
            }
            int iM1298 = -1;
            if (this.f53816 > 0 || this.f53820) {
                return -1;
            }
            if (!this.f53808.m1299()) {
                iM1298 = this.f53808.m1298();
            }
            return iM1298;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39367(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f53807) {
            IllegalStateException illegalStateException = this.f53809;
            if (illegalStateException != null) {
                this.f53809 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f53821;
            if (codecException != null) {
                this.f53821 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f53811;
            if (cryptoException != null) {
                this.f53811 = null;
                throw cryptoException;
            }
            if (this.f53816 > 0 || this.f53820) {
                return -1;
            }
            if (this.f53818.m1299()) {
                return -1;
            }
            int iM1298 = this.f53818.m1298();
            if (iM1298 >= 0) {
                C20782.m47566(this.f53817);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f53810.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iM1298 == -2) {
                this.f53817 = (MediaFormat) this.f53813.remove();
            }
            return iM1298;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m39370() {
        MediaFormat mediaFormat;
        synchronized (this.f53807) {
            mediaFormat = this.f53817;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39371() {
        synchronized (this.f53807) {
            this.f53816++;
            Handler handler = this.f53812;
            String str = C7116.f23455;
            handler.post(new Runnable() { // from class: l.᩻ۜۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C16658.m39364(this.f80473);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f53807) {
            this.f53808.m1297(i);
            InterfaceC24118 interfaceC24118 = this.f53815;
            if (interfaceC24118 != null) {
                AbstractC8454 abstractC8454 = ((C9199) interfaceC24118).f30009;
                if (abstractC8454.f27704 != null) {
                    abstractC8454.f27704.mo26953();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f53807) {
            MediaFormat mediaFormat = this.f53814;
            if (mediaFormat != null) {
                this.f53818.m1297(-2);
                this.f53813.add(mediaFormat);
                this.f53814 = null;
            }
            this.f53818.m1297(i);
            this.f53810.add(bufferInfo);
            InterfaceC24118 interfaceC24118 = this.f53815;
            if (interfaceC24118 != null) {
                AbstractC8454 abstractC8454 = ((C9199) interfaceC24118).f30009;
                if (abstractC8454.f27704 != null) {
                    abstractC8454.f27704.mo26953();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f53807) {
            this.f53821 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f53807) {
            this.f53811 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f53807) {
            this.f53818.m1297(-2);
            this.f53813.add(mediaFormat);
            this.f53814 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39369(InterfaceC24118 interfaceC24118) {
        synchronized (this.f53807) {
            this.f53815 = interfaceC24118;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39364(C16658 c16658) {
        synchronized (c16658.f53807) {
            if (c16658.f53820) {
                return;
            }
            long j = c16658.f53816 - 1;
            c16658.f53816 = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                c16658.m39363(new IllegalStateException());
            } else {
                c16658.m39365();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m39365() {
        ArrayDeque arrayDeque = this.f53813;
        if (!arrayDeque.isEmpty()) {
            this.f53814 = (MediaFormat) arrayDeque.getLast();
        }
        this.f53808.m1296();
        this.f53818.m1296();
        this.f53810.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39363(IllegalStateException illegalStateException) {
        synchronized (this.f53807) {
            this.f53809 = illegalStateException;
        }
    }
}
