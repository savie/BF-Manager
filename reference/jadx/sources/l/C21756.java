package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21756 extends BufferedInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f70512;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f70513;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4670 f70514;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, Math.min(i2, EnumC23529.f76192));
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21756(C18934 c18934, InputStream inputStream, InputStream inputStream2, C4670 c4670) {
        super(inputStream, 32768);
        this.f70512 = inputStream2;
        this.f70514 = c4670;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f70513) {
            return;
        }
        C19431.m44468(this.f70512);
        int i = C18934.f61253;
        C12563.m31270(this.f70514);
        this.f70513 = true;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
