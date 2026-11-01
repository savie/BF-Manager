package l;

import com.alipay.sdk.m.p.a;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21880 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f70989 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f70990;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f70991;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48665() {
        return this.f70989.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23292 m48666(int i) {
        return (C23292) this.f70989.get(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m48671() {
        return this.f70990;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48667(String str) {
        this.f70990 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m48670() {
        return this.f70991;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48669(boolean z) {
        this.f70991 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48668(ArrayList arrayList) {
        ArrayList arrayList2 = this.f70989;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(500);
        sb.append('<');
        sb.append(this.f70990);
        ArrayList arrayList = this.f70989;
        if (arrayList.size() > 0 || this.f70991) {
            sb.append(' ');
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C23292 c23292M48666 = m48666(i);
            sb.append(c23292M48666.m51377());
            sb.append(a.h);
            sb.append(c23292M48666.m51379());
            sb.append(c23292M48666.m51378());
            sb.append(c23292M48666.m51379());
            if (this.f70991 || i != arrayList.size() - 1) {
                sb.append(' ');
            }
        }
        if (this.f70991) {
            sb.append('/');
        }
        sb.append('>');
        return sb.toString();
    }
}
