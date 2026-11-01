package l;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19253 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Collections.sort((List) obj);
    }
}
