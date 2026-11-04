package l;

import com.alipay.sdk.m.p.a;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۛ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAUU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6709 implements InterfaceC10591 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10591 f22313;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Class f22314;

    public C6709(Class cls, InterfaceC10591 interfaceC10591) {
        this.f22314 = cls;
        this.f22313 = interfaceC10591;
    }

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        if (obj == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullListAsEmpty.f5702) != 0) {
                c5372.write("[]");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            c5372.write(91);
            while (i < zArr.length) {
                if (i != 0) {
                    c5372.write(44);
                }
                c5372.write(zArr[i] ? "true" : "false");
                i++;
            }
            c5372.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c5372.getClass();
            int length = bArr.length;
            boolean z = (c5372.f18847 & EnumC1643.UseSingleQuotes.f5702) != 0;
            char c = z ? '\'' : '\"';
            if (length == 0) {
                c5372.write(z ? "''" : "\"\"");
                return;
            }
            char[] cArr = C13945.f44198;
            int i2 = (length / 3) * 3;
            int i3 = length - 1;
            int i4 = c5372.f18848;
            int i5 = (((i3 / 3) + 1) << 2) + i4;
            int i6 = i5 + 2;
            if (i6 > c5372.f18846.length) {
                c5372.m16050(i6);
            }
            c5372.f18848 = i6;
            int i7 = i4 + 1;
            c5372.f18846[i4] = c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i8 + 2;
                int i10 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
                i8 += 3;
                int i11 = i10 | (bArr[i9] & 255);
                char[] cArr2 = c5372.f18846;
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
                char[] cArr3 = c5372.f18846;
                cArr3[i5 - 3] = cArr[i14 >> 12];
                cArr3[i5 - 2] = cArr[(i14 >>> 6) & 63];
                cArr3[i5 - 1] = i13 == 2 ? cArr[i14 & 63] : a.h;
                cArr3[i5] = a.h;
            }
            c5372.f18846[i5 + 1] = c;
            return;
        }
        if (obj instanceof char[]) {
            c5372.m16047(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length - 1;
            if (length2 == -1) {
                c5372.append((CharSequence) "[]");
                return;
            }
            c5372.write(91);
            while (i < length2) {
                double d = dArr[i];
                if (Double.isNaN(d)) {
                    c5372.m16046();
                } else {
                    c5372.append((CharSequence) Double.toString(d));
                }
                c5372.write(44);
                i++;
            }
            double d2 = dArr[length2];
            if (Double.isNaN(d2)) {
                c5372.m16046();
            } else {
                c5372.append((CharSequence) Double.toString(d2));
            }
            c5372.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length - 1;
            if (length3 == -1) {
                c5372.append((CharSequence) "[]");
                return;
            }
            c5372.write(91);
            while (i < length3) {
                float f = fArr[i];
                if (Float.isNaN(f)) {
                    c5372.m16046();
                } else {
                    c5372.append((CharSequence) Float.toString(f));
                }
                c5372.write(44);
                i++;
            }
            float f2 = fArr[length3];
            if (Float.isNaN(f2)) {
                c5372.m16046();
            } else {
                c5372.append((CharSequence) Float.toString(f2));
            }
            c5372.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            c5372.write(91);
            while (i < iArr.length) {
                if (i != 0) {
                    c5372.write(44);
                }
                c5372.writeInt(iArr[i]);
                i++;
            }
            c5372.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            c5372.write(91);
            while (i < jArr.length) {
                if (i != 0) {
                    c5372.write(44);
                }
                c5372.m16051(jArr[i]);
                i++;
            }
            c5372.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            c5372.write(91);
            while (i < sArr.length) {
                if (i != 0) {
                    c5372.write(44);
                }
                c5372.writeInt(sArr[i]);
                i++;
            }
            c5372.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length4 = objArr.length;
        C15066 c15066 = c9690.f31285;
        c9690.m25279(c15066, obj, obj2);
        try {
            c5372.write(91);
            for (int i15 = 0; i15 < length4; i15++) {
                if (i15 != 0) {
                    c5372.write(44);
                }
                Object obj3 = objArr[i15];
                if (obj3 == null) {
                    if (((EnumC1643.WriteNullStringAsEmpty.f5702 & c5372.f18847) != 0) && (obj instanceof String[])) {
                        c5372.m16047("");
                    } else {
                        c5372.append((CharSequence) "null");
                    }
                } else if (obj3.getClass() == this.f22314) {
                    this.f22313.mo3063(c9690, obj3, Integer.valueOf(i15), null);
                } else {
                    c9690.f31277.m31835(obj3.getClass()).mo3063(c9690, obj3, Integer.valueOf(i15), null);
                }
            }
            c5372.write(93);
        } finally {
            c9690.f31285 = c15066;
        }
    }
}
