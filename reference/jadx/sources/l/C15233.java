package l;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: l.ܳۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15233 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            if (C11958.m29931().getName().equals(str)) {
                return C1810.class;
            }
            if (C16076.m38225().getName().equals(str)) {
                return C24931.class;
            }
            if (Class.class.getName().equals(str)) {
                return C5539.class;
            }
            return super.loadClass(str);
        }
    }
}
