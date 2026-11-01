package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14960 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f48855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f48856;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C11521 f48854 = C11521.empty();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21825 f48853 = C21825.m48588();

    public AbstractC14960(C10727 c10727, EnumC18651 enumC18651) {
        this.f48855 = c10727;
        this.f48856 = c10727.m26963(enumC18651);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10498 m35939(Predicate predicate) {
        return (C10498) C11397.of((Object[]) this.f48854.orElseGet(new Supplier() { // from class: l.ۜۗۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC14960.m35938(this.f21892);
            }
        })).filter(predicate).findFirst().orElse(this.f48855.f36566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10498[] m35938(AbstractC14960 abstractC14960) {
        C10498[] c10498Arr = (C10498[]) C9030.stream(abstractC14960.f48853).map(new C11660(1)).toArray(new C22721());
        abstractC14960.f48854 = C11521.of(c10498Arr);
        abstractC14960.f48853 = null;
        return c10498Arr;
    }
}
