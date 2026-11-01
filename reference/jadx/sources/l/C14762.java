package l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ܳ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14762 extends C13477 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f48281;

    public C14762(C6420 c6420, Element element, String str) {
        super(c6420, element, str);
        this.f48281 = new ArrayList();
    }

    @Override // l.C13477, l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final C14762 mo12101() {
        C14762 c14762 = new C14762(this.f71178, this.f71177, this.f71179);
        c14762.m32973((C13477) this);
        Iterator it = this.f48281.iterator();
        while (it.hasNext()) {
            c14762.m35381((AbstractC21943) it.next());
        }
        return c14762;
    }

    @Override // l.C13477
    /* JADX INFO: renamed from: ۙ */
    public final void mo32974(AbstractC21943 abstractC21943) {
        this.f44548.add(abstractC21943);
        abstractC21943.m48770(this.f71181);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35381(AbstractC21943 abstractC21943) {
        this.f48281.add(abstractC21943);
        abstractC21943.m48770(this.f71181);
    }

    @Override // l.C13477, l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final void mo12107(C19121 c19121) {
        C19121 c19122;
        Iterator it = this.f44548.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c19122 = this.f71176;
            if (!zHasNext) {
                break;
            }
            AbstractC21943 abstractC21943 = (AbstractC21943) it.next();
            c19122.m43933(c19121);
            c19122.m43927(this.f71180);
            abstractC21943.mo12107(c19122);
        }
        c19122.m43933(c19121);
        Iterator it2 = this.f48281.iterator();
        while (it2.hasNext()) {
            ((AbstractC21943) it2.next()).mo12107(c19122);
        }
        c19122.m43927(this.f71180);
        if (!this.f71181.containsKey("stroke-width") || (c19122.m43931() & 6) == 0) {
            return;
        }
        m48771("Scaling of the stroke width is ignored");
    }

    @Override // l.C13477, l.AbstractC21943
    /* JADX INFO: renamed from: ۨ */
    public final void mo32975() {
        String strM48769;
        super.mo32975();
        if (this.f71177.getTagName().equals("mask")) {
            String str = (String) this.f71181.get("fill");
            if (str == null || (strM48769 = m48769(str, "#000")) == null || C18415.m42699(strM48769) != -1) {
                m48772("Semitransparent mask cannot be represented by a vector drawable");
            }
        }
    }

    @Override // l.C13477, l.AbstractC21943
    /* JADX INFO: renamed from: ܰ */
    public final void mo12108(C19121 c19121) {
        Iterator it = C22808.m50465(this.f44548, this.f48281).iterator();
        while (it.hasNext()) {
            ((AbstractC21943) it.next()).mo12108(c19121);
        }
    }

    @Override // l.C13477, l.AbstractC21943
    /* JADX INFO: renamed from: ۙ */
    public final void mo12102(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        outputStreamWriter.write(str);
        outputStreamWriter.write("<group>");
        outputStreamWriter.write("\n");
        String str2 = str + EnumC19730.f63352;
        EnumMap enumMap = new EnumMap(EnumC2186.class);
        C21778 c21778 = new C21778(7, enumMap);
        Iterator it = this.f44548.iterator();
        while (it.hasNext()) {
            ((AbstractC21943) it.next()).mo32972(c21778);
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            EnumC2186 enumC2186 = (EnumC2186) entry.getKey();
            List list = (List) entry.getValue();
            outputStreamWriter.write(str2);
            outputStreamWriter.write(60);
            outputStreamWriter.write("clip-path");
            outputStreamWriter.write("\n");
            outputStreamWriter.write(str2);
            outputStreamWriter.write(EnumC19730.f63352);
            outputStreamWriter.write(EnumC19730.f63352);
            outputStreamWriter.write("android:pathData=\"");
            for (int i = 0; i < list.size(); i++) {
                String str3 = (String) list.get(i);
                if (i > 0 && !str3.startsWith("M")) {
                    outputStreamWriter.write("M 0,0");
                }
                outputStreamWriter.write(str3);
            }
            outputStreamWriter.write(34);
            if (enumC2186 == EnumC2186.EVEN_ODD) {
                outputStreamWriter.write("\n");
                outputStreamWriter.write(str2);
                outputStreamWriter.write(EnumC19730.f63352);
                outputStreamWriter.write(EnumC19730.f63352);
                outputStreamWriter.write("android:fillType=\"evenOdd\"");
            }
            outputStreamWriter.write("/>");
            outputStreamWriter.write("\n");
        }
        Iterator it2 = this.f48281.iterator();
        while (it2.hasNext()) {
            ((AbstractC21943) it2.next()).mo12102(outputStreamWriter, str2);
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</group>");
        outputStreamWriter.write("\n");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC5009 m35379(EnumMap enumMap, AbstractC21943 abstractC21943) {
        String strM28465;
        EnumC2186 enumC2186;
        if ((abstractC21943 instanceof C11360) && (strM28465 = ((C11360) abstractC21943).m28465()) != null && !strM28465.isEmpty()) {
            if ("evenOdd".equals(abstractC21943.f71181.get("clip-rule"))) {
                enumC2186 = EnumC2186.EVEN_ODD;
            } else {
                enumC2186 = EnumC2186.NON_ZERO;
            }
            ((List) C9735.computeIfAbsent(enumMap, enumC2186, new C1533(2))).add(strM28465);
        }
        return EnumC5009.CONTINUE;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m35380() {
        Iterator it = this.f48281.iterator();
        while (it.hasNext()) {
            this.f71180.m43927(((AbstractC21943) it.next()).f71180);
        }
    }
}
