package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18111 extends AbstractC0410 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15290 f57921;

    public C18111() {
        throw null;
    }

    public C18111(AbstractC20167 abstractC20167) {
        super(abstractC20167);
    }

    @Override // l.AbstractC0410
    /* JADX INFO: renamed from: ۙ */
    public final void mo2153(InterfaceC1260 interfaceC1260) throws IOException {
        try {
            super.mo2153(interfaceC1260);
            this.f57921 = new C15290(this, m2148());
        } catch (IOException e) {
            mo2150("Cannot read {0}", interfaceC1260);
            throw e;
        }
    }

    @Override // l.AbstractC0410
    /* JADX INFO: renamed from: ܰ */
    public final void mo2164(long j, String str, Object... objArr) {
        ((C8878) m2163()).m23030(j, str, objArr);
    }

    @Override // l.AbstractC0410, l.InterfaceC12406
    /* JADX INFO: renamed from: ۙ */
    public final void mo2149(long j, String str, Object... objArr) {
        ((C8878) m2163()).mo2149(j, str, objArr);
    }

    @Override // l.AbstractC0410
    /* JADX INFO: renamed from: ۚ */
    public final void mo2157(String str, Object... objArr) {
        ((C8878) m2163()).m23030(2147483647L, str, objArr);
    }

    @Override // l.AbstractC0410
    /* JADX INFO: renamed from: ۙ */
    public final void mo2150(String str, Object... objArr) {
        ((C8878) m2163()).mo2149(2147483647L, str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m42171(long j) {
        ((C8878) m2163()).getClass();
        return j >> 32;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m42174(String str, Object... objArr) {
        mo2150(str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42172(long j, String str, Object... objArr) {
        mo2149(j, str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m42173() {
        C15290 c15290 = this.f57921;
        if (c15290 == null) {
            return 0L;
        }
        return c15290.f73193;
    }
}
