package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19709 extends AbstractC10537 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20414 f63268;

    public C19709(C20414 c20414) {
        this.f63268 = c20414;
    }

    @Override // l.AbstractC10537
    /* JADX INFO: renamed from: ۙ */
    public final void mo20357(C11948 c11948) {
        C20414 c20414 = this.f63268;
        HashSet hashSet = c20414.f66175;
        if (hashSet != null) {
            hashSet.remove(c11948.mo29765());
        }
        int i = C8420.f29187[c11948.m29767().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i != 2) {
            if (i == 3) {
                if (c20414.f66183 || c11948.m29768()) {
                    if (c20414.f66179 < c20414.f66168) {
                        c20414.m46186(c11948);
                        c20414.f66179++;
                    } else {
                        c20414.f66171++;
                    }
                }
            } else if (i == 4 && (c11948.m29760(EnumC0264.API) || C20414.m46167(c20414, c11948))) {
                if (c20414.f66177 < c20414.f66166) {
                    c20414.m46186(c11948);
                    c20414.f66177++;
                } else {
                    c20414.f66178++;
                }
            }
        } else if ((c20414.f66183 || c11948.m29768()) && !c20414.f66180) {
            c20414.m46186(c11948);
        }
        if (c11948.m29760(EnumC0264.COMPRESSED)) {
            c20414.f66182 = true;
        }
    }
}
