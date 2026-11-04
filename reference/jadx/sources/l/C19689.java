package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAQ7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19689 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f63414;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f63415 = Collections.EMPTY_LIST;

    public C19689() {
        this.f63414 = C7756.m21096() && !C5585.m16558();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45389() {
        if (this.f63414) {
            this.f63415 = C6265.m17910();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45390(AbstractC22044 abstractC22044, EnumC12230 enumC12230) {
        C3281 c3281M10819 = C3281.m10819(abstractC22044, enumC12230);
        if (c3281M10819 == null) {
            return;
        }
        m45392(c3281M10819);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45391(AbstractC22044 abstractC22044, EnumC12230 enumC12230, AbstractC22044 abstractC22045, EnumC12230 enumC12231) {
        C3281 c3281M10819 = C3281.m10819(abstractC22044, enumC12230);
        C3281 c3281M108110 = C3281.m10819(abstractC22045, enumC12231);
        if (c3281M10819 == null && c3281M108110 == null) {
            return;
        }
        m45392(c3281M10819, c3281M108110);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45392(C3281... c3281Arr) {
        C20435 c20435M45388;
        String strM28556;
        C20435 c20435M45389;
        if (this.f63414) {
            HashSet<C20435> hashSet = new HashSet(c3281Arr.length);
            HashSet<C20435> hashSet2 = new HashSet(c3281Arr.length);
            for (C3281 c3281 : c3281Arr) {
                if (c3281 != null) {
                    String strM34911 = c3281.f10696;
                    EnumC12230 enumC12230 = c3281.f10697;
                    if (enumC12230.f39364) {
                        ArrayList arrayList = C6265.f21252;
                        try {
                            strM34911 = C14453.m34911(strM34911);
                        } catch (IOException unused) {
                        }
                    }
                    String strM12981 = C4013.m12981(strM34911);
                    if (C6265.m17915(C14584.m35193(strM12981, new String[0])) && (c20435M45388 = m45388(strM12981)) != null && !c20435M45388.f65452) {
                        hashSet.add(c20435M45388);
                        if (enumC12230.f39365 && (strM28556 = C11293.m28556(strM12981)) != null && (c20435M45389 = m45388(strM28556)) != null && !c20435M45389.f65452 && !c20435M45389.equals(c20435M45388)) {
                            hashSet2.add(c20435M45389);
                        }
                    }
                }
            }
            hashSet2.removeAll(hashSet);
            if (hashSet.isEmpty()) {
                return;
            }
            for (C20435 c20435 : hashSet) {
                C7756.m21102(c20435);
                c20435.f65452 = true;
            }
            for (C20435 c20436 : hashSet2) {
                C7756.m21102(c20436);
                c20436.f65452 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20435 m45388(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C20435 c20435 : this.f63415) {
            if (lowerCase.startsWith(c20435.f65450)) {
                return c20435;
            }
        }
        return null;
    }
}
