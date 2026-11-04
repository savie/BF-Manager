package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۬ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9JA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13835 extends AbstractRunnableC7124 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final byte[] f43915;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7979 f43916;

    public C13835(String str, InputStream inputStream, InterfaceC7979 interfaceC7979, InterfaceC10215 interfaceC10215) {
        super(str, inputStream, interfaceC10215);
        this.f43915 = new byte[4];
        this.f43916 = interfaceC7979;
    }

    @Override // l.AbstractRunnableC7124
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13988 mo19522() throws C9469 {
        try {
            byte[] bArr = new byte[m33785()];
            m33784(bArr);
            return this.f43916.read(bArr);
        } catch (C9469 e) {
            throw e;
        } catch (IOException e2) {
            e = e2;
            throw new C9469(e);
        } catch (C2013 e3) {
            e = e3;
            throw new C9469(e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m33785() throws IOException {
        byte[] bArr = this.f43915;
        m33784(bArr);
        return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33784(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = this.f23484.read(bArr, i, length);
            if (i2 == -1) {
                throw new C9469(new EOFException("EOF while reading packet"));
            }
            length -= i2;
            i += i2;
        }
    }
}
