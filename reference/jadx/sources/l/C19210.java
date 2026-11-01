package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19210 implements InterfaceC8228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f62034;

    public C19210(C23444 c23444) {
        this.f62034 = c23444;
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo3560(boolean z) {
        String strMo3620;
        C23444 c23444 = this.f62034;
        if (c23444.f73689.getBoolean("changed", false) != z) {
            c23444.f73689.putBoolean("changed", z);
            try {
                c23444.m50128(((ActivityC5677) c23444.requireActivity()).m15676());
            } catch (IOException unused) {
            }
            c23444.m50125(new C22053());
        }
        if (c23444.f75898) {
            c23444.f75894.mo10753(c23444.f75896, c23444.f75915.m17000());
            if (c23444.f75914 != null) {
                c23444.f75914.setEnabled(z);
            }
            if (z) {
                strMo3620 = "*" + c23444.mo3620();
            } else {
                strMo3620 = c23444.mo3620();
            }
            int i = z ? C20368.f66005 : C20368.f65993;
            if (c23444.f75904.getText().toString().equals(strMo3620)) {
                return;
            }
            c23444.f75904.setText(strMo3620);
            c23444.f75904.setTextColor(i);
        }
    }

    @Override // l.InterfaceC8228
    /* JADX INFO: renamed from: ۙ */
    public final void mo3561(boolean z, boolean z2) {
        C23444 c23444 = this.f62034;
        if (c23444.f75898) {
            if (c23444.f75910 != null) {
                c23444.f75910.setEnabled(z);
            }
            if (c23444.f75893 != null) {
                c23444.f75893.setEnabled(z2);
            }
        }
    }
}
