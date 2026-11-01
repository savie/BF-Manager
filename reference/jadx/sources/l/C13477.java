package l;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ܰ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJC */
/* JADX INFO: loaded from: classes4.dex */
public class C13477 extends AbstractC21943 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Logger f44547 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f44548;

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo12109() {
        return true;
    }

    public C13477(C6420 c6420, Element element, String str) {
        super(c6420, element, str);
        this.f44548 = new ArrayList();
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public C13477 mo12101() {
        C13477 c13477 = new C13477(this.f71178, this.f71177, this.f71179);
        c13477.m32973(this);
        return c13477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32974(AbstractC21943 abstractC21943) {
        this.f44548.add(abstractC21943);
        abstractC21943.m48770(this.f71181);
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final void mo12103(String str) {
        Level level = Level.FINE;
        StringBuilder sbM8976 = C3012.m8976(str, "group: ");
        sbM8976.append(this.f71179);
        f44547.log(level, sbM8976.toString());
        Iterator it = this.f44548.iterator();
        while (it.hasNext()) {
            ((AbstractC21943) it.next()).mo12103(C15489.m37076(str, EnumC19730.f63352));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13477 m32976(AbstractC21943 abstractC21943) {
        C13477 c13477M32976;
        for (AbstractC21943 abstractC21944 : this.f44548) {
            if (abstractC21944 == abstractC21943) {
                return this;
            }
            if (abstractC21944.mo12109() && (c13477M32976 = ((C13477) abstractC21944).m32976(abstractC21943)) != null) {
                return c13477M32976;
            }
        }
        return null;
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ */
    public void mo12108(C19121 c19121) {
        Iterator it = this.f44548.iterator();
        while (it.hasNext()) {
            ((AbstractC21943) it.next()).mo12108(c19121);
        }
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public void mo12107(C19121 c19121) {
        for (AbstractC21943 abstractC21943 : this.f44548) {
            C19121 c19122 = this.f71176;
            c19122.m43933(c19121);
            c19122.m43927(this.f71180);
            abstractC21943.mo12107(c19122);
        }
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo32975() {
        Iterator it = this.f44548.iterator();
        while (it.hasNext()) {
            ((AbstractC21943) it.next()).mo32975();
        }
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public void mo12102(OutputStreamWriter outputStreamWriter, String str) {
        Iterator it = this.f44548.iterator();
        while (it.hasNext()) {
            ((AbstractC21943) it.next()).mo12102(outputStreamWriter, str);
        }
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5009 mo32972(C21778 c21778) {
        EnumC5009 enumC5009M35379 = C14762.m35379((EnumMap) c21778.f70553, this);
        if (enumC5009M35379 == EnumC5009.CONTINUE) {
            Iterator it = this.f44548.iterator();
            while (it.hasNext()) {
                EnumC5009 enumC5009Mo32972 = ((AbstractC21943) it.next()).mo32972(c21778);
                EnumC5009 enumC5009 = EnumC5009.ABORT;
                if (enumC5009Mo32972 == enumC5009) {
                    return enumC5009;
                }
            }
        }
        return enumC5009M35379 == EnumC5009.SKIP_CHILDREN ? EnumC5009.CONTINUE : enumC5009M35379;
    }

    @Override // l.AbstractC21943
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo32977(String str, String str2) {
        super.mo32977(str, str2);
        for (AbstractC21943 abstractC21943 : this.f44548) {
            if (!abstractC21943.f71181.containsKey(str)) {
                abstractC21943.mo32977(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32973(C13477 c13477) {
        m48770(c13477.f71181);
        this.f71180 = (C19121) c13477.f71180.clone();
        Iterator it = c13477.f44548.iterator();
        while (it.hasNext()) {
            mo32974(((AbstractC21943) it.next()).mo12101());
        }
    }
}
