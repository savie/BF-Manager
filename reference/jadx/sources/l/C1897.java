package l;

import java.util.List;

/* JADX INFO: renamed from: l.֫ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1897 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f7156;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f7157;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f7158;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3384 f7159;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7160;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f7161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC8858 f7162;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f7163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC14599 f7164;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7165;

    public C1897(List list, EnumC14599 enumC14599) {
        this.f7157 = list;
        this.f7164 = enumC14599;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6188(int i, List list) {
        this.f7159 = null;
        this.f7162 = null;
        AbstractC3384 abstractC3384 = (AbstractC3384) list.get(i);
        EnumC10297 enumC10297Mo5435 = abstractC3384.mo5435();
        EnumC14599 enumC14599 = this.f7164;
        EnumC10297 enumC10297 = enumC14599.f47775;
        List list2 = this.f7157;
        if (enumC10297Mo5435 == enumC10297) {
            InterfaceC8858 interfaceC8858 = (InterfaceC8858) ((InterfaceC13859) abstractC3384).getReference();
            if (!list2.contains(interfaceC8858)) {
                return false;
            }
            this.f7162 = interfaceC8858;
            this.f7159 = abstractC3384;
            InterfaceC13797 interfaceC13797 = (InterfaceC13797) abstractC3384;
            this.f7160 = interfaceC13797.mo3085();
            this.f7165 = interfaceC13797.mo3087();
            this.f7156 = interfaceC13797.mo3089();
            this.f7163 = interfaceC13797.mo3086();
            this.f7158 = interfaceC13797.mo3088();
            this.f7161 = interfaceC13797.mo2107();
            return true;
        }
        if (abstractC3384.mo5435() != enumC14599.f47776) {
            return false;
        }
        InterfaceC8858 interfaceC8859 = (InterfaceC8858) ((InterfaceC13859) abstractC3384).getReference();
        if (!list2.contains(interfaceC8859)) {
            return false;
        }
        this.f7162 = interfaceC8859;
        this.f7159 = abstractC3384;
        InterfaceC5329 interfaceC5329 = (InterfaceC5329) abstractC3384;
        int iMo2109 = interfaceC5329.mo2109();
        this.f7160 = iMo2109;
        this.f7165 = iMo2109 + 1;
        this.f7156 = iMo2109 + 2;
        this.f7163 = iMo2109 + 3;
        this.f7158 = iMo2109 + 4;
        this.f7161 = interfaceC5329.mo2107();
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m6186() {
        return this.f7160;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m6189() {
        return this.f7165;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 m6192() {
        return new C23771(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8858 m6190() {
        return this.f7162;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m6191() {
        return this.f7159.m10035().m36038();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3384 m6187() {
        return this.f7159;
    }
}
