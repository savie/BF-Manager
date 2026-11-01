package l;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: l.᩶᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20395 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            if (C22979.m50819().getName().equals(str)) {
                return C12634.class;
            }
            if (C19028.m43759().getName().equals(str)) {
                return C6283.class;
            }
            if (Class.class.getName().equals(str)) {
                return C16867.class;
            }
            return super.loadClass(str);
        }
    }
}
