package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۚܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5400 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18636 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Comparator f18637 = C7618.comparingInt(new C11751());

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC1657 mo7051();

    /* JADX INFO: renamed from: ۚ */
    public abstract InterfaceC20608 mo7052();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract EnumC2577 mo14963();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f18637.compare(this, (AbstractC5400) obj);
    }
}
