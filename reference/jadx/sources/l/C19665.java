package l;

import android.text.TextWatcher;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19665 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63119;

    public /* synthetic */ C19665(int i) {
        this.f63119 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f63119) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f63119) {
            case 0:
                return C13638.nonNull((C16137) obj);
            case 1:
                return ((TextWatcher) obj) instanceof C16902;
            case 2:
                return ((AbstractC20745) obj).mo33975();
            case 3:
                String str = (String) obj;
                return str == null || str.isEmpty();
            case 4:
                return ((C18787) obj).m43353();
            case 5:
                String str2 = (String) obj;
                return str2.indexOf(47) == -1 && str2.toLowerCase().endsWith(".apk");
            case 6:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return C3128.m9470((AbstractC8047) obj);
        }
    }
}
