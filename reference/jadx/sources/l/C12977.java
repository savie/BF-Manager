package l;

/* JADX INFO: renamed from: l.۫۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes4.dex */
public final class C12977 extends AbstractC10739 {
    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "map_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return C12669.m31441(this.f34102.m55247().length, 2, 12, i + 4);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        int iM12995 = c4028.m12995();
        for (int i = 0; i < iM12995; i++) {
            EnumC15214 enumC15214M36559 = EnumC15214.m36559(c4028.m13002());
            c4028.m13002();
            c17452.m40952(enumC15214M36559, c4028.m12995(), c4028.m12995());
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        C24738 c24738 = this.f34102;
        AbstractC15960[] abstractC15960ArrM55247 = c24738.m55247();
        Integer.toHexString(abstractC15960ArrM55247.length + 2);
        Integer.toString(abstractC15960ArrM55247.length + 2);
        c24166.m54134(abstractC15960ArrM55247.length + 2);
        c24166.m54137();
        m32391(c24166, EnumC15214.TYPE_HEADER_ITEM, 1, 0);
        c24166.m54130();
        for (AbstractC15960 abstractC15960 : c24738.m55247()) {
            c24166.m54137();
            m32391(c24166, abstractC15960.f51830, abstractC15960.f51828.size(), abstractC15960.f51831);
            c24166.m54130();
        }
        c24166.m54137();
        m32391(c24166, EnumC15214.TYPE_MAP_LIST, 1, c24738.f80107.f34103);
        c24166.m54130();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32391(C24166 c24166, EnumC15214 enumC15214, int i, int i2) {
        c24166.m54139(enumC15214.f49671);
        c24166.m54139(0);
        c24166.m54134(i);
        c24166.m54134(i2);
    }
}
