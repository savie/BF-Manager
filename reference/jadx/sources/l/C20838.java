package l;

/* JADX INFO: renamed from: l.᩷ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C20838 {
    public C19427[] a;
    public C19427 b = null;
    public C7432 c;
    public C7432 d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public C20838(C19427[] c19427Arr, int i, int i2, int i3) {
        this.a = c19427Arr;
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
    public final C19427 a() {
        C19427[] c19427Arr;
        int length;
        int i;
        C7432 c7432;
        int i2;
        int i3;
        int i4;
        int i5;
        C19427 c19427 = this.b;
        if (c19427 != null) {
            c19427 = c19427.d;
        }
        while (c19427 == null) {
            if (this.f >= this.g || (c19427Arr = this.a) == null || (length = c19427Arr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            C19427 c19427K = ConcurrentMapC13783.k(c19427Arr, i);
            if (c19427K != null && c19427K.a < 0) {
                if (c19427K instanceof C21543) {
                    this.a = ((C21543) c19427K).e;
                    C7432 c7433 = this.d;
                    if (c7433 == null) {
                        c7433 = new C7432();
                    } else {
                        this.d = c7433.d;
                    }
                    c7433.c = c19427Arr;
                    c7433.a = length;
                    c7433.b = i;
                    c7433.d = this.c;
                    this.c = c7433;
                    c19427 = null;
                } else {
                    c19427 = c19427K instanceof C15900 ? ((C15900) c19427K).f : null;
                    if (this.c != null) {
                        while (true) {
                            c7432 = this.c;
                            if (c7432 != null) {
                                break;
                                break;
                            }
                            int i6 = this.e;
                            i3 = c7432.a;
                            i4 = i6 + i3;
                            this.e = i4;
                            if (i4 >= length) {
                                break;
                                break;
                            }
                            this.e = c7432.b;
                            this.a = c7432.c;
                            c7432.c = null;
                            C7432 c7434 = c7432.d;
                            c7432.d = this.d;
                            this.c = c7434;
                            this.d = c7432;
                            length = i3;
                        }
                        if (c7432 == null) {
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
                c19427 = c19427K;
                if (this.c != null) {
                    while (true) {
                        c7432 = this.c;
                        if (c7432 != null) {
                            break;
                        }
                        int i9 = this.e;
                        i3 = c7432.a;
                        i4 = i9 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.e = c7432.b;
                        this.a = c7432.c;
                        c7432.c = null;
                        C7432 c7435 = c7432.d;
                        c7432.d = this.d;
                        this.c = c7435;
                        this.d = c7432;
                        length = i3;
                    }
                    if (c7432 == null) {
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
        this.b = c19427;
        return c19427;
    }
}
