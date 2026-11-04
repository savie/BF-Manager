package l;

/* JADX INFO: renamed from: l.᩺᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K4 */
/* JADX INFO: loaded from: classes.dex */
public class C24652 extends AbstractC4625 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11971 f79800;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79801;

    /* JADX INFO: renamed from: ܳ */
    public C24652 mo3630() {
        return this;
    }

    /* JADX INFO: renamed from: ᩴ */
    public int mo3631() {
        return 65536;
    }

    public C24652() {
        super(new C18684());
    }

    public C24652(EnumC15700 enumC15700, EnumC23906 enumC23906) {
        this(25, enumC15700, enumC23906, 0L, 0L);
    }

    public C24652(EnumC15700 enumC15700, EnumC23906 enumC23906, long j) {
        this(4, enumC15700, enumC23906, j, 0L);
    }

    public C24652(int i, EnumC15700 enumC15700, EnumC23906 enumC23906, long j, long j2) {
        C18684 c18684 = new C18684();
        super(c18684);
        this.f79801 = i;
        c18684.m43454(enumC15700);
        ((C18684) this.f16383).m43455(enumC23906);
        ((C18684) this.f16383).m43460(j);
        ((C18684) this.f16383).m43471(j2);
    }

    @Override // l.AbstractC4625
    /* JADX INFO: renamed from: ۙ */
    public final C7453 mo14436() {
        return this.f16382;
    }

    @Override // l.InterfaceC7277
    /* JADX INFO: renamed from: ۤ, reason: merged with bridge method [inline-methods] */
    public void mo3627(C7453 c7453) {
        this.f16382 = c7453;
        ((C18684) this.f16383).m43468(c7453);
        mo7006(c7453);
        ((C18684) this.f16383).m43459(c7453.m56019());
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo7006(C7453 c7453) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55003(C4514 c4514) {
        this.f16382 = c4514.m49390();
        this.f16383 = c4514.m49391();
        mo4684(this.f16382);
        this.f16382.m56027(((C18684) this.f16383).mo4193());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55005(C4514 c4514) {
        this.f16382 = c4514.m49390();
        this.f16383 = c4514.m49391();
        C11971 c11971 = new C11971();
        c11971.m30013((C18684) this.f16383, this.f16382);
        this.f79800 = c11971;
        this.f16382.m56027(((C18684) this.f16383).mo4193());
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo4684(C7453 c7453) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m55004() {
        return this.f79800 == null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11971 m55006() {
        return this.f79800;
    }

    public String toString() {
        return ((C18684) this.f16383).m43462() + " with message id << " + ((C18684) this.f16383).m43457() + " >>";
    }
}
