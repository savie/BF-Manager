package l;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.᩶ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: IIVV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21094 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20528 f67379 = new C20528();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo10510();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo10511(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo10513(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte mo10516(int i);

    /* JADX INFO: renamed from: ᩸ */
    public abstract short mo10518(int i);

    /* JADX INFO: renamed from: ᩴ */
    public int mo10515(int i) {
        return mo10516(i) & 255;
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo10514(int i) {
        return mo10518(i) & HPKE.aead_EXPORT_ONLY;
    }

    /* JADX INFO: renamed from: ۤ */
    public int[] mo42229(int i, int i2) {
        m48155(i, i2);
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            iArr[i3] = mo10513(i);
            i3++;
            i += 4;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48154(int i) {
        if (i < 0 || i > mo10510()) {
            return -1;
        }
        return mo10510() - i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16618 m48157(int i) {
        C16618 c16618 = (C16618) this.f67379.m47061();
        if (c16618 == null) {
            return new C16618(this, i);
        }
        c16618.m39310(i);
        return c16618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48156(C16618 c16618) {
        if (c16618.f53739 != this) {
            throw new IllegalArgumentException("Reader belongs to another buffer");
        }
        this.f67379.m47060(c16618);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48158(int i, int i2) {
        if (i < 0 || i2 < 0 || i > mo10510() - i2) {
            StringBuilder sbM5126 = C1402.m5126("offset=", i, ", count=", ", length=", i2);
            sbM5126.append(mo10510());
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48155(int i, int i2) {
        if (i2 < 0 || i2 > 536870911) {
            throw new IndexOutOfBoundsException(C13645.m33382(i2, "Invalid int array length: "));
        }
        m48158(i, i2 * 4);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10512(OutputStream outputStream) throws IOException {
        int iMin = Math.min(mo10510(), 8192);
        byte[] bArr = new byte[iMin];
        int i = 0;
        while (i < mo10510()) {
            int iMin2 = Math.min(iMin, mo10510() - i);
            try {
                mo10511(i, iMin2, bArr);
                outputStream.write(bArr, 0, iMin2);
                i += iMin2;
            } catch (C24824 e) {
                throw e.getCause();
            }
        }
    }
}
