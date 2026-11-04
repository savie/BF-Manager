package l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17954 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0055 f58818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17954(C0055 c0055, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f58818 = c0055;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ByteArrayOutputStream byteArrayOutputStream = this.f58818.f932;
        byteArrayOutputStream.write(bArr, i, Math.min(i2, 32768 - byteArrayOutputStream.size()));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C0055 c0055 = this.f58818;
        if (c0055.f932.size() < 32768) {
            c0055.f932.write(i);
        }
    }
}
