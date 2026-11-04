package l;

import com.alipay.sdk.m.y.q;

/* JADX INFO: renamed from: l.֨᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AF6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1419 extends AbstractC20042 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C9097 f5006;

    public C1419(C17630 c17630, String str) {
        super(c17630.m41279(), str, c17630.m41278(), c17630.m41272(), c17630.m41276(), !c17630.m41280());
        if ((c17630.m41273().m52101() & 4) != 0) {
            String[] strArrSplit = c17630.m41277().split("\\s+", 5);
            if (strArrSplit.length == 5) {
                int i = 0;
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[2];
                String str4 = strArrSplit[3];
                if (str2.length() != 10) {
                    return;
                }
                try {
                    int iM18957 = C6790.m18957(str2.substring(1));
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
                    this.f5006 = new C9097(i | iM18957, str3, str4);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final C9097 mo5155() {
        return this.f5006;
    }

    @Override // l.AbstractC20042
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5154(C9097 c9097) {
        if (this.f5006 == null) {
            throw new UnsupportedOperationException();
        }
        this.f5006 = c9097;
    }
}
