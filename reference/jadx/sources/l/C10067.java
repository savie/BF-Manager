package l;

import com.alipay.sdk.m.p.a;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۤۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAUU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10067 implements InterfaceC11747 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11747 f34396;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class f34397;

    public C10067(Class cls, InterfaceC11747 interfaceC11747) {
        this.f34397 = cls;
        this.f34396 = interfaceC11747;
    }

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        if (obj == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullListAsEmpty.f14811) != 0) {
                c13158.write("[]");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c13158.write(91);
            while (i < zArr.length) {
                if (i != 0) {
                    c13158.write(44);
                }
                c13158.write(zArr[i] ? "true" : "false");
                i++;
            }
            c13158.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c13158.getClass();
            int length = bArr.length;
            boolean z = (c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0;
            char c = z ? '\'' : '\"';
            if (length == 0) {
                c13158.write(z ? "''" : "\"\"");
                return;
            }
            char[] cArr = C2974.f11123;
            int i2 = (length / 3) * 3;
            int i3 = length - 1;
            int i4 = c13158.f43820;
            int i5 = (((i3 / 3) + 1) << 2) + i4;
            int i6 = i5 + 2;
            if (i6 > c13158.f43819.length) {
                c13158.m32534(i6);
            }
            c13158.f43820 = i6;
            int i7 = i4 + 1;
            c13158.f43819[i4] = c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i8 + 2;
                int i10 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
                i8 += 3;
                int i11 = i10 | (bArr[i9] & 255);
                char[] cArr2 = c13158.f43819;
                cArr2[i7] = cArr[(i11 >>> 18) & 63];
                cArr2[i7 + 1] = cArr[(i11 >>> 12) & 63];
                int i12 = i7 + 3;
                cArr2[i7 + 2] = cArr[(i11 >>> 6) & 63];
                i7 += 4;
                cArr2[i12] = cArr[i11 & 63];
            }
            int i13 = length - i2;
            if (i13 > 0) {
                int i14 = ((bArr[i2] & 255) << 10) | (i13 == 2 ? (bArr[i3] & 255) << 2 : 0);
                char[] cArr3 = c13158.f43819;
                cArr3[i5 - 3] = cArr[i14 >> 12];
                cArr3[i5 - 2] = cArr[(i14 >>> 6) & 63];
                cArr3[i5 - 1] = i13 == 2 ? cArr[i14 & 63] : a.h;
                cArr3[i5] = a.h;
            }
            c13158.f43819[i5 + 1] = c;
            return;
        }
        if (obj instanceof char[]) {
            c13158.m32531(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length - 1;
            if (length2 == -1) {
                c13158.append((CharSequence) "[]");
                return;
            }
            c13158.write(91);
            while (i < length2) {
                double d = dArr[i];
                if (Double.isNaN(d)) {
                    c13158.m32530();
                } else {
                    c13158.append((CharSequence) Double.toString(d));
                }
                c13158.write(44);
                i++;
            }
            double d2 = dArr[length2];
            if (Double.isNaN(d2)) {
                c13158.m32530();
            } else {
                c13158.append((CharSequence) Double.toString(d2));
            }
            c13158.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length - 1;
            if (length3 == -1) {
                c13158.append((CharSequence) "[]");
                return;
            }
            c13158.write(91);
            while (i < length3) {
                float f = fArr[i];
                if (Float.isNaN(f)) {
                    c13158.m32530();
                } else {
                    c13158.append((CharSequence) Float.toString(f));
                }
                c13158.write(44);
                i++;
            }
            float f2 = fArr[length3];
            if (Float.isNaN(f2)) {
                c13158.m32530();
            } else {
                c13158.append((CharSequence) Float.toString(f2));
            }
            c13158.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c13158.write(91);
            while (i < iArr.length) {
                if (i != 0) {
                    c13158.write(44);
                }
                c13158.writeInt(iArr[i]);
                i++;
            }
            c13158.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c13158.write(91);
            while (i < jArr.length) {
                if (i != 0) {
                    c13158.write(44);
                }
                c13158.m32535(jArr[i]);
                i++;
            }
            c13158.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c13158.write(91);
            while (i < sArr.length) {
                if (i != 0) {
                    c13158.write(44);
                }
                c13158.writeInt(sArr[i]);
                i++;
            }
            c13158.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length4 = objArr.length;
        C22330 c22330 = c23473.f76000;
        c23473.m51727(c22330, obj, obj2);
        try {
            c13158.write(91);
            for (int i15 = 0; i15 < length4; i15++) {
                if (i15 != 0) {
                    c13158.write(44);
                }
                Object obj3 = objArr[i15];
                if (obj3 == null) {
                    if (((EnumC3984.WriteNullStringAsEmpty.f14811 & c13158.f43818) != 0) && (obj instanceof String[])) {
                        c13158.m32531("");
                    } else {
                        c13158.append((CharSequence) "null");
                    }
                } else if (obj3.getClass() == this.f34397) {
                    this.f34396.mo1396(c23473, obj3, Integer.valueOf(i15), null);
                } else {
                    c23473.f76005.m4271(obj3.getClass()).mo1396(c23473, obj3, Integer.valueOf(i15), null);
                }
            }
            c13158.write(93);
        } finally {
            c23473.f76000 = c22330;
        }
    }
}
