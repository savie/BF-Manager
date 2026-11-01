package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0885 implements InterfaceC8228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f3584;

    public C0885(C7236 c7236) {
        this.f3584 = c7236;
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3560(boolean z) {
        String strM19347;
        C7236 c7236 = this.f3584;
        if (c7236.f73689.getBoolean("changed", false) != z) {
            c7236.f73689.putBoolean("changed", z);
            try {
                c7236.m50128(((ActivityC5677) c7236.requireActivity()).m15676());
            } catch (IOException unused) {
            }
            c7236.m50125(new C22053());
        }
        if (c7236.f24116) {
            if (c7236.f24099 != null) {
                c7236.f24099.setEnabled(z);
            }
            if (z) {
                strM19347 = "*" + c7236.m19347();
            } else {
                strM19347 = c7236.m19347();
            }
            int i = z ? C20368.f66005 : C20368.f65993;
            if (c7236.f24098.getText().toString().equals(strM19347)) {
                return;
            }
            c7236.f24098.setText(strM19347);
            c7236.f24098.setTextColor(i);
        }
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3561(boolean z, boolean z2) {
        C7236 c7236 = this.f3584;
        if (c7236.f24116) {
            if (c7236.f24115 != null) {
                c7236.f24115.setEnabled(z);
            }
            if (c7236.f24095 != null) {
                c7236.f24095.setEnabled(z2);
            }
        }
    }
}
