package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3111 implements InterfaceC13717 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f11720;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f11721;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile C9463 f11722;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f11723;

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C4543.m12682(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C4543.m12683(this, interfaceC13717);
    }

    public C3111(int i, InterfaceC13717 interfaceC13717, InterfaceC13717 interfaceC13718) {
        this.f11723 = i;
        this.f11721 = interfaceC13717;
        this.f11720 = interfaceC13718;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3111 m9336(InterfaceC13717 interfaceC13717) {
        return new C3111(2, interfaceC13717, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13717 m9335(InterfaceC13717 interfaceC13717, InterfaceC13717 interfaceC13718, boolean z) {
        C3111 c3111 = new C3111(0, interfaceC13717, interfaceC13718);
        return z ? new C23574(c3111) : c3111;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13717 m9337(InterfaceC13717 interfaceC13717, InterfaceC13717 interfaceC13718, boolean z) {
        C3111 c3111 = new C3111(1, interfaceC13717, interfaceC13718);
        return z ? new C23574(c3111) : c3111;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m9332(InterfaceC13717 interfaceC13717) {
        if (interfaceC13717 instanceof C23574) {
            ((C23574) interfaceC13717).f76369.m9333();
        } else if (interfaceC13717 instanceof C3111) {
            ((C3111) interfaceC13717).m9333();
        }
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        return m9333().mo1813(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9463 m9333() {
        C9463 c9463M9334;
        C9463 c9463 = this.f11722;
        if (c9463 != null) {
            return c9463;
        }
        synchronized (this) {
            c9463M9334 = this.f11722;
            if (c9463M9334 == null) {
                c9463M9334 = m9334(this);
                this.f11722 = c9463M9334;
            }
        }
        return c9463M9334;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9463 m9334(C3111 c3111) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = -2;
        arrayList.add(new C14402(c3111, -1, -2));
        while (!arrayList.isEmpty()) {
            C14402 c14402 = (C14402) C19084.m43861(arrayList, 1);
            InterfaceC13717 interfaceC13717 = c14402.f47216;
            if (interfaceC13717 instanceof C23574) {
                c14402.f47216 = ((C23574) interfaceC13717).f76369;
            }
            InterfaceC13717 interfaceC13718 = c14402.f47216;
            if (interfaceC13718 instanceof C3111) {
                C3111 c3112 = (C3111) interfaceC13718;
                InterfaceC13717 interfaceC13719 = c3112.f11721;
                int i = c3112.f11723;
                if (i == 2) {
                    c14402.f47216 = interfaceC13719;
                    int i2 = c14402.f47217;
                    c14402.f47217 = c14402.f47215;
                    c14402.f47215 = i2;
                } else {
                    int i3 = c14402.f47214;
                    if (i3 == 0) {
                        c14402.f47214 = 1;
                        arrayList.add(new C14402(c3112.f11720, c14402.f47217, c14402.f47215));
                    } else if (i3 == 1) {
                        c14402.f47214 = 2;
                        arrayList.add(new C14402(interfaceC13719, i == 0 ? size : c14402.f47217, i == 1 ? size : c14402.f47215));
                    } else {
                        C19028.m43762(arrayList, 1);
                    }
                }
            } else {
                size = arrayList2.size();
                arrayList2.add(new C1700(c14402.f47216, c14402.f47217, c14402.f47215));
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return new C9463(arrayList2, size);
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return m9336(this);
    }
}
