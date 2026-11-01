package l;

import java.io.File;

/* JADX INFO: renamed from: l.ۢܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C9684 extends C14042 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5574 f32652;

    @Override // l.C14042, l.InterfaceC16034
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20745 mo8445() {
        return this;
    }

    public C9684(File file, boolean z, C5574 c5574) {
        super(file, z);
        this.f32652 = c5574;
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 mo24641() {
        return new C9684(this.f46169.getAbsoluteFile(), this.f46167, this.f32652);
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final String mo24643() {
        return this.f46169.getAbsolutePath();
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo24647() {
        if (!super.mo24647()) {
            return false;
        }
        this.f32652 = null;
        return true;
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo24644() {
        if (!super.mo24644()) {
            return false;
        }
        this.f32652 = null;
        return true;
    }

    @Override // l.C14042, l.AbstractC20745
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo24646(AbstractC20745 abstractC20745) {
        if (!super.mo24646(abstractC20745)) {
            return false;
        }
        this.f32652 = null;
        return true;
    }

    @Override // l.C14042
    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public final void mo24648() {
        this.f32652 = null;
    }

    @Override // l.C14042
    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public final C5574 mo24645() {
        C5574 c5574 = this.f32652;
        if (c5574 != null) {
            return c5574;
        }
        C5574 c5574Mo24645 = super.mo24645();
        this.f32652 = c5574Mo24645;
        return c5574Mo24645;
    }

    @Override // l.C14042
    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo24642() {
        return this.f32652 != null;
    }

    @Override // l.C14042
    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final C5574 mo24649() {
        return this.f32652;
    }
}
