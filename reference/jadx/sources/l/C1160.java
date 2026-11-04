package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.֨ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1160 extends Number implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f4286;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4286.compareTo(((C1160) obj).f4286);
    }

    public C1160(String str) {
        this.f4286 = str;
    }

    private Object writeReplace() {
        return C10680.m27228(this.f4286);
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f4286;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return C10680.m27228(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f4286;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return C10680.m27228(str).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f4286);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f4286);
    }

    public final String toString() {
        return this.f4286;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.f4286.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1160) {
            return this.f4286.equals(((C1160) obj).f4286);
        }
        return false;
    }
}
