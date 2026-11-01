package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۢۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9304 extends Number {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f31574;

    public C9304(String str) {
        this.f31574 = str;
    }

    private Object writeReplace() {
        return C12914.m31999(this.f31574);
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f31574;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return C12914.m31999(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f31574;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return C12914.m31999(str).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f31574);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f31574);
    }

    public final String toString() {
        return this.f31574;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.f31574.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9304) {
            return this.f31574.equals(((C9304) obj).f31574);
        }
        return false;
    }
}
