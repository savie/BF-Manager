package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5146 implements InterfaceC12943 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f17922;

    public C5146(C16332 c16332) {
        this.f17922 = c16332;
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15545(boolean z) {
        String strMo1445;
        C16332 c16332 = this.f17922;
        if (c16332.f29441.getBoolean("changed", false) != z) {
            c16332.f29441.putBoolean("changed", z);
            try {
                c16332.m24172(((ActivityC0848) c16332.requireActivity()).m3442());
            } catch (IOException unused) {
            }
            c16332.m24163(new C2754());
        }
        if (c16332.f53026) {
            c16332.f53027.mo14428(c16332.f53033, c16332.f53032.m54021());
            if (c16332.f53048 != null) {
                c16332.f53048.setEnabled(z);
            }
            if (z) {
                strMo1445 = "*" + c16332.mo1445();
            } else {
                strMo1445 = c16332.mo1445();
            }
            int i = z ? C3296.f10764 : C3296.f10762;
            if (c16332.f53045.getText().toString().equals(strMo1445)) {
                return;
            }
            c16332.f53045.setText(strMo1445);
            c16332.f53045.setTextColor(i);
        }
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15546(boolean z, boolean z2) {
        C16332 c16332 = this.f17922;
        if (c16332.f53026) {
            if (c16332.f53047 != null) {
                c16332.f53047.setEnabled(z);
            }
            if (c16332.f53024 != null) {
                c16332.f53024.setEnabled(z2);
            }
        }
    }
}
