package l;

/* JADX INFO: renamed from: l.ܿ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17043 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC12105 f54425;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f54426;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5290(C5982 c5982);

    public AbstractC17043(EnumC12105 enumC12105) {
        this.f54425 = enumC12105;
    }

    public AbstractC17043(EnumC12105 enumC12105, Object obj) {
        this.f54425 = enumC12105;
        this.f54426 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12105 m39823() {
        return this.f54425;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m39824() {
        return this.f54426;
    }

    public final String toString() {
        return "AvPair{avId=" + this.f54425.name() + ", value=" + this.f54426 + '}';
    }
}
