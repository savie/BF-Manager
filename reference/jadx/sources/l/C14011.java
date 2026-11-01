package l;

/* JADX INFO: renamed from: l.ܰᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14011 extends AbstractC23909 implements InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11894 f46041;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14011(C11894 c11894, int i) {
        super(i);
        this.f46041 = c11894;
    }

    @Override // l.AbstractC11209
    /* JADX INFO: renamed from: ܰ */
    public final Object mo28153(int i) {
        C11894 c11894 = this.f46041;
        return c11894.f39906.get(c11894.f39905 + i);
    }

    @Override // l.AbstractC23909
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33877(int i, Object obj) {
        this.f46041.add(i, obj);
    }

    @Override // l.AbstractC23909
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo33878(int i, Object obj) {
        this.f46041.set(i, obj);
    }

    @Override // l.AbstractC11209
    /* JADX INFO: renamed from: ۨ */
    public final void mo28152(int i) {
        this.f46041.remove(i);
    }

    @Override // l.AbstractC11209
    /* JADX INFO: renamed from: ۙ */
    public final int mo28151() {
        C11894 c11894 = this.f46041;
        return c11894.f39904 - c11894.f39905;
    }
}
