package l;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18387 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42663(InterfaceC19425 interfaceC19425, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC19425.mo44465().size());
        for (Map.Entry entry : interfaceC19425.mo44465().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21915 m42662(Class cls, String str) {
        try {
            return new C21915(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
