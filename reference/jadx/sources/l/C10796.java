package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C10796 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5577 f34258;

    public C10796(ActivityC5577 activityC5577) {
        this.f34258 = activityC5577;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 != EnumC9330.ON_CREATE || Build.VERSION.SDK_INT < 33) {
            return;
        }
        this.f34258.f19371.m19402(C22731.m51253((ActivityC5577) interfaceC11217));
    }
}
