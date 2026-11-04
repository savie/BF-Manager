package l;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17084 implements Iterable, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15592 f55771;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC17084 f55772 = new C11863(C23447.f75887);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55773 = 0;

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* JADX INFO: renamed from: ۙ */
    public abstract byte mo29720(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo29721(int i, int i2, int i3);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo29722(Charset charset);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo29723(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo29724(AbstractC14846 abstractC14846);

    /* JADX INFO: renamed from: ۤ */
    public abstract AbstractC3660 mo29725();

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte mo29727(int i);

    /* JADX INFO: renamed from: ᩷ */
    public abstract AbstractC17084 mo29728(int i, int i2);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo29729();

    static {
        InterfaceC15592 c23052;
        if (C7191.m19766()) {
            c23052 = new C25290();
        } else {
            c23052 = new C23052();
        }
        f55771 = c23052;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C22306(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17084 m40218(int i, int i2, byte[] bArr) {
        m40220(i, i + i2, bArr.length);
        return new C11863(f55771.mo37324(i, i2, bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17084 m40219(String str) {
        return new C11863(str.getBytes(C23447.f75888));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m40222() {
        int size = size();
        if (size == 0) {
            return C23447.f75887;
        }
        byte[] bArr = new byte[size];
        mo29723(0, bArr, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m40221() {
        return size() == 0 ? "" : mo29722(C23447.f75888);
    }

    public final int hashCode() {
        int iMo29721 = this.f55773;
        if (iMo29721 == 0) {
            int size = size();
            iMo29721 = mo29721(size, 0, size);
            if (iMo29721 == 0) {
                iMo29721 = 1;
            }
            this.f55773 = iMo29721;
        }
        return iMo29721;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m40223() {
        return this.f55773;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m40220(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C14442.m34864(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C6934.m19217("Beginning index larger than ending index: ", i, i2, ", "));
        }
        throw new IndexOutOfBoundsException(C6934.m19217("End index: ", i2, i3, " >= "));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strM46799 = size() <= 50 ? C20398.m46799(this) : C8947.m23910(new StringBuilder(), C20398.m46799(mo29728(0, 47)), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return C8947.m23910(sb, strM46799, "\">");
    }
}
