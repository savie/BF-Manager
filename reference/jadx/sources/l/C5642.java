package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5642 extends AbstractC23282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f19300;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f19301;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5642 f19302;

    public C5642(C5642 c5642, String str, ArrayList arrayList) {
        this.f19302 = c5642;
        this.f19300 = str;
        this.f19301 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C5642 c5642 = this.f19302;
        if (c5642 != null) {
            sb.append(c5642);
            sb.append(".");
        }
        sb.append(this.f19300);
        AbstractC23282.m51359(sb, "<", this.f19301, ">");
        return sb.toString();
    }

    @Override // l.AbstractC23282
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15528() {
        if (this.f19302 != null || !this.f19300.equals("java/lang/Object")) {
            return false;
        }
        List list = this.f19301;
        return list == null || list.isEmpty();
    }
}
