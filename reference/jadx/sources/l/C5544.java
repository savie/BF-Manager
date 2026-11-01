package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۚᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V2E3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5544 extends AbstractC1994 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4028 f19007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f19008 = true;

    public C5544(int i, int i2) {
        this.f19007 = C4028.m11531(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5544 m15282(int i, int i2) {
        return new C5544(i, i2);
    }

    @Override // l.AbstractC1994
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6410(int i, StringWriter stringWriter) throws IOException {
        if (this.f19008 != this.f19007.m11532(Integer.valueOf(i))) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
