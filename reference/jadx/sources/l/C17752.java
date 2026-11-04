package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6G9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17752 extends AbstractC17072 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C17752 f58303 = new C17752(null, null);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f58304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18959 f58305;

    public C17752(C18959 c18959, int[] iArr) {
        this.f58305 = c18959;
        this.f58304 = iArr;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36009;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17752 m41566(C2551 c2551, C18959 c18959) {
        List listM8540 = c2551.m8540();
        int size = listM8540.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((C6041) listM8540.get(i)).m17532();
        }
        C17752 c17752 = new C17752(c18959, iArr);
        c2551.mo17864(c17752);
        c2551.m31133("Marked for inline");
        return c17752;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17752 m41565(C2551 c2551) {
        C17752 c17752 = f58303;
        c2551.mo17864(c17752);
        return c17752;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m41568() {
        return this.f58305 == null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18959 m41569() {
        return this.f58305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m41567() {
        return this.f58304;
    }

    public final String toString() {
        if (m41568()) {
            return "INLINE_NOT_NEEDED";
        }
        return "INLINE: " + this.f58305;
    }
}
