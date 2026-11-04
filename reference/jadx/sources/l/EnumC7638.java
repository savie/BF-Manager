package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7638 {
    TRANSITIVE(32),
    STATIC_PHASE(64),
    SYNTHETIC(4096),
    MANDATED(32768),
    EXTRA(65536);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25206;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20855(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC7638) it.next()).f25206;
        }
        return i;
    }

    EnumC7638(int i) {
        this.f25206 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format("ACC_%s (0x%04x", name(), Integer.valueOf(this.f25206));
    }
}
