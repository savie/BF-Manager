package l;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15144 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Collator f49412;

    public C15144() {
        Collator collator = Collator.getInstance(Locale.US);
        this.f49412 = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f49412.compare(((EnumC7687) obj).f25368, ((EnumC7687) obj2).f25368);
    }
}
