package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܶ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16445 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53331;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File f53332;

    public C16445() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.f53332 = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f53331 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39000() {
        ArrayList arrayList = this.f53331;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC19429) it.next()).delete();
            } catch (Exception e) {
                AbstractC1530.f5318.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17937 m39001() {
        C17937 c17937 = new C17937(this.f53332);
        this.f53331.add(c17937);
        return c17937;
    }
}
