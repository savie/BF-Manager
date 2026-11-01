package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2769 implements InterfaceC7150 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f10597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f10598;

    public C2769(C20409 c20409, View view) {
        this.f10597 = c20409;
        this.f10598 = view;
    }

    @Override // l.InterfaceC7150
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21615 mo8442() {
        C20409 c20409 = this.f10597;
        if (!c20409.m46085()) {
            return null;
        }
        C14393 c14393 = c20409.f66151;
        return new C11943(this, c14393.f47155, c14393.f47153, c14393);
    }

    @Override // l.InterfaceC7150
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo8441() {
        return this.f10598.findViewById(R.id.MT_Protector);
    }
}
