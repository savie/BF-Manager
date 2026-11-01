package l;

/* JADX INFO: renamed from: l.ܶᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBEV */
/* JADX INFO: loaded from: classes5.dex */
public class C15420 extends C5541 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4129 f50266;

    public C15420(int i) {
        super(i);
        this.f50266 = new C4129(i);
    }

    public C15420(C5667 c5667) {
        super(c5667.size());
        this.f50266 = c5667.f50266.m11757();
        int size = c5667.size();
        for (int i = 0; i < size; i++) {
            m15252(i, c5667.m15249(i));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36890() {
        C4129 c4129 = this.f50266;
        int size = c4129.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
        } while (c4129.get(size) < 0);
        int i = size + 1;
        c4129.m11754(i);
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36888(int i, C19446 c19446) {
        m36889(i, (InterfaceC23181) c19446);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m36887(int i) {
        C4129 c4129 = this.f50266;
        if (i >= c4129.size()) {
            return -1;
        }
        return c4129.get(i);
    }

    @Override // l.C5541
    /* JADX INFO: renamed from: ۡ */
    public final void mo15262() {
        super.mo15262();
        int size = size();
        for (int i = 0; i < size; i++) {
            this.f50266.set(((InterfaceC23181) m15249(i)).mo29913(), i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36889(int i, InterfaceC23181 interfaceC23181) {
        InterfaceC23181 interfaceC23182 = (InterfaceC23181) m15263(i);
        m15252(i, (Object) interfaceC23181);
        C4129 c4129 = this.f50266;
        if (interfaceC23182 != null) {
            c4129.set(interfaceC23182.mo29913(), -1);
        }
        if (interfaceC23181 != null) {
            int iMo29913 = interfaceC23181.mo29913();
            int size = c4129.size();
            for (int i2 = 0; i2 <= iMo29913 - size; i2++) {
                c4129.add(-1);
            }
            c4129.set(iMo29913, i);
        }
    }
}
