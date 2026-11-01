package l;

/* JADX INFO: renamed from: l.ܺܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes4.dex */
public final class C16066 extends AbstractC9011 {
    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "map_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return C0252.m1692(this.f30808.m29975().length, 2, 12, i + 4);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        int iM33642 = c13825.m33642();
        for (int i = 0; i < iM33642; i++) {
            EnumC21004 enumC21004M47162 = EnumC21004.m47162(c13825.m33638());
            c13825.m33638();
            c6187.m17184(enumC21004M47162, c13825.m33642(), c13825.m33642());
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        C12063 c12063 = this.f30808;
        AbstractC11127[] abstractC11127ArrM29975 = c12063.m29975();
        Integer.toHexString(abstractC11127ArrM29975.length + 2);
        Integer.toString(abstractC11127ArrM29975.length + 2);
        c4651.m12839(abstractC11127ArrM29975.length + 2);
        c4651.m12840();
        m38069(c4651, EnumC21004.TYPE_HEADER_ITEM, 1, 0);
        c4651.m12834();
        for (AbstractC11127 abstractC11127 : c12063.m29975()) {
            c4651.m12840();
            m38069(c4651, abstractC11127.f37762, abstractC11127.f37761.size(), abstractC11127.f37758);
            c4651.m12834();
        }
        c4651.m12840();
        m38069(c4651, EnumC21004.TYPE_MAP_LIST, 1, c12063.f40361.f30807);
        c4651.m12834();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38069(C4651 c4651, EnumC21004 enumC21004, int i, int i2) {
        c4651.m12833(enumC21004.f68398);
        c4651.m12833(0);
        c4651.m12839(i);
        c4651.m12839(i2);
    }
}
