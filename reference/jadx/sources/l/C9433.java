package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۢ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C9433 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f31936;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f31937;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC7957 f31938;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9433(C20409 c20409, ActivityC11632 activityC11632, ActivityC11632 activityC11633, DialogInterfaceC7957 dialogInterfaceC7957) {
        super(activityC11632, -1);
        this.f31936 = c20409;
        this.f31937 = activityC11633;
        this.f31938 = dialogInterfaceC7957;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        C20409 c20409 = this.f31936;
        Bundle bundle = c20409.f16884;
        if (strTrim.isEmpty()) {
            strTrim = null;
        }
        if (strTrim == null) {
            bundle.remove("remark");
        } else {
            bundle.putString("remark", strTrim);
        }
        c20409.mo13341("remark");
        m40364();
        c20409.f66145 = null;
        C6919 c6919 = c20409.f16887;
        if (c6919 != null) {
            c6919.m18544(c20409.m46149());
        }
        this.f31937.m29018();
        DialogInterfaceC7957 dialogInterfaceC7957 = this.f31938;
        if (dialogInterfaceC7957 != null) {
            dialogInterfaceC7957.setTitle(c20409.m46151());
            dialogInterfaceC7957.show();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo24190() {
        DialogInterfaceC7957 dialogInterfaceC7957 = this.f31938;
        if (dialogInterfaceC7957 != null) {
            dialogInterfaceC7957.show();
        }
    }
}
