package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۜۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes3.dex */
public final class C6563 extends AbstractC15031 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f22107;

    public C6563(Method method) {
        this.f22107 = method;
    }

    @Override // l.AbstractC15031
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo17803(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f22107.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
