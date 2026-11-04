package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۬᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14166 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44791 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Comparator f44792 = C2661.comparingInt(new C8946());

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC11847 mo23411();

    /* JADX INFO: renamed from: ᩴ */
    public abstract InterfaceC20660 mo19836();

    /* JADX INFO: renamed from: ᩸ */
    public abstract EnumC7455 mo19837();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f44792.compare(this, (AbstractC14166) obj);
    }
}
