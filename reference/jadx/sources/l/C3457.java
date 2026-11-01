package l;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: renamed from: l.ۗ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3457 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4995 f12718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f12719;

    public C3457(C4995 c4995, FileDescriptor fileDescriptor) {
        this.f12718 = c4995;
        this.f12719 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C4995 c4995 = this.f12718;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f12719);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1 || !c4995.f17381.m35394(i, bArr)) {
                        break;
                        break;
                    }
                    c4995.f17387.sendEmptyMessage(1);
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
            c4995.f17384.countDown();
            throw th3;
        }
        c4995.f17384.countDown();
    }
}
