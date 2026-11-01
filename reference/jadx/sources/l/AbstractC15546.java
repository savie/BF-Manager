package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܶ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBG4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15546 implements InterfaceC19653 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16251 f50595;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12723 f50596;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0727 f50597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11312 f50598;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ۖ */
    public String mo6696() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC15546 mo6697(C3320 c3320);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC15546 mo6698(C16251 c16251, C0727 c0727);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6699(InterfaceC23307 interfaceC23307);

    /* JADX INFO: renamed from: ۨ */
    public abstract InterfaceC14093 mo6700();

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15546 mo26774() {
        return this;
    }

    public AbstractC15546(C12723 c12723, C11312 c11312, C16251 c16251, C0727 c0727) {
        if (c12723 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c11312 == null) {
            throw new NullPointerException("position == null");
        }
        if (c0727 == null) {
            throw new NullPointerException("sources == null");
        }
        this.f50596 = c12723;
        this.f50598 = c11312;
        this.f50595 = c16251;
        this.f50597 = c0727;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo6696 = mo6696();
        StringBuilder sbM40152 = C17214.m40152(80, "Insn{");
        sbM40152.append(this.f50598);
        sbM40152.append(' ');
        sbM40152.append(this.f50596);
        if (strMo6696 != null) {
            sbM40152.append(' ');
            sbM40152.append(strMo6696);
        }
        sbM40152.append(" :: ");
        C16251 c16251 = this.f50595;
        if (c16251 != null) {
            sbM40152.append(c16251);
            sbM40152.append(" <- ");
        }
        sbM40152.append(this.f50597);
        sbM40152.append('}');
        return sbM40152.toString();
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        String strMo6696 = mo6696();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f50598);
        sb.append(": ");
        sb.append(this.f50596.m31575());
        if (strMo6696 != null) {
            C0219.m1594(sb, MotionUtils.EASING_TYPE_FORMAT_START, strMo6696, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C16251 c16251 = this.f50595;
        if (c16251 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c16251.mo2376());
        }
        sb.append(" <-");
        C0727 c0727 = this.f50597;
        int size = c0727.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(c0727.m15275get(i).mo2376());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12723 m37181() {
        return this.f50596;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11312 m37183() {
        return this.f50598;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C16251 m37185() {
        return this.f50595;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16251 m37187() {
        C16251 c16251M15275get;
        if (this.f50596.m31572() == 54) {
            c16251M15275get = this.f50597.m15275get(0);
        } else {
            c16251M15275get = this.f50595;
        }
        if (c16251M15275get == null || c16251M15275get.m38386() == null) {
            return null;
        }
        return c16251M15275get;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0727 m37186() {
        return this.f50597;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m37184() {
        return this.f50596.m31573();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo37182(AbstractC15546 abstractC15546) {
        Object obj;
        C16251 c16251;
        if (this.f50596 != abstractC15546.f50596 || !this.f50598.equals(abstractC15546.f50598) || getClass() != abstractC15546.getClass() || ((c16251 = this.f50595) != (obj = abstractC15546.f50595) && (c16251 == null || !c16251.equals(obj)))) {
            return false;
        }
        Object obj2 = abstractC15546.f50597;
        C0727 c0727 = this.f50597;
        if (c0727 != obj2 && (c0727 == null || !c0727.equals(obj2))) {
            return false;
        }
        InterfaceC14093 interfaceC14093Mo6700 = mo6700();
        InterfaceC14093 interfaceC14093Mo6701 = abstractC15546.mo6700();
        C9672 c9672 = C9672.f32573;
        int size = interfaceC14093Mo6700.size();
        if (interfaceC14093Mo6701.size() == size) {
            for (int i = 0; i < size; i++) {
                if (interfaceC14093Mo6700.getType(i).equals(interfaceC14093Mo6701.getType(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
