package l;

/* JADX INFO: renamed from: l.ۚۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5131 extends AbstractC8660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Boolean f17842;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC10071 f17843;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Boolean f17844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC8660 m14287() {
        this.f17842 = Boolean.TRUE;
        return this;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC8660 m14286() {
        this.f17844 = Boolean.TRUE;
        return this;
    }

    @Override // l.AbstractC8660
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8660 mo14285(EnumC10071 enumC10071) {
        if (enumC10071 == null) {
            throw new NullPointerException("Null style");
        }
        this.f17843 = enumC10071;
        return this;
    }

    @Override // l.AbstractC8660
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7248 mo14284() {
        Boolean bool = this.f17842;
        if (bool == null || this.f17844 == null || this.f17843 == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f17842 == null) {
                sb.append(" formatJavadoc");
            }
            if (this.f17844 == null) {
                sb.append(" reorderModifiers");
            }
            if (this.f17843 == null) {
                sb.append(" style");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }
        return new C22065(bool.booleanValue(), this.f17844.booleanValue(), this.f17843);
    }
}
