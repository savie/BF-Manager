package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩸ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes.dex */
public final class C22700 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f73688;

    public C22700(List list) {
        this.f73688 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22700.class != obj.getClass()) {
            return false;
        }
        return this.f73688.equals(((C22700) obj).f73688);
    }

    public final int hashCode() {
        return this.f73688.hashCode();
    }
}
