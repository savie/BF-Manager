package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۨܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11842 extends AbstractDialogInterfaceOnClickListenerC4454 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16465 f39744;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16465 f39745;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5491 f39746;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f39747;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16465 f39748;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11842(AbstractC5491 abstractC5491, AbstractActivityC12483 abstractActivityC12483, String str, int i, C16465 c16465, C16465 c16466, C16465 c16467, AbstractActivityC12483 abstractActivityC12484) {
        super(i, abstractActivityC12483, str);
        this.f39746 = abstractC5491;
        this.f39748 = c16465;
        this.f39744 = c16466;
        this.f39745 = c16467;
        this.f39747 = abstractActivityC12484;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4454
    /* JADX INFO: renamed from: ۚ */
    public final void mo12431() {
        String strSubstring;
        String str;
        int i;
        String strM12432 = m12432();
        AbstractC5491 abstractC5491 = this.f39746;
        if (abstractC5491.mo15184(strM12432)) {
            m12434();
            m12427();
            return;
        }
        if (strM12432.isEmpty()) {
            abstractC5491.mo6919();
            m12427();
            return;
        }
        boolean zIsChecked = this.f39748.isChecked();
        C16465 c16465 = this.f39744;
        if (zIsChecked) {
            if (c16465.isChecked()) {
                strSubstring = strM12432;
            } else {
                strSubstring = strM12432;
                while (strSubstring.startsWith(".*") && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(2);
                }
            }
            str = strSubstring;
            i = 0;
        } else {
            i = 16;
            str = strM12432;
        }
        if (!this.f39745.isChecked()) {
            i |= 66;
        }
        try {
            C14690 c14690M35218 = C14690.m35218(i, str);
            m12434();
            m12427();
            abstractC5491.mo6920(new C2668(c14690M35218, c16465.isChecked()), strM12432);
        } catch (Exception e) {
            this.f39747.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4454
    /* JADX INFO: renamed from: ۖ */
    public final void mo12426() {
        this.f39746.mo6919();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4454, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        for (C16465 c16465 : this.f39746.f18889) {
            if (c16465.getTag() != null) {
                interfaceC17314Edit.putBoolean((String) c16465.getTag(), c16465.isChecked());
            }
        }
        interfaceC17314Edit.apply();
    }
}
