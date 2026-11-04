package l;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.᩹ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23498 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24244 f75975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f75976;

    public C23498(C24244 c24244, FileDescriptor fileDescriptor) {
        this.f75975 = c24244;
        this.f75976 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C24244 c24244 = this.f75975;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f75976);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1 || !c24244.f78519.m40779(i, bArr)) {
                        break;
                        break;
                    }
                    c24244.f78521.sendEmptyMessage(1);
                }
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            c24244.f78520.countDown();
            throw th3;
        }
        c24244.f78520.countDown();
    }
}
