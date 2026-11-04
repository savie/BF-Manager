package l;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P1XF */
/* JADX INFO: loaded from: classes3.dex */
public final class C12328 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10628 f39606;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f39607;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f39608;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set f39609;

    public C12328(C7447 c7447, C5122 c5122, C10628 c10628) {
        this.f39606 = c10628;
        this.f39608 = c10628.mo2840();
        List<C4181> listMo2839 = c10628.mo2839();
        this.f39607 = listMo2839;
        HashSet hashSet = new HashSet();
        for (C4181 c4181 : listMo2839) {
            hashSet.add(c4181.f14178);
            hashSet.add(c4181.f14177);
        }
        this.f39609 = C4681.unmodifiableSet(hashSet);
    }
}
