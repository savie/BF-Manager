package l;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩵᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19684 extends AbstractC15636 {
    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ۙ */
    public final Intent mo1151(Context context, Object obj) {
        if (obj instanceof Intent) {
            return (Intent) obj;
        }
        if (obj instanceof Class) {
            return new Intent(context, (Class<?>) obj);
        }
        throw new RuntimeException(String.valueOf(obj));
    }

    @Override // l.AbstractC15636
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1152(Intent intent, int i) {
        return new C10512(intent, i);
    }
}
