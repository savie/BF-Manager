package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C5479 implements InterfaceC12936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19082;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0818 f19083;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20613 f19084;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f19085;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f19086;

    public C5479(String str, int i, C20613 c20613, String str2, InterfaceC0818 interfaceC0818) {
        this.f19082 = str;
        this.f19085 = i;
        this.f19084 = c20613;
        this.f19086 = str2;
        this.f19083 = interfaceC0818;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m16308() {
        switch (this.f19082) {
            case "pt":
                return C1750.f5971;
            case "re":
                return C19632.m45281();
            case "tu":
                if (!C1750.f5969 || !C4767.m14717()) {
                    return false;
                }
            default:
                return true;
        }
    }

    @Override // l.InterfaceC12936
    public final String getName() {
        return C21576.m49088(this.f19085);
    }

    public final String toString() {
        return C21576.m49088(this.f19085);
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11983 mo16307() {
        return this.f19084.f66117;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo16304() {
        return this.f19082;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo16306() {
        if (this.f19085 == R.string.MT_Protector) {
            return C17380.m40822();
        }
        return false;
    }

    @Override // l.InterfaceC12936
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16305(Main main) {
        this.f19083.accept(main);
    }
}
