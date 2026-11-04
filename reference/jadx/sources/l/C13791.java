package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4VR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f43749;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f43753;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f43754;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f43755;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f43756;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f43757;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f43751 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C24498 f43750 = new C24498();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f43748 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f43752 = new ArrayList();

    public final Object clone() {
        C13791 c13791 = new C13791();
        C5194 c5194 = new C5194();
        c13791.f43757 = this.f43757;
        c13791.f43749 = this.f43749;
        c13791.f43756 = this.f43756;
        c13791.f43755 = this.f43755;
        c13791.f43753 = this.f43753;
        c13791.f43750 = this.f43750.m54758(c5194);
        Iterator it = this.f43748.iterator();
        while (it.hasNext()) {
            c13791.f43748.add(((C13397) it.next()).m33033(c5194));
        }
        Iterator it2 = this.f43752.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        if (this.f43754 != null) {
            ArrayList arrayList = new ArrayList(this.f43754.size());
            Iterator it3 = this.f43754.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C11817) it3.next()).mo2797(c5194));
            }
            c13791.f43754 = arrayList;
        }
        for (C4448 c4448 : this.f43751) {
            ArrayList arrayList2 = c13791.f43751;
            c4448.getClass();
            arrayList2.add(c5194.m15613(c4448));
        }
        return c13791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("// ");
        sb.append(this.f43755);
        sb.append("\n");
        if (this.f43756) {
            sb.append(" static ");
        }
        String str = this.f43753;
        sb.append(str == null ? null : C2211.m7539(str));
        sb.append(' ');
        sb.append(this.f43757);
        sb.append('(');
        String[] strArr = this.f43749;
        if (strArr != null) {
            boolean z = true;
            for (String str2 : strArr) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(C2211.m7539(str2));
            }
        }
        sb.append(") {\n\n");
        sb.append(this.f43750);
        sb.append("\n");
        int size = this.f43748.size();
        ArrayList arrayList = this.f43752;
        if (size > 0 || arrayList.size() > 0) {
            sb.append("=============\n");
            Iterator it = this.f43748.iterator();
            while (it.hasNext()) {
                sb.append((C13397) it.next());
                sb.append('\n');
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append((C22348) it2.next());
                sb.append('\n');
            }
        }
        sb.append(l.d);
        return sb.toString();
    }
}
