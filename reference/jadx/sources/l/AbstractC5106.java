package l;

/* JADX INFO: renamed from: l.ۙᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5106 extends AbstractC11071 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC11071[] f17809;

    @Override // l.AbstractC11071
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15446(AbstractC11071[] abstractC11071Arr) {
        this.f17809 = abstractC11071Arr;
    }

    public AbstractC5106(EnumC22260 enumC22260, AbstractC11071[] abstractC11071Arr) {
        super(enumC22260, EnumC7080.En);
        this.f17809 = abstractC11071Arr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC11071[] m15447() {
        int length = this.f17809.length;
        AbstractC11071[] abstractC11071Arr = new AbstractC11071[length];
        for (int i = 0; i < length; i++) {
            AbstractC11071 abstractC11071 = this.f17809[i];
            abstractC11071.getClass();
            abstractC11071Arr[i] = abstractC11071.clone();
        }
        return abstractC11071Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11071[] m15449(C5194 c5194) {
        int length = this.f17809.length;
        AbstractC11071[] abstractC11071Arr = new AbstractC11071[length];
        for (int i = 0; i < length; i++) {
            abstractC11071Arr[i] = this.f17809[i].mo5237(c5194);
        }
        return abstractC11071Arr;
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC11071[] mo15448() {
        return this.f17809;
    }
}
