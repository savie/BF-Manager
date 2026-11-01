package l;

import android.content.pm.PackageInstaller;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13046 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final PackageInstaller.Session f43496;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22218 f43497;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12107 f43498;

    public RunnableC13046(C22218 c22218, C12107 c12107, PackageInstaller.Session session) {
        this.f43497 = c22218;
        this.f43498 = c12107;
        this.f43496 = session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12107 c12107 = this.f43498;
        C22218 c22218 = this.f43497;
        boolean z = c22218.f72660;
        AtomicReference atomicReference = c22218.f72657;
        if (z || atomicReference.get() != null) {
            return;
        }
        C8516 c8516 = c22218.f72659;
        try {
            InputStream inputStreamM7471 = c22218.f72658.m49332().m7471(c12107);
            try {
                OutputStream outputStreamOpenWrite = this.f43496.openWrite(c12107.m30093(), 0L, c12107.getSize());
                try {
                    byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                    do {
                        int i = inputStreamM7471.read(bArr);
                        if (i == -1) {
                            this.f43496.fsync(outputStreamOpenWrite);
                            if (outputStreamOpenWrite != null) {
                                outputStreamOpenWrite.close();
                            }
                            inputStreamM7471.close();
                            try {
                                c22218.f72656.put(this);
                                return;
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                        c8516.m22242(i);
                        outputStreamOpenWrite.write(bArr, 0, i);
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
                    outputStreamOpenWrite.close();
                    inputStreamM7471.close();
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
                inputStreamM7471.close();
                throw th4;
            }
        } catch (Exception e) {
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}
