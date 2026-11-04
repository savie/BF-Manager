package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes.dex */
public final class C23672 extends AbstractC4280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f76766;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f76767;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23672 f76768;

    public C23672(C23672 c23672, String str, ArrayList arrayList) {
        this.f76768 = c23672;
        this.f76766 = str;
        this.f76767 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C23672 c23672 = this.f76768;
        if (c23672 != null) {
            sb.append(c23672);
            sb.append(".");
        }
        sb.append(this.f76766);
        AbstractC4280.m13642(sb, "<", this.f76767, ">");
        return sb.toString();
    }

    @Override // l.AbstractC4280
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13643() {
        if (this.f76768 != null || !this.f76766.equals("java/lang/Object")) {
            return false;
        }
        List list = this.f76767;
        return list == null || list.isEmpty();
    }
}
