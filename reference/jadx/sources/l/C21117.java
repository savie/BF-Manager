package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21117 implements InterfaceC16793 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0234 f67460;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f67461;

    public C21117(ViewOnClickListenerC0234 viewOnClickListenerC0234, C10745 c10745) {
        this.f67460 = viewOnClickListenerC0234;
        this.f67461 = c10745;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13593() {
        return this.f67461.m27399();
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۤ */
    public final ActivityC0848 mo13594() {
        return this.f67460.f1492;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13596(int i) {
        this.f67461.m27403(i);
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ */
    public final void mo13592(int i, int i2) {
        ViewOnClickListenerC0234 viewOnClickListenerC0234 = this.f67460;
        viewOnClickListenerC0234.f1492.m40397(R.string.MT_Protector, viewOnClickListenerC0234.f1492.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13595() {
        this.f67461.m27405();
    }
}
