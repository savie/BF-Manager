package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۤۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C10104 extends AbstractC16579 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8693 f34493;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f34494;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5870 f34495;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4603 f34496;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashSet f34497;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC9729 f34498;

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        return "DeferredType";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10104(C5870 c5870, AbstractC5930 abstractC5930, C4603 c4603) {
        super(null, C3794.f13674);
        this.f34495 = c5870;
        this.f34497 = new HashSet();
        this.f34494 = abstractC5930;
        c5870.f20041.getClass();
        this.f34496 = C6761.m18290(c4603);
        this.f34493 = new C8693();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1929(C3794 c3794) {
        throw new AssertionError("Cannot add metadata to a deferred type");
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return EnumC6617.DEFERRED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo25715(AbstractC23903 abstractC23903, EnumC11678 enumC11678) {
        C19276 c19276M22514 = this.f34493.m22514(abstractC23903, enumC11678);
        return c19276M22514 != null ? c19276M22514.f62233.f30190 : AbstractC16579.f53219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 mo25712(C12926 c12926) {
        C19276 c19276M22514 = this.f34493.m22514(c12926.f42951, c12926.f42957);
        return c19276M22514 != null ? c19276M22514.f62233 : this.f34495.f20039;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo25714(C1116 c1116, C12926 c12926) {
        int iOrdinal = c12926.f42954.ordinal();
        C4603 c4603 = this.f34496;
        AbstractC5930 abstractC5930 = this.f34494;
        C5870 c5870 = this.f34495;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6171.m17176(this.f34498 != null);
                return c5870.f20041.m18299(abstractC5930, c4603, c1116);
            }
            C6171.m17170();
            throw null;
        }
        EnumC9729 enumC9729 = this.f34498;
        C6171.m17176(enumC9729 == null || enumC9729 == EnumC9729.SPECULATIVE);
        AbstractC8774 abstractC8774M16084 = c5870.m16084(abstractC5930, c4603, c1116, c5870.f20047, null, EnumC3377.SPECULATIVE, null);
        this.f34493.m22515(abstractC8774M16084, c1116);
        return abstractC8774M16084.f30190;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m25713(C1116 c1116) {
        InterfaceC7987 c19982;
        AbstractC16579 abstractC16579 = c1116.f5036;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        boolean zM39001 = abstractC16579.m39001(EnumC6617.NONE);
        C5870 c5870 = this.f34495;
        if (zM39001 || c1116.f5036.mo1926()) {
            c19982 = c5870.f20042;
        } else if (interfaceC18195.mo4575().f42954 != EnumC9729.SPECULATIVE && !interfaceC18195.mo4575().m32015()) {
            c19982 = new C11515(c5870, c1116, this);
        } else {
            c19982 = new C19982(c5870, c1116, this);
        }
        return m25710(c1116, c19982);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 m25710(C1116 c1116, InterfaceC7987 interfaceC7987) {
        C12926 c12926Mo4575 = c1116.f5037.mo4575();
        C6171.m17176(c12926Mo4575 != this.f34495.f20035);
        if (interfaceC7987.mo21044()) {
            c12926Mo4575.mo32013(this, c1116, interfaceC7987);
            EnumC9729 enumC9729 = c12926Mo4575.f42954;
            EnumC9729 enumC97210 = EnumC9729.SPECULATIVE;
            if (enumC9729 == enumC97210) {
                this.f34497.add(c12926Mo4575.f42951);
                this.f34498 = enumC97210;
            }
            return AbstractC16579.f53219;
        }
        try {
            return mo25714(c1116, c12926Mo4575);
        } finally {
            this.f34498 = c12926Mo4575.f42954;
        }
    }
}
