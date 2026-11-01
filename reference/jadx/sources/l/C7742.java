package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7742 extends C11976 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25585;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20337 f25586;

    public C7742(C20337 c20337, int i) {
        super(i);
        this.f25585 = new ArrayList();
        this.f25586 = c20337;
    }

    @Override // l.C11976
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20392(int i, int i2, int i3) {
        super.mo20392(i, i2, i3);
        m20391(i2, i);
        if (i3 == 2) {
            m20391(i2 + 1, i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m20394(int i, int i2, int i3) {
        InterfaceC6952 interfaceC6952;
        ArrayList arrayList = this.f25585;
        if (i2 >= arrayList.size() || (interfaceC6952 = (InterfaceC6952) arrayList.get(i2)) == null) {
            return false;
        }
        if (i3 == 1) {
            return interfaceC6952.mo6408(i);
        }
        return interfaceC6952.mo6408(i) || m20394(i, i2 + 1, i3 - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20391(int i, int i2) {
        int i3 = i + 1;
        ArrayList arrayList = this.f25585;
        arrayList.ensureCapacity(i3);
        while (i >= arrayList.size()) {
            arrayList.add(new C1991(i3));
        }
        this.f25586.m45903(i2, (InterfaceC6952) arrayList.get(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20393(C0727 c0727, int i, int i2) {
        int size = c0727.size();
        for (int i3 = 0; i3 < size; i3++) {
            C16251 c16251M15275get = c0727.m15275get(i3);
            int iM29785 = m29785(c16251M15275get.m38400());
            if (iM29785 == i) {
                return true;
            }
            if (c16251M15275get.m38396() == 2 && iM29785 + 1 == i) {
                return true;
            }
            if (i2 == 2 && iM29785 == i + 1) {
                return true;
            }
        }
        return false;
    }
}
