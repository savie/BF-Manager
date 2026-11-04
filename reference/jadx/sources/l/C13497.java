package l;

import android.R;

/* JADX INFO: renamed from: l.۬֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13497 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f42916;

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܽ */
    public final void mo22946() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13497(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        super(viewOnClickListenerC11499, R.string.paste);
        this.f42916 = viewOnClickListenerC11499;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        C15243.m36586((Object) strM22914);
        if (!strM22914.startsWith("/")) {
            strM22914 = "/".concat(strM22914);
        }
        C15243.m36586((Object) strM22914);
        this.f42916.m28903(strM22914, (InterfaceC19479) null);
        m22951();
    }
}
