package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17054 extends C6702 implements InterfaceC23856 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f55714;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20784 m40181(InterfaceC13524 interfaceC13524) {
        return ((C2139) interfaceC13524).f7068;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3630 m40182(InterfaceC13524 interfaceC13524) {
        return ((C2139) interfaceC13524).f7065;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ */
    public final int mo5275(Object obj) {
        return ((C2139) obj).f7066;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21530 m40183(InterfaceC13524 interfaceC13524) {
        return ((C2139) interfaceC13524).f7067;
    }

    public C17054(C8850 c8850) {
        super(c8850);
        this.f55714 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2139 m40184(InterfaceC13524 interfaceC13524) {
        String string = interfaceC13524.toString();
        ConcurrentMapC17249 concurrentMapC17249 = this.f55714;
        C2139 c2139 = (C2139) concurrentMapC17249.get(string);
        if (c2139 != null) {
            return c2139;
        }
        C8850 c8850 = this.f22294;
        C23768 c23768 = (C23768) c8850.f74956;
        List<CharSequence> listMo7393 = interfaceC13524.mo7393();
        String strMo7392 = interfaceC13524.mo7392();
        InterfaceC6163 interfaceC6163 = C4244.f15461;
        StringBuilder sb = new StringBuilder(listMo7393.size() + 1);
        sb.append(strMo7392.length() > 1 ? 'L' : strMo7392.charAt(0));
        for (CharSequence charSequence : listMo7393) {
            sb.append(charSequence.length() > 1 ? 'L' : charSequence.charAt(0));
        }
        C2139 c21310 = new C2139(c23768.m53049(sb.toString()), ((C24514) c8850.f74950).m54774(interfaceC13524.mo7393()), c8850.f74939.m35671(interfaceC13524.mo7392()));
        C2139 c21311 = (C2139) concurrentMapC17249.putIfAbsent(string, c21310);
        return c21311 == null ? c21310 : c21311;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C25260(this.f55714.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f55714.size();
    }
}
