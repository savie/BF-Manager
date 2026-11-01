package l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.ܰܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13928 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        AbstractC17455 abstractC17455 = AbstractC14428.a;
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    abstractC17455 = (AbstractC17455) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(AbstractC17455.class).newInstance(abstractC17455);
                    if (!abstractC17455.getScheme().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return abstractC17455;
    }
}
