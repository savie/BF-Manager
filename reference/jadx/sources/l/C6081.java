package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6081 extends AbstractC15254 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1909 f20595;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17432 f20596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2283 f20597;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return 12;
    }

    public C6081(C1909 c1909) {
        if (c1909 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f20595 = c1909;
        C9672 c9672M6222 = c1909.m6222();
        int size = c9672M6222.size();
        StringBuilder sb = new StringBuilder(size + 1);
        char cCharAt = c1909.m6217().m9844().charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < size; i++) {
            char cCharAt2 = c9672M6222.getType(i).m9844().charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f20596 = new C17432(sb.toString());
        C9672 c9672M6223 = c1909.m6222();
        this.f20597 = c9672M6223.size() == 0 ? null : new C2283(c9672M6223);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_PROTO_ID_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C4400 c4400M12886 = c4669.m12886();
        C11457 c11457M12877 = c4669.m12877();
        C16665 c16665M12887 = c4669.m12887();
        c11457M12877.m28605(this.f20595.m6217());
        c4400M12886.m12268(this.f20596);
        C2283 c2283 = this.f20597;
        if (c2283 != null) {
            this.f20597 = (C2283) c16665M12887.m39130(c2283);
        }
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        C4400 c4400M12886 = c4669.m12886();
        C17432 c17432 = this.f20596;
        int iM12264 = c4400M12886.m12264(c17432);
        C11457 c11457M12877 = c4669.m12877();
        C1909 c1909 = this.f20595;
        int iM28600 = c11457M12877.m28600(c1909.m6217());
        C2283 c2283 = this.f20597;
        int iM30904 = c2283 == null ? 0 : c2283.m30904();
        if (c2718.m8288()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c1909.m6217().mo2376());
            sb.append(" proto(");
            C9672 c9672M6222 = c1909.m6222();
            int size = c9672M6222.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(c9672M6222.getType(i).mo2376());
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c2718.m8283(0, m36532() + ' ' + sb.toString());
            c2718.m8283(4, "  shorty_idx:      " + C22475.m49978(iM12264) + " // " + c17432.m40637());
            c2718.m8283(4, "  return_type_idx: " + C22475.m49978(iM28600) + " // " + c1909.m6217().mo2376());
            c2718.m8283(4, "  parameters_off:  ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM12264);
        c2718.m8289(iM28600);
        c2718.m8289(iM30904);
    }
}
