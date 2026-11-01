package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81WQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21883 extends AbstractC2832 {
    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "ParameterEmpty";
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8588(C19213 c19213) {
        return this.f5864.f19319.contains(c19213.getType());
    }

    @Override // l.AbstractC2832
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8587(C10124 c10124, InterfaceC7945 interfaceC7945) {
        boolean z;
        Iterator it = interfaceC7945.mo11508().iterator();
        while (it.hasNext()) {
            switch (((InterfaceC1594) it.next()).mo5435().f35329) {
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
