package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۚ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6011 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f20573;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20574;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12246(C18632 c18632) {
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C6011(int i, String str) {
        this.f20573 = i;
        this.f20574 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f20573);
        sb.append(",url=");
        return C8947.m23910(sb, this.f20574, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
