package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ᩴܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19917 extends AbstractC5747 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f64075 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f64076 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f64077;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m45845(C21287 c21287) {
        return m45844(c21287, f64075);
    }

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۙ */
    public final void mo16809(boolean z) {
        super.mo16809(z);
        if (z) {
            this.f64077 = false;
        }
    }

    @Override // l.AbstractC5747
    /* JADX INFO: renamed from: ۙ */
    public final long mo16806(C21287 c21287) {
        return m16812(C7569.m20688(c21287.m48497()));
    }

    @Override // l.AbstractC5747
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16810(C21287 c21287, long j, C15441 c15441) {
        if (m45844(c21287, f64075)) {
            byte[] bArrCopyOf = Arrays.copyOf(c21287.m48497(), c21287.m48509());
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM20683 = C7569.m20683(bArrCopyOf);
            if (c15441.f50296 == null) {
                C20124 c20124 = new C20124();
                c20124.m46327("audio/ogg");
                c20124.m46315("audio/opus");
                c20124.m46329(i);
                c20124.m46332(48000);
                c20124.m46301((List) arrayListM20683);
                c15441.f50296 = c20124.m46295();
                return true;
            }
        } else if (m45844(c21287, f64076)) {
            C20782.m47566(c15441.f50296);
            if (!this.f64077) {
                this.f64077 = true;
                c21287.m48503(8);
                C19378 c19378M16596 = C5616.m16596(AbstractC1928.m6615(C5616.m16597(c21287, false, false).f63651));
                if (c19378M16596 != null) {
                    C20124 c20124M37397 = c15441.f50296.m37397();
                    c20124M37397.m46303(c19378M16596.m44822(c15441.f50296.f50812));
                    c15441.f50296 = c20124M37397.m46295();
                    return true;
                }
            }
        } else {
            C20782.m47566(c15441.f50296);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45844(C21287 c21287, byte[] bArr) {
        if (c21287.m48486() < bArr.length) {
            return false;
        }
        int iM48516 = c21287.m48516();
        byte[] bArr2 = new byte[bArr.length];
        c21287.m48490(0, bArr.length, bArr2);
        c21287.m48510(iM48516);
        return Arrays.equals(bArr2, bArr);
    }
}
