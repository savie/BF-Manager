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

/* JADX INFO: renamed from: l.ۗ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3431 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f12642;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f12643 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f12644;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f12645;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14722 f12646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f12647;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f12648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f12649;

    public C3431(AbstractC12233 abstractC12233, String str, String str2, String str3, long j) {
        this.f12644 = abstractC12233;
        this.f12649 = str;
        this.f12648 = str2;
        this.f12645 = C6730.m18175(str2);
        this.f12647 = str3;
        this.f12642 = j;
        abstractC12233.getClass();
        if (abstractC12233 instanceof C17543) {
            this.f12646 = new C14722(this);
        } else {
            this.f12646 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10139(OutputStream outputStream, long j) throws IOException {
        if (this.f12646 == null) {
            InputStream inputStreamMo10262 = this.f12644.mo10262(j, this.f12648);
            try {
                C20010.m45296(inputStreamMo10262, outputStream, 12288);
                inputStreamMo10262.close();
                return;
            } catch (Throwable th) {
                if (inputStreamMo10262 != null) {
                    try {
                        inputStreamMo10262.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        final C2020 c2020 = new C2020(this, C5589.m15459(), j, outputStream, new AtomicReference());
        ArrayList arrayList = new ArrayList(2);
        for (final int i = 0; i < 2; i++) {
            arrayList.add(C4716.f16636.submit(new Runnable() { // from class: l.ۢ᩵֨
                @Override // java.lang.Runnable
                public final void run() {
                    c2020.accept(i);
                }
            }));
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
    public static void m10138(C3431 c3431, C5589[] c5589Arr, long j, OutputStream outputStream, AtomicReference atomicReference, int i) {
        try {
            C5589 c5589 = c5589Arr[i];
            long j2 = WXNativeGamePageObject.LENGTH_LIMIT;
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long j3 = (((long) i) * j2) + j;
            do {
                C14722 c14722 = c3431.f12646;
                int iM35246 = c14722.m35246(j3, bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                int i2 = -1;
                if (iM35246 != -1) {
                    int i3 = WXNativeGamePageObject.LENGTH_LIMIT - iM35246;
                    while (i3 > 0) {
                        C14722 c14723 = c14722;
                        int iM35247 = c14722.m35246(j3 + ((long) iM35246), bArr, iM35246, i3);
                        if (iM35247 == -1) {
                            break;
                        }
                        iM35246 += iM35247;
                        i3 -= iM35247;
                        c14722 = c14723;
                    }
                    i2 = iM35246;
                }
                j3 += ((long) 2) * j2;
                if (i2 > 0) {
                    try {
                        c5589.m15460();
                        outputStream.write(bArr, 0, i2);
                        c5589.m15461();
                    } catch (Throwable th) {
                        c5589.m15461();
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
        C14722 c14722 = this.f12646;
        if (c14722 != null) {
            c14722.close();
        }
    }
}
