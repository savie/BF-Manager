package l;

/* JADX INFO: renamed from: l.᩷ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M59E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20984 extends AbstractC11357 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f68329 = new C7578();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f68330;

    public C20984(EnumC0772 enumC0772, short s, AbstractC9011 abstractC9011) {
        super(enumC0772, abstractC9011);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (enumC0772 == EnumC0772.f3268 && ((C1953) abstractC9011).m6314().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f68330 = (byte) s;
    }

    public C20984(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(c12063, enumC0772, bArr, i);
        if (enumC0772 == EnumC0772.f3268 && ((C1953) m28439()).m6314().charAt(0) != 'L') {
            throw new RuntimeException("Only class references can be used with the new-instance opcode");
        }
        this.f68330 = bArr[i + 1];
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        EnumC0772 enumC0772 = EnumC0772.f3119;
        EnumC0772 enumC0773 = this.f15468;
        if (enumC0773 == enumC0772 && m28439().m23325() > 65535) {
            throw new RuntimeException("String offset is too large for const-string. Use string-const/jumbo instead.");
        }
        c4651.m12841(enumC0773.f3346);
        c4651.m12841(this.f68330);
        c4651.m12833(m28439().m23325());
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format21c;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f68330 & 255;
    }
}
