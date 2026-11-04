package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J89P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3988 implements InterfaceC9996 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13639;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f13640 = "";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f13641;

    public final int hashCode() {
        return C17359.hash(Boolean.TRUE, this.f13640);
    }

    public final String toString() {
        String str = this.f13640;
        return str == null ? "null" : C14442.m34865("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12845() {
        return this.f13640;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12846(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Expected non-null value");
        }
        this.f13640 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m12849(C7760 c7760) throws IOException {
        c7760.m21133(EnumC18947.FOUR);
        c7760.m21136(this.f13640.length() + 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12850(C7760 c7760) throws IOException {
        c7760.m21133(EnumC18947.FOUR);
        c7760.m21136(0);
        c7760.m21136(this.f13640.length() + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12847(C7760 c7760) throws IOException {
        c7760.m21132(this.f13640);
        c7760.m21135(0);
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo12848(C0302 c0302) throws EOFException {
        c0302.m1882(EnumC18947.FOUR);
        c0302.m1880(4);
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10601(C0302 c0302) {
        c0302.m1882(EnumC18947.FOUR);
        this.f13641 = m12844("Offset", c0302);
        this.f13639 = m12844("ActualCount", c0302);
    }

    @Override // l.InterfaceC9996
    /* JADX INFO: renamed from: ۙ */
    public final void mo10598(C0302 c0302) throws EOFException {
        boolean z;
        c0302.m1882(EnumC18947.TWO);
        c0302.m1880(this.f13641 * 2);
        int i = this.f13639;
        if (i > 0) {
            i--;
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(c0302.m1886());
        }
        this.f13640 = sb.toString();
        if (z) {
            c0302.m1880(2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC3988) && C17359.equals(this.f13640, ((AbstractC3988) obj).f13640);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12844(String str, C0302 c0302) throws C18201 {
        long jM1885 = c0302.m1885();
        if (jM1885 <= 2147483647L) {
            return (int) jM1885;
        }
        throw new C18201(String.format("%s %d > %d", str, Long.valueOf(jM1885), Integer.MAX_VALUE));
    }
}
