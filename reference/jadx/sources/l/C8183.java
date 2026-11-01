package l;

import java.util.HashSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.۠۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8183 implements InterfaceC23145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3183 f28529;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19472 f28530;

    public C8183(C19472 c19472, InterfaceC3183 interfaceC3183) {
        this.f28530 = c19472;
        this.f28529 = interfaceC3183;
    }

    @Override // l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        InterfaceC3183 interfaceC3183 = this.f28529;
        if (interfaceC3183 == null || interfaceC3183.mo1619(c12417.m2211().replace('/', '.'))) {
            String strM8699 = C2892.m8699(c12417);
            if (strM8699 == null) {
                throw new IllegalStateException();
            }
            String strM44530 = C19472.m44530(strM8699);
            C19472 c19472 = this.f28530;
            if (((HashSet) c19472.f62687).contains(strM44530) || ((TreeSet) c19472.f62685).contains(strM44530)) {
                return;
            }
            if (c19472.f62689.m23033(strM44530)) {
                ((TreeSet) c19472.f62685).add(strM44530);
                return;
            }
            while (!strM44530.isEmpty() && !((HashSet) c19472.f62687).contains(strM44530)) {
                ((HashSet) c19472.f62687).add(strM44530);
                strM44530 = C19472.m44530(strM44530);
            }
        }
    }
}
