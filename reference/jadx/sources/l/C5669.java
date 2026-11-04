package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5669 implements InterfaceC12789 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19554;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f19555 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11634 f19556;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f19557;

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16659(InterfaceC9060 interfaceC9060) {
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 mo16658(int i, int i2) {
        InterfaceC22024 c4586;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f19555;
        InterfaceC22024 interfaceC22024 = (InterfaceC22024) map.get(numValueOf);
        if (interfaceC22024 != null) {
            return interfaceC22024;
        }
        if (i2 == 2) {
            C11634 c11634 = new C11634();
            this.f19554++;
            this.f19556 = c11634;
            c4586 = c11634;
        } else {
            c4586 = new C4586();
        }
        map.put(Integer.valueOf(i), c4586);
        return c4586;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo16661() {
        this.f19557 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16660() {
        C11634 c11634;
        return this.f19557 && this.f19554 == 1 && (c11634 = this.f19556) != null && c11634.f36478 && this.f19556.f36480 != -9223372036854775807L && this.f19556.f36479;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m16662() {
        C11634 c11634 = this.f19556;
        if (c11634 == null) {
            return -9223372036854775807L;
        }
        return c11634.f36480;
    }
}
