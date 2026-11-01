package l;

/* JADX INFO: renamed from: l.۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7426 extends C22243 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f24784;

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        m43247(new C18009(c11200));
    }

    @Override // l.C22243, l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        if (this.f24784 || c22489.m49993() == EnumC9897.EXPRESSION) {
            return;
        }
        this.f24784 = true;
        try {
            super.mo3959(c22489);
        } finally {
            this.f24784 = false;
        }
    }
}
