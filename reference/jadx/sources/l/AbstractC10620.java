package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۤ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10620 extends AbstractC7060 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26804() {
        int iMo11332 = this.f23703.mo11332(1);
        if (iMo11332 == 26 || iMo11332 == 30 || iMo11332 == 38 || iMo11332 == 45 || iMo11332 == 47) {
            return false;
        }
        switch (iMo11332) {
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26803(C4268 c4268) {
        int size = c4268.m51372(C18380.class).size();
        if (size == 0) {
            if (c4268.f75536.getType() != 56) {
                return false;
            }
        } else {
            int type = ((C18380) c4268.m51374(C18380.class, size - 1)).f75536.getType();
            if (type != 47 && type != 26) {
                return false;
            }
        }
        return true;
    }
}
