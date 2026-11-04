package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18665 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f60694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21649 f60695;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f60696;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8002 f60697;

    public RunnableC18665(C21649 c21649, C8002 c8002, AbstractC22044 abstractC22044, boolean z) {
        this.f60695 = c21649;
        this.f60697 = c8002;
        this.f60696 = abstractC22044;
        this.f60694 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC22044 abstractC22044 = this.f60696;
        C21649 c21649 = this.f60695;
        boolean z = c21649.f69113;
        AtomicReference atomicReference = c21649.f69110;
        if (z || atomicReference.get() != null) {
            return;
        }
        C3374 c3374 = c21649.f69111;
        try {
            abstractC22044.mo49834();
            try {
                InputStream inputStreamM51727 = c21649.f69112.m37046().m51727(this.f60697);
                try {
                    OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
                    try {
                        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                        do {
                            int i = inputStreamM51727.read(bArr);
                            if (i == -1) {
                                if (this.f60694) {
                                    try {
                                        c21649.f69114.put(this);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                if (outputStreamMo4289 != null) {
                                    outputStreamMo4289.close();
                                }
                                inputStreamM51727.close();
                                return;
                            }
                            c3374.m11079(i);
                            outputStreamMo4289.write(bArr, 0, i);
                            if (c21649.f69113) {
                                break;
                            }
                            try {
                                inputStreamM51727.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        } while (atomicReference.get() == null);
                        outputStreamMo4289.close();
                        inputStreamM51727.close();
                    } catch (Throwable th2) {
                        if (outputStreamMo4289 != null) {
                            try {
                                outputStreamMo4289.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    inputStreamM51727.close();
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
