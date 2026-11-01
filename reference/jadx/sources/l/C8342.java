package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.۠ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48MG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8342 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f28880;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28882;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f28883;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f28884;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f28885;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f28881 = new int[255];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2460 f28886 = new C2460(255);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21791(InterfaceC7222 interfaceC7222, boolean z) throws C22861, EOFException {
        boolean zMo19219;
        boolean zMo192110;
        this.f28880 = 0;
        this.f28885 = 0L;
        this.f28883 = 0;
        this.f28884 = 0;
        this.f28882 = 0;
        C2460 c2460 = this.f28886;
        c2460.m7517(27);
        try {
            zMo19219 = interfaceC7222.mo19219(z, 0, 27, c2460.m7518());
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo19219 = false;
        }
        if (zMo19219 && c2460.m7532() == 1332176723) {
            if (c2460.m7516() == 0) {
                this.f28880 = c2460.m7516();
                this.f28885 = c2460.m7512();
                c2460.m7524();
                c2460.m7524();
                c2460.m7524();
                int iM7516 = c2460.m7516();
                this.f28883 = iM7516;
                this.f28884 = iM7516 + 27;
                c2460.m7517(iM7516);
                try {
                    zMo192110 = interfaceC7222.mo19219(z, 0, this.f28883, c2460.m7518());
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo192110 = false;
                }
                if (zMo192110) {
                    for (int i = 0; i < this.f28883; i++) {
                        int iM7517 = c2460.m7516();
                        this.f28881[i] = iM7517;
                        this.f28882 += iM7517;
                    }
                    return true;
                }
            } else if (!z) {
                throw C22861.m50611("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21790(InterfaceC7222 interfaceC7222, long j) {
        boolean zMo19219;
        C2023.m6507(interfaceC7222.getPosition() == interfaceC7222.mo19213());
        C2460 c2460 = this.f28886;
        c2460.m7517(4);
        while (true) {
            if (j != -1 && interfaceC7222.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo19219 = interfaceC7222.mo19219(true, 0, 4, c2460.m7518());
            } catch (EOFException unused) {
                zMo19219 = false;
            }
            if (!zMo19219) {
                break;
            }
            c2460.m7510(0);
            if (c2460.m7532() == 1332176723) {
                interfaceC7222.mo19217();
                return true;
            }
            interfaceC7222.mo19214(1);
        }
        do {
            if (j != -1 && interfaceC7222.getPosition() >= j) {
                break;
            }
        } while (interfaceC7222.mo19215(1) != -1);
        return false;
    }
}
