package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11424 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f35926;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f35927;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21646 f35928;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4492 f35930;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public CharSequence f35925 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f35924 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35929 = 0;

    public C11424(InterfaceC21646 interfaceC21646, List list, List list2, C4492 c4492) {
        this.f35928 = interfaceC21646;
        this.f35927 = list;
        this.f35926 = list2;
        this.f35930 = c4492;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28779() {
        InterfaceC21646 interfaceC21646 = this.f35928;
        for (C22547 c22547 : interfaceC21646.mo3131()) {
            int i = c22547.f72891;
            int i2 = c22547.f72892;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c22547.f72894 + i4;
                C17391 c17391 = (C17391) this.f35927.get(i5);
                C17391 c17392 = (C17391) this.f35926.get(i6);
                if (!C7569.m20686(this.f35925, c17391.m40850())) {
                    if (c17391.equals(c17392)) {
                        m28778(i5, i6);
                        this.f35930.m54961(i5, i6, 1);
                    } else {
                        m28778(i5, i6);
                        this.f35925 = c17391.m40850();
                    }
                }
            }
        }
        m28778(interfaceC21646.mo3130(), interfaceC21646.mo3132());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28778(int i, int i2) {
        List list;
        List list2;
        if (this.f35925 == null) {
            return;
        }
        int i3 = this.f35924;
        C4492 c4492 = this.f35930;
        int iMax = Math.max(i3, c4492.m54964());
        int iMax2 = Math.max(this.f35929, c4492.m54962());
        C14763 c14763 = new C14763();
        C14763 c14764 = new C14763();
        while (true) {
            list = this.f35927;
            if (iMax >= i) {
                break;
            }
            if (C7569.m20686(this.f35925, ((C17391) list.get(iMax)).m40850())) {
                c14763.add(iMax);
                this.f35924 = iMax + 1;
            }
            iMax++;
        }
        while (true) {
            list2 = this.f35926;
            if (iMax2 >= i2) {
                break;
            }
            if (C7569.m20686(this.f35925, ((C17391) list2.get(iMax2)).m40850())) {
                c14764.add(iMax2);
                this.f35929 = iMax2 + 1;
            }
            iMax2++;
        }
        if (Math.max(c14763.size(), c14764.size()) > 10 || c14763.size() == c14764.size()) {
            int iMin = Math.min(c14763.size(), c14764.size());
            for (int i4 = 0; i4 < iMin; i4++) {
                int i5 = c14763.getInt(i4);
                int i6 = c14764.getInt(i4);
                if (((C17391) list.get(i5)).equals(list2.get(i6))) {
                    c4492.m54961(i5, i6, 1);
                }
            }
        } else if (c14763.size() < c14764.size()) {
            int size = c14763.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr2[i7] = i7;
            }
            new C24851(c14764, size, iArr, c14763, list, list2, iArr2).m55376();
            for (int i8 = 0; i8 < c14763.size(); i8++) {
                int i9 = c14763.getInt(i8);
                int i10 = c14764.getInt(iArr2[i8]);
                if (((C17391) list.get(i9)).equals(list2.get(i10))) {
                    c4492.m54961(i9, i10, 1);
                }
            }
        } else {
            int size2 = c14764.size();
            int[] iArr3 = new int[size2];
            int[] iArr4 = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr4[i11] = i11;
            }
            new C24851(c14763, size2, iArr3, c14764, list2, list, iArr4).m55376();
            for (int i12 = 0; i12 < c14764.size(); i12++) {
                int i13 = c14763.getInt(iArr4[i12]);
                int i14 = c14764.getInt(i12);
                if (((C17391) list.get(i13)).equals(list2.get(i14))) {
                    c4492.m54961(i13, i14, 1);
                }
            }
        }
        this.f35925 = null;
    }
}
