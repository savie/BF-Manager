package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1050 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f4861;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22218 f4862;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f4863;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12107 f4864;

    public RunnableC1050(C22218 c22218, C12107 c12107, AbstractC20745 abstractC20745, boolean z) {
        this.f4862 = c22218;
        this.f4864 = c12107;
        this.f4861 = abstractC20745;
        this.f4863 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC20745 abstractC20745 = this.f4861;
        C22218 c22218 = this.f4862;
        boolean z = c22218.f72660;
        AtomicReference atomicReference = c22218.f72657;
        if (z || atomicReference.get() != null) {
            return;
        }
        C8516 c8516 = c22218.f72659;
        try {
            abstractC20745.mo46720();
            try {
                InputStream inputStreamM7471 = c22218.f72658.m49332().m7471(this.f4864);
                try {
                    OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
                    try {
                        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                        do {
                            int i = inputStreamM7471.read(bArr);
                            if (i == -1) {
                                if (this.f4863) {
                                    try {
                                        c22218.f72656.put(this);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                if (outputStreamMo33976 != null) {
                                    outputStreamMo33976.close();
                                }
                                inputStreamM7471.close();
                                return;
                            }
                            c8516.m22242(i);
                            outputStreamMo33976.write(bArr, 0, i);
                            if (c22218.f72660) {
                                break;
                            }
                            try {
                                inputStreamM7471.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        } while (atomicReference.get() == null);
                        outputStreamMo33976.close();
                        inputStreamM7471.close();
                    } catch (Throwable th2) {
                        if (outputStreamMo33976 != null) {
                            try {
                                outputStreamMo33976.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    inputStreamM7471.close();
                    throw th4;
                }
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (IOException e2) {
            while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
            }
        }
    }
}
