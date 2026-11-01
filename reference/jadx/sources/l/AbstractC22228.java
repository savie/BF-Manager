package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8AH */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22228 implements InterfaceC18659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2471[] f72689;

    /* JADX INFO: renamed from: ۙ */
    public abstract C11645 mo14667();

    /* JADX INFO: renamed from: ۙ */
    public abstract C2471[] mo14668(int i);

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۨ */
    public final void mo7579(C15132 c15132) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2471[] m49353() {
        return this.f72689;
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ܰ */
    public final void mo7580(C15132 c15132) throws C22893 {
        c15132.m36284(EnumC17953.FOUR);
        long jM36287 = c15132.m36287();
        if (jM36287 <= 2147483647L) {
            int i = (int) jM36287;
            if (c15132.m36288() == 0) {
                this.f72689 = null;
                return;
            } else {
                if (i < 0) {
                    throw new C22893(String.format("Expected entriesRead >= 0, got: %d", Integer.valueOf(i)));
                }
                this.f72689 = mo14668(i);
                return;
            }
        }
        throw new C22893(String.format("%s %d > %d", "EntriesRead", Long.valueOf(jM36287), Integer.MAX_VALUE));
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۙ */
    public final void mo7578(C15132 c15132) throws EOFException {
        C2471[] c2471Arr;
        if (this.f72689 != null) {
            c15132.m36284(EnumC17953.FOUR);
            c15132.m36283(4);
            int i = 0;
            while (true) {
                c2471Arr = this.f72689;
                if (i >= c2471Arr.length) {
                    break;
                }
                c2471Arr[i] = mo14667();
                this.f72689[i].getClass();
                i++;
            }
            for (C2471 c2471 : c2471Arr) {
                c2471.mo7580(c15132);
            }
            for (C2471 c2472 : this.f72689) {
                c2472.mo7578(c15132);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f72689);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC22228) {
            return Arrays.equals(this.f72689, ((AbstractC22228) obj).f72689);
        }
        return false;
    }
}
