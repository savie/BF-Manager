package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1865 implements InterfaceC9147, InterfaceC14805 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15617 f6278;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f6279;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f6280;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6281;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3356 f6282;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15648 f6283;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f6284 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f6285;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1382 f6286;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC4639 f6287;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f6288;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f6289;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f6290;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C25368 f6291;

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo6402(long j, C9221 c9221) {
        return j;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6405(long j, boolean z) {
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long mo6410() {
        return -9223372036854775807L;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo6412() {
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6054(long j) {
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21519 mo6404(InterfaceC0636 interfaceC0636, long j, long j2, IOException iOException, int i) {
        C21519 c21519M5076;
        C7467 c7467 = ((C5594) interfaceC0636).f19418;
        c7467.getClass();
        C14368 c14368 = new C14368(j2, c7467.m20511());
        C7116.m19506(this.f6289);
        C24503 c24503 = new C24503(iOException, i);
        InterfaceC4365 interfaceC4365 = this.f6290;
        long jMo13868 = interfaceC4365.mo13868(c24503);
        boolean z = jMo13868 == -9223372036854775807L || i >= interfaceC4365.mo13867(1);
        if (this.f6281 && z) {
            C1896.m6514("Loading failed, treating as end-of-stream.", iOException);
            this.f6279 = true;
            c21519M5076 = C1382.f4932;
        } else if (jMo13868 != -9223372036854775807L) {
            c21519M5076 = C1382.m5076(jMo13868, false);
        } else {
            c21519M5076 = C1382.f4931;
        }
        C21519 c21519 = c21519M5076;
        this.f6278.m37366(c14368, 1, -1, this.f6283, 0, null, 0L, this.f6289, iOException, !c21519.m48926());
        return c21519;
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6406(InterfaceC0636 interfaceC0636, long j, long j2) {
        C5594 c5594 = (C5594) interfaceC0636;
        this.f6280 = (int) c5594.f19418.m20513();
        byte[] bArr = c5594.f19419;
        bArr.getClass();
        this.f6285 = bArr;
        this.f6279 = true;
        C7467 c7467 = c5594.f19418;
        c7467.getClass();
        C14368 c14368 = new C14368(j2, c7467.m20511());
        this.f6290.getClass();
        this.f6278.m37367(c14368, 1, -1, this.f6283, 0, null, 0L, this.f6289);
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6407(InterfaceC0636 interfaceC0636, long j, long j2, int i) {
        C14368 c14368;
        C5594 c5594 = (C5594) interfaceC0636;
        C7467 c7467 = c5594.f19418;
        if (i == 0) {
            c14368 = new C14368(c5594.f19420);
        } else {
            c7467.getClass();
            c14368 = new C14368(j2, c7467.m20511());
        }
        this.f6278.m37365(c14368, 1, -1, this.f6283, 0, null, 0L, this.f6289, i);
    }

    @Override // l.InterfaceC14805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6408(InterfaceC0636 interfaceC0636, long j, long j2, boolean z) {
        C7467 c7467 = ((C5594) interfaceC0636).f19418;
        c7467.getClass();
        C14368 c14368 = new C14368(j2, c7467.m20511());
        this.f6290.getClass();
        this.f6278.m37364(c14368, 1, -1, null, 0, null, 0L, this.f6289);
    }

    public C1865(C25368 c25368, InterfaceC15670 interfaceC15670, InterfaceC4639 interfaceC4639, C15648 c15648, long j, InterfaceC4365 interfaceC4365, C15617 c15617, boolean z, InterfaceExecutorC22879 interfaceExecutorC22879) {
        C1382 c1382;
        this.f6291 = c25368;
        this.f6288 = interfaceC15670;
        this.f6287 = interfaceC4639;
        this.f6283 = c15648;
        this.f6289 = j;
        this.f6290 = interfaceC4365;
        this.f6278 = c15617;
        this.f6281 = z;
        this.f6282 = new C3356(new C16549("", c15648));
        if (interfaceExecutorC22879 != null) {
            c1382 = new C1382(interfaceExecutorC22879);
        } else {
            c1382 = new C1382("SingleSampleMediaPeriod");
        }
        this.f6286 = c1382;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6409(InterfaceC0945 interfaceC0945, long j) {
        interfaceC0945.mo3768((InterfaceC9147) this);
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3356 mo6411() {
        return this.f6282;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo6403(InterfaceC1470[] interfaceC1470Arr, boolean[] zArr, InterfaceC4848[] interfaceC4848Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC1470Arr.length; i++) {
            InterfaceC4848 interfaceC4848 = interfaceC4848Arr[i];
            ArrayList arrayList = this.f6284;
            if (interfaceC4848 != null && (interfaceC1470Arr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC4848);
                interfaceC4848Arr[i] = null;
            }
            if (interfaceC4848Arr[i] == null && interfaceC1470Arr[i] != null) {
                C13051 c13051 = new C13051(this);
                arrayList.add(c13051);
                interfaceC4848Arr[i] = c13051;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6051(C20191 c20191) {
        if (this.f6279) {
            return false;
        }
        C1382 c1382 = this.f6286;
        if (c1382.m5086() || c1382.m5084()) {
            return false;
        }
        InterfaceC13433 interfaceC13433Mo3996 = this.f6288.mo3996();
        InterfaceC4639 interfaceC4639 = this.f6287;
        if (interfaceC4639 != null) {
            interfaceC13433Mo3996.mo10894(interfaceC4639);
        }
        c1382.m5082(new C5594(interfaceC13433Mo3996, this.f6291), this, this.f6290.mo13867(1));
        return true;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6050() {
        return this.f6286.m5086();
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final long mo6053() {
        return (this.f6279 || this.f6286.m5086()) ? Long.MIN_VALUE : 0L;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۚ */
    public final long mo6052() {
        return this.f6279 ? Long.MIN_VALUE : 0L;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo6401(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6284;
            if (i >= arrayList.size()) {
                return j;
            }
            ((C13051) arrayList.get(i)).m32512();
            i++;
        }
    }
}
