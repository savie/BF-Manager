package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10709 implements InterfaceC9380 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19881 f36525;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36526;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36527;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13985 f36528;

    public C10709() {
        C13985 c13985 = new C13985(true);
        this.f36528 = c13985;
        this.f36527 = new ArrayList();
        C19881 c19881 = new C19881();
        this.f36525 = c19881;
        c13985.setOutput(c19881);
        c13985.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", false);
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ܰ */
    public final void mo24062(String str) {
        this.f36526++;
        this.f36527.add(str);
        C13985 c13985 = this.f36528;
        c13985.startTag(null, str);
        if (this.f36526 == 1) {
            c13985.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        }
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24060(String str) {
        this.f36528.endTag(null, str);
        C19028.m43762(this.f36527, 1);
        this.f36526--;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[PHI: r0
      0x0042: PHI (r0v31 java.lang.Integer) = (r0v27 java.lang.Integer), (r0v36 java.lang.Integer) binds: [B:89:0x012a, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24061(String str, String str2) {
        Integer numM23861;
        if (this.f36526 == 1 && ("public".equals(str) || "weak".equals(str) || "compact".equals(str))) {
            return;
        }
        boolean zEquals = "parent".equals(str);
        ArrayList arrayList = this.f36527;
        if (!zEquals || this.f36526 != 1 || !"complex".equals((String) C19084.m43861(arrayList, 1))) {
            if ("id".equals(str) && this.f36526 == 2) {
                String str3 = (String) arrayList.get(0);
                if ("complex".equals(str3) || "style".equals(str3) || "attr".equals(str3)) {
                    String str4 = (String) C19084.m43861(arrayList, 1);
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
                            numM23861 = C9298.m23861(str2);
                            if (numM23861 != null) {
                                str2 = C9298.m23865(numM23861.intValue());
                                break;
                            }
                            break;
                    }
                }
            }
        } else {
            numM23861 = C9298.m23861(str2);
            if (numM23861 != null) {
                str2 = C9298.m23865(numM23861.intValue());
            }
        }
        this.f36528.attribute(null, str, str2);
    }

    @Override // l.InterfaceC9380
    public final void text(String str) {
        this.f36528.text(str);
    }
}
