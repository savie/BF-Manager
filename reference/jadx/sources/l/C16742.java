package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܽܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B99Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C16742 extends AbstractC5910 implements InterfaceC20270, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Enum[] f53619;

    public C16742(Enum[] enumArr) {
        C13465.m32966(enumArr, "entries");
        this.f53619 = enumArr;
    }

    @Override // l.AbstractC20022, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.f53619;
        C13465.m32966(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4;
    }

    @Override // l.AbstractC5910, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f53619;
        C13465.m32966(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // l.AbstractC5910, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f53619;
        C13465.m32966(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // l.AbstractC20022
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo39302() {
        return this.f53619.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f53619;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    private final Object writeReplace() {
        return new C12509(this.f53619);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
