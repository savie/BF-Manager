package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13476 implements InterfaceC4302 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f44542;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44543;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0690 f44544;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17295 f44545;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44546;

    public C13476(String str, int i, C0690 c0690, String str2, InterfaceC17295 interfaceC17295) {
        this.f44543 = str;
        this.f44546 = i;
        this.f44544 = c0690;
        this.f44542 = str2;
        this.f44545 = interfaceC17295;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m32971() {
        switch (this.f44543) {
            case "pt":
                return C11359.f38315;
            case "re":
                return C20370.m46024();
            case "tu":
                if (!C11359.f38314 || !C6730.m18173()) {
                    return false;
                }
            default:
                return true;
        }
    }

    @Override // l.InterfaceC4302
    public final String getName() {
        return C16737.m39288(this.f44546);
    }

    public final String toString() {
        return C16737.m39288(this.f44546);
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ܰ */
    public final C14600 mo6563() {
        return this.f44544.f2944;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۙ */
    public final String mo6560() {
        return this.f44543;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo6562() {
        if (this.f44546 == R.string.MT_Protector) {
            return C16924.m39614();
        }
        return false;
    }

    @Override // l.InterfaceC4302
    /* JADX INFO: renamed from: ۙ */
    public final void mo6561(Main main) {
        this.f44545.accept(main);
    }
}
