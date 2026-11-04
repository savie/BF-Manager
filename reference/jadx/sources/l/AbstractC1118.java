package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6IJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1118 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7830 f4178;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo4145();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract C0701 mo4148();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract C19017 mo4150();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC11902 mo4151();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract AbstractC1118 mo4154(C7830 c7830);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract EnumC10066 mo4155();

    public AbstractC1118(C7830 c7830) {
        this.f4178 = c7830;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1118 m4146(C7830 c7830) {
        return mo4154(c7830);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7830 m4149() {
        return this.f4178;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9649 m4152() {
        return this.f4178.m21347(this);
    }

    public final String toString() {
        String strM13220 = C4123.m13220(0, " ");
        String strM13221 = C4123.m13220(2, " ");
        StringBuilder sb = new StringBuilder(strM13220);
        sb.append(getClass().getSimpleName());
        sb.append(' ');
        if (mo4145()) {
            sb.append("TERMINAL ");
        }
        sb.append(" {");
        sb.append(System.lineSeparator());
        sb.append(strM13221);
        sb.append("centrality: ");
        if (mo4148() == null) {
            sb.append("none");
        } else {
            sb.append(m4153());
        }
        sb.append(System.lineSeparator());
        sb.append(strM13221);
        sb.append(mo4155());
        sb.append(System.lineSeparator());
        sb.append(strM13221);
        C19017 c19017Mo4150 = mo4150();
        if (c19017Mo4150 != null) {
            sb.append(c19017Mo4150.m44104());
        } else {
            sb.append("NO ACTIVE BLOCK");
        }
        sb.append(System.lineSeparator());
        sb.append(strM13220);
        sb.append(l.d);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0701 m4153() {
        C0701 c0701Mo4148 = mo4148();
        if (c0701Mo4148 != null) {
            return c0701Mo4148;
        }
        throw new UnsupportedOperationException("Centrality state is not supported for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19017 m4147() {
        return mo4150();
    }
}
