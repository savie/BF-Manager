package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܽ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBK8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16902 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f54054;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15160 f54056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3504 f54055 = new C3504();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f54053 = -1;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39578(C6111 c6111, C15160 c15160) {
        C16902 c16902 = new C16902(c15160, c6111.m17000());
        c6111.m16880(new C19665(1));
        c6111.m16853(c16902);
    }

    public C16902(C15160 c15160, InterfaceC2916 interfaceC2916) {
        this.f54056 = c15160;
        boolean zM39579 = m39579(interfaceC2916);
        this.f54054 = zM39579;
        c15160.m36356(zM39579);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean zM39579;
        int i4 = this.f54053;
        if ((i4 == -1 || i <= i4) && (zM39579 = m39579(charSequence)) != this.f54054) {
            this.f54054 = zM39579;
            this.f54056.m36356(zM39579);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m39579(CharSequence charSequence) {
        C17664 c17664 = new C17664(charSequence);
        C3504 c3504 = this.f54055;
        c3504.m10317(c17664);
        while (true) {
            try {
                int iM10327 = c3504.m10327();
                if (iM10327 == 1) {
                    return false;
                }
                if (iM10327 == 2) {
                    this.f54053 = c3504.m10330().m29585();
                    return c3504.m10328().equals("vector");
                }
                this.f54053 = -1;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
