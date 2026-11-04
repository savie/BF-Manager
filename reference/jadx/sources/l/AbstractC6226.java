package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8AH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6226 implements InterfaceC9996 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20396[] f21153;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C3242 mo17853();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C20396[] mo17854(int i);

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۤ */
    public final void mo12848(C0302 c0302) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20396[] m17855() {
        return this.f21153;
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10601(C0302 c0302) throws C18201 {
        c0302.m1882(EnumC18947.FOUR);
        long jM1885 = c0302.m1885();
        if (jM1885 <= 2147483647L) {
            int i = (int) jM1885;
            if (c0302.m1884() == 0) {
                this.f21153 = null;
                return;
            } else {
                if (i < 0) {
                    throw new C18201(String.format("Expected entriesRead >= 0, got: %d", Integer.valueOf(i)));
                }
                this.f21153 = mo17854(i);
                return;
            }
        }
        throw new C18201(String.format("%s %d > %d", "EntriesRead", Long.valueOf(jM1885), Integer.MAX_VALUE));
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۙ */
    public final void mo10598(C0302 c0302) throws EOFException {
        C20396[] c20396Arr;
        if (this.f21153 != null) {
            c0302.m1882(EnumC18947.FOUR);
            c0302.m1880(4);
            int i = 0;
            while (true) {
                c20396Arr = this.f21153;
                if (i >= c20396Arr.length) {
                    break;
                }
                c20396Arr[i] = mo17853();
                this.f21153[i].getClass();
                i++;
            }
            for (C20396 c20396 : c20396Arr) {
                c20396.mo10601(c0302);
            }
            for (C20396 c20397 : this.f21153) {
                c20397.mo10598(c0302);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21153);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC6226) {
            return Arrays.equals(this.f21153, ((AbstractC6226) obj).f21153);
        }
        return false;
    }
}
