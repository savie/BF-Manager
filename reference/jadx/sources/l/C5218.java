package l;

/* JADX INFO: renamed from: l.ۙ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5218 extends AbstractC16404 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Boolean f18409;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC23864 f18410;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Boolean f18411;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC16404 m15701() {
        this.f18409 = Boolean.TRUE;
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC16404 m15700() {
        this.f18411 = Boolean.TRUE;
        return this;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16404 mo15699(EnumC23864 enumC23864) {
        if (enumC23864 == null) {
            throw new NullPointerException("Null style");
        }
        this.f18410 = enumC23864;
        return this;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3726 mo15698() {
        Boolean bool = this.f18409;
        if (bool == null || this.f18411 == null || this.f18410 == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f18409 == null) {
                sb.append(" formatJavadoc");
            }
            if (this.f18411 == null) {
                sb.append(" reorderModifiers");
            }
            if (this.f18410 == null) {
                sb.append(" style");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }
        return new C22372(bool.booleanValue(), this.f18411.booleanValue(), this.f18410);
    }
}
