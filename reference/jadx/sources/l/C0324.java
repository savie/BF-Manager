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

/* JADX INFO: renamed from: l.֡ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0324 implements InterfaceC11427 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ArrayDeque f1701 = new ArrayDeque();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object f1702 = new Object();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HandlerThread f1703;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f1704;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f1705;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Handler f1706;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22176 f1707;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1708;

    public C0324(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C22176 c22176 = new C22176();
        this.f1704 = mediaCodec;
        this.f1703 = handlerThread;
        this.f1707 = c22176;
        this.f1705 = new AtomicReference();
    }

    @Override // l.InterfaceC11427
    public final void start() {
        if (this.f1708) {
            return;
        }
        HandlerThread handlerThread = this.f1703;
        handlerThread.start();
        this.f1706 = new HandlerC15848(this, handlerThread.getLooper());
        this.f1708 = true;
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1969(int i, int i2, int i3, long j) {
        mo1968();
        C20081 c20081M1967 = m1967();
        c20081M1967.f65238 = i;
        c20081M1967.f65237 = i2;
        c20081M1967.f65235 = j;
        c20081M1967.f65239 = i3;
        Handler handler = this.f1706;
        String str = C17983.f57504;
        handler.obtainMessage(1, c20081M1967).sendToTarget();
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1970(int i, C8977 c8977, long j, int i2) {
        mo1968();
        C20081 c20081M1967 = m1967();
        c20081M1967.f65238 = i;
        c20081M1967.f65237 = 0;
        c20081M1967.f65235 = j;
        c20081M1967.f65239 = i2;
        MediaCodec.CryptoInfo cryptoInfo = c20081M1967.f65236;
        cryptoInfo.numSubSamples = c8977.f30737;
        int[] iArr = c8977.f30735;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c8977.f30742;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c8977.f30739;
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
        byte[] bArr2 = c8977.f30736;
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
        cryptoInfo.mode = c8977.f30744;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c8977.f30743, c8977.f30738));
        }
        Handler handler = this.f1706;
        String str = C17983.f57504;
        handler.obtainMessage(2, c20081M1967).sendToTarget();
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1971(Bundle bundle) {
        mo1968();
        Handler handler = this.f1706;
        String str = C17983.f57504;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // l.InterfaceC11427
    public final void flush() {
        if (this.f1708) {
            try {
                Handler handler = this.f1706;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C22176 c22176 = this.f1707;
                c22176.m49199();
                Handler handler2 = this.f1706;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                c22176.m49196();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // l.InterfaceC11427
    public final void shutdown() {
        if (this.f1708) {
            flush();
            this.f1703.quit();
        }
        this.f1708 = false;
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1968() {
        RuntimeException runtimeException = (RuntimeException) this.f1705.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1965(C0324 c0324, Message message) {
        int i = message.what;
        C20081 c20081 = null;
        if (i == 1) {
            C20081 c20082 = (C20081) message.obj;
            try {
                c0324.f1704.queueInputBuffer(c20082.f65238, 0, c20082.f65237, c20082.f65235, c20082.f65239);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = c0324.f1705;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            c20081 = c20082;
        } else if (i == 2) {
            C20081 c20083 = (C20081) message.obj;
            int i2 = c20083.f65238;
            MediaCodec.CryptoInfo cryptoInfo = c20083.f65236;
            long j = c20083.f65235;
            int i3 = c20083.f65239;
            try {
                synchronized (f1702) {
                    try {
                        c0324.f1704.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = c0324.f1705;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            c20081 = c20083;
        } else if (i == 3) {
            c0324.f1707.m49198();
        } else if (i != 4) {
            AtomicReference atomicReference3 = c0324.f1705;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                c0324.f1704.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = c0324.f1705;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (c20081 != null) {
            m1966(c20081);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20081 m1967() {
        ArrayDeque arrayDeque = f1701;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C20081();
            }
            return (C20081) arrayDeque.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1966(C20081 c20081) {
        ArrayDeque arrayDeque = f1701;
        synchronized (arrayDeque) {
            arrayDeque.add(c20081);
        }
    }
}
