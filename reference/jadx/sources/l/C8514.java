package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۠᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 79FR */
/* JADX INFO: loaded from: classes4.dex */
public final class C8514 extends C18391 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Set f29491;

    public final String toString() {
        return "SMB_COM_NEGOTIATE";
    }

    public C8514(EnumSet enumSet) {
        super(new C15570());
        this.f29491 = enumSet;
    }

    @Override // l.C18391
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo22237(C19240 c19240) {
        int length = 0;
        c19240.m27381((byte) 0);
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("SMB 2.002");
        Set set = this.f29491;
        if (set.size() > 1 || !set.contains(EnumC20508.SMB_2_0_2)) {
            arrayList.add("SMB 2.???");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            length += ((String) it.next()).length() + 2;
        }
        c19240.m27396(length);
        for (String str : arrayList) {
            c19240.m27381((byte) 2);
            c19240.m27385(str, C7393.f24572);
        }
        ((C15570) this.f34399).m37204(c19240.m27400());
    }
}
