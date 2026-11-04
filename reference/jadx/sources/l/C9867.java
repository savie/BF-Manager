package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۢۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C9867 extends AbstractC16139 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C18818 f31754;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1028 f31755;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15591 f31756;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C1028 f31757;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22853 f31758;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14342 f31759;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9976 f31760;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f31761;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return 32;
    }

    public C9867(C1028 c1028, int i, C1028 c1029, InterfaceC11050 interfaceC11050, C9976 c9976) {
        if (c1028 == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC11050 == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f31757 = c1028;
        this.f31761 = i;
        this.f31755 = c1029;
        this.f31756 = interfaceC11050.size() == 0 ? null : new C15591(interfaceC11050);
        this.f31760 = c9976;
        this.f31754 = new C18818(c1028);
        this.f31758 = null;
        this.f31759 = new C14342();
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_CLASS_DEF_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C20067 c20067M27694 = c10918.m27694();
        C19123 c19123M27697 = c10918.m27697();
        C19123 c19123M27703 = c10918.m27703();
        C19123 c19123M27710 = c10918.m27710();
        C11116 c11116M27714 = c10918.m27714();
        c20067M27694.m46187(this.f31757);
        C18818 c18818 = this.f31754;
        if (!c18818.m43678()) {
            c10918.m27701().m44244((AbstractC10172) c18818);
            C10722 c10722M43680 = c18818.m43680();
            if (c10722M43680 != null) {
                this.f31758 = (C22853) c19123M27697.m44247(new C22853(c10722M43680));
            }
        }
        C1028 c1028 = this.f31755;
        if (c1028 != null) {
            c20067M27694.m46187(c1028);
        }
        C15591 c15591 = this.f31756;
        if (c15591 != null) {
            this.f31756 = (C15591) c19123M27710.m44247(c15591);
        }
        C9976 c9976 = this.f31760;
        if (c9976 != null) {
            c11116M27714.m28068(c9976);
        }
        if (this.f31759.m34767()) {
            return;
        }
        if (this.f31759.m34766()) {
            this.f31759 = (C14342) c19123M27703.m44247(this.f31759);
        } else {
            c19123M27703.m44244((AbstractC10172) this.f31759);
        }
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        boolean zM36116 = c15000.m36116();
        C20067 c20067M27694 = c10918.m27694();
        C1028 c1028 = this.f31757;
        int iM46183 = c20067M27694.m46183(c1028);
        C1028 c1029 = this.f31755;
        int iM46184 = c1029 == null ? -1 : c20067M27694.m46183(c1029);
        C15591 c15591 = this.f31756;
        int iM26285 = c15591 == null ? 0 : c15591.m26285();
        int iM26286 = this.f31759.m34767() ? 0 : this.f31759.m26285();
        C9976 c9976 = this.f31760;
        int iM28065 = c9976 != null ? c10918.m27714().m28065(c9976) : -1;
        C18818 c18818 = this.f31754;
        int iM26287 = c18818.m43678() ? 0 : c18818.m26285();
        C22853 c22853 = this.f31758;
        int iM26288 = c22853 == null ? 0 : c22853.m26285();
        int i = this.f31761;
        if (zM36116) {
            c15000.m36111(0, m38318() + ' ' + c1028.mo1843());
            c15000.m36111(4, "  class_idx:           ".concat(C5306.m15938(iM46183)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(C5596.m16568(i));
            c15000.m36111(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(C5306.m15938(iM46184));
            sb2.append(" // ");
            sb2.append(c1029 == null ? "<none>" : c1029.mo1843());
            c15000.m36111(4, sb2.toString());
            c15000.m36111(4, "  interfaces_off:      ".concat(C5306.m15938(iM26285)));
            if (iM26285 != 0) {
                InterfaceC11050 interfaceC11050M37323 = this.f31756.m37323();
                int i2 = 0;
                for (int size = interfaceC11050M37323.size(); i2 < size; size = size) {
                    c15000.m36111(0, ASN1Dump.TAB + interfaceC11050M37323.getType(i2).mo1843());
                    i2++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(C5306.m15938(iM28065));
            sb3.append(" // ");
            sb3.append(c9976 != null ? c9976.mo1843() : "<none>");
            c15000.m36111(4, sb3.toString());
            c15000.m36111(4, "  annotations_off:     ".concat(C5306.m15938(iM26286)));
            c15000.m36111(4, "  class_data_off:      ".concat(C5306.m15938(iM26287)));
            c15000.m36111(4, "  static_values_off:   ".concat(C5306.m15938(iM26288)));
        }
        c15000.m36124(iM46183);
        c15000.m36124(i);
        c15000.m36124(iM46184);
        c15000.m36124(iM26285);
        c15000.m36124(iM28065);
        c15000.m36124(iM26286);
        c15000.m36124(iM26287);
        c15000.m36124(iM26288);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1028 m25683() {
        return this.f31757;
    }

    /* JADX INFO: renamed from: ֫ۤ, reason: not valid java name and contains not printable characters */
    public final C1028 m25675() {
        return this.f31755;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 m25684() {
        C15591 c15591 = this.f31756;
        if (c15591 == null) {
            return C13705.f43487;
        }
        return c15591.m37323();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25682(C19869 c19869, AbstractC13487 abstractC13487) {
        this.f31754.m43677(c19869, abstractC13487);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25681(C19869 c19869) {
        this.f31754.m43676(c19869);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25676(C13156 c13156) {
        this.f31754.m43675(c13156);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25685(C13156 c13156) {
        this.f31754.m43679(c13156);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25677(C14011 c14011, C10918 c10918) {
        this.f31759.m34762(c14011, c10918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25678(C16689 c16689, C14011 c14011, C10918 c10918) {
        this.f31759.m34763(c16689, c14011, c10918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25680(C18181 c18181, C14011 c14011, C10918 c10918) {
        this.f31759.m34765(c18181, c14011, c10918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25679(C18181 c18181, C4538 c4538, C10918 c10918) {
        this.f31759.m34764(c18181, c4538, c10918);
    }
}
