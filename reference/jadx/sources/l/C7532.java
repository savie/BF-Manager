package l;

import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: l.۟ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7532 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(C16000.m37975((View) obj));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        C16000.m37977((View) obj, ((Float) obj2).floatValue());
    }
}
