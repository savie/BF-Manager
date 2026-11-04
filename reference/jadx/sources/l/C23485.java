package l;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩹ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB8V */
/* JADX INFO: loaded from: classes.dex */
public final class C23485 extends AbstractC18606 {
    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ۙ */
    public final Intent mo3028(Context context, Object obj) {
        if (obj instanceof Intent) {
            return (Intent) obj;
        }
        if (obj instanceof Class) {
            return new Intent(context, (Class<?>) obj);
        }
        throw new RuntimeException(String.valueOf(obj));
    }

    @Override // l.AbstractC18606
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3029(Intent intent, int i) {
        return new C20501(intent, i);
    }
}
