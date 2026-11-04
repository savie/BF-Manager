package l;

/* JADX INFO: renamed from: l.᩷ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f70942;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C8274 f70943;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f70944;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC21988 mo13163(C8274 c8274);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13164(C2596 c2596, C1083 c1083);

    public AbstractC21988(C14528 c14528, C8274 c8274, AbstractC22664 abstractC22664) {
        this.f70944 = c14528;
        this.f70943 = c8274;
        this.f70942 = abstractC22664;
    }

    public String toString() {
        return String.format("%s[undet=%s,t=%s]", getClass().getSimpleName(), this.f70943.f72657, this.f70942);
    }
}
