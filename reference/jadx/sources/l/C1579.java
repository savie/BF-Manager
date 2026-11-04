package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1579 extends AbstractDialogInterfaceOnClickListenerC17480 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19023 f5471;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC24700 f5472;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19023 f5473;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19023 f5474;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f5475;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579(AbstractC24700 abstractC24700, AbstractActivityC17204 abstractActivityC17204, String str, int i, C19023 c19023, C19023 c19024, C19023 c19025, AbstractActivityC17204 abstractActivityC17205) {
        super(i, abstractActivityC17204, str);
        this.f5472 = abstractC24700;
        this.f5473 = c19023;
        this.f5474 = c19024;
        this.f5471 = c19025;
        this.f5475 = abstractActivityC17205;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17480
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo5598() {
        String strSubstring;
        String str;
        int i;
        String strM40985 = m40985();
        AbstractC24700 abstractC24700 = this.f5472;
        if (abstractC24700.mo54355(strM40985)) {
            m40987();
            m40981();
            return;
        }
        if (strM40985.isEmpty()) {
            abstractC24700.mo8145();
            m40981();
            return;
        }
        boolean zIsChecked = this.f5473.isChecked();
        C19023 c19023 = this.f5474;
        if (zIsChecked) {
            if (c19023.isChecked()) {
                strSubstring = strM40985;
            } else {
                strSubstring = strM40985;
                while (strSubstring.startsWith(".*") && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(2);
                }
            }
            str = strSubstring;
            i = 0;
        } else {
            i = 16;
            str = strM40985;
        }
        if (!this.f5471.isChecked()) {
            i |= 66;
        }
        try {
            C18415 c18415M42924 = C18415.m42924(i, str);
            m40987();
            m40981();
            abstractC24700.mo8146(new C11273(c18415M42924, c19023.isChecked()), strM40985);
        } catch (Exception e) {
            this.f5475.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17480
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo5599() {
        this.f5472.mo8145();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17480, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        for (C19023 c19023 : this.f5472.f79916) {
            if (c19023.getTag() != null) {
                interfaceC18752Edit.putBoolean((String) c19023.getTag(), c19023.isChecked());
            }
        }
        interfaceC18752Edit.apply();
    }
}
