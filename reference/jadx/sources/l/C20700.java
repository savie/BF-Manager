package l;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1XF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20700 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set f67314;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10111 f67315;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f67316;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f67317;

    public C20700(C19213 c19213, C10124 c10124, C10111 c10111) {
        this.f67315 = c10111;
        this.f67317 = c10111.mo11508();
        List<C11522> listMo11511 = c10111.mo11511();
        this.f67316 = listMo11511;
        HashSet hashSet = new HashSet();
        for (C11522 c11522 : listMo11511) {
            hashSet.add(c11522.f38738);
            hashSet.add(c11522.f38737);
        }
        this.f67314 = C0561.unmodifiableSet(hashSet);
    }
}
