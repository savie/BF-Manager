package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2261 implements InterfaceC8601 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0850 f8099;

    public C2261(C0850 c0850) {
        this.f8099 = c0850;
    }

    @Override // l.InterfaceC8601
    public final boolean perform(View view, AbstractC6483 abstractC6483) {
        int i = ((C21312) view).f69354 + 1;
        C21312 c21312 = this.f8099.f3495;
        if (c21312.m47805()) {
            c21312.m47803(i, true);
        }
        return true;
    }
}
