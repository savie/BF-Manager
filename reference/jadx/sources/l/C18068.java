package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ܿۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18068 extends AbstractC20306 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12341 f59146;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f59147 = true;

    public C18068(int i, int i2) {
        this.f59146 = C12341.m30766(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18068 m42100(int i, int i2) {
        return new C18068(i, i2);
    }

    @Override // l.AbstractC20306
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24271(int i, StringWriter stringWriter) throws IOException {
        if (this.f59147 != this.f59146.m30767(Integer.valueOf(i))) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
