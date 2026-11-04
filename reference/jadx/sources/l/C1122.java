package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1122 extends AbstractC12931 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19021 f4183;

    public C1122() {
        throw null;
    }

    public C1122(AbstractC15168 abstractC15168) {
        super(abstractC15168);
    }

    @Override // l.AbstractC12931
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4161(InterfaceC18152 interfaceC18152) throws IOException {
        try {
            super.mo4161(interfaceC18152);
            this.f4183 = new C19021(this, m32297());
        } catch (IOException e) {
            mo4160("Cannot read {0}", interfaceC18152);
            throw e;
        }
    }

    @Override // l.AbstractC12931
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4166(long j, String str, Object... objArr) {
        ((C4728) m32312()).m14632(j, str, objArr);
    }

    @Override // l.AbstractC12931, l.InterfaceC1745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4159(long j, String str, Object... objArr) {
        ((C4728) m32312()).mo4159(j, str, objArr);
    }

    @Override // l.AbstractC12931
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo4165(String str, Object... objArr) {
        ((C4728) m32312()).m14632(2147483647L, str, objArr);
    }

    @Override // l.AbstractC12931
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4160(String str, Object... objArr) {
        ((C4728) m32312()).mo4159(2147483647L, str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m4158(long j) {
        ((C4728) m32312()).getClass();
        return j >> 32;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4163(String str, Object... objArr) {
        mo4160(str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4162(long j, String str, Object... objArr) {
        mo4159(j, str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m4164() {
        C19021 c19021 = this.f4183;
        if (c19021 == null) {
            return 0L;
        }
        return c19021.f67514;
    }
}
