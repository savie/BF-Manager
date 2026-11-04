package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F8HT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8358 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27419;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27420;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f27421;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f27422;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024[] f27423;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f27424 = -9223372036854775807L;

    public C8358(List list) {
        this.f27422 = list;
        this.f27423 = new InterfaceC22024[list.size()];
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f27421 = false;
        this.f27424 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        int i = 0;
        while (true) {
            InterfaceC22024[] interfaceC22024Arr = this.f27423;
            if (i >= interfaceC22024Arr.length) {
                return;
            }
            C14081 c14081 = (C14081) this.f27422.get(i);
            c10857.m27594();
            InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 3);
            C20124 c20124 = new C20124();
            c20124.m46309(c10857.m27596());
            c20124.m46327("video/mp2t");
            c20124.m46315("application/dvbsubs");
            c20124.m46301(Collections.singletonList(c14081.f44584));
            c20124.m46321(c14081.f44585);
            interfaceC22024Mo16658.mo14384(c20124.m46295());
            interfaceC22024Arr[i] = interfaceC22024Mo16658;
            i++;
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f27421 = true;
        this.f27424 = j;
        this.f27420 = 0;
        this.f27419 = 2;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
        if (this.f27421) {
            C20782.m47568(this.f27424 != -9223372036854775807L);
            for (InterfaceC22024 interfaceC22024 : this.f27423) {
                interfaceC22024.mo14383(this.f27424, 1, this.f27420, 0, null);
            }
            this.f27421 = false;
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) {
        boolean z;
        boolean z2;
        if (this.f27421) {
            if (this.f27419 == 2) {
                if (c21287.m48486() == 0) {
                    z2 = false;
                } else {
                    if (c21287.m48493() != 32) {
                        this.f27421 = false;
                    }
                    this.f27419--;
                    z2 = this.f27421;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f27419 == 1) {
                if (c21287.m48486() == 0) {
                    z = false;
                } else {
                    if (c21287.m48493() != 0) {
                        this.f27421 = false;
                    }
                    this.f27419--;
                    z = this.f27421;
                }
                if (!z) {
                    return;
                }
            }
            int iM48516 = c21287.m48516();
            int iM48486 = c21287.m48486();
            for (InterfaceC22024 interfaceC22024 : this.f27423) {
                c21287.m48510(iM48516);
                interfaceC22024.mo14381(iM48486, c21287);
            }
            this.f27420 += iM48486;
        }
    }
}
