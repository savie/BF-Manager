package l;

import java.util.Arrays;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۠֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C7847 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C18430 f25805 = new C18430();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13574 f25806;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23535 f25807;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f25808;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20726(C7847[] c7847Arr) {
        Arrays.sort(c7847Arr, f25805);
    }

    public C7847(C4669 c4669, C23535 c23535) {
        super(1, -1);
        if (c23535 == null) {
            throw new NullPointerException("annotation == null");
        }
        this.f25807 = c23535;
        this.f25806 = null;
        this.f25808 = null;
        mo4171(c4669);
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_ANNOTATION_ITEM;
    }

    public final int hashCode() {
        return this.f25807.hashCode();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۙ */
    public final int mo6990(AbstractC12432 abstractC12432) {
        return this.f25807.compareTo(((C7847) abstractC12432).f25807);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f25807.mo2376();
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C11457 c11457M12877 = c4669.m12877();
        C23535 c23535 = this.f25807;
        this.f25806 = c11457M12877.m28604(c23535.getType());
        C0872.m3488(c4669, c23535);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo19042(C16665 c16665, int i) {
        C2718 c2718 = new C2718();
        new C0872(c16665.m52251(), c2718).m3493(this.f25807, false);
        byte[] bArrM8278 = c2718.m8278();
        this.f25808 = bArrM8278;
        m30903(bArrM8278.length + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20727(C2718 c2718) {
        StringBuilder sb = new StringBuilder("    visibility: ");
        C23535 c23535 = this.f25807;
        sb.append(c23535.getVisibility().mo2376());
        c2718.m8283(0, sb.toString());
        c2718.m8283(0, "    type: " + c23535.getType().mo2376());
        for (C3072 c3072 : c23535.m51861()) {
            c2718.m8283(0, ASN1Dump.TAB + c3072.getName().mo2376() + ": " + C0872.m3490(c3072.getValue()));
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        boolean zM8288 = c2718.m8288();
        C23535 c23535 = this.f25807;
        EnumC14363 visibility = c23535.getVisibility();
        if (zM8288) {
            c2718.m8283(0, m30901() + " annotation");
            StringBuilder sb = new StringBuilder("  visibility: VISBILITY_");
            sb.append(visibility);
            c2718.m8283(1, sb.toString());
        }
        int i = C17724.f56257[visibility.ordinal()];
        if (i == 1) {
            c2718.m8280(0);
        } else if (i == 2) {
            c2718.m8280(1);
        } else if (i == 3) {
            c2718.m8280(2);
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        if (zM8288) {
            new C0872(c4669, c2718).m3493(c23535, true);
        } else {
            c2718.m8287(this.f25808);
        }
    }
}
