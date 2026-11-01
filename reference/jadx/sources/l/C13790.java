package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13790 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f45519;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f45520;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f45521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f45522;

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public C13790(ArrayList arrayList, int i, int i2) {
        String strM12763;
        this.f45519 = i;
        this.f45521 = i2;
        if (arrayList.isEmpty()) {
            strM12763 = null;
        } else {
            C4616 c4616 = (C4616) arrayList.get(0);
            if ("Name".equalsIgnoreCase(c4616.m12762())) {
                strM12763 = c4616.m12763();
            } else {
                strM12763 = null;
            }
        }
        this.f45522 = strM12763;
        this.f45520 = C0561.unmodifiableList(new ArrayList(arrayList));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m33547() {
        return this.f45522;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m33543() {
        return this.f45519;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m33546() {
        return this.f45521;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m33545() {
        return this.f45520;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33544(String str) {
        for (C4616 c4616 : this.f45520) {
            if (c4616.m12762().equalsIgnoreCase(str)) {
                return c4616.m12763();
            }
        }
        return null;
    }
}
