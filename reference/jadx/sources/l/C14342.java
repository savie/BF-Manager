package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14342 extends AbstractC10172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f45238;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6140 f45239;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f45240;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f45241;

    public C14342() {
        super(4, -1);
        this.f45239 = null;
        this.f45241 = null;
        this.f45240 = null;
        this.f45238 = null;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m34767() {
        return this.f45239 == null && this.f45241 == null && this.f45240 == null && this.f45238 == null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m34766() {
        return this.f45239 != null && this.f45241 == null && this.f45240 == null && this.f45238 == null;
    }

    public final int hashCode() {
        C6140 c6140 = this.f45239;
        if (c6140 == null) {
            return 0;
        }
        return c6140.hashCode();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۙ */
    public final int mo15563(AbstractC10172 abstractC10172) {
        if (!m34766()) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        C6140 c6140 = this.f45239;
        C6140 c6141 = ((C14342) abstractC10172).f45239;
        if (c6140 == c6141) {
            c6140.getClass();
            return 0;
        }
        EnumC3461 enumC3461Mo1454 = c6140.mo1454();
        EnumC3461 enumC3461Mo1455 = c6141.mo1454();
        if (enumC3461Mo1454 != enumC3461Mo1455) {
            return enumC3461Mo1454.compareTo(enumC3461Mo1455);
        }
        return c6140.mo15563(c6141);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34762(C14011 c14011, C10918 c10918) {
        if (this.f45239 != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.f45239 = new C6140(c14011, c10918);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34763(C16689 c16689, C14011 c14011, C10918 c10918) {
        if (this.f45241 == null) {
            this.f45241 = new ArrayList();
        }
        this.f45241.add(new C5699(c16689, new C6140(c14011, c10918)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34765(C18181 c18181, C14011 c14011, C10918 c10918) {
        if (this.f45240 == null) {
            this.f45240 = new ArrayList();
        }
        this.f45240.add(new C24345(c18181, new C6140(c14011, c10918)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34764(C18181 c18181, C4538 c4538, C10918 c10918) {
        if (this.f45238 == null) {
            this.f45238 = new ArrayList();
        }
        this.f45238.add(new C1224(c18181, c4538, c10918));
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C19123 c19123M27703 = c10918.m27703();
        C6140 c6140 = this.f45239;
        if (c6140 != null) {
            this.f45239 = (C6140) c19123M27703.m44247(c6140);
        }
        ArrayList arrayList = this.f45241;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C5699) it.next()).m16727(c10918);
            }
        }
        ArrayList arrayList2 = this.f45240;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C24345) it2.next()).m54384(c10918);
            }
        }
        ArrayList arrayList3 = this.f45238;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C1224) it3.next()).m4442(c10918);
            }
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        throw new RuntimeException("unsupported");
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        m26283(((m34761(this.f45241) + m34761(this.f45240) + m34761(this.f45238)) * 8) + 16);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        boolean zM36116 = c15000.m36116();
        C6140 c6140 = this.f45239;
        int iM26285 = c6140 == null ? 0 : c6140.m26285();
        int iM34761 = m34761(this.f45241);
        int iM34762 = m34761(this.f45240);
        int iM34763 = m34761(this.f45238);
        if (zM36116) {
            c15000.m36111(0, m26281() + " annotations directory");
            c15000.m36111(4, "  class_annotations_off: ".concat(C5306.m15938(iM26285)));
            c15000.m36111(4, "  fields_size:           ".concat(C5306.m15938(iM34761)));
            c15000.m36111(4, "  methods_size:          ".concat(C5306.m15938(iM34762)));
            c15000.m36111(4, "  parameters_size:       ".concat(C5306.m15938(iM34763)));
        }
        c15000.m36124(iM26285);
        c15000.m36124(iM34761);
        c15000.m36124(iM34762);
        c15000.m36124(iM34763);
        if (iM34761 != 0) {
            Collections.sort(this.f45241);
            if (zM36116) {
                c15000.m36111(0, "  fields:");
            }
            Iterator it = this.f45241.iterator();
            while (it.hasNext()) {
                ((C5699) it.next()).m16728(c10918, c15000);
            }
        }
        if (iM34762 != 0) {
            Collections.sort(this.f45240);
            if (zM36116) {
                c15000.m36111(0, "  methods:");
            }
            Iterator it2 = this.f45240.iterator();
            while (it2.hasNext()) {
                ((C24345) it2.next()).m54385(c10918, c15000);
            }
        }
        if (iM34763 != 0) {
            Collections.sort(this.f45238);
            if (zM36116) {
                c15000.m36111(0, "  parameters:");
            }
            Iterator it3 = this.f45238.iterator();
            while (it3.hasNext()) {
                ((C1224) it3.next()).m4443(c10918, c15000);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34761(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
