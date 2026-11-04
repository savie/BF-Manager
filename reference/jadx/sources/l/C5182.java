package l;

import android.content.res.Resources;

/* JADX INFO: renamed from: l.ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5182 extends AbstractC13006 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C5182 f18087 = new C5182(1);

    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        C15243.m36590(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
