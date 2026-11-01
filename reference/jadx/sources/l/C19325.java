package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P4XD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19325 extends AbstractC7724 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8430 f62329;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8430 f62330;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8430 f62331;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f62332;

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ܰ */
    public final double mo5599() {
        return 102.0d;
    }

    public C19325(C20424 c20424, C9136 c9136, int i, String str, int i2, int i3, int i4) {
        super(i);
        this.f62332 = str;
        this.f62330 = c9136.m23459(new C8430(c20424, i2, "try_start_"));
        this.f62331 = c9136.m23459(new C1685(c20424, i, i3));
        if (str == null) {
            this.f62329 = c9136.m23459(new C8430(c20424, i4, "catchall_"));
        } else {
            this.f62329 = c9136.m23459(new C8430(c20424, i4, "catch_"));
        }
    }

    @Override // l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        String str = this.f62332;
        if (str == null) {
            c12283.getClass();
            c12283.write(".catchall", 0, 9);
        } else {
            c12283.getClass();
            c12283.write(".catch ", 0, 7);
            c12283.write(str);
        }
        c12283.getClass();
        c12283.write(" {", 0, 2);
        this.f62330.mo1773(c12283);
        c12283.write(" .. ", 0, 4);
        this.f62331.mo1773(c12283);
        c12283.write("} ", 0, 2);
        this.f62329.mo1773(c12283);
        return true;
    }
}
