package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۡۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 963I */
/* JADX INFO: loaded from: classes4.dex */
public final class C9092 extends C6702 implements InterfaceC15650 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f29533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21530 m24230(InterfaceC8304 interfaceC8304) {
        return ((C2381) interfaceC8304).f7661;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3630 m24231(InterfaceC8304 interfaceC8304) {
        return ((C2381) interfaceC8304).f7660;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m24232(Object obj) {
        return ((C9838) obj).f31668.f7662;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ */
    public final int mo5275(Object obj) {
        return ((C2381) obj).f7662;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21530 m24233(InterfaceC8304 interfaceC8304) {
        return ((C2381) interfaceC8304).f7663;
    }

    public C9092(C8850 c8850) {
        super(c8850);
        this.f29533 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2381 m24234(InterfaceC8304 interfaceC8304) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f29533;
        C2381 c2381 = (C2381) concurrentMapC17249.get(interfaceC8304);
        if (c2381 != null) {
            return c2381;
        }
        C8850 c8850 = this.f22294;
        C2381 c2382 = new C2381(c8850.f74939.m35671(interfaceC8304.mo4500()), ((C23768) c8850.f74956).m53049(interfaceC8304.getName()), c8850.f74939.m35671(interfaceC8304.getType()));
        C2381 c2383 = (C2381) concurrentMapC17249.putIfAbsent(c2382, c2382);
        return c2383 == null ? c2382 : c2383;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C0890(this.f29533.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f29533.size();
    }
}
