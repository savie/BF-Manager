package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 81WQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11977 extends AbstractC5266 {
    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "ParameterEmpty";
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15856(C7447 c7447) {
        return this.f75089.f72607.contains(c7447.getType());
    }

    @Override // l.AbstractC5266
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7732(C5122 c5122, InterfaceC7140 interfaceC7140) {
        boolean z;
        Iterator it = interfaceC7140.mo2840().iterator();
        while (it.hasNext()) {
            switch (((InterfaceC23331) it.next()).mo30864().f73513) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    z = true;
                    break;
                default:
                    break;
            }
            return !z;
        }
        z = false;
        return !z;
    }
}
