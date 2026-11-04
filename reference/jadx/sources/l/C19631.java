package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩴۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes5.dex */
public final class C19631 extends AbstractC12918 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f63248;

    public C19631(Method method) {
        this.f63248 = method;
    }

    @Override // l.AbstractC12918
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo31992(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f63248.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
