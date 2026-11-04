package l;

import android.content.pm.PackageInstaller;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0766 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21649 f2774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final PackageInstaller.Session f2775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8002 f2776;

    public RunnableC0766(C21649 c21649, C8002 c8002, PackageInstaller.Session session) {
        this.f2774 = c21649;
        this.f2776 = c8002;
        this.f2775 = session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8002 c8002 = this.f2776;
        C21649 c21649 = this.f2774;
        boolean z = c21649.f69113;
        AtomicReference atomicReference = c21649.f69110;
        if (z || atomicReference.get() != null) {
            return;
        }
        C3374 c3374 = c21649.f69111;
        try {
            InputStream inputStreamM51727 = c21649.f69112.m37046().m51727(c8002);
            try {
                OutputStream outputStreamOpenWrite = this.f2775.openWrite(c8002.m21843(), 0L, c8002.getSize());
                try {
                    byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                    do {
                        int i = inputStreamM51727.read(bArr);
                        if (i == -1) {
                            this.f2775.fsync(outputStreamOpenWrite);
                            if (outputStreamOpenWrite != null) {
                                outputStreamOpenWrite.close();
                            }
                            inputStreamM51727.close();
                            try {
                                c21649.f69114.put(this);
                                return;
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                        c3374.m11079(i);
                        outputStreamOpenWrite.write(bArr, 0, i);
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
                    outputStreamOpenWrite.close();
                    inputStreamM51727.close();
                } catch (Throwable th2) {
                    if (outputStreamOpenWrite != null) {
                        try {
                            outputStreamOpenWrite.close();
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
    }
}
