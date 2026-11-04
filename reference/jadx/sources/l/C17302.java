package l;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17302 implements InterfaceC24762 {
    @Override // l.InterfaceC24762
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo37733() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : C17423.f56652.entrySet()) {
            arrayList.add(new C16556(((String) entry.getKey()).substring(6), ((Integer) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // l.InterfaceC24762
    /* JADX INFO: renamed from: ۙ */
    public final void mo37734(C16556 c16556) {
        C17423.f56652.put("local:" + c16556.m39198(), Integer.valueOf(c16556.m39199()));
        C17423.m40912();
    }

    @Override // l.InterfaceC24762
    /* JADX INFO: renamed from: ᩷ */
    public final void mo37735(C16556 c16556) {
        C17423.f56652.remove("local:" + c16556.m39198());
        C17423.m40912();
    }
}
