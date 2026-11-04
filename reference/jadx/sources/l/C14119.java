package l;

import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۬᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZIPT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14119 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f44643;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f44644;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f44645;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7956 f44646;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f44647;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f44648;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f44649;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f44650;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44651;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13616 f44652;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7956 f44653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f44654;

    public C14119(C13616 c13616, long j, long j2, C7956 c7956, C7956 c7957) {
        this.f44652 = c13616;
        this.f44650 = j;
        this.f44647 = j2;
        this.f44653 = c7956;
        this.f44646 = c7957;
        this.f44644 = c7956.m21658();
        this.f44648 = c7957.m21658();
        int iM15138 = c13616.f43256.m15138(j, true);
        this.f44651 = iM15138;
        C4933 c4933 = c13616.f43256;
        int iM15139 = c4933.m15138(j, false);
        this.f44654 = iM15139;
        this.f44645 = c4933.m15138(j2, true) - iM15138;
        this.f44649 = c4933.m15138(j2, false) - iM15139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13616 m34293() throws Throwable {
        BooleanSupplier booleanSupplier = new BooleanSupplier() { // from class: l.ۡ᩷ܳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f31175.f44643;
            }
        };
        if (this.f44643) {
            throw new C9446();
        }
        C7210 c7210M21661 = this.f44653.m21661(this.f44651, this.f44645, new InterfaceC7509() { // from class: l.ۖ᩷ܳ
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return this.f9598.f44643;
            }
        });
        try {
            C7210 c7210M21662 = this.f44646.m21661(this.f44654, this.f44649, new InterfaceC7509() { // from class: l.۠᩷ܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f29079.f44643;
                }
            });
            try {
                C13616 c13616M33361 = C13616.m33361(new C7408(c7210M21661), new C7408(c7210M21662), booleanSupplier);
                c7210M21662.close();
                c7210M21661.close();
                return c13616M33361;
            } catch (Throwable th) {
                try {
                    c7210M21662.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c7210M21661.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f44653.close();
        this.f44646.close();
    }
}
