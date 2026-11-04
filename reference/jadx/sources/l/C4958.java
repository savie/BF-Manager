package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4958 implements InterfaceC17614 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f17256;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f17257;

    public C4958(C7941 c7941, View view) {
        this.f17256 = c7941;
        this.f17257 = view;
    }

    @Override // l.InterfaceC17614
    /* JADX INFO: renamed from: ۤ */
    public final void mo1859() {
        this.f17256.m21579();
    }

    @Override // l.InterfaceC17614
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23097 mo1861() {
        C7941 c7941 = this.f17256;
        if (!c7941.m21577()) {
            return null;
        }
        C16320 c16320 = c7941.f26374;
        return new C13601(this, c16320.f52982, c16320.f52991, c16320);
    }

    @Override // l.InterfaceC17614
    /* JADX INFO: renamed from: ۙ */
    public final View mo1858() {
        return this.f17257.findViewById(R.id.MT_Protector);
    }
}
