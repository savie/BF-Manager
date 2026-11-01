package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H528 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18868 implements InterfaceC18993 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8285 f61099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61100;

    public C18868(C8285 c8285, int i) {
        this.f61099 = c8285;
        this.f61100 = i;
    }

    @Override // l.InterfaceC18993
    /* JADX INFO: renamed from: ۙ */
    public final C13930 mo21702(String str, EnumC11959 enumC11959) {
        C8285 c8285 = this.f61099;
        List[] listArr = c8285.f28774;
        int i = this.f61100;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(5);
            c8285.f28774[i] = arrayList;
        }
        C13930 c13930 = new C13930(str, enumC11959);
        arrayList.add(c13930);
        return c13930;
    }
}
