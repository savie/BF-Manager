package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.᩶۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20197 extends C6085 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f65547;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f65548;

    @Override // l.C6085, l.AbstractC23725
    /* JADX INFO: renamed from: ۙ */
    public final byte mo16486(int i) {
        int i2 = this.f65547;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f20598[this.f65548 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C8479.m22141(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C2271.m6967("Index > length: ", i, i2, ", "));
    }

    public C20197(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC23725.m52257(i, i + i2, bArr.length);
        this.f65548 = i;
        this.f65547 = i2;
    }

    @Override // l.C6085, l.AbstractC23725
    /* JADX INFO: renamed from: ܰ */
    public final byte mo16492(int i) {
        return this.f20598[this.f65548 + i];
    }

    @Override // l.C6085, l.AbstractC23725
    public final int size() {
        return this.f65547;
    }

    @Override // l.C6085
    /* JADX INFO: renamed from: ֨ */
    public final int mo16485() {
        return this.f65548;
    }

    @Override // l.C6085, l.AbstractC23725
    /* JADX INFO: renamed from: ۙ */
    public final void mo16489(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f20598, this.f65548 + i, bArr, i2, i3);
    }

    public Object writeReplace() {
        return new C6085(m52259());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
