package l;

import java.io.PrintStream;

/* JADX INFO: renamed from: l.ۖ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2969 implements Cloneable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f9657;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f9659;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8935 f9660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f9661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0799 f9658 = new C0799(false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC22664[] f9656 = new AbstractC22664[16];

    public C2969(C8935 c8935) {
        this.f9660 = c8935;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2969 m9679() {
        try {
            C2969 c2969 = (C2969) clone();
            c2969.f9658 = new C0799(this.f9658);
            c2969.f9656 = (AbstractC22664[]) this.f9656.clone();
            int[] iArr = this.f9661;
            if (iArr != null) {
                c2969.f9661 = (int[]) iArr.clone();
            }
            if (this.f9660.f29153) {
                System.err.println("duping state " + this);
                m9680(-1);
            }
            return c2969;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9685(AbstractC22664 abstractC22664) {
        C8935 c8935 = this.f9660;
        if (c8935.f29153) {
            System.err.println("   pushing " + abstractC22664);
        }
        int i = C14901.f48679[abstractC22664.mo9097().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 8) {
            abstractC22664 = c8935.f29135.f48253;
        } else if (i == 9) {
            return;
        }
        AbstractC22664[] abstractC22664Arr = (AbstractC22664[]) C18450.m42989(this.f9657 + 2, this.f9656);
        this.f9656 = abstractC22664Arr;
        int i2 = this.f9657;
        this.f9657 = i2 + 1;
        abstractC22664Arr[i2] = abstractC22664;
        int iM23856 = C8935.m23856(abstractC22664);
        if (iM23856 != 1) {
            if (iM23856 == 2) {
                AbstractC22664[] abstractC22664Arr2 = this.f9656;
                int i3 = this.f9657;
                this.f9657 = i3 + 1;
                abstractC22664Arr2[i3] = null;
            } else {
                throw new AssertionError(abstractC22664);
            }
        }
        int i4 = this.f9657;
        if (i4 > c8935.f29149) {
            c8935.f29149 = i4;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m9684() {
        if (this.f9660.f29153) {
            System.err.println("   popping 1");
        }
        int i = this.f9657 - 1;
        this.f9657 = i;
        AbstractC22664[] abstractC22664Arr = this.f9656;
        AbstractC22664 abstractC22664 = abstractC22664Arr[i];
        abstractC22664Arr[i] = null;
        C11972.m30026(abstractC22664 != null && C8935.m23856(abstractC22664) == 1);
        return abstractC22664;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m9682() {
        if (this.f9660.f29153) {
            System.err.println("   popping 2");
        }
        int i = this.f9657;
        int i2 = i - 2;
        this.f9657 = i2;
        AbstractC22664[] abstractC22664Arr = this.f9656;
        AbstractC22664 abstractC22664 = abstractC22664Arr[i2];
        abstractC22664Arr[i2] = null;
        C11972.m30026(abstractC22664Arr[i - 1] == null && abstractC22664 != null && C8935.m23856(abstractC22664) == 2);
        return abstractC22664;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9683(int i) {
        if (this.f9660.f29153) {
            System.err.println("   popping " + i);
        }
        while (i > 0) {
            AbstractC22664[] abstractC22664Arr = this.f9656;
            int i2 = this.f9657 - 1;
            this.f9657 = i2;
            abstractC22664Arr[i2] = null;
            i--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9681(AbstractC22664 abstractC22664) {
        C8935 c8935 = this.f9660;
        C24705 c24705 = c8935.f29144;
        if (c8935.f29138) {
            int i = C14901.f48679[abstractC22664.mo9097().ordinal()];
            if (i == 10 || i == 11) {
                int iM23856 = C8935.m23856(abstractC22664);
                C11972.m30026(c24705.m55131(c24705.m55132(this.f9656[this.f9657 - iM23856]), c24705.m55132(abstractC22664), true));
                this.f9656[this.f9657 - iM23856] = abstractC22664;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9680(int i) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder("stackMap for ");
        C8935 c8935 = this.f9660;
        sb.append(c8935.f29141.f38069);
        sb.append(".");
        sb.append(c8935.f29141);
        printStream.print(sb.toString());
        if (i == -1) {
            System.out.println();
        } else {
            System.out.println(" at " + i);
        }
        System.err.println(" stack (from bottom):");
        for (int i2 = 0; i2 < this.f9657; i2++) {
            PrintStream printStream2 = System.err;
            StringBuilder sbM12235 = C3769.m12235(i2, EnumC7687.f25319, ": ");
            sbM12235.append(this.f9656[i2]);
            printStream2.println(sbM12235.toString());
        }
        int i3 = c8935.f29160;
        do {
            i3--;
            if (i3 < 0) {
                i3 = 0;
                break;
            }
        } while (!this.f9658.m3208(i3));
        if (i3 >= 0) {
            System.err.println(" locals:");
        }
        for (int i4 = 0; i4 <= i3; i4++) {
            System.err.print(EnumC7687.f25319 + i4 + ": ");
            if (this.f9658.m3208(i4)) {
                C0732 c0732 = c8935.f29136[i4];
                if (c0732 == null) {
                    System.err.println("(none)");
                } else {
                    C5816 c5816 = c0732.f2665;
                    if (c5816 == null) {
                        System.err.println("UNKNOWN!");
                    } else {
                        System.err.println("" + c5816 + " of type " + c5816.mo29576(c8935.f29144));
                    }
                }
            } else {
                System.err.println("undefined");
            }
        }
        if (this.f9659 != 0) {
            System.err.print(" locks:");
            for (int i5 = 0; i5 < this.f9659; i5++) {
                System.err.print(" " + this.f9661[i5]);
            }
            System.err.println();
        }
    }
}
