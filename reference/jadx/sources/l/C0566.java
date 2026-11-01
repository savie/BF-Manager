package l;

import android.util.Property;

/* JADX INFO: renamed from: l.֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes2.dex */
public final class C0566 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((C12562) obj).mThumbPosition);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((C12562) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
