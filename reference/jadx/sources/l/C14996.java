package l;

/* JADX INFO: renamed from: l.ܳ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M59E */
/* JADX INFO: loaded from: classes5.dex */
public final class C14996 extends AbstractC14490 implements InterfaceC10015 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f49003 = new C19472();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f49004;

    public C14996(EnumC7779 enumC7779, short s, AbstractC10739 abstractC10739) {
        super(enumC7779, abstractC10739);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (enumC7779 == EnumC7779.f25592 && ((C20436) abstractC10739).m46860().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f49004 = (byte) s;
    }

    public C14996(C24738 c24738, EnumC7779 enumC7779, byte[] bArr, int i) {
        super(c24738, enumC7779, bArr, i);
        if (enumC7779 == EnumC7779.f25592 && ((C20436) m35002()).m46860().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f49004 = bArr[i + 1];
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        EnumC7779 enumC7779 = EnumC7779.f25820;
        EnumC7779 enumC77710 = this.f78334;
        if (enumC77710 == enumC7779 && m35002().m27353() > 65535) {
            throw new RuntimeException("String offset is too large for const-string. Use string-const/jumbo instead.");
        }
        c24166.m54138(enumC77710.f25844);
        c24166.m54138(this.f49004);
        c24166.m54139(m35002().m27353());
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format21c;
    }

    @Override // l.InterfaceC10015
    /* JADX INFO: renamed from: ۙ */
    public final int mo9996() {
        return this.f49004 & 255;
    }
}
