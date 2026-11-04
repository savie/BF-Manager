package l;

import java.security.AccessController;

/* JADX INFO: renamed from: l.᩺ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24095 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new C19749(3))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
