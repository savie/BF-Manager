package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8720 implements InterfaceC12943 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f28390;

    public C8720(C25350 c25350) {
        this.f28390 = c25350;
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ */
    public final void mo15545(boolean z) {
        String strM56680;
        C25350 c25350 = this.f28390;
        if (c25350.f29441.getBoolean("changed", false) != z) {
            c25350.f29441.putBoolean("changed", z);
            try {
                c25350.m24172(((ActivityC0848) c25350.requireActivity()).m3442());
            } catch (IOException unused) {
            }
            c25350.m24163(new C2754());
        }
        if (c25350.f81856) {
            if (c25350.f81833 != null) {
                c25350.f81833.setEnabled(z);
            }
            if (z) {
                strM56680 = "*" + c25350.m56680();
            } else {
                strM56680 = c25350.m56680();
            }
            int i = z ? C3296.f10764 : C3296.f10762;
            if (c25350.f81846.getText().toString().equals(strM56680)) {
                return;
            }
            c25350.f81846.setText(strM56680);
            c25350.f81846.setTextColor(i);
        }
    }

    @Override // l.InterfaceC12943
    /* JADX INFO: renamed from: ۙ */
    public final void mo15546(boolean z, boolean z2) {
        C25350 c25350 = this.f28390;
        if (c25350.f81856) {
            if (c25350.f81848 != null) {
                c25350.f81848.setEnabled(z);
            }
            if (c25350.f81845 != null) {
                c25350.f81845.setEnabled(z2);
            }
        }
    }
}
