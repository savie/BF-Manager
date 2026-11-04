package l;

/* JADX INFO: renamed from: l.ܶ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBEV */
/* JADX INFO: loaded from: classes5.dex */
public class C15746 extends C12763 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24698 f51212;

    public C15746(int i) {
        super(i);
        this.f51212 = new C24698(i);
    }

    public C15746(C14978 c14978) {
        super(c14978.size());
        this.f51212 = c14978.f51212.m55045();
        int size = c14978.size();
        for (int i = 0; i < size; i++) {
            m31596(i, c14978.m31593(i));
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m37668() {
        C24698 c24698 = this.f51212;
        int size = c24698.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
        } while (c24698.get(size) < 0);
        int i = size + 1;
        c24698.m55048(i);
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37666(int i, C12586 c12586) {
        m37667(i, (InterfaceC17238) c12586);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m37669(int i) {
        C24698 c24698 = this.f51212;
        if (i >= c24698.size()) {
            return -1;
        }
        return c24698.get(i);
    }

    @Override // l.C12763
    /* JADX INFO: renamed from: ۨ */
    public final void mo31606() {
        super.mo31606();
        int size = size();
        for (int i = 0; i < size; i++) {
            this.f51212.set(((InterfaceC17238) m31593(i)).mo31292(), i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37667(int i, InterfaceC17238 interfaceC17238) {
        InterfaceC17238 interfaceC17239 = (InterfaceC17238) m31607(i);
        m31596(i, (Object) interfaceC17238);
        C24698 c24698 = this.f51212;
        if (interfaceC17239 != null) {
            c24698.set(interfaceC17239.mo31292(), -1);
        }
        if (interfaceC17238 != null) {
            int iMo31292 = interfaceC17238.mo31292();
            int size = c24698.size();
            for (int i2 = 0; i2 <= iMo31292 - size; i2++) {
                c24698.add(-1);
            }
            c24698.set(iMo31292, i);
        }
    }
}
