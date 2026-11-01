package l;

import com.alipay.sdk.m.y.q;

/* JADX INFO: renamed from: l.ܿᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AF6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17501 extends AbstractC5362 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C11731 f55663;

    public C17501(C14199 c14199, String str) {
        super(c14199.m34298(), str, c14199.m34296(), c14199.m34292(), c14199.m34297(), !c14199.m34299());
        if ((c14199.m34293().m13753() & 4) != 0) {
            String[] strArrSplit = c14199.m34291().split("\\s+", 5);
            if (strArrSplit.length == 5) {
                int i = 0;
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[2];
                String str4 = strArrSplit[3];
                if (str2.length() != 10) {
                    return;
                }
                try {
                    int iM33378 = C13672.m33378(str2.substring(1));
                    char cCharAt = str2.charAt(0);
                    if (cCharAt == '-') {
                        i = 32768;
                    } else if (cCharAt == 'l') {
                        i = 40960;
                    } else if (cCharAt == 'p') {
                        i = 4096;
                    } else if (cCharAt != 's') {
                        switch (cCharAt) {
                            case 'b':
                                i = 24576;
                                break;
                            case q.f /* 99 */:
                                i = 8192;
                                break;
                            case 'd':
                                i = 16384;
                                break;
                        }
                    } else {
                        i = 49152;
                    }
                    if (i == 0) {
                        return;
                    }
                    this.f55663 = new C11731(i | iM33378, str3, str4);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۤܰ */
    public final C11731 mo7971() {
        return this.f55663;
    }

    @Override // l.AbstractC5362
    /* JADX INFO: renamed from: ۙ */
    public final void mo14868(C11731 c11731) {
        if (this.f55663 == null) {
            throw new UnsupportedOperationException();
        }
        this.f55663 = c11731;
    }
}
