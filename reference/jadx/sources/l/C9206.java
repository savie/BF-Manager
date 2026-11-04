package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C9206 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f30015;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f30016;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f30017;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9206(C13132 c13132, Main main, DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        super(main, -1);
        this.f30016 = c13132;
        this.f30017 = dialogInterfaceC8327;
        this.f30015 = view;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.isEmpty()) {
            m22951();
            return;
        }
        try {
            int i = Integer.parseInt(strM22914);
            if (i < 0) {
                throw new NumberFormatException();
            }
            m22951();
            while (C13132.f41990.size() > i) {
                C13132.f41990.remove(C13132.f41990.size() - 1);
            }
            C13132.m32638();
            this.f30017.dismiss();
            boolean zIsEmpty = C13132.f41990.isEmpty();
            C13132 c13132 = this.f30016;
            if (zIsEmpty) {
                c13132.f41994.setEnabled(false);
            } else {
                c13132.m32615(this.f30015);
            }
        } catch (NumberFormatException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
