package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11519 extends C4087 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Comparator f38736;

    public C11519(C2345 c2345) {
        super(c2345);
        this.f38736 = c2345.comparator();
    }

    @Override // l.C4087
    /* JADX INFO: renamed from: ۙ */
    public final C13261 mo11628(int i) {
        return new C13636(this.f38736);
    }
}
