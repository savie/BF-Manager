package l;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20266 extends AbstractC14472 implements InterfaceC24170 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Matrix f65075;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f65076 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Boolean f65077;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC12061 f65078;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f65079;

    @Override // l.InterfaceC24170
    public final List getChildren() {
        return this.f65076;
    }

    @Override // l.InterfaceC24170
    /* JADX INFO: renamed from: ۙ */
    public final void mo14635(C18202 c18202) throws C14429 {
        if (c18202 instanceof C19694) {
            this.f65076.add(c18202);
            return;
        }
        throw new C14429("Gradient elements cannot contain " + c18202 + " elements.");
    }
}
