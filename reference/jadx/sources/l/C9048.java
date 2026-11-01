package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۡᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9048 extends AbstractC21041 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f30863 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30864 = {79, KeyFactorySpi.Ed25519_type, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30865;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m23374(C2460 c2460) {
        return m23373(c2460, f30863);
    }

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23376(boolean z) {
        super.mo23376(z);
        if (z) {
            this.f30865 = false;
        }
    }

    @Override // l.AbstractC21041
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo23375(C2460 c2460) {
        return m47446(C17874.m41466(c2460.m7518()));
    }

    @Override // l.AbstractC21041
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23377(C2460 c2460, long j, C10459 c10459) {
        if (m23373(c2460, f30863)) {
            byte[] bArrCopyOf = Arrays.copyOf(c2460.m7518(), c2460.m7509());
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM41462 = C17874.m41462(bArrCopyOf);
            if (c10459.f35698 == null) {
                C10471 c10471 = new C10471();
                c10471.m26521("audio/ogg");
                c10471.m26533("audio/opus");
                c10471.m26494(i);
                c10471.m26511(48000);
                c10471.m26503((List) arrayListM41462);
                c10459.f35698 = c10471.m26497();
                return true;
            }
        } else if (m23373(c2460, f30864)) {
            C2023.m6508(c10459.f35698);
            if (!this.f30865) {
                this.f30865 = true;
                c2460.m7535(8);
                C0987 c0987M37513 = C15773.m37513(AbstractC22433.m49800(C15773.m37514(c2460, false, false).f34617));
                if (c0987M37513 != null) {
                    C10471 c10471M20201 = c10459.f35698.m20201();
                    c10471M20201.m26504(c0987M37513.m3791(c10459.f35698.f25258));
                    c10459.f35698 = c10471M20201.m26497();
                    return true;
                }
            }
        } else {
            C2023.m6508(c10459.f35698);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23373(C2460 c2460, byte[] bArr) {
        if (c2460.m7503() < bArr.length) {
            return false;
        }
        int iM7500 = c2460.m7500();
        byte[] bArr2 = new byte[bArr.length];
        c2460.m7507(0, bArr.length, bArr2);
        c2460.m7510(iM7500);
        return Arrays.equals(bArr2, bArr);
    }
}
