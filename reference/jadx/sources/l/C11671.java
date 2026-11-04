package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11671 implements Iterator {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25098 f37816;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC6282 f37818;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Set f37819 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Iterator f37815 = Arrays.asList(EnumC6282.MODULE_SOURCE_PATH, EnumC6282.UPGRADE_MODULE_PATH, EnumC6282.SYSTEM_MODULES, EnumC6282.MODULE_PATH).iterator();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f37817 = null;

    public C11671(C25098 c25098) {
        this.f37816 = c25098;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.f37819 == null) {
            while (true) {
                Iterator it = this.f37817;
                if (it == null || !it.hasNext()) {
                    Iterator it2 = this.f37815;
                    if (!it2.hasNext()) {
                        return false;
                    }
                    this.f37818 = (EnumC6282) it2.next();
                    try {
                        this.f37817 = this.f37816.f81180.mo6993(this.f37818).iterator();
                    } catch (IOException e) {
                        System.err.println("error listing module locations for " + this.f37818 + ": " + e);
                    }
                }
            }
            if (this.f37817.hasNext()) {
                this.f37819 = (Set) this.f37817.next();
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        Set set = this.f37819;
        if (set != null) {
            this.f37819 = null;
            return set;
        }
        throw new NoSuchElementException();
    }
}
