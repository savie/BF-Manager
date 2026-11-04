package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V16Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C18059 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f59123;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59124;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f59125;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f59126 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f59128 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59127 = -1;

    public C18059(int i) {
        int i2 = f59123;
        f59123 = i2 + 1;
        this.f59124 = i2;
        this.f59125 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42080(C10445 c10445) {
        ArrayList arrayList = this.f59126;
        if (arrayList.contains(c10445)) {
            return false;
        }
        arrayList.add(c10445);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f59125;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM31437 = C12669.m31437(this.f59124, "] <", sb);
        for (C10445 c10445 : this.f59126) {
            StringBuilder sbM10405 = C3188.m10405(strM31437, " ");
            sbM10405.append(c10445.m26841());
            strM31437 = sbM10405.toString();
        }
        return C14483.m34972(strM31437, " >");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42078(int i, C18059 c18059) {
        int i2 = c18059.f59124;
        for (C10445 c10445 : this.f59126) {
            c18059.m42080(c10445);
            if (i == 0) {
                c10445.f33214 = i2;
            } else {
                c10445.f33211 = i2;
            }
        }
        this.f59127 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42077(C17158 c17158, int i) {
        int iM40315;
        int iM40316;
        ArrayList arrayList = this.f59126;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1497 c1497 = (C1497) ((C10445) arrayList.get(0)).f33252;
        c17158.m40327();
        c1497.mo9736(c17158, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C10445) arrayList.get(i2)).mo9736(c17158, false);
        }
        if (i == 0 && c1497.f5220 > 0) {
            C4480.m14184(c1497, c17158, arrayList, 0);
        }
        if (i == 1 && c1497.f5217 > 0) {
            C4480.m14184(c1497, c17158, arrayList, 1);
        }
        try {
            c17158.m40330();
        } catch (Exception unused) {
        }
        this.f59128 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C10445 c10445 = (C10445) arrayList.get(i3);
            C21043 c21043 = new C21043();
            new WeakReference(c10445);
            C17158.m40315(c10445.f33212);
            C17158.m40315(c10445.f33197);
            C17158.m40315(c10445.f33248);
            C17158.m40315(c10445.f33216);
            C17158.m40315(c10445.f33202);
            this.f59128.add(c21043);
        }
        if (i == 0) {
            iM40315 = C17158.m40315(c1497.f33212);
            iM40316 = C17158.m40315(c1497.f33248);
            c17158.m40327();
        } else {
            iM40315 = C17158.m40315(c1497.f33197);
            iM40316 = C17158.m40315(c1497.f33216);
            c17158.m40327();
        }
        return iM40316 - iM40315;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42079(ArrayList arrayList) {
        int size = this.f59126.size();
        if (this.f59127 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C18059 c18059 = (C18059) arrayList.get(i);
                if (this.f59127 == c18059.f59124) {
                    m42078(this.f59125, c18059);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
