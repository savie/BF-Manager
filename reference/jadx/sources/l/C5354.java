package l;

import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: l.ۚۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5354 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(C11319.m28603((View) obj));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        C11319.m28605((View) obj, ((Float) obj2).floatValue());
    }
}
