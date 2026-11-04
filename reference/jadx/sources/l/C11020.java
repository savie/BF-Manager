package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;

/* JADX INFO: renamed from: l.ۤܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11020 implements InterfaceC18479 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0580 f34797;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34798;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9113 f34799;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17733 f34800;

    public C11020(C0580 c0580, InterfaceC17733 interfaceC17733, String str, C9113 c9113) {
        this.f34797 = c0580;
        this.f34800 = interfaceC17733;
        this.f34798 = str;
        this.f34799 = c9113;
    }

    @Override // l.InterfaceC18479
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23701 mo27882(AbstractC22044 abstractC22044) throws C10186 {
        this.f34800.mo29627(abstractC22044);
        C1907 c1907M2616 = this.f34797.m2616(abstractC22044.mo4298());
        String str = this.f34799.f29602;
        JSONArray jSONArrayArray = JSON.array();
        String str2 = this.f34798;
        C0580.m2656(str2, c1907M2616, str, jSONArrayArray);
        if (c1907M2616.m6566() < 0 || c1907M2616.m6566() > 9007199254740991L) {
            throw C0580.m2621(JSON.array(), "The prepared file size exceeds the supported JSON integer range.", str2, str, "produce_temp");
        }
        return new C23701(c1907M2616.m6566(), null);
    }

    @Override // l.InterfaceC18479
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27883(C9113 c9113) {
        this.f34800.mo29626(c9113);
    }
}
