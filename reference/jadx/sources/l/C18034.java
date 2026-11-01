package l;

/* JADX INFO: renamed from: l.ᩳۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB8X */
/* JADX INFO: loaded from: classes5.dex */
public final class C18034 extends C5541 {
    @Override // l.C5541
    /* JADX INFO: renamed from: ۙ */
    public final void mo15257(int i, AbstractC9901 abstractC9901) {
        if ((abstractC9901 instanceof C17432) || (abstractC9901 instanceof C6143) || (abstractC9901 instanceof C21665) || (abstractC9901 instanceof C7554) || (abstractC9901 instanceof C15316) || (abstractC9901 instanceof C4025) || (abstractC9901 instanceof C16022) || (abstractC9901 instanceof C16727)) {
            m15252(i, (Object) abstractC9901);
            return;
        }
        throw new IllegalArgumentException("bad type for bootstrap argument: " + abstractC9901.getClass());
    }
}
