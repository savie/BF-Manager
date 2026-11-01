package l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩶ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes5.dex */
public class C20245 implements InterfaceC20950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65683 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20245 f65684;

    @Override // l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public AbstractC8956 mo4843(Class cls, C11966 c11966) {
        return mo4842(cls);
    }

    @Override // l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public AbstractC8956 mo4842(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            C13465.m32967(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (AbstractC8956) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
