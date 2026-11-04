package l;

import java.io.File;

/* JADX INFO: renamed from: l.ۡܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C9538 extends C7302 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21694 f30887;

    @Override // l.C7302, l.InterfaceC6557
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22044 mo15565() {
        return this;
    }

    public C9538(File file, boolean z, C21694 c21694) {
        super(file, z);
        this.f30887 = c21694;
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC22044 mo4284() {
        return new C9538(this.f24039.getAbsoluteFile(), this.f24038, this.f30887);
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo4278() {
        return this.f24039.getAbsolutePath();
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo4296() {
        if (!super.mo4296()) {
            return false;
        }
        this.f30887 = null;
        return true;
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo4287() {
        if (!super.mo4287()) {
            return false;
        }
        this.f30887 = null;
        return true;
    }

    @Override // l.C7302, l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4301(AbstractC22044 abstractC22044) {
        if (!super.mo4301(abstractC22044)) {
            return false;
        }
        this.f30887 = null;
        return true;
    }

    @Override // l.C7302
    /* JADX INFO: renamed from: ᩳ᩷ */
    public final void mo15568() {
        this.f30887 = null;
    }

    @Override // l.C7302
    /* JADX INFO: renamed from: ֨᩷ */
    public final C21694 mo15564() {
        C21694 c21694 = this.f30887;
        if (c21694 != null) {
            return c21694;
        }
        C21694 c21694Mo15564 = super.mo15564();
        this.f30887 = c21694Mo15564;
        return c21694Mo15564;
    }

    @Override // l.C7302
    /* JADX INFO: renamed from: ۠᩷ */
    public final boolean mo15566() {
        return this.f30887 != null;
    }

    @Override // l.C7302
    /* JADX INFO: renamed from: ۡ᩷ */
    public final C21694 mo15567() {
        return this.f30887;
    }
}
