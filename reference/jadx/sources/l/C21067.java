package l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩷ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21067 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f68620;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f68621;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f68622;

    public C21067(AbstractC18245 abstractC18245) {
        this.f68622 = abstractC18245.getClass();
        this.f68620 = abstractC18245.getClass().getName();
        this.f68621 = abstractC18245.toByteArray();
    }

    public Object readResolve() {
        String str = this.f68620;
        try {
            Field declaredField = m47476().getDeclaredField("DEFAULT_INSTANCE");
            declaredField.setAccessible(true);
            return ((InterfaceC23206) declaredField.get(null)).newBuilderForType().mergeFrom(this.f68621).buildPartial();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to find proto buffer class: ".concat(str), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to call parsePartialFrom", e2);
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException("Unable to find DEFAULT_INSTANCE in ".concat(str), e3);
        } catch (SecurityException e4) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in ".concat(str), e4);
        } catch (C4529 e5) {
            throw new RuntimeException("Unable to understand proto buffer", e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Class m47476() {
        Class cls = this.f68622;
        return cls != null ? cls : Class.forName(this.f68620);
    }
}
