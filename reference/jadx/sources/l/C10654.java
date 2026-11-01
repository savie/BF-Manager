package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10654 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22418 f36336;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f36337;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f36338;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10654(C22418 c22418, Main main, DialogInterfaceC19356 dialogInterfaceC19356, View view) {
        super(main, -1);
        this.f36336 = c22418;
        this.f36337 = dialogInterfaceC19356;
        this.f36338 = view;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            m40364();
            return;
        }
        try {
            int i = Integer.parseInt(strM40352);
            if (i < 0) {
                throw new NumberFormatException();
            }
            m40364();
            while (C22418.f73148.size() > i) {
                C22418.f73148.remove(C22418.f73148.size() - 1);
            }
            C22418.m49720();
            this.f36337.dismiss();
            boolean zIsEmpty = C22418.f73148.isEmpty();
            C22418 c22418 = this.f36336;
            if (zIsEmpty) {
                c22418.f73162.setEnabled(false);
            } else {
                c22418.m49705(this.f36338);
            }
        } catch (NumberFormatException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
