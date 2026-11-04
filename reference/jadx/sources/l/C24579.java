package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6X3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24579 implements InterfaceC19795, InterfaceC3797 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m54897(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m54898(String str, String str2, boolean z, boolean z2) {
        return JSON.object().add(str, z).add(str2, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m54899(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        C17359.requireNonNull(obj);
        arrayList.add(obj2);
        return C4681.unmodifiableList(arrayList2);
    }

    @Override // l.InterfaceC3797
    /* JADX INFO: renamed from: ۙ */
    public void mo12326(int i, int i2, int i3) {
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }
}
