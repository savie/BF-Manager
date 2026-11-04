package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֨ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B99Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1096 extends AbstractC12217 implements InterfaceC18995, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Enum[] f3904;

    public C1096(Enum[] enumArr) {
        C15243.m36590(enumArr, "entries");
        this.f3904 = enumArr;
    }

    @Override // l.AbstractC17438, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.f3904;
        C15243.m36590(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4;
    }

    @Override // l.AbstractC12217, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f3904;
        C15243.m36590(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // l.AbstractC12217, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f3904;
        C15243.m36590(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // l.AbstractC17438
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo4094() {
        return this.f3904.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f3904;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    private final Object writeReplace() {
        return new C9298(this.f3904);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
