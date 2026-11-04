package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes4.dex */
public final class C13702 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f43463;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f43464;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f43465;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f43466 = new AtomicInteger();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2516 f43467;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f43468;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f43469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f43470;

    public C13702(AbstractC18881 abstractC18881, String str, String str2, String str3, long j) {
        this.f43464 = abstractC18881;
        this.f43470 = str;
        this.f43469 = str2;
        this.f43465 = C11293.m28558(str2);
        this.f43463 = str3;
        this.f43468 = j;
        abstractC18881.getClass();
        if (abstractC18881 instanceof C18924) {
            this.f43467 = new C2516(this);
        } else {
            this.f43467 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33496(OutputStream outputStream, long j) throws IOException {
        if (this.f43467 == null) {
            InputStream inputStreamMo35570 = this.f43464.mo35570(j, this.f43469);
            try {
                C5125.m15489(inputStreamMo35570, outputStream, 12288);
                inputStreamMo35570.close();
                return;
            } catch (Throwable th) {
                if (inputStreamMo35570 != null) {
                    try {
                        inputStreamMo35570.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        C8482 c8482 = new C8482(this, C19760.m45518(), j, outputStream, new AtomicReference());
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(C5261.f18540.submit(new RunnableC6991(i, 0, c8482)));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Future) it.next()).get();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33495(C13702 c13702, C19760[] c19760Arr, long j, OutputStream outputStream, AtomicReference atomicReference, int i) {
        try {
            C19760 c19760 = c19760Arr[i];
            long j2 = WXNativeGamePageObject.LENGTH_LIMIT;
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long j3 = (((long) i) * j2) + j;
            do {
                C2516 c2516 = c13702.f43467;
                int iM8405 = c2516.m8405(j3, bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                int i2 = -1;
                if (iM8405 != -1) {
                    int i3 = WXNativeGamePageObject.LENGTH_LIMIT - iM8405;
                    while (i3 > 0) {
                        C2516 c2517 = c2516;
                        int iM8406 = c2516.m8405(j3 + ((long) iM8405), bArr, iM8405, i3);
                        if (iM8406 == -1) {
                            break;
                        }
                        iM8405 += iM8406;
                        i3 -= iM8406;
                        c2516 = c2517;
                    }
                    i2 = iM8405;
                }
                j3 += ((long) 2) * j2;
                if (i2 > 0) {
                    try {
                        c19760.m45519();
                        outputStream.write(bArr, 0, i2);
                        c19760.m45520();
                    } catch (Throwable th) {
                        c19760.m45520();
                        throw th;
                    }
                }
                if (i2 != 102400) {
                    return;
                }
            } while (atomicReference.get() == null);
        } catch (Throwable th2) {
            while (!atomicReference.compareAndSet(null, th2) && atomicReference.get() == null) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2516 c2516 = this.f43467;
        if (c2516 != null) {
            c2516.close();
        }
    }
}
