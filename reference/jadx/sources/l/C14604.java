package l;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14604 implements Comparator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collator f47796;

    public C14604() {
        Collator collator = Collator.getInstance(Locale.US);
        this.f47796 = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f47796.compare(((EnumC19730) obj).f63414, ((EnumC19730) obj2).f63414);
    }
}
