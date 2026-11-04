package l;

import java.util.List;

/* JADX INFO: renamed from: l.۟ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C7696 extends AbstractC18883 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f25392;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f25393;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14763 f25394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14763 f25395;

    public C7696(C14763 c14763, C14763 c14764, List list, List list2, InterfaceC21646 interfaceC21646, C15087 c15087) {
        super(list.size(), list2.size(), interfaceC21646, c15087);
        this.f25395 = c14763;
        this.f25394 = c14764;
        this.f25393 = list;
        this.f25392 = list2;
    }

    @Override // l.AbstractC18883
    /* JADX INFO: renamed from: ۙ */
    public final void mo1719(int i, int i2, int i3, int i4) {
        C22547 c22547M33070 = C13441.m33070(this.f25393, this.f25392, i, i3, i2, i4);
        int i5 = c22547M33070.f72892;
        int i6 = c22547M33070.f72891;
        List listSubList = this.f25393.subList(i5, i6);
        int i7 = c22547M33070.f72894;
        int i8 = c22547M33070.f72893;
        InterfaceC21646 interfaceC21646M35914 = C14932.m35914(listSubList, this.f25392.subList(i7, i8), this.f61295);
        C6730 c6730 = this.f61294;
        c6730.m54965(i, i3, i5, i7);
        for (C22547 c22547 : interfaceC21646M35914.mo3131()) {
            int i9 = c22547.f72892;
            c6730.m54961(i5 + i9, c22547.f72894 + i7, c22547.f72891 - i9);
        }
        c6730.m54965(i6, i8, i2, i4);
    }

    @Override // l.AbstractC18883
    /* JADX INFO: renamed from: ۙ */
    public final C10612 mo1718(int i) {
        int i2 = this.f25395.getInt(i);
        return new C10612(i2, i2 + 1);
    }

    @Override // l.AbstractC18883
    /* JADX INFO: renamed from: ᩷ */
    public final C10612 mo1720(int i) {
        int i2 = this.f25394.getInt(i);
        return new C10612(i2, i2 + 1);
    }
}
