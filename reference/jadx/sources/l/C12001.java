package l;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12001 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3740 f40223;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 f40224;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 f40225;

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c1145.m4214();
            return;
        }
        c1145.m4208();
        for (Map.Entry entry : map.entrySet()) {
            c1145.m4204(String.valueOf(entry.getKey()));
            this.f40224.mo1572(c1145, entry.getValue());
        }
        c1145.m4216();
    }

    public C12001(C2827 c2827, AbstractC7186 abstractC7186, AbstractC7186 abstractC7187, InterfaceC3740 interfaceC3740) {
        this.f40225 = abstractC7186;
        this.f40224 = abstractC7187;
        this.f40223 = interfaceC3740;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        EnumC22313 enumC22313M14916 = c5379.m14916();
        if (enumC22313M14916 == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        Map map = (Map) this.f40223.mo1620();
        if (enumC22313M14916 != EnumC22313.BEGIN_ARRAY) {
            c5379.m14917();
            while (c5379.m14924()) {
                AbstractC1541.f6257.mo5317(c5379);
                Object objMo1571 = this.f40225.mo1571(c5379);
                if (map.put(objMo1571, this.f40224.mo1571(c5379)) != null) {
                    throw new C22003(C9023.m23354(objMo1571, "duplicate key: "));
                }
            }
            c5379.m14910();
            return map;
        }
        c5379.m14913();
        while (c5379.m14924()) {
            c5379.m14913();
            Object objMo1572 = this.f40225.mo1571(c5379);
            if (map.put(objMo1572, this.f40224.mo1571(c5379)) != null) {
                throw new C22003(C9023.m23354(objMo1572, "duplicate key: "));
            }
            c5379.m14929();
        }
        c5379.m14929();
        return map;
    }
}
