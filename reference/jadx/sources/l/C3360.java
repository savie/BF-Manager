package l;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3360 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24244 f10969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileDescriptor f10970;

    public C3360(C24244 c24244, FileDescriptor fileDescriptor) {
        this.f10969 = c24244;
        this.f10970 = fileDescriptor;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[4096];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f10970);
            while (true) {
                try {
                    int iM40777 = this.f10969.f78529.m40777(bArr, true);
                    if (iM40777 != -1) {
                        fileOutputStream.write(bArr, 0, iM40777);
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
