package l;

/* JADX INFO: renamed from: l.ۚ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBF6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5375 extends AbstractC2552 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20255 f18572;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10670 f18573;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18572.compareTo(((C5375) obj).f18572);
    }

    public C5375(C20255 c20255, int i, C0209 c0209, InterfaceC14093 interfaceC14093) {
        super(i);
        this.f18572 = c20255;
        if (c0209 == null) {
            this.f18573 = null;
        } else {
            this.f18573 = new C10670(c20255, c0209, (i & 8) != 0, interfaceC14093);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5375) && this.f18572.compareTo(((C5375) obj).f18572) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C5375.class.getName());
        sb.append('{');
        sb.append(C22475.m49982(m7960()));
        sb.append(' ');
        sb.append(this.f18572);
        C10670 c10670 = this.f18573;
        if (c10670 != null) {
            sb.append(' ');
            sb.append(c10670);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14891(C4669 c4669) {
        C15960 c15960M12884 = c4669.m12884();
        C16665 c16665M12878 = c4669.m12878();
        c15960M12884.m37947(this.f18572);
        C10670 c10670 = this.f18573;
        if (c10670 != null) {
            c16665M12878.m39128((AbstractC12432) c10670);
        }
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f18572.mo2376();
    }

    @Override // l.AbstractC2552
    /* JADX INFO: renamed from: ۙ */
    public final int mo7959(C4669 c4669, C2718 c2718, int i, int i2) {
        C15960 c15960M12884 = c4669.m12884();
        C20255 c20255 = this.f18572;
        int iM37944 = c15960M12884.m37944((AbstractC11788) c20255);
        int i3 = iM37944 - i;
        int iM7960 = m7960();
        C10670 c10670 = this.f18573;
        int iM30904 = c10670 == null ? 0 : c10670.m30904();
        if ((iM30904 != 0) != ((iM7960 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c2718.m8288()) {
            c2718.m8283(0, String.format("  [%x] %s", Integer.valueOf(i2), c20255.mo2376()));
            c2718.m8283(C10336.m26220(i3), "    method_idx:   ".concat(C22475.m49978(iM37944)));
            c2718.m8283(C10336.m26220(iM7960), "    access_flags: " + C4961.m13748(iM7960));
            c2718.m8283(C10336.m26220(iM30904), "    code_off:     ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8293(i3);
        c2718.m8293(iM7960);
        c2718.m8293(iM30904);
        return iM37944;
    }
}
