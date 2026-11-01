package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X4VR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9116 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f31038;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f31039;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f31041;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f31042;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f31046;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f31047;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f31044 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11834 f31045 = new C11834();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f31040 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f31043 = new ArrayList();

    public final Object clone() {
        C9116 c9116 = new C9116();
        C10527 c10527 = new C10527();
        c9116.f31039 = this.f31039;
        c9116.f31041 = this.f31041;
        c9116.f31046 = this.f31046;
        c9116.f31042 = this.f31042;
        c9116.f31038 = this.f31038;
        c9116.f31045 = this.f31045.m29519(c10527);
        Iterator it = this.f31040.iterator();
        while (it.hasNext()) {
            c9116.f31040.add(((C16876) it.next()).m39538(c10527));
        }
        Iterator it2 = this.f31043.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        if (this.f31047 != null) {
            ArrayList arrayList = new ArrayList(this.f31047.size());
            Iterator it3 = this.f31047.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C17002) it3.next()).mo985(c10527));
            }
            c9116.f31047 = arrayList;
        }
        for (C2184 c2184 : this.f31044) {
            ArrayList arrayList2 = c9116.f31044;
            c2184.getClass();
            arrayList2.add(c10527.m26669(c2184));
        }
        return c9116;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("// ");
        sb.append(this.f31042);
        sb.append("\n");
        if (this.f31046) {
            sb.append(" static ");
        }
        String str = this.f31038;
        sb.append(str == null ? null : C19378.m44398(str));
        sb.append(' ');
        sb.append(this.f31039);
        sb.append('(');
        String[] strArr = this.f31041;
        if (strArr != null) {
            boolean z = true;
            for (String str2 : strArr) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(C19378.m44398(str2));
            }
        }
        sb.append(") {\n\n");
        sb.append(this.f31045);
        sb.append("\n");
        int size = this.f31040.size();
        ArrayList arrayList = this.f31043;
        if (size > 0 || arrayList.size() > 0) {
            sb.append("=============\n");
            Iterator it = this.f31040.iterator();
            while (it.hasNext()) {
                sb.append((C16876) it.next());
                sb.append('\n');
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append((C7704) it2.next());
                sb.append('\n');
            }
        }
        sb.append(l.d);
        return sb.toString();
    }
}
