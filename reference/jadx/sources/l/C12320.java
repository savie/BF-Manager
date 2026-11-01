package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.۫ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8N9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12320 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Handler f41155;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HandlerThread f41156;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public MediaFormat f41159;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public MediaCodec.CryptoException f41160;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public IllegalStateException f41162;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC3146 f41164;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public MediaFormat f41165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f41166;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f41167;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public MediaCodec.CodecException f41169;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object f41157 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8040 f41158 = new C8040();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8040 f41163 = new C8040();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f41161 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f41168 = new ArrayDeque();

    public C12320(HandlerThread handlerThread) {
        this.f41156 = handlerThread;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30586(MediaCodec mediaCodec) {
        C2023.m6510(this.f41155 == null);
        HandlerThread handlerThread = this.f41156;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41155 = handler;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30583() {
        synchronized (this.f41157) {
            this.f41166 = true;
            this.f41156.quit();
            m30582();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30584() {
        synchronized (this.f41157) {
            IllegalStateException illegalStateException = this.f41162;
            if (illegalStateException != null) {
                this.f41162 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f41169;
            if (codecException != null) {
                this.f41169 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f41160;
            if (cryptoException != null) {
                this.f41160 = null;
                throw cryptoException;
            }
            int iM21148 = -1;
            if (this.f41167 > 0 || this.f41166) {
                return -1;
            }
            if (!this.f41158.m21149()) {
                iM21148 = this.f41158.m21148();
            }
            return iM21148;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30585(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f41157) {
            IllegalStateException illegalStateException = this.f41162;
            if (illegalStateException != null) {
                this.f41162 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f41169;
            if (codecException != null) {
                this.f41169 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f41160;
            if (cryptoException != null) {
                this.f41160 = null;
                throw cryptoException;
            }
            if (this.f41167 > 0 || this.f41166) {
                return -1;
            }
            if (this.f41163.m21149()) {
                return -1;
            }
            int iM21148 = this.f41163.m21148();
            if (iM21148 >= 0) {
                C2023.m6508(this.f41159);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f41161.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iM21148 == -2) {
                this.f41159 = (MediaFormat) this.f41168.remove();
            }
            return iM21148;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m30588() {
        MediaFormat mediaFormat;
        synchronized (this.f41157) {
            mediaFormat = this.f41159;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30589() {
        synchronized (this.f41157) {
            this.f41167++;
            Handler handler = this.f41155;
            String str = C17983.f57504;
            handler.post(new Runnable() { // from class: l.ܽۢۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C12320.m30581(this.f53159);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f41157) {
            this.f41158.m21147(i);
            InterfaceC3146 interfaceC3146 = this.f41164;
            if (interfaceC3146 != null) {
                AbstractC14955 abstractC14955 = ((C6487) interfaceC3146).f21882;
                if (abstractC14955.f48787 != null) {
                    abstractC14955.f48787.mo9681();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f41157) {
            MediaFormat mediaFormat = this.f41165;
            if (mediaFormat != null) {
                this.f41163.m21147(-2);
                this.f41168.add(mediaFormat);
                this.f41165 = null;
            }
            this.f41163.m21147(i);
            this.f41161.add(bufferInfo);
            InterfaceC3146 interfaceC3146 = this.f41164;
            if (interfaceC3146 != null) {
                AbstractC14955 abstractC14955 = ((C6487) interfaceC3146).f21882;
                if (abstractC14955.f48787 != null) {
                    abstractC14955.f48787.mo9681();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41157) {
            this.f41169 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41157) {
            this.f41160 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41157) {
            this.f41163.m21147(-2);
            this.f41168.add(mediaFormat);
            this.f41165 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30587(InterfaceC3146 interfaceC3146) {
        synchronized (this.f41157) {
            this.f41164 = interfaceC3146;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30581(C12320 c12320) {
        synchronized (c12320.f41157) {
            if (c12320.f41166) {
                return;
            }
            long j = c12320.f41167 - 1;
            c12320.f41167 = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                c12320.m30580(new IllegalStateException());
            } else {
                c12320.m30582();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m30582() {
        ArrayDeque arrayDeque = this.f41168;
        if (!arrayDeque.isEmpty()) {
            this.f41165 = (MediaFormat) arrayDeque.getLast();
        }
        this.f41158.m21146();
        this.f41163.m21146();
        this.f41161.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30580(IllegalStateException illegalStateException) {
        synchronized (this.f41157) {
            this.f41162 = illegalStateException;
        }
    }
}
