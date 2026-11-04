package l;

import java.util.Set;

/* JADX INFO: renamed from: l.֫ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1904 implements InterfaceC1399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23533 f6406;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC11225 f6407;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f6408;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6117 f6409;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f6410;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f6411;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f6412;

    public C1904(C23533 c23533, C6117 c6117, Set set, Set set2, Set set3, EnumC11225 enumC11225, Set set4) {
        this.f6406 = c23533;
        this.f6409 = c6117;
        this.f6411 = set;
        this.f6410 = set2;
        this.f6408 = set3;
        this.f6407 = enumC11225;
        this.f6412 = set4;
    }

    @Override // l.InterfaceC1399
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5109(C6117 c6117) {
        C23533 c23533 = this.f6406;
        C10852 c10852M27583 = c23533.f4277;
        C6117 c6118 = this.f6409;
        if (!c6118.m17649(c6117)) {
            c10852M27583 = c10852M27583.m27583(c6117);
        }
        if (!c6118.m17652(c6117)) {
            c23533 = (C23533) c10852M27583.m27582(c6117.m17650());
        }
        C23533 c23534 = c23533;
        if (c6118.equals(c6117)) {
            return null;
        }
        return C23533.m52729(c23534, c6117, this.f6411, this.f6410, this.f6408, this.f6407, this.f6412);
    }
}
