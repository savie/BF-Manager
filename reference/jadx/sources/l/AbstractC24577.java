package l;

/* JADX INFO: renamed from: l.᩺᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 f79655;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f79656;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15581 f79657;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4439 f79658;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f79659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC24577 f79660;

    public AbstractC24577(C4439 c4439, AbstractC15581 abstractC15581) {
        this.f79658 = c4439;
        this.f79657 = abstractC15581;
        this.f79656 = c4439.m14107(true);
        this.f79659 = c4439.f15894.m35551() - 1;
        this.f79660 = c4439.m14124();
        C18609 c18609 = c4439.f15895;
        this.f79655 = c18609.f60504.m55156(c18609.f60504.m55107(c18609.f60513, c18609.f60496.f49799, abstractC15581.f50682, 1536L));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54895() {
        AbstractC22664 abstractC22664 = this.f79657.f50682;
        abstractC22664.getClass();
        return (abstractC22664 instanceof C1562) || m54896() || this.f79655.m35551() > 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54896() {
        C18609 c18609 = this.f79658.f15895;
        if (c18609.f60516) {
            return true;
        }
        return c18609.f60504.m55157(c18609.f60515.f48313.f73596, this.f79657.f50682) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54894() {
        AbstractC19728 abstractC19728 = this.f79656.f38072;
        if (abstractC19728 == null) {
            return "null";
        }
        String string = abstractC19728.toString();
        if (string.equals("<clinit>")) {
            return "static";
        }
        return string.equals("<init>") ? "new" : string;
    }
}
