package l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10539 extends AbstractC19711 {
    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ܰ */
    public final C4582 mo14492() {
        return C4582.f16235;
    }

    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ۙ */
    public final void mo14463(StringReader stringReader, String str, C13756 c13756) {
        super.mo14463(stringReader, str, c13756);
        this.f63271.add(this.f63275);
        C19669 c19669M26641 = this.f63275.m26641();
        c19669M26641.m44795(EnumC8380.xml);
        c19669M26641.m44796(EnumC12613.xhtml);
        c19669M26641.m44799();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[LOOP:1: B:36:0x00db->B:41:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[SYNTHETIC] */
    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14473(AbstractC21516 abstractC21516) {
        int size;
        C0617 c0617;
        C11598 c11598M42447;
        C0617 c0618 = null;
        switch (C9128.f31066[abstractC21516.f69910.ordinal()]) {
            case 1:
                C6699 c6699 = (C6699) abstractC21516;
                C11639 c11639M44835 = m44835(c6699.m50755(), this.f63276);
                if (c6699.m50749()) {
                    c6699.f74528.m36932(this.f63276);
                }
                C4582 c4582 = this.f63276;
                C15436 c15436 = c6699.f74528;
                c4582.m12727(c15436);
                C0617 c0619 = new C0617(c11639M44835, null, c15436);
                m44834().m2855(c0619);
                m44837((AbstractC14730) c0619, (AbstractC21516) c6699);
                if (!c6699.f74531) {
                    this.f63271.add(c0619);
                    return true;
                }
                if (!c11639M44835.m29054()) {
                    c11639M44835.m29055();
                }
                return true;
            case 2:
                C3876 c3876 = (C3876) abstractC21516;
                Object objM12729 = this.f63276.m12729(c3876.f74530);
                int size2 = this.f63271.size();
                int i = size2 + (-1) >= 256 ? size2 - 257 : 0;
                for (int size3 = this.f63271.size() - 1; size3 >= i; size3--) {
                    C0617 c06110 = (C0617) this.f63271.get(size3);
                    if (c06110.mo2863().equals(objM12729)) {
                        c0618 = c06110;
                        if (c0618 != null) {
                            for (size = this.f63271.size() - 1; size >= 0; size--) {
                                c0617 = (C0617) this.f63271.get(size);
                                this.f63271.remove(size);
                                if (c0617 == c0618) {
                                    m44836(c0617, (AbstractC21516) c3876);
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                }
                if (c0618 != null) {
                    while (size >= 0) {
                        c0617 = (C0617) this.f63271.get(size);
                        this.f63271.remove(size);
                        if (c0617 == c0618) {
                            m44836(c0617, (AbstractC21516) c3876);
                            return true;
                        }
                    }
                }
                return true;
            case 3:
                C22222 c22222 = (C22222) abstractC21516;
                C18257 c18257 = new C18257(c22222.m49335());
                if (c22222.f72666 && c18257.m42448() && (c11598M42447 = c18257.m42447()) != null) {
                    c18257 = c11598M42447;
                }
                m44834().m2855(c18257);
                m44837(c18257, c22222);
                return true;
            case 4:
                C5288 c5288 = (C5288) abstractC21516;
                String strM14653 = c5288.m14653();
                AbstractC14730 c21785 = c5288 instanceof C2465 ? new C21785(strM14653) : new C13715(strM14653);
                m44834().m2855(c21785);
                m44837(c21785, c5288);
                return true;
            case 5:
                C1054 c1054 = (C1054) abstractC21516;
                C7674 c7674 = new C7674(this.f63276.m12729(c1054.f4892.toString()), c1054.f4890.toString(), c1054.f4893.toString());
                c7674.m20269(c1054.f4894);
                m44834().m2855(c7674);
                m44837(c7674, c1054);
                return true;
            case 6:
                return true;
            default:
                throw new C22491("Unexpected token type: ".concat(String.valueOf(abstractC21516.f69910)));
        }
    }

    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ۙ */
    public final List mo14460(String str, C0617 c0617, String str2, C13756 c13756) {
        mo14463(new StringReader(str), str2, c13756);
        m44840();
        return this.f63275.m35264();
    }
}
