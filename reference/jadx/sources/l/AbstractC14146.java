package l;

import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6C3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14146 extends AbstractC6683 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14287 f44731;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f44732;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f44733;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f44734;

    public /* synthetic */ AbstractC14146(int i) {
        this();
    }

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo15469(C2551 c2551, InterfaceC18213 interfaceC18213);

    public AbstractC14146() {
        super(1);
        this.f44734 = new HashSet();
        this.f44733 = new HashSet();
        this.f44732 = false;
    }

    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        mo15469(c2551, interfaceC18213);
        return true;
    }

    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13866(C2551 c2551, InterfaceC18213 interfaceC18213) {
        HashSet hashSet = this.f44734;
        if (hashSet.contains(interfaceC18213)) {
            hashSet.remove(interfaceC18213);
            List listMo19035 = interfaceC18213.mo19035();
            C14287 c14287 = this.f44731;
            int i = C14804.f48424;
            C18959 c18959 = new C18959(EnumC24203.BREAK, 0);
            c18959.mo17866(EnumC1763.SYNTHETIC);
            c18959.mo17864(new C4328(c14287));
            listMo19035.add(new C0314(c18959));
        }
        HashSet hashSet2 = this.f44733;
        if (hashSet2.contains(interfaceC18213)) {
            hashSet2.remove(interfaceC18213);
            C1170.removeIf(interfaceC18213.mo19035(), new C20548(3));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34362() {
        this.f44732 = false;
        this.f44734.clear();
        this.f44733.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34363() {
        this.f44732 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34360() {
        return this.f44732;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34361(InterfaceC23435 interfaceC23435) {
        C18959 c18959;
        C4328 c4328;
        return (interfaceC23435 == null || (c18959 = (C18959) C6823.m18999(interfaceC23435.mo1986())) == null || c18959.getType() != EnumC24203.BREAK || (c4328 = (C4328) c18959.mo17862((InterfaceC2157) C11457.f36010)) == null || c4328.m13823() != this.f44731) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34359(InterfaceC23435 interfaceC23435, InterfaceC6281 interfaceC6281) {
        List listMo1986 = interfaceC23435.mo1986();
        C18959 c18959 = (C18959) C6823.m18999(listMo1986);
        if (c18959 == null || c18959.getType() != EnumC24203.BREAK) {
            return;
        }
        C6823.m19006(listMo1986);
        if (listMo1986.isEmpty()) {
            interfaceC23435.mo17866(EnumC1763.REMOVE);
            this.f44733.add(interfaceC6281);
        }
    }
}
