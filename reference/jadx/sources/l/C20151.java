package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20151 implements InterfaceC6806, InterfaceC2822 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f65450;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f65451 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19706 f65452;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f65453;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23285 f65454;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23679 f65455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f65456;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7648 f65457;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65458;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f65459;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7512 f65460;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f65461;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12257 f65462;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f65463;

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7681(long j, C6901 c6901) {
        return j;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7685(long j, boolean z) {
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۚ */
    public final void mo7692() {
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۨ */
    public final long mo7694() {
        return -9223372036854775807L;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final C5645 mo7683(InterfaceC1411 interfaceC1411, long j, long j2, IOException iOException, int i) {
        C5645 c5645M51360;
        C19000 c19000 = ((C15918) interfaceC1411).f51586;
        c19000.getClass();
        C13863 c13863 = new C13863(j2, c19000.m43702());
        C17983.m41856(this.f65450);
        C4939 c4939 = new C4939(iOException, i);
        InterfaceC14113 interfaceC14113 = this.f65461;
        long jMo5495 = interfaceC14113.mo5495(c4939);
        boolean z = jMo5495 == -9223372036854775807L || i >= interfaceC14113.mo5494(1);
        if (this.f65453 && z) {
            C0303.m1852("Loading failed, treating as end-of-stream.", iOException);
            this.f65456 = true;
            c5645M51360 = C23285.f75523;
        } else if (jMo5495 != -9223372036854775807L) {
            c5645M51360 = C23285.m51360(jMo5495, false);
        } else {
            c5645M51360 = C23285.f75524;
        }
        C5645 c5645 = c5645M51360;
        this.f65460.m20017(c13863, 1, -1, this.f65457, 0, null, 0L, this.f65450, iOException, !c5645.m15534());
        return c5645;
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7686(InterfaceC1411 interfaceC1411, long j, long j2) {
        C15918 c15918 = (C15918) interfaceC1411;
        this.f65458 = (int) c15918.f51586.m43703();
        byte[] bArr = c15918.f51587;
        bArr.getClass();
        this.f65463 = bArr;
        this.f65456 = true;
        C19000 c19000 = c15918.f51586;
        c19000.getClass();
        C13863 c13863 = new C13863(j2, c19000.m43702());
        this.f65461.getClass();
        this.f65460.m20019(c13863, 1, -1, this.f65457, 0, null, 0L, this.f65450);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7687(InterfaceC1411 interfaceC1411, long j, long j2, int i) {
        C13863 c13863;
        C15918 c15918 = (C15918) interfaceC1411;
        C19000 c19000 = c15918.f51586;
        if (i == 0) {
            c13863 = new C13863(c15918.f51588);
        } else {
            c19000.getClass();
            c13863 = new C13863(j2, c19000.m43702());
        }
        this.f65460.m20016(c13863, 1, -1, this.f65457, 0, null, 0L, this.f65450, i);
    }

    @Override // l.InterfaceC2822
    /* JADX INFO: renamed from: ۙ */
    public final void mo7688(InterfaceC1411 interfaceC1411, long j, long j2, boolean z) {
        C19000 c19000 = ((C15918) interfaceC1411).f51586;
        c19000.getClass();
        C13863 c13863 = new C13863(j2, c19000.m43702());
        this.f65461.getClass();
        this.f65460.m20015(c13863, 1, -1, null, 0, null, 0L, this.f65450);
    }

    public C20151(C12257 c12257, InterfaceC20723 interfaceC20723, InterfaceC19706 interfaceC19706, C7648 c7648, long j, InterfaceC14113 interfaceC14113, C7512 c7512, boolean z, InterfaceExecutorC7762 interfaceExecutorC7762) {
        C23285 c23285;
        this.f65462 = c12257;
        this.f65459 = interfaceC20723;
        this.f65452 = interfaceC19706;
        this.f65457 = c7648;
        this.f65450 = j;
        this.f65461 = interfaceC14113;
        this.f65460 = c7512;
        this.f65453 = z;
        this.f65455 = new C23679(new C17216("", c7648));
        if (interfaceExecutorC7762 != null) {
            c23285 = new C23285(interfaceExecutorC7762);
        } else {
            c23285 = new C23285("SingleSampleMediaPeriod");
        }
        this.f65454 = c23285;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7689(InterfaceC3983 interfaceC3983, long j) {
        interfaceC3983.mo2529((InterfaceC6806) this);
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ֨ */
    public final C23679 mo7675() {
        return this.f65455;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7682(InterfaceC6558[] interfaceC6558Arr, boolean[] zArr, InterfaceC18739[] interfaceC18739Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC6558Arr.length; i++) {
            InterfaceC18739 interfaceC18739 = interfaceC18739Arr[i];
            ArrayList arrayList = this.f65451;
            if (interfaceC18739 != null && (interfaceC6558Arr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC18739);
                interfaceC18739Arr[i] = null;
            }
            if (interfaceC18739Arr[i] == null && interfaceC6558Arr[i] != null) {
                C20856 c20856 = new C20856(this);
                arrayList.add(c20856);
                interfaceC18739Arr[i] = c20856;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        if (this.f65456) {
            return false;
        }
        C23285 c23285 = this.f65454;
        if (c23285.m51365() || c23285.m51370()) {
            return false;
        }
        InterfaceC15785 interfaceC15785Mo4000 = this.f65459.mo4000();
        InterfaceC19706 interfaceC19706 = this.f65452;
        if (interfaceC19706 != null) {
            interfaceC15785Mo4000.mo11161(interfaceC19706);
        }
        c23285.m51368(new C15918(interfaceC15785Mo4000, this.f65462), this, this.f65461.mo5494(1));
        return true;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        return this.f65454.m51365();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        return (this.f65456 || this.f65454.m51365()) ? Long.MIN_VALUE : 0L;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        return this.f65456 ? Long.MIN_VALUE : 0L;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7680(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f65451;
            if (i >= arrayList.size()) {
                return j;
            }
            ((C20856) arrayList.get(i)).m46879();
            i++;
        }
    }
}
