package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܰ᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5J6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14816 extends C6702 implements InterfaceC12667 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f48449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35669(InterfaceC19775 interfaceC19775) {
        return ((C21530) interfaceC19775).f68790;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3630 m35670(CharSequence charSequence) {
        return ((C21530) charSequence).f68791;
    }

    @Override // l.InterfaceC17142
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo35672(Object obj) {
        C21530 c21530 = (C21530) obj;
        if (c21530 == null) {
            return -1;
        }
        return c21530.f68790;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ܳ */
    public final int mo5275(Object obj) {
        return ((C21530) obj).f68790;
    }

    public C14816(C8850 c8850) {
        super(c8850);
        this.f48449 = new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21530 m35671(String str) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f48449;
        C21530 c21530 = (C21530) concurrentMapC17249.get(str);
        if (c21530 != null) {
            return c21530;
        }
        C21530 c21531 = new C21530(((C23768) this.f22294.f74956).m53049(str));
        C21530 c21532 = (C21530) concurrentMapC17249.putIfAbsent(str, c21531);
        return c21532 == null ? c21531 : c21532;
    }

    @Override // l.InterfaceC13413
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo5271() {
        return new C4376(this.f48449.values());
    }

    @Override // l.InterfaceC13413
    public final int getItemCount() {
        return this.f48449.size();
    }
}
