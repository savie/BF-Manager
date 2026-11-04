package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩳᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19245 extends AbstractC1346 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7312 f62255;

    public C19245(C7312 c7312) {
        this.f62255 = c7312;
    }

    @Override // l.AbstractC1346
    /* JADX INFO: renamed from: ۙ */
    public final void mo4974(C17007 c17007) {
        C7312 c7312 = this.f62255;
        HashSet hashSet = c7312.f24080;
        if (hashSet != null) {
            hashSet.remove(c17007.mo32405());
        }
        int i = C8058.f26685[c17007.m40089().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i != 2) {
            if (i == 3) {
                if (c7312.f24087 || c17007.m40090()) {
                    if (c7312.f24083 < c7312.f24082) {
                        c7312.m20050(c17007);
                        c7312.f24083++;
                    } else {
                        c7312.f24070++;
                    }
                }
            } else if (i == 4 && (c17007.m40083(EnumC6984.API) || C7312.m20029(c7312, c17007))) {
                if (c7312.f24079 < c7312.f24084) {
                    c7312.m20050(c17007);
                    c7312.f24079++;
                } else {
                    c7312.f24085++;
                }
            }
        } else if ((c7312.f24087 || c17007.m40090()) && !c7312.f24071) {
            c7312.m20050(c17007);
        }
        if (c17007.m40083(EnumC6984.COMPRESSED)) {
            c7312.f24078 = true;
        }
    }
}
