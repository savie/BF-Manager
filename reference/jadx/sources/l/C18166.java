package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18166 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f58055;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8289 f58056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f58057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58058;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18166(C8289 c8289, BufferedInputStream bufferedInputStream, String str, boolean z) {
        super(bufferedInputStream);
        this.f58056 = c8289;
        this.f58058 = str;
        this.f58055 = z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        String str = this.f58058;
        C8289 c8289 = this.f58056;
        try {
            int i = super.read();
            if (i == -1 && !this.f58057) {
                this.f58057 = true;
                C11088.m27973(c8289.f28786.mo33986(), str);
            }
            return i;
        } catch (C17978 e) {
            C11088.m27969(c8289.f28786.mo33986(), str);
            if (this.f58055) {
                C19808.m45036();
            }
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String str = this.f58058;
        C8289 c8289 = this.f58056;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && !this.f58057) {
                this.f58057 = true;
                C11088.m27973(c8289.f28786.mo33986(), str);
            }
            return i3;
        } catch (C17978 e) {
            C11088.m27969(c8289.f28786.mo33986(), str);
            if (this.f58055) {
                C19808.m45036();
            }
            throw e;
        }
    }
}
