package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12951 extends EnumC7306 {
    public /* synthetic */ C12951() {
        this("FORMAT_45CC", 31);
    }

    public C12951(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17806 mo1324(int i, InterfaceC14985 interfaceC14985) {
        int iM19496 = EnumC7306.m19496(i);
        if (iM19496 != 250) {
            throw new UnsupportedOperationException(String.valueOf(iM19496));
        }
        int iM19495 = EnumC7306.m19495(i);
        int iM19492 = EnumC7306.m19492(i);
        int i2 = interfaceC14985.read();
        int i3 = interfaceC14985.read();
        int iM19479 = EnumC7306.m19479(i3);
        int iM19476 = EnumC7306.m19476(i3);
        int iM19497 = EnumC7306.m19495(i3);
        int iM19493 = EnumC7306.m19492(i3);
        int i4 = interfaceC14985.read();
        C6517.m17725(iM19496);
        if (iM19492 < 1 || iM19492 > 5) {
            throw new C19508("bogus registerCount: ".concat(C22475.m49981(iM19492)), null);
        }
        return new C20712(this, iM19496, i2, i4, Arrays.copyOfRange(new int[]{iM19479, iM19476, iM19497, iM19493, iM19495}, 0, iM19492));
    }

    @Override // l.EnumC7306
    /* JADX INFO: renamed from: ۙ */
    public void mo1325(AbstractC17806 abstractC17806, InterfaceC21334 interfaceC21334) {
        C20712 c20712 = (C20712) abstractC17806;
        EnumC7306.m19460(c20712.m41390(), EnumC7306.m19472(c20712.m46564(), c20712.mo1687()));
        EnumC7306.m19489(c20712.mo20931(), c20712.mo20929(), c20712.mo20930(), c20712.m46563());
        interfaceC21334.m47861();
    }
}
