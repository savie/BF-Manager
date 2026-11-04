package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4339 extends C22985 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15703;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0347 f15704;

    public C4339(C0347 c0347, int i) {
        super(i);
        this.f15703 = new ArrayList();
        this.f15704 = c0347;
    }

    @Override // l.C22985
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13841(int i, int i2, int i3) {
        super.mo13841(i, i2, i3);
        m13840(i2, i);
        if (i3 == 2) {
            m13840(i2 + 1, i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13843(int i, int i2, int i3) {
        InterfaceC16492 interfaceC16492;
        ArrayList arrayList = this.f15703;
        if (i2 >= arrayList.size() || (interfaceC16492 = (InterfaceC16492) arrayList.get(i2)) == null) {
            return false;
        }
        if (i3 == 1) {
            return interfaceC16492.mo10004(i);
        }
        return interfaceC16492.mo10004(i) || m13843(i, i2 + 1, i3 - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13840(int i, int i2) {
        int i3 = i + 1;
        ArrayList arrayList = this.f15703;
        arrayList.ensureCapacity(i3);
        while (i >= arrayList.size()) {
            arrayList.add(new C13770(i3));
        }
        this.f15704.m2093(i2, (InterfaceC16492) arrayList.get(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13842(C0063 c0063, int i, int i2) {
        int size = c0063.size();
        for (int i3 = 0; i3 < size; i3++) {
            C20946 c20946M31619get = c0063.m31619get(i3);
            int iM51868 = m51868(c20946M31619get.m47903());
            if (iM51868 == i) {
                return true;
            }
            if (c20946M31619get.m47901() == 2 && iM51868 + 1 == i) {
                return true;
            }
            if (i2 == 2 && iM51868 == i + 1) {
                return true;
            }
        }
        return false;
    }
}
