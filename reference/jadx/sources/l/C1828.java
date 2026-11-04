package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66HE */
/* JADX INFO: loaded from: classes3.dex */
public final class C1828 extends C18959 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f6204;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f6205;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f6206;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object f6207;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566 f6203 = AbstractC1566.m5533(EnumC12006.BYTE, EnumC12006.BOOLEAN);

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566 f6201 = AbstractC1566.m5533(EnumC12006.SHORT, EnumC12006.CHAR);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566 f6200 = AbstractC1566.m5533(EnumC12006.INT, EnumC12006.FLOAT);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AbstractC1566 f6202 = AbstractC1566.m5533(EnumC12006.LONG, EnumC12006.DOUBLE);

    public C1828(InterfaceC22206 interfaceC22206) {
        this(interfaceC22206.getSize(), interfaceC22206.mo16845(), interfaceC22206.getData());
    }

    public C1828(int i, int i2, Object obj) {
        AbstractC1566 abstractC1566;
        super(EnumC24203.FILL_ARRAY_DATA, 0);
        this.f6207 = obj;
        this.f6205 = i;
        this.f6204 = i2;
        if (i2 == 0 || i2 == 1) {
            abstractC1566 = f6203;
        } else if (i2 == 2) {
            abstractC1566 = f6201;
        } else if (i2 == 4) {
            abstractC1566 = f6200;
        } else {
            if (i2 != 8) {
                throw new C8597(C13645.m33382(i2, "Unknown array element width: "));
            }
            abstractC1566 = f6202;
        }
        this.f6206 = abstractC1566;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final int m6319() {
        return this.f6205;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m6320() {
        return this.f6206;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6318(AbstractC1566 abstractC1566) {
        ArrayList arrayList = new ArrayList(this.f6205);
        int i = 0;
        Object obj = this.f6207;
        int i2 = this.f6204;
        if (i2 == 1) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            while (i < length) {
                long j = bArr[i];
                int i3 = AbstractC16481.f53441;
                arrayList.add(C23195.m52120(j, abstractC1566));
                i++;
            }
        } else if (i2 == 2) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            while (i < length2) {
                long j2 = sArr[i];
                int i4 = AbstractC16481.f53441;
                arrayList.add(C23195.m52120(j2, abstractC1566));
                i++;
            }
        } else if (i2 == 4) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                long j3 = iArr[i];
                int i5 = AbstractC16481.f53441;
                arrayList.add(C23195.m52120(j3, abstractC1566));
                i++;
            }
        } else {
            if (i2 != 8) {
                throw new C8597("Unknown type: " + obj.getClass() + ", expected: " + abstractC1566);
            }
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            while (i < length4) {
                long j4 = jArr[i];
                int i6 = AbstractC16481.f53441;
                arrayList.add(C23195.m52120(j4, abstractC1566));
                i++;
            }
        }
        return arrayList;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4075(C18959 c18959) {
        if (this == c18959) {
            return true;
        }
        if ((c18959 instanceof C1828) && super.mo4075(c18959)) {
            C1828 c1828 = (C1828) c18959;
            if (this.f6206.equals(c1828.f6206) && this.f6207 == c1828.f6207) {
                return true;
            }
        }
        return false;
    }

    @Override // l.C18959
    /* JADX INFO: renamed from: ۫ۙ */
    public final C18959 mo4072() {
        C1828 c1828 = new C1828(this.f6205, this.f6204, this.f6207);
        c1828.f6206 = this.f6206;
        m44033(c1828);
        return c1828;
    }

    @Override // l.C18959
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", data: ");
        Object obj = this.f6207;
        int i = this.f6204;
        if (i == 1) {
            string = Arrays.toString((byte[]) obj);
        } else if (i == 2) {
            string = Arrays.toString((short[]) obj);
        } else if (i == 4) {
            string = Arrays.toString((int[]) obj);
        } else {
            string = i != 8 ? "?" : Arrays.toString((long[]) obj);
        }
        sb.append(string);
        return sb.toString();
    }
}
