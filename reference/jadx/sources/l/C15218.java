package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15218 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f49626;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745[] f49627;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22710 f49628;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f49629;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49630 = new AtomicBoolean();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f49631;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19182 f49632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5838 f49633;

    public C15218(long j, long j2, long j3, C22710 c22710, C5838 c5838) {
        this.f49629 = j;
        this.f49626 = j2;
        this.f49631 = j3;
        this.f49628 = c22710;
        this.f49633 = c5838;
        this.f49627 = C7893.m20861(c22710);
        this.f49632 = new C19182(c22710);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m36426() {
        return this.f49631;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36425(byte[] bArr, int i, InterfaceC5614 interfaceC5614) {
        m36424();
        C19182 c19182 = this.f49632;
        c19182.getClass();
        C13638.requireNonNull(bArr, "pattern");
        int iM44036 = c19182.m44036();
        if (i < 0 || i > iM44036) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "fromIndex="));
        }
        if (bArr.length != 0) {
            int i2 = iM44036 - i;
            if (bArr.length > i2) {
                i = -1;
            } else {
                InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
                int[] iArrM50822 = C22979.m50822(bArr);
                int iMin = Math.min(65536, i2);
                byte[] bArr2 = new byte[iMin];
                int i3 = 0;
                while (i < iM44036 && !interfaceC5614M29777.mo2357()) {
                    int iMin2 = Math.min(iMin, iM44036 - i);
                    c19182.m44037(i, iMin2, bArr2);
                    for (int i4 = 0; i4 < iMin2; i4++) {
                        byte b = bArr2[i4];
                        while (i3 > 0 && bArr[i3] != b) {
                            i3 = iArrM50822[i3 - 1];
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
        m36424();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36429(byte[] bArr, int i, InterfaceC5614 interfaceC5614) {
        int iMin;
        m36424();
        C19182 c19182 = this.f49632;
        c19182.getClass();
        C13638.requireNonNull(bArr, "pattern");
        int iM44036 = c19182.m44036();
        if (i < 0) {
            iMin = -1;
        } else if (bArr.length == 0) {
            iMin = Math.min(i, iM44036);
        } else {
            int iMin2 = Math.min(i, iM44036 - bArr.length);
            if (iMin2 < 0) {
                iMin = -1;
            } else {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr2[i2] = bArr[(bArr.length - i2) - 1];
                }
                int[] iArrM50822 = C22979.m50822(bArr2);
                InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
                int iMin3 = Math.min(65536, bArr.length + iMin2);
                byte[] bArr3 = new byte[iMin3];
                int length2 = (iMin2 + bArr.length) - 1;
                int i3 = 0;
                while (length2 >= 0 && !interfaceC5614M29777.mo2357()) {
                    int iMax = Math.max(0, (length2 - iMin3) + 1);
                    int i4 = length2 - iMax;
                    c19182.m44037(iMax, i4 + 1, bArr3);
                    while (i4 >= 0) {
                        byte b = bArr3[i4];
                        while (i3 > 0 && bArr2[i3] != b) {
                            i3 = iArrM50822[i3 - 1];
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
        m36424();
        return iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36427(OutputStream outputStream, int i) {
        m36424();
        this.f49632.m44038(outputStream, i);
        m36424();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f49630.compareAndSet(false, true)) {
            m36423(this.f49627);
        }
    }

    public final int length() {
        if (!this.f49630.get()) {
            return this.f49632.m44036();
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36424() {
        if (!this.f49630.get()) {
            for (InterfaceC18745 interfaceC18745 : this.f49627) {
                if (!interfaceC18745.mo2300()) {
                    throw new C8599();
                }
            }
            return;
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36428() {
        if (this.f49630.get()) {
            throw new IllegalStateException("HexSnapshot is closed");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36423(InterfaceC18745[] interfaceC18745Arr) {
        IOException iOException = null;
        for (InterfaceC18745 interfaceC18745 : interfaceC18745Arr) {
            try {
                interfaceC18745.close();
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
