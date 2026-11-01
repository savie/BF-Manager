package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8655 extends AbstractC1805 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public long f29835;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final long f29836;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f29837;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final long f29838;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C19238 f29839;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29840;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C0282 f29841;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f29842;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean f29843;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f29844;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C7949 f29845;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public long f29846;

    public C8655(C18532 c18532) {
        super(c18532.f58997);
        this.f29838 = c18532.f58995;
        this.f29836 = c18532.f58993;
        this.f29843 = c18532.f58991;
        this.f29842 = c18532.f58992;
        this.f29844 = c18532.f58990;
        this.f29837 = c18532.f58996;
        this.f29840 = new ArrayList();
        this.f29841 = new C0282();
    }

    @Override // l.AbstractC15711, l.InterfaceC18095
    /* JADX INFO: renamed from: ܰ */
    public final void mo4111() throws C19238 {
        C19238 c19238 = this.f29839;
        if (c19238 != null) {
            throw c19238;
        }
        super.mo4111();
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6806 mo4105(C15274 c15274, InterfaceC15732 interfaceC15732, long j) {
        C17826 c17826 = new C17826(this.f6959.mo4105(c15274, interfaceC15732, j), this.f29843, this.f29835, this.f29846);
        this.f29840.add(c17826);
        return c17826;
    }

    @Override // l.InterfaceC18095
    /* JADX INFO: renamed from: ۙ */
    public final void mo4108(InterfaceC6806 interfaceC6806) {
        ArrayList arrayList = this.f29840;
        C2023.m6510(arrayList.remove(interfaceC6806));
        this.f6959.mo4108(((C17826) interfaceC6806).f56459);
        if (!arrayList.isEmpty() || this.f29842) {
            return;
        }
        C7949 c7949 = this.f29845;
        c7949.getClass();
        m22458(c7949.f31719);
    }

    @Override // l.AbstractC15711, l.AbstractC6537
    /* JADX INFO: renamed from: ۘ */
    public final void mo4104() {
        super.mo4104();
        this.f29839 = null;
        this.f29845 = null;
    }

    @Override // l.AbstractC1805
    /* JADX INFO: renamed from: ܰ */
    public final void mo4268(AbstractC16511 abstractC16511) {
        if (this.f29839 != null) {
            return;
        }
        m22458(abstractC16511);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22458(AbstractC16511 abstractC16511) {
        long j;
        long j2;
        long j3;
        C0282 c0282 = this.f29841;
        abstractC16511.m38827(0, c0282);
        long j4 = c0282.f1589;
        C7949 c7949 = this.f29845;
        long j5 = this.f29836;
        ArrayList arrayList = this.f29840;
        if (c7949 == null || arrayList.isEmpty() || this.f29842) {
            boolean z = this.f29844;
            long j6 = this.f29838;
            if (z) {
                long j7 = c0282.f1582;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.f29835 = j4 + j6;
            this.f29846 = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C17826 c17826 = (C17826) arrayList.get(i);
                long j8 = this.f29835;
                long j9 = this.f29846;
                c17826.f56456 = j8;
                c17826.f56455 = j9;
            }
            j2 = j;
            j3 = j6;
        } else {
            long j10 = this.f29835 - j4;
            long j11 = j5 != Long.MIN_VALUE ? this.f29846 - j4 : Long.MIN_VALUE;
            j3 = j10;
            j2 = j11;
        }
        try {
            C7949 c79410 = new C7949(abstractC16511, j3, j2, this.f29837);
            this.f29845 = c79410;
            m17759(c79410);
        } catch (C19238 e) {
            this.f29839 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C17826) arrayList.get(i2)).m41400(this.f29839);
            }
        }
    }
}
