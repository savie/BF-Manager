package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9293 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19003 f31566 = new C19003();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC9293 f31567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f31568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC5992 f31569;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1178(C4603 c4603);

    public AbstractC9293(C13609 c13609, EnumC5992 enumC5992, AbstractC9293 abstractC9293) {
        this.f31568 = c13609;
        this.f31569 = enumC5992;
        this.f31567 = abstractC9293;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m23840(C21825 c21825) {
        C19003 c19003 = this.f31566;
        boolean zIsEmpty = c19003.isEmpty();
        C13609 c13609 = this.f31568;
        AbstractC9293 abstractC9293 = c13609.f44910;
        try {
            c13609.f44910 = this;
            mo1181(c21825);
            c13609.f44910 = abstractC9293;
            if (zIsEmpty) {
                C21825 c21825M43726 = c19003.m43726();
                c19003.clear();
                AbstractC9293 abstractC9294 = this.f31567;
                return abstractC9294 != null ? abstractC9294.m23840(c21825M43726) : c21825M43726;
            }
            return C21825.m48588();
        } catch (Throwable th) {
            c13609.f44910 = abstractC9293;
            if (zIsEmpty) {
                c19003.clear();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo1181(C21825 c21825) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C4603 c4603 = (C4603) it.next();
            C8753 c8753 = (C8753) c4603.f16296;
            this.f31566.m43723(c4603);
            C13609 c13609 = this.f31568;
            InterfaceC2173 interfaceC2173M48202 = c13609.f44894.m48202(c4603.f16295.f34725);
            C2714 c2714 = c13609.f44900;
            c8753.getClass();
            InterfaceC12260 interfaceC12260M8270 = c2714.m8270((InterfaceC12260) c8753);
            try {
                try {
                    c13609.f44911.mo7239(c4603.f16301.f30086, this.f31569);
                    mo1178(c4603);
                } catch (C4146 e) {
                    c13609.f44902.m47261(c8753, e);
                }
                c13609.f44911.mo7238();
                c13609.f44900.m8270(interfaceC12260M8270);
                c13609.f44894.m48202(interfaceC2173M48202);
            } catch (Throwable th) {
                c13609.f44911.mo7238();
                c13609.f44900.m8270(interfaceC12260M8270);
                c13609.f44894.m48202(interfaceC2173M48202);
                throw th;
            }
        }
    }
}
