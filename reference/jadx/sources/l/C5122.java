package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62B */
/* JADX INFO: loaded from: classes3.dex */
public final class C5122 extends AbstractC6968 implements InterfaceC8631 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f17836;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Set f17837;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11833 f17838;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17839;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18634 f17840;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC7140 f17841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17842 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f17835 = 0;

    public C5122(C11833 c11833, List list, int i, C18634 c18634, Set set, InterfaceC7140 interfaceC7140) {
        this.f17838 = c11833;
        this.f17836 = list;
        this.f17839 = i;
        this.f17840 = c18634;
        this.f17837 = set;
        this.f17841 = interfaceC7140;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܳ */
    public final String mo6804() {
        return this.f17838.f38160.f68791.f12443;
    }

    @Override // l.InterfaceC4859
    public final String getName() {
        return this.f17838.f38161.f12443;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܶ */
    public final C20784 mo6805() {
        return this.f17838.f38159.f7068;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ۤ */
    public final String mo6802() {
        return this.f17838.f38159.f7067.f68791.f12443;
    }

    @Override // l.InterfaceC8631
    public final List getParameters() {
        return this.f17836;
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13184() {
        return this.f17839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15486(C10628 c10628) {
        this.f17841 = c10628;
    }

    @Override // l.InterfaceC8631
    public final Set getAnnotations() {
        return this.f17840;
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ۗ */
    public final Set mo13176() {
        return this.f17837;
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ֫᩷ */
    public final InterfaceC7140 mo13175() {
        return this.f17841;
    }
}
