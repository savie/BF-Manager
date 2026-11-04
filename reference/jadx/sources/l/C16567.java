package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81CV */
/* JADX INFO: loaded from: classes5.dex */
public class C16567 implements InterfaceC1652 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC18805 f53627;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f53628;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53632;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC18805 f53636 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53626 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f53631 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC24773 f53629 = EnumC24773.UNKNOWN;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f53633 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17313 f53635 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f53630 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f53634 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f53625 = new ArrayList();

    public C16567(AbstractC18805 abstractC18805) {
        this.f53627 = abstractC18805;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53627.f61072.m26841());
        sb.append(":");
        sb.append(this.f53629);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f53630 ? Integer.valueOf(this.f53632) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f53625.size());
        sb.append(":d=");
        sb.append(this.f53634.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo39242(int i) {
        if (this.f53630) {
            return;
        }
        this.f53630 = true;
        this.f53632 = i;
        for (InterfaceC1652 interfaceC1652 : this.f53634) {
            interfaceC1652.mo5938(interfaceC1652);
        }
    }

    @Override // l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public final void mo5938(InterfaceC1652 interfaceC1652) {
        ArrayList<C16567> arrayList = this.f53625;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C16567) it.next()).f53630) {
                return;
            }
        }
        this.f53631 = true;
        AbstractC18805 abstractC18805 = this.f53636;
        if (abstractC18805 != null) {
            abstractC18805.mo5938(this);
        }
        if (this.f53626) {
            this.f53627.mo5938(this);
            return;
        }
        C16567 c16567 = null;
        int i = 0;
        for (C16567 c16568 : arrayList) {
            if (!(c16568 instanceof C17313)) {
                i++;
                c16567 = c16568;
            }
        }
        if (c16567 != null && i == 1 && c16567.f53630) {
            C17313 c17313 = this.f53635;
            if (c17313 != null) {
                if (!c17313.f53630) {
                    return;
                } else {
                    this.f53628 = this.f53633 * c17313.f53632;
                }
            }
            mo39242(c16567.f53632 + this.f53628);
        }
        AbstractC18805 abstractC18806 = this.f53636;
        if (abstractC18806 != null) {
            abstractC18806.mo5938(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39243(AbstractC18805 abstractC18805) {
        this.f53634.add(abstractC18805);
        if (this.f53630) {
            abstractC18805.mo5938(abstractC18805);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39241() {
        this.f53625.clear();
        this.f53634.clear();
        this.f53630 = false;
        this.f53632 = 0;
        this.f53631 = false;
        this.f53626 = false;
    }
}
