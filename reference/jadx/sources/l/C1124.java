package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֨۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1124 implements InterfaceC7600 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f5052;

    @Override // l.InterfaceC9012
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2184 mo4153(C2184 c2184, C15592 c15592) {
        return c2184;
    }

    public C1124(HashMap map) {
        this.f5052 = map;
    }

    @Override // l.InterfaceC10423
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7124 mo4154(C2184 c2184) {
        AbstractC7124 abstractC7124 = (AbstractC7124) this.f5052.get(c2184);
        return abstractC7124 == null ? c2184 : abstractC7124.clone();
    }
}
