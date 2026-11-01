package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public class C17594 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f55921;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6305 f55922;

    public C17594(C6305 c6305, AbstractC23903 abstractC23903) {
        this.f55922 = c6305;
        this.f55921 = abstractC23903;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo39553(AbstractC16579 abstractC16579) {
        C6305 c6305 = this.f55922;
        C23800 c23800 = c6305.f21329;
        C23800 c23801 = c6305.f21329;
        AbstractC16579 abstractC16579M52438 = c23800.m52438(abstractC16579);
        abstractC16579M52438.getClass();
        if (abstractC16579M52438 instanceof C23594) {
            Iterator it = ((C23594) abstractC16579M52438).m52021().iterator();
            while (it.hasNext()) {
                if (!c23801.f76942.m47324((AbstractC16579) it.next())) {
                    C11948 c11948M51910 = c23801.f76968.m51910(C14707.m35239(abstractC16579M52438));
                    C23945 c23945 = new C23945();
                    c23945.f77665 = c11948M51910;
                    throw c23945;
                }
            }
        } else if (!c23801.f76942.m47324(abstractC16579M52438)) {
            C11948 c11948M51911 = c23801.f76968.m51910(C14707.m35239(abstractC16579M52438));
            C23945 c23946 = new C23945();
            c23946.f77665 = c11948M51911;
            throw c23946;
        }
        return c23801.m52409(this.f55921, abstractC16579M52438);
    }
}
