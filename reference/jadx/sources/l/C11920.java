package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11920 implements InterfaceC18525 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38410;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38411;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1306 f38412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23109 f38413;

    public C11920() {
        C1306 c1306 = new C1306(true);
        this.f38412 = c1306;
        this.f38411 = new ArrayList();
        C23109 c23109 = new C23109();
        this.f38413 = c23109;
        c1306.setOutput(c23109);
        c1306.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", false);
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14234(String str) {
        this.f38410++;
        this.f38411.add(str);
        C1306 c1306 = this.f38412;
        c1306.startTag(null, str);
        if (this.f38410 == 1) {
            c1306.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        }
    }

    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ */
    public final void mo14232(String str) {
        this.f38412.endTag(null, str);
        C2764.m9138(this.f38411, 1);
        this.f38410--;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[PHI: r0
      0x0042: PHI (r0v31 java.lang.Integer) = (r0v27 java.lang.Integer), (r0v36 java.lang.Integer) binds: [B:89:0x012a, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    @Override // l.InterfaceC18525
    /* JADX INFO: renamed from: ۙ */
    public final void mo14233(String str, String str2) {
        Integer numM38942;
        if (this.f38410 == 1 && ("public".equals(str) || "weak".equals(str) || "compact".equals(str))) {
            return;
        }
        boolean zEquals = "parent".equals(str);
        ArrayList arrayList = this.f38411;
        if (!zEquals || this.f38410 != 1 || !"complex".equals((String) j$$ExternalSyntheticOutline0.m(arrayList, 1))) {
            if ("id".equals(str) && this.f38410 == 2) {
                String str3 = (String) arrayList.get(0);
                if ("complex".equals(str3) || "style".equals(str3) || "attr".equals(str3)) {
                    String str4 = (String) j$$ExternalSyntheticOutline0.m(arrayList, 1);
                    str4.getClass();
                    switch (str4) {
                        case "dynamic-attribute":
                        case "fraction":
                        case "reference":
                        case "string":
                        case "id":
                        case "bool":
                        case "path":
                        case "attribute":
                        case "color":
                        case "dimen":
                        case "float":
                        case "dynamic-reference":
                        case "integer":
                            numM38942 = C16395.m38942(str2);
                            if (numM38942 != null) {
                                str2 = C16395.m38944(numM38942.intValue());
                                break;
                            }
                            break;
                    }
                }
            }
        } else {
            numM38942 = C16395.m38942(str2);
            if (numM38942 != null) {
                str2 = C16395.m38944(numM38942.intValue());
            }
        }
        this.f38412.attribute(null, str, str2);
    }

    @Override // l.InterfaceC18525
    public final void text(String str) {
        this.f38412.text(str);
    }
}
