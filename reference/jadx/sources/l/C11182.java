package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11182 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC3584 f37874;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23882 f37875;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Set f37878 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Iterator f37877 = Arrays.asList(EnumC3584.MODULE_SOURCE_PATH, EnumC3584.UPGRADE_MODULE_PATH, EnumC3584.SYSTEM_MODULES, EnumC3584.MODULE_PATH).iterator();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f37876 = null;

    public C11182(C23882 c23882) {
        this.f37875 = c23882;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.f37878 == null) {
            while (true) {
                Iterator it = this.f37876;
                if (it == null || !it.hasNext()) {
                    Iterator it2 = this.f37877;
                    if (!it2.hasNext()) {
                        return false;
                    }
                    this.f37874 = (EnumC3584) it2.next();
                    try {
                        this.f37876 = this.f37875.f77362.mo32956(this.f37874).iterator();
                    } catch (IOException e) {
                        System.err.println("error listing module locations for " + this.f37874 + ": " + e);
                    }
                }
            }
            if (this.f37876.hasNext()) {
                this.f37878 = (Set) this.f37876.next();
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        Set set = this.f37878;
        if (set != null) {
            this.f37878 = null;
            return set;
        }
        throw new NoSuchElementException();
    }
}
