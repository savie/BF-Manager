package l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6IN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23392 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C1170.removeIf(((Map) obj).entrySet(), new C17546(1));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
