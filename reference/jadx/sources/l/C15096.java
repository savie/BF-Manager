package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15096 extends AbstractC16507 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21445 f49313;

    public C15096(C21445 c21445) {
        this.f49313 = c21445;
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo36175() {
        return this.f49313.f41044;
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo36170(int i, int i2) {
        return this.f49313.f41045[(i << 1) + i2];
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo36169(Object obj) {
        return this.f49313.m30508(obj);
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo36176(Object obj) {
        return this.f49313.m30511(obj);
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map mo36177() {
        return this.f49313;
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36174(Object obj, Object obj2) {
        this.f49313.put(obj, obj2);
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36173(int i) {
        this.f49313.m30509(i);
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36172() {
        this.f49313.clear();
    }

    @Override // l.AbstractC16507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo36171(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f49313.f41045;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
