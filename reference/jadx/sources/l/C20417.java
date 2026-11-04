package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20417 extends AbstractC20970 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f65421;

    public C20417(String str, C12212 c12212) {
        String strM56409;
        C6178 c6178 = new C6178();
        c6178.writeByte(77);
        c6178.writeByte(84);
        c6178.writeByte(0);
        c6178.writeByte(83);
        c6178.writeByte(80);
        c6178.writeByte(69);
        c6178.writeByte(67);
        c6178.writeByte(73);
        c6178.writeByte(65);
        c6178.writeByte(76);
        c6178.writeByte(1);
        char c = c12212.f39244;
        c6178.writeByte(c);
        c6178.writeByte(2);
        long j = c12212.f39245;
        c6178.m17803(j);
        byte[] bArrM17796 = c6178.m17796();
        long length = bArrM17796.length;
        if (c == 'b' || c == 'c') {
            strM56409 = "special-content:" + c + ":" + j;
        } else {
            strM56409 = C25272.m56409("special-path:", str);
        }
        super(str, length, strM56409);
        this.f65421 = bArrM17796;
    }

    @Override // l.AbstractC20970
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo10654() {
        return new ByteArrayInputStream(this.f65421);
    }
}
