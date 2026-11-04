package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۙ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C4908 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f17140;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13856 f17141;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f17142;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808[] f17143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f17144 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f17145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15130 f17146;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17037 f17147;

    public C4908(long j, long j2, long j3, C13856 c13856, C17037 c17037) {
        this.f17142 = j;
        this.f17145 = j2;
        this.f17140 = j3;
        this.f17141 = c13856;
        this.f17147 = c17037;
        this.f17143 = C19606.m45234(c13856);
        this.f17146 = new C15130(c13856);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m15063() {
        return this.f17140;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15062(byte[] bArr, int i, InterfaceC7509 interfaceC7509) {
        m15065();
        C15130 c15130 = this.f17146;
        c15130.getClass();
        C17359.requireNonNull(bArr, "pattern");
        int iM36404 = c15130.m36404();
        if (i < 0 || i > iM36404) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "fromIndex="));
        }
        if (bArr.length != 0) {
            int i2 = iM36404 - i;
            if (bArr.length > i2) {
                i = -1;
            } else {
                InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
                int[] iArrM33903 = C13921.m33903(bArr);
                int iMin = Math.min(65536, i2);
                byte[] bArr2 = new byte[iMin];
                int i3 = 0;
                while (i < iM36404 && !interfaceC7509M41888.mo924()) {
                    int iMin2 = Math.min(iMin, iM36404 - i);
                    c15130.m36405(i, bArr2, 0, iMin2);
                    for (int i4 = 0; i4 < iMin2; i4++) {
                        byte b = bArr2[i4];
                        while (i3 > 0 && bArr[i3] != b) {
                            i3 = iArrM33903[i3 - 1];
                        }
                        if (bArr[i3] == b && (i3 = i3 + 1) == bArr.length) {
                            i = ((i + i4) - bArr.length) + 1;
                        }
                    }
                    i += iMin2;
                }
                i = -1;
            }
        }
        m15065();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15066(byte[] bArr, int i, InterfaceC7509 interfaceC7509) {
        int iMin;
        m15065();
        C15130 c15130 = this.f17146;
        c15130.getClass();
        C17359.requireNonNull(bArr, "pattern");
        int iM36404 = c15130.m36404();
        if (i < 0) {
            iMin = -1;
        } else if (bArr.length == 0) {
            iMin = Math.min(i, iM36404);
        } else {
            int iMin2 = Math.min(i, iM36404 - bArr.length);
            if (iMin2 < 0) {
                iMin = -1;
            } else {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr2[i2] = bArr[(bArr.length - i2) - 1];
                }
                int[] iArrM33903 = C13921.m33903(bArr2);
                InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
                int iMin3 = Math.min(65536, bArr.length + iMin2);
                byte[] bArr3 = new byte[iMin3];
                int length2 = (iMin2 + bArr.length) - 1;
                int i3 = 0;
                while (length2 >= 0 && !interfaceC7509M41888.mo924()) {
                    int iMax = Math.max(0, (length2 - iMin3) + 1);
                    int i4 = length2 - iMax;
                    c15130.m36405(iMax, bArr3, 0, i4 + 1);
                    while (i4 >= 0) {
                        byte b = bArr3[i4];
                        while (i3 > 0 && bArr2[i3] != b) {
                            i3 = iArrM33903[i3 - 1];
                        }
                        if (bArr2[i3] == b && (i3 = i3 + 1) == length) {
                            iMin = iMax + i4;
                        } else {
                            i4--;
                        }
                    }
                    length2 = iMax - 1;
                }
                iMin = -1;
            }
        }
        m15065();
        return iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15064(OutputStream outputStream, int i) {
        m15065();
        this.f17146.m36406(outputStream, i);
        m15065();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f17144.compareAndSet(false, true)) {
            m15061(this.f17143);
        }
    }

    public final int length() {
        if (!this.f17144.get()) {
            return this.f17146.m36404();
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m15065() {
        if (!this.f17144.get()) {
            for (InterfaceC22808 interfaceC22808 : this.f17143) {
                if (!interfaceC22808.mo2792()) {
                    throw new C12893();
                }
            }
            return;
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15067() {
        if (this.f17144.get()) {
            throw new IllegalStateException("HexSnapshot is closed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15061(InterfaceC22808[] interfaceC22808Arr) {
        IOException iOException = null;
        for (InterfaceC22808 interfaceC22808 : interfaceC22808Arr) {
            try {
                interfaceC22808.close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    iOException.addSuppressed(e);
                }
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }
}
