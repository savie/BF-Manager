package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;

/* JADX INFO: renamed from: l.ۤۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10815 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Properties f34299;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f34300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27552(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[2];
        byteBufferWrap.get(bArr2);
        if (!C22750.f73821.equals(new C6342(bArr2))) {
            throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
        }
        if (bArr.length - 2 <= 2) {
            return;
        }
        byte[] bArr3 = new byte[2];
        byteBufferWrap.get(bArr3);
        int iM18069 = new C6342(bArr3).m18069();
        if (bArr.length - 4 < iM18069) {
            return;
        }
        byte[] bArr4 = new byte[iM18069];
        byteBufferWrap.get(bArr4);
        this.f34299.load(new ByteArrayInputStream(bArr4));
        int length = ((bArr.length - 2) - iM18069) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f34300 = bArr5;
            byteBufferWrap.get(bArr5);
        }
    }

    public final String toString() {
        return "ApkExternalInfo [p=" + this.f34299 + ", otherData=" + Arrays.toString(this.f34300) + "]";
    }
}
