package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21383 extends AbstractC4229 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f68100;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f68101;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21383 f68102;

    public C21383(C24367 c24367, C22737 c22737) {
        super(c24367, c22737.m51267(), c22737.m51273());
        this.f68101 = new ArrayList();
        for (InterfaceC7886 interfaceC7886 : c22737.getAnnotations()) {
            if (interfaceC7886.getVisibility() == 2) {
                String type = interfaceC7886.getType();
                type.getClass();
                if (type.equals("Ldalvik/annotation/EnclosingClass;")) {
                    for (InterfaceC19073 interfaceC19073 : interfaceC7886.getElements()) {
                        if (interfaceC19073.getName().equals(b.d)) {
                            this.f68100 = ((InterfaceC21267) interfaceC19073.getValue()).getValue();
                        }
                    }
                } else if (type.equals("Ldalvik/annotation/EnclosingMethod;")) {
                    for (InterfaceC19073 interfaceC19074 : interfaceC7886.getElements()) {
                        if (interfaceC19074.getName().equals(b.d)) {
                            this.f68100 = ((InterfaceC12316) interfaceC19074.getValue()).getValue().mo6804();
                        }
                    }
                }
            }
        }
        if (this.f68100 == null) {
            String type2 = c22737.getType();
            int iLastIndexOf = type2.lastIndexOf(47);
            int iLastIndexOf2 = type2.lastIndexOf(36);
            if (iLastIndexOf2 > iLastIndexOf) {
                while (type2.charAt(iLastIndexOf2 - 1) == '$') {
                    iLastIndexOf2--;
                }
                this.f68100 = type2.substring(0, iLastIndexOf2) + l.b;
            }
        }
    }

    @Override // l.AbstractC4229
    /* JADX INFO: renamed from: ۙ */
    public final void mo13506(InterfaceC5656 interfaceC5656) {
        interfaceC5656.mo9647(this);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m48624(String str) {
        C21338 c21338 = new C21338();
        this.f15436.m54478(str);
        this.f68101.add(c21338);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21383 m48621() {
        return this.f68102;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48623(C21383 c21383) {
        this.f68102 = c21383;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48622() {
        return this.f68100;
    }
}
