package l;

import android.R;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩵ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20482 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f65618;

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܽ */
    public final void mo22946() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20482(Main main, C8614 c8614) {
        super(main, R.string.paste);
        this.f65618 = c8614;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (!strM22914.startsWith("/")) {
            strM22914 = "/".concat(strM22914);
        }
        boolean zEndsWith = strM22914.endsWith("/");
        C8614 c8614 = this.f65618;
        if (!zEndsWith && c8614.m23213().mo10177(strM22914)) {
            c8614.m23230(C11293.m28558(strM22914));
            strM22914 = C11293.m28556(strM22914);
        }
        c8614.m23226(strM22914, false);
        m22951();
    }
}
