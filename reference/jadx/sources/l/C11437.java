package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۧۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11437 implements InterfaceC21134 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f35946;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Handler f35947;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f35948;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f35949;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0645 f35950;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HandlerThread f35951;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ArrayDeque f35945 = new ArrayDeque();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f35944 = new Object();

    public C11437(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0645 c0645 = new C0645();
        this.f35946 = mediaCodec;
        this.f35951 = handlerThread;
        this.f35950 = c0645;
        this.f35949 = new AtomicReference();
    }

    @Override // l.InterfaceC21134
    public final void start() {
        if (this.f35948) {
            return;
        }
        HandlerThread handlerThread = this.f35951;
        handlerThread.start();
        this.f35947 = new HandlerC5472(this, handlerThread.getLooper());
        this.f35948 = true;
    }

    @Override // l.InterfaceC21134
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28796(int i, int i2, int i3, long j) {
        mo28795();
        C1743 c1743M28794 = m28794();
        c1743M28794.f5946 = i;
        c1743M28794.f5947 = i2;
        c1743M28794.f5949 = j;
        c1743M28794.f5948 = i3;
        Handler handler = this.f35947;
        String str = C7116.f23455;
        handler.obtainMessage(1, c1743M28794).sendToTarget();
    }

    @Override // l.InterfaceC21134
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28797(int i, C22844 c22844, long j, int i2) {
        mo28795();
        C1743 c1743M28794 = m28794();
        c1743M28794.f5946 = i;
        c1743M28794.f5947 = 0;
        c1743M28794.f5949 = j;
        c1743M28794.f5948 = i2;
        MediaCodec.CryptoInfo cryptoInfo = c1743M28794.f5945;
        cryptoInfo.numSubSamples = c22844.f74212;
        int[] iArr = c22844.f74217;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c22844.f74214;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c22844.f74219;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c22844.f74221;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c22844.f74218;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c22844.f74220, c22844.f74213));
        }
        Handler handler = this.f35947;
        String str = C7116.f23455;
        handler.obtainMessage(2, c1743M28794).sendToTarget();
    }

    @Override // l.InterfaceC21134
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28798(Bundle bundle) {
        mo28795();
        Handler handler = this.f35947;
        String str = C7116.f23455;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // l.InterfaceC21134
    public final void flush() {
        if (this.f35948) {
            try {
                Handler handler = this.f35947;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C0645 c0645 = this.f35950;
                c0645.m2832();
                Handler handler2 = this.f35947;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                c0645.m2830();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // l.InterfaceC21134
    public final void shutdown() {
        if (this.f35948) {
            flush();
            this.f35951.quit();
        }
        this.f35948 = false;
    }

    @Override // l.InterfaceC21134
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28795() {
        RuntimeException runtimeException = (RuntimeException) this.f35949.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28793(C11437 c11437, Message message) {
        int i = message.what;
        C1743 c1743 = null;
        if (i == 1) {
            C1743 c1744 = (C1743) message.obj;
            try {
                c11437.f35946.queueInputBuffer(c1744.f5946, 0, c1744.f5947, c1744.f5949, c1744.f5948);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = c11437.f35949;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            c1743 = c1744;
        } else if (i == 2) {
            C1743 c1745 = (C1743) message.obj;
            int i2 = c1745.f5946;
            MediaCodec.CryptoInfo cryptoInfo = c1745.f5945;
            long j = c1745.f5949;
            int i3 = c1745.f5948;
            try {
                synchronized (f35944) {
                    try {
                        c11437.f35946.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = c11437.f35949;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            c1743 = c1745;
        } else if (i == 3) {
            c11437.f35950.m2833();
        } else if (i != 4) {
            AtomicReference atomicReference3 = c11437.f35949;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                c11437.f35946.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = c11437.f35949;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (c1743 != null) {
            m28792(c1743);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1743 m28794() {
        ArrayDeque arrayDeque = f35945;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C1743();
            }
            return (C1743) arrayDeque.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28792(C1743 c1743) {
        ArrayDeque arrayDeque = f35945;
        synchronized (arrayDeque) {
            arrayDeque.add(c1743);
        }
    }
}
