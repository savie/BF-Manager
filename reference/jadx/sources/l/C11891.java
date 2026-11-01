package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11891 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39892;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f39894;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC6951 f39896;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f39889 = C17983.f57507;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2460 f39890 = new C2460();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7648 f39897 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39895 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39898 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long[] f39891 = C17983.f57513;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f39893 = -9223372036854775807L;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return true;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    public C11891(InterfaceC6951 interfaceC6951) {
        this.f39896 = interfaceC6951;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        C2023.m6510(this.f39898 == 0);
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(0, 3);
        this.f39894 = interfaceC8011Mo7684;
        C7648 c7648 = this.f39897;
        if (c7648 != null) {
            interfaceC8011Mo7684.mo8116(c7648);
            interfaceC15690.mo7696();
            interfaceC15690.mo7690(new C2365(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f39898 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: RuntimeException -> 0x00d2, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[Catch: RuntimeException -> 0x00d2, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[Catch: RuntimeException -> 0x00d2, LOOP:1: B:39:0x00b4->B:41:0x00ba, LOOP_END, TryCatch #0 {RuntimeException -> 0x00d2, blocks: (B:33:0x007d, B:35:0x0083, B:38:0x008f, B:39:0x00b4, B:41:0x00ba, B:42:0x00cb, B:37:0x008a), top: B:68:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007d A[EXC_TOP_SPLITTER, PHI: r15
      0x007d: PHI (r15v3 int) = (r15v4 int), (r15v5 int) binds: [B:32:0x007b, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        int i;
        long j;
        C4128 c4128M11752;
        int i2;
        int i3 = this.f39898;
        C2023.m6510((i3 == 0 || i3 == 5) ? false : true);
        if (this.f39898 == 1) {
            int iM39818 = interfaceC7222.getLength() != -1 ? C17039.m39818(interfaceC7222.getLength()) : 1024;
            if (iM39818 > this.f39889.length) {
                this.f39889 = new byte[iM39818];
            }
            this.f39892 = 0;
            this.f39898 = 2;
        }
        int i4 = this.f39898;
        ArrayList arrayList = this.f39895;
        if (i4 == 2) {
            byte[] bArr = this.f39889;
            if (bArr.length == this.f39892) {
                this.f39889 = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f39889;
            int i5 = this.f39892;
            int i6 = interfaceC7222.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.f39892 += i6;
            }
            long length = interfaceC7222.getLength();
            if (length != -1) {
                i = 0;
                if (this.f39892 == length) {
                    try {
                        j = this.f39893;
                        if (j != -9223372036854775807L) {
                            c4128M11752 = C4128.m11751(j);
                        } else {
                            c4128M11752 = C4128.m11752();
                        }
                        this.f39896.mo11109(this.f39889, 0, this.f39892, c4128M11752, new C21778(2, this));
                        Collections.sort(arrayList);
                        this.f39891 = new long[arrayList.size()];
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            this.f39891[i2] = ((C14008) arrayList.get(i2)).f46029;
                        }
                        this.f39889 = C17983.f57507;
                        this.f39898 = 4;
                    } catch (RuntimeException e) {
                        throw C22861.m50610("SubtitleParser failed.", e);
                    }
                }
            } else {
                i = 0;
            }
            if (i6 == -1) {
                j = this.f39893;
                if (j != -9223372036854775807L) {
                    c4128M11752 = C4128.m11751(j);
                } else {
                    c4128M11752 = C4128.m11752();
                }
                this.f39896.mo11109(this.f39889, 0, this.f39892, c4128M11752, new C21778(2, this));
                Collections.sort(arrayList);
                this.f39891 = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.f39891[i2] = ((C14008) arrayList.get(i2)).f46029;
                }
                this.f39889 = C17983.f57507;
                this.f39898 = 4;
            }
        } else {
            i = 0;
        }
        if (this.f39898 == 3) {
            if (interfaceC7222.mo19215(interfaceC7222.getLength() != -1 ? C17039.m39818(interfaceC7222.getLength()) : 1024) == -1) {
                long j2 = this.f39893;
                for (int iM41855 = j2 == -9223372036854775807L ? 0 : C17983.m41855(this.f39891, j2, true); iM41855 < arrayList.size(); iM41855++) {
                    m29650((C14008) arrayList.get(iM41855));
                }
                this.f39898 = 4;
            }
        }
        if (this.f39898 == 4) {
            return -1;
        }
        return i;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        int i = this.f39898;
        C2023.m6510((i == 0 || i == 5) ? false : true);
        this.f39893 = j2;
        if (this.f39898 == 2) {
            this.f39898 = 1;
        }
        if (this.f39898 == 4) {
            this.f39898 = 3;
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
        if (this.f39898 == 5) {
            return;
        }
        this.f39896.reset();
        this.f39898 = 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29649(C11891 c11891, C17513 c17513) {
        C14008 c14008 = new C14008(c17513.f55685, C12575.m31290(c17513.f55688, c17513.f55686));
        c11891.f39895.add(c14008);
        long j = c11891.f39893;
        if (j == -9223372036854775807L || c17513.f55687 >= j) {
            c11891.m29650(c14008);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29650(C14008 c14008) {
        C2023.m6508(this.f39894);
        int length = c14008.f46028.length;
        byte[] bArr = c14008.f46028;
        C2460 c2460 = this.f39890;
        c2460.getClass();
        c2460.m7508(bArr.length, bArr);
        this.f39894.mo8112(length, c2460);
        this.f39894.mo8114(c14008.f46029, 1, length, 0, null);
    }
}
