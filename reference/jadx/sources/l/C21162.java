package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩷᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21162 extends C10358 implements RandomAccess {
    public static final long serialVersionUID = -2542308836966382001L;

    @Override // l.C10358, java.util.List
    public final List subList(int i, int i2) {
        return new C21162(this.b.subList(i, i2));
    }

    private Object writeReplace() {
        return new C10358(this.b);
    }
}
