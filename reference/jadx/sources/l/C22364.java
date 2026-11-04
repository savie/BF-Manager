package l;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22364 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14070 f72393;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f72396;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10209 f72397;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10209 f72398;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f72395 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72394 = 0;

    public C22364(InterfaceC14070 interfaceC14070, C10209 c10209, int i) throws IOException {
        this.f72396 = c10209.getPosition();
        this.f72393 = interfaceC14070;
        this.f72398 = c10209;
        int i2 = i * 4;
        C10209.m26338(c10209, 0);
        this.f72397 = AbstractC23110.m52036(interfaceC14070, c10209.getPosition());
        for (int i3 = 0; i3 < i2; i3++) {
            this.f72398.write(0);
        }
        this.f72398.flush();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50442() throws IOException {
        if (!this.f72395) {
            C10209 c10209 = this.f72397;
            c10209.getClass();
            C10209.m26338(c10209, 0);
        }
        this.f72395 = false;
        this.f72394 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50441(Set set) throws IOException {
        boolean zIsEmpty = set.isEmpty();
        C10209 c10209 = this.f72398;
        if (zIsEmpty) {
            if (this.f72395) {
                int value = EnumC13722.WHITELIST.getValue();
                c10209.getClass();
                C10209.m26339(c10209, value);
                return;
            }
            this.f72394++;
            return;
        }
        if (!this.f72395) {
            this.f72395 = true;
            int position = c10209.getPosition() - this.f72396;
            C10209 c102010 = this.f72397;
            c102010.getClass();
            C10209.m26338(c102010, position);
            for (int i = 0; i < this.f72394; i++) {
                C10209.m26339(c10209, EnumC13722.WHITELIST.getValue());
            }
            this.f72394 = 0;
        }
        int iM33525 = EnumC13722.m33525(set);
        c10209.getClass();
        C10209.m26339(c10209, iM33525);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50440() {
        int i = this.f72396;
        this.f72397.close();
        C10209 c10209M52036 = null;
        try {
            c10209M52036 = AbstractC23110.m52036(this.f72393, i);
            C10209.m26338(c10209M52036, this.f72398.getPosition() - i);
            c10209M52036.close();
        } catch (Throwable th) {
            if (c10209M52036 != null) {
                c10209M52036.close();
            }
            throw th;
        }
    }
}
