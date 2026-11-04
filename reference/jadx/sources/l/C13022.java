package l;

import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStream;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13022 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f41696;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f41697;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23465 f41698;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41699;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InputStream f41700;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f41702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f41701 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f41703 = 0;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C13022(C23465 c23465, Iterator it, int i, long j) throws IOException {
        this.f41698 = c23465;
        this.f41697 = it;
        this.f41699 = i;
        this.f41702 = j;
        m32451();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32451() throws IOException {
        Iterator it = this.f41697;
        if (!it.hasNext()) {
            this.f41700 = null;
            return;
        }
        C4797 c4797 = (C4797) it.next();
        Iterator it2 = c4797.getDstExtentsList().iterator();
        long numBlocks = 0;
        while (it2.hasNext()) {
            numBlocks += ((C9776) it2.next()).getNumBlocks() * ((long) this.f41699);
        }
        this.f41701 = numBlocks;
        this.f41703 = 0L;
        if (c4797.getType() == EnumC13506.ZERO) {
            this.f41700 = new C12323(numBlocks);
            return;
        }
        C17497 c17497 = new C17497(this.f41698.f75920, c4797.getDataOffset() + this.f41702, c4797.getDataLength());
        int i = C1836.f6214[c4797.getType().ordinal()];
        if (i == 1) {
            this.f41700 = c17497;
            return;
        }
        if (i == 2) {
            byte[] bArr = this.f41696;
            if (bArr == null) {
                bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                this.f41696 = bArr;
            }
            this.f41700 = new C1024(new C7746(c17497, bArr));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                this.f41700 = new ZstdInputStream(c17497, RecyclingBufferPool.INSTANCE);
                return;
            } else {
                throw new IOException("Unsupported operation type: " + c4797.getType().getNumber());
            }
        }
        byte[] bArr2 = this.f41696;
        if (bArr2 == null) {
            bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            this.f41696 = bArr2;
        }
        this.f41700 = C24653.m55007(new C7746(c17497, bArr2));
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f41700;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f41700;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i == -1) {
                InputStream inputStream2 = this.f41700;
                if (inputStream2 != null) {
                    inputStream2.close();
                    if (this.f41701 != this.f41703) {
                        throw new IOException("Size check fail");
                    }
                }
                m32451();
            } else {
                this.f41703++;
                return i;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f41700 == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.f41700.read(bArr, i, i2);
            if (i3 <= 0) {
                InputStream inputStream = this.f41700;
                if (inputStream != null) {
                    inputStream.close();
                    if (this.f41701 != this.f41703) {
                        throw new IOException("Size check fail");
                    }
                }
                m32451();
            } else {
                this.f41703 += (long) i3;
                return i3;
            }
        } while (this.f41700 != null);
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f41700;
        if (inputStream != null) {
            inputStream.close();
            this.f41700 = null;
        }
    }
}
