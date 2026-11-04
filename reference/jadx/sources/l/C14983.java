package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14983 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f48902 = new byte[1];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f48903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f48904;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48905;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11254 f48906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f48907;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C14983(C11254 c11254) {
        this.f48906 = c11254;
        this.f48907 = new ByteArrayInputStream(c11254.f35533);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f48902;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream c15729;
        C17359.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f48904) {
            C11254 c11254 = this.f48906;
            if (!c11254.f35532) {
                if (i2 == 0) {
                    return 0;
                }
                while (true) {
                    InputStream inputStream = this.f48907;
                    if (inputStream == null) {
                        return -1;
                    }
                    int i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        return i3;
                    }
                    this.f48907.close();
                    this.f48907 = null;
                    if (this.f48903) {
                        List list = c11254.f35534;
                        int i4 = this.f48905;
                        this.f48905 = i4 + 1;
                        C5289 c5289 = (C5289) ((ArrayList) list).get(i4);
                        C23189 c23189 = c5289.f18617;
                        if (c23189 == null) {
                            c15729 = new ByteArrayInputStream(c5289.f18615);
                        } else {
                            C3051.m9914(c23189.f75152);
                            c15729 = new C15729(c23189);
                        }
                        this.f48907 = c15729;
                        this.f48903 = false;
                    } else if (this.f48905 < ((ArrayList) c11254.f35534).size()) {
                        C5289 c52810 = (C5289) ((ArrayList) c11254.f35534).get(this.f48905);
                        C6178 c6178 = new C6178(12);
                        c6178.writeInt(c52810.f18616);
                        C23189 c231810 = c52810.f18617;
                        c6178.m17803(c231810 == null ? c52810.f18615.length : c231810.m52116());
                        this.f48907 = new ByteArrayInputStream(c6178.m17796());
                        this.f48903 = true;
                    }
                }
            }
        }
        throw new IOException("Legacy app state stream is closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f48904) {
            return;
        }
        this.f48904 = true;
        InputStream inputStream = this.f48907;
        if (inputStream != null) {
            inputStream.close();
            this.f48907 = null;
        }
    }
}
