package l;

/* JADX INFO: renamed from: l.ۗ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3671 implements InterfaceC2308 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f12636;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract C14769 mo11963(C8274 c8274, EnumC0816 enumC0816, AbstractC22664 abstractC22664, boolean z);

    public AbstractC3671(C14528 c14528) {
        this.f12636 = c14528;
    }

    @Override // l.InterfaceC2308
    /* JADX INFO: renamed from: ۙ */
    public final void mo7795(C8274 c8274) {
        c8274.f27219.addFirst(new C4088(this.f12636, c8274));
    }

    @Override // l.InterfaceC2308
    /* JADX INFO: renamed from: ۙ */
    public final void mo7796(C8274 c8274, EnumC0816 enumC0816, AbstractC22664 abstractC22664, boolean z) {
        if (c8274.m22330()) {
            return;
        }
        c8274.f27219.addAll(mo11963(c8274, enumC0816, abstractC22664, z));
    }
}
