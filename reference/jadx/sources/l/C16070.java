package l;

/* JADX INFO: renamed from: l.ܶۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7II */
/* JADX INFO: loaded from: classes5.dex */
public final class C16070 extends AbstractC15324 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52076 = 0;

    public final int size() {
        return this.f50068;
    }

    @Override // l.AbstractC15324
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo32557() {
        return m36774();
    }

    @Override // l.AbstractC15324, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C5125.m15493(i, i2, bArr);
        if (i2 == 0) {
            return;
        }
        m36772(i, i2, bArr);
    }
}
