package l;

/* JADX INFO: renamed from: l.ۧܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11751 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC2057 f37993;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f37994;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo11567(C11707 c11707);

    public AbstractC11751(EnumC2057 enumC2057) {
        this.f37993 = enumC2057;
    }

    public AbstractC11751(EnumC2057 enumC2057, Object obj) {
        this.f37993 = enumC2057;
        this.f37994 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC2057 m29501() {
        return this.f37993;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m29502() {
        return this.f37994;
    }

    public final String toString() {
        return "AvPair{avId=" + this.f37993.name() + ", value=" + this.f37994 + '}';
    }
}
