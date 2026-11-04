package l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.֨ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKE */
/* JADX INFO: loaded from: classes3.dex */
public final class C1115 extends C13792 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4174;

    public C1115(C5941 c5941, Element element, String str) {
        super(c5941, element, str);
        this.f4174 = new ArrayList();
    }

    @Override // l.C13792, l.AbstractC23095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1115 mo4137() {
        C1115 c1115 = new C1115(this.f74889, this.f74886, this.f74887);
        c1115.m33702((C13792) this);
        Iterator it = this.f4174.iterator();
        while (it.hasNext()) {
            c1115.m4142((AbstractC23095) it.next());
        }
        return c1115;
    }

    @Override // l.C13792
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4139(AbstractC23095 abstractC23095) {
        this.f43759.add(abstractC23095);
        abstractC23095.m52000(this.f74888);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4142(AbstractC23095 abstractC23095) {
        this.f4174.add(abstractC23095);
        abstractC23095.m52000(this.f74888);
    }

    @Override // l.C13792, l.AbstractC23095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4140(C23841 c23841) {
        C23841 c23842;
        Iterator it = this.f43759.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c23842 = this.f74891;
            if (!zHasNext) {
                break;
            }
            AbstractC23095 abstractC23095 = (AbstractC23095) it.next();
            c23842.m53184(c23841);
            c23842.m53179(this.f74890);
            abstractC23095.mo4140(c23842);
        }
        c23842.m53184(c23841);
        Iterator it2 = this.f4174.iterator();
        while (it2.hasNext()) {
            ((AbstractC23095) it2.next()).mo4140(c23842);
        }
        c23842.m53179(this.f74890);
        if (!this.f74888.containsKey("stroke-width") || (c23842.m53187() & 6) == 0) {
            return;
        }
        m52001("Scaling of the stroke width is ignored");
    }

    @Override // l.C13792, l.AbstractC23095
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo4141() {
        String strM51999;
        super.mo4141();
        if (this.f74886.getTagName().equals("mask")) {
            String str = (String) this.f74888.get("fill");
            if (str == null || (strM51999 = m51999(str, "#000")) == null || C17873.m41727(strM51999) != -1) {
                m52002("Semitransparent mask cannot be represented by a vector drawable");
            }
        }
    }

    @Override // l.C13792, l.AbstractC23095
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4143(C23841 c23841) {
        Iterator it = C16625.m39329(this.f43759, this.f4174).iterator();
        while (it.hasNext()) {
            ((AbstractC23095) it.next()).mo4143(c23841);
        }
    }

    @Override // l.C13792, l.AbstractC23095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4138(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        outputStreamWriter.write(str);
        outputStreamWriter.write("<group>");
        outputStreamWriter.write("\n");
        String str2 = str + EnumC7687.f25319;
        EnumMap enumMap = new EnumMap(EnumC22349.class);
        C24159 c24159 = new C24159(enumMap);
        Iterator it = this.f43759.iterator();
        while (it.hasNext()) {
            ((AbstractC23095) it.next()).mo33701(c24159);
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            EnumC22349 enumC22349 = (EnumC22349) entry.getKey();
            List list = (List) entry.getValue();
            outputStreamWriter.write(str2);
            outputStreamWriter.write(60);
            outputStreamWriter.write("clip-path");
            outputStreamWriter.write("\n");
            outputStreamWriter.write(str2);
            outputStreamWriter.write(EnumC7687.f25319);
            outputStreamWriter.write(EnumC7687.f25319);
            outputStreamWriter.write("android:pathData=\"");
            for (int i = 0; i < list.size(); i++) {
                String str3 = (String) list.get(i);
                if (i > 0 && !str3.startsWith("M")) {
                    outputStreamWriter.write("M 0,0");
                }
                outputStreamWriter.write(str3);
            }
            outputStreamWriter.write(34);
            if (enumC22349 == EnumC22349.EVEN_ODD) {
                outputStreamWriter.write("\n");
                outputStreamWriter.write(str2);
                outputStreamWriter.write(EnumC7687.f25319);
                outputStreamWriter.write(EnumC7687.f25319);
                outputStreamWriter.write("android:fillType=\"evenOdd\"");
            }
            outputStreamWriter.write("/>");
            outputStreamWriter.write("\n");
        }
        Iterator it2 = this.f4174.iterator();
        while (it2.hasNext()) {
            ((AbstractC23095) it2.next()).mo4138(outputStreamWriter, str2);
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</group>");
        outputStreamWriter.write("\n");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC11160 m4136(EnumMap enumMap, AbstractC23095 abstractC23095) {
        String strM15619;
        EnumC22349 enumC22349;
        if ((abstractC23095 instanceof C5195) && (strM15619 = ((C5195) abstractC23095).m15619()) != null && !strM15619.isEmpty()) {
            if ("evenOdd".equals(abstractC23095.f74888.get("clip-rule"))) {
                enumC22349 = EnumC22349.EVEN_ODD;
            } else {
                enumC22349 = EnumC22349.NON_ZERO;
            }
            ((List) C11392.computeIfAbsent(enumMap, enumC22349, new C9587(1))).add(strM15619);
        }
        return EnumC11160.CONTINUE;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4144() {
        Iterator it = this.f4174.iterator();
        while (it.hasNext()) {
            this.f74890.m53179(((AbstractC23095) it.next()).f74890);
        }
    }
}
