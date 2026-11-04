package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8J4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22155 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f71366;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f71368;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10966 f71365 = new C10966();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f71367 = new C21287(new byte[65025], 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f71364 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50118(InterfaceC19502 interfaceC19502) {
        int i;
        C20782.m47568(interfaceC19502 != null);
        boolean z = this.f71368;
        C21287 c21287 = this.f71367;
        if (z) {
            this.f71368 = false;
            c21287.m48496(0);
        }
        while (!this.f71368) {
            int i2 = this.f71364;
            C10966 c10966 = this.f71365;
            if (i2 < 0) {
                if (c10966.m27797(interfaceC19502, -1L) && c10966.m27798(interfaceC19502, true)) {
                    int iM50116 = c10966.f34643;
                    if ((c10966.f34644 & 1) == 1 && c21287.m48509() == 0) {
                        iM50116 += m50116(0);
                        i = this.f71366;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC19502.mo10073(iM50116);
                        this.f71364 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM50117 = m50116(this.f71364);
            int i3 = this.f71364 + this.f71366;
            if (iM50117 > 0) {
                c21287.m48489(c21287.m48509() + iM50117);
                try {
                    interfaceC19502.readFully(c21287.m48497(), c21287.m48509(), iM50117);
                    c21287.m48517(c21287.m48509() + iM50117);
                    this.f71368 = c10966.f34648[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c10966.f34646) {
                i3 = -1;
            }
            this.f71364 = i3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50119() {
        C10966 c10966 = this.f71365;
        c10966.f34644 = 0;
        c10966.f34647 = 0L;
        c10966.f34646 = 0;
        c10966.f34643 = 0;
        c10966.f34642 = 0;
        this.f71367.m48496(0);
        this.f71364 = -1;
        this.f71368 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10966 m50117() {
        return this.f71365;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 m50120() {
        return this.f71367;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m50121() {
        C21287 c21287 = this.f71367;
        if (c21287.m48497().length == 65025) {
            return;
        }
        c21287.m48491(c21287.m48509(), Arrays.copyOf(c21287.m48497(), Math.max(65025, c21287.m48509())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m50116(int i) {
        int i2;
        int i3 = 0;
        this.f71366 = 0;
        do {
            int i4 = this.f71366;
            int i5 = i + i4;
            C10966 c10966 = this.f71365;
            if (i5 >= c10966.f34646) {
                break;
            }
            int[] iArr = c10966.f34648;
            this.f71366 = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
