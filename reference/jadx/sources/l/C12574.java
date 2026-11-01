package l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C12574 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17512 f42042;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12574(C17512 c17512, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f42042 = c17512;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ByteArrayOutputStream byteArrayOutputStream = this.f42042.f55681;
        byteArrayOutputStream.write(bArr, i, Math.min(i2, 32768 - byteArrayOutputStream.size()));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C17512 c17512 = this.f42042;
        if (c17512.f55681.size() < 32768) {
            c17512.f55681.write(i);
        }
    }
}
