package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C22574 extends AbstractC12305 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final long f72992;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C10639 f72993;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f72994;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f72995;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean f72996;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C11328 f72997;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f72998;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f72999;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public long f73000;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73001;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C21828 f73002;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final long f73003;

    public C22574(C4674 c4674) {
        super(c4674.f16499);
        this.f72992 = c4674.f16496;
        this.f73003 = c4674.f16500;
        this.f72996 = c4674.f16502;
        this.f72995 = c4674.f16495;
        this.f72994 = c4674.f16498;
        this.f72999 = c4674.f16501;
        this.f73001 = new ArrayList();
        this.f72997 = new C11328();
    }

    @Override // l.AbstractC5420, l.InterfaceC13622
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16154() throws C10639 {
        C10639 c10639 = this.f72993;
        if (c10639 != null) {
            throw c10639;
        }
        super.mo16154();
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9147 mo33371(C8402 c8402, InterfaceC13314 interfaceC13314, long j) {
        C13870 c13870 = new C13870(this.f39569.mo33371(c8402, interfaceC13314, j), this.f72996, this.f72998, this.f73000);
        this.f73001.add(c13870);
        return c13870;
    }

    @Override // l.InterfaceC13622
    /* JADX INFO: renamed from: ۙ */
    public final void mo33372(InterfaceC9147 interfaceC9147) {
        ArrayList arrayList = this.f73001;
        C20782.m47568(arrayList.remove(interfaceC9147));
        this.f39569.mo33372(((C13870) interfaceC9147).f43993);
        if (!arrayList.isEmpty() || this.f72995) {
            return;
        }
        C21828 c21828 = this.f73002;
        c21828.getClass();
        m50896(c21828.f21004);
    }

    @Override // l.AbstractC5420, l.AbstractC9395
    /* JADX INFO: renamed from: ֫ */
    public final void mo16145() {
        super.mo16145();
        this.f72993 = null;
        this.f73002 = null;
    }

    @Override // l.AbstractC12305
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30720(AbstractC24755 abstractC24755) {
        if (this.f72993 != null) {
            return;
        }
        m50896(abstractC24755);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m50896(AbstractC24755 abstractC24755) {
        long j;
        long j2;
        long j3;
        C11328 c11328 = this.f72997;
        abstractC24755.m55263(0, c11328);
        long j4 = c11328.f35693;
        C21828 c21828 = this.f73002;
        long j5 = this.f73003;
        ArrayList arrayList = this.f73001;
        if (c21828 == null || arrayList.isEmpty() || this.f72995) {
            boolean z = this.f72994;
            long j6 = this.f72992;
            if (z) {
                long j7 = c11328.f35686;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.f72998 = j4 + j6;
            this.f73000 = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C13870 c13870 = (C13870) arrayList.get(i);
                long j8 = this.f72998;
                long j9 = this.f73000;
                c13870.f43995 = j8;
                c13870.f43997 = j9;
            }
            j2 = j;
            j3 = j6;
        } else {
            long j10 = this.f72998 - j4;
            long j11 = j5 != Long.MIN_VALUE ? this.f73000 - j4 : Long.MIN_VALUE;
            j3 = j10;
            j2 = j11;
        }
        try {
            C21828 c21829 = new C21828(abstractC24755, j3, j2, this.f72999);
            this.f73002 = c21829;
            m24728(c21829);
        } catch (C10639 e) {
            this.f72993 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C13870) arrayList.get(i2)).m33810(this.f72993);
            }
        }
    }
}
