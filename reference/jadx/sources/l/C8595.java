package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8595 extends AbstractRunnableC19178 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f29703;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6500 f29704;

    public C8595(String str, InputStream inputStream, InterfaceC6500 interfaceC6500, InterfaceC22729 interfaceC22729) {
        super(str, inputStream, interfaceC22729);
        this.f29703 = new byte[4];
        this.f29704 = interfaceC6500;
    }

    @Override // l.AbstractRunnableC19178
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8805 mo22378() throws C21317 {
        try {
            byte[] bArr = new byte[m22376()];
            m22377(bArr);
            return this.f29704.read(bArr);
        } catch (IOException e) {
            e = e;
            throw new C21317(e);
        } catch (C17271 e2) {
            e = e2;
            throw new C21317(e);
        } catch (C21317 e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m22376() throws IOException {
        byte[] bArr = this.f29703;
        m22377(bArr);
        return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22377(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = this.f61947.read(bArr, i, length);
            if (i2 == -1) {
                throw new C21317(new EOFException("EOF while reading packet"));
            }
            length -= i2;
            i += i2;
        }
    }
}
