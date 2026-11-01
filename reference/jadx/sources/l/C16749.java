package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;

/* JADX INFO: renamed from: l.ܽܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16749 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Properties f53627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f53628;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39304(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[2];
        byteBufferWrap.get(bArr2);
        if (!C12516.f41884.equals(new C22518(bArr2))) {
            throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
        }
        if (bArr.length - 2 <= 2) {
            return;
        }
        byte[] bArr3 = new byte[2];
        byteBufferWrap.get(bArr3);
        int iM50032 = new C22518(bArr3).m50032();
        if (bArr.length - 4 < iM50032) {
            return;
        }
        byte[] bArr4 = new byte[iM50032];
        byteBufferWrap.get(bArr4);
        this.f53627.load(new ByteArrayInputStream(bArr4));
        int length = ((bArr.length - 2) - iM50032) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f53628 = bArr5;
            byteBufferWrap.get(bArr5);
        }
    }

    public final String toString() {
        return "ApkExternalInfo [p=" + this.f53627 + ", otherData=" + Arrays.toString(this.f53628) + "]";
    }
}
