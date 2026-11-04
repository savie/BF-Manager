package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۚ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5868 extends C6702 implements InterfaceC25348 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f20141;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2139 m17094(Object obj) {
        return ((C5122) obj).f17838.f38159;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21530 m17095(InterfaceC4859 interfaceC4859) {
        return ((C11833) interfaceC4859).f38160;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11833 m17096(Object obj) {
        return ((C5122) obj).f17838;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2139 m17097(InterfaceC4859 interfaceC4859) {
        return ((C11833) interfaceC4859).f38159;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m17098(Object obj) {
        return ((C5122) obj).f17838.f38162;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ */
    public final int mo5275(Object obj) {
        return ((C11833) obj).f38162;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3630 m17099(InterfaceC4859 interfaceC4859) {
        return ((C11833) interfaceC4859).f38161;
    }

    public C5868(C8850 c8850) {
        super(c8850);
        this.f20141 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11833 m17100(InterfaceC4859 interfaceC4859) {
        String string = interfaceC4859.toString();
        ConcurrentMapC17249 concurrentMapC17249 = this.f20141;
        C11833 c11833 = (C11833) concurrentMapC17249.get(string);
        if (c11833 != null) {
            return c11833;
        }
        C8850 c8850 = this.f22294;
        C21530 c21530M35671 = c8850.f74939.m35671(interfaceC4859.mo6804());
        C3630 c3630M53049 = ((C23768) c8850.f74956).m53049(interfaceC4859.getName());
        C17054 c17054 = c8850.f74940;
        c17054.getClass();
        C11833 c11834 = new C11833(c21530M35671, c3630M53049, c17054.m40184(new C2271(interfaceC4859.mo6802(), interfaceC4859.mo6805())));
        C11833 c11835 = (C11833) concurrentMapC17249.putIfAbsent(string, c11834);
        return c11835 == null ? c11834 : c11835;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C15562(this.f20141.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f20141.size();
    }
}
