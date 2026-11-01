package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15988 extends AbstractC0464 {
    @Override // l.AbstractC0464
    /* JADX INFO: renamed from: ۙ */
    public final void mo2318(View view, Object obj) {
        C1875.m6094(view, ((Boolean) obj).booleanValue());
    }

    @Override // l.AbstractC0464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2319(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
    }

    @Override // l.AbstractC0464
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2317(View view) {
        return Boolean.valueOf(C1875.m6101(view));
    }
}
