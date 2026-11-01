package l;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AVI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1563 implements InterfaceC7950 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Enum[] f6296;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f6297;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Enum[] f6298;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long[] f6299;

    public C1563(Class cls) {
        this.f6297 = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f6296 = enumArr;
        int length = enumArr.length;
        long[] jArr = new long[length];
        this.f6299 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f6296;
            if (i >= enumArr2.length) {
                break;
            }
            String strName = enumArr2[i].name();
            long jCharAt = -3750763034362895579L;
            for (int i2 = 0; i2 < strName.length(); i2++) {
                jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
            }
            jArr[i] = jCharAt;
            this.f6299[i] = jCharAt;
            i++;
        }
        Arrays.sort(this.f6299);
        this.f6298 = new Enum[this.f6296.length];
        for (int i3 = 0; i3 < this.f6299.length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f6299[i3] == jArr[i4]) {
                    this.f6298[i3] = this.f6296[i4];
                    break;
                }
            }
        }
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        try {
            C2974 c2974 = c14265.f46690;
            int i = c2974.f11130;
            Class cls = this.f6297;
            if (i == 2) {
                int iM8836 = c2974.m8836();
                c2974.m8850(16);
                if (iM8836 >= 0) {
                    Enum[] enumArr = this.f6296;
                    if (iM8836 <= enumArr.length) {
                        return enumArr[iM8836];
                    }
                }
                throw new C20614("parse enum " + cls.getName() + " error, value : " + iM8836);
            }
            if (i != 4) {
                if (i == 8) {
                    c2974.m8850(16);
                    return null;
                }
                throw new C20614("parse enum " + cls.getName() + " error, value : " + c14265.m34396((Object) null));
            }
            String strM8840 = c2974.m8840();
            c2974.m8850(16);
            if (strM8840.length() != 0) {
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strM8840.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strM8840.charAt(i2))) * 1099511628211L;
                }
                int iBinarySearch = Arrays.binarySearch(this.f6299, jCharAt);
                if (iBinarySearch >= 0) {
                    return this.f6298[iBinarySearch];
                }
            }
            return null;
        } catch (C20614 e) {
            throw e;
        } catch (Exception e2) {
            throw new C20614(e2.getMessage(), (Throwable) e2);
        }
    }
}
