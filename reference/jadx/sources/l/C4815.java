package l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4815 extends AbstractC7315 {
    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ᩷ */
    public final C20193 mo13791() {
        return C20193.f64826;
    }

    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ۙ */
    public final void mo13748(StringReader stringReader, String str, C11988 c11988) {
        super.mo13748(stringReader, str, c11988);
        this.f24093.add(this.f24096);
        C7381 c7381M15300 = this.f24096.m15300();
        c7381M15300.m20278(EnumC8872.xml);
        c7381M15300.m20277(EnumC5802.xhtml);
        c7381M15300.m20279();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[LOOP:1: B:36:0x00db->B:41:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[SYNTHETIC] */
    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13758(AbstractC0802 abstractC0802) {
        int size;
        C15496 c15496;
        C6548 c6548M25102;
        C15496 c15497 = null;
        switch (C14026.f44440[abstractC0802.f2843.ordinal()]) {
            case 1:
                C7514 c7514 = (C7514) abstractC0802;
                C6023 c6023M20059 = m20059(c7514.m43498(), this.f24095);
                if (c7514.m43492()) {
                    c7514.f60782.m26648(this.f24095);
                }
                C20193 c20193 = this.f24095;
                C10363 c10363 = c7514.f60782;
                c20193.m46440(c10363);
                C15496 c15498 = new C15496(c6023M20059, null, c10363);
                m20060().m37084(c15498);
                m20062((AbstractC17734) c15498, (AbstractC0802) c7514);
                if (!c7514.f60788) {
                    this.f24093.add(c15498);
                    return true;
                }
                if (!c6023M20059.m17491()) {
                    c6023M20059.m17495();
                }
                return true;
            case 2:
                C0056 c0056 = (C0056) abstractC0802;
                Object objM46442 = this.f24095.m46442(c0056.f60786);
                int size2 = this.f24093.size();
                int i = size2 + (-1) >= 256 ? size2 - 257 : 0;
                for (int size3 = this.f24093.size() - 1; size3 >= i; size3--) {
                    C15496 c15499 = (C15496) this.f24093.get(size3);
                    if (c15499.mo5151().equals(objM46442)) {
                        c15497 = c15499;
                        if (c15497 != null) {
                            for (size = this.f24093.size() - 1; size >= 0; size--) {
                                c15496 = (C15496) this.f24093.get(size);
                                this.f24093.remove(size);
                                if (c15496 == c15497) {
                                    m20061(c15496, (AbstractC0802) c0056);
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                }
                if (c15497 != null) {
                    while (size >= 0) {
                        c15496 = (C15496) this.f24093.get(size);
                        this.f24093.remove(size);
                        if (c15496 == c15497) {
                            m20061(c15496, (AbstractC0802) c0056);
                            return true;
                        }
                    }
                }
                return true;
            case 3:
                C14225 c14225 = (C14225) abstractC0802;
                C9617 c9617 = new C9617(c14225.m34533());
                if (c14225.f44949 && c9617.m25103() && (c6548M25102 = c9617.m25102()) != null) {
                    c9617 = c6548M25102;
                }
                m20060().m37084(c9617);
                m20062(c9617, c14225);
                return true;
            case 4:
                C3785 c3785 = (C3785) abstractC0802;
                String strM12293 = c3785.m12293();
                AbstractC17734 c1415 = c3785 instanceof C23923 ? new C1415(strM12293) : new C12513(strM12293);
                m20060().m37084(c1415);
                m20062(c1415, c3785);
                return true;
            case 5:
                C20939 c20939 = (C20939) abstractC0802;
                C22210 c22210 = new C22210(this.f24095.m46442(c20939.f66991.toString()), c20939.f66989.toString(), c20939.f66988.toString());
                c22210.m50236(c20939.f66990);
                m20060().m37084(c22210);
                m20062(c22210, c20939);
                return true;
            case 6:
                return true;
            default:
                throw new C21552("Unexpected token type: ".concat(String.valueOf(abstractC0802.f2843)));
        }
    }

    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ۙ */
    public final List mo13745(String str, C15496 c15496, String str2, C11988 c11988) {
        mo13748(new StringReader(str), str2, c11988);
        m20065();
        return this.f24096.m41534();
    }
}
