package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18425 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60006;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2763 f60007;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f60009;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f60010 = C7116.f23453;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21287 f60014 = new C21287();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15648 f60013 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60008 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f60011 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[] f60005 = C7116.f23451;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f60012 = -9223372036854775807L;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return true;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    public C18425(InterfaceC2763 interfaceC2763) {
        this.f60007 = interfaceC2763;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        C20782.m47568(this.f60011 == 0);
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(0, 3);
        this.f60009 = interfaceC22024Mo16658;
        C15648 c15648 = this.f60013;
        if (c15648 != null) {
            interfaceC22024Mo16658.mo14384(c15648);
            interfaceC12789.mo16661();
            interfaceC12789.mo16659(new C20994(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f60011 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: RuntimeException -> 0x00d1, TryCatch #0 {RuntimeException -> 0x00d1, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b3, B:41:0x00b9, B:42:0x00ca, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[Catch: RuntimeException -> 0x00d1, TryCatch #0 {RuntimeException -> 0x00d1, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b3, B:41:0x00b9, B:42:0x00ca, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: RuntimeException -> 0x00d1, LOOP:1: B:39:0x00b3->B:41:0x00b9, LOOP_END, TryCatch #0 {RuntimeException -> 0x00d1, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b3, B:41:0x00b9, B:42:0x00ca, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007d A[EXC_TOP_SPLITTER, PHI: r15
      0x007d: PHI (r15v3 int) = (r15v4 int), (r15v5 int) binds: [B:32:0x007b, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        int i;
        long j;
        C9474 c9474M24857;
        int i2;
        int i3 = this.f60011;
        C20782.m47568((i3 == 0 || i3 == 5) ? false : true);
        if (this.f60011 == 1) {
            int iM42970 = interfaceC19502.getLength() != -1 ? C18444.m42970(interfaceC19502.getLength()) : 1024;
            if (iM42970 > this.f60010.length) {
                this.f60010 = new byte[iM42970];
            }
            this.f60006 = 0;
            this.f60011 = 2;
        }
        int i4 = this.f60011;
        ArrayList arrayList = this.f60008;
        if (i4 == 2) {
            byte[] bArr = this.f60010;
            if (bArr.length == this.f60006) {
                this.f60010 = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f60010;
            int i5 = this.f60006;
            int i6 = interfaceC19502.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.f60006 += i6;
            }
            long length = interfaceC19502.getLength();
            if (length != -1) {
                i = 0;
                if (this.f60006 == length) {
                    try {
                        j = this.f60012;
                        if (j != -9223372036854775807L) {
                            c9474M24857 = C9474.m24856(j);
                        } else {
                            c9474M24857 = C9474.m24857();
                        }
                        this.f60007.mo5930(this.f60010, 0, this.f60006, c9474M24857, new C19241(this));
                        Collections.sort(arrayList);
                        this.f60005 = new long[arrayList.size()];
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            this.f60005[i2] = ((C21409) arrayList.get(i2)).f68207;
                        }
                        this.f60010 = C7116.f23453;
                        this.f60011 = 4;
                    } catch (RuntimeException e) {
                        throw C2970.m9688("SubtitleParser failed.", e);
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.f60012;
                if (j != -9223372036854775807L) {
                    c9474M24857 = C9474.m24856(j);
                } else {
                    c9474M24857 = C9474.m24857();
                }
                this.f60007.mo5930(this.f60010, 0, this.f60006, c9474M24857, new C19241(this));
                Collections.sort(arrayList);
                this.f60005 = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.f60005[i2] = ((C21409) arrayList.get(i2)).f68207;
                }
                this.f60010 = C7116.f23453;
                this.f60011 = 4;
            }
        } else {
            i = 0;
        }
        if (this.f60011 == 3) {
            if (interfaceC19502.mo10074(interfaceC19502.getLength() != -1 ? C18444.m42970(interfaceC19502.getLength()) : 1024) == -1) {
                long j2 = this.f60012;
                for (int iM19505 = j2 == -9223372036854775807L ? 0 : C7116.m19505(this.f60005, j2, true); iM19505 < arrayList.size(); iM19505++) {
                    m42954((C21409) arrayList.get(iM19505));
                }
                this.f60011 = 4;
            }
        }
        if (this.f60011 == 4) {
            return -1;
        }
        return i;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        int i = this.f60011;
        C20782.m47568((i == 0 || i == 5) ? false : true);
        this.f60012 = j2;
        if (this.f60011 == 2) {
            this.f60011 = 1;
        }
        if (this.f60011 == 4) {
            this.f60011 = 3;
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
        if (this.f60011 == 5) {
            return;
        }
        this.f60007.reset();
        this.f60011 = 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42953(C18425 c18425, C16187 c16187) {
        C21409 c21409 = new C21409(c16187.f52544, C17679.m41345(c16187.f52543, c16187.f52541));
        c18425.f60008.add(c21409);
        long j = c18425.f60012;
        if (j == -9223372036854775807L || c16187.f52542 >= j) {
            c18425.m42954(c21409);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42954(C21409 c21409) {
        C20782.m47566(this.f60009);
        int length = c21409.f68206.length;
        byte[] bArr = c21409.f68206;
        C21287 c21287 = this.f60014;
        c21287.getClass();
        c21287.m48491(bArr.length, bArr);
        this.f60009.mo14381(length, c21287);
        this.f60009.mo14383(c21409.f68207, 1, length, 0, null);
    }
}
