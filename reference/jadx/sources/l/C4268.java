package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4268 implements InterfaceC16793 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21422 f15513;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f15514;

    public C4268(ViewOnClickListenerC21422 viewOnClickListenerC21422, C10745 c10745) {
        this.f15513 = viewOnClickListenerC21422;
        this.f15514 = c10745;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13593() {
        return this.f15514.m27399();
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 mo13594() {
        return this.f15513.f68232;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo13596(int i) {
        this.f15514.m27403(i);
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13592(int i, int i2) {
        ViewOnClickListenerC21422 viewOnClickListenerC21422 = this.f15513;
        viewOnClickListenerC21422.f68232.m40397(R.string.MT_Protector, viewOnClickListenerC21422.f68232.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        if (i2 > 0) {
            ((C22761) new C16196(viewOnClickListenerC21422.f68232).m38422(C22761.class)).m51324();
        }
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo13595() {
        this.f15514.m27405();
    }
}
