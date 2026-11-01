package l;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4289 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4995 f15455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f15456;

    public C4289(C4995 c4995, FileDescriptor fileDescriptor) {
        this.f15455 = c4995;
        this.f15456 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[4096];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f15456);
            while (true) {
                try {
                    int iM35392 = this.f15455.f17393.m35392(bArr, true);
                    if (iM35392 != -1) {
                        fileOutputStream.write(bArr, 0, iM35392);
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }
}
