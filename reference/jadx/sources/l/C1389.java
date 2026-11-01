package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;

/* JADX INFO: renamed from: l.֨᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1389 implements InterfaceC12679 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8446 f5787;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17617 f5788;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f5789;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3070 f5790;

    public C1389(C17617 c17617, InterfaceC8446 interfaceC8446, String str, C3070 c3070) {
        this.f5788 = c17617;
        this.f5787 = interfaceC8446;
        this.f5789 = str;
        this.f5790 = c3070;
    }

    @Override // l.InterfaceC12679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9152 mo4873(AbstractC20745 abstractC20745) throws C12731 {
        this.f5787.mo22107(abstractC20745);
        C5928 c5928M40947 = this.f5788.m40947(abstractC20745.mo33989());
        String str = this.f5790.f11560;
        JSONArray jSONArrayArray = JSON.array();
        String str2 = this.f5789;
        C17617.m40985(str2, c5928M40947, str, jSONArrayArray);
        if (c5928M40947.m16197() < 0 || c5928M40947.m16197() > 9007199254740991L) {
            throw C17617.m40953(JSON.array(), "The prepared file size exceeds the supported JSON integer range.", str2, str, "produce_temp");
        }
        return new C9152(c5928M40947.m16197(), null);
    }

    @Override // l.InterfaceC12679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4874(C3070 c3070) {
        this.f5787.mo22106(c3070);
    }
}
