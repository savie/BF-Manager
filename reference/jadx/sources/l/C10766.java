package l;

import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۤۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10766 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f34178;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f34179;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f34180;

    public C10766(AbstractC9035 abstractC9035) {
        this.f34180 = abstractC9035.getClass();
        this.f34179 = abstractC9035.getClass().getName();
        this.f34178 = abstractC9035.toByteArray();
    }

    public Object readResolve() {
        String str = this.f34179;
        try {
            Field declaredField = m27436().getDeclaredField("DEFAULT_INSTANCE");
            declaredField.setAccessible(true);
            return ((InterfaceC18775) declaredField.get(null)).newBuilderForType().mergeFrom(this.f34178).buildPartial();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to find proto buffer class: ".concat(str), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to call parsePartialFrom", e2);
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException("Unable to find DEFAULT_INSTANCE in ".concat(str), e3);
        } catch (SecurityException e4) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in ".concat(str), e4);
        } catch (C20463 e5) {
            throw new RuntimeException("Unable to understand proto buffer", e5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Class m27436() {
        Class cls = this.f34180;
        return cls != null ? cls : Class.forName(this.f34179);
    }
}
