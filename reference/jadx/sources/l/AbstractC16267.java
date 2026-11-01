package l;

/* JADX INFO: renamed from: l.ܺ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16267 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f52427;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10229 f52428;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13174 f52429;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC16267 mo4311(C10229 c10229);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4312(C19524 c19524, C10391 c10391);

    public AbstractC16267(C13174 c13174, C10229 c10229, AbstractC16579 abstractC16579) {
        this.f52429 = c13174;
        this.f52428 = c10229;
        this.f52427 = abstractC16579;
    }

    public String toString() {
        return String.format("%s[undet=%s,t=%s]", getClass().getSimpleName(), this.f52428.f53121, this.f52427);
    }
}
