package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 842E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23695 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0410 f76669;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21722 f76670;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76671 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC0410 mo22994(AbstractC18194 abstractC18194, C16078 c16078);

    public AbstractC23695(AbstractC18194 abstractC18194, C16078 c16078) {
        this.f76669 = mo22994(abstractC18194, c16078);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52153(EnumC15373 enumC15373, int i, String... strArr) {
        int length = strArr.length;
        AbstractC0410 abstractC0410 = this.f76669;
        if (i >= length) {
            abstractC0410.mo2150(enumC15373 == EnumC15373.FILE ? "-f requires argument <file>" : "-d requires argument <directory>", new Object[0]);
            throw new IllegalArgumentException();
        }
        String str = strArr[i];
        File file = new File(str);
        if (enumC15373 == EnumC15373.DIR && !file.exists()) {
            abstractC0410.mo2150("The output directory \"{0}\" does not exist", str);
            throw new IllegalArgumentException();
        }
        if (this.f76670 == null) {
            this.f76670 = new C21722();
        }
        int i2 = C10995.f37414[enumC15373.ordinal()];
        if (i2 == 1) {
            C21722 c21722 = this.f76670;
            c21722.m48468(new File("."), str);
            abstractC0410.m2155(c21722);
        } else {
            if (i2 != 2) {
                return;
            }
            C21722 c21723 = this.f76670;
            c21723.m48467(file);
            abstractC0410.m2155(c21723);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52152() {
        ArrayList arrayList = this.f76671;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1260) it.next()) instanceof C2671) {
                return;
            }
        }
        arrayList.add(new C2671());
    }
}
