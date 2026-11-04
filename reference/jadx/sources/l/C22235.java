package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4XD */
/* JADX INFO: loaded from: classes.dex */
public final class C22235 extends AbstractC19734 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4818 f71624;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C4818 f71625;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4818 f71626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f71627;

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ᩸ */
    public final double mo13837() {
        return 102.0d;
    }

    public C22235(C5564 c5564, C10783 c10783, int i, String str, int i2, int i3, int i4) {
        super(i);
        this.f71627 = str;
        this.f71625 = c10783.m27487(new C4818(c5564, i2, "try_start_"));
        this.f71624 = c10783.m27487(new C20743(c5564, i, i3));
        if (str == null) {
            this.f71626 = c10783.m27487(new C4818(c5564, i4, "catchall_"));
        } else {
            this.f71626 = c10783.m27487(new C4818(c5564, i4, "catch_"));
        }
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        String str = this.f71627;
        if (str == null) {
            c2161.getClass();
            c2161.write(".catchall", 0, 9);
        } else {
            c2161.getClass();
            c2161.write(".catch ", 0, 7);
            c2161.write(str);
        }
        c2161.getClass();
        c2161.write(" {", 0, 2);
        this.f71625.mo4982(c2161);
        c2161.write(" .. ", 0, 4);
        this.f71624.mo4982(c2161);
        c2161.write("} ", 0, 2);
        this.f71626.mo4982(c2161);
        return true;
    }
}
