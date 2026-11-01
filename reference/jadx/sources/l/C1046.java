package l;

import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStream;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1046 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4849;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f4850;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18686 f4851;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InputStream f4852;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f4853;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f4854;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f4848 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f4855 = 0;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C1046(C18686 c18686, Iterator it, int i, long j) throws IOException {
        this.f4851 = c18686;
        this.f4850 = it;
        this.f4849 = i;
        this.f4854 = j;
        m3907();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3907() throws IOException {
        Iterator it = this.f4850;
        if (!it.hasNext()) {
            this.f4852 = null;
            return;
        }
        C4885 c4885 = (C4885) it.next();
        Iterator it2 = c4885.getDstExtentsList().iterator();
        long numBlocks = 0;
        while (it2.hasNext()) {
            numBlocks += ((C5903) it2.next()).getNumBlocks() * ((long) this.f4849);
        }
        this.f4848 = numBlocks;
        this.f4855 = 0L;
        if (c4885.getType() == EnumC3080.ZERO) {
            this.f4852 = new C9222(numBlocks);
            return;
        }
        C21508 c21508 = new C21508(this.f4851.f60642, c4885.getDataOffset() + this.f4854, c4885.getDataLength());
        int i = C3868.f14459[c4885.getType().ordinal()];
        if (i == 1) {
            this.f4852 = c21508;
            return;
        }
        if (i == 2) {
            byte[] bArr = this.f4853;
            if (bArr == null) {
                bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                this.f4853 = bArr;
            }
            this.f4852 = new C6624(new C18845(c21508, bArr));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                this.f4852 = new ZstdInputStream(c21508, RecyclingBufferPool.INSTANCE);
                return;
            } else {
                throw new IOException("Unsupported operation type: " + c4885.getType().getNumber());
            }
        }
        byte[] bArr2 = this.f4853;
        if (bArr2 == null) {
            bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            this.f4853 = bArr2;
        }
        this.f4852 = C10362.m26260(new C18845(c21508, bArr2));
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f4852;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f4852;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i == -1) {
                InputStream inputStream2 = this.f4852;
                if (inputStream2 != null) {
                    inputStream2.close();
                    if (this.f4848 != this.f4855) {
                        throw new IOException("Size check fail");
                    }
                }
                m3907();
            } else {
                this.f4855++;
                return i;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4852 == null) {
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
            int i3 = this.f4852.read(bArr, i, i2);
            if (i3 <= 0) {
                InputStream inputStream = this.f4852;
                if (inputStream != null) {
                    inputStream.close();
                    if (this.f4848 != this.f4855) {
                        throw new IOException("Size check fail");
                    }
                }
                m3907();
            } else {
                this.f4855 += (long) i3;
                return i3;
            }
        } while (this.f4852 != null);
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f4852;
        if (inputStream != null) {
            inputStream.close();
            this.f4852 = null;
        }
    }
}
