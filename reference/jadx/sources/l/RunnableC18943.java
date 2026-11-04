package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D98Y */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18943 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream f61431;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f61432;

    public RunnableC18943(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.f61431 = inputStream;
        this.f61432 = byteArrayOutputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = this.f61431.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    this.f61432.write(bArr, 0, i);
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
