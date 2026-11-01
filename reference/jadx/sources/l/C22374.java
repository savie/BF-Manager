package l;

/* JADX INFO: renamed from: l.᩹ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O7II */
/* JADX INFO: loaded from: classes.dex */
public final class C22374 extends AbstractC24015 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73051 = 0;

    @Override // l.AbstractC24015
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo35530() {
        return m52850();
    }

    @Override // l.AbstractC24015, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return;
        }
        m52849(i, i2, bArr);
    }
}
