package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X20E */
/* JADX INFO: loaded from: classes5.dex */
public final class C21485 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C21485 f69811 = new C21485(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C21485 m48102() {
        return f69811;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47975() == 1 && !c21422.m47981().isDirectory();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
        c21422.m47960().mo23627(interfaceC2557M47981);
        C17901.m41532(c21422.m47965(), interfaceC2557M47981, interfaceC2557M47981.mo7972().m48182() == null);
    }
}
