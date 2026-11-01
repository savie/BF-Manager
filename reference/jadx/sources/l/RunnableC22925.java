package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D98Y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22925 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InputStream f74517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f74518;

    public RunnableC22925(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.f74517 = inputStream;
        this.f74518 = byteArrayOutputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = this.f74517.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    this.f74518.write(bArr, 0, i);
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
