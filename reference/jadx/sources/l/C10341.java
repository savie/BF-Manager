package l;

/* JADX INFO: renamed from: l.ۢ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10341 implements InterfaceC5417 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8850 f32948;

    public C10341(C8850 c8850) {
        this.f32948 = c8850;
    }

    @Override // l.InterfaceC5417
    public final Object apply(Object obj) {
        InterfaceC19073 interfaceC19073 = (InterfaceC19073) obj;
        C8850 c8850 = this.f32948;
        return new C4464(((C23768) c8850.f74956).m53049(interfaceC19073.getName()), c8850.m23715(interfaceC19073.getValue()));
    }
}
