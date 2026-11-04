package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ᩴۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19790 extends AbstractC0540 {
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m45572() {
        int iMo11537 = this.f2260.mo11537(1);
        if (iMo11537 == 26 || iMo11537 == 30 || iMo11537 == 38 || iMo11537 == 45 || iMo11537 == 47) {
            return false;
        }
        switch (iMo11537) {
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45571(C0861 c0861) {
        int size = c0861.m21803(C13539.class).size();
        if (size == 0) {
            if (c0861.f26549.getType() != 56) {
                return false;
            }
        } else {
            int type = ((C13539) c0861.m21805(C13539.class, size - 1)).f26549.getType();
            if (type != 47 && type != 26) {
                return false;
            }
        }
        return true;
    }
}
