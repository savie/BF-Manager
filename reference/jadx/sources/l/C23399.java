package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes.dex */
public final class C23399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75747;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f75748;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f75749;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5499 f75750;

    public C23399(C16685 c16685) {
        this.f75748 = c16685.f53921;
        this.f75750 = c16685.f53923;
        this.f75747 = new ArrayList(c16685.f53920);
        ArrayList arrayList = new ArrayList(c16685.f53922.size() + 1);
        this.f75749 = arrayList;
        arrayList.addAll(c16685.f53922);
        arrayList.add(new C24891());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52583(AbstractC4534 abstractC4534, StringBuilder sb) {
        C17359.requireNonNull(abstractC4534, "node must not be null");
        C15939 c15939 = new C15939(this, new C3261(sb));
        c15939.m37965(abstractC4534);
        c15939.mo6223(abstractC4534);
        c15939.m37966(abstractC4534);
    }
}
