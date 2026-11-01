package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12417 extends AbstractC0421 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f41447;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f41448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12417 f41449;

    public C12417(C20178 c20178, C7807 c7807) {
        super(c20178, c7807.m20490(), c7807.m20498());
        this.f41447 = new ArrayList();
        for (InterfaceC3710 interfaceC3710 : c7807.getAnnotations()) {
            if (interfaceC3710.getVisibility() == 2) {
                String type = interfaceC3710.getType();
                type.getClass();
                if (type.equals("Ldalvik/annotation/EnclosingClass;")) {
                    for (InterfaceC6533 interfaceC6533 : interfaceC3710.getElements()) {
                        if (interfaceC6533.getName().equals(b.d)) {
                            this.f41448 = ((InterfaceC21994) interfaceC6533.getValue()).getValue();
                        }
                    }
                } else if (type.equals("Ldalvik/annotation/EnclosingMethod;")) {
                    for (InterfaceC6533 interfaceC6534 : interfaceC3710.getElements()) {
                        if (interfaceC6534.getName().equals(b.d)) {
                            this.f41448 = ((InterfaceC4354) interfaceC6534.getValue()).getValue().mo9700();
                        }
                    }
                }
            }
        }
        if (this.f41448 == null) {
            String type2 = c7807.getType();
            int iLastIndexOf = type2.lastIndexOf(47);
            int iLastIndexOf2 = type2.lastIndexOf(36);
            if (iLastIndexOf2 > iLastIndexOf) {
                while (type2.charAt(iLastIndexOf2 - 1) == '$') {
                    iLastIndexOf2--;
                }
                this.f41448 = type2.substring(0, iLastIndexOf2) + l.b;
            }
        }
    }

    @Override // l.AbstractC0421
    /* JADX INFO: renamed from: ۙ */
    public final void mo2201(InterfaceC23145 interfaceC23145) {
        interfaceC23145.mo4603(this);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30865(String str) {
        C15945 c15945 = new C15945();
        this.f1920.m45610(str);
        this.f41447.add(c15945);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12417 m30866() {
        return this.f41449;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30868(C12417 c12417) {
        this.f41449 = c12417;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m30867() {
        return this.f41448;
    }
}
