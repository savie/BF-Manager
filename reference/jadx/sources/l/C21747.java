package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.᩸ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21747 extends AbstractC21041 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15398 f70485;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23451 f70486;

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۙ */
    public final void mo23376(boolean z) {
        super.mo23376(z);
        if (z) {
            this.f70486 = null;
            this.f70485 = null;
        }
    }

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۙ */
    public final long mo23375(C2460 c2460) {
        if (c2460.m7518()[0] != -1) {
            return -1L;
        }
        int i = (c2460.m7518()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c2460.m7535(4);
            c2460.m7527();
        }
        int iM30249 = C12162.m30249(i, c2460);
        c2460.m7510(0);
        return iM30249;
    }

    @Override // l.AbstractC21041
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23377(C2460 c2460, long j, C10459 c10459) {
        byte[] bArrM7518 = c2460.m7518();
        C23451 c23451 = this.f70486;
        if (c23451 == null) {
            C23451 c23452 = new C23451(bArrM7518, 17);
            this.f70486 = c23452;
            C10471 c10471M20201 = c23452.m51686(Arrays.copyOfRange(bArrM7518, 9, c2460.m7509()), null).m20201();
            c10471M20201.m26521("audio/ogg");
            c10459.f35698 = c10471M20201.m26497();
            return true;
        }
        byte b = bArrM7518[0];
        if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == 3) {
            C10751 c10751M39921 = C17100.m39921(c2460);
            C23451 c23451M51688 = c23451.m51688(c10751M39921);
            this.f70486 = c23451M51688;
            this.f70485 = new C15398(c23451M51688, c10751M39921);
            return true;
        }
        if (b != -1) {
            return true;
        }
        C15398 c15398 = this.f70485;
        if (c15398 != null) {
            c15398.m36832(j);
            c10459.f35699 = this.f70485;
        }
        c10459.f35698.getClass();
        return false;
    }
}
