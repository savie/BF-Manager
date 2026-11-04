package l;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R537 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7887 extends AbstractC16375 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f26226;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f26227;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f26228;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f26229;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f26230;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8632 f26231;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f26232;

    public C7887(C24296 c24296, C16618 c16618) throws IOException {
        ArrayList arrayList;
        super(c24296);
        this.f26228 = new ArrayList();
        this.f26232 = new ArrayList();
        this.f26230 = new ArrayList();
        this.f26229 = new ArrayList();
        int iM39314 = c16618.m39314();
        C9311 c9311M24535 = C9311.m24535(c16618);
        c9311M24535.m24537(512);
        this.f53162 = c16618.m39316();
        this.f53160 = c16618.m39315(128);
        int iM39316 = c16618.m39316();
        c16618.m39308();
        int iM39317 = c16618.m39316();
        c16618.m39308();
        int iM39318 = c9311M24535.f30252 >= 288 ? c16618.m39316() : 0;
        c16618.m39310(iM39316 + iM39314);
        C8632 c8632 = new C8632(c16618);
        c16618.m39310(iM39317 + iM39314);
        C8632 c8633 = new C8632(c16618);
        this.f26231 = c8633;
        this.f26227 = new C18328(c8632);
        this.f26226 = new C0429(c8633);
        C9311 c9311M24536 = C9311.m24535(c16618);
        int i = iM39314 + c9311M24535.f30250;
        SparseArray sparseArray = new SparseArray();
        while (true) {
            short s = c9311M24536.f30253;
            if (s == 515) {
                int iM39319 = c16618.m39316();
                ArrayList arrayList2 = this.f26228;
                arrayList2.ensureCapacity(iM39319);
                for (int i2 = 0; i2 < iM39319; i2++) {
                    arrayList2.add(new C4158(c16618));
                }
            } else if (s == 516) {
                C14598 c14598 = new C14598(c16618);
                this.f26232.add(c14598);
                int iM39315 = c16618.m39314();
                C9311 c9311M24537 = C9311.m24535(c16618);
                while (true) {
                    short s2 = c9311M24537.f30253;
                    arrayList = c14598.f45985;
                    if (s2 != 517) {
                        break;
                    }
                    int iM393110 = c16618.m39316();
                    int iM393111 = c16618.m39316();
                    C14763 c14763 = new C14763(iM393111);
                    for (int i3 = 0; i3 < iM393111; i3++) {
                        c14763.add(c16618.m39316());
                    }
                    arrayList.add(new C21312(iM393110, c14763));
                    iM39315 = c16618.m39314();
                    c9311M24537 = C9311.m24535(c16618);
                }
                arrayList.trimToSize();
                c16618.m39310(iM39315);
            } else if (s == 518) {
                this.f26230.add(new C19074(c16618));
            } else if (s == 514) {
                C1175 c1175 = new C1175(this, c16618, c9311M24536);
                this.f26229.add(c1175);
                sparseArray.put(c1175.mo35833(), c1175);
            } else {
                if (s != 513) {
                    if (s != -1 && s != 512) {
                        System.err.printf("Skip arsc chunk: %04x\n", Short.valueOf(s));
                    }
                    c16618.m39310(i);
                    return;
                }
                int iM39312 = c16618.m39312() - iM39318;
                C1175 c1176 = (C1175) sparseArray.get(iM39312);
                if (c1176 == null) {
                    throw new IOException(C13645.m33382(iM39312, "Can not find ArscType with id of "));
                }
                c1176.m4330(new C12361(c1176, c16618, c9311M24536));
            }
            int i4 = c9311M24536.f30251 + c9311M24536.f30250;
            if (i4 >= i) {
                c16618.m39310(i);
                return;
            } else {
                c16618.m39310(i4);
                c9311M24536 = C9311.m24535(c16618);
            }
        }
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۟ */
    public final int mo19820() {
        return this.f26229.size();
    }

    @Override // l.InterfaceC10869
    public final InterfaceC15344 getType(int i) {
        return (C1175) this.f26229.get(i);
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    public final InterfaceC15344 getType(String str) {
        return (C1175) super.getType(str);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩺ۙ */
    public final int mo19827() {
        return this.f26228.size();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC13917 mo19821(int i) {
        return (C4158) this.f26228.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩵ */
    public final int mo19823() {
        return this.f26232.size();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4904 mo19826(int i) {
        return (C14598) this.f26232.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۛۙ */
    public final int mo19819() {
        return this.f26230.size();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC22804 mo19817(int i) {
        return (C19074) this.f26230.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۚ᩷ */
    public final List mo19818() {
        return this.f26227;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m21426() {
        return this.f26226;
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 mo21425() {
        return (C24296) super.mo21425();
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ۙ */
    public final C24296 mo21425() {
        return (C24296) super.mo21425();
    }
}
