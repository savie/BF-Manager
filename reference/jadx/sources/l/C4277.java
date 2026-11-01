package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4277 {
    public static Function $default$compose(Function function, Function function2) {
        C13638.requireNonNull(function2);
        return new C16273(function, function2, 1);
    }

    public static Function $default$andThen(Function function, Function function2) {
        C13638.requireNonNull(function2);
        return new C16273(function, function2, 0);
    }

    public static Function identity() {
        return new C22935(11);
    }
}
