package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16250 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f52403;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3146(C2398 c2398) {
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C16250(int i, String str) {
        this.f52402 = i;
        this.f52403 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f52402);
        sb.append(",url=");
        return C22697.m50267(sb, this.f52403, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
