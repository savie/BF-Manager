package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۡۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C9126 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC12551 f29620;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f29621;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f29622;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9126(C7941 c7941, ActivityC18143 activityC18143, ActivityC18143 activityC18144, DialogInterfaceC12551 dialogInterfaceC12551) {
        super(activityC18143, -1);
        this.f29621 = c7941;
        this.f29622 = activityC18144;
        this.f29620 = dialogInterfaceC12551;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        C7941 c7941 = this.f29621;
        Bundle bundle = c7941.f23990;
        if (strTrim.isEmpty()) {
            strTrim = null;
        }
        if (strTrim == null) {
            bundle.remove("remark");
        } else {
            bundle.putString("remark", strTrim);
        }
        c7941.mo19931("remark");
        m22951();
        c7941.f26376 = null;
        C11713 c11713 = c7941.f23993;
        if (c11713 != null) {
            c11713.m29394(c7941.m21637());
        }
        this.f29622.m42302();
        DialogInterfaceC12551 dialogInterfaceC12551 = this.f29620;
        if (dialogInterfaceC12551 != null) {
            dialogInterfaceC12551.setTitle(c7941.m21639());
            dialogInterfaceC12551.show();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܺ */
    public final void mo22944() {
        DialogInterfaceC12551 dialogInterfaceC12551 = this.f29620;
        if (dialogInterfaceC12551 != null) {
            dialogInterfaceC12551.show();
        }
    }
}
