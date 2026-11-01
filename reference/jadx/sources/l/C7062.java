package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۜ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7062 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f23715;

    public C7062() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.f23715 = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f23714 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18928() {
        ArrayList arrayList = this.f23714;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC20468) it.next()).delete();
            } catch (Exception e) {
                AbstractC16940.f54139.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4239 m18929() {
        C4239 c4239 = new C4239(this.f23715);
        this.f23714.add(c4239);
        return c4239;
    }
}
