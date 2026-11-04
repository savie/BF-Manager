package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 842E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12931 f56600;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0999 f56601;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f56602 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC12931 mo3492(AbstractC9201 abstractC9201, C10889 c10889);

    public AbstractC17406(AbstractC9201 abstractC9201, C10889 c10889) {
        this.f56600 = mo3492(abstractC9201, c10889);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40881(EnumC9947 enumC9947, int i, String... strArr) {
        int length = strArr.length;
        AbstractC12931 abstractC12931 = this.f56600;
        if (i >= length) {
            abstractC12931.mo4160(enumC9947 == EnumC9947.FILE ? "-f requires argument <file>" : "-d requires argument <directory>", new Object[0]);
            throw new IllegalArgumentException();
        }
        String str = strArr[i];
        File file = new File(str);
        if (enumC9947 == EnumC9947.DIR && !file.exists()) {
            abstractC12931.mo4160("The output directory \"{0}\" does not exist", str);
            throw new IllegalArgumentException();
        }
        if (this.f56601 == null) {
            this.f56601 = new C0999();
        }
        int i2 = C16660.f53823[enumC9947.ordinal()];
        if (i2 == 1) {
            C0999 c0999 = this.f56601;
            c0999.m3878(new File("."), str);
            abstractC12931.m32300(c0999);
        } else {
            if (i2 != 2) {
                return;
            }
            C0999 c09910 = this.f56601;
            c09910.m3877(file);
            abstractC12931.m32300(c09910);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40880() {
        ArrayList arrayList = this.f56602;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC18152) it.next()) instanceof C3982) {
                return;
            }
        }
        arrayList.add(new C3982());
    }
}
