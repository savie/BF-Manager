package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18392 extends AbstractC7951 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15125 f59907 = new C24360();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59908;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7820 f59909;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24975 f59910;

    public C18392(C24975 c24975, int i, C7820 c7820) {
        this.f59910 = c24975;
        this.f59908 = i;
        this.f59909 = c7820;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC15125 interfaceC15125;
        String type;
        C8565 c8565M8724 = this.f59910.m55818().m8724(this.f59908);
        int iM22986 = c8565M8724.m22986();
        C7820 c7820 = this.f59909;
        int iMo2841 = c7820.mo2841();
        InterfaceC15125[] interfaceC15125Arr = new InterfaceC15125[iMo2841];
        InterfaceC15125 interfaceC15126 = f59907;
        Arrays.fill(interfaceC15125Arr, interfaceC15126);
        C4091 c4091 = c7820.f26042;
        C13916 c13916 = new C13916(c4091.mo6805(), c4091.m13183(), new C21376(this, c8565M8724, c8565M8724.m22996()));
        int i = 0;
        if (!EnumC2536.STATIC.m8459(c4091.f13946)) {
            interfaceC15125Arr[0] = new C4222(this);
            i = 1;
        }
        while (c13916.hasNext()) {
            interfaceC15125Arr[i] = (InterfaceC15125) c13916.next();
            i++;
        }
        if (i < iMo2841) {
            int i2 = iMo2841 - 1;
            while (true) {
                i--;
                if (i <= -1 || ((type = (interfaceC15125 = interfaceC15125Arr[i]).getType()) != null && ((type.equals("J") || type.equals("D")) && (i2 = i2 - 1) == i))) {
                    break;
                }
                interfaceC15125Arr[i2] = interfaceC15125;
                interfaceC15125Arr[i] = interfaceC15126;
                i2--;
            }
        }
        int iM23001 = c8565M8724.m23001();
        c8565M8724.m22995();
        return new C14662(this, this.f59910, iM23001, iM22986, interfaceC15125Arr);
    }

    @Override // l.AbstractC7951
    /* JADX INFO: renamed from: ᩷ */
    public final Iterator mo2386() {
        C8565 c8565M8724 = this.f59910.m55818().m8724(this.f59908);
        c8565M8724.m23000();
        return new C21376(this, c8565M8724, c8565M8724.m22996());
    }
}
