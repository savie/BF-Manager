package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۧۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11598 implements InterfaceC1399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23533 f36412;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC11225 f36413;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f36414;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6117 f36415;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f36416;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f36417;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f36418;

    public C11598(C23533 c23533, C6117 c6117, Set set, Set set2, Set set3, EnumC11225 enumC11225, Set set4) {
        this.f36412 = c23533;
        this.f36415 = c6117;
        this.f36417 = set;
        this.f36416 = set2;
        this.f36414 = set3;
        this.f36413 = enumC11225;
        this.f36418 = set4;
    }

    @Override // l.InterfaceC1399
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5109(C6117 c6117) {
        C23533 c23533 = this.f36412;
        C10852 c10852M27583 = c23533.f4277;
        C6117 c6118 = this.f36415;
        if (!c6118.m17649(c6117)) {
            c10852M27583 = c10852M27583.m27583(c6117);
        }
        if (!c6118.m17652(c6117)) {
            c23533 = (C23533) c10852M27583.m27582(c6117.m17650());
        }
        return C23533.m52729(c23533, c6117, this.f36417, this.f36416, this.f36414, this.f36413, this.f36418);
    }
}
