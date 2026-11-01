package l;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23725 implements Iterable, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0440 f76777;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC23725 f76778 = new C6085(C9779.f33478);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76779 = 0;

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* JADX INFO: renamed from: ۙ */
    public abstract byte mo16486(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo16487(int i, int i2, int i3);

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo16488(Charset charset);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo16489(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo16490(AbstractC22044 abstractC22044);

    /* JADX INFO: renamed from: ۨ */
    public abstract AbstractC3262 mo16491();

    /* JADX INFO: renamed from: ܰ */
    public abstract byte mo16492(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC23725 mo16493(int i, int i2);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo16494();

    static {
        InterfaceC0440 c15964;
        if (C19491.m44546()) {
            c15964 = new C11025();
        } else {
            c15964 = new C15964();
        }
        f76777 = c15964;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C7496(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23725 m52255(int i, int i2, byte[] bArr) {
        m52257(i, i + i2, bArr.length);
        return new C6085(f76777.mo2266(i, i2, bArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23725 m52256(String str) {
        return new C6085(str.getBytes(C9779.f33479));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m52259() {
        int size = size();
        if (size == 0) {
            return C9779.f33478;
        }
        byte[] bArr = new byte[size];
        mo16489(0, bArr, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m52260() {
        return size() == 0 ? "" : mo16488(C9779.f33479);
    }

    public final int hashCode() {
        int iMo16487 = this.f76779;
        if (iMo16487 == 0) {
            int size = size();
            iMo16487 = mo16487(size, 0, size);
            if (iMo16487 == 0) {
                iMo16487 = 1;
            }
            this.f76779 = iMo16487;
        }
        return iMo16487;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m52258() {
        return this.f76779;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m52257(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C2271.m6966(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C2271.m6967("Beginning index larger than ending index: ", i, i2, ", "));
        }
        throw new IndexOutOfBoundsException(C2271.m6967("End index: ", i2, i3, " >= "));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strM12739 = size() <= 50 ? C4591.m12739(this) : C22697.m50267(new StringBuilder(), C4591.m12739(mo16493(0, 47)), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return C22697.m50267(sb, strM12739, "\">");
    }
}
