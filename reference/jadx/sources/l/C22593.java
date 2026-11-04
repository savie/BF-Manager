package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩸ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes.dex */
public final class C22593 extends C16843 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Comparator f73041;

    public C22593(C19609 c19609) {
        super(c19609);
        this.f73041 = c19609.comparator();
    }

    @Override // l.C16843
    /* JADX INFO: renamed from: ۙ */
    public final C25049 mo9087(int i) {
        return new C4693(this.f73041);
    }
}
