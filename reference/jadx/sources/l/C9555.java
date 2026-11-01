package l;

import android.content.res.Resources;

/* JADX INFO: renamed from: l.ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9555 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C9555 f32254 = new C9555(1);

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        C13465.m32966(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
