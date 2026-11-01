package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 94T8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6769 implements InterfaceC7600 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f22861;

    @Override // l.InterfaceC9012
    /* JADX INFO: renamed from: ۙ */
    public final C2184 mo4153(C2184 c2184, C15592 c15592) {
        return c2184;
    }

    public C6769(HashMap map) {
        this.f22861 = map;
    }

    @Override // l.InterfaceC10423
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo4154(C2184 c2184) {
        C2184 c2185 = (C2184) this.f22861.get(c2184);
        return c2185 == null ? c2184 : c2185;
    }
}
