package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: DIU7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0118 extends AbstractC20255 implements InterfaceC12246 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9812 f1070;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f1071;

    public AbstractC0118(C12050 c12050) {
        super(c12050);
        this.f1071 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9812 m1251() {
        return this.f1070;
    }

    @Override // l.InterfaceC12246
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List mo1257() {
        return this.f1071;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m1255() {
        C9812 c9812 = this.f1070;
        if (c9812 != null) {
            this.f1070 = C9812.m25574(c9812);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m1254() {
        C9812 c9812M25578;
        C9812 c9812 = this.f1070;
        if (c9812 == null || (c9812M25578 = C9812.m25578(c9812)) == this.f1070) {
            return false;
        }
        this.f1070 = c9812M25578;
        return true;
    }

    @Override // l.InterfaceC12246
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo1256() {
        int iM16977;
        Iterator it = this.f1071.iterator();
        while (it.hasNext()) {
            C18959 c18959M52200 = C23231.m52200((InterfaceC23435) it.next());
            if (c18959M52200 != null && (iM16977 = c18959M52200.m16977()) != 0) {
                return iM16977;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1253(C21943 c21943) {
        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21943);
        this.f1070 = c18959M52200 == null ? null : C9812.m25576((C17489) c18959M52200);
        this.f1071 = Collections.singletonList(c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1252(C0864 c0864) {
        this.f1070 = c0864.m3513();
        this.f1071 = c0864.m3522().m42624();
    }
}
