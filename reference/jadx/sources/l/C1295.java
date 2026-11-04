package l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1295 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4623;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12384 f4624;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f4625;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC4859 f4626;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4627;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4628;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4629;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4630;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC10243 f4631;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f4632;

    public C1295(List list, EnumC10243 enumC10243) {
        this.f4632 = list;
        this.f4631 = enumC10243;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4695(int i, List list) {
        this.f4624 = null;
        this.f4626 = null;
        AbstractC12384 abstractC12384 = (AbstractC12384) list.get(i);
        EnumC22631 enumC22631Mo30864 = abstractC12384.mo30864();
        EnumC10243 enumC10243 = this.f4631;
        EnumC22631 enumC22631 = enumC10243.f32726;
        List list2 = this.f4632;
        if (enumC22631Mo30864 == enumC22631) {
            InterfaceC4859 interfaceC4859 = (InterfaceC4859) ((InterfaceC6177) abstractC12384).getReference();
            if (!list2.contains(interfaceC4859)) {
                return false;
            }
            this.f4626 = interfaceC4859;
            this.f4624 = abstractC12384;
            InterfaceC6067 interfaceC6067 = (InterfaceC6067) abstractC12384;
            this.f4630 = interfaceC6067.mo7063();
            this.f4629 = interfaceC6067.mo7065();
            this.f4628 = interfaceC6067.mo7061();
            this.f4625 = interfaceC6067.mo7062();
            this.f4623 = interfaceC6067.mo7064();
            this.f4627 = interfaceC6067.mo1655();
            return true;
        }
        if (abstractC12384.mo30864() != enumC10243.f32727) {
            return false;
        }
        InterfaceC4859 interfaceC48510 = (InterfaceC4859) ((InterfaceC6177) abstractC12384).getReference();
        if (!list2.contains(interfaceC48510)) {
            return false;
        }
        this.f4626 = interfaceC48510;
        this.f4624 = abstractC12384;
        InterfaceC14269 interfaceC14269 = (InterfaceC14269) abstractC12384;
        int iMo2772 = interfaceC14269.mo2772();
        this.f4630 = iMo2772;
        this.f4629 = iMo2772 + 1;
        this.f4628 = iMo2772 + 2;
        this.f4625 = iMo2772 + 3;
        this.f4623 = iMo2772 + 4;
        this.f4627 = interfaceC14269.mo1655();
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m4700() {
        return this.f4630;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m4698() {
        return this.f4629;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6036 m4697() {
        return new C19194(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4859 m4696() {
        return this.f4626;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4699() {
        return this.f4624.m30863().m24745();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12384 m4694() {
        return this.f4624;
    }
}
