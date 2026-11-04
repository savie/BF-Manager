package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7102 extends C2627 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Set f23423;

    public final String toString() {
        return "SMB_COM_NEGOTIATE";
    }

    public C7102(EnumSet enumSet) {
        super(new C1136());
        this.f23423 = enumSet;
    }

    @Override // l.C2627
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8768(C7453 c7453) {
        int length = 0;
        c7453.m56005((byte) 0);
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("SMB 2.002");
        Set set = this.f23423;
        if (set.size() > 1 || !set.contains(EnumC15700.SMB_2_0_2)) {
            arrayList.add("SMB 2.???");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            length += ((String) it.next()).length() + 2;
        }
        c7453.m56023(length);
        for (String str : arrayList) {
            c7453.m56005((byte) 2);
            c7453.m56009(str, C22150.f71348);
        }
        ((C1136) this.f16383).m4191(c7453.m56019());
    }
}
