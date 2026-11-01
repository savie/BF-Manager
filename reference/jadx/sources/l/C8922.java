package l;

import androidx.window.sidecar.SidecarDisplayFeature;

/* JADX INFO: renamed from: l.ۡܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8922 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C8922 f30603 = new C8922(1);

    @Override // l.InterfaceC15456
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        C13465.m32966(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
