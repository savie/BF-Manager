package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۗ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3654 implements InterfaceC2833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24538 f12499;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f12500;

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo8155(String str) {
    }

    public C3654(C24538 c24538, TextView textView) {
        this.f12499 = c24538;
        this.f12500 = textView;
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8153(String str) {
        this.f12499.f79564.m47601(str);
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8154(EnumC8799 enumC8799) {
        this.f12500.setVisibility(enumC8799.m23629() ? 4 : 0);
    }
}
