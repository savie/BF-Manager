package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class C13788 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1086 f45517;

    public C13788(ActivityC1086 activityC1086) {
        this.f45517 = activityC1086;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 != EnumC1651.ON_CREATE || Build.VERSION.SDK_INT < 33) {
            return;
        }
        this.f45517.f4952.m34907(C11671.m29118((ActivityC1086) interfaceC1423));
    }
}
