package l;

/* JADX INFO: renamed from: l.ۨܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public class C12416 extends C14653 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4213 f39916;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12416(C4213 c4213) {
        super(c4213.f15392);
        this.f39916 = c4213;
        this.f47942 = c4213.firstEntry();
    }

    @Override // l.C14653
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo30887() {
        C11670 c11670M29343 = this.f47939.m29343();
        this.f47939 = c11670M29343;
        C4213 c4213 = this.f39916;
        if (c4213.f15394 || c11670M29343 == null || Integer.compare(c11670M29343.f3592, c4213.f15395) >= 0) {
            return;
        }
        this.f47939 = null;
    }

    @Override // l.C14653
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo30886() {
        C11670 c11670M29344 = this.f47942.m29344();
        this.f47942 = c11670M29344;
        C4213 c4213 = this.f39916;
        if (c4213.f15393 || c11670M29344 == null || Integer.compare(c11670M29344.f3592, c4213.f15396) < 0) {
            return;
        }
        this.f47942 = null;
    }
}
