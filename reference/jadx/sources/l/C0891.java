package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C0891 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f3310;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C9839 f3311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f3312;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f3313;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    public C0891(int i, InterfaceC2885 interfaceC2885, InterfaceC2885 interfaceC2886) {
        this.f3312 = i;
        this.f3310 = interfaceC2885;
        this.f3313 = interfaceC2886;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C0891 m3623(InterfaceC2885 interfaceC2885) {
        return new C0891(2, interfaceC2885, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2885 m3620(InterfaceC2885 interfaceC2885, InterfaceC2885 interfaceC2886, boolean z) {
        C0891 c0891 = new C0891(0, interfaceC2885, interfaceC2886);
        return z ? new C0145(c0891) : c0891;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC2885 m3624(InterfaceC2885 interfaceC2885, InterfaceC2885 interfaceC2886, boolean z) {
        C0891 c0891 = new C0891(1, interfaceC2885, interfaceC2886);
        return z ? new C0145(c0891) : c0891;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m3625(InterfaceC2885 interfaceC2885) {
        if (interfaceC2885 instanceof C0145) {
            ((C0145) interfaceC2885).f1112.m3621();
        } else if (interfaceC2885 instanceof C0891) {
            ((C0891) interfaceC2885).m3621();
        }
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        return m3621().mo1303(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9839 m3621() {
        C9839 c9839M3622;
        C9839 c9839 = this.f3311;
        if (c9839 != null) {
            return c9839;
        }
        synchronized (this) {
            c9839M3622 = this.f3311;
            if (c9839M3622 == null) {
                c9839M3622 = m3622(this);
                this.f3311 = c9839M3622;
            }
        }
        return c9839M3622;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9839 m3622(C0891 c0891) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = -2;
        arrayList.add(new C7603(c0891, -1, -2));
        while (!arrayList.isEmpty()) {
            C7603 c7603 = (C7603) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            InterfaceC2885 interfaceC2885 = c7603.f25097;
            if (interfaceC2885 instanceof C0145) {
                c7603.f25097 = ((C0145) interfaceC2885).f1112;
            }
            InterfaceC2885 interfaceC2886 = c7603.f25097;
            if (interfaceC2886 instanceof C0891) {
                C0891 c0892 = (C0891) interfaceC2886;
                InterfaceC2885 interfaceC2887 = c0892.f3310;
                int i = c0892.f3312;
                if (i == 2) {
                    c7603.f25097 = interfaceC2887;
                    int i2 = c7603.f25098;
                    c7603.f25098 = c7603.f25096;
                    c7603.f25096 = i2;
                } else {
                    int i3 = c7603.f25099;
                    if (i3 == 0) {
                        c7603.f25099 = 1;
                        arrayList.add(new C7603(c0892.f3313, c7603.f25098, c7603.f25096));
                    } else if (i3 == 1) {
                        c7603.f25099 = 2;
                        arrayList.add(new C7603(interfaceC2887, i == 0 ? size : c7603.f25098, i == 1 ? size : c7603.f25096));
                    } else {
                        C2764.m9138(arrayList, 1);
                    }
                }
            } else {
                size = arrayList2.size();
                arrayList2.add(new C18790(c7603.f25097, c7603.f25098, c7603.f25096));
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return new C9839(arrayList2, size);
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return m3623(this);
    }
}
