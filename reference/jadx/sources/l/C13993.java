package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.۬ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13993 extends AbstractC5747 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7282 f44353;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23232 f44354;

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۙ */
    public final void mo16809(boolean z) {
        super.mo16809(z);
        if (z) {
            this.f44354 = null;
            this.f44353 = null;
        }
    }

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۙ */
    public final long mo16806(C21287 c21287) {
        if (c21287.m48497()[0] != -1) {
            return -1L;
        }
        int i = (c21287.m48497()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c21287.m48503(4);
            c21287.m48508();
        }
        int iM55202 = C24724.m55202(i, c21287);
        c21287.m48510(0);
        return iM55202;
    }

    @Override // l.AbstractC5747
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16810(C21287 c21287, long j, C15441 c15441) {
        byte[] bArrM48497 = c21287.m48497();
        C23232 c23232 = this.f44354;
        if (c23232 == null) {
            C23232 c23233 = new C23232(bArrM48497, 17);
            this.f44354 = c23233;
            C20124 c20124M37397 = c23233.m52212(Arrays.copyOfRange(bArrM48497, 9, c21287.m48509()), null).m37397();
            c20124M37397.m46327("audio/ogg");
            c15441.f50296 = c20124M37397.m46295();
            return true;
        }
        byte b = bArrM48497[0];
        if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == 3) {
            C15772 c15772M39146 = C16518.m39146(c21287);
            C23232 c23232M52214 = c23232.m52214(c15772M39146);
            this.f44354 = c23232M52214;
            this.f44353 = new C7282(c23232M52214, c15772M39146);
            return true;
        }
        if (b != -1) {
            return true;
        }
        C7282 c7282 = this.f44353;
        if (c7282 != null) {
            c7282.m19925(j);
            c15441.f50297 = this.f44353;
        }
        c15441.f50296.getClass();
        return false;
    }
}
