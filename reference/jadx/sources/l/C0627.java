package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0627 extends AbstractC19603 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f2715;

    public C0627(String str, C16856 c16856) {
        String strM1693;
        C11018 c11018 = new C11018();
        c11018.writeByte(77);
        c11018.writeByte(84);
        c11018.writeByte(0);
        c11018.writeByte(83);
        c11018.writeByte(80);
        c11018.writeByte(69);
        c11018.writeByte(67);
        c11018.writeByte(73);
        c11018.writeByte(65);
        c11018.writeByte(76);
        c11018.writeByte(1);
        char c = c16856.f53921;
        c11018.writeByte(c);
        c11018.writeByte(2);
        long j = c16856.f53922;
        c11018.m27791(j);
        byte[] bArrM27773 = c11018.m27773();
        long length = bArrM27773.length;
        if (c == 'b' || c == 'c') {
            strM1693 = "special-content:" + c + ":" + j;
        } else {
            strM1693 = C0252.m1693("special-path:", str);
        }
        super(str, length, strM1693);
        this.f2715 = bArrM27773;
    }

    @Override // l.AbstractC19603
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo2898() {
        return new ByteArrayInputStream(this.f2715);
    }
}
