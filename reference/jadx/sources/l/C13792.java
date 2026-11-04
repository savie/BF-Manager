package l;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.۬ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJC */
/* JADX INFO: loaded from: classes4.dex */
public class C13792 extends AbstractC23095 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Logger f43758 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f43759;

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15618() {
        return true;
    }

    public C13792(C5941 c5941, Element element, String str) {
        super(c5941, element, str);
        this.f43759 = new ArrayList();
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public C13792 mo4137() {
        C13792 c13792 = new C13792(this.f74889, this.f74886, this.f74887);
        c13792.m33702(this);
        return c13792;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4139(AbstractC23095 abstractC23095) {
        this.f43759.add(abstractC23095);
        abstractC23095.m52000(this.f74888);
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public final void mo15616(String str) {
        Level level = Level.FINE;
        StringBuilder sbM10405 = C3188.m10405(str, "group: ");
        sbM10405.append(this.f74887);
        f43758.log(level, sbM10405.toString());
        Iterator it = this.f43759.iterator();
        while (it.hasNext()) {
            ((AbstractC23095) it.next()).mo15616(C14483.m34972(str, EnumC7687.f25319));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13792 m33703(AbstractC23095 abstractC23095) {
        C13792 c13792M33703;
        for (AbstractC23095 abstractC23096 : this.f43759) {
            if (abstractC23096 == abstractC23095) {
                return this;
            }
            if (abstractC23096.mo15618() && (c13792M33703 = ((C13792) abstractC23096).m33703(abstractC23095)) != null) {
                return c13792M33703;
            }
        }
        return null;
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷ */
    public void mo4143(C23841 c23841) {
        Iterator it = this.f43759.iterator();
        while (it.hasNext()) {
            ((AbstractC23095) it.next()).mo4143(c23841);
        }
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public void mo4140(C23841 c23841) {
        for (AbstractC23095 abstractC23095 : this.f43759) {
            C23841 c23842 = this.f74891;
            c23842.m53184(c23841);
            c23842.m53179(this.f74890);
            abstractC23095.mo4140(c23842);
        }
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۤ */
    public void mo4141() {
        Iterator it = this.f43759.iterator();
        while (it.hasNext()) {
            ((AbstractC23095) it.next()).mo4141();
        }
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ */
    public void mo4138(OutputStreamWriter outputStreamWriter, String str) {
        Iterator it = this.f43759.iterator();
        while (it.hasNext()) {
            ((AbstractC23095) it.next()).mo4138(outputStreamWriter, str);
        }
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11160 mo33701(C24159 c24159) {
        EnumC11160 enumC11160M4136 = C1115.m4136((EnumMap) c24159.f78175, this);
        if (enumC11160M4136 == EnumC11160.CONTINUE) {
            Iterator it = this.f43759.iterator();
            while (it.hasNext()) {
                EnumC11160 enumC11160Mo33701 = ((AbstractC23095) it.next()).mo33701(c24159);
                EnumC11160 enumC11160 = EnumC11160.ABORT;
                if (enumC11160Mo33701 == enumC11160) {
                    return enumC11160;
                }
            }
        }
        return enumC11160M4136 == EnumC11160.SKIP_CHILDREN ? EnumC11160.CONTINUE : enumC11160M4136;
    }

    @Override // l.AbstractC23095
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo33704(String str, String str2) {
        super.mo33704(str, str2);
        for (AbstractC23095 abstractC23095 : this.f43759) {
            if (!abstractC23095.f74888.containsKey(str)) {
                abstractC23095.mo33704(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33702(C13792 c13792) {
        m52000(c13792.f74888);
        this.f74890 = (C23841) c13792.f74890.clone();
        Iterator it = c13792.f43759.iterator();
        while (it.hasNext()) {
            mo4139(((AbstractC23095) it.next()).mo4137());
        }
    }
}
