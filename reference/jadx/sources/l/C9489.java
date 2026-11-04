package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9489 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f30730;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f30731;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f30732;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5038 f30733;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f30734;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f30735;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f30737;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f30738;

    public C9489(Main main, C12915 c12915, String str, DialogInterfaceC8327 dialogInterfaceC8327, C5038 c5038, CheckBox checkBox, View view, C1626 c1626, C23255 c23255) {
        this.f30734 = main;
        this.f30737 = c12915;
        this.f30736 = str;
        this.f30730 = dialogInterfaceC8327;
        this.f30733 = c5038;
        this.f30731 = checkBox;
        this.f30735 = view;
        this.f30738 = c1626;
        this.f30732 = c23255;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f30734, 250);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        List listM31982 = this.f30737.m31982();
        int i = 0;
        while (i < listM31982.size()) {
            final AbstractC22044 abstractC22044Mo8093 = ((InterfaceC2386) listM31982.get(i)).mo8093();
            final boolean z = i == 0;
            try {
                C20244.m46520(new C3549(abstractC22044Mo8093, this.f30736, new InterfaceC6908() { // from class: l.֨ܺ۫
                    @Override // l.InterfaceC6908
                    public final Object get() {
                        return z ? new C16227() : new C16227(abstractC22044Mo8093.getName());
                    }
                }));
                i++;
            } catch (IOException e) {
                if ("Bad magic".equals(e.getMessage())) {
                    if (listM31982.size() == 1) {
                        throw new C3090(R.string.MT_Protector);
                    }
                    throw new C3090(C21576.m49088(R.string.MT_Protector) + ": " + abstractC22044Mo8093.getName());
                }
                throw e;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f30730.dismiss();
        C5038 c5038 = this.f30733;
        boolean z = c5038.f17446;
        CheckBox checkBox = this.f30731;
        if (z != checkBox.isChecked()) {
            c5038.f17446 = checkBox.isChecked();
            c5038.m15262();
        }
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C8744.class);
        C12915 c12915 = this.f30737;
        c8458.m22728(c12915);
        c8458.m22723(c12915.m31982());
        c8458.m22719("password", this.f30736);
        c8458.m22720("removeSource", checkBox.isChecked());
        c8458.m22714();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f30735.setEnabled(true);
        if (exc instanceof C3090) {
            this.f30738.m5768(exc.getMessage());
            this.f30732.requestFocus();
        } else {
            this.f30734.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
