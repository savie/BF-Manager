package l;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AVI */
/* JADX INFO: loaded from: classes4.dex */
public final class C8725 implements InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f28399;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Enum[] f28400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f28401;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Enum[] f28402;

    public C8725(Class cls) {
        this.f28399 = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f28402 = enumArr;
        int length = enumArr.length;
        long[] jArr = new long[length];
        this.f28401 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f28402;
            if (i >= enumArr2.length) {
                break;
            }
            String strName = enumArr2[i].name();
            long jCharAt = -3750763034362895579L;
            for (int i2 = 0; i2 < strName.length(); i2++) {
                jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
            }
            jArr[i] = jCharAt;
            this.f28401[i] = jCharAt;
            i++;
        }
        Arrays.sort(this.f28401);
        this.f28400 = new Enum[this.f28402.length];
        for (int i3 = 0; i3 < this.f28401.length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f28401[i3] == jArr[i4]) {
                    this.f28400[i3] = this.f28402[i4];
                    break;
                }
            }
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        try {
            C13945 c13945 = c2759.f9128;
            int i = c13945.f44222;
            Class cls = this.f28399;
            if (i == 2) {
                int iM33968 = c13945.m33968();
                c13945.m33973(16);
                if (iM33968 >= 0) {
                    Enum[] enumArr = this.f28402;
                    if (iM33968 <= enumArr.length) {
                        return enumArr[iM33968];
                    }
                }
                throw new C4251("parse enum " + cls.getName() + " error, value : " + iM33968);
            }
            if (i != 4) {
                if (i == 8) {
                    c13945.m33973(16);
                    return null;
                }
                throw new C4251("parse enum " + cls.getName() + " error, value : " + c2759.m9106((Object) null));
            }
            String strM33979 = c13945.m33979();
            c13945.m33973(16);
            if (strM33979.length() != 0) {
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strM33979.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strM33979.charAt(i2))) * 1099511628211L;
                }
                int iBinarySearch = Arrays.binarySearch(this.f28401, jCharAt);
                if (iBinarySearch >= 0) {
                    return this.f28400[iBinarySearch];
                }
            }
            return null;
        } catch (C4251 e) {
            throw e;
        } catch (Exception e2) {
            throw new C4251(e2.getMessage(), (Throwable) e2);
        }
    }
}
