package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C0120 extends C14125 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Map f1072;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22362 f1073;

    public C0120() {
        throw null;
    }

    public C0120(InterfaceC13314 interfaceC13314, InterfaceC24929 interfaceC24929, C12994 c12994, Map map) {
        super(interfaceC13314, interfaceC24929, c12994);
        this.f1072 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1259(C22362 c22362) {
        this.f1073 = c22362;
        m34304();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // l.C14125
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15648 mo1260(C15648 c15648) {
        C22362 c22362;
        C22362 c22363 = this.f1073;
        if (c22363 == null) {
            c22363 = c15648.f50838;
        }
        if (c22363 != null && (c22362 = (C22362) this.f1072.get(c22363.f72387)) != null) {
            c22363 = c22362;
        }
        C19378 c19378 = c15648.f50812;
        if (c19378 == null) {
            c19378 = null;
        } else {
            int iM44819 = c19378.m44819();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iM44819) {
                    i2 = -1;
                    break;
                }
                InterfaceC8191 interfaceC8191M44820 = c19378.m44820(i2);
                if ((interfaceC8191M44820 instanceof C3027) && "com.apple.streaming.transportStreamTimestamp".equals(((C3027) interfaceC8191M44820).f9817)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (iM44819 == 1) {
                    c19378 = null;
                } else {
                    InterfaceC8191[] interfaceC8191Arr = new InterfaceC8191[iM44819 - 1];
                    while (i < iM44819) {
                        if (i != i2) {
                            interfaceC8191Arr[i < i2 ? i : i - 1] = c19378.m44820(i);
                        }
                        i++;
                    }
                    c19378 = new C19378(interfaceC8191Arr);
                }
            }
        }
        if (c22363 != c15648.f50838 || c19378 != c15648.f50812) {
            C20124 c20124M37397 = c15648.m37397();
            c20124M37397.m46304(c22363);
            c20124M37397.m46303(c19378);
            c15648 = c20124M37397.m46295();
        }
        return super.mo1260(c15648);
    }
}
