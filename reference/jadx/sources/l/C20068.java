package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ᩴ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20068 extends C11863 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f64520;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f64521;

    @Override // l.C11863, l.AbstractC17084
    /* JADX INFO: renamed from: ۙ */
    public final byte mo29720(int i) {
        int i2 = this.f64520;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f38241[this.f64521 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C13645.m33382(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C6934.m19217("Index > length: ", i, i2, ", "));
    }

    public C20068(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC17084.m40220(i, i + i2, bArr.length);
        this.f64521 = i;
        this.f64520 = i2;
    }

    @Override // l.C11863, l.AbstractC17084
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo29727(int i) {
        return this.f38241[this.f64521 + i];
    }

    @Override // l.C11863, l.AbstractC17084
    public final int size() {
        return this.f64520;
    }

    @Override // l.C11863, l.AbstractC17084
    /* JADX INFO: renamed from: ۙ */
    public final void mo29723(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f38241, this.f64521 + i, bArr, i2, i3);
    }

    @Override // l.C11863
    /* JADX INFO: renamed from: ۫ */
    public final int mo29726() {
        return this.f64521;
    }

    public Object writeReplace() {
        return new C11863(m40222());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
