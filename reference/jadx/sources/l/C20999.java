package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20999 extends AbstractC0116 {
    @Override // l.AbstractC0116
    /* JADX INFO: renamed from: ۙ */
    public final void mo1247(View view, Object obj) {
        C8320.m22415(view, ((Boolean) obj).booleanValue());
    }

    @Override // l.AbstractC0116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1248(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
    }

    @Override // l.AbstractC0116
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1246(View view) {
        return Boolean.valueOf(C8320.m22418(view));
    }
}
