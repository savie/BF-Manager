package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1ISU */
/* JADX INFO: loaded from: classes.dex */
public final class C24884 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f80519;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11457 f80520;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    public C24884(C11457 c11457, List list) {
        this.f80520 = c11457;
        this.f80519 = list;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m55414() {
        return this.f80519;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2157 mo1791() {
        return this.f80520;
    }

    public final String toString() {
        List list = this.f80519;
        String strM13221 = C4123.m13221(list, ", ");
        return strM13221.length() > 300 ? C4123.m13221(list, "\n    ") : strM13221;
    }
}
