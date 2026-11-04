package l;

/* JADX INFO: renamed from: l.۠֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C8300 {
    public C9790[] a;
    public C9790 b = null;
    public C2334 c;
    public C2334 d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public C8300(C9790[] c9790Arr, int i, int i2, int i3) {
        this.a = c9790Arr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    public final C9790 a() {
        C9790[] c9790Arr;
        int length;
        int i;
        C2334 c2334;
        int i2;
        int i3;
        int i4;
        int i5;
        C9790 c9790 = this.b;
        if (c9790 != null) {
            c9790 = c9790.d;
        }
        while (c9790 == null) {
            if (this.f >= this.g || (c9790Arr = this.a) == null || (length = c9790Arr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            C9790 c9790K = ConcurrentMapC17249.k(c9790Arr, i);
            if (c9790K != null && c9790K.a < 0) {
                if (c9790K instanceof C17995) {
                    this.a = ((C17995) c9790K).e;
                    C2334 c2335 = this.d;
                    if (c2335 == null) {
                        c2335 = new C2334();
                    } else {
                        this.d = c2335.d;
                    }
                    c2335.c = c9790Arr;
                    c2335.a = length;
                    c2335.b = i;
                    c2335.d = this.c;
                    this.c = c2335;
                    c9790 = null;
                } else {
                    c9790 = c9790K instanceof C6809 ? ((C6809) c9790K).f : null;
                    if (this.c != null) {
                        while (true) {
                            c2334 = this.c;
                            if (c2334 != null) {
                                break;
                                break;
                            }
                            int i6 = this.e;
                            i3 = c2334.a;
                            i4 = i6 + i3;
                            this.e = i4;
                            if (i4 >= length) {
                                break;
                                break;
                            }
                            this.e = c2334.b;
                            this.a = c2334.c;
                            c2334.c = null;
                            C2334 c2336 = c2334.d;
                            c2334.d = this.d;
                            this.c = c2336;
                            this.d = c2334;
                            length = i3;
                        }
                        if (c2334 == null) {
                            i2 = this.e + this.h;
                            this.e = i2;
                            if (i2 >= length) {
                                int i7 = this.f + 1;
                                this.f = i7;
                                this.e = i7;
                            }
                        }
                    } else {
                        i5 = i + this.h;
                        this.e = i5;
                        if (i5 >= length) {
                            int i8 = this.f + 1;
                            this.f = i8;
                            this.e = i8;
                        }
                    }
                }
            } else {
                c9790 = c9790K;
                if (this.c != null) {
                    while (true) {
                        c2334 = this.c;
                        if (c2334 != null) {
                            break;
                        }
                        int i9 = this.e;
                        i3 = c2334.a;
                        i4 = i9 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.e = c2334.b;
                        this.a = c2334.c;
                        c2334.c = null;
                        C2334 c2337 = c2334.d;
                        c2334.d = this.d;
                        this.c = c2337;
                        this.d = c2334;
                        length = i3;
                    }
                    if (c2334 == null) {
                        i2 = this.e + this.h;
                        this.e = i2;
                        if (i2 >= length) {
                            int i10 = this.f + 1;
                            this.f = i10;
                            this.e = i10;
                        }
                    }
                } else {
                    i5 = i + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i11 = this.f + 1;
                        this.f = i11;
                        this.e = i11;
                    }
                }
            }
        }
        this.b = c9790;
        return c9790;
    }
}
