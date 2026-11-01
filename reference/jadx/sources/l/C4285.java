package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4285 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15443;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f15444;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f15445;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f15446 = new byte[1];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4991 f15447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f15448;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C4285(C4991 c4991) {
        this.f15447 = c4991;
        this.f15448 = new ByteArrayInputStream(c4991.f17370);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f15446;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream c3579;
        C13638.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f15445) {
            C4991 c4991 = this.f15447;
            if (!c4991.f17372) {
                if (i2 == 0) {
                    return 0;
                }
                while (true) {
                    InputStream inputStream = this.f15448;
                    if (inputStream == null) {
                        return -1;
                    }
                    int i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        return i3;
                    }
                    this.f15448.close();
                    this.f15448 = null;
                    if (this.f15444) {
                        List list = c4991.f17374;
                        int i4 = this.f15443;
                        this.f15443 = i4 + 1;
                        C11342 c11342 = (C11342) ((ArrayList) list).get(i4);
                        C6402 c6402 = c11342.f38274;
                        if (c6402 == null) {
                            c3579 = new ByteArrayInputStream(c11342.f38272);
                        } else {
                            C22631.m50163(c6402.f21716);
                            c3579 = new C3579(c6402);
                        }
                        this.f15448 = c3579;
                        this.f15444 = false;
                    } else if (this.f15443 < ((ArrayList) c4991.f17374).size()) {
                        C11342 c11343 = (C11342) ((ArrayList) c4991.f17374).get(this.f15443);
                        C11018 c11018 = new C11018(12);
                        c11018.writeInt(c11343.f38273);
                        C6402 c6403 = c11343.f38274;
                        c11018.m27791(c6403 == null ? c11343.f38272.length : c6403.m17551());
                        this.f15448 = new ByteArrayInputStream(c11018.m27773());
                        this.f15444 = true;
                    }
                }
            }
        }
        throw new IOException("Legacy app state stream is closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f15445) {
            return;
        }
        this.f15445 = true;
        InputStream inputStream = this.f15448;
        if (inputStream != null) {
            inputStream.close();
            this.f15448 = null;
        }
    }
}
