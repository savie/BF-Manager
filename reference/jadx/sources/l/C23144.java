package l;

import android.text.TextWatcher;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23144 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75023;

    public /* synthetic */ C23144(int i) {
        this.f75023 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f75023) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f75023) {
            case 0:
                return ((TextWatcher) obj) instanceof C21454;
            case 1:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return C0975.m3855((AbstractC11781) obj);
        }
    }
}
