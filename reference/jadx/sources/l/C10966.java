package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۤܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 48MG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34642;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f34643;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f34644;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34646;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f34647;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f34648 = new int[255];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21287 f34645 = new C21287(255);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27798(InterfaceC19502 interfaceC19502, boolean z) throws C2970, EOFException {
        boolean zMo10078;
        boolean zMo10079;
        this.f34644 = 0;
        this.f34647 = 0L;
        this.f34646 = 0;
        this.f34643 = 0;
        this.f34642 = 0;
        C21287 c21287 = this.f34645;
        c21287.m48496(27);
        try {
            zMo10078 = interfaceC19502.mo10078(z, 0, 27, c21287.m48497());
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo10078 = false;
        }
        if (zMo10078 && c21287.m48485() == 1332176723) {
            if (c21287.m48493() == 0) {
                this.f34644 = c21287.m48493();
                this.f34647 = c21287.m48498();
                c21287.m48505();
                c21287.m48505();
                c21287.m48505();
                int iM48493 = c21287.m48493();
                this.f34646 = iM48493;
                this.f34643 = iM48493 + 27;
                c21287.m48496(iM48493);
                try {
                    zMo10079 = interfaceC19502.mo10078(z, 0, this.f34646, c21287.m48497());
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo10079 = false;
                }
                if (zMo10079) {
                    for (int i = 0; i < this.f34646; i++) {
                        int iM48494 = c21287.m48493();
                        this.f34648[i] = iM48494;
                        this.f34642 += iM48494;
                    }
                    return true;
                }
            } else if (!z) {
                throw C2970.m9689("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27797(InterfaceC19502 interfaceC19502, long j) {
        boolean zMo10078;
        C20782.m47565(interfaceC19502.getPosition() == interfaceC19502.mo10072());
        C21287 c21287 = this.f34645;
        c21287.m48496(4);
        while (true) {
            if (j != -1 && interfaceC19502.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo10078 = interfaceC19502.mo10078(true, 0, 4, c21287.m48497());
            } catch (EOFException unused) {
                zMo10078 = false;
            }
            if (!zMo10078) {
                break;
            }
            c21287.m48510(0);
            if (c21287.m48485() == 1332176723) {
                interfaceC19502.mo10076();
                return true;
            }
            interfaceC19502.mo10073(1);
        }
        do {
            if (j != -1 && interfaceC19502.getPosition() >= j) {
                break;
            }
        } while (interfaceC19502.mo10074(1) != -1);
        return false;
    }
}
