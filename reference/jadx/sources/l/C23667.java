package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.᩻ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B942 */
/* JADX INFO: loaded from: classes.dex */
public final class C23667 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return (c21422.m47974("local") || c21422.m47974(b.k)) && c21422.m47975() == 1;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        Main mainM47980 = c21422.m47980();
        InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
        if (interfaceC2557M47981 instanceof AbstractC5362) {
            C12628 c12628 = new C12628(mainM47980);
            C15404 c15404 = (C15404) interfaceC2557M47981;
            c12628.m31413(c15404.mo7963());
            C18225.f58201.getClass();
            c12628.m31414(new C14745(C12560.m31247(interfaceC2557M47981)));
            c12628.m31419("open-ns");
            c12628.m31417(c15404.getPath());
            c12628.m31411();
            c12628.m31412(((C9183) c21422.m47960()).m23639());
            c12628.m31415(c15404.isDirectory());
            c12628.m31418();
            return;
        }
        String[] strArr = interfaceC2557M47981.isDirectory() ? new String[]{"goto", "locate"} : new String[]{"locate", "locate-click", "edit-text", "exec-script", "preview-html"};
        C12628 c12629 = new C12628(mainM47980);
        c12629.m31413(interfaceC2557M47981.mo7963());
        c12629.m31414(new C14745(C3971.f14739.mo7924(interfaceC2557M47981)));
        c12629.m31416(strArr);
        c12629.m31417(interfaceC2557M47981.getPath());
        c12629.m31411();
        c12629.m31418();
    }
}
