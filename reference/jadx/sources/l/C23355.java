package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes.dex */
public final class C23355 implements InterfaceC2833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC12166 f75637;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f75638;

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo8155(String str) {
    }

    public C23355(ViewOnClickListenerC12166 viewOnClickListenerC12166, TextView textView) {
        this.f75637 = viewOnClickListenerC12166;
        this.f75638 = textView;
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8153(String str) {
        this.f75637.f39123.m10559(str);
    }

    @Override // l.InterfaceC2833
    /* JADX INFO: renamed from: ۙ */
    public final void mo8154(EnumC8799 enumC8799) {
        this.f75638.setVisibility(enumC8799.m23629() ? 4 : 0);
    }
}
